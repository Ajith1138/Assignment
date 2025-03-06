package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_DuesManagementObj {

	WebDriver driver;
	// initialize driver , web elements
	public CSM_DuesManagementObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// below all annotation return web element
	@FindBy(id = "accBr_DUES01MT")
	private WebElement duesManagement_BranchCodeInput;

	public WebElement duesManagementBranchCodeInput() {
		return duesManagement_BranchCodeInput;
	}

	@FindBy(id = "accCy_DUES01MT")
	private WebElement duesManagement_AccountCurrencyCodeInput;

	public WebElement duesManagementAccountCurrencyCodeInput() {
		return duesManagement_AccountCurrencyCodeInput;
	}

	@FindBy(id = "accGl_DUES01MT")
	private WebElement duesManagement_AccountGLCodeInput;

	public WebElement duesManagementAccountGLCodeInput() {
		return duesManagement_AccountGLCodeInput;
	}

	@FindBy(id = "accCif_DUES01MT")
	private WebElement duesManagement_AccountCIFCodeInput;

	public WebElement duesManagementAccountCIFCodeInput() {
		return duesManagement_AccountCIFCodeInput;
	}

	@FindBy(id = "lookuptxt_accSl_DUES01MT")
	private WebElement duesManagement_AccountSerialNumberInput;

	public WebElement duesManagementAccountSerialNumberInput() {
		return duesManagement_AccountSerialNumberInput;
	}
	
	@FindBy(id = "infoBarSearchButton_DUES01MT")
	private WebElement duesManagementMaintenanceSearchButton;

	public WebElement duesManagementMaintenanceSearchButton() {
		return duesManagementMaintenanceSearchButton;
	}
	@FindBy(id="duesAccountListGridTbl_Id_DUES01MT_gs_amfVO.BRANCH_CODE")
	private WebElement duesManagementMaintenanceSearchGridBranchCodeInput;

	public WebElement duesManagementMaintenanceSearchGridBranchCodeInput() {
		return duesManagementMaintenanceSearchGridBranchCodeInput;
	}
	@FindBy(id="duesAccountListGridTbl_Id_DUES01MT_gs_amfVO.CURRENCY_CODE")
	private WebElement duesManagementMaintenanceSearchGridCurrencyCodeInput;

	public WebElement duesManagementMaintenanceSearchGridCurrencyCodeInput() {
		return duesManagementMaintenanceSearchGridCurrencyCodeInput;
	}
	@FindBy(id="duesAccountListGridTbl_Id_DUES01MT_gs_amfVO.GL_CODE")
	private WebElement duesManagementMaintenanceSearchGridGLCodeInput;

	public WebElement duesManagementMaintenanceSearchGridGLCodeInput() {
		return duesManagementMaintenanceSearchGridGLCodeInput;
	}
	@FindBy(id="duesAccountListGridTbl_Id_DUES01MT_gs_amfVO.CIF_SUB_NO")
	private WebElement duesManagementMaintenanceSearchGridCIFCodeInput;

	public WebElement duesManagementMaintenanceSearchGridCIFCodeInput() {
		return duesManagementMaintenanceSearchGridCIFCodeInput;
	}
	@FindBy(id="duesAccountListGridTbl_Id_DUES01MT_gs_amfVO.SL_NO")
	private WebElement duesManagementMaintenanceSearchGridSerialNumberInput;

	public WebElement duesManagementMaintenanceSearchGridSerialNumberInput() {
		return duesManagementMaintenanceSearchGridSerialNumberInput;
	}

}
