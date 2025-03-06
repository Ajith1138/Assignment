package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_FMA_Obj {
	WebDriver driver;
	
	// initialize driver , web elements
	public CSM_FMA_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// below all annotation return web element
	@FindBy(xpath = "//div[@id='_selenuimA000']")
	private WebElement csm_AccountsFeature;

	public WebElement csmAccountsFeature() {
		return csm_AccountsFeature;
	}

	@FindBy(xpath = "//input[@id='fixedMaturityAccountsGridTbl_Id_A001MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement fmaAccounts_Maintenance_SearchCIFInput;

	public WebElement fmaAccountsMaintenanceSearchCIFInput() {
		return fmaAccounts_Maintenance_SearchCIFInput;
	}

	@FindBy(xpath = "//input[@id='fixedMaturityAccountsGridTbl_Id_A001ZP_gs_amfVO.CIF_SUB_NO']")
	private WebElement fmaAccounts_Suspend_Search_CIFNo;

	public WebElement fmaAccountsSuspendSearchCIFNo() {
		return fmaAccounts_Suspend_Search_CIFNo;
	}

	@FindBy(xpath = "//input[@id='fixedMaturityAccountsGridTbl_Id_A001PR_gs_amfVO.CIF_SUB_NO']")
	private WebElement fmaAccounts_Print_Search_CIFNo;

	public WebElement fmaAccountsPrintSearchCIFNo() {
		return fmaAccounts_Print_Search_CIFNo;
	}

	@FindBy(xpath = "//input[@id='fixedMaturityAccountsGridTbl_Id_A001PRC_gs_amfVO.CIF_SUB_NO']")
	private WebElement fmaAccounts_PrintCertificate_Search_CIFNo;

	public WebElement fmaAccountsPrintCertificateSearchCIFNo() {
		return fmaAccounts_PrintCertificate_Search_CIFNo;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A001MT']")
	private WebElement fma_Account_Opening_CurrencyCode;

	public WebElement fma_AccountOpeningCurrencyCode() {
		return fma_Account_Opening_CurrencyCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_glType_A001MT']")
	private WebElement fma_Opening_GL_Code_input;

	public WebElement fmaOpeningGLCOdeInput()

	{
		return fma_Opening_GL_Code_input;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifNo_A001MT']")
	private WebElement fma_Opening_CIF_Code_input;

	public WebElement fmaOpeningCIFCOdeInput()

	{
		return fma_Opening_CIF_Code_input;
	}

	@FindBy(xpath = "//table[@id='fixedMaturityAccountsGridTbl_Id_A001MA']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement fma_MaintenanceGrid_CIF_VisibilityCheck;

	public WebElement fmaMaintenanceGridCIFVisibilityCheck() {
		return fma_MaintenanceGrid_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='fixedMaturityAccountsGridTbl_Id_A001PR']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement fma_PrintingScreen_GRIDNoCIF_Verification;

	public WebElement fmaPrintScreenGRIDNoCIFVerifiation() {
		return fma_PrintingScreen_GRIDNoCIF_Verification;
	}

	@FindBy(xpath = "//table[@id='fixedMaturityAccountsGridTbl_Id_A001PRC']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement fma_PrintCertificateGrid_CIF_VisibilityCheck;

	public WebElement fmaPrintCertificateGridCIFVisibilityCheck() {
		return fma_PrintCertificateGrid_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='fixedMaturityAccountsGridTbl_Id_A001ZP']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement fma_SuspendGrid_CIF_VisibilityCheck;

	public WebElement fmaSuspendGridCIFVisibilityCheck() {
		return fma_SuspendGrid_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//input[@id='fixedMaturityAccountsGridTbl_Id_A001AU_gs_amfVO.CIF_SUB_NO']")
	private WebElement fma_AuthorizeSearchGrid_CIF_Input;

	public WebElement fmaAuthorizeSearchGridCIFInput() {
		return fma_AuthorizeSearchGrid_CIF_Input;
	}

	@FindBy(xpath = "//table[@id='fixedMaturityAccountsGridTbl_Id_A001AU']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement fma_AuthorizeCIFTable_Visibility_Check;

	public WebElement fmaAuthorizeCIFTableVisibilityCheck() {
		return fma_AuthorizeCIFTable_Visibility_Check;
	}

	@FindBy(xpath = "//input[@id='fixedMaturityAccountsGridTbl_Id_A001CL_gs_amfVO.CIF_SUB_NO']")
	private WebElement fma_CloseSearchGrid_CIF_Input;

	public WebElement fmaCloseSearchGridCIFInput() {
		return fma_CloseSearchGrid_CIF_Input;
	}
	@FindBy(xpath="//table[@id='fixedMaturityAccountsGridTbl_Id_A001CL']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement fma_CloseCIFTable_Visibility_Check;

	public WebElement fmaCloseCIFTableVisibilityCheck() {
		return fma_CloseCIFTable_Visibility_Check;
	}
}
