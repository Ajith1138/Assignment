package helper;

import org.openqa.selenium.WebElement;

public class VerificationHelper {
	
	
	//Synchronized method is used to lock an object for any shared resource. When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.
	//Returns boolean value for element display
	public static synchronized boolean verifyElementPresent( WebElement element) {
		boolean isDispalyed = false;
		try {
			 isDispalyed= element.isDisplayed();
			
		}
		catch(Exception ex) {
			
		}
		//ExtentTestManager.getTest().info("Element present");
		return isDispalyed;
	}
	
	//Returns boolean value for element not display
	public static synchronized boolean verifyElementNotPresent( WebElement element) {
		boolean isDispalyed = false;
		try {
			 element.isDisplayed();
			
		}
		catch(Exception ex) {
			
			isDispalyed = true;
		}
		
		return isDispalyed;
	}
	
	
	//Validating actual and expected texts
	public static synchronized boolean verifyTextEquals( WebElement element,String expectedText) {
		boolean flag = false;
		try {
			String actualText=element.getText();
			if(actualText.equals(expectedText)) {
				
			//	ExtentTestManager.getTest().info("Actual text matches with expected text");
				return flag=true;
			}
			else {
			
			//	ExtentTestManager.getTest().info("Actual text not matches with expected text");
				return flag;
			}
		}
		catch(Exception ex) {
		
			return flag;
		}
	}
}
