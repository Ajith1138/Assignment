package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passbook_CSM {
	WebDriver driver;

	public Passbook_CSM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeINdebitAc;

	public WebElement CSM_BranchCodeINdebitAc() {
		return CSM_BranchCodeINdebitAc;
	}

	@FindBy(id = "trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodedebitAc;

	public WebElement CSM_CurrencyCodedebitAc() {
		return CSM_CurrencyCodedebitAc;
	}

	@FindBy(id = "trs_ac_gl_D001MT")
	private WebElement CSM_GLCodedebitAc;

	public WebElement CSM_GLCodedebitAc() {
		return CSM_GLCodedebitAc;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeIndebitAc;

	public WebElement CSM_CIFCodeIndebitAc() {
		return CSM_CIFCodeIndebitAc;
	}

	@FindBy(id = "lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialIndebitAc;

	public WebElement CSM_SerialIndebitAc() {
		return CSM_SerialIndebitAc;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement currency_code_value;

	public WebElement currency_code_value() {
		return currency_code_value;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;

	public WebElement CSMDateToChangeTheCurrentDate() {
		return CSM_DateToChangeTheCurrentDate;
	}

	// input[@id='linktoother_trx_P024MA']
	@FindBy(xpath = "//input[@id='linktoother_trx_P024MA']")
	private WebElement Linked_transaction_CSMparam;

	public WebElement Linked_transaction_CSMparam() {
		return Linked_transaction_CSMparam;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate;

	public WebElement CSMDateInUserRunningDate() {
		return CSM_DateInUserRunningDate;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate;

	public WebElement CSMUseButtonInChangeRunningDate() {
		return CSM_UseButtonInChangeRunningDate;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
		return CSM_ClearCacheInTechnicalDetailsIcon;

	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice;

	public WebElement ClosePopupmsg_frontoffice() {
		return ClosePopupmsg_frontoffice;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;

	public WebElement CSMOkButtonInInformationPopUpMenu() {
		return CSM_OkButtonInInformationPopUpMenu;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;

	public WebElement CSMCloseButtonInChangeRunningDate() {
		return CSM_CloseButtonInChangeRunningDate;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement submit_user_approve;

	public WebElement submit_user_approve() {
		return submit_user_approve;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement updateAfterApprove_User_Param;

	public WebElement updateAfterApprove_User_Param() {
		return updateAfterApprove_User_Param;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
		return CSM_OkButtonInAccessDeniedPopUpMenu;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement CSM_OkButtonInWarningPopUpToGoBackToMaintenance;

	public WebElement CSMOkButtonInWarningPopUpToGoBackToMaintenance() {
		return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg;

	public WebElement POPupmsg() {
		return POPupmsg;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInCreditAc;

	public WebElement CSMCIFCodeInCreditAc() {
		return CSM_CIFCodeInCreditAc;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement ParameterMainModule;

	public WebElement ParameterMainModule() {
		return ParameterMainModule;
	}

	@FindBy(xpath = "//td[text()='System Parameters']//parent::td")
	private WebElement Systemparameter;

	public WebElement Systemparameter() {
		return Systemparameter;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement TransactionType_parameter;

	public WebElement TransactionType_parameter() {
		return TransactionType_parameter;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement UpdateAfterApprove_Transafer;

	public WebElement UpdateAfterApprove_Transafer() {
		return UpdateAfterApprove_Transafer;
	}

	@FindBy(id = "infoBarSearchButton_D001MT")
	private WebElement CSM_SearchButtonInMaintenanceScreen;

	public WebElement CSMSearchButtonInMaintenanceScreen() {
		return CSM_SearchButtonInMaintenanceScreen;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon;

	public WebElement CSMTechnicalDetailsIcon() {
		return CSM_TechnicalDetailsIcon;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp;

	public WebElement CSMOkButtonUnderInformationPopUp() {
		return CSM_OkButtonUnderInformationPopUp;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu() {
		return CSM_TransactionsMainMenu;
	}

	@FindBy(xpath = "//td[text()='PassBooks']")
	private WebElement Passbook;

	public WebElement Passbook() {
		return Passbook;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenance;

	public WebElement Maintenance() {
		return Maintenance;
	}

	@FindBy(xpath = "//input[@id='passbkCode_S000MT']")
	private WebElement passbookcode;

	public WebElement passbookcode() {
		return passbookcode;
	}

	@FindBy(xpath = "//input[@id='status_S000MT']")
	private WebElement Status;

	public WebElement Status() {
		return Status;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement User_Approve_Tarnsaction;

	public WebElement User_Approve_Tarnsaction() {
		return User_Approve_Tarnsaction;
	}

	@FindBy(xpath = "//input[@id='branchName_S000MT']")
	private WebElement BranchName1;

	public WebElement BranchName1() {
		return BranchName1;
	}

	@FindBy(xpath = "//input[@id='dateCreated_S000MT']")
	private WebElement DateCreated;

	public WebElement DateCreated() {
		return DateCreated;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_passbookType_S000MT']")
	private WebElement passbookType;

	public WebElement passbookType() {
		return passbookType;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[3]")
	private WebElement BranchCode;

	public WebElement BranchCode() {
		return BranchCode;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[4]")
	private WebElement CurrencyCode;

	public WebElement CurrencyCode() {
		return CurrencyCode;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[5]")
	private WebElement GlCode;

	public WebElement Glcode() {
		return GlCode;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[6]")
	private WebElement CifCode;

	public WebElement CifCode() {
		return CifCode;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[7]")
	private WebElement SerialNo;

	public WebElement SerialNo() {
		return SerialNo;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_accAddRef_S000MT']")
	private WebElement AccountNo;

	public WebElement AccountNo() {
		return AccountNo;
	}

	@FindBy(xpath = "//select[@id='deductCharges_S000MT']")
	private WebElement DeductCharges;

	public WebElement DeductCharges() {
		return DeductCharges;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement SaveButton;

	public WebElement SaveButton() {
		return SaveButton;
	}

	@FindBy(xpath = "//a[@id='PassBooks / Maintenance']")
	private WebElement Reclickelement;

	public WebElement Reclickelement() {
		return Reclickelement;
	}

	@FindBy(xpath = "//input[@id='passbkCode_S000MT']")
	private WebElement passcode_ChargeWai;

	public WebElement passcode_ChargeWai() {
		return passcode_ChargeWai;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.DATE_CREATED']")
	private WebElement PassbookData_created;

	public WebElement PassbookData_created() {
		return PassbookData_created;
	}

	@FindBy(xpath = "//select[@name='passBookCO.passBookVO.CHARGES_DEDUCT']")
	private WebElement DeductCharge_passbook;

	public WebElement DeductCharge_passbook() {
		return DeductCharge_passbook;
	}

	@FindBy(xpath = "//input[@id='multi_trx_P024MA']")
	private WebElement CSM_MultipleTransfer_Checkbox__Param;

	public WebElement CSM_MultipleTransfer_Checkbox__Param() {
		return CSM_MultipleTransfer_Checkbox__Param;
	}

	@FindBy(xpath = "//input[@id='cr_dr_forex_P024MAD']")
	private WebElement CSM_MainAccDebit_RadioBtn;

	public WebElement CSM_MainAccDebit_RadioBtn() {
		return CSM_MainAccDebit_RadioBtn;
	}

	@FindBy(xpath = "//td[text()='PassBooks']")
	private WebElement CSM_Passbooks_Screen;

	public WebElement CSM_Passbooks_Screen() {
		return CSM_Passbooks_Screen;
	}

	@FindBy(xpath = "//a[@id='S000MT']")
	private WebElement CSM_Maintainance_Passbooks;

	public WebElement CSM_Maintainance_Passbooks() {
		return CSM_Maintainance_Passbooks;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_passbookType_S000MT']")
	private WebElement CSM_PassbookType_Maintainance_Passbook;

	public WebElement CSM_PassbookType_Maintainance_Passbook() {
		return CSM_PassbookType_Maintainance_Passbook;
	}

	@FindBy(xpath = "//input[@id='accCy_S000MT']")
	private WebElement CSM_CurrencyCode_Maintainance_Passbook;

	public WebElement CSM_CurrencyCode_Maintainance_Passbook() {
		return CSM_CurrencyCode_Maintainance_Passbook;
	}

	@FindBy(xpath = "//input[@id='accGl_S000MT']")
	private WebElement CSM_GLCode_Maintainance_Passbook;

	public WebElement CSM_GLCode_Maintainance_Passbook() {
		return CSM_GLCode_Maintainance_Passbook;
	}

	@FindBy(xpath = "//input[@id='accCif_S000MT']")
	private WebElement CSM_CIFNo_Maintainance_Passbook;

	public WebElement CSM_CIFNo_Maintainance_Passbook() {
		return CSM_CIFNo_Maintainance_Passbook;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_accSl_S000MT']")
	private WebElement CSM_SerialNo_Maintainance_Passbook;

	public WebElement CSM_SerialNo_Maintainance_Passbook() {
		return CSM_SerialNo_Maintainance_Passbook;
	}

	@FindBy(xpath = "(//span[text()='Charges'])[2]")
	private WebElement CSM_Charges_Maintainance_Passbook;

	public WebElement CSM_Charges_Maintainance_Passbook() {
		return CSM_Charges_Maintainance_Passbook;
	}

	@FindBy(xpath = "//select[@id='deductCharges_S000MT']")
	private WebElement CSM_DeductCharges_Maintainance_Passbook;

	public WebElement CSM_DeductCharges_Maintainance_Passbook() {
		return CSM_DeductCharges_Maintainance_Passbook;
	}

	@FindBy(xpath = "//label[@id='passBookDtlsForm_S000MT_Save_key']")
	private WebElement CSM_SaveBtn_Maintainance_Passbook;

	public WebElement CSM_SaveBtn_Maintainance_Passbook() {
		return CSM_SaveBtn_Maintainance_Passbook;
	}

	@FindBy(xpath = "//span[text()='Issue Passbooks']")
	private WebElement CSM_IssuePassbooks_Passbook;

	public WebElement CSM_IssuePassbooks_Passbook() {
		return CSM_IssuePassbooks_Passbook;
	}

	@FindBy(xpath = "//input[@id='passBookGridTbl_Id_S000IP_gs_passBookVO.ACC_GL']")
	private WebElement CSM_PassbookCode_IssuePassbooks;

	public WebElement CSM_PassbookCode_IssuePassbooks() {
		return CSM_PassbookCode_IssuePassbooks;
	}

	@FindBy(xpath = "//td[@id='td_passBookGridTbl_Id_S000IP_1_passBookVO.ACC_GL']")
	private WebElement CSM_DoubleClick_Code1_IssuePassbooks;

	public WebElement CSM_DoubleClick_Code1_IssuePassbooks() {
		return CSM_DoubleClick_Code1_IssuePassbooks;
	}

	@FindBy(xpath = "//label[@id='passBookDtlsForm_S000IP_Issue_Key']")
	private WebElement CSM_IssueBtn_IssuePassbooks_Passbook;

	public WebElement CSM_IssueBtn_IssuePassbooks_Passbook() {
		return CSM_IssueBtn_IssuePassbooks_Passbook;
	}

	@FindBy(xpath = "//td[text()='PassBook Stock']")
	private WebElement CSM_PassbookStock;

	public WebElement CSM_PassbookStock() {
		return CSM_PassbookStock;
	}

	@FindBy(xpath = "(//td[text()='Request From Provider'])[1]")
	private WebElement CSM_RequestFromProvider_PassbookStock;

	public WebElement CSM_RequestFromProvider_PassbookStock() {
		return CSM_RequestFromProvider_PassbookStock;
	}

	@FindBy(xpath = "(//td[text()='Request From Provider'])[2]")
	private WebElement CSM_RequestFromProvider_underRFP_PassbookStock;

	public WebElement CSM_RequestFromProvider_underRFP_PassbookStock() {
		return CSM_RequestFromProvider_underRFP_PassbookStock;
	}

	@FindBy(xpath = "//a[@id='STP0MT']")
	private WebElement CSM_Maintainance_RequestFromProvider;

	public WebElement CSM_Maintainance_RequestFromProvider() {
		return CSM_Maintainance_RequestFromProvider;
	}

	@FindBy(xpath = "//td[@id='add_passBookStockRequestDetailsGrid_Id_STP0MT']")
	private WebElement CSM_AddBtn_Maintainance_RequestFromProvider;

	public WebElement CSM_AddBtn_Maintainance_RequestFromProvider() {
		return CSM_AddBtn_Maintainance_RequestFromProvider;
	}

	@FindBy(xpath = "//input[@class='liveSearchText liveSearchCompSize ui-widget-content liveSearchInputCorner']")
	private WebElement CSM_Code_Maintainance_RequestFromProvider;

	public WebElement CSM_Code_Maintainance_RequestFromProvider() {
		return CSM_Code_Maintainance_RequestFromProvider;
	}

	@FindBy(xpath = "//input[@class='editable']")
	private WebElement CSM_RequestedQuantity_Maintainance_RequestFromProvider;

	public WebElement CSM_RequestedQuantity_Maintainance_RequestFromProvider() {
		return CSM_RequestedQuantity_Maintainance_RequestFromProvider;
	}

	@FindBy(xpath = "//label[@id='passBookStockRequestMaintFormId_STP0MT_Save_key']")
	private WebElement CSM_SaveBtn_Maintainance_RequestFromProvider;

	public WebElement CSM_SaveBtn_Maintainance_RequestFromProvider() {
		return CSM_SaveBtn_Maintainance_RequestFromProvider;
	}

	@FindBy(xpath = "//a[@id='STP0P']")
	private WebElement CSM_Approve_RequestFromProvider;

	public WebElement CSM_Approve_RequestFromProvider() {
		return CSM_Approve_RequestFromProvider;
	}

	@FindBy(xpath = "//select[@id='trsfr_type_P024MA']")
	private WebElement CSM_TransferType_UAA;

	public WebElement CSM_TransferType_UAA() {
		return CSM_TransferType_UAA;
	}

	@FindBy(xpath = "//select[@id='trsfr_type_P024MA']")
	private WebElement CSM_MainAccDebit_RadioBtn_UAA;

	public WebElement CSM_MainAccDebit_RadioBtn_UAA() {
		return CSM_MainAccDebit_RadioBtn_UAA;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Transaction_code_Transaction_Type;

	public WebElement Transaction_code_Transaction_Type() {
		return Transaction_code_Transaction_Type;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Code_Transaction_typer;

	public WebElement Code_Transaction_typer() {
		return Code_Transaction_typer;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement Doubleclick_withdraw_Transaction;

	public WebElement Doubleclick_withdraw_Transaction() {
		return Doubleclick_withdraw_Transaction;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement Double_Transaction_Approve_proceed;

	public WebElement Double_Transaction_Approve_proceed() {
		return Double_Transaction_Approve_proceed;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
	}

	@FindBy(xpath = "//input[@id='multi_trx_P024MA']")
	private WebElement CSM_MultipleTransfer_Checkbox__Param_606;

	public WebElement CSM_MultipleTransfer_Checkbox__Param_606() {
		return CSM_MultipleTransfer_Checkbox__Param_606;
	}

	@FindBy(xpath = "//input[@id='cr_dr_forex_P024MAD']")
	private WebElement CSM_MainAccDebit_RadioBtn_606;

	public WebElement CSM_MainAccDebit_RadioBtn_606() {
		return CSM_MainAccDebit_RadioBtn_606;
	}

	@FindBy(xpath = "//td[text()='PassBooks']")
	private WebElement CSM_Passbooks_Screen_606;

	public WebElement CSM_Passbooks_Screen_606() {
		return CSM_Passbooks_Screen_606;
	}

	@FindBy(xpath = "//a[@id='S000MT']")
	private WebElement CSM_Maintainance_Passbooks_606;

	public WebElement CSM_Maintainance_Passbooks_606() {
		return CSM_Maintainance_Passbooks_606;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_passbookType_S000MT']")
	private WebElement CSM_PassbookType_Maintainance_Passbook_606;

	public WebElement CSM_PassbookType_Maintainance_Passbook_606() {
		return CSM_PassbookType_Maintainance_Passbook_606;
	}

	@FindBy(xpath = "//input[@id='accCy_S000MT']")
	private WebElement CSM_CurrencyCode_Maintainance_Passbook_606;

	public WebElement CSM_CurrencyCode_Maintainance_Passbook_606() {
		return CSM_CurrencyCode_Maintainance_Passbook_606;
	}

	@FindBy(xpath = "//input[@id='accGl_S000MT']")
	private WebElement CSM_GLCode_Maintainance_Passbook_606;

	public WebElement CSM_GLCode_Maintainance_Passbook_606() {
		return CSM_GLCode_Maintainance_Passbook_606;
	}

	@FindBy(xpath = "//input[@id='accCif_S000MT']")
	private WebElement CSM_CIFNo_Maintainance_Passbook_606;

	public WebElement CSM_CIFNo_Maintainance_Passbook_606() {
		return CSM_CIFNo_Maintainance_Passbook_606;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_accSl_S000MT']")
	private WebElement CSM_SerialNo_Maintainance_Passbook_606;

	public WebElement CSM_SerialNo_Maintainance_Passbook_606() {
		return CSM_SerialNo_Maintainance_Passbook_606;
	}

	@FindBy(xpath = "//select[@id='deductCharges_S000MT']")
	private WebElement CSM_DeductCharges_Maintainance_Passbook_606;

	public WebElement CSM_DeductCharges_Maintainance_Passbook_606() {
		return CSM_DeductCharges_Maintainance_Passbook_606;
	}

	@FindBy(xpath = "//label[@id='passBookDtlsForm_S000MT_Save_key']")
	private WebElement CSM_SaveBtn_Maintainance_Passbook_606;

	public WebElement CSM_SaveBtn_Maintainance_Passbook_606() {
		return CSM_SaveBtn_Maintainance_Passbook_606;
	}

	@FindBy(xpath = "//span[text()='Issue Passbooks']")
	private WebElement CSM_IssuePassbooks_Passbook_606;

	public WebElement CSM_IssuePassbooks_Passbook_606() {
		return CSM_IssuePassbooks_Passbook_606;
	}

	@FindBy(xpath = "//input[@id='passBookGridTbl_Id_S000IP_gs_passBookVO.ACC_GL']")
	private WebElement CSM_PassbookCode_IssuePassbooks_606;

	public WebElement CSM_PassbookCode_IssuePassbooks_606() {
		return CSM_PassbookCode_IssuePassbooks_606;
	}

	@FindBy(xpath = "//td[@id='td_passBookGridTbl_Id_S000IP_1_passBookVO.ACC_GL']")
	private WebElement CSM_DoubleClick_Code1_IssuePassbooks_606;

	public WebElement CSM_DoubleClick_Code1_IssuePassbooks_606() {
		return CSM_DoubleClick_Code1_IssuePassbooks_606;
	}

	@FindBy(xpath = "//label[@id='passBookDtlsForm_S000IP_Issue_Key']")
	private WebElement CSM_IssueBtn_IssuePassbooks_Passbook_606;

	public WebElement CSM_IssueBtn_IssuePassbooks_Passbook_606() {
		return CSM_IssueBtn_IssuePassbooks_Passbook_606;
	}

	@FindBy(xpath = "//td[text()='PassBook Stock']")
	private WebElement CSM_PassbookStock_606;

	public WebElement CSM_PassbookStock_606() {
		return CSM_PassbookStock_606;
	}

	@FindBy(xpath = "(//td[text()='Request From Provider'])[1]")
	private WebElement CSM_RequestFromProvider_PassbookStock_606;

	public WebElement CSM_RequestFromProvider_PassbookStock_606() {
		return CSM_RequestFromProvider_PassbookStock_606;
	}

	@FindBy(xpath = "(//td[text()='Request From Provider'])[2]")
	private WebElement CSM_RequestFromProvider_underRFP_PassbookStock_606;

	public WebElement CSM_RequestFromProvider_underRFP_PassbookStock_606() {
		return CSM_RequestFromProvider_underRFP_PassbookStock_606;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement CSMParam_TransactionType_AllowInternalGL_UPAButton;

	public WebElement CSMParam_TransactionType_AllowInternalGL_UPAButton() {
		return CSMParam_TransactionType_AllowInternalGL_UPAButton;
	}

	@FindBy(xpath = "//a[@id='S000UP']")
	private WebElement CSM_UpdatePassbookScreen_Passbook;

	public WebElement CSM_UpdatePassbookScreen_Passbook() {
		return CSM_UpdatePassbookScreen_Passbook;
	}

	@FindBy(xpath = "//input[@id='passBookGridTbl_Id_S000UP_gs_passBookVO.CODE']")
	private WebElement CSM_PassbookCode_under_UpdatePassbookScreen;

	public WebElement CSM_PassbookCode_under_UpdatePassbookScreen() {
		return CSM_PassbookCode_under_UpdatePassbookScreen;
	}

	@FindBy(xpath = "//td[@id='td_passBookGridTbl_Id_S000UP_1_passBookVO.CODE']")
	private WebElement CSM_DoubleClkPassbookCode_under_UpdatePassbookScreen;

	public WebElement CSM_DoubleClkPassbookCode_under_UpdatePassbookScreen() {
		return CSM_DoubleClkPassbookCode_under_UpdatePassbookScreen;
	}

	@FindBy(xpath = "//div[@id='passBookToolBar_S000UP']")
	private WebElement CSM_UpdateBtn_under_UpdatePassbookScreen;

	public WebElement CSM_UpdateBtn_under_UpdatePassbookScreen() {
		return CSM_UpdateBtn_under_UpdatePassbookScreen;
	}

	@FindBy(xpath = "//span[text()='Main Details']")
	private WebElement CSM_MainDetails_TransactionType_606;

	public WebElement CSM_MainDetails_TransactionType_606() {
		return CSM_MainDetails_TransactionType_606;
	}

	@FindBy(xpath = "//a[@id='b_filer_nonfiler_cy_P024MA']")
	private WebElement CSM_FilterAndNonFilter_TransactionType_606;

	public WebElement CSM_FilterAndNonFilter_TransactionType_606() {
		return CSM_FilterAndNonFilter_TransactionType_606;
	}

	@FindBy(xpath = "//td[@id='add_tab14_GridTbl_Id_P024MA']")
	private WebElement CSM_AddBtn_FilterAndNonFilter_TransactionType_606;

	public WebElement CSM_AddBtn_FilterAndNonFilter_TransactionType_606() {
		return CSM_AddBtn_FilterAndNonFilter_TransactionType_606;
	}

	@FindBy(xpath = "//input[@class='liveSearchText liveSearchCompSize ui-widget-content liveSearchInputCorner']")
	private WebElement CSM_CurrencyCode_FilterAndNonFilter_TransactionType_606;

	public WebElement CSM_CurrencyCode_FilterAndNonFilter_TransactionType_606() {
		return CSM_CurrencyCode_FilterAndNonFilter_TransactionType_606;
	}

	@FindBy(xpath = "//select[@class='editable']")
	private WebElement CSM_Workspace_FilterAndNonFilter_TransactionType_606;

	public WebElement CSM_Workspace_FilterAndNonFilter_TransactionType_606() {
		return CSM_Workspace_FilterAndNonFilter_TransactionType_606;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement CSM_OkBtn_FilterAndNonFilter_TransactionType_606;

	public WebElement CSM_OkBtn_FilterAndNonFilter_TransactionType_606() {
		return CSM_OkBtn_FilterAndNonFilter_TransactionType_606;
	}

	@FindBy(xpath = "//a[@id='S000CN']")
	private WebElement CSM_CloseScreen_under_PassbookScreen;

	public WebElement CSM_CloseScreen_under_PassbookScreen() {
		return CSM_CloseScreen_under_PassbookScreen;
	}

	@FindBy(xpath = "//td[@id='td_passBookGridTbl_Id_S000CN_1_passBookVO.CODE']")
	private WebElement CSM_DoubleClkPassbookCode_CloseScreen;

	public WebElement CSM_DoubleClkPassbookCode_CloseScreen() {
		return CSM_DoubleClkPassbookCode_CloseScreen;
	}

	@FindBy(xpath = "//input[@id='passBookGridTbl_Id_S000CN_gs_passBookVO.CODE']")
	private WebElement CSM_PassbookCode_CloseScreen;

	public WebElement CSM_PassbookCode_CloseScreen() {
		return CSM_PassbookCode_CloseScreen;
	}

	@FindBy(xpath = "//label[@id='passBookDtlsForm_S000CN_Close_key']")
	private WebElement CSM_CloseBtn_CloseScreen;

	public WebElement CSM_CloseBtn_CloseScreen() {
		return CSM_CloseBtn_CloseScreen;
	}

	@FindBy(xpath = "//label[@id='passBookStockRequestMaintFormId_STP0P_Approve_key']")
	private WebElement CSM_ApproveBtn_RequestFromProvider;

	public WebElement CSM_ApproveBtn_RequestFromProvider() {
		return CSM_ApproveBtn_RequestFromProvider;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement CSMParam_TransactionType_UPA;

	public WebElement CSMParam_TransactionType_UPA() {
		return CSMParam_TransactionType_UPA;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParam_ParameterMainModule;

	public WebElement csmParamParameterMainModule() {
		return csmParam_ParameterMainModule;
	}

	@FindBy(xpath = "//td[text()='System Parameters']//parent::td")
	private WebElement csmParam_Systemparameter;

	public WebElement csmParam_Systemparameter() {
		return csmParam_Systemparameter;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement csmParam_Transactiontype;

	public WebElement csmParam_Transactiontype() {
		return csmParam_Transactiontype;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton;

	public WebElement CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton() {
		return CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton;
	}

	@FindBy(xpath = "(//td[text()='55']//following::td[text()='Transfer intra'])[1]")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClickforTRS;

	public WebElement CSMParam_TransactionType_Approve_code_doubleClickforTRS() {
		return CSMParam_TransactionType_Approve_code_doubleClickforTRS;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSMCore_Transactions;

	public WebElement CSMCore_Transactions() {
		return CSMCore_Transactions;
	}

	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement CSMCore_Transactions_Maintenance;

	public WebElement CSMCore_Transactions_Maintenance() {
		return CSMCore_Transactions_Maintenance;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']/ancestor::a/following-sibling::ul//span[text()='Approve']")
	private WebElement CSMParam_TransactionType_Approve;

	public WebElement CSMParam_TransactionType_Approve() {
		return CSMParam_TransactionType_Approve;
	}

	@FindBy(xpath = "//a[@id='STP0MT']")
	private WebElement CSM_Maintainance_RequestFromProvider_606;

	public WebElement CSM_Maintainance_RequestFromProvider_606() {
		return CSM_Maintainance_RequestFromProvider_606;
	}

	@FindBy(xpath = "//td[@id='add_passBookStockRequestDetailsGrid_Id_STP0MT']")
	private WebElement CSM_AddBtn_Maintainance_RequestFromProvider_606;

	public WebElement CSM_AddBtn_Maintainance_RequestFromProvider_606() {
		return CSM_AddBtn_Maintainance_RequestFromProvider_606;
	}// td[@id='td_passBookStockRequestDetailsGrid_Id_STP0MT_1_rn']

	@FindBy(xpath = "//td[@id='td_passBookStockRequestDetailsGrid_Id_STP0MT_1_rn']")
	private WebElement CSM_clickToView_AddBtn_Maintainance_RequestFromProvider_606;

	public WebElement CSM_clickToView_AddBtn_Maintainance_RequestFromProvider_606() {
		return CSM_clickToView_AddBtn_Maintainance_RequestFromProvider_606;
	}

	@FindBy(xpath = "//input[@class='liveSearchText liveSearchCompSize ui-widget-content liveSearchInputCorner']")
	private WebElement CSM_Code_Maintainance_RequestFromProvider_606;

	public WebElement CSM_Code_Maintainance_RequestFromProvider_606() {
		return CSM_Code_Maintainance_RequestFromProvider_606;
	}

	@FindBy(xpath = "//input[@class='editable']")
	private WebElement CSM_RequestedQuantity_Maintainance_RequestFromProvider_606;

	public WebElement CSM_RequestedQuantity_Maintainance_RequestFromProvider_606() {
		return CSM_RequestedQuantity_Maintainance_RequestFromProvider_606;
	}

	@FindBy(xpath = "//label[@id='passBookStockRequestMaintFormId_STP0MT_Save_key']")
	private WebElement CSM_SaveBtn_Maintainance_RequestFromProvider_606;

	public WebElement CSM_SaveBtn_Maintainance_RequestFromProvider_606() {
		return CSM_SaveBtn_Maintainance_RequestFromProvider_606;
	}

	@FindBy(xpath = "//a[@id='STP0P']")
	private WebElement CSM_Approve_RequestFromProvider_606;

	public WebElement CSM_Approve_RequestFromProvider_606() {
		return CSM_Approve_RequestFromProvider_606;
	}

	@FindBy(xpath = "//select[@id='trsfr_type_P024MA']")
	private WebElement CSM_TransferType_UAA_606;

	public WebElement CSM_TransferType_UAA_606() {
		return CSM_TransferType_UAA_606;
	}

	@FindBy(xpath = "//select[@id='trsfr_type_P024MA']")
	private WebElement CSM_MainAccDebit_RadioBtn_UAA_606;

	public WebElement CSM_MainAccDebit_RadioBtn_UAA_606() {
		return CSM_MainAccDebit_RadioBtn_UAA_606;
	}

	@FindBy(xpath = "//td[@id='td_passBookStockRequestListGridTbl_Id_STP0P_1_ctsPassBookRequestVO.BATCH_NO']")
	private WebElement CSM_DoubleClick_BatchNo_RequestFromProvider_606;

	public WebElement CSM_DoubleClick_BatchNo_RequestFromProvider_606() {
		return CSM_DoubleClick_BatchNo_RequestFromProvider_606;
	}

	@FindBy(xpath = "//label[@id='passBookStockRequestMaintFormId_STP0P_Approve_key']")
	private WebElement CSM_ApproveBtn_RequestFromProvider_606;

	public WebElement CSM_ApproveBtn_RequestFromProvider_606() {
		return CSM_ApproveBtn_RequestFromProvider_606;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_TRXType;

	public WebElement CSMCore_Transactions_Maintenance_TRXType() {
		return CSMCore_Transactions_Maintenance_TRXType;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement CSMCore_Transactions_Maintenance_BranchCode;

	public WebElement CSMCore_Transactions_Maintenance_BranchCode() {
		return CSMCore_Transactions_Maintenance_BranchCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_CurrencyCode;

	public WebElement CSMCore_Transactions_Maintenance_CurrencyCode() {
		return CSMCore_Transactions_Maintenance_CurrencyCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_GLCode;

	public WebElement CSMCore_Transactions_Maintenance_GLCode() {
		return CSMCore_Transactions_Maintenance_GLCode;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CSMCore_Transactions_Maintenance_CIFCode;

	public WebElement CSMCore_Transactions_Maintenance_CIFCode() {
		return CSMCore_Transactions_Maintenance_CIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_SerialNo;

	public WebElement CSMCore_Transactions_Maintenance_SerialNo() {
		return CSMCore_Transactions_Maintenance_SerialNo;
	}

	//
	//
	//
	//
//		@FindBy(xpath="//span[text()='Main Details']")
//		private WebElement CSM_MainDetails_TransactionType_606;
//		public WebElement CSM_MainDetails_TransactionType_606() {
//			return CSM_MainDetails_TransactionType_606;
//		}
//		@FindBy(xpath="//a[@id='b_filer_nonfiler_cy_P024MA']")
//		private WebElement CSM_FilterAndNonFilter_TransactionType_606;
//		public WebElement CSM_FilterAndNonFilter_TransactionType_606() {
//			return CSM_FilterAndNonFilter_TransactionType_606;
//		}
//		@FindBy(xpath="//td[@id='add_tab14_GridTbl_Id_P024MA']")
//		private WebElement CSM_AddBtn_FilterAndNonFilter_TransactionType_606;
//		public WebElement CSM_AddBtn_FilterAndNonFilter_TransactionType_606() {
//			return CSM_AddBtn_FilterAndNonFilter_TransactionType_606;
//		}
//		@FindBy(xpath="//input[@class='liveSearchText liveSearchCompSize ui-widget-content liveSearchInputCorner']")
//		private WebElement CSM_CurrencyCode_FilterAndNonFilter_TransactionType_606;
//		public WebElement CSM_CurrencyCode_FilterAndNonFilter_TransactionType_606() {
//			return CSM_CurrencyCode_FilterAndNonFilter_TransactionType_606;
//		}
//		@FindBy(xpath="//select[@class='editable']")
//		private WebElement CSM_Workspace_FilterAndNonFilter_TransactionType_606;
//		public WebElement CSM_Workspace_FilterAndNonFilter_TransactionType_606() {
//			return CSM_Workspace_FilterAndNonFilter_TransactionType_606;
//		}
//		@FindBy(xpath="//span[text()='Ok']")
//		private WebElement CSM_OkBtn_FilterAndNonFilter_TransactionType_606;
//		public WebElement CSM_OkBtn_FilterAndNonFilter_TransactionType_606() {
//			return CSM_OkBtn_FilterAndNonFilter_TransactionType_606;
//		}
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']//input")
	private WebElement Transaction_maintenance_AccountdetailsButton_Branchcode;

	public WebElement Transaction_maintenance_AccountdetailsButton_Branchcode() {
		return Transaction_maintenance_AccountdetailsButton_Branchcode;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']//input")
	private WebElement Transaction_maintenance_AccountdetailsButton_GLcode;

	public WebElement Transaction_maintenance_AccountdetailsButton_GLcode() {
		return Transaction_maintenance_AccountdetailsButton_GLcode;
	}

	@FindBy(xpath = " //td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF']//input")
	private WebElement Transaction_maintenance_AccountdetailsButton_CIFcode;

	public WebElement Transaction_maintenance_AccountdetailsButton_CIFcode() {
		return Transaction_maintenance_AccountdetailsButton_CIFcode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL']")
	private WebElement Transaction_maintenance_AccountdetailsButton_SLcode;

	public WebElement Transaction_maintenance_AccountdetailsButton_SLcode() {
		return Transaction_maintenance_AccountdetailsButton_SLcode;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.FC_AMOUNT']//input")
	private WebElement Transaction_maintenance_AccountdetailsButton_Amount;

	public WebElement Transaction_maintenance_AccountdetailsButton_Amount() {
		return Transaction_maintenance_AccountdetailsButton_Amount;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber;

	public WebElement getTransactionNumber() {
		return getTransactionNumber;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code;

	public WebElement CSMParam_TransactionType_UPA_code() {
		return CSMParam_TransactionType_UPA_code;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code_doubleClick;

	public WebElement CSMParam_TransactionType_UPA_code_doubleClick() {
		return CSMParam_TransactionType_UPA_code_doubleClick;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code;

	public WebElement CSMParam_TransactionType_Approve_code() {
		return CSMParam_TransactionType_Approve_code;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClick;

	public WebElement CSMParam_TransactionType_Approve_code_doubleClick() {
		return CSMParam_TransactionType_Approve_code_doubleClick;
	}

	@FindBy(xpath = "(//td[text()='55']//following::td[text()='Transfer intra'])[1]")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClickforTRS_064;

	public WebElement CSMParam_TransactionType_Approve_code_doubleClickforTRS_064() {
		return CSMParam_TransactionType_Approve_code_doubleClickforTRS_064;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_EnterAmount;

	public WebElement Transactions_EnterAmount() {
		return Transactions_EnterAmount;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn;

	public WebElement Transactions_Warning_okbtn() {
		return Transactions_Warning_okbtn;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement Transactions_savebtn;

	public WebElement Transactions_savebtn() {
		return Transactions_savebtn;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered;

	public WebElement checkIfValueIsEntered() {
		return checkIfValueIsEntered;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValues;

	public WebElement Transactions_transactionNo_codeValues()

	{
		return Transactions_transactionNo_codeValues;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']")
	private WebElement Transaction_maintenance_AccountdetailsButton_plusicon_tableclick;

	public WebElement TransactionmaintenanceAccountdetailsButtonplusicontableclick() {
		return Transaction_maintenance_AccountdetailsButton_plusicon_tableclick;
	}

	@FindBy(xpath = "(//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_rn'])[2]")
	private WebElement Transaction_maintenance_AccountdetailsButton_plusicon_tableclick_no2;

	public WebElement TransactionmaintenanceAccountdetailsButtonplusicontableclickno2() {
		return Transaction_maintenance_AccountdetailsButton_plusicon_tableclick_no2;
	}

	@FindBy(xpath = "//label[text()='Account Details ']//parent::span//parent::button")
	private WebElement Transaction_maintenance_AccountdetailsButton;

	public WebElement TransactionmaintenanceAccountdetailsButton() {
		return Transaction_maintenance_AccountdetailsButton;
	}

	@FindBy(xpath = "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement Transaction_maintenance_AccountdetailsButton_plusicon;

	public WebElement TransactionmaintenanceAccountdetailsButtonplusicon() {
		return Transaction_maintenance_AccountdetailsButton_plusicon;
	}

	@FindBy(xpath = "//td[text()='KARTHIK']")
	private WebElement Transaction_maintanance_alertclickingUserId;

	public WebElement Transaction_maintanance_alertclickingUserId() {
		return Transaction_maintanance_alertclickingUserId;
	}

	@FindBy(xpath = "//span[text()=' Send ']//parent::a")
	private WebElement Transaction_maintanance_alertclickingUserId_SendBtn;

	public WebElement Transaction_maintanance_alertclickingUserId_SendBtn() {
		return Transaction_maintanance_alertclickingUserId_SendBtn;
	}

	@FindBy(xpath = "//span[text()='ok']//parent::button")
	private WebElement Transaction_maintenance_AccountdetailsButton_OKbutton;

	public WebElement Transaction_maintenance_AccountdetailsButton_OKbutton() {
		return Transaction_maintenance_AccountdetailsButton_OKbutton;
	}

	@FindBy(id = "trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen;

	public WebElement CSMSaveButtonInMaintenanceScreen() {
		return CSM_SaveButtonInMaintenanceScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation() {
		return CSM_OkButtonInSuccessPopUpMenuForTranscation;
	}

	@FindBy(id = "passBookStockRequestListGridTbl_Id_STP0P_gs_ctsPassBookRequestVO.BATCH_NO")
	private WebElement CSM_Passbook_Stock_RequestFromProvider_Approve_Screen_Batch_No_Input_606;

	public WebElement CSM_Passbook_Stock_RequestFromProvider_Approve_Screen_Batch_No_Input_606() {
		return CSM_Passbook_Stock_RequestFromProvider_Approve_Screen_Batch_No_Input_606;
	}

	@FindBy(xpath = "//div[contains(text(),'batch number')]")
	private WebElement CSM_Passbook_Stock_RequestFromProvider_Maintenance_Info_Popup_Batch_No;

	public WebElement CSM_Passbook_Stock_RequestFromProvider_Maintenance_Info_Popup_Batch_No() {
		return CSM_Passbook_Stock_RequestFromProvider_Maintenance_Info_Popup_Batch_No;
	}

	@FindBy(xpath = "(//span[text()='Charges'])")
	private WebElement CSM_Charges_Maintainance_Passbook_606;

	public WebElement CSM_Charges_Maintainance_Passbook_606() {
		return CSM_Charges_Maintainance_Passbook_606;
	}

}
