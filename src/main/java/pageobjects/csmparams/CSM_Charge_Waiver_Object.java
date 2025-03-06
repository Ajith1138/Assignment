package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Charge_Waiver_Object {
	WebDriver driver;

	public CSM_Charge_Waiver_Object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement Chequebook1;

	public WebElement Chequebook1() {
		return Chequebook1;
	}

	@FindBy(xpath = "//td[text()='Cards Management']")
	private WebElement CardManagement_CSM_Card;

	public WebElement CardManagement_CSM_Card() {
		return CardManagement_CSM_Card;
	}

	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement Destroyed_cheque;

	public WebElement Destroyed_cheque() {
		return Destroyed_cheque;
	}

	@FindBy(xpath = "//td[text()='Card Request']")
	private WebElement Card_request;

	public WebElement Card_request() {

		return Card_request;

	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement Destroyed_code;

	public WebElement Destroyed_code() {
		return Destroyed_code;
	}

	@FindBy(xpath = "//input[@name='FROM_NUMBER']")
	private WebElement DestroyedFromNumber2;

	public WebElement DestroyedFromNumber2() {
		return DestroyedFromNumber2;
	}

	@FindBy(xpath = "//input[@name='NUMBER_TO']")
	private WebElement DestroyedToNumber2;

	public WebElement DestroyedToNumber2() {
		return DestroyedToNumber2;
	}

	@FindBy(xpath = "//label[text()='To Destroy ']")
	private WebElement ToDestroy;

	public WebElement ToDestroy() {
		return ToDestroy;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement okBUTTON;

	public WebElement okBUTTON() {
		return okBUTTON;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement House_Cheque_Transaction;

	public WebElement House_Cheque_Transaction() {
		return House_Cheque_Transaction;
	}

	@FindBy(xpath = "//input[@id='show_void_button_P024MA']")
	private WebElement Void_show_button_Uncheck_Transaction;

	public WebElement Void_show_button_Uncheck_Transaction() {
		return Void_show_button_Uncheck_Transaction;
	}

	@FindBy(xpath = "// (//table[@id='trxTypeGroupList_GridTbl_Id_P0057MA']//td[text()='181'])[1]")
	private WebElement Doubleclick_withdraw_Transaction;

	public WebElement Doubleclick_withdraw_Transaction() {
		return Doubleclick_withdraw_Transaction;
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

	@FindBy(xpath = "//input[@id='cc_maintain_serial_no_P024MA']")
	private WebElement Check_cheque_validity_Withdraw;

	public WebElement Check_cheque_validity_Withdraw() {
		return Check_cheque_validity_Withdraw;
	}

	@FindBy(xpath = "td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE")
	private WebElement Double_click_Aprrove_cheque;

	public WebElement Double_click_Aprrove_cheque() {
		return Double_click_Aprrove_cheque;
	}

	@FindBy(xpath = "//input[@id='void_on_insuff_bal_P024MA']")
	private WebElement Void_on_insuffent_Fund;

	public WebElement Void_on_insuffent_Fund() {
		return Void_on_insuffent_Fund;
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

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo_cards;

	public WebElement BMUser_Alert_EnterTRXNo_cards() {
		return BMUser_Alert_EnterTRXNo_cards;
	}

	@FindBy(xpath = "//td[@id='td_trsAckTOutAlertGrid_Id_RCVALERT_1_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord;

	public WebElement BMUserAlertEnterTRXNoselectRecord() {
		return BMUser_Alert_EnterTRXNo_selectRecord;
	}

	@FindBy(xpath = "//a[@id='openBut_RCVALERT']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems;
	}

	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey() {

		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;
	}

	@FindBy(xpath = "//input[@id='allow_proceed_pdc_P024MA']")
	private WebElement Allow_processed_on_post_data_transaction;

	public WebElement Allow_processed_on_post_data_transaction() {

		return Allow_processed_on_post_data_transaction;
	}

	@FindBy(xpath = "//table[@id='transactionTypesList_GridTbl_Id_P024MA']")
	private WebElement DoubleClick_transactioncodechanged;

	public WebElement DoubleClick_transactioncodechanged() {

		return DoubleClick_transactioncodechanged;
	}

	@FindBy(xpath = "//input[@id='backdated_chq_P024MA']")
	private WebElement Allow_processed_on_back_data_transaction;

	public WebElement Allow_processed_on_back_data_transaction() {

		return Allow_processed_on_back_data_transaction;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Code_Transaction_typer;

	public WebElement Code_Transaction_typer() {
		return Code_Transaction_typer;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement CSM_BranchCodeINdebitAc;

	public WebElement CSM_BranchCodeINdebitAc() {
		return CSM_BranchCodeINdebitAc;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement CSM_CurrencyCodedebitAc;

	public WebElement CSM_CurrencyCodedebitAc() {
		return CSM_CurrencyCodedebitAc;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement CSM_GLCodedebitAc;

	public WebElement CSM_GLCodedebitAc() {
		return CSM_GLCodedebitAc;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement Cheque_code_chequebookRequest;

	public WebElement Cheque_code_chequebookRequest() {
		return Cheque_code_chequebookRequest;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement CSM_CIFCodeIndebitAc;

	public WebElement CSM_CIFCodeIndebitAc() {
		return CSM_CIFCodeIndebitAc;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement CSM_SerialIndebitAc;

	public WebElement CSM_SerialIndebitAc() {
		return CSM_SerialIndebitAc;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001RE']")
	private WebElement currency_code_value;

	public WebElement currency_code_value() {
		return currency_code_value;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;

	public WebElement CSMDateToChangeTheCurrentDate() {
		return CSM_DateToChangeTheCurrentDate;
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

	@FindBy(xpath = "//span[text()='Bulk Remittance']")
	private WebElement bulkRemittance_Transaction;

	public WebElement bulkRemittance_Transaction() {
		return bulkRemittance_Transaction;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement Bulk_Type_Transaction;

	public WebElement Bulk_Type_Transaction() {
		return Bulk_Type_Transaction;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement TrX_Type_Transaction;

	public WebElement TrX_Type_Transaction() {
		return TrX_Type_Transaction;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement TrX_Type_Transaction1;

	public WebElement TrX_Type_Transaction1() {
		return TrX_Type_Transaction1;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement TRX_BriefName_Transaction;

	public WebElement TRX_BriefName_Transaction() {
		return TRX_BriefName_Transaction;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement TRX_Code_Transaction;

	public WebElement TRX_Code_Transaction() {
		return TRX_Code_Transaction;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement SystemParametersbutton;

	public WebElement SystemParametersbutton() {
		return SystemParametersbutton;
	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement user_Transfer;

	public WebElement user_Transfer() {
		return user_Transfer;
	}

	@FindBy(xpath = "//a[@id='E000MA']")
	private WebElement updateAfterApproveInUser;

	public WebElement updateAfterApproveInUser() {
		return updateAfterApproveInUser;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement userIdInApproveScreen;

	public WebElement userIdInApproveScreen() {
		return userIdInApproveScreen;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement user_update_approve_IdInApproveScreen;

	public WebElement user_update_approve_IdInApproveScreen() {
		return user_update_approve_IdInApproveScreen;
	}

	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID']")
	private WebElement doubleClickUserInUpdateAfterApprove;

	public WebElement doubleClickUserInUpdateAfterApprove() {
		return doubleClickUserInUpdateAfterApprove;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_2_ctstrxtypeVO.CODE']")
	private WebElement doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE;

	public WebElement doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE() {
		return doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit;

	public WebElement doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit() {
		return doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_2_ctstrxtypeVO.CODE']")
	private WebElement DdoubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit2;

	public WebElement DdoubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit2() {
		return DdoubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit2;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_2_ctstrxtypeVO.CODE']")
	private WebElement doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_Autoapprove;

	public WebElement doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_Autoapprove() {
		return doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_Autoapprove;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cif_no_E000MA']")
	private WebElement CIF_Number_Transaction;

	public WebElement CIF_Number_Transaction() {
		return CIF_Number_Transaction;
	}

	@FindBy(xpath = "//select[@id='forbid_trs_on_its_acc_E000MA']")
	private WebElement Dont_Allow_onthis_TRX_transaction_User;

	public WebElement Dont_Allow_onthis_TRX_transaction_User() {
		return Dont_Allow_onthis_TRX_transaction_User;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement ParameterMainModule;

	public WebElement ParameterMainModule() {
		return ParameterMainModule;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParam_ParameterMainModule;

	public WebElement csmParamParameterMainModule() {
		return csmParam_ParameterMainModule;
	}

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement csmParam_AccountParameters;

	public WebElement csmParam_AccountParameters() {
		return csmParam_AccountParameters;
	}

	@FindBy(xpath = "//td[text()='Account Type']")
	private WebElement csmParam_AccountParameters_AccountTypes;

	public WebElement csmParam_AccountParameters_AccountTypes() {
		return csmParam_AccountParameters_AccountTypes;
	}

	@FindBy(xpath = "//td[text()='Account Type']/ancestor::a/following-sibling::ul//span[text()='Update After Approve']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPAField;

	public WebElement csmParam_AccountParameters_AccountTypes_UPAField() {
		return csmParam_AccountParameters_AccountTypes_UPAField;
	}

	@FindBy(xpath = "(//td[text()='55']//following::td[text()='Transfer intra'])[1]")
	private WebElement csmParam_Transactiontype_inputfield_doubleclickforTRS_064;

	public WebElement csmParam_Transactiontype_inputfield_doubleclickforTRS_064() {
		return csmParam_Transactiontype_inputfield_doubleclickforTRS_064;
	}

	@FindBy(xpath = "//td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;
	}

	@FindBy(xpath = "//input[@id='allow_overdrawn_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag() {
		return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;
	}

	@FindBy(xpath = "//div[@id='instructionsColl_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions() {
		return csmParam_AccountParameters_AccountTypes_Instructions;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_inputfield_doubleclick;

	public WebElement csmParam_Transactiontype_inputfield_doubleclick() {
		return csmParam_Transactiontype_inputfield_doubleclick;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017MA_Update_After_Approve_key']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton() {
		return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu;

	public WebElement CSMOkButtonInWarningPopUpMenu() {
		return CSM_OkButtonInWarningPopUpMenu;
	}

	@FindBy(xpath = "")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064;
	}

	@FindBy(xpath = "//td[text()='System Parameters']//parent::td")
	private WebElement Systemparameter;

	public WebElement Systemparameter() {
		return Systemparameter;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement ControlRecord_Tranfer72;

	public WebElement ControlRecord_Tranfer72() {
		return ControlRecord_Tranfer72;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement UpdateAfterApprove_Transaferbranch;

	public WebElement UpdateAfterApprove_Transaferbranch() {
		return UpdateAfterApprove_Transaferbranch;
	}

	@FindBy(xpath = "//a[text()=' Alert Activation ']")
	private WebElement AlertActivation_transferBranch;

	public WebElement AlertActivation_transferBranch() {
		return AlertActivation_transferBranch;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement UpdateAfterApprove_TransaferSubmit;

	public WebElement UpdateAfterApprove_TransaferSubmit() {
		return UpdateAfterApprove_TransaferSubmit;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Confirmokbutton72;

	public WebElement Confirmokbutton72() {
		return Confirmokbutton72;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Popupsuccessmsgbutton72;

	public WebElement Popupsuccessmsgbutton72() {
		return Popupsuccessmsgbutton72;
	}// span[text()='0030-Special User auth on
		// O/D']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_21_ctscontrolAlertVO.ACTIVATE']//input

	@FindBy(xpath = "//span[text()='0030-Special User auth on O/D']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_21_ctscontrolAlertVO.ACTIVATE']//input")
	private WebElement Special_user_auto;

	public WebElement Special_user_auto() {
		return Special_user_auto;
	}

	@FindBy(xpath = "//span[text()='0026-No Signature Found']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_17_ctscontrolAlertVO.ACTIVATE']//input")
	private WebElement No_Signature_found;

	public WebElement No_Signature_found() {
		return No_Signature_found;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement ApprovebuttonAlert;

	public WebElement ApprovebuttonAlert() {
		return ApprovebuttonAlert;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement SubmitApproveAlert;

	public WebElement SubmitApproveAlert() {
		return SubmitApproveAlert;
	}

	@FindBy(xpath = "//input[@id='" + "_approve_within_limit_P024MA']")
	private WebElement AutoAprrovelimit;

	public WebElement AutoAprrovelimit() {
		return AutoAprrovelimit;
	}

	@FindBy(xpath = "//td[text()='User']")

	private WebElement sads_Parameters_User_Submenu_072;

	public WebElement sads_Parameters_User_Submenu_072()

	{

		return sads_Parameters_User_Submenu_072;

	}

	@FindBy(xpath = "//span[text()='Maintenance']")

	private WebElement sads_Parameters_User_Maintenance_072;

	public WebElement sads_Parameters_User_Maintenance_072()

	{

		return sads_Parameters_User_Maintenance_072;

	}

	@FindBy(id = "infoBarSearchButton_P005M")

	private WebElement sads_User_Maintenance_SearchIcon_072;

	public WebElement sads_User_Maintenance_SearchIcon_072()

	{

		return sads_User_Maintenance_SearchIcon_072;

	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement parametersMenu;

	public WebElement parametersMenu() {
		return parametersMenu;
	}

	@FindBy(id = "infoBarSearchButton_P005P")

	private WebElement sads_User_Maintenance_SearchIcon_0072;

	public WebElement sads_User_Maintenance_SearchIcon_0072()

	{

		return sads_User_Maintenance_SearchIcon_0072;

	}

	@FindBy(xpath = "//input[@name='USER_ID']")

	private WebElement sads_User_Maintenance_UserId_Input_072;

	public WebElement sads_User_Maintenance_UserId_Input_072()

	{

		return sads_User_Maintenance_UserId_Input_072;

	}

	@FindBy(id = "td_userListGridTbl_Id_P005M_1_usrVO.USER_ID")

	private WebElement sads_User_Maintenance_UserId_DoubleClick_072;

	public WebElement sads_User_Maintenance_UserId_DoubleClick_072()

	{

		return sads_User_Maintenance_UserId_DoubleClick_072;

	}

	@FindBy(id = "lookuptxt_CIF_NO_P005M")

	private WebElement sads_User_Maintenance_Cif_Input_072;

	public WebElement sads_User_Maintenance_Cif_Input_072()

	{

		return sads_User_Maintenance_Cif_Input_072;

	}

	@FindBy(id = "userFormId_P005M_Save_key")

	private WebElement sads_User_Maintenance_Save_Button_072;

	public WebElement sads_User_Maintenance_Save_Button_072()

	{

		return sads_User_Maintenance_Save_Button_072;

	}

	@FindBy(xpath = "//span[text()='Approve']")

	private WebElement sads_User_Approve_SubMenu_072;

	public WebElement sads_User_Approve_SubMenu_072()

	{

		return sads_User_Approve_SubMenu_072;

	}

	@FindBy(id = "userFormId_P005P_Approve_key")

	private WebElement sads_User_Approve_SubMenu_ApproveButton_072;

	public WebElement sads_User_Approve_SubMenu_ApproveButton_072()

	{

		return sads_User_Approve_SubMenu_ApproveButton_072;

	}

	@FindBy(xpath = "(//input[@id='_popup_path_sol_ok'])[1]")
	private WebElement pOPupmsg_AllUser;

	public WebElement pOPupmsg_AllUser() {
		return pOPupmsg_AllUser;
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

	@FindBy(id = "infoBarSearchButton_D001MT")
	private WebElement CSM_SearchButtonInMaintenanceScreen;

	public WebElement CSMSearchButtonInMaintenanceScreen() {
		return CSM_SearchButtonInMaintenanceScreen;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement CSM_SearchButtonInMaintenanceScreenApprove;

	public WebElement CSM_SearchButtonInMaintenanceScreenApprove() {
		return CSM_SearchButtonInMaintenanceScreenApprove;
	}
//			@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
//			private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;
//			public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday()
//			{
//			    return csmOkButtonForConfirmationPopUpForCompanyHoliday;
//			}

	@FindBy(id = "trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_EnterTheTransactionNoInSearchBox;

	public WebElement CSMEnterTheTransactionNoInSearchBox() {
		return CSM_EnterTheTransactionNoInSearchBox;
	}

	@FindBy(id = "trxMgntDefFormId_D001MT_Booked_Entries_key")
	private WebElement CSM_BookedEntriesInMaintenanceScreen;

	public WebElement CSMBookedEntriesInMaintenanceScreen() {
		return CSM_BookedEntriesInMaintenanceScreen;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInCreditAc;

	public WebElement CSMCIFCodeInCreditAc() {
		return CSM_CIFCodeInCreditAc;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg;

	public WebElement POPupmsg() {
		return POPupmsg;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement User_Approve_Tarnsaction;

	public WebElement User_Approve_Tarnsaction() {
		return User_Approve_Tarnsaction;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement submit_user_approve;

	public WebElement submit_user_approve() {
		return submit_user_approve;
	}

	@FindBy(xpath = "//select[@id='forbid_trs_on_its_acc_E000MA']")
	private WebElement donotallowaccount_User;

	public WebElement donotallowaccount_User() {
		return donotallowaccount_User;
	}

	@FindBy(xpath = "//input[@id='amount_D001RE']")
	private WebElement Amount_Bulk;

	public WebElement Amount_Bulk() {
		return Amount_Bulk;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Amount_Transaction;

	public WebElement Amount_Transaction() {
		return Amount_Transaction;
	}

	@FindBy(xpath = "//input[@id='remittance_fr_num_D001RE']")
	private WebElement remittance_from_number;

	public WebElement remittance_from_number() {
		return remittance_from_number;
	}

	@FindBy(xpath = "//button[@id='submit_1003271558']")
	private WebElement remittance_Save_button;

	public WebElement remittance_Save_button() {
		return remittance_Save_button;
	}

	@FindBy(xpath = "//td[@id='add_bulkRemittanceGridTbl_Id_D001RE']")
	private WebElement remittance_Add_button;

	public WebElement remittance_Add_button() {
		return remittance_Add_button;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_remittance_Type_D001RE']")
	private WebElement remittance_Type_Bulk;

	public WebElement remittance_Type_Bulk() {
		return remittance_Type_Bulk;
	}

	@FindBy(xpath = "//td[text()='Multi Cheques Entry']")
	private WebElement Multi_cheques_Entry;

	public WebElement Multi_cheques_Entry() {
		return Multi_cheques_Entry;
	}

	@FindBy(xpath = "(//span[text()='Maintenance'])[1]")
	private WebElement Maintenance_button;

	public WebElement Maintenance_button() {
		return Maintenance_button;
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

	@FindBy(xpath = "//select[@id='trsfr_type_P024MA']")
	private WebElement localtransactiontype_Transafer;

	public WebElement localtransactiontype_Transafer() {
		return localtransactiontype_Transafer;
	}

	@FindBy(xpath = "//select[@id='type_P024MA']")
	private WebElement SelectTransaction_Transafer;

	public WebElement SelectTransaction_Transafer() {
		return SelectTransaction_Transafer;
	}

	@FindBy(xpath = "//input[@id='multi_trx_P024MA']")
	private WebElement MultiTransafer_Trxr;

	public WebElement MultiTransafer_Trxr() {
		return MultiTransafer_Trxr;
	}

	@FindBy(xpath = "//input[@id='forbid_multi_cif_trx_P024MA']")
	private WebElement forbid_multi_Transafer;

	public WebElement forbid_multi_Transafer() {
		return forbid_multi_Transafer;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement label_update_after_Transafer;

	public WebElement label_update_after_Transafer() {
		return label_update_after_Transafer;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Transafer_Approve_SubMenu_072;

	public WebElement Transafer_Approve_SubMenu_072() {
		return Transafer_Approve_SubMenu_072;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement code_Approve_Transaction;

	public WebElement code_Approve_Transaction() {
		return code_Approve_Transaction;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement submitcode_Approve_Transaction;

	public WebElement submitcode_Approve_Transaction() {
		return submitcode_Approve_Transaction;
	}

	@FindBy(xpath = "//select[@id='trsfr_method_P024MA']")
	private WebElement Mode_of_payment_Transaction;

	public WebElement Mode_of_payment_Transaction() {
		return Mode_of_payment_Transaction;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Account_details_key']")
	private WebElement Account_details_Transaction;

	public WebElement Account_details_Transaction() {
		return Account_details_Transaction;
	}

	@FindBy(xpath = "//td[@id='add_chargesWaiverGrid_Id_A002MA']")
	private WebElement Add_Button_Transaction;

	public WebElement Add_Button_Transaction() {
		return Add_Button_Transaction;
	}

	@FindBy(xpath = "//input[@id='new_1695711075412_ctstrsACCDETVO.AC_GL']")
	private WebElement GL_Button_account_Transaction;

	public WebElement GL_Button_account_Transaction() {
		return GL_Button_account_Transaction;
	}

	@FindBy(xpath = "//input[@id='new_1695711075412_ctstrsACCDETVO.AC_CIF']")
	private WebElement CIF_Button_account_Transaction;

	public WebElement CIF_Button_account_Transaction() {
		return CIF_Button_account_Transaction;
	}

	@FindBy(xpath = "//input[@id='new_1695711075412_ctstrsACCDETVO.AC_SL_lookuptxt_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement Serial_Number_Button_Transaction;

	public WebElement Serial_Number_Button_Transaction() {
		return Serial_Number_Button_Transaction;
	}

	@FindBy(xpath = "//input[@id='new_1695711075412_ctstrsACCDETVO.FC_AMOUNT']")
	private WebElement Amount_Account_entervalue_Transaction;

	public WebElement Amount_Account_entervalue_Transaction() {
		return Amount_Account_entervalue_Transaction;
	}

	@FindBy(xpath = "//input[@id='new_1695711075412_ctstrsACCDETVO.INSTRUCTIONS1']")
	private WebElement Instructions1_Transaction;

	public WebElement Instructions1_Transaction() {
		return Instructions1_Transaction;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement Ok_button_Transaction;

	public WebElement Ok_button_Transaction() {
		return Ok_button_Transaction;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement Save_button_Transaction;

	public WebElement Save_button_Transaction() {
		return Save_button_Transaction;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_closeSymbol;

	public WebElement CSMCorecloseSymbol() {
		return CSMCore_closeSymbol;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement Proceed_on_fund;

	public WebElement Proceed_on_fund() {
		return Proceed_on_fund;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Transaction_code_value;

	public WebElement Transaction_code_value() {
		return Transaction_code_value;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO'")
	private WebElement Doubleclick_code_value;

	public WebElement Doubleclick_code_value() {
		return Doubleclick_code_value;
	}

	@FindBy(xpath = "//input[@id='release_date_D001MT']")
	private WebElement Date_format_end;

	public WebElement Date_format_end() {
		return Date_format_end;
	}

	@FindBy(xpath = "//input[@id='deduct_cash_P024MA']")
	private WebElement Cash_Transaction_type;

	public WebElement Cash_Transaction_type() {
		return Cash_Transaction_type;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA0']")
	private WebElement Cash_button_transaction;

	public WebElement Cash_button_transaction() {
		return Cash_button_transaction;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")

	private WebElement checkIfValueIsEntered;

	public WebElement checkIfValueIsEntered()

	{

		return checkIfValueIsEntered;

	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement CSMParam_TransactionType_Debtor_account;

	public WebElement CSMParam_TransactionType_Debtor_account() {
		return CSMParam_TransactionType_Debtor_account;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement CSMParam_TransactionType_Dubuct_Debtor_account;

	public WebElement CSMParam_TransactionType_Dubuct_Debtor_account() {
		return CSMParam_TransactionType_Dubuct_Debtor_account;
	}

	@FindBy(xpath = "//select[@id='auth_od_acc_E000MA']")
	private WebElement Select_Alert_CSMParam;

	public WebElement Select_Alert_CSMParam() {
		return Select_Alert_CSMParam;
	}

	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID']")
	private WebElement Doubleclick_userId_csm;

	public WebElement Doubleclick_userId_csm() {
		return Doubleclick_userId_csm;
	}

	@FindBy(xpath = "(//span[text()='Transactions']//parent::td//div)[1]")
	private WebElement CsmParam_controlrecord_AlertActive_Transaction;

	public WebElement CsmParam_controlrecord_AlertActive_Transaction() {
		return CsmParam_controlrecord_AlertActive_Transaction;
	}

	@FindBy(xpath = "//span[contains(text(),'No Signature Found')]//parent::td")

	private WebElement CsmParam_controlrecord_AlertActive_Transaction_NoSignatureFound;

	public WebElement CsmParam_controlrecord_AlertActive_Transaction_NoSignatureFound()

	{

		return CsmParam_controlrecord_AlertActive_Transaction_NoSignatureFound;

	}

	@FindBy(xpath = "//span[contains(text(),'No Signature Found')]//parent::td//following-sibling::td[1]/input")

	private WebElement CsmParam_controlrecord_AlertActive_Transaction_NoSignatureFoundCheckBox;

	public WebElement CsmParam_controlrecord_AlertActive_Transaction_NoSignatureFoundCheckBox()

	{

		return CsmParam_controlrecord_AlertActive_Transaction_NoSignatureFoundCheckBox;

	}

	@FindBy(xpath = "//span[contains(text(),'Special User auth on O/D')]//parent::td")

	private WebElement CsmParam_controlrecord_AlertActive_Transaction_specialUserAuthOnOD;

	public WebElement CsmParam_controlrecord_AlertActive_Transaction_specialUserAuthOnOD()

	{

		return CsmParam_controlrecord_AlertActive_Transaction_specialUserAuthOnOD;

	}

	@FindBy(xpath = "//span[contains(text(),'Special User auth on O/D')]//parent::td//following-sibling::td[1]/input")

	private WebElement CsmParam_controlrecord_AlertActive_Transaction_specialUserAuthOnODCheckBox;

	public WebElement CsmParam_controlrecord_AlertActive_Transaction_specialUserAuthOnODCheckBox()

	{

		return CsmParam_controlrecord_AlertActive_Transaction_specialUserAuthOnODCheckBox;

	}

	@FindBy(xpath = "//input[@id='new_1696501158380_ctstrsACCDETVO.AC_BR']")

	private WebElement CSM_Branch_code;

	public WebElement CSM_Branch_code()

	{

		return CSM_Branch_code;

	}

	@FindBy(xpath = "//input[@id='new_1696501158380_ctstrsACCDETVO.FC_AMOUNT']")

	private WebElement CSM_Amount_details;

	public WebElement CSM_Amount_details()

	{

		return CSM_Amount_details;

	}// input[@id='1x1x30_ctscontrolAlertVO.ACTIVATE_tab4_GridTbl_Id_O001UP']

	@FindBy(xpath = "//input[@id='1x1x26_ctscontrolAlertVO.ACTIVATE_tab4_GridTbl_Id_O001UP']")

	private WebElement CSM_Uncheckflag_Nospecial;

	public WebElement CSM_Uncheckflag_Nospecial()

	{

		return CSM_Uncheckflag_Nospecial;

	}

	@FindBy(xpath = "//input[@id='1x1x30_ctscontrolAlertVO.ACTIVATE_tab4_GridTbl_Id_O001UP']")

	private WebElement CSM_Uncheckflag_Nospecial_autoflag;

	public WebElement CSM_Uncheckflag_Nospecial_autoflag()

	{

		return CSM_Uncheckflag_Nospecial_autoflag;

	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")

	private WebElement BMUser_Alert_EnterTRXNo;

	public WebElement BMUserAlertEnterTRXNo()

	{

		return BMUser_Alert_EnterTRXNo;

	}

	@FindBy(xpath = "//input[@id='cr_dr_forex_P024MAD']")
	private WebElement Main_debit_CSMParam;

	public WebElement Main_debit_CSMParam() {
		return Main_debit_CSMParam;
	}

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement Force_overdarw_debit_CSMParam;

	public WebElement Force_overdarw_debit_CSMParam() {
		return Force_overdarw_debit_CSMParam;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Transaction_Type_CSMParam;

	public WebElement Transaction_Type_CSMParam() {
		return Transaction_Type_CSMParam;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement Update_after_approve_CSMParam;

	public WebElement Update_after_approve_CSMParam() {
		return Update_after_approve_CSMParam;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Transaction_Code_CSMParam;

	public WebElement Transaction_Code_CSMParam() {
		return Transaction_Code_CSMParam;
	}
	// Transaction

	@FindBy(xpath = "//input[@id='linktoother_trx_P024MA']")
	private WebElement Linked_Transaction_CSMParam;

	public WebElement Linked_Transaction_CSMParam() {
		return Linked_Transaction_CSMParam;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_linktoother_trx_type_P024MA']")
	private WebElement Transaction_Type_Linked_CSMParam;

	public WebElement Transaction_Type_Linked_CSMParam() {
		return Transaction_Type_Linked_CSMParam;
	}

	@FindBy(xpath = "//input[@id='link_on_creation_P024MA']")
	private WebElement Linked_To_within_Days_CSMParam;

	public WebElement Linked_To_within_Days_CSMParam() {
		return Linked_To_within_Days_CSMParam;
	}

	@FindBy(xpath = "//input[@id='trx_type_link_days_nbr_P024MA']")
	private WebElement Days_Transaction_CSMParam;

	public WebElement Days_Transaction_CSMParam() {
		return Days_Transaction_CSMParam;
	}

	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement Cancel_Transaction_Type;

	public WebElement Cancel_Transaction_Type() {
		return Cancel_Transaction_Type;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001ZN_gs_ctstrsVO.TRS_NO']")
	private WebElement Transaction_Number_Cancel_Transaction_Type;

	public WebElement Transaction_Number_Cancel_Transaction_Type() {
		return Transaction_Number_Cancel_Transaction_Type;
	}

	@FindBy(xpath = "//span[contains(text(), ' Cancel ')]")
	private WebElement Submit_Cancel_Transaction_Type;

	public WebElement Submit_Cancel_Transaction_Type() {
		return Submit_Cancel_Transaction_Type;
	}

	@FindBy(xpath = "//input[@id='valid_alrt_lmt_on_apprv_trx_yn_O001UP']")
	private WebElement Control_Record_vaildate_Alert;

	public WebElement Control_Record_vaildate_Alert() {
		return Control_Record_vaildate_Alert;
	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement Transaction_type_Deduct_account;

	public WebElement Transaction_type_Deduct_account() {
		return Transaction_type_Deduct_account;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Transaction_code_Transaction_Type;

	public WebElement Transaction_code_Transaction_Type() {
		return Transaction_code_Transaction_Type;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement Account_Deduct_radio_button;

	public WebElement Account_Deduct_radio_button() {
		return Account_Deduct_radio_button;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement Accounts_CSM;

	public WebElement Accounts_CSM() {
		return Accounts_CSM;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement GeneralAccounts_frontoffice;

	public WebElement GeneralAccounts_frontoffice() {
		return GeneralAccounts_frontoffice;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenance_Accounts_CSM_core;

	public WebElement Maintenance_Accounts_CSM_core() {
		return Maintenance_Accounts_CSM_core;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_CIF_Number;

	public WebElement Accounts_CIF_Number() {
		return Accounts_CIF_Number;
	}

	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002MA_1_amfVO.CIF_SUB_NO']")
	private WebElement Double_click_CIF_Number;

	public WebElement Double_click_CIF_Number() {
		return Double_click_CIF_Number;

	}

	@FindBy(xpath = "//input[@id='exemptFullChargesWaiver_A002MA']")
	private WebElement Exempt_Full_charge_waiver;

	public WebElement Exempt_Full_charge_waiver() {
		return Exempt_Full_charge_waiver;

	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement General_Account_Transaction_CSm;

	public WebElement General_Account_Transaction_CSm() {
		return General_Account_Transaction_CSm;

	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_waiver_charges_key']")
	private WebElement CSM_Core_Charges_Waiver;

	public WebElement CSM_Core_Charges_Waiver() {
		return CSM_Core_Charges_Waiver;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_A002MA']")
	private WebElement Total_exemtion_Accounts;

	public WebElement Total_exemtion_Accounts() {
		return Total_exemtion_Accounts;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_A002MA']")
	private WebElement Charges_Waiver_custom_Exemption;

	public WebElement Charges_Waiver_custom_Exemption() {
		return Charges_Waiver_custom_Exemption;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_A002MA']")
	private WebElement Average_Balance_Monthly;

	public WebElement Average_Balance_Monthly() {
		return Average_Balance_Monthly;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement Number_of_Chequebooks;

	public WebElement Number_of_Chequebooks() {
		return Number_of_Chequebooks;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement Chequebook_save_button;

	public WebElement Chequebook_save_button() {
		return Chequebook_save_button;
	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement csm_AddDetls_UAAscreen_under_TransactionType;

	public WebElement csm_AddDetls_UAAscreen_under_TransactionType() {
		return csm_AddDetls_UAAscreen_under_TransactionType;
	}

	@FindBy(xpath = "//span[text()='Available Options for Deduct I']")
	private WebElement csm_Avloptn_UAAscreen_under_TransactionType;

	public WebElement csm_Avloptn_UAAscreen_under_TransactionType() {
		return csm_Avloptn_UAAscreen_under_TransactionType;
	}

	@FindBy(xpath = "//label[@id='bulkRemittanceDetFormId_D001RE_Charges_key']")
	private WebElement Charges_button_BulkRemittance;

	public WebElement Charges_button_BulkRemittance() {
		return Charges_button_BulkRemittance;
	}

//				@FindBy(xpath="//input[@id='in_charged_cy_input_D001MT']")
//				private WebElement csm_inchargedCY_ChargesScreen_Maintenance_Transaction_80;
//				public WebElement csm_inchargedCY_ChargesScreen_Maintenance_Transaction_80() {
//					return csm_inchargedCY_ChargesScreen_Maintenance_Transaction_80;
//				}
//				@FindBy(xpath="//input[@id='waive_rate_input_D001MT']")
//				private WebElement csm_WaiveRate_ChargesScreen_Maintenance_Transaction_80;
//				public WebElement csm_WaiveRate_ChargesScreen_Maintenance_Transaction_80() {
//					return csm_WaiveRate_ChargesScreen_Maintenance_Transaction_80;
//				}
//				@FindBy(xpath="//label[@id='trxMgntDefFormId_D001MT_Waive_Charges_key']")
//				private WebElement csm_WaiveCharges_Maintenancescreen_under_Transaction_80;
//				public WebElement csm_WaiveCharges_Maintenancescreen_under_Transaction_80() {
//					return csm_WaiveCharges_Maintenancescreen_under_Transaction_80;
//				}
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRX_TYPE']")
	private WebElement Trx_Type_code_under_Bulk_remittance_type;

	public WebElement Trx_Type_code_under_Bulk_remittance_type() {
		return Trx_Type_code_under_Bulk_remittance_type;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Waive_Charges_key']")
	private WebElement Double_click_Bulk_remittncae_Approve;

	public WebElement Double_click_Bulk_remittncae_Approve() {
		return Double_click_Bulk_remittncae_Approve;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement GL_code_under_cheque_book;

	public WebElement GL_code_under_cheque_book() {
		return GL_code_under_cheque_book;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.ACC_CIF']")
	private WebElement Double_clickChequebook_Bulk_remittncae_Approve;

	public WebElement Double_clickChequebook_Bulk_remittncae_Approve() {
		return Double_clickChequebook_Bulk_remittncae_Approve;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Charges_key']")
	private WebElement Charges_under_ChargeDetails_Transaction;

	public WebElement Charges_under_ChargeDetails_Transaction() {
		return Charges_under_ChargeDetails_Transaction;
	}

	@FindBy(xpath = "//input[@id='in_charged_cy_input_D001MT']")
	private WebElement InChargedCY_Charges_under_ChargeDetails_Transaction;

	public WebElement InChargedCY_Charges_under_ChargeDetails_Transaction() {
		return InChargedCY_Charges_under_ChargeDetails_Transaction;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001MT']")
	private WebElement WaiveRate_Charges_under_ChargeDetails_Transaction;

	public WebElement WaiveRate_Charges_under_ChargeDetails_Transaction() {
		return WaiveRate_Charges_under_ChargeDetails_Transaction;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Waive_Charges_key']")
	private WebElement WaiveCharges_under_ChargeDetails_Transaction;

	public WebElement WaiveCharges_under_ChargeDetails_Transaction() {
		return WaiveCharges_under_ChargeDetails_Transaction;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_Transactions_Core;

	public WebElement csm_Transactions_Core() {
		return csm_Transactions_Core;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement csm_TRX_under_Maintainance_Transaction;

	public WebElement csm_TRX_under_Maintainance_Transaction() {
		return csm_TRX_under_Maintainance_Transaction;
	}

	@FindBy(xpath = "(//span[text()='Maintenance'])[2]")
	private WebElement csm_Maintanance_under_Transactions;

	public WebElement csm_Maintanance_under_Transactions() {
		return csm_Maintanance_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement csm_BranchCode_DebitACC_under_Transactions;

	public WebElement csm_BranchCode_DebitACC_under_Transactions() {
		return csm_BranchCode_DebitACC_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement csm_CurrencyCode_DebitACC_under_Transactions;

	public WebElement csm_CurrencyCode_DebitACC_under_Transactions() {
		return csm_CurrencyCode_DebitACC_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement csm_GLCode_DebitACC_under_Transactions;

	public WebElement csm_GLCode_DebitACC_under_Transactions() {
		return csm_GLCode_DebitACC_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement csm_CIFCode_DebitACC_under_Transactions;

	public WebElement csm_CIFCode_DebitACC_under_Transactions() {
		return csm_CIFCode_DebitACC_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement csm_SerialNo_DebitACC_under_Transactions;

	public WebElement csm_SerialNo_DebitACC_under_Transactions() {
		return csm_SerialNo_DebitACC_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement csm_Currency_CurrencyColumn_under_Transactions;

	public WebElement csm_Currency_CurrencyColumn_under_Transactions() {
		return csm_Currency_CurrencyColumn_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement csm_Amount_CurrencyColumn_Transactions;

	public WebElement csm_Amount_CurrencyColumn_Transactions() {
		return csm_Amount_CurrencyColumn_Transactions;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement csm_BranchCode_CreditACC_under_Transactions;

	public WebElement csm_BranchCode_CreditACC_under_Transactions() {
		return csm_BranchCode_CreditACC_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement csm_GLCode_CreditACC_under_Transactions;

	public WebElement csm_GLCode_CreditACC_under_Transactions() {
		return csm_GLCode_CreditACC_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement csm_CIFCode_CreditACC_under_Transactions;

	public WebElement csm_CIFCode_CreditACC_under_Transactions() {
		return csm_CIFCode_CreditACC_under_Transactions;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement csm_SerialNo_CreditACC_under_Transactions;

	public WebElement csm_SerialNo_CreditACC_under_Transactions() {
		return csm_SerialNo_CreditACC_under_Transactions;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement csm_SaveBtn_under_Maintainance_Transactions;

	public WebElement csm_SaveBtn_under_Maintainance_Transactions() {
		return csm_SaveBtn_under_Maintainance_Transactions;
	}

	@FindBy(xpath = "//span[text()='Bulk Remittance']")
	private WebElement transactions_Bulk_RemittanceScreen_615;

	public WebElement transactions_Bulk_RemittanceScreen_615() {
		return transactions_Bulk_RemittanceScreen_615;
	}

	@FindBy(xpath = "//select[@name='trxMgntCO.bulkRemittanceType']")
	private WebElement bulk_RemittanceScreen_RemittanceType_615;

	public WebElement bulk_RemittanceScreen_RemittanceType_615() {
		return bulk_RemittanceScreen_RemittanceType_615;
	}

	@FindBy(id = "lookuptxt_trx_type_D001RE")
	private WebElement bulk_RemittanceScreen_TrxType_615;

	public WebElement bulk_RemittanceScreen_TrxType_615() {
		return bulk_RemittanceScreen_TrxType_615;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TRS_AC_CY")
	private WebElement bulk_RemittanceScreen_CurrencyCodeInput_615;

	public WebElement bulk_RemittanceScreen_CurrencyCodeInput_615() {
		return bulk_RemittanceScreen_CurrencyCodeInput_615;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TRS_AC_GL")
	private WebElement bulk_RemittanceScreen_GlCodeInput_615;

	public WebElement bulk_RemittanceScreen_GlCodeInput_615() {
		return bulk_RemittanceScreen_GlCodeInput_615;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TRS_AC_CIF")
	private WebElement bulk_RemittanceScreen_CifNumberInput_615;

	public WebElement bulk_RemittanceScreen_CifNumberInput_615() {
		return bulk_RemittanceScreen_CifNumberInput_615;
	}

	@FindBy(id = "lookuptxt_trs_ac_sl_D001RE")
	private WebElement bulk_RemittanceScreen_SerialNoInput_615;

	public WebElement bulk_RemittanceScreen_SerialNoInput_615() {
		return bulk_RemittanceScreen_SerialNoInput_615;
	}

	@FindBy(id = "add_bulkRemittanceGridTbl_Id_D001RE")
	private WebElement bulk_RemittanceScreen_AddIcon_615;

	public WebElement bulk_RemittanceScreen_AddIcon_615() {
		return bulk_RemittanceScreen_AddIcon_615;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.AMOUNT")
	private WebElement bulk_RemittanceScreen_AmountInput_615;

	public WebElement bulk_RemittanceScreen_AmountInput_615() {
		return bulk_RemittanceScreen_AmountInput_615;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.REMITTANCE_FR_NUM")
	private WebElement bulk_RemittanceScreen_FromDateInputField_615;

	public WebElement bulk_RemittanceScreen_FromDateInputField_615() {
		return bulk_RemittanceScreen_FromDateInputField_615;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TO_TRS_AC_GL")
	private WebElement bulk_RemittanceScreen_InstrumentAcc_GlInput_615;

	public WebElement bulk_RemittanceScreen_InstrumentAcc_GlInput_615() {
		return bulk_RemittanceScreen_InstrumentAcc_GlInput_615;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TO_TRS_AC_CIF")
	private WebElement bulk_RemittanceScreen_InstrumentAcc_CifInput_615;

	public WebElement bulk_RemittanceScreen_InstrumentAcc_CifInput_615() {
		return bulk_RemittanceScreen_InstrumentAcc_CifInput_615;
	}

	@FindBy(id = "lookuptxt_to_trs_ac_sl_D001RE")
	private WebElement bulk_RemittanceScreen_InstrumentAcc_SerialNoInput_615;

	public WebElement bulk_RemittanceScreen_InstrumentAcc_SerialNoInput_615() {
		return bulk_RemittanceScreen_InstrumentAcc_SerialNoInput_615;
	}

	@FindBy(xpath = "//label[text()='Charges ']")
	private WebElement bulk_RemittanceScreen_ChargesButton_615;

	public WebElement bulk_RemittanceScreen_ChargesButton_615() {
		return bulk_RemittanceScreen_ChargesButton_615;
	}

	@FindBy(name = "trxMgntCO.newAmountInput")
	private WebElement bulk_RemittanceScreen_ChargesButton_NewAmountField_615;

	public WebElement bulk_RemittanceScreen_ChargesButton_NewAmountField_615() {
		return bulk_RemittanceScreen_ChargesButton_NewAmountField_615;
	}

	@FindBy(name = "trxMgntCO.inChargedCyInput")
	private WebElement bulk_RemittanceScreen_ChargesButton_CurrencyField_615;

	public WebElement bulk_RemittanceScreen_ChargesButton_CurrencyField_615() {
		return bulk_RemittanceScreen_ChargesButton_CurrencyField_615;
	}

	@FindBy(name = "trxMgntCO.waiveRateInput")
	private WebElement bulk_RemittanceScreen_ChargesButton_WaiveRateField_615;

	public WebElement bulk_RemittanceScreen_ChargesButton_WaiveRateField_615() {
		return bulk_RemittanceScreen_ChargesButton_WaiveRateField_615;
	}

	@FindBy(xpath = "//label[text()='Waive Charges ']")
	private WebElement bulk_RemittanceScreen_WaiveChargesButton_615;

	public WebElement bulk_RemittanceScreen_WaiveChargesButton_615() {
		return bulk_RemittanceScreen_WaiveChargesButton_615;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement bulk_RemittanceScreen_SaveButton_615;

	public WebElement bulk_RemittanceScreen_SaveButton_615() {
		return bulk_RemittanceScreen_SaveButton_615;
	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement Transaction_type_Deduct_account_615;

	public WebElement Transaction_type_Deduct_account_615() {
		return Transaction_type_Deduct_account_615;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement Account_Deduct_radio_button_615;

	public WebElement Account_Deduct_radio_button_615() {
		return Account_Deduct_radio_button_615;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement Accounts_CSM_615;

	public WebElement Accounts_CSM_615() {
		return Accounts_CSM_615;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenance_Accounts_CSM_core_615;

	public WebElement Maintenance_Accounts_CSM_core_615() {
		return Maintenance_Accounts_CSM_core_615;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement CIF_Number_Transaction_615;

	public WebElement CIF_Number_Transaction_615() {
		return CIF_Number_Transaction_615;
	}

	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002MA_1_amfVO.CIF_SUB_NO']")
	private WebElement Double_click_CIF_Number_615;

	public WebElement Double_click_CIF_Number_615() {
		return Double_click_CIF_Number_615;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_waiver_charges_key']")
	private WebElement CSM_Core_Charges_Waiver_615;

	public WebElement CSM_Core_Charges_Waiver_615() {
		return CSM_Core_Charges_Waiver_615;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_A002MA']")
	private WebElement Charges_Waiver_custom_Exemption_615;

	public WebElement Charges_Waiver_custom_Exemption_615() {
		return Charges_Waiver_custom_Exemption_615;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_A002MA']")
	private WebElement Average_Balance_Monthly_615;

	public WebElement Average_Balance_Monthly_615() {
		return Average_Balance_Monthly_615;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_DATE']")
	private WebElement From_Date_Charges_waiver_615;

	public WebElement From_Date_Charges_waiver_615() {
		return From_Date_Charges_waiver_615;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_DATE']")
	private WebElement TO_Date_Charges_waiver_615;

	public WebElement TO_Date_Charges_waiver_615() {
		return TO_Date_Charges_waiver_615;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_BALANCE']")
	private WebElement From_Balance_amount_value_615;

	public WebElement From_Balance_amount_value_615() {
		return From_Balance_amount_value_615;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_BALANCE']")
	private WebElement To_Balance_amount_value_615;

	public WebElement To_Balance_amount_value_615() {
		return To_Balance_amount_value_615;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.WAIVER_PERCENTAGE']")
	private WebElement Waiver_Percentage_CSM_Core_615;

	public WebElement Waiver_Percentage_CSM_Core_615() {
		return Waiver_Percentage_CSM_Core_615;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.WAIVER_AMOUNT']")
	private WebElement Waiver_Amount_CSM_core_615;

	public WebElement Waiver_Amount_CSM_core_615() {
		return Waiver_Amount_CSM_core_615;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg_615;

	public WebElement POPupmsg_615() {
		return POPupmsg_615;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_Update_key']")
	private WebElement Update_button_Average_Balance_Monthly_615;

	public WebElement Update_button_Average_Balance_Monthly_615() {
		return Update_button_Average_Balance_Monthly_615;
	}

	@FindBy(xpath = "//span[text()='Authorize']")
	private WebElement Authorize_Accounts_button_615;

	public WebElement Authorize_Accounts_button_615() {
		return Authorize_Accounts_button_615;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_CIF_Number_615;

	public WebElement Accounts_CIF_Number_615() {
		return Accounts_CIF_Number_615;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement Authorize_Key_615;

	public WebElement Authorize_Key_615() {
		return Authorize_Key_615;
	}

	@FindBy(xpath = "//span[text()='Bulk Remittance']")
	private WebElement bulkRemittance_Transaction_615;

	public WebElement bulkRemittance_Transaction_615() {
		return bulkRemittance_Transaction_615;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement Bulk_Type_Transaction_615;

	public WebElement Bulk_Type_Transaction_615() {
		return Bulk_Type_Transaction_615;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement TrX_Type_Transaction_615;

	public WebElement TrX_Type_Transaction_615() {
		return TrX_Type_Transaction_615;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement TRX_BriefName_Transaction_615;

	public WebElement TRX_BriefName_Transaction_615() {
		return TRX_BriefName_Transaction_615;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001RE']")
	private WebElement CSM_BranchCodeINdebitAc_615;

	public WebElement CSM_BranchCodeINdebitAc_615() {
		return CSM_BranchCodeINdebitAc_615;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001RE']")
	private WebElement CSM_CurrencyCodedebitAc_615;

	public WebElement CSM_CurrencyCodedebitAc_615() {
		return CSM_CurrencyCodedebitAc_615;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_615;

	public WebElement CSMOkButtonUnderInformationPopUp_615() {
		return CSM_OkButtonUnderInformationPopUp_615;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001RE']")
	private WebElement currency_code_value_615;

	public WebElement currency_code_value_615() {
		return currency_code_value_615;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ExemptionType_615;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ExemptionType_615() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ExemptionType_615;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_AverageBalanceBasis_615;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_AverageBalanceBasis_615() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_AverageBalanceBasis_615;
	}

	@FindBy(xpath = "(//table[@id='chargesWaiverGrid_Id_A002MA']//td[text()='1'])[1]")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Grid_615;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Grid_615() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Grid_615;
	}

	@FindBy(xpath = "//td[@id='add_chargesWaiverGrid_Id_A002MA']/div/span")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Addicon_615;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Addicon_615() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Addicon_615;
	}

	// chequebook
	@FindBy(xpath = "//span[@id='spanLookup_CHEQUE_CODE_Q000MT']/span")
	private WebElement ChequebookRequest_Maintenance_ChequeCodeSearch_615;

	public WebElement ChequebookRequest_Maintenance_ChequeCodeSearch_615() {
		return ChequebookRequest_Maintenance_ChequeCodeSearch_615;
	}

	@FindBy(xpath = "//input[@id='gridtab_CHEQUE_CODE_Q000MT_gs_CODE']")
	private WebElement ChequebookRequest_Maintenance_ChequeCode_615;

	public WebElement ChequebookRequest_Maintenance_ChequeCode_615() {
		return ChequebookRequest_Maintenance_ChequeCode_615;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_NumberofChequeBooks_615;

	public WebElement ChequebookRequest_Maintenance_NumberofChequeBooks_615() {
		return ChequebookRequest_Maintenance_NumberofChequeBooks_615;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_BranchCode_615;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_BranchCode_615() {
		return ChequebookRequest_Maintenance_AccountNumber_BranchCode_615;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_Currency_615;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_Currency_615() {
		return ChequebookRequest_Maintenance_AccountNumber_Currency_615;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_GL_615;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_GL_615() {
		return ChequebookRequest_Maintenance_AccountNumber_GL_615;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_Cif_615;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_Cif_615() {
		return ChequebookRequest_Maintenance_AccountNumber_Cif_615;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Ok_615;

	public WebElement CSM_Ok_615() {
		return CSM_Ok_615;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_SerialNumber_615;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_SerialNumber_615() {
		return ChequebookRequest_Maintenance_AccountNumber_SerialNumber_615;
	}

	@FindBy(xpath = "(//div[@id='chequeBookChargesDiv_Q000MT']/div/span[2]/span)[1]")
	private WebElement ChequebookRequest_Maintenance_Charges_615;

	public WebElement ChequebookRequest_Maintenance_Charges_615() {
		return ChequebookRequest_Maintenance_Charges_615;
	}

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000MT_0_ctsChargesEntityVO.AMOUNT'])[1]")
	private WebElement ChequebookRequest_Maintenance_CV_615;

	public WebElement ChequebookRequest_Maintenance_CV_615() {
		return ChequebookRequest_Maintenance_CV_615;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement ChequebookRequest_Approve_ChequeCode_615;

	public WebElement ChequebookRequest_Approve_ChequeCode_615() {
		return ChequebookRequest_Approve_ChequeCode_615;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_615;

	public WebElement getTransactionNumber_615() {
		return getTransactionNumber_615;
	}

	@FindBy(xpath = "//input[@id='gridtab_trx_type_D001MT_gs_CODE']")
	private WebElement Transactions_Maintenance_TrxTypeCode_615;

	public WebElement Transactions_Maintenance_TrxTypeCode_615() {
		return Transactions_Maintenance_TrxTypeCode_615;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']/span")
	private WebElement Transactions_Maintenance_TrxTypeSearch_615;

	public WebElement Transactions_Maintenance_TrxTypeSearch_615() {
		return Transactions_Maintenance_TrxTypeSearch_615;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_BranchCode_615;

	public WebElement Transactions_Maintenance_BranchCode_615() {
		return Transactions_Maintenance_BranchCode_615;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_Maintenance_CurrencyCode_615;

	public WebElement Transactions_Maintenance_CurrencyCode_615() {
		return Transactions_Maintenance_CurrencyCode_615;
	}

	@FindBy(xpath = "//button[@id='appToSelWaive_D001MT']//span[contains(text(),' Apply To Selected ')]")
	private WebElement Transactions_Maintenance_WaiveRate_ApplytoSelected_615;

	public WebElement Transactions_Maintenance_WaiveRate_ApplytoSelected_615() {
		return Transactions_Maintenance_WaiveRate_ApplytoSelected_615;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001MT']")
	private WebElement Transactions_Maintenance_WaiveRate_615;

	public WebElement Transactions_Maintenance_WaiveRate_615() {
		return Transactions_Maintenance_WaiveRate_615;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Charges_key']")
	private WebElement Transactions_Maintenance_Charges_615;

	public WebElement Transactions_Maintenance_Charges_615() {
		return Transactions_Maintenance_Charges_615;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_CreditSerialNo_615;

	public WebElement Transactions_Maintenance_CreditSerialNo_615() {
		return Transactions_Maintenance_CreditSerialNo_615;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CreditCifCode_615;

	public WebElement Transactions_Maintenance_CreditCifCode_615() {
		return Transactions_Maintenance_CreditCifCode_615;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_CreditGlCode_615;

	public WebElement Transactions_Maintenance_CreditGlCode_615() {
		return Transactions_Maintenance_CreditGlCode_615;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_CreditBranchCode_615;

	public WebElement Transactions_Maintenance_CreditBranchCode_615() {
		return Transactions_Maintenance_CreditBranchCode_615;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_Maintenance_Amount_615;

	public WebElement Transactions_Maintenance_Amount_615() {
		return Transactions_Maintenance_Amount_615;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_cy_D001MT_gs_CURRENCY_CODE']")
	private WebElement Transactions_Maintenance_Currency_CurrencyCode_615;

	public WebElement Transactions_Maintenance_Currency_CurrencyCode_615() {
		return Transactions_Maintenance_Currency_CurrencyCode_615;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trs_cy_D001MT']/span")
	private WebElement Transactions_Maintenance_CurrencySearch_615;

	public WebElement Transactions_Maintenance_CurrencySearch_615() {
		return Transactions_Maintenance_CurrencySearch_615;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_SerialNo_615;

	public WebElement Transactions_Maintenance_SerialNo_615() {
		return Transactions_Maintenance_SerialNo_615;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CifCode_615;

	public WebElement Transactions_Maintenance_CifCode_615() {
		return Transactions_Maintenance_CifCode_615;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_GlCode_615;

	public WebElement Transactions_Maintenance_GlCode_615() {
		return Transactions_Maintenance_GlCode_615;
	}

	@FindBy(xpath = "//input[@id='exemptFullChargesWaiver_A002MA']")
	private WebElement Exempt_Full_charge_waiver_flag_615;

	public WebElement Exempt_Full_charge_waiver_flag_615() {
		return Exempt_Full_charge_waiver_flag_615;

	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement csm_AddDetls_UAAscreen_under_TransactionType_615;

	public WebElement csm_AddDetls_UAAscreen_under_TransactionType_615() {
		return csm_AddDetls_UAAscreen_under_TransactionType_615;
	}

	@FindBy(xpath = "//span[text()='Available Options for Deduct I']")
	private WebElement csm_Avloptn_UAAscreen_under_TransactionType_615;

	public WebElement csm_Avloptn_UAAscreen_under_TransactionType_615() {
		return csm_Avloptn_UAAscreen_under_TransactionType_615;
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

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Transactions_Trxtypevalue;

	public WebElement Transactions_Trxtypevalue_611() {
		return Transactions_Trxtypevalue;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_depositAcc_Branchcode;

	public WebElement Transactions_depositAcc_Branchcode_611() {
		return Transactions_depositAcc_Branchcode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_debitAcc_Currencycode;

	public WebElement Transactions_debitAcc_Currencycode_611() {
		return Transactions_debitAcc_Currencycode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_debitAcc_Glcode;

	public WebElement Transactions_debitAcc_Glcode_611() {
		return Transactions_debitAcc_Glcode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_debitAcc_Cifcode;

	public WebElement Transactions_debitAcc_Cifcode_611() {
		return Transactions_debitAcc_Cifcode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_debitAcc_serialcode;

	public WebElement Transactions_debitAcc_serialcode_611() {
		return Transactions_debitAcc_serialcode;
	}
//					@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
//					private WebElement CSM_SerialIndebitAc;
//					public WebElement CSM_SerialIndebitAc() {
//						return CSM_SerialIndebitAc;
//					}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn;

	public WebElement Transactions_Warning_okbtn_611() {
		return Transactions_Warning_okbtn;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_EnterAmount;

	public WebElement Transactions_EnterAmount_611() {
		return Transactions_EnterAmount;
	}

	@FindBy(id = "trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen;

	public WebElement CSMSaveButtonInMaintenanceScreen_611() {
		return CSM_SaveButtonInMaintenanceScreen;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber;

	public WebElement getTransactionNumber_611() {
		return getTransactionNumber;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu;

	public WebElement CSMOkButtonInSuccessPopUpMenu_611() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}

	@FindBy(xpath = "//a[@id='D001AU']")
	private WebElement Transactions_Approvescrn;

	public WebElement Transactions_Approvescrn_611() {
		return Transactions_Approvescrn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValues;

	public WebElement Transactions_transactionNo_codeValues_611() {
		return Transactions_transactionNo_codeValues;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_Doubleclk;

	public WebElement Transactions_transactionNo_Doubleclk_611() {
		return Transactions_transactionNo_Doubleclk;
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
	// _popup_path_sol_confirm_ok
	// _popup_path_sol_ok

//					@FindBy(xpath = "//span[text()='close']")
//				  	private WebElement CSMCore_closeSymbol;
//				  	public WebElement CSMCorecloseSymbol_611() {
//				  		return CSMCore_closeSymbol;
//				  	}

	@FindBy(xpath = "//span[text()='Reverse']")
	private WebElement Transactions_Reverse_611;

	public WebElement Transactions_Reverse_611() {
		return Transactions_Reverse_611;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001WV_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Reverse_Code_611;

	public WebElement Transactions_Reverse_Code_611() {
		return Transactions_Reverse_Code_611;
	}
	// table[@id='trxMgntGridTbl_Id_D001WV']//td[text()='9514']

	@FindBy(xpath = "//select[@id='holdReason_D001WV']")
	private WebElement Transactions_Reverse_Reason_611;

	public WebElement Transactions_Reverse_Reason_611() {
		return Transactions_Reverse_Reason_611;
	}
	// vip reverse

	@FindBy(xpath = "//span[contains(text(),' To Reverse ')]")
	private WebElement Transactions_Reverse_ToReverseBtn_611;

	public WebElement Transactions_Reverse_ToReverseBtn_611() {
		return Transactions_Reverse_ToReverseBtn_611;
	}

	@FindBy(xpath = "//span[text()='Approve Reverse']")
	private WebElement Transactions_ApproveReverse_611;

	public WebElement Transactions_ApproveReverse_611() {
		return Transactions_ApproveReverse_611;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RV_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApproveReverse_Code_611;

	public WebElement Transactions_ApproveReverse_Code_611() {
		return Transactions_ApproveReverse_Code_611;
	}
	// table[@id='trxMgntGridTbl_Id_D001RV']//td[text()='9507']

	@FindBy(xpath = "//span[contains(text(),' Reverse ')]")
	private WebElement Transactions_ApproveReverse_Reverse_611;

	public WebElement Transactions_ApproveReverse_Reverse_611() {
		return Transactions_ApproveReverse_Reverse_611;
	}
	// @TRNS_P2_168 Param

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

	@FindBy(xpath = "//td[text()='User']")
	private WebElement CsmParam_Parameters_SysParameter_User;

	public WebElement CsmParam_Parameters_SysParameter_User_611() {
		return CsmParam_Parameters_SysParameter_User;
	}

	@FindBy(xpath = "//span[text()='Update after Approve']")
	private WebElement CsmParam_Parameters_SysParameter_User_UpdateAftApprove;

	public WebElement CsmParam_Parameters_SysParameter_User_UpdateAftApprove_611() {
		return CsmParam_Parameters_SysParameter_User_UpdateAftApprove;
	}

	@FindBy(xpath = "//input[@id='mask_trx_amt_approve_yn_E000MA']")
	private WebElement CsmParam_Param_SysParam_User_UpdateAftApp_MasktrxFlag;

	public WebElement CsmParam_Param_SysParam_User_UpdateAftApp_MasktrxFlag_611() {
		return CsmParam_Param_SysParam_User_UpdateAftApp_MasktrxFlag;
	}

	@FindBy(xpath = "//span[text()=' Trx Type ']")
	private WebElement CsmParam_Param_SysParam_User_UpdateAftApp_TrxType;

	public WebElement CsmParam_Param_SysParam_User_UpdateAftApp_TrxType_611() {
		return CsmParam_Param_SysParam_User_UpdateAftApp_TrxType;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement CsmParam_Param_SysParam_User_UpdateAftAp;

	public WebElement CsmParam_Param_SysParam_User_FinUpdateAftAp_611() {
		return CsmParam_Param_SysParam_User_UpdateAftAp;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement CsmParam_Param_SysParam_User_UpdateAftApp_UserIDName;

	public WebElement CsmParam_Param_SysParam_User_UpdateAftApp_UserIDName_611() {
		return CsmParam_Param_SysParam_User_UpdateAftApp_UserIDName;
	}

	@FindBy(xpath = "//td[text()='KOUSALYA']")
	private WebElement CsmParam_Param_SysParam_User_UpdateAftApp_UserIDName_Doubleclick;

	public WebElement CsmParam_Param_SysParam_User_UpdateAftApp_UserIDName_Doubleclick_611() {
		return CsmParam_Param_SysParam_User_UpdateAftApp_UserIDName_Doubleclick;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement CsmParam_Param_SysParam_User_ApproveMenu;

	public WebElement CsmParam_Param_SysParam_User_ApproveMenu_611() {
		return CsmParam_Param_SysParam_User_ApproveMenu;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement CsmParam_Param_SysParam_User_ApproveMenu_UserIdName;

	public WebElement CsmParam_Param_SysParam_User_ApproveMenu_UserIdName_611() {
		return CsmParam_Param_SysParam_User_ApproveMenu_UserIdName;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement CsmParam_Param_SysParam_User_ApproveMenu_UserIdName_FinApprBtn;

	public WebElement CsmParam_Param_SysParam_User_ApproveMenu_UserIdName_FinApprBtn_611() {
		return CsmParam_Param_SysParam_User_ApproveMenu_UserIdName_FinApprBtn;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement Csm_Transactionmain_chequeno;

	public WebElement Csm_Transactionmain_chequeno_611() {
		return Csm_Transactionmain_chequeno;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_CreditBranchCode_611;

	public WebElement Transactions_Maintenance_CreditBranchCode_611() {
		return Transactions_Maintenance_CreditBranchCode_611;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001MT']")
	private WebElement Transactions_Maintenance_CreditCurrencyCode_611;

	public WebElement Transactions_Maintenance_CreditCurrencyCode_611() {
		return Transactions_Maintenance_CreditCurrencyCode_611;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_CreditGlCode_611;

	public WebElement Transactions_Maintenance_CreditGlCode_611() {
		return Transactions_Maintenance_CreditGlCode_611;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CreditCifCode_611;

	public WebElement Transactions_Maintenance_CreditCifCode_611() {
		return Transactions_Maintenance_CreditCifCode_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_CreditSerialNo_611;

	public WebElement Transactions_Maintenance_CreditSerialNo_611() {
		return Transactions_Maintenance_CreditSerialNo_611;
	}

	// @CHTR_P2_057

	@FindBy(xpath = "//span[text()='Apply to Clear Inward Cheques']")
	private WebElement Transactions_ApplyClearInwardCheques_611;

	public WebElement Transactions_ApplyClearInwardCheques_611() {
		return Transactions_ApplyClearInwardCheques_611;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AC_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApplyClearInwardCheques_Code_611;

	public WebElement Transactions_ApplyClearInwardCheques_Code_611() {
		return Transactions_ApplyClearInwardCheques_Code_611;
	}
	// table[@id='trxMgntGridTbl_Id_D001AC']//td[text()='9810']

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

	// Cheque Transcation CHTR_P2_057

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

	@FindBy(xpath = "//input[@id='no_clearing_entries_O001UP']")
	private WebElement controlrecord_UpdAftAppr_Noclrflagcheck;

	public WebElement controlrecord_UpdAftAppr_Noclrflagcheck_611() {
		return controlrecord_UpdAftAppr_Noclrflagcheck;
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

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement parameter_sysparam_Transcationtype;

	public WebElement parameter_sysparam_Transcationtype_611() {
		return parameter_sysparam_Transcationtype;
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

	@FindBy(xpath = "//select[@id='send_clear_entry_O001UP']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry_611;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry_611() { // Cheque
																											// Entry
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry_611;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.VALUE_DATE'] ")
	private WebElement CSM_Transaction_maintanance_StartingDate_611;

	public WebElement CSM_Transaction_maintanance_StartingDate_611() {
		return CSM_Transaction_maintanance_StartingDate_611;
	}

	@FindBy(xpath = "//input[@id='release_date_D001MT']")
	private WebElement CSM_Transaction_maintanance_EndingDate_611;

	public WebElement CSM_Transaction_maintanance_EndingDate_611() {
		return CSM_Transaction_maintanance_EndingDate_611;
	}

	@FindBy(xpath = "//td[text()='KARTHIK']")
	private WebElement Transaction_maintanance_alertclickingUserId_611;

	public WebElement Transaction_maintanance_alertclickingUserId_611() {
		return Transaction_maintanance_alertclickingUserId_611;
	}

	@FindBy(xpath = "//span[text()=' Send ']//parent::a")
	private WebElement Transaction_maintanance_alertclickingUserId_SendBtn_611;

	public WebElement Transaction_maintanance_alertclickingUserId_SendBtn_611() {
		return Transaction_maintanance_alertclickingUserId_SendBtn_611;
	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo_611;

	public WebElement BMUserAlertEnterTRXNo_611() {
		return BMUser_Alert_EnterTRXNo_611;
	}

	@FindBy(xpath = "//input[@id='jqg_trsAckTOutAlertGrid_Id_RCVALERT_1']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_611;

	public WebElement BMUserAlertEnterTRXNoselectRecord_611() {
		return BMUser_Alert_EnterTRXNo_selectRecord_611;
	}

	@FindBy(xpath = "//a[@id='openBut_RCVALERT']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_611;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_611() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_611;
	}

	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_611;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey_611() {

		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_611;
	}

	@FindBy(xpath = "//input[@id='standing_order_P024MA']")
	private WebElement CSMParam_TransactionType_StandingOrderCheckBox_611;

	public WebElement CSMParam_TransactionType_StandingOrderCheckBox_611() {
		return CSMParam_TransactionType_StandingOrderCheckBox_611;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAP']")
	private WebElement CSMParam_TransactionType_PeriodicalCheckBox_611;

	public WebElement CSMParam_TransactionType_PeriodicalCheckBox_611() {
		return CSMParam_TransactionType_PeriodicalCheckBox_611;
	}

	@FindBy(xpath = "//select[@id='so_periodicity_P024MA']")
	private WebElement CSMParam_TransactionType_PeriodicalSelectBox_611;

	public WebElement CSMParam_TransactionType_PeriodicalSelectBox_611() {
		return CSMParam_TransactionType_PeriodicalSelectBox_611;
	}

	@FindBy(xpath = "//select[@id='so_period_type_P024MA']")
	private WebElement CSMParam_TransactionType_PeriodTypeSelectBox_611;

	public WebElement CSMParam_TransactionType_PeriodTypeSelectBox_611() {
		return CSMParam_TransactionType_PeriodTypeSelectBox_611;
	}

	@FindBy(xpath = "//select[@id='so_period_day_P024MA']")
	private WebElement CSMParam_TransactionType_DaySpecificationsSelectBox_611;

	public WebElement CSMParam_TransactionType_DaySpecificationsSelectBox_611() {
		return CSMParam_TransactionType_DaySpecificationsSelectBox_611;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAX']")
	private WebElement CSMParam_TransactionType_Maxbalflag_611;

	public WebElement CSMParam_TransactionType_Maxbalflag_611() {
		return CSMParam_TransactionType_Maxbalflag_611;
	}

	@FindBy(xpath = "//input[@id='allow_so_same_set_cr_dr_ac_yn_P024MA']")
	private WebElement CSMParam_TransactionType_AllowSOforsamesetofcreditdebitACFLAG_611;

	public WebElement CSMParam_TransactionType_AllowSOforsamesetofcreditdebitACFLAG_611() {
		return CSMParam_TransactionType_AllowSOforsamesetofcreditdebitACFLAG_611;
	}

	@FindBy(xpath = "//select[@id='so_process_type_P024MA']")
	private WebElement CSMParam_TransactionType_SelectEOD_611;

	public WebElement CSMParam_TransactionType_SelectEOD_611() {
		return CSMParam_TransactionType_SelectEOD_611; // EOD //MANUAL //ONLINE //Third Party
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAM']")
	private WebElement CSMParam_TransactionType_Minbal_611;

	public WebElement CSMParam_TransactionType_minbal_611() {
		return CSMParam_TransactionType_Minbal_611;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAP']")
	private WebElement CSMParam_TransactionType_Periodocal_611;

	public WebElement CSMParam_TransactionType_periodical_611() {
		return CSMParam_TransactionType_Periodocal_611;
	}

	@FindBy(xpath = "//input[@id='proceed_drawn_checks_P024MA']")
	private WebElement CSMParam_TransactionType_AllowProceedonDrawnCheques_611;

	public WebElement CSMParam_TransactionType_AllowProceedonDrawnCheques_611() {
		return CSMParam_TransactionType_AllowProceedonDrawnCheques_611;
	}

	@FindBy(xpath = "//input[@id='chq_date_D001MT']")
	private WebElement CSM_Transaction_maintanance_ChequeDate_611;

	public WebElement CSM_Transaction_maintanance_ChequeDate_611() {
		return CSM_Transaction_maintanance_ChequeDate_611;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement Transactions_maintenance_DocumentNo_611;

	public WebElement Transactions_maintenance_DocumentNo_611() {
		return Transactions_maintenance_DocumentNo_611;
	}

	// user

	@FindBy(xpath = "//td[text()='User']")
	private WebElement Parameters_SystemParameters_User_611;

	public WebElement Parameters_SystemParameters_User_611() {
		return Parameters_SystemParameters_User_611;
	}

	@FindBy(xpath = "//a[@id='E000MA']//span[text()='Update after Approve']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_611;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UserId_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UserId_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_UserId_611;
	}
	// (//table[@id='tellerParamList_GridTbl_Id_E000MA']//td[text()='VIJAY'])[1]

	@FindBy(xpath = "//input[@id='mask_trx_amt_approve_yn_E000MA']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_MaskTrxAmountonApproval_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_MaskTrxAmountonApproval_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_MaskTrxAmountonApproval_611;
	}

	@FindBy(xpath = "//span[text()=' Trx Type ']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_611;
	}

	@FindBy(xpath = "//td[@id='add_tab16_GridTbl_Id_E000MA']//span")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_AddIcon_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_AddIcon_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_AddIcon_611;
	}

	@FindBy(xpath = "//table[@id='tab16_GridTbl_Id_E000MA']/tbody//span//input")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_TransactionCode_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_TransactionCode_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_TransactionCode_611;
	}

	@FindBy(xpath = "//td[@id='del_tab16_GridTbl_Id_E000MA']//span")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteIcon_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteIcon_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteIcon_611;
	}

	@FindBy(xpath = "//span[text()='Delete All']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteAll_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteAll_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteAll_611;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn_611;
	}

	@FindBy(xpath = "//a[@id='E000P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_User_Approve_611;

	public WebElement Parameters_SystemParameters_User_Approve_611() {
		return Parameters_SystemParameters_User_Approve_611;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement Parameters_SystemParameters_User_Approve_UserId_611;

	public WebElement Parameters_SystemParameters_User_Approve_UserId_611() {
		return Parameters_SystemParameters_User_Approve_UserId_611;
	}
	// (//table[@id='tellerParamList_GridTbl_Id_E000P']//td[text()='VIJAY'])[1]

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement Parameters_SystemParameters_User_Approve_ApproveBtn_611;

	public WebElement Parameters_SystemParameters_User_Approve_ApproveBtn_611() {
		return Parameters_SystemParameters_User_Approve_ApproveBtn_611;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement CSM_SimpleOk_611;

	public WebElement CSM_SimpleOk_611() {
		return CSM_SimpleOk_611;
	}

	@FindBy(xpath = "//input[@id='amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount_611;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount_611() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_Amount_611;
	}

	@FindBy(xpath = "//input[@id='input_amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount_611;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount_611() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount_611;
	}

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement csmParam_AccountParameters_611;

	public WebElement csmParam_AccountParameters_611() {
		return csmParam_AccountParameters_611;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_inputfield_doubleclick_611;

	public WebElement csmParam_Transactiontype_inputfield_doubleclick_611() {
		return csmParam_Transactiontype_inputfield_doubleclick_611;
	}

	@FindBy(xpath = "//td[text()='Account Type']")
	private WebElement csmParam_AccountParameters_AccountTypes_611;

	public WebElement csmParam_AccountParameters_AccountTypes_611() {
		return csmParam_AccountParameters_AccountTypes_611;
	}

	@FindBy(xpath = "//td[text()='Account Type']/ancestor::a/following-sibling::ul//span[text()='Update After Approve']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPAField_611;

	public WebElement csmParam_AccountParameters_AccountTypes_UPAField_611() {
		return csmParam_AccountParameters_AccountTypes_UPAField_611;
	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_611;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_611() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_611;
	}

	@FindBy(xpath = "//td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_611;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_611() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_611;
	}

	@FindBy(xpath = "//input[@id='allow_overdrawn_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_611;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_611() {
		return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_611;
	}

	@FindBy(xpath = "//div[@id='instructionsColl_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_611;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_611() {
		return csmParam_AccountParameters_AccountTypes_Instructions_611;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017MA_Update_After_Approve_key']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton_611;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton_611() {
		return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton_611;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_611;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_611() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_611;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok_611;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok_611() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok_611;
	}

	@FindBy(xpath = "//td[text()='Account Type']/ancestor::a/following-sibling::ul//span[text()='Approve']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_611;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_611() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_611;
	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_611;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_611() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_611;
	}

	@FindBy(xpath = "//td[@id='td_acctypeList_GridTbl_Id_P017P_1_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_611;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_611() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_611;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017P_Approve_key']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton_611;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton_611() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton_611;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_611;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_611() {
		return csmParam_Transactiontype_proceedoninsufficentfunds_611;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement csmParam_Transactiontype_ForceOverDrawn_611;

	public WebElement csmParam_Transactiontype_ForceOverDrawn_611() {
		return csmParam_Transactiontype_ForceOverDrawn_611;
	}

	@FindBy(xpath = "//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Amount Exceeds Available Balance in Account')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement AmountExceedsWarningPopUp_611;

	public WebElement AmountExceedsWarningPopUp_611() {
		return AmountExceedsWarningPopUp_611;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement csm_Accounts_611;

	public WebElement csm_Accounts_611() {
		return csm_Accounts_611;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement csm_Accounts_GeneralAcc_611;

	public WebElement csm_Accounts_GeneralAcc_611() {
		return csm_Accounts_GeneralAcc_611;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a[@id='A002MA']")
	private WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_611;

	public WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_611() {
		return csm_Accounts_GeneralAcc_MaintenanceScreen_611;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_611;

	public WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_611() {
		return csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_611;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002MA']")
	private WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_Doubleclick_611;

	public WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_Doubleclick_611() {
		return csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_Doubleclick_611;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_waiver_charges_key']")
	private WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_clickChargeWaiverField_611;

	public WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_clickChargeWaiverField_611() {
		return csm_Accounts_GeneralAcc_MaintenanceScreen_clickChargeWaiverField_611;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_A002MA']") // Custom Exemption
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ExcemptionType_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ExcemptionType_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_ExcemptionType_611;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_A002MA']") // Daily
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_AvgBalanceBasic_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_AvgBalanceBasic_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_AvgBalanceBasic_611;
	}

	@FindBy(xpath = "//td[@id='add_chargesWaiverGrid_Id_A002MA']")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_PlusBtn_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_PlusBtn_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_PlusBtn_611;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_rn']")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_clictoView_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_clictoView_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_clictoView_611;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[1]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_FromDate_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_FromDate_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_FromDate_611;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[2]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ToDate_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ToDate_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_ToDate_611;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[3]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_FromBalanced_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_FromBalanced_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_FromBalanced_611;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[4]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ToBalanced_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ToBalanced_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_ToBalanced_611;
	}

	@FindBy(xpath = "//td[@id='del_chargesWaiverGrid_Id_A002MA']")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_deleteBtn_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_deleteBtn_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_deleteBtn_611;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[5]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverPercent_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverPercent_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverPercent_611;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[6]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverAmount_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverAmount_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverAmount_611;
	}

	@FindBy(xpath = "//span[text()='ok']//parent::button")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_OKBtn_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_OKBtn_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_OKBtn_611;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_Update_key']")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_UpdateKey_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_UpdateKey_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_UpdateKey_611;
	}

	@FindBy(xpath = "//span[text()='Authorize']//parent::a[@id='A002AU']")
	private WebElement csm_Accounts_GeneralAcc_AutorizeStage_611;

	public WebElement csm_Accounts_GeneralAcc_AutorizeStage_611() {
		return csm_Accounts_GeneralAcc_AutorizeStage_611;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.CIF_SUB_NO']")
	private WebElement csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_611;

	public WebElement csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_611() {
		return csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_611;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002AU']")
	private WebElement csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_Doubleclick_611;

	public WebElement csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_Doubleclick_611() {
		return csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_Doubleclick_611;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement csm_Accounts_GeneralAcc_AutorizeStage_AuthorizeButton_611;

	public WebElement csm_Accounts_GeneralAcc_AutorizeStage_AuthorizeButton_611() {
		return csm_Accounts_GeneralAcc_AutorizeStage_AuthorizeButton_611;
	}

	@FindBy(xpath = "//span[text()='Charges']")
	private WebElement csm_ChequeBookRequest_Maintenance_ChargesField_611;

	public WebElement csm_ChequeBookRequest_Maintenance_ChargesField_611() {
		return csm_ChequeBookRequest_Maintenance_ChargesField_611;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement csm_GendralAcc_AutorizeScreen_CancelBtn_611;

	public WebElement csm_GendralAcc_AutorizeScreen_CancelBtn_611() {
		return csm_GendralAcc_AutorizeScreen_CancelBtn_611;
	}
	// special conditons page object

	@FindBy(xpath = "//td[text()='Special Conditions']")
	private WebElement csmcore_specialConditions_611;

	public WebElement csmcore_specialConditions_611() {
		return csmcore_specialConditions_611;
	}

	@FindBy(xpath = "//span[text()='To Delete']//parent::a[@id='SPC00TD']")
	private WebElement csmcore_specialConditions_ToDelete_611;

	public WebElement csmcore_specialConditions_ToDelete_611() {
		return csmcore_specialConditions_ToDelete_611;
	}

	@FindBy(xpath = "//input[@id='specialConditionsGridTbl_Id_SPC00TD_gs_specialConditionsVO.ACC_CIF']")
	private WebElement csmcore_specialConditions_ToDelete_EnterCifNo_611;

	public WebElement csmcore_specialConditions_ToDelete_EnterCifNo_611() {
		return csmcore_specialConditions_ToDelete_EnterCifNo_611;
	}

	@FindBy(xpath = "//table[@id='specialConditionsGridTbl_Id_SPC00TD']")
	private WebElement csmcore_specialConditions_ToDelete_DoubleClick_611;

	public WebElement csmcore_specialConditions_ToDelete_DoubleClick_611() {
		return csmcore_specialConditions_ToDelete_DoubleClick_611;
	}

	@FindBy(xpath = "//label[@id='specialConditionsDefFormId_SPC00TD_btn_toDel']")
	private WebElement csmcore_specialConditions_ToDelete_DoubleClick_DeleteButton_611;

	public WebElement csmcore_specialConditions_ToDelete_DoubleClick_DeleteButton_611() {
		return csmcore_specialConditions_ToDelete_DoubleClick_DeleteButton_611;
	}

	@FindBy(xpath = "//span[text()='Delete']//parent::a[@id='SPC00DD']")
	private WebElement csmcore_specialConditions_DeleteStage_611;

	public WebElement csmcore_specialConditions_DeleteStage_611() {
		return csmcore_specialConditions_DeleteStage_611;
	}

	@FindBy(xpath = "//input[@id='specialConditionsGridTbl_Id_SPC00DD_gs_specialConditionsVO.ACC_CIF']")
	private WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_611;

	public WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_611() {
		return csmcore_specialConditions_DeleteStage_EnterCifNo_611;
	}

	@FindBy(xpath = "//table[@id='specialConditionsGridTbl_Id_SPC00DD']")
	private WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_Doublclick_611;

	public WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_Doublclick_611() {
		return csmcore_specialConditions_DeleteStage_EnterCifNo_Doublclick_611;
	}

	@FindBy(xpath = "//label[@id='specialConditionsDefFormId_SPC00DD_btn_del']")
	private WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_EnterCifNo_deletebutton_611;

	public WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_EnterCifNo_deletebutton_611() {
		return csmcore_specialConditions_DeleteStage_EnterCifNo_EnterCifNo_deletebutton_611;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Charges_key']")
	private WebElement Transactions_maintenance_chargesbutton_611;

	public WebElement Transactions_maintenance_chargesbutton_611() {
		return Transactions_maintenance_chargesbutton_611;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement csmcore_Chequebookrequest_611;

	public WebElement csmcore_Chequebookrequest_611() {
		return csmcore_Chequebookrequest_611;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']/ancestor::table/following::span[text()='Maintenance']")
	private WebElement csmcore_Chequebookrequest_maintanace_611;

	public WebElement csmcore_Chequebookrequest_maintanace_611() {
		return csmcore_Chequebookrequest_maintanace_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code_611;

	public WebElement csmcore_Chequebookrequest_maintanace_Code_611() {
		return csmcore_Chequebookrequest_maintanace_Code_611;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks_611;

	public WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks_611() {
		return csmcore_Chequebookrequest_maintanace_NoofChequeBooks_611;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode_611;

	public WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode_611() {
		return csmcore_Chequebookrequest_maintanace_Code_branchcode_611;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_currencyCode_611;

	public WebElement csmcore_Chequebookrequest_maintanace_currencyCode_611() {
		return csmcore_Chequebookrequest_maintanace_currencyCode_611;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_GLcode_611;

	public WebElement csmcore_Chequebookrequest_maintanace_GLcode_611() {
		return csmcore_Chequebookrequest_maintanace_GLcode_611;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_CIFCode_611;

	public WebElement csmcore_Chequebookrequest_maintanace_CIFCode_611() {
		return csmcore_Chequebookrequest_maintanace_CIFCode_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_SerialNo_611;

	public WebElement csmcore_Chequebookrequest_maintanace_SerialNo_611() {
		return csmcore_Chequebookrequest_maintanace_SerialNo_611;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement csmcore_Chequebookrequest_maintanace_SaveButton_611;

	public WebElement csmcore_Chequebookrequest_maintanace_SaveButton_611() {
		return csmcore_Chequebookrequest_maintanace_SaveButton_611;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']/ancestor::table/following::span[text()='Approve']")
	private WebElement csmcore_Chequebookrequest_Approve_611;

	public WebElement csmcore_Chequebookrequest_Approve_611() {
		return csmcore_Chequebookrequest_Approve_611;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement csmcore_Chequebookrequest_Approve_CifNumberInputField_611;

	public WebElement csmcore_Chequebookrequest_Approve_CifNumberInputField_611() {
		return csmcore_Chequebookrequest_Approve_CifNumberInputField_611;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CHEQUE_CODE']")
	private WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_611;

	public WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_611() {
		return csmcore_Chequebookrequest_Approve_InputField_doubleclick_611;
	}

	@FindBy(xpath = "//button[@id='chequeBook_approve_Q000AP']")
	private WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton_611;

	public WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton_611() {
		return csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton_611;
	}

	@FindBy(xpath = "//label[@id='bulkRemittanceDetFormId_D001RE_Charges_key']")
	private WebElement Charges_button_BulkRemittance_611;

	public WebElement Charges_button_BulkRemittance_611() {
		return Charges_button_BulkRemittance_611;
	}

	@FindBy(xpath = "//input[@id='in_charged_cy_input_D001MT']")
	private WebElement csm_inchargedCY_ChargesScreen_Maintenance_Transaction_611;

	public WebElement csm_inchargedCY_ChargesScreen_Maintenance_Transaction_611() {
		return csm_inchargedCY_ChargesScreen_Maintenance_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001MT']")
	private WebElement csm_WaiveRate_ChargesScreen_Maintenance_Transaction_611;

	public WebElement csm_WaiveRate_ChargesScreen_Maintenance_Transaction_611() {
		return csm_WaiveRate_ChargesScreen_Maintenance_Transaction_611;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Waive_Charges_key']")
	private WebElement csm_WaiveCharges_Maintenancescreen_under_Transaction_611;

	public WebElement csm_WaiveCharges_Maintenancescreen_under_Transaction_611() {
		return csm_WaiveCharges_Maintenancescreen_under_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRX_TYPE']")
	private WebElement Trx_Type_code_under_Bulk_remittance_type_611;

	public WebElement Trx_Type_code_under_Bulk_remittance_type_611() {
		return Trx_Type_code_under_Bulk_remittance_type_611;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Waive_Charges_key']")
	private WebElement Double_click_Bulk_remittncae_Approve_611;

	public WebElement Double_click_Bulk_remittncae_Approve_611() {
		return Double_click_Bulk_remittncae_Approve_611;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement GL_code_under_cheque_book_611;

	public WebElement GL_code_under_cheque_book_611() {
		return GL_code_under_cheque_book_611;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.ACC_CIF']")
	private WebElement Double_clickChequebook_Bulk_remittncae_Approve_611;

	public WebElement Double_clickChequebook_Bulk_remittncae_Approve_611() {
		return Double_clickChequebook_Bulk_remittncae_Approve_611;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Charges_key']")
	private WebElement Charges_under_ChargeDetails_Transaction_611;

	public WebElement Charges_under_ChargeDetails_Transaction_611() {
		return Charges_under_ChargeDetails_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='in_charged_cy_input_D001MT']")
	private WebElement InChargedCY_Charges_under_ChargeDetails_Transaction_611;

	public WebElement InChargedCY_Charges_under_ChargeDetails_Transaction_611() {
		return InChargedCY_Charges_under_ChargeDetails_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001MT']")
	private WebElement WaiveRate_Charges_under_ChargeDetails_Transaction_611;

	public WebElement WaiveRate_Charges_under_ChargeDetails_Transaction_611() {
		return WaiveRate_Charges_under_ChargeDetails_Transaction_611;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Waive_Charges_key']")
	private WebElement WaiveCharges_under_ChargeDetails_Transaction_611;

	public WebElement WaiveCharges_under_ChargeDetails_Transaction_611() {
		return WaiveCharges_under_ChargeDetails_Transaction_611;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_Transactions_Core_611;

	public WebElement csm_Transactions_Core_611() {
		return csm_Transactions_Core_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement csm_TRX_under_Maintainance_Transaction_611;

	public WebElement csm_TRX_under_Maintainance_Transaction_611() {
		return csm_TRX_under_Maintainance_Transaction_611;
	}

	@FindBy(xpath = "(//span[text()='Maintenance'])[2]")
	private WebElement csm_Maintanance_under_Transactions_611;

	public WebElement csm_Maintanance_under_Transactions_611() {
		return csm_Maintanance_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement csm_BranchCode_DebitACC_under_Transactions_611;

	public WebElement csm_BranchCode_DebitACC_under_Transactions_611() {
		return csm_BranchCode_DebitACC_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement csm_CurrencyCode_DebitACC_under_Transactions_611;

	public WebElement csm_CurrencyCode_DebitACC_under_Transactions_611() {
		return csm_CurrencyCode_DebitACC_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement csm_GLCode_DebitACC_under_Transactions_611;

	public WebElement csm_GLCode_DebitACC_under_Transactions_611() {
		return csm_GLCode_DebitACC_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement csm_CIFCode_DebitACC_under_Transactions_611;

	public WebElement csm_CIFCode_DebitACC_under_Transactions_611() {
		return csm_CIFCode_DebitACC_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement csm_SerialNo_DebitACC_under_Transactions_611;

	public WebElement csm_SerialNo_DebitACC_under_Transactions_611() {
		return csm_SerialNo_DebitACC_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement csm_Currency_CurrencyColumn_under_Transactions_611;

	public WebElement csm_Currency_CurrencyColumn_under_Transactions_611() {
		return csm_Currency_CurrencyColumn_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement csm_Amount_CurrencyColumn_Transactions_611;

	public WebElement csm_Amount_CurrencyColumn_Transactions_611() {
		return csm_Amount_CurrencyColumn_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement csm_BranchCode_CreditACC_under_Transactions_611;

	public WebElement csm_BranchCode_CreditACC_under_Transactions_611() {
		return csm_BranchCode_CreditACC_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement csm_GLCode_CreditACC_under_Transactions_611;

	public WebElement csm_GLCode_CreditACC_under_Transactions_611() {
		return csm_GLCode_CreditACC_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement csm_CIFCode_CreditACC_under_Transactions_611;

	public WebElement csm_CIFCode_CreditACC_under_Transactions_611() {
		return csm_CIFCode_CreditACC_under_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement csm_SerialNo_CreditACC_under_Transactions_611;

	public WebElement csm_SerialNo_CreditACC_under_Transactions_611() {
		return csm_SerialNo_CreditACC_under_Transactions_611;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement csm_SaveBtn_under_Maintainance_Transactions_611;

	public WebElement csm_SaveBtn_under_Maintainance_Transactions_611() {
		return csm_SaveBtn_under_Maintainance_Transactions_611;
	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement Transaction_type_Deduct_account_611;

	public WebElement Transaction_type_Deduct_account_611() {
		return Transaction_type_Deduct_account_611;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement Account_Deduct_radio_button_611;

	public WebElement Account_Deduct_radio_button_611() {
		return Account_Deduct_radio_button_611;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement updateAfterApprove_User_Param_611;

	public WebElement updateAfterApprove_User_Param_611() {
		return updateAfterApprove_User_Param_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001RE']")
	private WebElement CSM_BranchCodeINdebitAc_611;

	public WebElement CSM_BranchCodeINdebitAc_611() {
		return CSM_BranchCodeINdebitAc_611;
	}

	@FindBy(xpath = "//span[text()='Bulk Remittance']")
	private WebElement bulkRemittance_Transaction_611;

	public WebElement bulkRemittance_Transaction_611() {
		return bulkRemittance_Transaction_611;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement Bulk_Type_Transaction_611;

	public WebElement Bulk_Type_Transaction_611() {
		return Bulk_Type_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement TrX_Type_Transaction_611;

	public WebElement TrX_Type_Transaction_611() {
		return TrX_Type_Transaction_611;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement TRX_BriefName_Transaction_611;

	public WebElement TRX_BriefName_Transaction_611() {
		return TRX_BriefName_Transaction_611;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement TRX_Code_Transaction_611;

	public WebElement TRX_Code_Transaction_611() {
		return TRX_Code_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001RE']")
	private WebElement CSM_CurrencyCodedebitAc_611;

	public WebElement CSM_CurrencyCodedebitAc_611() {
		return CSM_CurrencyCodedebitAc_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001RE']")
	private WebElement CSM_GLCodedebitAc_611;

	public WebElement CSM_GLCodedebitAc_611() {
		return CSM_GLCodedebitAc_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001RE']")
	private WebElement CSM_SerialIndebitAc_611;

	public WebElement CSM_SerialIndebitAc_611() {
		return CSM_SerialIndebitAc_611;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInCreditAc_611;

	public WebElement CSMCIFCodeInCreditAc_611() {
		return CSM_CIFCodeInCreditAc_611;
	}

	@FindBy(xpath = "//td[@id='add_bulkRemittanceGridTbl_Id_D001RE']")
	private WebElement Add_Button_Transaction_611;

	public WebElement Add_Button_Transaction_611() {
		return Add_Button_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001RE']")
	private WebElement currency_code_value_611;

	public WebElement currency_code_value_611() {
		return currency_code_value_611;
	}

	@FindBy(xpath = "//input[@id='amount_D001RE']")
	private WebElement Amount_Bulk_611;

	public WebElement Amount_Bulk_611() {
		return Amount_Bulk_611;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement Save_button_Transaction_611;

	public WebElement Save_button_Transaction_611() {
		return Save_button_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement code_Approve_Transaction_611;

	public WebElement code_Approve_Transaction_611() {
		return code_Approve_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement submitcode_Approve_Transaction_611;

	public WebElement submitcode_Approve_Transaction_611() {
		return submitcode_Approve_Transaction_611;
	}

	@FindBy(xpath = "//input[@id='exemptFullChargesWaiver_A002MA']")
	private WebElement Csm_Accounts_Exemptfromfullchargeswaiver_611;

	public WebElement Csm_Accounts_Exemptfromfullchargeswaiver_611() {
		return Csm_Accounts_Exemptfromfullchargeswaiver_611;

	}

	@FindBy(xpath = "//input[@id='exemptFullChargesWaiver_A002MA']")
	private WebElement Csm_Accounts_Exemptfromfullchargeswaiver;

	public WebElement Csm_Accounts_Exemptfromfullchargeswaiver() {
		return Csm_Accounts_Exemptfromfullchargeswaiver;

	}

	@FindBy(xpath = "(//td[@id='td_chargesWaiverGrid_Id_A002MA_1_rn'])[1]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_clictoView_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_clictoView_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_clictoView_611;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_FromDate_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_FromDate_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_FromDate_611;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_DATE']//input")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_ToDate_611;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_ToDate_611() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_ToDate_611;
	}

	@FindBy(xpath = "//td[text()='CIF Parameters']")
	private WebElement CSMParam_CIFParamenters_611;

	public WebElement CSMParam_CIFParamenters_611() {
		return CSMParam_CIFParamenters_611;
	}

	@FindBy(xpath = "//td[text()='CIF Type']")
	private WebElement CSMParam_CIFParamenters_CIFType_611;

	public WebElement CSMParam_CIFParamenters_CIFType_611() {
		return CSMParam_CIFParamenters_CIFType_611;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']//parent::a[@id='P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_611;

	public WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_611() {
		return CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_611;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010MA_gs_rifcttVO.TYPE_CODE']")
	private WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode_611;

	public WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode_611() {
		return CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode_611;
	}

	@FindBy(xpath = "//table[@id='cifTypeParamList_GridTbl_Id_P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode_DoubleClick_611;

	public WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode_DoubleClick_611() {
		return CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode_DoubleClick_611;
	}

	@FindBy(xpath = "//span[text()=' Charges Waiver ']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_611() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_611;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_rn']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist_611() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist_611;
	}

	@FindBy(xpath = "//td[@id='del_tab12_GridTbl_Id_P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist_DeleteBtn_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist_DeleteBtn_611() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist_DeleteBtn_611;
	}

	@FindBy(xpath = "//td[@id='add_tab12_GridTbl_Id_P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn_611() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn_611;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.EXEMPTION_TYPE']//select")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn_ExemptionType_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn_ExemptionType_611() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn_ExemptionType_611;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.FROM_DATE']//input")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_FromDate_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_FromDate_611() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_FromDate_611;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.TO_DATE']//input ")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_ToDate_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_ToDate_611() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_ToDate_611;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.WAIVER_PERCENTAGE']//input")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_WaiverPercent_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_WaiverPercent_611() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_WaiverPercent_611;
	}

	@FindBy(xpath = "//button[@id='ok_btn_11_P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_OKBtn_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_OKBtn_611() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_OKBtn_611;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010MA_Update_After_Approve_key'] ")
	private WebElement CSMParam_CIFParamenters_CIFType_UPABtn_611;

	public WebElement CSMParam_CIFParamenters_CIFType_UPABtn_611() {
		return CSMParam_CIFParamenters_CIFType_UPABtn_611;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010P_gs_rifcttVO.TYPE_CODE']")
	private WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode_611() {
		return CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode_611;
	}

	@FindBy(xpath = "//table[@id='cifTypeParamList_GridTbl_Id_P010P']")
	private WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode_DoubleClick_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode_DoubleClick_611() {
		return CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode_DoubleClick_611;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010P_Approve_key']")
	private WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_ApproveButton_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_ApproveButton_611() {
		return CSMParam_CIFParamenters_CIFType_ApproveStage_ApproveButton_611;
	}

	@FindBy(xpath = "//span[text()='Approve']//parent::a[@id='P010P'] ")
	private WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_611;

	public WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_611() {
		return CSMParam_CIFParamenters_CIFType_ApproveStage_611;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_611;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_611() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday_611;
	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement csm_DeductFromDebtorAccount_flag_UAA_80;

	public WebElement csm_DeductFromDebtorAccount_flag_UAA_80() {
		return csm_DeductFromDebtorAccount_flag_UAA_80;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement csm_Accounts_core_80;

	public WebElement csm_Accounts_core_80() {
		return csm_Accounts_core_80;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement csm_GeneralAccounts_under_Accounts_80;

	public WebElement csm_GeneralAccounts_under_Accounts_80() {
		return csm_GeneralAccounts_under_Accounts_80;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement csm_Maintenance_under_GeneralAccounts_Accounts_80;

	public WebElement csm_Maintenance_under_GeneralAccounts_Accounts_80() {
		return csm_Maintenance_under_GeneralAccounts_Accounts_80;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.GL_CODE']")
	private WebElement csm_GLcode_Maintenance_under_Accounts_80;

	public WebElement csm_GLcode_Maintenance_under_Accounts_80() {
		return csm_GLcode_Maintenance_under_Accounts_80;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.STATUS']")
	private WebElement csm_Status_Maintenance_under_Accounts_80;

	public WebElement csm_Status_Maintenance_under_Accounts_80() {
		return csm_Status_Maintenance_under_Accounts_80;
	}

	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002MA_1_amfVO.CIF_SUB_NO']")
	private WebElement csm_dblclck_GLcode_Maintenance_under_Accounts_80;

	public WebElement csm_dblclck_GLcode_Maintenance_under_Accounts_80() {
		return csm_dblclck_GLcode_Maintenance_under_Accounts_80;
	}

	@FindBy(xpath = "//button[@id='chargesWaiverBtn_A002MA']")
	private WebElement csm_chargeWaiver_Maintenance_under_Accounts_80;

	public WebElement csm_chargeWaiver_Maintenance_under_Accounts_80() {
		return csm_chargeWaiver_Maintenance_under_Accounts_80;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_A002MA']")
	private WebElement csm_AverageBalanceBasic_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_AverageBalanceBasic_ChargeWaiverscreen_Accounts_80() {
		return csm_AverageBalanceBasic_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//td[@id='add_chargesWaiverGrid_Id_A002MA']//span")
	private WebElement csm_ADDButton_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_ADDButton_ChargeWaiverscreen_Accounts_80() {
		return csm_ADDButton_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_FromDate_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_FromDate_ChargeWaiverscreen_Accounts_80() {
		return csm_FromDate_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_DATE']")
	private WebElement csm_clicktd_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_clicktd_ChargeWaiverscreen_Accounts_80() {
		return csm_clicktd_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_DATE']//input")
	private WebElement csm_ToDate_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_ToDate_ChargeWaiverscreen_Accounts_80() {
		return csm_ToDate_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_BALANCE']//input")
	private WebElement csm_FromBalance_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_FromBalance_ChargeWaiverscreen_Accounts_80() {
		return csm_FromBalance_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_BALANCE']//input")
	private WebElement csm_ToBalance_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_ToBalance_ChargeWaiverscreen_Accounts_80() {
		return csm_ToBalance_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.WAIVER_PERCENTAGE']//input")
	private WebElement csm_WaiverPercentage_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_WaiverPercentage_ChargeWaiverscreen_Accounts_80() {
		return csm_WaiverPercentage_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//button[@id='gaMaintUpdate_A002MA']")
	private WebElement csm_updatebtn_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_updatebtn_ChargeWaiverscreen_Accounts_80() {
		return csm_updatebtn_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement csm_ok_ChargeWaiverscreen_Accounts_80;

	public WebElement csm_ok_ChargeWaiverscreen_Accounts_80() {
		return csm_ok_ChargeWaiverscreen_Accounts_80;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement csm_viewMemo_popup_80;

	public WebElement csm_viewMemo_popup_80() {
		return csm_viewMemo_popup_80;
	}

	@FindBy(xpath = "//input[@id='jqg_memoGrid_1']")
	private WebElement csm_checkbox_viewMemo_popup_80;

	public WebElement csm_checkbox_viewMemo_popup_80() {
		return csm_checkbox_viewMemo_popup_80;
	}

	@FindBy(xpath = "//td[@id='memoReviewBtn_A002MA']")
	private WebElement csm_Reviewbtn_viewMemo_popup_80;

	public WebElement csm_Reviewbtn_viewMemo_popup_80() {
		return csm_Reviewbtn_viewMemo_popup_80;
	}

	@FindBy(xpath = "//span[text()='Authorize']")
	private WebElement csm_Authorize_under_GeneralAccounts_Accounts_80;

	public WebElement csm_Authorize_under_GeneralAccounts_Accounts_80() {
		return csm_Authorize_under_GeneralAccounts_Accounts_80;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.GL_CODE']")
	private WebElement csm_GLcode_Authorizescreen_Accounts_80;

	public WebElement csm_GLcode_Authorizescreen_Accounts_80() {
		return csm_GLcode_Authorizescreen_Accounts_80;
	}

	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002AU_1_amfVO.GL_CODE']")
	private WebElement csm_dblclck_GLcode_Authorizescreen_Accounts_80;

	public WebElement csm_dblclck_GLcode_Authorizescreen_Accounts_80() {
		return csm_dblclck_GLcode_Authorizescreen_Accounts_80;
	}

	@FindBy(xpath = "//button[@id='gaAuthorize_A002AU']")
	private WebElement csm_Authorizebtn_Authorizescreen_Accounts_80;

	public WebElement csm_Authorizebtn_Authorizescreen_Accounts_80() {
		return csm_Authorizebtn_Authorizescreen_Accounts_80;
	}

	@FindBy(xpath = "//button[@id='btnCharges_D001MT']")
	private WebElement csm_charges_Maintenancescreen_under_Transaction_80;

	public WebElement csm_charges_Maintenancescreen_under_Transaction_80() {
		return csm_charges_Maintenancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "(//td[@id='td_chargesWaiverGrid_Id_A002MA_0_rn'])[1]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_clictoView_80;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_clictoView_80() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_clictoView_80;
	}

	@FindBy(xpath = "//td[@id='del_chargesWaiverGrid_Id_A002MA']")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_deleteBtn_80;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_deleteBtn_80() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_deleteBtn_80;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement csm_GeneralAcc_AuthorizeScreen_CancelBtn_80;

	public WebElement csm_GeneralAcc_AuthorizeScreen_CancelBtn_80() {
		return csm_GeneralAcc_AuthorizeScreen_CancelBtn_80;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement csmcore_Chequebookrequest_80;

	public WebElement csmcore_Chequebookrequest_80() {
		return csmcore_Chequebookrequest_80;
	}

	@FindBy(xpath = "//a[@id='Q000MT']//span[text()='Maintenance']")
	private WebElement csmcore_Chequebookrequest_maintanace_80;

	public WebElement csmcore_Chequebookrequest_maintanace_80() {
		return csmcore_Chequebookrequest_maintanace_80;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks_80;

	public WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks_80() {
		return csmcore_Chequebookrequest_maintanace_NoofChequeBooks_80;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode_80;

	public WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode_80() {
		return csmcore_Chequebookrequest_maintanace_Code_branchcode_80;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_currencyCode_80;

	public WebElement csmcore_Chequebookrequest_maintanace_currencyCode_80() {
		return csmcore_Chequebookrequest_maintanace_currencyCode_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code_80;

	public WebElement csmcore_Chequebookrequest_maintanace_Code_80() {
		return csmcore_Chequebookrequest_maintanace_Code_80;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_GLcode_80;

	public WebElement csmcore_Chequebookrequest_maintanace_GLcode_80() {
		return csmcore_Chequebookrequest_maintanace_GLcode_80;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_CIFCode_80;

	public WebElement csmcore_Chequebookrequest_maintanace_CIFCode_80() {
		return csmcore_Chequebookrequest_maintanace_CIFCode_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_SerialNo_80;

	public WebElement csmcore_Chequebookrequest_maintanace_SerialNo_80() {
		return csmcore_Chequebookrequest_maintanace_SerialNo_80;
	}

	@FindBy(xpath = "//span[text()='Charges']")
	private WebElement csm_ChargesField_Maintenance_ChequeBookRequest_80;

	public WebElement csm_ChargesField_Maintenance_ChequeBookRequest_80() {
		return csm_ChargesField_Maintenance_ChequeBookRequest_80;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement csmcore_SaveButton_Maintanace_ChequebookRequest_80;

	public WebElement csmcore_SaveButton_Maintanace_ChequebookRequest_80() {
		return csmcore_SaveButton_Maintanace_ChequebookRequest_80;
	}

	@FindBy(xpath = "//a[@id='Q000AP']//span[text()='Approve']")
	private WebElement csmcore_Approve_Chequebookrequest_80;

	public WebElement csmcore_Approve_Chequebookrequest_80() {
		return csmcore_Approve_Chequebookrequest_80;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.ACC_GL']")
	private WebElement csmcore_InputField_Approve_Chequebookrequest_80;

	public WebElement csmcore_InputField_Approve_Chequebookrequest_80() {
		return csmcore_InputField_Approve_Chequebookrequest_80;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CHEQUE_CODE']")
	private WebElement csmcore_dblclck_InputField_Approve_Chequebookrequest_80;

	public WebElement csmcore_dblclck_InputField_Approve_Chequebookrequest_80() {
		return csmcore_dblclck_InputField_Approve_Chequebookrequest_80;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement csmcore_InputField_Approvescreen_Chequebookrequest_80;

	public WebElement csmcore_InputField_Approvescreen_Chequebookrequest_80() {
		return csmcore_InputField_Approvescreen_Chequebookrequest_80;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement csm_Code_under_ApproveScreen_80;

	public WebElement csm_Code_under_ApproveScreen_80() {
		return csm_Code_under_ApproveScreen_80;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement csm_CodeUnderUAA_TransactionType_80;

	public WebElement csm_CodeUnderUAA_TransactionType_80() {
		return csm_CodeUnderUAA_TransactionType_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement csm_TrxType_Under_MaintanceScreen_80;

	public WebElement csm_TrxType_Under_MaintanceScreen_80() {
		return csm_TrxType_Under_MaintanceScreen_80;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement csm_branchCode_Debit_80;

	public WebElement csm_branchCode_Debit_80() {
		return csm_branchCode_Debit_80;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement csm_GLCode_Debit_80;

	public WebElement csm_GLCode_Debit_80() {
		return csm_GLCode_Debit_80;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement csm_branchCode_credit_80;

	public WebElement csm_branchCode_credit_80() {
		return csm_branchCode_credit_80;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement csm_CurencyCode_Debit_80;

	public WebElement csm_CurencyCode_Debit_80() {
		return csm_CurencyCode_Debit_80;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement csm_CIFCode_Debit_80;

	public WebElement csm_CIFCode_Debit_80() {
		return csm_CIFCode_Debit_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement csm_SerialNumber_Debit_80;

	public WebElement csm_SerialNumber_Debit_80() {
		return csm_SerialNumber_Debit_80;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement csm_glcode_credit_maintancescreen_80;

	public WebElement csm_glcode_credit_maintancescreen_80() {
		return csm_glcode_credit_maintancescreen_80;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement csm_cifcode_credit_maintancescreen_80;

	public WebElement csm_cifcode_credit_maintancescreen_80() {
		return csm_cifcode_credit_maintancescreen_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement csm_serialno_credit_maintancescreen_80;

	public WebElement csm_serialno_credit_maintancescreen_80() {
		return csm_serialno_credit_maintancescreen_80;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_80;

	public WebElement getTransactionNumber_80() {
		return getTransactionNumber_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement csm_CurrencyCode_Under_Currency_80;

	public WebElement csm_CurrencyCode_Under_Currency_80() {
		return csm_CurrencyCode_Under_Currency_80;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement csm_Amount_MaintananceScreen_80;

	public WebElement csm_Amount_MaintananceScreen_80() {
		return csm_Amount_MaintananceScreen_80;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_TransactionNoInApproveScreen_80;

	public WebElement CSM_TransactionNoInApproveScreen_80() {
		return CSM_TransactionNoInApproveScreen_80;
	}

	@FindBy(xpath = "//input[@id='jqg_signatureGridTbl_Id_Q000MT_1']")
	private WebElement csm_checkBox_viewSignature_chequebookRequest_80;

	public WebElement csm_checkBox_viewSignature_chequebookRequest_80() {
		return csm_checkBox_viewSignature_chequebookRequest_80;
	}

	@FindBy(xpath = "//td[text()='Accept']")
	private WebElement csm_Acceptbtn_viewSignature_chequebookRequest_80;

	public WebElement csm_Acceptbtn_viewSignature_chequebookRequest_80() {
		return csm_Acceptbtn_viewSignature_chequebookRequest_80;
	}

	@FindBy(xpath = "(//div[@id='signTooBar_Q000MT']//span)[1]")
	private WebElement csm_viewAllbtn_viewSignature_chequebookRequest_80;

	public WebElement csm_viewAllbtn_viewSignature_chequebookRequest_80() {
		return csm_viewAllbtn_viewSignature_chequebookRequest_80;
	}

	@FindBy(xpath = "//button[@id='signatureCancelBtn_Q000MT']")
	private WebElement csm_closebtn_viewSignature_chequebookRequest_80;

	public WebElement csm_closebtn_viewSignature_chequebookRequest_80() {
		return csm_closebtn_viewSignature_chequebookRequest_80;
	}

	@FindBy(xpath = "//span[text()='Bulk Remittance']")
	private WebElement csm_BulkRemittance_under_Transaction_80;

	public WebElement csm_BulkRemittance_under_Transaction_80() {
		return csm_BulkRemittance_under_Transaction_80;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement csm_BulkRemittanceType_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_BulkRemittanceType_BulkRemittancescreen_under_Transaction_80() {
		return csm_BulkRemittanceType_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001RE']")
	private WebElement csm_trxtype_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_trxtype_BulkRemittancescreen_under_Transaction_80() {
		return csm_trxtype_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_remittance_Type_D001RE']")
	private WebElement csm_RemittanceType_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_RemittanceType_BulkRemittancescreen_under_Transaction_80() {
		return csm_RemittanceType_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001RE']")
	private WebElement csm_currencycode_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_currencycode_BulkRemittancescreen_under_Transaction_80() {
		return csm_currencycode_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001RE']")
	private WebElement csm_GLcode_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_GLcode_BulkRemittancescreen_under_Transaction_80() {
		return csm_GLcode_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001RE']")
	private WebElement csm_CIFcode_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_CIFcode_BulkRemittancescreen_under_Transaction_80() {
		return csm_CIFcode_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001RE']")
	private WebElement csm_Serialcode_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_Serialcode_BulkRemittancescreen_under_Transaction_80() {
		return csm_Serialcode_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//td[@id='add_bulkRemittanceGridTbl_Id_D001RE']//span")
	private WebElement csm_add_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_add_BulkRemittancescreen_under_Transaction_80() {
		return csm_add_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='amount_D001RE']")
	private WebElement csm_amount_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_amount_BulkRemittancescreen_under_Transaction_80() {
		return csm_amount_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001RE']")
	private WebElement csm_GLcode_TransactionDetails_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_GLcode_TransactionDetails_BulkRemittancescreen_under_Transaction_80() {
		return csm_GLcode_TransactionDetails_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001RE']")
	private WebElement csm_CIFcode_TransactionDetails_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_CIFcode_TransactionDetails_BulkRemittancescreen_under_Transaction_80() {
		return csm_CIFcode_TransactionDetails_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001RE']")
	private WebElement csm_Serialcode_TransactionDetails_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_Serialcode_TransactionDetails_BulkRemittancescreen_under_Transaction_80() {
		return csm_Serialcode_TransactionDetails_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//button[@id='btnCharges_D001RE']")
	private WebElement csm_charges_TransactionDetails_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_charges_TransactionDetails_BulkRemittancescreen_under_Transaction_80() {
		return csm_charges_TransactionDetails_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//button[@id='btnWaiveCharges_D001RE']")
	private WebElement csm_waivecharges_TransactionDetails_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_waivecharges_TransactionDetails_BulkRemittancescreen_under_Transaction_80() {
		return csm_waivecharges_TransactionDetails_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//div[@id='multiChequesEntyDetToolBar_D001RE']//span")
	private WebElement csm_save_TransactionDetails_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_save_TransactionDetails_BulkRemittancescreen_under_Transaction_80() {
		return csm_save_TransactionDetails_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='in_charged_cy_input_D001RE']")
	private WebElement csm_inchargecy_TransactionDetails_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_inchargecy_TransactionDetails_BulkRemittancescreen_under_Transaction_80() {
		return csm_save_TransactionDetails_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001RE']")
	private WebElement csm_waiverate_TransactionDetails_BulkRemittancescreen_under_Transaction_80;

	public WebElement csm_waiverate_TransactionDetails_BulkRemittancescreen_under_Transaction_80() {
		return csm_waiverate_TransactionDetails_BulkRemittancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001RE']")
	private WebElement csm_trxtype_approvescreen_under_Transaction_80;

	public WebElement csm_trxtype_approvescreen_under_Transaction_80() {
		return csm_trxtype_approvescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//td[text()='Charges']")
	private WebElement csm_charges_under_SystemParameters_80;

	public WebElement csm_charges_under_SystemParameters_80() {
		return csm_charges_under_SystemParameters_80;
	}

	@FindBy(xpath = "//td[text()='Maintenance of Charges']")
	private WebElement csm_Maintenanceofcharges_charges_under_SystemParameters_80;

	public WebElement csm_Maintenanceofcharges_charges_under_SystemParameters_80() {
		return csm_Maintenanceofcharges_charges_under_SystemParameters_80;
	}

	@FindBy(xpath = "//a[@id='C0011MA']//span[text()='Update After Approve']")
	private WebElement csm_UAA_Maintenanceofcharges_charges_under_SystemParameters_80;

	public WebElement csm_UAA_Maintenanceofcharges_charges_under_SystemParameters_80() {
		return csm_UAA_Maintenanceofcharges_charges_under_SystemParameters_80;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.CODE']")
	private WebElement csm_code_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_code_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_code_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='td_chargesParamList_GridTbl_Id_C0011MA_1_ctschargesVO.CODE']")
	private WebElement csm_dblclck_code_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_dblclck_code_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_dblclck_code_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//button[@id='cb_charges_waiverC0011MA']")
	private WebElement csm_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='add_tab125_GridTbl_Id_C0011MA']//span")
	private WebElement csm_add_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_add_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_add_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.AVERAGE_BAL_BASIS']//select")
	private WebElement csm_AvrgBalBasis_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_AvrgBalBasis_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_AvrgBalBasis_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_FromDate_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_FromDate_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_FromDate_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.TO_DATE']//input")
	private WebElement csm_ToDate_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_ToDate_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_ToDate_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.WAIVER_PERCENTAGE']//input")
	private WebElement csm_WaiverPercentage_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_WaiverPercentage_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_WaiverPercentage_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.FROM_BALANCE']//input")
	private WebElement csm_FromBalance_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_FromBalance_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_FromBalance_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.TO_BALANCE']//input")
	private WebElement csm_ToBalance_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_ToBalance_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_ToBalance_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.WAIVER_AMOUNT']//input")
	private WebElement csm_WaiverAmount_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_WaiverAmount_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_WaiverAmount_ChargesWaiver_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011MA_Update_After_Approve_key']")
	private WebElement csm_UAAbtn_UAAscreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_UAAbtn_UAAscreen_Maintenanceofcharges_under_charges_80() {
		return csm_UAAbtn_UAAscreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//a[@id='P024P']//span[text()='Approve']")
	private WebElement csm_Approve_Maintenanceofcharges_under_charges_80;

	public WebElement csm_Approve_Maintenanceofcharges_under_charges_80() {
		return csm_Approve_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")
	private WebElement csm_code_Approvescreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_code_Approvescreen_Maintenanceofcharges_under_charges_80() {
		return csm_code_Approvescreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//td[@id='td_chargesParamList_GridTbl_Id_C0011P_1_ctschargesVO.CODE']")
	private WebElement csm_dblclck_code_Approvescreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_dblclck_code_Approvescreen_Maintenanceofcharges_under_charges_80() {
		return csm_dblclck_code_Approvescreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011P_Approve_key']")
	private WebElement csm_Approvebtn_Approvescreen_Maintenanceofcharges_under_charges_80;

	public WebElement csm_Approvebtn_Approvescreen_Maintenanceofcharges_under_charges_80() {
		return csm_Approvebtn_Approvescreen_Maintenanceofcharges_under_charges_80;
	}

	@FindBy(xpath = "//button[@id='ok_btn_1_C0011MA']//span")
	private WebElement csm_okbtn_chargewaiverscreen_Maintenanceofcharges_under_charges;

	public WebElement csm_okbtn_chargewaiverscreen_Maintenanceofcharges_under_charges() {
		return csm_okbtn_chargewaiverscreen_Maintenanceofcharges_under_charges;
	}

	@FindBy(xpath = "//a[@id='Chequebook Request / Maintenance']")
	private WebElement csm_Backto_Maintenance_ChequeBookRequest_80;

	public WebElement csm_Backto_Maintenance_ChequeBookRequest_80() {
		return csm_Backto_Maintenance_ChequeBookRequest_80;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_A002MA']")
	private WebElement csm_ExemptionType_Dropdown_chargewaiver_under_Accounts_80;

	public WebElement csm_ExemptionType_Dropdown_chargewaiver_under_Accounts_80() {
		return csm_ExemptionType_Dropdown_chargewaiver_under_Accounts_80;
	}

	@FindBy(xpath = "//button[@id='chequeBook_approve_Q000AP']")
	private WebElement csm_Approvebtn_approvescreen_under_chequebookRequest_80;

	public WebElement csm_Approvebtn_approvescreen_under_chequebookRequest_80() {
		return csm_Approvebtn_approvescreen_under_chequebookRequest_80;
	}

	@FindBy(xpath = "//input[@id='exemptFullChargesWaiver_A002MA']")
	private WebElement csm_ExemptFullChargeWaiver_checkbox_maintenance_under_Accounts_80;

	public WebElement csm_ExemptFullChargeWaiver_checkbox_maintenance_under_Accounts_80() {
		return csm_ExemptFullChargeWaiver_checkbox_maintenance_under_Accounts_80;
	}

	@FindBy(xpath = "//td[text()='CIF Parameters']")
	private WebElement csm_cifParameters_under_param_80;

	public WebElement csm_cifParameters_under_param_80() {
		return csm_cifParameters_under_param_80;
	}

	@FindBy(xpath = "//td[text()='CIF Type']")
	private WebElement csm_CifType_Under_CifParam_param_80;

	public WebElement csm_CifType_Under_CifParam_param_80() {
		return csm_CifType_Under_CifParam_param_80;
	}

	@FindBy(xpath = "//a[@id='P010MA']//span[text()='Update After Approve']")
	private WebElement csm_UAA_CifType_Under_CifParam_param_80;

	public WebElement csm_UAA_CifType_Under_CifParam_param_80() {
		return csm_UAA_CifType_Under_CifParam_param_80;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010MA_gs_rifcttVO.TYPE_CODE']")
	private WebElement csm_code_UAAscreen_under_cifType_80;

	public WebElement csm_code_UAAscreen_under_cifType_80() {
		return csm_code_UAAscreen_under_cifType_80;
	}

	@FindBy(xpath = "//td[@id='td_cifTypeParamList_GridTbl_Id_P010MA_1_rifcttVO.TYPE_CODE']")
	private WebElement csm_dblclick_code_UAAscreen_under_cifType_80;

	public WebElement csm_dblclick_code_UAAscreen_under_cifType_80() {
		return csm_dblclick_code_UAAscreen_under_cifType_80;
	}

	@FindBy(xpath = "//span[text()=' Charges Waiver ']")
	private WebElement csm_chargewaiver_UAAscreen_under_cifType_80;

	public WebElement csm_chargewaiver_UAAscreen_under_cifType_80() {
		return csm_chargewaiver_UAAscreen_under_cifType_80;
	}

	@FindBy(xpath = "//td[@id='add_tab12_GridTbl_Id_P010MA']//span")
	private WebElement csm_addBtn_chargerwaiverscreen_UAA_under_CifType_80;

	public WebElement csm_addBtn_chargerwaiverscreen_UAA_under_CifType_80() {
		return csm_addBtn_chargerwaiverscreen_UAA_under_CifType_80;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.EXEMPTION_TYPE']//select")
	private WebElement csm_ExemptionType_chargerwaiverscreen_UAA_under_CifType_80;

	public WebElement csm_ExemptionType_chargerwaiverscreen_UAA_under_CifType_80() {
		return csm_ExemptionType_chargerwaiverscreen_UAA_under_CifType_80;
	}

	@FindBy(xpath = " //td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_FromDate_chargerwaiverscreen_UAA_under_CifType_80;

	public WebElement csm_FromDate_chargerwaiverscreen_UAA_under_CifType_80() {
		return csm_FromDate_chargerwaiverscreen_UAA_under_CifType_80;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.TO_DATE']//input")
	private WebElement csm_ToDate_chargerwaiverscreen_UAA_under_CifType_80;

	public WebElement csm_ToDate_chargerwaiverscreen_UAA_under_CifType_80() {
		return csm_ToDate_chargerwaiverscreen_UAA_under_CifType_80;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.WAIVER_PERCENTAGE']//input")
	private WebElement csm_WaivePercentage_chargerwaiverscreen_UAA_under_CifType_80;

	public WebElement csm_WaivePercentage_chargerwaiverscreen_UAA_under_CifType_80() {
		return csm_WaivePercentage_chargerwaiverscreen_UAA_under_CifType_80;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement csm_okbtn_chargerwaiver_UAA_under_CifType_80;

	public WebElement csm_okbtn_chargerwaiver_UAA_under_CifType_80() {
		return csm_okbtn_chargerwaiver_UAA_under_CifType_80;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010MA_Update_After_Approve_key']")
	private WebElement csm_UAAbtn_chargerwaiver_UAA_under_CifType_80;

	public WebElement csm_UAAbtn_chargerwaiver_UAA_under_CifType_80() {
		return csm_UAAbtn_chargerwaiver_UAA_under_CifType_80;
	}

	@FindBy(xpath = "//a[@id='P010P']//span[text()='Approve']")
	private WebElement csm_Approve_cifType_under_CifParam_80;

	public WebElement csm_Approve_cifType_under_CifParam_80() {
		return csm_Approve_cifType_under_CifParam_80;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010P_gs_rifcttVO.TYPE_CODE']")
	private WebElement csm_code_Approvescreen_under_CifType_80;

	public WebElement csm_code_Approvescreen_under_CifType_80() {
		return csm_code_Approvescreen_under_CifType_80;
	}

	@FindBy(xpath = "//td[@id='td_cifTypeParamList_GridTbl_Id_P010P_1_rifcttVO.ADDITIONAL_REFERENCE']")
	private WebElement csm_dblclck_code_Approvescreen_under_CifType_80;

	public WebElement csm_dblclck_code_Approvescreen_under_CifType_80() {
		return csm_dblclck_code_Approvescreen_under_CifType_80;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010P_Approve_key']")
	private WebElement csm_Approvebtn_Approvescreen_under_cifType_80;

	public WebElement csm_Approvebtn_Approvescreen_under_cifType_80() {
		return csm_Approvebtn_Approvescreen_under_cifType_80;
	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement csm_AddDetls_UAAscreen_under_TransactionType_80;

	public WebElement csm_AddDetls_UAAscreen_under_TransactionType_80() {
		return csm_AddDetls_UAAscreen_under_TransactionType_80;
	}

	@FindBy(xpath = "//span[text()='Available Options for Deduct I']")
	private WebElement csm_Avloptn_UAAscreen_under_TransactionType_80;

	public WebElement csm_Avloptn_UAAscreen_under_TransactionType_80() {
		return csm_Avloptn_UAAscreen_under_TransactionType_80;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement csm_Accounts_606;

	public WebElement csm_Accounts_606() {
		return csm_Accounts_606;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement csm_Accounts_GeneralAcc_606;

	public WebElement csm_Accounts_GeneralAcc_606() {
		return csm_Accounts_GeneralAcc_606;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a[@id='A002MA']")
	private WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_606;

	public WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_606() {
		return csm_Accounts_GeneralAcc_MaintenanceScreen_606;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_606;

	public WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_606() {
		return csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_606;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002MA']")
	private WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_Doubleclick_606;

	public WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_Doubleclick_606() {
		return csm_Accounts_GeneralAcc_MaintenanceScreen_EnterCifNo_Doubleclick_606;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_waiver_charges_key']")
	private WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_clickChargeWaiverField_606;

	public WebElement csm_Accounts_GeneralAcc_MaintenanceScreen_clickChargeWaiverField_606() {
		return csm_Accounts_GeneralAcc_MaintenanceScreen_clickChargeWaiverField_606;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_A002MA']") // Custom Exemption
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ExcemptionType_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ExcemptionType_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_ExcemptionType_606;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_A002MA']") // Daily
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_AvgBalanceBasic_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_AvgBalanceBasic_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_AvgBalanceBasic_606;
	}

	@FindBy(xpath = "//td[@id='add_chargesWaiverGrid_Id_A002MA']")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_PlusBtn_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_PlusBtn_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_PlusBtn_606;
	}

	@FindBy(xpath = "(//td[@id='td_chargesWaiverGrid_Id_A002MA_0_rn'])[1]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_clictoView_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_clictoView_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_clictoView_606;
	}

	@FindBy(xpath = "(//td[@id='td_chargesWaiverGrid_Id_A002MA_1_rn'])[1]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_clictoView_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_clictoView_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_clictoView_606;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[1]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_FromDate_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_FromDate_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_FromDate_606;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_FromDate_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_FromDate_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_FromDate_606;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[2]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ToDate_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ToDate_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_ToDate_606;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_DATE']//input")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_ToDate_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_ToDate_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_TotalExemption_ToDate_606;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[3]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_FromBalanced_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_FromBalanced_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_FromBalanced_606;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[4]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ToBalanced_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_ToBalanced_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_ToBalanced_606;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[5]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverPercent_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverPercent_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverPercent_606;
	}

	@FindBy(xpath = "(//input[@gridid='chargesWaiverGrid_Id_A002MA'])[6]")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverAmount_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverAmount_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_WaiverAmount_606;
	}

	@FindBy(xpath = "//td[@id='del_chargesWaiverGrid_Id_A002MA']")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_deleteBtn_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_deleteBtn_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_deleteBtn_606;
	}

	@FindBy(xpath = "//span[text()='ok']//parent::button")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_OKBtn_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_OKBtn_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_OKBtn_606;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_Update_key']")
	private WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_UpdateKey_606;

	public WebElement csm_Accounts_GeneralAcc_clickChargeWaiverField_UpdateKey_606() {
		return csm_Accounts_GeneralAcc_clickChargeWaiverField_UpdateKey_606;
	}

	@FindBy(xpath = "//span[text()='Authorize']//parent::a[@id='A002AU']")
	private WebElement csm_Accounts_GeneralAcc_AutorizeStage_606;

	public WebElement csm_Accounts_GeneralAcc_AutorizeStage_606() {
		return csm_Accounts_GeneralAcc_AutorizeStage_606;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.CIF_SUB_NO']")
	private WebElement csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_606;

	public WebElement csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_606() {
		return csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_606;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002AU']")
	private WebElement csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_Doubleclick_606;

	public WebElement csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_Doubleclick_606() {
		return csm_Accounts_GeneralAcc_AutorizeStage_EnterCIF_Doubleclick_606;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement csm_Accounts_GeneralAcc_AutorizeStage_AuthorizeButton_606;

	public WebElement csm_Accounts_GeneralAcc_AutorizeStage_AuthorizeButton_606() {
		return csm_Accounts_GeneralAcc_AutorizeStage_AuthorizeButton_606;
	}

	@FindBy(xpath = "//span[text()='Charges']")
	private WebElement csm_ChequeBookRequest_Maintenance_ChargesField_606;

	public WebElement csm_ChequeBookRequest_Maintenance_ChargesField_606() {
		return csm_ChequeBookRequest_Maintenance_ChargesField_606;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement csm_GendralAcc_AutorizeScreen_CancelBtn_606;

	public WebElement csm_GendralAcc_AutorizeScreen_CancelBtn_606() {
		return csm_GendralAcc_AutorizeScreen_CancelBtn_606;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks;

	public WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks() {
		return csmcore_Chequebookrequest_maintanace_NoofChequeBooks;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode;

	public WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode() {
		return csmcore_Chequebookrequest_maintanace_Code_branchcode;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_currencyCode;

	public WebElement csmcore_Chequebookrequest_maintanace_currencyCode() {
		return csmcore_Chequebookrequest_maintanace_currencyCode;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_GLcode;

	public WebElement csmcore_Chequebookrequest_maintanace_GLcode() {
		return csmcore_Chequebookrequest_maintanace_GLcode;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_CIFCode;

	public WebElement csmcore_Chequebookrequest_maintanace_CIFCode() {
		return csmcore_Chequebookrequest_maintanace_CIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_SerialNo;

	public WebElement csmcore_Chequebookrequest_maintanace_SerialNo() {
		return csmcore_Chequebookrequest_maintanace_SerialNo;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement csmcore_Chequebookrequest_maintanace_SaveButton;

	public WebElement csmcore_Chequebookrequest_maintanace_SaveButton() {
		return csmcore_Chequebookrequest_maintanace_SaveButton;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code;

	public WebElement csmcore_Chequebookrequest_maintanace_Code() {
		return csmcore_Chequebookrequest_maintanace_Code;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement csmcore_Chequebookrequest_Approve_InputField;

	public WebElement csmcore_Chequebookrequest_Approve_InputField() {
		return csmcore_Chequebookrequest_Approve_InputField;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement csmcore_Chequebookrequest_Approve_CifNumberInputField;

	public WebElement csmcore_Chequebookrequest_Approve_CifNumberInputField() {
		return csmcore_Chequebookrequest_Approve_CifNumberInputField;
	}

	// special conditons page object

	@FindBy(xpath = "//td[text()='Special Conditions']")
	private WebElement csmcore_specialConditions_606;

	public WebElement csmcore_specialConditions_606() {
		return csmcore_specialConditions_606;
	}

	@FindBy(xpath = "//span[text()='To Delete']//parent::a[@id='SPC00TD']")
	private WebElement csmcore_specialConditions_ToDelete_606;

	public WebElement csmcore_specialConditions_ToDelete_606() {
		return csmcore_specialConditions_ToDelete_606;
	}

	@FindBy(xpath = "//input[@id='specialConditionsGridTbl_Id_SPC00TD_gs_specialConditionsVO.ACC_CIF']")
	private WebElement csmcore_specialConditions_ToDelete_EnterCifNo_606;

	public WebElement csmcore_specialConditions_ToDelete_EnterCifNo_606() {
		return csmcore_specialConditions_ToDelete_EnterCifNo_606;
	}

	@FindBy(xpath = "//table[@id='specialConditionsGridTbl_Id_SPC00TD']")
	private WebElement csmcore_specialConditions_ToDelete_DoubleClick_606;

	public WebElement csmcore_specialConditions_ToDelete_DoubleClick_606() {
		return csmcore_specialConditions_ToDelete_DoubleClick_606;
	}

	@FindBy(xpath = "//label[@id='specialConditionsDefFormId_SPC00TD_btn_toDel']")
	private WebElement csmcore_specialConditions_ToDelete_DoubleClick_DeleteButton_606;

	public WebElement csmcore_specialConditions_ToDelete_DoubleClick_DeleteButton_606() {
		return csmcore_specialConditions_ToDelete_DoubleClick_DeleteButton_606;
	}

	@FindBy(xpath = "//span[text()='Delete']//parent::a[@id='SPC00DD']")
	private WebElement csmcore_specialConditions_DeleteStage_606;

	public WebElement csmcore_specialConditions_DeleteStage_606() {
		return csmcore_specialConditions_DeleteStage_606;
	}

	@FindBy(xpath = "//input[@id='specialConditionsGridTbl_Id_SPC00DD_gs_specialConditionsVO.ACC_CIF']")
	private WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_606;

	public WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_606() {
		return csmcore_specialConditions_DeleteStage_EnterCifNo_606;
	}

	@FindBy(xpath = "//table[@id='specialConditionsGridTbl_Id_SPC00DD']")
	private WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_Doublclick_606;

	public WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_Doublclick_606() {
		return csmcore_specialConditions_DeleteStage_EnterCifNo_Doublclick_606;
	}

	@FindBy(xpath = "//label[@id='specialConditionsDefFormId_SPC00DD_btn_del']")
	private WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_EnterCifNo_deletebutton_606;

	public WebElement csmcore_specialConditions_DeleteStage_EnterCifNo_EnterCifNo_deletebutton_606() {
		return csmcore_specialConditions_DeleteStage_EnterCifNo_EnterCifNo_deletebutton_606;
	}

	@FindBy(xpath = "//*[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_inputfield;

	public WebElement csmParam_Transactiontype_inputfield() {
		return csmParam_Transactiontype_inputfield;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_debitAcc_currency;

	public WebElement Transactions_debitAcc_currency() {
		return Transactions_debitAcc_currency;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit() {
		return CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit() {
		return CSMCore_Transactions_Maintenance_BranchCodeForCredit;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_GLCodeCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_GLCodeCodeForCredit() {
		return CSMCore_Transactions_Maintenance_GLCodeCodeForCredit;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit() {
		return CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_SerialNoCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_SerialNoCodeForCredit() {
		return CSMCore_Transactions_Maintenance_SerialNoCodeForCredit;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValue;

	public WebElement Transactions_transactionNo_codeValue() {
		return Transactions_transactionNo_codeValue;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Charges_key']")
	private WebElement Transactions_maintenance_chargesbutton;

	public WebElement Transactions_maintenance_chargesbutton() {
		return Transactions_maintenance_chargesbutton;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code;

	public WebElement CSMParam_TransactionType_UPA_code() {
		return CSMParam_TransactionType_UPA_code;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code;

	public WebElement CSMParam_TransactionType_Approve_code() {
		return CSMParam_TransactionType_Approve_code;
	}

	// CHWA_P2_095

	@FindBy(xpath = "//td[text()='CIF Parameters']")
	private WebElement CSMParam_CIFParamenters;

	public WebElement CSMParam_CIFParamenters() {
		return CSMParam_CIFParamenters;
	}

	@FindBy(xpath = "//td[text()='CIF Type']")
	private WebElement CSMParam_CIFParamenters_CIFType;

	public WebElement CSMParam_CIFParamenters_CIFType() {
		return CSMParam_CIFParamenters_CIFType;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']//parent::a[@id='P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove;

	public WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove() {
		return CSMParam_CIFParamenters_CIFType_UpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010MA_gs_rifcttVO.TYPE_CODE']")
	private WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode;

	public WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode() {
		return CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode;
	}

	@FindBy(xpath = "//table[@id='cifTypeParamList_GridTbl_Id_P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode_DoubleClick;

	public WebElement CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode_DoubleClick() {
		return CSMParam_CIFParamenters_CIFType_UpdateAfterApprove_TypeCode_DoubleClick;
	}

	@FindBy(xpath = "//span[text()=' Charges Waiver ']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField;
	}

	@FindBy(xpath = "//td[@id='add_tab12_GridTbl_Id_P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.EXEMPTION_TYPE']//select")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn_ExemptionType;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn_ExemptionType() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_PlusBtn_ExemptionType;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.FROM_DATE']//input")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_FromDate;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_FromDate() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_FromDate;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.TO_DATE']//input ")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_ToDate;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_ToDate() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_ToDate;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.WAIVER_PERCENTAGE']//input")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_WaiverPercent;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_WaiverPercent() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_WaiverPercent;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_ctschargesWaiverVO.WAIVER_AMOUNT']//input ")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_WaiverAmount;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_WaiverAmount() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_WaiverAmount;
	}

	@FindBy(xpath = "(//select[@gridid='tab12_GridTbl_Id_P010MA'])[2] ")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_AverageBalanceBasic;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_AverageBalanceBasic() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_AverageBalanceBasic;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P010MA_1_rn']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist;
	}

	@FindBy(xpath = "//td[@id='del_tab12_GridTbl_Id_P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist_DeleteBtn;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist_DeleteBtn() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_RecordIfExist_DeleteBtn;
	}

	@FindBy(xpath = "//button[@id='ok_btn_11_P010MA']")
	private WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_OKBtn;

	public WebElement CSMParam_CIFParamenters_CIFType_ChargeWaiverField_OKBtn() {
		return CSMParam_CIFParamenters_CIFType_ChargeWaiverField_OKBtn;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010MA_Update_After_Approve_key'] ")
	private WebElement CSMParam_CIFParamenters_CIFType_UPABtn;

	public WebElement CSMParam_CIFParamenters_CIFType_UPABtn() {
		return CSMParam_CIFParamenters_CIFType_UPABtn;
	}

	@FindBy(xpath = "//span[text()='Approve']//parent::a[@id='P010P'] ")
	private WebElement CSMParam_CIFParamenters_CIFType_ApproveStage;

	public WebElement CSMParam_CIFParamenters_CIFType_ApproveStage() {
		return CSMParam_CIFParamenters_CIFType_ApproveStage;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010P_gs_rifcttVO.TYPE_CODE']")
	private WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode;

	public WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode() {
		return CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode;
	}

	@FindBy(xpath = "//table[@id='cifTypeParamList_GridTbl_Id_P010P']")
	private WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode_DoubleClick;

	public WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode_DoubleClick() {
		return CSMParam_CIFParamenters_CIFType_ApproveStage_TypeCode_DoubleClick;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010P_Approve_key']")
	private WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_ApproveButton;

	public WebElement CSMParam_CIFParamenters_CIFType_ApproveStage_ApproveButton() {
		return CSMParam_CIFParamenters_CIFType_ApproveStage_ApproveButton;
	}
	// Bulk Remmitance

	@FindBy(xpath = "//input[@id='in_charged_cy_input_D001RE']")
	private WebElement csm_inchargedCY_ChargesScreen_Maintenance_Transaction_80;

	public WebElement csm_inchargedCY_ChargesScreen_Maintenance_Transaction_80() {
		return csm_inchargedCY_ChargesScreen_Maintenance_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001RE']")
	private WebElement csm_WaiveRate_ChargesScreen_Maintenance_Transaction_80;

	public WebElement csm_WaiveRate_ChargesScreen_Maintenance_Transaction_80() {
		return csm_WaiveRate_ChargesScreen_Maintenance_Transaction_80;
	}

	@FindBy(xpath = "//label[@id='bulkRemittanceDetFormId_D001RE_Waive_Charges_key']")
	private WebElement csm_WaiveCharges_Maintenancescreen_under_Transaction_80;

	public WebElement csm_WaiveCharges_Maintenancescreen_under_Transaction_80() {
		return csm_WaiveCharges_Maintenancescreen_under_Transaction_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_remittance_Type_D001RE']")
	private WebElement BulkTransaction_RemmitanceType;

	public WebElement BulkTransaction_RemmitanceType() {
		return BulkTransaction_RemmitanceType;

	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001RE']")
	private WebElement CSM_BranchCodeINBulkRemitance_TransactionDetails;

	public WebElement CSM_BranchCodeINBulkRemitance_TransactionDetails() {
		return CSM_BranchCodeINBulkRemitance_TransactionDetails;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001RE']")
	private WebElement CSM_GlCodeINBulkRemitance_TransactionDetails;

	public WebElement CSM_GlCodeINBulkRemitance_TransactionDetails() {
		return CSM_GlCodeINBulkRemitance_TransactionDetails;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001RE']")

	private WebElement CSM_SlCodeINBulkRemitance_TransactionDetails;

	public WebElement CSM_SlCodeINBulkRemitance_TransactionDetails() {

		return CSM_SlCodeINBulkRemitance_TransactionDetails;

	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001RE']")

	private WebElement CSM_CIFCodeINBulkRemitance_TransactionDetails;

	public WebElement CSM_CIFCodeINBulkRemitance_TransactionDetails() {

		return CSM_CIFCodeINBulkRemitance_TransactionDetails;

	}

	@FindBy(xpath = "//a[@id='P024MA']")
	private WebElement csm_UAA_TransactionType_83;

	public WebElement csm_UAA_TransactionType_83() {
		return csm_UAA_TransactionType_83;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement csm_CodeunderUAA_TransactionType_83;

	public WebElement csm_CodeunderUAA_TransactionType_83() {
		return csm_CodeunderUAA_TransactionType_83;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement csm_DoubeleClk_CodeunderUAA_TransactionType_83;

	public WebElement csm_DoubeleClk_CodeunderUAA_TransactionType_83() {
		return csm_DoubeleClk_CodeunderUAA_TransactionType_83;
	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement csm_DeductFromDebtorAcc_Checkbox_83;

	public WebElement csm_DeductFromDebtorAcc_Checkbox_83() {
		return csm_DeductFromDebtorAcc_Checkbox_83;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement csm_DeductFromDebtorAcc_RadioButton_83;

	public WebElement csm_DeductFromDebtorAcc_RadioButton_83() {
		return csm_DeductFromDebtorAcc_RadioButton_83;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement csm_UAAButton_TransactionType_83;

	public WebElement csm_UAAButton_TransactionType_83() {
		return csm_UAAButton_TransactionType_83;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csm_Confirmation_Ok_Button_83;

	public WebElement csm_Confirmation_Ok_Button_83() {
		return csm_Confirmation_Ok_Button_83;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csm_Successfull_Ok_Button_83;

	public WebElement csm_Successfull_Ok_Button_83() {
		return csm_Successfull_Ok_Button_83;
	}

	@FindBy(xpath = "(//span[text()='Approve'])[5]")
	private WebElement csm_ApproveScreen_TransactionType_83;

	public WebElement csm_ApproveScreen_TransactionType_83() {
		return csm_ApproveScreen_TransactionType_83;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement csm_Code_ApproveScreen_TransactionType_83;

	public WebElement csm_Code_ApproveScreen_TransactionType_83() {
		return csm_Code_ApproveScreen_TransactionType_83;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement csm_DoubleClk_Code_ApproveScreen_TransactionType_83;

	public WebElement csm_DoubleClk_Code_ApproveScreen_TransactionType_83() {
		return csm_DoubleClk_Code_ApproveScreen_TransactionType_83;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement csm_ApproveBtn_ApproveScreen_TransactionType_83;

	public WebElement csm_ApproveBtn_ApproveScreen_TransactionType_83() {
		return csm_ApproveBtn_ApproveScreen_TransactionType_83;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement csm_Accounts_Core_83;

	public WebElement csm_Accounts_Core_83() {
		return csm_Accounts_Core_83;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement csm_GeneralAccounts_Core_83;

	public WebElement csm_GeneralAccounts_Core_83() {
		return csm_GeneralAccounts_Core_83;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement csm_Maintainance_GeneralAccounts_83;

	public WebElement csm_Maintainance_GeneralAccounts_83() {
		return csm_Maintainance_GeneralAccounts_83;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement csm_CIFcode_Maintainance_GeneralAccounts_83;

	public WebElement csm_CIFcode_Maintainance_GeneralAccounts_83() {
		return csm_CIFcode_Maintainance_GeneralAccounts_83;
	}

	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002MA_1_amfVO.CIF_SUB_NO']")
	private WebElement csm_DoubleClk_CIFcode_Maintainance_GeneralAccounts_83;

	public WebElement csm_DoubleClk_CIFcode_Maintainance_GeneralAccounts_83() {
		return csm_DoubleClk_CIFcode_Maintainance_GeneralAccounts_83;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_waiver_charges_key']")
	private WebElement csm_ChargesWaiver_Maintainance_GeneralAccounts_83;

	public WebElement csm_ChargesWaiver_Maintainance_GeneralAccounts_83() {
		return csm_ChargesWaiver_Maintainance_GeneralAccounts_83;
	}

	@FindBy(xpath = "//td[@id='add_chargesWaiverGrid_Id_A002MA']")
	private WebElement csm_Addbtn_ChargesWaiver_Maintainance_GeneralAccounts_83;

	public WebElement csm_Addbtn_ChargesWaiver_Maintainance_GeneralAccounts_83() {
		return csm_Addbtn_ChargesWaiver_Maintainance_GeneralAccounts_83;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_A002MA']")
	private WebElement csm_ExemptionType_ChargesWaiver_Maintainance_GeneralAccounts_83;

	public WebElement csm_ExemptionType_ChargesWaiver_Maintainance_GeneralAccounts_83() {
		return csm_ExemptionType_ChargesWaiver_Maintainance_GeneralAccounts_83;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_A002MA']")
	private WebElement csm_AverageBalBasis_ChargesWaiver_Maintainance_GeneralAccounts_83;

	public WebElement csm_AverageBalBasis_ChargesWaiver_Maintainance_GeneralAccounts_83() {
		return csm_AverageBalBasis_ChargesWaiver_Maintainance_GeneralAccounts_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_FromDate_ChargesWaiver_83;

	public WebElement csm_FromDate_ChargesWaiver_83() {
		return csm_FromDate_ChargesWaiver_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_DATE']//input")
	private WebElement csm_ToDate_ChargesWaiver_83;

	public WebElement csm_ToDate_ChargesWaiver_83() {
		return csm_ToDate_ChargesWaiver_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_BALANCE']//input")
	private WebElement csm_FromBalance_ChargesWaiver_83;

	public WebElement csm_FromBalance_ChargesWaiver_83() {
		return csm_FromBalance_ChargesWaiver_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_BALANCE']//input")
	private WebElement csm_ToBalance_ChargesWaiver_83;

	public WebElement csm_ToBalance_ChargesWaiver_83() {
		return csm_ToBalance_ChargesWaiver_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.WAIVER_PERCENTAGE']//input")
	private WebElement csm_WaiverPercentage_ChargesWaiver_83;

	public WebElement csm_WaiverPercentage_ChargesWaiver_83() {
		return csm_WaiverPercentage_ChargesWaiver_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.WAIVER_AMOUNT']//input")
	private WebElement csm_WaiverAmount_ChargesWaiver_83;

	public WebElement csm_WaiverAmount_ChargesWaiver_83() {
		return csm_WaiverAmount_ChargesWaiver_83;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement csm_OkButton_ChargesWaiver_83;

	public WebElement csm_OkButton_ChargesWaiver_83() {
		return csm_OkButton_ChargesWaiver_83;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_Update_key']")
	private WebElement csm_UpdateButton_Maintainance_GeneralAccounts_83;

	public WebElement csm_UpdateButton_Maintainance_GeneralAccounts_83() {
		return csm_UpdateButton_Maintainance_GeneralAccounts_83;
	}

	@FindBy(xpath = "//span[text()='Authorize']")
	private WebElement csm_Authorize_GeneralAccounts_83;

	public WebElement csm_Authorize_GeneralAccounts_83() {
		return csm_Authorize_GeneralAccounts_83;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.CIF_SUB_NO']")
	private WebElement csm_CIFCode_Authorize_GeneralAccounts_83;

	public WebElement csm_CIFCode_Authorize_GeneralAccounts_83() {
		return csm_CIFCode_Authorize_GeneralAccounts_83;
	}

	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002AU_1_amfVO.CIF_SUB_NO']")
	private WebElement csm_DoubleClk_CIFCode_Authorize_GeneralAccounts_83;

	public WebElement csm_DoubleClk_CIFCode_Authorize_GeneralAccounts_83() {
		return csm_DoubleClk_CIFCode_Authorize_GeneralAccounts_83;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement csm_AuthorizeButton_Authorize_GeneralAccounts_83;

	public WebElement csm_AuthorizeButton_Authorize_GeneralAccounts_83() {
		return csm_AuthorizeButton_Authorize_GeneralAccounts_83;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement csm_PrintCancelConfirmationBtn_GeneralAccounts_83;

	public WebElement csm_PrintCancelConfirmationBtn_GeneralAccounts_83() {
		return csm_PrintCancelConfirmationBtn_GeneralAccounts_83;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_Transactions_Core_83;

	public WebElement csm_Transactions_Core_83() {
		return csm_Transactions_Core_83;
	}

	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement csm_Maintainance_Transactions_83;

	public WebElement csm_Maintainance_Transactions_83() {
		return csm_Maintainance_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement csm_TRXtype_Transactions_83;

	public WebElement csm_TRXtype_Transactions_83() {
		return csm_TRXtype_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement csm_BranchCode_CreditAcc_Transactions_83;

	public WebElement csm_BranchCode_CreditAcc_Transactions_83() {
		return csm_BranchCode_CreditAcc_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement csm_CurrencyCode_CreditAcc_Transactions_83;

	public WebElement csm_CurrencyCode_CreditAcc_Transactions_83() {
		return csm_CurrencyCode_CreditAcc_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement csm_GLCode_CreditAcc_Transactions_83;

	public WebElement csm_GLCode_CreditAcc_Transactions_83() {
		return csm_GLCode_CreditAcc_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement csm_CIFCode_CreditAcc_Transactions_83;

	public WebElement csm_CIFCode_CreditAcc_Transactions_83() {
		return csm_CIFCode_CreditAcc_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement csm_SerialNo_CreditAcc_Transactions_83;

	public WebElement csm_SerialNo_CreditAcc_Transactions_83() {
		return csm_SerialNo_CreditAcc_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement csm_CurrencyCode_CurrencyColumn_Transactions_83;

	public WebElement csm_CurrencyCode_CurrencyColumn_Transactions_83() {
		return csm_CurrencyCode_CurrencyColumn_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement csm_Amount_CurrencyColumn_Transactions_83;

	public WebElement csm_Amount_CurrencyColumn_Transactions_83() {
		return csm_Amount_CurrencyColumn_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement csm_BranchCode_DebitAcc_Transactions_83;

	public WebElement csm_BranchCode_DebitAcc_Transactions_83() {
		return csm_BranchCode_DebitAcc_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement csm_GLCode_DebitAcc_Transactions_83;

	public WebElement csm_GLCode_DebitAcc_Transactions_83() {
		return csm_GLCode_DebitAcc_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement csm_CIFCode_DebitAcc_Transactions_83;

	public WebElement csm_CIFCode_DebitAcc_Transactions_83() {
		return csm_CIFCode_DebitAcc_Transactions_83;
	}

	@FindBy(xpath = "lookuptxt_to_trs_ac_sl_D001MT")
	private WebElement csm_SerialNo_DebitAcc_Transactions_83;

	public WebElement csm_SerialNo_DebitAcc_Transactions_83() {
		return csm_SerialNo_DebitAcc_Transactions_83;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Charges_key']")
	private WebElement csm_Charges_ChargeDetails_Transactions_83;

	public WebElement csm_Charges_ChargeDetails_Transactions_83() {
		return csm_Charges_ChargeDetails_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='in_charged_cy_input_D001MT']")
	private WebElement csm_inChargedCY_Charges_ChargeDetails_83;

	public WebElement csm_inChargedCY_Charges_ChargeDetails_83() {
		return csm_inChargedCY_Charges_ChargeDetails_83;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001MT']")
	private WebElement csm_WaiveRate_Charges_ChargeDetails_83;

	public WebElement csm_WaiveRate_Charges_ChargeDetails_83() {
		return csm_WaiveRate_Charges_ChargeDetails_83;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Waive_Charges_key']")
	private WebElement csm_WaiveCharges_Charges_ChargeDetails_83;

	public WebElement csm_WaiveCharges_Charges_ChargeDetails_83() {
		return csm_WaiveCharges_Charges_ChargeDetails_83;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']//span")
	private WebElement csm_SaveBtn_Maintainance_Transactions_83;

	public WebElement csm_SaveBtn_Maintainance_Transactions_83() {
		return csm_SaveBtn_Maintainance_Transactions_83;
	}

	@FindBy(xpath = "//a[@id='D001AU']")
	private WebElement csm_ApproveScreen_Transactions_83;

	public WebElement csm_ApproveScreen_Transactions_83() {
		return csm_ApproveScreen_Transactions_83;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement csm_TransactionNo_ApproveScreen_Transactions_83;

	public WebElement csm_TransactionNo_ApproveScreen_Transactions_83() {
		return csm_TransactionNo_ApproveScreen_Transactions_83;
	}

	@FindBy(xpath = " //td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement csm_DoubleClk_TransactionNo_ApproveScreen_Transactions_83;

	public WebElement csm_DoubleClk_TransactionNo_ApproveScreen_Transactions_83() {
		return csm_DoubleClk_TransactionNo_ApproveScreen_Transactions_83;
	}

	@FindBy(xpath = "//button[@id='submit_252439935']//span")
	private WebElement csm_ApproveBtn_ApproveScreen_Transactions_83;

	public WebElement csm_ApproveBtn_ApproveScreen_Transactions_83() {
		return csm_ApproveBtn_ApproveScreen_Transactions_83;
	}

	@FindBy(xpath = "//td[text()='Charges']")
	private WebElement csm_Charges_Param_83;

	public WebElement csm_Charges_Param_83() {
		return csm_Charges_Param_83;
	}

	@FindBy(xpath = "//td[text()='Maintenance of Charges']")
	private WebElement csm_MaintainanceOfCharges_Param_83;

	public WebElement csm_MaintainanceOfCharges_Param_83() {
		return csm_MaintainanceOfCharges_Param_83;
	}

	@FindBy(xpath = "(//span[text()='Update After Approve'])[1]")
	private WebElement csm_UAA_MOC_Charges_Param_83;

	public WebElement csm_UAA_MOC_Charges_Param_83() {
		return csm_UAA_MOC_Charges_Param_83;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.CODE']")
	private WebElement csm_CodeUAA_MOC_Charges_83;

	public WebElement csm_CodeUAA_MOC_Charges_83() {
		return csm_CodeUAA_MOC_Charges_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesParamList_GridTbl_Id_C0011MA_1_ctschargesVO.CODE']")
	private WebElement csm_DoubleClk_CodeUAA_MOC_Charges_83;

	public WebElement csm_DoubleClk_CodeUAA_MOC_Charges_83() {
		return csm_DoubleClk_CodeUAA_MOC_Charges_83;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011MA_waiver_charges_key']")
	private WebElement csm_ChargesWaiver_Maintainance_Charges_83;

	public WebElement csm_ChargesWaiver_Maintainance_Charges_83() {
		return csm_ChargesWaiver_Maintainance_Charges_83;
	}

	@FindBy(xpath = "//td[@id='add_tab125_GridTbl_Id_C0011MA']")
	private WebElement csm_AddBtn_ChargesWaiverUAA_MOC_Charges_83;

	public WebElement csm_AddBtn_ChargesWaiverUAA_MOC_Charges_83() {
		return csm_AddBtn_ChargesWaiverUAA_MOC_Charges_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.EXEMPTION_TYPE']//select")
	private WebElement csm_ExemptionTypeTE_ChargesWaiverUAA_MOC_Charges_83;

	public WebElement csm_ExemptionType_ChargesWaiverUAA_MOC_Charges_83() {
		return csm_ExemptionTypeTE_ChargesWaiverUAA_MOC_Charges_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_FromDateTE_ChargesWaiverUAA_MOC_Charges_83;

	public WebElement csm_FromDateTE_ChargesWaiverUAA_MOC_Charges_83() {
		return csm_FromDateTE_ChargesWaiverUAA_MOC_Charges_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.TO_DATE']//input")
	private WebElement csm_ToDateTE_ChargesWaiverUAA_MOC_Charges_83;

	public WebElement csm_ToDateTE_ChargesWaiverUAA_MOC_Charges_83() {
		return csm_ToDateTE_ChargesWaiverUAA_MOC_Charges_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.WAIVER_PERCENTAGE']//input")
	private WebElement csm_WaiverPercentageTE_ChargesWaiverUAA_MOC_Charges_83;

	public WebElement csm_WaiverPercentageTE_ChargesWaiverUAA_MOC_Charges_83() {
		return csm_WaiverPercentageTE_ChargesWaiverUAA_MOC_Charges_83;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement csm_OkBtnTE_ChargesWaiverUAA_MOC_Charges_83;

	public WebElement csm_OkBtnTE_ChargesWaiverUAA_MOC_Charges_83() {
		return csm_OkBtnTE_ChargesWaiverUAA_MOC_Charges_83;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011MA_Update_After_Approve_key']")
	private WebElement csm_UAABtn_ChargesWaiverUAA_MOC_Charges_83;

	public WebElement csm_UAABtn_ChargesWaiverUAA_MOC_Charges_83() {
		return csm_UAABtn_ChargesWaiverUAA_MOC_Charges_83;
	}

	@FindBy(xpath = "(//span[text()='Approve'])[1]")
	private WebElement csm_ApproveScreen_MOC_Charges_83;

	public WebElement csm_ApproveScreen_MOC_Charges_83() {
		return csm_ApproveScreen_MOC_Charges_83;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")
	private WebElement csm_Code_ApproveScreen_MOC_Charges_83;

	public WebElement csm_Code_ApproveScreen_MOC_Charges_83() {
		return csm_Code_ApproveScreen_MOC_Charges_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesParamList_GridTbl_Id_C0011P_1_ctschargesVO.CODE']")
	private WebElement csm_DoubleClkCode_ApproveScreen_MOC_Charges_83;

	public WebElement csm_DoubleClkCode_ApproveScreen_MOC_Charges_83() {
		return csm_DoubleClkCode_ApproveScreen_MOC_Charges_83;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011P_Approve_key']")
	private WebElement csm_ApproveBtn_ApproveScreen_MOC_Charges_83;

	public WebElement csm_ApproveBtn_ApproveScreen_MOC_Charges_83() {
		return csm_ApproveBtn_ApproveScreen_MOC_Charges_83;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement csm_ChequeBookreq_Core_83;

	public WebElement csm_ChequeBookreq_Core_83() {
		return csm_ChequeBookreq_Core_83;
	}

	@FindBy(xpath = "//a[@id='Q000MT']")
	private WebElement csm_Maintainance_ChequeBookreq_Core_83;

	public WebElement csm_Maintainance_ChequeBookreq_Core_83() {
		return csm_Maintainance_ChequeBookreq_Core_83;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement csm_NoOfChequeBooks_Maintainance_ChequeBookreq_83;

	public WebElement csm_NoOfChequeBooks_Maintainance_ChequeBookreq_83() {
		return csm_NoOfChequeBooks_Maintainance_ChequeBookreq_83;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement csm_BranchCode_Maintainance_ChequeBookreq_83;

	public WebElement csm_BranchCode_Maintainance_ChequeBookreq_83() {
		return csm_BranchCode_Maintainance_ChequeBookreq_83;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement csm_CurrencyCode_Maintainance_ChequeBookreq_83;

	public WebElement csm_CurrencyCode_Maintainance_ChequeBookreq_83() {
		return csm_CurrencyCode_Maintainance_ChequeBookreq_83;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement csm_GLCode_Maintainance_ChequeBookreq_83;

	public WebElement csm_GLCode_Maintainance_ChequeBookreq_83() {
		return csm_GLCode_Maintainance_ChequeBookreq_83;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement csm_CIFCode_Maintainance_ChequeBookreq_83;

	public WebElement csm_CIFCode_Maintainance_ChequeBookreq_83() {
		return csm_CIFCode_Maintainance_ChequeBookreq_83;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement csm_SerailNo_Maintainance_ChequeBookreq_83;

	public WebElement csm_SerailNo_Maintainance_ChequeBookreq_83() {
		return csm_SerailNo_Maintainance_ChequeBookreq_83;
	}

	@FindBy(xpath = "//span[text()='Charges']")
	private WebElement csm_Charges_Maintainance_ChequeBookreq_83;

	public WebElement csm_Charges_Maintainance_ChequeBookreq_83() {
		return csm_Charges_Maintainance_ChequeBookreq_83;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement csm_SaveBtn_Maintainance_ChequeBookreq_83;

	public WebElement csm_SaveBtn_Maintainance_ChequeBookreq_83() {
		return csm_SaveBtn_Maintainance_ChequeBookreq_83;
	}

	@FindBy(xpath = "//a[@id='Q000AP']//span")
	private WebElement csm_ApproveScreen_ChequeBookreq_83;

	public WebElement csm_ApproveScreen_ChequeBookreq_83() {
		return csm_ApproveScreen_ChequeBookreq_83;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.ACC_GL']")
	private WebElement csm_GLcode_Approve_ChequeBookreq_83;

	public WebElement csm_GLcode_Approve_ChequeBookreq_83() {
		return csm_GLcode_Approve_ChequeBookreq_83;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.ACC_GL']")
	private WebElement csm_DoubleClk_GLcode_Approve_ChequeBookreq_83;

	public WebElement csm_DoubleClk_GLcode_Approve_ChequeBookreq_83() {
		return csm_DoubleClk_GLcode_Approve_ChequeBookreq_83;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000AP_Approve_key']")
	private WebElement csm_ApproveBtn_Approve_ChequeBookreq_83;

	public WebElement csm_ApproveBtn_Approve_ChequeBookreq_83() {
		return csm_ApproveBtn_Approve_ChequeBookreq_83;
	}

	@FindBy(xpath = "//span[text()='Bulk Remittance']")
	private WebElement csm_BulkRemittance_under_Transaction_83;

	public WebElement csm_BulkRemittance_under_Transaction_83() {
		return csm_BulkRemittance_under_Transaction_83;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement csm_BulkRemittanceType_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_BulkRemittanceType_BulkRemittancescreen_under_Transaction_83() {
		return csm_BulkRemittanceType_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001RE']")
	private WebElement csm_trxtype_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_trxtype_BulkRemittancescreen_under_Transaction_83() {
		return csm_trxtype_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_remittance_Type_D001RE']")
	private WebElement csm_RemittanceType_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_RemittanceType_BulkRemittancescreen_under_Transaction_83() {
		return csm_RemittanceType_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001RE']")
	private WebElement csm_currencycode_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_currencycode_BulkRemittancescreen_under_Transaction_83() {
		return csm_currencycode_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001RE']")
	private WebElement csm_GLcode_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_GLcode_BulkRemittancescreen_under_Transaction_83() {
		return csm_GLcode_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001RE']")
	private WebElement csm_CIFcode_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_CIFcode_BulkRemittancescreen_under_Transaction_83() {
		return csm_CIFcode_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001RE']")
	private WebElement csm_Serialcode_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_Serialcode_BulkRemittancescreen_under_Transaction_83() {
		return csm_Serialcode_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//td[@id='add_bulkRemittanceGridTbl_Id_D001RE']//span")
	private WebElement csm_add_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_add_BulkRemittancescreen_under_Transaction_83() {
		return csm_add_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='amount_D001RE']")
	private WebElement csm_amount_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_amount_BulkRemittancescreen_under_Transaction_83() {
		return csm_amount_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001RE']")
	private WebElement csm_GLcode_TransactionDetails_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_GLcode_TransactionDetails_BulkRemittancescreen_under_Transaction_83() {
		return csm_GLcode_TransactionDetails_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001RE']")
	private WebElement csm_CIFcode_TransactionDetails_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_CIFcode_TransactionDetails_BulkRemittancescreen_under_Transaction_83() {
		return csm_CIFcode_TransactionDetails_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001RE']")
	private WebElement csm_Serialcode_TransactionDetails_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_Serialcode_TransactionDetails_BulkRemittancescreen_under_Transaction_83() {
		return csm_Serialcode_TransactionDetails_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//button[@id='btnCharges_D001RE']")
	private WebElement csm_charges_TransactionDetails_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_charges_TransactionDetails_BulkRemittancescreen_under_Transaction_83() {
		return csm_charges_TransactionDetails_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//button[@id='btnWaiveCharges_D001RE']")
	private WebElement csm_waivecharges_TransactionDetails_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_waivecharges_TransactionDetails_BulkRemittancescreen_under_Transaction_83() {
		return csm_waivecharges_TransactionDetails_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//div[@id='multiChequesEntyDetToolBar_D001RE']//span")
	private WebElement csm_save_TransactionDetails_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_save_TransactionDetails_BulkRemittancescreen_under_Transaction_83() {
		return csm_save_TransactionDetails_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='in_charged_cy_input_D001RE']")
	private WebElement csm_inchargecy_TransactionDetails_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_inchargecy_TransactionDetails_BulkRemittancescreen_under_Transaction_83() {
		return csm_save_TransactionDetails_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001RE']")
	private WebElement csm_waiverate_TransactionDetails_BulkRemittancescreen_under_Transaction_83;

	public WebElement csm_waiverate_TransactionDetails_BulkRemittancescreen_under_Transaction_83() {
		return csm_waiverate_TransactionDetails_BulkRemittancescreen_under_Transaction_83;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_83;

	public WebElement getTransactionNumber_83() {
		return getTransactionNumber_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_FromDateTE_ChargesWaiver_GeneralAccounts_83;

	public WebElement csm_FromDateTE_ChargesWaiver_GeneralAccounts_83() {
		return csm_FromDateTE_ChargesWaiver_GeneralAccounts_83;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_DATE']//input")
	private WebElement csm_ToDateTE_ChargesWaiver_GeneralAccounts_83;

	public WebElement csm_ToDateTE_ChargesWaiver_GeneralAccounts_83() {
		return csm_ToDateTE_ChargesWaiver_GeneralAccounts_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.EXEMPTION_TYPE']//select")
	private WebElement csm_ExemptionTypeCharges_Param_83;

	public WebElement csm_ExemptionTypeCharges_Param_83() {
		return csm_ExemptionTypeCharges_Param_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.AVERAGE_BAL_BASIS']//select")
	private WebElement csm_AverageBalBasis_Charges_Param_83;

	public WebElement csm_AverageBalBasis_Charges_Param_83() {
		return csm_AverageBalBasis_Charges_Param_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_FROMdate_Charges_Param_83;

	public WebElement csm_FROMdate_Charges_Param_83() {
		return csm_FROMdate_Charges_Param_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.TO_DATE']//input")
	private WebElement csm_ToDate_Charges_Param_83;

	public WebElement csm_ToDate_Charges_Param_83() {
		return csm_ToDate_Charges_Param_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.WAIVER_PERCENTAGE']//input")
	private WebElement csm_WaivePercentage_Charges_Param_83;

	public WebElement csm_WaivePercentage_Charges_Param_83() {
		return csm_WaivePercentage_Charges_Param_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.FROM_BALANCE']//input")
	private WebElement csm_FromBal_Charges_Param_83;

	public WebElement csm_FromBal_Charges_Param_83() {
		return csm_FromBal_Charges_Param_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.TO_BALANCE']//input")
	private WebElement csm_ToBal_Charges_Param_83;

	public WebElement csm_ToBal_Charges_Param_83() {
		return csm_ToBal_Charges_Param_83;
	}

	@FindBy(xpath = "//td[@id='td_tab125_GridTbl_Id_C0011MA_1_ctschargesWaiverVO.WAIVER_AMOUNT']//input")
	private WebElement csm_WaiverAmount_Charges_Param_83;

	public WebElement csm_WaiverAmount_Charges_Param_83() {
		return csm_WaiverAmount_Charges_Param_83;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement ParameterMainModule_83;

	public WebElement ParameterMainModule_83() {
		return ParameterMainModule_83;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement systemParametersSubmenu_83;

	public WebElement systemParametersSubmenu_83() {
		return systemParametersSubmenu_83;
	}

	@FindBy(xpath = "//td[@id='td_cardsStatusReasonCardsList_GridTbl_Id_P00431P_1_ctscardStatusReasonVO.STATUS_IDEN']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_83;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_83() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_83;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Parameters_csm_param;

	public WebElement Parameters_csm_param() {
		return Parameters_csm_param;
	}

	@FindBy(xpath = "//select[@name='transactiontypesCO.ctstrxtypeExtendedVO.DOCUMENT_TYPE']")
	private WebElement select_chequeinDocumenttypeDropdown1;

	public WebElement select_chequeinDocumenttypeDropdown1() {
		return select_chequeinDocumenttypeDropdown1;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.DEDUCT_DEBITOR']")
	private WebElement check_DeductFromDebtorAccount;

	public WebElement check_DeductFromDebtorAccount() {
		return check_DeductFromDebtorAccount;
	}

	@FindBy(xpath = "//td[text()='Charges']")
	private WebElement click_Charges_in_systemparameters;

	public WebElement click_Charges_in_systemparameters() {
		return click_Charges_in_systemparameters;
	}

	@FindBy(xpath = "//td[text()='Maintenance of Charges']")
	private WebElement click_maintenanceofchargesinChargesinsystemparameters;

	public WebElement click_maintenanceofchargesinChargesinsystemparameters() {
		return click_maintenanceofchargesinChargesinsystemparameters;
	}

	@FindBy(xpath = "//a[@id='C0011MA']")
	private WebElement click_updateAfterApproveinmaintenanceofcharges;

	public WebElement click_updateAfterApproveinmaintenanceofcharges() {
		return click_updateAfterApproveinmaintenanceofcharges;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.CODE']")
	private WebElement Enter_codeinupdateAfterApproveinmaintenanceofcharges;

	public WebElement Enter_codeinupdateAfterApproveinmaintenanceofcharges() {
		return Enter_codeinupdateAfterApproveinmaintenanceofcharges;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement systemParametersSubmenu;

	public WebElement systemParametersSubmenu() {
		return systemParametersSubmenu;
	}

	@FindBy(xpath = "//label[@id='logout']")
	private WebElement CSM_Logout_609;

	public WebElement CSM_Logout_609() {
		return CSM_Logout_609;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement CSM_ConfirmOk_609;

	public WebElement CSM_ConfirmOk_609() {
		return CSM_ConfirmOk_609;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Ok_609;

	public WebElement CSM_Ok_609() {
		return CSM_Ok_609;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement CSM_SimpleOk_609;

	public WebElement CSM_SimpleOk_609() {
		return CSM_SimpleOk_609;
	}

	/// ***Template Entries***///

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

	@FindBy(xpath = "//a[@id='O001UP']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//select[@id='send_clear_entry_O001UP']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry_609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry_609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry_609;
	}
	// Send to Clear Process

	@FindBy(xpath = "//input[@id='chqbook_process_O001UP']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_ChequebookAdvanceProcess_609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_ChequebookAdvanceProcess_609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_ChequebookAdvanceProcess_609;
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

	@FindBy(xpath = "//a[@id='O001P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_ControlRecord_Approve_609;

	public WebElement Parameters_SystemParameters_ControlRecord_Approve_609() {
		return Parameters_SystemParameters_ControlRecord_Approve_609;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609;

	public WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609() {
		return Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609;
	}

	@FindBy(xpath = "//td[text()='Template Entries']")
	private WebElement Parameters_SystemParameters_TemplateEntries_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_609() {
		return Parameters_SystemParameters_TemplateEntries_609;
	}

	@FindBy(xpath = "//a[@id='P0070MT']/span[text()='Maintenance']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_609;
	}

	@FindBy(xpath = "//input[@id='code_P0070MT']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Code_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Code_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_Code_609;
	}

	@FindBy(xpath = "//input[@id='brief_name_eng_P0070MT']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Briefname_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Briefname_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_Briefname_609;
	}

	@FindBy(xpath = "//select[@id='deduct_charges_on_P0070MT']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_DeductChargeson_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_DeductChargeson_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_DeductChargeson_609;
	}
	// Authorizing

	@FindBy(xpath = "//select[@id='deduct_charges_on_P0070MT']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Addicon_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Addicon_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_Addicon_609;
	}

	// tr -> i = 2,3..
	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_LineOrder_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_LineOrder_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_LineOrder_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[2]//input

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_GroupNo_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_GroupNo_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_GroupNo_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[3]

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_AmountSign_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_AmountSign_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_AmountSign_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[4]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_BranchType_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_BranchType_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_BranchType_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[5]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_CurrencyType_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_CurrencyType_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_CurrencyType_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[7]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_GLType_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_GLType_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_GLType_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[8]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_CIFType_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_CIFType_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_CIFType_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[10]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_SLType_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_SLType_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_SLType_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[12]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_TradeDateType_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_TradeDateType_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_TradeDateType_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[14]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_ValueDateType_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_ValueDateType_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_ValueDateType_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[15]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_JVType_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_JVType_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_JVType_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[17]//input

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_EntriesLevel_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_EntriesLevel_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_EntriesLevel_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[19]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_AmountExpression_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_AmountExpression_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_AmountExpression_609;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[28]/input

	@FindBy(xpath = "//label[@id='templateEntriesMaint_FormId_P0070MT_Save_key']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_SaveBtn_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_SaveBtn_609() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_SaveBtn_609;
	}

	@FindBy(xpath = "//a[@id='P0070P']/span[text()='Approve']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Approve_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Approve_609() {
		return Parameters_SystemParameters_TemplateEntries_Approve_609;
	}

	@FindBy(xpath = "//input[@id='templateEntriesList_GridTbl_Id_P0070P_gs_ctstrsdetTemplateVO.CODE']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Approve_Code_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Approve_Code_609() {
		return Parameters_SystemParameters_TemplateEntries_Approve_Code_609;
	}
	// table[@id='templateEntriesList_GridTbl_Id_P0070P']//td[text()='456']

	@FindBy(xpath = "//label[@id='templateEntriesMaint_FormId_P0070P_Approve_key']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_TemplateEntries_Approve_ApproveBtn_609;
	}

	/// *** Cheques ***///

	@FindBy(xpath = "//td[text()='Cheques']")
	private WebElement Parameters_SystemParameters_Cheques_609;

	public WebElement Parameters_SystemParameters_Cheques_609() {
		return Parameters_SystemParameters_Cheques_609;
	}

	@FindBy(xpath = "//td[text()='ChequeBook']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_609;
	}

	@FindBy(xpath = "//a[@id='P029MT']/span[text()='Maintenance']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_609;
	}

	@FindBy(xpath = "//a[@id='P029MA']/span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='chequesBookList_GridTbl_Id_P029MA_gs_ctschequesVO.CODE']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_Code_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_Code_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_Code_609;
	}
	// table[@id='chequesBookList_GridTbl_Id_P029MA']//td[text()='123']

	@FindBy(xpath = "//input[@id='code_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Code_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Code_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Code_609;
	}

	@FindBy(xpath = "//input[@id='brief_name_eng_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Briefname_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Briefname_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Briefname_609;
	}

	@FindBy(xpath = "//input[@id='number_of_cheques_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Numberofcheques_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Numberofcheques_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Numberofcheques_609;
	}

	@FindBy(xpath = "//input[@id='multi_cy_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_MultiCurrency_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_MultiCurrency_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_MultiCurrency_609;
	}

	@FindBy(xpath = "//input[@id='multi_cy_P029MA']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency_609;
	}

	@FindBy(xpath = "//input[@id='pop_acc_full_name_to_print_yn_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_PopulateAccountsflag_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_PopulateAccountsflag_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_PopulateAccountsflag_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cheque_types_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_ChequeType_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_ChequeType_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_ChequeType_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_leaves_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Leaves_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Leaves_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Leaves_609;
	}

	@FindBy(xpath = "//label[@id='chequesBookMaint_FormId_P029MT_Save_key']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_SaveBtn_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_SaveBtn_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_SaveBtn_609;
	}

	@FindBy(xpath = "//input[@id='pop_acc_full_name_to_print_yn_P029MA']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_PopulateAccountsflag_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_PopulateAccountsflag_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_PopulateAccountsflag_609;
	}

	@FindBy(xpath = "//label[@id='chequesBookMaint_FormId_P029MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='P029P']/span[text()='Approve']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Approve_609;
	}

	@FindBy(xpath = "//input[@id='chequesBookList_GridTbl_Id_P029P_gs_ctschequesVO.CODE']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_Code_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_Code_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Approve_Code_609;
	}
	// table[@id='chequesBookList_GridTbl_Id_P029P']//td[text()='2233']

	@FindBy(xpath = "//label[@id='chequesBookMaint_FormId_P029P_Approve_key']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_Approve_ApproveBtn_609;
	}

	/// ***Transaction Type***///

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Parameters_SystemParameters_TransactionType_609;

	public WebElement Parameters_SystemParameters_TransactionType_609() {
		return Parameters_SystemParameters_TransactionType_609;
	}

	@FindBy(xpath = "//a[@id='P024MT']/span[text()='Maintenance']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_609;
	}

	@FindBy(xpath = "//input[@id='code_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Code_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Code_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Code_609;
	}

	@FindBy(xpath = "//input[@id='short_desc_eng_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Briefname_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Briefname_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Briefname_609;
	}

	@FindBy(xpath = "//input[@id='long_desc_eng_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Longname_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Longname_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Longname_609;
	}

	@FindBy(xpath = "//input[@id='short_desc_arab_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_BriefnameArab_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_BriefnameArab_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_BriefnameArab_609;
	}

	@FindBy(xpath = "//input[@id='long_desc_arab_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_LongnameArab_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_LongnameArab_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_LongnameArab_609;
	}

	@FindBy(xpath = "//select[@id='type_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Type_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Type_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Type_609;
	}
	// Transfer

	@FindBy(xpath = "//select[@id='trsfr_type_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_TransferType_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_TransferType_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_TransferType_609;
	}
	// Intra Bank

	@FindBy(xpath = "//input[@id='cr_dr_forex_P024MTD']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_MainAccDebit_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_MainAccDebit_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_MainAccDebit_609;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_ProceedOnInsufficientFund_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_ProceedOnInsufficientFund_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_ProceedOnInsufficientFund_609;
	}

	@FindBy(xpath = "//select[@id='authoriz_level_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_AuthorizationLevel_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_AuthorizationLevel_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_AuthorizationLevel_609;
	}
	// Non-Supervisory Lvl.

	@FindBy(xpath = "//a[@id='transactionTypes_tab_otherInfo_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_609;
	}

	@FindBy(xpath = "//select[@id='bs_contra_flag_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AccEntry_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AccEntry_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AccEntry_609;
	}
	// Template Entries

	@FindBy(xpath = "//span[@id='spanLookup_additional_template_entries_P024MT']/span")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesSrc_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesSrc_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesSrc_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_additional_template_entries_P024MT_gs_CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesCode_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesCode_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesCode_609;
	}
	// table[@id='gridtab_additional_template_entries_P024MT']//td[text()='60']

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MT_Save_key']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_SaveBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_SaveBtn_609() {
		return Parameters_SystemParameters_TransactionType_Maintenance_SaveBtn_609;
	}

	@FindBy(xpath = "//a[@id='P024P']/span[text()='Approve']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_609;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_609() {
		return Parameters_SystemParameters_TransactionType_Approve_609;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_Code_609;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_Code_609() {
		return Parameters_SystemParameters_TransactionType_Approve_Code_609;
	}
	// table[@id='transactionTypesList_GridTbl_Id_P024P']//td[text()='467']

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_TransactionType_Approve_ApproveBtn_609;
	}

	@FindBy(xpath = "//a[@id='P024MA']/span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code_609;
	}
	// table[@id='transactionTypesList_GridTbl_Id_P024MA']//td[text()='365']

	@FindBy(xpath = "//input[@id='standing_order_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_609;
	}

	@FindBy(xpath = "//input[@id='auto_approve_within_limit_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_609;
	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DebtorAccount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DebtorAccount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DebtorAccount_609;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAM']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MinBalance_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MinBalance_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MinBalance_609;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAP']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodical_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodical_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodical_609;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAX']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MaxBalance_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MaxBalance_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MaxBalance_609;
	}

	@FindBy(xpath = "//select[@id='so_process_type_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Processtype_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Processtype_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Processtype_609;
	}
	// EOD

	@FindBy(xpath = "//select[@id='so_periodicity_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodicity_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodicity_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodicity_609;
	}
	// Monthly or Daily

	@FindBy(xpath = "//select[@id='so_period_type_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodType_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodType_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodType_609;
	}

	@FindBy(xpath = "//select[@id='so_period_day_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DaySpecification_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DaySpecification_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DaySpecification_609;
	}

	@FindBy(xpath = "(//select[@id='so_period_interval_P024MA'])[1]")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodInterval_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodInterval_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodInterval_609;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609;
	}
	// House Cheque

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_609;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_so_chrg_schema_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_609;
	}

	@FindBy(xpath = "//input[@id='cc_maintain_serial_no_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD_609;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargeonVoid_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargeonVoid_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargeonVoid_609;
	}

	@FindBy(xpath = "//input[@id='allow_change_clearing_acc_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoChangeClearingAccount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoChangeClearingAccount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoChangeClearingAccount_609;
	}

	@FindBy(xpath = "//input[@id='proceed_drawn_checks_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques_609;
	}

	@FindBy(xpath = "//div[@id='panel_4_P024MA']//span[text()='Main Details']")
	private WebElement Parameters_SystemParameters_TransactionType_MainDetails_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_MainDetails_UpdateBtn_609() {
		return Parameters_SystemParameters_TransactionType_MainDetails_UpdateBtn_609;
	}

	@FindBy(xpath = "//div[@id='panel_2_P024MA']//span[text()='Additional Details']")
	private WebElement Parameters_SystemParameters_TransactionType_AdditionalDetails_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_AdditionalDetails_UpdateBtn_609() {
		return Parameters_SystemParameters_TransactionType_AdditionalDetails_UpdateBtn_609;
	}

	@FindBy(xpath = "//div[@id='panel_3_P024MA']//span[text()='Available Options for Deduct I']")
	private WebElement Parameters_SystemParameters_TransactionType_AvailableOptionsforDeduct1_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_AvailableOptionsforDeduct1_UpdateBtn_609() {
		return Parameters_SystemParameters_TransactionType_AvailableOptionsforDeduct1_UpdateBtn_609;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_609;
	}

	/// *** Account Control Record***///

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement Parameters_AccountParameters_609;

	public WebElement Parameters_AccountParameters_609() {
		return Parameters_AccountParameters_609;
	}

	@FindBy(xpath = "//td[text()='Acc Control Record']")
	private WebElement Parameters_AccountParameters_AccControlRecord_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_609() {
		return Parameters_AccountParameters_AccControlRecord_609;
	}

	@FindBy(xpath = "//a[@id='ANC001MT']/span[text()='Maintenance']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Maintenance_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_Maintenance_609() {
		return Parameters_AccountParameters_AccControlRecord_Maintenance_609;
	}

	@FindBy(xpath = "//li[@id='jvAndAccountsMain_ANC001MT']/a/span")
	private WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_609() {
		return Parameters_AccountParameters_AccControlRecord_JvAccountsTab_609;
	}

	@FindBy(xpath = "(//div[@id='div_col_accounts_Inner_ANC001MT']/div/span)[1]")
	private WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_AccountsDropDown_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_AccountsDropDown_609() {
		return Parameters_AccountParameters_AccControlRecord_JvAccountsTab_AccountsDropDown_609;
	}

	@FindBy(xpath = "//input[@id='proceed_on_modified_acc_yn_ANC001MT']")
	private WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_ProceedonModifiedAccount_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_ProceedonModifiedAccount_609() {
		return Parameters_AccountParameters_AccControlRecord_JvAccountsTab_ProceedonModifiedAccount_609;
	}

	@FindBy(xpath = "//label[@id='accControlRecordMaintFormId_ANC001MT_update_key']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Maintenance_UpdateBtn_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_Maintenance_UpdateBtn_609() {
		return Parameters_AccountParameters_AccControlRecord_Maintenance_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='ANC001P']/span[text()='Approve']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Approve_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_Approve_609() {
		return Parameters_AccountParameters_AccControlRecord_Approve_609;
	}

	@FindBy(xpath = "//label[@id='accControlRecordMaintFormId_ANC001P_approve_key']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Approve_ApproveBtn_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_Approve_ApproveBtn_609() {
		return Parameters_AccountParameters_AccControlRecord_Approve_ApproveBtn_609;
	}

	@FindBy(xpath = "//a[@id='ANC001MA']/span[text()='Update After Approve']")
	private WebElement Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove_609() {
		return Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove_609;
	}

	/// **** Parameters -> Account Parameters -> CIF and Account limits ****///

	@FindBy(xpath = "//td[text()='CIF & Account limits']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_609() {
		return Parameters_AccountParameters_CIFAccountLimits_609;
	}

	@FindBy(xpath = "//a[@id='AC002MA']/span[text()='Update After Approve']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='accountLimitsList_GridTbl_Id_AC002MA_gs_ctsAccLimitsVO.CODE']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_LimitCode_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_LimitCode_609() {
		return Parameters_AccountParameters_CIFAccountLimits_LimitCode_609;
	}

	@FindBy(xpath = "//select[@id='acc_limit_type_by_AC002MA']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_LimitType_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_LimitType_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_LimitType_609;
	}// index - 2

	@FindBy(xpath = "//label[@id='accountLimitsMaint_FormId_AC002MA_account_types']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_AccountType_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_AccountType_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_AccountType_609;
	}

	@FindBy(xpath = "//td[@id='add_tab2_GridTbl_Id_AC002MA']/div/span")
	private WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_Addicon_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_Addicon_609() {
		return CIFAccountLimits_UpdateAfterApprove_AccountType_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab2_GridTbl_Id_AC002MA']/div/span")
	private WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_Deleteicon_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_Deleteicon_609() {
		return CIFAccountLimits_UpdateAfterApprove_AccountType_Deleteicon_609;
	}

	@FindBy(xpath = "//td[@tdlabel='Account Type']//input")
	private WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_GL_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_GL_609() {
		return CIFAccountLimits_UpdateAfterApprove_AccountType_GL_609;
	}

	@FindBy(xpath = "//td[@id='add_tab3_GridTbl_Id_AC002MA']/div/span")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Addicon_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Addicon_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab3_GridTbl_Id_AC002MA']/div/span")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Deleteicon_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Deleteicon_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Deleteicon_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//select)[1]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_LimitType_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_LimitType_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_LimitType_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//select)[2]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_SingleTotal_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_SingleTotal_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_SingleTotal_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//input)[2]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Currency_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Currency_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Currency_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//input)[3]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Amount_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Amount_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Amount_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//select)[3]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Period_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Period_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Period_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//label[text()='Allowed CIF Types']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_CifType_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_CifType_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_CifType_609;
	}

	@FindBy(xpath = "//td[@id='add_tab9_1_MAX_GridTbl_Id_AC002MA']/div/span")
	private WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_Addicon_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_Addicon_609() {
		return CIFAccountLimits_UpdateAfterApprove_Max_CifType_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab9_1_MAX_GridTbl_Id_AC002MA']/div/span")
	private WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_Deleteicon_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_Deleteicon_609() {
		return CIFAccountLimits_UpdateAfterApprove_Max_CifType_Deleteicon_609;
	}

	@FindBy(xpath = "//td[@tdlabel='CIF Type']//input")
	private WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_CIF_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_CIF_609() {
		return CIFAccountLimits_UpdateAfterApprove_Max_CifType_CIF_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//label[text()='Action Details']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_609;
	}

	@FindBy(xpath = "//select[@id='acc_limit_action_type_1_MAX_AC002MA']")
	private WebElement CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_ActionType_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_ActionType_609() {
		return CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_ActionType_609;
	}// Warn//Stop

	@FindBy(xpath = "//label[@id='accountLimitsMaint_FormId_AC002MA_Update_After_Approve_key']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='AC002P']/span[text()='Approve']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_609() {
		return Parameters_AccountParameters_CIFAccountLimits_Approve_609;
	}

	@FindBy(xpath = "//input[@id='accountLimitsList_GridTbl_Id_AC002P_gs_ctsAccLimitsVO.CODE']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_Limitcode_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_Limitcode_609() {
		return Parameters_AccountParameters_CIFAccountLimits_Approve_Limitcode_609;
	}

	@FindBy(xpath = "//label[@id='accountLimitsMaint_FormId_AC002P_Approve_key']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_ApproveBtn_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_ApproveBtn_609() {
		return Parameters_AccountParameters_CIFAccountLimits_Approve_ApproveBtn_609;
	}

	/// **** Remittance Type ****///

	@FindBy(xpath = "//td[text()='Remittance Type']")
	private WebElement Parameters_SystemParameters_RemittanceType_609;

	public WebElement Parameters_SystemParameters_RemittanceType_609() {
		return Parameters_SystemParameters_RemittanceType_609;
	}

	@FindBy(xpath = "//a[@id='P0040MT']//span[text()='Maintenance']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_609;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_609() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_609;
	}

	@FindBy(xpath = "//input[@id='code_P0040MT']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_Code_609;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_Code_609() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_Code_609;
	}

	@FindBy(xpath = "//select[@id='remittance_type_P0040MT']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_Type_609;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_Type_609() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_Type_609;
	}
	// Certificate of Deposit

	@FindBy(xpath = "//input[@id='brief_name_eng_P0040MT']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_BriefDescription_609;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_BriefDescription_609() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_BriefDescription_609;
	}

	@FindBy(xpath = "//select[@id='by_comp_or_branch_P0040MT']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_RemittanceBy_609;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_RemittanceBy_609() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_RemittanceBy_609;
	}

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040MT_Save_key']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_SaveBtn_609;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_SaveBtn_609() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_SaveBtn_609;
	}

	@FindBy(xpath = "//a[@id='P0040P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_RemittanceType_Approve_609;

	public WebElement Parameters_SystemParameters_RemittanceType_Approve_609() {
		return Parameters_SystemParameters_RemittanceType_Approve_609;
	}

	@FindBy(xpath = "//input[@id='remittancetypeList_GridTbl_Id_P0040P_gs_remittanceVO.CODE']")
	private WebElement Parameters_SystemParameters_RemittanceType_Approve_Code_609;

	public WebElement Parameters_SystemParameters_RemittanceType_Approve_Code_609() {
		return Parameters_SystemParameters_RemittanceType_Approve_Code_609;
	}
	// table[@id='remittancetypeList_GridTbl_Id_P0040P']//td[text()='70']

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040P_Approve_key']")
	private WebElement Parameters_SystemParameters_RemittanceType_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_RemittanceType_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_RemittanceType_Approve_ApproveBtn_609;
	}

	/// *** User ***///

	@FindBy(xpath = "//td[text()='User']")
	private WebElement Parameters_SystemParameters_User_609;

	public WebElement Parameters_SystemParameters_User_609() {
		return Parameters_SystemParameters_User_609;
	}

	@FindBy(xpath = "//a[@id='E000MA']//span[text()='Update after Approve']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UserId_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UserId_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_UserId_609;
	}
	// (//table[@id='tellerParamList_GridTbl_Id_E000MA']//td[text()='VIJAY'])[1]

	@FindBy(xpath = "//input[@id='mask_trx_amt_approve_yn_E000MA']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_MaskTrxAmountonApproval_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_MaskTrxAmountonApproval_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_MaskTrxAmountonApproval_609;
	}

	@FindBy(xpath = "//span[text()=' Trx Type ']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_609;
	}

	@FindBy(xpath = "//td[@id='add_tab16_GridTbl_Id_E000MA']//span")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_AddIcon_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_AddIcon_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_AddIcon_609;
	}

	@FindBy(xpath = "//table[@id='tab16_GridTbl_Id_E000MA']/tbody//span//input")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_TransactionCode_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_TransactionCode_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_TransactionCode_609;
	}

	@FindBy(xpath = "//td[@id='del_tab16_GridTbl_Id_E000MA']//span")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteIcon_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteIcon_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteIcon_609;
	}

	@FindBy(xpath = "//span[text()='Delete All']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteAll_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteAll_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteAll_609;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='E000P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_User_Approve_609;

	public WebElement Parameters_SystemParameters_User_Approve_609() {
		return Parameters_SystemParameters_User_Approve_609;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement Parameters_SystemParameters_User_Approve_UserId_609;

	public WebElement Parameters_SystemParameters_User_Approve_UserId_609() {
		return Parameters_SystemParameters_User_Approve_UserId_609;
	}
	// (//table[@id='tellerParamList_GridTbl_Id_E000P']//td[text()='VIJAY'])[1]

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement Parameters_SystemParameters_User_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_User_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_User_Approve_ApproveBtn_609;
	}

	/// *** Charges ***///

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

	@FindBy(xpath = "//a[@id='C0011MA']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code_609;
	}
	// table[@id='chargesParamList_GridTbl_Id_C0011MA']//td[text()='960']

	@FindBy(xpath = "//input[@id='amount_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount_609;
	}

	@FindBy(xpath = "//input[@id='allow_modify_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_609;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='C0011P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_609;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_609;
	}
	// table[@id='chargesParamList_GridTbl_Id_C0011P']//td[text()='7']

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011P_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn_609;
	}

	/// *** Reason ***///

	@FindBy(xpath = "//td[text()='Reasons']")
	private WebElement Parameters_SystemParameters_Reason_609;

	public WebElement Parameters_SystemParameters_Reason_609() {
		return Parameters_SystemParameters_Reason_609;
	}

	@FindBy(xpath = "//a[@id='P0032MA']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='reasonsList_GridTbl_Id_P0032MA_gs_ctsreasonsVO.CODE']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_Code_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_Code_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_Code_609;
	}
	// table[@id='reasonsList_GridTbl_Id_P0032MA']//td[text()='960']

	@FindBy(xpath = "//input[@id='lookuptxt_charges_schema_P0032MA']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema_609;
	}

	@FindBy(xpath = "//input[@id='deduct_avail_charges_P0032MA']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge_609;
	}

	@FindBy(xpath = "//label[@id='reasonsMaint_FormId_P0032MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='P0032P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_Reason_Approve_609;

	public WebElement Parameters_SystemParameters_Reason_Approve_609() {
		return Parameters_SystemParameters_Reason_Approve_609;
	}

	@FindBy(xpath = "//input[@id='reasonsList_GridTbl_Id_P0032P_gs_ctsreasonsVO.CODE']")
	private WebElement Parameters_SystemParameters_Reason_Approve_Code_609;

	public WebElement Parameters_SystemParameters_Reason_Approve_Code_609() {
		return Parameters_SystemParameters_Reason_Approve_Code_609;
	}
	// table[@id='reasonsList_GridTbl_Id_P0032P']//td[text()='960']

	@FindBy(xpath = "//label[@id='reasonsMaint_FormId_P0032P_Approve_key']")
	private WebElement Parameters_SystemParameters_Reason_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_Reason_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_Reason_Approve_ApproveBtn_609;
	}

	/// *** Parameters -> Cif Parameters -> Cif Type ***///

	@FindBy(xpath = "//td[text()='CIF Parameters']")
	private WebElement Parameters_CifParameters_609;

	public WebElement Parameters_CifParameters_609() {
		return Parameters_CifParameters_609;
	}

	@FindBy(xpath = "//td[text()='CIF Type']")
	private WebElement Parameters_CifParameters_CifType_609;

	public WebElement Parameters_CifParameters_CifType_609() {
		return Parameters_CifParameters_CifType_609;
	}

	@FindBy(xpath = "//a[@id='P010MA']//span[text()='Update After Approve']")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010MA_gs_rifcttVO.TYPE_CODE']")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_CifTypeCode_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_CifTypeCode_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_CifTypeCode_609;
	}

	@FindBy(xpath = "//span[contains(text(),' Charges Waiver ')]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td[text()='1'])[1]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Grid_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Grid_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Grid_609;
	}

	@FindBy(xpath = "//td[@id='add_tab12_GridTbl_Id_P010MA']/div/span")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Addicon_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Addicon_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab12_GridTbl_Id_P010MA']/div/span")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Deleteicon_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Deleteicon_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Deleteicon_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//select)[1]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ExemptionType_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ExemptionType_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ExemptionType_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[4]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromDate_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromDate_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromDate_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[5]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToDate_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToDate_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToDate_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[6]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverPercentage_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverPercentage_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverPercentage_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[7]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverAmount_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverAmount_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverAmount_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//select)[2]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_AverageBalanceBasis_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_AverageBalanceBasis_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_AverageBalanceBasis_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[8]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromBalance_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromBalance_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromBalance_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[9]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToBalance_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToBalance_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToBalance_609;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010MA_Update_After_Approve_key']")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='P010P']//span[text()='Approve']")
	private WebElement Parameters_CifParameters_CifType_Approve_609;

	public WebElement Parameters_CifParameters_CifType_Approve_609() {
		return Parameters_CifParameters_CifType_Approve_609;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010P_gs_rifcttVO.TYPE_CODE']")
	private WebElement Parameters_CifParameters_CifType_Approve_CifTypeCode_609;

	public WebElement Parameters_CifParameters_CifType_Approve_CifTypeCode_609() {
		return Parameters_CifParameters_CifType_Approve_CifTypeCode_609;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010P_Approve_key']")
	private WebElement Parameters_CifParameters_CifType_Approve_ApproveBtn_609;

	public WebElement Parameters_CifParameters_CifType_Approve_ApproveBtn_609() {
		return Parameters_CifParameters_CifType_Approve_ApproveBtn_609;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement Accounts_609;

	public WebElement Accounts_609() {
		return Accounts_609;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement Accounts_GeneralAccounts_609;

	public WebElement Accounts_GeneralAccounts_609() {
		return Accounts_GeneralAccounts_609;
	}

	@FindBy(xpath = "//a[@id='A002MA']/span[text()='Maintenance']")
	private WebElement Accounts_GeneralAccounts_Maintenance_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_609() {
		return Accounts_GeneralAccounts_Maintenance_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Maintenance_CifCodeGrid_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_CifCodeGrid_609() {
		return Accounts_GeneralAccounts_Maintenance_CifCodeGrid_609;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_SearchBtn_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_SearchBtn_609() {
		return Accounts_GeneralAccounts_Maintenance_SearchBtn_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.GL_CODE']")
	private WebElement Accounts_GeneralAccounts_Maintenance_GLCode_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_GLCode_609() {
		return Accounts_GeneralAccounts_Maintenance_GLCode_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Maintenance_CifCode_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_CifCode_609() {
		return Accounts_GeneralAccounts_Maintenance_CifCode_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.SL_NO']")
	private WebElement Accounts_GeneralAccounts_Maintenance_SerialNumber_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_SerialNumber_609() {
		return Accounts_GeneralAccounts_Maintenance_SerialNumber_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.STATUS']")
	private WebElement Accounts_GeneralAccounts_Maintenance_RecordStatus_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_RecordStatus_609() {
		return Accounts_GeneralAccounts_Maintenance_RecordStatus_609;
	}
	// table[@id='generalAccountsGridTbl_Id_A002MA']//td[text()='143002']

	@FindBy(xpath = "//li[@id='accountsCustomFieldsTabs6_A002MA']/a/span")
	private WebElement Accounts_GeneralAccounts_Maintenance_CustomFields_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_CustomFields_609() {
		return Accounts_GeneralAccounts_Maintenance_CustomFields_609;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_waiver_charges_key']")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_609;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ExemptionType_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ExemptionType_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ExemptionType_609;
	}
	// Custom Exemption

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_AverageBalanceBasis_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_AverageBalanceBasis_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_AverageBalanceBasis_609;
	}
	// Daily//Monthly

	@FindBy(xpath = "//td[@id='add_chargesWaiverGrid_Id_A002MA']/div/span")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Addicon_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Addicon_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_chargesWaiverGrid_Id_A002MA']/div/span")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Deleteicon_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Deleteicon_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Deleteicon_609;
	}

	@FindBy(xpath = "(//table[@id='chargesWaiverGrid_Id_A002MA']//td[text()='1'])[1]")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Grid_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Grid_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_Grid_609;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@tdlabel='From Date']/input")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_FromDate_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_FromDate_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_FromDate_609;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@tdlabel='To Date']/input")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ToDate_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ToDate_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ToDate_609;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@tdlabel='From Balance']/div/input")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_FromBalance_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_FromBalance_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_FromBalance_609;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@tdlabel='To Balance']/div/input")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ToBalance_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ToBalance_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_ToBalance_609;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@tdlabel='Waiver Percentage']/div/input")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_WaiverPercentage_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_WaiverPercentage_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_WaiverPercentage_609;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@tdlabel='Waiver Amount']/div/input")
	private WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_WaiverAmount_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ChargesWaiver_WaiverAmount_609() {
		return Accounts_GeneralAccounts_Maintenance_ChargesWaiver_WaiverAmount_609;
	}

	@FindBy(xpath = "(//span[text()='Suspicious Blacklisted CIF'])[2]")
	private WebElement SuspiciousBlacklistedCIF_Popup_609;

	public WebElement SuspiciousBlacklistedCIF_Popup_609() {
		return SuspiciousBlacklistedCIF_Popup_609;
	}

	@FindBy(xpath = "(//span[text()='Suspicious Blacklisted CIF'])[2]//parent::div/a/span")
	private WebElement SuspiciousBlacklistedCIF_PopupClose_609;

	public WebElement SuspiciousBlacklistedCIF_PopupClose_609() {
		return SuspiciousBlacklistedCIF_PopupClose_609;
	}

	@FindBy(xpath = "//input[@id='breifName_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_BriefName_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_BriefName_609() {
		return Accounts_GeneralAccounts_Maintenance_BriefName_609;
	}

	@FindBy(xpath = "//li[@id='accountsMailingDetailsTabs3_A002MA']/a/span[text()='Mailing details']")
	private WebElement Accounts_GeneralAccounts_Maintenance_MailingdetailsTab_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_MailingdetailsTab_609() {
		return Accounts_GeneralAccounts_Maintenance_MailingdetailsTab_609;
	}

	@FindBy(xpath = "//textarea[@id='description_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_Mailingdetails_Description_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_Mailingdetails_Description_609() {
		return Accounts_GeneralAccounts_Maintenance_Mailingdetails_Description_609;
	}

	@FindBy(xpath = "//input[@id='exemptFullChargesWaiver_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_ExemptFullChargesWaiver_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_ExemptFullChargesWaiver_609() {
		return Accounts_GeneralAccounts_Maintenance_ExemptFullChargesWaiver_609;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_Update_key']")
	private WebElement Accounts_GeneralAccounts_Maintenance_Update_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_Update_609() {
		return Accounts_GeneralAccounts_Maintenance_Update_609;
	}

	@FindBy(xpath = "//a[@id='A002AU']//span[text()='Authorize']")
	private WebElement Accounts_GeneralAccounts_Authorize_609;

	public WebElement Accounts_GeneralAccounts_Authorize_609() {
		return Accounts_GeneralAccounts_Authorize_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.GL_CODE']")
	private WebElement Accounts_GeneralAccounts_Authorize_GlCode_609;

	public WebElement Accounts_GeneralAccounts_Authorize_GlCode_609() {
		return Accounts_GeneralAccounts_Authorize_GlCode_609;
	}
	// table[@id='generalAccountsGridTbl_Id_A002AU']//td[text()='143002']

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Authorize_CifCode_609;

	public WebElement Accounts_GeneralAccounts_Authorize_CifCode_609() {
		return Accounts_GeneralAccounts_Authorize_CifCode_609;
	}
	// table[@id='generalAccountsGridTbl_Id_A002AU']//td[text()='993870']

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement Accounts_GeneralAccounts_Authorize_AuthorizeBtn_609;

	public WebElement Accounts_GeneralAccounts_Authorize_AuthorizeBtn_609() {
		return Accounts_GeneralAccounts_Authorize_AuthorizeBtn_609;
	}

	@FindBy(xpath = "//td[text()='Special Conditions']")
	private WebElement SpecialConditions_609;

	public WebElement SpecialConditions_609() {
		return SpecialConditions_609;
	}

	@FindBy(xpath = "//a[@id='SPC00TD']/span[text()='To Delete']")
	private WebElement SpecialConditions_ToDelete_609;

	public WebElement SpecialConditions_ToDelete_609() {
		return SpecialConditions_ToDelete_609;
	}

	@FindBy(xpath = "//input[@id='specialConditionsGridTbl_Id_SPC00TD_gs_specialConditionsVO.ACC_CIF']")
	private WebElement SpecialConditions_ToDelete_CifCode_609;

	public WebElement SpecialConditions_ToDelete_CifCode_609() {
		return SpecialConditions_ToDelete_CifCode_609;
	}
	// table[@id='specialConditionsGridTbl_Id_SPC00TD']//td[text()='993870']

	@FindBy(xpath = "//label[@id='specialConditionsDefFormId_SPC00TD_btn_toDel']")
	private WebElement SpecialConditions_ToDelete_ToBeDeletedBtn_609;

	public WebElement SpecialConditions_ToDelete_ToBeDeletedBtn_609() {
		return SpecialConditions_ToDelete_ToBeDeletedBtn_609;
	}

	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement SpecialConditions_Delete_609;

	public WebElement SpecialConditions_Delete_609() {
		return SpecialConditions_Delete_609;
	}

	@FindBy(xpath = "//input[@id='specialConditionsGridTbl_Id_SPC00DD_gs_specialConditionsVO.ACC_CIF']")
	private WebElement SpecialConditions_Delete_CifCode_609;

	public WebElement SpecialConditions_Delete_CifCode_609() {
		return SpecialConditions_Delete_CifCode_609;
	}
	// table[@id='specialConditionsGridTbl_Id_SPC00DD']//td[text()='993870']

	@FindBy(xpath = "//label[@id='specialConditionsDefFormId_SPC00DD_btn_del']")
	private WebElement SpecialConditions_Delete_DeleteBtn_609;

	public WebElement SpecialConditions_Delete_DeleteBtn_609() {
		return SpecialConditions_Delete_DeleteBtn_609;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Charges_key']")
	private WebElement Transactions_Maintenance_Charges_609;

	public WebElement Transactions_Maintenance_Charges_609() {
		return Transactions_Maintenance_Charges_609;
	}

	@FindBy(xpath = "//input[@id='in_charged_cy_input_D001MT']")
	private WebElement Transactions_Maintenance_InChargedCY_609;

	public WebElement Transactions_Maintenance_InChargedCY_609() {
		return Transactions_Maintenance_InChargedCY_609;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001MT']")
	private WebElement Transactions_Maintenance_WaiveRate_609;

	public WebElement Transactions_Maintenance_WaiveRate_609() {
		return Transactions_Maintenance_WaiveRate_609;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Waive_Charges_key']")
	private WebElement Transactions_Maintenance_WaiveCharges_609;

	public WebElement Transactions_Maintenance_WaiveCharges_609() {
		return Transactions_Maintenance_WaiveCharges_609;
	}

	@FindBy(xpath = "//button[@id='appToSelWaive_D001MT']//span[contains(text(),' Apply To Selected ')]")
	private WebElement Transactions_Maintenance_WaiveRate_ApplytoSelected_609;

	public WebElement Transactions_Maintenance_WaiveRate_ApplytoSelected_609() {
		return Transactions_Maintenance_WaiveRate_ApplytoSelected_609;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement Transactions_Maintenance_ChequeNo_609;

	public WebElement Transactions_Maintenance_ChequeNo_609() {
		return Transactions_Maintenance_ChequeNo_609;
	}

	@FindBy(xpath = "//input[@id='chq_date_D001MT']")
	private WebElement Transactions_Maintenance_ChequeDate_609;

	public WebElement Transactions_Maintenance_ChequeDate_609() {
		return Transactions_Maintenance_ChequeDate_609;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement Ok_609;

	public WebElement Ok_609() {
		return Ok_609;
	}

	@FindBy(xpath = "//a[@id='D001RE']//span[text()='Bulk Remittance']")
	private WebElement Transactions_BulkRemittance_609;

	public WebElement Transactions_BulkRemittance_609() {
		return Transactions_BulkRemittance_609;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement Transactions_BulkRemittance_BulkRemittanceType_609;

	public WebElement Transactions_BulkRemittance_BulkRemittanceType_609() {
		return Transactions_BulkRemittance_BulkRemittanceType_609;
	}
	// Issue multiple instruments through 1 debit

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001RE']")
	private WebElement Transactions_BulkRemittance_TRXType_609;

	public WebElement Transactions_BulkRemittance_TRXType_609() {
		return Transactions_BulkRemittance_TRXType_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_remittance_Type_D001RE']")
	private WebElement Transactions_BulkRemittance_RemittanceType_609;

	public WebElement Transactions_BulkRemittance_RemittanceType_609() {
		return Transactions_BulkRemittance_RemittanceType_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001RE']")
	private WebElement Transactions_BulkRemittance_CustomerAccBranchCode_609;

	public WebElement Transactions_BulkRemittance_CustomerAccBranchCode_609() {
		return Transactions_BulkRemittance_CustomerAccBranchCode_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001RE']")
	private WebElement Transactions_BulkRemittance_CustomerAccCurrencyCode_609;

	public WebElement Transactions_BulkRemittance_CustomerAccCurrencyCode_609() {
		return Transactions_BulkRemittance_CustomerAccCurrencyCode_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001RE']")
	private WebElement Transactions_BulkRemittance_CustomerAccGLCode_609;

	public WebElement Transactions_BulkRemittance_CustomerAccGLCode_609() {
		return Transactions_BulkRemittance_CustomerAccGLCode_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001RE']")
	private WebElement Transactions_BulkRemittance_CustomerAccCifCode_609;

	public WebElement Transactions_BulkRemittance_CustomerAccCifCode_609() {
		return Transactions_BulkRemittance_CustomerAccCifCode_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001RE']")
	private WebElement Transactions_BulkRemittance_CustomerAccSerialNo_609;

	public WebElement Transactions_BulkRemittance_CustomerAccSerialNo_609() {
		return Transactions_BulkRemittance_CustomerAccSerialNo_609;
	}

	@FindBy(xpath = "//td[@id='add_bulkRemittanceGridTbl_Id_D001RE']/div/span")
	private WebElement Transactions_BulkRemittance_Addicon_609;

	public WebElement Transactions_BulkRemittance_Addicon_609() {
		return Transactions_BulkRemittance_Addicon_609;
	}

	@FindBy(xpath = "//input[@id='amount_D001RE']")
	private WebElement Transactions_BulkRemittance_Amount_609;

	public WebElement Transactions_BulkRemittance_Amount_609() {
		return Transactions_BulkRemittance_Amount_609;
	}

	@FindBy(xpath = "//span[contains(text(),' Save ')]")
	private WebElement Transactions_BulkRemittance_SaveBtn_609;

	public WebElement Transactions_BulkRemittance_SaveBtn_609() {
		return Transactions_BulkRemittance_SaveBtn_609;
	}

	@FindBy(xpath = "//div[text()='WARNING']")
	private WebElement Transaction_AmountExceeds_Warning_609;

	public WebElement Transaction_AmountExceeds_Warning_609() {
		return Transaction_AmountExceeds_Warning_609;
	}

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000MT_0_ctsChargesEntityVO.AMOUNT'])[2]")
	private WebElement ChequebookRequest_Maintenance_TotalAmount_609;

	public WebElement ChequebookRequest_Maintenance_TotalAmount_609() {
		return ChequebookRequest_Maintenance_TotalAmount_609;
	}

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000MT_0_ctsChargesEntityVO.AMOUNT_FC'])[1]")
	private WebElement ChequebookRequest_Maintenance_FC_609;

	public WebElement ChequebookRequest_Maintenance_FC_609() {
		return ChequebookRequest_Maintenance_FC_609;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']/ancestor::table/following::span[text()='Maintenance']")
	private WebElement csmcore_Chequebookrequest_maintanace;

	public WebElement csmcore_Chequebookrequest_maintanace() {
		return csmcore_Chequebookrequest_maintanace;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']/ancestor::table/following::span[text()='Approve']")
	private WebElement csmcore_Chequebookrequest_Approve;

	public WebElement csmcore_Chequebookrequest_Approve() {
		return csmcore_Chequebookrequest_Approve;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CHEQUE_CODE']")
	private WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick;

	public WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick() {
		return csmcore_Chequebookrequest_Approve_InputField_doubleclick;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000AP_Approve_key']")
	private WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton;

	public WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton() {
		return csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton;
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

	@FindBy(id = "chequeBookDefFormId_Q000AP_Approve_key")
	private WebElement approveButton;

	public WebElement approveButton() {
		return approveButton;
	}

	@FindBy(xpath = "//td[text()='System Parameters']//parent::td")
	private WebElement csmParam_Systemparameter1;

	public WebElement csmParam_Systemparameter1() {
		return csmParam_Systemparameter1;
	}

	@FindBy(xpath = "//td[text()='Sms Subscription']")
	private WebElement csm_SmsSubscription_core;

	public WebElement csm_SmsSubscription_core() {
		return csm_SmsSubscription_core;
	}

	@FindBy(xpath = "//a[@id='SMS00MT']//span[text()='Maintenance']")
	private WebElement csm_Maintenance_SmsSubscription_core;

	public WebElement csm_Maintenance_SmsSubscription_core() {
		return csm_Maintenance_SmsSubscription_core;
	}

	@FindBy(xpath = "//input[@id='subscriptionType_SMS00MTA']")
	private WebElement csm_Account_Maintenancescreen_SmsSubscription_core;

	public WebElement csm_Account_Maintenancescreen_SmsSubscription_core() {
		return csm_Account_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//input[@id='acc_br_SMS00MT']")
	private WebElement csm_Branchcode_Maintenancescreen_SmsSubscription_core;

	public WebElement csm_Branchcode_Maintenancescreen_SmsSubscription_core() {
		return csm_Branchcode_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//input[@id='acc_cy_SMS00MT']")
	private WebElement csm_currencycode_Maintenancescreen_SmsSubscription_core;

	public WebElement csm_currencycode_Maintenancescreen_SmsSubscription_core() {
		return csm_currencycode_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//input[@id='acc_gl_SMS00MT']")
	private WebElement csm_Glcode_Maintenancescreen_SmsSubscription_core;

	public WebElement csm_Glcode_Maintenancescreen_SmsSubscription_core() {
		return csm_Glcode_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//input[@id='acc_cif_SMS00MT']")
	private WebElement csm_cifcode_Maintenancescreen_SmsSubscription_core;

	public WebElement csm_cifcode_Maintenancescreen_SmsSubscription_core() {
		return csm_cifcode_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_SMS00MT']")
	private WebElement csm_Serialcode_Maintenancescreen_SmsSubscription_core;

	public WebElement csm_Serialcode_Maintenancescreen_SmsSubscription_core() {
		return csm_Serialcode_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//input[@id='mobileNo_SMS00MT']")
	private WebElement csm_MobileNo_Maintenancescreen_SmsSubscription_core;

	public WebElement csm_MobileNo_Maintenancescreen_SmsSubscription_core() {
		return csm_MobileNo_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//td[@id='add_smsSubscriptionDetailsGrid_Id_SMS00MT']")
	private WebElement csm_Addbtn_Maintenancescreen_SmsSubscription_core;

	public WebElement csm_Addbtn_Maintenancescreen_SmsSubscription_core() {
		return csm_Addbtn_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//td[@id='td_smsSubscriptionDetailsGrid_Id_SMS00MT_1_smsSubscriptionVO.SERVICE_CODE']")
	private WebElement csm_servicecode_Addbtn_Maintenancescreen_SmsSubscription_core;// for click

	public WebElement csm_servicecode_Addbtn_Maintenancescreen_SmsSubscription_core() {
		return csm_servicecode_Addbtn_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//td[@id='td_smsSubscriptionDetailsGrid_Id_SMS00MT_1_smsSubscriptionVO.SERVICE_CODE']//input")
	private WebElement csm_servicecode_Maintenancescreen_SmsSubscription_core;// for data entry

	public WebElement csm_servicecode_Maintenancescreen_SmsSubscription_core() {
		return csm_servicecode_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//button[@id='smsSubscriptionMaint_saveNew_SMS00MT']")
	private WebElement csm_save_Maintenancescreen_SmsSubscription_core;

	public WebElement csm_save_Maintenancescreen_SmsSubscription_core() {
		return csm_save_Maintenancescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//a[@id='SMS00P']//span[text()='Approve']")
	private WebElement csm_Approve_SmsSubscription_core;

	public WebElement csm_Approve_SmsSubscription_core() {
		return csm_Approve_SmsSubscription_core;
	}

	@FindBy(xpath = "//input[@id='smsSubscriptionListGridTbl_Id_SMS00P_gs_smsSubscriptionVO.ACC_GL']")
	private WebElement csm_Glcode_Approvescreen_SmsSubscription_core;

	public WebElement csm_Glcode_Approvescreen_SmsSubscription_core() {
		return csm_Glcode_Approvescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//td[@id='td_smsSubscriptionListGridTbl_Id_SMS00P_1_smsSubscriptionVO.ACC_GL']")
	private WebElement csm_dblclck_Glcode_Approvescreen_SmsSubscription_core;

	public WebElement csm_dblclck_Glcode_Approvescreen_SmsSubscription_core() {
		return csm_dblclck_Glcode_Approvescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//button[@id='smsSubscriptionMaint_approve_SMS00P']")
	private WebElement csm_approvebtn_Approvescreen_SmsSubscription_core;

	public WebElement csm_approvebtn_Approvescreen_SmsSubscription_core() {
		return csm_approvebtn_Approvescreen_SmsSubscription_core;
	}

	@FindBy(xpath = "//td[text()='Certificates']")
	private WebElement certificates;

	public WebElement certificates() {
		return certificates;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement certificates_Maintenance;

	public WebElement certificates_Maintenance() {
		return certificates_Maintenance;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.CERTIFICATE_TYPE']")
	private WebElement certificates_TYpe;

	public WebElement certificates_TYpe() {
		return certificates_TYpe;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.CIF_NO']")
	private WebElement certificates_CIF_no;

	public WebElement certificates_CIF_no() {
		return certificates_CIF_no;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.NUMBER_OF_BILLS']")
	private WebElement certificates_NO_of_bills;

	public WebElement certificates_NO_of_bills() {
		return certificates_NO_of_bills;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.TOTAL_AMOUNT_OF_BILLS']")
	private WebElement certificates_Amount_of_bills;

	public WebElement certificates_Amount_of_bills() {
		return certificates_Amount_of_bills;
	}

	@FindBy(xpath = "//input[@id='1_ctscertificateaccVO.CREDIT_ACCOUNT_YN']")
	private WebElement certificates_Account_ToBe_Credited;

	public WebElement certificates_Account_ToBe_Credited() {
		return certificates_Account_ToBe_Credited;
	}

	@FindBy(xpath = "//input[@id='1_ctscertificateaccVO.DEDUCT']")
	private WebElement certificates_Deduct_From_Account;

	public WebElement certificates_Deduct_From_Account() {
		return certificates_Deduct_From_Account;
	}

	@FindBy(xpath = "//label[@id='certificateDefFormId_P0049MT_Save_key']")
	private WebElement certificates_Save;

	public WebElement certificates_Save() {
		return certificates_Save;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement certificates_Approvee;

	public WebElement certificates_Approvee() {
		return certificates_Approvee;
	}

	@FindBy(xpath = "//input[@name='CERTIFICATE_CODE']")
	private WebElement certificates_Approve_Code;

	public WebElement certificates_Approve_Code() {
		return certificates_Approve_Code;
	}

	@FindBy(xpath = "//label[@labelkey='Approve_key']")
	private WebElement certificates_Approve_Submit;

	public WebElement certificates_Approve_Submit() {
		return certificates_Approve_Submit;
	}

	@FindBy(xpath = "//td[text()='Safe Box']")
	private WebElement Safe_Box;

	public WebElement Safe_Box() {
		return Safe_Box;
	}

	@FindBy(xpath = "//td[text()='Safe Box Management']")
	private WebElement Safe_Box_Management;

	public WebElement Safe_Box_Management() {
		return Safe_Box_Management;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Safe_Box_Management_Maintenance;

	public WebElement Safe_Box_Management_Maintenance() {
		return Safe_Box_Management_Maintenance;
	}

	@FindBy(xpath = "//td[text()='Cards']")
	private WebElement Cards_CSM_Param;

	public WebElement Cards_CSM_Param() {
		return Cards_CSM_Param;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_card_product_code_P030MT']")
	private WebElement Card_Product_CSM;

	public WebElement Card_Product_CSM() {
		return Card_Product_CSM;
	}

	@FindBy(xpath = "//a[@id='P060MT']//span[text()='Maintenance']")
	private WebElement Maintenance_CSM_Param;

	public WebElement Maintenance_CSM_Param() {
		return Maintenance_CSM_Param;
	}

	@FindBy(xpath = "//input[@id='cardProductsList_GridTbl_Id_P060MA_gs_ctsCardProductVO.CODE']")
	private WebElement Code_Value_Card_product;

	public WebElement Code_Value_Card_product() {
		return Code_Value_Card_product;
	}

	@FindBy(xpath = "//input[@id='brief_desc_eng_P060MA']")
	private WebElement Brief_name_code_product;

	public WebElement Brief_name_code_product() {
		return Brief_name_code_product;
	}

	@FindBy(xpath = "//label[@id='cardsTypeMaint_FormId_P030MT_Save_key']")
	private WebElement Save_Button_CSM_param;

	public WebElement Save_Button_CSM_param() {
		return Save_Button_CSM_param;
	}

	@FindBy(xpath = "//input[@id='cardProductsList_GridTbl_Id_P060P_gs_ctsCardProductVO.CODE']")
	private WebElement Code_Approve_value_card_product;

	public WebElement Code_Approve_value_card_product() {
		return Code_Approve_value_card_product;
	}

	@FindBy(xpath = "//td[@id='td_cardProductsList_GridTbl_Id_P060P_1_ctsCardProductVO.CODE']")
	private WebElement Double_click_approve_card_product;

	public WebElement Double_click_approve_card_product() {
		return Double_click_approve_card_product;
	}

//				    								@FindBy(xpath="//input[@id='lookuptxt_status_reason_G001MT']")
	private WebElement csm_statusReason_Maintenancescreen_CardRequest;

	public WebElement csm_statusReason_Maintenancescreen_CardRequest() {
		return csm_statusReason_Maintenancescreen_CardRequest;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_card_type_G001MT']")
	private WebElement csm_CardType_Maintenancescreen_CardRequest;

	public WebElement csm_CardType_Maintenancescreen_CardRequest() {
		return csm_CardType_Maintenancescreen_CardRequest;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_credit_type_G001MT']")
	private WebElement csm_CreditType_Maintenancescreen_CardRequest;

	public WebElement csm_CreditType_Maintenancescreen_CardRequest() {
		return csm_CreditType_Maintenancescreen_CardRequest;
	}

	@FindBy(xpath = "//select[@id='payment_perc_G001MT']")
	private WebElement csm_PaymentPercentage_Maintenancescreen_CardRequest;

	public WebElement csm_PaymentPercentage_Maintenancescreen_CardRequest() {
		return csm_PaymentPercentage_Maintenancescreen_CardRequest;
	}

	@FindBy(xpath = "//input[@id='effective_date_G001MT']")
	private WebElement csm_EffectiveDate_Maintenancescreen_CardRequest;

	public WebElement csm_EffectiveDate_Maintenancescreen_CardRequest() {
		return csm_EffectiveDate_Maintenancescreen_CardRequest;
	}

	@FindBy(xpath = "//button[@id='cardMgnt_Save_G001MT']")
	private WebElement csm_Savebtn_Maintenancescreen_CardRequest;

	public WebElement csm_Savebtn_Maintenancescreen_CardRequest() {
		return csm_Savebtn_Maintenancescreen_CardRequest;
	}

	// input[@id='lookuptxt_cif_G001MT']
	@FindBy(xpath = "//input[@id='lookuptxt_cif_G001MT']")
	private WebElement csm_CIFNumber_Maintenancescreen_CardRequest;

	public WebElement csm_CIFNumber_Maintenancescreen_CardRequest() {
		return csm_CIFNumber_Maintenancescreen_CardRequest;
	}

	@FindBy(xpath = "//span[text()='Request']")
	private WebElement SafeBox_Request;

	public WebElement SafeBox_Request() {
		return SafeBox_Request;
	}

	@FindBy(xpath = "//input[@overridelabelkey='box_Type_key']")
	private WebElement SafeBox_Type;

	public WebElement SafeBox_Type() {
		return SafeBox_Type;
	}

	@FindBy(xpath = "//input[@overridelabeltext='Box No']")
	private WebElement SafeBox_Box_NO;

	public WebElement SafeBox_Box_NO() {
		return SafeBox_Box_NO;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_safeBoxChargeType_E003RQ']")
	private WebElement SafeBox_Charge_Type;

	public WebElement SafeBox_Charge_Type() {
		return SafeBox_Charge_Type;
	}

	@FindBy(xpath = "//input[@id='safeBoxKeyNum_E003RQ']")
	private WebElement SafeBox_KeyNum;

	public WebElement SafeBox_KeyNum() {
		return SafeBox_KeyNum;
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

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_TransactionMainModule;

	public WebElement csmTransactionMainModule() {
		return csm_TransactionMainModule;
	}

	@FindBy(xpath = "//a[@id='D001MT']//span[text()='Maintenance']")
	private WebElement transaction_Maintenance;

	public WebElement transactionMaintenance() {
		return transaction_Maintenance;
	}

	@FindBy(xpath = "//select[@name='trxMgntCO.ctstrsVO.VOID_REASON']")
	private WebElement transaction_TrxPurpose;

	public WebElement transactionTrxPurpose() {
		return transaction_TrxPurpose;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement transaction_SearchIcon;

	public WebElement transactionSearchIcon() {
		return transaction_SearchIcon;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement transaction_SearchTransactionNumber;

	public WebElement transactionSearchTransactionNumber() {
		return transaction_SearchTransactionNumber;
	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement transaction_TransactionStatus;

	public WebElement transactionTransactionStatus() {
		return transaction_TransactionStatus;
	}

	@FindBy(xpath = "//td[text()='Active']")
	private WebElement transaction_ActiveTransactionStatus;

	public WebElement transactionActiveTransactionStatus() {
		return transaction_ActiveTransactionStatus;
	}

	@FindBy(xpath = "//td[text()='Reversed']")
	private WebElement transaction_TransactionReversedStatus;

	public WebElement transactionTransactionReversedStatus() {
		return transaction_TransactionReversedStatus;
	}

	@FindBy(xpath = "//td[text()='Cancelled']")
	private WebElement transaction_TransactionCancelledStatus;

	public WebElement transactionTransactionCancelledStatus() {
		return transaction_TransactionCancelledStatus;
	}

	@FindBy(xpath = "//a[text()='Transactions / Maintenance']//parent::td//following-sibling::td//span")
	private WebElement transaction_Closebutton;

	public WebElement transactionClosebutton() {
		return transaction_Closebutton;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement transaction_TransactionTypeInput;

	public WebElement transactionTransactionTypeInput() {
		return transaction_TransactionTypeInput;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrxtypeVO.SHORT_DESC_ENG']")
	private WebElement transaction_TransactionTypeInputDescription;

	public WebElement transactionTransactionTypeInputDescription() {
		return transaction_TransactionTypeInputDescription;
	}

	// input[@id='to_trs_ac_br_D001MT']
	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement transactionType_DebitBranchCode;

	public WebElement transactionTypeDebitBranchCode() {
		return transactionType_DebitBranchCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement transactionType_DebitCurrencyCode;

	public WebElement transactionTypeDebitCurrencyCode() {
		return transactionType_DebitCurrencyCode;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trs_ac_sl_D001MT']//span")
	private WebElement transactionManagement_DepositeLiveSearch;

	public WebElement transactionManagementDepositeLiveSearch() {
		return transactionManagement_DepositeLiveSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.BRANCH_CODE']")
	private WebElement transactionManagementDepositeLiveSearch_BranchCode;

	public WebElement transactionManagementDepositeLiveSearchBranchCode() {
		return transactionManagementDepositeLiveSearch_BranchCode;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.CURRENCY_CODE']")
	private WebElement transactionManagementDepositeLiveSearch_CurrencyCode;

	public WebElement transactionManagementDepositeLiveSearchCurrencyCode() {
		return transactionManagementDepositeLiveSearch_CurrencyCode;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.GL_CODE']")
	private WebElement transactionManagementDepositeLiveSearch_GlCode;

	public WebElement transactionManagementDepositeLiveSearchGlCode() {
		return transactionManagementDepositeLiveSearch_GlCode;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.CIF_SUB_NO']")
	private WebElement transactionManagementDepositeLiveSearch_CIFCode;

	public WebElement transactionManagementDepositeLiveSearchCIFCode() {
		return transactionManagementDepositeLiveSearch_CIFCode;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.SL_NO']")
	private WebElement transactionManagementDepositeLiveSearch_SerialNumber;

	public WebElement transactionManagementDepositeLiveSearchSerialNumber() {
		return transactionManagementDepositeLiveSearch_SerialNumber;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement transactionType_DebitGlCode;

	public WebElement transactionTypeDebitGlCode() {
		return transactionType_DebitGlCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement transactionType_DebitCIFCode;

	public WebElement transactionTypeDebitCIFCode() {
		return transactionType_DebitCIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement transactionType_DebitSerialNumber;

	public WebElement transactionTypeDebitSerialNumber() {
		return transactionType_DebitSerialNumber;
	}

	@FindBy(xpath = "//button[@id='btnCharges_D001MT']")
	private WebElement transactionType_ChargesButton;

	public WebElement transactionTypeChargesButton() {
		return transactionType_ChargesButton;
	}

	@FindBy(xpath = "//table[@parenttableid='trxMgntBatchGridTbl_Id_D001MT']//td[@tdlabel='Original_Amt_key']")
	private WebElement transactionType_OriginalAmount;

	public WebElement transactionTypeOriginalAmount() {
		return transactionType_OriginalAmount;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Maintenance')]")
	private WebElement transactionMaintenance_label;

	public WebElement transactionMaintenanceLabel() {
		return transactionMaintenance_label;
	}

	@FindBy(xpath = "//div[contains(text(),'is a Staff Member')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactions_StaffMemberOkButton;

	public WebElement transactionsStaffMemberOkButton() {
		return transactions_StaffMemberOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'is Non Resident')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactions_NonResidentOkButton;

	public WebElement transactionsNonResidentOkButton() {
		return transactions_NonResidentOkButton;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement transactionMaintenance_CurrencyCodeInput;

	public WebElement transactionMaintenanceCurrencyCodeInput() {
		return transactionMaintenance_CurrencyCodeInput;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement transactionType_CreditBranchCode;

	public WebElement transactionTypeCreditBranchCode() {
		return transactionType_CreditBranchCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement transactionType_CreditGlCode;

	public WebElement transactionTypeCreditGlCode() {
		return transactionType_CreditGlCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement transactionType_CreditCIFCode;

	public WebElement transactionTypeCreditCIFCode() {
		return transactionType_CreditCIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement transactionType_CreditSerialNumCode;

	public WebElement transactionTypeCreditSerialNumCode() {
		return transactionType_CreditSerialNumCode;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.RELEASE_DATE']")
	private WebElement transactionTypeSO_EndingDateInput;

	public WebElement transactionTypeSOEndingDateInput() {
		return transactionTypeSO_EndingDateInput;
	}

	@FindBy(xpath = "(//div[contains(text(),'Charges amount is waived by the system')]//parent::div//following-sibling::center//input[@value='Ok'])[1]")
	private WebElement transaction_WaivedAlertPopup_WithOk;

	public WebElement transaction_WaivedAlertPopupWithOkBtn() {
		return transaction_WaivedAlertPopup_WithOk;
	}

	@FindBy(xpath = "//div[contains(text(),'Please wait while server request completes')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transaction_ServerResponsePopupOkButton;

	public WebElement transactionServerResponsePopupOkButton() {
		return transaction_ServerResponsePopupOkButton;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement transaction_DepositeAmountInputBox;

	public WebElement transactionDepositeAmountInputBox() {
		return transaction_DepositeAmountInputBox;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_AMOUNT']")
	private WebElement transactions_accountInCyInput;

	public WebElement transactionsAccountInCyInput() {
		return transactions_accountInCyInput;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Approve']")
	private WebElement transaction_ApproveFeature;

	public WebElement transactionApproveFeature() {
		return transaction_ApproveFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Approve Cancel']")
	private WebElement transaction_ApproveCancelFeature;

	public WebElement transactionApproveCancelFeature() {
		return transaction_ApproveCancelFeature;
	}

	@FindBy(name = "TRS_NO")
	private WebElement transactionApprove_TransactionNoSearch;

	public WebElement transactionApproveTransactionNoSearch() {
		return transactionApprove_TransactionNoSearch;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.VALUE_DATE']")
	private WebElement transactionMaintenance_ValueDateInput;

	public WebElement transactinMaintenanceValueDateInput() {
		return transactionMaintenance_ValueDateInput;
	}

	@FindBy(xpath = "//label[contains(text(),'Booked Entries ')]//ancestor::button")
	private WebElement transactionApprove_BookedEntriesButton;

	public WebElement transactionApproveBookedEntries() {
		return transactionApprove_BookedEntriesButton;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement transaction_TransactionNumber;

	public WebElement transaction_TransactionNumber() {
		return transaction_TransactionNumber;
	}

	@FindBy(xpath = "//div[contains(text(),'Transaction No')]//parent::div//following-sibling::center//input")
	private WebElement transaction_TransactionNumberOkButton;

	public WebElement transaction_TransactionNumberOkButton() {
		return transaction_TransactionNumberOkButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement transaction_closeTransactionTab;

	public WebElement transactionCloseTransactionTab() {
		return transaction_closeTransactionTab;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Approve')]//parent::td//following-sibling::td//span")
	private WebElement transaction_ApproveTransactionTab;

	public WebElement transactionApproveTransactionTabClose() {
		return transaction_ApproveTransactionTab;
	}

	@FindBy(xpath = "(//table[@class='ui-jqgrid-ftable']//td[@tdlabel='in Charged CY'])[1]")
	private WebElement transaction_ChargeValidation;

	public WebElement transactionChargeValidation() {
		return transaction_ChargeValidation;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve Cancel ')]//parent::button")
	private WebElement transaction_ApproveCancelButton;

	public WebElement transactionApproveCancelButton() {
		return transaction_ApproveCancelButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Approved')]//parent::div//following-sibling::center//input")
	private WebElement transaction_ApproveOkButton;

	public WebElement transactionApproveOkButton() {
		return transaction_ApproveOkButton;
	}

	@FindBy(xpath = "//center//input[@value='Cancel']")
	private WebElement transaction_PrintCreditAndDebitAdviceCancelButton;

	public WebElement transactionPrintCreditAndDebitAdviceCancelButton() {
		return transaction_PrintCreditAndDebitAdviceCancelButton;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='To Be Stopped  Standing Order']")
	private WebElement transaction_ToBeStoppedStandingOrder;

	public WebElement transaction_ToBeStoppedStandingOrder() {
		return transaction_ToBeStoppedStandingOrder;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Stop Standing Order']")
	private WebElement transaction_StopStandingOrder;

	public WebElement transactionStopStandingOrder() {
		return transaction_StopStandingOrder;
	}

	@FindBy(xpath = "//span[contains(text(),'to Stop SO')]//parent::button")
	private WebElement toBeStoppedStandingOrder_toStopSOButton;

	public WebElement toBeStoppedStandingOrderToStopSOButton() {
		return toBeStoppedStandingOrder_toStopSOButton;
	}

	@FindBy(xpath = "//textarea[@name='trxMgntCO.statusReason']")
	private WebElement toBeStoppedStandingOrder_ToDoStoppedReason;

	public WebElement toBeStoppedStandingOrderToDoStoppedReason() {
		return toBeStoppedStandingOrder_ToDoStoppedReason;
	}

	@FindBy(xpath = "//span[contains(text(),' Stop SO ')]//parent::button")
	private WebElement toBeStoppedStandingOrder_StopSOButton;

	public WebElement toBeStoppedStandingOrderStopSOButton() {
		return toBeStoppedStandingOrder_StopSOButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / To Be Stopped  Standing Order')]//parent::td//following-sibling::td//span")
	private WebElement toBeStoppedStandingOrderTab_CloseButton;

	public WebElement toBeStoppedStandingOrderTabCloseButton() {
		return toBeStoppedStandingOrderTab_CloseButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Stop Standing Order')]//parent::td//following-sibling::td//span")
	private WebElement stopStandingOrderTab_CloseButton;

	public WebElement stopStandingOrderTabCloseButton() {
		return stopStandingOrderTab_CloseButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Approve')]//parent::td//following-sibling::td//span")
	private WebElement transaction_ApproveCloseButton;

	public WebElement transactionApproveCloseButton() {
		return transaction_ApproveCloseButton;
	}

	@FindBy(xpath = "//input[@name='TRS_NO']")
	private WebElement transaction_SearchTransactionNo;

	public WebElement transactionSearchTransactionNo() {
		return transaction_SearchTransactionNo;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Reactivate Standing Order']")
	private WebElement transaction_ReactiveStandingOrderFeature;

	public WebElement transactionReactiveStandingOrderFeature() {
		return transaction_ReactiveStandingOrderFeature;
	}

	@FindBy(xpath = "//span[contains(text(),' Reactivate SO ')]//parent::button")
	private WebElement reactiveStandingOrderFeature_ReactivateSOButton;

	public WebElement reactiveStandingOrderFeatureReactivateSOButton() {
		return reactiveStandingOrderFeature_ReactivateSOButton;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Approve Reactivate Standing Order']")
	private WebElement transaction_ApproveReactiveStandingOrderFeature;

	public WebElement transactionApproveReactiveStandingOrderFeature() {
		return transaction_ApproveReactiveStandingOrderFeature;
	}

	@FindBy(xpath = "//span[contains(text(),' Apply Reactivate SO ')]//parent::button")
	private WebElement approveReactivateStandingOrder_ApplyReactivateSOButton;

	public WebElement approveReactivateStandingOrderApplyReactivateSOButton() {
		return approveReactivateStandingOrder_ApplyReactivateSOButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Reactivate Standing Order')]//parent::td//following-sibling::td//span")
	private WebElement transaction_ReactiveStandingOrderlabelCloseButton;

	public WebElement transactionReactiveStandingOrderlabelCloseButton() {
		return transaction_ReactiveStandingOrderlabelCloseButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Approve Reactivate Standing Order')]//parent::td//following-sibling::td//span")
	private WebElement transaction_ApproveReactiveStandingOrderlabelCloseButton;

	public WebElement transactionApproveReactiveStandingOrderlabelCloseButton() {
		return transaction_ApproveReactiveStandingOrderlabelCloseButton;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Amend Standing Order']")
	private WebElement transaction_AmendStnadingOrderFeature;

	public WebElement transactionAmendStnadingOrderFeature() {
		return transaction_AmendStnadingOrderFeature;
	}

	@FindBy(xpath = "//span[contains(text(),' Amend Standing Order ')]//parent::button")
	private WebElement amendStandingOrder_AmendStandingOrderButton;

	public WebElement amendStandingOrderAmendStandingOrderButton() {
		return amendStandingOrder_AmendStandingOrderButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Approve')]//parent::td//following-sibling::td//span")
	private WebElement transactionApprove_CloseButton;

	public WebElement transationApproveTabCloseButton() {
		return transactionApprove_CloseButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Amend Standing Order')]//parent::td//following-sibling::td//span")
	private WebElement amendStandingOrderTab_CloseButton;

	public WebElement amendStandingOrderTabCloseButton() {
		return amendStandingOrderTab_CloseButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Amend Standing Order')]")
	private WebElement amendStandingOrder_Label;

	public WebElement amendStandingOrderLabel() {
		return amendStandingOrder_Label;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Close Standing Order']")
	private WebElement transaction_CloseStandingOrderFeature;

	public WebElement transactionCloseStandingOrderFeature() {
		return transaction_CloseStandingOrderFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='To Be Closed Standing Order']")
	private WebElement transaction_ToBeClosedStandingOrderFeature;

	public WebElement transactionToBeClosedStandingOrderFeature() {
		return transaction_ToBeClosedStandingOrderFeature;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / To Be Closed Standing Order')]//parent::td//following-sibling::td//span")
	private WebElement toBeClosedStandingOrderLabel_CloseButton;

	public WebElement toBeClosedStandingOrderLabelCloseButton() {
		return toBeClosedStandingOrderLabel_CloseButton;
	}

	@FindBy(xpath = "//textarea[@name='trxMgntCO.statusReason']")
	private WebElement toBeClosedStandingOrder_Reason;

	public WebElement toBeClosedStandingOrderReason() {
		return toBeClosedStandingOrder_Reason;
	}

	@FindBy(xpath = "//span[contains(text(),' To Close SO ')]//parent::button")
	private WebElement toBeClosedStandingOrder_ToCloseSOButton;

	public WebElement toBeClosedStandingOrderToCloseSOButton() {
		return toBeClosedStandingOrder_ToCloseSOButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Close SO')]//parent::button")
	private WebElement closeStandingOrder_CloseSOButton;

	public WebElement closeStandingOrderCloseSOButton() {
		return closeStandingOrder_CloseSOButton;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Cancel']")
	private WebElement transaction_cancelFeature;

	public WebElement transactinCancelFeature() {
		return transaction_cancelFeature;
	}

	@FindBy(xpath = "//select[@name='trxMgntCO.ctstrsVO.VOID_REASON']")
	private WebElement cancel_CancelReasonDropdown;

	public WebElement cancelCancelReasonDropdown() {
		return cancel_CancelReasonDropdown;
	}

	@FindBy(xpath = "//span[contains(text(),'Cancel')]//parent::button")
	private WebElement cancel_CancelButton;

	public WebElement cancelCancelButton() {
		return cancel_CancelButton;
	}

	@FindBy(xpath = "(//td[@tdlabel='Transaction No'])[1]")
	private WebElement isTransactionData_AvailableInCSM;

	public WebElement isTransactionDataAvailableInCSM() {
		return isTransactionData_AvailableInCSM;
	}

	@FindBy(xpath = "//div[contains(text(),'User Does Not have Access On this TRX type For the Priority Of This CIF')]")
	private WebElement transactions_NoPriorityAccessValidation;

	public WebElement transactionsNoPriorityAccessValidation() {
		return transactions_NoPriorityAccessValidation;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement transactions_NoAccountTypeAccessValidation;

	public WebElement transactionsNoAccountTypeAccessValidation() {
		return transactions_NoAccountTypeAccessValidation;
	}

	@FindBy(xpath = "//div[contains(text(),'User Does Not have Access On this TRX type For this CIF Type')]")
	private WebElement transactions_NoCIFTypeAccessValidation;

	public WebElement transactionsNoCIFTypeAccessValidation() {
		return transactions_NoCIFTypeAccessValidation;
	}

	@FindBy(xpath = "//label[contains(text(),'Account Details ')]//ancestor::button")
	private WebElement transactionsMaintenance_AccountDetailsButton;

	public WebElement transactionsMaintenanceAccountDetailsButton() {
		return transactionsMaintenance_AccountDetailsButton;
	}

	@FindBy(xpath = "//td[@title='Add new row']")
	private WebElement transactionsMaintenance_AccountDetailsAddButton;

	public WebElement transactionsMaintenanceAccountDetailsAddButton() {
		return transactionsMaintenance_AccountDetailsAddButton;
	}

	@FindBy(xpath = "//td[@tdlabel='Branch']//input")
	private WebElement additionalDetails_BranchCodeInput;

	public WebElement additionaDetailsBranchCodeInput() {
		return additionalDetails_BranchCodeInput;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']")
	private WebElement additionalDetails_BlankBranchCodeOne;

	public WebElement additionalDetailsBlankBranchCodeOne() {
		return additionalDetails_BlankBranchCodeOne;
	}

	@FindBy(xpath = "(//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR'])[2]")
	private WebElement additionalDetails_BlankBranchCodeTwo;

	public WebElement additionalDetailsBlankBranchCodeTwo() {
		return additionalDetails_BlankBranchCodeTwo;
	}

	@FindBy(xpath = "//span[contains(text(),'Account Details')]")
	private WebElement csm_AddititionalDetailsLabel;

	public WebElement csmAdditionalDetailsLabel() {
		return csm_AddititionalDetailsLabel;
	}

	@FindBy(xpath = "//td[@tdlabel='GL']//input")
	private WebElement additionalDetails_GLCodeInput;

	public WebElement additionalDetailsGLCodeInput() {
		return additionalDetails_GLCodeInput;
	}

	@FindBy(xpath = "//td[@tdlabel='CIF']//input")
	private WebElement additionalDetails_CIFNumberInput;

	public WebElement additionalDetailsCIFNumberInput() {
		return additionalDetails_CIFNumberInput;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL']")
	private WebElement additionalDetails_SerialNumberInput;

	public WebElement additionalDetailsSerialNumberInput() {
		return additionalDetails_SerialNumberInput;
	}

	@FindBy(xpath = "//td[@tdlabel='Amount in Trs CY']//input")
	private WebElement additionalDetails_AmountInput;

	public WebElement additionalDetailsAmountInput() {
		return additionalDetails_AmountInput;
	}

	@FindBy(xpath = "//td[@tdlabel='Amount in Trs CY']//input")
	private WebElement additionalDetails_AmountInput2;

	public WebElement additionalDetailsAmountInput2() {
		return additionalDetails_AmountInput2;
	}

	@FindBy(xpath = "(//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL'])[2]")
	private WebElement additionalDetails_SerialNumberInput2;

	public WebElement additionalDetailsSerialNumberInput2() {
		return additionalDetails_SerialNumberInput2;
	}

	@FindBy(xpath = "(//td[@tdlabel='CIF']//input)[2]")
	private WebElement additionalDetails_CIFNumberInput2;

	public WebElement additionalDetailsCIFNumberInput22() {
		return additionalDetails_CIFNumberInput2;
	}

	@FindBy(xpath = "(//td[@tdlabel='GL']//input)[2]")
	private WebElement additionalDetails_GLCodeInput2;

	public WebElement additionalDetailsGLCodeInput2() {
		return additionalDetails_GLCodeInput2;
	}

	@FindBy(xpath = "(//td[@tdlabel='Branch']//input)[2]")
	private WebElement additionalDetails_BranchCodeInput2;

	public WebElement additionaDetailsBranchCodeInput2() {
		return additionalDetails_BranchCodeInput2;
	}

	@FindBy(xpath = "//span[contains(text(),'ok')]//parent::button")
	private WebElement additionalDetails_OkButton;

	public WebElement additionalDetailsOkButton() {
		return additionalDetails_OkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid Branch Exchange Earning Account')]")
	private WebElement csm_InvalidBranchExchangeValidation;

	public WebElement csmInvalidBranchExchangeValidation() {
		return csm_InvalidBranchExchangeValidation;
	}

	@FindBy(xpath = "//span[@class='ui-search ui-state-default liveSearchSpanCorner liveSearchSpanSize liveSearchSpanDisplay']")
	private WebElement additionsDetails_liveSearchButton;

	public WebElement additionalDetailsLiveSearchButton() {
		return additionsDetails_liveSearchButton;
	}

	@FindBy(xpath = "//th[@role='columnheader']//input[@name='amfVO.BRANCH_CODE']")
	private WebElement additionalDetailsLiveSearch_BranchCodeInput;

	public WebElement additionalDetailsLiveSearchBranchCodeInput() {
		return additionalDetailsLiveSearch_BranchCodeInput;
	}

	@FindBy(xpath = "//th[@role='columnheader']//input[@name='amfVO.CURRENCY_CODE']")
	private WebElement additionalDetailsLiveSearch_CurrencyCodeInput;

	public WebElement additionalDetailsLiveSearchCurrencyCodeInput() {
		return additionalDetailsLiveSearch_CurrencyCodeInput;
	}

	@FindBy(xpath = "//th[@role='columnheader']//input[@name='amfVO.GL_CODE']")
	private WebElement additionalDetailsLiveSearch_GlCodeInput;

	public WebElement additionalDetailsLiveSearchGlCodeInput() {
		return additionalDetailsLiveSearch_GlCodeInput;
	}

	@FindBy(xpath = "//th[@role='columnheader']//input[@name='amfVO.CIF_SUB_NO']")
	private WebElement additionalDetailsLiveSearch_CIFCodeInput;

	public WebElement additionalDetailsLiveSearchCIFCodeInput() {
		return additionalDetailsLiveSearch_CIFCodeInput;
	}

	@FindBy(xpath = "//th[@role='columnheader']//input[@name='amfVO.SL_NO']")
	private WebElement additionalDetailsLiveSearch_SerialNumberInput;

	public WebElement additionalDetailsLiveSearchSerialNumberInput() {
		return additionalDetailsLiveSearch_SerialNumberInput;
	}

	// td[contains(text(),'114')]
	@FindBy(xpath = "//div[contains(text(),'is Non Resident')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactionMaintenance_IsNoResidentOkbuton;

	public WebElement transactionMaintenanceIsNoResidentOkbuton() {
		return transactionMaintenance_IsNoResidentOkbuton;
	}

	@FindBy(xpath = "//span[contains(text(),'ok')]//parent::button")
	private WebElement additionalDetails_Okbutton;

	public WebElement additionalDetailsOkbutton() {
		return additionalDetails_Okbutton;
	}

	@FindBy(xpath = "//div[contains(text(),'This Trx Type is not allowed for Multi Branch')]//parent::div//following-sibling::center//input[1]")
	private WebElement transactionManagement_MultiBranchValidation;

	public WebElement transactionManagementMultiBranchValidation() {
		return transactionManagement_MultiBranchValidation;
	}

	@FindBy(xpath = "//div[contains(text(),'WARNING')]//parent::div//following-sibling::div//div[contains(text(),'Account Type: Limit Amount should be between')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement transactionManagement_AccountTypeLimitWarningValidation;

	public WebElement transactionManagementAccountTypeLimitWarningValidation() {
		return transactionManagement_AccountTypeLimitWarningValidation;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot Proceed')]//parent::div//following-sibling::div//div[contains(text(),'Account Type: Limit Amount should be between')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement transactionManagement_AccountTypeLimitCanNotProceedValidation;

	public WebElement transactionManagementAccountTypeLimitCanNotProceedValidation() {
		return transactionManagement_AccountTypeLimitCanNotProceedValidation;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Approve Reactivate Standing Order')]//parent::td//following-sibling::td//span")
	private WebElement transactionManagement_ApproveReactivateStandingOrderClose;

	public WebElement transactionManagementApproveReactivateStandingOrderClose() {
		return transactionManagement_ApproveReactivateStandingOrderClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Cancel')]//parent::td//following-sibling::td//span")
	private WebElement transactionManagement_CancelTabClose;

	public WebElement transactionManagementCancelTabClose() {
		return transactionManagement_CancelTabClose;
	}

	@FindBy(xpath = "//select[@name='trxMgntCO.ctstrsVO.TRSFR_METHOD']")
	private WebElement transactionManagement_ModeOfPaymentDrodown;

	public WebElement transactionManagementModeOfPaymentDrodown() {
		return transactionManagement_ModeOfPaymentDrodown;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid/Missing trx type')]//parent::div//following-sibling::center//input[1]")
	private WebElement csm_InvalidMissingTransactionTypeValidation;

	public WebElement csmInvalidMissingTransactionTypeValidation() {
		return csm_InvalidMissingTransactionTypeValidation;
	}

	@FindBy(xpath = "//div[contains(text(),'No access')]//parent::div//following-sibling::center//input[1]")
	private WebElement csm_NoAccessTransactionTypeValidation;

	public WebElement csmNoAccessTransactionTypeValidation() {
		return csm_NoAccessTransactionTypeValidation;
	}

	@FindBy(xpath = "//div[contains(text(),'User does not have access to make a Transaction on his own Account')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactions_UserDoesnothaveAccessToTrxValidaytionPopup;

	public WebElement transactionsUserDoesnothaveAccessToTrxValidaytionPopup() {
		return transactions_UserDoesnothaveAccessToTrxValidaytionPopup;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.CHQ_NUM")
	private WebElement transactions_ChequeNumberInput;

	public WebElement transactionsChequeNumberInput() {
		return transactions_ChequeNumberInput;
	}

	// Multi Cheque Entry
	@FindBy(xpath = "//td[contains(text(),'Multi Cheques Entry')]")
	private WebElement transactions_MultiChequesEntryFeature;

	public WebElement transactionsMultiChequesEntryFeature() {
		return transactions_MultiChequesEntryFeature;
	}

	@FindBy(id = "D001CEMT")
	private WebElement multiChequesEntry_Maintenance;

	public WebElement multiChequesEntryMaintenance() {
		return multiChequesEntry_Maintenance;
	}

	@FindBy(id = "lookuptxt_trx_type_D001CEMT")
	private WebElement multiChequesEntry_TransactionType;

	public WebElement multiChequesEntryTransactionType() {
		return multiChequesEntry_TransactionType;
	}

	@FindBy(id = "trs_ac_cy_D001CEMT")
	private WebElement multiChequesEntry_CurrenyCodeInput;

	public WebElement multiChequesEntryCurrenyCodeInput() {
		return multiChequesEntry_CurrenyCodeInput;
	}

	@FindBy(id = "trs_ac_gl_D001CEMT")
	private WebElement multiChequesEntry_GlCodeInput;

	public WebElement multiChequesEntryGlCodeInput() {
		return multiChequesEntry_GlCodeInput;
	}

	@FindBy(id = "trs_ac_cif_D001CEMT")
	private WebElement multiChequesEntry_CIFCodeInput;

	public WebElement multiChequesEntryCIFCodeInput() {
		return multiChequesEntry_CIFCodeInput;
	}

	@FindBy(id = "lookuptxt_trs_ac_sl_D001CEMT")
	private WebElement multiChequesEntry_SerialNumberInput;

	public WebElement multiChequesEntrySerialNumberInput() {
		return multiChequesEntry_SerialNumberInput;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Multi Cheques Entry / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement multiChequesEntry_MaintenanceCloseButton;

	public WebElement multiChequesEntryMaintenanceCloseButton() {
		return multiChequesEntry_MaintenanceCloseButton;
	}

	@FindBy(xpath = "//td[@tdlabel='Amount']")
	private WebElement multiChequesEntry_ChequeAccountGridValidation;

	public WebElement multiChequesEntryChequeAccountGridValidation() {
		return multiChequesEntry_ChequeAccountGridValidation;
	}

	@FindBy(id = "deleteAll_D001CEMT")
	private WebElement multiChequesEntry_DeleteAllButton;

	public WebElement multiChequesEntryDeleteAllButton() {
		return multiChequesEntry_DeleteAllButton;
	}

	@FindBy(id = "lookuptxt_trs_cy_D001CEMT")
	private WebElement multiChequesEntry_CurrencyCodeInput;

	public WebElement multiChequesEntryCurrencyCodeInput() {
		return multiChequesEntry_CurrencyCodeInput;
	}

	@FindBy(id = "amount_D001CEMT")
	private WebElement multiChequesEntry_AmountInput;

	public WebElement multiChequesEntryAmountInput() {
		return multiChequesEntry_AmountInput;
	}

	@FindBy(id = "to_trs_ac_gl_D001CEMT")
	private WebElement multiChequesEntryTransactionDetails_GlInput;

	public WebElement multiChequesEntryTransactionDetailsGlInput() {
		return multiChequesEntryTransactionDetails_GlInput;
	}

	@FindBy(id = "to_trs_ac_cif_D001CEMT")
	private WebElement multiChequesEntryTransactionDetails_CIFInput;

	public WebElement multiChequesEntryTransactionDetailsCIFInput() {
		return multiChequesEntryTransactionDetails_CIFInput;
	}

	@FindBy(id = "lookuptxt_to_trs_ac_sl_D001CEMT")
	private WebElement multiChequesEntryTransactionDetails_SerialNumberInput;

	public WebElement multiChequesEntryTransactionDetailsSerialNumberInput() {
		return multiChequesEntryTransactionDetails_SerialNumberInput;
	}

	@FindBy(id = "chq_num_D001CEMT")
	private WebElement multiChequesEntryTransactionDetails_ChequebookNumberInput;

	public WebElement multiChequesEntryTransactionDetailsChequebookNumberInput() {
		return multiChequesEntryTransactionDetails_ChequebookNumberInput;
	}

//				    								@FindBy(id="submit_464136045")
//				    								private WebElement multiChequesEntryTransactionDetails_SaveButton;
	//
//				    								public WebElement multiChequesEntryTransactionDetailsSaveButton() {
//				    									return multiChequesEntryTransactionDetails_SaveButton;
//				    								}
	// proceed_D001RE
	@FindBy(id = "proceed_D001CEMT")
	private WebElement multiChequesEntry_ProceedButton;

	public WebElement multiChequesEntryProceedButton() {
		return multiChequesEntry_ProceedButton;
	}

	@FindBy(id = "proceed_D001RE")
	private WebElement bulkRemittance_ProceedButton;

	public WebElement bulkRemittanceProceedButton() {
		return bulkRemittance_ProceedButton;
	}

	@FindBy(id = "referenceNumber_D001CEMT")
	private WebElement multiChequesEntryTransactionDetails_ReferenceNumberInput;

	public WebElement multiChequesEntryTransactionDetailsReferenceNumberInput() {
		return multiChequesEntryTransactionDetails_ReferenceNumberInput;
	}

	@FindBy(id = "totalNumberOfCheques_D001CEMT")
	private WebElement multiChequesEntryTransactionDetails_TotalNumberOfChequesInput;

	public WebElement multiChequesEntryTransactionDetailsTotalNumberOfChequesInput() {
		return multiChequesEntryTransactionDetails_TotalNumberOfChequesInput;
	}

	@FindBy(id = "sumOfCheques_D001CEMT")
	private WebElement multiChequesEntryTransactionDetails_SumOfChequesInput;

	public WebElement multiChequesEntryTransactionDetailsSumOfChequesInput() {
		return multiChequesEntryTransactionDetails_SumOfChequesInput;
	}

	// Bulk Remittence

	@FindBy(xpath = "//span[contains(text(),'Bulk Remittance')]//ancestor::a")
	private WebElement transactions_BulkRemittenceFeature;

	public WebElement transactionsBulkRemittenceFeature() {
		return transactions_BulkRemittenceFeature;
	}

	@FindBy(name = "trxMgntCO.bulkRemittanceType")
	private WebElement bulkRemittence_RemittenceTypeDropdown;

	public WebElement bulkRemittence_RemittenceTypeDropdown() {
		return bulkRemittence_RemittenceTypeDropdown;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TRX_TYPE")
	private WebElement bulkRemittence_RemittenceTransactionTypeInput;

	public WebElement bulkRemittenceRemittenceTransactionTypeInput() {
		return bulkRemittence_RemittenceTransactionTypeInput;
	}

	@FindBy(name = "trxMgntCO.remittanceVO.CODE")
	private WebElement bulkRemittence_RemittenceCodeInput;

	public WebElement bulkRemittenceRemittenceCodeInput() {
		return bulkRemittence_RemittenceCodeInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TRS_AC_CY")
	private WebElement bulkRemittence_CustomerAccountCurrencyCodeInput;

	public WebElement bulkRemittenceCustomerAccountCurrencyCodeInput() {
		return bulkRemittence_CustomerAccountCurrencyCodeInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TRS_AC_GL")
	private WebElement bulkRemittence_CustomerAccountGlCodeInput;

	public WebElement bulkRemittenceCustomerAccountGlCodeInput() {
		return bulkRemittence_CustomerAccountGlCodeInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TRS_AC_CIF")
	private WebElement bulkRemittence_CustomerAccountCIFCodeInput;

	public WebElement bulkRemittenceCustomerAccountCIFCodeInput() {
		return bulkRemittence_CustomerAccountCIFCodeInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TRS_AC_SL")
	private WebElement bulkRemittence_CustomerAccountSerialNumberInput;

	public WebElement bulkRemittenceCustomerAccountSerialNumberInput() {
		return bulkRemittence_CustomerAccountSerialNumberInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TRS_CY")
	private WebElement bulkRemittence_TransactionDetailsCurrencyCodeInput;

	public WebElement bulkRemittenceTransactionDetailsCurrencyCodeInput() {
		return bulkRemittence_TransactionDetailsCurrencyCodeInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.AMOUNT")
	private WebElement bulkRemittence_TransactionDetailsAmountInput;

	public WebElement bulkRemittenceTransactionDetailsAmountInput() {
		return bulkRemittence_TransactionDetailsAmountInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TO_TRS_AC_GL")
	private WebElement bulkRemittence_TransactionDetailsInstrumentAccGlCodeInput;

	public WebElement bulkRemittenceTransactionDetailsInstrumentAccGlCodeInput() {
		return bulkRemittence_TransactionDetailsInstrumentAccGlCodeInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TO_TRS_AC_CIF")
	private WebElement bulkRemittence_TransactionDetailsInstrumentAccCIFCodeInput;

	public WebElement bulkRemittenceTransactionDetailsInstrumentAccCIFCodeInput() {
		return bulkRemittence_TransactionDetailsInstrumentAccCIFCodeInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.TO_TRS_AC_SL")
	private WebElement bulkRemittence_TransactionDetailsInstrumentAccSerialNumberCodeInput;

	public WebElement bulkRemittenceTransactionDetailsInstrumentAccSerialNumberCodeInput() {
		return bulkRemittence_TransactionDetailsInstrumentAccSerialNumberCodeInput;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.REMITTANCE_FR_NUM")
	private WebElement bulkRemittence_TransactionDetailsRemittanceFromNumberInput;

	public WebElement bulkRemittenceTransactionDetailsRemittanceFromNumberInput() {
		return bulkRemittence_TransactionDetailsRemittanceFromNumberInput;
	}

	@FindBy(xpath = "//td[@aria-describedby='bulkRemittanceGridTbl_Id_D001RE_cb']//input")
	private WebElement bulkRemittence_TransactionDetailsGridRecordValidation;

	public WebElement bulkRemittenceTransactionDetailsGridRecordValidation() {
		return bulkRemittence_TransactionDetailsGridRecordValidation;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Reverse']")
	private WebElement transaction_ReverseScreen;

	public WebElement transactionReverseScreen() {
		return transaction_ReverseScreen;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.VOID_REASON")
	private WebElement reverse_ReverseReason;

	public WebElement reverseReverseReasonDropdown() {
		return reverse_ReverseReason;
	}

	@FindBy(xpath = "//span[contains(text(),' To Reverse ')]//parent::button")
	private WebElement reverse_ToReverseButton;

	public WebElement reverseToReverseButton() {
		return reverse_ToReverseButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Reverse')]//parent::td//following-sibling::td//span")
	private WebElement close_TransactionReverseScreen;

	public WebElement closeTransactionReverseScreen() {
		return close_TransactionReverseScreen;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Approve Reverse']")
	private WebElement transaction_ApproveReverseFeature;

	public WebElement transactionApproveReverseFeature() {
		return transaction_ApproveReverseFeature;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Approve Reverse')]//parent::td//following-sibling::td//span")
	private WebElement close_TransactionApproveReverseScreen;

	public WebElement closeTransactionApproveReverseScreen() {
		return close_TransactionApproveReverseScreen;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Cancel']")
	private WebElement transactions_CancelFeature;

	public WebElement transactiosCancelFEature() {
		return transactions_CancelFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Approve Cancel']")
	private WebElement transactions_ApproveCancelFeature;

	public WebElement transactiosApproveCancelFEature() {
		return transactions_ApproveCancelFeature;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Cancel')]//parent::td//following-sibling::td//span")
	private WebElement close_TransactionCancelScreen;

	public WebElement closeTransactionCancelScreen() {
		return close_TransactionCancelScreen;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Approve Cancel')]//parent::td//following-sibling::td//span")
	private WebElement close_TransactionApproveCancelScreen;

	public WebElement closeTransactionApproveCancelScreen() {
		return close_TransactionApproveCancelScreen;
	}

	@FindBy(xpath = "//select[@name='trxMgntCO.ctstrsVO.VOID_REASON']")
	private WebElement transactions_CancelReasonDropdown;

	public WebElement transactionsCancelReasonDropdown() {
		return transactions_CancelReasonDropdown;
	}

	@FindBy(xpath = "//span[contains(text(),'Cancel')]//parent::button")
	private WebElement transactions_CancelButton;

	public WebElement transactionsCancelButton() {
		return transactions_CancelButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Approve Cancel')]//parent::button")
	private WebElement transactions_ApproveCancelButton;

	public WebElement transactionsApproveCancelButton() {
		return transactions_ApproveCancelButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot Proceed')]//parent::div//following-sibling::div/div[contains(text(),'Cancel is only allowed in the same day')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactions_cannotCancelOnDifferentDatevalidationPopup;

	public WebElement transactionsCannotCancelOnDifferentDatevalidationPopup() {
		return transactions_cannotCancelOnDifferentDatevalidationPopup;
	}

	@FindBy(xpath = "//div[contains(text(),'Amount Exceeds Available')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactions_AmountExceedsAvailableBalanceOkButton;

	public WebElement transactionsAmountExceedsAvailableBalanceOkButton() {
		return transactions_AmountExceedsAvailableBalanceOkButton;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.avail_bal_after']")
	private WebElement transactions_AvailableBalanceAfterField;

	public WebElement transactionsAvailableBalanceAfterField() {
		return transactions_AvailableBalanceAfterField;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.avail_bal']")
	private WebElement transactions_AvailableBalanceField;

	public WebElement transactionsAvailableBalanceField() {
		return transactions_AvailableBalanceField;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.inverseExchangeRate']")
	private WebElement transactions_InverseExchangerateValue;

	public WebElement transactionsInverseExchangeRateValue() {
		return transactions_InverseExchangerateValue;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement csmcore_Chequebookrequest;

	public WebElement csmcore_Chequebookrequest() {
		return csmcore_Chequebookrequest;
	}

	@FindBy(xpath = "//a[@id='Chequebook Request / Maintenance']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code_clickonsomething;

	public WebElement csmcore_Chequebookrequest_maintanace_Code_clickonsomething() {
		return csmcore_Chequebookrequest_maintanace_Code_clickonsomething;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot Proceed')]")
	private WebElement cannotProceedWarningPopUp;

	public WebElement cannotProceedWarningPopUp() {
		return cannotProceedWarningPopUp;
	}

	// CHB_153

	@FindBy(xpath = "//input[@name='controlrecordCO.ctscontrolVO.BULK_DESTROY_PERIOD']")
	private WebElement CSMparam_ControlRecords_BulkDestroyPeriod;

	public WebElement CSMparam_ControlRecords_BulkDestroyPeriod() {
		return CSMparam_ControlRecords_BulkDestroyPeriod;
	}

	@FindBy(xpath = "//span[text()='Bulk Destroy']//parent::a")
	private WebElement CSM_ChequeBookRequest_BulkDestroyField;

	public WebElement CSM_ChequeBookRequest_BulkDestroyField() {
		return CSM_ChequeBookRequest_BulkDestroyField;
	}

	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BTD_retrieve_key']")
	private WebElement CSM_ChequeBookRequest_BulkDestroyField_RetriveBtn;

	public WebElement CSM_ChequeBookRequest_BulkDestroyField_RetriveBtn() {
		return CSM_ChequeBookRequest_BulkDestroyField_RetriveBtn;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookBulkDestroyGridTbl_Id_Q000BTD_1_ctschqbookVO.CODE']")
	private WebElement CSM_ChequeBookRequest_BulkDestroyField_CheckRecordarevisbleornot;

	public WebElement CSM_ChequeBookRequest_BulkDestroyField_CheckRecordarevisbleornot() {
		return CSM_ChequeBookRequest_BulkDestroyField_CheckRecordarevisbleornot;
	}

	@FindBy(xpath = "//input[@id='code_Q000AP']")
	private WebElement CSM_ChequeBookRequest_ApproveField_GetRequestCode;

	public WebElement CSM_ChequeBookRequest_ApproveField_GetRequestCode() {
		return CSM_ChequeBookRequest_ApproveField_GetRequestCode;
	}

	@FindBy(xpath = "//textarea[@id='status_remarks_Q000AP']")
	private WebElement toBeDestroyed_RejectRemark;

	public WebElement tobeDestroyedRejectRemark() {
		return toBeDestroyed_RejectRemark;
	}

	@FindBy(xpath = "//button[@id='chequeBook_toDestroy_Q000TD']")
	private WebElement toBeDestroy_ToDestroyButton;

	public WebElement toBeDestroyToDestroyButton() {
		return toBeDestroy_ToDestroyButton;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000TD']")
	private WebElement toBeDestroy_BranchCodeValidation;

	public WebElement toBeDestroyBranchCodeValidation() {
		return toBeDestroy_BranchCodeValidation;
	}

	@FindBy(xpath = "//span[text()='Approve Destroyed']")
	private WebElement destroy_MainModule;

	public WebElement destroyMainModule() {
		return destroy_MainModule;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE']")
	private WebElement destroy_ChequeCodeSearch;

	public WebElement destroyChequeCodeSearch() {
		return destroy_ChequeCodeSearch;
	}

	@FindBy(xpath = "//button[@id='chequeBook_destroy_Q000AD']")
	private WebElement destroy_DestroyButon;

	public WebElement destroyDestroyButon() {
		return destroy_DestroyButon;
	}

	@FindBy(xpath = "//center//input[@value='Ok']")
	private WebElement destroy_DestroyAlertOkButton;

	public WebElement destroyDestroyAlertOkButton() {
		return destroy_DestroyAlertOkButton;
	}

	@FindBy(xpath = "//center//input[@value='Ok']")
	private WebElement transactionPopup_OkButtton;

	public WebElement transactionPopupOkButtton() {
		return transactionPopup_OkButtton;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement destroy_TransactionNumber;

	public WebElement destroyTransactionNumber() {
		return destroy_TransactionNumber;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Maintenance']")
	private WebElement chequeBook_MaintenenaceScreen;

	public WebElement chequeBookMaintenenaceScreen() {
		return chequeBook_MaintenenaceScreen;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='To Be Reversed Chequebook']")
	private WebElement chequeBookRequest_ToBeReverseFeature;

	public WebElement chequeBookRequestToBeReverseFeature() {
		return chequeBookRequest_ToBeReverseFeature;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Reverse Chequebook']")
	private WebElement chequeBookRequest_ApproveReverseFeature;

	public WebElement chequeBookRequestApproveReverseFeature() {
		return chequeBookRequest_ApproveReverseFeature;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / To Be Reversed Chequebook')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookRequest_ToBeReversedTabClose;

	public WebElement chequeBookRequestToBeReversedTabClose() {
		return chequeBookRequest_ToBeReversedTabClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Reverse Chequebook')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookRequest_ReverseChequebookTabClose;

	public WebElement chequeBookRequestReverseChequebookTabClose() {
		return chequeBookRequest_ReverseChequebookTabClose;
	}

	@FindBy(id = "chequeBook_toBeReversed_Q000AR")
	private WebElement toRereversed_toBeReverseButton;

	public WebElement toRereversedtoBeReverseButton() {
		return toRereversed_toBeReverseButton;
	}

	@FindBy(xpath = "//div[contains(text(),'You Are Reversing')]//parent::div//following-sibling::center//input[1]")
	private WebElement toBeReversed_confirmationOkButton;

	public WebElement toBeReversedConfirmationOkButton() {
		return toBeReversed_confirmationOkButton;
	}

	@FindBy(id = "chequeBook_reverse_Q000RV")
	private WebElement reverse_ReverseButton;

	public WebElement reverseReverseButton() {
		return reverse_ReverseButton;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Approve']")
	private WebElement chequeBook_ApproveFeature;

	public WebElement chequeBookApproveFeature() {
		return chequeBook_ApproveFeature;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_Q000MT']")
	private WebElement chequeBookMaintenance_Search;

	public WebElement chequeBookMaintenaceSearch() {
		return chequeBookMaintenance_Search;
	}

	// chequeBookCO.ctschqbookVO.STATUS_REMARKS
	@FindBy(name = "chequeBookCO.ctschqbookVO.STATUS_REMARKS")
	private WebElement chequeBook_rejectReasonInput;

	public WebElement chequeBookRejectReasonInput() {
		return chequeBook_rejectReasonInput;
	}

	@FindBy(xpath = "//label[contains(text(),'Reject ')]//ancestor::button")
	private WebElement chequeBookRequest_RejectButtton;

	public WebElement chequebookRequestRejectButtton() {
		return chequeBookRequest_RejectButtton;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement chequeBookMaintenance_SearchChequeCode;

	public WebElement chequeBookMaintenanceSearchChequeCode() {
		return chequeBookMaintenance_SearchChequeCode;
	}

	@FindBy(xpath = "//input[@name='CHEQUE_CODE']")
	private WebElement chequeBookMaintenance_SearchChequeBookType;

	public WebElement chequeBookMaintenanceSearchChequeBookType() {
		return chequeBookMaintenance_SearchChequeBookType;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000MT']//td[text()='Approved']")
	private WebElement ChequeBook_ApprovedStatus;

	public WebElement ChequeBookApprovedStatus() {
		return ChequeBook_ApprovedStatus;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000AD']")
	private WebElement destroyed_BranchCodeValidation;

	public WebElement destroyedBranchCodeValidation() {
		return destroyed_BranchCodeValidation;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement chequeBookRequest_NumberOfChequeBook;

	public WebElement chequeBookRequestNumberOfChequeBook() {
		return chequeBookRequest_NumberOfChequeBook;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement chequeBookRequest_ChequeCode;

	public WebElement chequeBookRequestChequeCode() {
		return chequeBookRequest_ChequeCode;
	}

	@FindBy(xpath = "//input[@id='CHEQUE_BRIEF_NAME']")
	private WebElement chequeBookRequest_ChequeCodeDescription;

	public WebElement chequeBookRequestChequeCodeDescription() {
		return chequeBookRequest_ChequeCodeDescription;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement chequeBookRequest_AccountBranchName;

	public WebElement chequeBookRequestAccountBranchName() {
		return chequeBookRequest_AccountBranchName;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement chequeBookRequest_AccountCurrencyCode;

	public WebElement chequeBookRequestAccountCurrencyCode() {
		return chequeBookRequest_AccountCurrencyCode;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement chequeBookRequest_AccountGlCode;

	public WebElement chequeBookRequestAccountGlCode() {
		return chequeBookRequest_AccountGlCode;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement chequeBookRequest_AccountCIFCode;

	public WebElement chequeBookRequestAccountCIFCode() {
		return chequeBookRequest_AccountCIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement chequeBookRequest_AccountSerialNumber;

	public WebElement chequeBookRequestAccountSerialNumber() {
		return chequeBookRequest_AccountSerialNumber;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Maintenance')]")
	private WebElement chequeBookRequest_Label;

	public WebElement chequeBookRequestLabel() {
		return chequeBookRequest_Label;
	}

	@FindBy(xpath = "//span[text()='Charges']//parent::div")
	private WebElement chequeBookRequest_ChargesSection;

	public WebElement chequeBookRequestChargesSection() {
		return chequeBookRequest_ChargesSection;
	}

	@FindBy(xpath = "//span[contains(text(),' Waive Charges ')]//ancestor::button")
	private WebElement chequebook_WaiveChargesButton;

	public WebElement chequebookWaiveChargesButton() {
		return chequebook_WaiveChargesButton;
	}

	@FindBy(xpath = "//td[@tdlabel='CV Amount']")
	private WebElement chequebook_ZeroChargeValidation;

	public WebElement chequebookZeroChargeValidation() {
		return chequebook_ZeroChargeValidation;
	}

	@FindBy(xpath = "//td[contains(text(),'Chequebook Request')]")
	private WebElement csm_ChequeBookRequest;

	public WebElement csmChequeBookRequest() {
		return csm_ChequeBookRequest;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.NUM_OF_CHQBOOKS']")
	private WebElement chequeBookRequest_NumberOfChequeBooks;

	public WebElement chequeBookRequestNumberOfChequeBooks() {
		return chequeBookRequest_NumberOfChequeBooks;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.CHEQUE_CODE']")
	private WebElement chequeBookRequest_ChequeCodeInput;

	public WebElement chequeBookRequestChequeCodeInput() {
		return chequeBookRequest_ChequeCodeInput;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctscheques.BRIEF_NAME_ENG']")
	private WebElement chequeBookRequest_ChequeCodeDesc;

	public WebElement chequeBookRequestChequeCodeDesc() {
		return chequeBookRequest_ChequeCodeDesc;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBookRequest_BranchCode;

	public WebElement chequeBookRequestBranchCode() {
		return chequeBookRequest_BranchCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBookRequest_CurencyCode;

	public WebElement chequeBookRequestCurencyCode() {
		return chequeBookRequest_CurencyCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBookRequest_GLCode;

	public WebElement chequeBookRequestGLCode() {
		return chequeBookRequest_GLCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBookRequest_CIFNumber;

	public WebElement chequeBookRequestCIFNumber() {
		return chequeBookRequest_CIFNumber;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_SL']")
	private WebElement chequeBookRequest_SerialNumber;

	public WebElement chequeBookRequestSerialNumber() {
		return chequeBookRequest_SerialNumber;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::div//span[text()='To Cancel']")
	private WebElement chequeBookRequest_ToCancelFeature;

	public WebElement chequeBookRequestToCancelFeatrue() {
		return chequeBookRequest_ToCancelFeature;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::div//span[text()='Approve Cancel']")
	private WebElement chequeBookRequest_ApproveCancelFeature;

	public WebElement chequeBookRequestApproveCancelFeature() {
		return chequeBookRequest_ApproveCancelFeature;
	}

	@FindBy(xpath = "//input[@name='CHEQUE_CODE']")
	private WebElement chequeBookrequest_SearchChequeCode;

	public WebElement chequeBookrequestSearchChequeCode() {
		return chequeBookrequest_SearchChequeCode;
	}

	@FindBy(xpath = "//input[@name='ACC_BR']")
	private WebElement chequeBookrequest_SearchAccountBranch;

	public WebElement chequeBookrequestSearchAccountBranch() {
		return chequeBookrequest_SearchAccountBranch;
	}

	@FindBy(xpath = "//input[@name='ACC_CY']")
	private WebElement chequeBookrequest_SearchAccountCurrency;

	public WebElement chequeBookrequestSearchAccountCurrency() {
		return chequeBookrequest_SearchAccountCurrency;
	}

	@FindBy(xpath = "//input[@name='ACC_GL']")
	private WebElement chequebookRequest_SearchGLCode;

	public WebElement chequeBookRequesstSearchGLCode() {
		return chequebookRequest_SearchGLCode;
	}

	@FindBy(xpath = "//input[@name='ACC_CIF']")
	private WebElement chequebookRequest_SearchCIFNumber;

	public WebElement chequebookRequestSearchCIFNumber() {
		return chequebookRequest_SearchCIFNumber;
	}

	@FindBy(xpath = "//input[@name='ACC_SL']")
	private WebElement chequebookRequest_SearchSerialNumber;

	public WebElement chequebookRequestSearchSerialNumber() {
		return chequebookRequest_SearchSerialNumber;
	}

	@FindBy(xpath = "(//td[@tdlabel='Status'])[1]")
	private WebElement chequebook_MaintenanceFirstRecordStatus;

	public WebElement chequebookMaintenanceFirstRecordStatus() {
		return chequebook_MaintenanceFirstRecordStatus;
	}

	@FindBy(xpath = "(//td[@tdlabel='Code'])[1]")
	private WebElement chequebook_MaintenanceFirstChequeCode;

	public WebElement chequebookMaintenanceFirstChequeCode() {
		return chequebook_MaintenanceFirstChequeCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.CANCEL_REASON']")
	private WebElement chequebookRequestCancel_CancelReason;

	public WebElement chequebookRequestCancelCancelReason() {
		return chequebookRequestCancel_CancelReason;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.reasonCodeDesc']")
	private WebElement chequebookRequestCancel_CancelReasonDesc;

	public WebElement chequebookRequestCancelCancelReasonDesc() {
		return chequebookRequestCancel_CancelReasonDesc;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctscheques.BRIEF_NAME_ENG']")
	private WebElement chequebookRequestCancel_ChequeCodeDescription;

	public WebElement chequebookRequestCancelChequeCodeDescription() {
		return chequebookRequestCancel_ChequeCodeDescription;
	}

	@FindBy(name = "chequeBookCO.ctschqbookVO.NUMBER_OF_CHEQUES")
	private WebElement chequebookRequest_NumberOfPaperInputBox;

	public WebElement chequebookRequestNumberOfPaperInputBox() {
		return chequebookRequest_NumberOfPaperInputBox;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000TC']//tbody//tr[2]//td[2]")
	private WebElement chequebookRequest_GridRequestNumber;

	public WebElement chequebookRequestGridRequestNumber() {
		return chequebookRequest_GridRequestNumber;
	}

	@FindBy(xpath = "//label[contains(text(),'To Cancel ')]//ancestor::button")
	private WebElement chequebookRequest_ToCancelButton;

	public WebElement chequebookRequestToCancelButton() {
		return chequebookRequest_ToCancelButton;
	}

	@FindBy(xpath = "//label[contains(text(),'Cancel ')]//ancestor::button")
	private WebElement chequebookRequest_CancelButton;

	public WebElement chequebookRequestCancelButton() {
		return chequebookRequest_CancelButton;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.CODE']")
	private WebElement chequebookRequest_RequestNumber;

	public WebElement chequebookRequestRequestNumber() {
		return chequebookRequest_RequestNumber;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement chequebookRequest_SearchRequetCode;

	public WebElement chequebookRequestSearchRequetCode() {
		return chequebookRequest_SearchRequetCode;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / To Cancel')]//parent::td//following-sibling::td//span")
	private WebElement chequebookRequestToCancel_TabClose;

	public WebElement chequebookRequestToCancelTabClose() {
		return chequebookRequestToCancel_TabClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Approve Cancel')]//parent::td//following-sibling::td//span")
	private WebElement chequebookRequestApproveCancel_TabClose;

	public WebElement chequebookRequestApproveCancelTabClose() {
		return chequebookRequestApproveCancel_TabClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Approve')]//parent::td//following-sibling::td//span")
	private WebElement chequebookRequestApprove_TabClose;

	public WebElement chequebookRequestApproveTabClose() {
		return chequebookRequestApprove_TabClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Apply to Submit')]//parent::td//following-sibling::td//span")
	private WebElement chequebookRequestApplyToSubmit_TabClose;

	public WebElement chequebookRequestApplyToSubmitTabClose() {
		return chequebookRequestApplyToSubmit_TabClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Submit')]//parent::td//following-sibling::td//span")
	private WebElement chequebookRequestSubmit_TabClose;

	public WebElement chequebookRequestSubmitTabClose() {
		return chequebookRequestSubmit_TabClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement chequebookRequestMaintenance_TabClose;

	public WebElement chequebookRequestMaintenanceTabClose() {
		return chequebookRequestMaintenance_TabClose;
	}

	@FindBy(xpath = "//tr[@id='1']//td[2]")
	private WebElement chequeBookRequest_FirstRecord;

	public WebElement chequeBookRequestFirstRecord() {
		return chequeBookRequest_FirstRecord;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid/Missing Reason Code')]")
	private WebElement chequeBookRequest_MissingReasonCode;

	public WebElement chequeBookRequestMissingReasonCode() {
		return chequeBookRequest_MissingReasonCode;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid/Missing Reason Code')]//ancestor::div//following-sibling::center//input[@value='Ok']")
	private WebElement chequeBookRequest_MissingReasonCodeOkButton;

	public WebElement chequeBookRequestMissingReasonCodeOkButton() {
		return chequeBookRequest_MissingReasonCodeOkButton;
	}

	@FindBy(xpath = "//textarea[@name='chequeBookCO.ctschqbookVO.STATUS_REMARKS']")
	private WebElement chequeBookRequest_RejectReasonremark;

	public WebElement chequeBookRequestRejectReasonremark() {
		return chequeBookRequest_RejectReasonremark;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Approve')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookRequest_ApproveScreenClose;

	public WebElement chequeBookRequestApproveScreenClose() {
		return chequeBookRequest_ApproveScreenClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Apply to Submit')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookRequest_ApplyToSubmitClose;

	public WebElement chequeBookRequestApplyToSubmitClose() {
		return chequeBookRequest_ApplyToSubmitClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Submit')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookRequest_SubmitClose;

	public WebElement chequeBookRequestSubmitClose() {
		return chequeBookRequest_SubmitClose;
	}

	@FindBy(xpath = "//tr[@id='1']//td[13]")
	private WebElement chequeBookRequestMaintenance_RecordStatus;

	public WebElement chequeBookRequestMaintenanceRecordStatus() {
		return chequeBookRequestMaintenance_RecordStatus;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Apply to Submit']")
	private WebElement chequeBookRequest_ApplyToSubmitFeature;

	public WebElement chequeBookRequestApplyToSubmitFeature() {
		return chequeBookRequest_ApplyToSubmitFeature;
	}

	@FindBy(xpath = "//label[contains(text(),'Apply Submit ')]//ancestor::button")
	private WebElement applyToSubmit_ApplyToSubmitButton;

	public WebElement applyToSubmitApplyToSubmitButton() {
		return applyToSubmit_ApplyToSubmitButton;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Submit']")
	private WebElement chequeBookRequest_SubmitFeature;

	public WebElement chequeBookRequestSubmitFeature() {
		return chequeBookRequest_SubmitFeature;
	}

	@FindBy(xpath = "//label[contains(text(),'Submit ')]//ancestor::button")
	private WebElement SubmitFeature_SubmitButton;

	public WebElement SubmitFeatureSubmitButton() {
		return SubmitFeature_SubmitButton;
	}

	@FindBy(name = "chequeBookCO.ctschqbookVO.FROM_NUMBER")
	private WebElement chequebookRequest_FromNumberInputBox;

	public WebElement chequebookRequestFromNumberInputBox() {
		return chequebookRequest_FromNumberInputBox;
	}

	@FindBy(name = "chequeBookCO.ctschqbookVO.NUMBER_TO")
	private WebElement chequebookRequest_ToNumberInputBox;

	public WebElement chequebookRequestToNumberInputBox() {
		return chequebookRequest_ToNumberInputBox;
	}

	@FindBy(id = "chequeBook_delete_Q000MT")
	private WebElement chequebookRequestMaintenance_DeleteButton;

	public WebElement chequebookRequestMaintenanceDeleteButton() {
		return chequebookRequestMaintenance_DeleteButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Are you Sure?')]//parent::div//following-sibling::center//input[1]")
	private WebElement chequebookRequestMaintenance_DeleteConfirmationOkButton;

	public WebElement chequebookRequestMaintenanceDeleteConfirmationOkButton() {
		return chequebookRequestMaintenance_DeleteConfirmationOkButton;
	}

	@FindBy(xpath = "//span[text()='Chequebook Query']")
	private WebElement csm_chequeBooQueryModule;

	public WebElement csmchequeBooQueryModule() {
		return csm_chequeBooQueryModule;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBooQueryModule_BranchCode;

	public WebElement chequeBooQueryModuleBranchCode() {
		return chequeBooQueryModule_BranchCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBooQueryModule_CurrencyCode;

	public WebElement chequeBooQueryModuleCurrencyCode() {
		return chequeBooQueryModule_CurrencyCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBooQueryModule_AccGlCode;

	public WebElement chequeBooQueryModuleAccGlCode() {
		return chequeBooQueryModule_AccGlCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBooQueryModule_CIFNumber;

	public WebElement chequeBooQueryModuleCIFNumber() {
		return chequeBooQueryModule_CIFNumber;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_SL']")
	private WebElement chequeBooQueryModule_SLNumber;

	public WebElement chequeBooQueryModuleSLNumber() {
		return chequeBooQueryModule_SLNumber;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement csm_chequeBookRequestModule;

	public WebElement csmChequeBookRequestModule() {
		return csm_chequeBookRequestModule;
	}

	@FindBy(id = "j_username")
	private WebElement csm_UserName;

	public WebElement csmUserName() {
		return csm_UserName;
	}

	@FindBy(id = "passwordInp")
	private WebElement csm_Password;

	public WebElement csmPassword() {
		return csm_Password;
	}

	@FindBy(id = "lookuptxt_COMP_CODE")
	private WebElement csm_CompanyCode;

	public WebElement csmCompanyCode() {
		return csm_CompanyCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_BRANCH_CODE']")
	private WebElement csm_BranchCode;

	public WebElement csmBranchCode() {
		return csm_BranchCode;
	}

	@FindBy(id = "legend")
	private WebElement csm_CompanyAndBranchLogin;

	public WebElement csmCompanyAndBranchLogin() {
		return csm_CompanyAndBranchLogin;
	}

	@FindBy(xpath = "//input[@name='branchesVO.BRIEF_DESC_ENG']")
	private WebElement csm_BranchCodeValidation;

	public WebElement csmBranchCodeValidation() {
		return csm_BranchCodeValidation;
	}

	@FindBy(id = "login")
	private WebElement csm_LoginButon;

	public WebElement csmLoginButon() {
		return csm_LoginButon;
	}

	@FindBy(xpath = "//span[contains(text(),' Continue')]")
	private WebElement csm_ContinueButton;

	public WebElement csmContinueButton() {
		return csm_ContinueButton;
	}

	@FindBy(xpath = "//label[contains(text(),'User')]")
	private WebElement csm_LoginValidation;

	public WebElement csmLoginValidation() {
		return csm_LoginValidation;
	}

	@FindBy(id = "hder_logout_icon_id")
	private WebElement csm_logoutButton;

	public WebElement csmLogoutButton() {
		return csm_logoutButton;
	}

	@FindBy(xpath = "//span[contains(text(),' Yes')]//parent::a")
	private WebElement csm_ForceLogoutYesButton;

	public WebElement csmForceLogoutYesButton() {
		return csm_ForceLogoutYesButton;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']//div[2]//div")
	private WebElement csm_AlertPopup;

	public WebElement csmAlertPopup() {
		return csm_AlertPopup;
	}

	@FindBy(xpath = "//span[contains(text(),'Maintenance')]")
	private WebElement csm_MaintenanceButton;

	public WebElement csmMaintenanceButton() {
		return csm_MaintenanceButton;
	}

	@FindBy(xpath = "//label[text()='Approve ']//ancestor::button")
	private WebElement csm_ApproveButton;

	public WebElement csmApproveButton() {
		return csm_ApproveButton;
	}

	@FindBy(xpath = "//div[text()='Confirm Approve Process']//ancestor::div//center//input[1]")
	private WebElement csm_ConfirmApprovOkButton;

	public WebElement csmConfirmApprovOkButton() {
		return csm_ConfirmApprovOkButton;
	}

	@FindBy(xpath = "//div[text()='Record was Approved Successfully']//ancestor::div//center//input[1]")
	private WebElement csm_ApproveSuccessOkButton;

	public WebElement csmApproveSuccessOkButton() {
		return csm_ApproveSuccessOkButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]//parent::button")
	private WebElement csm_SaveButton;

	public WebElement csmSaveButton() {
		return csm_SaveButton;
	}

	@FindBy(xpath = "//label[contains(text(),'Save')]//ancestor::button")
	private WebElement csm_SaveBtn;

	public WebElement csmSaveBtn() {
		return csm_SaveBtn;
	}

	@FindBy(xpath = "//div[text()='Confirm Save Process']//ancestor::div//center//input[1]")
	private WebElement csm_SaveConfirmOkButton;

	public WebElement csmSaveConfirmOkButton() {
		return csm_SaveConfirmOkButton;
	}

	@FindBy(xpath = "//div[text()='Confirm Save Record']//ancestor::div//center//input[1]")
	private WebElement csm_SaveRecordConfirmOkButton;

	public WebElement csmSaveRecordConfirmOkButton() {
		return csm_SaveRecordConfirmOkButton;
	}

	@FindBy(xpath = "//span[@class='displayProgIcon']//img")
	private WebElement csm_LoadingImage;

	public WebElement csmLoadingImage() {
		return csm_LoadingImage;
	}

	@FindBy(xpath = "//div[text()='Record Saved Successfully']//ancestor::div//center//input[1]")
	private WebElement csm_SaveSuccessOkButton;

	public WebElement csmSaveSuccessOkButton() {
		return csm_SaveSuccessOkButton;
	}

	@FindBy(xpath = "(//center//input[@value='Ok'])[1]")
	private WebElement csm_OkButton;

	public WebElement csmOkButton() {
		return csm_OkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Suspense Account')]//parent::div//following-sibling::center//input")
	private WebElement csm_SuspenseOkButton;

	public WebElement csmSuspenseOkButton() {
		return csm_SuspenseOkButton;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csm_QuitOkButton;

	public WebElement csmQuitOkButton() {
		return csm_QuitOkButton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csm_WarningOkButton;

	public WebElement csmWarningOkButton() {
		return csm_WarningOkButton;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement csm_AlertCloseButton;

	public WebElement csmAlertCloseButton() {
		return csm_AlertCloseButton;
	}

	@FindBy(xpath = "//span[@id='hdr_runn_date']")
	private WebElement csm_SystemDate;

	public WebElement csmSystemDate() {
		return csm_SystemDate;
	}

	@FindBy(xpath = "//input[@id='global_user_run_date']")
	private WebElement csm_InputSystemDate;

	public WebElement csmInputSystemDate() {
		return csm_InputSystemDate;
	}

	@FindBy(xpath = "(//span[contains(text(),'Use')]//parent::button)[1]")
	private WebElement csm_InputSystemDateUseButton;

	public WebElement csmInputSystemDateUseButton() {
		return csm_InputSystemDateUseButton;
	}

	@FindBy(xpath = "//div[text()='Record was Updated Successfully']//ancestor::div//center//input[1]")
	private WebElement update_OkButton;

	public WebElement updateOkButton() {
		return update_OkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Confirm update process')]//parent::div//following-sibling::center//input[1]")
	private WebElement csm_ConfirmUpdateOkButon;

	public WebElement csmConfirmUpdateOkButon() {
		return csm_ConfirmUpdateOkButon;
	}

	@FindBy(xpath = "//span[contains(text(),'Close')]//parent::button")
	private WebElement close_OkButton;

	public WebElement closeOkButton() {
		return close_OkButton;
	}

	@FindBy(xpath = "//span[contains(text(),'close')]//parent::a[@role='button']")
	private WebElement memoAlert_CloseButton;

	public WebElement memoAlertCloseButton() {
		return memoAlert_CloseButton;
	}

	@FindBy(xpath = "//div[contains(text(),'CIF has dormant accounts')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement dormantAccountPopup_OkButton;

	public WebElement dormantAccountPopupOkButton() {
		return dormantAccountPopup_OkButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Approve ')]//ancestor::button")
	private WebElement csm_ApproveBtn;

	public WebElement csmApproveBtn() {
		return csm_ApproveBtn;
	}

	@FindBy(xpath = "//label[contains(text(),'Approve ')]//ancestor::button")
	private WebElement csm_ApproveBtnWithLabel;

	public WebElement csmApproveBtnWithLabel() {
		return csm_ApproveBtnWithLabel;
	}

	@FindBy(xpath = "//label[contains(text(),'Update After Approve ')]//ancestor::button")
	private WebElement csmParam_UpdateAfterApproveBtn;

	public WebElement csmParamUpdateAfterApproveBtn() {
		return csmParam_UpdateAfterApproveBtn;
	}

	@FindBy(xpath = "//a[contains(text(),' Search ')]")
	private WebElement csm_SearchButton;

	public WebElement csmSearchButton() {
		return csm_SearchButton;
	}

	@FindBy(xpath = "//label[contains(text(),'Reject ')]//ancestor::button")
	private WebElement csm_rejectButton;

	public WebElement csmRejectButton() {
		return csm_rejectButton;
	}

	@FindBy(xpath = "//span[@id='tech_details_icon']")
	private WebElement csm_TechDetailsMenu;

	public WebElement csmTechDetailsMenu() {
		return csm_TechDetailsMenu;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement csm_ClearCacheOption;

	public WebElement csmClearCacheOption() {
		return csm_ClearCacheOption;
	}

	@FindBy(xpath = "//div[contains(text(),'Cache Cleared Successfully')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement ClearCacheSuccess_OkButton;

	public WebElement ClearCacheSuccessOkButton() {
		return ClearCacheSuccess_OkButton;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-refresh']")
	private WebElement csm_GridClearButton;

	public WebElement csmGridClearButton() {
		return csm_GridClearButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Please wait while server request completes')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement csm_PleaseWaitServerOkbuton;

	public WebElement csmPleaseWaitServerOkbuton() {
		return csm_PleaseWaitServerOkbuton;
	}

	@FindBy(xpath = "//div[contains(text(),'Is a Company holiday')]//parent::div//following-sibling::center//input[@value='Ok ']")
	private WebElement csm_CompanyHolidayOkButton;

	public WebElement csmCompanyHolidayOkButton() {
		return csm_CompanyHolidayOkButton;
	}

	@FindBy(xpath = "//td[@title='Delete selected row']//span[@class='ui-icon ui-icon-trash']")
	private WebElement csm_DeleteRowButton;

	public WebElement csmDeleteRowButton() {
		return csm_DeleteRowButton;
	}

	@FindBy(xpath = "(//td[@title='Delete selected row']//span[@class='ui-icon ui-icon-trash'])[2]")
	private WebElement csm_DeleteRowButtonTwo;

	public WebElement csmDeleteRowButtonTwo() {
		return csm_DeleteRowButtonTwo;
	}

	@FindBy(xpath = "//div[contains(text(),'Confirm Delete Process')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csm_Delete_ConfirmationOkButton;

	public WebElement csmDeleteConfirmationOkButton() {
		return csm_Delete_ConfirmationOkButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Send Alert')]")
	private WebElement csm_SentAlertLabel;

	public WebElement csmSentAlertLabel() {
		return csm_SentAlertLabel;
	}

	@FindBy(xpath = "//input[@name='USER_ID']")
	private WebElement csm_AlertUserName;

	public WebElement csmAlertUserName() {
		return csm_AlertUserName;
	}

	@FindBy(xpath = "//span[text()=' Send ']//parent::a")
	private WebElement csm_AlertSendButton;

	public WebElement csmAlertSendButton() {
		return csm_AlertSendButton;
	}

	@FindBy(xpath = "//span[text()='Open Item(s)']")
	private WebElement csm_AlertOpenItemButton;

	public WebElement csmAlertOpenItemButton() {
		return csm_AlertOpenItemButton;
	}

	@FindBy(id = "alertsOpenItemApprove_RCVALERT")
	private WebElement csm_alertApproveButton;

	public WebElement csmAlertApproveButton() {
		return csm_alertApproveButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Alerts')]")
	private WebElement csmCore_AlertValidation;

	public WebElement csmCoreAlertValidation() {
		return csmCore_AlertValidation;
	}

	@FindBy(xpath = "//input[@name='TODO_PARAM']")
	private WebElement csmCoreAlert_SearchTrxNumberInAlert;

	public WebElement csmCoreAlertSearchTrxNumberInAlert() {
		return csmCoreAlert_SearchTrxNumberInAlert;
	}

	@FindBy(xpath = "//div[contains(text(),'no_signatures_and_no_fingerprint_found_key')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement csmCore_SignatureNotFoundMessageOkButton;

	public WebElement csmCoreSignatureNotFoundMessageOkButton() {
		return csmCore_SignatureNotFoundMessageOkButton;
	}

	@FindBy(xpath = "//center//input[@value='Ok']")
	private WebElement csmCore_CommonOkButton;

	public WebElement csmCoreCommonOkButton() {
		return csmCore_CommonOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Amount Exceeds Available Balance in Account ')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement csm_AmouundExceedAvailableBalanceWarningMessage;

	public WebElement csmAmouundExceedAvailableBalanceWarningMessage() {
		return csm_AmouundExceedAvailableBalanceWarningMessage;
	}

	@FindBy(xpath = "//div[contains(text(),'Changes made, are you sure you want to quit')]//parent::div//following-sibling::center//input[1]")
	private WebElement csmCommon_UpdateScreenQuitOkButton;

	public WebElement csmCommonUpdateScreenQuitOkButtton() {
		return csmCommon_UpdateScreenQuitOkButton;
	}

	@FindBy(xpath = "//td[@title='Add new row']//span[@class='ui-icon ui-icon-plus']")
	private WebElement csmCommon_GridAddButton;

	public WebElement csmCommonGridAddButton() {
		return csmCommon_GridAddButton;
	}

	@FindBy(xpath = "//td[@title='Delete selected row']//span[@class='ui-icon ui-icon-trash']")
	private WebElement csmCommon_GridDeleteButton;

	public WebElement csmCommonGridDeleteButton() {
		return csmCommon_GridDeleteButton;
	}

	@FindBy(xpath = "//span[contains(text(),'close')]")
	private WebElement csmPopup_CloseButton;

	public WebElement csmPopupCloseButton() {
		return csmPopup_CloseButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Alerts')]//parent::div//span[contains(text(),'close')]")
	private WebElement csm_AlertPopUpCloseButton;

	public WebElement csmAlertPopUpCloseButton() {
		return csm_AlertPopUpCloseButton;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-refresh']")
	private WebElement csm_GridRefreshed;

	public WebElement csmGridRefreshed() {
		return csm_GridRefreshed;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]/ancestor::div//following-sibling::center//input")
	private WebElement sads_SaveSuccessOkButton;

	public WebElement sadsSaveSuccessOkButton() {
		return sads_SaveSuccessOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot clear charges')]//parent::div//following-sibling::center//input[1]")
	private WebElement csm_canNotClearChargesOkButton;

	public WebElement csmCanNotClearChargesOkButton() {
		return csm_canNotClearChargesOkButton;
	}

	@FindBy(xpath = "//td[text()='Charges']")
	private WebElement csmParam_ChargesFeature;

	public WebElement csmParamChargesFeature() {
		return csmParam_ChargesFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'Maintenance of Charges')]")
	private WebElement charges_MaintenanceOfChargesFeature;

	public WebElement chargesMaintenanceOfChargesFeature() {
		return charges_MaintenanceOfChargesFeature;
	}

	@FindBy(xpath = "(//td[contains(text(),'Maintenance of Charges')]//ancestor::a//following-sibling::ul//span[contains(text(),'Update After Approve')])[1]")
	private WebElement maintenanceOfCharges_UpdateAfterApproveScreen;

	public WebElement maintenanceOfChargesUpdateAfterApproveScreen() {
		return maintenanceOfCharges_UpdateAfterApproveScreen;
	}

	@FindBy(xpath = "(//td[contains(text(),'Maintenance of Charges')]//ancestor::a//following-sibling::ul//span[contains(text(),'Approve')])[1]")
	private WebElement maintenanceOfCharges_ApproveScreen;

	public WebElement maintenanceOfChargesApproveScreen() {
		return maintenanceOfCharges_ApproveScreen;
	}

	@FindBy(xpath = "//input[@id='allow_clearing_C0011MA']")
	private WebElement chargeCode_AllowUserToModifyAndClearChargeFlag;

	public WebElement chargeCodeAllowUserToModifyAndClearChargeFlag() {
		return chargeCode_AllowUserToModifyAndClearChargeFlag;
	}

	@FindBy(xpath = "//input[@id='allow_modify_C0011MA']")
	private WebElement chargeCode_AllowUserModifyFlag;

	public WebElement chargeCodeAllowUserModifyFlag() {
		return chargeCode_AllowUserModifyFlag;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.CODE']")
	private WebElement chargeUpdateAfterApprove_ChargeCodeInputSearch;

	public WebElement chargeUpdateAfterApprove_ChargeCodeInputSearch() {
		return chargeUpdateAfterApprove_ChargeCodeInputSearch;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")
	private WebElement chargeUpdateAfterApprove_ChargeCodeInputSearch_approve;

	public WebElement chargeUpdateAfterApprove_ChargeCodeInputSearch_approve() {
		return chargeUpdateAfterApprove_ChargeCodeInputSearch_approve;
	}
	// input[@id='lookuptxt_CHEQUE_CODE_Q000MT']

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement ChequeBook_chequecode_CSM_Core;

	public WebElement ChequeBook_chequecode_CSM_Core() {
		return ChequeBook_chequecode_CSM_Core;
	}

	@FindBy(id = "Parameters / System Parameters / Charges / Maintenance of Charges / Update After Approve")
	private WebElement csmParam_ChargeUpdateAfterApproveMaintenanceLabel;

	public WebElement csmParamChargeUpdateAfterApproveMaintenanceLabel() {
		return csmParam_ChargeUpdateAfterApproveMaintenanceLabel;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Charges / Maintenance of Charges / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement csmParam_ChargeUpdateAfterApproveMaintenanceLabelClose;

	public WebElement csmParamChargeUpdateAfterApproveMaintenanceLabelClose() {
		return csmParam_ChargeUpdateAfterApproveMaintenanceLabelClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Charges / Maintenance of Charges / Approve')]//parent::td//following-sibling::td//span")
	private WebElement csmParam_ChargeApproveMaintenanceLabelClose;

	public WebElement csmParamChargeApproveMaintenanceLabelClose() {
		return csmParam_ChargeApproveMaintenanceLabelClose;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParam_Parameters;

	public WebElement csmParamParameters() {
		return csmParam_Parameters;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement csmParam_SystemParameter;

	public WebElement csmParamSystemParameter() {
		return csmParam_SystemParameter;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']//ancestor::button")
	private WebElement userAccess_UpdateAfterApproveButton;

	public WebElement userAccessUpdateAfterApproveButton() {
		return userAccess_UpdateAfterApproveButton;
	}

	@FindBy(xpath = "//div[text()='Confirm Save Process']//ancestor::div//center//input[1]")
	private WebElement userAccess_SaveConfirmOkButton;

	public WebElement userAccessSaveConfirmOkButton() {
		return userAccess_SaveConfirmOkButton;
	}

	@FindBy(xpath = "//div[text()='Record was Updated Successfully']//ancestor::div//center//input[1]")
	private WebElement userAccess_SaveSuccessOkButton;

	public WebElement userAccessSaveSuccessOkButton() {
		return userAccess_SaveSuccessOkButton;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement transactionType_TransactionCode;

	public WebElement transactionTypeTransactionCode() {
		return transactionType_TransactionCode;
	}

	@FindBy(xpath = "//input[@name='TYPE']")
	private WebElement transactionType_SearchTypeCode;

	public WebElement transactionTypeSearchTypeCode() {
		return transactionType_SearchTypeCode;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement transactionTypeGrid_NextButton;

	public WebElement transactionTypeGridNextButton() {
		return transactionTypeGrid_NextButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Transaction Type / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement transactionType_UpdateAfterApproveLabelClose;

	public WebElement transactionTypeUpdateAfterApproveLabelClose() {
		return transactionType_UpdateAfterApproveLabelClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Transaction Type / Update After Approve')]")
	private WebElement transactionType_UpdateAfterApproveLabel;

	public WebElement transactionTypeUpdateAfterApproveLabel() {
		return transactionType_UpdateAfterApproveLabel;
	}

	@FindBy(xpath = "//td[contains(text(),'Transaction Type')]//ancestor::a//following-sibling::ul//span[text()='Approve']")
	private WebElement transactionType_ApproveFeature;

	public WebElement transactionTypeApproveFeature() {
		return transactionType_ApproveFeature;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.MULTI_BRANCH']")
	private WebElement transactionType_EnableMultiBranchFalg;

	public WebElement transactionTypeEnableMultiBranchFalg() {
		return transactionType_EnableMultiBranchFalg;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.ALLOW_CLEARING_CHRG")
	private WebElement transactionType_AllowUserToModifyClearChargeFlag;

	public WebElement transactionTypeAllowUSerToModifyClearChargeFlag() {
		return transactionType_AllowUserToModifyClearChargeFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.BACK_DATED_VDATE")
	private WebElement transactionType_AllowBackDateVAluDateFalg;

	public WebElement transactionTypeAllowBackDateValuaDateFlag() {
		return transactionType_AllowBackDateVAluDateFalg;
	}

	// initialvalue
	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.POST_DATED_VDATE")
	private WebElement transactionType_AllowPostDateVAluDateFalg;

	public WebElement transactionTypeAllowPostDateVAluDateFalg() {
		return transactionType_AllowPostDateVAluDateFalg;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.NOSTRO_MVT")
	private WebElement transactionType_AllowInternalGlsFlag;

	public WebElement transactionTypeAllowInternalGlsFlag() {
		return transactionType_AllowInternalGlsFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.MULTI_BRANCH")
	private WebElement transactionType_EnableMultiBranchFlag;

	public WebElement transactionTypeEnableMultiBranchFlag() {
		return transactionType_EnableMultiBranchFlag;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement transactionType_ForceOverdrawnFlag;

	public WebElement transactionTypeForceOverdrawnFlag() {
		return transactionType_ForceOverdrawnFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_CASH")
	private WebElement transactionType_DeductChargeFroMCashFlag;

	public WebElement transactionTypeDeductChargeFromCash() {
		return transactionType_DeductChargeFroMCashFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_OTHER")
	private WebElement transactionType_DeductChargeFromOtherAccountFlag;

	public WebElement transactionTypeDeductChargeFromOtherAccountFlag() {
		return transactionType_DeductChargeFromOtherAccountFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_CREDITOR")

	private WebElement transactionType_DeductChargeFromCreditorAccountFlag;

	public WebElement transactionTypeDeductChargeFromCreditorAccountFlag() {
		return transactionType_DeductChargeFromCreditorAccountFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_DEBITOR")
	private WebElement transactionType_DeductChargeFromDebitorAccountFlag;

	public WebElement transactionTypeDeductChargeFromDebitorAccountFlag() {
		return transactionType_DeductChargeFromDebitorAccountFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_TELLER")
	private WebElement transactionType_DeductChargeFromTellerAccountFlag;

	public WebElement transactionTypeDeductChargeFromTellerAccountFlag() {
		return transactionType_DeductChargeFromTellerAccountFlag;
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

	@FindBy(xpath = "//td[@id='td_tab31_GridTbl_Id_P024MA_1_ctstrxtypeStatusVO.AND_OR']//select")
	private WebElement transactionTypeStatus_ANDORDropdown;

	public WebElement transactionTypeStatusANDORDropdown() {
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

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.RQST_CY_NOMINATION_DET']")
	private WebElement transactionType_RequestCurrencyDenominationFlag;

	public WebElement transactionTypeRequestCurrencyDenominationFlag() {
		return transactionType_RequestCurrencyDenominationFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.CR_DR_FOREX")
	private WebElement transactionType_MainAccountDebitFlag;

	public WebElement transactionTypeMainAccountDebitFlag() {
		return transactionType_MainAccountDebitFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.FORBID_MULTI_CIF_TRX")
	private WebElement transactionType_ForbitMultipleCIFFlag;

	public WebElement transactionTypeForbitMultipleCIFFlag() {
		return transactionType_ForbitMultipleCIFFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.TRSFR_METHOD")
	private WebElement transactionType_ModeOfPaymentDropdown;

	public WebElement transactionTypeModeOfPaymentDropdown() {
		return transactionType_ModeOfPaymentDropdown;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.CR_DR_FOREX")
	private WebElement transactionType_MainCreditFlag;

	public WebElement transactionTypeMainCreditFlag() {
		return transactionType_MainCreditFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.NOT_USE_IN_TRX")
	private WebElement transactionType_NotBeUsedInTransactionFlag;

	public WebElement transactionTypeNotBeUsedInTransactionFlag() {
		return transactionType_NotBeUsedInTransactionFlag;
	}

	@FindBy(xpath = "//select[@name='transactiontypesCO.ctstrxtypeVO.USER_ACC_LIMIT']")
	private WebElement transactionType_TransactionTypeLimitBasedOnDropdown;

	public WebElement transactionTypeTransactionTypeLimitBasedOnDropdown() {
		return transactionType_TransactionTypeLimitBasedOnDropdown;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.HIDE_IN_TRS")
	private WebElement transactionType_HideTransactionFlag;

	public WebElement transactionTypeHideTransactionFlag() {
		return transactionType_HideTransactionFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.AUTO_APPROVE_WITHIN_LIMIT")
	private WebElement transactionType_AutoApproveWithinLimitFlag;

	public WebElement transactionTypeFAutoApproveWithinLimitFlag() {
		return transactionType_AutoApproveWithinLimitFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.ALLOW_REVERSE_TRX")
	private WebElement transactionType_AllowReverseTransactionFlag;

	public WebElement transactionTypeAllowReverseTransactionFlag() {
		return transactionType_AllowReverseTransactionFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.ALLOW_REVERSE_TODAY_TRX_ONLY")
	private WebElement transactionType_AllowReverseTodayTransactionOnlyFlag;

	public WebElement transactionTypeAllowReverseTodayTransactionOnlyFlag() {
		return transactionType_AllowReverseTodayTransactionOnlyFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.CANCEL_ON_CREATION")
	private WebElement transactionType_AllowCancelTrxOnCreationDateOnlyFlag;

	public WebElement transactionTypeAllowCancelTrxOnCreationDateOnlyFlag() {
		return transactionType_AllowCancelTrxOnCreationDateOnlyFlag;
	}

	@FindBy(xpath = "//td[@tdlabel='Highlight Officer with red']//input[@class='editable']")
	private WebElement transactionType_HighLightOfficeWithRedFlag;

	public WebElement transactionTypeHighlighOfficerWithRedFlag() {
		return transactionType_HighLightOfficeWithRedFlag;
	}

	@FindBy(xpath = "//td[contains(text(),'Transaction Type')]")
	private WebElement systemParameter_TransactionTypeFeature;

	public WebElement systemParameterTransactionTypeFeature() {
		return systemParameter_TransactionTypeFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'Transaction Type')]//ancestor::a//following-sibling::ul//span[contains(text(),'Update After Approve')]")
	private WebElement transactionType_UpdateAfterApprove;

	public WebElement transactionTypeUpdateAfterApprove() {
		return transactionType_UpdateAfterApprove;
	}

	@FindBy(xpath = "//td[contains(text(),'Certificates')]")
	private WebElement csm_CertificateFeature;

	public WebElement csmCertificateFeature() {
		return csm_CertificateFeature;
	}

	@FindBy(xpath = "//input[@id='1_ctscertificateaccVO.DEDUCT']")
	private WebElement certificate_DeductFromAccount;

	public WebElement certificateDeductFromAccount() {
		return certificate_DeductFromAccount;
	}

	@FindBy(xpath = "(//td[contains(text(),'Active')]//preceding-sibling::td[9]//input)[1]")
	private WebElement certificate_CreditAccount;

	public WebElement certificateCreditAccount() {
		return certificate_CreditAccount;
	}

	@FindBy(xpath = "//td[contains(text(),'Certificates')]//ancestor::h3//following-sibling::ul//span[contains(text(),'Maintenance')]")
	private WebElement certificate_Maintenance;

	public WebElement certificateMaintenance() {
		return certificate_Maintenance;
	}

	@FindBy(xpath = "//td[contains(text(),'Certificates')]//ancestor::h3//following-sibling::ul//span[text()='Approve']")
	private WebElement certificate_ApproveFeature;

	public WebElement certificateApproveFeature() {
		return certificate_ApproveFeature;
	}

	@FindBy(xpath = "//input[@name='CIF_NO']")
	private WebElement certificateApprove_CIFNumberInput;

	public WebElement certificateApproveCIFNumberInput() {
		return certificateApprove_CIFNumberInput;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.CERTIFICATE_TYPE']")
	private WebElement certificateMaintenance_CertificateTypeInput;

	public WebElement certificateMaintenanceCertificateTypeInput() {
		return certificateMaintenance_CertificateTypeInput;
	}

	@FindBy(xpath = "//a[contains(text(),'Certificates / Maintenance')]")
	private WebElement certificateMaintenance_Label;

	public WebElement certificateMaintenanceLabel() {
		return certificateMaintenance_Label;
	}

	@FindBy(xpath = "//a[contains(text(),'Certificates / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement certificateMaintenance_LabelClose;

	public WebElement certificateMaintenanceLabelClose() {
		return certificateMaintenance_LabelClose;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificate_typeVO.BRIEF_DESC_ENG']")
	private WebElement certificateMaintenance_CertificateTypeDescription;

	public WebElement certificateMaintenanceCertificateTypeDescription() {
		return certificateMaintenance_CertificateTypeDescription;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.CIF_NO']")
	private WebElement certificateMaintenance_CIFNumberInput;

	public WebElement certificateMaintenanceCIFNumberInput() {
		return certificateMaintenance_CIFNumberInput;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.CIF_NAME']")
	private WebElement certificateMaintenance_CIFNumberDescription;

	public WebElement certificateMaintenanceCIFNumberDescription() {
		return certificateMaintenance_CIFNumberDescription;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.NUMBER_OF_BILLS']")
	private WebElement certificateMaintenance_NumberOfBillsInput;

	public WebElement certificateMaintenanceNumberOfBillsInput() {
		return certificateMaintenance_NumberOfBillsInput;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.TOTAL_AMOUNT_OF_BILLS']")
	private WebElement certificateMaintenance_TotalAmountOfBillsInput;

	public WebElement certificateMaintenanceTotalAmountOfBillsInput() {
		return certificateMaintenance_TotalAmountOfBillsInput;
	}

	@FindBy(xpath = "//span[contains(text(),'Charges')]//parent::div")
	private WebElement certificateMaintenance_ChargesSection;

	public WebElement certificateMaintenanceChargesSection() {
		return certificateMaintenance_ChargesSection;
	}

	@FindBy(xpath = "//span[contains(text(),' Waive Charges ')]//ancestor::button")
	private WebElement certificateMaintenance_WaiveChargesButton;

	public WebElement certificateMaintenanceWaiveChargesButton() {
		return certificateMaintenance_WaiveChargesButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot clear charges')]//parent::div//following-sibling::center//input[1]")
	private WebElement certificateMaintenance_canNotClearChargesOkButton;

	public WebElement certificateMaintenancecanNotClearChargesOkButton() {
		return certificateMaintenance_canNotClearChargesOkButton;
	}

	@FindBy(xpath = "//td[@tdlabel='CV Amount']")
	private WebElement certificateApprove_ZeroChargeValidation;

	public WebElement certificateApproveZeroChargeValidation() {
		return certificateApprove_ZeroChargeValidation;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement bulkRemittance_Select_BulkRemmitanceType;

	public WebElement bulkRemittance_Select_BulkRemmitanceType() {
		return bulkRemittance_Select_BulkRemmitanceType;
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

	// kailash
	@FindBy(xpath = "//input[@id='apply_charges_waiver_yn_O001UP']")
	private WebElement ApplyChargeFlag;

	public WebElement ApplyChargeFlag() {
		return ApplyChargeFlag;
	}

	@FindBy(xpath = "//a[@id='controlRecord_tab_OtherInfo_O001UP']")
	private WebElement ControlRecord_UpdatedAfterApprove_OtherInformation;

	public WebElement ControlRecord_UpdatedAfterApprove_OtherInformation() {
		return ControlRecord_UpdatedAfterApprove_OtherInformation;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement transactions_Maintenance_Currency;

	public WebElement transactions_Maintenance_Currency() {
		return transactions_Maintenance_Currency;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001AS']//button/span)[1]")
	private WebElement Transactions_AmendStandingOrder_AmendStandingOrderBtn;

	public WebElement Transactions_AmendStandingOrder_AmendStandingOrderBtn() {
		return Transactions_AmendStandingOrder_AmendStandingOrderBtn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001ZN_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Cancel_Code;

	public WebElement Transactions_Cancel_Code() {
		return Transactions_Cancel_Code;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001ZN']")
	private WebElement Transactions_Cancel_Reason;

	public WebElement Transactions_Cancel_Reason() {
		return Transactions_Cancel_Reason;
	}

	@FindBy(xpath = "//span[contains(text(),' Cancel ')]")
	private WebElement Transactions_Cancel_CancelBtn;

	public WebElement Transactions_Cancel_CancelBtn() {
		return Transactions_Cancel_CancelBtn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001CN_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApproveCancel_Code;

	public WebElement Transactions_ApproveCancel_Code() {
		return Transactions_ApproveCancel_Code;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve Cancel ')]")
	private WebElement Transactions_ApproveCancel_ApproveCancelBtn;

	public WebElement Transactions_ApproveCancel_ApproveCancelBtn() {
		return Transactions_ApproveCancel_ApproveCancelBtn;
	}
//

	@FindBy(xpath = "//input[@id='subscriptionType_SMS00MTA']")
	private WebElement SMSSubscription_maintance_typeAc;

	public WebElement SMSSubscription_maintance_typeAc() {
		return SMSSubscription_maintance_typeAc;
	}

	@FindBy(xpath = "//input[@id='acc_br_SMS00MT']")
	private WebElement SMSSubscription_maintance_branch;

	public WebElement SMSSubscription_maintance_branch() {
		return SMSSubscription_maintance_branch;
	}

	@FindBy(xpath = "//input[@id='acc_cy_SMS00MT']")
	private WebElement SMSSubscription_maintance_currency;

	public WebElement SMSSubscription_maintance_currency() {
		return SMSSubscription_maintance_currency;
	}

	@FindBy(xpath = "//input[@id='acc_gl_SMS00MT']")
	private WebElement SMSSubscription_maintance_gl;

	public WebElement SMSSubscription_maintance_gl() {
		return SMSSubscription_maintance_gl;
	}

	@FindBy(xpath = "//input[@id='acc_cif_SMS00MT']")
	private WebElement SMSSubscription_maintance_cif;

	public WebElement SMSSubscription_maintance_cif() {
		return SMSSubscription_maintance_cif;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_SMS00MT']")
	private WebElement SMSSubscription_maintance_serial;

	public WebElement SMSSubscription_maintance_serial() {
		return SMSSubscription_maintance_serial;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_smsSubscriptionVO.SERVICE_CODE']")
	private WebElement SMSSubscription_sericecode;

	public WebElement SMSSubscription_sericecode() {
		return SMSSubscription_sericecode;
	}

	// Card
	// Param
	@FindBy(xpath = "//input[@id='code_P030MT']")
	private WebElement Card_code_cards_params;

	public WebElement Card_code_cards_params() {
		return Card_code_cards_params;
	}

	@FindBy(xpath = "//input[@id='brief_name_eng_P030MT']")
	private WebElement Brief_Name_Cardtype_cards;

	public WebElement Brief_Name_Cardtype_cards() {
		return Brief_Name_Cardtype_cards;
	}

	@FindBy(xpath = "//input[@id='card_prefix_P030MT']")
	private WebElement Bin_number_cards;

	public WebElement Bin_number_cards() {
		return Bin_number_cards;
	}

	@FindBy(xpath = "//input[@id='auto_gen_num_fr_P030MT']")
	private WebElement Auto_generated_From_No_cards;

	public WebElement Auto_generated_From_No_cards() {
		return Auto_generated_From_No_cards;
	}

	@FindBy(xpath = "//input[@id='auto_gen_num_to_P030MT']")
	private WebElement Auto_generated_To_No_cards;

	public WebElement Auto_generated_To_No_cards() {
		return Auto_generated_To_No_cards;
	}

	@FindBy(xpath = "//input[@id='expiry_period_P030MT'] ")
	private WebElement Expiry_Number_cards;

	public WebElement Expiry_Number_cards() {
		return Expiry_Number_cards;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_card_product_code_P030MT'] ")
	private WebElement card_product_cards;

	public WebElement card_product_cards() {
		return card_product_cards;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_allowed_in_br_under_ho_P030MT']")
	private WebElement Branch_code_cards;

	public WebElement Branch_code_cards() {
		return Branch_code_cards;
	}

	@FindBy(xpath = "//input[@id='service_code_P030MT']")
	private WebElement service_code_cards;

	public WebElement service_code_cards() {
		return service_code_cards;
	}

	@FindBy(xpath = "//label[@id='cardsTypeMaint_FormId_P030P_Approve_key']")
	private WebElement Approve_Button_cards_Param;

	public WebElement Approve_Button_cards_Param() {
		return Approve_Button_cards_Param;
	}

	@FindBy(id = "cardsTypeList_GridTbl_Id_P030P_gs_BRIEF_NAME_ENG")
	private WebElement Approve_code_card_type;

	public WebElement Approve_code_card_type() {
		return Approve_code_card_type;
	}

	@FindBy(xpath = "//td[@id='td_cardsTypeList_GridTbl_Id_P030P_1_ctscardsVO.CODE']")
	private WebElement Double_click_cards_type_Param;

	public WebElement Double_click_cards_type_Param() {
		return Double_click_cards_type_Param;
	}

	@FindBy(xpath = "//label[@id='cardsTypeMaint_FormId_P030MT_Save_key']")
	private WebElement Save_button_type_cards;

	public WebElement Save_button_type_cards() {
		return Save_button_type_cards;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_status_reason_G001MT']")
	private WebElement Status_Reason_code_Card_Request;

	public WebElement Status_Reason_code_Card_Request() {
		return Status_Reason_code_Card_Request;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_card_type_G001MT']")
	private WebElement Card_type_Request_CSM_core;

	public WebElement Card_type_Request_CSM_core() {
		return Card_type_Request_CSM_core;
	}

	@FindBy(xpath = "//li[@id='cardsAccountDetails_G001MT']")
	private WebElement Card_accout_detils;

	public WebElement Card_accout_detils() {
		return Card_accout_detils;
	}

	@FindBy(xpath = "//td[@id='add_cardsAccountDetailsGridTbl_Id_G001MT']")
	private WebElement Add_Button_Card_request;

	public WebElement Add_Button_Card_request() {
		return Add_Button_Card_request;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cif_G001MT']")
	private WebElement CIF_number_Card_Request;

	public WebElement CIF_number_Card_Request() {
		return CIF_number_Card_Request;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001P_gs_cardsMgtVO.CARD_TYPE']")
	private WebElement Card_code_request_CSM;

	public WebElement Card_code_request_CSM() {
		return Card_code_request_CSM;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001MT_Save_key']")
	private WebElement Save_Save_card_Request;

	public WebElement Save_Save_card_Request() {
		return Save_Save_card_Request;
	}

	// table[@id='cardsMgmtGridTbl_Id_G001P']

	@FindBy(xpath = "//table[@id='cardsMgmtGridTbl_Id_G001P']")
	private WebElement Card_management_doubleclick;

	public WebElement Card_management_doubleclick() {
		return Card_management_doubleclick;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_credit_type_G001MT']")
	private WebElement Credit_type_cards_Request;

	public WebElement Credit_type_cards_Request() {
		return Credit_type_cards_Request;
	}

	@FindBy(xpath = "//input[@id='effective_date_G001MT']")
	private WebElement Effective_date_cards_Request;

	public WebElement Effective_date_cards_Request() {
		return Effective_date_cards_Request;
	}

	@FindBy(xpath = "//input[@id='new_1724329443581_accountVO.ACC_BR']")
	private WebElement Branch_code_card_Request;

	public WebElement Branch_code_card_Request() {
		return Branch_code_card_Request;
	}

	@FindBy(xpath = "//input[@id='new_1724329443581_accountVO.ACC_CY']")
	private WebElement Curreny_code_cards;

	public WebElement Curreny_code_cards() {
		return Curreny_code_cards;
	}

	@FindBy(xpath = "//input[@id='new_1724329443581_accountVO.ACC_GL']")
	private WebElement Gl_code_cards_Request;

	public WebElement Gl_code_cards_Request() {
		return Gl_code_cards_Request;
	}

	@FindBy(xpath = "//input[@id='new_1724329443581_accountVO.ACC_SL_lookuptxt_cardsAccountDetailsGridTbl_Id_G001MT']")
	private WebElement Serial_number_cards_Request;

	public WebElement Serial_number_cards_Request() {
		return Serial_number_cards_Request;
	}

	@FindBy(xpath = "//input[@id='cardsTypeList_GridTbl_Id_P030P_gs_ctscardsVO.CODE']")
	private WebElement Approve_Button_cards_CSM_Core;

	public WebElement Approve_Button_cards_CSM_Core() {
		return Approve_Button_cards_CSM_Core;
	}

	@FindBy(xpath = "//a[@id='P030P']")
	private WebElement Approve_Card_type_Param;

	public WebElement Approve_Card_type_Param() {
		return Approve_Card_type_Param;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']//div[@class='jMsgbox-contentWrap']")
	private WebElement Transaction_success_popup_text_msg;

	public WebElement Transaction_success_popup_text_msg() {
		return Transaction_success_popup_text_msg;
	}

	// new to change
	@FindBy(id = "cardsMainDet_G001MT")
	private WebElement Maindetail_CardRequest;

	public WebElement Maindetail_CardRequest() {
		return Maindetail_CardRequest;
	}

	@FindBy(xpath = "//input[@id='passBookStockRequestListGridTbl_Id_STP0P_gs_ctsPassBookRequestVO.BATCH_NO']")
	private WebElement CSM_Passbook_Stock_RequestFromProvider_Approve_Screen_Batch_No_Input;

	public WebElement CSM_Passbook_Stock_RequestFromProvider_Approve_Screen_Batch_No_Input() {
		return CSM_Passbook_Stock_RequestFromProvider_Approve_Screen_Batch_No_Input;
	}

	// 30
	@FindBy(xpath = "//input[@id='passBookGridTbl_Id_S000IP_gs_passBookVO.ACC_GL']")
	private WebElement CSM_PassbookCode_IssuePassbooks_GL;

	public WebElement CSM_PassbookCode_IssuePassbooks_GL() {
		return CSM_PassbookCode_IssuePassbooks_GL;
	}
	// sri

	@FindBy(xpath = "//input[@id='lookuptxt_certificate_type_P0049MT']")
	private WebElement Certificate_Type_CSM_core;

	public WebElement Certificate_Type_CSM_core() {
		return Certificate_Type_CSM_core;
	}

	@FindBy(xpath = " //input[@id='lookuptxt_CIF_NO_P0049MT']")
	private WebElement CIF_Number_cerfiticate;

	public WebElement CIF_Number_cerfiticate() {
		return CIF_Number_cerfiticate;
	}

	@FindBy(xpath = "//td[@id='td_certAddAccGridTbl_Id_P0049MT_1_ctscertificateaccVO.CREDIT_ACCOUNT_YN']//input")
	private WebElement Account_Cerfiticate_box;

	public WebElement Account_Cerfiticate_box() {
		return Account_Cerfiticate_box;
	}

	@FindBy(xpath = "//td[@id='td_certAddAccGridTbl_Id_P0049MT_1_ctscertificateaccVO.DEDUCT']//input")
	private WebElement Deduct_from_Account_box;

	public WebElement Deduct_from_Account_box() {
		return Deduct_from_Account_box;
	}

	@FindBy(xpath = "//label[@id='certificateDefFormId_P0049MT_Save_key']")
	private WebElement Save_Button_Cerfiticate;

	public WebElement Save_Button_Cerfiticate() {
		return Save_Button_Cerfiticate;
	}

	@FindBy(xpath = "(//span[contains(text(),'Approve')])[1]")
	private WebElement Approve_button_cerfifticate;

	public WebElement Approve_button_cerfifticate() {
		return Approve_button_cerfifticate;
	}

	@FindBy(xpath = "//input[@id='certificateGridTbl_Id_P0049P_gs_ctscertificateVO.CIF_NO']")
	private WebElement CIF_number_Approve_field;

	public WebElement CIF_number_Approve_field() {
		return CIF_number_Approve_field;
	}

	// table[@id='certificateGridTbl_Id_P0049P']
	@FindBy(xpath = "//table[@id='certificateGridTbl_Id_P0049P']")
	private WebElement Double_click_cerfiticate_CIF;

	public WebElement Double_click_cerfiticate_CIF() {
		return Double_click_cerfiticate_CIF;
	}

	// label[@id='certificateDefFormId_P0049P_Approve_key']
	@FindBy(xpath = "//label[@id='certificateDefFormId_P0049P_Approve_key']")
	private WebElement Approve_submit_cerfiticate;

	public WebElement Approve_submit_cerfiticate() {
		return Approve_submit_cerfiticate;
	}

	@FindBy(xpath = "//input[@id='total_amt_of_bills_P0049MT']")
	private WebElement Total_Nunber_bill_Amount_Cerfiticate;

	public WebElement Total_Nunber_bill_Amount_Cerfiticate() {
		return Total_Nunber_bill_Amount_Cerfiticate;
	}

	@FindBy(xpath = "//input[@id='number_of_bills_P0049MT']")
	private WebElement Total_Nunber_bill_Cerfiticate;

	public WebElement Total_Nunber_bill_Cerfiticate() {
		return Total_Nunber_bill_Cerfiticate;
	}

	// div[@id='certificateChargesDiv_P0049MT']
	@FindBy(xpath = "//div[@id='certificateChargesDiv_P0049MT']")
	private WebElement Charges_cerfiticate_CSMcore;

	public WebElement Charges_cerfiticate_CSMcore() {
		return Charges_cerfiticate_CSMcore;
	}

	@FindBy(xpath = "//table[@id='certificateGridTbl_Id_P0049TC']")
	private WebElement Cancel_cerfiticate_Double_click;

	public WebElement Cancel_cerfiticate_Double_click() {
		return Cancel_cerfiticate_Double_click;
	}

	@FindBy(xpath = "//input[@id='certificateGridTbl_Id_P0049TC_gs_ctscertificateVO.CERTIFICATE_CODE']")
	private WebElement Cancel_cerfiticate_code;

	public WebElement Cancel_cerfiticate_code() {
		return Cancel_cerfiticate_code;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cancelReason_P0049TC']")
	private WebElement Cancel_cerfiticate_code_reason;

	public WebElement Cancel_cerfiticate_code_reason() {
		return Cancel_cerfiticate_code_reason;
	}

	@FindBy(xpath = "//label[@id='certificateDefFormId_P0049TC_Cancel_key']")
	private WebElement Cancel_cerfiticate_submit_button;

	public WebElement Cancel_cerfiticate_submit_button() {
		return Cancel_cerfiticate_submit_button;
	}

	// 02
	@FindBy(xpath = "//span[text()='ok']//parent::button")
	private WebElement csm_generalacc_chargewaiver_Ok_btn;

	public WebElement csm_generalacc_chargewaiver_Ok_btn() {
		return csm_generalacc_chargewaiver_Ok_btn;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.STATUS']")
	private WebElement generalacc_maintenance_status;

	public WebElement generalacc_maintenance_status() {
		return generalacc_maintenance_status;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CURRENCY_CODE']")
	private WebElement generalacc_maintenance_cycode;

	public WebElement generalacc_maintenance_cycode() {
		return generalacc_maintenance_cycode;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.GL_CODE']")
	private WebElement generalacc_maintenance_glcode;

	public WebElement generalacc_maintenance_glcode() {
		return generalacc_maintenance_glcode;
	}

	@FindBy(xpath = "//textarea[@id='fullNameEng_A002MA']")
	private WebElement generalacc_maintenance_text_area_fullname;

	public WebElement generalacc_maintenance_text_area_fullname() {
		return generalacc_maintenance_text_area_fullname;
	}

	@FindBy(xpath = "//td[@id='add_chargesWaiverGrid_Id_A002MA']//span")
	private WebElement csm_generalacc_chargewaiver_plusbtn;

	public WebElement csm_generalacc_chargewaiver_plusbtn() {
		return csm_generalacc_chargewaiver_plusbtn;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_rn']")
	private WebElement csm_generalacc_chargewaiver_plusbtn_clicktoview;

	public WebElement csm_generalacc_chargewaiver_plusbtn_clicktoview() {
		return csm_generalacc_chargewaiver_plusbtn_clicktoview;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_A002MA']")
	private WebElement Average_Balance_generalacc_charwaiver;

	public WebElement Average_Balance_generalacc_charwaiver() {
		return Average_Balance_generalacc_charwaiver;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_DATE']//input")
	private WebElement From_Date_Charges_waiver;

	public WebElement From_Date_Charges_waiver() {
		return From_Date_Charges_waiver;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_DATE']//input")
	private WebElement TO_Date_Charges_waiver;

	public WebElement TO_Date_Charges_waiver() {
		return TO_Date_Charges_waiver;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.FROM_BALANCE']//input")
	private WebElement From_Balance_amount_value;

	public WebElement From_Balance_amount_value() {
		return From_Balance_amount_value;
	}

	@FindBy(xpath = "//table[@id='chargesWaiverGrid_Id_A002MA']//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.TO_BALANCE']//input")
	private WebElement To_Balance_amount_value;

	public WebElement To_Balance_amount_value() {
		return To_Balance_amount_value;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.WAIVER_PERCENTAGE']//input")
	private WebElement Waiver_Percentage_CSM_Core;

	public WebElement Waiver_Percentage_CSM_Core() {
		return Waiver_Percentage_CSM_Core;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_A002MA_1_ctsChargesWaiverVO.WAIVER_AMOUNT']//input")
	private WebElement Waiver_Amount_CSM_core;

	public WebElement Waiver_Amount_CSM_core() {
		return Waiver_Amount_CSM_core;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement Average_Balance_Monthly_ok_button_Accounts;

	public WebElement Average_Balance_Monthly_ok_button_Accounts() {
		return Average_Balance_Monthly_ok_button_Accounts;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_Update_key']")
	private WebElement Update_button_Average_Balance_Monthly;

	public WebElement Update_button_Average_Balance_Monthly() {
		return Update_button_Average_Balance_Monthly;
	}

	@FindBy(xpath = "//span[text()='Authorize']")
	private WebElement Authorize_Accounts_button;

	public WebElement Authorize_Accounts_button() {
		return Authorize_Accounts_button;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement Authorize_Key;

	public WebElement Authorize_Key() {
		return Authorize_Key;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.CIF_SUB_NO']")
	private WebElement Authorize_CIF_Number_button;

	public WebElement Authorize_CIF_Number_button() {
		return Authorize_CIF_Number_button;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement Cheque_Book_CSM_Average;

	public WebElement Cheque_Book_CSM_Average() {
		return Cheque_Book_CSM_Average;
	}

	@FindBy(xpath = "//span[text()='Charges']")
	private WebElement Charges_button_account;

	public WebElement Charges_button_account() {
		return Charges_button_account;
	}

	// new changes 12-092024
	@FindBy(xpath = "//td[@id='del_chargesWaiverGrid_Id_A002MA']/div/span")
	private WebElement DeleteButton_CW_A002MA;

	public WebElement DeleteButton_CW_A002MA() {
		return DeleteButton_CW_A002MA;
	}

	@FindBy(id = "acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE")
	private WebElement accountTypeUpdateAfterApproveCodeSearchInput;

	public WebElement accountTypeUpdateAfterApproveCodeSearchInput() {
		return accountTypeUpdateAfterApproveCodeSearchInput;
	}

	@FindBy(id = "acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE")
	private WebElement accountTypeApproveCodeSearchInput;

	public WebElement accountTypeApproveCodeSearchInput() {
		return accountTypeApproveCodeSearchInput;
	}

	@FindBy(xpath = "//div[@id='penaltyColl_P017MA']/div/span[@class='collapsibleIcon']")
	private WebElement penalityDetailsColapseCircle;

	public WebElement penalityDetailsColapseCircle() {
		return penalityDetailsColapseCircle;
	}

	@FindBy(xpath = "//td[@id='tab15_GridTbl_Id_P017MA_pager_left']//span[@class='ui-icon ui-icon-plus']")
	private WebElement penalityDetailsChargeWaiverAddButton;

	public WebElement penalityDetailsChargeWaiverAddButton() {
		return penalityDetailsChargeWaiverAddButton;
	}

	@FindBy(xpath = "//select[contains(@id,'ctscharges_waiverVO.EXEMPTION_TYPE')]")
	private WebElement accountTypeChargeWaiverExceptionTypeDropdown;

	public WebElement accountTypeChargeWaiverExceptionTypeDropdown() {
		return accountTypeChargeWaiverExceptionTypeDropdown;
	}

	@FindBy(xpath = "//input[contains(@id,'ctscharges_waiverVO.FROM_DATE')]")
	private WebElement accountTypeChargeWaiverExcemptionFromDate;

	public WebElement accountTypeChargeWaiverExcemptionFromDate() {
		return accountTypeChargeWaiverExcemptionFromDate;
	}

	@FindBy(xpath = "//input[contains(@id,'ctscharges_waiverVO.TO_DATE')]")
	private WebElement accountTypeChargeWaiverExcemptionToDate;

	public WebElement accountTypeChargeWaiverExcemptionToDate() {
		return accountTypeChargeWaiverExcemptionToDate;
	}

	@FindBy(xpath = "//input[contains(@id,'_ctscharges_waiverVO.WAIVER_PERCENTAGE')]")
	private WebElement accountTypeChargeWaiverWaiverPercentage;

	public WebElement accountTypeChargeWaiverWaiverPercentage() {
		return accountTypeChargeWaiverWaiverPercentage;
	}

	@FindBy(xpath = "//button[contains(@id,'generated_Btn_new_') and contains(@id,'P017MA')]")
	private WebElement accountTypeChargeWaiverWaiverTrxType;

	public WebElement accountTypeChargeWaiverWaiverTrxType() {
		return accountTypeChargeWaiverWaiverTrxType;
	}

	@FindBy(xpath = "//td[@id='tab30_1_4562_GridTbl_Id_P017MA_pager_left']//span[@class='ui-icon ui-icon-plus']")
	private WebElement accountTypeChargeWaiverWaiverTrxTypeAddButton;

	public WebElement accountTypeChargeWaiverWaiverTrxTypeAddButton() {
		return accountTypeChargeWaiverWaiverTrxTypeAddButton;
	}

	@FindBy(xpath = "//input[contains(@id,'ctscharges_waiver_trxVO.TRX_TYPE_lookuptxt_tab30_') and contains(@id,'GridTbl_Id_P017MA')]")
	private WebElement accountTypeChargeWaiverWaiverTrxTypeInput;

	public WebElement accountTypeChargeWaiverWaiverTrxTypeInput() {
		return accountTypeChargeWaiverWaiverTrxTypeInput;
	}

	@FindBy(xpath = "//span[contains(text(),'OK')]//parent::button")
	private WebElement accountTypeChargeWaiverWaiverTrxTypeOkButton;

	public WebElement accountTypeChargeWaiverWaiverTrxTypeOkButton() {
		return accountTypeChargeWaiverWaiverTrxTypeOkButton;
	}

	@FindBy(xpath = "//input[contains(@id,'_ctscharges_waiverVO.WAIVER_AMOUNT')]")
	private WebElement accountTypeChargeWaiverWaiverAmount;

	public WebElement accountTypeChargeWaiverWaiverAmount() {
		return accountTypeChargeWaiverWaiverAmount;
	}

	@FindBy(xpath = "//select[contains(@id,'ctscharges_waiverVO.AVERAGE_BAL_BASIS')]")
	private WebElement accountTypeChargeWaiverAverageBalanceBasisDropdown;

	public WebElement accountTypeChargeWaiverAverageBalanceBasisDropdown() {
		return accountTypeChargeWaiverAverageBalanceBasisDropdown;
	}

	@FindBy(xpath = "//input[contains(@id,'ctscharges_waiverVO.FROM_BALANCE')]")
	private WebElement accountTypeChargeWaiverFromBalanceAmountInput;

	public WebElement accountTypeChargeWaiverFromBalanceAmountInput() {
		return accountTypeChargeWaiverFromBalanceAmountInput;
	}

	@FindBy(xpath = "//input[contains(@id,'ctscharges_waiverVO.TO_BALANCE')]")
	private WebElement accountTypeChargeWaiverToBalanceAmountInput;

	public WebElement accountTypeChargeWaiverToBalanceAmountInput() {
		return accountTypeChargeWaiverToBalanceAmountInput;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017MA_Update_After_Approve_key']//ancestor::button")
	private WebElement accountTypeUpdateAfterApproveButton;

	public WebElement accountTypeUpdateAfterApproveButton() {
		return accountTypeUpdateAfterApproveButton;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017P_Approve_key']//ancestor::button")
	private WebElement accountTypeApproveButton;

	public WebElement accountTypeApproveButton() {
		return accountTypeApproveButton;
	}

	@FindBy(xpath = "//span[text()='Charges Schema']/following::span[@class='ui-icon ui-icon-plus']")
	private WebElement TrxChargeScehmaAdd;

	public WebElement TrxChargeScehmaAdd() {
		return TrxChargeScehmaAdd;
	}

	@FindBy(xpath = "//td[@id='del_tab15_GridTbl_Id_P017MA']/div/span")
	private WebElement DeleteButton_CW_AccountType;

	public WebElement DeleteButton_CW_AccountType() {
		return DeleteButton_CW_AccountType;
	}

	@FindBy(xpath = "//td[@id='del_tab30_1_201102_GridTbl_Id_P017MA']/div/span")
	private WebElement DeleteButton_TRx_AccountType;

	public WebElement DeleteButton_TRx_AccountType() {
		return DeleteButton_TRx_AccountType;
	}

	@FindBy(xpath = "//input[@id='exemptFullChargesWaiver_A002MA']")
	private WebElement exemptfullchargewaiver_flag;

	public WebElement exemptfullchargewaiver_flag() {
		return exemptfullchargewaiver_flag;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_F00I1MT']")
	private WebElement csm_core_FOM_maintenance_search_button;

	public WebElement csm_core_FOM_maintenance_search_button() {
		return csm_core_FOM_maintenance_search_button;
	}

	@FindBy(xpath = "//input[@id='fomGridTbl_Id_F00I1MT_gs_cifVO.CIF_NO']")
	private WebElement csm_core_FOM_maintenance_input_cifno;

	public WebElement csm_core_FOM_maintenance_input_cifno() {
		return csm_core_FOM_maintenance_input_cifno;
	}

	@FindBy(xpath = "//input[@id='fomGridTbl_Id_F00I1MT_gs_cifVO.STATUS']")
	private WebElement csm_core_FOM_maintenance_input_status;

	public WebElement csm_core_FOM_maintenance_input_status() {
		return csm_core_FOM_maintenance_input_status;
	}

	@FindBy(xpath = "//td[@id='td_fomGridTbl_Id_F00I1MT_1_cifVO.CIF_NO']")
	private WebElement csm_core_FOM_maintenance_input__doubleclick;

	public WebElement csm_core_FOM_maintenance_input__doubleclick() {
		return csm_core_FOM_maintenance_input__doubleclick;
	}

	@FindBy(xpath = "//button[@id='fom_waiver_Charges_btn_F00I1MT']")
	private WebElement csm_core_FOM_maintenance_chargewaiverbutton;

	public WebElement csm_core_FOM_maintenance_chargewaiverbutton() {
		return csm_core_FOM_maintenance_chargewaiverbutton;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_EXEMPTION_TYPE_F00I1MT']")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_exemptiontype;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_exemptiontype() {
		return csm_core_FOM_maintenance_chargewaiverbtn_exemptiontype;
	}

	@FindBy(xpath = "//select[@id='chargesWaiverCO_chargesWaiverVO_AVERAGE_BAL_BASIS_F00I1MT']")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_averagebalancebasic;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_averagebalancebasic() {
		return csm_core_FOM_maintenance_chargewaiverbtn_averagebalancebasic;
	}

	@FindBy(xpath = "//td[@id='add_chargesWaiverGrid_Id_F00I1MT']")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_addbutton;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_addbutton() {
		return csm_core_FOM_maintenance_chargewaiverbtn_addbutton;
	}

	// td[@id='td_chargesWaiverGrid_Id_F00I1MT_1_rn']
	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_F00I1MT_1_rn']")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_addbutton_clicktointract;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_addbutton_clicktointract() {
		return csm_core_FOM_maintenance_chargewaiverbtn_addbutton_clicktointract;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_F00I1MT_1_ctsChargesWaiverVO.FROM_DATE']//input")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_fromdate;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_fromdate() {
		return csm_core_FOM_maintenance_chargewaiverbtn_fromdate;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_F00I1MT_1_ctsChargesWaiverVO.TO_DATE']//input")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_Todate;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_Todate() {
		return csm_core_FOM_maintenance_chargewaiverbtn_Todate;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_F00I1MT_1_ctsChargesWaiverVO.FROM_BALANCE']//input")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_frombalance;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_frombalance() {
		return csm_core_FOM_maintenance_chargewaiverbtn_frombalance;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_F00I1MT_1_ctsChargesWaiverVO.TO_BALANCE']//input")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_Tobalance;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_Tobalance() {
		return csm_core_FOM_maintenance_chargewaiverbtn_Tobalance;
	}

	@FindBy(xpath = "//input[@id='1_ctsChargesWaiverVO.WAIVER_PERCENTAGE_chargesWaiverGrid_Id_F00I1MT']")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_waiverpercentage;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_waiverpercentage() {
		return csm_core_FOM_maintenance_chargewaiverbtn_waiverpercentage;
	}

	@FindBy(xpath = "//td[@id='td_chargesWaiverGrid_Id_F00I1MT_1_ctsChargesWaiverVO.WAIVER_AMOUNT']//input")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_waiveramount;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_waiveramount() {
		return csm_core_FOM_maintenance_chargewaiverbtn_waiveramount;
	}

	@FindBy(xpath = "//button[@id='fomChargesWaiver_save_btn_F00I1MT']")
	private WebElement csm_core_FOM_maintenance_chargewaiverbtn_savebutton;

	public WebElement csm_core_FOM_maintenance_chargewaiverbtn_savebutton() {
		return csm_core_FOM_maintenance_chargewaiverbtn_savebutton;
	}

	@FindBy(xpath = "//label[@id='fomMaintForm_F00I1MT_Save_key']")
	private WebElement csm_core_FOM_maintenance_savebutton;

	public WebElement csm_core_FOM_maintenance_savebutton() {
		return csm_core_FOM_maintenance_savebutton;
	}

	@FindBy(xpath = "//input[@id='fomGridTbl_Id_F00I1P_gs_cifVO.CIF_NO']")
	private WebElement csm_core_FOM_approve_screen_cif;

	public WebElement csm_core_FOM_approve_screen_cif() {
		return csm_core_FOM_approve_screen_cif;
	}

	@FindBy(xpath = "//td[@id='td_fomGridTbl_Id_F00I1P_1_cifVO.CIF_NO']")
	private WebElement csm_core_FOM_approve_screen_double_click;

	public WebElement csm_core_FOM_approve_screen_double_click() {
		return csm_core_FOM_approve_screen_double_click;
	}

	@FindBy(xpath = "//label[@id='fomMaintForm_F00I1P_Approve_key']")
	private WebElement csm_core_FOM_approve_screen_approve_btn;

	public WebElement csm_core_FOM_approve_screen_approve_btn() {
		return csm_core_FOM_approve_screen_approve_btn;
	}

	@FindBy(xpath = "//input[@id='fomGridTbl_Id_F00I1P_gs_cifVO.STATUS']")
	private WebElement csm_core_FOM_approve_screen_status;

	public WebElement csm_core_FOM_approve_screen_status() {
		return csm_core_FOM_approve_screen_status;
	}

	@FindBy(xpath = "//td[@id='del_chargesWaiverGrid_Id_F00I1MT']")
	private WebElement csm_core_FOM_chargewaiver_deletebutton;

	public WebElement csm_core_FOM_chargewaiver_deletebutton() {
		return csm_core_FOM_chargewaiver_deletebutton;
	}

	@FindBy(xpath = "//td[@id='del_tab12_GridTbl_Id_P010MA']")
	private WebElement csmparam_ciftype_chargewaiver_deletebutton;

	public WebElement csmparam_ciftype_chargewaiver_deletebutton() {
		return csmparam_ciftype_chargewaiver_deletebutton;
	}

	@FindBy(xpath = "//td[@id='del_tab26_GridTbl_Id_P024MA']")
	private WebElement csmparam_transactiontype_ciftypecharges_deletebutton;

	public WebElement csmparam_transactiontype_ciftypecharges_deletebutton() {
		return csmparam_transactiontype_ciftypecharges_deletebutton;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001RE']")
	private WebElement Transactions_BulkRemittance_InstrumentAccBranchCode_609;

	public WebElement Transactions_BulkRemittance_InstrumentAccBranchCode_609() {
		return Transactions_BulkRemittance_InstrumentAccBranchCode_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001RE']")
	private WebElement Transactions_BulkRemittance_InstrumentAccCurrencyCode_609;

	public WebElement Transactions_BulkRemittance_InstrumentAccCurrencyCode_609() {
		return Transactions_BulkRemittance_InstrumentAccCurrencyCode_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001RE']")
	private WebElement Transactions_BulkRemittance_InstrumentAccGLCode_609;

	public WebElement Transactions_BulkRemittance_InstrumentAccGLCode_609() {
		return Transactions_BulkRemittance_InstrumentAccGLCode_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001RE']")
	private WebElement Transactions_BulkRemittance_InstrumentAccCifCode_609;

	public WebElement Transactions_BulkRemittance_InstrumentAccCifCode_609() {
		return Transactions_BulkRemittance_InstrumentAccCifCode_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001RE']")
	private WebElement Transactions_BulkRemittance_InstrumentAccSerialNo_609;

	public WebElement Transactions_BulkRemittance_InstrumentAccSerialNo_609() {
		return Transactions_BulkRemittance_InstrumentAccSerialNo_609;
	}

	@FindBy(xpath = "//label[@id='bulkRemittanceDetFormId_D001RE_Charges_key']")
	private WebElement Transactions_BulkRemittance_Charges_609;

	public WebElement Transactions_BulkRemittance_Charges_609() {
		return Transactions_BulkRemittance_Charges_609;
	}

	@FindBy(xpath = "//label[@id='bulkRemittanceDetFormId_D001RE_Waive_Charges_key']")
	private WebElement Transactions_BulkRemittance_WaiveCharges_609;

	public WebElement Transactions_BulkRemittance_WaiveCharges_609() {
		return Transactions_BulkRemittance_WaiveCharges_609;
	}

	@FindBy(xpath = "//input[@id='waive_rate_input_D001RE']")
	private WebElement Transactions_BulkRemittance_WaiveRate_609;

	public WebElement Transactions_BulkRemittance_WaiveRate_609() {
		return Transactions_BulkRemittance_WaiveRate_609;
	}

	@FindBy(xpath = "//button[@id='appToSelWaive_D001RE']//span[contains(text(),' Apply To Selected ')]")
	private WebElement Transactions_BulkRemittance_WaiveRate_ApplytoSelected_609;

	public WebElement Transactions_BulkRemittance_WaiveRate_ApplytoSelected_609() {
		return Transactions_BulkRemittance_WaiveRate_ApplytoSelected_609;
	}

	@FindBy(id = "cb_bulkRemittanceGridTbl_Id_D001RE")
	private WebElement bulkremmitance_click;

	public WebElement bulkremmitance_click() {
		return bulkremmitance_click;
	}

	@FindBy(id = "proceed_D001RE")
	private WebElement bulkremmitance_proceedbtn;

	public WebElement bulkremmitance_proceedbtn() {
		return bulkremmitance_proceedbtn;
	}

	@FindBy(id = "def_charge_in_trs_P024MA")
	private WebElement trxTypeDefaultChargetoTransactionFlag;

	public WebElement trxTypeDefaultChargetoTransactionFlag() {
		return trxTypeDefaultChargetoTransactionFlag;
	}

}
