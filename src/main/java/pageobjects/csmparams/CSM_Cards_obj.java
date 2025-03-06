package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Cards_obj {
	WebDriver driver;

	public CSM_Cards_obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//table[@id='cardsMgmtGridTbl_Id_G001T'])[1]")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forDeactivate;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forDeactivate() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forDeactivate;
	}

	@FindBy(xpath = "(//table[@id='cardsMgmtGridTbl_Id_G001M'])[1]")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_formonitoring;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_formonitoring() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_formonitoring;
	}

	@FindBy(xpath = "(//table[@id='cardsMgmtGridTbl_Id_G001UK'])[1]")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forUnBlock;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forUnBlock() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forUnBlock;
	}

	@FindBy(xpath = "(//table[@id='cardsMgmtGridTbl_Id_G001N'])[1]")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forcancel;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forcancel() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forcancel;
	}

	@FindBy(xpath = "(//table[@id='cardsMgmtGridTbl_Id_G001H'])[1]")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forhot;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forhot() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_forhot;
	}

	@FindBy(xpath = "//table[@id='cardsMgmtGridTbl_Id_G001DY']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_fordestroy;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_fordestroy() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_fordestroy;
	}

	// Razia************************************************************************************************************
	@FindBy(xpath = "//td[text()='Card Request']")
	private WebElement CardRequest_CW;

	public WebElement CardRequest_CW() {
		return CardRequest_CW;
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

	@FindBy(xpath = "//td[text()='Cards Management']")
	private WebElement CardManagement_CSM_Card;

	public WebElement CardManagement_CSM_Card() {
		return CardManagement_CSM_Card;
	}

	@FindBy(xpath = "//input[@name='CARD_TYPE']")
	private WebElement CardType_CW;

	public WebElement CardType_CW() {
		return CardType_CW;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approve_CW;

	public WebElement Approve_CW() {
		return Approve_CW;
	}

	@FindBy(xpath = "//input[@name='CIF']")
	private WebElement CIF_CW;

	public WebElement CIF_CW() {
		return CIF_CW;
	}

	@FindBy(xpath = "//span[text()='Charges']")
	private WebElement Charges_CW;

	public WebElement Charges_CW() {
		return Charges_CW;
	}

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

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Transactiontype1;

	public WebElement Transactiontype1() {
		return Transactiontype1;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenancebutton_lostfound1;

	public WebElement Maintenancebutton_lostfound1() {
		return Maintenancebutton_lostfound1;
	}

	@FindBy(xpath = "(//input[@name='CODE'])[2]")
	private WebElement CODESEARCHbox1;

	public WebElement CODESEARCHbox1() {
		return CODESEARCHbox1;
	}

	@FindBy(xpath = "(//input[@name='SHORT_DESC_ENG'])[2]")
	private WebElement ShortDESCRIPTIONs;

	public WebElement ShortDESCRIPTIONs() {
		return ShortDESCRIPTIONs;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_P024MA']")
	private WebElement SearchBUTTOn1;

	public WebElement SearchBUTTOn1() {
		return SearchBUTTOn1;
	}

	@FindBy(xpath = "//input[@id='allow_clearing_chrg_P024MA']")
	private WebElement AllowUSERbox1;

	public WebElement AllowUSERbox1() {
		return AllowUSERbox1;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement UpdateAfterAPPROVE123;

	public WebElement UpdateAfterAPPROVE123() {
		return UpdateAfterAPPROVE123;

	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement okBUTTON;

	public WebElement okBUTTON() {
		return okBUTTON;
	}

	@FindBy(xpath = "//label[@id=\"transactionTypesMaint_FormId_P024MT_Save_key\"]")
	private WebElement Savebox;

	public WebElement Savebox() {
		return Savebox;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement closeButton_lot;

	public WebElement closeButton_lot() {
		return closeButton_lot;
	}

	@FindBy(xpath = "//td[@id='td_cardsStatusReasonCardsList_GridTbl_Id_P00431MA_1_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Doubleclick_Cards_Status_Reason_Param;

	public WebElement Doubleclick_Cards_Status_Reason_Param() {
		return Doubleclick_Cards_Status_Reason_Param;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement UpdateAfterApprove_Cards_Details;

	public WebElement UpdateAfterApprove_Cards_Details() {
		return UpdateAfterApprove_Cards_Details;
	}

	@FindBy(xpath = "//input[@id='1_ctscardStatusReasonCardtpVO.CARD_TYPE_lookuptxt_tab7_GridTbl_Id_P00431MA']")
	private WebElement Add_Button_code_value_cards;

	public WebElement Add_Button_code_value_cards() {
		return Add_Button_code_value_cards;
	}

	@FindBy(xpath = "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT'//button[@id='ok_btn_1_P00431MA']]")
	private WebElement Add_Button_ok_cards;

	public WebElement Add_Button_ok_cards() {
		return Add_Button_ok_cards;
	}

	@FindBy(xpath = "//label[@id='cardsStatusReasonCardsMaint_FormId_P00431MA_Update_After_Approve_key']")
	private WebElement Update_after_aprrove_cards;

	public WebElement Update_after_aprrove_cards() {
		return Update_after_aprrove_cards;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approve_button_cards;

	public WebElement Approve_button_cards() {
		return Approve_button_cards;
	}

	@FindBy(xpath = "//td[@id='add_tab7_GridTbl_Id_P00431MA']")
	private WebElement Add_Button_Transaction_cards;

	public WebElement Add_Button_Transaction_cards() {
		return Add_Button_Transaction_cards;
	}

	@FindBy(xpath = "//input[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431P_gs_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Descritioncode_approve_cards;

	public WebElement Descritioncode_approve_cards() {
		return Descritioncode_approve_cards;
	}

	@FindBy(xpath = "//label[@id='cardsStatusReasonCardsMaint_FormId_P00431P_Approve_key']")
	private WebElement Submit_Approve_button_cards;

	public WebElement Submit_Approve_button_cards() {
		return Submit_Approve_button_cards;
	}

	@FindBy(xpath = "//td[text()='Change Card Status']")
	private WebElement change_card_Status_cards;

	public WebElement change_card_Status_cards() {
		return change_card_Status_cards;
	}

	@FindBy(xpath = "//span[text()='Monitoring']")
	private WebElement CSM_Monitoring_alert_cards;

	public WebElement CSM_Monitoring_alert_cards() {
		return CSM_Monitoring_alert_cards;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001M_gs_ctsCardsVO.BRIEF_NAME_ENG']")
	private WebElement CSM_Card_ID_cards;

	public WebElement CSM_Card_ID_cards() {
		return CSM_Card_ID_cards;
	}

	@FindBy(xpath = "//td[@id='td_cardsStatusReasonCardsList_GridTbl_Id_P00431MA_1_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Double_click_button_cards_CSM_Monitoring;

	public WebElement Double_click_button_cards_CSM_Monitoring() {
		return Double_click_button_cards_CSM_Monitoring;
	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001T_1_ctsCardsVO.BRIEF_NAME_ENG']]")
	private WebElement Double_click_button_cards_CSM_Deactive;

	public WebElement Double_click_button_cards_CSM_Deactive() {
		return Double_click_button_cards_CSM_Deactive;
	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001N_1_cardsMgtVO.CARD_TYPE']")
	private WebElement Double_click_button_cards_CSM_Cancel;

	public WebElement Double_click_button_cards_CSM_Cancel() {
		return Double_click_button_cards_CSM_Cancel;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_status_reason_G001M']")
	private WebElement Status_Reason_cards;

	public WebElement Status_Reason_cards() {
		return Status_Reason_cards;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001M_Monitoring_key']")
	private WebElement Submit_Monitoring_button_cards;

	public WebElement Submit_Monitoring_button_cards() {
		return Submit_Monitoring_button_cards;
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

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;

	public WebElement CSMDateToChangeTheCurrentDate() {
		return CSM_DateToChangeTheCurrentDate;
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
	}// span[text()='Deactivate']

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001H_1_cardsMgtVO.CARD_TYPE']")

	private WebElement DoubleClick_Hot_DebitCard;

	public WebElement DoubleClick_Hot_DebitCard()

	{

		return DoubleClick_Hot_DebitCard;

	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001DY_1_cardsMgtVO.CARD_TYPE']")

	private WebElement Double_Destroy_CardType;

	public WebElement Double_Destroy_CardType()

	{

		return Double_Destroy_CardType;

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

	@FindBy(xpath = "//input[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431MA_gs_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Replace_param_cards;

	public WebElement Replace_param_cards() {
		return Replace_param_cards;
	}

	@FindBy(xpath = " //td[@id='td_cardsStatusReasonCardsList_GridTbl_Id_P00431MA_1_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Doubleclick_Replacebutton_cards;

	public WebElement Doubleclick_Replacebutton_cards() {
		return Doubleclick_Replacebutton_cards;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001RE_gs_cardsMgtVO.CARD_TYPE']")
	private WebElement CardType_replaceButton_cards;

	public WebElement CardType_replaceButton_cards() {
		return CardType_replaceButton_cards;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001RE_gs_cardsMgtVO.CARD_TYPE']")
	private WebElement CSM_Double_CardType_replaceButton_cards;

	public WebElement CSM_Double_CardType_replaceButton_cards() {
		return CSM_Double_CardType_replaceButton_cards;
	}

	@FindBy(xpath = "//span[text()='Issue']")
	private WebElement Issue_button_cards_CSM;

	public WebElement Issue_button_cards_CSM() {
		return Issue_button_cards_CSM;
	}

	@FindBy(xpath = "//span[text()='Replace']")
	private WebElement Replace_button_cards_CSM;

	public WebElement Replace_button_cards_CSM() {
		return Replace_button_cards_CSM;
	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001RE_1_cardsMgtVO.CARD_TYPE']")
	private WebElement DdoubleReplace_button_cards_CSM;

	public WebElement DdoubleReplace_button_cards_CSM() {
		return DdoubleReplace_button_cards_CSM;
	}

	@FindBy(xpath = "//input[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431MA_gs_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Isseue_desription_button_cards_CSM;

	public WebElement Isseue_desription_button_cards_CSM() {
		return Isseue_desription_button_cards_CSM;
	}

	@FindBy(xpath = "//td[@id='td_cardsStatusReasonCardsList_GridTbl_Id_P00431MA_1_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Double_isseu_desription_button_cards_CSM;

	public WebElement Double_isseu_desription_button_cards_CSM() {
		return Double_isseu_desription_button_cards_CSM;
	}

	@FindBy(xpath = "//input[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431MA_gs_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Apply_code_desription_button_cards_CSMParam;

	public WebElement Apply_code_desription_button_cards_CSMParam() {
		return Apply_code_desription_button_cards_CSMParam;
	}

	@FindBy(xpath = "//table[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431MA']")
	private WebElement Double_Apply_desription_button_cards_CSM;

	public WebElement Double_Apply_desription_button_cards_CSM() {
		return Double_Apply_desription_button_cards_CSM;
	}

	@FindBy(xpath = "//table[@id='cardsMgmtGridTbl_Id_G001AP']")
	private WebElement Doubleclick_creditdebit_button_cards_CSM;

	public WebElement Doubleclick_creditdebit_button_cards_CSM() {
		return Doubleclick_creditdebit_button_cards_CSM;
	}

	@FindBy(xpath = "//td[text()='Card Request']")
	private WebElement Card_request;

	public WebElement Card_request() {

		return Card_request;

	}

	@FindBy(xpath = "//span[text()='Apply']")

	private WebElement Card_request_apply;

	public WebElement Card_request_apply()

	{

		return Card_request_apply;

	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001AP_gs_ctsCardsVO.BRIEF_NAME_ENG']")

	private WebElement apply_Credit_Name;

	public WebElement apply_Credit_Name()

	{

		return apply_Credit_Name;

	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001AP_apply_key']")

	private WebElement Card_request_Submit_Apply;

	public WebElement Card_request_Submit_Apply()

	{

		return Card_request_Submit_Apply;

	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001AP_btn_reject']")

	private WebElement Card_request_Submit_Reject;

	public WebElement Card_request_Submit_Reject()

	{

		return Card_request_Submit_Reject;

	}

	@FindBy(xpath = "//span[text()='Approve']")

	private WebElement Card_request_Approve;

	public WebElement Card_request_Approve()

	{

		return Card_request_Approve;

	}

	@FindBy(xpath = "//input[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431MA_gs_ctscardStatusReasonVO.STATUS_IDEN']")
	private WebElement Idenfication_card_Approve;

	public WebElement Idenfication_card_Approve() {
		return Idenfication_card_Approve;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001P_Approve_key']")
	private WebElement Submit_cardIdenfication_card_Approve;

	public WebElement Submit_cardIdenfication_card_Approve() {
		return Submit_cardIdenfication_card_Approve;
	}

	// karthi_code_pageobject

//    	           @FindBy(xpath="//label[@id='cardsManagementMaintForm_G001M_Monitoring_key']")
//    	           private WebElement Submit_Monitoring_button_cards;
//    	           public WebElement Submit_Monitoring_button_cards() {
//    	         	  return Submit_Monitoring_button_cards;
//    	           }
	@FindBy(xpath = "//td[text()='Card Request']")
	private WebElement csm_CardRequest_Menu_7183;

	public WebElement csm_CardRequest_Menu_7183() {
		return csm_CardRequest_Menu_7183;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_closeSymbol;

	public WebElement CSMCorecloseSymbol() {
		return CSMCore_closeSymbol;
	}

	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement csm_CardsManagement_CardRequest_Apply_7183;

	public WebElement csm_CardsManagement_CardRequest_Apply_7183() {
		return csm_CardsManagement_CardRequest_Apply_7183;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001AP_gs_cardsMgtVO.CARD_TYPE']")
	private WebElement csm_CardsManagement_CardRequest_Apply_CardType_7183;

	public WebElement csm_CardsManagement_CardRequest_Apply_CardType_7183() {
		return csm_CardsManagement_CardRequest_Apply_CardType_7183;
	}

	@FindBy(xpath = "//span[text()='Activate']")
	private WebElement Activate_ChangeCardStatus;

	public WebElement Activate_ChangeCardStatus() {
		return Activate_ChangeCardStatus;
	}

	@FindBy(id = "lookuptxt_status_reason_G001AP")
	private WebElement csm_CardRequest_StatusReason_7183;

	public WebElement csm_CardRequest_StatusReason_7183() {
		return csm_CardRequest_StatusReason_7183;
	}

	@FindBy(xpath = "//span[text()='Monitoring']")
	private WebElement Monitoring_button_cards;

	public WebElement Monitoring_button_cards() {
		return Monitoring_button_cards;
	}

	@FindBy(xpath = "//span[text()='Unblock']")
	private WebElement Unblock_button_cards;

	public WebElement Unblock_button_cards() {
		return Unblock_button_cards;
	}

	@FindBy(xpath = "//span[text()='Block']")
	private WebElement Block_button_cards;

	public WebElement Block_button_cards() {
		return Block_button_cards;
	}

	@FindBy(xpath = "//span[text()='Issue']")
	private WebElement Issue_button_cards;

	public WebElement Issue_button_cards() {
		return Issue_button_cards;
	}

	@FindBy(xpath = "//label[text()='Apply ']")
	private WebElement csm_CardRequest_ApplyButton_7183;

	public WebElement csm_CardRequest_ApplyButton_7183() {
		return csm_CardRequest_ApplyButton_7183;
	}

	@FindBy(xpath = "//td[text()='Change Card Status']")
	private WebElement csm_ChangeCardStatus__7183;

	public WebElement csm_ChangeCardStatus__7183() {
		return csm_ChangeCardStatus__7183;
	}

	@FindBy(xpath = "//span[text()='Block']")
	private WebElement csm_ChangeCardStatus_Block_7183;

	public WebElement csm_ChangeCardStatus_Block_7183() {
		return csm_ChangeCardStatus_Block_7183;
	}

	@FindBy(xpath = "//span[text()='Unblock']")
	private WebElement csm_ChangeCardStatus_Unblock_7183;

	public WebElement csm_ChangeCardStatus_Unblock_7183() {
		return csm_ChangeCardStatus_Unblock_7183;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001K_gs_cardsMgtVO.CARD_TYPE']")
	private WebElement csm_ChangeCardStatus_Block_CardType7183;

	public WebElement csm_ChangeCardStatus_Block_CardType7183() {
		return csm_ChangeCardStatus_Block_CardType7183;
	}

	@FindBy(id = "td_cardsMgmtGridTbl_Id_G001K_1_ctsCardsVO.BRIEF_NAME_ENG")
	private WebElement csm_ChangeCardStatus__Block_Card_doubleclick7183;

	public WebElement csm_ChangeCardStatus__Block_Card_doubleclick7183() {
		return csm_ChangeCardStatus__Block_Card_doubleclick7183;
	}

	@FindBy(id = "lookuptxt_status_reason_G001K")
	private WebElement csm_CardRequest_ChangeCardStatus__Block_Card_StatusReason7183;

	public WebElement csm_CardRequest_ChangeCardStatus__Block_Card_StatusReason7183() {
		return csm_CardRequest_ChangeCardStatus__Block_Card_StatusReason7183;
	}

	@FindBy(id = "cardsManagementMaintForm_G001K_Block_btn_key")
	private WebElement csm_CardRequest_ChangeCardStatus__Block_Card_Blockbutton7183;

	public WebElement csm_CardRequest_ChangeCardStatus__Block_Card_Blockbutton7183() {
		return csm_CardRequest_ChangeCardStatus__Block_Card_Blockbutton7183;
	}

	// unblock
	@FindBy(xpath = "//span[text()='Unblock']")
	private WebElement csm_CardRequest_ChangeCardStatus__UnBlock_7183;

	public WebElement csm_CardRequest_ChangeCardStatus__UnBlock_7183() {
		return csm_CardRequest_ChangeCardStatus__UnBlock_7183;
	}

	@FindBy(id = "cardsMgmtGridTbl_Id_G001UK_gs_ctsCardsVO.BRIEF_NAME_ENG")
	private WebElement csm_CardRequest_ChangeCardStatus__UnBlock_CardName_7183;

	public WebElement csm_CardRequest_ChangeCardStatus__UnBlock_Card_7183() {
		return csm_CardRequest_ChangeCardStatus__UnBlock_CardName_7183;
	}

	@FindBy(id = "td_cardsMgmtGridTbl_Id_G001UK_1_ctsCardsVO.BRIEF_NAME_ENG")
	private WebElement csm_CardRequest_ChangeCardStatus__UnBlock_Card_doubleclick7183;

	public WebElement csm_CardRequest_ChangeCardStatus__UnBlock_Card_doubleclick7183() {
		return csm_CardRequest_ChangeCardStatus__UnBlock_Card_doubleclick7183;
	}

	@FindBy(id = "lookuptxt_status_reason_G001UK")
	private WebElement csm_CardRequest_ChangeCardStatus__UnBlock_Card_statusReason7183;

	public WebElement csm_CardRequest_ChangeCardStatus__UnBlock_Card_statusReason7183() {
		return csm_CardRequest_ChangeCardStatus__UnBlock_Card_statusReason7183;
	}

	@FindBy(id = "cardsManagementMaintForm_G001UK_UnBlock_key")
	private WebElement csm_CardRequest_ChangeCardStatus__UnBlock_Card_unblockbutton7183;

	public WebElement csm_CardRequest_ChangeCardStatus__UnBlock_Card_unblockbutton7183() {
		return csm_CardRequest_ChangeCardStatus__UnBlock_Card_unblockbutton7183;
	}

	// Approve
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement csm_CardRequest_ApproveScreen_7183;

	public WebElement csm_CardRequest_ApproveScreen_7183() {
		return csm_CardRequest_ApproveScreen_7183;
	}

	@FindBy(id = "cardsMgmtGridTbl_Id_G001P_gs_cardsMgtVO.CARD_TYPE")
	private WebElement csm_CardRequest_ApproveScreen_CardType_7183;

	public WebElement csm_CardRequest_ApproveScreen_CardType_7183() {
		return csm_CardRequest_ApproveScreen_CardType_7183;
	}

	@FindBy(id = "td_cardsMgmtGridTbl_Id_G001P_1_cardsMgtVO.CARD_TYPE")
	private WebElement csm_CardRequest_ApproveScreen_CardName_DoubleClick_7183;

	public WebElement csm_CardRequest_ApproveScreen_CardName_DoubleClick_7183() {
		return csm_CardRequest_ApproveScreen_CardName_DoubleClick_7183;
	}

	@FindBy(id = "lookuptxt_status_reason_G001P")
	private WebElement csm_CardRequest_ApproveScreen_StatusReason_7183;

	public WebElement csm_CardRequest_ApproveScreen_StatusReason_7183() {
		return csm_CardRequest_ApproveScreen_StatusReason_7183;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement csm_CardRequest_ApproveScreen_ApproveButton_7183;

	public WebElement csm_CardRequest_ApproveScreen_ApproveButton_7183() {
		return csm_CardRequest_ApproveScreen_ApproveButton_7183;
	}

	// karthi page object 60 sprint
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

	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey() {

		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;
	}

	@FindBy(xpath = "//span[text()='Hot']")
	private WebElement Hot_cards_button_alert;

	public WebElement Hot_cards_button_alert() {

		return Hot_cards_button_alert;
	}

	@FindBy(xpath = "//span[text()='Cancel'] ")
	private WebElement Cancel_cards_button_alert;

	public WebElement Cancel_cards_button_alert() {

		return Cancel_cards_button_alert;
	}

	@FindBy(xpath = "//span[text()='Destroy']")
	private WebElement Destroy_cards_button_alert;

	public WebElement Destroy_cards_button_alert() {

		return Destroy_cards_button_alert;
	}

	@FindBy(xpath = "//span[text()='Monitoring']")
	private WebElement CardManagement_ChangeCardStatus_Monitorfield;

	public WebElement CardManagement_ChangeCardStatus_Monitorfield() {

		return CardManagement_ChangeCardStatus_Monitorfield;
	}

	@FindBy(xpath = "//span[text()='Deactivate']")
	private WebElement CardManagement_ChangeCardStatus_deactivatefield;

	public WebElement CardManagement_ChangeCardStatus_deactivatefield() {

		return CardManagement_ChangeCardStatus_deactivatefield;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001N_gs_cardsMgtVO.CARD_TYPE']")
	private WebElement Card_type_button_alert;

	public WebElement Card_type_button_alert() {

		return Card_type_button_alert;
	}

	@FindBy(xpath = "//span[text()='Unblock']")
	private WebElement Unblock_cards_button_alert;

	public WebElement Unblock_cards_button_alert() {
		return Unblock_cards_button_alert;
	}

	@FindBy(xpath = "//span[text()='Block']")
	private WebElement Block_cards_button_alert;

	public WebElement Block_cards_button_alert() {
		return Block_cards_button_alert;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001UK_UnBlock_key']")
	private WebElement ChangeCardStatus_UnBlock_UnblockButton;

	public WebElement ChangeCardStatus_UnBlock_UnblockButton() {
		return ChangeCardStatus_UnBlock_UnblockButton;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001M_Monitoring_key']")
	private WebElement ChangeCardStatus_UnBlock_monitorButton;

	public WebElement ChangeCardStatus_UnBlock_monitorButton() {
		return ChangeCardStatus_UnBlock_monitorButton;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001T_Deactivate_key']")
	private WebElement ChangeCardStatus_UnBlock_deactivateButton;

	public WebElement ChangeCardStatus_UnBlock_deactivateButton() {
		return ChangeCardStatus_UnBlock_deactivateButton;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001N_Cancel_key']")
	private WebElement Submit_cancel_button_alert;

	public WebElement Submit_cancel_button_alert() {

		return Submit_cancel_button_alert;
	}// label[@id='cardsManagementMaintForm_G001H_Hot_key']

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001H_Hot_key']")
	private WebElement Submit_Hot_button_alert;

	public WebElement Submit_Hot_button_alert() {

		return Submit_cancel_button_alert;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001T_Deactivate_key']")
	private WebElement Submit_Deactivate_button_alert;

	public WebElement Submit_Deactivate_button_alert() {

		return Submit_Deactivate_button_alert;
	}

	@FindBy(xpath = "//input[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431MA_gs_ctscardStatusReasonVO.STATUS_IDEN']")
	private WebElement CardsStatusReason_UPA_identification;

	public WebElement CardsStatusReason_UPA_identification() {
		return CardsStatusReason_UPA_identification;
	}

	@FindBy(xpath = "//table[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431MA']")
	private WebElement CardsStatusReason_UPA_identification_DoubleClick;

	public WebElement CardsStatusReason_UPA_identification_DoubleClick() {
		return CardsStatusReason_UPA_identification_DoubleClick;
	}

	@FindBy(xpath = "//td[text()='Cards Status Reason']")
	private WebElement Cards_Status_Reason_Param;

	public WebElement Cards_Status_Reason_Param() {
		return Cards_Status_Reason_Param;
	}

	@FindBy(xpath = "//td[text()='Card']")
	private WebElement Cards__Param_Reason;

	public WebElement Cards__Param_Reason() {
		return Cards__Param_Reason;
	}

	@FindBy(xpath = "//input[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431MA_gs_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Description_card_Param;

	public WebElement Description_card_Param() {
		return Description_card_Param;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']//parent::a[@id='P00431MA']")
	private WebElement UpdateAfterApprove_Cards;

	public WebElement UpdateAfterApprove_Cards() {
		return UpdateAfterApprove_Cards;
	}

	@FindBy(xpath = "//td[@id='td_cardsStatusReasonCardsList_GridTbl_Id_P00431MA_1_ctscardStatusReasonVO.STATUS_ENG_DESC']")
	private WebElement Doubleclick_Cards_Status_Reason_Param_Deactivate;

	public WebElement Doubleclick_Cards_Status_Reason_Param_Deactivate() {
		return Doubleclick_Cards_Status_Reason_Param_Deactivate;
	}

	@FindBy(xpath = "//td[@id='td_cardsStatusReasonCardsList_GridTbl_Id_P00431MA_3_ctscardStatusReasonVO.STATUS_AR_DESC']")
	private WebElement Doubleclick_Cards_Status_Reason_Param_Cancel;

	public WebElement Doubleclick_Cards_Status_Reason_Param_Cancel() {
		return Doubleclick_Cards_Status_Reason_Param_Cancel;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trxtype_P00431MA']")
	private WebElement Trx_Type_cards;

	public WebElement Trx_Type_cards() {
		return Trx_Type_cards;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_charges_P00431MA']")
	private WebElement Charges_schema_cards;

	public WebElement Charges_schema_cards() {
		return Charges_schema_cards;
	}

	@FindBy(xpath = "//label[@id='cardsStatusReasonCardsMaint_FormId_P00431MA_Card_Type_key']")
	private WebElement Card_type_cards;

	public WebElement Card_type_cards() {
		return Card_type_cards;
	}

	@FindBy(xpath = "//td[@id='add_cardsAccountDetailsGridTbl_Id_G001MT']")
	private WebElement Add_Button_Card_type_cards;

	public WebElement Add_Button_Card_type_cards() {
		return Add_Button_Card_type_cards;
	}

	@FindBy(xpath = "//td[@id='td_cardsAccountDetailsGridTbl_Id_G001MT_1_accountVO.ACC_BR']")
	private WebElement Add_Button_Card_type_cards_click_the_record_to_access;

	public WebElement Add_Button_Card_type_cards_click_the_record_to_access() {
		return Add_Button_Card_type_cards_click_the_record_to_access;
	}

	@FindBy(xpath = "//span[text()='Ok']//parent::button[@id='ok_btn_1_P00431MA']")
	private WebElement CardsType_Ok_btn;

	public WebElement CardsType_Ok_btn() {
		return CardsType_Ok_btn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctscardStatusReasonCardtpVO.CARD_TYPE']")
	private WebElement CardsstatusReason_Cards_CardsType;

	public WebElement CardsstatusReason_Cards_CardsType() {
		return CardsstatusReason_Cards_CardsType;
	}

	@FindBy(xpath = "//label[@id='cardsStatusReasonCardsMaint_FormId_P00431MA_Update_After_Approve_key']")
	private WebElement cards_Update_after_aprroveButton;

	public WebElement cards_Update_after_aprroveButton() {
		return cards_Update_after_aprroveButton;
	}

	@FindBy(xpath = "//span[text()='Approve']//parent::a[@id='P00431P']")
	private WebElement Cards_Approve_field;

	public WebElement Cards_Approve_field() {
		return Cards_Approve_field;
	}

	@FindBy(xpath = "//input[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431P_gs_ctscardStatusReasonVO.STATUS_IDEN']")
	private WebElement cards_approve_Identificationcode;

	public WebElement cards_approve_Identificationcode() {
		return cards_approve_Identificationcode;
	}

	@FindBy(xpath = "//td[text()='Cards Management']")
	private WebElement CSMCore_CardManagement;

	public WebElement CSMCore_CardManagement() {
		return CSMCore_CardManagement;
	}

	@FindBy(xpath = "//td[text()='Change Card Status']")
	private WebElement CSMCore_CardManagement_changeCardStatus;

	public WebElement CSMCore_CardManagement_changeCardStatus() {
		return CSMCore_CardManagement_changeCardStatus;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001K_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdForBlock;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdForBlock() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationIdForBlock;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001UK_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdUnBlock;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdUnBlock() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationIdUnBlock;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001M_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdMonitor;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdMonitor() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationIdMonitor;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001T_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdDeactivate;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdDeactivate() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationIdDeactivate;
	}

	@FindBy(xpath = "//input[@name='cardsManagementCO.cardsMgtVO.APPLICATION_ID']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdUnBlock_GetApplicationId;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdUnBlock_GetApplicationId() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationIdUnBlock_GetApplicationId;
	}

	@FindBy(xpath = "//table[@id='cardsMgmtGridTbl_Id_G001K']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick;
	}

	@FindBy(xpath = "//input[@name='cardsManagementCO.cardsMgtVO.STATUS_REASON']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_StatusReason;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_StatusReason() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationId_StatusReason;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001K_Block_btn_key']")
	private WebElement CSMCore_CardManagement_changeCardStatus_BlockBtnKey;

	public WebElement CSMCore_CardManagement_changeCardStatus_BlockBtnKey() {
		return CSMCore_CardManagement_changeCardStatus_BlockBtnKey;
	}

	@FindBy(xpath = "//table[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431P']")
	private WebElement cardStatusReason_Approve_DoubleClick;

	public WebElement cardStatusReason_Approve_DoubleClick() {
		return cardStatusReason_Approve_DoubleClick;
	}

	@FindBy(xpath = "//label[@id='cardsStatusReasonCardsMaint_FormId_P00431P_Approve_key']")
	private WebElement cardStatusReason_Approve_Button;

	public WebElement cardStatusReason_Approve_Button() {
		return cardStatusReason_Approve_Button;
	}

	@FindBy(xpath = "//td[@id='td_tab7_GridTbl_Id_P00431MA_1_ctscardStatusReasonCardtpVO.CARD_TYPE']")
	private WebElement cardType_DataExistOrNot;

	public WebElement cardType_DataExistOrNot() {
		return cardType_DataExistOrNot;
	}

	@FindBy(xpath = " //td[@id='del_tab7_GridTbl_Id_P00431MA']")
	private WebElement cardType__deleteButton;

	public WebElement cardType__deleteButton() {
		return cardType__deleteButton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}

	@FindBy(xpath = "//td[text()='Clear']")
	private WebElement CSM_clearbutton;

	public WebElement CSM_clearbutton() {
		return CSM_clearbutton;
	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo;

	public WebElement BMUserAlertEnterTRXNo() {
		return BMUser_Alert_EnterTRXNo;
	}

	// cancel
	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement CardManagement_ChangeCardStatus_cancelfield;

	public WebElement CardManagement_ChangeCardStatus_cancelfield() {

		return CardManagement_ChangeCardStatus_cancelfield;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001N_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdCancel;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdCancel() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationIdCancel;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001N_Cancel_key']")
	private WebElement ChangeCardStatus_UnBlock_cancelButton;

	public WebElement ChangeCardStatus_UnBlock_cancelButton() {
		return ChangeCardStatus_UnBlock_cancelButton;
	}

	// HOT
	@FindBy(xpath = "//span[text()='Hot']")
	private WebElement CardManagement_ChangeCardStatus_Hotfield;

	public WebElement CardManagement_ChangeCardStatus_Hotfield() {

		return CardManagement_ChangeCardStatus_Hotfield;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001H_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdHot;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdHot() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationIdHot;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001H_Hot_key']")
	private WebElement ChangeCardStatus_HotButton;

	public WebElement ChangeCardStatus_HotButton() {
		return ChangeCardStatus_HotButton;
	}

	// Destroy
	@FindBy(xpath = "//span[text()='Destroy']")
	private WebElement CardManagement_ChangeCardStatus_Destroyfield;

	public WebElement CardManagement_ChangeCardStatus_Destroyfield() {

		return CardManagement_ChangeCardStatus_Destroyfield;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001DY_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdDestroy;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdDestroy() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationIdDestroy;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001DY_destroy_key']")
	private WebElement ChangeCardStatus_DestroyButton;

	public WebElement ChangeCardStatus_DestroyButton() {
		return ChangeCardStatus_DestroyButton;
	}

	@FindBy(xpath = "//td[text()='Card Request']")
	private WebElement Card_Request;

	public WebElement Card_Request() {
		return Card_Request;
	}

	@FindBy(xpath = " //label[@id='cardsManagementMaintForm_G001P_btn_reject']")
	private WebElement Final_Reject;

	public WebElement Final_Reject() {
		return Final_Reject;
	}

	@FindBy(xpath = "//td[@title='560'][1]")
	private WebElement Double_click_button_cards_CSM_Reject;

	public WebElement Double_click_button_cards_CSM_Reject() {
		return Double_click_button_cards_CSM_Reject;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001P_gs_cardsMgtVO.CARD_TYPE']")

	private WebElement Card_request_ApproveCardTYpe;

	public WebElement Card_request_ApproveCardTYpe()

	{

		return Card_request_ApproveCardTYpe;

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

	@FindBy(xpath = "//input[@id='lookuptxt_status_reason_G001MT']")
	private WebElement CSM_Status_reason_code_value;

	public WebElement CSM_Status_reason_code_value() {
		return CSM_Status_reason_code_value;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_card_type_G001MT']")
	private WebElement CSM_Card_Type_Management;

	public WebElement CSM_Card_Type_Management() {
		return CSM_Card_Type_Management;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cif_G001MT']")
	private WebElement CIF_Number_CSM_Cards_Management;

	public WebElement CIF_Number_CSM_Cards_Management() {
		return CIF_Number_CSM_Cards_Management;
	}

	@FindBy(xpath = "//li[@id='cardsAccountDetails_G001MT']")
	private WebElement Account_Details_CSM_Cards_management;

	public WebElement Account_Details_CSM_Cards_management() {
		return Account_Details_CSM_Cards_management;
	}

	@FindBy(xpath = "//td[@id='add_cardsAccountDetailsGridTbl_Id_G001MT']")
	private WebElement Add_Button_cards_Management;

	public WebElement Add_Button_cards_Management() {
		return Add_Button_cards_Management;
	}

	@FindBy(xpath = "//td[@id='td_cardsAccountDetailsGridTbl_Id_G001MT_1_accountVO.ACC_BR']//input")
	private WebElement Branch_code_cards_Management;

	public WebElement Branch_code_cards_Management() {
		return Branch_code_cards_Management;
	}

	@FindBy(xpath = "//td[@id='td_cardsAccountDetailsGridTbl_Id_G001MT_1_accountVO.ACC_CY']//input")
	private WebElement Currency_Code_cards_Management;

	public WebElement Currency_Code_cards_Management() {
		return Currency_Code_cards_Management;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement updateAfterApprove_User_Param;

	public WebElement updateAfterApprove_User_Param() {
		return updateAfterApprove_User_Param;
	}

	// td[@id='td_cardsAccountDetailsGridTbl_Id_G001MT_1_accountVO.ACC_GL']

	@FindBy(xpath = "//td[@id='td_cardsAccountDetailsGridTbl_Id_G001MT_1_accountVO.ACC_GL']//input")
	private WebElement Cards_GL_number_CSM;

	public WebElement Cards_GL_number_CSM() {
		return Cards_GL_number_CSM;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_accountVO.ACC_SL']")
	private WebElement Cards_Serial_number_CSM;

	public WebElement Cards_Serial_number_CSM() {
		return Cards_Serial_number_CSM;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement CSM_OkButtonInWarningPopUpToGoBackToMaintenance;

	public WebElement CSMOkButtonInWarningPopUpToGoBackToMaintenance() {
		return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
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

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement approve_Btn_TransactionType;

	public WebElement approve_Btn_TransactionType() {
		return approve_Btn_TransactionType;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenance_CSM_Application_cards;

	public WebElement Maintenance_CSM_Application_cards() {
		return Maintenance_CSM_Application_cards;
	}

	@FindBy(xpath = "//input[@id='idTypesParamList_GridTbl_Id_P0034MA_gs_idTypesVO.CODE']")
	private WebElement Id_type_code_update_after;

	public WebElement Id_type_code_update_after() {
		return Id_type_code_update_after;
	}

	@FindBy(xpath = "//td[@id='td_idTypesParamList_GridTbl_Id_P0034MA_1_idTypesVO.CODE']")
	private WebElement Double_click_Id_type_code_update_after;

	public WebElement Double_click_Id_type_code_update_after() {
		return Double_click_Id_type_code_update_after;
	}

	@FindBy(xpath = "//select[@name='idtypesparamCO.idTypesVO.UNIQUENESS']")
	private WebElement Uniqueness_ID_type_Param;

	public WebElement Uniqueness_ID_type_Param() {
		return Uniqueness_ID_type_Param;
	}

	@FindBy(xpath = "//input[@name='idtypesparamCO.idTypesVO.EXPIRY_DAYS']")
	private WebElement Expiry_Day_ID_type_CIF_Param;

	public WebElement Expiry_Day_ID_type_CIF_Param() {
		return Expiry_Day_ID_type_CIF_Param;
	}

	@FindBy(xpath = "//input[@name='idtypesparamCO.idTypesVO.EXPIRY_SUSPEND_REASON']")
	private WebElement ID_Expiry_Day_ID_type_CIF_Param;

	public WebElement ID_Expiry_Day_ID_type_CIF_Param() {
		return ID_Expiry_Day_ID_type_CIF_Param;
	}

	@FindBy(xpath = "//input[@name='idtypesparamCO.idTypesVO.ENABLE_MCR']")
	private WebElement Enable_Magnetic_Check_flag_card_ID_type_CIF_Param;

	public WebElement Enable_Magnetic_Check_flag_card_ID_type_CIF_Param() {
		return Enable_Magnetic_Check_flag_card_ID_type_CIF_Param;
	}

	@FindBy(xpath = "//input[@name='idtypesparamCO.idTypesVO.FROM_LEN']")
	private WebElement ID_Length_From_Number_CIF_Number;

	public WebElement ID_Length_From_Number_CIF_Number() {
		return ID_Length_From_Number_CIF_Number;
	}

	@FindBy(xpath = "//input[@name='idtypesparamCO.idTypesVO.TO_LEN']")
	private WebElement ID_Length_To_Number_CIF_Number;

	public WebElement ID_Length_To_Number_CIF_Number() {
		return ID_Length_To_Number_CIF_Number;
	}

	@FindBy(xpath = "//input[@name='idtypesparamCO.idTypesVO.ID_TYPE_SWIFT_CODE']")
	private WebElement Swift_code_number_CIF_Number;

	public WebElement Swift_code_number_CIF_Number() {
		return Swift_code_number_CIF_Number;
	}

	@FindBy(xpath = "//td[text()='CIF Parameters']")
	private WebElement CIF_Parameters_Parameters;

	public WebElement CIF_Parameters_Parameters() {
		return CIF_Parameters_Parameters;
	}

	@FindBy(xpath = "//td[text()='ID Types']")
	private WebElement ID_Type_CIF_Parameters_Parameters;

	public WebElement ID_Type_CIF_Parameters_Parameters() {
		return ID_Type_CIF_Parameters_Parameters;
	}

	@FindBy(xpath = "//input[@id='idTypesParamList_GridTbl_Id_P0034P_gs_idTypesVO.CODE']")
	private WebElement Approve_Code_ID_type_CIF_param;

	public WebElement Approve_Code_ID_type_CIF_param() {
		return Approve_Code_ID_type_CIF_param;
	}

	@FindBy(xpath = "//td[@id='td_idTypesParamList_GridTbl_Id_P0034P_1_idTypesVO.CODE']")
	private WebElement Double_click_approve_code_CIF_Parameters_Parameters;

	public WebElement Double_click_approve_code_CIF_Parameters_Parameters() {
		return Double_click_approve_code_CIF_Parameters_Parameters;
	}

	@FindBy(xpath = "//label[@id='idTypesParamMaint_FormId_P0034P_Approve_key']")
	private WebElement Submit_approve_CIF_Parameters_Parameters;

	public WebElement Submit_approve_CIF_Parameters_Parameters() {
		return Submit_approve_CIF_Parameters_Parameters;
	}

	@FindBy(xpath = "//span[text()='Apply to Submit']")
	private WebElement Apply_To_submit_CSM_Param;

	public WebElement Apply_To_submit_CSM_Param() {
		return Apply_To_submit_CSM_Param;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement Cheque_Code_Apply_submit_code;

	public WebElement Cheque_Code_Apply_submit_code() {
		return Cheque_Code_Apply_submit_code;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000TR_applySubmit_key']")
	private WebElement Submit_Apply_To_Submit;

	public WebElement Submit_Apply_To_Submit() {
		return Submit_Apply_To_Submit;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement Cheque_Book_CSM_Average;

	public WebElement Cheque_Book_CSM_Average() {
		return Cheque_Book_CSM_Average;
	}

	@FindBy(xpath = "//select[@id='types_P0034MA']")
	private WebElement CivilID_Type_IDtype;

	public WebElement CivilID_Type_IDtype() {
		return CivilID_Type_IDtype;
	}

	@FindBy(xpath = "//select[@id='id_card_type_P0034MA']")
	private WebElement IDCardType_IDtype;

	public WebElement IDCardType_IDtype() {
		return IDCardType_IDtype;
	}

	@FindBy(xpath = "//input[@id='effective_date_G001MT']")
	private WebElement EffectiveDate_Card_Management;

	public WebElement EffectiveDate_Card_Management() {
		return EffectiveDate_Card_Management;
	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001P_1_cardsMgtVO.CARD_TYPE']")
	private WebElement Doubleclick_cards_approve;

	public WebElement Doubleclick_cards_approve() {
		return Doubleclick_cards_approve;
	}

	@FindBy(xpath = "//div[@id='lookupid_status_reason_G001AP']//input")
	private WebElement csm_CardRequest__Apply_StatusReason_7183;

	public WebElement csm_CardRequest__Apply_StatusReason_7183() {
		return csm_CardRequest__Apply_StatusReason_7183;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001N_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSM_Card_ID_cards_Cancel;

	public WebElement CSM_Card_ID_cards_Cancel() {
		return CSM_Card_ID_cards_Cancel;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001RE_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSM_Card_ID_cards_Replace;

	public WebElement CSM_Card_ID_cards_Replace() {
		return CSM_Card_ID_cards_Replace;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001T_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSM_Application_ID_cards_deactivate;

	public WebElement CSM_Application_ID_cards_deactivate() {
		return CSM_Application_ID_cards_deactivate;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_status_reason_G001T']")
	private WebElement Status_Reason_cards_deactivate;

	public WebElement Status_Reason_cards_deactivate() {
		return Status_Reason_cards_deactivate;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_status_reason_G001N']")
	private WebElement Status_Reason_cards_cancel;

	public WebElement Status_Reason_cards_cancel() {
		return Status_Reason_cards_cancel;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_status_reason_G001H']")
	private WebElement Status_Reason_cards_Hot;

	public WebElement Status_Reason_cards_Hot() {
		return Status_Reason_cards_Hot;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_status_reason_G001DY']")
	private WebElement Status_Reason_cards_Destroy;

	public WebElement Status_Reason_cards_Destroy() {
		return Status_Reason_cards_Destroy;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_status_reason_G001RE']")
	private WebElement Status_Reason_cards_Replace;

	public WebElement Status_Reason_cards_Replace() {
		return Status_Reason_cards_Replace;
	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001RE_1_cardsMgtVO.APPLICATION_ID']")
	private WebElement Double_click_button_cards_CSM_Replace;

	public WebElement Double_click_button_cards_CSM_Replace() {
		return Double_click_button_cards_CSM_Replace;
	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001AP_1_cardsMgtVO.APPLICATION_ID']")
	private WebElement Double_click_button_cards_CSM_Apply;

	public WebElement Double_click_button_cards_CSM_Apply() {
		return Double_click_button_cards_CSM_Apply;
	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001H_1_cardsMgtVO.APPLICATION_ID']")
	private WebElement Double_click_button_cards_CSM_Hot;

	public WebElement Double_click_button_cards_CSM_Hot() {
		return Double_click_button_cards_CSM_Hot;
	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001DY_1_cardsMgtVO.APPLICATION_ID']]")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_Destroy;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_Destroy() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationId_DoubleClick_Destroy;
	}

	@FindBy(xpath = "//td[@id='td_cardsMgmtGridTbl_Id_G001N_1_cardsMgtVO.APPLICATION_ID']")
	private WebElement Double_click_button_cardsStatusReason_CSM_Cancel;

	public WebElement Double_click_button_cardsStatusReason_CSM_Cancel() {
		return Double_click_button_cardsStatusReason_CSM_Cancel;
	}

	@FindBy(xpath = "//input[@id='cardsStatusReasonCardsList_GridTbl_Id_P00431P_gs_ctscardStatusReasonVO.STATUS_IDEN']")
	private WebElement ApproveCode_approve_cards;

	public WebElement ApproveCode_approve_cards() {
		return ApproveCode_approve_cards;
	}

	@FindBy(xpath = "//label[@id='cardsStatusReasonCardsMaint_FormId_P00431P_Approve_key']")
	private WebElement cardStatusReason_ApproveField_Approve_Button;

	public WebElement cardStatusReason_ApproveField_Approve_Button() {
		return cardStatusReason_ApproveField_Approve_Button;
	}

	@FindBy(xpath = "//input[@id='alertsGrid_Id_D001MT_gs_alertsParamCO.userId']")
	private WebElement Alert_Enter_UserId;

	public WebElement Alert_Enter_UserId() {
		return Alert_Enter_UserId;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001MT_Save_key']")
	private WebElement Savebox_Cards;

	public WebElement Savebox_Cards() {
		return Savebox_Cards;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Code_Transaction_typer;

	public WebElement Code_Transaction_typer() {
		return Code_Transaction_typer;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001H_gs_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSM_Card_ID_cards_Hot;

	public WebElement CSM_Card_ID_cards_Hot() {
		return CSM_Card_ID_cards_Hot;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Code_Transaction_typer_Approve;

	public WebElement Code_Transaction_typer_Approve() {
		return Code_Transaction_typer_Approve;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csm_CardRequest_OkButton;

	public WebElement csm_CardRequest_OkButton() {
		return csm_CardRequest_OkButton;
	}

	@FindBy(xpath = "//input[@id='application_id_G001K']")
	private WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdBlock_GetApplicationId;

	public WebElement CSMCore_CardManagement_changeCardStatus_ApplicationIdBlock_GetApplicationId() {
		return CSMCore_CardManagement_changeCardStatus_ApplicationIdBlock_GetApplicationId;
	}

	@FindBy(xpath = " //td[@id='td_cardsMgmtGridTbl_Id_G001DY_1_cardsMgtVO.APPLICATION_ID']")
	private WebElement CSMCore_CardManagement_changeCardStatus_Destroy_ApplicationId_DoubleClick;

	public WebElement CSMCore_CardManagement_changeCardStatus_Destroy_ApplicationId_DoubleClick() {
		return CSMCore_CardManagement_changeCardStatus_Destroy_ApplicationId_DoubleClick;
	}

	@FindBy(xpath = "//button[@id='cardMgnt_Replace_G001RE']")
	private WebElement Submit_Replace_button_alert;

	public WebElement Submit_Replace_button_alert() {
		return Submit_Replace_button_alert;
	}

}
