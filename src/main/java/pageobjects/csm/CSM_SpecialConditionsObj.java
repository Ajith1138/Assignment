package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_SpecialConditionsObj {
	WebDriver driver;
	
	// initialize driver , web elements
	public CSM_SpecialConditionsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// below all annotation return web element
	@FindBy(name = "spcondsCO.specialConditionsVO.ENTITY_TYPE")
	private WebElement specialConditions_EntityTypeDropdown;

	public WebElement specialConditionsEntityTypeDropdown() {
		return specialConditions_EntityTypeDropdown;
	}

	@FindBy(name = "spcondsCO.specialConditionsVO.ACC_CY")
	private WebElement specialConditions_AccountCurency;

	public WebElement specialConditionsAccountCurency() {
		return specialConditions_AccountCurency;
	}

	@FindBy(name = "spcondsCO.specialConditionsVO.ACC_GL")
	private WebElement specialConditions_AccountGL;

	public WebElement specialConditionsAccountGL() {
		return specialConditions_AccountGL;
	}

	@FindBy(name = "spcondsCO.specialConditionsVO.ACC_CIF")
	private WebElement specialConditions_AccountCIF;

	public WebElement specialConditionsAccountCIF() {
		return specialConditions_AccountCIF;
	}

	@FindBy(name = "spcondsCO.specialConditionsVO.ACC_SL")
	private WebElement specialConditions_AccountSerialNumber;

	public WebElement specialConditionsAccountSerialNumber() {
		return specialConditions_AccountSerialNumber;
	}

}
