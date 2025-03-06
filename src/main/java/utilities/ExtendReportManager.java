package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportManager {
	static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd_MM_yy_HH_mm_ss");
	static LocalDateTime localDateTime = LocalDateTime.now();
	static String currentDateAndTime = localDateTime.format(dateTimeFormatter);
	static ExtentReports extentReport = new ExtentReports();
	public static String reportPath = System.getProperty("user.dir") + "\\ExtentReports\\TestReports"+" "+currentDateAndTime;

	public static ExtentReports setupReports() {

		ExtentSparkReporter extentSparkReport = new ExtentSparkReporter(reportPath + "\\TestReport.html");

		System.out.println("Extent report instance " + extentSparkReport);
		extentReport.attachReporter(extentSparkReport);
		return extentReport;
	}

	public static String storeReportScreenshots(File sourceFile) throws IOException {
		String filePath = reportPath + "\\ScreenShots";
		File destinationFile = new File(filePath);
		FileUtils.copyFileToDirectory(sourceFile, destinationFile);
		String screenshotPath = filePath +"\\"+ sourceFile.getName();
		return screenshotPath;
	}

}
