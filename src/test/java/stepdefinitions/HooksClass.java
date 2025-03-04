
package stepdefinitions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dataprovider.ConfigFileReader;
import helper.ScreenshotHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import resources.BaseClass;


public class HooksClass extends BaseClass {
	WebDriver driver;
	ScreenshotHelper screenshotHelper;
	ConfigFileReader configFileReader = new ConfigFileReader();

	@Before
	public void browserSetup(Scenario scenario) throws Throwable {

		driver = initializeDriver();
		System.out.println("Driver Initiated");
		String name = scenario.getName();
		System.out.println("Scenario : **" + name + "** Started executing");
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		driver = BaseClass.driver;
		screenshotHelper = new ScreenshotHelper(driver);
		System.out.println("Screen shot got added");
		if (scenario.isFailed() || true) { // Take screenshot after every step
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Step Screenshot");

			// Save to file for PDF Report
			String screenshotPath = "target/screenshots/" + scenario.getName().replaceAll(" ", "_") + ".png";
			try {
				Files.write(Paths.get(screenshotPath), screenshot);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	@After
	public void TearDown(Scenario scenario){

		String name = scenario.getName();
		System.out.println("Scenario : **" + name + "** Stopped executing");
		System.out.println("Browser closed");
		driver.quit();
	}

}
