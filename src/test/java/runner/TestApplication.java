package runner;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import dataprovider.DataBaseReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;

@CucumberOptions(features = {"src/test/java/features/CSM_Remittance.feature"},
                glue = "stepdefinitions",
                //monochrome=false, //to make steps in color
                plugin = { "pretty",
                           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "rerun:ReRunScenarios/FailedReRun.txt","listeners.MyTestListeners"}
         //,   //dryRun = true //to check compilation errors,
 ,tags="@REMM_P2_001"
     
//-Xms512m -Xmx12288m        		  
)
public class TestApplication extends AbstractTestNGCucumberTests {
	DataBaseReader dataBaseReader = new DataBaseReader();
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
		// static database connection
		dataBaseReader.dataBaseConnection();
		System.out.println("Data base connection established "+DataBaseReader.dataBaseConnection);
		// static database statement
		dataBaseReader.statement();
		System.out.println("Data base Statement created "+dataBaseReader.statement());
	}
	@AfterSuite
	public void afterExecution() throws SQLException {
		System.out.println("*** Test Execution Finished ***");
		try {
			//static database connection closed
			DataBaseReader.dataBaseConnection.close();
			System.out.println("Data base connection closed "+DataBaseReader.dataBaseConnection.isClosed());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			//static database statement closed
			DataBaseReader.stmt.close();
			System.out.println("Data base Statement closed "+DataBaseReader.stmt.isClosed());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ExtentManager.getInstance().flush();
	}

}