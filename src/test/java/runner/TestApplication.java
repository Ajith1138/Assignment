package runner;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features"},
                glue = "stepdefinitions",
                monochrome=false, //to make steps in color
                plugin = { "pretty",
                           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "rerun:ReRunScenarios/FailedReRun.txt"}
           // ,dryRun = true //to check compilation errors,
 ,tags="@Test4"     		  
)
public class TestApplication extends AbstractTestNGCucumberTests {
	
	/*.
	 * @Override
	 *
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */	
	// before execution
	@BeforeSuite
	public void beforeExecution() throws Exception {
		System.out.println("*** Test Execution started ***");
		
	}
	@AfterSuite
	public void afterExecution() throws SQLException {
		System.out.println("*** Test Execution Finished ***");
	}

}