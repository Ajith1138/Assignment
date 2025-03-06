
package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.json.simple.parser.ParseException;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import JiraAPIUtils.JIRAServices;
import dataprovider.ConfigFileReader;
import dataprovider.DataBaseReader;
import dataprovider.ExcelData;
import dataprovider.ExcelReader;
import dataprovider.JIRADataProvider;
import helper.ScreenshotHelper;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import jirautils.IssueCreationPayloadUpdate;
import resources.BaseClass;
import resources.ExcelTest;
import runner.NewExcelTestRunner;
import utilities.ExtendReportManager;
import utilities.ExtentTestManager;

public class HooksClass extends BaseClass {
	WebDriver driver;
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData testExecution = new ExcelData(path, NewExcelTestRunner.getCurrentExecutionSheet(), "TestCaseID");
	Map<String, String> testExecutionData;
	ExcelTest excelTest = new ExcelTest(path, "TestExecution", "TestCaseID");
	List<String> testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
	ScreenshotHelper screenshotHelper;
	ConfigFileReader configFileReader = new ConfigFileReader();
	String jiraBugFile = System.getProperty("user.dir") + "\\TestData\\csmBugList.xlsx";
	ExcelReader excelReader = new ExcelReader(jiraBugFile);
	JIRAServices jiraServices;
	JIRADataProvider jiraDataProvider = new JIRADataProvider();
	IssueCreationPayloadUpdate issueCreationnResponseData = new IssueCreationPayloadUpdate();
	String listOfFilePath = System.getProperty("user.dir") + "\\JIRAScreenshot";
	File listOfFiles = new File(listOfFilePath);
	//CommonFunctions commonFunctions = new CommonFunctions();
	int i = 1;
	int testLine;
	String failedStep = "";
	boolean flag = false;
	DataBaseReader dataBaseReader = new DataBaseReader();
	List<Step> stepOfScenario;
	List<String> tags = new ArrayList<>();

