package resources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataprovider.ConfigFileReader;


public class BaseClass {
	
	public static WebDriver driver;
	
	// initialize web driver 
	public WebDriver initializeDriver( )throws IOException {
	
	ConfigFileReader configFileReader=new ConfigFileReader();
	String browserName =configFileReader.getBrowser();
	
	if(browserName.equalsIgnoreCase("chrome")) {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--remote-allow-origins=*");
		if (configFileReader.getHeadlessMode().equalsIgnoreCase("yes")) {
			options.addArguments("--headless=new");
		}
		
		//options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		
	}else if(browserName.equalsIgnoreCase("firefox")) {
		
	 
		driver = new FirefoxDriver();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--remote-allow-origins=*");
	
	
		
	}else if(browserName.equalsIgnoreCase("ie")) {
		
		driver = new InternetExplorerDriver();
		
		
	}
else if(browserName.equalsIgnoreCase("edge")) {
		
		driver = new EdgeDriver();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--remote-allow-origins=*");
		
	}
	
	driver.manage().window().maximize();
	

	
	
	return driver;
}


}

