package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Remittance_obj {

	WebDriver driver;

	public CSM_Remittance_obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//td[text()='Recording of Remittance']")
	private WebElement CSM_RecordingofRemittance_Menu_606;

	public WebElement CSM_RecordingofRemittance_Menu_606() {
		return CSM_RecordingofRemittance_Menu_606;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSM_RecordingofRemittance_Maintenance_606;

	public WebElement CSM_RecordingofRemittance_Maintenance_606() {
		return CSM_RecordingofRemittance_Maintenance_606;
	}

	@FindBy(xpath = "//input[@name='recordOfRemittanceCO.remittanceRecordVO.VAULT_NO']")
	private WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_606;

	public WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_606() {
		return CSM_RecordingofRemittance_Maintenance_valutNo_Search_606;
	}

	@FindBy(id = "td_gridtab_vaultLookup_RRTMT_2_CODE") // double
	private WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_606;

	public WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_606() {
		return CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_606;
	}

	@FindBy(id = "recordOfRemittanceMaintForm_RRTMT_btn_save")
	private WebElement CSM_RecordingofRemittance_Maintenance_Save;

	public WebElement CSM_RecordingofRemittance_Maintenance_Save() {
		return CSM_RecordingofRemittance_Maintenance_Save;
	}

	// span[text()='Approve']
	@FindBy(xpath = "//a[@id='RRTP']")
	private WebElement CSM_RecordingofRemittance_ApproveMenu_606;

	public WebElement CSM_RecordingofRemittance_ApproveMenu_606() {
		return CSM_RecordingofRemittance_ApproveMenu_606;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_RemittanceType_606;

	public WebElement CSM_RecordingofRemittance_RemittanceType_606() {
		return CSM_RecordingofRemittance_RemittanceType_606;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_ReceivedDate_606;

	public WebElement CSM_RecordingofRemittance_ReceivedDate_606() {
		return CSM_RecordingofRemittance_ReceivedDate_606;
	}

	@FindBy(id = "td_recordOfRemittanceMaintGridTbl_Id_RRTP_1_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_Select_Record_In_Approve_Screen;

	public WebElement CSM_RecordingofRemittance_Select_Record_In_Approve_Screen() {
		return CSM_RecordingofRemittance_Select_Record_In_Approve_Screen;
	}

	@FindBy(xpath = "//button[@id='recordOfRemittance_approve_RRTP']")
	private WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_606;

	public WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_606() {
		return CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_606;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_Maintenace_ReceviedData_606;

	public WebElement CSM_RecordingofRemittance_Maintenace_ReceviedData_606() {
		return CSM_RecordingofRemittance_Maintenace_ReceviedData_606;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement CSM_RecordingofRemittance_Maintenace_pop_606;

	public WebElement CSM_RecordingofRemittance_Maintenace_pop_606() {
		return CSM_RecordingofRemittance_Maintenace_pop_606;
	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement CSM_RecordingofRemittance_Maintenace_validate_606;

	public WebElement CSM_RecordingofRemittance_Maintenace_validate_606() {
		return CSM_RecordingofRemittance_Maintenace_validate_606;
	}

	// a[text()='Recording of Remittance / Maintenance']
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSM_RecordingofRemittance_Maintenace_TAB_606;

	public WebElement CSM_RecordingofRemittance_Maintenace_TAB_606() {
		return CSM_RecordingofRemittance_Maintenace_TAB_606;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_RRTMT']")
	private WebElement CSM_RecordingofRemittance_Maintenace_SearchBtn;

	public WebElement CSM_RecordingofRemittance_Maintenace_SearchBtn() {
		return CSM_RecordingofRemittance_Maintenace_SearchBtn;
	}

	@FindBy(xpath = "//a[@id='RRTTC']")
	private WebElement CSM_RecordingofRemittance_tobeCancel_606;

	public WebElement CSM_RecordingofRemittance_tobeCancel_606() {
		return CSM_RecordingofRemittance_tobeCancel;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_tobeCancel_recevieddate_606;

	public WebElement CSM_RecordingofRemittance_tobeCancel_recevieddate_606() {
		return CSM_RecordingofRemittance_tobeCancel_recevieddate;
	}

	@FindBy(id = "infoBarSearchButton_RRTTC")
	private WebElement CSM_RecordingofRemittance_tobeCancel_Searchbtn;

	public WebElement CSM_RecordingofRemittance_tobeCancel_Searchbtn() {
		return CSM_RecordingofRemittance_tobeCancel_Searchbtn;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_tobeCancel_remittancetype_606;

	public WebElement CSM_RecordingofRemittance_tobeCancel_remittancetype_606() {
		return CSM_RecordingofRemittance_tobeCancel_remittancetype;
	}

	@FindBy(id = "td_recordOfRemittanceMaintGridTbl_Id_RRTTC_1_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_tobeCancel_Select_Record;

	public WebElement CSM_RecordingofRemittance_tobeCancel_Select_Record() {
		return CSM_RecordingofRemittance_tobeCancel_Select_Record;
	}

	@FindBy(id = "recordOfRemittanceMaintForm_RRTTC_To_Cancel_key")
	private WebElement CSM_RecordingofRemittance_toCancelBtn;

	public WebElement CSM_RecordingofRemittance_toCancelBtn() {
		return CSM_RecordingofRemittance_toCancelBtn;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTN_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_approvecanccel_remittancetype;

	public WebElement CSM_RecordingofRemittance_approvecanccel_remittancetype_606() {
		return CSM_RecordingofRemittance_approvecanccel_remittancetype;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_approvecanccel_receiveddate;

	public WebElement CSM_RecordingofRemittance_approvecanccel_receiveddate() {
		return CSM_RecordingofRemittance_approvecanccel_receiveddate;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTN_1_REMITTANCE_TYPE']")
	private WebElement CSM_RecordingofRemittance_approvecanccel_select_record;

	public WebElement CSM_RecordingofRemittance_approvecanccel_select_record() {
		return CSM_RecordingofRemittance_approvecanccel_select_record;
	}

	@FindBy(id = "recordOfRemittanceMaintForm_RRTN_Cancel_key")
	private WebElement CSM_RecordingofRemittance_cancelbtn;

	public WebElement CSM_RecordingofRemittance_cancelbtn() {
		return CSM_RecordingofRemittance_cancelbtn;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_remittancetype;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_remittancetype_606() {
		return CSM_RecordingofRemittance_tobeDestroyed_remittancetype;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_receiveddate;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_receiveddate_606() {
		return CSM_RecordingofRemittance_tobeDestroyed_receiveddate;
	}

	@FindBy(id = "td_recordOfRemittanceMaintGridTbl_Id_RRTDY_2_VAULT_NO")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_receiveddate_doubleclk;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_receiveddate_doubleclk_606() {
		return CSM_RecordingofRemittance_tobeDestroyed_receiveddate_doubleclk;
	}

	@FindBy(xpath = "//td[text()='Damaged']")
	private WebElement CSM_RecordingofRemittance_validate_Damaged;

	public WebElement CSM_RecordingofRemittance_validate_Damaged_606() {
		return CSM_RecordingofRemittance_validate_Damaged;
	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement CSM_RecordingofRemittance_validate_Approved;

	public WebElement CSM_RecordingofRemittance_validate_Approved_606() {
		return CSM_RecordingofRemittance_validate_Approved;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_RECEIVED_DATE")
	private WebElement CSM_RecordingofRemittance_Approvedestroy_receivedate;

	public WebElement CSM_RecordingofRemittance_Approvedestroy_receivedate_606() {
		return CSM_RecordingofRemittance_Approvedestroy_receivedate;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_REMITTANCE_TYPE']")
	private WebElement CSM_RecordingofRemittance_tobeDamaged_remittancetype;

	public WebElement CSM_RecordingofRemittance_tobeDamaged_remittancetype_606() {
		return CSM_RecordingofRemittance_tobeDamaged_remittancetype;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_tobeDamaged_receivedate;

	public WebElement CSM_RecordingofRemittance_tobeDamaged_receivedate_606() {
		return CSM_RecordingofRemittance_tobeDamaged_receivedate;
	}

	@FindBy(xpath = "//span[text()='Approve Damage']")
	private WebElement CSM_RecordingofRemittance_ApproveDamage;

	public WebElement CSM_RecordingofRemittance_ApproveDamage_606() {
		return CSM_RecordingofRemittance_ApproveDamage;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_RRTADM']")
	private WebElement CSM_RecordingofRemittance_ApproveDamage_searchbtn;

	public WebElement CSM_RecordingofRemittance_ApproveDamage_searchbtn() {
		return CSM_RecordingofRemittance_ApproveDamage_searchbtn;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_ApproveDamage_remmitancetype;

	public WebElement CSM_RecordingofRemittance_ApproveDamage_remmitancetype_606() {
		return CSM_RecordingofRemittance_ApproveDamage_remmitancetype;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_ApproveDamage_receiveddate;

	public WebElement CSM_RecordingofRemittance_ApproveDamage_receiveddate_606() {
		return CSM_RecordingofRemittance_ApproveDamage_receiveddate;
	}

	@FindBy(id = "td_recordOfRemittanceMaintGridTbl_Id_RRTADM_1_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_ApproveDamage_receiveddate_doubleclk;

	public WebElement CSM_RecordingofRemittance_ApproveDamage_receiveddate_doubleclk_606() {
		return CSM_RecordingofRemittance_ApproveDamage_receiveddate_doubleclk;
	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_alertDescription']")
	private WebElement CSM_AlertPopup_AlertDescription;

	public WebElement CSM_AlertPopup_AlertDescription() {
		return CSM_AlertPopup_AlertDescription;
	}

	@FindBy(xpath = "//span[@id='spanLookup_remittanceTypeLookup_RRTMT']/span")
	private WebElement RecordingofRemittance_Maintenance_CDTypeSearch_609;

	public WebElement RecordingofRemittance_Maintenance_CDTypeSearch_609() {
		return RecordingofRemittance_Maintenance_CDTypeSearch_609;
	}

//	@FindBy(xpath = "//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.VALUE']//div//input")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_Value_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_Value_609() {
//		return RecordingofRemittance_Maintenance_Denomination_Value_609;
//	}
//	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Ok_609;

	public WebElement CSM_Ok_609() {
		return CSM_Ok_609;
	}
//	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[3]//input")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber_609() {
//		return RecordingofRemittance_Maintenance_Denomination_FromNumber_609;
//	}

	@FindBy(xpath = "//span[@id='spanLookup_currencyLookup_RRTMT']/span")
	private WebElement RecordingofRemittance_Maintenance_CurrencySearch_609;

	public WebElement RecordingofRemittance_Maintenance_CurrencySearch_609() {
		return RecordingofRemittance_Maintenance_CurrencySearch_609;
	}
//	@FindBy(xpath = "//td[@id='add_recordOfRemittanceDenomGridTbl_Id_RRTMT']/div/span")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_AddIcon_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_AddIcon_609() {
//		return RecordingofRemittance_Maintenance_Denomination_AddIcon_609;
//	}
//	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[2]/input")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_Serial_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_Serial_609() {
//		return RecordingofRemittance_Maintenance_Denomination_Serial_609;
//	}
//	

	@FindBy(xpath = "//span[text()='Remove Tab']")
	private WebElement RecordingofRemittance_Maintenance_closeTab;

	public WebElement RecordingofRemittance_Maintenance_closeTab() {
		return RecordingofRemittance_Maintenance_closeTab;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate;

	public WebElement CSMDateInUserRunningDate() {
		return CSM_DateInUserRunningDate;
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

	@FindBy(xpath = "//input[@id='jqg_trsAckTOutAlertGrid_Id_RCVALERT_1']")
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

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
		return CSM_ClearCacheInTechnicalDetailsIcon;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;

	public WebElement CSMOkButtonInInformationPopUpMenu() {
		return CSM_OkButtonInInformationPopUpMenu;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_609;

	public WebElement CSM_CloseButtonInChangeRunningDate_609() {
		return CSM_CloseButtonInChangeRunningDate_609;
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

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_609;

	public WebElement CSM_OkButtonInAccessDeniedPopUpMenu_609() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_609;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement csmStopperMessagePopupInTransactions;

	public WebElement csmStopperMessagePopupInTransactions() {
		return csmStopperMessagePopupInTransactions;
	}

	/// ***Transactions***///
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions_609;

	public WebElement Transactions_609() {
		return Transactions_609;
	}

	@FindBy(xpath = "//a[@id='D001MT']/span[text()='Maintenance']")
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
	// table[@id='gridtab_trx_type_D001MT']//td[text()='6']

	@FindBy(xpath = "//a[text()='Transactions / Maintenance']")
	private WebElement TrxMaintance;

	public WebElement TrxMaintance() {
		return TrxMaintance;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_BranchCode_609;

	public WebElement Transactions_Maintenance_BranchCode_609() {
		return Transactions_Maintenance_BranchCode_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_Maintenance_CurrencyCode_609;

	public WebElement Transactions_Maintenance_CurrencyCode_609() {
		return Transactions_Maintenance_CurrencyCode_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_GlCode_609;

	public WebElement Transactions_Maintenance_GlCode_609() {
		return Transactions_Maintenance_GlCode_609;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CifCode_609;

	public WebElement Transactions_Maintenance_CifCode_609() {
		return Transactions_Maintenance_CifCode_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_SerialNo_609;

	public WebElement Transactions_Maintenance_SerialNo_609() {
		return Transactions_Maintenance_SerialNo_609;
	}

	@FindBy(xpath = "//input[@id='ctrl_cy_D001MT']")
	private WebElement Transactions_Maintenance_TellerAcCurrencyCode_609;

	public WebElement Transactions_Maintenance_TellerAcCurrencyCode_609() {
		return Transactions_Maintenance_TellerAcCurrencyCode_609;
	}

	@FindBy(xpath = "//input[@id='ctrl_gl_D001MT']")
	private WebElement Transactions_Maintenance_TellerAcGlCode_609;

	public WebElement Transactions_Maintenance_TellerAcGlCode_609() {
		return Transactions_Maintenance_TellerAcGlCode_609;
	}

	@FindBy(xpath = "//input[@id='ctrl_cif_D001MT']")
	private WebElement Transactions_Maintenance_TellerAcCifCode_609;

	public WebElement Transactions_Maintenance_TellerAcCifCode_609() {
		return Transactions_Maintenance_TellerAcCifCode_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_ctrl_sl_D001MT']")
	private WebElement Transactions_Maintenance_TellerAcSerialNo_609;

	public WebElement Transactions_Maintenance_TellerAcSerialNo_609() {
		return Transactions_Maintenance_TellerAcSerialNo_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_CreditGlCode_609;

	public WebElement Transactions_Maintenance_CreditGlCode_609() {
		return Transactions_Maintenance_CreditGlCode_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CreditCifCode_609;

	public WebElement Transactions_Maintenance_CreditCifCode_609() {
		return Transactions_Maintenance_CreditCifCode_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_CreditSerialNo_609;

	public WebElement Transactions_Maintenance_CreditSerialNo_609() {
		return Transactions_Maintenance_CreditSerialNo_609;
	}

	@FindBy(xpath = "//span[text()='View Memo']")
	private WebElement ViewMomo_PopUp_609;

	public WebElement ViewMomo_PopUp_609() {
		return ViewMomo_PopUp_609;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ViewMomo_PopUp_Close_609;

	public WebElement ViewMomo_PopUp_Close_609() {
		return ViewMomo_PopUp_Close_609;
	}

//	@FindBy(xpath = "//div[text()='WARNING']/parent::div/following-sibling::div/div")
//	private WebElement WarningMessage;
//	public WebElement WarningMessage( {
//		return WarningMessage;
//	}
//
//	@FindBy(xpath = "(//input[@value='Ok'])[2]")
//	private WebElement WarningMessagePopupOk;
//	public WebElement WarningMessagePopupOk( {
//		return WarningMessagePopupOk;
//	}
//
//	
//
//	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//span[@role='button'])[1]")
//	private WebElement CreditAccountSearchIcon;
//	public WebElement CreditAccountSearchIcon( {
//		return CreditAccountSearchIcon;
//	}
//
//	@FindBy(xpath = "//div[text()='Access Denied']/parent::div/following-sibling::div/div")
//	private WebElement AccessDeniedPopup;
//	public WebElement AccessDeniedPopup( {
//		return AccessDeniedPopup;
//	}
//
//	@FindBy(xpath = "(//input[@value='Ok'])[2]")
//	private WebElement AccessDeniedPopupOk;
//	public WebElement AccessDeniedPopupOk( {
//		return AccessDeniedPopupOk;
//	}

//	@FindBy(xpath = "//label[text()='Log Out ']")
//	private WebElement LogoutButton;
//	public WebElement LogoutButton() {
//		return LogoutButton;
//	}

	@FindBy(xpath = "//span[@id='spanLookup_trs_cy_D001MT']/span")
	private WebElement Transactions_Maintenance_CurrencySearch_609;

	public WebElement Transactions_Maintenance_CurrencySearch_609() {
		return Transactions_Maintenance_CurrencySearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_cy_D001MT_gs_CURRENCY_CODE']")
	private WebElement Transactions_Maintenance_Currency_CurrencyCode_609;

	public WebElement Transactions_Maintenance_Currency_CurrencyCode_609() {
		return Transactions_Maintenance_Currency_CurrencyCode_609;
	}
	// table[@id='gridtab_trs_cy_D001MT']//td[text()='840']

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_Maintenance_Amount_609;

	public WebElement Transactions_Maintenance_Amount_609() {
		return Transactions_Maintenance_Amount_609;
	}

	@FindBy(xpath = "//input[@id='value_date_D001MT']")
	private WebElement Transactions_Maintenance_StartingDate_609;

	public WebElement Transactions_Maintenance_StartingDate_609() {
		return Transactions_Maintenance_StartingDate_609;
	}

	@FindBy(xpath = "//input[@id='release_date_D001MT']")
	private WebElement Transactions_Maintenance_EndingDate_609;

	public WebElement Transactions_Maintenance_EndingDate_609() {
		return Transactions_Maintenance_EndingDate_609;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement Transactions_Maintenance_SaveBtn_609;

	public WebElement Transactions_Maintenance_SaveBtn_609() {
		return Transactions_Maintenance_SaveBtn_609;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement Transactions_CannotProceedPopUp_609;

	public WebElement Transactions_CannotProceedPopUp_609() {
		return Transactions_CannotProceedPopUp_609;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_609;

	public WebElement getTransactionNumber_609() {
		return getTransactionNumber_609;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Transactions_Approve_609;

	public WebElement Transactions_Approve_609() {
		return Transactions_Approve_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Approve_Code_609;

	public WebElement Transactions_Approve_Code_609() {
		return Transactions_Approve_Code_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001AU']//td[text()='9519']

	@FindBy(xpath = "//input[@id='amount_D001AU']")
	private WebElement Transactions_Approve_Amount_609;

	public WebElement Transactions_Approve_Amount_609() {
		return Transactions_Approve_Amount_609;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement Transactions_Approve_ApproveBtn_609;

	public WebElement Transactions_Approve_ApproveBtn_609() {
		return Transactions_Approve_ApproveBtn_609;
	}

	@FindBy(xpath = "//span[text()='Reverse']")
	private WebElement Transactions_Reverse_609;

	public WebElement Transactions_Reverse_609() {
		return Transactions_Reverse_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001WV_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Reverse_Code_609;

	public WebElement Transactions_Reverse_Code_609() {
		return Transactions_Reverse_Code_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001WV']//td[text()='9514']

	@FindBy(xpath = "//select[@id='holdReason_D001WV']")
	private WebElement Transactions_Reverse_Reason_609;

	public WebElement Transactions_Reverse_Reason_609() {
		return Transactions_Reverse_Reason_609;
	}
	// vip reverse

	@FindBy(xpath = "//span[contains(text(),' To Reverse ')]")
	private WebElement Transactions_Reverse_ToReverseBtn_609;

	public WebElement Transactions_Reverse_ToReverseBtn_609() {
		return Transactions_Reverse_ToReverseBtn_609;
	}

	@FindBy(xpath = "//span[text()='Approve Reverse']")
	private WebElement Transactions_ApproveReverse_609;

	public WebElement Transactions_ApproveReverse_609() {
		return Transactions_ApproveReverse_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RV_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApproveReverse_Code_609;

	public WebElement Transactions_ApproveReverse_Code_609() {
		return Transactions_ApproveReverse_Code_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001RV']//td[text()='9507']

	@FindBy(xpath = "//span[contains(text(),' Reverse ')]")
	private WebElement Transactions_ApproveReverse_Reverse_609;

	public WebElement Transactions_ApproveReverse_Reverse_609() {
		return Transactions_ApproveReverse_Reverse_609;
	}

	/// *** Accounts ***///

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

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement Accounts_GeneralAccounts_Authorize_AuthorizeBtn_609;

	public WebElement Accounts_GeneralAccounts_Authorize_AuthorizeBtn_609() {
		return Accounts_GeneralAccounts_Authorize_AuthorizeBtn_609;
	}

	/// *** Chequebook Request ***///

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement ChequebookRequest_609;

	public WebElement ChequebookRequest_609() {
		return ChequebookRequest_609;
	}

	@FindBy(xpath = "//a[@id='Q000MT']/span[text()='Maintenance']")
	private WebElement ChequebookRequest_Maintenance_609;

	public WebElement ChequebookRequest_Maintenance_609() {
		return ChequebookRequest_Maintenance_609;
	}

	@FindBy(xpath = "//span[@id='spanLookup_CHEQUE_CODE_Q000MT']/span")
	private WebElement ChequebookRequest_Maintenance_ChequeCodeSearch_609;

	public WebElement ChequebookRequest_Maintenance_ChequeCodeSearch_609() {
		return ChequebookRequest_Maintenance_ChequeCodeSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_CHEQUE_CODE_Q000MT_gs_CODE']")
	private WebElement ChequebookRequest_Maintenance_ChequeCode_609;

	public WebElement ChequebookRequest_Maintenance_ChequeCode_609() {
		return ChequebookRequest_Maintenance_ChequeCode_609;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_NumberofChequeBooks_609;

	public WebElement ChequebookRequest_Maintenance_NumberofChequeBooks_609() {
		return ChequebookRequest_Maintenance_NumberofChequeBooks_609;
	}

	@FindBy(xpath = "//span[@id='spanLookup_leaves_code_Q000MT']/span")
	private WebElement ChequebookRequest_Maintenance_LeavesSearch_609;

	public WebElement ChequebookRequest_Maintenance_LeavesSearch_609() {
		return ChequebookRequest_Maintenance_LeavesSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_leaves_code_Q000MT_gs_CODE']")
	private WebElement ChequebookRequest_Maintenance_LeavesCode_609;

	public WebElement ChequebookRequest_Maintenance_LeavesCode_609() {
		return ChequebookRequest_Maintenance_LeavesCode_609;
	}
	// table[@id='gridtab_leaves_code_Q000MT']//td[text()='100']

	@FindBy(xpath = "//span[@id='spanLookup_types_code_Q000MT']/span")
	private WebElement ChequebookRequest_Maintenance_TypesSearch_609;

	public WebElement ChequebookRequest_Maintenance_TypesSearch_609() {
		return ChequebookRequest_Maintenance_TypesSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_types_code_Q000MT_gs_CODE']")
	private WebElement ChequebookRequest_Maintenance_TypesCode_609;

	public WebElement ChequebookRequest_Maintenance_TypesCode_609() {
		return ChequebookRequest_Maintenance_TypesCode_609;
	}
	// table[@id='gridtab_types_code_Q000MT']//td[text()='100']

	@FindBy(xpath = "//span[@id='spanLookup_acc_sl_Q000MT']/span")
	private WebElement ChequebookRequest_Maintenance_AccountNumberSearch_609;

	public WebElement ChequebookRequest_Maintenance_AccountNumberSearch_609() {
		return ChequebookRequest_Maintenance_AccountNumberSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.CURRENCY_CODE']]")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_Currency1_609;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_Currency1_609() {
		return ChequebookRequest_Maintenance_AccountNumber_Currency1_609;
	}
	// (//table[@id='gridtab_acc_sl_Q000MT']//td[text()='048'])[1]

	@FindBy(xpath = "//span[text()='Additional A/C']")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccountsDD_609;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccountsDD_609() {
		return ChequebookRequest_Maintenance_AdditionalAccountsDD_609;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_BranchCode_609;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_BranchCode_609() {
		return ChequebookRequest_Maintenance_AccountNumber_BranchCode_609;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_Currency_609;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_Currency_609() {
		return ChequebookRequest_Maintenance_AccountNumber_Currency_609;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_GL_609;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_GL_609() {
		return ChequebookRequest_Maintenance_AccountNumber_GL_609;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_Cif_609;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_Cif_609() {
		return ChequebookRequest_Maintenance_AccountNumber_Cif_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AccountNumber_SerialNumber_609;

	public WebElement ChequebookRequest_Maintenance_AccountNumber_SerialNumber_609() {
		return ChequebookRequest_Maintenance_AccountNumber_SerialNumber_609;
	}

	@FindBy(xpath = "//span[text()='Charges']")
	private WebElement ChequebookRequest_Maintenance_Charges_609;

	public WebElement ChequebookRequest_Maintenance_Charges_609() {
		return ChequebookRequest_Maintenance_Charges_609;
	}

	@FindBy(xpath = "//a[@id='dismissbut_Q000MT']/span")
	private WebElement ChequebookRequest_DismissPopUp_609;

	public WebElement ChequebookRequest_DismissPopUp_609() {
		return ChequebookRequest_DismissPopUp_609;
	}

	@FindBy(xpath = "//td[@id='add_chqBkAddAccGridTbl_Id_Q000MT']/div/span")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_Addicon_609;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_Addicon_609() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_Addicon_609;
	}

//	@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[6]//div//span/span")
//	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SiNosearch_609;
//	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SiNosearch_609() {
//		return ChequebookRequest_Maintenance_AdditionalAccounts_SiNosearch_609;
//	}

	@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[2]//input")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_BranchCode_609;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_BranchCode_609() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_BranchCode_609;
	}

	@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[3]//input")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_Currency_609;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_Currency_609() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_Currency_609;
	}

	@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[4]//input")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_GL_609;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_GL_609() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_GL_609;
	}

	@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[6]//input")
	private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SerialNumber_609;

	public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SerialNumber_609() {
		return ChequebookRequest_Maintenance_AdditionalAccounts_SerialNumber_609;
	}

	@FindBy(xpath = "//input[@id='chqbook_name_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_NametobePrinted_609;

	public WebElement ChequebookRequest_Maintenance_NametobePrinted_609() {
		return ChequebookRequest_Maintenance_NametobePrinted_609;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement ChequebookRequest_Maintenance_SaveBtn_609;

	public WebElement ChequebookRequest_Maintenance_SaveBtn_609() {
		return ChequebookRequest_Maintenance_SaveBtn_609;
	}

	@FindBy(xpath = "//a[@id='Q000AP']/span[text()='Approve']")
	private WebElement ChequebookRequest_Approve_609;

	public WebElement ChequebookRequest_Approve_609() {
		return ChequebookRequest_Approve_609;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement ChequebookRequest_Approve_ChequeCode_609;

	public WebElement ChequebookRequest_Approve_ChequeCode_609() {
		return ChequebookRequest_Approve_ChequeCode_609;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000AP_Approve_key']")
	private WebElement ChequebookRequest_Approve_ApproveBtn609;

	public WebElement ChequebookRequest_Approve_ApproveBtn609() {
		return ChequebookRequest_Approve_ApproveBtn609;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
	private WebElement TransactionNo_609;

	public WebElement TransactionNo_609() {
		return TransactionNo_609;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_Maintenance_SearchBtn_609;

	public WebElement Transactions_Maintenance_SearchBtn_609() {
		return Transactions_Maintenance_SearchBtn_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Maintenance_TransactionNumber_609;

	public WebElement Transactions_Maintenance_TransactionNumber_609() {
		return Transactions_Maintenance_TransactionNumber_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001MT']//td[text()='9581']

	@FindBy(xpath = "//td[text()='Queries']")
	private WebElement Queries_609;

	public WebElement Queries_609() {
		return Queries_609;
	}

	@FindBy(xpath = "//td[text()='Statement Of Accounts']")
	private WebElement Queries_StatementofAccounts_609;

	public WebElement Queries_StatementofAccounts_609() {
		return Queries_StatementofAccounts_609;
	}

	@FindBy(xpath = "//a[@id='QUER001V']/span[text()='By Value Date']")
	private WebElement Queries_StatementofAccounts_ByValueDate_609;

	public WebElement Queries_StatementofAccounts_ByValueDate_609() {
		return Queries_StatementofAccounts_ByValueDate_609;
	}

	@FindBy(xpath = "//input[@id='accCy_QUER001V']")
	private WebElement Queries_StatementofAccounts_Currency_609;

	public WebElement Queries_StatementofAccounts_Currency_609() {
		return Queries_StatementofAccounts_Currency_609;
	}

	@FindBy(xpath = "//input[@id='accGl_QUER001V']")
	private WebElement Queries_StatementofAccounts_GL_609;

	public WebElement Queries_StatementofAccounts_GL_609() {
		return Queries_StatementofAccounts_GL_609;
	}

	@FindBy(xpath = "//input[@id='accCif_QUER001V']")
	private WebElement Queries_StatementofAccounts_Cif_609;

	public WebElement Queries_StatementofAccounts_Cif_609() {
		return Queries_StatementofAccounts_Cif_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_accSl_QUER001V']")
	private WebElement Queries_StatementofAccounts_SerialNumber_609;

	public WebElement Queries_StatementofAccounts_SerialNumber_609() {
		return Queries_StatementofAccounts_SerialNumber_609;
	}

	@FindBy(xpath = "//label[@id='statementOfAccountsForm_QUER001V_Retrieve_key']")
	private WebElement Queries_StatementofAccounts_Retrieve_609;

	public WebElement Queries_StatementofAccounts_Retrieve_609() {
		return Queries_StatementofAccounts_Retrieve_609;
	}

	@FindBy(xpath = "//input[@id='balValDt_QUER001V']")
	private WebElement Queries_StatementofAccounts_BalanceValue_609;

	public WebElement Queries_StatementofAccounts_BalanceValue_609() {
		return Queries_StatementofAccounts_BalanceValue_609;
	}

	/// *** Accounts --> General Accounts ***///

	@FindBy(xpath = "//a[@id='A002ACT']/span[text()='Authorize Close With Transfer']")
	private WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_609;

	public WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_609() {
		return Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AC_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_CifCode_609;

	public WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_CifCode_609() {
		return Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_CifCode_609;
	}

	@FindBy(xpath = "//a[@id='A002CL']/span[text()='Close']")
	private WebElement Accounts_GeneralAccounts_Close_609;

	public WebElement Accounts_GeneralAccounts_Close_609() {
		return Accounts_GeneralAccounts_Close_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002CL_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Close_CifCode_609;

	public WebElement Accounts_GeneralAccounts_Close_CifCode_609() {
		return Accounts_GeneralAccounts_Close_CifCode_609;
	}

	@FindBy(xpath = "//a[@id='A002AC']/span[text()='Authorize Close']")
	private WebElement Accounts_GeneralAccounts_AuthorizeClose_609;

	public WebElement Accounts_GeneralAccounts_AuthorizeClose_609() {
		return Accounts_GeneralAccounts_AuthorizeClose_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AC_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_AuthorizeClose_CifCode_609;

	public WebElement Accounts_GeneralAccounts_AuthorizeClose_CifCode_609() {
		return Accounts_GeneralAccounts_AuthorizeClose_CifCode_609;
	}

	@FindBy(xpath = "//a[@id='A002CLT']/span[text()='Close With Transfer']")
	private WebElement Accounts_GeneralAccounts_CloseWithTransfer_609;

	public WebElement Accounts_GeneralAccounts_CloseWithTransfer_609() {
		return Accounts_GeneralAccounts_CloseWithTransfer_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002CLT_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_CloseWithTransfer_CifCode_609;

	public WebElement Accounts_GeneralAccounts_CloseWithTransfer_CifCode_609() {
		return Accounts_GeneralAccounts_CloseWithTransfer_CifCode_609;
	}

	@FindBy(xpath = "//a[@id='A002XJ']/span[text()='Reject']")
	private WebElement Accounts_GeneralAccounts_Reject_609;

	public WebElement Accounts_GeneralAccounts_Reject_609() {
		return Accounts_GeneralAccounts_Reject_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002XJ_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Reject_CifCode_609;

	public WebElement Accounts_GeneralAccounts_Reject_CifCode_609() {
		return Accounts_GeneralAccounts_Reject_CifCode_609;
	}

	@FindBy(xpath = "//a[@id='A002PR']/span[text()='Print']")
	private WebElement Accounts_GeneralAccounts_Print_609;

	public WebElement Accounts_GeneralAccounts_Print_609() {
		return Accounts_GeneralAccounts_Print_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002PR_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Print_CifCode_609;

	public WebElement Accounts_GeneralAccounts_Print_CifCode_609() {
		return Accounts_GeneralAccounts_Print_CifCode_609;
	}

	@FindBy(xpath = "//a[@id='A002MT']/span[text()='Opening']")
	private WebElement Accounts_GeneralAccounts_Opening_609;

	public WebElement Accounts_GeneralAccounts_Opening_609() {
		return Accounts_GeneralAccounts_Opening_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A002MT']")
	private WebElement Accounts_GeneralAccounts_Opening_Currency_609;

	public WebElement Accounts_GeneralAccounts_Opening_Currency_609() {
		return Accounts_GeneralAccounts_Opening_Currency_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_glType_A002MT']")
	private WebElement Accounts_GeneralAccounts_Opening_GL_609;

	public WebElement Accounts_GeneralAccounts_Opening_GL_609() {
		return Accounts_GeneralAccounts_Opening_GL_609;
	}

	@FindBy(xpath = "//span[@id='spanLookup_cifNo_A002MT']/span")
	private WebElement Accounts_GeneralAccounts_Opening_CifSearch_609;

	public WebElement Accounts_GeneralAccounts_Opening_CifSearch_609() {
		return Accounts_GeneralAccounts_Opening_CifSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_cifNo_A002MT_gs_CIF_NO']")
	private WebElement Accounts_GeneralAccounts_Opening_Cif_609;

	public WebElement Accounts_GeneralAccounts_Opening_Cif_609() {
		return Accounts_GeneralAccounts_Opening_Cif_609;
	}

	/// *** Recording of Remittance ---> Maintenance ***///

	@FindBy(xpath = "//td[text()='Recording of Remittance']")
	private WebElement RecordingofRemittance_609;

	public WebElement RecordingofRemittance_609() {
		return RecordingofRemittance_609;
	}

	@FindBy(xpath = "//a[@id='RRTMT']//span[text()='Maintenance']")
	private WebElement RecordingofRemittance_Maintenance_609;

	public WebElement RecordingofRemittance_Maintenance_609() {
		return RecordingofRemittance_Maintenance_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_vaultLookup_RRTMT']")
	private WebElement RecordingofRemittance_Maintenance_VaultNoSearch;

	public WebElement RecordingofRemittance_Maintenance_VaultNoSearch() {
		return RecordingofRemittance_Maintenance_VaultNoSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_vaultLookup_RRTMT_gs_CODE']")
	private WebElement RecordingofRemittance_Maintenance_VaultCode_609;

	public WebElement RecordingofRemittance_Maintenance_VaultCode_609() {
		return RecordingofRemittance_Maintenance_VaultCode_609;
	}

	@FindBy(xpath = "//select[@id='REMITT_TYPE_RRTMT']")
	private WebElement RecordingofRemittance_Maintenance_RemittanceType;

	public WebElement RecordingofRemittance_Maintenance_RemittanceType() {
		return RecordingofRemittance_Maintenance_RemittanceType;
	}
	// Certificate of Deposit

//	@FindBy(xpath = "//span[@id='spanLookup_remittanceTypeLookup_RRTMT']/span")
//	private WebElement RecordingofRemittance_Maintenance_CDTypeSearch_609;
//	public WebElement RecordingofRemittance_Maintenance_CDTypeSearch_609() {
//		return RecordingofRemittance_Maintenance_CDTypeSearch_609;
//	}
//	
//	@FindBy(xpath = "//input[@id='gridtab_remittanceTypeLookup_RRTMT_gs_CODE']")
//	private WebElement RecordingofRemittance_Maintenance_CDTypeCode_609;
//	public WebElement RecordingofRemittance_Maintenance_CDTypeCode_609() {
//		return RecordingofRemittance_Maintenance_CDTypeCode_609;
//	}
	// table[@id='gridtab_remittanceTypeLookup_RRTMT']//td[text()='12']

//	@FindBy(xpath = "//span[@id='spanLookup_currencyLookup_RRTMT']/span")
//	private WebElement RecordingofRemittance_Maintenance_CurrencySearch_609;
//	public WebElement RecordingofRemittance_Maintenance_CurrencySearch_609() {
//		return RecordingofRemittance_Maintenance_CurrencySearch_609;
//	}
	@FindBy(xpath = "//input[@id='SEQUENCE_FR_RRTMT']")
	private WebElement RecordingofRemittance_Maintenance_SequenceFrom_609;

	public WebElement RecordingofRemittance_Maintenance_SequenceFrom_609() {
		return RecordingofRemittance_Maintenance_SequenceFrom_609;
	}

//	@FindBy(xpath = "//input[@id='gridtab_currencyLookup_RRTMT_gs_CURRENCY_CODE']")
//	private WebElement RecordingofRemittance_Maintenance_CurrencyCode_609;
//	public WebElement RecordingofRemittance_Maintenance_CurrencyCode_609() {
//		return RecordingofRemittance_Maintenance_CurrencyCode_609;
//	}
	// table[@id='gridtab_currencyLookup_RRTMT']//td[text()='840']

	@FindBy(xpath = "//input[@id='AMOUNT_RRTMT']")
	private WebElement RecordingofRemittance_Maintenance_TotalAmount_609;

	public WebElement RecordingofRemittance_Maintenance_TotalAmount_609() {
		return RecordingofRemittance_Maintenance_TotalAmount_609;
	}

//	@FindBy(xpath = "//td[@id='add_recordOfRemittanceDenomGridTbl_Id_RRTMT']/div/span")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_AddIcon_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_AddIcon_609() {
//		return RecordingofRemittance_Maintenance_Denomination_AddIcon_609;
//	}
//	//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[1]

//	
//	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[2]/input")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_Serial_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_Serial_609() {
//		return RecordingofRemittance_Maintenance_Denomination_Serial_609;
//	}
//	
//	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[3]//input")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber_609() {
//		return RecordingofRemittance_Maintenance_Denomination_FromNumber_609;
//	}
//	
//	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[4]//input")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_ToNumber_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_ToNumber_609() {
//		return RecordingofRemittance_Maintenance_Denomination_ToNumber_609;
//	}
//	
//	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[5]//input")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_Quantity_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_Quantity_609() {
//		return RecordingofRemittance_Maintenance_Denomination_Quantity_609;
//	}
//	
//	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[6]//input")
//	private WebElement RecordingofRemittance_Maintenance_Denomination_Value_609;
//	public WebElement RecordingofRemittance_Maintenance_Denomination_Value_609() {
//		return RecordingofRemittance_Maintenance_Denomination_Value_609;
//	}

	@FindBy(xpath = "//span[text()='Send Alert']//parent::div//span[text()='close']")
	private WebElement SendAlert_Close_609;

	public WebElement SendAlert_Close_609() {
		return SendAlert_Close_609;
	}

	/// *** Recording of Remittance ---> Approve ***///

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE']")
	private WebElement RecordingofRemittance_Approve_RemittanceType_609;

	public WebElement RecordingofRemittance_Approve_RemittanceType_609() {
		return RecordingofRemittance_Approve_RemittanceType_609;
	}
	// table[@id='recordOfRemittanceMaintGridTbl_Id_RRTP']//td[text()='12']

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_RECEIVED_DATE']")
	private WebElement RecordingofRemittance_Approve_ReceivedDate_609;

	public WebElement RecordingofRemittance_Approve_ReceivedDate_609() {
		return RecordingofRemittance_Approve_ReceivedDate_609;
	}

	@FindBy(xpath = "//input[@id='TRS_NO_RRTP']")
	private WebElement RecordingofRemittance_Approve_TransactionNoDenisk_609;

	public WebElement RecordingofRemittance_Approve_TransactionNoDenisk_609() {
		return RecordingofRemittance_Approve_TransactionNoDenisk_609;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTP_Approve_key']")
	private WebElement RecordingofRemittance_Approve_ApproveBtn_609;

	public WebElement RecordingofRemittance_Approve_ApproveBtn_609() {
		return RecordingofRemittance_Approve_ApproveBtn_609;
	}

	/// *** Recording of Remittance ---> To Be Cancelled ***///

	@FindBy(xpath = "//a[@id='RRTTC']//span[text()='To Be Cancelled']")
	private WebElement RecordingofRemittance_ToBeCancelled_609;

	public WebElement RecordingofRemittance_ToBeCancelled_609() {
		return RecordingofRemittance_ToBeCancelled_609;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ToBeCancelled_TransactionNo_609;

	public WebElement RecordingofRemittance_ToBeCancelled_TransactionNo_609() {
		return RecordingofRemittance_ToBeCancelled_TransactionNo_609;
	}

	@FindBy(xpath = "//span[@id='spanLookup_vaultLookup_RRTTC']/span")
	private WebElement RecordingofRemittance_ToBeCancelled_VaultNoSearch_609;

	public WebElement RecordingofRemittance_ToBeCancelled_VaultNoSearch_609() {
		return RecordingofRemittance_ToBeCancelled_VaultNoSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_vaultLookup_RRTTC_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeCancelled_VaultCode_609;

	public WebElement RecordingofRemittance_ToBeCancelled_VaultCode_609() {
		return RecordingofRemittance_ToBeCancelled_VaultCode_609;
	}
	// table[@id='gridtab_vaultLookup_RRTTC']//td[text()='1001']

	@FindBy(xpath = "//select[@id='REMITT_TYPE_RRTTC']")
	private WebElement RecordingofRemittance_ToBeCancelled_RemittanceType_609;

	public WebElement RecordingofRemittance_ToBeCancelled_RemittanceType_609() {
		return RecordingofRemittance_ToBeCancelled_RemittanceType_609;
	}
	// Certificate of Deposit

	@FindBy(xpath = "//span[@id='spanLookup_remittanceTypeLookup_RRTTC']/span")
	private WebElement RecordingofRemittance_ToBeCancelled_CDTypeSearch_609;

	public WebElement RecordingofRemittance_ToBeCancelled_CDTypeSearch_609() {
		return RecordingofRemittance_ToBeCancelled_CDTypeSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_remittanceTypeLookup_RRTTC_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeCancelled_CDTypeCode_609;

	public WebElement RecordingofRemittance_ToBeCancelled_CDTypeCode_609() {
		return RecordingofRemittance_ToBeCancelled_CDTypeCode_609;
	}
	// table[@id='gridtab_remittanceTypeLookup_RRTTC']//td[text()='12']

	@FindBy(xpath = "//span[@id='spanLookup_currencyLookup_RRTTC']/span")
	private WebElement RecordingofRemittance_ToBeCancelled_CurrencySearch_609;

	public WebElement RecordingofRemittance_ToBeCancelled_CurrencySearch_609() {
		return RecordingofRemittance_ToBeCancelled_CurrencySearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_currencyLookup_RRTTC_gs_CURRENCY_CODE']")
	private WebElement RecordingofRemittance_ToBeCancelled_CurrencyCode_609;

	public WebElement RecordingofRemittance_ToBeCancelled_CurrencyCode_609() {
		return RecordingofRemittance_ToBeCancelled_CurrencyCode_609;
	}

	/// *** Recording of Remittance ---> Approve Cancel ***///

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ApproveCancel_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ApproveCancel_TransactionNoDenisk() {
		return RecordingofRemittance_ApproveCancel_TransactionNoDenisk;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_VAULT_NO']")
	private WebElement RecordingofRemittance_ApproveCancel_VaultNo_609;

	public WebElement RecordingofRemittance_ApproveCancel_VaultNo_609() {
		return RecordingofRemittance_ApproveCancel_VaultNo_609;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_REMITTANCE_TYPE']")
	private WebElement RecordingofRemittance_ApproveCancel_RemittanceType_609;

	public WebElement RecordingofRemittance_ApproveCancel_RemittanceType_609() {
		return RecordingofRemittance_ApproveCancel_RemittanceType_609;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_RECEIVED_DATE']")
	private WebElement RecordingofRemittance_ApproveCancel_ReceivedDate_609;

	public WebElement RecordingofRemittance_ApproveCancel_ReceivedDate_609() {
		return RecordingofRemittance_ApproveCancel_ReceivedDate_609;
	}

	/// *** Recording of Remittance ---> To Be Destroyed ***///

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ToBeDestroyed_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ToBeDestroyed_TransactionNoDenisk() {
		return RecordingofRemittance_ToBeDestroyed_TransactionNoDenisk;
	}

	@FindBy(xpath = "//span[@id='spanLookup_vaultLookup_RRTDY']/span")
	private WebElement RecordingofRemittance_ToBeDestroyed_VaultNoSearch_609;

	public WebElement RecordingofRemittance_ToBeDestroyed_VaultNoSearch_609() {
		return RecordingofRemittance_ToBeDestroyed_VaultNoSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_vaultLookup_RRTDY_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeDestroyed_VaultCode_609;

	public WebElement RecordingofRemittance_ToBeDestroyed_VaultCode_609() {
		return RecordingofRemittance_ToBeDestroyed_VaultCode_609;
	}
	// table[@id='gridtab_vaultLookup_RRTDY']//td[text()='1001']

	@FindBy(xpath = "//select[@id='REMITT_TYPE_RRTDY']")
	private WebElement RecordingofRemittance_ToBeDestroyed_RemittanceType_609;

	public WebElement RecordingofRemittance_ToBeDestroyed_RemittanceType_609() {
		return RecordingofRemittance_ToBeDestroyed_RemittanceType_609;
	}
	// Certificate of Deposit

	@FindBy(xpath = "//span[@id='spanLookup_remittanceTypeLookup_RRTDY']/span")
	private WebElement RecordingofRemittance_ToBeDestroyed_CDTypeSearch_609;

	public WebElement RecordingofRemittance_ToBeDestroyed_CDTypeSearch_609() {
		return RecordingofRemittance_ToBeDestroyed_CDTypeSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_remittanceTypeLookup_RRTDY_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeDestroyed_CDTypeCode_609;

	public WebElement RecordingofRemittance_ToBeDestroyed_CDTypeCode_609() {
		return RecordingofRemittance_ToBeDestroyed_CDTypeCode_609;
	}
	// table[@id='gridtab_remittanceTypeLookup_RRTDY']//td[text()='12']

	@FindBy(xpath = "//span[@id='spanLookup_currencyLookup_RRTDY']/span")
	private WebElement RecordingofRemittance_ToBeDestroyed_CurrencySearch_609;

	public WebElement RecordingofRemittance_ToBeDestroyed_CurrencySearch_609() {
		return RecordingofRemittance_ToBeDestroyed_CurrencySearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_currencyLookup_RRTDY_gs_CURRENCY_CODE']")
	private WebElement RecordingofRemittance_ToBeDestroyed_CurrencyCode_609;

	public WebElement RecordingofRemittance_ToBeDestroyed_CurrencyCode_609() {
		return RecordingofRemittance_ToBeDestroyed_CurrencyCode_609;
	}

	/// *** Recording of Remittance ---> Approve Destroy ***///

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ApproveDestroy_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ApproveDestroy_TransactionNoDenisk() {
		return RecordingofRemittance_ApproveDestroy_TransactionNoDenisk;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_VAULT_NO']")
	private WebElement RecordingofRemittance_ApproveDestroy_VaultNo_609;

	public WebElement RecordingofRemittance_ApproveDestroy_VaultNo_609() {
		return RecordingofRemittance_ApproveDestroy_VaultNo_609;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_REMITTANCE_TYPE']")
	private WebElement RecordingofRemittance_ApproveDestroy_RemittanceType_609;

	public WebElement RecordingofRemittance_ApproveDestroy_RemittanceType_609() {
		return RecordingofRemittance_ApproveDestroy_RemittanceType_609;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_RECEIVED_DATE']")
	private WebElement RecordingofRemittance_ApproveDestroy_ReceivedDate_609;

	public WebElement RecordingofRemittance_ApproveDestroy_ReceivedDate_609() {
		return RecordingofRemittance_ApproveDestroy_ReceivedDate_609;
	}

	/// *** Recording of Remittance ---> To Be Damaged ***///

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ToBeDamaged_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ToBeDamaged_TransactionNoDenisk() {
		return RecordingofRemittance_ToBeDamaged_TransactionNoDenisk;
	}

	@FindBy(xpath = "//span[@id='spanLookup_vaultLookup_RRTDM']/span")
	private WebElement RecordingofRemittance_ToBeDamaged_VaultNoSearch_609;

	public WebElement RecordingofRemittance_ToBeDamaged_VaultNoSearch_609() {
		return RecordingofRemittance_ToBeDamaged_VaultNoSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_vaultLookup_RRTDM_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeDamaged_VaultCode_609;

	public WebElement RecordingofRemittance_ToBeDamaged_VaultCode_609() {
		return RecordingofRemittance_ToBeDamaged_VaultCode_609;
	}
	// table[@id='gridtab_vaultLookup_RRTDM']//td[text()='1001']

	@FindBy(xpath = "//select[@id='REMITT_TYPE_RRTDM']")
	private WebElement RecordingofRemittance_ToBeDamaged_RemittanceType_609;

	public WebElement RecordingofRemittance_ToBeDamaged_RemittanceType_609() {
		return RecordingofRemittance_ToBeDamaged_RemittanceType_609;
	}
	// Certificate of Deposit

	@FindBy(xpath = "//span[@id='spanLookup_remittanceTypeLookup_RRTDM']/span")
	private WebElement RecordingofRemittance_ToBeDamaged_CDTypeSearch_609;

	public WebElement RecordingofRemittance_ToBeDamaged_CDTypeSearch_609() {
		return RecordingofRemittance_ToBeDamaged_CDTypeSearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_remittanceTypeLookup_RRTDM_gs_CODE']")
	private WebElement RecordingofRemittance_ToBeDamaged_CDTypeCode_609;

	public WebElement RecordingofRemittance_ToBeDamaged_CDTypeCode_609() {
		return RecordingofRemittance_ToBeDamaged_CDTypeCode_609;
	}
	// table[@id='gridtab_remittanceTypeLookup_RRTDM']//td[text()='12']

	@FindBy(xpath = "//span[@id='spanLookup_currencyLookup_RRTDM']/span")
	private WebElement RecordingofRemittance_ToBeDamaged_CurrencySearch_609;

	public WebElement RecordingofRemittance_ToBeDamaged_CurrencySearch_609() {
		return RecordingofRemittance_ToBeDamaged_CurrencySearch_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_currencyLookup_RRTDM_gs_CURRENCY_CODE']")
	private WebElement RecordingofRemittance_ToBeDamaged_CurrencyCode_609;

	public WebElement RecordingofRemittance_ToBeDamaged_CurrencyCode_609() {
		return RecordingofRemittance_ToBeDamaged_CurrencyCode_609;
	}

	@FindBy(xpath = "//label[@id='recordOfRemittanceMaintForm_RRTDM_To_Damage_key']")
	private WebElement RecordingofRemittance_ToBeDamaged_ToDamageBtn_609;

	public WebElement RecordingofRemittance_ToBeDamaged_ToDamageBtn_609() {
		return RecordingofRemittance_ToBeDamaged_ToDamageBtn_609;
	}

	/// *** Recording of Remittance ---> Approve Damage ***///

	@FindBy(xpath = "//a[@id='RRTADM']//span[text()='Approve Damage']")
	private WebElement RecordingofRemittance_ApproveDamage_609;

	public WebElement RecordingofRemittance_ApproveDamage_609() {
		return RecordingofRemittance_ApproveDamage_609;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_TRS_NO']")
	private WebElement RecordingofRemittance_ApproveDamage_TransactionNoDenisk;

	public WebElement RecordingofRemittance_ApproveDamage_TransactionNoDenisk() {
		return RecordingofRemittance_ApproveDamage_TransactionNoDenisk;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_VAULT_NO']")
	private WebElement RecordingofRemittance_ApproveDamage_VaultNo_609;

	public WebElement RecordingofRemittance_ApproveDamage_VaultNo_609() {
		return RecordingofRemittance_ApproveDamage_VaultNo_609;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_REMITTANCE_TYPE']")
	private WebElement RecordingofRemittance_ApproveDamage_RemittanceType_609;

	public WebElement RecordingofRemittance_ApproveDamage_RemittanceType_609() {
		return RecordingofRemittance_ApproveDamage_RemittanceType_609;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_RECEIVED_DATE']")
	private WebElement RecordingofRemittance_ApproveDamage_ReceivedDate_609;

	public WebElement RecordingofRemittance_ApproveDamage_ReceivedDate_609() {
		return RecordingofRemittance_ApproveDamage_ReceivedDate_609;
	}

	/// *** Transactions --> Amend Standing Order ***///

	@FindBy(xpath = "//span[text()='Amend Standing Order']")
	private WebElement Transactions_AmendStandingOrder_609;

	public WebElement Transactions_AmendStandingOrder_609() {
		return Transactions_AmendStandingOrder_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_AmendStandingOrder_TransactionNo_609;

	public WebElement Transactions_AmendStandingOrder_TransactionNo_609() {
		return Transactions_AmendStandingOrder_TransactionNo_609;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001AS']//td[text()='9594'])[1]

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001AS']")
	private WebElement Transactions_AmendStandingOrder_DebitCif_609;

	public WebElement Transactions_AmendStandingOrder_DebitCif_609() {
		return Transactions_AmendStandingOrder_DebitCif_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001AS']")
	private WebElement Transactions_AmendStandingOrder_DebitSerialNo_609;

	public WebElement Transactions_AmendStandingOrder_DebitSerialNo_609() {
		return Transactions_AmendStandingOrder_DebitSerialNo_609;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001AS']")
	private WebElement Transactions_AmendStandingOrder_CreditCif_609;

	public WebElement Transactions_AmendStandingOrder_CreditCif_609() {
		return Transactions_AmendStandingOrder_CreditCif_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001AS']")
	private WebElement Transactions_AmendStandingOrder_CreditSerialNo_609;

	public WebElement Transactions_AmendStandingOrder_CreditSerialNo_609() {
		return Transactions_AmendStandingOrder_CreditSerialNo_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AS_gs_statusDesc']")
	private WebElement Transactions_AmendStandingOrder_Status_609;

	public WebElement Transactions_AmendStandingOrder_Status_609() {
		return Transactions_AmendStandingOrder_Status_609;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001AS']//button/span)[1]")
	private WebElement Transactions_AmendStandingOrder_AmendStandingOrderBtn_609;

	public WebElement Transactions_AmendStandingOrder_AmendStandingOrderBtn_609() {
		return Transactions_AmendStandingOrder_AmendStandingOrderBtn_609;
	}

	/// *** Transactions --> To Be Stopped Standing Order ***///

	@FindBy(xpath = "//span[text()='To Be Stopped  Standing Order']")
	private WebElement Transactions_ToBeStoppedStandingOrder_609;

	public WebElement Transactions_ToBeStoppedStandingOrder_609() {
		return Transactions_ToBeStoppedStandingOrder_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ToBeStoppedStandingOrder_TransactionNo_609;

	public WebElement Transactions_ToBeStoppedStandingOrder_TransactionNo_609() {
		return Transactions_ToBeStoppedStandingOrder_TransactionNo_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TS_gs_statusDesc']")
	private WebElement Transactions_ToBeStoppedStandingOrder_Status_609;

	public WebElement Transactions_ToBeStoppedStandingOrder_Status_609() {
		return Transactions_ToBeStoppedStandingOrder_Status_609;
	}

	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001TS']")
	private WebElement Transactions_ToBeStoppedStandingOrder_ToStopSOReason_609;

	public WebElement Transactions_ToBeStoppedStandingOrder_ToStopSOReason_609() {
		return Transactions_ToBeStoppedStandingOrder_ToStopSOReason_609;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001TS']//button/span)[1]")
	private WebElement Transactions_ToBeStoppedStandingOrder_ToStopSOBtn_609;

	public WebElement Transactions_ToBeStoppedStandingOrder_ToStopSOBtn_609() {
		return Transactions_ToBeStoppedStandingOrder_ToStopSOBtn_609;
	}

	@FindBy(xpath = "//span[text()='Stop Standing Order']")
	private WebElement Transactions_StopStandingOrder_609;

	public WebElement Transactions_StopStandingOrder_609() {
		return Transactions_StopStandingOrder_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001SS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_StopStandingOrder_TransactionNo_609;

	public WebElement Transactions_StopStandingOrder_TransactionNo_609() {
		return Transactions_StopStandingOrder_TransactionNo_609;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001SS']//td[text()='9593'])[1]

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001SS']//button/span)[1]")
	private WebElement Transactions_StopStandingOrder_StopSOBtn_609;

	public WebElement Transactions_StopStandingOrder_StopSOBtn_609() {
		return Transactions_StopStandingOrder_StopSOBtn_609;
	}

	/// *** Transactions --> Reactivate Standing Order ***///

	@FindBy(xpath = "//span[text()='Reactivate Standing Order']")
	private WebElement Transactions_ReactivateStandingOrder_609;

	public WebElement Transactions_ReactivateStandingOrder_609() {
		return Transactions_ReactivateStandingOrder_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ReactivateStandingOrder_TransactionNo_609;

	public WebElement Transactions_ReactivateStandingOrder_TransactionNo_609() {
		return Transactions_ReactivateStandingOrder_TransactionNo_609;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001AS']//td[text()='9594'])[1]

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RS_gs_statusDesc']")
	private WebElement Transactions_ReactivateStandingOrder_Status_609;

	public WebElement Transactions_ReactivateStandingOrder_Status_609() {
		return Transactions_ReactivateStandingOrder_Status_609;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001RS']//button/span)[1]")
	private WebElement Transactions_ReactivateStandingOrder_ReactivateSOBtn_609;

	public WebElement Transactions_ReactivateStandingOrder_ReactivateSOBtn_609() {
		return Transactions_ReactivateStandingOrder_ReactivateSOBtn_609;
	}

	@FindBy(xpath = "//span[text()='Approve Reactivate Standing Order']")
	private WebElement Transactions_ApproveReactivateStandingOrder_609;

	public WebElement Transactions_ApproveReactivateStandingOrder_609() {
		return Transactions_ApproveReactivateStandingOrder_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001ARS_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApproveReactivateStandingOrder_TransactionNo_609;

	public WebElement Transactions_ApproveReactivateStandingOrder_TransactionNo_609() {
		return Transactions_ApproveReactivateStandingOrder_TransactionNo_609;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001ARS']//td[text()='9593'])[1]

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001ARS']//button/span)[1]")
	private WebElement Transactions_ApproveReactivateStandingOrder_ApplyReactivateSOBtn_609;

	public WebElement Transactions_ApproveReactivateStandingOrder_ApplyReactivateSOBtn_609() {
		return Transactions_ApproveReactivateStandingOrder_ApplyReactivateSOBtn_609;
	}

	/// *** Transactions --> To Be Closed Standing Order ***///

	@FindBy(xpath = "//span[text()='To Be Closed Standing Order']")
	private WebElement Transactions_ToBeClosedStandingOrder_609;

	public WebElement Transactions_ToBeClosedStandingOrder_609() {
		return Transactions_ToBeClosedStandingOrder_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001TCL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ToBeClosedStandingOrder_TransactionNo_609;

	public WebElement Transactions_ToBeClosedStandingOrder_TransactionNo_609() {
		return Transactions_ToBeClosedStandingOrder_TransactionNo_609;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001TCL']//td[text()='9594'])[1]

	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001TCL']")
	private WebElement Transactions_ToBeClosedStandingOrder_ToCloseSOReason_609;

	public WebElement Transactions_ToBeClosedStandingOrder_ToCloseSOReason_609() {
		return Transactions_ToBeClosedStandingOrder_ToCloseSOReason_609;
	}

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001TCL']//button/span)[1]")
	private WebElement Transactions_ToBeClosedStandingOrder_ToCloseSOBtn_609;

	public WebElement Transactions_ToBeClosedStandingOrder_ToCloseSOBtn_609() {
		return Transactions_ToBeClosedStandingOrder_ToCloseSOBtn_609;
	}

	@FindBy(xpath = "//span[text()='Close Standing Order']")
	private WebElement Transactions_CloseStandingOrder_609;

	public WebElement Transactions_CloseStandingOrder_609() {
		return Transactions_CloseStandingOrder_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001CL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_CloseStandingOrder_TransactionNo_609;

	public WebElement Transactions_CloseStandingOrder_TransactionNo_609() {
		return Transactions_CloseStandingOrder_TransactionNo_609;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001CL']//td[text()='9600'])[1]

	@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001CL']//button/span)[1]")
	private WebElement Transactions_CloseStandingOrder_CloseSOBtn_609;

	public WebElement Transactions_CloseStandingOrder_CloseSOBtn_609() {
		return Transactions_CloseStandingOrder_CloseSOBtn_609;
	}

	@FindBy(xpath = "//input[@id='current_status_D001MT']")
	private WebElement Transactions_Maintenance_Status_609;

	public WebElement Transactions_Maintenance_Status_609() {
		return Transactions_Maintenance_Status_609;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_So_Det_key']")
	private WebElement Transactions_Maintenance_SODetails_609;

	public WebElement Transactions_Maintenance_SODetails_609() {
		return Transactions_Maintenance_SODetails_609;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-trxMgntSoDetBtnDiv_id_D001MT']")
	private WebElement Transactions_Maintenance_SODetailsDialogBox_609;

	public WebElement Transactions_Maintenance_SODetailsDialogBox_609() {
		return Transactions_Maintenance_SODetailsDialogBox_609;
	}

	@FindBy(xpath = "//select[@id='so_periodicity_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_Periodicity_609;

	public WebElement Transactions_Maintenance_SODetails_Periodicity_609() {
		return Transactions_Maintenance_SODetails_Periodicity_609;
	}
	// Monthly

	@FindBy(xpath = "//select[@id='so_periodicity_type_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_PeriodType_609;

	public WebElement Transactions_Maintenance_SODetails_PeriodType_609() {
		return Transactions_Maintenance_SODetails_PeriodType_609;
	}
	// Specific Day

	@FindBy(xpath = "//select[@id='so_period_interval_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_PeriodInterval_609;

	public WebElement Transactions_Maintenance_SODetails_PeriodInterval_609() {
		return Transactions_Maintenance_SODetails_PeriodInterval_609;
	}

	@FindBy(xpath = "//select[@id='so_period_day_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_DaySpecification_609;

	public WebElement Transactions_Maintenance_SODetails_DaySpecification_609() {
		return Transactions_Maintenance_SODetails_DaySpecification_609;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement Transactions_Maintenance_SODetails_Ok_609;

	public WebElement Transactions_Maintenance_SODetails_Ok_609() {
		return Transactions_Maintenance_SODetails_Ok_609;
	}

	@FindBy(xpath = "//input[@id='so_first_payment_D001MT']")
	private WebElement Transactions_Maintenance_SODetails_Payment_609;

	public WebElement Transactions_Maintenance_SODetails_Payment_609() {
		return Transactions_Maintenance_SODetails_Payment_609;
	}

	/// *** Send Alert ***///

	@FindBy(xpath = "//td[text()='KARTHIK']")
	private WebElement Transaction_maintanance_alertclickingUserId_609;

	public WebElement Transaction_maintanance_alertclickingUserId_609() {
		return Transaction_maintanance_alertclickingUserId_609;
	}

	@FindBy(xpath = "//span[text()=' Send ']//parent::a")
	private WebElement Transaction_maintanance_alertclickingUserId_SendBtn_609;

	public WebElement Transaction_maintanance_alertclickingUserId_SendBtn_609() {
		return Transaction_maintanance_alertclickingUserId_SendBtn_609;
	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo;

	public WebElement BMUserAlertEnterTRXNo() {
		return BMUser_Alert_EnterTRXNo;
	}

	@FindBy(xpath = "//input[@id='amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount_609;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount_609() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_Amount_609;
	}

	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_609;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey_609() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_609;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement CSM_ConfirmOk_609;

	public WebElement CSM_ConfirmOk_609() {
		return CSM_ConfirmOk_609;
	}

//	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
//	private WebElement CSM_Ok_609;
//	public WebElement CSM_Ok_609() {
//		return CSM_Ok_609;
//	}

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

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateAfterApproveBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateAfterApproveBtn_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateAfterApproveBtn_609;
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
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn;
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

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMSADS_ClickOkButtonInSuccessPopUpMenu;

	public WebElement CSMSADSClickOkButtonInSuccessPopUpMenu() {
		return CSMSADS_ClickOkButtonInSuccessPopUpMenu;
	}
//	@FindBy(xpath="//td[text()='Recording of Remittance']")
//	private WebElement CSM_RecordingofRemittance_Menu_612;
//	public WebElement CSM_RecordingofRemittance_Menu_612() {
//		return CSM_RecordingofRemittance_Menu_612;
//	}
//	
//	@FindBy(xpath="//span[text()='Maintenance']")
//	private WebElement CSM_RecordingofRemittance_Maintenance_612;
//	public WebElement CSM_RecordingofRemittance_Maintenance_612() {
//		return CSM_RecordingofRemittance_Maintenance_612;
//	}
//	@FindBy(xpath="//input[@id='lookuptxt_vaultLookup_RRTMT']")
//	private WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_612;
//	public WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_612() {
//		return CSM_RecordingofRemittance_Maintenance_valutNo_Search_612;
//	}
//	@FindBy(id="td_gridtab_vaultLookup_RRTMT_2_CODE")//double
//	private WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_612;
//	public WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_612() {
//		return CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_612;
//	}
//	//Demand Draft
//	@FindBy(xpath="//select[@name='recordOfRemittanceCO.remittanceRecordVO.REMITT_TYPE']")
//	private WebElement CSM_RecordingofRemittance_Maintenance_RemittanceType_612;
//	public WebElement CSM_RecordingofRemittance_Maintenance_RemittanceType_612() {
//		return CSM_RecordingofRemittance_Maintenance_RemittanceType_612;
//	}

//	@FindBy(xpath="//input[@id='lookuptxt_remittanceTypeLookup_RRTMT']")
//	private WebElement CSM_RecordingofRemittance_Maintenance_DDType_612;
//	public WebElement CSM_RecordingofRemittance_Maintenance_DDType_612() {
//		return CSM_RecordingofRemittance_Maintenance_DDType_612;
//	}
//
//
//	
//	
//	@FindBy(id="recordOfRemittanceMaintForm_RRTMT_btn_save")
//	private WebElement CSM_RecordingofRemittance_Maintenance_Save_612;
//	public WebElement CSM_RecordingofRemittance_Maintenance_Save_612() {
//		return CSM_RecordingofRemittance_Maintenance_Save_612;
//	}
//	//span[text()='Approve']
//	@FindBy(xpath="//a[@id='RRTP']")
//	private WebElement CSM_RecordingofRemittance_ApproveMenu_612;
//	public WebElement CSM_RecordingofRemittance_ApproveMenu_612() {
//		return CSM_RecordingofRemittance_ApproveMenu_612;
//	}
//	
//	@FindBy(id="recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE")
//	private WebElement CSM_RecordingofRemittance_RemittanceType_612;
//	public WebElement CSM_RecordingofRemittance_RemittanceType_612() {
//		return CSM_RecordingofRemittance_RemittanceType_612;
//	}
//	@FindBy(id="recordOfRemittanceMaintGridTbl_Id_RRTP_gs_RECEIVED_DATE")
//	private WebElement CSM_RecordingofRemittance_ReceivedDate_612;
//	public WebElement CSM_RecordingofRemittance_ReceivedDate_612() {
//		return CSM_RecordingofRemittance_ReceivedDate_612;
//	}
//	
//	@FindBy(id="td_recordOfRemittanceMaintGridTbl_Id_RRTP_1_REMITTANCE_TYPE")
//	private WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_612;
//	public WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_612() {
//		return CSM_RecordingofRemittance_ReceivedDate_DoubleClk_612;
////	}
//	@FindBy(xpath="//button[@id='recordOfRemittance_approve_RRTP']")
//	private WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_612;
//	public WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_612() {
//		return CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_612;
//	}
//	@FindBy(id="infoBarSearchButton_RRTMT")
//	private WebElement CSM_RecordingofRemittance_Maintenace_Search_612;
//	public WebElement CSM_RecordingofRemittance_Maintenace_Search_612() {
//		return CSM_RecordingofRemittance_Maintenace_Search_612;
//	}
//	
//	@FindBy(id="recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_RECEIVED_DATE")
//	private WebElement CSM_RecordingofRemittance_Maintenace_ReceviedData_612;
//	public WebElement CSM_RecordingofRemittance_Maintenace_ReceviedData_612() {
//		return CSM_RecordingofRemittance_Maintenace_ReceviedData_612;
//	}
//	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
//	private WebElement CSM_RecordingofRemittance_Maintenace_pop_612;
//	public WebElement CSM_RecordingofRemittance_Maintenace_pop_612() {
//		return CSM_RecordingofRemittance_Maintenace_pop_612;
//	}
//	@FindBy( xpath="//td[text()='Approved']")
//	private WebElement CSM_RecordingofRemittance_Maintenace_validate_612;
//	public WebElement CSM_RecordingofRemittance_Maintenace_validate_612() {
//		return CSM_RecordingofRemittance_Maintenace_validate_612;
//	}
//	
//	@FindBy( xpath="//a[text()='Recording of Remittance / Maintenance']")
//	private WebElement CSM_RecordingofRemittance_Maintenace_TAB_612;
//	public WebElement CSM_RecordingofRemittance_Maintenace_TAB_612() {
//		return CSM_RecordingofRemittance_Maintenace_TAB_612;
//	}
//	@FindBy( xpath="//a[@id='infoBarSearchButton_RRTMT']")
//	private WebElement CSM_RecordingofRemittance_Maintenace_SearchBtn_612;
//	public WebElement CSM_RecordingofRemittance_Maintenace_SearchBtn_612() {
//		return CSM_RecordingofRemittance_Maintenace_SearchBtn_612;
//	}
//	
//	@FindBy( xpath="//a[@id='RRTTC']")
//	private WebElement CSM_RecordingofRemittance_tobeCancel;
//	public WebElement CSM_RecordingofRemittance_tobeCancel_612() {
//		return CSM_RecordingofRemittance_tobeCancel;
//	}
//	
//	@FindBy(id="recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_RECEIVED_DATE")
//	private WebElement CSM_RecordingofRemittance_tobeCancel_recevieddate;
//	public WebElement CSM_RecordingofRemittance_tobeCancel_recevieddate_612() {
//		return CSM_RecordingofRemittance_tobeCancel_recevieddate;
//	}
//		@FindBy(id="infoBarSearchButton_RRTTC")
//		private WebElement CSM_RecordingofRemittance_tobeCancel_Searchbtn;
//		public WebElement CSM_RecordingofRemittance_tobeCancel_Searchbtn_612() {
//			return CSM_RecordingofRemittance_tobeCancel_Searchbtn;	
//		}

//		@FindBy(id="td_recordOfRemittanceMaintGridTbl_Id_RRTTC_1_REMITTANCE_TYPE")
//		private WebElement CSM_RecordingofRemittance_tobeCancel_Recevieddaet_doubletab;
//		public WebElement CSM_RecordingofRemittance_tobeCancel_Recevieddaet_doubletab_612() {
//			return CSM_RecordingofRemittance_tobeCancel_Recevieddaet_doubletab;	
//		}
//		
//		@FindBy(id="recordOfRemittanceMaintForm_RRTTC_To_Cancel_key")
//		private WebElement CSM_RecordingofRemittance_toCancelBtn;
//		public WebElement CSM_RecordingofRemittance_toCancelBtn_612() {
//			return CSM_RecordingofRemittance_toCancelBtn;
//		}
//	//94 to 95	
	@FindBy(xpath = "//td[text()='Remittance Type']")
	private WebElement Remittance_Type;

	public WebElement Remittance_Type() {
		return Remittance_Type;
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
//			@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
//		    private WebElement POPupmsg;
//		    public WebElement POPupmsg() {
//		    	return POPupmsg;
//		  }

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Remittance_Type_Maintenance;

	public WebElement Remittance_Type_Maintenance() {
		return Remittance_Type_Maintenance;
	}

	@FindBy(xpath = "//input[@id='code_P0040MT']")
	private WebElement Remittance_Type_Code;

	public WebElement Remittance_Type_Code() {
		return Remittance_Type_Code;
	}

	@FindBy(xpath = "	//input[@id='brief_name_eng_P0040MT']")
	private WebElement Remittance_Type_Berif_description;

	public WebElement Remittance_Type_Berif_description() {
		return Remittance_Type_Berif_description;
	}

	@FindBy(xpath = "//select[@id='remittance_type_P0040MT']")
	private WebElement Remittance_Type_DropDown;

	public WebElement Remittance_Type_DropDown() {
		return Remittance_Type_DropDown;
	}

	@FindBy(xpath = "//input[@id='long_name_eng_P0040MT']")
	private WebElement Remittance_Type_LongDescription;

	public WebElement Remittance_Type_LongDescription() {
		return Remittance_Type_LongDescription;
	}

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040MT_Save_key']")
	private WebElement Remittance_Type_Save;

	public WebElement Remittance_Type_Save() {
		return Remittance_Type_Save;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Remittance_Type_Approve;

	public WebElement Remittance_Type_Approve() {
		return Remittance_Type_Approve;
	}

	@FindBy(xpath = "//input[@id='remittancetypeList_GridTbl_Id_P0040P_gs_remittanceVO.CODE']")
	private WebElement Remittance_Type_Approve_Code;

	public WebElement Remittance_Type_Approve_Code() {
		return Remittance_Type_Approve_Code;
	}

	@FindBy(xpath = "//table[@id='remittancetypeList_GridTbl_Id_P0040P']")
	private WebElement Remittance_Type_Approve_Code_Double_Click;

	public WebElement Remittance_Type_Approve_Code_Double_Click() {
		return Remittance_Type_Approve_Code_Double_Click;
	}

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040P_Approve_key']")
	private WebElement Remittance_Type_Approve_Approve;

	public WebElement Remittance_Type_Approve_Approve() {
		return Remittance_Type_Approve_Approve;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Remittance_Type_Approve_Confirm_OK;

	public WebElement Remittance_Type_Approve_Confirm_OK() {
		return Remittance_Type_Approve_Confirm_OK;
	}

	@FindBy(xpath = "//input[@id='remittancetypeList_GridTbl_Id_P0040MA_gs_remittanceVO.CODE']")
	private WebElement Remittance_Type_Update_After_Approve_Code;

	public WebElement Remittance_Type_Update_After_Approve_Code() {
		return Remittance_Type_Update_After_Approve_Code;
	}

	@FindBy(xpath = "//td[@id='td_remittancetypeList_GridTbl_Id_P0040MA_1_remittanceVO.CODE']")
	private WebElement Remittance_Type_Update_After_Approve_Code_Double_Click;

	public WebElement Remittance_Type_Update_After_Approve_Code_Double_Click() {
		return Remittance_Type_Update_After_Approve_Code_Double_Click;
	}

	@FindBy(xpath = "//input[@id='brief_name_eng_P0040MA']")
	private WebElement Remittance_Type_Update_After_Approve_ChangeData;

	public WebElement Remittance_Type_Update_After_Approve_ChangeData() {
		return Remittance_Type_Update_After_Approve_ChangeData;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Remittance_Type_Update_After_Approve_Record_Ok;

	public WebElement Remittance_Type_Update_After_Approve_Record_Ok() {
		return Remittance_Type_Update_After_Approve_Record_Ok;
	}

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040MA_Update_After_Approve_key']")
	private WebElement Remittance_Type_Update_After_Approve_Button;

	public WebElement Remittance_Type_Update_After_Approve_Button() {
		return Remittance_Type_Update_After_Approve_Button;
	}

	@FindBy(xpath = "//td[@title='Add new row']")
	private WebElement Add_New_row;

	public WebElement Add_New_row() {
		return Add_New_row;
	}

	@FindBy(xpath = "//input[@id='new_1698753073201_remittanceRecordDenomVO.SERIAL_NO']")
	private WebElement Remittance_Serial_NO_One;

	public WebElement Remittance_Serial_NO_One() {
		return Remittance_Serial_NO_One;
	}

	@FindBy(xpath = "//input[@id='new_1698833041446_remittanceRecordDenomVO.SEQUENCE_FR']")
	private WebElement Remittance_From_NO_One;

	public WebElement Remittance_From_NO_One() {
		return Remittance_From_NO_One;
	}

	@FindBy(xpath = "//input[@id='new_1698834388104_remittanceRecordDenomVO.SEQUENCE_TO']")
	private WebElement Remittance_to_NO_One;

	public WebElement Remittance_to_NO_One() {
		return Remittance_to_NO_One;
	}

	@FindBy(xpath = "//input[@id='new_1698833041446_remittanceRecordDenomVO.QTY']")
	private WebElement Remittance_Quantity;

	public WebElement Remittance_Quantity() {
		return Remittance_Quantity;
	}

	@FindBy(xpath = "//input[@id='new_1698833525263_remittanceRecordDenomVO.SERIAL_NO']")
	private WebElement Remittance_Serial_NO_two;

	public WebElement Remittance_Serial_NO_two() {
		return Remittance_Serial_NO_two;
	}

	@FindBy(xpath = "//input[@id='new_1698833525263_remittanceRecordDenomVO.SEQUENCE_FR']")
	private WebElement Remittance_From_NO_TWO;

	public WebElement Remittance_From_NO_TWO() {
		return Remittance_From_NO_TWO;
	}

	@FindBy(xpath = "//input[@id='new_1698840740193_remittanceRecordDenomVO.QTY']")
	private WebElement Quantity_Two;

	public WebElement Quantity_Two() {
		return Quantity_Two;
	}

	@FindBy(xpath = "//td[text()='Active']")
	private WebElement Verify_Active;

	public WebElement Verify_Active() {
		return Verify_Active;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE']")
	private WebElement Remittance_Type_Approve_Verify_Code;

	public WebElement Remittance_Type_Approve_Verify_Code() {
		return Remittance_Type_Approve_Verify_Code;
	}

	// TransferCash

	@FindBy(xpath = "//td[text()='Transfer Cash']")
	private WebElement Transfer_Cash;

	public WebElement Transfer_Cash() {
		return Transfer_Cash;
	}

	@FindBy(xpath = "//td[text()='Transfer Cash From Vault to Teller']")
	private WebElement Transfer_Cash_From_Vault_to_Teller;

	public WebElement Transfer_Cash_From_Vault_to_Teller() {
		return Transfer_Cash_From_Vault_to_Teller;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Transfer_Cash_From_Vault_to_Teller_Maintenance;

	public WebElement Transfer_Cash_From_Vault_to_Teller_Maintenance() {
		return Transfer_Cash_From_Vault_to_Teller_Maintenance;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_tellerLookup_L0VTMT']")
	private WebElement Transfer_Cash_From_Vault_to_Teller_Maintenance_User_Code;

	public WebElement Transfer_Cash_From_Vault_to_Teller_Maintenance_User_Code() {
		return Transfer_Cash_From_Vault_to_Teller_Maintenance_User_Code;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trxTypeLookup_L0VTMT']")
	private WebElement Maintenance_trx_Type;

	public WebElement Maintenance_trx_Type() {
		return Maintenance_trx_Type;
	}

	@FindBy(xpath = "(//span[text()='Remittance'])[1]")
	private WebElement Maintenance_Remittance;

	public WebElement Maintenance_Remittance() {
		return Maintenance_Remittance;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-plus'])[3]")
	private WebElement Maintenance_AddRemit_Button;

	public WebElement Maintenance_AddRemit_Button() {
		return Maintenance_AddRemit_Button;
	}

	@FindBy(xpath = "//select[@id='REMITT_TYPE_L0VTMT']")
	private WebElement Remittance_Type_Selection_Maintenance;

	public WebElement Remittance_Type_Selection_Maintenance() {
		return Remittance_Type_Selection_Maintenance;
	}

	@FindBy(xpath = "//input[@id='new_1698994548124_cashBalanceRemittVO.REMITTANCE_TYPE_lookuptxt_transferCashRemittanceGridTbl_Id_L0VTMT']")
	private WebElement Maintenance_AddRemit_Type;

	public WebElement Maintenance_AddRemit_Type() {
		return Maintenance_AddRemit_Type;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_cashBalanceRemittVO.CURRENCY']")
	private WebElement Maintenance_AddRemit_CurrencyCode;

	public WebElement Maintenance_AddRemit_CurrencyCode() {
		return Maintenance_AddRemit_CurrencyCode;
	}

	@FindBy(xpath = "//input[@id='new_1699001031527_cashBalanceRemittVO.SERIAL']")
	private WebElement Maintenance_AddRemit_Serial;

	public WebElement Maintenance_AddRemit_Serial() {
		return Maintenance_AddRemit_Serial;
	}

	@FindBy(xpath = "//input[@id='new_1699001031527_cashBalanceRemittVO.SEQUENCE_FR']")
	private WebElement Maintenance_AddRemit_SequenceFrom;

	public WebElement Maintenance_AddRemit_SequenceFrom() {
		return Maintenance_AddRemit_SequenceFrom;
	}

	@FindBy(xpath = "//input[@id='new_1699001031527_cashBalanceRemittVO.SEQUENCE_TO']")
	private WebElement Maintenance_AddRemit_SequenceTO;

	public WebElement Maintenance_AddRemit_SequenceTO() {
		return Maintenance_AddRemit_SequenceTO;
	}

	@FindBy(xpath = "//input[@id='new_1699001031527_cashBalanceRemittVO.QTY']")
	private WebElement Maintenance_AddRemit_Qty;

	public WebElement Maintenance_AddRemit_Qty() {
		return Maintenance_AddRemit_Qty;
	}

	@FindBy(xpath = "//button[@id='transCash_Save_L0VTMT']")
	private WebElement Maintenance_AddRemit_Save;

	public WebElement Maintenance_AddRemit_Save() {
		return Maintenance_AddRemit_Save;
	}

	@FindBy(xpath = "(//span[text()='Approve'])[2]")
	private WebElement TransferCash_Approve;

	public WebElement TransferCash_Approve() {
		return TransferCash_Approve;
	}

	@FindBy(xpath = "//input[@id='transferCashGridTbl_Id_L0VTAP_gs_trxNo']")
	private WebElement TransferCash_Approve_search;

	public WebElement TransferCash_Approve_search() {
		return TransferCash_Approve_search;
	}

	@FindBy(xpath = "//td[@title='R B']")
	private WebElement TransferCash_Approve_Double_click;

	public WebElement TransferCash_Approve_Double_click() {
		return TransferCash_Approve_Double_click;
	}

	@FindBy(xpath = "//button[@id='submit_434107610']")
	private WebElement TransferCash_Approve_Submit;

	public WebElement TransferCash_Approve_Submit() {
		return TransferCash_Approve_Submit;
	}

	@FindBy(xpath = "//td[@id='add_recordOfRemittanceDenomGridTbl_Id_RRTMT']/div/span")
	private WebElement RecordingofRemittance_Maintenance_Denomination_AddIcon_609;

	public WebElement RecordingofRemittance_Maintenance_Denomination_AddIcon_609() {
		return RecordingofRemittance_Maintenance_Denomination_AddIcon_609;
	}
//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[1]

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[2]/input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_Serial_609;

	public WebElement RecordingofRemittance_Maintenance_Denomination_Serial_609() {
		return RecordingofRemittance_Maintenance_Denomination_Serial_609;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[3]/td[2]/input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_Serial1_626;

	public WebElement RecordingofRemittance_Maintenance_Denomination_Serial1_626() {
		return RecordingofRemittance_Maintenance_Denomination_Serial1_626;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[3]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber_609;

	public WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber_609() {
		return RecordingofRemittance_Maintenance_Denomination_FromNumber_609;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[3]/td[3]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber1_626;

	public WebElement RecordingofRemittance_Maintenance_Denomination_FromNumber1_626() {
		return RecordingofRemittance_Maintenance_Denomination_FromNumber1_626;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[4]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_ToNumber_609;

	public WebElement RecordingofRemittance_Maintenance_Denomination_ToNumber_609() {
		return RecordingofRemittance_Maintenance_Denomination_ToNumber_609;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[3]/td[4]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_ToNumber1_626;

	public WebElement RecordingofRemittance_Maintenance_Denomination_ToNumber1_626() {
		return RecordingofRemittance_Maintenance_Denomination_ToNumber1_626;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[2]/td[5]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_Quantity_609;

	public WebElement RecordingofRemittance_Maintenance_Denomination_Quantity_609() {
		return RecordingofRemittance_Maintenance_Denomination_Quantity_609;
	}

	@FindBy(xpath = "//table[@id='recordOfRemittanceDenomGridTbl_Id_RRTMT']//tr[3]/td[6]//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_Value1_609;

	public WebElement RecordingofRemittance_Maintenance_Denomination_Value1_609() {
		return RecordingofRemittance_Maintenance_Denomination_Value1_609;
	}
//	@FindBy(id="global_user_run_date")
//	private WebElement CSM_DateInUserRunningDate;
//
//	public WebElement CSMDateInUserRunningDate() {
//		return CSM_DateInUserRunningDate;
//	}
	// @FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
//	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;
//
//	public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
//		return CSM_ClearCacheInTechnicalDetailsIcon;
//
//	}
//@FindBy(xpath="//td[text()='Recording of Remittance']")
//private WebElement Remittance_recording_CW;
//public WebElement Remittance_recording_CW() {
// return Remittance_recording_CW;
//}
//@FindBy(xpath="//span[text()='Maintenance']")
//private WebElement Maintenance_Remittance_recording_CW;
//public WebElement Maintenance_Remittance_recording_CW() {
// return Maintenance_Remittance_recording_CW;
//}
//@FindBy(xpath="//span[text()='Approve']")
//private WebElement Apporve_button_Remittance_recording_CW;
//public WebElement Apporve_button_Remittance_recording_CW() {
// return Apporve_button_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='lookuptxt_vaultLookup_RRTMT']")
//private WebElement Vaultlook_Remittance_recording_CW;
//public WebElement Vaultlook_Remittance_recording_CW() {
// return Vaultlook_Remittance_recording_CW;
//}
//@FindBy(xpath="//select[@id='REMITT_TYPE_RRTMT']")
//private WebElement RemittanceType_Remittance_recording_CW;
//public WebElement RemittanceType_Remittance_recording_CW() {
// return RemittanceType_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='lookuptxt_remittanceTypeLookup_RRTMT']")
//private WebElement TCType_Remittance_recording_CW;
//public WebElement TCType_Remittance_recording_CW() {
// return TCType_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='SEQUENCE_FR_RRTMT']")
//private WebElement Sequence_From_Remittance_recording_CW;
//public WebElement Sequence_From_Remittance_recording_CW() {
// return Sequence_From_Remittance_recording_CW;
//}
//@FindBy(xpath="//label[@id='recordOfRemittanceMaintForm_RRTMT_btn_save']")
//private WebElement SaveButton_Remittance_recording_CW;
//public WebElement SaveButton_Remittance_recording_CW() {
// return SaveButton_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE']")
//private WebElement RemittanceType_Approve_Remittance_recording_CW;
//public WebElement RemittanceType_Approve_Remittance_recording_CW() {
// return RemittanceType_Approve_Remittance_recording_CW;
//} 
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_RECEIVED_DATE']")
//private WebElement Remittance_date_Remittance_recording_CW;
//public WebElement Remittance_date_Remittance_recording_CW() {
// return Remittance_date_Remittance_recording_CW;
//}
//@FindBy(xpath="//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTP_1_RECEIVED_DATE']")
//private WebElement DoubleClick_Approve_Remittance_recording_CW;
//public WebElement DoubleClick_Approve_Remittance_recording_CW() {
// return DoubleClick_Approve_Remittance_recording_CW;
//} 
//@FindBy(xpath="//label[@id='recordOfRemittanceMaintForm_RRTP_Approve_key']")
//private WebElement Submit_Approve_Remittance_recording_CW;
//public WebElement Submit_Approve_Remittance_recording_CW() {
// return Submit_Approve_Remittance_recording_CW;
//} 

//@FindBy(xpath="//label[@id='recordOfRemittanceMaintForm_RRTDM_To_Damage_key']")
//private WebElement submit_Damage_key_Remittance_recording_CW;
//public WebElement submit_Damage_key_Remittance_recording_CW() {
// return submit_Damage_key_Remittance_recording_CW;
//} 
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_REMITTANCE_TYPE']")
//private WebElement RemittanceType_Damage_key_Remittance_recording_CW;
//public WebElement RemittanceType_Damage_key_Remittance_recording_CW() {
// return RemittanceType_Damage_key_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_RECEIVED_DATE']")
//private WebElement Date_Damage_key_Remittance_recording_CW;
//public WebElement Date_Damage_key_Remittance_recording_CW() {
// return Date_Damage_key_Remittance_recording_CW;
//}
//@FindBy(xpath="//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTDM_1_RECEIVED_DATE']")
//private WebElement Doubleclick_Damage_key_Remittance_recording_CW;
//public WebElement Doubleclick_Damage_key_Remittance_recording_CW() {
// return Doubleclick_Damage_key_Remittance_recording_CW;
//}
//@FindBy(xpath="//a[@id='Recording of Remittance / Maintenance']")
//private WebElement CheckMaintenanceBox_Remittance_recording_CW;
//public WebElement CheckMaintenanceBox_Remittance_recording_CW() {
// return CheckMaintenanceBox_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_REMITTANCE_TYPE']")
//private WebElement CheckMaintenanceBox_RemittanceType_Remittance_recording_CW;
//public WebElement CheckMaintenanceBox_RemittanceType_Remittance_recording_CW() {
// return CheckMaintenanceBox_RemittanceType_Remittance_recording_CW;
//}
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

//@FindBy(xpath="//span[text()=' Send ']")
//private WebElement sendButtonInAlertScreen_cards;
//public WebElement sendButtonInAlertScreen_cards()
//{
//	return sendButtonInAlertScreen_cards;
//}
//@FindBy(xpath="//td[@id='td_alertsGrid_Id_G001K_1_alertsParamCO.userId']")
//private WebElement sendButtonInAlertScreenBM_cards;
//public WebElement sendButtonInAlertScreenBM_cards()
//{
//	return sendButtonInAlertScreenBM_cards;
//}
//@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
//private WebElement BMUser_Alert_EnterTRXNo_cards;
//public WebElement BMUser_Alert_EnterTRXNo_cards() 
//{
//	return BMUser_Alert_EnterTRXNo_cards;
//}
//@FindBy(xpath = "//td[@id='td_trsAckTOutAlertGrid_Id_RCVALERT_1_sTodoDet.TODO_PARAM']")
//private WebElement BMUser_Alert_EnterTRXNo_selectRecord;
//public WebElement BMUserAlertEnterTRXNoselectRecord()
//{
//	return BMUser_Alert_EnterTRXNo_selectRecord;
//}
//@FindBy(xpath = "//a[@id='openBut_RCVALERT']")
//private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems;
//public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems()
//{
//	return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems;
//}
//@FindBy(xpath = "//label[@id='Approve_key']")
//private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;
//public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey()
//{
//
//return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;
//}
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

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;

	public WebElement CSMCloseButtonInChangeRunningDate() {
		return CSM_CloseButtonInChangeRunningDate;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
		return CSM_OkButtonInAccessDeniedPopUpMenu;
	}

	@FindBy(id = "hder_logout_icon_id")
	private WebElement csm_logoutButton12;

	public WebElement csm_logoutButton12() {
		return csm_logoutButton12;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice;

	public WebElement ClosePopupmsg_frontoffice() {
		return ClosePopupmsg_frontoffice;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg;

	public WebElement POPupmsg() {
		return POPupmsg;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate;

	public WebElement CSMUseButtonInChangeRunningDate() {
		return CSM_UseButtonInChangeRunningDate;
	}
//	@FindBy(xpath="//td[text()='Recording of Remittance']")
//private WebElement Remittance_recording_CW;
//public WebElement Remittance_recording_CW() {
// return Remittance_recording_CW;
//}
//@FindBy(xpath="//span[text()='Maintenance']")
//private WebElement Maintenance_Remittance_recording_CW;
//public WebElement Maintenance_Remittance_recording_CW() {
// return Maintenance_Remittance_recording_CW;
//}
//@FindBy(xpath="//span[text()='To Be Cancelled']")
//private WebElement Tobe_Damaged_Remittance_recording_CW;
//public WebElement Tobe_Damaged_Remittance_recording_CW() {
// return Tobe_Damaged_Remittance_recording_CW;
//}
//@FindBy(xpath="//span[text()='Approve']")
//private WebElement Apporve_button_Remittance_recording_CW;
//public WebElement Apporve_button_Remittance_recording_CW() {
// return Apporve_button_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='lookuptxt_vaultLookup_RRTMT']")
//private WebElement Vaultlook_Remittance_recording_CW;
//public WebElement Vaultlook_Remittance_recording_CW() {
// return Vaultlook_Remittance_recording_CW;
//}
//@FindBy(xpath="//select[@id='REMITT_TYPE_RRTMT']")
//private WebElement RemittanceType_Remittance_recording_CW;
//public WebElement RemittanceType_Remittance_recording_CW() {
// return RemittanceType_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='lookuptxt_remittanceTypeLookup_RRTMT']")
//private WebElement TCType_Remittance_recording_CW;
//public WebElement TCType_Remittance_recording_CW() {
// return TCType_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='SEQUENCE_FR_RRTMT']")
//private WebElement Sequence_From_Remittance_recording_CW;
//public WebElement Sequence_From_Remittance_recording_CW() {
// return Sequence_From_Remittance_recording_CW;
//}
//@FindBy(xpath="//label[@id='recordOfRemittanceMaintForm_RRTMT_btn_save']")
//private WebElement SaveButton_Remittance_recording_CW;
//public WebElement SaveButton_Remittance_recording_CW() {
// return SaveButton_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE']")
//private WebElement RemittanceType_Approve_Remittance_recording_CW;
//public WebElement RemittanceType_Approve_Remittance_recording_CW() {
// return RemittanceType_Approve_Remittance_recording_CW;
//} 
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_RECEIVED_DATE']")
//private WebElement Remittance_date_Remittance_recording_CW;
//public WebElement Remittance_date_Remittance_recording_CW() {
// return Remittance_date_Remittance_recording_CW;
//}
//@FindBy(xpath="//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTP_1_RECEIVED_DATE']")
//private WebElement DoubleClick_Approve_Remittance_recording_CW;
//public WebElement DoubleClick_Approve_Remittance_recording_CW() {
// return DoubleClick_Approve_Remittance_recording_CW;
//} 
//@FindBy(xpath="//label[@id='recordOfRemittanceMaintForm_RRTP_Approve_key']")
//private WebElement Submit_Approve_Remittance_recording_CW;
//public WebElement Submit_Approve_Remittance_recording_CW() {
// return Submit_Approve_Remittance_recording_CW;
//} 

//@FindBy(xpath="//button[@id='recordOfRemittance_toCancel_RRTTC']")
//private WebElement submit_Damage_key_Remittance_recording_CW;
//public WebElement submit_Damage_key_Remittance_recording_CW() {
// return submit_Damage_key_Remittance_recording_CW;
//} 
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_REMITTANCE_TYPE']")
//private WebElement RemittanceType_Damage_key_Remittance_recording_CW;
//public WebElement RemittanceType_Damage_key_Remittance_recording_CW() {
// return RemittanceType_Damage_key_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_RECEIVED_DATE']")
//private WebElement Date_Damage_key_Remittance_recording_CW;
//public WebElement Date_Damage_key_Remittance_recording_CW() {
// return Date_Damage_key_Remittance_recording_CW;
//}
//@FindBy(xpath="//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTTC_1_REMITTANCE_TYPE']")
//private WebElement Doubleclick_Damage_key_Remittance_recording_CW;
//public WebElement Doubleclick_Damage_key_Remittance_recording_CW() {
// return Doubleclick_Damage_key_Remittance_recording_CW;
//}
//@FindBy(xpath="//a[@id='Recording of Remittance / Maintenance']")
//private WebElement CheckMaintenanceBox_Remittance_recording_CW;
//public WebElement CheckMaintenanceBox_Remittance_recording_CW() {
// return CheckMaintenanceBox_Remittance_recording_CW;
//}
//@FindBy(xpath="//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_REMITTANCE_TYPE']")
//private WebElement CheckMaintenanceBox_RemittanceType_Remittance_recording_CW;
//public WebElement CheckMaintenanceBox_RemittanceType_Remittance_recording_CW() {
// return CheckMaintenanceBox_RemittanceType_Remittance_recording_CW;
//}//bm userid
//@FindBy(xpath="//span[text()=' Send ']")
//private WebElement sendButtonInAlertScreen_cards;
//public WebElement sendButtonInAlertScreen_cards()
//{
//	return sendButtonInAlertScreen_cards;
//}
//@FindBy(xpath="//td[@id='td_alertsGrid_Id_G001K_1_alertsParamCO.userId']")
//private WebElement sendButtonInAlertScreenBM_cards;
//public WebElement sendButtonInAlertScreenBM_cards()
//{
//	return sendButtonInAlertScreenBM_cards;
//}
////serialno
//@FindBy(xpath="//span[@class='ui-icon ui-icon-plus']")
//private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Addbutton_denomi;
//public WebElement  CheckMaintenanceBox_RemittanceType_Remittance_Addbutton_denomi() {
// return  CheckMaintenanceBox_RemittanceType_Remittance_Addbutton_denomi;
//}
//
//@FindBy(xpath="//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.SERIAL_NO']")
//private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Serialno_denomi;
//public WebElement  CheckMaintenanceBox_RemittanceType_Remittance_Serialno_denomi() {
// return  CheckMaintenanceBox_RemittanceType_Remittance_Serialno_denomi;
//}
//
//@FindBy(xpath="//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.SEQUENCE_FR']")
//private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Fromno_denomi;
//public WebElement  CheckMaintenanceBox_RemittanceType_Remittance_Fromno_denomi() {
// return  CheckMaintenanceBox_RemittanceType_Remittance_Fromno_denomi;
//}
//
//@FindBy(xpath="//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.SEQUENCE_TO']")
//private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Tono_denomi;
//public WebElement  CheckMaintenanceBox_RemittanceType_Remittance_Tono_denomi() {
// return  CheckMaintenanceBox_RemittanceType_Remittance_Tono_denomi;
//}
//
//@FindBy(xpath="//input[@id='new_1698754253731_remittanceRecordDenomVO.VALUE']")
//private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Value_denomi;
//public WebElement  CheckMaintenanceBox_RemittanceType_Remittance_Value_denomi() {
// return  CheckMaintenanceBox_RemittanceType_Remittance_Value_denomi;
//}
//@FindBy(id="hder_logout_icon_id")
//private WebElement csm_logoutButton;
//public WebElement csm_logoutButton()
//{
//	return csm_logoutButton;
//} 
//@FindBy(xpath = "//label[@id='Approve_key']")
//private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;
//public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey()
//{
//	
//	return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;
//}
//@FindBy(xpath = "//a[@id='openBut_RCVALERT']")
//private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems;
//public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems()
//{
//	return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems;
//}
//@FindBy(xpath = "//td[@id='td_trsAckTOutAlertGrid_Id_RCVALERT_1_sTodoDet.TODO_PARAM']")
//private WebElement BMUser_Alert_EnterTRXNo_selectRecord;
//public WebElement BMUserAlertEnterTRXNoselectRecord()
//{
//	return BMUser_Alert_EnterTRXNo_selectRecord;
//}
//@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
//private WebElement BMUser_Alert_EnterTRXNo_cards;
//public WebElement BMUser_Alert_EnterTRXNo_cards()
//{
//	return BMUser_Alert_EnterTRXNo_cards;
//}
//
//@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_REMITTANCE_TYPE']")
//private WebElement ROR_tobedestroyed_Remittance_type;
//public WebElement ROR_tobedestroyed_Remittance_type()
//{
//	return ROR_tobedestroyed_Remittance_type;
//}
//@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_RECEIVED_DATE']")
//private WebElement ROR_tobedestroyed_date_type;
//public WebElement ROR_tobedestroyed_date_type()
//{
//	return ROR_tobedestroyed_date_type;
//}
//@FindBy(xpath = "//button[@id='recordOfRemittance_toDestroy_RRTDY']")
//private WebElement ROR_tobedestroyed_destroybutton;
//public WebElement ROR_tobedestroyed_destroybutton()
//{
//	return ROR_tobedestroyed_destroybutton;
//}
//@FindBy(xpath = "//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTDY_1_REMITTANCE_TYPE']")
//private WebElement ROR_tobedestroyed_remittancetype_doubleclick;
//public WebElement ROR_tobedestroyed_remittancetype_doubleclick()
//{
//	return ROR_tobedestroyed_remittancetype_doubleclick;
//}
//
//@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_REMITTANCE_TYPE']")
//private WebElement ROR_tobedamaged_remittancetype;
//public WebElement ROR_tobedamaged_remittancetype()
//{
//	return ROR_tobedamaged_remittancetype;
//}
//@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_RECEIVED_DATE']")
//private WebElement ROR_tobedamaged_date;
//public WebElement ROR_tobedamaged_date()
//{
//	return ROR_tobedamaged_date;
//}

////Retrieve data
//@FindBy(xpath = "//td[text()='Transfer Cash']")
//private WebElement csm_Transfer_Cash;
//public WebElement csm_Transfer_Cash()
//{
//	return csm_Transfer_Cash;
//}
//@FindBy(xpath = "//td[text()='Transfer Cash From Vault to Teller']")
//private WebElement csm_TransferCash_from_VaulttoTeller;
//public WebElement csm_TransferCash_from_VaulttoTeller()
//{
//	return csm_TransferCash_from_VaulttoTeller;
//}
////
//@FindBy(xpath = "//span[text()='Maintenance']")
//private WebElement csm_Maintanence_Under_TFVT;
//public WebElement csm_Maintanence_Under_TFVT()
//{
//	return csm_Maintanence_Under_TFVT;
//}
////remittance
//@FindBy(xpath = "//td[text()='Remittance']")
//private WebElement csm_Remittance;
//public WebElement csm_Remittance()
//{
//	return csm_Remittance;
//}
//@FindBy(xpath = "//td[text()='Remittance Request For Stock']")
//private WebElement csm_RemittanceRequestForStock_under_Remittance;
//public WebElement csm_RemittanceRequestForStock_under_Remittance()
//{
//	return csm_RemittanceRequestForStock_under_Remittance;
//}
//@FindBy(xpath = "td_remittanceStockListGridTbl_Id_L0RSAP_1_ctstellerCashBalanceVO.TELLER_CODE")
//private WebElement csm_Remittance_approve_under_Requestforstock_doubleclick;
//public WebElement csm_Remittance_approve_under_Requestforstock_doubleclick()
//{
//	return csm_Remittance_approve_under_Requestforstock_doubleclick;
//}
//@FindBy(xpath = "//input[@id='remittanceStockListGridTbl_Id_L0SBAP_gs_ctstellerCashBalanceVO.TRX_NO']")
//private WebElement csm_TrxNo_under_approve_undersendtosearch;
//public WebElement csm_TrxNo_under_approve_undersendtosearch()
//{
//	return csm_TrxNo_under_approve_undersendtosearch;
//}
//
//
//
//@FindBy(xpath = "//select[@name='remittanceStockCO.ctstellerCashBalanceVO.REMITT_TYPE']")
//private WebElement Csm_RemittanceRequestForStock_RemittanceType;
//public WebElement Csm_RemittanceRequestForStock_RemittanceType()
//{
//	return Csm_RemittanceRequestForStock_RemittanceType;
//}
//
//@FindBy(xpath = "//span[@class='ui-icon ui-icon-plus']")
//private WebElement Csm_RemittanceRequestForStock_AddButtonUnderRemittance;
//public WebElement Csm_RemittanceRequestForStock_AddButtonUnderRemittance()
//{
//	return Csm_RemittanceRequestForStock_AddButtonUnderRemittance;
//}
//
//@FindBy(xpath = "//input[@id='new_1698917159360_cashBalanceRemittVO.REMITTANCE_TYPE_lookuptxt_remittanceStockRemittanceGridTbl_Id_L0RSMT']")
//private WebElement Csm_RemittanceRequestForStock_TypeUnderRemittance;
//public WebElement  Csm_RemittanceRequestForStock_TypeUnderRemittance()
//{
//	return  Csm_RemittanceRequestForStock_TypeUnderRemittance;
//}
//@FindBy(xpath = "//input[@id='new_1698917159360_cashBalanceRemittVO.CURRENCY_lookuptxt_remittanceStockRemittanceGridTbl_Id_L0RSMT']")
//private WebElement Csm_RemittanceRequestForStock_CodeUnderRemittance;
//public WebElement  Csm_RemittanceRequestForStock_CodeUnderRemittance()
//{
//	return  Csm_RemittanceRequestForStock_CodeUnderRemittance;
//}
//@FindBy(xpath = "//input[@id='new_1698917159360_cashBalanceRemittVO.QTY']")
//private WebElement Csm_RemittanceRequestForStock_QuantityUnderRemittance;
//public WebElement  Csm_RemittanceRequestForStock_QuantityUnderRemittance()
//{
//	return  Csm_RemittanceRequestForStock_QuantityUnderRemittance;
//}
//@FindBy(xpath = "//button[@id='remittanceStockMaint_save_L0RSMT']")
//private WebElement Csm_RemittanceRequestForStock_SaveButtonUnderRemittance;
//public WebElement  Csm_RemittanceRequestForStock_SaveButtonUnderRemittance()
//{
//	return  Csm_RemittanceRequestForStock_SaveButtonUnderRemittance;
//}
//@FindBy(xpath = "//span[text()='Maintenance']")
//private WebElement Csm_Remittance_MantainanceUnderRemittanceRequestForStock;
//public WebElement  Csm_Remittance_MantainanceUnderRemittanceRequestForStock()
//{
//	return  Csm_Remittance_MantainanceUnderRemittanceRequestForStock;
//}
//@FindBy(xpath = "//span[text()='Approve']")
//private WebElement Csm_Remittance_ApproveUnderRemittanceRequestForStock;
//public WebElement  Csm_Remittance_ApproveUnderRemittanceRequestForStock()
//{
//	return  Csm_Remittance_ApproveUnderRemittanceRequestForStock;
//}
//@FindBy(xpath = "//button[@id='remittanceStockMaint_approve_L0RSAP']")
//private WebElement Csm_Remittance_ApproveButtonUnderRemittanceRequestForStock;
//public WebElement  Csm_Remittance_ApproveButtonUnderRemittanceRequestForStock()
//{
//	return  Csm_Remittance_ApproveButtonUnderRemittanceRequestForStock;
//}
//@FindBy(xpath = "//td[text()='Remittance Send To Branch']")
//private WebElement Csm_RemittanceSendToBranch;
//public WebElement  Csm_RemittanceSendToBranch()
//{
//	return  Csm_RemittanceSendToBranch;
//}
//
//@FindBy(xpath = "(//span[text()='Maintenance'])[3]")
//private WebElement Csm_Remittance_MaintanceUnderRemittanceSendToBranch;
//public WebElement  Csm_Remittance_MaintanceUnderRemittanceSendToBranch()
//{
//	return Csm_Remittance_MaintanceUnderRemittanceSendToBranch;
//}
//@FindBy(xpath = "//a[@id='infoBarSearchButton_L0SBMT']")
//private WebElement Csm_Remittance_searchbtn_MaintanceUnderRemittanceSendToBranch;
//public WebElement  Csm_Remittance_searchbtn_MaintanceUnderRemittanceSendToBranch()
//{
//	return Csm_Remittance_searchbtn_MaintanceUnderRemittanceSendToBranch;
//}
//
//@FindBy(xpath = "//td[@id='td_remittanceStockListGridTbl_Id_L0SBMT_1_ctstellerCashBalanceVO.TRX_NO']")
//private WebElement Csm_Remittance_doubleclicktrxnum_MaintanceUnderRemittanceSendToBranch;
//public WebElement  Csm_Remittance_doubleclicktrxnum_MaintanceUnderRemittanceSendToBranch()
//{
//	return Csm_Remittance_doubleclicktrxnum_MaintanceUnderRemittanceSendToBranch;
//}
//@FindBy(xpath = "//td[@id='td_remittanceStockRemittanceGridTbl_Id_L0SBMT_1_cashBalanceRemittVO.SEQUENCE_FR']")
//private WebElement Csm_SequenceFrom_UnderRemittanceSendToBranch;
//public WebElement  Csm_SequenceFrom_UnderRemittanceSendToBranch()
//{
//	return Csm_SequenceFrom_UnderRemittanceSendToBranch;
//}
//@FindBy(xpath = "//td[@id='td_remittanceStockRemittanceGridTbl_Id_L0SBMT_1_cashBalanceRemittVO.SEQUENCE_TO']")
//private WebElement Csm_SequenceTo_UnderRemittanceSendToBranch;
//public WebElement  Csm_SequenceTo_UnderRemittanceSendToBranch()
//{
//	return Csm_SequenceTo_UnderRemittanceSendToBranch;
//}
//@FindBy(xpath = "//button[@id='remittanceStockMaint_save_L0SBMT']")
//private WebElement Csm_SaveButton_UnderRemittanceSendToBranch;
//public WebElement  Csm_SaveButton_UnderRemittanceSendToBranch()
//{
//	return Csm_SaveButton_UnderRemittanceSendToBranch;
//}
//@FindBy(xpath = "(//span[text()='Approve'])[3]")
//private WebElement Csm_Approve_UnderRemittanceSendToBranch;
//public WebElement  Csm_Approve_UnderRemittanceSendToBranch()
//{
//	return Csm_Approve_UnderRemittanceSendToBranch;
//}
//@FindBy(xpath = "//button[@id='recordOfRemittance_save_RRTMT']")
//private WebElement Csm_RecordingofRemittance_Savebtn;
//public WebElement  Csm_RecordingofRemittance_Savebtn()
//{
//	return Csm_RecordingofRemittance_Savebtn;
//}
//@FindBy(xpath = "//span[text()='Approve'")
//private WebElement Csm_RecordingofRemittance_Approve;
//public WebElement  Csm_RecordingofRemittance_Approve()
//{
//	return Csm_RecordingofRemittance_Approve;
//}
//@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE']")
//private WebElement Csm_RecordingofRemittance_Approve_remittancetype;
//public WebElement  Csm_RecordingofRemittance_Approve_remittancetype()
//{
//	return Csm_RecordingofRemittance_Approve_remittancetype;
//}
//@FindBy(xpath = "//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTP_1_REMITTANCE_TYPE']")
//private WebElement Csm_RecordingofRemittance_Approve_remittancetype_doubleclick;
//public WebElement  Csm_RecordingofRemittance_Approve_remittancetype_doubleclick()
//{
//	return Csm_RecordingofRemittance_Approve_remittancetype_doubleclick;
//}
//@FindBy(xpath = "//button[@id='recordOfRemittance_approve_RRTP']")
//private WebElement Csm_RecordingofRemittance_Approve_approvebtn;
//public WebElement  Csm_RecordingofRemittance_Approve_approvebtn()
//{
//	return Csm_RecordingofRemittance_Approve_approvebtn;
//}

	@FindBy(xpath = "//td[text()='Recording of Remittance']")
	private WebElement CSM_RecordingofRemittance_Menu_7183;

	public WebElement CSM_RecordingofRemittance_Menu_7183() {
		return CSM_RecordingofRemittance_Menu_7183;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSM_RecordingofRemittance_Maintenance_7183;

	public WebElement CSM_RecordingofRemittance_Maintenance_7183() {
		return CSM_RecordingofRemittance_Maintenance_7183;
	}

//@FindBy(id="td_gridtab_vaultLookup_RRTMT_2_CODE")//double
//private WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_7183;
//public WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_7183() {
//	return CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_7183;
//}

//span[text()='Approve']
	@FindBy(xpath = "//a[@id='RRTP']")
	private WebElement CSM_RecordingofRemittance_ApproveMenu_7183;

	public WebElement CSM_RecordingofRemittance_ApproveMenu_7183() {
		return CSM_RecordingofRemittance_ApproveMenu_7183;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_RemittanceType_7183;

	public WebElement CSM_RecordingofRemittance_RemittanceType_7183() {
		return CSM_RecordingofRemittance_RemittanceType_7183;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTP_gs_RECEIVED_DATE")
	private WebElement CSM_RecordingofRemittance_ReceivedDate_7183;

	public WebElement CSM_RecordingofRemittance_ReceivedDate_7183() {
		return CSM_RecordingofRemittance_ReceivedDate_7183;
	}

	@FindBy(xpath = "//button[@id='recordOfRemittance_approve_RRTP']")
	private WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_7183;

	public WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_7183() {
		return CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_7183;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_RECEIVED_DATE")
	private WebElement CSM_RecordingofRemittance_Maintenace_ReceviedData_7183;

	public WebElement CSM_RecordingofRemittance_Maintenace_ReceviedData_7183() {
		return CSM_RecordingofRemittance_Maintenace_ReceviedData_7183;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement CSM_RecordingofRemittance_Maintenace_pop_7183;

	public WebElement CSM_RecordingofRemittance_Maintenace_pop_7183() {
		return CSM_RecordingofRemittance_Maintenace_pop_7183;
	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement CSM_RecordingofRemittance_Maintenace_validate_7183;

	public WebElement CSM_RecordingofRemittance_Maintenace_validate_7183() {
		return CSM_RecordingofRemittance_Maintenace_validate_7183;
	}

	@FindBy(xpath = "//a[text()='Recording of Remittance / Maintenance']")
	private WebElement CSM_RecordingofRemittance_Maintenace_TAB_7183;

	public WebElement CSM_RecordingofRemittance_Maintenace_TAB_7183() {
		return CSM_RecordingofRemittance_Maintenace_TAB_7183;
	}

	@FindBy(xpath = "//a[@id='RRTTC']")
	private WebElement CSM_RecordingofRemittance_tobeCancel_7183;

	public WebElement CSM_RecordingofRemittance_tobeCancel_7183() {
		return CSM_RecordingofRemittance_tobeCancel_7183;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_RECEIVED_DATE")
	private WebElement CSM_RecordingofRemittance_tobeCancel_recevieddate1;

	public WebElement CSM_RecordingofRemittance_tobeCancel_recevieddate_7183() {
		return CSM_RecordingofRemittance_tobeCancel_recevieddate;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_tobeCancel_remittancetype11;

	public WebElement CSM_RecordingofRemittance_tobeCancel_remittancetype_7183() {
		return CSM_RecordingofRemittance_tobeCancel_remittancetype;
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

	@FindBy(xpath = "//span[text()='To Be Cancelled']")
	private WebElement Tobe_Damaged_Remittance_recording_CW;

	public WebElement Tobe_Damaged_Remittance_recording_CW() {
		return Tobe_Damaged_Remittance_recording_CW;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Apporve_button_Remittance_recording_CW;

	public WebElement Apporve_button_Remittance_recording_CW() {
		return Apporve_button_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='SEQUENCE_FR_RRTMT']")
	private WebElement Sequence_From_Remittance_recording_CW;

	public WebElement Sequence_From_Remittance_recording_CW() {
		return Sequence_From_Remittance_recording_CW;
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

	@FindBy(xpath = "//button[@id='recordOfRemittance_toCancel_RRTTC']")
	private WebElement submit_Damage_key_Remittance_recording_CW;

	public WebElement submit_Damage_key_Remittance_recording_CW() {
		return submit_Damage_key_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_REMITTANCE_TYPE']")
	private WebElement RemittanceType_Damage_key_Remittance_recording_CW;

	public WebElement RemittanceType_Damage_key_Remittance_recording_CW() {
		return RemittanceType_Damage_key_Remittance_recording_CW;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_RECEIVED_DATE']")
	private WebElement Date_Damage_key_Remittance_recording_CW;

	public WebElement Date_Damage_key_Remittance_recording_CW() {
		return Date_Damage_key_Remittance_recording_CW;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTTC_1_REMITTANCE_TYPE']")
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
	}// bm userid

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

	// serialno
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-plus']")
	private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Addbutton_denomi;

	public WebElement CheckMaintenanceBox_RemittanceType_Remittance_Addbutton_denomi() {
		return CheckMaintenanceBox_RemittanceType_Remittance_Addbutton_denomi;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.SERIAL_NO']")
	private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Serialno_denomi;

	public WebElement CheckMaintenanceBox_RemittanceType_Remittance_Serialno_denomi() {
		return CheckMaintenanceBox_RemittanceType_Remittance_Serialno_denomi;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.SEQUENCE_FR']")
	private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Fromno_denomi;

	public WebElement CheckMaintenanceBox_RemittanceType_Remittance_Fromno_denomi() {
		return CheckMaintenanceBox_RemittanceType_Remittance_Fromno_denomi;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.SEQUENCE_TO']")
	private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Tono_denomi;

	public WebElement CheckMaintenanceBox_RemittanceType_Remittance_Tono_denomi() {
		return CheckMaintenanceBox_RemittanceType_Remittance_Tono_denomi;
	}

	@FindBy(xpath = "//input[@id='new_1698754253731_remittanceRecordDenomVO.VALUE']")
	private WebElement CheckMaintenanceBox_RemittanceType_Remittance_Value_denomi;

	public WebElement CheckMaintenanceBox_RemittanceType_Remittance_Value_denomi() {
		return CheckMaintenanceBox_RemittanceType_Remittance_Value_denomi;
	}

	@FindBy(id = "hder_logout_icon_id")
	private WebElement csm_logoutButton;

	public WebElement csm_logoutButton() {
		return csm_logoutButton;
	}

//		@FindBy(xpath = "//label[@id='Approve_key']")
//		private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;
//		public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey()
//		{
//			
//			return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;
//		}
////		@FindBy(xpath = "//a[@id='openBut_RCVALERT']")
//		private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems;
//		public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems()
//		{
//			return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems;
//		}
//		@FindBy(xpath = "//td[@id='td_trsAckTOutAlertGrid_Id_RCVALERT_1_sTodoDet.TODO_PARAM']")
//		private WebElement BMUser_Alert_EnterTRXNo_selectRecord;
//		public WebElement BMUserAlertEnterTRXNoselectRecord()
//		{
//			return BMUser_Alert_EnterTRXNo_selectRecord;
//		}
//		@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo_cards;

	public WebElement BMUser_Alert_EnterTRXNo_cards() {
		return BMUser_Alert_EnterTRXNo_cards;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_REMITTANCE_TYPE']")
	private WebElement ROR_tobedestroyed_Remittance_type;

	public WebElement ROR_tobedestroyed_Remittance_type() {
		return ROR_tobedestroyed_Remittance_type;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_RECEIVED_DATE']")
	private WebElement ROR_tobedestroyed_date_type;

	public WebElement ROR_tobedestroyed_date_type() {
		return ROR_tobedestroyed_date_type;
	}

	@FindBy(xpath = "//button[@id='recordOfRemittance_toDestroy_RRTDY']")
	private WebElement ROR_tobedestroyed_destroybutton;

	public WebElement ROR_tobedestroyed_destroybutton() {
		return ROR_tobedestroyed_destroybutton;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTDY_1_REMITTANCE_TYPE']")
	private WebElement ROR_tobedestroyed_remittancetype_doubleclick;

	public WebElement ROR_tobedestroyed_remittancetype_doubleclick() {
		return ROR_tobedestroyed_remittancetype_doubleclick;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_REMITTANCE_TYPE']")
	private WebElement ROR_tobedamaged_remittancetype;

	public WebElement ROR_tobedamaged_remittancetype() {
		return ROR_tobedamaged_remittancetype;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_RECEIVED_DATE']")
	private WebElement ROR_tobedamaged_date;

	public WebElement ROR_tobedamaged_date() {
		return ROR_tobedamaged_date;
	}

	// Retrieve data
	@FindBy(xpath = "//td[text()='Transfer Cash']")
	private WebElement csm_Transfer_Cash;

	public WebElement csm_Transfer_Cash() {
		return csm_Transfer_Cash;
	}

	@FindBy(xpath = "//td[text()='Transfer Cash From Vault to Teller']")
	private WebElement csm_TransferCash_from_VaulttoTeller;

	public WebElement csm_TransferCash_from_VaulttoTeller() {
		return csm_TransferCash_from_VaulttoTeller;
	}

	//
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement csm_Maintanence_Under_TFVT;

	public WebElement csm_Maintanence_Under_TFVT() {
		return csm_Maintanence_Under_TFVT;
	}

	// remittance
	@FindBy(xpath = "//td[text()='Remittance']")
	private WebElement csm_Remittance;

	public WebElement csm_Remittance() {
		return csm_Remittance;
	}

	@FindBy(xpath = "//td[text()='Remittance Request For Stock']")
	private WebElement csm_RemittanceRequestForStock_under_Remittance;

	public WebElement csm_RemittanceRequestForStock_under_Remittance() {
		return csm_RemittanceRequestForStock_under_Remittance;
	}

	@FindBy(id = "td_remittanceStockListGridTbl_Id_L0RSAP_1_ctstellerCashBalanceVO.TELLER_CODE")
	private WebElement csm_Remittance_approve_under_Requestforstock_doubleclick;

	public WebElement csm_Remittance_approve_under_Requestforstock_doubleclick() {
		return csm_Remittance_approve_under_Requestforstock_doubleclick;
	}

	@FindBy(xpath = "//input[@id='remittanceStockListGridTbl_Id_L0SBAP_gs_ctstellerCashBalanceVO.TRX_NO']")
	private WebElement csm_TrxNo_under_approve_undersendtosearch;

	public WebElement csm_TrxNo_under_approve_undersendtosearch() {
		return csm_TrxNo_under_approve_undersendtosearch;
	}

	@FindBy(xpath = "//select[@name='remittanceStockCO.ctstellerCashBalanceVO.REMITT_TYPE']")
	private WebElement Csm_RemittanceRequestForStock_RemittanceType;

	public WebElement Csm_RemittanceRequestForStock_RemittanceType() {
		return Csm_RemittanceRequestForStock_RemittanceType;
	}

	@FindBy(id = "add_remittanceStockRemittanceGridTbl_Id_L0RSMT")
	private WebElement Csm_RemittanceRequestForStock_AddButtonUnderRemittance;

	public WebElement Csm_RemittanceRequestForStock_AddButtonUnderRemittance() {
		return Csm_RemittanceRequestForStock_AddButtonUnderRemittance;
	}

	@FindBy(xpath = "//td[@id='td_remittanceStockRemittanceGridTbl_Id_L0RSMT_1_cashBalanceRemittVO.REMITTANCE_TYPE']")
	private WebElement Csm_RemittanceRequestForStock_Type_label_UnderRemittance;

	public WebElement Csm_RemittanceRequestForStock_Type_label_UnderRemittance() {
		return Csm_RemittanceRequestForStock_Type_label_UnderRemittance;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_cashBalanceRemittVO.REMITTANCE_TYPE']")
	private WebElement Csm_RemittanceRequestForStock_TypeUnderRemittance;

	public WebElement Csm_RemittanceRequestForStock_TypeUnderRemittance() {
		return Csm_RemittanceRequestForStock_TypeUnderRemittance;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_cashBalanceRemittVO.CURRENCY']")
	private WebElement Csm_RemittanceRequestForStock_CodeUnderRemittance;

	public WebElement Csm_RemittanceRequestForStock_CodeUnderRemittance() {
		return Csm_RemittanceRequestForStock_CodeUnderRemittance;
	}

	@FindBy(xpath = "//td[@tdlabel='Quantity']//input")
	private WebElement Csm_RemittanceRequestForStock_QuantityUnderRemittance;

	public WebElement Csm_RemittanceRequestForStock_QuantityUnderRemittance() {
		return Csm_RemittanceRequestForStock_QuantityUnderRemittance;
	}

	@FindBy(xpath = "//button[@id='remittanceStockMaint_save_L0RSMT']")
	private WebElement Csm_RemittanceRequestForStock_SaveButtonUnderRemittance;

	public WebElement Csm_RemittanceRequestForStock_SaveButtonUnderRemittance() {
		return Csm_RemittanceRequestForStock_SaveButtonUnderRemittance;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Csm_Remittance_MantainanceUnderRemittanceRequestForStock;

	public WebElement Csm_Remittance_MantainanceUnderRemittanceRequestForStock() {
		return Csm_Remittance_MantainanceUnderRemittanceRequestForStock;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Csm_Remittance_ApproveUnderRemittanceRequestForStock;

	public WebElement Csm_Remittance_ApproveUnderRemittanceRequestForStock() {
		return Csm_Remittance_ApproveUnderRemittanceRequestForStock;
	}

	@FindBy(xpath = "//button[@id='remittanceStockMaint_approve_L0RSAP']")
	private WebElement Csm_Remittance_ApproveButtonUnderRemittanceRequestForStock;

	public WebElement Csm_Remittance_ApproveButtonUnderRemittanceRequestForStock() {
		return Csm_Remittance_ApproveButtonUnderRemittanceRequestForStock;
	}

	@FindBy(xpath = "//td[text()='Remittance Send To Branch']")
	private WebElement Csm_RemittanceSendToBranch;

	public WebElement Csm_RemittanceSendToBranch() {
		return Csm_RemittanceSendToBranch;
	}

	@FindBy(xpath = "(//span[text()='Maintenance'])[3]")
	private WebElement Csm_Remittance_MaintanceUnderRemittanceSendToBranch;

	public WebElement Csm_Remittance_MaintanceUnderRemittanceSendToBranch() {
		return Csm_Remittance_MaintanceUnderRemittanceSendToBranch;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_L0SBMT']")
	private WebElement Csm_Remittance_searchbtn_MaintanceUnderRemittanceSendToBranch;

	public WebElement Csm_Remittance_searchbtn_MaintanceUnderRemittanceSendToBranch() {
		return Csm_Remittance_searchbtn_MaintanceUnderRemittanceSendToBranch;
	}

	@FindBy(xpath = "//td[@id='td_remittanceStockListGridTbl_Id_L0SBMT_1_ctstellerCashBalanceVO.TRX_NO']")
	private WebElement Csm_Remittance_doubleclicktrxnum_MaintanceUnderRemittanceSendToBranch;

	public WebElement Csm_Remittance_doubleclicktrxnum_MaintanceUnderRemittanceSendToBranch() {
		return Csm_Remittance_doubleclicktrxnum_MaintanceUnderRemittanceSendToBranch;
	}

	@FindBy(xpath = "//td[@id='td_remittanceStockRemittanceGridTbl_Id_L0SBMT_1_cashBalanceRemittVO.SEQUENCE_FR']")
	private WebElement Csm_SequenceFrom_UnderRemittanceSendToBranchField;

	public WebElement Csm_SequenceFrom_UnderRemittanceSendToBranchField() {
		return Csm_SequenceFrom_UnderRemittanceSendToBranchField;
	}

	@FindBy(xpath = "//td[@id='td_remittanceStockRemittanceGridTbl_Id_L0SBMT_1_cashBalanceRemittVO.SEQUENCE_FR']//input")
	private WebElement Csm_SequenceFrom_UnderRemittanceSendToBranchInput;

	public WebElement Csm_SequenceFrom_UnderRemittanceSendToBranchInput() {
		return Csm_SequenceFrom_UnderRemittanceSendToBranchInput;
	}

	@FindBy(xpath = "//td[@id='td_remittanceStockRemittanceGridTbl_Id_L0SBMT_1_cashBalanceRemittVO.SEQUENCE_TO']")
	private WebElement Csm_SequenceTo_UnderRemittanceSendToBranch;

	public WebElement Csm_SequenceTo_UnderRemittanceSendToBranch() {
		return Csm_SequenceTo_UnderRemittanceSendToBranch;
	}

	@FindBy(xpath = "//button[@id='remittanceStockMaint_save_L0SBMT']")
	private WebElement Csm_SaveButton_UnderRemittanceSendToBranch;

	public WebElement Csm_SaveButton_UnderRemittanceSendToBranch() {
		return Csm_SaveButton_UnderRemittanceSendToBranch;
	}

	@FindBy(xpath = "(//span[text()='Approve'])[3]")
	private WebElement Csm_Approve_UnderRemittanceSendToBranch;

	public WebElement Csm_Approve_UnderRemittanceSendToBranch() {
		return Csm_Approve_UnderRemittanceSendToBranch;
	}

	@FindBy(xpath = "//button[@id='recordOfRemittance_save_RRTMT']")
	private WebElement Csm_RecordingofRemittance_Savebtn;

	public WebElement Csm_RecordingofRemittance_Savebtn() {
		return Csm_RecordingofRemittance_Savebtn;
	}

	@FindBy(xpath = "//span[text()='Approve'")
	private WebElement Csm_RecordingofRemittance_Approve;

	public WebElement Csm_RecordingofRemittance_Approve() {
		return Csm_RecordingofRemittance_Approve;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE']")
	private WebElement Csm_RecordingofRemittance_Approve_remittancetype;

	public WebElement Csm_RecordingofRemittance_Approve_remittancetype() {
		return Csm_RecordingofRemittance_Approve_remittancetype;
	}

	@FindBy(xpath = "//button[@id='recordOfRemittance_approve_RRTP']")
	private WebElement Csm_RecordingofRemittance_Approve_approvebtn;

	public WebElement Csm_RecordingofRemittance_Approve_approvebtn() {
		return Csm_RecordingofRemittance_Approve_approvebtn;
	}

	@FindBy(xpath = "//td[text()='Recording of Remittance']")
	private WebElement CSM_RecordingofRemittance_Menu_612;

	public WebElement CSM_RecordingofRemittance_Menu_612() {
		return CSM_RecordingofRemittance_Menu_612;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSM_RecordingofRemittance_Maintenance_612;

	public WebElement CSM_RecordingofRemittance_Maintenance_612() {
		return CSM_RecordingofRemittance_Maintenance_612;
	}
//		@FindBy(id="td_gridtab_vaultLookup_RRTMT_2_CODE")//double
//		private WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_612;
//		public WebElement CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_612() {
//			return CSM_RecordingofRemittance_Maintenance_valutNo_Search_select_valutcode_612;
//		}

	@FindBy(xpath = "//input[@id='lookuptxt_remittanceTypeLookup_RRTMT']")
	private WebElement CSM_RecordingofRemittance_Maintenance_RemittanceTypeCode;

	public WebElement CSM_RecordingofRemittance_Maintenance_RemittanceTypeCode() {
		return CSM_RecordingofRemittance_Maintenance_RemittanceTypeCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyLookup_RRTMT']")
	private WebElement CSM_RecordingofRemittance_Maintenance_currency;

	public WebElement CSM_RecordingofRemittance_Maintenance_currency() {
		return CSM_RecordingofRemittance_Maintenance_currency;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyLookup_RRTDY']")
	private WebElement CSM_RecordingofRemittance_ToBeDestroyed_currency;

	public WebElement CSM_RecordingofRemittance_ToBeDestroyed_currency() {
		return CSM_RecordingofRemittance_ToBeDestroyed_currency;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyLookup_RRTTC']")
	private WebElement CSM_RecordingofRemittance_ToBeCancelled_currency;

	public WebElement CSM_RecordingofRemittance_ToBeCancelled_currency() {
		return CSM_RecordingofRemittance_ToBeCancelled_currency;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyLookup_RRTDM']")
	private WebElement CSM_RecordingofRemittance_ToBeDamaged_currency;

	public WebElement CSM_RecordingofRemittance_ToBeDamaged_currency() {
		return CSM_RecordingofRemittance_ToBeDamaged_currency;
	}

	@FindBy(xpath = "//input[@name='recordOfRemittanceCO.remittanceRecordVO.SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_Maintenance_SequenceFrom;

	public WebElement CSM_RecordingofRemittance_Maintenance_SequenceFrom() {
		return CSM_RecordingofRemittance_Maintenance_SequenceFrom;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_TRS_NO']")
	private WebElement CSM_RecordingofRemittance_ApproveGrid_TransactionNoDenisk;

	public WebElement CSM_RecordingofRemittance_ApproveGrid_TransactionNoDenisk() {
		return CSM_RecordingofRemittance_ApproveGrid_TransactionNoDenisk;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_TRS_NO']")
	private WebElement CSM_RecordingofRemittance_ToBeCancelledGrid_TransactionNoDenisk;

	public WebElement CSM_RecordingofRemittance_ToBeCancelledGrid_TransactionNoDenisk() {
		return CSM_RecordingofRemittance_ToBeCancelledGrid_TransactionNoDenisk;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_ApproveScreen_SequenceFrom_612;

	public WebElement CSM_RecordingofRemittance_ApproveScreen_SequenceFrom_612() {
		return CSM_RecordingofRemittance_ApproveScreen_SequenceFrom_612;
	}

	@FindBy(xpath = "//input[@id='SEQUENCE_TO_RRTMT']")
	private WebElement CSM_RecordingofRemittance_Maintenance_SequenceTo_612;

	public WebElement CSM_RecordingofRemittance_Maintenance_SequenceTo_612() {
		return CSM_RecordingofRemittance_Maintenance_SequenceTo_612;
	}

	// span[text()='Approve']
	@FindBy(xpath = "//a[@id='RRTP']")
	private WebElement CSM_RecordingofRemittance_ApproveMenu_612;

	public WebElement CSM_RecordingofRemittance_ApproveMenu_612() {
		return CSM_RecordingofRemittance_ApproveMenu_612;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTP_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_RemittanceType_612;

	public WebElement CSM_RecordingofRemittance_RemittanceType_612() {
		return CSM_RecordingofRemittance_RemittanceType_612;
	}

	// id="recordOfRemittanceMaintGridTbl_Id_RRTP_gs_RECEIVED_DATE
	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_ReceivedDate_612;

	public WebElement CSM_RecordingofRemittance_ReceivedDate_612() {
		return CSM_RecordingofRemittance_ReceivedDate_612;
	}

	@FindBy(xpath = "//button[@id='recordOfRemittance_approve_RRTP']")
	private WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_612;

	public WebElement CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_612() {
		return CSM_RecordingofRemittance_ReceivedDate_DoubleClk_ApproveBtn_612;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_Maintenace_ReceviedData_612;

	public WebElement CSM_RecordingofRemittance_Maintenace_ReceviedData_612() {
		return CSM_RecordingofRemittance_Maintenace_ReceviedData_612;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement CSM_RecordingofRemittance_Maintenace_pop_612;

	public WebElement CSM_RecordingofRemittance_Maintenace_pop_612() {
		return CSM_RecordingofRemittance_Maintenace_pop_612;
	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement CSM_RecordingofRemittance_Maintenace_Approved_Validate;

	public WebElement CSM_RecordingofRemittance_Maintenace_Approved_Validate() {
		return CSM_RecordingofRemittance_Maintenace_Approved_Validate;
	}

	@FindBy(xpath = "//a[@id='RRTTC']")
	private WebElement CSM_RecordingofRemittance_tobeCancel;

	public WebElement CSM_RecordingofRemittance_tobeCancel_612() {
		return CSM_RecordingofRemittance_tobeCancel;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_tobeCancel_recevieddate;

	public WebElement CSM_RecordingofRemittance_tobeCancel_recevieddate_612() {
		return CSM_RecordingofRemittance_tobeCancel_recevieddate;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_tobeCancel_remittancetype;

	public WebElement CSM_RecordingofRemittance_tobeCancel_remittancetype_612() {
		return CSM_RecordingofRemittance_tobeCancel_remittancetype;
	}

	@FindBy(xpath = "//select[@id='REASON_RRTTC']")
	private WebElement CSM_RecordingofRemittance_tobeCancel_reasonkey;

	public WebElement CSM_RecordingofRemittance_tobeCancel_reasonkey() {
		return CSM_RecordingofRemittance_tobeCancel_reasonkey;
	}

	@FindBy(xpath = "//td[text()='To be Cancelled']")
	private WebElement CSM_RecordingofRemittance_Maintenace_validate_tobecancel;

	public WebElement CSM_RecordingofRemittance_Maintenace_validate_tobecancel() {
		return CSM_RecordingofRemittance_Maintenace_validate_tobecancel;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTN_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_approvecanccel_remittancetype_612;

	public WebElement CSM_RecordingofRemittance_approvecanccel_remittancetype_612() {
		return CSM_RecordingofRemittance_approvecanccel_remittancetype;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTN_gs_RECEIVED_DATE")
	private WebElement CSM_RecordingofRemittance_approvecanccel_receiveddate_612;

	public WebElement CSM_RecordingofRemittance_approvecanccel_receiveddate_612() {
		return CSM_RecordingofRemittance_approvecanccel_receiveddate;
	}

	@FindBy(xpath = "//td[text()='Canceled']")
	private WebElement CSM_RecordingofRemittance_Maintenace_Validate_Cancelled_Remittance;

	public WebElement CSM_RecordingofRemittance_Maintenace_Validate_Cancelled_Remittance() {
		return CSM_RecordingofRemittance_Maintenace_Validate_Cancelled_Remittance;
	}

	@FindBy(id = "infoBarSearchButton_RRTDY")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_searchbtn;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_searchbtn() {
		return CSM_RecordingofRemittance_tobeDestroyed_searchbtn;
	}

	@FindBy(id = "infoBarSearchButton_RRTADY")
	private WebElement CSM_RecordingofRemittance_Destroyed_searchbtn;

	public WebElement CSM_RecordingofRemittance_Destroyed_searchbtn() {
		return CSM_RecordingofRemittance_tobeDestroyed_searchbtn;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_remittancetype_612;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_remittancetype_612() {
		return CSM_RecordingofRemittance_tobeDestroyed_remittancetype;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_SEQUENCE_FR")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_receiveddate_612;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_receiveddate_612() {
		return CSM_RecordingofRemittance_tobeDestroyed_receiveddate;
	}

	@FindBy(id = "td_recordOfRemittanceMaintGridTbl_Id_RRTDY_1_VAULT_NO")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_SelectRecord;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_SelectRecord() {
		return CSM_RecordingofRemittance_tobeDestroyed_SelectRecord;
	}

	@FindBy(id = "td_recordOfRemittanceMaintGridTbl_Id_RRTADY_1_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_Approve_Destroy_SelectRecord;

	public WebElement CSM_RecordingofRemittance_Approve_Destroy_SelectRecord() {
		return CSM_RecordingofRemittance_Approve_Destroy_SelectRecord;
	}

	@FindBy(xpath = "//select[@id='REASON_RRTDY']")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_reasonkey;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_reasonkey() {
		return CSM_RecordingofRemittance_tobeDestroyed_reasonkey;
	}

	@FindBy(id = "recordOfRemittanceMaintForm_RRTDY_To_Destroy_key")
	private WebElement CSM_RecordingofRemittance_toDestroyed_button;

	public WebElement CSM_RecordingofRemittance_toDestroyed_button() {
		return CSM_RecordingofRemittance_toDestroyed_button;
	}

	@FindBy(xpath = "//td[text()='To be Destroyed']")
	private WebElement CSM_RecordingofRemittance_validate_tobeDestroyed;

	public WebElement CSM_RecordingofRemittance_validate_tobeDestroyed() {
		return CSM_RecordingofRemittance_validate_tobeDestroyed;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_SEQUENCE_FR")
	private WebElement CSM_RecordingofRemittance_Approvedestroy_receivedate_612;

	public WebElement CSM_RecordingofRemittance_Approvedestroy_receivedate_612() {
		return CSM_RecordingofRemittance_Approvedestroy_receivedate;
	}

	@FindBy(id = "td_recordOfRemittanceMaintGridTbl_Id_RRTADY_1_VAULT_NO")
	private WebElement CSM_RecordingofRemittance_Approvedestroy_SelectCreatedRecord;

	public WebElement CSM_RecordingofRemittance_Approvedestroy_SelectCreatedRecord() {
		return CSM_RecordingofRemittance_Approvedestroy_SelectCreatedRecord;
	}

	@FindBy(id = "recordOfRemittanceMaintForm_RRTADY_Destroy_key")
	private WebElement CSM_RecordingofRemittance_DestroyButton;

	public WebElement CSM_RecordingofRemittance_DestroyButton() {
		return CSM_RecordingofRemittance_DestroyButton;
	}

	@FindBy(xpath = "//td[text()='Destroyed']")
	private WebElement CSM_RecordingofRemittance_Validate_Destroyed;

	public WebElement CSM_RecordingofRemittance_Validate_Destroyed() {
		return CSM_RecordingofRemittance_Validate_Destroyed;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_RRTDM']")
	private WebElement CSM_RecordingofRemittance_tobeDamaged_searchbtn;

	public WebElement CSM_RecordingofRemittance_tobeDamaged_searchbtn() {
		return CSM_RecordingofRemittance_tobeDamaged_searchbtn;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_REMITTANCE_TYPE']")
	private WebElement CSM_RecordingofRemittance_tobeDamaged_remittancetype_612;

	public WebElement CSM_RecordingofRemittance_tobeDamaged_remittancetype_612() {
		return CSM_RecordingofRemittance_tobeDamaged_remittancetype;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_RECEIVED_DATE']")
	private WebElement CSM_RecordingofRemittance_tobeDamaged_receivedate_612;

	public WebElement CSM_RecordingofRemittance_tobeDamaged_receivedate_612() {
		return CSM_RecordingofRemittance_tobeDamaged_receivedate_612;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceMaintGridTbl_Id_RRTDM_1_REMITTANCE_TYPE']")
	private WebElement CSM_RecordingofRemittance_tobeDamaged_SelectRecord;

	public WebElement CSM_RecordingofRemittance_tobeDamaged_SelectRecord() {
		return CSM_RecordingofRemittance_tobeDamaged_SelectRecord;
	}

	@FindBy(xpath = "//select[@id='REASON_RRTDM']")
	private WebElement CSM_RecordingofRemittance_tobeDamaged_reasonkey;

	public WebElement CSM_RecordingofRemittance_tobeDamaged_reasonkey() {
		return CSM_RecordingofRemittance_tobeDamaged_reasonkey;
	}

	@FindBy(xpath = "//button[@id='recordOfRemittance_toDamage_RRTDM']")
	private WebElement CSM_RecordingofRemittance_ToDamage;

	public WebElement CSM_RecordingofRemittance_ToDamage() {
		return CSM_RecordingofRemittance_ToDamage;
	}

	@FindBy(xpath = "//td[text()='To be Damaged']")
	private WebElement CSM_RecordingofRemittance_validation_tobeDamaged;

	public WebElement CSM_RecordingofRemittance_validation_tobeDamaged() {
		return CSM_RecordingofRemittance_validation_tobeDamaged;
	}

	@FindBy(xpath = "//span[text()='Approve Damage']")
	private WebElement CSM_RecordingofRemittance_ApproveDamage_612;

	public WebElement CSM_RecordingofRemittance_ApproveDamage_612() {
		return CSM_RecordingofRemittance_ApproveDamage;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_ApproveDamage_remmitancetype_612;

	public WebElement CSM_RecordingofRemittance_ApproveDamage_remmitancetype_612() {
		return CSM_RecordingofRemittance_ApproveDamage_remmitancetype;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTADM_gs_SEQUENCE_FR")
	private WebElement CSM_RecordingofRemittance_ApproveDamage_receiveddate_612;

	public WebElement CSM_RecordingofRemittance_ApproveDamage_receiveddate_612() {
		return CSM_RecordingofRemittance_ApproveDamage_receiveddate;
	}

	@FindBy(id = "td_recordOfRemittanceMaintGridTbl_Id_RRTADM_1_VAULT_NO")
	private WebElement CSM_RecordingofRemittance_ApproveDamage_SelectRecord;

	public WebElement CSM_RecordingofRemittance_ApproveDamage_SelectRecord() {
		return CSM_RecordingofRemittance_ApproveDamage_SelectRecord;
	}

	@FindBy(id = "recordOfRemittanceMaintForm_RRTADM_Damage_key")
	private WebElement CSM_RecordingofRemittance_DamageButton;

	public WebElement CSM_RecordingofRemittance_DamageButton() {
		return CSM_RecordingofRemittance_DamageButton;
	}

	@FindBy(xpath = "//td[text()='Damaged']")
	private WebElement CSM_RecordingofRemittance_validation_Damaged;

	public WebElement CSM_RecordingofRemittance_validation_Damaged_612() {
		return CSM_RecordingofRemittance_validation_Damaged;
	}
	// travellar

	@FindBy(xpath = "//td[@id='add_recordOfRemittanceDenomGridTbl_Id_RRTMT']")
	private WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Add;

	public WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Add_612() {
		return CSM_RecordingofRemittance_Maintenance_Donomination_Add;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.SERIAL_NO']")
	private WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Serailinput;

	public WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Serailinput_612() {
		return CSM_RecordingofRemittance_Maintenance_Donomination_Serailinput;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.SERIAL_NO']/input")
	private WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Serailinput_box;

	public WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Serailinput_box_612() {
		return CSM_RecordingofRemittance_Maintenance_Donomination_Serailinput_box;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.SEQUENCE_FR']//input")
	private WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Frominput;

	public WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Frominput_612() {
		return CSM_RecordingofRemittance_Maintenance_Donomination_Frominput;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.VALUE']//input")
	private WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Valueinput;

	public WebElement CSM_RecordingofRemittance_Maintenance_Donomination_Valueinput() {
		return CSM_RecordingofRemittance_Maintenance_Donomination_Valueinput;
	}

	@FindBy(xpath = "//span[text()='Remove Tab']")
	private WebElement RecordingofRemittance_Maintenance_closeTab_612;

	public WebElement RecordingofRemittance_Maintenance_closeTab_612() {
		return RecordingofRemittance_Maintenance_closeTab_612;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTP_gs_RECEIVED_DATE")
	private WebElement CSM_RecordingofRemittance_currentDate_612;

	public WebElement CSM_RecordingofRemittance_currentDate_612() {
		return CSM_RecordingofRemittance_currentDate_612;
	}

	@FindBy(xpath = "//div[@id='panel_6_P024MA']//span[text()='Standing Order']")
	private WebElement CSMParam_TransactionType_standingOrderTab;

	public WebElement CSMParam_TransactionType_standingOrderTab() {
		return CSMParam_TransactionType_standingOrderTab;
	}

	@FindBy(xpath = "//td[@id='del_recordOfRemittanceDenomGridTbl_Id_RRTMT']/div/span")
	private WebElement RecordingofRemittance_Maintenance_Denomination_DeleteIcon_609;

	public WebElement RecordingofRemittance_Maintenance_Denomination_DeleteIcon_609() {
		return RecordingofRemittance_Maintenance_Denomination_DeleteIcon_609;
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

//	 *******************************************
	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_REMITTANCE_TYPE")
	private WebElement CSM_RecordingofRemittance_Maintenace_Remittance_Type_input_7183;

	public WebElement CSM_RecordingofRemittance_Maintenace_Remittance_Type_input_7183() {
		return CSM_RecordingofRemittance_Maintenace_Remittance_Type_input_7183;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_Maintenace_Sequence_No_606;

	public WebElement CSM_RecordingofRemittance_Maintenace_Sequence_No_606() {
		return CSM_RecordingofRemittance_Maintenace_Sequence_No_606;
	}

	@FindBy(id = "td_recordOfRemittanceMaintGridTbl_Id_RRTDM_1_TRS_NO")
	private WebElement CSM_RecordingofRemittance_tobeDamaged_Searchgrid_First_Row_608;

	public WebElement CSM_RecordingofRemittance_tobeDamaged_Searchgrid_First_Row_608() {
		return CSM_RecordingofRemittance_tobeDamaged_Searchgrid_First_Row_608;
	}

	@FindBy(id = "TRS_NO_RRTDM")
	private WebElement CSM_RecordingofRemittance_tobeDamaged_TRS_No_608;

	public WebElement CSM_RecordingofRemittance_tobeDamaged_TRS_No_608() {
		return CSM_RecordingofRemittance_tobeDamaged_TRS_No_608;
	}

	@FindBy(id = "TRS_NO_RRTTC")
	private WebElement CSM_RecordingofRemittance_tobeCancelled_TRS_No_608;

	public WebElement CSM_RecordingofRemittance_tobeCancelled_TRS_No_608() {
		return CSM_RecordingofRemittance_tobeCancelled_TRS_No_608;
	}

	@FindBy(xpath = "//td[contains(text(),'Damaged')]")
	private WebElement CSM_RecordingofRemittance_maintenance_searchgrid_status;

	public WebElement CSM_RecordingofRemittance_maintenance_searchgrid_status() {
		return CSM_RecordingofRemittance_maintenance_searchgrid_status;
	}

	@FindBy(id = "TRS_NO_RRTDY")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_TRS_No_608;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_TRS_No_608() {
		return CSM_RecordingofRemittance_tobeDestroyed_TRS_No_608;
	}

	@FindBy(id = "recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_RECEIVED_DATE")
	private WebElement CSM_RecordingofRemittance_tobeCancel_recevied_date;

	public WebElement CSM_RecordingofRemittance_tobeCancel_recevied_date() {
		return CSM_RecordingofRemittance_tobeCancel_recevied_date;
	}

	@FindBy(xpath = "//th[@id='trsAckTOutAlertGrid_Id_RCVALERT_sTodoDet.JOB_ID']")
	private WebElement CSM_AlertPopup_Job_id_Column;

	public WebElement CSM_AlertPopup_Job_id_Column() {
		return CSM_AlertPopup_Job_id_Column;
	}

	@FindBy(xpath = "//div[@id='jqgh_trsAckTOutAlertGrid_Id_RCVALERT_sTodoDet.JOB_ID']//span[@sort='desc']")
	private WebElement CSM_AlertPopup_Job_id_desc;

	public WebElement CSM_AlertPopup_Job_id_desc() {
		return CSM_AlertPopup_Job_id_desc;
	}

	@FindBy(id = "TRS_NO_RRTP_ALERT")
	private WebElement CSM_AlertPopup_TRS_No;

	public WebElement CSM_AlertPopup_TRS_No() {
		return CSM_AlertPopup_TRS_No;
	}

//	********* Nandhini TC Objects *********
	@FindBy(xpath = "//td[text()='Remittance Type']")
	private WebElement csm_Remitancetype_systemParameters_parameters_80;

	public WebElement csm_Remitancetype_systemParameters_parameters_80() {
		return csm_Remitancetype_systemParameters_parameters_80;
	}

	@FindBy(xpath = "//a[@id='P0040MA']//span[text()='Update After Approve']")
	private WebElement csm_UAA_RemittanceType_systemparameters_param_80;

	public WebElement csm_UAA_RemittanceType_systemparameters_param_80() {
		return csm_UAA_RemittanceType_systemparameters_param_80;
	}

	@FindBy(xpath = "//input[@id='remittancetypeList_GridTbl_Id_P0040MA_gs_remittanceVO.CODE']")
	private WebElement csm_code_UAAscreen_RemittanceType_systemParam_80;

	public WebElement csm_code_UAAscreen_RemittanceType_systemParam_80() {
		return csm_code_UAAscreen_RemittanceType_systemParam_80;
	}

	@FindBy(xpath = "//td[@id='td_remittancetypeList_GridTbl_Id_P0040MA_1_remittanceVO.CODE']")
	private WebElement csm_dblclck_code_UAAscreen_RemittanceType_systemParam_80;

	public WebElement csm_dblclck_code_UAAscreen_RemittanceType_systemParam_80() {
		return csm_dblclck_code_UAAscreen_RemittanceType_systemParam_80;
	}

	@FindBy(xpath = "//input[@id='predefined_value_P0040MA']")
	private WebElement csm_PredefinedValue_UAAscreen_RemittanceType_systemParam_80;

	public WebElement csm_PredefinedValue_UAAscreen_RemittanceType_systemParam_80() {
		return csm_PredefinedValue_UAAscreen_RemittanceType_systemParam_80;
	}

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040MA_Update_After_Approve_key']")
	private WebElement csm_Updateafterbutton_UAAscreen_RemittanceType_systemParam_80;

	public WebElement csm_Updateafterbutton_UAAscreen_RemittanceType_systemParam_80() {
		return csm_Updateafterbutton_UAAscreen_RemittanceType_systemParam_80;
	}

	@FindBy(xpath = "//a[@id='P0040P']//span[text()='Approve']")
	private WebElement csm_Approve_RemittanceType_systemParam_80;

	public WebElement csm_Approve_RemittanceType_systemParam_80() {
		return csm_Approve_RemittanceType_systemParam_80;
	}

	@FindBy(xpath = "//input[@id='remittancetypeList_GridTbl_Id_P0040P_gs_remittanceVO.CODE']")
	private WebElement csm_code_Approvescreen_RemittanceType_systemParam_80;

	public WebElement csm_code_Approvescreen_RemittanceType_systemParam_80() {
		return csm_code_Approvescreen_RemittanceType_systemParam_80;
	}

	@FindBy(xpath = "//td[@id='td_remittancetypeList_GridTbl_Id_P0040P_1_remittanceVO.CODE']")
	private WebElement csm_dblclck_code_Approvescreen_RemittanceType_systemParam_80;

	public WebElement csm_dblclck_code_Approvescreen_RemittanceType_systemParam_80() {
		return csm_dblclck_code_Approvescreen_RemittanceType_systemParam_80;
	}

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040P_Approve_key']")
	private WebElement csm_approvebtn_Approvescreen_RemittanceType_systemParam_80;

	public WebElement csm_approvebtn_Approvescreen_RemittanceType_systemParam_80() {
		return csm_approvebtn_Approvescreen_RemittanceType_systemParam_80;
	}

	@FindBy(xpath = "//td[@id='td_remittancetypeList_GridTbl_Id_P0040P_1_remittanceVO.CODE']")
	private WebElement csm_dblclck_code_Approvescreen_RemittanceType_systemParams_80;

	public WebElement csm_dblclck_code_Approvescreen_RemittanceType_systemParams_80() {
		return csm_dblclck_code_Approvescreen_RemittanceType_systemParams_80;
	}

	@FindBy(xpath = "//input[@id='nostro_mvt_P024MA']")
	private WebElement csm_AllowInternalAccounts_UAAscreen_TransactionType_systemparam_80;

	public WebElement csm_AllowInternalAccounts_UAAscreen_TransactionType_systemparam_80() {
		return csm_AllowInternalAccounts_UAAscreen_TransactionType_systemparam_80;
	}

	@FindBy(xpath = "//span[text()='Remittance']")
	private WebElement csm_Remittance_UAAscreen_TransactionType_systemparam_80;

	public WebElement csm_Remittance_UAAscreen_TransactionType_systemparam_80() {
		return csm_Remittance_UAAscreen_TransactionType_systemparam_80;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement csm_code_UAAscreen_TransactionType_systemparam_80;

	public WebElement csm_code_UAAscreen_TransactionType_systemparam_80() {
		return csm_code_UAAscreen_TransactionType_systemparam_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_remitt_type_P024MA']")
	private WebElement csm_RemittanceType_Remittancescreen_TransactionType_systemparam_80;

	public WebElement csm_RemittanceType_Remittancescreen_TransactionType_systemparam_80() {
		return csm_RemittanceType_Remittancescreen_TransactionType_systemparam_80;
	}

	@FindBy(xpath = "//select[@id='trx_purpose_P024MA']")
	private WebElement csm_trxpurpose_Remittancescreen_TransactionType_systemparam_80;

	public WebElement csm_trxpurpose_Remittancescreen_TransactionType_systemparam_80() {
		return csm_trxpurpose_Remittancescreen_TransactionType_systemparam_80;
	}

	@FindBy(id = "spanLookup_remitt_type_P024MA")
	private WebElement csm_trxpurpose_lookup_Remittancescreen_TransactionType_systemparam_80;

	public WebElement csm_trxpurpose_lookup_Remittancescreen_TransactionType_systemparam_80() {
		return csm_trxpurpose_lookup_Remittancescreen_TransactionType_systemparam_80;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement csm_dblclck_code_UAAscreen_TransactionType_systemparam_80;

	public WebElement csm_dblclck_code_UAAscreen_TransactionType_systemparam_80() {
		return csm_dblclck_code_UAAscreen_TransactionType_systemparam_80;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement csm_Code_under_ApproveScreen_80;

	public WebElement csm_Code_under_ApproveScreen_80() {
		return csm_Code_under_ApproveScreen_80;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement csm_DoubleclkCode_ApproveScreen;

	public WebElement csm_DoubleclkCode_ApproveScreen_612() {
		return csm_DoubleclkCode_ApproveScreen;
	}

	@FindBy(xpath = "//td[text()='Transfer Cash']")
	private WebElement csm_TransferCash_core_80;

	public WebElement csm_TransferCash_core_80() {
		return csm_TransferCash_core_80;
	}

	@FindBy(xpath = "//td[text()='Transfer Cash From Vault to Teller']")
	private WebElement csm_TransferCashfromVaulttoTeller_TransferCash_core_80;

	public WebElement csm_TransferCashfromVaulttoTeller_TransferCash_core_80() {
		return csm_TransferCashfromVaulttoTeller_TransferCash_core_80;
	}

	@FindBy(xpath = "//a[@id='L0VTMT']//span[text()='Maintenance']")
	private WebElement csm_Maintenance_TransferCashfromVaulttoTeller_TransferCash_core_80;

	public WebElement csm_Maintenance_TransferCashfromVaulttoTeller_TransferCash_core_80() {
		return csm_Maintenance_TransferCashfromVaulttoTeller_TransferCash_core_80;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trxTypeLookup_L0VTMT']")
	private WebElement csm_TrxType_Maintenancescreen_TransferCashfromVaulttoTeller_80;

	public WebElement csm_TrxType_Maintenancescreen_TransferCashfromVaulttoTeller_80() {
		return csm_TrxType_Maintenancescreen_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//span[text()='Remittance']")
	private WebElement csm_Remittance_Maintenancescreen_TransferCashfromVaulttoTeller_80;

	public WebElement csm_Remittance_Maintenancescreen_TransferCashfromVaulttoTeller_80() {
		return csm_Remittance_Maintenancescreen_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//td[@id='add_transferCashRemittanceGridTbl_Id_L0VTMT']//span")
	private WebElement csm_addbtn_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80;

	public WebElement csm_addbtn_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80() {
		return csm_addbtn_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//select[@id='REMITT_TYPE_L0VTMT']")
	private WebElement csm_RemittanceType_Maintenancescreen_TransferCashfromVaulttoTeller_80;

	public WebElement csm_RemittanceType_Maintenancescreen_TransferCashfromVaulttoTeller_80() {
		return csm_RemittanceType_Maintenancescreen_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//td[@id='td_transferCashRemittanceGridTbl_Id_L0VTMT_1_cashBalanceRemittVO.REMITTANCE_TYPE']")
	private WebElement csm_Remittancetype_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller;

	public WebElement csm_Remittancetype_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller() {
		return csm_Remittancetype_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller;
	}

	@FindBy(xpath = "//td[@id='td_transferCashRemittanceGridTbl_Id_L0VTMT_1_cashBalanceRemittVO.REMITTANCE_TYPE']//input")
	private WebElement csm_code_Remittancetype_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller;

	public WebElement csm_code_Remittancetype_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller() {
		return csm_code_Remittancetype_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller;
	}

	@FindBy(xpath = "//td[@id='td_transferCashRemittanceGridTbl_Id_L0VTMT_1_cashBalanceRemittVO.CURRENCY']//input")
	private WebElement csm_currencycode_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80;

	public WebElement csm_currencycode_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80() {
		return csm_currencycode_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//td[@id='td_transferCashRemittanceGridTbl_Id_L0VTMT_1_cashBalanceRemittVO.SEQUENCE_FR']//input")
	private WebElement csm_SequenceFrom_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80;

	public WebElement csm_SequenceFrom_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80() {
		return csm_SequenceFrom_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//td[@id='td_transferCashRemittanceGridTbl_Id_L0VTMT_1_cashBalanceRemittVO.SEQUENCE_TO']//input")
	private WebElement csm_SequenceTo_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80;

	public WebElement csm_SequenceTo_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80() {
		return csm_SequenceTo_Remittancescreen_Maintenance_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//button[@id='transCash_Save_L0VTMT']")
	private WebElement csm_Savebtn_Maintenancescreen_TransferCashfromVaulttoTeller_80;

	public WebElement csm_Savebtn_Maintenancescreen_TransferCashfromVaulttoTeller_80() {
		return csm_Savebtn_Maintenancescreen_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//a[@id='L0VTAP']//span[text()='Approve']")
	private WebElement csm_Approve_TransferCashfromVaulttoTeller_TransferCash_core_80;

	public WebElement csm_Approve_TransferCashfromVaulttoTeller_TransferCash_core_80() {
		return csm_Approve_TransferCashfromVaulttoTeller_TransferCash_core_80;
	}

	@FindBy(xpath = "//input[@id='transferCashGridTbl_Id_L0VTAP_gs_tellerCode']")
	private WebElement csm_FromVault_Approvescreen_TransferCashfromVaulttoTeller_80;

	public WebElement csm_FromVault_Approvescreen_TransferCashfromVaulttoTeller_80() {
		return csm_FromVault_Approvescreen_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//td[@id='td_transferCashGridTbl_Id_L0VTAP_1_tellerCode']")
	private WebElement csm_dblclck_code_Approvescreen_TransferCashfromVaulttoTeller_80;

	public WebElement csm_dblclck_code_Approvescreen_TransferCashfromVaulttoTeller_80() {
		return csm_dblclck_code_Approvescreen_TransferCashfromVaulttoTeller_80;
	}

	@FindBy(xpath = "//div[@id='transferCashToolBar_L0VTAP']//button")
	private WebElement csm_approvebtn_Approvescreen_TransferCashfromVaulttoTeller_80;

	public WebElement csm_approvebtn_Approvescreen_TransferCashfromVaulttoTeller_80() {
		return csm_approvebtn_Approvescreen_TransferCashfromVaulttoTeller_80;
	}

	// ******************************************ajith*****************************************************************************//

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTP_gs_SEQUENCE_FR']")
	private WebElement sequenceNum_ApproveScreen_RecordOfRemittance;

	public WebElement sequenceNum_ApproveScreen_RecordOfRemittance() {
		return sequenceNum_ApproveScreen_RecordOfRemittance;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_REMITTANCE_TYPE']")
	private WebElement remittanceType_ToBeDamageScreen_RecordOfRemittance;

	public WebElement remittanceType_ToBeDamageScreen_RecordOfRemittance() {
		return remittanceType_ToBeDamageScreen_RecordOfRemittance;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_RECEIVED_DATE']")
	private WebElement receivedDate_ToBeDamageScreen_RecordOfRemittance;

	public WebElement receivedDate_ToBeDamageScreen_RecordOfRemittance() {
		return receivedDate_ToBeDamageScreen_RecordOfRemittance;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDM_gs_SEQUENCE_FR']")
	private WebElement sequenceNum_ToBeDamagedScreen_RecordOfRemittance;

	public WebElement sequenceNum_ToBeDamagedScreen_RecordOfRemittance() {
		return sequenceNum_ToBeDamagedScreen_RecordOfRemittance;
	}

	@FindBy(xpath = "//td[@id='td_recordOfRemittanceDenomGridTbl_Id_RRTMT_1_remittanceRecordDenomVO.VALUE']//input")
	private WebElement RecordingofRemittance_Maintenance_Denomination_Value_609;

	public WebElement RecordingofRemittance_Maintenance_Denomination_Value_609() {
		return RecordingofRemittance_Maintenance_Denomination_Value_609;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_RECEIVED_DATE']")
	private WebElement receivedDate_ToBeCancelScreen_RecordOfRemittance;

	public WebElement receivedDate_ToBeCancelScreen_RecordOfRemittance() {
		return receivedDate_ToBeCancelScreen_RecordOfRemittance;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTMT_gs_TRS_NO']")
	private WebElement transactionNoDenisk_MaintenanceScreen_RecordOfRemittance;

	public WebElement transactionNoDenisk_MaintenanceScreen_RecordOfRemittance() {
		return transactionNoDenisk_MaintenanceScreen_RecordOfRemittance;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_RRTN']")
	private WebElement searchButton_ApproveCancelScreen_RecordOfRemittance;

	public WebElement searchButton_ApproveCancelScreen_RecordOfRemittance() {
		return searchButton_ApproveCancelScreen_RecordOfRemittance;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTN_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_approvecancel_SequenceFromNum;

	public WebElement CSM_RecordingofRemittance_approvecancel_SequenceFromNum() {
		return CSM_RecordingofRemittance_approvecancel_SequenceFromNum;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTTC_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_tobeCancel_SequenceFromNum_606;

	public WebElement CSM_RecordingofRemittance_tobeCancel_SequenceFromNum_606() {
		return CSM_RecordingofRemittance_tobeCancel_SequenceFromNum_606;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTDY_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_tobeDestroyed_SequenceFromNum;

	public WebElement CSM_RecordingofRemittance_tobeDestroyed_SequenceFromNum() {
		return CSM_RecordingofRemittance_tobeDestroyed_SequenceFromNum;
	}

	@FindBy(xpath = "//input[@id='recordOfRemittanceMaintGridTbl_Id_RRTADY_gs_SEQUENCE_FR']")
	private WebElement CSM_RecordingofRemittance_ApproveDestroy_SequenceFromNum;

	public WebElement CSM_RecordingofRemittance_ApproveDestroy_SequenceFromNum() {
		return CSM_RecordingofRemittance_ApproveDestroy_SequenceFromNum;
	}

	@FindBy(xpath = "//input[@id='predefined_value_P0040MT']")
	private WebElement Remittance_Type_Predefined_Checkbox;

	public WebElement Remittance_Type_Predefined_Checkbox() {
		return Remittance_Type_Predefined_Checkbox;
	}

	@FindBy(xpath = "//label[@id='remittancetypeMaint_FormId_P0040MA_Update_After_Approve_key']")
	private WebElement Remittance_Type_Update_After_Approve;

	public WebElement Remittance_Type_Update_After_Approve() {
		return Remittance_Type_Update_After_Approve;
	}

	@FindBy(xpath = "//div[@id='multiChequesEntyDetToolBar_D001RE']//button")
	private WebElement Transactions_BulkRemittance_Save_Btn_609;

	public WebElement Transactions_BulkRemittance_Save_Btn_609() {
		return Transactions_BulkRemittance_Save_Btn_609;
	}

	@FindBy(id = "dismissbut_L0RSAP")
	private WebElement CSM_Send_Alert_Popup_Dismiss_Btn_609;

	public WebElement CSM_Send_Alert_Popup_Dismiss_Btn_609() {
		return CSM_Send_Alert_Popup_Dismiss_Btn_609;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement Request_For_Stock_Confirm_Popup_Msg;

	public WebElement Request_For_Stock_Confirm_Popup_Msg() {
		return Request_For_Stock_Confirm_Popup_Msg;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_head_teller_O001UP']")
	private WebElement headUsers_ControlRecord;

	public WebElement headUsers_ControlRecord() {
		return headUsers_ControlRecord;
	}

	@FindBy(xpath = "//span[@id='spanLookup_head_teller_O001UP']")
	private WebElement lookUpHeadUsers_ControlRecord;

	public WebElement lookUpHeadUsers_ControlRecord() {
		return lookUpHeadUsers_ControlRecord;
	}

	@FindBy(xpath = "//input[@id='gridtab_head_teller_O001UP_gs_USER_ID']")
	private WebElement lookUpSearchHeadUsers_ControlRecord;

	public WebElement lookUpSearchHeadUsers_ControlRecord() {
		return lookUpSearchHeadUsers_ControlRecord;
	}

	@FindBy(xpath = "//input[@name='controlrecordCO.H_TELLER_DESC']")
	private WebElement headUsersDesc_ControlRecord;

	public WebElement headUsersDesc_ControlRecord() {
		return headUsersDesc_ControlRecord;
	}

//		div[@class="jMsgbox-contentWrap"]
//		Do you need to reload the tab contents of Remittance / Remittance Request For Stock / Maintenance?

}