	@Before
	public void browserSetup(Scenario scenario) throws Throwable {
		Collection<String> sourceTagNames = scenario.getSourceTagNames();
		tags.add(sourceTagNames.toString().replaceAll("[^a-zA-Z0-9_]", ""));

		String jiraScreenshotDirectoryPath = System.getProperty("user.dir") + "//JIRAScreenshot";
		File jiraScreenshotDirectory = new File(jiraScreenshotDirectoryPath);
		boolean exists = jiraScreenshotDirectory.exists();
		if (!exists) {
			boolean fileExist = jiraScreenshotDirectory.mkdir();
			if (fileExist) {
				System.out.println("folderCreated");
			} else {
				throw new Exception("Folder not generated " + jiraScreenshotDirectoryPath);
			}
		}

		FileUtils.cleanDirectory(jiraScreenshotDirectory);

		// get flag status from excel and skip the test cases
		if (configFileReader.getExcelRunnnerFlagStatus().equalsIgnoreCase("yes")) {
			if (testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag()).get("ExecuteYes/No")
					.equalsIgnoreCase("No")) {
				String currentExecutionTag = NewExcelTestRunner.getCurrentExecutionTag();
				System.out.println(currentExecutionTag);

				Assume.assumeTrue(false);

			}
		}
		driver = initializeDriver();
		System.out.println("Driver Initiated");
		String name = scenario.getName();
		System.out.println("Scenario : **" + name + "** Started executing");
		// ExtentTestManager.startTest(name);
		ExtentTestManager.createTest(scenario.getName());
		stepOfScenario = ExtentTestManager.getStepOfScenario(scenario);
	}

	@SuppressWarnings("deprecation")
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		driver = BaseClass.driver;
		screenshotHelper = new ScreenshotHelper(driver);
		System.out.println("Screen shot got added");
		java.io.File jraScreenshot = null;
		String jiraScreenshotDirectoryPath = System.getProperty("user.dir") + "//JIRAScreenshot";
		java.io.File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		scenario.attach(fileContent, "image/png", "screenshot");
		System.out.println("I value " + i);
		FileUtils.copyFile(screenshot, new File(jiraScreenshotDirectoryPath + "//Screenshot" + i + ".png"));
		i = i + 1;
		testLine = testLine + 1;
		System.out.println("Test Line " + testLine);
		File extentReportScreenshot = screenshotHelper.takeScreenshot();

		for (Step step : stepOfScenario) {
			if (scenario.isFailed()) {
				failedStep = step.getText();
				ExtentTestManager.extentsLogs(Status.FAIL, failedStep);
				String storeReportScreenshots = ExtendReportManager.storeReportScreenshots(extentReportScreenshot);
				ExtentTestManager.addScreenshots(new File(storeReportScreenshots));

			} else {
				failedStep = step.getText();
				ExtentTestManager.extentsLogs(Status.PASS, failedStep);
				String storeReportScreenshots = ExtendReportManager.storeReportScreenshots(extentReportScreenshot);
				ExtentTestManager.addScreenshots(new File(storeReportScreenshots));
			}

			stepOfScenario.remove(step);
			break;
		}

	}

	@SuppressWarnings({ "unlikely-arg-type", "deprecation" })
	@After
	public void TearDown(Scenario scenario) throws IOException, ParseException, SQLException {

		String name = scenario.getName();
		System.out.println("Scenario : **" + name + "** Stopped executing");
		io.cucumber.java.Status status = scenario.getStatus();
		String currentExecutionStatus = status.toString();
		String issueCreationPayloadPath = System.getProperty("user.dir")
				+ "\\src\\main\\java\\jiraPayLoads\\issueCreationPayLoadAzentio.json";
		String issueCreationResponsePayloadPath = System.getProperty("user.dir")
				+ "\\src\\main\\java\\jiraPayLoads\\issueCreationResponse.json";
		File payLoadFile = new File(issueCreationPayloadPath);
		File isseuCreationResponse = new File(issueCreationResponsePayloadPath);
		if (configFileReader.getExcelRunnnerFlagStatus().equalsIgnoreCase("yes")) {
			if (currentExecutionStatus.equalsIgnoreCase("FAILED")) {
				if (jiraDataProvider.isBugneedToBeRaisedFlag().equalsIgnoreCase("Yes")) {
					String scenarioName = scenario.getName();
					System.out.println("Scenario Name is" + scenarioName);
					if (driver.getCurrentUrl().contains("imal_csm_params")) {
						System.out.println("AssigneeMail ID " + jiraDataProvider.getAssigneeMailID());
						String assigneeAccountID = jiraServices.getAssignee(jiraDataProvider.getAssigneeMailID());
						System.out.println("Assignee Account ID " + assigneeAccountID);
						System.out.println("Param component " + jiraDataProvider.getcsmParamComponent());
						System.out.println("label " + jiraDataProvider.getlabel());
						System.out.println("Sevirity " + jiraDataProvider.getSevirity());
						System.out.println("reported in version " + jiraDataProvider.getReportedInVersion());

						jiraServices.createIssueCreationPayload(payLoadFile,
								"Issue at " + "Test failed at the following Step " + failedStep, scenarioName,
								jiraDataProvider.getcsmParamComponent(), jiraDataProvider.getlabel(),
								jiraDataProvider.getSevirity(), jiraDataProvider.getReportedInVersion(),
								assigneeAccountID, configFileReader.getCSMparamsUrl());
						int createIssue = jiraServices.createIssue(payLoadFile, isseuCreationResponse);
						Assert.assertEquals(createIssue, 201);
						String issueID = issueCreationnResponseData.getIssueID(isseuCreationResponse);
						System.out.println("Issue ID " + issueID);
						File[] list = listOfFiles.listFiles();
						int rowNumber = excelReader.getRowCount("CSM_bug");
						System.out.println("Row Number is " + rowNumber);
						DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
						LocalDateTime LocateDateAndTime = LocalDateTime.now();
						System.out.println(dateTimeFormatter.format(LocateDateAndTime));

						// Excel
						excelReader.setCellData("CSM_bug", "Date", rowNumber + 1,
								dateTimeFormatter.format(LocateDateAndTime));
						excelReader.setCellData("CSM_bug", "Bug ID", rowNumber + 1, issueID);
						excelReader.setCellData("CSM_bug", "Component", rowNumber + 1,
								jiraDataProvider.getcsmComponent());
						excelReader.setCellData("CSM_bug", "assignee", rowNumber + 1,
								jiraDataProvider.getAssigneeMailID());
						jiraServices.addAttachementService(issueID, listOfFiles.listFiles());

						// Excel
						System.out.println("Issue ID " + issueID);
						jiraServices.getIsue(issueID);

					}
					if (driver.getCurrentUrl().contains("imal_core_portal")) {
						String assigneeAccountID = jiraServices.getAssignee(jiraDataProvider.getAssigneeMailID());
						System.out.println("Assignee Account ID " + assigneeAccountID);
						jiraServices.createIssueCreationPayload(payLoadFile,
								"Issue at " + "Test failed at the following Step " + failedStep, scenarioName,
								jiraDataProvider.getcsmComponent(), jiraDataProvider.getlabel(),
								jiraDataProvider.getSevirity(), jiraDataProvider.getReportedInVersion(),
								assigneeAccountID, configFileReader.getCSMparamsUrl());
						jiraServices.createIssue(payLoadFile, isseuCreationResponse);
						String issueID = issueCreationnResponseData.getIssueID(isseuCreationResponse);
						jiraServices.addAttachementService(issueID, null);
						File[] list = listOfFiles.listFiles();
						jiraServices.addAttachementService(issueID, listOfFiles.listFiles());
						System.out.println("Issue ID " + issueID);
						int rowNumber = excelReader.getRowCount("CSM_bug");
						System.out.println("Row Number is " + rowNumber);
						excelReader.setCellData("CSM_bug", "Bug ID", rowNumber + 1, issueID);
						excelReader.setCellData("CSM_bug", "Component", rowNumber + 1,
								jiraDataProvider.getcsmComponent());
						excelReader.setCellData("CSM_bug", "assignee", rowNumber + 1,
								jiraDataProvider.getAssigneeMailID());
						jiraServices.getIsue(issueID);
					}
				}
				// change flag to "No" for dependent scenarios in excel when main Scenario got
				// failed
				for (int i = 1; i < testCaseTagsFromExcel.size(); i++) {
					testExecutionData = testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag());
					Collection<String> values = testExecutionData.values();
					values.remove(NewExcelTestRunner.getCurrentExecutionTag());
					if (values.contains(testCaseTagsFromExcel.get(i))) {
						testExecution.updateTestData(testCaseTagsFromExcel.get(i), "ExecuteYes/No", "No");
					}
				}

			}

		}

		if (scenario.isFailed()) {
			try {
				System.out.println("Scenario failed logout will execute");
			//	commonFunctions.logout();
				System.out.println("Logged out");
			} catch (Exception e) {
			} catch (AssertionError e1) {
			}
		}
		driver = BaseClass.driver;
		ExtentTestManager.flushReport();
		System.out.println("Browser closed");
		driver.quit();
	}

}
