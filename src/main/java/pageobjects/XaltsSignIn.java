package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class XaltsSignIn {
	WebDriver driver;
	public XaltsSignIn(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[contains(text(),'Click here to sign in')]")
	private WebElement clickHereToSignIn;
	
	@FindBy(xpath = "//span[contains(text(),'E-Mail')]//ancestor::fieldset//preceding-sibling::input")
	private WebElement emailId;
	
	@FindBy(id="//span[text()='Password']//ancestor::fieldset//preceding-sibling::input")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement signIn;
	
	@FindBy(xpath ="//h1")
	private WebElement verify;
	
	@FindBy(xpath ="//button[text()='Sign Out']")
	private WebElement signOut;
	
	
	public void clicksignIn() {
		signIn.click();
	}
	
	public void clickHereToSignIn() {
		clickHereToSignIn.click();
	}
	
	public void enterEmailID(String emailID) {
		emailId.sendKeys(emailID);
	}
	
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	
	public void verifyHomePage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(verify));
		Assert.assertTrue(verify.isDisplayed());
	}
	
	public void clickSignOut() {
		signOut.click();
	}
	public void verifySignInPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(signIn));
		Assert.assertTrue(signIn.isDisplayed());
	}
	
	

}
