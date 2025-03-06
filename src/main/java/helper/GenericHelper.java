package helper;

import org.openqa.selenium.WebElement;

public class GenericHelper {

	//Reading the vaue from the element
	public String readValueFromElement(WebElement element) {

		if (null == element) {
			
		//	ExtentTestManager.getTest().info("Element value is null");
			return null;
		}

		boolean displayed = false;
		try {
			displayed = isDisplayed(element);
		} catch (Exception e) {
			
		
			return null;
		}

		if (!displayed) {
			//ExtentTestManager.getTest().info("Element not displayed");
			return null;
		}
		String text = element.getText();
		
		//ExtentTestManager.getTest().info("Element value is " + text);
		return text;
	}

	
	//Reading the Value from particular attribute
	public String readValueFromInput(WebElement element) {
		if (null == element) {
			//ExtentTestManager.getTest().info("Element value is null");
			return null;
		}
		if (!isDisplayed(element)) {
			//ExtentTestManager.getTest().info("Element value is null");
			return null;
		}
		String value = element.getAttribute("value");
		
		//ExtentTestManager.getTest().info("Attribute  value is " + value);
		return value;
	}

	
	//Check the display of element
	public boolean isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			
			//ExtentTestManager.getTest().info("Element displayed");
			return true;
		} catch (Exception e) {
		
		
			//ExtentTestManager.getTest().info("Element not displayed" + e.fillInStackTrace().toString());
			return false;
		}
	}
//Check for element not displayed
	protected boolean isNotDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		
			//ExtentTestManager.getTest().info("Element not displayed");
			return false;
		} catch (Exception e) {
			
			
			//ExtentTestManager.getTest().info("Element  displayed" + e.fillInStackTrace().toString());
			return true;
		}
	}

	
}
