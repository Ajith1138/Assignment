package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dataprovider.ConfigFileReader;
import helper.AlertHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.XaltsSignIn;
import pageobjects.XaltsSignUp;
import resources.BaseClass;

public class xalts extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFile =  new ConfigFileReader();
	XaltsSignIn signInPage = new XaltsSignIn(driver);
	XaltsSignUp signUpPage = new XaltsSignUp(driver);
	AlertHelper alertHelper = new AlertHelper(driver);
	
	@Given("User land on capital Network Page")
	public void user_land_on_capital_network_page() {
	    driver.get(configFile.getXaltsApplicationUR());
	    
	}

	@When("user click sign in option")
	public void user_click_sign_in_option() {
		signUpPage.clicksignInPage();
	    
	}

	@When("user enter valid mail id {string}")
	public void user_enter_valid_mail_id(String string) {
		signUpPage.enterEmailID(string);
	    
	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String string) {
	    
	    signUpPage.enterPassword(string);
	}

	@When("user enter confirm password {string}")
	public void user_enter_confirm_password(String string) {
	    signUpPage.enterConfirmPassword(string);
	    
	}
	
	@When("user click signup")
	public void user_click_signup() {
	    signUpPage.clickSignUp();
	}

	@When("user click already have account")
	public void user_click_already_have_account() {
	   signInPage.clickHereToSignIn();
	}

	@When("user click sigIn")
	public void user_click_sig_in() {
		signInPage.clicksignIn();
	}
	
	@Then("user verify account already registered")
	public void user_verify_account_already_registered() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertEquals(alertHelper.getAlertText(), "Provided E-Mail is already in use");
	    alertHelper.AcceptAlert();
	}
	
	@Then("user Verify the Home Page")
	public void user_verify_the_home_page() {
	    signInPage.verifyHomePage();
	}
	
	@When("user click sign out")
	public void user_click_sign_out() {
		signInPage.clickSignOut();
	}
	@Then("user verify successfully signed out")
	public void user_verify_successfully_signed_out() {
	   signInPage.verifySignInPage();
	}



}
