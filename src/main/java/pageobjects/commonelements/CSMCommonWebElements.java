package pageobjects.commonelements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMCommonWebElements {
	WebDriver driver;
// initialize driver , web elements
	public CSMCommonWebElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// below all annotation return web element
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

	@FindBy(xpath = "//center//input[@value='Ok']")
	private WebElement csm_OkButton;

	public WebElement csmOkButton() {
		return csm_OkButton;
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

	@FindBy(xpath = "//button[@id='snoozeRcvAlertBtn_RCVALERT']")
	private WebElement alert_snoozeButton;

	public WebElement alertSnoozeButton() {
		return alert_snoozeButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Access Denied')]//parent::div//following-sibling::div//div[contains(text(),'You Have No Access To Use Accounts Related To This CIF')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement csm_AccountRestrictedPopup;

	public WebElement csmAccountRestrictedPopup() {
		return csm_AccountRestrictedPopup;
	}
	@FindBy(xpath = "//div[contains(text(),'Please wait while server request completes')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement serverRequestPopupOkButton;

	public WebElement serverRequestPopupOkButton() {
		return serverRequestPopupOkButton;
	}
	
	@FindBy(xpath = "//a[contains(text(),' Search ')]")
	private WebElement csm_SearchButton;
	public WebElement csmSearchButton() {
		return csm_SearchButton;
	}
	
	@FindBy(xpath="//div[contains(text(),'Saved Successfully')]/ancestor::div//following-sibling::center//input")
	private WebElement sads_SaveSuccessOkButton;
	public WebElement sadsSaveSuccessOkButton() {
		return sads_SaveSuccessOkButton;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Approve ')]//ancestor::button")
	private WebElement csm_ApproveBtnWithLabel;
	public WebElement csmApproveBtnWithLabel() {
		return csm_ApproveBtnWithLabel;
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


	
	// Alert box
		@FindBy(xpath = "//span[text()='Alerts']/parent::div")
		private WebElement alertBox;

		public WebElement alertBox() {
			return alertBox;
		}

		// Alert box close button
		@FindBy(xpath = "//span[text()='close']/parent::a")
		private WebElement alertBox_CloseButton;

		public WebElement alertBox_CloseButton() {
			return alertBox_CloseButton;
		}

		// Alert box snooze button
		@FindBy(xpath = "//button[@id='snoozeRcvAlertBtn_RCVALERT']/span")
		private WebElement alertBox_SnoozeButton;

		public WebElement alertBox_SnoozeButton() {
			return alertBox_SnoozeButton;
		}

		// Alert box calendar button
		@FindBy(xpath = "//form[@id='TrsAckTOutAlertForm_RCVALERT']/descendant::img")
		private WebElement alertBox_CalendarButton;

		public WebElement alertBox_CalendarButton() {
			return alertBox_CalendarButton;
		}

		// Alert box calendar hours slider
		@FindBy(xpath = "//dd[@id='ui_tpicker_hour_dateTime_RCVALERT']/a")
		private WebElement alertBox_HoursSlider;

		public WebElement alertBox_HoursSlider() {
			return alertBox_HoursSlider;
		}

		// Alert box calendar choose time, done button
		@FindBy(xpath = "//button[text()='Done']")
		private WebElement alertBox_ChooseTimeDoneButton;

		public WebElement alertBox_ChooseTimeDoneButton() {
			return alertBox_ChooseTimeDoneButton;
		}
		
		@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
		private WebElement CSM_UseButtonInChangeRunningDate;

		public WebElement CSMUseButtonInChangeRunningDate() {
			return CSM_UseButtonInChangeRunningDate;
		}
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

		public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
			return csmOkButtonForConfirmationPopUpForCompanyHoliday;
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
		
		@FindBy(xpath = "//span[text()='close']")
		private WebElement CSMCore_closeSymbol_609;

		public WebElement CSMCore_closeSymbol_609() {
			return CSMCore_closeSymbol_609;
		}
		
		@FindBy(xpath="//div[contains(text(),'is a Staff Member')]//parent::div//following-sibling::center//input")
		private  WebElement staffMemberPopupOkButton;
		public WebElement staffMemberPopupOkButton()
		{
			return staffMemberPopupOkButton;
		}
		
		@FindBy(xpath = "//div[contains(text(),'Confirm Delete Process')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement csm_Delete_ConfirmationOkButton;

		public WebElement csmDeleteConfirmationOkButton() {
			return csm_Delete_ConfirmationOkButton;
		}

		@FindBy(xpath = "//input[@name='USER_ID']")
		private WebElement csmAlertUserNameInput;

		public WebElement csmAlertUserNameInput() {
			return csmAlertUserNameInput;
		}

		@FindBy(xpath = "//a[contains(@id,'sendBut_')]")
		private WebElement csmAlertSendButton;

		public WebElement csmAlertSendButton() {
			return csmAlertSendButton;
		}

		@FindBy(id = "openBut_RCVALERT")
		private WebElement csmOpenItemsButton;

		public WebElement csmOpenItemButton() {
			return csmOpenItemsButton;
		}

		@FindBy(id = "alertsOpenItemApprove_RCVALERT")
		private WebElement csmAlertApproveButton;

		public WebElement csmAlertApproveButton() {
			return csmAlertApproveButton;
		}

		@FindBy(xpath = "//span[@id='ui-dialog-title-receive_alert_div']")
		private WebElement csmAlertVisibilityCheck;

		public WebElement csmAlertVisibilityCheck() {
			return csmAlertVisibilityCheck;
		}
		
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
		
		@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
		private WebElement Transactions_Maintenance_SaveBtn;
		public WebElement Transactions_Maintenance_SaveBtn() {
			return Transactions_Maintenance_SaveBtn;
		}
		
		@FindBy(xpath = "(//div[@id='trxMgmtToolBar_D001AU']//button)[1]")
		private WebElement Transactions_ApproveScreen_Approve;
		public WebElement Transactions_ApproveScreen_Approve() {
			return Transactions_ApproveScreen_Approve;
		}
		
		@FindBy(xpath = "//label[@id='language_key']")
		private WebElement languageIcon;
		public WebElement languageIcon() {
			return languageIcon;
		}
		
		// arabic
		@FindBy(xpath = "//a[@id='ar']")
		private WebElement arabicLanguage;
		public WebElement arabicLanguage() {
			return arabicLanguage;
		}
		// English
		@FindBy(xpath = "//a[@id='en']")
		private WebElement englishLanguage;
		public WebElement englishLanguage() {
			return englishLanguage;
		}
		
		// persian
		@FindBy(xpath = "//a[@id='fa']")
		private WebElement persianLanguage;
		public WebElement persianLanguage() {
			return persianLanguage;
		}
		
		// french
		@FindBy(xpath = "//a[@id='fr']")
		private WebElement frenchLanguage;

		public WebElement frenchLanguage() {
			return frenchLanguage;
		}
		
		//Russian
		@FindBy(xpath = "//a[@id='ru']")
		private WebElement russianLanguage;

		public WebElement russianLanguage() {
			return russianLanguage;
		}
		
		//Turkish
		
		@FindBy(xpath = "//a[@id='tk']")
		private WebElement turkishLanguage;

		public WebElement turkishLanguage() {
			return turkishLanguage;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement CSM_Confirm_Yes;
		public WebElement CSM_Confirm_Yes() {
			return CSM_Confirm_Yes;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
		private WebElement CSM_Confirm_No;
		public WebElement CSM_Confirm_No() {
			return CSM_Confirm_No;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
		private WebElement CSM_Confirm_Cancel;
		public WebElement CSM_Confirm_Cancel() {
			return CSM_Confirm_Cancel;
		}
		
		@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn;
	}

		@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn;

	public WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn() {
		return Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn;
	}

	@FindBy(id="alertsOpenItemReject_RCVALERT")
		private WebElement csmAlertRejectButton;

		public WebElement csmAlertRejectButton() {
			return csmAlertRejectButton;
		}
		
		@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']//div[@class='jMsgbox-contentWrap']")
		private WebElement getPopupMessageText;

		public WebElement getPopupMessageText() {
			return getPopupMessageText;
		}

	    @FindBy(xpath = "//a[@class='tbClose']//parent::td//following-sibling::td//span")
		private List<WebElement> closeAllTab;
	 
		public List<WebElement> closeAllTab() {
			return closeAllTab;
		}
			
		@FindBy(id="dateTime_RCVALERT")
		private WebElement timeOut;

		public WebElement timeOut() {
			return timeOut;
		}
		
		@FindBy(xpath = "//a[@id='controlRecord_tab_AdditionalDetails_O001UP']")
		private WebElement CSMParam_ControlRecord_AdditonalDetails;

		public WebElement CSMParam_ControlRecord_AdditonalDetails() {
			return CSMParam_ControlRecord_AdditonalDetails;
		}
		
		@FindBy(xpath="//a[@id='btnDetails_1']")
		private WebElement chequebookSignatureViewButton;
		public WebElement  chequebookSignatureViewButton()
		{
			return chequebookSignatureViewButton;
		}
		@FindBy(xpath="//td[@title='Accept']//span")
		private WebElement chequebookSignatureAcceptButton;
		public WebElement  chequebookSignatureAcceptButton()
		{
			return chequebookSignatureAcceptButton;
		}
		@FindBy(xpath="//div[@id='open_item_div_RCVALERT']")
		private WebElement openedAlertScreenValidation;
		public WebElement openedAlertScreenValidation()
		{
			return openedAlertScreenValidation;
		}
		
		@FindBy(xpath = "//div[contains(text(),'ERROR')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
		private List<WebElement> buildErrorPopup;
	 
		public List<WebElement> buildErrorPopup() {
			return buildErrorPopup;
		}
		
		@FindBy(xpath="//tr[@id='1']//input[contains(@id,'jqg_signatureGridTbl_Id_')]")
		private WebElement chequebookSignaturePopupCheckBox;
		public WebElement  chequebookSignaturePopupCheckBox()
		{
			return chequebookSignaturePopupCheckBox;
		}
		
		@FindBy(id = "_popup_path_sol_ok")
		private WebElement CSM_OkButtonUnderInformationPopUp;

		public WebElement CSMOkButtonUnderInformationPopUp() {
			return CSM_OkButtonUnderInformationPopUp;
		}
		@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
		private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

		public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
			return CSM_ClearCacheInTechnicalDetailsIcon;

		}
		@FindBy(id = "tech_details_icon")
		private WebElement CSM_TechnicalDetailsIcon;

		public WebElement CSMTechnicalDetailsIcon() {
			return CSM_TechnicalDetailsIcon;
		}
		@FindBy(id="acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE")
		private WebElement accountTypeUpdateAfterApproveSearchGridInput;
		public WebElement accountTypeUpdateAfterApproveSearchGridInput()
		{
			return accountTypeUpdateAfterApproveSearchGridInput;
		}
		
		@FindBy(xpath="//label[@id='acctypeMaint_FormId_P017P_Approve_key']//ancestor::button")
		private WebElement accountTypeApproveButton;
		public WebElement accountTypeApproveButton()
		{
			return accountTypeApproveButton;
		}
		
		@FindBy(xpath="//label[@id='acctypeMaint_FormId_P017MA_Update_After_Approve_key']//ancestor::button")
		private WebElement accountTypeUpdateAfterApproveButton;
		public WebElement accountTypeUpdateAfterApproveButton()
		{
			return accountTypeUpdateAfterApproveButton;
		}
		@FindBy(id="acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE")
		private WebElement accountTypeApproveSearchGridInput;
		public WebElement accountTypeApproveSearchGridInput()
		{
			return accountTypeApproveSearchGridInput;
		}	
		@FindBy(xpath="//a[contains(@id,'chooseLanguageDivId_')]//span[contains(text(),'Cancel')]")
		private WebElement chooseLanguageCancelButton;
		public WebElement chooseLanguageCancelButton()
		{
			return chooseLanguageCancelButton;
		}
		@FindBy(xpath="//span[text()='Instructions']/parent::div")
		private WebElement accountTypeUpdateAfterApproveInstructionGrid;
		public WebElement accountTypeUpdateAfterApproveInstructionGrid()
		{
			return accountTypeUpdateAfterApproveInstructionGrid;
		}
		
		@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']//ancestor::button")
		private WebElement controlReordApproveButton;

		public WebElement controlReordApproveButton() {
			return controlReordApproveButton;
		}	
				
	
}
		
		
		
		
		
		

