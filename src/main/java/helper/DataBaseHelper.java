package helper;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataprovider.DataBaseReader;

public class DataBaseHelper {
	WebDriver driver;

	public DataBaseHelper(WebDriver driver) {
		this.driver = driver;
	}

	DataBaseReader dataBaseReader = new DataBaseReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions seleniumActions;
	// click screen based on opt reference
	public void clickScreenUsingQuery(String optName, String ModuleName) throws Exception {
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		DataBaseReader databaseReader = new DataBaseReader();
		ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
		List<String> listOfOptID = databaseReader.getListOfOptID(optName,ModuleName);
		int elementToBeRetrivedFrom = 0;
		// loop iterate and click screen  until get the root
		for (int i = 0; i <= (listOfOptID.size() - 1); i++) {
			String xpath = "//div[@id='" + listOfOptID.get(i) + "']";
 
			try {
 
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
				elementToBeRetrivedFrom = i;
				break;
			} catch (Exception e) {
				
			}
 
		}
		for (int i = elementToBeRetrivedFrom; i >= 0; i--) {
			String xpath = "//div[@id='" + listOfOptID.get(i) + "']";
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
				clicksAndActionsHelper.scrollToElement(driver.findElement(By.xpath(xpath)));
 
				driver.findElement(By.xpath(xpath)).click();
 
			} catch (Exception e) {
 
			}
 
		}
		
	}
	
}
			

		

	


