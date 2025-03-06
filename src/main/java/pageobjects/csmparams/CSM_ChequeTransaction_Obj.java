package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_ChequeTransaction_Obj {
	WebDriver driver;

	public CSM_ChequeTransaction_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_inputfield;

	public WebElement csmParam_Transactiontype_inputfield() {
		return csmParam_Transactiontype_inputfield;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_inputfield_doubleclick;

	public WebElement csmParam_Transactiontype_inputfield_doubleclick() {
		return csmParam_Transactiontype_inputfield_doubleclick;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn_606;

	public WebElement Transactions_Warning_okbtn_606() {
		return Transactions_Warning_okbtn_606;
	}

	// CHTR_P2_010

	@FindBy(xpath = "//input[@id='backdated_chq_P024MA']")
	private WebElement CSMParam_TransactionType_AllowtoProceed_Backdate;

	public WebElement CSMParam_TransactionType_AllowtoProceed_Backdate() {
		return CSMParam_TransactionType_AllowtoProceed_Backdate;
	}

	@FindBy(xpath = "//input[@id='allow_proceed_pdc_P024MA']")
	private WebElement CSMParam_TransactionType_AllowToProceedPostDate;

	public WebElement CSMParam_TransactionType_AllowToProceedPostDate() {
		return CSMParam_TransactionType_AllowToProceedPostDate;
	}

	@FindBy(xpath = "//div[contains(text(),' Cheque Date is Post Dated.')]")
	private WebElement CSM_Transaction_maintanance_ValidateChequePostDate;

	public WebElement CSM_Transaction_maintanance_ValidateChequePostDate() {
		return CSM_Transaction_maintanance_ValidateChequePostDate;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CARD_NO_D001MT']")
	private WebElement csm_Transactions_Maintenace_CardCode;

	public WebElement csm_Transactions_Maintenace_CardCode() {
		return csm_Transactions_Maintenace_CardCode;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid /Missing Cheque Code')]")
	private WebElement CSM_Transaction_maintanance_Validate_InvalidMissingChequeCode;

	public WebElement CSM_Transaction_maintanance_Validate_InvalidMissingChequeCode() {
		return CSM_Transaction_maintanance_Validate_InvalidMissingChequeCode;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit() {
		return CSMCore_Transactions_Maintenance_BranchCodeForCredit;
	}

	@FindBy(xpath = "//select[@name='transactiontypesCO.ctstrxtypeVO.CHQ_RELATED']")
	private WebElement CSMparam_TransactionType_ChequeInfo_HouseCheque;

	public WebElement CSMparam_TransactionType_ChequeInfo_HouseCheque() {
		return CSMparam_TransactionType_ChequeInfo_HouseCheque;
	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode;
	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode;
	}
	// CHTR_P2_191

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber;

	public WebElement getTransactionNumber() {
		return getTransactionNumber;
	}

	@FindBy(xpath = "//span[text()='Apply to Void Inward Cheques']")
	private WebElement Transactions_ApplyToVoidInwardCheques_Field;

	public WebElement Transactions_ApplyToVoidInwardCheques_Field() {
		return Transactions_ApplyToVoidInwardCheques_Field;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VIL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo;

	public WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo() {
		return Transactions_ApplyToVoidInwardCheques_Field_TransactionNo;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001VIL']")
	private WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick;

	public WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick() {
		return Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001VIL']")
	private WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick_VoidReason;

	public WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick_VoidReason() {
		return Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick_VoidReason;
	}

	@FindBy(xpath = "//span[contains(text(),'Apply to void inward Cheque')]//parent::button")
	private WebElement Transactions_ApplyToVoidInwardCheques_Button;

	public WebElement Transactions_ApplyToVoidInwardCheques_Button() {
		return Transactions_ApplyToVoidInwardCheques_Button;
	}

	@FindBy(xpath = "//span[text()='Voiding  Inward Cheques']")
	private WebElement Transactions_VoidingInwardCheque_Field;

	public WebElement Transactions_VoidingInwardCheque_Field() {
		return Transactions_VoidingInwardCheque_Field;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001OD_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_VoidingInwardCheque_Field_TransactionNo;

	public WebElement Transactions_VoidingInwardCheque_Field_TransactionNo() {
		return Transactions_VoidingInwardCheque_Field_TransactionNo;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001OD']")
	private WebElement Transactions_VoidingInwardCheque_Field_TransactionNo_DoubleClick;

	public WebElement Transactions_VoidingInwardCheque_Field_TransactionNo_DoubleClick() {
		return Transactions_VoidingInwardCheque_Field_TransactionNo_DoubleClick;
	}

	@FindBy(xpath = "//span[contains(text(),' Voiding Inward Cheques ')]//parent::button")
	private WebElement Transactions_VoidingInwardCheque_Button;

	public WebElement Transactions_VoidingInwardCheque_Button() {
		return Transactions_VoidingInwardCheque_Button;
	}

	@FindBy(xpath = "//td[text()='Void']")
	private WebElement Transactions_maintenance_StatusVOID;

	public WebElement Transactions_maintenance_StatusVOID() {
		return Transactions_maintenance_StatusVOID;
	}

//	@FindBy(xpath = "//*[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
//	private WebElement csmParam_Transactiontype_inputfield;
//
//	public WebElement csmParam_Transactiontype_inputfield() {
//		return csmParam_Transactiontype_inputfield;
//	}

	@FindBy(xpath = "//td[@id='td_tab31_GridTbl_Id_P024MA_1_ctstrxtypeStatusVO.AND_OR']//select")

	private WebElement transactionTypeStatus_ANDORDropdown;

	public WebElement transactionTypeStatusANDORDropdown()

	{

		return transactionTypeStatus_ANDORDropdown;

	}

	@FindBy(xpath = "//td[@tdlabel='Priority']//input")
	private WebElement transactionTypeStatus_PriorityInput;

	public WebElement transactionTypeStatusPriorityInput() {
		return transactionTypeStatus_PriorityInput;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeStatusVO.STATUS_CODE']")
	private WebElement transactionTypeStatus_StatusCodeInput;

	public WebElement transactionTypeStatusStatusCodeInput() {
		return transactionTypeStatus_StatusCodeInput;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeStatusVO.USER_LEVEL']")
	private WebElement transactionTypeStatus_UserLevelInput;

	public WebElement transactionTypeStatusUserLevelInput() {
		return transactionTypeStatus_UserLevelInput;
	}

	/// *** Vijay ***///
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Ok_609;

	public WebElement CSM_Ok_609() {
		return CSM_Ok_609;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_closeSymbol_609;

	public WebElement CSMCore_closeSymbol_609() {
		return CSMCore_closeSymbol_609;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate_609;

	public WebElement CSM_DateToChangeTheCurrentDate_609() {
		return CSM_DateToChangeTheCurrentDate_609;
	}

	@FindBy(xpath = "//span[text()='Alerts']")
	private WebElement Alerts_609;

	public WebElement Alerts_609() {
		return Alerts_609;
	}

	@FindBy(xpath = "//input[@id='dateTime_RCVALERT']")
	private WebElement Alerts_SnoozeTime_609;

	public WebElement Alerts_SnoozeTime_609() {
		return Alerts_SnoozeTime_609;
	}

	@FindBy(xpath = "//span[contains(text(),' Snooze ')]")
	private WebElement Alerts_SnoozeBtn_609;

	public WebElement Alerts_SnoozeBtn_609() {
		return Alerts_SnoozeBtn_609;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate_609;

	public WebElement CSM_DateInUserRunningDate_609() {
		return CSM_DateInUserRunningDate_609;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate_609;

	public WebElement CSM_UseButtonInChangeRunningDate_609() {
		return CSM_UseButtonInChangeRunningDate_609;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_609;

	public WebElement CSM_OkButtonInAccessDeniedPopUpMenu_609() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_609;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_609;

	public WebElement CSM_CloseButtonInChangeRunningDate_609() {
		return CSM_CloseButtonInChangeRunningDate_609;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Parameters_609;

	public WebElement Parameters_609() {
		return Parameters_609;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement Parameters_SystemParameters_609;

	public WebElement Parameters_SystemParameters_609() {
		return Parameters_SystemParameters_609;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement Parameters_SystemParameters_ControlRecord_609;

	public WebElement Parameters_SystemParameters_ControlRecord_609() {
		return Parameters_SystemParameters_ControlRecord_609;
	}

	@FindBy(xpath = "//a[@id='O001UP']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_NoClearingEntries_609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_NoClearingEntries_609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_NoClearingEntries_609;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn609;
	}

	@FindBy(xpath = "//a[@id='O001P']")
	private WebElement Parameters_SystemParameters_ControlRecord_Approve_609;

	public WebElement Parameters_SystemParameters_ControlRecord_Approve_609() {
		return Parameters_SystemParameters_ControlRecord_Approve_609;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609;

	public WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609() {
		return Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609;
	}

	@FindBy(xpath = "//a[@id='P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//div[@ID='panel_5_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeInfo;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeInfo() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeInfo;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609;
	}

	@FindBy(xpath = "//input[@id='default_chq_date_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultChequeDate;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultChequeDate() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultChequeDate;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_so_chrg_schema_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_609;
	}

	@FindBy(xpath = "//input[@id='auto_approve_within_limit_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_609;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='P024P']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_609;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_609() {
		return Parameters_SystemParameters_TransactionType_Approve_609;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions_609;

	public WebElement Transactions_609() {
		return Transactions_609;
	}

	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement Transactions_Maintenance_609;

	public WebElement Transactions_Maintenance_609() {
		return Transactions_Maintenance_609;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']/span")
	private WebElement Transactions_Maintenance_TrxTypeSearch_609;

	public WebElement Transactions_Maintenance_TrxTypeSearch_609() {
		return Transactions_Maintenance_TrxTypeSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_trx_type_D001MT_gs_CODE']")
	private WebElement Transactions_Maintenance_TrxTypeCode_609;

	public WebElement Transactions_Maintenance_TrxTypeCode_609() {
		return Transactions_Maintenance_TrxTypeCode_609;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Card_No_key']")
	private WebElement Transactions_Maintenance_CardNo_609;

	public WebElement Transactions_Maintenance_CardNo_609() {
		return Transactions_Maintenance_CardNo_609;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement Transactions_Maintenance_SaveBtn_609;

	public WebElement Transactions_Maintenance_SaveBtn_609() {
		return Transactions_Maintenance_SaveBtn_609;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_609;

	public WebElement getTransactionNumber_609() {
		return getTransactionNumber_609;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement Transactions_Approve_ApproveBtn_609;

	public WebElement Transactions_Approve_ApproveBtn_609() {
		return Transactions_Approve_ApproveBtn_609;
	}

	@FindBy(xpath = "//span[text()='Apply to Clear Inward Cheques']")
	private WebElement Transactions_ApplyClearInwardCheques_609;

	public WebElement Transactions_ApplyClearInwardCheques_609() {
		return Transactions_ApplyClearInwardCheques_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001AC']//td[text()='9810']

	@FindBy(xpath = "//span[contains(text(),' Apply Clearing Inward Cheque ')]")
	private WebElement Transactions_ClearingInwardCheques_ApplyBtn_609;

	public WebElement Transactions_ClearingInwardCheques_ApplyBtn_609() {
		return Transactions_ClearingInwardCheques_ApplyBtn_609;
	}

	@FindBy(xpath = "//span[text()='Clearing Inward Cheques']")
	private WebElement Transactions_ClearingInwardCheques_609;

	public WebElement Transactions_ClearingInwardCheques_609() {
		return Transactions_ClearingInwardCheques_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001E_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ClearingInwardCheques_Code_609;

	public WebElement Transactions_ClearingInwardCheques_Code_609() {
		return Transactions_ClearingInwardCheques_Code_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001E']//td[text()='9810']

	@FindBy(xpath = "//span[contains(text(),' Clear Inward Cheque ')]")
	private WebElement Transactions_ClearingInwardCheques_ClearBtn_609;

	public WebElement Transactions_ClearingInwardCheques_ClearBtn_609() {
		return Transactions_ClearingInwardCheques_ClearBtn_609;
	}

	@FindBy(xpath = "//a[@id='D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_609() {
		return Transactions_MultiChequeEntry_Maintenance_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_TrxType_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_TrxType_609() {
		return Transactions_MultiChequeEntry_Maintenance_TrxType_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitBranchCode_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitBranchCode_609() {
		return Transactions_MultiChequeEntry_Maintenance_DebitBranchCode_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitCurrencyCode_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitCurrencyCode_609() {
		return Transactions_MultiChequeEntry_Maintenance_DebitCurrencyCode_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitGlCode_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitGlCode_609() {
		return Transactions_MultiChequeEntry_Maintenance_DebitGlCode_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitCifCode_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitCifCode_609() {
		return Transactions_MultiChequeEntry_Maintenance_DebitCifCode_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitSerialNo_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitSerialNo_609() {
		return Transactions_MultiChequeEntry_Maintenance_DebitSerialNo_609;
	}

	@FindBy(xpath = "//td[@id='add_mutliChequesEntryGridTbl_Id_D001CEMT']//span")
	private WebElement Transactions_MultiChequeEntry_Maintenance_ChequeAddicon_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_ChequeAddicon_609() {
		return Transactions_MultiChequeEntry_Maintenance_ChequeAddicon_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_Currency_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_Currency_609() {
		return Transactions_MultiChequeEntry_Maintenance_Currency_609;
	}

	@FindBy(xpath = "//input[@id='amount_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_Amount_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_Amount_609() {
		return Transactions_MultiChequeEntry_Maintenance_Amount_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditBranchCode_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditBranchCode_609() {
		return Transactions_MultiChequeEntry_Maintenance_CreditBranchCode_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditCurrencyCode_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditCurrencyCode_609() {
		return Transactions_MultiChequeEntry_Maintenance_CreditCurrencyCode_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditGlCode_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditGlCode_609() {
		return Transactions_MultiChequeEntry_Maintenance_CreditGlCode_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditCifCode_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditCifCode_609() {
		return Transactions_MultiChequeEntry_Maintenance_CreditCifCode_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditSerialNo_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditSerialNo_609() {
		return Transactions_MultiChequeEntry_Maintenance_CreditSerialNo_609;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_ChequeNo_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_ChequeNo_609() {
		return Transactions_MultiChequeEntry_Maintenance_ChequeNo_609;
	}

	@FindBy(xpath = "(//span[contains(text(),' Save ')])[1]")
	private WebElement Transactions_MultiChequeEntry_Maintenance_SaveBtn_609;

	public WebElement Transactions_MultiChequeEntry_Maintenance_SaveBtn_609() {
		return Transactions_MultiChequeEntry_Maintenance_SaveBtn_609;
	}

	@FindBy(xpath = "//span[text()=' Send ']//parent::a")
	private WebElement Transaction_maintanance_alertclickingUserId_SendBtn_609;

	public WebElement Transaction_maintanance_alertclickingUserId_SendBtn_609() {
		return Transaction_maintanance_alertclickingUserId_SendBtn_609;
	}

	@FindBy(xpath = "//input[@id='amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount_609;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount_609() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_Amount_609;
	}

	@FindBy(xpath = "//input[@id='input_amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount_609;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount_609() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount_609;
	}

	@FindBy(xpath = "//textarea[@name='trxMgntCO.statusReason']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectReason;

	public WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectReason() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectReason;
	}

	@FindBy(xpath = "//label[@id='Reject_Key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectKey;

	public WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectKey() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectKey;
	}

	@FindBy(xpath = "//td[text()='Charges']")
	private WebElement Parameters_SystemParameters_Charges_609;

	public WebElement Parameters_SystemParameters_Charges_609() {
		return Parameters_SystemParameters_Charges_609;
	}

	@FindBy(xpath = "//td[text()='Maintenance of Charges']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_609;
	}

	@FindBy(xpath = "//a[@id='C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='allow_modify_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_609;
	}

	@FindBy(xpath = "//div[@id='panel_4_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_MainDetails;

	public WebElement Parameters_SystemParameters_TransactionType_MainDetails() {
		return Parameters_SystemParameters_TransactionType_MainDetails;
	}

	@FindBy(xpath = "//input[@id='auto_approve_within_limit_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits;
	}

	@FindBy(xpath = "//a[@id='C0011P']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_609;
	}

	@FindBy(xpath = "//label[@id='reasonsMaint_FormId_P0032MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//span[text()='Apply to Void Inward Cheques']")
	private WebElement Transactions_ApplyVoidInwardCheques_609;

	public WebElement Transactions_ApplyVoidInwardCheques_609() {
		return Transactions_ApplyVoidInwardCheques_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VIL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApplyVoidInwardCheques_Code_609;

	public WebElement Transactions_ApplyVoidInwardCheques_Code_609() {
		return Transactions_ApplyVoidInwardCheques_Code_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001VIL']//td[text()='10095']

	@FindBy(xpath = "//select[@id='holdReason_D001VIL']")
	private WebElement Transactions_ApplyVoidInwardCheques_VoidReason_609;

	public WebElement Transactions_ApplyVoidInwardCheques_VoidReason_609() {
		return Transactions_ApplyVoidInwardCheques_VoidReason_609;
	}
	// VOID

	@FindBy(xpath = "//span[contains(text(),' Apply to void inward Cheque ')]")
	private WebElement Transactions_VoidingInwardCheques_ApplyVoidBtn_609;

	public WebElement Transactions_VoidingInwardCheques_ApplyVoidBtn_609() {
		return Transactions_VoidingInwardCheques_ApplyVoidBtn_609;
	}

	@FindBy(xpath = "//span[contains(text(),'Voiding  Inward Cheques')]")
	private WebElement Transactions_VoidingInwardCheques_609;

	public WebElement Transactions_VoidingInwardCheques_609() {
		return Transactions_VoidingInwardCheques_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001OD_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_VoidingInwardCheques_Code_609;

	public WebElement Transactions_VoidingInwardCheques_Code_609() {
		return Transactions_VoidingInwardCheques_Code_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001OD']//td[text()='10095']

	@FindBy(xpath = "//div[@id='trxMgmtToolBar_D001OD']")
	private WebElement Transactions_VoidingInwardCheques_VoidingBtn_609;

	public WebElement Transactions_VoidingInwardCheques_VoidingBtn_609() {
		return Transactions_VoidingInwardCheques_VoidingBtn_609;
	}

	@FindBy(xpath = "//input[@id='multi_branch_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_EnableMultipleBranch_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_EnableMultipleBranch_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_EnableMultipleBranch_609;
	}

	@FindBy(xpath = "//div[@id='panel_2_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails;
	}

	/// *** Razia ***///

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmparam_parameters;

	public WebElement csmparam_parameters() {
		return csmparam_parameters;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement csmparam_sysparameter_submenu;

	public WebElement csmparam_sysparameter_submenu() {
		return csmparam_sysparameter_submenu;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;

	public WebElement CSMDateToChangeTheCurrentDate_612() {
		return CSM_DateToChangeTheCurrentDate;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate;

	public WebElement CSMDateInUserRunningDate_612() {
		return CSM_DateInUserRunningDate;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate;

	public WebElement CSMUseButtonInChangeRunningDate_612() {
		return CSM_UseButtonInChangeRunningDate;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu_612() {
		return CSM_OkButtonInAccessDeniedPopUpMenu;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_612() {
		return CSM_ClearCacheInTechnicalDetailsIcon;

	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;

	public WebElement CSMOkButtonInInformationPopUpMenu_612() {
		return CSM_OkButtonInInformationPopUpMenu;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;

	public WebElement CSMCloseButtonInChangeRunningDate_612() {
		return CSM_CloseButtonInChangeRunningDate;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon;

	public WebElement CSMTechnicalDetailsIcon_612() {
		return CSM_TechnicalDetailsIcon;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp;

	public WebElement CSMOkButtonUnderInformationPopUp_612() {
		return CSM_OkButtonUnderInformationPopUp;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement csm_UAA_TransactionType;

	public WebElement csm_UAA_TransactionType_612() {

		return csm_UAA_TransactionType;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement csm_DoubleClkCodeUnderUAA_TransactionType;

	public WebElement csm_DoubleClkCodeUnderUAA_TransactionType_612() {

		return csm_DoubleClkCodeUnderUAA_TransactionType;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csm_UAAbtn_TransactionType;

	public WebElement csm_UAAbtn_TransactionType_612() {

		return csm_UAAbtn_TransactionType;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csm_Okbtn_UAA;

	public WebElement csm_Okbtn_UAA_612() {

		return csm_Okbtn_UAA;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement csm_DoubleclkCode_ApproveScreen;

	public WebElement csm_DoubleclkCode_ApproveScreen_612() {

		return csm_DoubleclkCode_ApproveScreen;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csm_Okbtn_ApproveScreen;

	public WebElement csm_Okbtn_ApproveScreen_612() {

		return csm_Okbtn_ApproveScreen;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_Transactions;

	public WebElement csm_Transactions_612() {

		return csm_Transactions;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement csm_Maintanance_Under_Transaction;

	public WebElement csm_Maintanance_Under_Transaction_612() {

		return csm_Maintanance_Under_Transaction;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csm_OkBtn_NonResident_MaintananceScreen;

	public WebElement csm_OkBtn_NonResident_MaintananceScreen_612() {

		return csm_OkBtn_NonResident_MaintananceScreen;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csm_Okbtn_PopupMessage_MaintananceScreen;

	public WebElement csm_Okbtn_PopupMessage_MaintananceScreen_612() {

		return csm_Okbtn_PopupMessage_MaintananceScreen;
	}

	@FindBy(id = "D001AU")
	private WebElement CSM_ApproveScreenUnderTransactions;

	public WebElement CSMApproveScreenUnderTransactions_612() {
		return CSM_ApproveScreenUnderTransactions;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")

	private WebElement Transactions_transactionNo_Doubleclk;

	public WebElement Transactions_transactionNo_Doubleclk_612() {

		return Transactions_transactionNo_Doubleclk;

	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation_612() {
		return CSM_OkButtonInSuccessPopUpMenuForTranscation;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement csm_validate_popup;

	public WebElement csm_validate_popup_612() {
		return csm_validate_popup;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu;

	public WebElement CSMOkButtonInSuccessPopUpMenu_612() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement CSM_ApproveButtonInApproveScreen;

	public WebElement CSMApproveButtonInApproveScreen_612() {
		return CSM_ApproveButtonInApproveScreen;
	}

	@FindBy(xpath = "//span[text()='Apply to Void House Cheque']")

	private WebElement csm_ApplytovoidHouseCheque_under_Transaction;

	public WebElement csm_ApplytovoidHouseCheque_under_Transaction_612() {
		return csm_ApplytovoidHouseCheque_under_Transaction;
	}

	@FindBy(xpath = "//span[text()='Void House Cheques']")

	private WebElement csm_voidHouseCheques_under_Transaction;

	public WebElement csm_voidHouseCheques_under_Transaction_612() {
		return csm_voidHouseCheques_under_Transaction;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001VCL_1_ctstrsVO.TRS_NO']")

	private WebElement csm_Doubleclick_under_ApplytovoidHouseCheque;

	public WebElement csm_Doubleclick_under_ApplytovoidHouseCheque_612() {
		return csm_Doubleclick_under_ApplytovoidHouseCheque;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001VC_1_statusDesc']")

	private WebElement csm_double_under_voidHouseCheques;

	public WebElement csm_double_under_voidHouseCheques_612() {
		return csm_double_under_voidHouseCheques;
	}

	@FindBy(xpath = "//span[text()=' Transaction Status ']")

	private WebElement Transaction_Status_button;

	public WebElement Transaction_Status_button() {

		return Transaction_Status_button;

	}

	@FindBy(xpath = "//td[@id='add_tab31_GridTbl_Id_P024MA']")

	private WebElement Transaction_Status_addbox;

	public WebElement Transaction_Status_addbox() {

		return Transaction_Status_addbox;

	}

	@FindBy(xpath = "//select[@id='new_1701075676587_ctstrxtypeStatusVO.AND_OR']")

	private WebElement And_OR_Select_Transaction;

	public WebElement And_OR_Select_Transaction() {

		return And_OR_Select_Transaction;

	}

	@FindBy(xpath = "//input[@id='new_1701075676587_ctstrxtypeStatusVO.LINE_NO']")

	private WebElement Priority_code_withdraw_Transaction;

	public WebElement Priority_code_withdraw_Transaction() {

		return Priority_code_withdraw_Transaction;

	}

	@FindBy(xpath = "//input[@id='new_1701075676587_ctstrxtypeStatusVO.STATUS_CODE_lookuptxt_tab31_GridTbl_Id_P024MA']")

	private WebElement Status_code_Transaction;

	public WebElement Status_code_Transaction() {

		return Status_code_Transaction;

	}

	@FindBy(xpath = "//input[@id='new_1701075676587_ctstrxtypeStatusVO.USER_LEVEL_lookuptxt_tab31_GridTbl_Id_P024MA']")

	private WebElement User_Level_Transaction;

	public WebElement User_Level_Transaction() {

		return User_Level_Transaction;

	}

	@FindBy(xpath = "//button[@id='ok_btn_25_P024MA']")
	private WebElement Ok_button_Transaction_status;

	public WebElement Ok_button_Transaction_status() {
		return Ok_button_Transaction_status;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement csm_House_Cheque;

	public WebElement csm_House_Cheque() {
		return csm_House_Cheque;
	}

	@FindBy(xpath = "//span[text()=' Send ']")
	private WebElement sendButtonInAlertScreen_cards;

	public WebElement sendButtonInAlertScreen_cards() {
		return sendButtonInAlertScreen_cards;
	}

	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_G001K_1_alertsParamCO.userId']")
	private WebElement sendButtonInAlertScreenBM_cards;

	public WebElement sendButtonInAlertScreenBM_cards() {
		return sendButtonInAlertScreenBM_cards;
	}

	@FindBy(xpath = "//td[@id='td_trsAckTOutAlertGrid_Id_RCVALERT_1_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord;

	public WebElement BMUserAlertEnterTRXNoselectRecord() {
		return BMUser_Alert_EnterTRXNo_selectRecord;
	}

	// span[text()='Deactivate']
	@FindBy(xpath = "//td[@id='td_trsAckTOutAlertGrid_Id_RCVALERT_1_sTodoDet.TODO_PARAM']")
	private WebElement Cilck_button_alert;

	public WebElement Cilck_button_alert() {

		return Cilck_button_alert;
	}

	@FindBy(xpath = "//span[text()='Deactivate']")
	private WebElement Deactivate_button_alert;

	public WebElement Deactivate_button_alert() {

		return Deactivate_button_alert;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice;

	public WebElement ClosePopupmsg_frontoffice() {
		return ClosePopupmsg_frontoffice;
	}

	@FindBy(id = "hder_logout_icon_id")
	private WebElement csm_logoutButton12;

	public WebElement csm_logoutButton12() {
		return csm_logoutButton12;
	}

	@FindBy(id = "hder_logout_icon_id")
	private WebElement csm_logoutButton;

	public WebElement csm_logoutButton() {
		return csm_logoutButton;
	}

	/// *** Nandhini ***///

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_closeSymbol;

	public WebElement CSMCorecloseSymbol() {
		return CSMCore_closeSymbol;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate_7180;

	public WebElement CSMDateToChangeTheCurrentDate() {
		return CSM_DateToChangeTheCurrentDate;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate_7180;

	public WebElement CSMDateInUserRunningDate() {
		return CSM_DateInUserRunningDate;
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

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement csm_controlRecords_under_systemParameter;

	public WebElement csm_controlRecords_under_systemParameter() {
		return csm_controlRecords_under_systemParameter;
	}

	@FindBy(xpath = "//a[@id='O001UP']")
	private WebElement csm_updateafterapprove_under_controlRecords;

	public WebElement csm_updateafterapprove_under_controlRecords() {
		return csm_updateafterapprove_under_controlRecords;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement csm_updateafterapprovebtn_under_UAAscreen;

	public WebElement csm_updateafterapprovebtn_under_UAAscreen() {
		return csm_updateafterapprovebtn_under_UAAscreen;
	}

	@FindBy(xpath = "//a[@id='O001P']")
	private WebElement csm_approve_under_controlRecords;

	public WebElement csm_approve_under_controlRecords() {
		return csm_approve_under_controlRecords;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key'] ")
	private WebElement csm_approvebtn_under_approvescreen;

	public WebElement csm_approvebtn_under_approvescreen() {
		return csm_approvebtn_under_approvescreen;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement csm_HouseCheque_dropdown_under_cheques;

	public WebElement csm_HouseCheque_dropdown_under_cheques() {
		return csm_HouseCheque_dropdown_under_cheques;
	}

	@FindBy(xpath = "//span[text()='Apply to Clear Inward Cheques']")
	private WebElement csm_applytoclearinwardcheques_under_transaction;

	public WebElement csm_applytoclearinwardcheques_under_transaction() {
		return csm_applytoclearinwardcheques_under_transaction;
	}

	@FindBy(xpath = "//th[@id='trxMgntGridTbl_Id_D001AC_ctstrsVO.TRS_NO']")
	private WebElement csm_transactioncode_under_applytoclearinwardchequesscreen;

	public WebElement csm_transactioncode_under_applytoclearinwardchequesscreen() {
		return csm_transactioncode_under_applytoclearinwardchequesscreen;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AC_1_ctstrsVO.TRS_NO']")
	private WebElement csm_transactioncode_dblclk_under_applytoclearinwardchequesscreen;

	public WebElement csm_transactioncode_dblclk_under_applytoclearinwardchequesscreen() {
		return csm_transactioncode_dblclk_under_applytoclearinwardchequesscreen;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001AC']//span)[1]")
	private WebElement csm_applytoclearinwardchequebtn_under_applytoclearinwardchequesscreen;

	public WebElement csm_applytoclearinwardchequebtn_under_applytoclearinwardchequesscreen() {
		return csm_applytoclearinwardchequebtn_under_applytoclearinwardchequesscreen;
	}

	@FindBy(xpath = "//span[text()='Clearing Inward Cheques']")
	private WebElement csm_clearinginwardcheques_under_transaction;

	public WebElement csm_clearinginwardcheques_under_transaction() {
		return csm_clearinginwardcheques_under_transaction;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001E_gs_ctstrsVO.TRS_NO']")
	private WebElement csm_transactioncode_under_clearinginwardcheques;

	public WebElement csm_transactioncode_under_clearinginwardcheques() {
		return csm_transactioncode_under_clearinginwardcheques;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001E_1_ctstrsVO.TRS_NO']")
	private WebElement csm_doubleclick_transactioncode_under_clearinginwardcheques;

	public WebElement csm_doubleclick_transactioncode_under_clearinginwardcheques() {
		return csm_doubleclick_transactioncode_under_clearinginwardcheques;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001E']//div)[1]")
	private WebElement csm_clearinwardcheques_under_clearinginwardcheques;

	public WebElement csm_clearinwardcheques_under_clearinginwardcheques() {
		return csm_clearinwardcheques_under_clearinginwardcheques;
	}

//	@FindBy(xpath = "//a[@id='D001CEMT']")
//	private WebElement csm_maintenance_multichequesentry_under_transaction;
//
//	public WebElement csm_maintenance_multichequesentry_under_transaction() {
//
//		return csm_maintenance_multichequesentry_under_transaction;
//	}
//
//	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEMT']")
//	private WebElement csm_trxcode_maintenance_under_multichequeentry;
//
//	public WebElement csm_trxcode_maintenance_under_multichequeentry() {
//
//		return csm_trxcode_maintenance_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='trs_ac_cy_D001CEMT']")
//	private WebElement csm_currencycode_debit_under_multichequeentry;
//
//	public WebElement csm_currencycode_debit_under_multichequeentry() {
//
//		return csm_currencycode_debit_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='trs_ac_gl_D001CEMT']")
//	private WebElement csm_GLcode_debit_under_multichequeentry;
//
//	public WebElement csm_GLcode_debit_under_multichequeentry() {
//
//		return csm_GLcode_debit_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='trs_ac_cif_D001CEMT']")
//	private WebElement csm_CIFcode_debit_under_multichequeentry;
//
//	public WebElement csm_CIFcode_debit_under_multichequeentry() {
//
//		return csm_CIFcode_debit_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001CEMT']")
//	private WebElement csm_serialno_debit_under_multichequeentry;
//
//	public WebElement csm_serialno_debit_under_multichequeentry() {
//
//		return csm_serialno_debit_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//td[@id='add_mutliChequesEntryGridTbl_Id_D001CEMT']//span")
//	private WebElement csm_addbtn_cheques_under_multichequeentry;
//
//	public WebElement csm_addbtn_cheques_under_multichequeentry() {
//
//		return csm_addbtn_cheques_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001CEMT']")
//	private WebElement csm_currencycode_cheques_under_multichequeentry;
//
//	public WebElement csm_currencycode_cheques_under_multichequeentry() {
//
//		return csm_currencycode_cheques_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='amount_D001CEMT']")
//	private WebElement csm_amount_cheques_under_multichequeentry;
//
//	public WebElement csm_amount_cheques_under_multichequeentry() {
//
//		return csm_amount_cheques_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001CEMT']")
//	private WebElement csm_GLcode_credit_under_multichequeentry;
//
//	public WebElement csm_GLcode_credit_under_multichequeentry() {
//
//		return csm_GLcode_credit_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001CEMT']")
//	private WebElement csm_CIFcode_credit_under_multichequeentry;
//
//	public WebElement csm_CIFcode_credit_under_multichequeentry() {
//
//		return csm_CIFcode_credit_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001CEMT']")
//	private WebElement csm_serialno_credit_under_multichequeentry;
//
//	public WebElement csm_serialno_credit_under_multichequeentry() {
//
//		return csm_serialno_credit_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='chq_num_D001CEMT']")
//	private WebElement csm_chequeno_cheque_under_multichequeentry;
//
//	public WebElement csm_chequeno_cheque_under_multichequeentry() {
//
//		return csm_chequeno_cheque_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='chq_date_D001CEMT']")
//	private WebElement csm_chequedate_cheque_under_multichequeentry;
//
//	public WebElement csm_chequedate_cheque_under_multichequeentry() {
//
//		return csm_chequedate_cheque_under_multichequeentry;
//	}
//
//	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
//	private WebElement csm_ok_nonResidential_popup_multichequeentry;
//
//	public WebElement csm_ok_nonResidential_popup_multichequeentry() {
//
//		return csm_ok_nonResidential_popup_multichequeentry;
//	}
//
//	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']")
//	private WebElement csm_validate_popup_backdated;
//
//	public WebElement csm_validate_popup_backdated() {
//		return csm_validate_popup_backdated;
//	}
//
//	@FindBy(xpath = "//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Amount Exceeds Available Balance in Account')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
//	private WebElement AmountExceedsWarningPopUp;
//
//	public WebElement AmountExceedsWarningPopUp() {
//		return AmountExceedsWarningPopUp;
//	}

	@FindBy(xpath = "//input[@id='backdated_chq_P024MA']")
	private WebElement csm_AllowProceedonBackDatedCheques_flag_UAAscreen;

	public WebElement csm_AllowProceedonBackDatedCheques_flag_UAAscreen() {

		return csm_AllowProceedonBackDatedCheques_flag_UAAscreen;
	}

	@FindBy(xpath = "//input[@id='allow_proceed_pdc_P024MA']")
	private WebElement csm_AllowProceedonPostDatedCheques_flag_UAAscreen;

	public WebElement csm_AllowProceedonPostDatedCheques_flag_UAAscreen() {
		return csm_AllowProceedonPostDatedCheques_flag_UAAscreen;
	}

	@FindBy(xpath = "//input[@id='allow_overdrawn_P017MA']")
	private WebElement CSMParam_AccountParameters_AccountTypes_UpdateAfterApprove_Instructions_AllowOverdrawn_flag;

	public WebElement CSMParam_AccountParameters_AccountTypes_UpdateAfterApprove_Instructions_AllowOverdrawn_flag() {
		return CSMParam_AccountParameters_AccountTypes_UpdateAfterApprove_Instructions_AllowOverdrawn_flag;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017P_Approve_key']")
	private WebElement CSMParam_AccountParameters_AccountTypes_Approve_screen_Approve_button;

	public WebElement CSMParam_AccountParameters_AccountTypes_Approve_screen_Approve_button() {
		return CSMParam_AccountParameters_AccountTypes_Approve_screen_Approve_button;
	}

	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_D001MT_1_alertsParamCO.userId']")
	private WebElement csm_UseridCheckbox_alertpopupmsg;

	public WebElement csm_UseridCheckbox_alertpopupmsg() {
		return csm_UseridCheckbox_alertpopupmsg;
	}

	@FindBy(xpath = "//a[@id='sendBut_D001MT']")
	private WebElement csm_Sendbutton_AlertPopupmsg;

	public WebElement csm_Sendbutton_AlertPopupmsg() {
		return csm_Sendbutton_AlertPopupmsg;
	}

	@FindBy(xpath = "//input[@id='jqg_trsAckTOutAlertGrid_Id_RCVALERT_2']")
	private WebElement csm_Code_AlertPopupMsg;

	public WebElement csm_Code_AlertPopupMsg() {
		return csm_Code_AlertPopupMsg;
	}

	@FindBy(xpath = "//td[@id='td_trsAckTOutAlertGrid_Id_RCVALERT_2_']//a")
	private WebElement csm_OpenItem_AlertPopupMsg;

	public WebElement csm_OpenItem_AlertPopupMsg() {
		return csm_OpenItem_AlertPopupMsg;
	}

	@FindBy(xpath = "//span[text()='Send Alert']")
	private WebElement sendAlertPopup;

	public WebElement sendAlertPopup() {
		return sendAlertPopup;
	}

	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_D001MT_1_alertsParamCO.userId']")
	private WebElement selectTheUserInAlertScreen;

	public WebElement selectTheUserInAlertScreen() {
		return selectTheUserInAlertScreen;
	}

	@FindBy(xpath = "//span[text()=' Send ']")
	private WebElement sendButtonInAlertScreen;

	public WebElement sendButtonInAlertScreen() {
		return sendButtonInAlertScreen;
	}

	@FindBy(id = "D001AU")
	private WebElement approveScreenInTransactions;

	public WebElement approveScreenInTransactions() {
		return approveScreenInTransactions;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement successOkButton;

	public WebElement successOkButton() {
		return successOkButton;
	}

	@FindBy(xpath = "(//input[@id='_popup_path_sol_ok'])[2]")
	private WebElement warningPopupInEcoSector;

	public WebElement warningPopupInEcoSector() {
		return warningPopupInEcoSector;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement parametersMenu;

	public WebElement parametersMenu() {
		return parametersMenu;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement systemParametersSubmenu;

	public WebElement systemParametersSubmenu() {
		return systemParametersSubmenu;
	}

	@FindBy(xpath = "//td[contains(text(),'Transaction Type')]//ancestor::a//following-sibling::ul//span[contains(text(),'Update After Approve')]")
	private WebElement transactionType_UpdateAfterApprove;

	public WebElement transactionTypeUpdateAfterApprove() {
		return transactionType_UpdateAfterApprove;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE")
	private WebElement transactionType_UpdateAfterApprove_TrxCode;

	public WebElement transactionTypeUpdateAfterApproveTrxCode() {
		return transactionType_UpdateAfterApprove_TrxCode;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement transactionTypeGrid_NextButton;

	public WebElement transactionTypeGridNextButton() {
		return transactionTypeGrid_NextButton;
	}

	@FindBy(xpath = "//span[contains(text(),' Transaction Status ')]//parent::a")
	private WebElement transactionType_TransactionStatusButton;

	public WebElement transactionTypeTransactionStatusButton() {
		return transactionType_TransactionStatusButton;
	}

	@FindBy(xpath = "//td[@tdlabel='AND/OR']")
	private WebElement transactionTypeStatus_ANDORDropdownClickable;

	public WebElement transactionTypeStatusANDORDropdownClickable() {
		return transactionTypeStatus_ANDORDropdownClickable;
	}

	@FindBy(xpath = "//td[@id='del_tab31_GridTbl_Id_P024MA']//span")
	private WebElement transactionStatus_DeleteRowNumber;

	public WebElement transactionStatusDeleteRowNumber() {
		return transactionStatus_DeleteRowNumber;
	}

	@FindBy(xpath = "//td[@id='add_tab31_GridTbl_Id_P024MA']//span")
	private WebElement transactionStatus_AddNewRow;

	public WebElement transactionStatusAddNewRow() {
		return transactionStatus_AddNewRow;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")
	private WebElement transactionStatus_OkButton;

	public WebElement transactionStatusOkButton() {
		return transactionStatus_OkButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Transaction Type / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement transactionType_UpdateAfterApproveLabelClose;

	public WebElement transactionTypeUpdateAfterApproveLabelClose() {
		return transactionType_UpdateAfterApproveLabelClose;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE")
	private WebElement transactionType_TransactionCode;

	public WebElement transactionTypeTransactionCode() {
		return transactionType_TransactionCode;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions;

	public WebElement Transactions() {
		return Transactions;
	}

	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement Maintenance;

	public WebElement Maintenance() {
		return Maintenance;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered_615;

	public WebElement checkIfValueIsEntered_615() {
		return checkIfValueIsEntered_615;
	}

	@FindBy(xpath = "//a[text()='Transactions / Maintenance']")
	private WebElement TrxMaintance;

	public WebElement TrxMaintance() {
		return TrxMaintance;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Ok_615;

	public WebElement CSM_Ok_615() {
		return CSM_Ok_615;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']/span")
	private WebElement Transactions_Maintenance_TrxTypeSearch_615;

	public WebElement Transactions_Maintenance_TrxTypeSearch_615() {
		return Transactions_Maintenance_TrxTypeSearch_615;
	}

	@FindBy(xpath = "//input[@id='gridtab_trx_type_D001MT_gs_CODE']")
	private WebElement Transactions_Maintenance_TrxTypeCode_615;

	public WebElement Transactions_Maintenance_TrxTypeCode_615() {
		return Transactions_Maintenance_TrxTypeCode_615;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement Transactions_Maintenance_SaveBtn_615;

	public WebElement Transactions_Maintenance_SaveBtn_615() {
		return Transactions_Maintenance_SaveBtn_615;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_615;

	public WebElement getTransactionNumber_615() {
		return getTransactionNumber_615;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement Transactions_Approve_ApproveBtn_615;

	public WebElement Transactions_Approve_ApproveBtn_615() {
		return Transactions_Approve_ApproveBtn_615;
	}

	@FindBy(xpath = "//a[@id='D001MT']/span[text()='Maintenance']")
	private WebElement Transactions_Maintenance_615;

	public WebElement Transactions_Maintenance_615() {
		return Transactions_Maintenance_615;
	}

	@FindBy(xpath = "//div[@id='trxMgmtToolBar_D001OD']//span[contains(text(),' Voiding Inward Cheques ')]")
	private WebElement Transactions_VoidingInwardCheques_VoidingBtn_615;

	public WebElement Transactions_VoidingInwardCheques_VoidingBtn_615() {
		return Transactions_VoidingInwardCheques_VoidingBtn_615;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001OD_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_VoidingInwardCheques_Code_615;

	public WebElement Transactions_VoidingInwardCheques_Code_615() {
		return Transactions_VoidingInwardCheques_Code_615;
	}

	@FindBy(xpath = "//span[contains(text(),'Voiding  Inward Cheques')]")
	private WebElement Transactions_VoidingInwardCheques_615;

	public WebElement Transactions_VoidingInwardCheques_615() {
		return Transactions_VoidingInwardCheques_615;
	}

	@FindBy(xpath = "//span[contains(text(),' Apply to void inward Cheque ')]")
	private WebElement Transactions_VoidingInwardCheques_ApplyVoidBtn_615;

	public WebElement Transactions_VoidingInwardCheques_ApplyVoidBtn_615() {
		return Transactions_VoidingInwardCheques_ApplyVoidBtn_615;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001VIL']")
	private WebElement Transactions_ApplyVoidInwardCheques_VoidReason_615;

	public WebElement Transactions_ApplyVoidInwardCheques_VoidReason_615() {
		return Transactions_ApplyVoidInwardCheques_VoidReason_615;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VIL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApplyVoidInwardCheques_Code_615;

	public WebElement Transactions_ApplyVoidInwardCheques_Code_615() {
		return Transactions_ApplyVoidInwardCheques_Code_615;
	}

	@FindBy(xpath = "//input[@id='allow_modify_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_615;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_615() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_615;
	}

	@FindBy(xpath = "//a[@id='P024P']/span")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_615;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_615() {
		return Parameters_SystemParameters_TransactionType_Approve_615;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_615;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_615() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_615;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_so_chrg_schema_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_615;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_615() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_615;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_615;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_615() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_615;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_615;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_615() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_615;
	}

	@FindBy(xpath = "//a[@id='P024MA']/span")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_615;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_615() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_615;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement csm_Param_ErrorPopup_OkButton;

	public WebElement csm_Param_ErrorPopup_OkButton() {
		return csm_Param_ErrorPopup_OkButton;
	}

	@FindBy(xpath = "//td[@id='td_trsAckTOutAlertGrid_Id_RCVALERT_1_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_615;

	public WebElement BMUserAlertEnterTRXNoselectRecord_615() {
		return BMUser_Alert_EnterTRXNo_selectRecord_615;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_Doubleclk_615;

	public WebElement Transactions_transactionNo_Doubleclk_615() {
		return Transactions_transactionNo_Doubleclk_615;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement approveButtonInApproveScreen;

	public WebElement approveButtonInApproveScreen() {
		return approveButtonInApproveScreen;
	}

	/// *** Kousalya ***///

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon_611;

	public WebElement CSMTechnicalDetailsIcon_611() {
		return CSM_TechnicalDetailsIcon_611;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon_611;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_611() {
		return CSM_ClearCacheInTechnicalDetailsIcon_611;

	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice_611;

	public WebElement ClosePopupmsg_frontoffice_611() {
		return ClosePopupmsg_frontoffice_611;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate_611;

	public WebElement CSMDateToChangeTheCurrentDate_611() {
		return CSM_DateToChangeTheCurrentDate_611;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate_611;

	public WebElement CSMDateInUserRunningDate_611() {
		return CSM_DateInUserRunningDate_611;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate_611;

	public WebElement CSMUseButtonInChangeRunningDate_611() {
		return CSM_UseButtonInChangeRunningDate_611;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_611;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu_611() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_611;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_611;

	public WebElement CSMCloseButtonInChangeRunningDate_611() {
		return CSM_CloseButtonInChangeRunningDate_611;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_611;

	public WebElement CSMOkButtonUnderInformationPopUp_611() {
		return CSM_OkButtonUnderInformationPopUp_611;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions_Transactions;

	public WebElement Transactions_Transactions_611() {
		return Transactions_Transactions;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Transactions_MaintenanceScrn;

	public WebElement Transactions_MaintenanceScrn_611() {
		return Transactions_MaintenanceScrn;
	}

//			@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
//			private WebElement CSM_SerialIndebitAc;
//			public WebElement CSM_SerialIndebitAc() {
//				return CSM_SerialIndebitAc;
//			}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn;

	public WebElement Transactions_Warning_okbtn_611() {
		return Transactions_Warning_okbtn;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_611;

	public WebElement getTransactionNumber_611() {
		return getTransactionNumber_611;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu_611;

	public WebElement CSMOkButtonInSuccessPopUpMenu_611() {
		return CSM_OkButtonInSuccessPopUpMenu_611;
	}

	@FindBy(xpath = "//a[@id='D001AU']")
	private WebElement Transactions_Approvescrn;

	public WebElement Transactions_Approvescrn_611() {
		return Transactions_Approvescrn;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_Doubleclk_611;

	public WebElement Transactions_transactionNo_Doubleclk_611() {
		return Transactions_transactionNo_Doubleclk_611;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement Transactions_Approvebtn;

	public WebElement Transactions_Approvebtn_611() {
		return Transactions_Approvebtn;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_successokbtn;

	public WebElement Transactions_successokbtn_611() {
		return Transactions_successokbtn;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement CsmParam_Parameters;

	public WebElement CsmParam_Parameters_611() {
		return CsmParam_Parameters;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement CsmParam_Parameters_SysParameter;

	public WebElement CsmParam_Parameters_SysParameter_611() {
		return CsmParam_Parameters_SysParameter;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement paramParameter;

	public WebElement Param_Parameter_611() {
		return paramParameter;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement paramParameter_sysparameter;

	public WebElement paramParameter_sysparameter_611() {
		return paramParameter_sysparameter;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement paramParameter_sysparameter_controlrecord;

	public WebElement paramParameter_sysparameter_controlrecord_611() {
		return paramParameter_sysparameter_controlrecord;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement paramParameter_sysparameter_controlrecord_UpdAftAppr;

	public WebElement paramParameter_sysparameter_controlrecord_UpdAftAppr_611() {
		return paramParameter_sysparameter_controlrecord_UpdAftAppr;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement controlrecord_UpdAftAppr_updaftapprovekey;

	public WebElement controlrecord_UpdAftAppr_updaftapprovekey_611() {
		return controlrecord_UpdAftAppr_updaftapprovekey;
	}

	@FindBy(xpath = "//*[@id=\"O001P\"]/span[2]")
	private WebElement controlrecord_Apprmenu;

	public WebElement controlrecord_Apprmenu_611() {
		return controlrecord_Apprmenu;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement controlrecord_Apprmenu_ApprKey;

	public WebElement controlrecord_Apprmenu_ApprKey_611() {
		return controlrecord_Apprmenu_ApprKey;
	}

	@FindBy(xpath = "//a[@id='P024MA']/span[2]")
	private WebElement parameter_sysparam_Transcationtype_updaftappr;

	public WebElement parameter_sysparam_Transcationtype_updaftappr_611() {
		return parameter_sysparam_Transcationtype_updaftappr;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement parameter_sysparam_Transcationtype_updaftappr_Codeval;

	public WebElement parameter_sysparam_Transcationtype_updaftappr_Codeval_611() {
		return parameter_sysparam_Transcationtype_updaftappr_Codeval;
	}

	@FindBy(xpath = "//tr[@id='1']")
	private WebElement Transcationtype_updaftappr_Codeval_doubleclick;

	public WebElement Transcationtype_updaftappr_Codeval_doubleclick_611() {
		return Transcationtype_updaftappr_Codeval_doubleclick;
	}

	@FindBy(xpath = "//select[@name='transactiontypesCO.ctstrxtypeVO.CHQ_RELATED']")
	private WebElement Transcationtype_updaftappr_selectclrInwardcheck;

	public WebElement Transcationtype_updaftappr_selectclrInwardcheck_611() { // Clearing/Inward Cheque/Other //House
																				// Cheque
		return Transcationtype_updaftappr_selectclrInwardcheck;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement Transcationtype_updaftappr_selectclrInwardcheck_updaftapprkey;

	public WebElement Transcationtype_updaftappr_selectclrInwardcheck_updaftapprkey_611() {
		return Transcationtype_updaftappr_selectclrInwardcheck_updaftapprkey;
	}

	@FindBy(xpath = "//*[@id=\"P024P\"]/span[2]")
	private WebElement Transcationtype_ApprMenu;

	public WebElement Transcationtype_ApprMenu_611() {
		return Transcationtype_ApprMenu;
	}

	@FindBy(xpath = "(//input[@name='CODE'])[2]")
	private WebElement Transcationtype_ApprMenu_CodeValue;

	public WebElement Transcationtype_ApprMenu_CodeValue_611() {
		return Transcationtype_ApprMenu_CodeValue;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.SHORT_DESC_ENG']")
	private WebElement Transcationtype_ApprMenu_CodeValue_doubleclick;

	public WebElement Transcationtype_ApprMenu_CodeValue_doubleclick_611() {
		return Transcationtype_ApprMenu_CodeValue_doubleclick;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement Transcationtype_ApprMenu_Apprkey;

	public WebElement Transcationtype_ApprMenu_Apprkey_611() {
		return Transcationtype_ApprMenu_Apprkey;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered;

	public WebElement checkIfValueIsEntered_611() {
		return checkIfValueIsEntered;
	}

	@FindBy(xpath = "//span[text()='Apply to Clear Inward Cheques']")
	private WebElement Transactions_ApplyClearInwardCheques_611;

	public WebElement Transactions_ApplyClearInwardCheques_611() {
		return Transactions_ApplyClearInwardCheques_611;
	}

	@FindBy(xpath = "//span[contains(text(),' Apply Clearing Inward Cheque ')]")
	private WebElement Transactions_ClearingInwardCheques_ApplyBtn_611;

	public WebElement Transactions_ClearingInwardCheques_ApplyBtn_611() {
		return Transactions_ClearingInwardCheques_ApplyBtn_611;
	}

	@FindBy(xpath = "//span[text()='Clearing Inward Cheques']")
	private WebElement Transactions_ClearingInwardCheques_611;

	public WebElement Transactions_ClearingInwardCheques_611() {
		return Transactions_ClearingInwardCheques_611;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001E_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ClearingInwardCheques_Code_611;

	public WebElement Transactions_ClearingInwardCheques_Code_611() {
		return Transactions_ClearingInwardCheques_Code_611;
	}
	// table[@id='trxMgntGridTbl_Id_D001E']//td[text()='9810']

	@FindBy(xpath = "//span[contains(text(),' Clear Inward Cheque ')]")
	private WebElement Transactions_ClearingInwardCheques_ClearBtn_611;

	public WebElement Transactions_ClearingInwardCheques_ClearBtn_611() {
		return Transactions_ClearingInwardCheques_ClearBtn_611;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_611;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_611() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_611;
	}

	@FindBy(xpath = "//input[@id='auto_approve_within_limit_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_611;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_611() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_611;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement UpdateAfterApprove_Transafer;

	public WebElement UpdateAfterApprove_Transafer() {
		return UpdateAfterApprove_Transafer;
	}

	@FindBy(xpath = "//table[@id='transactionTypesList_GridTbl_Id_P024MA']")
	private WebElement DoubleClick_transactioncodechanged;

	public WebElement DoubleClick_transactioncodechanged() {

		return DoubleClick_transactioncodechanged;
	}

	@FindBy(xpath = "//input[@id='allow_proceed_pdc_P024MA']")
	private WebElement Allow_processed_on_post_data_transaction;

	public WebElement Allow_processed_on_post_data_transaction() {

		return Allow_processed_on_post_data_transaction;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement updateAfterApprove_User_Param;

	public WebElement updateAfterApprove_User_Param() {
		return updateAfterApprove_User_Param;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg;

	public WebElement POPupmsg() {
		return POPupmsg;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement submit_user_approve;

	public WebElement submit_user_approve() {
		return submit_user_approve;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement Double_Transaction_Approve_proceed;

	public WebElement Double_Transaction_Approve_proceed() {
		return Double_Transaction_Approve_proceed;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu() {
		return CSM_TransactionsMainMenu;
	}

	@FindBy(xpath = "(//span[text()='Maintenance'])[1]")
	private WebElement Maintenance_button;

	public WebElement Maintenance_button() {
		return Maintenance_button;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_722;

	public WebElement CSM_OkButtonUnderInformationPopUp_722() {
		return CSM_OkButtonUnderInformationPopUp_722;
	}

	@FindBy(id = "lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialIndebitAc;

	public WebElement CSM_SerialIndebitAc() {
		return CSM_SerialIndebitAc;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInCreditAc;

	public WebElement CSMCIFCodeInCreditAc() {
		return CSM_CIFCodeInCreditAc;
	}

	@FindBy(xpath = "//input[@id='new_1695711075412_ctstrsACCDETVO.FC_AMOUNT']")
	private WebElement Amount_Account_entervalue_Transaction;

	public WebElement Amount_Account_entervalue_Transaction() {
		return Amount_Account_entervalue_Transaction;
	}

	@FindBy(xpath = "//button[@id='submit_1003271558']")
	private WebElement remittance_Save_button;

	public WebElement remittance_Save_button() {
		return remittance_Save_button;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement Control_record_Transaction;

	public WebElement Control_record_Transaction() {
		return Control_record_Transaction;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement Update_after_approve_CSMParam;

	public WebElement Update_after_approve_CSMParam() {
		return Update_after_approve_CSMParam;
	}

	@FindBy(xpath = "//input[@id='no_clearing_entries_O001MT']")
	private WebElement No_clearingEntries_control_record;

	public WebElement No_clearingEntries_control_record() {
		return No_clearingEntries_control_record;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement UpdateAfterApprove_TransaferSubmit;

	public WebElement UpdateAfterApprove_TransaferSubmit() {
		return UpdateAfterApprove_TransaferSubmit;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Che_related_cheque_clearing_other;

	public WebElement Che_related_cheque_clearing_other() {
		return Che_related_cheque_clearing_other;
	}

	@FindBy(xpath = "td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE")
	private WebElement Double_click_Aprrove_cheque;

	public WebElement Double_click_Aprrove_cheque() {
		return Double_click_Aprrove_cheque;
	}

	@FindBy(xpath = "//td[text()='Clearing Maintenance']")
	private WebElement Clearing_maintenance_transaction;

	public WebElement Clearing_maintenance_transaction() {
		return Clearing_maintenance_transaction;
	}

	@FindBy(xpath = "//td[text()='Deposit Cheques']")
	private WebElement Deposit_cheques_transaction;

	public WebElement Deposit_cheques_transaction() {
		return Deposit_cheques_transaction;
	}

	@FindBy(xpath = "//span[text()='Clearing/Voiding Deposits']")
	private WebElement Clearing_voiding_Deposits_transaction;

	public WebElement Clearing_voiding_Deposits_transaction() {
		return Clearing_voiding_Deposits_transaction;
	}

	@FindBy(xpath = "//input[@id='criteria_trxNo_I000DCV']")
	private WebElement Trasnaction_box_clearing;

	public WebElement Trasnaction_box_clearing() {
		return Trasnaction_box_clearing;
	}

	@FindBy(xpath = "//div[@id='lookupid_trxFromLkp_I000TCV']")
	private WebElement Trasnscation_From_clearing;

	public WebElement Trasnscation_From_clearing() {
		return Trasnscation_From_clearing;
	}

	@FindBy(xpath = "//div[@id='lookupid_trxToLkp_I000TCV']")
	private WebElement Trasnscation_To_clearing;

	public WebElement Trasnscation_To_clearing() {
		return Trasnscation_To_clearing;
	}

	@FindBy(xpath = "//td[text()='Transfers']")
	private WebElement Transfers_clearing_box;

	public WebElement Transfers_clearing_box() {
		return Transfers_clearing_box;
	}

	@FindBy(xpath = "//label[@id='depositChequesMaintForm_I000DCV_clear_void_key']")
	private WebElement clear_void_box;

	public WebElement clear_void_box() {
		return clear_void_box;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement DoubleClick_Transaction_Type_Automatic_flag;

	public WebElement DoubleClick_Transaction_Type_Automatic_flag() {
		return DoubleClick_Transaction_Type_Automatic_flag;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRX_TYPE']")
	private WebElement Trx_Type_code_under_Bulk_remittance_type;

	public WebElement Trx_Type_code_under_Bulk_remittance_type() {
		return Trx_Type_code_under_Bulk_remittance_type;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon_722;

	public WebElement CSMTechnicalDetailsIcon_722() {
		return CSM_TechnicalDetailsIcon_722;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon_722;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_722() {
		return CSM_ClearCacheInTechnicalDetailsIcon_722;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_00722;

	public WebElement CSMOkButtonUnderInformationPopUp_722() {
		return CSM_OkButtonUnderInformationPopUp_00722;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_722;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu_722() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_722;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate_722;

	public WebElement CSMUseButtonInChangeRunningDate_722() {
		return CSM_UseButtonInChangeRunningDate_722;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_722;

	public WebElement CSMCloseButtonInChangeRunningDate_722() {
		return CSM_CloseButtonInChangeRunningDate_722;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Parameters_csm_param;

	public WebElement Parameters_csm_param() {
		return Parameters_csm_param;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement System_Parameters_csm_param;

	public WebElement System_Parameters_csm_param() {
		return System_Parameters_csm_param;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement updateaftercodeinside_csm_param;

	public WebElement updateaftercodeinside_csm_param() {
		return updateaftercodeinside_csm_param;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement housecheque_chequeinfo_codedoubleclick_updateaftercodeinside_csm_param;

	public WebElement housecheque_chequeinfo_codedoubleclick_updateaftercodeinside_csm_param() {
		return housecheque_chequeinfo_codedoubleclick_updateaftercodeinside_csm_param;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement doubleclick_Transaction_code_CSM_Param;

	public WebElement doubleclick_Transaction_code_CSM_Param() {
		return doubleclick_Transaction_code_CSM_Param;
	}

	@FindBy(xpath = "//div[@ID='transactionTypesMaint_MaintToolBar_P024MA']//button")
	private WebElement ClickUpdateandApprove_intransactiontype_csm_param;

	public WebElement ClickUpdateandApprove_intransactiontype_csm_param() {
		return ClickUpdateandApprove_intransactiontype_csm_param;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Ok_7181;

	public WebElement CSM_Ok_7181() {
		return CSM_Ok_7181;
	}

	@FindBy(xpath = "//span[text()=' Transaction Status ']")
	private WebElement TransactionStatus_codedoubleclick_updateaftercodeinside_csm_param;

	public WebElement TransactionStatus_codedoubleclick_updateaftercodeinside_csm_param() {
		return TransactionStatus_codedoubleclick_updateaftercodeinside_csm_param;
	}

	@FindBy(xpath = "//td[@id='add_tab31_GridTbl_Id_P024MA']")
	private WebElement AddunderTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;

	public WebElement AddunderTrxstatus_codedoubleclick_updateaftercodeinside_csm_param() {
		return AddunderTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;
	}

	// td[@id='td_tab31_GridTbl_Id_P024MA_1_rn']//following-sibling::td/select
	@FindBy(xpath = "(//td[@id='td_tab31_GridTbl_Id_P024MA_1_ctstrxtypeStatusVO.AND_OR'])[2]/select")
	private WebElement AndDropdowninTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;

	public WebElement AndDropdowninTrxstatus_codedoubleclick_updateaftercodeinside_csm_param() {
		return AndDropdowninTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;
	}

	@FindBy(xpath = "(//input[@class='editable'])[1]")
	private WebElement PriorityinTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;

	public WebElement PriorityinTrxstatus_codedoubleclick_updateaftercodeinside_csm_param() {
		return PriorityinTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeStatusVO.STATUS_CODE']")
	private WebElement StatuscodeinTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;

	public WebElement StatuscodeinTrxstatus_codedoubleclick_updateaftercodeinside_csm_param() {
		return StatuscodeinTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeStatusVO.USER_LEVEL']")
	private WebElement UserLevelinTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;

	public WebElement UserLevelinTrxstatus_codedoubleclick_updateaftercodeinside_csm_param() {
		return UserLevelinTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;
	}

	@FindBy(xpath = "//button[@id='ok_btn_25_P024MA']")
	private WebElement OkbuttoninTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;

	public WebElement OkbuttoninTrxstatus_codedoubleclick_updateaftercodeinside_csm_param() {
		return OkbuttoninTrxstatus_codedoubleclick_updateaftercodeinside_csm_param;
	}

	@FindBy(xpath = "//a[@id='P024P']")
	private WebElement Approve_transactiontype_csm_param;

	public WebElement Approve_transactiontype_csm_param() {
		return Approve_transactiontype_csm_param;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement _DoubleClick_code_Approve_transactiontype_csm_param;

	public WebElement _DoubleClick_code_Approve_transactiontype_csm_param() {
		return _DoubleClick_code_Approve_transactiontype_csm_param;
	}

	@FindBy(xpath = " //td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement csm_doubleclick_code_under_approvescreen;

	public WebElement csm_doubleclick_code_under_approvescreen() {
		return csm_doubleclick_code_under_approvescreen;
	}

//			CSM CORE

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transaction_incsmcore;

	public WebElement Transaction_incsmcore() {
		return Transaction_incsmcore;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintance_Transaction_incsmcore;

	public WebElement Maintance_Transaction_incsmcore() {
		return Maintance_Transaction_incsmcore;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement CIFcode_Maintance_Transaction_incsmcore;

	public WebElement CIFcode_Maintance_Transaction_incsmcore() {
		return CIFcode_Maintance_Transaction_incsmcore;
	}

	@FindBy(xpath = "//input[@id=\"amount_D001MT\"]")
	private WebElement Amount_Maintance_Transaction_incsmcore;

	public WebElement Amount_Maintance_Transaction_incsmcore() {
		return Amount_Maintance_Transaction_incsmcore;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement CSM_Uncheck_Apply_Charges_On_Void;

	public WebElement CSM_Uncheck_Apply_Charges_On_Void() {
		return CSM_Uncheck_Apply_Charges_On_Void;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement CSM_check_Check_Cheque_During_Withdrawal;

	public WebElement CSM_check_Check_Cheque_During_Withdrawal() {
		return CSM_check_Check_Cheque_During_Withdrawal;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement CSM_uncheck_Check_Cheque_During_Withdrawal;

	public WebElement CSM_uncheck_Check_Cheque_During_Withdrawal() {
		return CSM_uncheck_Check_Cheque_During_Withdrawal;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement csm_updateAfterApprove_under_transactiontype;

	public WebElement csm_updateAfterApprove_under_transactiontype() {
		return csm_updateAfterApprove_under_transactiontype;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csm_okbutton_insuccessscreen_under_updateAfterApprove;

	public WebElement csm_okbutton_insuccessscreen_under_updateAfterApprove() {
		return csm_okbutton_insuccessscreen_under_updateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csm_okbtn_under_successscreen_under_approvescreen;

	public WebElement csm_okbtn_under_successscreen_under_approvescreen() {
		return csm_okbtn_under_successscreen_under_approvescreen;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate_7181;

	public WebElement CSMUseButtonInChangeRunningDate_7181() {
		return CSM_UseButtonInChangeRunningDate_7181;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_7181;

	public WebElement CSMOkButtonUnderInformationPopUp_7181() {
		return CSM_OkButtonUnderInformationPopUp_7181;
	}

	@FindBy(xpath = "//a[@id='P024MA']")
	private WebElement UpdateAfterCodeparam;

	public WebElement UpdateAfterCodeparam() {
		return UpdateAfterCodeparam;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement ClicktheCode_inUpdateAfterCodeparam;

	public WebElement ClicktheCode_inUpdateAfterCodeparam() {
		return ClicktheCode_inUpdateAfterCodeparam;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement ClicktheUpdateAfterApprove;

	public WebElement ClicktheUpdateAfterApprove() {
		return ClicktheUpdateAfterApprove;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement CodeDoubleclickinApproveScreen;

	public WebElement CodeDoubleclickinApproveScreen() {
		return CodeDoubleclickinApproveScreen;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement OkSuccessPopupmsg;

	public WebElement OkSuccessPopupmsg() {
		return OkSuccessPopupmsg;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement TransactionsincsmCore;

	public WebElement TransactionsincsmCore() {
		return TransactionsincsmCore;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenancein_TransactionsincsmCore;

	public WebElement Maintenancein_TransactionsincsmCore() {
		return Maintenancein_TransactionsincsmCore;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.CHQ_NUM']")
	private WebElement chequeNumin_Maintancecsmcore;

	public WebElement chequeNumin_Maintancecsmcore() {
		return chequeNumin_Maintancecsmcore;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement entertheBranchcodeCR284;

	public WebElement entertheBranchcodeCR284() {
		return entertheBranchcodeCR284;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement entertheGlcodeCR284;

	public WebElement entertheGlcodeCR284() {
		return entertheGlcodeCR284;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement entertheCIFcodeCR284;

	public WebElement entertheCIFcodeCR284() {
		return entertheCIFcodeCR284;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_SL']")
	private WebElement entertheserialcodeCR284;

	public WebElement entertheserialcodeCR284() {
		return entertheserialcodeCR284;
	}

	@FindBy(xpath = "//div[@class='ui-widget-header ui-corner-top jMsgbox-headWrap']")
	private WebElement validateCannotproceedpopup;

	public WebElement validateCannotproceedpopup() {
		return validateCannotproceedpopup;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement control_record_submenu_of_system_parameter;

	public WebElement control_record_submenu_of_system_parameter() {
		return control_record_submenu_of_system_parameter;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement update_after_approve_submenu_of_control_record69;

	public WebElement update_after_approve_submenu_of_control_record69() {
		return update_after_approve_submenu_of_control_record69;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement update_after_approve_button_in_control_record_submenu69_of_system_parameter;

	public WebElement update_after_approve_button_in_control_record_submenu69_of_system_parameter() {
		return update_after_approve_button_in_control_record_submenu69_of_system_parameter;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement approve_button_in_control_record69_submenu_of_system_parameter;

	public WebElement approve_button_in_control_record69_submenu_of_system_parameter() {
		return approve_button_in_control_record69_submenu_of_system_parameter;
	}

	// span[text()='Update After Approve'])[2]
	@FindBy(xpath = "//span[text()='Update After Approve'])[2]")
	private WebElement update_after_approve_submenu_of_transaction_type;

	public WebElement update_after_approve_submenu_of_transaction_type() {
		return update_after_approve_submenu_of_transaction_type;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement double_click_the_code_in_update_after_approve_transaction_type;

	public WebElement double_click_the_code_in_update_after_approve_transaction_type() {
		return double_click_the_code_in_update_after_approve_transaction_type;
	}

	@FindBy(xpath = "//input[@id='enable_card_reader_yn_P024MA']")
	private WebElement the_Enable_Card_Reader_tick_the_flag;

	public WebElement the_Enable_Card_Reader_tick_the_flag() {
		return the_Enable_Card_Reader_tick_the_flag;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement update_after_approve_button_submenu_of_transaction_type;

	public WebElement update_after_approve_button_submenu_of_transaction_type() {
		return update_after_approve_button_submenu_of_transaction_type;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement double_click_the_code_in_approve_submenu_of_transaction_type;

	public WebElement double_click_the_code_in_approve_submenu_of_transaction_type() {
		return double_click_the_code_in_approve_submenu_of_transaction_type;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement click_the_Transactions69CR;

	public WebElement click_the_Transactions69CR() {
		return click_the_Transactions69CR;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement click_the_Maintenace_submenu_of_Transaction69CR;

	public WebElement click_the_Maintenace_submenu_of_Transaction69CR() {
		return click_the_Maintenace_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all path-dummy-cls'])[1]")
	private WebElement Branchcode_Dr_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement Branchcode_Dr_in_Maintenance_submenu_of_Transaction69CR() {
		return Branchcode_Dr_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all path-dummy-cls'])[2]")
	private WebElement Currencycode_Dr_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement Currencycode_Dr_in_Maintenance_submenu_of_Transaction69CR() {
		return Currencycode_Dr_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all path-dummy-cls'])[3]")
	private WebElement GLcode_Dr_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement GLcode_Dr_in_Maintenance_submenu_of_Transaction69CR() {
		return GLcode_Dr_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all path-dummy-cls'])[4]")
	private WebElement CIFcode_Dr_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement CIFcode_Dr_in_Maintenance_submenu_of_Transaction69CR() {
		return CIFcode_Dr_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "(//input[@class='path-theme-cust-input liveSearchText liveSearchCompSize ui-state-focus liveSearchInputCorner path-dummy-cls'])[1]")
	private WebElement serialcode_Dr_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement serialcode_Dr_in_Maintenance_submenu_of_Transaction69CR() {
		return serialcode_Dr_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_CY']")
	private WebElement enter_currency_press_tab_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement enter_currency_press_tab_in_Maintenance_submenu_of_Transaction69CR() {
		return enter_currency_press_tab_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement enter_amount_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement enter_amount_in_Maintenance_submenu_of_Transaction69CR() {
		return enter_amount_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement Branchcode_Cr_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement Branchcode_Cr_in_Maintenance_submenu_of_Transaction69CR() {
		return Branchcode_Cr_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement GLcode_Cr_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement GLcode_Cr_in_Maintenance_submenu_of_Transaction69CR() {
		return GLcode_Cr_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement CIFcode_Cr_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement CIFcode_Cr_in_Maintenance_submenu_of_Transaction69CR() {
		return CIFcode_Cr_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_SL']")
	private WebElement Serialcode_Cr_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement Serialcode_Cr_in_Maintenance_submenu_of_Transaction69CR() {
		return Serialcode_Cr_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.CHQ_NUM']")
	private WebElement ChequeNo_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement ChequeNo_in_Maintenance_submenu_of_Transaction69CR() {
		return ChequeNo_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//button[@class='path-btn-def-access-progref  ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")
	private WebElement save_button_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement save_button_in_Maintenance_submenu_of_Transaction69CR() {
		return save_button_in_Maintenance_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement get_Transaction_number_from_sucess_pop_up_for_Cheque_Transaction;

	public WebElement get_Transaction_number_from_sucess_pop_up_for_Cheque_Transaction() {
		return get_Transaction_number_from_sucess_pop_up_for_Cheque_Transaction;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement DobleClick_Transaction_code_in_Approve_in_submenu_of_Transaction69CR;

	public WebElement DobleClick_Transaction_code_in_Approve_in_submenu_of_Transaction69CR() {
		return DobleClick_Transaction_code_in_Approve_in_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")
	private WebElement approveButton_in_Approve_in_submenu_of_Transaction69CR;

	public WebElement approveButton_in_Approve_in_submenu_of_Transaction69CR() {
		return approveButton_in_Approve_in_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//span[text()='Apply to Clear Inward Cheques']")
	private WebElement Apply_to_clear_Inward_Cheques_in_submenu_of_Transaction69CR;

	public WebElement Apply_to_clear_Inward_Cheques_in_submenu_of_Transaction69CR() {
		return Apply_to_clear_Inward_Cheques_in_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AC_1_ctstrsVO.TRS_NO']")
	private WebElement Double_click_enter_the_Transaction_number_in_Apply_to_clear_Inward_Cheques_in_submenuofTransaction69CR;

	public WebElement Double_click_enter_the_Transaction_number_in_Apply_to_clear_Inward_Cheques_in_submenuofTransaction69CR() {
		return Double_click_enter_the_Transaction_number_in_Apply_to_clear_Inward_Cheques_in_submenuofTransaction69CR;
	}

	@FindBy(xpath = "//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")
	private WebElement click_the_Apply_to_clear_Inward_Cheques_button;

	public WebElement click_the_Apply_to_clear_Inward_Cheques_button() {
		return click_the_Apply_to_clear_Inward_Cheques_button;
	}

	@FindBy(xpath = "//a[@class='path-selected-menu-cupertino path-selected-menu']")
	private WebElement click_the_ClearingInwardChequesinSubmenuofTransaction69CR;

	public WebElement click_the_ClearingInwardChequesinSubmenuofTransaction69CR() {
		return click_the_ClearingInwardChequesinSubmenuofTransaction69CR;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001E_gs_ctstrsVO.TRS_NO']")
	private WebElement entertheTransactionnumberinClearingInwardChequesinsubmenuofTransaction69CR;

	public WebElement entertheTransactionnumberinClearingInwardChequesinsubmenuofTransaction69CR() {
		return entertheTransactionnumberinClearingInwardChequesinsubmenuofTransaction69CR;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001E_1_ctstrsVO.TRS_NO']")
	private WebElement DoubleclickentertheTransactionnumberinClearingInwardChequesinsubmenuofTransaction69CR;

	public WebElement DoubleclickentertheTransactionnumberinClearingInwardChequesinsubmenuofTransaction69CR() {
		return DoubleclickentertheTransactionnumberinClearingInwardChequesinsubmenuofTransaction69CR;
	}

	@FindBy(xpath = "//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")
	private WebElement click_the_Clearing_Inward_Cheques_button;

	public WebElement click_the_Clearing_Inward_Cheques_button() {
		return click_the_Clearing_Inward_Cheques_button;
	}

//	Multicheque Entry - Maintenance
	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEMT']")
	private WebElement TrxTypeinMaintenanceinMultiChequesEntry;

	public WebElement TrxTypeinMaintenanceinMultiChequesEntry() {
		return TrxTypeinMaintenanceinMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001CEMT']")
	private WebElement Branchcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement Branchcode_in_Maintenance_in_MultiChequesEntry() {
		return Branchcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001CEMT']")
	private WebElement Currencycode_in_Maintenance_in_MultiChequesEntry;

	public WebElement Currencycode_in_Maintenance_in_MultiChequesEntry() {
		return Currencycode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001CEMT']")
	private WebElement GLcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement GLcode_in_Maintenance_in_MultiChequesEntry() {
		return GLcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001CEMT']")
	private WebElement CIFcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement CIFcode_in_Maintenance_in_MultiChequesEntry() {
		return CIFcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001CEMT']")
	private WebElement Serialcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement Serialcode_in_Maintenance_in_MultiChequesEntry() {
		return Serialcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.referenceNumber']")
	private WebElement ReferanceNumber_in_Maintenance_in_MultiChequesEntry;

	public WebElement ReferanceNumber_in_Maintenance_in_MultiChequesEntry() {
		return ReferanceNumber_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.totalNumberOfCheques']")
	private WebElement TotalNumberofCheques_in_Maintenance_in_MultiChequesEntry;

	public WebElement TotalNumberofCheques_in_Maintenance_in_MultiChequesEntry() {
		return TotalNumberofCheques_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.sumOfCheques']")
	private WebElement SumofCheques_in_Maintenance_in_MultiChequesEntry;

	public WebElement SumofCheques_in_Maintenance_in_MultiChequesEntry() {
		return SumofCheques_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//td[@id='add_mutliChequesEntryGridTbl_Id_D001CEMT']")
	private WebElement clickAddIconatlast_in_Maintenance_in_MultiChequesEntry;

	public WebElement clickAddIconatlast_in_Maintenance_in_MultiChequesEntry() {
		return clickAddIconatlast_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_CY']")
	private WebElement EnterCurrencypresstab_in_Maintenance_in_MultiChequesEntry;

	public WebElement EnterCurrencypresstab_in_Maintenance_in_MultiChequesEntry() {
		return EnterCurrencypresstab_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(id = "amount_D001CEMT")
	private WebElement EnterAmount_in_Maintenance_in_MultiChequesEntry;

	public WebElement EnterAmount_in_Maintenance_in_MultiChequesEntry() {
		return EnterAmount_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.CHQ_NUM']")
	private WebElement EnterChequeNumber_in_Maintenance_in_MultiChequesEntry;

	public WebElement EnterChequeNumber_in_Maintenance_in_MultiChequesEntry() {
		return EnterChequeNumber_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001CEMT']")
	private WebElement To_Acc_Branchcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement To_Acc_Branchcode_in_Maintenance_in_MultiChequesEntry() {
		return To_Acc_Branchcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001CEMT']")
	private WebElement To_Acc_Currencycode_in_Maintenance_in_MultiChequesEntry;

	public WebElement To_Acc_Currencycode_in_Maintenance_in_MultiChequesEntry() {
		return To_Acc_Currencycode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001CEMT']")
	private WebElement To_Acc_GLcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement To_Acc_GLcode_in_Maintenance_in_MultiChequesEntry() {
		return To_Acc_GLcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001CEMT']")
	private WebElement To_Acc_CIFcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement To_Acc_CIFcode_in_Maintenance_in_MultiChequesEntry() {
		return To_Acc_CIFcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001CEMT']")
	private WebElement To_Acc_Serialcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement To_Acc_Serialcode_in_Maintenance_in_MultiChequesEntry() {
		return To_Acc_Serialcode_in_Maintenance_in_MultiChequesEntry;
	}

//	Multicheque Entry - Approve
	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement TrxTypeinApproveinMultiChequesEntry;

	public WebElement TrxTypeinApproveinMultiChequesEntry() {
		return TrxTypeinApproveinMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001CEP']")
	private WebElement Branchcode_in_Approve_in_MultiChequesEntry;

	public WebElement Branchcode_in_Approve_in_MultiChequesEntry() {
		return Branchcode_in_Approve_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001CEP']")
	private WebElement Currencycode_in_Approve_in_MultiChequesEntry;

	public WebElement Currencycode_in_Approve_in_MultiChequesEntry() {
		return Currencycode_in_Approve_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001CEP']")
	private WebElement GLcode_in_Approve_in_MultiChequesEntry;

	public WebElement GLcode_in_Approve_in_MultiChequesEntry() {
		return GLcode_in_Approve_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001CEP']")
	private WebElement CIFcode_in_Approve_in_MultiChequesEntry;

	public WebElement CIFcode_in_Approve_in_MultiChequesEntry() {
		return CIFcode_in_Approve_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001CEP']")
	private WebElement Serialcode_in_Approve_in_MultiChequesEntry;

	public WebElement Serialcode_in_Approve_in_MultiChequesEntry() {
		return Serialcode_in_Approve_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[contains(@id,'jqg_mutliChequesEntryGridTbl_Id_D001CEP')]")
	private WebElement Cheques_records_in_Approve_in_MultiChequesEntry;

	public WebElement Cheques_records_in_Approve_in_MultiChequesEntry() {
		return Cheques_records_in_Approve_in_MultiChequesEntry;
	}

	@FindBy(id = "proceed_D001CEP")
	private WebElement MultiChequesEntry_Approve_screen_Approve_button;

	public WebElement MultiChequesEntry_Approve_screen_Approve_button() {
		return MultiChequesEntry_Approve_screen_Approve_button;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRX_TYPE']")
	private WebElement enter_TRX_typeandpresstabinMaintenanceScreeninTransactions;

	public WebElement enter_TRX_typeandpresstabinMaintenanceScreeninTransactions() {
		return enter_TRX_typeandpresstabinMaintenanceScreeninTransactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement enter_BranchCodeCr_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_BranchCodeCr_in_MaintenanceScreen_in_Transactions() {
		return enter_BranchCodeCr_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
	private WebElement enter_CurrencyCodeCr_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_CurrencyCodeCr_in_MaintenanceScreen_in_Transactions() {
		return enter_CurrencyCodeCr_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_GL']")
	private WebElement enter_GLCodeCr_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_GLCodeCr_in_MaintenanceScreen_in_Transactions() {
		return enter_GLCodeCr_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement enter_CifCodeCr_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_CifCodeCr_in_MaintenanceScreen_in_Transactions() {
		return enter_CifCodeCr_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_SL']")
	private WebElement enter_SerialCodeCr_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_SerialCodeCr_in_MaintenanceScreen_in_Transactions() {
		return enter_SerialCodeCr_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_CY']")
	private WebElement enter_Currency_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_Currency_in_MaintenanceScreen_in_Transactions() {
		return enter_Currency_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement enter_Amount_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_Amount_in_MaintenanceScreen_in_Transactions() {
		return enter_Amount_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement enter_BranchCodeDr_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_BranchCodeDr_in_MaintenanceScreen_in_Transactions() {
		return enter_BranchCodeDr_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement enter_GLCodeDr_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_GLCodeDr_in_MaintenanceScreen_in_Transactions() {
		return enter_GLCodeDr_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement enter_CIFCodeDr_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_CIFCodeDr_in_MaintenanceScreen_in_Transactions() {
		return enter_CIFCodeDr_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_SL']")
	private WebElement enter_SerialCodeDr_in_MaintenanceScreen_in_Transactions;

	public WebElement enter_SerialCodeDr_in_MaintenanceScreen_in_Transactions() {
		return enter_SerialCodeDr_in_MaintenanceScreen_in_Transactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.CHQ_NUM']")
	private WebElement enter_ChequeNumberinMaintenanceScreeninTransactions;

	public WebElement enter_ChequeNumberinMaintenanceScreeninTransactions() {
		return enter_ChequeNumberinMaintenanceScreeninTransactions;
	}

	@FindBy(xpath = "//button[@class='path-btn-def-access-progref  ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")
	private WebElement enter_savebuttoninMaintenanceScreeninTransactions;

	public WebElement enter_savebuttoninMaintenanceScreeninTransactions() {
		return enter_savebuttoninMaintenanceScreeninTransactions;
	}

	@FindBy(xpath = "//td[text()='KARTHIK']")
	private WebElement Transaction_maintanance_alertclickingUserId_7181;

	public WebElement Transaction_maintanance_alertclickingUserId_7181() {
		return Transaction_maintanance_alertclickingUserId_7181;
	}

	@FindBy(xpath = "//span[text()=' Send ']//parent::a")
	private WebElement Transaction_maintanance_alertclickingUserId_SendBtn_7181;

	public WebElement Transaction_maintanance_alertclickingUserId_SendBtn_7181() {
		return Transaction_maintanance_alertclickingUserId_SendBtn_7181;

	}

	///////////////// @CHTR_P2_271 param

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement check_ForceOverdraw;

	public WebElement check_ForceOverdraw() {
		return check_ForceOverdraw;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement uncheck_theproceedonInsufficientFund;

	public WebElement uncheck_theproceedonInsufficientFund() {
		return uncheck_theproceedonInsufficientFund;
	}

	@FindBy(xpath = "//select[@name='transactiontypesCO.ctstrxtypeVO.CHQ_RELATED']")
	private WebElement click_HouseChequeinChequeDropdown;

	public WebElement click_HouseChequeinChequeDropdown() {
		return click_HouseChequeinChequeDropdown;
	}

	@FindBy(xpath = "//input[@id='allow_modify_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_7181;
	}

	@FindBy(xpath = "//a[@id='P024MA']/span")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_7181;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_7181() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_7181;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_7181;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_7181() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_7181;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_7181;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_7181() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_7181;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_so_chrg_schema_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_7181;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_7181() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_7181;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_7181;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_7181() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_7181;
	}

	@FindBy(xpath = "//a[@id='P024P']/span")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_7181;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_7181() {
		return Parameters_SystemParameters_TransactionType_Approve_7181;
	}

	////// CHTR_P2_141_CR core

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_closeSymbol_7181;

	public WebElement CSMCore_closeSymbol_7181() {
		return CSMCore_closeSymbol_7181;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions_7181;

	public WebElement Transactions_7181() {
		return Transactions_7181;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']/span")
	private WebElement Transactions_Maintenance_TrxTypeSearch_7181;

	public WebElement Transactions_Maintenance_TrxTypeSearch_7181() {
		return Transactions_Maintenance_TrxTypeSearch_7181;
	}

	@FindBy(xpath = "//input[@id='gridtab_trx_type_D001MT_gs_CODE']")
	private WebElement Transactions_Maintenance_TrxType_7181;

	public WebElement Transactions_Maintenance_TrxType_7181() {
		return Transactions_Maintenance_TrxType_7181;
	}

	@FindBy(xpath = "//a[@id='D001MT']/span[text()='Maintenance']")
	private WebElement Transactions_Maintenance_7181;

	public WebElement Transactions_Maintenance_7181() {
		return Transactions_Maintenance_7181;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_7181;

	public WebElement getTransactionNumber_7181() {
		return getTransactionNumber_7181;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement Transactions_Approve_ApproveBtn_7181;

	public WebElement Transactions_Approve_ApproveBtn_7181() {
		return Transactions_Approve_ApproveBtn_7181;
	}

	@FindBy(xpath = "//span[text()='Apply to Void Inward Cheques']")
	private WebElement Transactions_ApplyVoidInwardCheques_7181;

	public WebElement Transactions_ApplyVoidInwardCheques_7181() {
		return Transactions_ApplyVoidInwardCheques_7181;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VIL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApplyVoidInwardCheques_Code_7181;

	public WebElement Transactions_ApplyVoidInwardCheques_Code_7181() {
		return Transactions_ApplyVoidInwardCheques_Code_7181;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001VIL']")
	private WebElement Transactions_ApplyVoidInwardCheques_VoidReason_7181;

	public WebElement Transactions_ApplyVoidInwardCheques_VoidReason_7181() {
		return Transactions_ApplyVoidInwardCheques_VoidReason_7181;
	}

	@FindBy(xpath = "//span[contains(text(),' Apply to void inward Cheque ')]")
	private WebElement Transactions_VoidingInwardCheques_ApplyVoidBtn_7181;

	public WebElement Transactions_VoidingInwardCheques_ApplyVoidBtn_7181() {
		return Transactions_VoidingInwardCheques_ApplyVoidBtn_7181;
	}

	@FindBy(xpath = "//span[contains(text(),'Voiding  Inward Cheques')]")
	private WebElement Transactions_VoidingInwardCheques_7181;

	public WebElement Transactions_VoidingInwardCheques_7181() {
		return Transactions_VoidingInwardCheques_7181;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001OD_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_VoidingInwardCheques_Code_7181;

	public WebElement Transactions_VoidingInwardCheques_Code_7181() {
		return Transactions_VoidingInwardCheques_Code_7181;
	}

	@FindBy(xpath = "//div[@id='trxMgmtToolBar_D001OD']//span[contains(text(),' Voiding Inward Cheques ')]")
	private WebElement Transactions_VoidingInwardCheques_VoidingBtn_7181;

	public WebElement Transactions_VoidingInwardCheques_VoidingBtn_7181() {
		return Transactions_VoidingInwardCheques_VoidingBtn_7181;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement Transactions_Maintenance_SaveBtn_7181;

	public WebElement Transactions_Maintenance_SaveBtn_7181() {
		return Transactions_Maintenance_SaveBtn_7181;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate_71811;

	public WebElement CSMUseButtonInChangeRunningDate() {
		return CSM_UseButtonInChangeRunningDate_71811;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_71811;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_71811;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_71811;

	public WebElement CSMCloseButtonInChangeRunningDate() {
		return CSM_CloseButtonInChangeRunningDate_71811;
	}

	@FindBy(xpath = "(//span[text()='close'])[2]")
	private WebElement CSMCore_closeSymbol_615;

	public WebElement CSMCorecloseSymbol615() {
		return CSMCore_closeSymbol_615;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement enterTrxtypeinApproveScreenMultiChequesEntry;

	public WebElement enterTrxtypeinApproveScreenMultiChequesEntry() {
		return enterTrxtypeinApproveScreenMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement enterBranchCodeCRinApproveScreenMultiChequesEntry;

	public WebElement enterBranchCodeCRinApproveScreenMultiChequesEntry() {
		return enterBranchCodeCRinApproveScreenMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement enterCurrencyCodeCRinApproveScreenMultiChequesEntry;

	public WebElement enterCurrencyCodeCRinApproveScreenMultiChequesEntry() {
		return enterCurrencyCodeCRinApproveScreenMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement enterGLCodeCRinApproveScreenMultiChequesEntry;

	public WebElement enterGLCodeCRinApproveScreenMultiChequesEntry() {
		return enterGLCodeCRinApproveScreenMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement enterCIFCodeCRinApproveScreenMultiChequesEntry;

	public WebElement enterCIFCodeCRinApproveScreenMultiChequesEntry() {
		return enterCIFCodeCRinApproveScreenMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement enterSerialCodeCRinApproveScreenMultiChequesEntry;

	public WebElement enterSerialCodeCRinApproveScreenMultiChequesEntry() {
		return enterSerialCodeCRinApproveScreenMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement EnterReferanceNumberinApproveScreenMultiChequesEntry;

	public WebElement EnterReferanceNumberinApproveScreenMultiChequesEntry() {
		return EnterReferanceNumberinApproveScreenMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement EnterTotalNumberofChequesinApproveScreenMaintenanceinMultiChequesEntry;

	public WebElement EnterTotalNumberofChequesinApproveScreenMaintenanceinMultiChequesEntry() {
		return EnterTotalNumberofChequesinApproveScreenMaintenanceinMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement EnterSumofChequesinApproveScreeninMultiChequesEntry;

	public WebElement EnterSumofChequesinApproveScreeninMultiChequesEntry() {
		return EnterSumofChequesinApproveScreeninMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement clickthecheckboxflag;

	public WebElement clickthecheckboxflag() {
		return clickthecheckboxflag;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement clickproceedbuttoninApproveScreenMaintenanceinMultiChequesEntry;

	public WebElement clickproceedbuttoninApproveScreenMaintenanceinMultiChequesEntry() {
		return clickproceedbuttoninApproveScreenMaintenanceinMultiChequesEntry;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMOkButtonInInformationPopUpMenu_7181;

	public WebElement CSMOkButtonInInformationPopUpMenu_7181() {
		return CSMOkButtonInInformationPopUpMenu_7181;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement CSMParam_TransactionType_UPA;

	public WebElement CSMParam_TransactionType_UPA() {
		return CSMParam_TransactionType_UPA;
	}

	@FindBy(xpath = "//div[contains(text(),'Confirm Delete Process')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csm_Delete_ConfirmationOkButton;

	public WebElement csmDeleteConfirmationOkButton() {
		return csm_Delete_ConfirmationOkButton;
	}

	@FindBy(xpath = "//label[contains(text(),'Approve ')]//ancestor::button")
	private WebElement csm_ApproveBtnWithLabel;

	public WebElement csmApproveBtnWithLabel() {
		return csm_ApproveBtnWithLabel;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSMTechnicalDetailsIcon_7181;

	public WebElement CSMTechnicalDetailsIcon_7181() {
		return CSMTechnicalDetailsIcon_7181;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon_7181;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_7181() {
		return CSM_ClearCacheInTechnicalDetailsIcon_7181;

	}

	@FindBy(xpath = "//input[@id='cc_maintain_serial_no_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD;
	}

	@FindBy(xpath = "//a[@id='D001ZN']//span[text()='Cancel']")
	private WebElement Transactions_Cancel_609;

	public WebElement Transactions_Cancel_609() {
		return Transactions_Cancel_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001ZN_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Cancel_Code_609;

	public WebElement Transactions_Cancel_Code_609() {
		return Transactions_Cancel_Code_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001ZN']//td[text()='10385']

	@FindBy(xpath = "//select[@id='holdReason_D001ZN']")
	private WebElement Transactions_Cancel_Reason_609;

	public WebElement Transactions_Cancel_Reason_609() {
		return Transactions_Cancel_Reason_609;
	}// 1

	@FindBy(xpath = "//span[contains(text(),' Cancel ')]")
	private WebElement Transactions_Cancel_CancelBtn_609;

	public WebElement Transactions_Cancel_CancelBtn_609() {
		return Transactions_Cancel_CancelBtn_609;
	}

	@FindBy(xpath = "//a[@id='D001CN']//span[text()='Approve Cancel']")
	private WebElement Transactions_ApproveCancel_609;

	public WebElement Transactions_ApproveCancel_609() {
		return Transactions_ApproveCancel_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001CN_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApproveCancel_Code_609;

	public WebElement Transactions_ApproveCancel_Code_609() {
		return Transactions_ApproveCancel_Code_609;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001CN']//td[text()='10387'])[1]

	@FindBy(xpath = "//span[contains(text(),' Approve Cancel ')]")
	private WebElement Transactions_ApproveCancel_ApproveCancelBtn_609;

	public WebElement Transactions_ApproveCancel_ApproveCancelBtn_609() {
		return Transactions_ApproveCancel_ApproveCancelBtn_609;
	}

	@FindBy(xpath = "//input[@id='allow_proceed_pdc_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_Update_PostDatedCheques_609;

	public WebElement Parameters_SystemParameters_TransactionType_Update_PostDatedCheques_609() {
		return Parameters_SystemParameters_TransactionType_Update_PostDatedCheques_609;
	}

	@FindBy(xpath = "//a[@id='D001VCL']//span")
	private WebElement Transactions_ApplyVoidHouseCheques_609;

	public WebElement Transactions_ApplyVoidHouseCheques_609() {
		return Transactions_ApplyVoidHouseCheques_609;
	}

	@FindBy(xpath = "//div[@id='trxMgmtToolBar_D001VCL']//span")
	private WebElement Transactions_ApplyVoidHouseCheques_ApplyVoidHouseChequesBtn_609;

	public WebElement Transactions_ApplyVoidHouseCheques_ApplyVoidHouseChequesBtn_609() {
		return Transactions_ApplyVoidHouseCheques_ApplyVoidHouseChequesBtn_609;
	}

	@FindBy(xpath = "//a[@id='D001VC']//span[text()='Void House Cheques']")
	private WebElement Transactions_VoidHouseCheques_609;

	public WebElement Transactions_VoidHouseCheques_609() {
		return Transactions_VoidHouseCheques_609;
	}

	@FindBy(xpath = "//div[@id='trxMgmtToolBar_D001VC']//span")
	private WebElement Transactions_VoidHouseCheques_VoidBtn_609;

	public WebElement Transactions_VoidHouseCheques_VoidBtn_609() {
		return Transactions_VoidHouseCheques_VoidBtn_609;
	}

	@FindBy(xpath = "//A[@id='D001VOL']//span")
	private WebElement Transactions_ApplyVoidOutwardCheques_609;

	public WebElement Transactions_ApplyVoidOutwardCheques_609() {
		return Transactions_ApplyVoidOutwardCheques_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VOL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApplyVoidOutwardCheques_Code;

	public WebElement Transactions_ApplyVoidOutwardCheques_Code() {
		return Transactions_ApplyVoidOutwardCheques_Code;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001VOL']")
	private WebElement Transactions_ApplyVoidOutwardCheques_VoidReason;

	public WebElement Transactions_ApplyVoidOutwardCheques_VoidReason() {
		return Transactions_ApplyVoidOutwardCheques_VoidReason;
	}
	// 182

	@FindBy(xpath = "//div[@id='trxMgmtToolBar_D001VOL']//span")
	private WebElement Transactions_VoidingOutwardCheques_ApplyVoidBtn;

	public WebElement Transactions_VoidingOutwardCheques_ApplyVoidBtn() {
		return Transactions_VoidingOutwardCheques_ApplyVoidBtn;
	}

	@FindBy(xpath = "//A[@id='D001VO']//span")
	private WebElement Transactions_VoidingOutwardCheques_609;

	public WebElement Transactions_VoidingOutwardCheques_609() {
		return Transactions_VoidingOutwardCheques_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VO_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_VoidingOutwardCheques_Code;

	public WebElement Transactions_VoidingOutwardCheques_Code() {
		return Transactions_VoidingOutwardCheques_Code;
	}

	@FindBy(xpath = "//div[@id='trxMgmtToolBar_D001VO']//span")
	private WebElement Transactions_VoidingOutwardCheques_VoidingBtn;

	public WebElement Transactions_VoidingOutwardCheques_VoidingBtn() {
		return Transactions_VoidingOutwardCheques_VoidingBtn;
	}

	@FindBy(xpath = "//input[@id='apply_transfer_yn_P024MA']")
	private WebElement trxtype_ApplyTransfer_flag_604;

	public WebElement trxtype_ApplyTransfer_flag_604() {
		return trxtype_ApplyTransfer_flag_604;
	}

	@FindBy(xpath = "//input[@id='linktoother_trx_proceed_P024MA']")
	private WebElement trxtype_AllowtoProceedIfAlreadyLinked_flag_604;

	public WebElement trxtype_AllowtoProceedIfAlreadyLinked_flag_604() {
		return trxtype_AllowtoProceedIfAlreadyLinked_flag_604;
	}

	@FindBy(xpath = "//input[@id='linktoother_trx_P024MA']")
	private WebElement trxtype_linktoothertransaction_flag_604;

	public WebElement trxtype_linktoothertransaction_flag_604() {
		return trxtype_linktoothertransaction_flag_604;
	}

	@FindBy(xpath = "//a[@id='b_link_transaction_P024MA']")
	private WebElement trxtype_linktransaction_button_604;

	public WebElement trxtype_linktransaction_button_604() {
		return trxtype_linktransaction_button_604;
	}

	@FindBy(id = "add_tab46_GridTbl_Id_P024MA")
	private WebElement trxtype_linktransaction_button_Add_604;

	public WebElement trxtype_linktransaction_button_Add_604() {
		return trxtype_linktransaction_button_Add_604;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeLinkvo.LINKED_TRX']")
	private WebElement trxtype_linktransaction_button_Add_type_604;

	public WebElement trxtype_linktransaction_button_Add_type_604() {
		return trxtype_linktransaction_button_Add_type_604;
	}

	@FindBy(id = "ok_btn_47_P024MA")
	private WebElement trxtype_linktransaction_button_Add_ok_604;

	public WebElement trxtype_linktransaction_button_Add_ok_604() {
		return trxtype_linktransaction_button_Add_type_604;
	}

	@FindBy(id = "transactionTypes_tab_otherInfo_P024MA")
	private WebElement trxtype_otherinfo_tab_604;

	public WebElement trxtype_otherinfo_tab_604() {
		return trxtype_otherinfo_tab_604;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_additional_template_entries_P024MA']")
	private WebElement trxtype_otherinfo_template_604;

	public WebElement trxtype_otherinfo_template_604() {
		return trxtype_otherinfo_template_604;
	}

	// Sprint-69
	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code;
	}

	@FindBy(xpath = "//a[@id='accountCharges_btn_P024MA']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_Account_Charges_Btn;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_Account_Charges_Btn() {
		return SystemParameters_TransactionType_UpdateAfterApprove_Account_Charges_Btn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.BRANCH_CODE']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_BranchCode;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_BranchCode() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_BranchCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.CURRENCY_CODE']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_CurrencyCode;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_CurrencyCode() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_CurrencyCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.GL_CODE']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_GLCode;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_GLCode() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_GLCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.CIF_SUB_NO']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_CIFCode;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_CIFCode() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_CIFCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.SL_NO']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_SerialNo;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_SerialNo() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_SerialNo;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.CHARGE_CODE']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_ChargeCode;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_ChargeCode() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_ChargeCode;
	}

	@FindBy(xpath = "//select[contains(@id,'ctstrxtypeChargesVO.CHARGES_CY_POLICY')]")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_ChargeCYPolicy;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_ChargeCYPolicy() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_ChargeCYPolicy;
	}

	@FindBy(xpath = "//select[contains(@id,'ctstrxtypeChargesVO.CASH_ACCOUNT')]")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_Cash_Account;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_Cash_Account() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_Cash_Account;
	}

	@FindBy(xpath = "//select[contains(@id,'ctstrxtypeChargesVO.ACTION_TYPE')]")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_Action_Type;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_Action_Type() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_Action_Type;
	}

	@FindBy(xpath = "//td[@id='add_tab24_GridTbl_Id_P024MA']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_AddBtn;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_AddBtn() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_AddBtn;
	}

	@FindBy(xpath = "//td[@id='del_tab24_GridTbl_Id_P024MA']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_DeleteBtn;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_DeleteBtn() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_DeleteBtn;
	}

	@FindBy(xpath = "//button[@id='ok_btn_18_P024MA']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_Ok_Btn;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_Ok_Btn() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AccountCharges_Ok_Btn;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_Code;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_Code() {
		return Parameters_SystemParameters_TransactionType_Approve_Code;
	}

	@FindBy(xpath = "//input[@id='allow_change_clearing_acc_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowClearingAccount;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowClearingAccount() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowClearingAccount;
	}

	@FindBy(xpath = "//input[@id='rqst_cy_nomination_det_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination;
	}

	@FindBy(xpath = "//div[@id='panel_3_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AvailableOptionforDeduct_Section;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AvailableOptionforDeduct_Section() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AvailableOptionforDeduct_Section;
	}

	@FindBy(xpath = "//input[@id='deduct_cash_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails_Cash_Flag;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails_Cash_Flag() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails_Cash_Flag;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromDebtorAccount_Radio;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromDebtorAccount_Radio() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromDebtorAccount_Radio;
	}

	@FindBy(xpath = "//div[@ID='panel_6_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_Section;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_Section() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_Section;
	}

	@FindBy(xpath = "//input[@id='dflt_starting_dt_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate_Flag;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate_Flag() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate_Flag;
	}

	@FindBy(xpath = "((//td[@class='vAlignTop'])[2]//td)[1]//a")
	private WebElement TransactionType_UpdateAfterApprove_AllowedGL;

	public WebElement TransactionType_UpdateAfterApprove_AllowedGL() {
		return TransactionType_UpdateAfterApprove_AllowedGL;
	}

	@FindBy(xpath = "//td[@id='del_tab38_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AllowedGL_Deleteicon;

	public WebElement TransactionType_UpdateAfterApprove_AllowedGL_Deleteicon() {
		return TransactionType_UpdateAfterApprove_AllowedGL_Deleteicon;
	}

	@FindBy(xpath = "((//td[@class='vAlignTop'])[2]//td)[2]//a")
	private WebElement TransactionType_UpdateAfterApprove_AllowedCifTypes;

	public WebElement TransactionType_UpdateAfterApprove_AllowedCifTypes() {
		return TransactionType_UpdateAfterApprove_AllowedCifTypes;
	}

	@FindBy(xpath = "//td[@id='del_tab39_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AllowedCifTypes_Deleteicon;

	public WebElement TransactionType_UpdateAfterApprove_AllowedCifTypes_Deleteicon() {
		return TransactionType_UpdateAfterApprove_AllowedCifTypes_Deleteicon;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_BranchCode;

	public WebElement Transactions_Maintenance_BranchCode() {
		return Transactions_Maintenance_BranchCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement csm_CurencyCode_Debit;

	public WebElement csm_CurencyCode_Debit() {
		return csm_CurencyCode_Debit;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement csm_GLCode_Debit;

	public WebElement csm_GLCode_Debit() {
		return csm_GLCode_Debit;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement csm_CIFCode_Debit;

	public WebElement csm_CIFCode_Debit() {
		return csm_CIFCode_Debit;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement csm_SerialNumber_Debit;

	public WebElement csm_SerialNumber_Debit() {
		return csm_SerialNumber_Debit;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement CSM_Transactions_Maintenance_TRX_Type_Input;

	public WebElement CSM_Transactions_Maintenance_TRX_Type_Input() {
		return CSM_Transactions_Maintenance_TRX_Type_Input;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement CSM_Transactions_Maintenance_Currency_Input;

	public WebElement CSM_Transactions_Maintenance_Currency_Input() {
		return CSM_Transactions_Maintenance_Currency_Input;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement CSM_Transactions_Maintenance_Amount_input;

	public WebElement CSM_Transactions_Maintenance_Amount_input() {
		return CSM_Transactions_Maintenance_Amount_input;
	}

	@FindBy(xpath = "//label[@id='lbl_amount_D001MT']")
	private WebElement CSM_Transactions_Maintenance_Amount_field_label;

	public WebElement CSM_Transactions_Maintenance_Amount_field_label() {
		return CSM_Transactions_Maintenance_Amount_field_label;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement CSM_Transactions_Maintanance_ChequeNo_Input;

	public WebElement CSM_Transactions_Maintanance_ChequeNo_Input() {
		return CSM_Transactions_Maintanance_ChequeNo_Input;
	}

	@FindBy(xpath = "//input[@id='chq_date_D001MT']")
	private WebElement CSM_Transactions_Maintanance_ChequeDate_Input;

	public WebElement CSM_Transactions_Maintanance_ChequeDate_Input() {
		return CSM_Transactions_Maintanance_ChequeDate_Input;
	}

	@FindBy(xpath = "//button[@id='ok_btn_34_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AllowedGL_Ok_Btn;

	public WebElement TransactionType_UpdateAfterApprove_AllowedGL_Ok_Btn() {
		return TransactionType_UpdateAfterApprove_AllowedGL_Ok_Btn;
	}

	@FindBy(xpath = "//button[@id='ok_btn_35_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AllowedCIF_Ok_Btn;

	public WebElement TransactionType_UpdateAfterApprove_AllowedCIF_Ok_Btn() {
		return TransactionType_UpdateAfterApprove_AllowedCIF_Ok_Btn;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_CreditBranchCode;

	public WebElement Transactions_Maintenance_CreditBranchCode() {
		return Transactions_Maintenance_CreditBranchCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001MT']")
	private WebElement Transactions_Maintenance_CreditCurrencyCode;

	public WebElement Transactions_Maintenance_CreditCurrencyCode() {
		return Transactions_Maintenance_CreditCurrencyCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_CreditGlCode;

	public WebElement Transactions_Maintenance_CreditGlCode() {
		return Transactions_Maintenance_CreditGlCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CreditCifCode;

	public WebElement Transactions_Maintenance_CreditCifCode() {
		return Transactions_Maintenance_CreditCifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_CreditSerialNo;

	public WebElement Transactions_Maintenance_CreditSerialNo() {
		return Transactions_Maintenance_CreditSerialNo;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trs_cy_D001MT']/span")
	private WebElement Transactions_Maintenance_CurrencySearch;

	public WebElement Transactions_Maintenance_CurrencySearch() {
		return Transactions_Maintenance_CurrencySearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_cy_D001MT_gs_CURRENCY_CODE']")
	private WebElement Transactions_Maintenance_Currency_CurrencyCode;

	public WebElement Transactions_Maintenance_Currency_CurrencyCode() {
		return Transactions_Maintenance_Currency_CurrencyCode;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']//div[@class='jMsgbox-contentWrap']")
	private WebElement Transaction_success_popup_text_msg;

	public WebElement Transaction_success_popup_text_msg() {
		return Transaction_success_popup_text_msg;
	}

	@FindBy(xpath = "//div[contains(text(),'2073')]")
	private WebElement CSM_Transaction_maintanance_ValidateChequeBackwardDate;

	public WebElement CSM_Transaction_maintanance_ValidateChequeBackwardDate() {
		return CSM_Transaction_maintanance_ValidateChequeBackwardDate;
	}

	@FindBy(xpath = "//input[@id='back_dated_vdate_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_BackDated_value_date_flag;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_BackDated_value_date_flag() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_BackDated_value_date_flag;
	}

	@FindBy(xpath = "//input[@id='post_dated_vdate_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PostDated_value_date_flag;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PostDated_value_date_flag() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PostDated_value_date_flag;
	}

	@FindBy(xpath = "//div[contains(text(),'909')]")
	private WebElement CSM_Transaction_maintanance_ValidateChequePostDated;

	public WebElement CSM_Transaction_maintanance_ValidateChequePostDated() {
		return CSM_Transaction_maintanance_ValidateChequePostDated;
	}

	@FindBy(xpath = "//input[@id='void_on_insuff_bal_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_VoidwheninsufficientFund_Flag;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_VoidwheninsufficientFund_Flag() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_VoidwheninsufficientFund_Flag;
	}

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_flag;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_flag() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_flag;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_flag;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_flag() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_flag;
	}

	@FindBy(xpath = "//div[contains(text(),'Amount Exceeds Available Balance in Account')]")
	private WebElement Transaction_AmountExceeds_Warning_Popup;

	public WebElement Transaction_AmountExceeds_Warning_Popup() {
		return Transaction_AmountExceeds_Warning_Popup;
	}

	@FindBy(xpath = "//input[@id='proceed_drawn_checks_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques;
	}

	@FindBy(xpath = "//input[@id='check_lostfound_cheque_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeLost;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeLost() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeLost;
	}

	@FindBy(xpath = "//input[@id='check_lostfound_cheque_1_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeLost__forInward;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeLost__forInward() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeLost__forInward;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Approve_Code;

	public WebElement Transactions_Approve_Code() {
		return Transactions_Approve_Code;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VCL_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transactions_Apply_to_Void_House_Cheque_Code_Input;

	public WebElement CSM_Transactions_Apply_to_Void_House_Cheque_Code_Input() {
		return CSM_Transactions_Apply_to_Void_House_Cheque_Code_Input;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001VCL']")
	private WebElement Transactions_ApplyVoidHouseCheques_VoidReason_dropdown;

	public WebElement Transactions_ApplyVoidHouseCheques_VoidReason_dropdown() {
		return Transactions_ApplyVoidHouseCheques_VoidReason_dropdown;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001VCL']//button)[1]")
	private WebElement Transactions_ApplyVoidHouseCheque_screen_ApplyVoidHouseCheques_button;

	public WebElement Transactions_ApplyVoidHouseCheque_screen_ApplyVoidHouseCheques_button() {
		return Transactions_ApplyVoidHouseCheque_screen_ApplyVoidHouseCheques_button;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VC_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_VoidHouseCheques_Code_Input;

	public WebElement Transactions_VoidHouseCheques_Code_Input() {
		return Transactions_VoidHouseCheques_Code_Input;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001VC']//button)[1]")
	private WebElement Transactions_VoidHouseCheques_screen_Void_button;

	public WebElement Transactions_VoidHouseCheques_screen_Void_button() {
		return Transactions_VoidHouseCheques_screen_Void_button;
	}

	/////////////
	@FindBy(xpath = "((//td[@class='vAlignTop'])[1]//td)[6]//a")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus;
	}

	@FindBy(xpath = "//td[@id='add_tab31_GridTbl_Id_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Addicon;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Addicon() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab31_GridTbl_Id_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Delete_icon;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Delete_icon() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Delete_icon;
	}

	@FindBy(xpath = "//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='AND/OR']//select")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_AndOr;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_AndOr() {
		return TransactionType_UpdateAfterApprove_TrxStatus_AndOr;
	}// 1

	@FindBy(xpath = "(//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='Priority']//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Priority;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Priority() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Priority;
	}

	@FindBy(xpath = "//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='Status Code']//input")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_StatusCode;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_StatusCode() {
		return TransactionType_UpdateAfterApprove_TrxStatus_StatusCode;
	}

	@FindBy(xpath = "//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='User Level']//input")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_UserLevel;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_UserLevel() {
		return TransactionType_UpdateAfterApprove_TrxStatus_UserLevel;
	}

	@FindBy(xpath = "//button[@id='ok_btn_25_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Trx_Status_Ok_Btn;

	public WebElement TransactionType_UpdateAfterApprove_Trx_Status_Ok_Btn() {
		return TransactionType_UpdateAfterApprove_Trx_Status_Ok_Btn;
	}

	@FindBy(xpath = "//input[@id='show_void_button_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Show_Void_button_in_alert_window_flag;

	public WebElement TransactionType_UpdateAfterApprove_Show_Void_button_in_alert_window_flag() {
		return TransactionType_UpdateAfterApprove_Show_Void_button_in_alert_window_flag;
	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_Popup_TRXNo_Input;

	public WebElement BMUser_Alert_Popup_TRXNo_Input() {
		return BMUser_Alert_Popup_TRXNo_Input;
	}

	@FindBy(xpath = "//input[@id='jqg_trsAckTOutAlertGrid_Id_RCVALERT_1']")
	private WebElement BMUser_Alert_Popup_Select_First_record_checkbox;

	public WebElement BMUser_Alert_Popup_Select_First_record_checkbox() {
		return BMUser_Alert_Popup_Select_First_record_checkbox;
	}

	@FindBy(xpath = "//a[@id='openBut_RCVALERT']")
	private WebElement BMUser_Alert_Popup_OpenItems_Button_link;

	public WebElement BMUser_Alert_Popup_OpenItems_Button_link() {
		return BMUser_Alert_Popup_OpenItems_Button_link;
	}

	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement BMUser_Alert_Popup_OpenItems_Approve_button;

	public WebElement BMUser_Alert_Popup_OpenItems_Approve_button() {
		return BMUser_Alert_Popup_OpenItems_Approve_button;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001AU_ALERT']")
	private WebElement BMUser_Alert_Popup_OpenItems_Void_Reason_Dropdown;

	public WebElement BMUser_Alert_Popup_OpenItems_Void_Reason_Dropdown() {
		return BMUser_Alert_Popup_OpenItems_Void_Reason_Dropdown;
	}

	@FindBy(xpath = "//a[@id='trxMgntAlertVoidButton_RCVALERT']")
	private WebElement BMUser_Alert_Popup_OpenItems_Void_button;

	public WebElement BMUser_Alert_Popup_OpenItems_Void_button() {
		return BMUser_Alert_Popup_OpenItems_Void_button;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-open_item_div_RCVALERT']//parent::div//a")
	private WebElement BMUser_Alert_Popup_ApproveItems_Screen_Close_button;

	public WebElement BMUser_Alert_Popup_ApproveItems_Screen_Close_button() {
		return BMUser_Alert_Popup_ApproveItems_Screen_Close_button;
	}

	@FindBy(xpath = "//button[@id='closeRcvAlertBtn_RCVALERT']")
	private WebElement BMUser_Alert_Popup_Close_button;

	public WebElement BMUser_Alert_Popup_Close_button() {
		return BMUser_Alert_Popup_Close_button;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_Maintenance_Search_Btn;

	public WebElement Transactions_Maintenance_Search_Btn() {
		return Transactions_Maintenance_Search_Btn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Maintenance_Searchgrid_Transaction_No_Input;

	public WebElement Transactions_Maintenance_Searchgrid_Transaction_No_Input() {
		return Transactions_Maintenance_Searchgrid_Transaction_No_Input;
	}

	@FindBy(xpath = "//input[@id='current_status_D001MT']")
	private WebElement Transactions_Maintenance_screen_Status_field;

	public WebElement Transactions_Maintenance_screen_Status_field() {
		return Transactions_Maintenance_screen_Status_field;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_flag;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_flag() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_flag;
	}

	@FindBy(xpath = "//div[contains(text(),'1742')]")
	private WebElement CSM_Transaction_maintanance_Validate_Invalid_Missing_ChequeAccountNo_popup;

	public WebElement CSM_Transaction_maintanance_Validate_Invalid_Missing_ChequeAccountNo_popup() {
		return CSM_Transaction_maintanance_Validate_Invalid_Missing_ChequeAccountNo_popup;
	}

	@FindBy(xpath = "//div[contains(text(),'Missing Cheque Account')]")
	private WebElement CSM_Transaction_maintanance_Validate_Invalid_Missing_ChequeAcc_popup;

	public WebElement CSM_Transaction_maintanance_Validate_Invalid_Missing_ChequeAcc_popup() {
		return CSM_Transaction_maintanance_Validate_Invalid_Missing_ChequeAcc_popup;
	}

	@FindBy(xpath = "//div[contains(text(),'Missing Cheque/Document Number')]")
	private WebElement CSM_Transaction_maintanance_Validate_Invalid_Missing_Cheque_Document_No_popup;

	public WebElement CSM_Transaction_maintanance_Validate_Invalid_Missing_Cheque_Document_No_popup() {
		return CSM_Transaction_maintanance_Validate_Invalid_Missing_Cheque_Document_No_popup;
	}

	// sprint 70 ajith
	@FindBy(xpath = "//div[contains(text(),'Document stolen/ Lost')]")
	private WebElement csm_Transaction_Maintenance_documentstolenlost;

	public WebElement csm_Transaction_Maintenance_documentstolenlost() {
		return csm_Transaction_Maintenance_documentstolenlost;
	}

	@FindBy(xpath = "//input[@id='cc_maintain_serial_no_1_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD_forInward;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD_forInward() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD_forInward;
	}

	@FindBy(xpath = "//select[@id='authoriz_level_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Authorize_Level_Dropdown;

	public WebElement TransactionType_UpdateAfterApprove_Authorize_Level_Dropdown() {
		return TransactionType_UpdateAfterApprove_Authorize_Level_Dropdown;
	}

	// drawn
	@FindBy(xpath = "//div[contains(text(),'Cheque is already drawn')]")
	private WebElement CSM_Transaction_maintanance_Validate_Cheque_Drawn_popup;

	public WebElement CSM_Transaction_maintanance_Validate_Cheque_Drawn_popup() {
		return CSM_Transaction_maintanance_Validate_Cheque_Drawn_popup;
	}

//	Lost & Found management
	@FindBy(id = "accBr_N001MT")
	private WebElement Lost_and_Found_Management_Maintanance_Branch_Code_Input;

	public WebElement Lost_and_Found_Management_Maintanance_Branch_Code_Input() {
		return Lost_and_Found_Management_Maintanance_Branch_Code_Input;
	}

	@FindBy(id = "accCy_N001MT")
	private WebElement Lost_and_Found_Management_Maintanance_Currency_Code_Input;

	public WebElement Lost_and_Found_Management_Maintanance_Currency_Code_Input() {
		return Lost_and_Found_Management_Maintanance_Currency_Code_Input;
	}

	@FindBy(id = "accGl_N001MT")
	private WebElement Lost_and_Found_Management_Maintanance_GL_Code_Input;

	public WebElement Lost_and_Found_Management_Maintanance_GL_Code_Input() {
		return Lost_and_Found_Management_Maintanance_GL_Code_Input;
	}

	@FindBy(id = "accCif_N001MT")
	private WebElement Lost_and_Found_Management_Maintanance_CIF_Code_Input;

	public WebElement Lost_and_Found_Management_Maintanance_CIF_Code_Input() {
		return Lost_and_Found_Management_Maintanance_CIF_Code_Input;
	}

	@FindBy(id = "lookuptxt_accSl_N001MT")
	private WebElement Lost_and_Found_Management_Maintanance_Serial_No_Input;

	public WebElement Lost_and_Found_Management_Maintanance_Serial_No_Input() {
		return Lost_and_Found_Management_Maintanance_Serial_No_Input;
	}

	@FindBy(id = "lookuptxt_documentType_N001MT")
	private WebElement Lost_and_Found_Management_Maintanance_Document_Type_Input;

	public WebElement Lost_and_Found_Management_Maintanance_Document_Type_Input() {
		return Lost_and_Found_Management_Maintanance_Document_Type_Input;
	}

	@FindBy(id = "lookuptxt_documentCY_N001MT")
	private WebElement Lost_and_Found_Management_Maintanance_Document_CY_Input;

	public WebElement Lost_and_Found_Management_Maintanance_Document_CY_Input() {
		return Lost_and_Found_Management_Maintanance_Document_CY_Input;
	}

	@FindBy(id = "documentNo_N001MT")
	private WebElement Lost_and_Found_Management_Maintanance_Document_No_Input;

	public WebElement Lost_and_Found_Management_Maintanance_Document_No_Input() {
		return Lost_and_Found_Management_Maintanance_Document_No_Input;
	}

	@FindBy(id = "lostFound_Save_N001MT")
	private WebElement Lost_and_Found_Management_Maintanance_Save_Btn;

	public WebElement Lost_and_Found_Management_Maintanance_Save_Btn() {
		return Lost_and_Found_Management_Maintanance_Save_Btn;
	}

	@FindBy(id = "lostFoundMgmtGridTbl_Id_N001AP_gs_lostFoundDetVO.DOC_NUMBER")
	private WebElement Lost_and_Found_Management_Approve_Searchgrid_Doc_Number_Input;

	public WebElement Lost_and_Found_Management_Approve_Searchgrid_Doc_Number_Input() {
		return Lost_and_Found_Management_Approve_Searchgrid_Doc_Number_Input;
	}

	@FindBy(xpath = "//input[@id='lostFoundMgmtGridTbl_Id_N001AP_gs_lostFoundVO.DATE_REPORTED']")
	private WebElement Lost_and_Found_Management_Approve_Searchgrid_Reported_Date_Input;

	public WebElement Lost_and_Found_Management_Approve_Searchgrid_Reported_Date_Input() {
		return Lost_and_Found_Management_Approve_Searchgrid_Reported_Date_Input;
	}

	@FindBy(id = "td_lostFoundMgmtGridTbl_Id_N001AP_1_lostFoundVO.TRX_NO")
	private WebElement Lost_and_Found_Management_Approve_Searchgrid_First_Record;

	public WebElement Lost_and_Found_Management_Approve_Searchgrid_First_Record() {
		return Lost_and_Found_Management_Approve_Searchgrid_First_Record;
	}

	@FindBy(xpath = "//div[@id='lostFoundToolBar_N001AP']//button")
	private WebElement Lost_and_Found_Management_Approve_screen_Approve_button;

	public WebElement Lost_and_Found_Management_Approve_screen_Approve_button() {
		return Lost_and_Found_Management_Approve_screen_Approve_button;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VIL_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transactions_Apply_to_Void_Inward_Cheques_Code_Input;

	public WebElement CSM_Transactions_Apply_to_Void_Inward_Cheques_Code_Input() {
		return CSM_Transactions_Apply_to_Void_Inward_Cheques_Code_Input;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001VIL']")
	private WebElement Transactions_ApplyVoidInwardCheques_VoidReason_dropdown;

	public WebElement Transactions_ApplyVoidInwardCheques_VoidReason_dropdown() {
		return Transactions_ApplyVoidInwardCheques_VoidReason_dropdown;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001VIL']//button)[1]")
	private WebElement Transactions_ApplyVoidInwardCheques_screen_ApplyVoidInwardCheque_button;

	public WebElement Transactions_ApplyVoidInwardCheques_screen_ApplyVoidInwardCheque_button() {
		return Transactions_ApplyVoidInwardCheques_screen_ApplyVoidInwardCheque_button;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001OD_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_VoidindInwardCheques_Code_Input;

	public WebElement Transactions_VoidindInwardCheques_Code_Input() {
		return Transactions_VoidindInwardCheques_Code_Input;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001OD']//button)[1]")
	private WebElement Transactions_VoidindInwardCheques_screen_VoidindInwardCheques_button;

	public WebElement Transactions_VoidindInwardCheques_screen_VoidindInwardCheques_button() {
		return Transactions_VoidindInwardCheques_screen_VoidindInwardCheques_button;
	}

	@FindBy(xpath = "//select[@id='send_clear_entry_O001UP']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry;
	}

	@FindBy(xpath = "//input[@id='no_clearing_entries_O001UP']")
	private WebElement No_Clearing_Entries_Central_Bank_FlagInUpdateAfterControlRecord;

	public WebElement No_Clearing_Entries_Central_Bank_FlagInUpdateAfterControlRecord() {
		return No_Clearing_Entries_Central_Bank_FlagInUpdateAfterControlRecord;
	}

	@FindBy(id = "lookuptxt_bank_cif_D001MT")
	private WebElement CSM_Transactions_Maintanance_BankCIF_Br_Input;

	public WebElement CSM_Transactions_Maintanance_BankCIF_Br_Input() {
		return CSM_Transactions_Maintanance_BankCIF_Br_Input;
	}

//	Clearing Maintenance / Transfers
	@FindBy(id = "depositCheque_clearVoid_btn_I000TCV")
	private WebElement Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_Clear_Void_Btn;

	public WebElement Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_Clear_Void_Btn() {
		return Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_Clear_Void_Btn;
	}

	@FindBy(id = "td_depositChequesGridId_I000TCV_1_decimal_points")
	private WebElement Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_Records;

	public WebElement Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_Records() {
		return Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_Records;
	}

	@FindBy(xpath = "//select[contains(@id,'ctsBatchVO.STATUS_depositChequesGridId_I000TCV')]")
	private WebElement Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_TRX_Status_dropdown;

	public WebElement Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_TRX_Status_dropdown() {
		return Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_TRX_Status_dropdown;
	}

	@FindBy(id = "depositCheque_save_btn_I000TCV")
	private WebElement Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_Save_Btn;

	public WebElement Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_Save_Btn() {
		return Clearing_Maintenance_Transfers_Clearing_Voiding_Transfers_Save_Btn;
	}

	@FindBy(id = "authorizeClearingMaintForm_I000TAC_authorize_clear_specified_key")
	private WebElement Clearing_Maintenance_Transfers_Authorize_Clearing_Screen_Authorize_Clearing_Specified_Btn;

	public WebElement Clearing_Maintenance_Transfers_Authorize_Clearing_Screen_Authorize_Clearing_Specified_Btn() {
		return Clearing_Maintenance_Transfers_Authorize_Clearing_Screen_Authorize_Clearing_Specified_Btn;
	}

	@FindBy(id = "authorizeClearing_authorize_btn_I000TAC")
	private WebElement Clearing_Maintenance_Transfers_Authorize_Clearing_Screen_Authorize_Btn;

	public WebElement Clearing_Maintenance_Transfers_Authorize_Clearing_Screen_Authorize_Btn() {
		return Clearing_Maintenance_Transfers_Authorize_Clearing_Screen_Authorize_Btn;
	}

//	Clearing Maintenance / Deposit Cheques
	@FindBy(id = "depositCheque_clearVoid_btn_I000DCV")
	private WebElement Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_Clear_Void_Btn;

	public WebElement Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_Clear_Void_Btn() {
		return Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_Clear_Void_Btn;
	}

	@FindBy(id = "td_depositChequesGridId_I000DCV_1_decimal_points")
	private WebElement Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_Records;

	public WebElement Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_Records() {
		return Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_Records;
	}

	@FindBy(xpath = "//select[contains(@id,'ctsBatchVO.STATUS_depositChequesGridId_I000DCV')]")
	private WebElement Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_TRX_Status_dropdown;

	public WebElement Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_TRX_Status_dropdown() {
		return Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_TRX_Status_dropdown;
	}

	@FindBy(id = "depositCheque_save_btn_I000DCV")
	private WebElement Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_Save_Btn;

	public WebElement Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_Save_Btn() {
		return Clearing_Maintenance_Deposit_Cheques_Clearing_Voiding_Deposits_Save_Btn;
	}

	@FindBy(id = "authorizeClearingMaintForm_I000DAC_authorize_clear_specified_key")
	private WebElement Clearing_Maintenance_Deposit_Cheques_Authorize_Clearing_Screen_Authorize_Clearing_Specified_Btn;

	public WebElement Clearing_Maintenance_Deposit_Cheques_Authorize_Clearing_Screen_Authorize_Clearing_Specified_Btn() {
		return Clearing_Maintenance_Deposit_Cheques_Authorize_Clearing_Screen_Authorize_Clearing_Specified_Btn;
	}

	@FindBy(id = "authorizeClearing_authorize_btn_I000DAC")
	private WebElement Clearing_Maintenance_Deposit_Cheques_Authorize_Clearing_Screen_Authorize_Btn;

	public WebElement Clearing_Maintenance_Deposit_Cheques_Authorize_Clearing_Screen_Authorize_Btn() {
		return Clearing_Maintenance_Deposit_Cheques_Authorize_Clearing_Screen_Authorize_Btn;
	}

//	Charges
	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn;
	}

	@FindBy(xpath = "//div[@id='jqgh_chargesParamList_GridTbl_Id_C0011MA_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Searchgird_Head_Code;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Searchgird_Head_Code() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Searchgird_Head_Code;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code;
	}

	@FindBy(xpath = "//input[@id='amount_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011P_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn;
	}

	@FindBy(id = "chargesSchemaParamList_GridTbl_Id_C0012MA_gs_ctschargesSchemaVO.CODE")
	private WebElement SystemParameters_Charges_MaintenanceofChargesSchema_UpdateAfterApprove_Code;

	public WebElement SystemParameters_Charges_MaintenanceofChargesSchema_UpdateAfterApprove_Code() {
		return SystemParameters_Charges_MaintenanceofChargesSchema_UpdateAfterApprove_Code;
	}

	@FindBy(xpath = "//span[text()=' Define Charges Schema ']//parent::a")
	private WebElement SystemParameters_Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Btn;

	public WebElement SystemParameters_Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Btn() {
		return SystemParameters_Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Btn;
	}

	@FindBy(id = "add_tab23_GridTbl_Id_C0012MA")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Add_Btn;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Add_Btn() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Add_Btn;
	}

	@FindBy(id = "del_tab23_GridTbl_Id_C0012MA")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Delete_Btn;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Delete_Btn() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Delete_Btn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschargesSchemaVO.CHARGE_CODE']")
	private WebElement MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_ChargeCode_Input;

	public WebElement MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_ChargeCode_Input() {
		return MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_ChargeCode_Input;
	}

	@FindBy(xpath = "//button[@id='ok_btn_1_C0012MA']")
	private WebElement MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Ok_Btn;

	public WebElement MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Ok_Btn() {
		return MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargesSchema_Ok_Btn;
	}

	@FindBy(xpath = "//label[@id='chargesSchemaParamMaint_FormId_C0012MA_Update_After_Approve_key']")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_Screen_UpdateAfterApprove_Btn;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_Screen_UpdateAfterApprove_Btn() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_Screen_UpdateAfterApprove_Btn;
	}

	@FindBy(id = "chargesSchemaParamList_GridTbl_Id_C0012P_gs_ctschargesSchemaVO.CODE")
	private WebElement Charges_MaintenanceofChargesSchema_Approve_Screen_Searchgrid_Code_input;

	public WebElement Charges_MaintenanceofChargesSchema_Approve_Screen_Searchgrid_Code_input() {
		return Charges_MaintenanceofChargesSchema_Approve_Screen_Searchgrid_Code_input;
	}

	@FindBy(xpath = "//label[@id='chargesSchemaParamMaint_FormId_C0012P_Approve_key']")
	private WebElement Charges_MaintenanceofChargesSchema_Approve_Screen_Approve_Btn;

	public WebElement Charges_MaintenanceofChargesSchema_Approve_Screen_Approve_Btn() {
		return Charges_MaintenanceofChargesSchema_Approve_Screen_Approve_Btn;
	}

	@FindBy(xpath = "//input[@id='reasonsList_GridTbl_Id_P0032MA_gs_ctsreasonsVO.CODE']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_Code;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_Code() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_Code;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_charges_schema_P0032MA']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema;
	}

	@FindBy(xpath = "//input[@id='deduct_avail_charges_P0032MA']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge;
	}

	@FindBy(xpath = "//label[@id='reasonsMaint_FormId_P0032MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn;
	}

	@FindBy(xpath = "//input[@id='reasonsList_GridTbl_Id_P0032P_gs_ctsreasonsVO.CODE']")
	private WebElement Parameters_SystemParameters_Reason_Approve_Code;

	public WebElement Parameters_SystemParameters_Reason_Approve_Code() {
		return Parameters_SystemParameters_Reason_Approve_Code;
	}

	@FindBy(xpath = "//label[@id='reasonsMaint_FormId_P0032P_Approve_key']")
	private WebElement Parameters_SystemParameters_Reason_Approve_ApproveBtn;

	public WebElement Parameters_SystemParameters_Reason_Approve_ApproveBtn() {
		return Parameters_SystemParameters_Reason_Approve_ApproveBtn;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_void_reason_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ChequeInfo_VoidReason_input;

	public WebElement TransactionType_UpdateAfterApprove_ChequeInfo_VoidReason_input() {
		return TransactionType_UpdateAfterApprove_ChequeInfo_VoidReason_input;
	}

	@FindBy(xpath = "//div[contains(text(),'Amount Exceeds Available Balance in Account')]//ancestor::div//input")
	private WebElement Transaction_AmountExceeds_Warning_Popup_Ok_Btn;

	public WebElement Transaction_AmountExceeds_Warning_Popup_Ok_Btn() {
		return Transaction_AmountExceeds_Warning_Popup_Ok_Btn;
	}

	@FindBy(xpath = "//button[@id='btnCharges_D001MT']")
	private WebElement Transactions_Maintenance_Screen_Charges_button;

	public WebElement Transactions_Maintenance_Screen_Charges_button() {
		return Transactions_Maintenance_Screen_Charges_button;
	}

	@FindBy(xpath = "//table[@id='trxMgntBatchGridTbl_Id_D001MT']//table[contains(@id,'trxMgntBatchGridTbl_Id_D001MT')]//tr[2]")
	private WebElement Transactions_Maintenance_Screen_Charges_table_ChargeValues;

	public WebElement Transactions_Maintenance_Screen_Charges_table_ChargeValues() {
		return Transactions_Maintenance_Screen_Charges_table_ChargeValues;
	}

	// sprint aug 9
	@FindBy(xpath = "//div[@id='multiChequesEntyDetToolBar_D001CEMT']//span")
	private WebElement ClickSave_in_Maintenance_in_MultiChequesEntry;

	public WebElement ClickSave_in_Maintenance_in_MultiChequesEntry() {
		return ClickSave_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//button[@id='proceed_D001CEMT']")
	private WebElement Cickproceed_in_Maintenance_in_MultiChequesEntry;

	public WebElement Cickproceed_in_Maintenance_in_MultiChequesEntry() {
		return Cickproceed_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(id = "spanLookup_bank_cif_D001MT")
	private WebElement Transactions_Maintenance_Bank_CIF_BR_searchBtn;

	public WebElement Transactions_Maintenance_Bank_CIF_BR_searchBtn() {
		return Transactions_Maintenance_Bank_CIF_BR_searchBtn;
	}

	@FindBy(id = "gridtab_bank_cif_D001MT_gs_BRANCH_CODE")
	private WebElement Transactions_Maintenance_Bank_CIF_BR_Branch_Code_Input;

	public WebElement Transactions_Maintenance_Bank_CIF_BR_Branch_Code_Input() {
		return Transactions_Maintenance_Bank_CIF_BR_Branch_Code_Input;
	}

	@FindBy(xpath = "//div[@id='memoDiv_P024MA']//parent::div//span[text()='close']")
	private WebElement View_Memo_Popup_Close_Btn;

	public WebElement View_Memo_Popup_Close_Btn() {
		return View_Memo_Popup_Close_Btn;
	}

//	Apply to Clear Inward Cheques
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AC_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_Maintanance_ApplytoClearInward_TransactionNO;

	public WebElement CSM_Transaction_Maintanance_ApplytoClearInward_TransactionNO() {
		return CSM_Transaction_Maintanance_ApplytoClearInward_TransactionNO;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001AC']//button)[1]")
	private WebElement CSM_Transaction_Maintanance_ApplytoClearInward_Button;

	public WebElement CSM_Transaction_Maintanance_ApplytoClearInward_Button() {
		return CSM_Transaction_Maintanance_ApplytoClearInward_Button;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001E_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_TransactionNO;

	public WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_TransactionNO() {
		return CSM_Transaction_Maintanance_ClearingInwardCheque_TransactionNO;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001E']//button)[1]")
	private WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_Button;

	public WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_Button() {
		return CSM_Transaction_Maintanance_ClearingInwardCheque_Button;
	}

	@FindBy(xpath = "//a[text()='Account is overdrawn']")
	private WebElement BMUser_Alert_Popup_Open_Items_Account_Overdrawn_Popup;

	public WebElement BMUser_Alert_Popup_Open_Items_Account_Overdrawn_Popup() {
		return BMUser_Alert_Popup_Open_Items_Account_Overdrawn_Popup;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div/div[@class='jMsgbox-titleWrap']")
	private WebElement CSM_Success_Message_Popup;

	public WebElement CSM_Success_Message_Popup() {
		return CSM_Success_Message_Popup;
	}

	@FindBy(xpath = "//input[@id='proceed_drawn_checks_1_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques_ForInward;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques_ForInward() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques_ForInward;
	}

//	*****
	@FindBy(id = "instructionsColl_P017MA")
	private WebElement CSMParam_AccountParameters_AccountTypes_UpdateAfterApprove_Instructions_Section;

	public WebElement CSMParam_AccountParameters_AccountTypes_UpdateAfterApprove_Instructions_Section() {
		return CSMParam_AccountParameters_AccountTypes_UpdateAfterApprove_Instructions_Section;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017MA_Update_After_Approve_key']")
	private WebElement CSMParam_AccountParameters_AccountTypes_UpdateAfterApprove_Update_button;

	public WebElement CSMParam_AccountParameters_AccountTypes_UpdateAfterApprove_Update_button() {
		return CSMParam_AccountParameters_AccountTypes_UpdateAfterApprove_Update_button;
	}

	@FindBy(xpath = "//a[@id='b_if_amount_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MainDetails_IfAmountLessThan_Btn;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MainDetails_IfAmountLessThan_Btn() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MainDetails_IfAmountLessThan_Btn;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstrxtypeOverdrawAmountVO.CURRENCY_CODE_lookuptxt_tab44_GridTbl_Id_P024MA')]")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Currency_Code;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Currency_Code() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Currency_Code;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstrxtypeOverdrawAmountVO.AMOUNT')]")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Amount_input;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Amount_input() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Amount_input;
	}

	@FindBy(xpath = "//td[@id='add_tab44_GridTbl_Id_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_AddNew_Btn;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_AddNew_Btn() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_AddNew_Btn;
	}

	@FindBy(xpath = "//td[@id='del_tab44_GridTbl_Id_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Delete_Btn;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Delete_Btn() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Delete_Btn;
	}

	@FindBy(xpath = "//button[@id='ok_btn_4_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Ok_Btn;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Ok_Btn() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan_Ok_Btn;
	}

//	Sept - 19
	@FindBy(xpath = "//a[@id='transactionTypes_tab_additionalinfo_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Additional_Info_Tab;

	public WebElement TransactionType_UpdateAfterApprove_Additional_Info_Tab() {
		return TransactionType_UpdateAfterApprove_Additional_Info_Tab;
	}

	@FindBy(xpath = "//td[@id='add_tab12_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Addicon;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Addicon() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab12_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Deleteicon;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Deleteicon() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Deleteicon;
	}

	@FindBy(xpath = "//input[contains(@id,'ACC_BR_lookuptxt_tab12_GridTbl_Id_P024MA')]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_BranchCode;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_BranchCode() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_BranchCode;
	}

	@FindBy(xpath = "//input[contains(@id,'ACC_CY_lookuptxt_tab12_GridTbl_Id_P024MA')]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CurrencyCode;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CurrencyCode() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CurrencyCode;
	}

	@FindBy(xpath = "//input[contains(@id,'ACC_GL_lookuptxt_tab12_GridTbl_Id_P024MA')]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_GlCode;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_GlCode() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_GlCode;
	}

	@FindBy(xpath = "//input[contains(@id,'ACC_CIF_lookuptxt_tab12_GridTbl_Id_P024MA')]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CifCode;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CifCode() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CifCode;
	}

	@FindBy(xpath = "//input[contains(@id,'ACC_SL_lookuptxt_tab12_GridTbl_Id_P024MA')]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Serialno;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Serialno() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Serialno;
	}

	@FindBy(xpath = "//input[contains(@id,'TRX_DEFAULT_ACC')]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Default_flag;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Default_flag() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Default_flag;
	}

}
