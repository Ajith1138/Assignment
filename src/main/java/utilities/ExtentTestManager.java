package utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import java.lang.reflect.Field;
import java.util.List;

import io.cucumber.core.backend.TestCaseState;
import io.cucumber.core.gherkin.Pickle;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.TestCase;

public class ExtentTestManager {
	public static ExtentTest extentTest;

	@SuppressWarnings("deprecation")
	public static void createTest(String testName) {
		extentTest = ExtendReportManager.setupReports().createTest(testName);

	}

	public static void extentsLogs(Status status, String message) {
		
		if (status.toLower().toString().equals("pass")) {
			extentTest.log(Status.PASS, message);
		}
		if (status.toLower().toString().equals("info")) {
			extentTest.log(Status.INFO, message);
		}
		if (status.toLower().toString().equals("fail")) {
			extentTest.log(Status.FAIL, message);
		}
		if (status.toLower().toString().equals("warning")) {
			extentTest.log(Status.WARNING, message);
		}
	}

	public static void addScreenshots(File screenshotFile) {

	//	System.out.println("Screen shot path in test attachment " + screenshotFile.getAbsolutePath());
		extentTest.addScreenCaptureFromPath(screenshotFile.getAbsolutePath());
	}

	public static void addScreenshots(String base64Image) {
		extentTest.addScreenCaptureFromBase64String(base64Image);

	}

	public static void flushReport() {
		ExtendReportManager.extentReport.flush();

	}

	static List<Step> steps;

	public static List<Step> getStepOfScenario(Scenario scenario) throws Throwable {
		System.out.println("Step done");
		Field delegate = scenario.getClass().getDeclaredField("delegate");
		delegate.setAccessible(true);
		TestCaseState state = (TestCaseState) delegate.get(scenario);
		Field testCaseF = state.getClass().getDeclaredField("testCase");
		testCaseF.setAccessible(true);
		TestCase testCase = (TestCase) testCaseF.get(state);
		Field pickle = testCase.getClass().getDeclaredField("pickle");
		pickle.setAccessible(true);
		Pickle pickleState = (Pickle) pickle.get(testCase);
		steps = pickleState.getSteps();
		return steps;
	}

}
