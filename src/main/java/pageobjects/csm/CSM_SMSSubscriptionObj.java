package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_SMSSubscriptionObj {

	WebDriver driver;
	
	// initialize driver , web elements
	public CSM_SMSSubscriptionObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// below all annotation return web element
	@FindBy(xpath = "//input[@id='subscriptionType_SMS00MTA']")
	private WebElement smsSubscription_AccountCheckBox;

	public WebElement smsSubscriptionAccountCheckBox() {
		return smsSubscription_AccountCheckBox;
	}

	@FindBy(id = "acc_br_SMS00MT")
	private WebElement smsSubscription_AccountBranchCode;

	public WebElement smsSubscriptionAccountBranchCode() {
		return smsSubscription_AccountBranchCode;
	}

	@FindBy(id = "acc_cy_SMS00MT")
	private WebElement smsSubscription_AccountCurrencyCode;

	public WebElement smsSubscriptionAccountCurrencyCode() {
		return smsSubscription_AccountCurrencyCode;
	}

	@FindBy(id = "acc_gl_SMS00MT")
	private WebElement smsSubscription_AccountGLCode;

	public WebElement smsSubscriptionAccountGLCode() {
		return smsSubscription_AccountGLCode;
	}

	@FindBy(id = "acc_cif_SMS00MT")
	private WebElement smsSubscription_AccountCIFCode;

	public WebElement smsSubscriptionAccountCIFCode() {
		return smsSubscription_AccountCIFCode;
	}

	@FindBy(id = "lookuptxt_acc_sl_SMS00MT")
	private WebElement smsSubscription_AccountSerialNumberCode;

	public WebElement smsSubscriptionAccountSerialNumberCode() {
		return smsSubscription_AccountSerialNumberCode;
	}

}
