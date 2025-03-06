package runner;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import dataprovider.DataBaseReader;
import dataprovider.ExcelData;
import resources.ExcelTest;
import utilities.ExtentManager;

public class NewExcelTestRunner {
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	Map<String, String> testExecutionData;
	List<String> testCaseTagsFromExcel;
	List<String> testExecutionSheetsFromExcel;
	Map<String, String> testExecutionSheetsData;
	static String currentExecutionTag;
	static String currentExecutionSheet;
	DataBaseReader dataBaseReader = new DataBaseReader();
	public void excelTestArea(String tags, int listSize, int tagIndex) {

		String[] parameter = {

				"src//test//java//features",
				"--glue", "stepdefinitions", "--plugin",
				"pretty", "--plugin", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"--plugin", "rerun:ReRunScenarios/FailedReRun.txt", "--plugin","listeners.MyTestListeners","--tags", "@" + tags };
		CucumberRunner.run(parameter, listSize, tagIndex);

	}

	@BeforeTest
	public void beforeTest() throws Exception {

		System.out.println("*** Test Execution started ***");
		dataBaseReader.dataBaseConnection();
		System.out.println("***Data base connection established "+DataBaseReader.dataBaseConnection);
		dataBaseReader.statement();
		System.out.println("Data base Statement created "+dataBaseReader.statement());
	}

	@Test()
	public void test() {
		ExcelTest executionSheet = new ExcelTest(path, "AllModuleExecution", "Module");
		testExecutionSheetsFromExcel = executionSheet.getTestCaseTagsfromExcel();
		for (String string : testExecutionSheetsFromExcel) {
			System.out.println(string);
			ExcelData executionsheetData = new ExcelData(path, "AllModuleExecution","Module");
			testExecutionSheetsData = executionsheetData.getTestdata(string);
			if (testExecutionSheetsData.get("Execution").equalsIgnoreCase("yes")) {
				ExcelTest excelTest = new ExcelTest(path, string, "TestCaseID");
				testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
				NewExcelTestRunner newExcelTestRunner = new NewExcelTestRunner();
				
				

				for (String string1 : testCaseTagsFromExcel) {
					System.out.println(string1);
					ExcelTest excelTest2 = new ExcelTest(path, string, "TestCaseID");
					testCaseTagsFromExcel = excelTest2.getTestCaseTagsfromExcel();
					currentExecutionTag = string1;
//					ExcelData testExecution = new ExcelData(path, string, "TestCaseID");
//					testExecutionData = testExecution.getTestdata(string1);
					// run the scenarios based on tags from excel
					currentExecutionSheet=string;
					System.out.println(testCaseTagsFromExcel.size());
					System.out.println(testCaseTagsFromExcel.indexOf(string1));
					newExcelTestRunner.excelTestArea(string1, testCaseTagsFromExcel.size(),
							testCaseTagsFromExcel.indexOf(string1));
					System.out.println(string1);
				}
				
			}
		}
		
		
		

	}

	// get the current execution tag for before and after hooks
	public static String getCurrentExecutionTag() {
		return currentExecutionTag;
	}
	// get the current execution sheet for before and after hooks
	public static String getCurrentExecutionSheet() {
		return currentExecutionSheet;
	}

	@AfterTest
	public void afterTest() throws SQLException {
		System.out.println("*** Test Execution Finished ***");
		//	ExtentTestManager.endTest();
			try {
				DataBaseReader.dataBaseConnection.close();
				System.out.println("***Data base connection closed "+DataBaseReader.dataBaseConnection.isClosed());
			} catch (Exception e) {
			}
			try {
				DataBaseReader.stmt.close();
				System.out.println("Data base Statement closed "+DataBaseReader.stmt.isClosed());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			ExtentManager.getInstance().flush();
			ExtentManager.getInstance().flush();
		}
	
}
