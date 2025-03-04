package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XaltsSignUp {
	WebDriver driver;
	public XaltsSignUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	private WebElement signInPage;
	
	@FindBy(xpath = "//span[contains(text(),'E-Mail')]//ancestor::fieldset//preceding-sibling::input")
	private WebElement emailId;
	
	@FindBy(xpath="//span[text()='Password']//ancestor::fieldset//preceding-sibling::input")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Confirm Password']//ancestor::fieldset//preceding-sibling::input")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signUp;
	
	public void clicksignInPage() {
		signInPage.click();
	}
	
	public void enterEmailID(String emailID) {
		emailId.sendKeys(emailID);
	}
	
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void enterConfirmPassword(String password) {
		confirmPassword.sendKeys(password);
	}
	
	public void clickSignUp() {
		signUp.click();
	}
	
	
	

}
