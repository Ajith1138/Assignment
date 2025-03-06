package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CIFTypeCreationObj {
	WebDriver driver;

	public CIFTypeCreationObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='CIF Parameters']")
	private WebElement csmParam_CifParameterMainModule;

	public WebElement csmParamCifParameterMainModule() {
		return csmParam_CifParameterMainModule;
	}
	@FindBy(xpath="//td[text()='CIF Type']")
	private WebElement csmParam_CifTypeMainModule;

	public WebElement csmParamCifTypeMainModule() {
		return csmParam_CifTypeMainModule;
	}
	@FindBy(xpath="//td[text()='CIF Type']//ancestor::li//span[text()='Maintenance']")
	private WebElement cifType_Maintenance;

	public WebElement cifTypeMaintenance() {
		return cifType_Maintenance;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.TYPE_CODE']")
	private WebElement cifType_CifTypeInput;

	public WebElement cifTypeInputBox() {
		return cifType_CifTypeInput;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.BRIEF_DESC_ENG']")
	private WebElement cifType_BriefNameInput;

	public WebElement cifTypeBriefNameInput() {
		return cifType_BriefNameInput;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.LONG_DESC_ENG']")
	private WebElement cifType_LongNameInput;

	public WebElement cifTypeLongNameInput() {
		return cifType_LongNameInput;
	}
	@FindBy(xpath="//input[@value='V']")
	private WebElement cifType_IndividualCIFradioOption;

	public WebElement cifTypeIndividualCIFradioOption() {
		return cifType_IndividualCIFradioOption;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.CLIENT']")
	private WebElement cifType_CIFIsAClientOption;

	public WebElement cifTypeCIFIsAClientOption() {
		return cifType_CIFIsAClientOption;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.MIN_AGE']")
	private WebElement cifType_MinAgeTextBox;

	public WebElement cifTypeMinAgeTextBox() {
		return cifType_MinAgeTextBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.MAX_AGE']")
	private WebElement cifType_MaxAgeTextBox;

	public WebElement cifTypeMaxAgeTextBox() {
		return cifType_MaxAgeTextBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.MIN_AGE_PROCEED']")
	private WebElement cifType_MinAgeAllowToProceed;

	public WebElement cifTypeMinAgeAllowToProceed() {
		return cifType_MinAgeAllowToProceed;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.MAX_AGE_PROCEED']")
	private WebElement cifType_MaxAgeAllowToProceed;

	public WebElement cifTypeMaxAgeAllowToProceed() {
		return cifType_MaxAgeAllowToProceed;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.DEFAULT_ECO_SECTOR']")
	private WebElement cifType_EcoSectorInputBox;

	public WebElement cifTypeEcoSectorInputBox() {
		return cifType_EcoSectorInputBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.DEFAULT_SUB_ECO_SECTOR']")
	private WebElement cifType_SubEcoSectorInputBox;

	public WebElement cifTypeSubEcoSectorInputBox() {
		return cifType_SubEcoSectorInputBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.ecoDescr']")
	private WebElement cifType_EcoSectorDescription;

	public WebElement cifTypeEcoSectorDescription() {
		return cifType_EcoSectorDescription;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.subEcoDescr']")
	private WebElement cifType_SubEcoSectorDescription;

	public WebElement cifTypeSubEcoSectorDescription() {
		return cifType_SubEcoSectorDescription;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.DEFAULT_ROLE_CODE']")
	private WebElement cifType_RoleCodeInputBox;

	public WebElement cifTypeRoleCodeInputBox() {
		return cifType_RoleCodeInputBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.roleDescr']")
	private WebElement cifType_RoleCodeDescription;

	public WebElement cifTypeRoleCodeDescription() {
		return cifType_RoleCodeDescription;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.LEGAL_STATUS']")
	private WebElement cifType_LegalStatusInputBox;

	public WebElement cifTypeLegalStatusInputBox() {
		return cifType_LegalStatusInputBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.legalDesc']")
	private WebElement cifType_LegalStatusDescription;

	public WebElement cifTypeLegalStatusDescription() {
		return cifType_LegalStatusDescription;
	}
	@FindBy(xpath="//span[text()='Allowed Account Types']")
	private WebElement cifType_AllowedAccountTypeTab;

	public WebElement cifTypeAllowedAccountTypeTab() {
		return cifType_AllowedAccountTypeTab;
	}
	@FindBy(xpath="//td[@id='add_tab4_GridTbl_Id_P010MT']")
	private WebElement cifType_AllowedAccountTypeAddButton;

	public WebElement cifTypeAllowedAccountTypeAddButton() {
		return cifType_AllowedAccountTypeAddButton;
	}
	@FindBy(xpath="//input[@name='lookupTxt_rifcttAccTypeVO.GL_CODE']")
	private WebElement cifType_AllowedAccountTypeGlCodeTextBox;

	public WebElement cifTypeAllowedAccountTypeGlCodeTextBox() {
		return cifType_AllowedAccountTypeGlCodeTextBox;
	}
	@FindBy(xpath="//td[@tdlabel='Number of Accounts']//input")
	private WebElement cifType_AllowedAccountTypeNumberOfAccountsTextBox;

	public WebElement cifTypeAllowedAccountTypeNumberOfAccountsTextBox() {
		return cifType_AllowedAccountTypeNumberOfAccountsTextBox;
	}
	@FindBy(xpath="//td[text()='CIF Type']//ancestor::li//span[text()='Approve']")
	private WebElement cifType_ApproveModule;

	public WebElement cifTypeApproveModule() {
		return cifType_ApproveModule;
	}
	@FindBy(xpath="(//input[@name='TYPE_CODE'])[2]")
	private WebElement cifType_SearchCIFCode;

	public WebElement cifTypeSearchCIFCode() {
		return cifType_SearchCIFCode;
	}
	@FindBy(id="cifTypeParamList_GridTbl_Id_P010MA_gs_rifcttVO.TYPE_CODE")
	private WebElement cifTypeUpdateAfterApproveGridInput;
	public WebElement cifTypeUpdateAfterApproveGridInput()
	{
		return cifTypeUpdateAfterApproveGridInput;
	}
	@FindBy(id="cifTypeParamList_GridTbl_Id_P010P_gs_rifcttVO.TYPE_CODE")
	private WebElement cifTypeApproveGridInput;
	public WebElement cifTypeApproveGridInput()
	{
		return cifTypeApproveGridInput;
	}
	@FindBy(xpath="//label[@id='cifTypeParamMaint_FormId_P010MA_Update_After_Approve_key']//ancestor::button")
	private WebElement cifTypeUpdateAfterApproveButton;
	public WebElement cifTypeUpdateAfterApproveButton()
	{
		return cifTypeUpdateAfterApproveButton;
	}
	@FindBy(xpath="//label[@id='cifTypeParamMaint_FormId_P010P_Approve_key']//ancestor::button")
	private WebElement cifTypeApproveButton;
	public WebElement cifTypeApproveButton()
	{
		return cifTypeApproveButton;
	}
	@FindBy(xpath="//button[contains(@id,'generated_Btn_new_') and contains(@id,'P010MA')]")
	private WebElement chargeWaiverTrxTypeButton;
	public WebElement chargeWaiverTrxTypeButton()
	{
		return chargeWaiverTrxTypeButton;
	}
	@FindBy(xpath="//td[@id='tab17_1_GridTbl_Id_P010MA_pager_left']//span[@class='ui-icon ui-icon-plus']")
	private WebElement chargeWaiverTrxTypeAddButton;
	public WebElement chargeWaiverTrxTypeAddButton()
	{
		return chargeWaiverTrxTypeAddButton;
	}
	@FindBy(xpath="//input[contains(@id,'_ctsChargesWaiverTrxVO.TRX_TYPE_lookuptxt_tab17_') and contains(@id,'_GridTbl_Id_P010MA')]")
	private WebElement chargeWaiverTrxTypeInput;
	public WebElement chargeWaiverTrxTypeInput()
	{
		return chargeWaiverTrxTypeInput;
	}
	@FindBy(id="ok_btn_17_P010MA")
	private WebElement chargeWaiverTrxTypeOkButton;
	public WebElement chargeWaiverTrxTypeOkButton()
	{
		return chargeWaiverTrxTypeOkButton;
	}
	@FindBy(xpath="//span[contains(text(),' Charges Waiver ')]//parent::a")
	private WebElement cifTypeUpdateAfterApproveChargeWaiverButton;
	public WebElement cifTypeUpdateAfterApproveChargeWaiverButton()
	{
		return cifTypeUpdateAfterApproveChargeWaiverButton;
	}
		@FindBy(xpath="//td[@id='tab12_GridTbl_Id_P010MA_pager_left']//span[@class='ui-icon ui-icon-plus']")
		private WebElement cifTypeChargeWaiverAddButton;
		public WebElement cifTypeChargeWaiverAddButton()
		{
			return cifTypeChargeWaiverAddButton;
		}
		@FindBy(xpath="//select[contains(@id,'ctschargesWaiverVO.EXEMPTION_TYPE')]")
		private WebElement cifTypeChargeWaiverExcemptionTypeDropdown;
		public WebElement cifTypeChargeWaiverExcemptionTypeDropdown()
		{
			return cifTypeChargeWaiverExcemptionTypeDropdown;
		}
		@FindBy(xpath="//input[contains(@id,'ctschargesWaiverVO.FROM_DATE')]")
		private WebElement cifTypeChargeWaiverFromDateInput;
		public WebElement cifTypeChargeWaiverFromDateInput()
		{
			return cifTypeChargeWaiverFromDateInput;
		}
		@FindBy(xpath="//input[contains(@id,'ctschargesWaiverVO.TO_DATE')]")
		private WebElement cifTypeChargeWaiverToDateInput;
		public WebElement cifTypeChargeWaiverToDateInput()
		{
			return cifTypeChargeWaiverToDateInput;
		}
		@FindBy(xpath="//input[contains(@id,'ctschargesWaiverVO.WAIVER_PERCENTAGE')]")
		private WebElement cifTypeChargeWaiverWaiverPercentage;
		public WebElement cifTypeChargeWaiverWaiverPercentage()
		{
			return cifTypeChargeWaiverWaiverPercentage;
		}
		
		@FindBy(xpath="//input[contains(@id,'ctschargesWaiverVO.WAIVER_AMOUNT')]")
		private WebElement cifTypeChargeWaiverWaiverWaiverAmount;
		public WebElement cifTypeChargeWaiverWaiverWaiverAmount()
		{
			return cifTypeChargeWaiverWaiverWaiverAmount;
		}
		
		@FindBy(xpath="//select[contains(@id,'ctschargesWaiverVO.AVERAGE_BAL_BASIS')]")
		private WebElement cifTypeChargeWaiverWaiverAvgBalanceBasicsDropdown;
		public WebElement cifTypeChargeWaiverWaiverAvgBalanceBasicsDropdown()
		{
			return cifTypeChargeWaiverWaiverAvgBalanceBasicsDropdown;
		}
		@FindBy(xpath="//input[contains(@id,'ctschargesWaiverVO.FROM_BALANCE')]")
		private WebElement cifTypeChargeWaiverWaiverFromBalanceAmountInput;
		public WebElement cifTypeChargeWaiverWaiverFromBalanceAmountInput()
		{
			return cifTypeChargeWaiverWaiverFromBalanceAmountInput;
		}
		@FindBy(xpath="//input[contains(@id,'ctschargesWaiverVO.TO_BALANCE')]")
		private WebElement cifTypeChargeWaiverWaiverToBalanceAmountInput;
		public WebElement cifTypeChargeWaiverWaiverToBalanceAmountInput()
		{
			return cifTypeChargeWaiverWaiverToBalanceAmountInput;
		}
		@FindBy(id="ok_btn_11_P010MA")
		private WebElement cifTypeChargeWaiverGridOkButtton;
		public WebElement cifTypeChargeWaiverGridOkButtton()
		{
			return cifTypeChargeWaiverGridOkButtton;
		}
		
	
	
}
