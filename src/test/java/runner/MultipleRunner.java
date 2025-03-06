package runner;






import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExtentManager;
import utilities.ExtentTestManager;

	public class MultipleRunner {

		
		

		public void excelTestArea(List<String> listOfTags)
		{
			List<String[]> listOfArguments = new ArrayList<>();
			for (String tags : listOfTags) {
				String[] parameter = {

						"src/test/java/features/CSM_feature_Chequebook_Request.feature",
						
						"--glue", "stepdefinitions",
						"--plugin", "pretty", 
						"--plugin","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
						"--plugin",
						"rerun:ReRunScenarios/FailedReRun.txt", 
						"--tags", "@" + tags
						};
				listOfArguments.add(parameter);
				
			}
			CucumberRunner.run3(listOfArguments);
			
		}
		
		@BeforeTest
		public void beforeTest() {
			
			System.out.println("Test Execution Started");
		//	ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
		}

		@Test()
		public void test() {
			List<String> testCaseTagsfromExcel1 = new ArrayList<String>();
			//testCaseTagsfromExcel1.add("TSA_039_01");
			//testCaseTagsfromExcel1.add("TSA_039_02");
			//testCaseTagsfromExcel1.add("TSA_039_03");
			//testCaseTagsfromExcel1.add("TRS_275");
			//testCaseTagsfromExcel1.add("TRS_277");
			//testCaseTagsfromExcel1.add("TRS_278");
		//testCaseTagsfromExcel1.add("TRS_133_02");
		//testCaseTagsfromExcel1.add("TRS_134_01");
		//testCaseTagsfromExcel1.add("TRS_134_02");

			MultipleRunner newExcelTestRunner= new MultipleRunner();
			newExcelTestRunner.excelTestArea(testCaseTagsfromExcel1);
		//	newExcelTestRunner.runTestCaseFeatureFileWise(null);
			
		}

		@AfterTest
		public void afterTest() {
			System.out.println("Test Execution Ended");
		//	ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
		}
	}
	

	