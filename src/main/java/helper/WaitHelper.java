package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataprovider.ConfigFileReader;

public class WaitHelper {
	private WebDriver driver;
	
	String fileLocation=System.getProperty("user.dir")+"\\configs\\data.properties";
	FileInputStream fileInputStream;
	ConfigFileReader configFileReader = new ConfigFileReader();
	// wait helper constrcutor
	public WaitHelper(WebDriver driver) {
		this.driver = driver;
		
	}

	// setImplicitWait 
	public void setImplicitWait(long timeout) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		//driver.manage().timeouts().implicitlyWait(timeout, unit == null ? TimeUnit.SECONDS : unit);
		//ExtentTestManager.getTest().info("Setted implicit wait for this element");
	}
      
	
	public void setPageLoadTimeout(long timeout, TimeUnit unit) {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeout));
		//driver.manage().timeouts().pageLoadTimeout(timeout, unit == null ? TimeUnit.SECONDS : unit);
		//WebDriver.Timeouts pageLoadTimeout(long timeout1,java.util.concurrent.TimeUnit unit)
		//ExtentTestManager.getTest().info("Setting wait for page load");
	}

	// set explicit wait
	private WebDriverWait getWait(int timeOutInSeconds, int pollingEveryInMiliSec) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
		// wait.pollingEvery(pollingEveryInMiliSec, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotInteractableException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		//ExtentTestManager.getTest().info("Setted explicit wait for this element");
		return wait;
	}

	// waitForElementVisible
	public void waitForElementVisible(WebElement locator, int timeOutInSeconds, int pollingEveryInMiliSec) {
		
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryInMiliSec);
		wait.until(ExpectedConditions.visibilityOf(locator));
		//ExtentTestManager.getTest().info("Setted wait untill the element is visible");
	}

	// wait for one element
	public void waitForElement(WebDriver driver, WebElement element, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
		//ExtentTestManager.getTest().info("Setted wait untill the element is visible");
	}

	// wait for element to be clickable

	public WebElement waitForElement(WebDriver driver, long time, WebElement element) {
		
		//WebDriverWait wait = new WebDriverWait(driver, time);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		//ExtentTestManager.getTest().info("Setted wait untill the element is clickable");
		return wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	// wait for element with fluent wait
	public  WebElement waitForElementwithFluentwait(WebDriver driver, WebElement element)  
	{ 	
//		fileInputStream= new FileInputStream(fileLocation);
//		prop.load(fileInputStream);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(configFileReader.getTimeOut())) 
				.pollingEvery(Duration.ofMillis(configFileReader.getPollingTime()))
				.ignoring(Exception.class);
//		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
		WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
		return element1;
	}
	// wait for element with fluent wait
	public  WebElement waitForElementToVisibleWithFluentWait(WebDriver driver, WebElement element,int timeOut,int pollingTime) 
	 { 
	 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	 .withTimeout(Duration.ofSeconds(timeOut)) 
	 .pollingEvery(Duration.ofMillis(pollingTime))
	 .ignoring(Exception.class);
	 WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
	 return element1;
	 }
	
	// wait for alert
	public  void waitForElementwithFluentwaitForAlert(WebDriver driver) throws IOException 
    {     
        fileInputStream= new FileInputStream(fileLocation);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(configFileReader.getTimeOut()))
                .pollingEvery(Duration.ofMillis(configFileReader.getTimeOut()))
                .ignoring(Exception.class);
        wait.until(ExpectedConditions.alertIsPresent());

    }



}
