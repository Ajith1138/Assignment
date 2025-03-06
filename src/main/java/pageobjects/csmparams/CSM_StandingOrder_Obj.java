package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_StandingOrder_Obj {
	WebDriver driver;

	public CSM_StandingOrder_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Transfer Cash']")
	private WebElement Transfer_Cash_CSM_core;

	public WebElement Transfer_Cash_CSM_core() {
		return Transfer_Cash_CSM_core;
	}

	@FindBy(xpath = "//td[text()='Transfer Cash From Vault to Teller']")
	private WebElement Vault_To_Teller_Transfer_cash;

	public WebElement Vault_To_Teller_Transfer_cash() {
		return Vault_To_Teller_Transfer_cash;
	}

	@FindBy(xpath = "//input[@id='new_1705649216110_cashBalanceRemittVO.REMITTANCE_TYPE_lookuptxt_transferCashRemittanceGridTbl_Id_L0VTMT']")
	private WebElement TRX_Type_code_Teller;

	public WebElement TRX_Type_code_Teller() {
		return TRX_Type_code_Teller;
	}

	@FindBy(xpath = "//select[@id='REMITT_TYPE_L0VTMT']")
	private WebElement Select_Remittance_type_cerfiticate;

	public WebElement Select_Remittance_type_cerfiticate() {
		return Select_Remittance_type_cerfiticate;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_cashBalanceRemittVO.REMITTANCE_TYPE']")
	private WebElement Remittance_Type_value_Transfer_cash;

	public WebElement Remittance_Type_value_Transfer_cash() {
		return Remittance_Type_value_Transfer_cash;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_cashBalanceRemittVO.CURRENCY']")
	private WebElement Currency_Value_Remittance_type;

	public WebElement Currency_Value_Remittance_type() {
		return Currency_Value_Remittance_type;
	}

	@FindBy(xpath = "//td[@id='td_transferCashRemittanceGridTbl_Id_L0VTMT_1_cashBalanceRemittVO.SERIAL']")
	private WebElement Serial_Number_Transfer;

	public WebElement Serial_Number_Transfer() {
		return Serial_Number_Transfer;
	}

	@FindBy(xpath = "//td[@id='td_transferCashRemittanceGridTbl_Id_L0VTMT_1_cashBalanceRemittVO.SEQUENCE_FR']")
	private WebElement Sequene_From_Number_remittance;

	public WebElement Sequene_From_Number_remittance() {
		return Sequene_From_Number_remittance;
	}

	@FindBy(xpath = "//td[@id='td_transferCashRemittanceGridTbl_Id_L0VTMT_1_cashBalanceRemittVO.SEQUENCE_TO']")
	private WebElement Sequene_To_Number_remittance;

	public WebElement Sequene_To_Number_remittance() {
		return Sequene_To_Number_remittance;
	}

	@FindBy(xpath = "//td[@id='td_transferCashRemittanceGridTbl_Id_L0VTMT_1_cashBalanceRemittVO.QTY']")
	private WebElement Quantity_Remittance_Transafer;

	public WebElement Quantity_Remittance_Transafer() {
		return Quantity_Remittance_Transafer;
	}

	// User
	@FindBy(xpath = "//td[text()='User']")
	private WebElement User_CSM_param;

	public WebElement User_CSM_param() {
		return User_CSM_param;
	}

	@FindBy(xpath = "//a[@id='hder_full_screen_icon_id']")
	private WebElement User_UPAA_CSM_param;

	public WebElement User_UPAA_CSM_param() {
		return User_UPAA_CSM_param;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement UserId_User_CSM_param;

	public WebElement UserId_User_CSM_param() {
		return UserId_User_CSM_param;
	}

	@FindBy(xpath = " //td[@id='td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID']")
	private WebElement Double_click_user_id_select;

	public WebElement Double_click_user_id_select() {
		return Double_click_user_id_select;
	}

	@FindBy(xpath = "//input[@id='bypass_int_acc_restrictions_E000MA']")
	private WebElement Check_flag_Bypass_Restriction;

	public WebElement Check_flag_Bypass_Restriction() {
		return Check_flag_Bypass_Restriction;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement update_after_approve_submit_button;

	public WebElement update_after_approve_submit_button() {
		return update_after_approve_submit_button;
	}

	@FindBy(xpath = "//a[@id='E000P']")
	private WebElement Approve_user_csm_param;

	public WebElement Approve_user_csm_param() {
		return Approve_user_csm_param;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement User_ID_approve_CSM_param;

	public WebElement User_ID_approve_CSM_param() {
		return User_ID_approve_CSM_param;
	}

	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID']")
	private WebElement Double_click_Approve_field;

	public WebElement Double_click_Approve_field() {
		return Double_click_Approve_field;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement Submit_approve_button_submit;

	public WebElement Submit_approve_button_submit() {
		return Submit_approve_button_submit;
	}

	// Transaction
	@FindBy(xpath = "//input[@id='nostro_mvt_P024MA']")
	private WebElement Allow_interal_flag_Transaction_Type;

	public WebElement Allow_interal_flag_Transaction_Type() {
		return Allow_interal_flag_Transaction_Type;
	}

	@FindBy(xpath = "//span[text()='Main Details']")
	private WebElement Transaction_main_dropdowm_menu_bar;

	public WebElement Transaction_main_dropdowm_menu_bar() {
		return Transaction_main_dropdowm_menu_bar;
	}

	@FindBy(xpath = "//input[@id='multi_branch_P024MA']")
	private WebElement Enable_Multi_Branch_CSM_Param;

	public WebElement Enable_Multi_Branch_CSM_Param() {
		return Enable_Multi_Branch_CSM_Param;
	}

	@FindBy(xpath = "//td[text()='Control Record'")
	private WebElement CSMParam_SystemParam_ControlRecord;

	public WebElement CSMParam_SystemParam_ControlRecord() {
		return CSMParam_SystemParam_ControlRecord;
	}

	@FindBy(xpath = "//a[text()=' Other Information ']")
	private WebElement Control_Record_Other_Information;

	public WebElement Control_Record_Other_Information() {
		return Control_Record_Other_Information;
	}

	@FindBy(xpath = "//span[text()='Transfer Accounts Details']")
	private WebElement Control_Record_Other_Information_Transfer_Account;

	public WebElement Control_Record_Other_Information_Transfer_Account() {
		return Control_Record_Other_Information_Transfer_Account;
	}

	@FindBy(xpath = "//input[@id='enable_two_level_auth_yn_O001UP']")
	private WebElement Control_Record_Other_Information_Transfer_Account_Flag_Enable_two;

	public WebElement Control_Record_Other_Information_Transfer_Account_Flag_Enable_two() {
		return Control_Record_Other_Information_Transfer_Account_Flag_Enable_two;
	}

	@FindBy(xpath = "//a[@id='ADD001MT']")
	private WebElement AdditionalField_Maintenance_button;

	public WebElement AdditionalField_Maintenance_button() {
		return AdditionalField_Maintenance_button;
	}

	@FindBy(xpath = "//input[@name='additionalfieldsCO.ctsAddFieldsVO.BRIEF_DESC_ENG']")
	private WebElement Additional_deatails_Brief_Name;

	public WebElement Additional_deatails_Brief_Name() {
		return Additional_deatails_Brief_Name;
	}

	@FindBy(xpath = "//input[@name='additionalfieldsCO.ctsAddFieldsVO.LONG_DESC_ENG']")
	private WebElement Additional_deatails_long_Name;

	public WebElement Additional_deatails_long_Name() {
		return Additional_deatails_long_Name;
	}

	@FindBy(xpath = "//label[@id='additionalFieldsMaint_FormId_ADD001P_Approve_key']")
	private WebElement Additional_deatails_ApproveButton;

	public WebElement Additional_deatails_ApproveButton() {
		return Additional_deatails_ApproveButton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSMSADS_ClickOkButtonInSuccess;

	public WebElement CSMSADS_ClickOkButtonInSuccess() {
		return CSMSADS_ClickOkButtonInSuccess;
	}

//	@FindBy(xpath = "//input[@id='so_type_P024MAP']")
//	private WebElement CSMParam_TransactionType_PeriodicalCheckBox;
//
//	public WebElement CSMParam_TransactionType_PeriodicalCheckBox() {
//		return CSMParam_TransactionType_PeriodicalCheckBox;
//	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_setup_schema_key']")
	private WebElement CSMParam_TransactionType_setUpSchemaButton;

	public WebElement CSMParam_TransactionType_setUpSchemaButton() {
		return CSMParam_TransactionType_setUpSchemaButton;
	}

	@FindBy(xpath = "//td[@id='add_tab18_GridTbl_Id_P024MA']//span")
	private WebElement CSMParam_TransactionType_setUpSchemaButton_AddBtn;

	public WebElement CSMParam_TransactionType_setUpSchemaButton_AddBtn() {
		return CSMParam_TransactionType_setUpSchemaButton_AddBtn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.ENTITY_CODE']")
	private WebElement CSMParam_TransactionType_setUpSchemaButton_SetupSchemaInputCode;

	public WebElement CSMParam_TransactionType_setUpSchemaButton_SetupSchemaInputCode() {
		return CSMParam_TransactionType_setUpSchemaButton_SetupSchemaInputCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.CHARGE_CODE']")
	private WebElement CSMParam_TransactionType_setUpSchemaButton_ChargeCode;

	public WebElement CSMParam_TransactionType_setUpSchemaButton_ChargeCode() {
		return CSMParam_TransactionType_setUpSchemaButton_ChargeCode;
	}

	@FindBy(xpath = "//button[@id='ok_btn_E_P024MA']")
	private WebElement CSMParam_TransactionType_setUpSchemaButton_ChargeCode_OkButton;

	public WebElement CSMParam_TransactionType_setUpSchemaButton_ChargeCode_OkButton() {
		return CSMParam_TransactionType_setUpSchemaButton_ChargeCode_OkButton;
	}
	// CSM_Core

//									@FindBy(xpath = " //input[@name='trxMgntCO.ctstrsVO.RELEASE_DATE']")
//									private WebElement CSM_Transaction_maintanance_EndingDate;
	//
//									public WebElement CSM_Transaction_maintanance_EndingDate() {
//										return CSM_Transaction_maintanance_EndingDate;
//									}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.VALUE_DATE'] ")
	private WebElement CSM_Transaction_maintanance_StartingDate;

	public WebElement CSM_Transaction_maintanance_StartingDate() {
		return CSM_Transaction_maintanance_StartingDate;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement CSM_Transaction_Maintanance_SearchButton;

	public WebElement CSM_Transaction_Maintanance_SearchButton() {
		return CSM_Transaction_Maintanance_SearchButton;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001AU']")
	private WebElement CSM_Transaction_Approve_SearchButton;

	public WebElement CSM_Transaction_Approve_SearchButton() {
		return CSM_Transaction_Approve_SearchButton;
	}

	@FindBy(xpath = "//td[text()='Closed so'] ")
	private WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCloseStatus;

	public WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCloseStatus() {
		return CSM_Transaction_Maintanance_SearchButton_VerifyCloseStatus;
	}

	@FindBy(xpath = "//td[text()='Stopped']")
	private WebElement CSM_Transaction_Maintanance_SearchButton_VerifyStoppedStatus;

	public WebElement CSM_Transaction_Maintanance_SearchButton_VerifyStoppedStatus() {
		return CSM_Transaction_Maintanance_SearchButton_VerifyStoppedStatus;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit() {
		return CSMCore_Transactions_Maintenance_BranchCodeForCredit;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit() {
		return CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit;
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

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered;

	public WebElement checkIfValueIsEntered() {
		return checkIfValueIsEntered;
	}

//									@FindBy(xpath = "//a[@id='D001AU']")
//									private WebElement Transactions_Approvescrn;
	//
//									public WebElement Transactions_Approvescrn() {
//										return Transactions_Approvescrn;
//									}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValue;

	public WebElement Transactions_transactionNo_codeValue() {
		return Transactions_transactionNo_codeValue;
	}

//									@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
//									private WebElement Transactions_transactionNo_Doubleclk;
	//
//									public WebElement Transactions_transactionNo_Doubleclk() {
//										return Transactions_transactionNo_Doubleclk;
//									}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_searchbtn;

	public WebElement Transactions_searchbtn() {
		return Transactions_searchbtn;
	}
//										@FindBy(id="Transactions / Maintenance")
//										private WebElement CSM_TransactionsMaintenanceForLoading;
	//
//										public WebElement CSM_TransactionsMaintenanceForLoading() {
//											return CSM_TransactionsMaintenanceForLoading;
//										}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu;

	public WebElement CSMOkButtonInWarningPopUpMenu() {
		return CSM_OkButtonInWarningPopUpMenu;
	}

	@FindBy(id = "amount_D001AS")
	private WebElement CSM_AmountInAmendstandingOrderScreen;

	public WebElement CSM_AmountInAmendstandingOrderScreen() {
		return CSM_AmountInAmendstandingOrderScreen;
	}

	@FindBy(xpath = "//td[text()='Created']")
	private WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCreatedStatus;

	public WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCreatedStatus() {
		return CSM_Transaction_Maintanance_SearchButton_VerifyCreatedStatus;
	}
	// STOP_P2_007

	// STOR_P2_009

	@FindBy(xpath = "//span[text()='Amend Standing Order']")
	private WebElement CSM_Transaction_AmendStandingOrder_field;

	public WebElement CSM_Transaction_AmendStandingOrder_field() {
		return CSM_Transaction_AmendStandingOrder_field;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_AmendStandingOrder_field_EnterTransactionNo;

	public WebElement CSM_Transaction_AmendStandingOrder_field_EnterTransactionNo() {
		return CSM_Transaction_AmendStandingOrder_field_EnterTransactionNo;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001AS']")
	private WebElement CSM_Transaction_AmendStandingOrder_field_EnterTransactionNo_DoubleClick;

	public WebElement CSM_Transaction_AmendStandingOrder_field_EnterTransactionNo_DoubleClick() {
		return CSM_Transaction_AmendStandingOrder_field_EnterTransactionNo_DoubleClick;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.RELEASE_DATE']")
	private WebElement CSM_Transaction_AmendStandingOrder_field_EnterTransactionNo_DoubleClick_ChangeEndingDate;

	public WebElement CSM_Transaction_AmendStandingOrder_field_EnterTransactionNo_DoubleClick_ChangeEndingDate() {
		return CSM_Transaction_AmendStandingOrder_field_EnterTransactionNo_DoubleClick_ChangeEndingDate;
	}

	@FindBy(xpath = "//span[contains(text(),' Amend Standing Order ')] ")
	private WebElement CSM_Transaction_AmendStandingOrder_AmendStandingOrderButton;

	public WebElement CSM_Transaction_AmendStandingOrder_AmendStandingOrderButton() {
		return CSM_Transaction_AmendStandingOrder_AmendStandingOrderButton;
	}

	// SuspendSchema
	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_suspend_schema_key']")
	private WebElement CSMParam_TransactionType_SuspendSchema;

	public WebElement CSMParam_TransactionType_SuspendSchema() {
		return CSMParam_TransactionType_SuspendSchema;
	}

	@FindBy(xpath = "//td[@id='add_tab19_GridTbl_Id_P024MA']")
	private WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn;

	public WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn() {
		return CSMParam_TransactionType_SuspendSchema_PlusBtn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.ENTITY_CODE']")
	private WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn_Code;

	public WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn_Code() {
		return CSMParam_TransactionType_SuspendSchema_PlusBtn_Code;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.CHARGE_CODE'] ")
	private WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn_Code_ChargeCode;

	public WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn_Code_ChargeCode() {
		return CSMParam_TransactionType_SuspendSchema_PlusBtn_Code_ChargeCode;
	}

	@FindBy(xpath = "//button[@id='ok_btn_S_P024MA']")
	private WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn_Code_ChargeCode_OkBtn;

	public WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn_Code_ChargeCode_OkBtn() {
		return CSMParam_TransactionType_SuspendSchema_PlusBtn_Code_ChargeCode_OkBtn;
	}

	// ReInstanceSchema
	@FindBy(xpath = "//a[@id='b_reinstate_schema_P024MA']")
	private WebElement CSMParam_TransactionType_Reinstance;

	public WebElement CSMParam_TransactionType_Reinstance() {
		return CSMParam_TransactionType_Reinstance;
	}

	@FindBy(xpath = "//td[@id='add_tab20_GridTbl_Id_P024MA']")
	private WebElement CSMParam_TransactionType_Reinstance_AddBtn;

	public WebElement CSMParam_TransactionType_Reinstance_AddBtn() {
		return CSMParam_TransactionType_Reinstance_AddBtn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.ENTITY_CODE']")
	private WebElement CSMParam_TransactionType_Reinstance_AddBtn_code;

	public WebElement CSMParam_TransactionType_Reinstance_AddBtn_code() {
		return CSMParam_TransactionType_Reinstance_AddBtn_code;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.CHARGE_CODE']")
	private WebElement CSMParam_TransactionType_Reinstance_AddBtn_code_ChargeCode;

	public WebElement CSMParam_TransactionType_Reinstance_AddBtn_code_ChargeCode() {
		return CSMParam_TransactionType_Reinstance_AddBtn_code_ChargeCode;
	}

	@FindBy(xpath = "//button[@id='ok_btn_R_P024MA'] ")
	private WebElement CSMParam_TransactionType_Reinstance_AddBtn_code_ChargeCode_OkBtn;

	public WebElement CSMParam_TransactionType_Reinstance_AddBtn_code_ChargeCode_OkBtn() {
		return CSMParam_TransactionType_Reinstance_AddBtn_code_ChargeCode_OkBtn;
	}
	// AMEND

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_amend_schema_key'] ")
	private WebElement CSMParam_TransactionType_Amendschema;

	public WebElement CSMParam_TransactionType_Amendschema() {
		return CSMParam_TransactionType_Amendschema;
	}

	@FindBy(xpath = "//td[@id='add_tab21_GridTbl_Id_P024MA']")
	private WebElement CSMParam_TransactionType_Amendschema_Addbtn;

	public WebElement CSMParam_TransactionType_Amendschema_Addbtn() {
		return CSMParam_TransactionType_Amendschema_Addbtn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.ENTITY_CODE']")
	private WebElement CSMParam_TransactionType_Amendschema_Addbtn_Code;

	public WebElement CSMParam_TransactionType_Amendschema_Addbtn_Code() {
		return CSMParam_TransactionType_Amendschema_Addbtn_Code;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.CHARGE_CODE']")
	private WebElement CSMParam_TransactionType_Amendschema_Addbtn_Code_Chargecode;

	public WebElement CSMParam_TransactionType_Amendschema_Addbtn_Code_Chargecode() {
		return CSMParam_TransactionType_Amendschema_Addbtn_Code_Chargecode;
	}

	@FindBy(xpath = "//button[@id='ok_btn_A_P024MA']")
	private WebElement CSMParam_TransactionType_Amendschema_Addbtn_Code_Chargecode_OkBtn;

	public WebElement CSMParam_TransactionType_Amendschema_Addbtn_Code_Chargecode_OkBtn() {
		return CSMParam_TransactionType_Amendschema_Addbtn_Code_Chargecode_OkBtn;
	}

	// CLOSESchema

	@FindBy(xpath = "//a[@id='b_close_schema_P024MA']")
	private WebElement CSMParam_TransactionType_CloseSchema;

	public WebElement CSMParam_TransactionType_CloseSchema() {
		return CSMParam_TransactionType_CloseSchema;
	}

	@FindBy(xpath = "//td[@id='add_tab22_GridTbl_Id_P024MA']")
	private WebElement CSMParam_TransactionType_CloseSchema_AddBtn;

	public WebElement CSMParam_TransactionType_CloseSchema_AddBtn() {
		return CSMParam_TransactionType_CloseSchema_AddBtn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.ENTITY_CODE']")
	private WebElement CSMParam_TransactionType_CloseSchema_AddBtn_Code;

	public WebElement CSMParam_TransactionType_CloseSchema_AddBtn_Code() {
		return CSMParam_TransactionType_CloseSchema_AddBtn_Code;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeSoChargesVO.CHARGE_CODE']")
	private WebElement CSMParam_TransactionType_CloseSchema_AddBtn_Code_ChargeCode;

	public WebElement CSMParam_TransactionType_CloseSchema_AddBtn_Code_ChargeCode() {
		return CSMParam_TransactionType_CloseSchema_AddBtn_Code_ChargeCode;
	}

	@FindBy(xpath = "//button[@id='ok_btn_C_P024MA']")
	private WebElement CSMParam_TransactionType_CloseSchema_AddBtn_Code_ChargeCode_OKBTN;

	public WebElement CSMParam_TransactionType_CloseSchema_AddBtn_Code_ChargeCode_OKBTN() {
		return CSMParam_TransactionType_CloseSchema_AddBtn_Code_ChargeCode_OKBTN;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValues;

	public WebElement Transactions_transactionNo_codeValues()

	{
		return Transactions_transactionNo_codeValues;
	}

	// KailashPageObject

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement TransactionType;

	public WebElement TransactionType() {
		return TransactionType;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement TransactionType_UpdateAfterApprove;

	public WebElement TransactionType_UpdateAfterApprove() {
		return TransactionType_UpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement TransactionType_CodeSearch;

	public WebElement TransactionType_CodeSearch() {
		return TransactionType_CodeSearch;
	}

	@FindBy(xpath = "//input[@id='standing_order_P024MA']")
	private WebElement StandingOrder_CheckBox;

	public WebElement StandingOrder_CheckBox() {
		return StandingOrder_CheckBox;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAX']")
	private WebElement StandingOrder_MaxBalance;

	public WebElement StandingOrder_MaxBalance() {
		return StandingOrder_MaxBalance;
	}

	@FindBy(xpath = "//select[@id='so_periodicity_P024MA']")
	private WebElement periodicity;

	public WebElement periodicity() {
		return periodicity;
	}

	@FindBy(xpath = "//select[@id='so_period_type_P024MA']")
	private WebElement Period_type;

	public WebElement Period_type() {
		return Period_type;
	}

	@FindBy(xpath = "//select[@id='so_period_day_P024MA']")
	private WebElement Day_specifications;

	public WebElement Day_specifications() {
		return Day_specifications;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement TransactionType_Update_After_Approve_Button;

	public WebElement TransactionType_Update_After_Approve_Button() {
		return TransactionType_Update_After_Approve_Button;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Enter_Code_update;

	public WebElement Enter_Code_update() {
		return Enter_Code_update;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approve_in_transactionTYpe;

	public WebElement Approve_in_transactionTYpe() {
		return Approve_in_transactionTYpe;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement DoubleClick_TransactionType_UpdateCode;

	public WebElement DoubleClick_TransactionType_UpdateCode() {
		return DoubleClick_TransactionType_UpdateCode;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.SHORT_DESC_ENG']")
	private WebElement DoubleClick_TransactionType_Approve;

	public WebElement DoubleClick_TransactionType_Approve() {
		return DoubleClick_TransactionType_Approve;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement CSM_BranchCode_underTransactons;

	public WebElement CSM_BranchCode_underTransactons() {

		return CSM_BranchCode_underTransactons;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement CSM_CurrencyCode_underTransactons;

	public WebElement CSM_CurrencyCode_underTransactons() {

		return CSM_CurrencyCode_underTransactons;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSM_GLCode_underTransactons;

	public WebElement CSM_GLCode_underTransactons() {

		return CSM_GLCode_underTransactons;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement CSM_CIFCode_underTransactons;

	public WebElement CSM_CIFCode_underTransactons() {

		return CSM_CIFCode_underTransactons;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSM_SerialNo_underTransactons;

	public WebElement CSM_SerialNo_underTransactons() {

		return CSM_SerialNo_underTransactons;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement CSM_CurrenyUnder_Currency;

	public WebElement CSM_CurrenyUnder_Currency() {

		return CSM_CurrenyUnder_Currency;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement CSM_Amount_underTransactons;

	public WebElement CSM_Amount_underTransactons() {

		return CSM_Amount_underTransactons;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenance_button_core;

	public WebElement Maintenance_button_core() {

		return Maintenance_button_core;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Trx_code_core;

	public WebElement Trx_code_core() {

		return Trx_code_core;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']")
	private WebElement search_trx_code_core;

	public WebElement search_trx_code_core() {
		return search_trx_code_core;
	}

	// Vijay pageobject

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement CSM_ConfirmOk;

	public WebElement CSM_ConfirmOk() {
		return CSM_ConfirmOk;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Ok;

	public WebElement CSM_Ok() {
		return CSM_Ok;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement CSM_SimpleOk;

	public WebElement CSM_SimpleOk() {
		return CSM_SimpleOk;
	}

	/// ***Template Entries***///

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Parameters;

	public WebElement Parameters() {
		return Parameters;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement Parameters_SystemParameters;

	public WebElement Parameters_SystemParameters() {
		return Parameters_SystemParameters;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement Parameters_SystemParameters_ControlRecord;

	public WebElement Parameters_SystemParameters_ControlRecord() {
		return Parameters_SystemParameters_ControlRecord;
	}

	@FindBy(xpath = "//a[@id='O001UP']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove;
	}

	@FindBy(xpath = "//select[@id='send_clear_entry_O001UP']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry;
	}
	// Send to Clear Process

	@FindBy(xpath = "//input[@id='no_clearing_entries_O001UP']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_NoClearingEntries;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_NoClearingEntries() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_NoClearingEntries;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn609;
	}

	@FindBy(xpath = "//a[@id='O001P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_ControlRecord_Approve;

	public WebElement Parameters_SystemParameters_ControlRecord_Approve() {
		return Parameters_SystemParameters_ControlRecord_Approve;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609;

	public WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609() {
		return Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609;
	}

	@FindBy(xpath = "//td[text()='Template Entries']")
	private WebElement Parameters_SystemParameters_TemplateEntries;

	public WebElement Parameters_SystemParameters_TemplateEntries() {
		return Parameters_SystemParameters_TemplateEntries;
	}

	@FindBy(xpath = "//a[@id='P0070MT']/span[text()='Maintenance']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance;
	}

	@FindBy(xpath = "//input[@id='code_P0070MT']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Code;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Code() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_Code;
	}

	@FindBy(xpath = "//input[@id='brief_name_eng_P0070MT']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Briefname;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Briefname() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_Briefname;
	}

	@FindBy(xpath = "//select[@id='deduct_charges_on_P0070MT']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_DeductChargeson;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_DeductChargeson() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_DeductChargeson;
	}
	// Authorizing

	@FindBy(xpath = "//select[@id='deduct_charges_on_P0070MT']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Addicon;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_Addicon() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_Addicon;
	}

	// tr -> i = 2,3..
	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_LineOrder;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_LineOrder() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_LineOrder;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[2]//input

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_GroupNo;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_GroupNo() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_GroupNo;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[3]

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_AmountSign;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_AmountSign() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_AmountSign;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[4]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_BranchType;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_BranchType() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_BranchType;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[5]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_CurrencyType;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_CurrencyType() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_CurrencyType;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[7]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_GLType;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_GLType() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_GLType;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[8]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_CIFType;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_CIFType() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_CIFType;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[10]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_SLType;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_SLType() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_SLType;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[12]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_TradeDateType;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_TradeDateType() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_TradeDateType;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[14]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_ValueDateType;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_ValueDateType() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_ValueDateType;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[15]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_JVType;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_JVType() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_JVType;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[17]//input

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_EntriesLevel;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_EntriesLevel() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_EntriesLevel;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[19]/select

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_AmountExpression;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_AmountExpression() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_AmountExpression;
	}
	// table[@id='tab3_GridTbl_Id_P0070MT']//tbody/tr[2]/td[28]/input

	@FindBy(xpath = "//label[@id='templateEntriesMaint_FormId_P0070MT_Save_key']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_SaveBtn;

	public WebElement Parameters_SystemParameters_TemplateEntries_Maintenance_SaveBtn() {
		return Parameters_SystemParameters_TemplateEntries_Maintenance_SaveBtn;
	}

	@FindBy(xpath = "//a[@id='P0070P']/span[text()='Approve']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Approve;

	public WebElement Parameters_SystemParameters_TemplateEntries_Approve() {
		return Parameters_SystemParameters_TemplateEntries_Approve;
	}

	@FindBy(xpath = "//input[@id='templateEntriesList_GridTbl_Id_P0070P_gs_ctstrsdetTemplateVO.CODE']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Approve_Code;

	public WebElement Parameters_SystemParameters_TemplateEntries_Approve_Code() {
		return Parameters_SystemParameters_TemplateEntries_Approve_Code;
	}
	// table[@id='templateEntriesList_GridTbl_Id_P0070P']//td[text()='456']

	@FindBy(xpath = "//label[@id='templateEntriesMaint_FormId_P0070P_Approve_key']")
	private WebElement Parameters_SystemParameters_TemplateEntries_Approve_ApproveBtn;

	public WebElement Parameters_SystemParameters_TemplateEntries_Approve_ApproveBtn() {
		return Parameters_SystemParameters_TemplateEntries_Approve_ApproveBtn;
	}

	/// *** Cheques ***///

	@FindBy(xpath = "//td[text()='Cheques']")
	private WebElement Parameters_SystemParameters_Cheques;

	public WebElement Parameters_SystemParameters_Cheques() {
		return Parameters_SystemParameters_Cheques;
	}

	@FindBy(xpath = "//td[text()='ChequeBook']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook() {
		return Parameters_SystemParameters_Cheques_Chequebook;
	}

	@FindBy(xpath = "//a[@id='P029MT']/span[text()='Maintenance']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance;
	}

	@FindBy(xpath = "//a[@id='P029MA']/span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='chequesBookList_GridTbl_Id_P029MA_gs_ctschequesVO.CODE']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_Code;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_Code() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_Code;
	}
	// table[@id='chequesBookList_GridTbl_Id_P029MA']//td[text()='123']

	@FindBy(xpath = "//input[@id='code_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Code;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Code() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Code;
	}

	@FindBy(xpath = "//input[@id='brief_name_eng_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Briefname;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Briefname() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Briefname;
	}

	@FindBy(xpath = "//input[@id='number_of_cheques_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Numberofcheques;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Numberofcheques() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Numberofcheques;
	}

	@FindBy(xpath = "//input[@id='multi_cy_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_MultiCurrency;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_MultiCurrency() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_MultiCurrency;
	}

	@FindBy(xpath = "//input[@id='multi_cy_P029MA']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency;
	}

	@FindBy(xpath = "//input[@id='pop_acc_full_name_to_print_yn_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_PopulateAccountsflag;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_PopulateAccountsflag() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_PopulateAccountsflag;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cheque_types_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_ChequeType;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_ChequeType() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_ChequeType;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_leaves_P029MT']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Leaves;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Leaves() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_Leaves;
	}

	@FindBy(xpath = "//label[@id='chequesBookMaint_FormId_P029MT_Save_key']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_SaveBtn;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Maintenance_SaveBtn() {
		return Parameters_SystemParameters_Cheques_Chequebook_Maintenance_SaveBtn;
	}

	@FindBy(xpath = "//label[@id='chequesBookMaint_FormId_P029MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_UpdateBtn;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_UpdateBtn() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_UpdateBtn;
	}

	@FindBy(xpath = "//a[@id='P029P']/span[text()='Approve']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve() {
		return Parameters_SystemParameters_Cheques_Chequebook_Approve;
	}

	@FindBy(xpath = "//input[@id='chequesBookList_GridTbl_Id_P029P_gs_ctschequesVO.CODE']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_Code;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_Code() {
		return Parameters_SystemParameters_Cheques_Chequebook_Approve_Code;
	}
	// table[@id='chequesBookList_GridTbl_Id_P029P']//td[text()='2233']

	@FindBy(xpath = "//label[@id='chequesBookMaint_FormId_P029P_Approve_key']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_ApproveBtn;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_Approve_ApproveBtn() {
		return Parameters_SystemParameters_Cheques_Chequebook_Approve_ApproveBtn;
	}

	/// ***Transaction Type***///

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Parameters_SystemParameters_TransactionType;

	public WebElement Parameters_SystemParameters_TransactionType() {
		return Parameters_SystemParameters_TransactionType;
	}

	@FindBy(xpath = "//a[@id='P024MT']/span[text()='Maintenance']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance() {
		return Parameters_SystemParameters_TransactionType_Maintenance;
	}

	@FindBy(xpath = "//input[@id='code_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Code;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Code() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Code;
	}

	@FindBy(xpath = "//input[@id='short_desc_eng_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Briefname;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Briefname() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Briefname;
	}

	@FindBy(xpath = "//input[@id='long_desc_eng_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Longname;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Longname() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Longname;
	}

	@FindBy(xpath = "//input[@id='short_desc_arab_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_BriefnameArab;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_BriefnameArab() {
		return Parameters_SystemParameters_TransactionType_Maintenance_BriefnameArab;
	}

	@FindBy(xpath = "//input[@id='long_desc_arab_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_LongnameArab;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_LongnameArab() {
		return Parameters_SystemParameters_TransactionType_Maintenance_LongnameArab;
	}

	@FindBy(xpath = "//select[@id='type_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Type;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Type() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Type;
	}
	// Transfer

	@FindBy(xpath = "//select[@id='trsfr_type_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_TransferType;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_TransferType() {
		return Parameters_SystemParameters_TransactionType_Maintenance_TransferType;
	}
	// Intra Bank

	@FindBy(xpath = "//input[@id='cr_dr_forex_P024MTD']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_MainAccDebit;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_MainAccDebit() {
		return Parameters_SystemParameters_TransactionType_Maintenance_MainAccDebit;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_ProceedOnInsufficientFund;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_ProceedOnInsufficientFund() {
		return Parameters_SystemParameters_TransactionType_Maintenance_ProceedOnInsufficientFund;
	}

	@FindBy(xpath = "//select[@id='authoriz_level_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_AuthorizationLevel;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_AuthorizationLevel() {
		return Parameters_SystemParameters_TransactionType_Maintenance_AuthorizationLevel;
	}
	// Non-Supervisory Lvl.

	@FindBy(xpath = "//a[@id='transactionTypes_tab_otherInfo_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab;
	}

	@FindBy(xpath = "//select[@id='bs_contra_flag_P024MT']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AccEntry;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AccEntry() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AccEntry;
	}
	// Template Entries

	@FindBy(xpath = "//span[@id='spanLookup_additional_template_entries_P024MT']/span")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesSrc;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesSrc() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesSrc;
	}

	@FindBy(xpath = "//input[@id='gridtab_additional_template_entries_P024MT_gs_CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesCode;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesCode() {
		return Parameters_SystemParameters_TransactionType_Maintenance_Otherinfotab_AdditionalTemplateEntriesCode;
	}
	// table[@id='gridtab_additional_template_entries_P024MT']//td[text()='60']

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MT_Save_key']")
	private WebElement Parameters_SystemParameters_TransactionType_Maintenance_SaveBtn;

	public WebElement Parameters_SystemParameters_TransactionType_Maintenance_SaveBtn() {
		return Parameters_SystemParameters_TransactionType_Maintenance_SaveBtn;
	}

	@FindBy(xpath = "//a[@id='P024P']/span[text()='Approve']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve;

	public WebElement Parameters_SystemParameters_TransactionType_Approve() {
		return Parameters_SystemParameters_TransactionType_Approve;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_Code;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_Code() {
		return Parameters_SystemParameters_TransactionType_Approve_Code;
	}
	// table[@id='transactionTypesList_GridTbl_Id_P024P']//td[text()='467']

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_ApproveBtn;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_ApproveBtn() {
		return Parameters_SystemParameters_TransactionType_Approve_ApproveBtn;
	}

	@FindBy(xpath = "//a[@id='P024MA']/span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code;
	}
	// table[@id='transactionTypesList_GridTbl_Id_P024MA']//td[text()='365']

	@FindBy(xpath = "//input[@id='standing_order_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder;
	}

	@FindBy(xpath = "//input[@id='auto_approve_within_limit_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAM']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MinBalance;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MinBalance() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MinBalance;
	}

//	@FindBy(xpath = "//input[@id='so_type_P024MAP']")
//	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodical;
//
//	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodical() {
//		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodical;
//	}

	@FindBy(xpath = "//input[@id='so_type_P024MAX']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MaxBalance;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MaxBalance() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MaxBalance;
	}

	@FindBy(xpath = "//select[@id='so_process_type_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Processtype;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Processtype() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Processtype;
	}
	// EOD

	@FindBy(xpath = "//select[@id='so_periodicity_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodicity;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodicity() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Periodicity;
	}
	// Monthly or Daily

	@FindBy(xpath = "//select[@id='so_period_type_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodType;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodType() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodType;
	}

	@FindBy(xpath = "//select[@id='so_period_day_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DaySpecification;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DaySpecification() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DaySpecification;
	}

	@FindBy(xpath = "(//select[@id='so_period_interval_P024MA'])[1]")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodInterval;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodInterval() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_PeriodInterval;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques;
	}
	// House Cheque

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund;
	}

	@FindBy(xpath = "//input[@id='cc_maintain_serial_no_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargeonVoid;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargeonVoid() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargeonVoid;
	}

	@FindBy(xpath = "//input[@id='allow_change_clearing_acc_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoChangeClearingAccount;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoChangeClearingAccount() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoChangeClearingAccount;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn;
	}

	/// *** Account Control Record***///

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement Parameters_AccountParameters;

	public WebElement Parameters_AccountParameters() {
		return Parameters_AccountParameters;
	}

	@FindBy(xpath = "//td[text()='Acc Control Record']")
	private WebElement Parameters_AccountParameters_AccControlRecord;

	public WebElement Parameters_AccountParameters_AccControlRecord() {
		return Parameters_AccountParameters_AccControlRecord;
	}

	@FindBy(xpath = "//a[@id='ANC001MT']/span[text()='Maintenance']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Maintenance;

	public WebElement Parameters_AccountParameters_AccControlRecord_Maintenance() {
		return Parameters_AccountParameters_AccControlRecord_Maintenance;
	}

	@FindBy(xpath = "//li[@id='jvAndAccountsMain_ANC001MT']/a/span")
	private WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab;

	public WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab() {
		return Parameters_AccountParameters_AccControlRecord_JvAccountsTab;
	}

	@FindBy(xpath = "(//div[@id='div_col_accounts_Inner_ANC001MT']/div/span)[1]")
	private WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_AccountsDropDown;

	public WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_AccountsDropDown() {
		return Parameters_AccountParameters_AccControlRecord_JvAccountsTab_AccountsDropDown;
	}

	@FindBy(xpath = "//input[@id='proceed_on_modified_acc_yn_ANC001MT']")
	private WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_ProceedonModifiedAccount;

	public WebElement Parameters_AccountParameters_AccControlRecord_JvAccountsTab_ProceedonModifiedAccount() {
		return Parameters_AccountParameters_AccControlRecord_JvAccountsTab_ProceedonModifiedAccount;
	}

	@FindBy(xpath = "//label[@id='accControlRecordMaintFormId_ANC001MT_update_key']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Maintenance_UpdateBtn;

	public WebElement Parameters_AccountParameters_AccControlRecord_Maintenance_UpdateBtn() {
		return Parameters_AccountParameters_AccControlRecord_Maintenance_UpdateBtn;
	}

	@FindBy(xpath = "//a[@id='ANC001P']/span[text()='Approve']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Approve;

	public WebElement Parameters_AccountParameters_AccControlRecord_Approve() {
		return Parameters_AccountParameters_AccControlRecord_Approve;
	}

	@FindBy(xpath = "//label[@id='accControlRecordMaintFormId_ANC001P_approve_key']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Approve_ApproveBtn;

	public WebElement Parameters_AccountParameters_AccControlRecord_Approve_ApproveBtn() {
		return Parameters_AccountParameters_AccControlRecord_Approve_ApproveBtn;
	}

	@FindBy(xpath = "//a[@id='ANC001MA']/span[text()='Update After Approve']")
	private WebElement Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove;

	public WebElement Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove() {
		return Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove;
	}

	/// **** Remittance Type ****///

	@FindBy(xpath = "//td[text()='Remittance Type']")
	private WebElement Parameters_SystemParameters_RemittanceType;

	public WebElement Parameters_SystemParameters_RemittanceType() {
		return Parameters_SystemParameters_RemittanceType;
	}

	@FindBy(xpath = "//a[@id='P0040MT']//span[text()='Maintenance']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance() {
		return Parameters_SystemParameters_RemittanceType_Maintenance;
	}

	@FindBy(xpath = "//input[@id='code_P0040MT']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_Code;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_Code() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_Code;
	}

	@FindBy(xpath = "//select[@id='remittance_type_P0040MT']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_Type;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_Type() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_Type;
	}
	// Certificate of Deposit

	@FindBy(xpath = "//input[@id='brief_name_eng_P0040MT']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_BriefDescription;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_BriefDescription() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_BriefDescription;
	}

	@FindBy(xpath = "//select[@id='by_comp_or_branch_P0040MT']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_RemittanceBy;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_RemittanceBy() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_RemittanceBy;
	}

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040MT_Save_key']")
	private WebElement Parameters_SystemParameters_RemittanceType_Maintenance_SaveBtn;

	public WebElement Parameters_SystemParameters_RemittanceType_Maintenance_SaveBtn() {
		return Parameters_SystemParameters_RemittanceType_Maintenance_SaveBtn;
	}

	@FindBy(xpath = "//a[@id='P0040P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_RemittanceType_Approve;

	public WebElement Parameters_SystemParameters_RemittanceType_Approve() {
		return Parameters_SystemParameters_RemittanceType_Approve;
	}

	@FindBy(xpath = "//input[@id='remittancetypeList_GridTbl_Id_P0040P_gs_remittanceVO.CODE']")
	private WebElement Parameters_SystemParameters_RemittanceType_Approve_Code;

	public WebElement Parameters_SystemParameters_RemittanceType_Approve_Code() {
		return Parameters_SystemParameters_RemittanceType_Approve_Code;
	}
	// table[@id='remittancetypeList_GridTbl_Id_P0040P']//td[text()='70']

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040P_Approve_key']")
	private WebElement Parameters_SystemParameters_RemittanceType_Approve_ApproveBtn;

	public WebElement Parameters_SystemParameters_RemittanceType_Approve_ApproveBtn() {
		return Parameters_SystemParameters_RemittanceType_Approve_ApproveBtn;
	}

	/// *** User ***///

	@FindBy(xpath = "//td[text()='User']")
	private WebElement Parameters_SystemParameters_User;

	public WebElement Parameters_SystemParameters_User() {
		return Parameters_SystemParameters_User;
	}

	@FindBy(xpath = "//a[@id='E000MA']//span[text()='Update after Approve']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove() {
		return Parameters_SystemParameters_User_UpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UserId;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UserId() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_UserId;
	}
	// (//table[@id='tellerParamList_GridTbl_Id_E000MA']//td[text()='VIJAY'])[1]

	@FindBy(xpath = "//input[@id='mask_trx_amt_approve_yn_E000MA']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_MaskTrxAmountonApproval;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_MaskTrxAmountonApproval() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_MaskTrxAmountonApproval;
	}

	@FindBy(xpath = "//span[text()=' Trx Type ']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType;
	}

	@FindBy(xpath = "//td[@id='add_tab16_GridTbl_Id_E000MA']//span")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_AddIcon;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_AddIcon() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_AddIcon;
	}

	@FindBy(xpath = "//table[@id='tab16_GridTbl_Id_E000MA']/tbody//span//input")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_TransactionCode;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_TransactionCode() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_TransactionCode;
	}

	@FindBy(xpath = "//td[@id='del_tab16_GridTbl_Id_E000MA']//span")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteIcon;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteIcon() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteIcon;
	}

	@FindBy(xpath = "//span[text()='Delete All']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteAll;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteAll() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_TrxType_DeleteAll;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn;
	}

	@FindBy(xpath = "//a[@id='E000P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_User_Approve;

	public WebElement Parameters_SystemParameters_User_Approve() {
		return Parameters_SystemParameters_User_Approve;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement Parameters_SystemParameters_User_Approve_UserId;

	public WebElement Parameters_SystemParameters_User_Approve_UserId() {
		return Parameters_SystemParameters_User_Approve_UserId;
	}
	// (//table[@id='tellerParamList_GridTbl_Id_E000P']//td[text()='VIJAY'])[1]

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement Parameters_SystemParameters_User_Approve_ApproveBtn;

	public WebElement Parameters_SystemParameters_User_Approve_ApproveBtn() {
		return Parameters_SystemParameters_User_Approve_ApproveBtn;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_closeSymbol;

	public WebElement CSMCore_closeSymbol() {
		return CSMCore_closeSymbol;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;

	public WebElement CSM_DateToChangeTheCurrentDate() {
		return CSM_DateToChangeTheCurrentDate;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
		return CSM_ClearCacheInTechnicalDetailsIcon;
	}

//											@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
//											private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;
//											public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
//												return csmOkButtonForConfirmationPopUpForCompanyHoliday;
//											}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;

	public WebElement CSMOkButtonInInformationPopUpMenu() {
		return CSM_OkButtonInInformationPopUpMenu;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;

	public WebElement CSM_CloseButtonInChangeRunningDate() {
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

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement csmStopperMessagePopupInTransactions;

	public WebElement csmStopperMessagePopupInTransactions() {
		return csmStopperMessagePopupInTransactions;
	}

	/// ***Transactions***///
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions;

	public WebElement Transactions() {
		return Transactions;
	}

	@FindBy(xpath = "//a[@id='D001MT']/span[text()='Maintenance']")
	private WebElement Transactions_Maintenance;

	public WebElement Transactions_Maintenance() {
		return Transactions_Maintenance;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']/span")
	private WebElement Transactions_Maintenance_TrxTypeSearch;

	public WebElement Transactions_Maintenance_TrxTypeSearch() {
		return Transactions_Maintenance_TrxTypeSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_trx_type_D001MT_gs_CODE']")
	private WebElement Transactions_Maintenance_TrxTypeCode;

	public WebElement Transactions_Maintenance_TrxTypeCode() {
		return Transactions_Maintenance_TrxTypeCode;
	}
	// table[@id='gridtab_trx_type_D001MT']//td[text()='6']

	@FindBy(xpath = "//a[text()='Transactions / Maintenance']")
	private WebElement TrxMaintance;

	public WebElement TrxMaintance() {
		return TrxMaintance;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_BranchCode;

	public WebElement Transactions_Maintenance_BranchCode() {
		return Transactions_Maintenance_BranchCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_Maintenance_CurrencyCode;

	public WebElement Transactions_Maintenance_CurrencyCode() {
		return Transactions_Maintenance_CurrencyCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_GlCode;

	public WebElement Transactions_Maintenance_GlCode() {
		return Transactions_Maintenance_GlCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CifCode;

	public WebElement Transactions_Maintenance_CifCode() {
		return Transactions_Maintenance_CifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_SerialNo;

	public WebElement Transactions_Maintenance_SerialNo() {
		return Transactions_Maintenance_SerialNo;
	}

	@FindBy(xpath = "//input[@id='ctrl_cy_D001MT']")
	private WebElement Transactions_Maintenance_TellerAcCurrencyCode;

	public WebElement Transactions_Maintenance_TellerAcCurrencyCode() {
		return Transactions_Maintenance_TellerAcCurrencyCode;
	}

	@FindBy(xpath = "//input[@id='ctrl_gl_D001MT']")
	private WebElement Transactions_Maintenance_TellerAcGlCode;

	public WebElement Transactions_Maintenance_TellerAcGlCode() {
		return Transactions_Maintenance_TellerAcGlCode;
	}

	@FindBy(xpath = "//input[@id='ctrl_cif_D001MT']")
	private WebElement Transactions_Maintenance_TellerAcCifCode;

	public WebElement Transactions_Maintenance_TellerAcCifCode() {
		return Transactions_Maintenance_TellerAcCifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_ctrl_sl_D001MT']")
	private WebElement Transactions_Maintenance_TellerAcSerialNo;

	public WebElement Transactions_Maintenance_TellerAcSerialNo() {
		return Transactions_Maintenance_TellerAcSerialNo;
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

	@FindBy(xpath = "//span[text()='View Memo']")
	private WebElement ViewMomo_PopUp;

	public WebElement ViewMomo_PopUp() {
		return ViewMomo_PopUp;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ViewMomo_PopUp_Close;

	public WebElement ViewMomo_PopUp_Close() {
		return ViewMomo_PopUp_Close;
	}

//											@FindBy(xpath = "//div[text()='WARNING']/parent::div/following-sibling::div/div")
//											private WebElement WarningMessage;
//											public WebElement WarningMessage( {
//												return WarningMessage;
//											}
	//
//											@FindBy(xpath = "(//input[@value='Ok'])[2]")
//											private WebElement WarningMessagePopupOk;
//											public WebElement WarningMessagePopupOk( {
//												return WarningMessagePopupOk;
//											}
	//
	//
	//
//											@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//span[@role='button'])[1]")
//											private WebElement CreditAccountSearchIcon;
//											public WebElement CreditAccountSearchIcon( {
//												return CreditAccountSearchIcon;
//											}
	//
//											@FindBy(xpath = "//div[text()='Access Denied']/parent::div/following-sibling::div/div")
//											private WebElement AccessDeniedPopup;
//											public WebElement AccessDeniedPopup( {
//												return AccessDeniedPopup;
//											}
	//
//											@FindBy(xpath = "(//input[@value='Ok'])[2]")
//											private WebElement AccessDeniedPopupOk;
//											public WebElement AccessDeniedPopupOk( {
//												return AccessDeniedPopupOk;
//											}

//											@FindBy(xpath = "//label[text()='Log Out ']")
//											private WebElement LogoutButton;
//											public WebElement LogoutButton() {
//												return LogoutButton;
//											}

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
	// table[@id='gridtab_trs_cy_D001MT']//td[text()='840']

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_Maintenance_Amount;

	public WebElement Transactions_Maintenance_Amount() {
		return Transactions_Maintenance_Amount;
	}

	@FindBy(xpath = "//input[@id='value_date_D001MT']")
	private WebElement Transactions_Maintenance_StartingDate;

	public WebElement Transactions_Maintenance_StartingDate() {
		return Transactions_Maintenance_StartingDate;
	}
	
	@FindBy(xpath = "//input[@id='value_date_D001MT']")
	private WebElement Transactions_Maintenance_startingDate;

	public WebElement Transactions_Maintenance_startingDate() {
		return Transactions_Maintenance_startingDate;
	}
	
	@FindBy(xpath = "//input[@id='release_date_D001MT']")
	private WebElement Transactions_Maintenance_EndingDate;

	public WebElement Transactions_Maintenance_EndingDate() {
		return Transactions_Maintenance_EndingDate;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement Transactions_Maintenance_ChequeNo;

	public WebElement Transactions_Maintenance_ChequeNo() {
		return Transactions_Maintenance_ChequeNo;
	}

	@FindBy(xpath = "//input[@id='chq_date_D001MT']")
	private WebElement Transactions_Maintenance_ChequeDate;

	public WebElement Transactions_Maintenance_ChequeDate() {
		return Transactions_Maintenance_ChequeDate;
	}

	@FindBy(xpath = "//div[text()='WARNING']")
	private WebElement Transaction_AmountExceeds_Warning;

	public WebElement Transaction_AmountExceeds_Warning() {
		return Transaction_AmountExceeds_Warning;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement Transactions_Maintenance_SaveBtn;

	public WebElement Transactions_Maintenance_SaveBtn() {
		return Transactions_Maintenance_SaveBtn;
	}

	@FindBy(xpath = "//td[text()='Multi Cheques Entry']")
	private WebElement Transactions_MultiChequeEntry;

	public WebElement Transactions_MultiChequeEntry() {
		return Transactions_MultiChequeEntry;
	}

	@FindBy(xpath = "//a[@id='D001CEMT']//span[text()='Maintenance']")
	private WebElement Transactions_MultiChequeEntry_Maintenance;

	public WebElement Transactions_MultiChequeEntry_Maintenance() {
		return Transactions_MultiChequeEntry_Maintenance;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_TrxType;

	public WebElement Transactions_MultiChequeEntry_Maintenance_TrxType() {
		return Transactions_MultiChequeEntry_Maintenance_TrxType;
	}

	@FindBy(xpath = "//input[@id='referenceNumber_D001CEP']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_ReferenceNumber;

	public WebElement Transactions_MultiChequeEntry_Maintenance_ReferenceNumber() {
		return Transactions_MultiChequeEntry_Maintenance_ReferenceNumber;
	}

	@FindBy(xpath = "//input[@id='totalNumberOfCheques_D001CEP']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_TotalNumberofCheques;

	public WebElement Transactions_MultiChequeEntry_Maintenance_TotalNumberofCheques() {
		return Transactions_MultiChequeEntry_Maintenance_TotalNumberofCheques;
	}

	@FindBy(xpath = "//input[@id='sumOfCheques_D001CEP']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_SumofCheques;

	public WebElement Transactions_MultiChequeEntry_Maintenance_SumofCheques() {
		return Transactions_MultiChequeEntry_Maintenance_SumofCheques;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitBranchCode;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitBranchCode() {
		return Transactions_MultiChequeEntry_Maintenance_DebitBranchCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitCurrencyCode;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitCurrencyCode() {
		return Transactions_MultiChequeEntry_Maintenance_DebitCurrencyCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitGlCode;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitGlCode() {
		return Transactions_MultiChequeEntry_Maintenance_DebitGlCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitCifCode;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitCifCode() {
		return Transactions_MultiChequeEntry_Maintenance_DebitCifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_DebitSerialNo;

	public WebElement Transactions_MultiChequeEntry_Maintenance_DebitSerialNo() {
		return Transactions_MultiChequeEntry_Maintenance_DebitSerialNo;
	}

	@FindBy(xpath = "//td[@id='add_mutliChequesEntryGridTbl_Id_D001CEMT']//span")
	private WebElement Transactions_MultiChequeEntry_Maintenance_ChequeAddicon;

	public WebElement Transactions_MultiChequeEntry_Maintenance_ChequeAddicon() {
		return Transactions_MultiChequeEntry_Maintenance_ChequeAddicon;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_Currency;

	public WebElement Transactions_MultiChequeEntry_Maintenance_Currency() {
		return Transactions_MultiChequeEntry_Maintenance_Currency;
	}

	@FindBy(xpath = "//input[@id='amount_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_Amount;

	public WebElement Transactions_MultiChequeEntry_Maintenance_Amount() {
		return Transactions_MultiChequeEntry_Maintenance_Amount;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditBranchCode;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditBranchCode() {
		return Transactions_MultiChequeEntry_Maintenance_CreditBranchCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditCurrencyCode;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditCurrencyCode() {
		return Transactions_MultiChequeEntry_Maintenance_CreditCurrencyCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditGlCode;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditGlCode() {
		return Transactions_MultiChequeEntry_Maintenance_CreditGlCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditCifCode;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditCifCode() {
		return Transactions_MultiChequeEntry_Maintenance_CreditCifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_CreditSerialNo;

	public WebElement Transactions_MultiChequeEntry_Maintenance_CreditSerialNo() {
		return Transactions_MultiChequeEntry_Maintenance_CreditSerialNo;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001CEMT']")
	private WebElement Transactions_MultiChequeEntry_Maintenance_ChequeNo;

	public WebElement Transactions_MultiChequeEntry_Maintenance_ChequeNo() {
		return Transactions_MultiChequeEntry_Maintenance_ChequeNo;
	}

	@FindBy(xpath = "(//span[contains(text(),' Save ')])[1]")
	private WebElement Transactions_MultiChequeEntry_Maintenance_SaveBtn;

	public WebElement Transactions_MultiChequeEntry_Maintenance_SaveBtn() {
		return Transactions_MultiChequeEntry_Maintenance_SaveBtn;
	}

	@FindBy(xpath = "(//span[contains(text(),' Proceed ')])[1]")
	private WebElement Transactions_MultiChequeEntry_Maintenance_ProceedBtn;

	public WebElement Transactions_MultiChequeEntry_Maintenance_ProceedBtn() {
		return Transactions_MultiChequeEntry_Maintenance_ProceedBtn;
	}

	@FindBy(xpath = "//a[@id='D001CEP']//span[text()='Approve']")
	private WebElement Transactions_MultiChequeEntry_Approve;

	public WebElement Transactions_MultiChequeEntry_Approve() {
		return Transactions_MultiChequeEntry_Approve;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEP']")
	private WebElement Transactions_MultiChequeEntry_Approve_TransactionType;

	public WebElement Transactions_MultiChequeEntry_Approve_TransactionType() {
		return Transactions_MultiChequeEntry_Approve_TransactionType;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001CEP']")
	private WebElement Transactions_MultiChequeEntry_Approve_BranchCode;

	public WebElement Transactions_MultiChequeEntry_Approve_BranchCode() {
		return Transactions_MultiChequeEntry_Approve_BranchCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001CEP']")
	private WebElement Transactions_MultiChequeEntry_Approve_CurrencyCode;

	public WebElement Transactions_MultiChequeEntry_Approve_CurrencyCode() {
		return Transactions_MultiChequeEntry_Approve_CurrencyCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001CEP']")
	private WebElement Transactions_MultiChequeEntry_Approve_GlCode;

	public WebElement Transactions_MultiChequeEntry_Approve_GlCode() {
		return Transactions_MultiChequeEntry_Approve_GlCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001CEP']")
	private WebElement Transactions_MultiChequeEntry_Approve_CifCode;

	public WebElement Transactions_MultiChequeEntry_Approve_CifCode() {
		return Transactions_MultiChequeEntry_Approve_CifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001CEP']")
	private WebElement Transactions_MultiChequeEntry_Approve_SerialNo;

	public WebElement Transactions_MultiChequeEntry_Approve_SerialNo() {
		return Transactions_MultiChequeEntry_Approve_SerialNo;
	}

	@FindBy(xpath = "(//div[@id='gbox_mutliChequesEntryGridTbl_Id_D001CEP']//table)[1]//input")
	private WebElement Transactions_MultiChequeEntry_Approve_ChequeSelect;

	public WebElement Transactions_MultiChequeEntry_Approve_ChequeSelect() {
		return Transactions_MultiChequeEntry_Approve_ChequeSelect;
	}

	@FindBy(xpath = "(//span[contains(text(),' Approve ')])[1]")
	private WebElement Transactions_MultiChequeEntry_Maintenance_ApproveBtn;

	public WebElement Transactions_MultiChequeEntry_Maintenance_ApproveBtn() {
		return Transactions_MultiChequeEntry_Maintenance_ApproveBtn;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement Transactions_CannotProceedPopUp;

	public WebElement Transactions_CannotProceedPopUp() {
		return Transactions_CannotProceedPopUp;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber;

	public WebElement getTransactionNumber() {
		return getTransactionNumber;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Transactions_Approve;

	public WebElement Transactions_Approve() {
		return Transactions_Approve;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Approve_Code;

	public WebElement Transactions_Approve_Code() {
		return Transactions_Approve_Code;
	}
	// table[@id='trxMgntGridTbl_Id_D001AU']//td[text()='9519']

	@FindBy(xpath = "//input[@id='amount_D001AU']")
	private WebElement Transactions_Approve_Amount;

	public WebElement Transactions_Approve_Amount() {
		return Transactions_Approve_Amount;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement Transactions_Approve_ApproveBtn;

	public WebElement Transactions_Approve_ApproveBtn() {
		return Transactions_Approve_ApproveBtn;
	}

	@FindBy(xpath = "//span[text()='Apply to Clear Inward Cheques']")
	private WebElement Transactions_ApplyClearInwardCheques;

	public WebElement Transactions_ApplyClearInwardCheques() {
		return Transactions_ApplyClearInwardCheques;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AC_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApplyClearInwardCheques_Code;

	public WebElement Transactions_ApplyClearInwardCheques_Code() {
		return Transactions_ApplyClearInwardCheques_Code;
	}
	// table[@id='trxMgntGridTbl_Id_D001AC']//td[text()='9810']

	@FindBy(xpath = "//span[contains(text(),' Apply Clearing Inward Cheque ')]")
	private WebElement Transactions_ClearingInwardCheques_ApplyBtn;

	public WebElement Transactions_ClearingInwardCheques_ApplyBtn() {
		return Transactions_ClearingInwardCheques_ApplyBtn;
	}

	@FindBy(xpath = "//span[text()='Clearing Inward Cheques']")
	private WebElement Transactions_ClearingInwardCheques;

	public WebElement Transactions_ClearingInwardCheques() {
		return Transactions_ClearingInwardCheques;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001E_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ClearingInwardCheques_Code;

	public WebElement Transactions_ClearingInwardCheques_Code() {
		return Transactions_ClearingInwardCheques_Code;
	}
	// table[@id='trxMgntGridTbl_Id_D001E']//td[text()='9810']

	@FindBy(xpath = "//span[contains(text(),' Clear Inward Cheque ')]")
	private WebElement Transactions_ClearingInwardCheques_ClearBtn;

	public WebElement Transactions_ClearingInwardCheques_ClearBtn() {
		return Transactions_ClearingInwardCheques_ClearBtn;
	}

	@FindBy(xpath = "//span[text()='Reverse']")
	private WebElement Transactions_Reverse;

	public WebElement Transactions_Reverse() {
		return Transactions_Reverse;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001WV_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Reverse_Code;

	public WebElement Transactions_Reverse_Code() {
		return Transactions_Reverse_Code;
	}
	// table[@id='trxMgntGridTbl_Id_D001WV']//td[text()='9514']

	@FindBy(xpath = "//select[@id='holdReason_D001WV']")
	private WebElement Transactions_Reverse_Reason;

	public WebElement Transactions_Reverse_Reason() {
		return Transactions_Reverse_Reason;
	}
	// vip reverse

	@FindBy(xpath = "//span[contains(text(),' To Reverse ')]")
	private WebElement Transactions_Reverse_ToReverseBtn;

	public WebElement Transactions_Reverse_ToReverseBtn() {
		return Transactions_Reverse_ToReverseBtn;
	}

	@FindBy(xpath = "//span[text()='Approve Reverse']")
	private WebElement Transactions_ApproveReverse;

	public WebElement Transactions_ApproveReverse() {
		return Transactions_ApproveReverse;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RV_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApproveReverse_Code;

	public WebElement Transactions_ApproveReverse_Code() {
		return Transactions_ApproveReverse_Code;
	}
	// table[@id='trxMgntGridTbl_Id_D001RV']//td[text()='9507']

	@FindBy(xpath = "//span[contains(text(),' Reverse ')]")
	private WebElement Transactions_ApproveReverse_Reverse;

	public WebElement Transactions_ApproveReverse_Reverse() {
		return Transactions_ApproveReverse_Reverse;
	}

	/// *** Accounts ***///

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement Accounts;

	public WebElement Accounts() {
		return Accounts;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement Accounts_GeneralAccounts;

	public WebElement Accounts_GeneralAccounts() {
		return Accounts_GeneralAccounts;
	}

	@FindBy(xpath = "//a[@id='A002MA']/span[text()='Maintenance']")
	private WebElement Accounts_GeneralAccounts_Maintenance;

	public WebElement Accounts_GeneralAccounts_Maintenance() {
		return Accounts_GeneralAccounts_Maintenance;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Maintenance_CifCodeGrid;

	public WebElement Accounts_GeneralAccounts_Maintenance_CifCodeGrid() {
		return Accounts_GeneralAccounts_Maintenance_CifCodeGrid;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_SearchBtn;

	public WebElement Accounts_GeneralAccounts_Maintenance_SearchBtn() {
		return Accounts_GeneralAccounts_Maintenance_SearchBtn;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.GL_CODE']")
	private WebElement Accounts_GeneralAccounts_Maintenance_GLCode;

	public WebElement Accounts_GeneralAccounts_Maintenance_GLCode() {
		return Accounts_GeneralAccounts_Maintenance_GLCode;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Maintenance_CifCode;

	public WebElement Accounts_GeneralAccounts_Maintenance_CifCode() {
		return Accounts_GeneralAccounts_Maintenance_CifCode;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.SL_NO']")
	private WebElement Accounts_GeneralAccounts_Maintenance_SerialNumber;

	public WebElement Accounts_GeneralAccounts_Maintenance_SerialNumber() {
		return Accounts_GeneralAccounts_Maintenance_SerialNumber;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.STATUS']")
	private WebElement Accounts_GeneralAccounts_Maintenance_RecordStatus;

	public WebElement Accounts_GeneralAccounts_Maintenance_RecordStatus() {
		return Accounts_GeneralAccounts_Maintenance_RecordStatus;
	}
	// table[@id='generalAccountsGridTbl_Id_A002MA']//td[text()='143002']

	@FindBy(xpath = "(//span[text()='Suspicious Blacklisted CIF'])[2]")
	private WebElement SuspiciousBlacklistedCIF_Popup;

	public WebElement SuspiciousBlacklistedCIF_Popup() {
		return SuspiciousBlacklistedCIF_Popup;
	}

	@FindBy(xpath = "(//span[text()='Suspicious Blacklisted CIF'])[2]//parent::div/a/span")
	private WebElement SuspiciousBlacklistedCIF_PopupClose;

	public WebElement SuspiciousBlacklistedCIF_PopupClose() {
		return SuspiciousBlacklistedCIF_PopupClose;
	}

	@FindBy(xpath = "//input[@id='breifName_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_BriefName;

	public WebElement Accounts_GeneralAccounts_Maintenance_BriefName() {
		return Accounts_GeneralAccounts_Maintenance_BriefName;
	}

	@FindBy(xpath = "//li[@id='accountsMailingDetailsTabs3_A002MA']/a/span[text()='Mailing details']")
	private WebElement Accounts_GeneralAccounts_Maintenance_MailingdetailsTab;

	public WebElement Accounts_GeneralAccounts_Maintenance_MailingdetailsTab() {
		return Accounts_GeneralAccounts_Maintenance_MailingdetailsTab;
	}

	@FindBy(xpath = "//textarea[@id='description_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_Mailingdetails_Description;

	public WebElement Accounts_GeneralAccounts_Maintenance_Mailingdetails_Description() {
		return Accounts_GeneralAccounts_Maintenance_Mailingdetails_Description;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MA_Update_key']")
	private WebElement Accounts_GeneralAccounts_Maintenance_Update;

	public WebElement Accounts_GeneralAccounts_Maintenance_Update() {
		return Accounts_GeneralAccounts_Maintenance_Update;
	}

	@FindBy(xpath = "//a[@id='A002AU']//span[text()='Authorize']")
	private WebElement Accounts_GeneralAccounts_Authorize;

	public WebElement Accounts_GeneralAccounts_Authorize() {
		return Accounts_GeneralAccounts_Authorize;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.GL_CODE']")
	private WebElement Accounts_GeneralAccounts_Authorize_GlCode;

	public WebElement Accounts_GeneralAccounts_Authorize_GlCode() {
		return Accounts_GeneralAccounts_Authorize_GlCode;
	}
	// table[@id='generalAccountsGridTbl_Id_A002AU']//td[text()='143002']

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement Accounts_GeneralAccounts_Authorize_AuthorizeBtn;

	public WebElement Accounts_GeneralAccounts_Authorize_AuthorizeBtn() {
		return Accounts_GeneralAccounts_Authorize_AuthorizeBtn;
	}

	/// *** Chequebook Request ***///

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement ChequebookRequest;

	public WebElement ChequebookRequest() {
		return ChequebookRequest;
	}

	@FindBy(xpath = "//a[@id='Q000MT']/span[text()='Maintenance']")
	private WebElement ChequebookRequest_Maintenance;

	public WebElement ChequebookRequest_Maintenance() {
		return ChequebookRequest_Maintenance;
	}

	@FindBy(xpath = "//span[@id='spanLookup_CHEQUE_CODE_Q000MT']/span")
	private WebElement ChequebookRequest_Maintenance_ChequeCodeSearch;

	public WebElement ChequebookRequest_Maintenance_ChequeCodeSearch() {
		return ChequebookRequest_Maintenance_ChequeCodeSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_CHEQUE_CODE_Q000MT_gs_CODE']")
	private WebElement ChequebookRequest_Maintenance_ChequeCode;

	public WebElement ChequebookRequest_Maintenance_ChequeCode() {
		return ChequebookRequest_Maintenance_ChequeCode;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_NumberofChequeBooks;

	public WebElement ChequebookRequest_Maintenance_NumberofChequeBooks() {
		return ChequebookRequest_Maintenance_NumberofChequeBooks;
	}

	@FindBy(xpath = "//span[@id='spanLookup_leaves_code_Q000MT']/span")
	private WebElement ChequebookRequest_Maintenance_LeavesSearch;

	public WebElement ChequebookRequest_Maintenance_LeavesSearch() {
		return ChequebookRequest_Maintenance_LeavesSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_leaves_code_Q000MT_gs_CODE']")
	private WebElement ChequebookRequest_Maintenance_LeavesCode;

	public WebElement ChequebookRequest_Maintenance_LeavesCode() {
		return ChequebookRequest_Maintenance_LeavesCode;
	}
	// table[@id='gridtab_leaves_code_Q000MT']//td[text()='100']

	@FindBy(xpath = "//span[@id='spanLookup_types_code_Q000MT']/span")
	private WebElement ChequebookRequest_Maintenance_TypesSearch;

	public WebElement ChequebookRequest_Maintenance_TypesSearch() {
		return ChequebookRequest_Maintenance_TypesSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_types_code_Q000MT_gs_CODE']")
	private WebElement ChequebookRequest_Maintenance_TypesCode;

	public WebElement ChequebookRequest_Maintenance_TypesCode() {
		return ChequebookRequest_Maintenance_TypesCode;
	}
	// table[@id='gridtab_types_code_Q000MT']//td[text()='100']

	@FindBy(xpath = "//span[@id='spanLookup_acc_sl_Q000MT']/span")
	private WebElement ChequebookRequest_Maintenance_AccountNumberSearch;

	public WebElement ChequebookRequest_Maintenance_AccountNumberSearch() {
		return ChequebookRequest_Maintenance_AccountNumberSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.CURRENCY_CODE']]")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_Currency1;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_Currency1() {
		return ChequebookRequest_Maintenance_AccountNumber_Currency1;
	}
	// (//table[@id='gridtab_acc_sl_Q000MT']//td[text()='048'])[1]

	@FindBy(xpath = "//span[text()='Additional A/C']")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccountsDD;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccountsDD() {
		return ChequebookRequest_Maintenance_AdditionalAccountsDD;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_BranchCode;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_BranchCode() {
		return ChequebookRequest_Maintenance_AccountNumber_BranchCode;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_Currency;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_Currency() {
		return ChequebookRequest_Maintenance_AccountNumber_Currency;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_GL;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_GL() {
		return ChequebookRequest_Maintenance_AccountNumber_GL;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_Cif;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_Cif() {
		return ChequebookRequest_Maintenance_AccountNumber_Cif;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_SerialNumber;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_SerialNumber() {
		return ChequebookRequest_Maintenance_AccountNumber_SerialNumber;
	}

	@FindBy(xpath = "//span[text()='Charges']")
	private WebElement ChequebookRequest_Maintenance_Charges;

	public WebElement ChequebookRequest_Maintenance_Charges() {
		return ChequebookRequest_Maintenance_Charges;
	}

	@FindBy(xpath = "//a[@id='dismissbut_Q000MT']/span")
	private WebElement ChequebookRequest_DismissPopUp;

	public WebElement ChequebookRequest_DismissPopUp() {
		return ChequebookRequest_DismissPopUp;
	}

	@FindBy(xpath = "//td[@id='add_chqBkAddAccGridTbl_Id_Q000MT']/div/span")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_Addicon;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_Addicon() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_Addicon;
	}

//											@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[6]//div//span/span")
//											private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SiNosearch;
//											public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SiNosearch() {
//												return ChequebookRequest_Maintenance_AdditionalAccounts_SiNosearch;
//											}

	@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[2]//input")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_BranchCode;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_BranchCode() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_BranchCode;
	}

	@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[3]//input")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_Currency;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_Currency() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_Currency;
	}

	@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[4]//input")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_GL;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_GL() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_GL;
	}

	@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[6]//input")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SerialNumber;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SerialNumber() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_SerialNumber;
	}

	@FindBy(xpath = "//input[@id='chqbook_name_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_NametobePrinted;

	public WebElement ChequebookRequest_Maintenance_NametobePrinted() {
		return ChequebookRequest_Maintenance_NametobePrinted;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement ChequebookRequest_Maintenance_SaveBtn;

	public WebElement ChequebookRequest_Maintenance_SaveBtn() {
		return ChequebookRequest_Maintenance_SaveBtn;
	}

	@FindBy(xpath = "//a[@id='Q000AP']/span[text()='Approve']")
	private WebElement ChequebookRequest_Approve;

	public WebElement ChequebookRequest_Approve() {
		return ChequebookRequest_Approve;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement ChequebookRequest_Approve_ChequeCode;

	public WebElement ChequebookRequest_Approve_ChequeCode() {
		return ChequebookRequest_Approve_ChequeCode;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000AP_Approve_key']")
	private WebElement ChequebookRequest_Approve_ApproveBtn609;

	public WebElement ChequebookRequest_Approve_ApproveBtn609() {
		return ChequebookRequest_Approve_ApproveBtn609;
	}

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000MT_0_ctsChargesEntityVO.AMOUNT'])[1]")
	private WebElement ChequebookRequest_Maintenance_TotalAmount;

	public WebElement ChequebookRequest_Maintenance_TotalAmount() {
		return ChequebookRequest_Maintenance_TotalAmount;
	}

	@FindBy(xpath = "(//div[@id='jqgh_chargesGridId_Q000MT_vatCtsChargesEntityVO.AMOUNT'])[1]")
	private WebElement ChequebookRequest_Maintenance_Vat;

	public WebElement ChequebookRequest_Maintenance_Vat() {
		return ChequebookRequest_Maintenance_Vat;
	}

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000MT_0_ctsChargesEntityVO.AMOUNT'])[1]")
	private WebElement ChequebookRequest_Maintenance_CV;

	public WebElement ChequebookRequest_Maintenance_CV() {
		return ChequebookRequest_Maintenance_CV;
	}

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000MT_0_ctsChargesEntityVO.AMOUNT_FC'])[1]")
	private WebElement ChequebookRequest_Maintenance_FC;

	public WebElement ChequebookRequest_Maintenance_FC() {
		return ChequebookRequest_Maintenance_FC;
	}

	/// *** Transaction ***///

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
	private WebElement TransactionNo;

	public WebElement TransactionNo() {
		return TransactionNo;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_Maintenance_SearchBtn;

	public WebElement Transactions_Maintenance_SearchBtn() {
		return Transactions_Maintenance_SearchBtn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Maintenance_TransactionNumber;

	public WebElement Transactions_Maintenance_TransactionNumber() {
		return Transactions_Maintenance_TransactionNumber;
	}
	// table[@id='trxMgntGridTbl_Id_D001MT']//td[text()='9581']

	@FindBy(xpath = "//input[@id='avail_bal_D001MT']")
	private WebElement Transactions_Maintenance_Balance;

	public WebElement Transactions_Maintenance_Balance() {
		return Transactions_Maintenance_Balance;
	}

	@FindBy(xpath = "//td[text()='Queries']")
	private WebElement Queries;

	public WebElement Queries() {
		return Queries;
	}

	@FindBy(xpath = "//td[text()='Statement Of Accounts']")
	private WebElement Queries_StatementofAccounts;

	public WebElement Queries_StatementofAccounts() {
		return Queries_StatementofAccounts;
	}

	@FindBy(xpath = "//a[@id='QUER001V']/span[text()='By Value Date']")
	private WebElement Queries_StatementofAccounts_ByValueDate;

	public WebElement Queries_StatementofAccounts_ByValueDate() {
		return Queries_StatementofAccounts_ByValueDate;
	}

	@FindBy(xpath = "//input[@id='accCy_QUER001V']")
	private WebElement Queries_StatementofAccounts_Currency;

	public WebElement Queries_StatementofAccounts_Currency() {
		return Queries_StatementofAccounts_Currency;
	}

	@FindBy(xpath = "//input[@id='accGl_QUER001V']")
	private WebElement Queries_StatementofAccounts_GL;

	public WebElement Queries_StatementofAccounts_GL() {
		return Queries_StatementofAccounts_GL;
	}

	@FindBy(xpath = "//input[@id='accCif_QUER001V']")
	private WebElement Queries_StatementofAccounts_Cif;

	public WebElement Queries_StatementofAccounts_Cif() {
		return Queries_StatementofAccounts_Cif;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_accSl_QUER001V']")
	private WebElement Queries_StatementofAccounts_SerialNumber;

	public WebElement Queries_StatementofAccounts_SerialNumber() {
		return Queries_StatementofAccounts_SerialNumber;
	}

	@FindBy(xpath = "//label[@id='statementOfAccountsForm_QUER001V_Retrieve_key']")
	private WebElement Queries_StatementofAccounts_Retrieve;

	public WebElement Queries_StatementofAccounts_Retrieve() {
		return Queries_StatementofAccounts_Retrieve;
	}

	@FindBy(xpath = "//input[@id='balValDt_QUER001V']")
	private WebElement Queries_StatementofAccounts_BalanceValue;

	public WebElement Queries_StatementofAccounts_BalanceValue() {
		return Queries_StatementofAccounts_BalanceValue;
	}

	/// *** Accounts --> General Accounts ***///

	@FindBy(xpath = "//a[@id='A002ACT']/span[text()='Authorize Close With Transfer']")
	private WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer;

	public WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer() {
		return Accounts_GeneralAccounts_AuthorizeCloseWithTransfer;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AC_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_CifCode;

	public WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_CifCode() {
		return Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_CifCode;
	}

	@FindBy(xpath = "//a[@id='A002CL']/span[text()='Close']")
	private WebElement Accounts_GeneralAccounts_Close;

	public WebElement Accounts_GeneralAccounts_Close() {
		return Accounts_GeneralAccounts_Close;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002CL_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Close_CifCode;

	public WebElement Accounts_GeneralAccounts_Close_CifCode() {
		return Accounts_GeneralAccounts_Close_CifCode;
	}

	@FindBy(xpath = "//a[@id='A002AC']/span[text()='Authorize Close']")
	private WebElement Accounts_GeneralAccounts_AuthorizeClose;

	public WebElement Accounts_GeneralAccounts_AuthorizeClose() {
		return Accounts_GeneralAccounts_AuthorizeClose;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AC_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_AuthorizeClose_CifCode;

	public WebElement Accounts_GeneralAccounts_AuthorizeClose_CifCode() {
		return Accounts_GeneralAccounts_AuthorizeClose_CifCode;
	}

	@FindBy(xpath = "//a[@id='A002CLT']/span[text()='Close With Transfer']")
	private WebElement Accounts_GeneralAccounts_CloseWithTransfer;

	public WebElement Accounts_GeneralAccounts_CloseWithTransfer() {
		return Accounts_GeneralAccounts_CloseWithTransfer;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002CLT_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_CloseWithTransfer_CifCode;

	public WebElement Accounts_GeneralAccounts_CloseWithTransfer_CifCode() {
		return Accounts_GeneralAccounts_CloseWithTransfer_CifCode;
	}

	@FindBy(xpath = "//a[@id='A002XJ']/span[text()='Reject']")
	private WebElement Accounts_GeneralAccounts_Reject;

	public WebElement Accounts_GeneralAccounts_Reject() {
		return Accounts_GeneralAccounts_Reject;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002XJ_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Reject_CifCode;

	public WebElement Accounts_GeneralAccounts_Reject_CifCode() {
		return Accounts_GeneralAccounts_Reject_CifCode;
	}

	@FindBy(xpath = "//a[@id='A002PR']/span[text()='Print']")
	private WebElement Accounts_GeneralAccounts_Print;

	public WebElement Accounts_GeneralAccounts_Print() {
		return Accounts_GeneralAccounts_Print;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002PR_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Print_CifCode;

	public WebElement Accounts_GeneralAccounts_Print_CifCode() {
		return Accounts_GeneralAccounts_Print_CifCode;
	}

	@FindBy(xpath = "//a[@id='A002MT']/span[text()='Opening']")
	private WebElement Accounts_GeneralAccounts_Opening;

	public WebElement Accounts_GeneralAccounts_Opening() {
		return Accounts_GeneralAccounts_Opening;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A002MT']")
	private WebElement Accounts_GeneralAccounts_Opening_Currency;

	public WebElement Accounts_GeneralAccounts_Opening_Currency() {
		return Accounts_GeneralAccounts_Opening_Currency;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_glType_A002MT']")
	private WebElement Accounts_GeneralAccounts_Opening_GL;

	public WebElement Accounts_GeneralAccounts_Opening_GL() {
		return Accounts_GeneralAccounts_Opening_GL;
	}

	@FindBy(xpath = "//span[@id='spanLookup_cifNo_A002MT']/span")
	private WebElement Accounts_GeneralAccounts_Opening_CifSearch;

	public WebElement Accounts_GeneralAccounts_Opening_CifSearch() {
		return Accounts_GeneralAccounts_Opening_CifSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_cifNo_A002MT_gs_CIF_NO']")
	private WebElement Accounts_GeneralAccounts_Opening_Cif;

	public WebElement Accounts_GeneralAccounts_Opening_Cif() {
		return Accounts_GeneralAccounts_Opening_Cif;
	}

	/// *** Recording of Remittance ---> Maintenance ***///

	@FindBy(xpath = "//td[text()='Recording of Remittance']")
	private WebElement RecordingofRemittance;

	public WebElement RecordingofRemittance() {
		return RecordingofRemittance;
	}

	@FindBy(xpath = "//a[@id='RRTMT']//span[text()='Maintenance']")
	private WebElement RecordingofRemittance_Maintenance;

	public WebElement RecordingofRemittance_Maintenance() {
		return RecordingofRemittance_Maintenance;
	}

	@FindBy(xpath = "//span[@id='spanLookup_vaultLookup_RRTMT']/span")
	private WebElement RecordingofRemittance_Maintenance_VaultNoSearch;

	public WebElement RecordingofRemittance_Maintenance_VaultNoSearch() {
		return RecordingofRemittance_Maintenance_VaultNoSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_vaultLookup_RRTMT_gs_CODE']")
	private WebElement RecordingofRemittance_Maintenance_VaultCode;

	public WebElement RecordingofRemittance_Maintenance_VaultCode() {
		return RecordingofRemittance_Maintenance_VaultCode;
	}

	@FindBy(xpath = "//select[@id='REMITT_TYPE_RRTMT']")
	private WebElement RecordingofRemittance_Maintenance_RemittanceType;

	public WebElement RecordingofRemittance_Maintenance_RemittanceType() {
		return RecordingofRemittance_Maintenance_RemittanceType;
	}
	// Certificate of Deposit

	@FindBy(xpath = "//span[@id='spanLookup_remittanceTypeLookup_RRTMT']/span")
	private WebElement RecordingofRemittance_Maintenance_CDTypeSearch;

	public WebElement RecordingofRemittance_Maintenance_CDTypeSearch() {
		return RecordingofRemittance_Maintenance_CDTypeSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_remittanceTypeLookup_RRTMT_gs_CODE']")
	private WebElement RecordingofRemittance_Maintenance_CDTypeCode;

	public WebElement RecordingofRemittance_Maintenance_CDTypeCode() {
		return RecordingofRemittance_Maintenance_CDTypeCode;
	}
	// table[@id='gridtab_remittanceTypeLookup_RRTMT']//td[text()='12']

	@FindBy(xpath = "//span[@id='spanLookup_currencyLookup_RRTMT']/span")
	private WebElement RecordingofRemittance_Maintenance_CurrencySearch;

	public WebElement RecordingofRemittance_Maintenance_CurrencySearch() {
		return RecordingofRemittance_Maintenance_CurrencySearch;
	}

	@FindBy(xpath = "//input[@id='SEQUENCE_FR_RRTMT']")
	private WebElement RecordingofRemittance_Maintenance_SequenceFrom;

	public WebElement RecordingofRemittance_Maintenance_SequenceFrom() {
		return RecordingofRemittance_Maintenance_SequenceFrom;
	}

	@FindBy(xpath = "//input[@id='gridtab_currencyLookup_RRTMT_gs_CURRENCY_CODE']")
	private WebElement RecordingofRemittance_Maintenance_CurrencyCode;

	public WebElement RecordingofRemittance_Maintenance_CurrencyCode() {
		return RecordingofRemittance_Maintenance_CurrencyCode;
	}
	// table[@id='gridtab_currencyLookup_RRTMT']//td[text()='840']

	@FindBy(xpath = "//input[@id='AMOUNT_RRTMT']")
	private WebElement RecordingofRemittance_Maintenance_TotalAmount;

	public WebElement RecordingofRemittance_Maintenance_TotalAmount() {
		return RecordingofRemittance_Maintenance_TotalAmount;
	}

	@FindBy(xpath = "//td[@id='add_recordOfRemittanceDenomGridTbl_Id_RRTMT']/div/span")
	private WebElement RecordingofRemittance_Maintenance_Denomination_AddIcon;

	public WebElement RecordingofRemittance_Maintenance_Denomination_AddIcon() {
		return RecordingofRemittance_Maintenance_Denomination_AddIcon;
	}
	// table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[1]

	@FindBy(xpath = "//td[@id='del_recordOfRemittanceDenomGridTbl_Id_RRTMT']/div/span")
	private WebElement RecordingofRemittance_Maintenance_Denomination_DeleteIcon;

	public WebElement RecordingofRemittance_Maintenance_Denomination_DeleteIcon() {
		return RecordingofRemittance_Maintenance_Denomination_DeleteIcon;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[2]/input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_Serial;

	public WebElement RecordingofRemittance_Maintenance_Denomination_Serial() {
		return RecordingofRemittance_Maintenance_Denomination_Serial;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[3]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber;

	public WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber() {
		return RecordingofRemittance_Maintenance_Denomination_FromNumber;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[4]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_ToNumber;

	public WebElement RecordingofRemittance_Maintenance_Denomination_ToNumber() {
		return RecordingofRemittance_Maintenance_Denomination_ToNumber;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[5]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_Quantity;

	public WebElement RecordingofRemittance_Maintenance_Denomination_Quantity() {
		return RecordingofRemittance_Maintenance_Denomination_Quantity;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[6]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_Value;

	public WebElement RecordingofRemittance_Maintenance_Denomination_Value() {
		return RecordingofRemittance_Maintenance_Denomination_Value;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTMT_btn_save']")
	private WebElement RecordingofRemittance_Maintenance_SaveBtn;

	public WebElement RecordingofRemittance_Maintenance_SaveBtn() {
		return RecordingofRemittance_Maintenance_SaveBtn;
	}

	@FindBy(xpath = "//span[text()='Send Alert']//parent::div//span[text()='close']")
	private WebElement SendAlert_Close;

	public WebElement SendAlert_Close() {
		return SendAlert_Close;
	}

	/// *** Recording of Remittance ---> Approve ***///

	@FindBy(xpath = "//a[@id='RRTP']//span[text()='Approve']")
	private WebElement RecordingofRemittance_Approve;

	public WebElement RecordingofRemittance_Approve() {
		return RecordingofRemittance_Approve;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE']")
	private WebElement RecordingofRemittance_Approve_RemittanceType;

	public WebElement RecordingofRemittance_Approve_RemittanceType() {
		return RecordingofRemittance_Approve_RemittanceType;
	}
	// table[@id='recordOfRemittanceMaintGridTbl_Id_RRTP']//td[text()='12']

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_RECEIVED_DATE']")
	private WebElement RecordingofRemittance_Approve_ReceivedDate;

	public WebElement RecordingofRemittance_Approve_ReceivedDate() {
		return RecordingofRemittance_Approve_ReceivedDate;
	}

	@FindBy(xpath = "//input[@id='TRS_NO_RRTP']")
	private WebElement RecordingofRemittance_Approve_TransactionNoDenisk;

	public WebElement RecordingofRemittance_Approve_TransactionNoDenisk() {
		return RecordingofRemittance_Approve_TransactionNoDenisk;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTP_Approve_key']")
	private WebElement RecordingofRemittance_Approve_ApproveBtn;

	public WebElement RecordingofRemittance_Approve_ApproveBtn() {
		return RecordingofRemittance_Approve_ApproveBtn;
	}

	/// *** Recording of Remittance ---> To Be Cancelled ***///

	@FindBy(xpath = "//a[@id='RRTTC']//span[text()='To Be Cancelled']")
	private WebElement RecordingofRemittance_ToBeCancelled;

	public WebElement RecordingofRemittance_ToBeCancelled() {
		return RecordingofRemittance_ToBeCancelled;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_RRTTC']")
	private WebElement RecordingofRemittance_ToBeCancelled_SearchButton;

	public WebElement RecordingofRemittance_ToBeCancelled_SearchButton() {
		return RecordingofRemittance_ToBeCancelled_SearchButton;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ToBeCancelled_TransactionNo;

	public WebElement RecordingofRemittance_ToBeCancelled_TransactionNo() {
		return RecordingofRemittance_ToBeCancelled_TransactionNo;
	}

	@FindBy(xpath = "//span[@id='spanLookup_vaultLookup_RRTTC']/span")
	private WebElement RecordingofRemittance_ToBeCancelled_VaultNoSearch;

	public WebElement RecordingofRemittance_ToBeCancelled_VaultNoSearch() {
		return RecordingofRemittance_ToBeCancelled_VaultNoSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_vaultLookup_RRTTC_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeCancelled_VaultCode;

	public WebElement RecordingofRemittance_ToBeCancelled_VaultCode() {
		return RecordingofRemittance_ToBeCancelled_VaultCode;
	}
	// table[@id='gridtab_vaultLookup_RRTTC']//td[text()='1001']

	@FindBy(xpath = "//select[@id='REMITT_TYPE_RRTTC']")
	private WebElement RecordingofRemittance_ToBeCancelled_RemittanceType;

	public WebElement RecordingofRemittance_ToBeCancelled_RemittanceType() {
		return RecordingofRemittance_ToBeCancelled_RemittanceType;
	}
	// Certificate of Deposit

	@FindBy(xpath = "//span[@id='spanLookup_remittanceTypeLookup_RRTTC']/span")
	private WebElement RecordingofRemittance_ToBeCancelled_CDTypeSearch;

	public WebElement RecordingofRemittance_ToBeCancelled_CDTypeSearch() {
		return RecordingofRemittance_ToBeCancelled_CDTypeSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_remittanceTypeLookup_RRTTC_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeCancelled_CDTypeCode;

	public WebElement RecordingofRemittance_ToBeCancelled_CDTypeCode() {
		return RecordingofRemittance_ToBeCancelled_CDTypeCode;
	}
	// table[@id='gridtab_remittanceTypeLookup_RRTTC']//td[text()='12']

	@FindBy(xpath = "//span[@id='spanLookup_currencyLookup_RRTTC']/span")
	private WebElement RecordingofRemittance_ToBeCancelled_CurrencySearch;

	public WebElement RecordingofRemittance_ToBeCancelled_CurrencySearch() {
		return RecordingofRemittance_ToBeCancelled_CurrencySearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_currencyLookup_RRTTC_gs_CURRENCY_CODE']")
	private WebElement RecordingofRemittance_ToBeCancelled_CurrencyCode;

	public WebElement RecordingofRemittance_ToBeCancelled_CurrencyCode() {
		return RecordingofRemittance_ToBeCancelled_CurrencyCode;
	}
	// table[@id='gridtab_currencyLookup_RRTTC']//td[text()='840']

	@FindBy(xpath = "//select[@id='REASON_RRTTC']")
	private WebElement RecordingofRemittance_ToBeCancelled_Reason;

	public WebElement RecordingofRemittance_ToBeCancelled_Reason() {
		return RecordingofRemittance_ToBeCancelled_Reason;
	}
	// rem cag

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTTC_To_Cancel_key']")
	private WebElement RecordingofRemittance_ToBeCancelled_ToCancelBtn;

	public WebElement RecordingofRemittance_ToBeCancelled_ToCancelBtn() {
		return RecordingofRemittance_ToBeCancelled_ToCancelBtn;
	}

	/// *** Recording of Remittance ---> Approve Cancel ***///

	@FindBy(xpath = "//a[@id='RRTN']//span[text()='Approve Cancel']")
	private WebElement RecordingofRemittance_ApproveCancel;

	public WebElement RecordingofRemittance_ApproveCancel() {
		return RecordingofRemittance_ApproveCancel;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ApproveCancel_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ApproveCancel_TransactionNoDenisk() {
		return RecordingofRemittance_ApproveCancel_TransactionNoDenisk;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_VAULT_NO']")
	private WebElement RecordingofRemittance_ApproveCancel_VaultNo;

	public WebElement RecordingofRemittance_ApproveCancel_VaultNo() {
		return RecordingofRemittance_ApproveCancel_VaultNo;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_REMITTANCE_TYPE']")
	private WebElement RecordingofRemittance_ApproveCancel_RemittanceType;

	public WebElement RecordingofRemittance_ApproveCancel_RemittanceType() {
		return RecordingofRemittance_ApproveCancel_RemittanceType;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_RECEIVED_DATE']")
	private WebElement RecordingofRemittance_ApproveCancel_ReceivedDate;

	public WebElement RecordingofRemittance_ApproveCancel_ReceivedDate() {
		return RecordingofRemittance_ApproveCancel_ReceivedDate;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTN_Cancel_key']")
	private WebElement RecordingofRemittance_ApproveCancel_CancelBtn;

	public WebElement RecordingofRemittance_ApproveCancel_CancelBtn() {
		return RecordingofRemittance_ApproveCancel_CancelBtn;
	}

	/// *** Recording of Remittance ---> To Be Destroyed ***///

	@FindBy(xpath = "//a[@id='RRTDY']//span[text()='To Be Destroyed']")
	private WebElement RecordingofRemittance_ToBeDestroyed;

	public WebElement RecordingofRemittance_ToBeDestroyed() {
		return RecordingofRemittance_ToBeDestroyed;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_RRTDY']")
	private WebElement RecordingofRemittance_ToBeDestroyed_SearchBtn;

	public WebElement RecordingofRemittance_ToBeDestroyed_SearchBtn() {
		return RecordingofRemittance_ToBeDestroyed_SearchBtn;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ToBeDestroyed_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ToBeDestroyed_TransactionNoDenisk() {
		return RecordingofRemittance_ToBeDestroyed_TransactionNoDenisk;
	}

	@FindBy(xpath = "//span[@id='spanLookup_vaultLookup_RRTDY']/span")
	private WebElement RecordingofRemittance_ToBeDestroyed_VaultNoSearch;

	public WebElement RecordingofRemittance_ToBeDestroyed_VaultNoSearch() {
		return RecordingofRemittance_ToBeDestroyed_VaultNoSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_vaultLookup_RRTDY_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeDestroyed_VaultCode;

	public WebElement RecordingofRemittance_ToBeDestroyed_VaultCode() {
		return RecordingofRemittance_ToBeDestroyed_VaultCode;
	}
	// table[@id='gridtab_vaultLookup_RRTDY']//td[text()='1001']

	@FindBy(xpath = "//select[@id='REMITT_TYPE_RRTDY']")
	private WebElement RecordingofRemittance_ToBeDestroyed_RemittanceType;

	public WebElement RecordingofRemittance_ToBeDestroyed_RemittanceType() {
		return RecordingofRemittance_ToBeDestroyed_RemittanceType;
	}
	// Certificate of Deposit

	@FindBy(xpath = "//span[@id='spanLookup_remittanceTypeLookup_RRTDY']/span")
	private WebElement RecordingofRemittance_ToBeDestroyed_CDTypeSearch;

	public WebElement RecordingofRemittance_ToBeDestroyed_CDTypeSearch() {
		return RecordingofRemittance_ToBeDestroyed_CDTypeSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_remittanceTypeLookup_RRTDY_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeDestroyed_CDTypeCode;

	public WebElement RecordingofRemittance_ToBeDestroyed_CDTypeCode() {
		return RecordingofRemittance_ToBeDestroyed_CDTypeCode;
	}
	// table[@id='gridtab_remittanceTypeLookup_RRTDY']//td[text()='12']

	@FindBy(xpath = "//span[@id='spanLookup_currencyLookup_RRTDY']/span")
	private WebElement RecordingofRemittance_ToBeDestroyed_CurrencySearch;

	public WebElement RecordingofRemittance_ToBeDestroyed_CurrencySearch() {
		return RecordingofRemittance_ToBeDestroyed_CurrencySearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_currencyLookup_RRTDY_gs_CURRENCY_CODE']")
	private WebElement RecordingofRemittance_ToBeDestroyed_CurrencyCode;

	public WebElement RecordingofRemittance_ToBeDestroyed_CurrencyCode() {
		return RecordingofRemittance_ToBeDestroyed_CurrencyCode;
	}
	// table[@id='gridtab_currencyLookup_RRTDY']//td[text()='840']

	@FindBy(xpath = "//select[@id='REASON_RRTDY']")
	private WebElement RecordingofRemittance_ToBeDestroyed_Reason;

	public WebElement RecordingofRemittance_ToBeDestroyed_Reason() {
		return RecordingofRemittance_ToBeDestroyed_Reason;
	}
	// rem cag

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTDY_To_Destroy_key']")
	private WebElement RecordingofRemittance_ToBeDestroyed_ToDestroyBtn;

	public WebElement RecordingofRemittance_ToBeDestroyed_ToDestroyBtn() {
		return RecordingofRemittance_ToBeDestroyed_ToDestroyBtn;
	}

	/// *** Recording of Remittance ---> Approve Destroy ***///

	@FindBy(xpath = "//a[@id='RRTADY']//span[text()='Approve Destroy']")
	private WebElement RecordingofRemittance_ApproveDestroy;

	public WebElement RecordingofRemittance_ApproveDestroy() {
		return RecordingofRemittance_ApproveDestroy;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ApproveDestroy_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ApproveDestroy_TransactionNoDenisk() {
		return RecordingofRemittance_ApproveDestroy_TransactionNoDenisk;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_VAULT_NO']")
	private WebElement RecordingofRemittance_ApproveDestroy_VaultNo;

	public WebElement RecordingofRemittance_ApproveDestroy_VaultNo() {
		return RecordingofRemittance_ApproveDestroy_VaultNo;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_REMITTANCE_TYPE']")
	private WebElement RecordingofRemittance_ApproveDestroy_RemittanceType;

	public WebElement RecordingofRemittance_ApproveDestroy_RemittanceType() {
		return RecordingofRemittance_ApproveDestroy_RemittanceType;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_RECEIVED_DATE']")
	private WebElement RecordingofRemittance_ApproveDestroy_ReceivedDate;

	public WebElement RecordingofRemittance_ApproveDestroy_ReceivedDate() {
		return RecordingofRemittance_ApproveDestroy_ReceivedDate;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTADY_Destroy_key']")
	private WebElement RecordingofRemittance_ApproveDestroy_DestroyBtn;

	public WebElement RecordingofRemittance_ApproveDestroy_DestroyBtn() {
		return RecordingofRemittance_ApproveDestroy_DestroyBtn;
	}

	/// *** Recording of Remittance ---> To Be Damaged ***///

	@FindBy(xpath = "//a[@id='RRTDM']//span[text()='To Be Damaged']")
	private WebElement RecordingofRemittance_ToBeDamaged;

	public WebElement RecordingofRemittance_ToBeDamaged() {
		return RecordingofRemittance_ToBeDamaged;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_RRTDM']")
	private WebElement RecordingofRemittance_ToBeDamaged_SearchBtn;

	public WebElement RecordingofRemittance_ToBeDamaged_SearchBtn() {
		return RecordingofRemittance_ToBeDamaged_SearchBtn;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ToBeDamaged_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ToBeDamaged_TransactionNoDenisk() {
		return RecordingofRemittance_ToBeDamaged_TransactionNoDenisk;
	}

	@FindBy(xpath = "//span[@id='spanLookup_vaultLookup_RRTDM']/span")
	private WebElement RecordingofRemittance_ToBeDamaged_VaultNoSearch;

	public WebElement RecordingofRemittance_ToBeDamaged_VaultNoSearch() {
		return RecordingofRemittance_ToBeDamaged_VaultNoSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_vaultLookup_RRTDM_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeDamaged_VaultCode;

	public WebElement RecordingofRemittance_ToBeDamaged_VaultCode() {
		return RecordingofRemittance_ToBeDamaged_VaultCode;
	}
	// table[@id='gridtab_vaultLookup_RRTDM']//td[text()='1001']

	@FindBy(xpath = "//select[@id='REMITT_TYPE_RRTDM']")
	private WebElement RecordingofRemittance_ToBeDamaged_RemittanceType;

	public WebElement RecordingofRemittance_ToBeDamaged_RemittanceType() {
		return RecordingofRemittance_ToBeDamaged_RemittanceType;
	}
	// Certificate of Deposit

	@FindBy(xpath = "//span[@id='spanLookup_remittanceTypeLookup_RRTDM']/span")
	private WebElement RecordingofRemittance_ToBeDamaged_CDTypeSearch;

	public WebElement RecordingofRemittance_ToBeDamaged_CDTypeSearch() {
		return RecordingofRemittance_ToBeDamaged_CDTypeSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_remittanceTypeLookup_RRTDM_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeDamaged_CDTypeCode;

	public WebElement RecordingofRemittance_ToBeDamaged_CDTypeCode() {
		return RecordingofRemittance_ToBeDamaged_CDTypeCode;
	}
	// table[@id='gridtab_remittanceTypeLookup_RRTDM']//td[text()='12']

	@FindBy(xpath = "//span[@id='spanLookup_currencyLookup_RRTDM']/span")
	private WebElement RecordingofRemittance_ToBeDamaged_CurrencySearch;

	public WebElement RecordingofRemittance_ToBeDamaged_CurrencySearch() {
		return RecordingofRemittance_ToBeDamaged_CurrencySearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_currencyLookup_RRTDM_gs_CURRENCY_CODE']")
	private WebElement RecordingofRemittance_ToBeDamaged_CurrencyCode;

	public WebElement RecordingofRemittance_ToBeDamaged_CurrencyCode() {
		return RecordingofRemittance_ToBeDamaged_CurrencyCode;
	}
	// table[@id='gridtab_currencyLookup_RRTDM']//td[text()='840']

	@FindBy(xpath = "//select[@id='REASON_RRTDM']")
	private WebElement RecordingofRemittance_ToBeDamaged_Reason;

	public WebElement RecordingofRemittance_ToBeDamaged_Reason() {
		return RecordingofRemittance_ToBeDamaged_Reason;
	}
	// rem cag

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTDM_To_Damage_key']")
	private WebElement RecordingofRemittance_ToBeDamaged_ToDamageBtn;

	public WebElement RecordingofRemittance_ToBeDamaged_ToDamageBtn() {
		return RecordingofRemittance_ToBeDamaged_ToDamageBtn;
	}

	/// *** Recording of Remittance ---> Approve Damage ***///

	@FindBy(xpath = "//a[@id='RRTADM']//span[text()='Approve Damage']")
	private WebElement RecordingofRemittance_ApproveDamage;

	public WebElement RecordingofRemittance_ApproveDamage() {
		return RecordingofRemittance_ApproveDamage;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ApproveDamage_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ApproveDamage_TransactionNoDenisk() {
		return RecordingofRemittance_ApproveDamage_TransactionNoDenisk;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_VAULT_NO']")
	private WebElement RecordingofRemittance_ApproveDamage_VaultNo;

	public WebElement RecordingofRemittance_ApproveDamage_VaultNo() {
		return RecordingofRemittance_ApproveDamage_VaultNo;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_REMITTANCE_TYPE']")
	private WebElement RecordingofRemittance_ApproveDamage_RemittanceType;

	public WebElement RecordingofRemittance_ApproveDamage_RemittanceType() {
		return RecordingofRemittance_ApproveDamage_RemittanceType;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_RECEIVED_DATE']")
	private WebElement RecordingofRemittance_ApproveDamage_ReceivedDate;

	public WebElement RecordingofRemittance_ApproveDamage_ReceivedDate() {
		return RecordingofRemittance_ApproveDamage_ReceivedDate;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTADM_Damage_key']")
	private WebElement RecordingofRemittance_ApproveDamage_DamageBtn;

	public WebElement RecordingofRemittance_ApproveDamage_DamageBtn() {
		return RecordingofRemittance_ApproveDamage_DamageBtn;
	}

	/// *** Transactions --> Amend Standing Order ***///

	@FindBy(xpath = "//span[text()='Amend Standing Order']")
	private WebElement Transactions_AmendStandingOrder;

	public WebElement Transactions_AmendStandingOrder() {
		return Transactions_AmendStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_AmendStandingOrder_TransactionNo;

	public WebElement Transactions_AmendStandingOrder_TransactionNo() {
		return Transactions_AmendStandingOrder_TransactionNo;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001AS']//td[text()='9594'])[1]

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001AS']")
	private WebElement Transactions_AmendStandingOrder_DebitCif;

	public WebElement Transactions_AmendStandingOrder_DebitCif() {
		return Transactions_AmendStandingOrder_DebitCif;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001AS']")
	private WebElement Transactions_AmendStandingOrder_DebitSerialNo;

	public WebElement Transactions_AmendStandingOrder_DebitSerialNo() {
		return Transactions_AmendStandingOrder_DebitSerialNo;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001AS']")
	private WebElement Transactions_AmendStandingOrder_CreditCif;

	public WebElement Transactions_AmendStandingOrder_CreditCif() {
		return Transactions_AmendStandingOrder_CreditCif;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001AS']")
	private WebElement Transactions_AmendStandingOrder_CreditSerialNo;

	public WebElement Transactions_AmendStandingOrder_CreditSerialNo() {
		return Transactions_AmendStandingOrder_CreditSerialNo;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AS_gs_statusDesc']")
	private WebElement Transactions_AmendStandingOrder_Status;

	public WebElement Transactions_AmendStandingOrder_Status() {
		return Transactions_AmendStandingOrder_Status;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001AS']//button/span)[1]")
	private WebElement Transactions_AmendStandingOrder_AmendStandingOrderBtn;

	public WebElement Transactions_AmendStandingOrder_AmendStandingOrderBtn() {
		return Transactions_AmendStandingOrder_AmendStandingOrderBtn;
	}

	/// *** Transactions --> To Be Stopped Standing Order ***///

	@FindBy(xpath = "//span[text()='To Be Stopped  Standing Order']")
	private WebElement Transactions_ToBeStoppedStandingOrder;

	public WebElement Transactions_ToBeStoppedStandingOrder() {
		return Transactions_ToBeStoppedStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ToBeStoppedStandingOrder_TransactionNo;

	public WebElement Transactions_ToBeStoppedStandingOrder_TransactionNo() {
		return Transactions_ToBeStoppedStandingOrder_TransactionNo;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TS_gs_statusDesc']")
	private WebElement Transactions_ToBeStoppedStandingOrder_Status;

	public WebElement Transactions_ToBeStoppedStandingOrder_Status() {
		return Transactions_ToBeStoppedStandingOrder_Status;
	}

	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001TS']")
	private WebElement Transactions_ToBeStoppedStandingOrder_ToStopSOReason;

	public WebElement Transactions_ToBeStoppedStandingOrder_ToStopSOReason() {
		return Transactions_ToBeStoppedStandingOrder_ToStopSOReason;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001TS']//button/span)[1]")
	private WebElement Transactions_ToBeStoppedStandingOrder_ToStopSOBtn;

	public WebElement Transactions_ToBeStoppedStandingOrder_ToStopSOBtn() {
		return Transactions_ToBeStoppedStandingOrder_ToStopSOBtn;
	}

	@FindBy(xpath = "//span[text()='Stop Standing Order']")
	private WebElement Transactions_StopStandingOrder;

	public WebElement Transactions_StopStandingOrder() {
		return Transactions_StopStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001SS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_StopStandingOrder_TransactionNo;

	public WebElement Transactions_StopStandingOrder_TransactionNo() {
		return Transactions_StopStandingOrder_TransactionNo;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001SS']//td[text()='9593'])[1]

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001SS']//button/span)[1]")
	private WebElement Transactions_StopStandingOrder_StopSOBtn;

	public WebElement Transactions_StopStandingOrder_StopSOBtn() {
		return Transactions_StopStandingOrder_StopSOBtn;
	}

	/// *** Transactions --> Reactivate Standing Order ***///

	@FindBy(xpath = "//span[text()='Reactivate Standing Order']")
	private WebElement Transactions_ReactivateStandingOrder;

	public WebElement Transactions_ReactivateStandingOrder() {
		return Transactions_ReactivateStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ReactivateStandingOrder_TransactionNo;

	public WebElement Transactions_ReactivateStandingOrder_TransactionNo() {
		return Transactions_ReactivateStandingOrder_TransactionNo;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001AS']//td[text()='9594'])[1]

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RS_gs_statusDesc']")
	private WebElement Transactions_ReactivateStandingOrder_Status;

	public WebElement Transactions_ReactivateStandingOrder_Status() {
		return Transactions_ReactivateStandingOrder_Status;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001RS']//button/span)[1]")
	private WebElement Transactions_ReactivateStandingOrder_ReactivateSOBtn;

	public WebElement Transactions_ReactivateStandingOrder_ReactivateSOBtn() {
		return Transactions_ReactivateStandingOrder_ReactivateSOBtn;
	}

	@FindBy(xpath = "//span[text()='Approve Reactivate Standing Order']")
	private WebElement Transactions_ApproveReactivateStandingOrder;

	public WebElement Transactions_ApproveReactivateStandingOrder() {
		return Transactions_ApproveReactivateStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001ARS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApproveReactivateStandingOrder_TransactionNo;

	public WebElement Transactions_ApproveReactivateStandingOrder_TransactionNo() {
		return Transactions_ApproveReactivateStandingOrder_TransactionNo;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001ARS']//td[text()='9593'])[1]

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001ARS']//button/span)[1]")
	private WebElement Transactions_ApproveReactivateStandingOrder_ApplyReactivateSOBtn;

	public WebElement Transactions_ApproveReactivateStandingOrder_ApplyReactivateSOBtn() {
		return Transactions_ApproveReactivateStandingOrder_ApplyReactivateSOBtn;
	}

	/// *** Transactions --> To Be Closed Standing Order ***///

	@FindBy(xpath = "//span[text()='To Be Closed Standing Order']")
	private WebElement Transactions_ToBeClosedStandingOrder;

	public WebElement Transactions_ToBeClosedStandingOrder() {
		return Transactions_ToBeClosedStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TCL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ToBeClosedStandingOrder_TransactionNo;

	public WebElement Transactions_ToBeClosedStandingOrder_TransactionNo() {
		return Transactions_ToBeClosedStandingOrder_TransactionNo;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001TCL']//td[text()='9594'])[1]

	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001TCL']")
	private WebElement Transactions_ToBeClosedStandingOrder_ToCloseSOReason;

	public WebElement Transactions_ToBeClosedStandingOrder_ToCloseSOReason() {
		return Transactions_ToBeClosedStandingOrder_ToCloseSOReason;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001TCL']//button/span)[1]")
	private WebElement Transactions_ToBeClosedStandingOrder_ToCloseSOBtn;

	public WebElement Transactions_ToBeClosedStandingOrder_ToCloseSOBtn() {
		return Transactions_ToBeClosedStandingOrder_ToCloseSOBtn;
	}

	@FindBy(xpath = "//span[text()='Close Standing Order']")
	private WebElement Transactions_CloseStandingOrder;

	public WebElement Transactions_CloseStandingOrder() {
		return Transactions_CloseStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001CL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_CloseStandingOrder_TransactionNo;

	public WebElement Transactions_CloseStandingOrder_TransactionNo() {
		return Transactions_CloseStandingOrder_TransactionNo;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001CL']//td[text()='9600'])[1]

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001CL']//button/span)[1]")
	private WebElement Transactions_CloseStandingOrder_CloseSOBtn;

	public WebElement Transactions_CloseStandingOrder_CloseSOBtn() {
		return Transactions_CloseStandingOrder_CloseSOBtn;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Maintenance_Status;

	public WebElement Transactions_Maintenance_Status() {
		return Transactions_Maintenance_Status;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_So_Det_key']")
	private WebElement Transactions_Maintenance_SODetails;

	public WebElement Transactions_Maintenance_SODetails() {
		return Transactions_Maintenance_SODetails;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-trxMgntSoDetBtnDiv_id_D001MT']")
	private WebElement Transactions_Maintenance_SODetailsDialogBox;

	public WebElement Transactions_Maintenance_SODetailsDialogBox() {
		return Transactions_Maintenance_SODetailsDialogBox;
	}

	@FindBy(xpath = "//select[@id='so_periodicity_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_Periodicity;

	public WebElement Transactions_Maintenance_SODetails_Periodicity() {
		return Transactions_Maintenance_SODetails_Periodicity;
	}
	// Monthly

	@FindBy(xpath = "//select[@id='so_periodicity_type_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_PeriodType;

	public WebElement Transactions_Maintenance_SODetails_PeriodType() {
		return Transactions_Maintenance_SODetails_PeriodType;
	}
	// Specific Day

	@FindBy(xpath = "//select[@id='so_period_interval_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_PeriodInterval;

	public WebElement Transactions_Maintenance_SODetails_PeriodInterval() {
		return Transactions_Maintenance_SODetails_PeriodInterval;
	}

	@FindBy(xpath = "//select[@id='so_period_day_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_DaySpecification;

	public WebElement Transactions_Maintenance_SODetails_DaySpecification() {
		return Transactions_Maintenance_SODetails_DaySpecification;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement Transactions_Maintenance_SODetails_Ok;

	public WebElement Transactions_Maintenance_SODetails_Ok() {
		return Transactions_Maintenance_SODetails_Ok;
	}

	@FindBy(xpath = "//input[@id='so_first_payment_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_Payment;

	public WebElement Transactions_Maintenance_SODetails_Payment() {
		return Transactions_Maintenance_SODetails_Payment;
	}

	/// *** Send Alert ***///

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

	@FindBy(xpath = "//input[@id='amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_Amount;
	}

	@FindBy(xpath = "//input[@id='input_amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount;
	}

	// Kowsi PageObject

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice_611;

	public WebElement ClosePopupmsg_frontoffice_611() {
		return ClosePopupmsg_frontoffice_611;
	}

//												@FindBy(id = "hdr_runn_date")
//												private WebElement CSM_DateToChangeTheCurrentDate;
//												public WebElement CSMDateToChangeTheCurrentDate_611() {
//													return CSM_DateToChangeTheCurrentDate;
//												}
//												@FindBy(id = "global_user_run_date")
//												private WebElement CSM_DateInUserRunningDate;
//												public WebElement CSMDateInUserRunningDate_611() {
//													return CSM_DateInUserRunningDate;
//												}
//												
//												@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
//												private WebElement CSM_UseButtonInChangeRunningDate;
//												public WebElement CSMUseButtonInChangeRunningDate_611() {
//													return CSM_UseButtonInChangeRunningDate;
//												}

//												@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
//												private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;
//												public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_611()
//												{
//												    return csmOkButtonForConfirmationPopUpForCompanyHoliday;
//												}
//												
//												@FindBy(id = "_popup_path_sol_ok")
//												private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;
	//
//												public WebElement CSMOkButtonInAccessDeniedPopUpMenu_611() {
//													return CSM_OkButtonInAccessDeniedPopUpMenu;
//												}
//												
//												@FindBy(id = "_header_rundate_dialog_close")
//												private WebElement CSM_CloseButtonInChangeRunningDate;
	//
//												public WebElement CSMCloseButtonInChangeRunningDate_611() {
//													return CSM_CloseButtonInChangeRunningDate;
//												}

	@FindBy(id = "tech_details_icon")
	private WebElement CSMTechnicalDetailsIcon_611;

	public WebElement CSMTechnicalDetailsIcon_611() {
		return CSMTechnicalDetailsIcon_611;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon_611;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_611() {
		return CSM_ClearCacheInTechnicalDetailsIcon_611;

	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMOkButtonUnderInformationPopUp_611;

	public WebElement CSMOkButtonUnderInformationPopUp_611() {
		return CSMOkButtonUnderInformationPopUp_611;
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
//												@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
//												private WebElement CSM_SerialIndebitAc;
//												public WebElement CSM_SerialIndebitAc() {
//													return CSM_SerialIndebitAc;
//												}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn;

	public WebElement Transactions_Warning_okbtn_611() {
		return Transactions_Warning_okbtn;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_debitAcc_currency;

	public WebElement Transactions_debitAcc_currency_611() {
		return Transactions_debitAcc_currency;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_EnterAmount;

	public WebElement Transactions_EnterAmount_611() {
		return Transactions_EnterAmount;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered_611;

	public WebElement checkIfValueIsEntered_611() {
		return checkIfValueIsEntered_611;
	}

	@FindBy(id = "trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen;

	public WebElement CSMSaveButtonInMaintenanceScreen_611() {
		return CSM_SaveButtonInMaintenanceScreen;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_611;

	public WebElement getTransactionNumber_611() {
		return getTransactionNumber_611;
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
	private WebElement Transactions_transactionNo_codeValues_611;

	public WebElement Transactions_transactionNo_codeValues_611() {
		return Transactions_transactionNo_codeValues_611;
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
//												@FindBy(xpath = "//span[text()='close']")
//											  	private WebElement CSMCore_closeSymbol;
//											  	public WebElement CSMCorecloseSymbol_611() {
//											  		return CSMCore_closeSymbol;
//											  	}

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

//	@FindBy(xpath = "//input[@id='so_type_P024MAP']")
//	private WebElement CSMParam_TransactionType_PeriodicalCheckBox_611;
//
//	public WebElement CSMParam_TransactionType_PeriodicalCheckBox_611() {
//		return CSMParam_TransactionType_PeriodicalCheckBox_611;
//	}

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


	// RAZIA page object
	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement csm_SystemParameters_TransactionType;

	public WebElement csmSystemParametersTransactionType() {
		return csm_SystemParameters_TransactionType;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement csm_SystemParameters_TransactionTypeUA;

	public WebElement csmSystemParametersTransactionTypeUA() {
		return csm_SystemParameters_TransactionTypeUA;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE")
	private WebElement csmSystemParametersTransactionTypeUACodeInput;

	public WebElement csmSystemParametersTransactionTypeUACodeInput() {
		return csmSystemParametersTransactionTypeUACodeInput;
	}

	@FindBy(id = "td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE")
	private WebElement csmSystemParametersTransactionTypeUACodeDoubleClick;

	public WebElement csmSystemParametersTransactionTypeUACodeDoubleClick() {
		return csmSystemParametersTransactionTypeUACodeDoubleClick;
	}

	@FindBy(xpath = "//input[@id='standing_order_P024MA']")
	private WebElement CSMParam_TransactionType_StandingOrderCheckBox;

	public WebElement CSMParam_TransactionType_StandingOrderCheckBox() {
		return CSMParam_TransactionType_StandingOrderCheckBox;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAX']")
	private WebElement CSMParam_TransactionType_MaxCheckBox;

	public WebElement CSMParam_TransactionType_MaxCheckBox() {
		return CSMParam_TransactionType_MaxCheckBox;
	}

	@FindBy(xpath = "//select[@id='so_periodicity_P024MA']")
	private WebElement CSMParam_TransactionType_PeriodicalSelectBox;

	public WebElement CSMParam_TransactionType_PeriodicalSelectBox() {
		return CSMParam_TransactionType_PeriodicalSelectBox;
	}

	@FindBy(xpath = "//select[@id='so_period_type_P024MA']")
	private WebElement CSMParam_TransactionType_PeriodTypeSelectBox;

	public WebElement CSMParam_TransactionType_PeriodTypeSelectBox() {
		return CSMParam_TransactionType_PeriodTypeSelectBox;
	}

	@FindBy(xpath = "//select[@id='so_period_day_P024MA']")
	private WebElement CSMParam_TransactionType_DaySpecificationsSelectBox;

	public WebElement CSMParam_TransactionType_DaySpecificationsSelectBox() {
		return CSMParam_TransactionType_DaySpecificationsSelectBox;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement csm_TransactionType_ApproveScreen_ApproveButton;

	public WebElement csmTransactionTypeApproveScreenApproveButton() {
		return csm_TransactionType_ApproveScreen_ApproveButton;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csm_TransactionType_UpdateAfterApprove_Button;

	public WebElement csmTransactionTypeUpdateAfterApproveButton() {
		return csm_TransactionType_UpdateAfterApprove_Button;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csm_TransactionType_ConfirmOkButton;

	public WebElement csmTransactionTypeConfirmOkButton() {
		return csm_TransactionType_ConfirmOkButton;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement csm_TransactionType_SuccessOkButton;

	public WebElement csmTransactionTypeSuccessOkButton() {
		return csm_TransactionType_SuccessOkButton;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement csm_TransactionType_ApproveScreen;

	public WebElement csmTransactionTypeApproveScreen() {
		return csm_TransactionType_ApproveScreen;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE")
	private WebElement csmTransactionTypeApproveScreenCodeInput;

	public WebElement csmTransactionTypeApproveScreenCodeInput() {
		return csmTransactionTypeApproveScreenCodeInput;
	}

	@FindBy(xpath = "//table[@id='transactionTypesList_GridTbl_Id_P024P']")
	private WebElement csm_TransactionType_ApproveScreen_CodeInput_DoubleClick;

	public WebElement csmTransactionTypeApproveScreenCodeInputDoubleClick() {
		return csm_TransactionType_ApproveScreen_CodeInput_DoubleClick;
	}

	@FindBy(xpath = "//table[@id='transactionTypesList_GridTbl_Id_P024MA']")
	private WebElement csm_TransactionType_UPApproveScreen_CodeInput_DoubleClick;

	public WebElement csmTransactionTypeUPApproveScreenCodeInputDoubleClick() {
		return csm_TransactionType_UPApproveScreen_CodeInput_DoubleClick;
	}

	// CSM_Core
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_Maintanance_SearchButton_Input;

	public WebElement CSM_Transaction_Maintanance_SearchButton_Input() {
		return CSM_Transaction_Maintanance_SearchButton_Input;
	}

	@FindBy(xpath = "//span[text()='To Be Closed Standing Order']")
	private WebElement CSM_Transaction_ToBeCLosedField;

	public WebElement CSM_Transaction_ToBeCLosedField() {
		return CSM_Transaction_ToBeCLosedField;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001TCL']")
	private WebElement CSM_Transaction_ToBeCLosedField_SearchBtn;

	public WebElement CSM_Transaction_ToBeCLosedField_SearchBtn() {
		return CSM_Transaction_ToBeCLosedField_SearchBtn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TCL_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_ToBeCLosedField_InputCode;

	public WebElement CSM_Transaction_ToBeCLosedField_InputCode() {
		return CSM_Transaction_ToBeCLosedField_InputCode;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001TCL']")
	private WebElement CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick;

	public WebElement CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick() {
		return CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick;
	}

	@FindBy(xpath = "//textarea[@name='trxMgntCO.statusReason']")
	private WebElement CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick_Reason;

	public WebElement CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick_Reason() {
		return CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick_Reason;
	}

	@FindBy(xpath = "//span[contains(text(),' To Close SO ')]//parent::button")
	private WebElement CSM_Transaction_ToBeCLosedField_TOCloseButton;

	public WebElement CSM_Transaction_ToBeCLosedField_TOCloseButton() {
		return CSM_Transaction_ToBeCLosedField_TOCloseButton;
	}

	@FindBy(xpath = "//span[text()='Close Standing Order']")
	private WebElement CSM_Transaction_CloseStandingOrder;

	public WebElement CSM_Transaction_CloseStandingOrder() {
		return CSM_Transaction_CloseStandingOrder;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001CL']")
	private WebElement CSM_Transaction_CloseStandingOrder_Search;

	public WebElement CSM_Transaction_CloseStandingOrder_Search() {
		return CSM_Transaction_CloseStandingOrder_Search;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001CL_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield;

	public WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield() {
		return CSM_Transaction_CloseStandingOrder_Search_Inputfield;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001CL']")
	private WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick;

	public WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick() {
		return CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick;
	}

	@FindBy(xpath = "//span[contains(text(),' Close SO ')]")
	private WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick_CloseButton;

	public WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick_CloseButton() {
		return CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick_CloseButton;
	}
//													@FindBy(xpath = "//td[text()='Closed so'] ")
//													private WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCloseStatus;
	//
//													public WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCloseStatus() {
//														return CSM_Transaction_Maintanance_SearchButton_VerifyCloseStatus;
//													}
	// STOP_P2_0041
//													@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.VALUE_DATE']")
//													private WebElement CSM_Transaction_maintanance_StartingDate;
	//
//													public WebElement CSM_Transaction_maintanance_StartingDate() {
//														return CSM_Transaction_maintanance_StartingDate;
//													}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.RELEASE_DATE']")
	private WebElement CSM_Transaction_maintanance_EndingDate;

	public WebElement CSM_Transaction_maintanance_EndingDate() {
		return CSM_Transaction_maintanance_EndingDate;
	}

//													@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
//													private WebElement getTransactionNumber;
	//
//													public WebElement getTransactionNumber() {
//														return getTransactionNumber;
//													}
	@FindBy(id = "trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_TransactionNoInApproveScreen;

	public WebElement CSMTransactionNoInApproveScreen() {
		return CSM_TransactionNoInApproveScreen;
	}

	@FindBy(xpath = "//span[text()='To Be Stopped  Standing Order']")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder() {
		return CSM_Transaction_ToBeStopedStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput() {
		return CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001TS']")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick() {
		return CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick;
	}

	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001TS']")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick_Reason;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick_Reason() {
		return CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick_Reason;
	}

	@FindBy(xpath = "//span[contains(text(),' to Stop SO ')]")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder_ToStopSOButton;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder_ToStopSOButton() {
		return CSM_Transaction_ToBeStopedStandingOrder_ToStopSOButton;
	}

	@FindBy(xpath = "//span[text()='Stop Standing Order']")
	private WebElement CSM_Transaction_StopStandingOrder;

	public WebElement CSM_Transaction_StopStandingOrder() {
		return CSM_Transaction_StopStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001SS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_StopStandingOrder_TransactionNO;

	public WebElement CSM_Transaction_StopStandingOrder_TransactionNO() {
		return CSM_Transaction_StopStandingOrder_TransactionNO;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001SS']")
	private WebElement CSM_Transaction_StopStandingOrder_TransactionNO_DoubleClick;

	public WebElement CSM_Transaction_StopStandingOrder_TransactionNO_DoubleClick() {
		return CSM_Transaction_StopStandingOrder_TransactionNO_DoubleClick;
	}

	@FindBy(xpath = "//span[contains(text(),' Stop SO ')]")
	private WebElement CSM_Transaction_StopStandingOrder_StopSObutton;

	public WebElement CSM_Transaction_StopStandingOrder_StopSObutton() {
		return CSM_Transaction_StopStandingOrder_StopSObutton;
	}

//														@FindBy(xpath = "//td[text()='Stopped']")
//														private WebElement CSM_Transaction_Maintanance_SearchButton_VerifyStoppedStatus;
	//
//														public WebElement CSM_Transaction_Maintanance_SearchButton_VerifyStoppedStatus() {
//															return CSM_Transaction_Maintanance_SearchButton_VerifyStoppedStatus;
//														}
	// reactive
	@FindBy(xpath = "//span[text()='Reactivate Standing Order']")
	private WebElement CSM_Transaction_ReactivateStandingOrder;

	public WebElement CSM_Transaction_ReactivateStandingOrder() {
		return CSM_Transaction_ReactivateStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_ReactivateStandingOrder_TransactionInput;

	public WebElement CSM_Transaction_ReactivateStandingOrder_TransactionInput() {
		return CSM_Transaction_ReactivateStandingOrder_TransactionInput;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001RS']")
	private WebElement CSM_Transaction_ReactivateStandingOrder_TransactionInput_DoubleClick;

	public WebElement CSM_Transaction_ReactivateStandingOrder_TransactionInput_DoubleClick() {
		return CSM_Transaction_ReactivateStandingOrder_TransactionInput_DoubleClick;
	}

	@FindBy(xpath = "//span[contains(text(),' Reactivate SO ')]")
	private WebElement CSM_Transaction_ReactivateStandingOrder__ReactivateStandingOrderbutton;

	public WebElement CSM_Transaction_ReactivateStandingOrder__ReactivateStandingOrderbutton() {
		return CSM_Transaction_ReactivateStandingOrder__ReactivateStandingOrderbutton;
	}

	@FindBy(xpath = "//span[text()='Approve Reactivate Standing Order']")
	private WebElement CSM_Transaction_ApproveReactivateStandingOrder;

	public WebElement CSM_Transaction_ApproveReactivateStandingOrder() {
		return CSM_Transaction_ApproveReactivateStandingOrder;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001ARS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput;

	public WebElement CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput() {
		return CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001ARS']")
	private WebElement CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput_DoubleClick;

	public WebElement CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput_DoubleClick() {
		return CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput_DoubleClick;
	}

	@FindBy(xpath = "//span[contains(text(),' Apply Reactivate SO ')]")
	private WebElement CSM_Transaction_ApproveReactivateStandingOrder_ApplyReactivateSO;

	public WebElement CSM_Transaction_ApproveReactivateStandingOrder_ApplyReactivateSO() {
		return CSM_Transaction_ApproveReactivateStandingOrder_ApplyReactivateSO;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_statusDesc']")
	private WebElement CSM_Transaction_validate_created;

	public WebElement CSM_Transaction_validate_created() {
		return CSM_Transaction_validate_created;
	}

	@FindBy(xpath = "//span[text()='Amend Standing Order']")
	private WebElement Amend_Standing_order;

	public WebElement Amend_Standing_order() {
		return Amend_Standing_order;
	}

	@FindBy(id = "//table[@id='trxMgntGridTbl_Id_D001AS']")
	private WebElement DoubleClick_Amend_Standing_order;

	public WebElement DoubleClick_Amend_Standing_order() {
		return DoubleClick_Amend_Standing_order;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AS_gs_ctstrsVO.TRS_NO']")
	private WebElement Record_Amend_Standing_order;

	public WebElement Record_Amend_Standing_order() {
		return Record_Amend_Standing_order;
	}

	@FindBy(xpath = "//span[contains(text(),' Amend Standing Order ')]")
	private WebElement Submit_Amend_Standing_order;

	public WebElement Submit_Amend_Standing_order() {
		return Submit_Amend_Standing_order;
	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo;

	public WebElement BMUserAlertEnterTRXNo() {
		return BMUser_Alert_EnterTRXNo;
	}

//														@FindBy(xpath="//span[text()='close']")
//														private WebElement ClosePopupmsg_frontoffice;
//														public WebElement ClosePopupmsg_frontoffice() {
//															return ClosePopupmsg_frontoffice;
//														}
//														
	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement cannotproceed_popup;

	public WebElement cannotproceed_popup() {
		return cannotproceed_popup;
	}

	@FindBy(id = "lookuptxt_trx_type_D001MT")
	private WebElement CSMTRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen() {
		return CSMTRXTypeInMaintenanceScreen;
	}

//														@FindBy(id="trs_ac_br_D001MT")
//														private WebElement CSM_BranchCodeINdebitAc;
//														public WebElement CSM_BranchCodeINdebitAc() {
//															return CSM_BranchCodeINdebitAc;
//														}
	//
//														@FindBy(id="trs_ac_cy_D001MT")
//														private WebElement CSM_CurrencyCodedebitAc;
	//
//														public WebElement CSM_CurrencyCodedebitAc() {
//															return CSM_CurrencyCodedebitAc;
//														}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeIndebitAc;

	public WebElement CSM_CIFCodeIndebitAc() {
		return CSM_CIFCodeIndebitAc;
	}

	@FindBy(id = "lookuptxt_trs_cy_D001MT")
	private WebElement CSMCurrencyInMaintenanceScreen;

	public WebElement CSMCurrencyInMaintenanceScreen() {
		return CSMCurrencyInMaintenanceScreen;
	}

	@FindBy(id = "amount_D001MT")
	private WebElement CSMAmountInMaintenanceScreen;

	public WebElement CSMAmountInMaintenanceScreen() {
		return CSMAmountInMaintenanceScreen;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement CSMBranchCodeInCreditAc;

	public WebElement CSMBranchCodeInCreditAc() {
		return CSMBranchCodeInCreditAc;
	}

	// id="trs_ac_cy_D001MT"
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CY']")
	private WebElement CSMCurrencyCodeCreditAc;

	public WebElement CSMCurrencyCodeCreditAc() {
		return CSMCurrencyCodeCreditAc;
	}

	// id="trs_ac_gl_D001MT
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement CSMGLCodeCreditAc;

	public WebElement CSMGLCodeCreditAc() {
		return CSMGLCodeCreditAc;
	}

	// id="trs_ac_cif_D001MT
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CSMCIFCodeInCreditAc;

	public WebElement CSMCIFCodeInCreditAc() {
		return CSMCIFCodeInCreditAc;
	}

	// id="lookuptxt_trs_ac_sl_D001MT"
	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement CSMSerialInCreditAc;

	public WebElement CSMSerialInCreditAc() {
		return CSMSerialInCreditAc;
	}

	@FindBy(id = "D001AU")
	private WebElement CSM_ApproveScreenUnderTransactions;

	public WebElement CSMApproveScreenUnderTransactions() {
		return CSM_ApproveScreenUnderTransactions;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement CSM_OkButtonInWarningPopUpToGoBackToMaintenance;

	public WebElement CSMOkButtonInWarningPopUpToGoBackToMaintenance() {
		return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
	}

	@FindBy(id = "infoBarSearchButton_D001MT")
	private WebElement CSM_SearchButtonInMaintenanceScreen;

	public WebElement CSMSearchButtonInMaintenanceScreen() {
		return CSM_SearchButtonInMaintenanceScreen;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")

	private WebElement Transactions_transactionNo_Doubleclk;

	public WebElement Transactions_transactionNo_Doubleclk() {

		return Transactions_transactionNo_Doubleclk;

	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement CSM_ApproveButtonInApproveScreen;

	public WebElement CSMApproveButtonInApproveScreen() {
		return CSM_ApproveButtonInApproveScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMOkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation() {
		return CSMOkButtonInSuccessPopUpMenuForTranscation;
	}

	// Sridhar page object
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Parameters12;

	public WebElement Parameters12() {
		return Parameters12;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement SystemParameters;

	public WebElement SystemParameters() {
		return SystemParameters;
	}

	// @FindBy(xpath="//td[text()='Transaction Type']")
	// private WebElement TransactionType;
	// public WebElement TransactionType() {
//									   return TransactionType;
	// }
	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement UpdateAA;

	public WebElement UpdateAA() {
		return UpdateAA;

	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement CodeSO;

	public WebElement codeSO() {
		return CodeSO;
	}

	@FindBy(xpath = "(//td[text()='ritaso'])[1]")
	private WebElement ritaso1;

	public WebElement ritaso1() {
		return ritaso1;
	}

	@FindBy(xpath = "(//span[text()='Standing Order'])[2]")
	private WebElement StandingOrder;

	public WebElement StandingOrder() {
		return StandingOrder;
	}

	@FindBy(xpath = "//input[@id='standing_order_P024MA']")
	private WebElement StandingOrderclick;

	public WebElement StandingOrderclick() {
		return StandingOrderclick;
	}

//	@FindBy(xpath = "//input[@id='so_type_P024MAP']")
//	private WebElement Periodecil;
//
//	public WebElement Periodecil() {
//		return Periodecil;
//	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement Codedaily;

	public WebElement Codedaily() {
		return Codedaily;
	}

	@FindBy(xpath = "(//td[text()='DAILY SO'])[1]")
	private WebElement DailySodoubleclick;

	public WebElement DailySodoubleclick() {
		return DailySodoubleclick;
	}
	// @FindBy(xpath="//td[text()='Transactions']")
	// private WebElement Transactions;
	// public WebElement Transactions() {
//									   return Transactions;
	// }

	@FindBy(id = "hder_logout_icon_id")
	private WebElement csm_logoutButton12;

	public WebElement csm_logoutButton12() {
		return csm_logoutButton12;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg;

	public WebElement POPupmsg() {
		return POPupmsg;
	}

	// Yogeswari page object

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement CSM_CodeUnderupdateAfterApprov_7183;

	public WebElement CSM_CodeUnderupdateAfterApprove_7183() {
		return CSM_CodeUnderupdateAfterApprov_7183;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement CSM_DoubleclickCodeUnderupdateAfterApprove_7183;

	public WebElement CSM_DoubleclickCodeUnderupdateAfterApprove_7183() {
		return CSM_DoubleclickCodeUnderupdateAfterApprove_7183;
	}

//	@FindBy(xpath = "//input[@id='so_type_P024MAP']")
//	private WebElement CSM_PeriodicalSpec_UnderupdateAfterApprove_7183;
//
//	public WebElement CSM_PeriodicalSpec_UnderupdateAfterApprove_7183() {
//		return CSM_PeriodicalSpec_UnderupdateAfterApprove_7183;
//	}

	@FindBy(xpath = "//input[@id='so_type_P024MAM']")
	private WebElement CSM_MinBalanceUnderupdateAfterApprove_7183;

	public WebElement CSM_MinBalanceUnderupdateAfterApprove_7183() {
		return CSM_MinBalanceUnderupdateAfterApprove_7183;
	}

	@FindBy(xpath = "//select[@id='so_periodicity_P024MA']")
	private WebElement CSM_Periodicity_UnderupdateAfterApprove_7183;

	public WebElement CSM_Periodicity_UnderupdateAfterApprove_7183() {
		return CSM_Periodicity_UnderupdateAfterApprove_7183;
	}

	@FindBy(xpath = "//select[@id='so_period_type_P024MA']")
	private WebElement CSM_PeriodicType_UnderupdateAfterApprove_7183;

	public WebElement CSM_PeriodicType_UnderupdateAfterApprove_7183() {
		return CSM_PeriodicType_UnderupdateAfterApprove_7183;
	}

	@FindBy(xpath = "//select[@id='so_period_day_P024MA']")
	private WebElement CSM_DaySpecification_UnderupdateAfterApprove_7183;

	public WebElement CSM_DaySpecification_UnderupdateAfterApprove_7183() {
		return CSM_DaySpecification_UnderupdateAfterApprove_7183;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement CSM_UpdateafterapproveButton_7183;

	public WebElement CSM_UpdateafterapproveButton_7183() {
		return CSM_UpdateafterapproveButton_7183;
	}

	@FindBy(xpath = "//select[@id='so_period_day_P024MA']")
	private WebElement CSM_StandingOrderCB_UnderupdateAfterApprove_7183;

	public WebElement CSM_StandingOrderCB_UnderupdateAfterApprove_7183() {
		return CSM_StandingOrderCB_UnderupdateAfterApprove_7183;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement CSM_ConfirmBtn_UnderupdateAfterApprove_7183;

	public WebElement CSM_ConfirmBtn_UnderupdateAfterApprove_7183() {
		return CSM_ConfirmBtn_UnderupdateAfterApprove_7183;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_SuccBtn_UnderupdateAfterApprove_7183;

	public WebElement CSM_SuccBtn_UnderupdateAfterApprove_7183() {
		return CSM_SuccBtn_UnderupdateAfterApprove_7183;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Transaction_type_button_param_7183;

	public WebElement Transaction_type_button_param_7183() {

		return Transaction_type_button_param_7183;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement Update_after_approve_button_param_7183;

	public WebElement Update_after_approve_button_param_7183() {

		return Update_after_approve_button_param_7183;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approve_button_param_7183;

	public WebElement Approve_button_param_7183() {

		return Approve_button_param_7183;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Code_Approve_Screen_param_7183;

	public WebElement Code_Approve_Screen_param_7183() {

		return Code_Approve_Screen_param_7183;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement double_click_code_approve_screen_param_7183;

	public WebElement double_click_code_approve_screen_param_7183() {

		return double_click_code_approve_screen_param_7183;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement Approve_button_screen_param_7183;

	public WebElement Approve_button_screen_param_7183() {

		return Approve_button_screen_param_7183;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement ok_button_confirmbox_param_7183;

	public WebElement ok_button_confirmbox_param_7183() {

		return ok_button_confirmbox_param_7183;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement save_button_Approve_screen_param_7183;

	public WebElement save_button_Approve_screen_param_7183() {

		return save_button_Approve_screen_param_7183;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement CSM_BranchCode_underTransactons_7183;

	public WebElement CSM_BranchCode_underTransactons_7183() {

		return CSM_BranchCode_underTransactons_7183;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement CSM_CurrencyCode_underTransactons_7183;

	public WebElement CSM_CurrencyCode_underTransactons_7183() {

		return CSM_CurrencyCode_underTransactons_7183;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSM_GLCode_underTransactons_7183;

	public WebElement CSM_GLCode_underTransactons_7183() {

		return CSM_GLCode_underTransactons_7183;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement CSM_CIFCode_underTransactons_7183;

	public WebElement CSM_CIFCode_underTransactons_7183() {

		return CSM_CIFCode_underTransactons_7183;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSM_SerialNo_underTransactons_7183;

	public WebElement CSM_SerialNo_underTransactons_7183() {

		return CSM_SerialNo_underTransactons_7183;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement CSM_CurrenyUnder_Currencyn_7183;

	public WebElement CSM_CurrenyUnder_Currencyn_7183() {

		return CSM_CurrenyUnder_Currencyn_7183;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement CSM_Amount_underTransactons_7183;

	public WebElement CSM_Amount_underTransactons_7183() {

		return CSM_Amount_underTransactons_7183;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement CSM_SaveBtn_underTransactons_7183;

	public WebElement CSM_SaveBtn_underTransactons_7183() {

		return CSM_SaveBtn_underTransactons_7183;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trs_cy_D001MT']")
	private WebElement CSM_Currency_SearchIcon_underTransactons_7183;

	public WebElement CSM_Currency_SearchIcon_underTransactons_7183() {

		return CSM_Currency_SearchIcon_underTransactons_7183;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_Transaction_7183;

	public WebElement CSM_Transaction_7183() {

		return CSM_Transaction_7183;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transaction_button_core_7183;

	public WebElement Transaction_button_core_7183() {

		return Transaction_button_core_7183;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenance_button_core_7183;

	public WebElement Maintenance_button_core_7183() {

		return Maintenance_button_core_7183;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Trx_code_core_7183;

	public WebElement Trx_code_core_7183() {

		return Trx_code_core_7183;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']")
	private WebElement search_trx_code_core_7183;

	public WebElement search_trx_code_core_7183() {
		return search_trx_code_core_7183;
	}

	@FindBy(xpath = "//span[text()='Amend Standing Order']")
	private WebElement CSM_AmendSO_7183;

	public WebElement CSM_AmendSO_7183() {
		return CSM_AmendSO_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_TransactionCode_under_AmendSO_7183;

	public WebElement CSM_TransactionCode_under_AmendSO_7183() {
		return CSM_TransactionCode_under_AmendSO_7183;
	}

	@FindBy(xpath = "//span[text()='Stop Standing Order']")
	private WebElement CSM_StopSO_7183;

	public WebElement CSM_StopSO_7183() {
		return CSM_StopSO_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001SS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_TransactionCode_under_StopSO_7183;

	public WebElement CSM_TransactionCode_under_StopSO_7183() {
		return CSM_TransactionCode_under_StopSO_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_TransactionCode_under_ReactivateSO_7183;

	public WebElement CSM_TransactionCode_under_ReactivateSO_7183() {
		return CSM_TransactionCode_under_ReactivateSO_7183;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_OkBtn_StaffMember_7183;

	public WebElement CSM_OkBtn_StaffMember_7183() {
		return CSM_OkBtn_StaffMember_7183;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement CSM_DAC_BranchCode_7183;

	public WebElement CSM_DAC_BranchCode_7183() {
		return CSM_DAC_BranchCode_7183;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement CSM_DAC_GLCode_7183;

	public WebElement CSM_DAC_GLCode_7183() {
		return CSM_DAC_GLCode_7183;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement CSM_DAC_CIFCode_7183;

	public WebElement CSM_DAC_CIFCode_7183() {
		return CSM_DAC_CIFCode_7183;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement CSM_DAC_SerialNo_7183;

	public WebElement CSM_DAC_SerialNo_7183() {
		return CSM_DAC_SerialNo_7183;
	}

	// button[@id='trxMgntSaveBtn_D001MT']
	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement CSM_SaveButton_Under_Transaction_7183;

	public WebElement CSM_SaveButton_Under_Transaction_7183() {
		return CSM_SaveButton_Under_Transaction_7183;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_7183;

	public WebElement getTransactionNumber_7183() {
		return getTransactionNumber_7183;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu_7183;

	public WebElement CSMOkButtonInSuccessPopUpMenu_7183() {
		return CSM_OkButtonInSuccessPopUpMenu_7183;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.VALUE_DATE'] ")
	private WebElement CSM_Transaction_maintanance_StartingDate_7183;

	public WebElement CSM_Transaction_maintanance_StartingDate_7183() {
		return CSM_Transaction_maintanance_StartingDate_7183;
	}

	@FindBy(xpath = "//a[@id='D001AU']")
	private WebElement Transactions_Approvescrn_7183;

	public WebElement Transactions_Approvescrn_7183() {
		return Transactions_Approvescrn_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValues_7183;

	public WebElement Transactions_transactionNo_codeValues_7183()

	{
		return Transactions_transactionNo_codeValues_7183;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_Doubleclk_7183;

	public WebElement Transactions_transactionNo_Doubleclk_7183() {
		return Transactions_transactionNo_Doubleclk_7183;
	}

	@FindBy(xpath = "//span[contains(text(),'Approve ')]/parent::button")
	private WebElement Transactions_Approvebtn_7183;

	public WebElement Transactions_Approvebtn_7183() {
		return Transactions_Approvebtn_7183;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AS_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_TransactionCode_DoubleClk_under_AmendSO_7183;

	public WebElement CSM_TransactionCode_DoubleClk_under_AmendSO_7183()

	{
		return CSM_TransactionCode_DoubleClk_under_AmendSO_7183;
	}

	@FindBy(xpath = "//button[@id='submit_915287257']")
	private WebElement CSM_AmendSOButton_under_AmendSO_7183;

	public WebElement CSM_AmendSOButton_under_AmendSO_7183()

	{
		return CSM_AmendSOButton_under_AmendSO_7183;
	}

	@FindBy(xpath = "//span[text()='To Be Stopped  Standing Order']")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder_7183;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder_7183() {
		return CSM_Transaction_ToBeStopedStandingOrder_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TS_gs_statusDesc']")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_7183;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_7183() {
		return CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_7183;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001TS']")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick_7183;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick_7183() {
		return CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick_7183;
	}

	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001TS']")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick_Reason_7183;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick_Reason_7183() {
		return CSM_Transaction_ToBeStopedStandingOrder_TransactionNoInput_Doubleclick_Reason_7183;
	}

	@FindBy(xpath = "//span[contains(text(),' to Stop SO ')]")
	private WebElement CSM_Transaction_ToBeStopedStandingOrder_ToStopSOButton_7183;

	public WebElement CSM_Transaction_ToBeStopedStandingOrder_ToStopSOButton_7183() {
		return CSM_Transaction_ToBeStopedStandingOrder_ToStopSOButton_7183;
	}

	@FindBy(xpath = "//span[text()='Stop Standing Order']")
	private WebElement CSM_Transaction_StopStandingOrder_7183;

	public WebElement CSM_Transaction_StopStandingOrder_7183() {
		return CSM_Transaction_StopStandingOrder_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001SS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_StopStandingOrder_TransactionNO_7183;

	public WebElement CSM_Transaction_StopStandingOrder_TransactionNO_7183() {
		return CSM_Transaction_StopStandingOrder_TransactionNO_7183;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001SS']")
	private WebElement CSM_Transaction_StopStandingOrder_TransactionNO_DoubleClick_7183;

	public WebElement CSM_Transaction_StopStandingOrder_TransactionNO_DoubleClick_7183() {
		return CSM_Transaction_StopStandingOrder_TransactionNO_DoubleClick_7183;
	}

	@FindBy(xpath = "//span[contains(text(),' Stop SO ')]")
	private WebElement CSM_Transaction_StopStandingOrder_StopSObutton_7183;

	public WebElement CSM_Transaction_StopStandingOrder_StopSObutton_7183() {
		return CSM_Transaction_StopStandingOrder_StopSObutton_7183;

	}

	@FindBy(xpath = "//td[text()='Stopped']")
	private WebElement CSM_Transaction_Maintanance_SearchButton_VerifyStoppedStatus_7183;

	public WebElement CSM_Transaction_Maintanance_SearchButton_VerifyStoppedStatus_7183() {
		return CSM_Transaction_Maintanance_SearchButton_VerifyStoppedStatus_7183;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement CSM_Transaction_Maintanance_SearchButton_7183;

	public WebElement CSM_Transaction_Maintanance_SearchButton_7183() {
		return CSM_Transaction_Maintanance_SearchButton_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_Maintanance_SearchButton_Input_7183;

	public WebElement CSM_Transaction_Maintanance_SearchButton_Input_7183() {
		return CSM_Transaction_Maintanance_SearchButton_Input_7183;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001SS_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_TCDoubleClick_under_Stop_7183;

	public WebElement CSM_TCDoubleClick_under_Stop_7183() {
		return CSM_TCDoubleClick_under_Stop_7183;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001TS_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_TCDoubleClick_under_TobeStopped_7183;

	public WebElement CSM_TCDoubleClick_under_TobeStopped_7183() {
		return CSM_TCDoubleClick_under_TobeStopped_7183;
	}

	@FindBy(xpath = "//span[text()='Reactivate Standing Order']")
	private WebElement CSM_Transaction_ReactivateStandingOrder_7183;

	public WebElement CSM_Transaction_ReactivateStandingOrder_7183() {
		return CSM_Transaction_ReactivateStandingOrder_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_ReactivateStandingOrder_TransactionInput_7183;

	public WebElement CSM_Transaction_ReactivateStandingOrder_TransactionInput_7183() {
		return CSM_Transaction_ReactivateStandingOrder_TransactionInput_7183;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001RS']")
	private WebElement CSM_Transaction_ReactivateStandingOrder_TransactionInput_DoubleClick_7183;

	public WebElement CSM_Transaction_ReactivateStandingOrder_TransactionInput_DoubleClick_7183() {
		return CSM_Transaction_ReactivateStandingOrder_TransactionInput_DoubleClick_7183;
	}

	@FindBy(xpath = "//span[contains(text(),' Reactivate SO ')]")
	private WebElement CSM_Transaction_ReactivateStandingOrder__ReactivateStandingOrderbutton_7183;

	public WebElement CSM_Transaction_ReactivateStandingOrder__ReactivateStandingOrderbutton_7183() {
		return CSM_Transaction_ReactivateStandingOrder__ReactivateStandingOrderbutton_7183;
	}

	@FindBy(xpath = "//span[text()='Approve Reactivate Standing Order']")
	private WebElement CSM_Transaction_ApproveReactivateStandingOrder_7183;

	public WebElement CSM_Transaction_ApproveReactivateStandingOrder_7183() {
		return CSM_Transaction_ApproveReactivateStandingOrder_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001ARS_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput_7183;

	public WebElement CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput_7183() {
		return CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput_7183;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001ARS']")
	private WebElement CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput_DoubleClick_7183;

	public WebElement CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput_DoubleClick_7183() {
		return CSM_Transaction_ApproveReactivateStandingOrder_TransactionTypeInput_DoubleClick_7183;
	}

	@FindBy(xpath = "//span[contains(text(),' Apply Reactivate SO ')]")
	private WebElement CSM_Transaction_ApproveReactivateStandingOrder_ApplyReactivateSO_7183;

	public WebElement CSM_Transaction_ApproveReactivateStandingOrder_ApplyReactivateSO_7183() {
		return CSM_Transaction_ApproveReactivateStandingOrder_ApplyReactivateSO_7183;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001RS_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_TCDoubleclk_under_ReactivateSO_7183;

	public WebElement CSM_TCDoubleclk_under_ReactivateSO_7183() {
		return CSM_TCDoubleclk_under_ReactivateSO_7183;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001RS_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_TCDoubleclk_under_ApproveReactivateSO_7183;

	public WebElement CSM_TCDoubleclk_under_ApproveReactivateSO_7183() {
		return CSM_TCDoubleclk_under_ApproveReactivateSO_7183;
	}

	@FindBy(xpath = "//span[text()='To Be Closed Standing Order']")
	private WebElement CSM_Transaction_ToBeCLosedField_7183;

	public WebElement CSM_Transaction_ToBeCLosedField_7183() {
		return CSM_Transaction_ToBeCLosedField_7183;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001TCL']")
	private WebElement CSM_Transaction_ToBeCLosedField_SearchBtn_7183;

	public WebElement CSM_Transaction_ToBeCLosedField_SearchBtn_7183() {
		return CSM_Transaction_ToBeCLosedField_SearchBtn_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TCL_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_ToBeCLosedField_InputCode_7183;

	public WebElement CSM_Transaction_ToBeCLosedField_InputCode_7183() {
		return CSM_Transaction_ToBeCLosedField_InputCode_7183;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001TCL']")
	private WebElement CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick_7183;

	public WebElement CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick_7183() {
		return CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick_7183;
	}

	@FindBy(xpath = "//textarea[@name='trxMgntCO.statusReason']")
	private WebElement CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick_Reason_7183;

	public WebElement CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick_Reason_7183() {
		return CSM_Transaction_ToBeCLosedField_InputCode_DoubleClick_Reason_7183;
	}

	@FindBy(xpath = "//span[contains(text(),' To Close SO ')]//parent::button")
	private WebElement CSM_Transaction_ToBeCLosedField_TOCloseButton_7183;

	public WebElement CSM_Transaction_ToBeCLosedField_TOCloseButton_7183() {
		return CSM_Transaction_ToBeCLosedField_TOCloseButton_7183;
	}

	@FindBy(xpath = "//span[text()='Close Standing Order']")
	private WebElement CSM_Transaction_CloseStandingOrder_7183;

	public WebElement CSM_Transaction_CloseStandingOrder_7183() {
		return CSM_Transaction_CloseStandingOrder_7183;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001CL']")
	private WebElement CSM_Transaction_CloseStandingOrder_Search_7183;

	public WebElement CSM_Transaction_CloseStandingOrder_Search_7183() {
		return CSM_Transaction_CloseStandingOrder_Search_7183;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001CL_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_7183;

	public WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_7183() {
		return CSM_Transaction_CloseStandingOrder_Search_Inputfield_7183;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001CL']")
	private WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick_7183;

	public WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick_7183() {
		return CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick_7183;
	}

	@FindBy(xpath = "//span[contains(text(),' Close SO ')]")
	private WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick_CloseButton_7183;

	public WebElement CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick_CloseButton_7183() {
		return CSM_Transaction_CloseStandingOrder_Search_Inputfield_DoubleClick_CloseButton_7183;
	}

	@FindBy(xpath = "//td[text()='Closed so'] ")
	private WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCloseStatus_7183;

	public WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCloseStatus_7183() {
		return CSM_Transaction_Maintanance_SearchButton_VerifyCloseStatus_7183;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001TCL_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_TCDoubleclk_under_TobeClosedSO_7183;

	public WebElement CSM_TCDoubleclk_under_TobeClosedSO_7183() {
		return CSM_TCDoubleclk_under_TobeClosedSO_7183;
	}

	@FindBy(xpath = "//button[@id='submit_1525167895']")
	private WebElement Submit_Amend_Standing_order_7183;

	public WebElement Submit_Amend_Standing_order_7183() {
		return Submit_Amend_Standing_order_7183;
	}

	@FindBy(xpath = "//td[text()='Created']")
	private WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCreatedStatus_7183;

	public WebElement CSM_Transaction_Maintanance_SearchButton_VerifyCreatedStatus_7183() {
		return CSM_Transaction_Maintanance_SearchButton_VerifyCreatedStatus_7183;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_7183;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu_7183() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_7183;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement CSM_CurrencyNumber_underTransactons_7183;

	public WebElement CSM_CurrencyNumber_underTransactons_7183() {

		return CSM_CurrencyNumber_underTransactons_7183;
	}

	// _popup_path_sol_confirm_ok
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Okbutton_popupmsg_7183;

	public WebElement CSM_Okbutton_popupmsg_7183() {
		return CSM_Okbutton_popupmsg_7183;
	}

	// input[@id='trs_ac_cy_D001MT']
	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement CSM_CurrencyColumn_core_7183;

	public WebElement CSM_CurrencyColumn_core_7183() {

		return CSM_CurrencyColumn_core_7183;
	}

	// 59 sprint test objects

	@FindBy(xpath = "(//div[@class='collapsibleContainerTitle ui-state-focus ui-corner-top'])[1]")
	private WebElement click_maindetails;

	public WebElement click_maindetails() {
		return click_maindetails;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_filer_non_filer_allowed_trx_currencies_key']")
	private WebElement click_filler_and_nonfiller;

	public WebElement click_filler_and_nonfiller() {
		return click_filler_and_nonfiller;
	}

	@FindBy(xpath = "(//span[@class='ui-button-text'])[35]")
	private WebElement click_okbtn_in_fillerandnonfiller;

	public WebElement click_okbtn_in_fillerandnonfiller() {
		return click_okbtn_in_fillerandnonfiller;
	}

	@FindBy(xpath = "(//span[@class='ui-button-text'])[26]")
	private WebElement clickOKinamountinmaintenancescreenintransactions381;

	public WebElement clickOKinamountinmaintenancescreenintransactions381() {
		return clickOKinamountinmaintenancescreenintransactions381;
	}

	@FindBy(xpath = "//input[@id='forbid_multi_cif_trx_P024MA']")
	private WebElement checkForbidMultipleCIFinTransactionScreen;

	public WebElement checkForbidMultipleCIFinTransactionScreen() {
		return checkForbidMultipleCIFinTransactionScreen;
	}

	@FindBy(xpath = "(//div[@class='collapsibleContainerTitle ui-state-focus ui-corner-top'])[5]")
	private WebElement clickStandingorderdropdown;

	public WebElement clickStandingorderdropdown() {
		return clickStandingorderdropdown;
	}

	@FindBy(xpath = "//input[@id='standing_order_P024MA']")
	private WebElement checkStandingorderflag;

	public WebElement checkStandingorderflag() {
		return checkStandingorderflag;
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

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Transaction_Type_csm_param;

	public WebElement Transaction_Type_csm_param() {
		return Transaction_Type_csm_param;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Warning_Okbtnn;

	public WebElement WarningOkbtnn() {
		return Warning_Okbtnn;
	}

	@FindBy(xpath = "//a[@id='P024MA']")
	private WebElement UpdateAfterCodeparam;

	public WebElement UpdateAfterCodeparam() {
		return UpdateAfterCodeparam;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Code_inUpdateAfterCodeparam;

	public WebElement Code_inUpdateAfterCodeparam() {
		return Code_inUpdateAfterCodeparam;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement ClicktheCode_inUpdateAfterCodeparam;

	public WebElement ClicktheCode_inUpdateAfterCodeparam() {
		return ClicktheCode_inUpdateAfterCodeparam;
	}

	@FindBy(xpath = "//input[@id='cc_maintain_serial_no_P024MA']")
	private WebElement ChecktheChequeValidityWD;

	public WebElement ChecktheChequeValidityWD() {
		return ChecktheChequeValidityWD;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement ClicktheUpdateAfterApprove;

	public WebElement ClicktheUpdateAfterApprove() {
		return ClicktheUpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement ConfromOKSavebutton;

	public WebElement ConfromOKSavebutton() {
		return ConfromOKSavebutton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement OkSuccessPopupmsg;

	public WebElement OkSuccessPopupmsg() {
		return OkSuccessPopupmsg;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement ApproveTransactiontype;

	public WebElement ApproveTransactiontype() {
		return ApproveTransactiontype;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement CodeinApproveScreen;

	public WebElement CodeinApproveScreen() {
		return CodeinApproveScreen;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement CodeDoubleclickinApproveScreen;

	public WebElement CodeDoubleclickinApproveScreen() {
		return CodeDoubleclickinApproveScreen;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement ApproveBtninApproveScreen;

	public WebElement ApproveBtninApproveScreen() {
		return ApproveBtninApproveScreen;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement oKPopupinconfrom;

	public WebElement oKPopupinconfrom() {
		return oKPopupinconfrom;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.CC_MAINTAIN_SERIAL_NO']")
	private WebElement Check_cheque_validityduringWDflagmustbeinuncheck;

	public WebElement Check_cheque_validityduringWDflagmustbeinuncheck() {
		return Check_cheque_validityduringWDflagmustbeinuncheck;
	}

	//////////////////// Object for csmcore //////////////////////////

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

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement CodeTrxtypeinMaintanceCsmcore;

	public WebElement CodeTrxtypeinMaintanceCsmcore() {
		return CodeTrxtypeinMaintanceCsmcore;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement Currencycodein_Maintancecsmcore;

	public WebElement Currencycodein_Maintancecsmcore() {
		return Currencycodein_Maintancecsmcore;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Glcodein_Maintancecsmcore;

	public WebElement Glcodein_Maintancecsmcore() {
		return Glcodein_Maintancecsmcore;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Cifcodein_Maintancecsmcore;

	public WebElement Cifcodein_Maintancecsmcore() {
		return Cifcodein_Maintancecsmcore;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Serialcodein_Maintancecsmcore;

	public WebElement Serialcodein_Maintancecsmcore() {
		return Serialcodein_Maintancecsmcore;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Currencyin_Maintancecsmcore;

	public WebElement Currencyin_Maintancecsmcore() {
		return Currencyin_Maintancecsmcore;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Amountin_Maintancecsmcore;

	public WebElement Amountin_Maintancecsmcore() {
		return Amountin_Maintancecsmcore;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.CHQ_NUM']")
	private WebElement chequeNumin_Maintancecsmcore;

	public WebElement chequeNumin_Maintancecsmcore() {
		return chequeNumin_Maintancecsmcore;
	}

	@FindBy(xpath = "(//span[@class='ui-button-text'])[25]")
	private WebElement saveBtninmaintanceintransactioncsmcore;

	public WebElement saveBtninmaintanceintransactioncsmcore() {
		return saveBtninmaintanceintransactioncsmcore;
	}

	/////////////////// objects for @CHTR_P2_069 csm param

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

	@FindBy(xpath = "//input[@id='no_clearing_entries_O001UP']")
	private WebElement Click_the_flag_No_Clearing_Entries_Central_Bank;

	public WebElement Click_the_flag_No_Clearing_Entries_Central_Bank() {
		return Click_the_flag_No_Clearing_Entries_Central_Bank;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement update_after_approve_button_in_control_record_submenu69_of_system_parameter;

	public WebElement update_after_approve_button_in_control_record_submenu69_of_system_parameter() {
		return update_after_approve_button_in_control_record_submenu69_of_system_parameter;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement appprove_submenu_of_control_record69;

	public WebElement appprove_submenu_of_control_record69() {
		return appprove_submenu_of_control_record69;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement approve_button_in_control_record69_submenu_of_system_parameter;

	public WebElement approve_button_in_control_record69_submenu_of_system_parameter() {
		return approve_button_in_control_record69_submenu_of_system_parameter;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Transaction_type_submenu_of_systemparameter;

	public WebElement Transaction_type_submenu_of_systemparameter() {
		return Transaction_type_submenu_of_systemparameter;
	}

	// span[text()='Update After Approve'])[2]
	@FindBy(xpath = "//span[text()='Update After Approve'])[2]")
	private WebElement update_after_approve_submenu_of_transaction_type;

	public WebElement update_after_approve_submenu_of_transaction_type() {
		return update_after_approve_submenu_of_transaction_type;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement enter_code_in_update_after_approve_submenu_of_transaction_type;

	public WebElement enter_code_in_update_after_approve_submenu_of_transaction_type() {
		return enter_code_in_update_after_approve_submenu_of_transaction_type;
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

	@FindBy(xpath = "(//span[text()='Approve'])[2]")
	private WebElement the_approve_submenu_of_transaction_type;

	public WebElement the_approve_submenu_of_transaction_type() {
		return the_approve_submenu_of_transaction_type;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement enter_code_in_approve_submenu_of_transaction_type;

	public WebElement enter_code_in_approve_submenu_of_transaction_type() {
		return enter_code_in_approve_submenu_of_transaction_type;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement double_click_the_code_in_approve_submenu_of_transaction_type;

	public WebElement double_click_the_code_in_approve_submenu_of_transaction_type() {
		return double_click_the_code_in_approve_submenu_of_transaction_type;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement approve_button_in_approve_submenu_of_transaction_type;

	public WebElement approve_button_in_approve_submenu_of_transaction_type() {
		return approve_button_in_approve_submenu_of_transaction_type;
	}

	/////////////////// objects for @CHTR_P2_069_CR csm Core

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement click_the_Transactions69CR;

	public WebElement click_the_Transactions69CR() {
		return click_the_Transactions69CR;
	}

//										@FindBy(xpath ="//td[text()='Transactions']")
//										private WebElement   click_the_Transactions69CR;
	//
//										public WebElement enter_code in approve submenu of transaction type() {
//											return  enter code in approve submenu of transaction type;
//										}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement click_the_Maintenace_submenu_of_Transaction69CR;

	public WebElement click_the_Maintenace_submenu_of_Transaction69CR() {
		return click_the_Maintenace_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement enter_TRXType_press_tab_in_Maintenance_submenu_of_Transaction69CR;

	public WebElement enter_TRXType_press_tab_in_Maintenance_submenu_of_Transaction69CR() {
		return enter_TRXType_press_tab_in_Maintenance_submenu_of_Transaction69CR;
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

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approve_in_submenu_of_Transaction69CR;

	public WebElement Approve_in_submenu_of_Transaction69CR() {
		return Approve_in_submenu_of_Transaction69CR;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement enter_Transaction_code_in_Approve_in_submenu_of_Transaction69CR;

	public WebElement enter_Transaction_code_in_Approve_in_submenu_of_Transaction69CR() {
		return enter_Transaction_code_in_Approve_in_submenu_of_Transaction69CR;
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

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AC_gs_ctstrsVO.TRS_NO']")
	private WebElement enter_the_Transaction_number_in_Apply_to_clear_Inward_Cheques_in_submenu_of_Transaction69CR;

	public WebElement enter_the_Transaction_number_in_Apply_to_clear_Inward_Cheques_in_submenu_of_Transaction69CR() {
		return enter_the_Transaction_number_in_Apply_to_clear_Inward_Cheques_in_submenu_of_Transaction69CR;
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

	/////////////////// @CHTR_P2_071_CR

	@FindBy(xpath = "//td[text()='Multi Cheques Entry']")
	private WebElement click_MultiChequesEntry;

	public WebElement click_MultiChequesEntry() {
		return click_MultiChequesEntry;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement click_MaintenanceinMultiChequesEntry;

	public WebElement click_MaintenanceinMultiChequesEntry() {
		return click_MaintenanceinMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001CEMT']")
	private WebElement TrxTypeinMaintenanceinMultiChequesEntry;

	public WebElement TrxTypeinMaintenanceinMultiChequesEntry() {
		return TrxTypeinMaintenanceinMultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement Branchcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement Branchcode_in_Maintenance_in_MultiChequesEntry() {
		return Branchcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
	private WebElement Currencycode_in_Maintenance_in_MultiChequesEntry;

	public WebElement Currencycode_in_Maintenance_in_MultiChequesEntry() {
		return Currencycode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_GL']")
	private WebElement GLcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement GLcode_in_Maintenance_in_MultiChequesEntry() {
		return GLcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CIFcode_in_Maintenance_in_MultiChequesEntry;

	public WebElement CIFcode_in_Maintenance_in_MultiChequesEntry() {
		return CIFcode_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_SL']")
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

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement EnterAmount_in_Maintenance_in_MultiChequesEntry;

	public WebElement EnterAmount_in_Maintenance_in_MultiChequesEntry() {
		return EnterAmount_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.CHQ_NUM']")
	private WebElement EnterChequeNumber_in_Maintenance_in_MultiChequesEntry;

	public WebElement EnterChequeNumber_in_Maintenance_in_MultiChequesEntry() {
		return EnterChequeNumber_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[3]")
	private WebElement ClickSave_in_Maintenance_in_MultiChequesEntry;

	public WebElement ClickSave_in_Maintenance_in_MultiChequesEntry() {
		return ClickSave_in_Maintenance_in_MultiChequesEntry;
	}

	@FindBy(xpath = "(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[1]")
	private WebElement Cickproceed_in_Maintenance_in_MultiChequesEntry;

	public WebElement Cickproceed_in_Maintenance_in_MultiChequesEntry() {
		return Cickproceed_in_Maintenance_in_MultiChequesEntry;
	}

	////////////////////// @CHTR_P2_072_CR

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement ClickApproveinMultiChequesEntry;

	public WebElement ClickApproveinMultiChequesEntry() {
		return ClickApproveinMultiChequesEntry;
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

////////////////										 @CHTR_P2_180_CR2  core objects

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

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
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

	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_D001MT_1_alertsParamCO.userId']")
	private WebElement click_the_Account_in_the_Alert_popup;

	public WebElement click_the_Account_in_the_Alert_popup() {
		return click_the_Account_in_the_Alert_popup;

	}

	///// @CHTR_P2_180_CR3

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo_7181;

	public WebElement BMUserAlertEnterTRXNo_7181() {
		return BMUser_Alert_EnterTRXNo_7181;
	}

	@FindBy(xpath = "//input[@id='jqg_trsAckTOutAlertGrid_Id_RCVALERT_1']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_7181;

	public WebElement BMUserAlertEnterTRXNoselectRecord_7181() {
		return BMUser_Alert_EnterTRXNo_selectRecord_7181;
	}

	@FindBy(xpath = "//a[@id='openBut_RCVALERT']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_7181;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_7181() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_7181;
	}

	@FindBy(xpath = "//textarea[@name='trxMgntCO.statusReason']")
	private WebElement enterRejectReasonincore;

	public WebElement enterRejectReasonincore() {
		return enterRejectReasonincore;
	}

	@FindBy(xpath = "//label[@id='Reject_Key']")
	private WebElement clickrejectbuttonincore;

	public WebElement clickrejectbuttonincore() {
		return clickrejectbuttonincore;
	}

	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement clickapprovebuttonincore;

	public WebElement clickapprovebuttonincore() {
		return clickapprovebuttonincore;
	}

	@FindBy(xpath = "//label[@id='dismiss']")
	private WebElement clickdismissbuttonincoren;

	public WebElement clickdismissbuttonincoren() {
		return clickdismissbuttonincoren;
	}

	//// @CHTR_P2_181_CR3
	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_7181;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey_7181() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_7181;
	}

	///////////////// @CHTR_P2_271 param

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement check_ForceOverdraw;

	public WebElement check_ForceOverdraw() {
		return check_ForceOverdraw;
	}

	@FindBy(xpath = "(//div[@class=\"collapsibleContainerTitle ui-state-focus ui-corner-top\"])[1]")
	private WebElement Enter_Maintenance_details;

	public WebElement Enter_Maintenance_details() {
		return Enter_Maintenance_details;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement uncheck_theproceedonInsufficientFund;

	public WebElement uncheck_theproceedonInsufficientFund() {
		return uncheck_theproceedonInsufficientFund;
	}

	@FindBy(xpath = "//input[@id='apply_tva_C0011MA']")
	private WebElement uncheck_theApplyonwat;

	public WebElement uncheck_theApplyonwat() {
		return uncheck_theApplyonwat;
	}

	@FindBy(xpath = "//select[@name='transactiontypesCO.ctstrxtypeVO.CHQ_RELATED']")
	private WebElement click_HouseChequeinChequeDropdown;

	public WebElement click_HouseChequeinChequeDropdown() {
		return click_HouseChequeinChequeDropdown;
	}

	// csm core p2_284

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

	///////// @CHTR_P2_141
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Parameters_7181;

	public WebElement Parameters_7181() {
		return Parameters_7181;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement Parameters_SystemParameters_7181;

	public WebElement Parameters_SystemParameters_7181() {
		return Parameters_SystemParameters_7181;
	}

	@FindBy(xpath = "//td[text()='Charges']")
	private WebElement Parameters_SystemParameters_Charges_7181;

	public WebElement Parameters_SystemParameters_Charges_7181() {
		return Parameters_SystemParameters_Charges_7181;
	}

	@FindBy(xpath = "//td[text()='Maintenance of Charges']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_7181;
	}

	@FindBy(xpath = "//a[@id='C0011MA']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_7181;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code_7181;
	}

	@FindBy(xpath = "//input[@id='amount_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount_7181;
	}

	@FindBy(xpath = "//input[@id='allow_modify_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_7181;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn_7181;
	}

	@FindBy(xpath = "//a[@id='C0011P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_7181;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_7181;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011P_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn_7181;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn_7181() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn_7181;
	}

	@FindBy(xpath = "//td[text()='Reasons']")
	private WebElement Parameters_SystemParameters_Reason_7181;

	public WebElement Parameters_SystemParameters_Reason_7181() {
		return Parameters_SystemParameters_Reason_7181;
	}

	@FindBy(xpath = "//a[@id='P0032MA']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_7181;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_7181() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_7181;
	}

	@FindBy(xpath = "//input[@id='reasonsList_GridTbl_Id_P0032MA_gs_ctsreasonsVO.CODE']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_Code_7181;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_Code_7181() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_Code_7181;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_charges_schema_P0032MA']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema_7181;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema_7181() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema_7181;
	}

	@FindBy(xpath = "//input[@id='deduct_avail_charges_P0032MA']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge_7181;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge_7181() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge_7181;
	}

	@FindBy(xpath = "//label[@id='reasonsMaint_FormId_P0032MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_7181;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_7181() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_7181;
	}

	@FindBy(xpath = "//a[@id='P0032P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_Reason_Approve_7181;

	public WebElement Parameters_SystemParameters_Reason_Approve_7181() {
		return Parameters_SystemParameters_Reason_Approve_7181;
	}

	@FindBy(xpath = "//input[@id='reasonsList_GridTbl_Id_P0032P_gs_ctsreasonsVO.CODE']")
	private WebElement Parameters_SystemParameters_Reason_Approve_Code_7181;

	public WebElement Parameters_SystemParameters_Reason_Approve_Code_7181() {
		return Parameters_SystemParameters_Reason_Approve_Code_7181;
	}

	@FindBy(xpath = "//label[@id='reasonsMaint_FormId_P0032P_Approve_key']")
	private WebElement Parameters_SystemParameters_Reason_Approve_ApproveBtn_7181;

	public WebElement Parameters_SystemParameters_Reason_Approve_ApproveBtn_7181() {
		return Parameters_SystemParameters_Reason_Approve_ApproveBtn_7181;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Parameters_SystemParameters_TransactionType_7181;

	public WebElement Parameters_SystemParameters_TransactionType_7181() {
		return Parameters_SystemParameters_TransactionType_7181;
	}

	@FindBy(xpath = "//a[@id='P024MA']/span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_7181;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_7181() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_7181;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code_7181;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code_7181() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code_7181;
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

	@FindBy(xpath = "//a[@id='P024P']/span[text()='Approve']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_7181;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_7181() {
		return Parameters_SystemParameters_TransactionType_Approve_7181;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_Code_7181;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_Code_7181() {
		return Parameters_SystemParameters_TransactionType_Approve_Code_7181;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_ApproveBtn_7181;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_ApproveBtn_7181() {
		return Parameters_SystemParameters_TransactionType_Approve_ApproveBtn_7181;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement CSM_ConfirmOk_7181;

	public WebElement CSM_ConfirmOk_7181() {
		return CSM_ConfirmOk_7181;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Ok_7181;

	public WebElement CSM_Ok_7181() {
		return CSM_Ok_7181;
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

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_BranchCode_7181;

	public WebElement Transactions_Maintenance_BranchCode_7181() {
		return Transactions_Maintenance_BranchCode_7181;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_Maintenance_CurrencyCode_7181;

	public WebElement Transactions_Maintenance_CurrencyCode_7181() {
		return Transactions_Maintenance_CurrencyCode_7181;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_GlCode_7181;

	public WebElement Transactions_Maintenance_GlCode_7181() {
		return Transactions_Maintenance_GlCode_7181;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CifCode_7181;

	public WebElement Transactions_Maintenance_CifCode_7181() {
		return Transactions_Maintenance_CifCode_7181;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_SerialNo_7181;

	public WebElement Transactions_Maintenance_SerialNo_7181() {
		return Transactions_Maintenance_SerialNo_7181;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trs_cy_D001MT']/span")
	private WebElement Transactions_Maintenance_CurrencySearch_7181;

	public WebElement Transactions_Maintenance_CurrencySearch_7181() {
		return Transactions_Maintenance_CurrencySearch_7181;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_cy_D001MT_gs_CURRENCY_CODE']")
	private WebElement Transactions_Maintenance_Currency_7181;

	public WebElement Transactions_Maintenance_Currency_7181() {
		return Transactions_Maintenance_Currency_7181;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_Maintenance_Amount_7181;

	public WebElement Transactions_Maintenance_Amount_7181() {
		return Transactions_Maintenance_Amount_7181;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement Transactions_Maintenance_ChequeNo_7181;

	public WebElement Transactions_Maintenance_ChequeNo_7181() {
		return Transactions_Maintenance_ChequeNo_7181;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_CreditBranchCode_7181;

	public WebElement Transactions_Maintenance_CreditBranchCode_7181() {
		return Transactions_Maintenance_CreditBranchCode_7181;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_CreditGlCode_7181;

	public WebElement Transactions_Maintenance_CreditGlCode_7181() {
		return Transactions_Maintenance_CreditGlCode_7181;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CreditCifCode_7181;

	public WebElement Transactions_Maintenance_CreditCifCode_7181() {
		return Transactions_Maintenance_CreditCifCode_7181;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_CreditSerialNo_7181;

	public WebElement Transactions_Maintenance_CreditSerialNo_7181() {
		return Transactions_Maintenance_CreditSerialNo_7181;
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

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Transactions_Approve_7181;

	public WebElement Transactions_Approve_7181() {
		return Transactions_Approve_7181;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Approve_Code_7181;

	public WebElement Transactions_Approve_Code_7181() {
		return Transactions_Approve_Code_7181;
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

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_Maintenance_SearchBtn_7181;

	public WebElement Transactions_Maintenance_SearchBtn_7181() {
		return Transactions_Maintenance_SearchBtn_7181;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Maintenance_TransactionNumber_7181;

	public WebElement Transactions_Maintenance_TransactionNumber_7181() {
		return Transactions_Maintenance_TransactionNumber_7181;
	}

	@FindBy(xpath = "//input[@id='current_status_D001MT']")
	private WebElement Transactions_Maintenance_Status_7181;

	public WebElement Transactions_Maintenance_Status_7181() {
		return Transactions_Maintenance_Status_7181;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement Transactions_Maintenance_SaveBtn_7181;

	public WebElement Transactions_Maintenance_SaveBtn_7181() {
		return Transactions_Maintenance_SaveBtn_7181;
	}

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement clickaccountparameters;

	public WebElement clickaccountparameters() {
		return clickaccountparameters;
	}

	@FindBy(xpath = "//td[text()='General Ledger']")
	private WebElement clickgeneralledgerinaccountparameters;

	public WebElement clickgeneralledgerinaccountparameters() {
		return clickgeneralledgerinaccountparameters;
	}

	@FindBy(xpath = "//span[text()='UPDATE AFTER APPROVE']")
	private WebElement clickUpdaterAfterApproveingeneralledgerinaccountparameters;

	public WebElement clickUpdaterAfterApproveingeneralledgerinaccountparameters() {
		return clickUpdaterAfterApproveingeneralledgerinaccountparameters;
	}

	@FindBy(xpath = "//input[@name='GL_CODE']")
	private WebElement clickEntercodeinUpdaterAfterApproveingeneralledger;

	public WebElement clickEntercodeinUpdaterAfterApproveingeneralledger() {
		return clickEntercodeinUpdaterAfterApproveingeneralledger;
	}

	@FindBy(xpath = "//td[@id='td_genLedgerParamListGridTbl_Id_P014UP_1_GL_CODE']")
	private WebElement DoubleclickEntercodeinUpdaterAfterApproveingeneralledger;

	public WebElement DoubleclickEntercodeinUpdaterAfterApproveingeneralledger() {
		return DoubleclickEntercodeinUpdaterAfterApproveingeneralledger;
	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement clickAdditionaldetailsinGeneralledger;

	public WebElement clickAdditionaldetailsinGeneralledger() {
		return clickAdditionaldetailsinGeneralledger;
	}

	@FindBy(xpath = "(//select[@class='selectCompSize ui-state-focus ui-corner-all'])[8]")
	private WebElement clickAllowoverdrawninAdditionaldetailsinGeneralledger;

	public WebElement clickAllowoverdrawninAdditionaldetailsinGeneralledger() {
		return clickAllowoverdrawninAdditionaldetailsinGeneralledger;
	}

	@FindBy(xpath = "(//span[@class='ui-button-text'])[2]")
	private WebElement clickupdatebtninGeneralledger;

	public WebElement clickupdatebtninGeneralledger() {
		return clickupdatebtninGeneralledger;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement clickApproveingeneralledgerinaccountparameters;

	public WebElement clickApproveingeneralledgerinaccountparameters() {
		return clickApproveingeneralledgerinaccountparameters;
	}

	@FindBy(xpath = "//input[@name='genLedgerParamCO.genLedgerVO.ASSIGN_NOSTRO_GL_YN']")
	private WebElement uncheckassignnatrocheckbox;

	public WebElement uncheckassignnatrocheckbox() {
		return uncheckassignnatrocheckbox;
	}

	@FindBy(xpath = "//input[@id='genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE']")
	private WebElement clickEntercodeinApproveingeneralledger;

	public WebElement clickEntercodeinApproveingeneralledger() {
		return clickEntercodeinApproveingeneralledger;
	}

	@FindBy(xpath = "//td[@id='td_genLedgerParamListGridTbl_Id_P014P_1_ADDITIONAL_REFERENCE']")
	private WebElement DoubleclickEntercodeinApproveingeneralledger;

	public WebElement DoubleclickEntercodeinApproveingeneralledger() {
		return DoubleclickEntercodeinApproveingeneralledger;
	}

	@FindBy(xpath = "(//span[@class='ui-button-text'])[2]")
	private WebElement clickApprovebtninGeneralledger;

	public WebElement clickApprovebtninGeneralledger() {
		return clickApprovebtninGeneralledger;
	}

	@FindBy(xpath = "(//span[@class='ui-button-text'])[2]")
	private WebElement csm_CodeUAA_MOC_Charges_81;

	public WebElement csm_CodeUAA_MOC_Charges_81() {
		return csm_CodeUAA_MOC_Charges_81;
	}

	@FindBy(xpath = "//input[@id='dflt_starting_dt_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
		return CSM_OkButtonInAccessDeniedPopUpMenu;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice;

	public WebElement ClosePopupmsg_frontoffice() {
		return ClosePopupmsg_frontoffice;
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

	@FindBy(xpath = "//td[text()='Recording of Remittance']")
	private WebElement Remittance_recording_CW;

	public WebElement Remittance_recording_CW() {
		return Remittance_recording_CW;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenance_Remittance_recording_CW;

	public WebElement Maintenance_Remittance_recording_CW() {
		return Maintenance_Remittance_recording_CW;
	}

	@FindBy(xpath = "//span[text()='To Be Damaged']")
	private WebElement Tobe_Damaged_Remittance_recording_CW;

	public WebElement Tobe_Damaged_Remittance_recording_CW() {
		return Tobe_Damaged_Remittance_recording_CW;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Apporve_button_Remittance_recording_CW;

	public WebElement Apporve_button_Remittance_recording_CW() {
		return Apporve_button_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_vaultLookup_RRTMT']")
	private WebElement Vaultlook_Remittance_recording_CW;

	public WebElement Vaultlook_Remittance_recording_CW() {
		return Vaultlook_Remittance_recording_CW;
	}

	@FindBy(xpath = "//select[@id='REMITT_TYPE_RRTMT']")
	private WebElement RemittanceType_Remittance_recording_CW;

	public WebElement RemittanceType_Remittance_recording_CW() {
		return RemittanceType_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_remittanceTypeLookup_RRTMT']")
	private WebElement TCType_Remittance_recording_CW;

	public WebElement TCType_Remittance_recording_CW() {
		return TCType_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyLookup_RRTMT']")
	private WebElement CurrencyValue_Remittance_recording_CW;

	public WebElement CurrencyValue_Remittance_recording_CW() {
		return CurrencyValue_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='SEQUENCE_FR_RRTMT']")
	private WebElement Sequence_From_Remittance_recording_CW;

	public WebElement Sequence_From_Remittance_recording_CW() {
		return Sequence_From_Remittance_recording_CW;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTMT_btn_save']")
	private WebElement SaveButton_Remittance_recording_CW;

	public WebElement SaveButton_Remittance_recording_CW() {
		return SaveButton_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE']")
	private WebElement RemittanceType_Approve_Remittance_recording_CW;

	public WebElement RemittanceType_Approve_Remittance_recording_CW() {
		return RemittanceType_Approve_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_RECEIVED_DATE']")
	private WebElement Remittance_date_Remittance_recording_CW;

	public WebElement Remittance_date_Remittance_recording_CW() {
		return Remittance_date_Remittance_recording_CW;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTP_1_RECEIVED_DATE']")
	private WebElement DoubleClick_Approve_Remittance_recording_CW;

	public WebElement DoubleClick_Approve_Remittance_recording_CW() {
		return DoubleClick_Approve_Remittance_recording_CW;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTP_Approve_key']")
	private WebElement Submit_Approve_Remittance_recording_CW;

	public WebElement Submit_Approve_Remittance_recording_CW() {
		return Submit_Approve_Remittance_recording_CW;
	}

	@FindBy(xpath = "//select[@id='REASON_RRTDM']")
	private WebElement Tobe_Demang_Reason_Remittance_recording_CW;

	public WebElement Tobe_Demang_Reason_Remittance_recording_CW() {
		return Tobe_Demang_Reason_Remittance_recording_CW;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTDM_To_Damage_key']")
	private WebElement submit_Damage_key_Remittance_recording_CW;

	public WebElement submit_Damage_key_Remittance_recording_CW() {
		return submit_Damage_key_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_REMITTANCE_TYPE']")
	private WebElement RemittanceType_Damage_key_Remittance_recording_CW;

	public WebElement RemittanceType_Damage_key_Remittance_recording_CW() {
		return RemittanceType_Damage_key_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_RECEIVED_DATE']")
	private WebElement Date_Damage_key_Remittance_recording_CW;

	public WebElement Date_Damage_key_Remittance_recording_CW() {
		return Date_Damage_key_Remittance_recording_CW;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTDM_1_RECEIVED_DATE']")
	private WebElement Doubleclick_Damage_key_Remittance_recording_CW;

	public WebElement Doubleclick_Damage_key_Remittance_recording_CW() {
		return Doubleclick_Damage_key_Remittance_recording_CW;
	}

	@FindBy(xpath = "//a[@id='Recording of Remittance / Maintenance']")
	private WebElement CheckMaintenanceBox_Remittance_recording_CW;

	public WebElement CheckMaintenanceBox_Remittance_recording_CW() {
		return CheckMaintenanceBox_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_REMITTANCE_TYPE']")
	private WebElement CheckMaintenanceBox_RemittanceType_Remittance_recording_CW;

	public WebElement CheckMaintenanceBox_RemittanceType_Remittance_recording_CW() {
		return CheckMaintenanceBox_RemittanceType_Remittance_recording_CW;
	}

	@FindBy(xpath = "//td[@id='add_recordOfRemittanceDenomGridTbl_Id_RRTMT']")
	private WebElement AddbuttonRT_RemittanceType_Remittance_recording_CW;

	public WebElement AddbuttonRT_RemittanceType_Remittance_recording_CW() {
		return AddbuttonRT_RemittanceType_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='new_1698747005155_remittanceRecordDenomVO.SERIAL_NO']")
	private WebElement SerialNumber_RemittanceType_Remittance_recording_CW;

	public WebElement SerialNumber_RemittanceType_Remittance_recording_CW() {
		return SerialNumber_RemittanceType_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='new_1698747005155_remittanceRecordDenomVO.SEQUENCE_FR']")
	private WebElement FromNumber2_RemittanceType_Remittance_recording_CW;

	public WebElement FromNumber2_RemittanceType_Remittance_recording_CW() {
		return FromNumber2_RemittanceType_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='new_1698747005155_remittanceRecordDenomVO.SEQUENCE_TO']")
	private WebElement ToNumber2_RemittanceType_Remittance_recording_CW;

	public WebElement ToNumber2_RemittanceType_Remittance_recording_CW() {
		return ToNumber2_RemittanceType_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='new_1698747005155_remittanceRecordDenomVO.VALUE']")
	private WebElement ValueNumber_RemittanceType_Remittance_recording_CW;

	public WebElement ValueNumber_RemittanceType_Remittance_recording_CW() {
		return ValueNumber_RemittanceType_Remittance_recording_CW;
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

	@FindBy(xpath = "//span[text()='To Be Cancelled']")
	private WebElement ToBe_Cancel_Remittance_Type;

	public WebElement ToBe_Cancel_Remittance_Type() {

		return ToBe_Cancel_Remittance_Type;
	}

	@FindBy(xpath = "//label[text()='To Cancel ']")
	private WebElement SubmittedToBe_Cancel_Remittance_Type;

	public WebElement SubmittedToBe_Cancel_Remittance_Type() {

		return SubmittedToBe_Cancel_Remittance_Type;
	}

	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement ToBeDestroyed_Cancel_Remittance_Type;

	public WebElement ToBeDestroyed_Cancel_Remittance_Type() {

		return ToBeDestroyed_Cancel_Remittance_Type;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTDY_To_Destroy_key']")
	private WebElement SubmitttedToBeDestroyed_Cancel_Remittance_Type;

	public WebElement SubmitttedToBeDestroyed_Cancel_Remittance_Type() {

		return SubmitttedToBeDestroyed_Cancel_Remittance_Type;
	}

	// Standing Order
	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Transaction_Type_CSMParam;

	public WebElement Transaction_Type_CSMParam() {

		return Transaction_Type_CSMParam;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement Update_after_Approve_Standing;

	public WebElement Update_after_Approve_Standing() {

		return Update_after_Approve_Standing;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement Standing_order_Transaction_Code;

	public WebElement Standing_order_Transaction_Code() {

		return Standing_order_Transaction_Code;
	}

	@FindBy(xpath = "//input[@id='standing_order_P024MA']")
	private WebElement Standing_order_CSM_Transaction;

	public WebElement Standing_order_CSM_Transaction() {

		return Standing_order_CSM_Transaction;
	}

	
	  @FindBy(xpath = "//input[@id='so_type_P024MAP']") 
	  private WebElement periodical_Standing_order;
	  
	  public WebElement periodical_Standing_order() {
	  
	  return periodical_Standing_order; }
	 

	@FindBy(xpath = "//select[@id='so_process_type_P024MA']")
	private WebElement Processtype_standingorder;

	public WebElement Processtype_standingorder() {

		return Processtype_standingorder;
	}
	
	@FindBy(xpath = "//select[@id='so_periodicity_P024MA']")
	private WebElement periodicity_Select_Month;

	public WebElement periodicity_Select_Month() {

		return periodicity_Select_Month;
	}

	@FindBy(xpath = "//select[@id='so_period_type_P024MA']")
	private WebElement Standing_Order_Period_Type;

	public WebElement Standing_Order_Period_Type() {

		return Standing_Order_Period_Type;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement Submit_Update_After_approve;

	public WebElement Submit_Update_After_approve() {

		return Submit_Update_After_approve;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approve_Standing_order;

	public WebElement Approve_Standing_order() {

		return Approve_Standing_order;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Approve_code_Standing;

	public WebElement Approve_code_Standing() {

		return Approve_code_Standing;
	}

	@FindBy(xpath = "//select[@id='so_period_day_P024MA']")
	private WebElement Standing_Order_Period_Day_select;

	public WebElement Standing_Order_Period_Day_select() {

		return Standing_Order_Period_Day_select;
	}
	
	@FindBy(xpath = "//select[@name='transactiontypesCO.ctstrxtypeVO.SO_PERIOD_INTERVAL']")
	private WebElement Standing_Order_monthlyInterval;

	public WebElement Standing_Order_monthlyInterval() {

		return Standing_Order_monthlyInterval;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement DoubleClick_Approve_Button;

	public WebElement DoubleClick_Approve_Button() {
		return DoubleClick_Approve_Button;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement DoubleClick_Update_After_Approve_Button;

	public WebElement DoubleClick_Update_After_Approve_Button() {
		return DoubleClick_Update_After_Approve_Button;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg_Standing_Order;

	public WebElement POPupmsg_Standing_Order() {
		return POPupmsg_Standing_Order;
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

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement Double_click_Standing_order_update;

	public WebElement Double_click_Standing_order_update() {
		return Double_click_Standing_order_update;
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

	@FindBy(xpath = "//input[@id='new_1696501158380_ctstrsACCDETVO.AC_BR']")
	private WebElement CSM_Branch_code;

	public WebElement CSM_Branch_code()

	{

		return CSM_Branch_code;

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

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_GL']")
	private WebElement CSM_GLCodedebitAc;

	public WebElement CSM_GLCodedebitAc() {
		return CSM_GLCodedebitAc;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_So_Det_key']")
	private WebElement So_Details_transaction;

	public WebElement So_Details_transaction() {
		return So_Details_transaction;
	}

	@FindBy(xpath = "//span[text()='Amend Standing Order']")
	private WebElement Amend_So_Transaction;

	public WebElement Amend_So_Transaction() {
		return Amend_So_Transaction;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AS_gs_ctstrsVO.TRS_NO']")
	private WebElement Amend_So_Transaction_number_transaction;

	public WebElement Amend_So_Transaction_number_transaction() {
		return Amend_So_Transaction_number_transaction;
	}

	@FindBy(xpath = "//span[text()='Stop Standing Order']")
	private WebElement Stop_Standing_order_transaction;

	public WebElement Stop_Standing_order_transaction() {
		return Stop_Standing_order_transaction;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TS_gs_ctstrsVO.TRS_NO']")
	private WebElement To_BE_Stopped_transaction_Number_Value;

	public WebElement To_BE_Stopped_transaction_Number_Value() {
		return To_BE_Stopped_transaction_Number_Value;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RS_gs_ctstrsVO.TRS_NO']")
	private WebElement Reactive_transaction_Number;

	public WebElement Reactive_transaction_Number() {
		return Reactive_transaction_Number;
	}

	// span[text()='Reactivate Standing Order']
	@FindBy(xpath = "//span[text()='Reactivate Standing Order']")
	private WebElement Reactive_Standing_Order;

	public WebElement Reactive_Standing_Order() {
		return Reactive_Standing_Order;
	}

	@FindBy(xpath = "//span[text()='Reactivate Standing Order']")
	private WebElement CSM_Transaction_Reactivate_So;

	public WebElement CSM_Transaction_Reactivate_So() {
		return CSM_Transaction_Reactivate_So;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transaction_Number_Reactivate_So;

	public WebElement Transaction_Number_Reactivate_So() {
		return Transaction_Number_Reactivate_So;
	}

	@FindBy(xpath = "//span[contains(text(),'Reactivate SO ')]")
	private WebElement Submit_Reactivate_Standing;

	public WebElement Submit_Reactivate_Standing() {
		return Submit_Reactivate_Standing;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001RS_1_ctstrsVO.TRS_NO']")
	private WebElement Doubleclick_Reactivate_transaction;

	public WebElement Doubleclick_Reactivate_transaction() {
		return Doubleclick_Reactivate_transaction;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AS_1_ctstrsVO']")
	private WebElement Doubleclick_Amend_So_transaction;

	public WebElement Doubleclick_Amend_So_transaction() {
		return Doubleclick_Amend_So_transaction;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001SS_1_ctstrsVO.TRS_NO']")
	private WebElement Doubleclick_Stop_standing_order_transaction;

	public WebElement Doubleclick_Stop_standing_order_transaction() {
		return Doubleclick_Stop_standing_order_transaction;
	}

	@FindBy(xpath = "//td[text()='Additional Fields']")
	private WebElement Additional_Fieled_Param;

	public WebElement Additional_Fieled_Param() {
		return Additional_Fieled_Param;
	}

	@FindBy(xpath = "//input[@id='code_ADD001MT']")
	private WebElement Additional_Detials_Code_Value;

	public WebElement Additional_Detials_Code_Value() {
		return Additional_Detials_Code_Value;
	}

	@FindBy(xpath = "//select[@id='entity_ADD001MT']")
	private WebElement Entity_level_TrX_type;

	public WebElement Entity_level_TrX_type() {
		return Entity_level_TrX_type;
	}

	@FindBy(xpath = "//a[@id='trx_type_button_ADD001MT']")
	private WebElement Value_Enter_TrX_type;

	public WebElement Value_Enter_TrX_type() {
		return Value_Enter_TrX_type;
	}

	@FindBy(xpath = "//td[@id='add_tab2_GridTbl_Id_ADD001MT']")
	private WebElement Add_Button_Entity_level_TrX_type;

	public WebElement Add_Button_Entity_level_TrX_type() {
		return Add_Button_Entity_level_TrX_type;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctsAddFieldsEntityVO.ENTITY_TYPE']")
	private WebElement EnterValue_Entity_level_TrX_type_Value;

	public WebElement EnterValue_Entity_level_TrX_type_Value() {
		return EnterValue_Entity_level_TrX_type_Value;
	}

	@FindBy(xpath = "//button[@id='ok_btn_1_ADD001MT']")
	private WebElement Ok_Button_EnterValue_Entity_level_TrX_type_Value;

	public WebElement Ok_Button_EnterValue_Entity_level_TrX_type_Value() {
		return Ok_Button_EnterValue_Entity_level_TrX_type_Value;
	}

	@FindBy(xpath = "//input[@id='brief_desc_eng_ADD001MT']")
	private WebElement Brief_Name_Additional_Details;

	public WebElement Brief_Name_Additional_Details() {
		return Brief_Name_Additional_Details;
	}

	@FindBy(xpath = "//input[@id='long_desc_eng_ADD001MT']")
	private WebElement Long_Name_Additional_Details;

	public WebElement Long_Name_Additional_Details() {
		return Long_Name_Additional_Details;
	}

	@FindBy(xpath = "//td[@id='add_tab4_GridTbl_Id_ADD001MT']")
	private WebElement Varcher_Add_Button_Entity_level_TrX_type;

	public WebElement Varcher_Add_Button_Entity_level_TrX_type() {
		return Varcher_Add_Button_Entity_level_TrX_type;
	}

	@FindBy(xpath = "//a[@id='additionalFields_tab_AdditionalDetails_ADD001MT']")
	private WebElement click_VARCHAR_Field;

	public WebElement click_VARCHAR_Field() {
		return click_VARCHAR_Field;
	}

	@FindBy(xpath = "//td[@id='td_tab4_GridTbl_Id_ADD001MT_1_ctsAddFieldsVO.FIELD_LABEL']//input")
	private WebElement Varcher_Field_value;

	public WebElement Varcher_Field_value() {
		return Varcher_Field_value;
	}

	@FindBy(xpath = "//a[text()=' Varchar ']")
	private WebElement Enter_Varcher_button_Transaction;

	public WebElement Enter_Varcher_button_Transaction() {
		return Enter_Varcher_button_Transaction;
	}

	@FindBy(xpath = "//td[@id='td_tab4_GridTbl_Id_ADD001MT_1_ctsAddFieldsVO.FIELD_FORMAT']//input")
	private WebElement Varcher_Format_field;

	public WebElement Varcher_Format_field() {
		return Varcher_Format_field;
	}

	@FindBy(xpath = "//td[@id='td_tab4_GridTbl_Id_ADD001MT_1_ctsAddFieldsVO.FIELD_FORMAT']//input")
	private WebElement Varcher_Add_Button_Format_field;

	public WebElement Varcher_Add_Button_Format_field() {
		return Varcher_Add_Button_Format_field;
	}

	@FindBy(xpath = "//td[@id='td_tab4_GridTbl_Id_ADD001MT_1_ctsAddFieldsVO.FIELD_SEQ']//input")
	private WebElement SEQ_Varcher_Add_Button_Format_field;

	public WebElement SEQ_Varcher_Add_Button_Format_field() {
		return SEQ_Varcher_Add_Button_Format_field;
	}

	@FindBy(xpath = "//td[@id='td_tab4_GridTbl_Id_ADD001MT_1_ctsAddFieldsVO.MIN_FIELD_LENGTH']//input")
	private WebElement Min_Field_Varcher_Add_Button_Format_field;

	public WebElement Min_Field_Varcher_Add_Button_Format_field() {
		return Min_Field_Varcher_Add_Button_Format_field;
	}

	@FindBy(xpath = "//td[@id='td_tab4_GridTbl_Id_ADD001MT_1_ctsAddFieldsVO.FIELD_LENGHT']//input")
	private WebElement Max_Field_Varcher_Add_Button_Format_field;

	public WebElement Max_Field_Varcher_Add_Button_Format_field() {
		return Max_Field_Varcher_Add_Button_Format_field;
	}

	@FindBy(xpath = "//label[@id='additionalFieldsMaint_FormId_ADD001MT_Save_key']")
	private WebElement Save_Varcher_Additional_field;

	public WebElement Save_Varcher_Additional_field() {
		return Save_Varcher_Additional_field;
	}

	@FindBy(xpath = "//select[@id='so_process_type_P024MA']")
	private WebElement Transaction_standing_Order_process_Online;

	public WebElement Transaction_standing_Order_process_Online() {
		return Transaction_standing_Order_process_Online;
	}

	@FindBy(xpath = "//input[@id='so_type_P024MAX']")
	private WebElement Max_Standing_order_payment;

	public WebElement Max_Standing_order_payment() {
		return Max_Standing_order_payment;
	}

	@FindBy(xpath = "//input[@id='additionalFieldsList_GridTbl_Id_ADD001P_gs_ctsAddFieldsVO.CODE']")
	private WebElement Approve_Additional_code;

	public WebElement Approve_Additional_code() {
		return Approve_Additional_code;
	}

	@FindBy(xpath = "//a[@id='ADD001P']")
	private WebElement Approve_Field_Additional_code;

	public WebElement Approve_Field_Additional_code() {
		return Approve_Field_Additional_code;
	}

	@FindBy(xpath = "//td[@id='td_additionalFieldsList_GridTbl_Id_ADD001P_1_ctsAddFieldsVO.CODE']")
	private WebElement Double_click_Approve_Additional_code;

	public WebElement Double_click_Approve_Additional_code() {
		return Double_click_Approve_Additional_code;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Additional_Fields_key']")
	private WebElement Additional_Field;

	public WebElement Additional_Field() {
		return Additional_Field;
	}

	@FindBy(xpath = "//input[@id='addFieldsByType_1_D001MT']")
	private WebElement Additional_Field_input;

	public WebElement Additional_Field_input() {
		return Additional_Field_input;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement Additional_Field_input_OK;

	public WebElement Additional_Field_input_OK() {
		return Additional_Field_input_OK;
	}

	// ___________________________________________________________________________###______________________________________________

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement UpdateAfterApprove_Transafer;

	public WebElement UpdateAfterApprove_Transafer() {
		return UpdateAfterApprove_Transafer;
	}

	@FindBy(xpath = "//td[text()='Remittance Type']")
	private WebElement Remittance_Type_transaction_param;

	public WebElement Remittance_Type_transaction_param() {
		return Remittance_Type_transaction_param;
	}

	@FindBy(xpath = "//span[text()='Remittance']")
	private WebElement Remittance_Dropdown_button;

	public WebElement Remittance_Dropdown_button() {
		return Remittance_Dropdown_button;
	}

	@FindBy(xpath = "(//label[text()='Remittance Type '])[2]")
	private WebElement RemittanceType_code_value;

	public WebElement RemittanceType_code_value() {
		return RemittanceType_code_value;
	}

	@FindBy(xpath = "//td[@id='add_tab33_GridTbl_Id_P024MA']")
	private WebElement Add_button_Remittance_type;

	public WebElement Add_button_Remittance_type() {
		return Add_button_Remittance_type;
	}

	@FindBy(xpath = "//input[@id='new_1705064163712_ctstrxtypeRemitVO.REMIT_TYPE_CODE_lookuptxt_tab33_GridTbl_Id_P024MA']")
	private WebElement Code_value_remittance_type;

	public WebElement Code_value_remittance_type() {
		return Code_value_remittance_type;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approve_Recoring_of_remittance;

	public WebElement Approve_Recoring_of_remittance() {
		return Approve_Recoring_of_remittance;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE']")
	private WebElement Code_value_RecordOf_Remittance;

	public WebElement Code_value_RecordOf_Remittance() {
		return Code_value_RecordOf_Remittance;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTP_1_REMITTANCE_TYPE']")
	private WebElement Double_click_Record_Remiitance;

	public WebElement Double_click_Record_Remiitance() {
		return Double_click_Record_Remiitance;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintence_Record_Remittance;

	public WebElement Maintence_Record_Remittance() {
		return Maintence_Record_Remittance;
	}

	@FindBy(xpath = "//input[@name='remittancetypeCO.remittanceVO.CODE']")
	private WebElement Code_value_Remittance_Type_Param;

	public WebElement Code_value_Remittance_Type_Param() {
		return Code_value_Remittance_Type_Param;
	}

	@FindBy(xpath = "//select[@id='remittance_type_P0040MT']")
	private WebElement Cerfiticate_Of_Deposit_Param;

	public WebElement Cerfiticate_Of_Deposit_Param() {
		return Cerfiticate_Of_Deposit_Param;
	}

	@FindBy(xpath = "//input[@id='brief_name_eng_P0040MT']")
	private WebElement Brief_Name_Remittance_Type_Param;

	public WebElement Brief_Name_Remittance_Type_Param() {
		return Brief_Name_Remittance_Type_Param;
	}

	@FindBy(xpath = "//input[@id='predefined_value_P0040MT']")
	private WebElement Predefined_Value_Remittance;

	public WebElement Predefined_Value_Remittance() {
		return Predefined_Value_Remittance;
	}

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040MT_Save_key']")
	private WebElement Save_button_Remittance;

	public WebElement Save_button_Remittance() {
		return Save_button_Remittance;
	}

	@FindBy(xpath = "//input[@id='1_ctstrxtypeRemitVO.REMIT_TYPE_CODE_lookuptxt_tab33_GridTbl_Id_P024MA']")
	private WebElement Transaction_Type_Remittance_Type_code;

	public WebElement Transaction_Type_Remittance_Type_code() {
		return Transaction_Type_Remittance_Type_code;
	}

	@FindBy(xpath = "//button[@id='ok_btn_29_P024MA']")
	private WebElement Ok_button_under_Remittance_type_box;

	public WebElement Ok_button_under_Remittance_type_box() {
		return Ok_button_under_Remittance_type_box;
	}

	@FindBy(xpath = "//select[@id='trx_purpose_P024MA']")
	private WebElement TRX_Type_Purpose_select;

	public WebElement TRX_Type_Purpose_select() {
		return TRX_Type_Purpose_select;
	}

	@FindBy(xpath = "//select[@id='view_dormant_acc_E000MA']")
	private WebElement user_DormantAc;

	public WebElement user_DormantAc() {
		return user_DormantAc;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_TRXType;

	public WebElement CSMCore_Transactions_Maintenance_TRXType() {
		return CSMCore_Transactions_Maintenance_TRXType;
	}

	@FindBy(xpath = "//td[@id='del_tab20_GridTbl_Id_P024MA']")
	private WebElement CSMParam_Transactiontype_reinstancescheme_deleteBtn;

	public WebElement CSMParam_Transactiontype_reinstancescheme_deleteBtn() {
		return CSMParam_Transactiontype_reinstancescheme_deleteBtn;
	}

	@FindBy(xpath = "//td[@id='del_tab19_GridTbl_Id_P024MA']")
	private WebElement CSMParam_Transactiontype_suspendscheme_deleteBtn;

	public WebElement CSMParam_Transactiontype_suspendscheme_deleteBtn() {
		return CSMParam_Transactiontype_suspendscheme_deleteBtn;
	}

	@FindBy(xpath = "//td[@id='del_tab21_GridTbl_Id_P024MA']")
	private WebElement CSMParam_Transactiontype_amendscheme_deleteBtn;

	public WebElement CSMParam_Transactiontype_amendscheme_deleteBtn() {
		return CSMParam_Transactiontype_amendscheme_deleteBtn;
	}

	@FindBy(xpath = "//td[@id='del_tab22_GridTbl_Id_P024MA']")
	private WebElement CSMParam_Transactiontype_closescheme_deleteBtn;

	public WebElement CSMParam_Transactiontype_closescheme_deleteBtn() {
		return CSMParam_Transactiontype_closescheme_deleteBtn;
	}
	
	//karthi new steps
	
	@FindBy(xpath = "//input[@id='so_type_P024MAM']")
	private WebElement minBalance_Standing_order;

	public WebElement minBalance_Standing_order() {

		return minBalance_Standing_order;
	}
	
	@FindBy(xpath = "//td[@id='td_tab18_GridTbl_Id_P024MA_1_ctstrxtypeSoChargesVO.CHARGE_CODE']")
	private WebElement CSMParam_TransactionType_setupSchema_PlusBtn_Code_ChargeCode_gettext;

	public WebElement CSMParam_TransactionType_setupSchema_PlusBtn_Code_ChargeCode_gettext() {
		return CSMParam_TransactionType_setupSchema_PlusBtn_Code_ChargeCode_gettext;
	}
	
	@FindBy(xpath = "//td[@id='td_tab19_GridTbl_Id_P024MA_1_ctstrxtypeSoChargesVO.CHARGE_CODE']")
	private WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn_Code_ChargeCode_gettext;

	public WebElement CSMParam_TransactionType_SuspendSchema_PlusBtn_Code_ChargeCode_gettext() {
		return CSMParam_TransactionType_SuspendSchema_PlusBtn_Code_ChargeCode_gettext;
	}
	
	@FindBy(xpath = "//td[@id='td_tab20_GridTbl_Id_P024MA_1_ctstrxtypeSoChargesVO.CHARGE_CODE']")
	private WebElement CSMParam_TransactionType_ReinstanceSchema_PlusBtn_Code_ChargeCode_gettext;

	public WebElement CSMParam_TransactionType_ReinstanceSchema_PlusBtn_Code_ChargeCode_gettext() {
		return CSMParam_TransactionType_ReinstanceSchema_PlusBtn_Code_ChargeCode_gettext;
	}
	
	@FindBy(xpath = "//td[@id='td_tab21_GridTbl_Id_P024MA_1_ctstrxtypeSoChargesVO.CHARGE_CODE']")
	private WebElement CSMParam_TransactionType_amendSchema_PlusBtn_Code_ChargeCode_gettext;

	public WebElement CSMParam_TransactionType_amendSchema_PlusBtn_Code_ChargeCode_gettext() {
		return CSMParam_TransactionType_amendSchema_PlusBtn_Code_ChargeCode_gettext;
	}
	
	@FindBy(xpath = "//td[@id='td_tab22_GridTbl_Id_P024MA_1_ctstrxtypeSoChargesVO.CHARGE_CODE']")
	private WebElement CSMParam_TransactionType_closeSchema_PlusBtn_Code_ChargeCode_gettext;

	public WebElement CSMParam_TransactionType_closeSchema_PlusBtn_Code_ChargeCode_gettext() {
		return CSMParam_TransactionType_closeSchema_PlusBtn_Code_ChargeCode_gettext;
	}
	
	
	
	@FindBy(xpath = "//input[@id='so_from_day_D001MT']")
	private WebElement CSM_Transaction_maintenance_sofromnumber;

	public WebElement CSM_Transaction_maintenance_sofromnumber() {
		return CSM_Transaction_maintenance_sofromnumber;
	}
	//razia new steps
	
//	 @FindBy(xpath = "//td[@id='del_tab20_GridTbl_Id_P024MA']")
//	private WebElement CSMParam_Transactiontype_reinstancescheme_deleteBtn;
//
//	public WebElement CSMParam_Transactiontype_reinstancescheme_deleteBtn() {
//		return CSMParam_Transactiontype_reinstancescheme_deleteBtn;
//	}
//	@FindBy(xpath = "//td[@id='del_tab19_GridTbl_Id_P024MA']")
//	private WebElement CSMParam_Transactiontype_suspendscheme_deleteBtn;
//
//	public WebElement CSMParam_Transactiontype_suspendscheme_deleteBtn() {
//		return CSMParam_Transactiontype_suspendscheme_deleteBtn;
//	}
//	@FindBy(xpath = "//td[@id='del_tab21_GridTbl_Id_P024MA']")
//	private WebElement CSMParam_Transactiontype_amendscheme_deleteBtn;
//
//	public WebElement CSMParam_Transactiontype_amendscheme_deleteBtn() {
//		return CSMParam_Transactiontype_amendscheme_deleteBtn;
//	}
//	@FindBy(xpath = "//td[@id='del_tab22_GridTbl_Id_P024MA']")
//	private WebElement CSMParam_Transactiontype_closescheme_deleteBtn;
//
//	public WebElement CSMParam_Transactiontype_closescheme_deleteBtn() {
//		return CSMParam_Transactiontype_closescheme_deleteBtn;
//	}
	@FindBy(id = "infoBarSearchButton_D001TCL")
	private WebElement CSM_tobeclose_searchbtn;

	public WebElement CSM_tobeclose_searchbtn() {
		return CSM_tobeclose_searchbtn;
	}
	@FindBy(id = "infoBarSearchButton_D001CL")
	private WebElement CSM_toclose_searchbtn;

	public WebElement CSM_toclose_searchbtn() {
		return CSM_toclose_searchbtn;
	}
	@FindBy(xpath = "//td[@id='del_tab18_GridTbl_Id_P024MA']")
	private WebElement CSMParam_Transactiontype_setupscheme_deleteBtn;

	public WebElement CSMParam_Transactiontype_setupscheme_deleteBtn() {
		return CSMParam_Transactiontype_setupscheme_deleteBtn;
	}
	@FindBy(xpath = "//input[@id='so_type_P024MAM']")
	private WebElement MINBalance_Standing_order;
	public WebElement MINBalance_Standing_order()
	{
		return MINBalance_Standing_order;
	}
	
	@FindBy(xpath = "//input[@id='so_type_P024MAX']")
	private WebElement MaxBalance_Standing_order;
	public WebElement MaxBalance_Standing_order()
	{
		return MaxBalance_Standing_order;
	}	
	@FindBy(xpath = "//select[@id='so_process_type_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Processtype_SO;
	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Processtype_SO() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Processtype_SO;
	}
	@FindBy(xpath = "//input[@id='allow_so_same_set_cr_dr_ac_yn_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_allowso_SO;
	public WebElement Parameters_SystemParameters_TransactionType_allowso_SO() {
		return Parameters_SystemParameters_TransactionType_allowso_SO;
}
	
	@FindBy(xpath = "//span[text()='close']")
	private WebElement BM_alertpopup_close;
	public WebElement BM_alertpopup_close() {
		return BM_alertpopup_close;


}
	@FindBy(id = "controlRecord_tab_OtherInfo_O001UP")
	private WebElement controlrecord_otherinfo_tab;
	public WebElement controlrecord_otherinfo_tab() {
		return controlrecord_otherinfo_tab;
	}
	 
	@FindBy(xpath="//input[@id='allow_multi_on_so_O001UP']")
	private WebElement controlrecord_otherinfo_tab_multi_online_so;
	public WebElement controlrecord_otherinfo_tab_multi_online_so() {
	return controlrecord_otherinfo_tab_multi_online_so;
	}
	@FindBy(xpath="//input[@id='create_active_so_P024MA']")
	private WebElement trxtype_create_active_so_eod_flag;
	public WebElement trxtype_create_active_so_eod_flag() {
	return trxtype_create_active_so_eod_flag;
	}
	 
	@FindBy(xpath="//input[@id='allow_multi_periodical_so_yn_O001UP']")
	private WebElement controlrecord_mluti_peroadical_so;
	public WebElement controlrecord_mluti_peroadical_so() {
	return controlrecord_mluti_peroadical_so;
	}	

	@FindBy(xpath="//select[@id='trsfr_method_P024MA']")
	private WebElement param_trxtype_modeofpayment_so;
	public WebElement param_trxtype_modeofpayment_so() {
	return param_trxtype_modeofpayment_so;
	}

	@FindBy(xpath="//select[@name='transactiontypesCO.ctstrxtypeVO.SO_PERIOD_INTERVAL']")
	private WebElement param_trxtype_standingorder_monthlyinterval;
	public WebElement param_trxtype_standingorder_monthlyinterval() {
	return param_trxtype_standingorder_monthlyinterval;
	}
	

	@FindBy(xpath="//input[@id='dflt_starting_dt_P024MA']")
	private WebElement param_trxtype_standingorder_defaultStartingdate;
	public WebElement param_trxtype_standingorder_defaultStartingdate() {
	return param_trxtype_standingorder_defaultStartingdate;
	}
	
	@FindBy(xpath="//input[@id='allow_so_same_set_cr_dr_ac_yn_P024MA']")
	private WebElement param_trxtype_standingorder_allowsosame_account_checkbox;
	public WebElement param_trxtype_standingorder_allowsosame_account_checkbox() {
	return param_trxtype_standingorder_allowsosame_account_checkbox;
	}
	
	
	
	@FindBy(xpath="//div[text()='Cannot Proceed']")
	private WebElement param_trxtype_standingorder_accountalreadystandingordered_popup;
	public WebElement param_trxtype_standingorder_accountalreadystandingordered_popup() {
	return param_trxtype_standingorder_accountalreadystandingordered_popup;
	}
	
	@FindBy(xpath="//input[@id='so_type_P024MAP']")
	private WebElement param_trxtype_standingorder_sotype;
	public WebElement param_trxtype_standingorder_sotype() {
	return param_trxtype_standingorder_sotype;
	}
	
	@FindBy(xpath="//input[@id='forbid_multi_cif_trx_P024MA']")
	private WebElement param_trxtype_forbidMultiCif_checkbox;
	public WebElement param_trxtype_forbidMultiCif_checkbox() {
	return param_trxtype_forbidMultiCif_checkbox;
	}
	
}
