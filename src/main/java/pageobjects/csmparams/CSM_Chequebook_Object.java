package pageobjects.csmparams;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Chequebook_Object {
	WebDriver driver;

	public CSM_Chequebook_Object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='System Parameters']//parent::td")
	private WebElement csmParam_Systemparameter;

	public WebElement csmParam_Systemparameter() {
		return csmParam_Systemparameter;
	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement csmParam_Systemparameter_User;

	public WebElement csmParam_Systemparameter_User() {
		return csmParam_Systemparameter_User;
	}

	@FindBy(xpath = "//span[text()='Update after Approve']")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove() {
		return csmParam_Systemparameter_User_UpadateAfterapprove;
	}

	@FindBy(id = "tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_Userid;
	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;
	}

	@FindBy(xpath = "//select[@id='view_show_recieve_E000MA']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch() {
		return csmParam_User_Userid_doubleclick_logintobranch;
	}

	// check if the retrive button is in the field da karthi

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
	}

	@FindBy(xpath = "//span[contains(text(),' Transaction Status ')]//parent::a")

	private WebElement transactionType_TransactionStatusButton;

	public WebElement transactionTypeTransactionStatusButton()

	{

		return transactionType_TransactionStatusButton;

	}

	@FindBy(xpath = "//td[@tdlabel='AND/OR']")

	private WebElement transactionTypeStatus_ANDORDropdownClickable;

	public WebElement transactionTypeStatusANDORDropdownClickable()

	{

		return transactionTypeStatus_ANDORDropdownClickable;

	}

	@FindBy(xpath = "//td[@id='del_tab31_GridTbl_Id_P024MA']//span")

	private WebElement transactionStatus_DeleteRowNumber;

	public WebElement transactionStatusDeleteRowNumber()

	{

		return transactionStatus_DeleteRowNumber;

	}

	@FindBy(xpath = "//div[contains(text(),'Confirm Delete Process')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_confirm_ok']")

	private WebElement csm_Delete_ConfirmationOkButton;

	public WebElement csmDeleteConfirmationOkButton() {

		return csm_Delete_ConfirmationOkButton;

	}

	@FindBy(xpath = "//td[@id='add_tab31_GridTbl_Id_P024MA']//span")

	private WebElement transactionStatus_AddNewRow;

	public WebElement transactionStatusAddNewRow()

	{

		return transactionStatus_AddNewRow;

	}

	@FindBy(xpath = "//td[@id='td_tab31_GridTbl_Id_P024MA_1_ctstrxtypeStatusVO.AND_OR']//select")

	private WebElement transactionTypeStatus_ANDORDropdown;

	public WebElement transactionTypeStatusANDORDropdown()

	{

		return transactionTypeStatus_ANDORDropdown;

	}

	@FindBy(xpath = "//td[@tdlabel='Priority']//input")

	private WebElement transactionTypeStatus_PriorityInput;

	public WebElement transactionTypeStatusPriorityInput()

	{

		return transactionTypeStatus_PriorityInput;

	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeStatusVO.STATUS_CODE']")

	private WebElement transactionTypeStatus_StatusCodeInput;

	public WebElement transactionTypeStatusStatusCodeInput()

	{

		return transactionTypeStatus_StatusCodeInput;

	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeStatusVO.USER_LEVEL']")

	private WebElement transactionTypeStatus_UserLevelInput;

	public WebElement transactionTypeStatusUserLevelInput()

	{

		return transactionTypeStatus_UserLevelInput;

	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")

	private WebElement transactionStatus_OkButton;

	public WebElement transactionStatusOkButton()

	{

		return transactionStatus_OkButton;

	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;
	}

	@FindBy(id = "E000P")
	private WebElement csmParam_User_Approve;

	public WebElement csmParam_User_Approve() {
		return csmParam_User_Approve;
	}

	@FindBy(id = "tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")
	private WebElement csmParam_User_Approve_UserID;

	public WebElement csmParam_User_Approve_UserID() {
		return csmParam_User_Approve_UserID;
	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")
	private WebElement csmParam_User_Approve_Username_doubleclick;

	public WebElement csmParam_User_Approve_Username_doubleclick() {
		return csmParam_User_Approve_Username_doubleclick;
	}

	@FindBy(id = "tellerParamMaint_FormId_E000P_Approve_key")
	private WebElement csmParam_User_Approve_Username_doubleclick_Approve;

	public WebElement csmParam_User_Approve_Username_doubleclick_Approve() {
		return csmParam_User_Approve_Username_doubleclick_Approve;
	}

//	@FindBy(id =  "_popup_path_sol_confirm_ok")
//	private WebElement csmParam_User_Approve_Username_doubleclick_Approve_Ok;
//
//	public WebElement csmParam_User_Approve_Username_doubleclick_Approve_Ok() {
//		return csmParam_User_Approve_Username_doubleclick_Approve_Ok;
//	}
	// CSM_Core Page Objects -----Start-------------------------------------
	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement csmcore_ChequeBookRequest;

	public WebElement csmcore_ChequeBookRequest() {
		return csmcore_ChequeBookRequest;
	}

	@FindBy(xpath = "//td[text()='Send To/Receive From Provider']")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom() {
		return csmcore_ChequeBookRequest_senttoreceivefrom;
	}

	@FindBy(xpath = "//span[text()='Send To Provider']")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider;
	}

	@FindBy(xpath = "//span[text()=' Retrieve ']")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_retrivebutton;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_retrivebutton() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_retrivebutton;
	}

	@FindBy(id = "chqBkImpExpGridTbl_Id_Q000TP_gs_ctschqbookVO.BRANCH_CODE")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield;
	}

	@FindBy(xpath = "//span[text()='Receive From Provider']")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider;
	}

	@FindBy(id = "chqBkImpExpGridTbl_Id_Q000RP_gs_ctschqbookVO.BRANCH_CODE")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield;
	}
	// CSM_Core Page object----------End-------------------

	@FindBy(xpath = "//input[@name='controlrecordCO.ctscontrolVO.CHQBOOK_PROCESS']")
	private WebElement csmParam_ControlRecords_AdvancedProcess;

	public WebElement csmParam_ControlRecords_AdvancedProcess() {
		return csmParam_ControlRecords_AdvancedProcess;
	}

	// @CHB_180
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParam_ParameterMainModule;

	public WebElement csmParamParameterMainModule() {
		return csmParam_ParameterMainModule;
	}

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement csmParam_AccountParameter;

	public WebElement csmParam_AccountParameter() {
		return csmParam_AccountParameter;
	}

	@FindBy(xpath = "//td[text()='General Ledger']")
	private WebElement csmParam_General_ledger;

	public WebElement csmParam_General_ledger() {
		return csmParam_General_ledger;
	}

	@FindBy(id = "P014UP")
	private WebElement csmParam_General_ledger_Updateafterapprove;

	public WebElement csmParam_General_ledger_Updateafterapprove() {
		return csmParam_General_ledger_Updateafterapprove;
	}

	@FindBy(id = "genLedgerParamListGridTbl_Id_P014UP_gs_GL_CODE")
	private WebElement csmParam_General_ledger_code;

	public WebElement csmParam_General_ledger_code() {
		return csmParam_General_ledger_code;
	}

	@FindBy(xpath = "(//table[@id='genLedgerParamListGridTbl_Id_P014UP'])[1]")
	private WebElement csmParam_General_ledger_code_doubleclick;

	public WebElement csmParam_General_ledger_code_doubleclick() {
		return csmParam_General_ledger_code_doubleclick;
	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement csmParam_General_ledger_code_additionaloptions;

	public WebElement csmParam_General_ledger_code_additionaloptions() {
		return csmParam_General_ledger_code_additionaloptions;
	}

	@FindBy(id = "allow_internal_overdraw_P014UP")
	private WebElement csmParam_General_ledger_code_additionaloptions_dropdown;

	public WebElement csmParam_General_ledger_code_additionaloptions_dropdown() {
		return csmParam_General_ledger_code_additionaloptions_dropdown;
	}

	@FindBy(id = "genLedgerParamFormId_P014UP_update_key")
	private WebElement csmParam_General_ledger_upadatebutton;

	public WebElement csmParam_General_ledger_upadatebutton() {
		return csmParam_General_ledger_upadatebutton;
	}

	@FindBy(xpath = "//td[text()='General Ledger']//ancestor::a//following-sibling::ul//span[text()='Approve']")
	private WebElement csmParam_General_ledger_Approve;

	public WebElement csmParam_General_ledger_Approve() {
		return csmParam_General_ledger_Approve;
	}

	@FindBy(id = "genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE")
	private WebElement csmParam_General_ledger_Approve_inputfield;

	public WebElement csmParam_General_ledger_Approve_inputfield() {
		return csmParam_General_ledger_Approve_inputfield;
	}

	@FindBy(xpath = "(//table[@id='genLedgerParamListGridTbl_Id_P014P'])[1]")
	private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick;

	public WebElement csmParam_General_ledger_Approve_inputfield_doubleclick() {
		return csmParam_General_ledger_Approve_inputfield_doubleclick;
	}

	@FindBy(xpath = "//label[@id='genLedgerParamFormId_P014P_approve_key']")
	private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve;

	public WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve() {
		return csmParam_General_ledger_Approve_inputfield_doubleclick_Approve;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK;

	public WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK() {
		return csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK;
	}

//		id="genLedgerParamFormId_P014P_approve_key"
//		@FindBy(id = "genLedgerParamCode_P014MT")
//		private WebElement csmParam_General_ledger_inputcode;
	//
//		public WebElement csmParam_General_ledger_inputcode() {
//			return csmParam_General_ledger_inputcode;
//		}
	//
//		@FindBy(id = "gl_type_P014MT")
//		private WebElement csmParam_General_ledger_type;
	//
//		public WebElement csmParam_General_ledger_type() {
//			return csmParam_General_ledger_type;
//		}
//		@FindBy(id = "genLedgerParamBriefDescEng_P014MT")
//		private WebElement csmParam_General_ledger_Briefname;
	//
//		public WebElement csmParam_General_ledger_Briefname() {
//			return csmParam_General_ledger_Briefname;
//		}
	//
//		@FindBy(id = "genLedgerParamLongDescEng_P014MT")
//		private WebElement csmParam_General_ledger_Longname;
	//
//		public WebElement csmParam_General_ledger_Longname() {
//			return csmParam_General_ledger_Longname;
//		}
	//
//		@FindBy(xpath = "//span[text()='Additional Details']")
//		private WebElement csmParam_General_ledger_Additionaldetails;
	//
//		public WebElement csmParam_General_ledger_Additionaldetails() {
//			return csmParam_General_ledger_Additionaldetails;
//		}
//		@FindBy(id = "ac_sign_P014MT")
//		private WebElement csmParam_General_ledger_AccountSign;
	//
//		public WebElement csmParam_General_ledger_AccountSign() {
//			return csmParam_General_ledger_AccountSign;
//		}
	//
//		@FindBy(id = "allow_internal_overdraw_P014MT")
//		private WebElement csmParam_General_ledger_AllowOverdraw ;
	//
//		public WebElement csmParam_General_ledger_AllowOverdraw() {
//			return csmParam_General_ledger_AllowOverdraw;
//		}
//		@FindBy(id = "genLedgerParamFormId_P014MT_Save_key")
//		private WebElement csmParam_General_ledger_Savekey ;
	//
//		public WebElement csmParam_General_ledger_Savekey() {
//			return csmParam_General_ledger_Savekey;
//		}
	//
//		@FindBy(id = "_popup_path_sol_ok")
//		private WebElement csmParam_General_ledger_Okbutton ;
	//
//		public WebElement csmParam_General_ledger_Okbutton() {
//			return csmParam_General_ledger_Okbutton;
//		}
	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement csmParam_Transactiontype;

	public WebElement csmParam_Transactiontype() {
		return csmParam_Transactiontype;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']/ancestor::a/following-sibling::ul//span[text()='Update After Approve']")
	private WebElement csmParam_Transactiontype_Updateafterapprovefield;

	public WebElement csmParam_Transactiontype_Updateafterapprovefield() {
		return csmParam_Transactiontype_Updateafterapprovefield;
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

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds() {
		return csmParam_Transactiontype_proceedoninsufficentfunds;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton() {
		return csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton;
	}

//@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
//private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton_Ok ;
//
//public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton_Ok() {
//return csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton_Ok;
//}
	@FindBy(xpath = "//a[@id='P024P']")
	private WebElement csmParam_Transactiontype_Approvefield;

	public WebElement csmParam_Transactiontype_Approvefield() {
		return csmParam_Transactiontype_Approvefield;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_Approve_Inputfield;

	public WebElement csmParam_Transactiontype_Approve_Inputfield() {
		return csmParam_Transactiontype_Approve_Inputfield;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_Approve_Inputfield_doubleclick;

	public WebElement csmParam_Transactiontype_Approve_Inputfield_doubleclick() {
		return csmParam_Transactiontype_Approve_Inputfield_doubleclick;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement csmParam_Transactiontype_Approve_Inputfield_doubleclick_Approve;

	public WebElement csmParam_Transactiontype_Approve_Inputfield_doubleclick_Approve() {
		return csmParam_Transactiontype_Approve_Inputfield_doubleclick_Approve;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement csmcore_Chequebookrequest;

	public WebElement csmcore_Chequebookrequest() {
		return csmcore_Chequebookrequest;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']/ancestor::table/following::span[text()='Maintenance']")
	private WebElement csmcore_Chequebookrequest_maintanace;

	public WebElement csmcore_Chequebookrequest_maintanace() {
		return csmcore_Chequebookrequest_maintanace;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code;

	public WebElement csmcore_Chequebookrequest_maintanace_Code() {
		return csmcore_Chequebookrequest_maintanace_Code;
	}

	@FindBy(xpath = "//a[@id='Chequebook Request / Maintenance']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code_clickonsomething;

	public WebElement csmcore_Chequebookrequest_maintanace_Code_clickonsomething() {
		return csmcore_Chequebookrequest_maintanace_Code_clickonsomething;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode;

	public WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode() {
		return csmcore_Chequebookrequest_maintanace_Code_branchcode;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks;

	public WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks() {
		return csmcore_Chequebookrequest_maintanace_NoofChequeBooks;
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

	@FindBy(xpath = "//td[text()='Chequebook Request']/ancestor::table/following::span[text()='Approve']")
	private WebElement csmcore_Chequebookrequest_Approve;

	public WebElement csmcore_Chequebookrequest_Approve() {
		return csmcore_Chequebookrequest_Approve;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement csmcore_Chequebookrequest_Approve_InputField;

	public WebElement csmcore_Chequebookrequest_Approve_InputField() {
		return csmcore_Chequebookrequest_Approve_InputField;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CHEQUE_CODE']")
	private WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick;

	public WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick() {
		return csmcore_Chequebookrequest_Approve_InputField_doubleclick;
	}

	@FindBy(xpath = "//button[@id='chequeBook_approve_Q000AP']")
	private WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton;

	public WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton() {
		return csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot Proceed')]")
	private WebElement cannotProceedWarningPopUp;

	public WebElement cannotProceedWarningPopUp() {
		return cannotProceedWarningPopUp;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate;

	public WebElement CSMDateInUserRunningDate() {
		return CSM_DateInUserRunningDate;
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

	// CHB_110
	@FindBy(xpath = "//input[@id='chqbook_reject_reason_O001UP']")
	private WebElement CSMparam_ControlRecords_reasononrejecting;

	public WebElement CSMparam_ControlRecords_reasononrejecting() {
		return CSMparam_ControlRecords_reasononrejecting;
	}

	@FindBy(xpath = "//a[@id='controlRecord_tab_OtherInfo_O001UP']")
	private WebElement CSMparam_ControlRecords_OtherInfoBtn;

	public WebElement CSMparam_ControlRecords_OtherInfoBtn() {

		return CSMparam_ControlRecords_OtherInfoBtn;
	}

	@FindBy(xpath = "//input[@id='rejection_reason_mand_yn_O001UP']")
	private WebElement CSMparam_ControlRecords_OtherInfoBtn_recordrejectingreasonmandatory;

	public WebElement CSMparam_ControlRecords_OtherInfoBtn_recordrejectingreasonmandatory() {
		return CSMparam_ControlRecords_OtherInfoBtn_recordrejectingreasonmandatory;
	}

	@FindBy(xpath = "//span[text()='To Be Destroyed']//parent::a")
	private WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen;

	public WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen() {
		return CSM_ChequeBookRequest_ToBeDestroyedScreen;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen_Code;

	public WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen_Code() {
		return CSM_ChequeBookRequest_ToBeDestroyedScreen_Code;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000TD_1_ctschqbookVO.CODE']")
	private WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen_Code_Doubleclick;

	public WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen_Code_Doubleclick() {
		return CSM_ChequeBookRequest_ToBeDestroyedScreen_Code_Doubleclick;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000TD_to_destroy_key']")
	private WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen_TobedestroyButton;

	public WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen_TobedestroyButton() {
		return CSM_ChequeBookRequest_ToBeDestroyedScreen_TobedestroyButton;
	}

	@FindBy(xpath = "//span[text()='Approve Destroyed']//parent::a")
	private WebElement CSM_ChequeBookRequest_ApproveDestroyedScreen;

	public WebElement CSM_ChequeBookRequest_ApproveDestroyedScreen() {
		return CSM_ChequeBookRequest_ApproveDestroyedScreen;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE']")
	private WebElement CSM_ChequeBookRequest_ApproveDestroyedScreen_code;

	public WebElement CSM_ChequeBookRequest_ApproveDestroyedScreen_code() {
		return CSM_ChequeBookRequest_ApproveDestroyedScreen_code;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AD_1_ctschqbookVO.CODE']")
	private WebElement CSM_ChequeBookRequest_ApproveDestroyedScreen_code_Doubleclick;

	public WebElement CSM_ChequeBookRequest_ApproveDestroyedScreen_code_Doubleclick() {
		return CSM_ChequeBookRequest_ApproveDestroyedScreen_code_Doubleclick;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000AD_destroy_key']")
	private WebElement CSM_ChequeBookRequest_ApproveDestroyedScreen_DestoryButton;

	public WebElement CSM_ChequeBookRequest_ApproveDestroyedScreen_DestoryButton() {
		return CSM_ChequeBookRequest_ApproveDestroyedScreen_DestoryButton;
	}

	@FindBy(xpath = "//span[text()='Reject Destroy']//parent::a")
	private WebElement CSM_ChequeBookRequest_RejectDestroy;

	public WebElement CSM_ChequeBookRequest_RejectDestroy() {
		return CSM_ChequeBookRequest_RejectDestroy;
	}

	@FindBy(xpath = "//textarea[@id='status_remarks_Q000TD']")
	private WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen_Code_Doubleclick_ReasonCode;

	public WebElement CSM_ChequeBookRequest_ToBeDestroyedScreen_Code_Doubleclick_ReasonCode() {
		return CSM_ChequeBookRequest_ToBeDestroyedScreen_Code_Doubleclick_ReasonCode;
	}

	// CHB_147

	@FindBy(xpath = "//span[text()='To Be Reversed Chequebook']//parent::a")
	private WebElement CSM_ChequeBookRequest_TobeReversedScreen;

	public WebElement CSM_ChequeBookRequest_TobeReversedScreen() {
		return CSM_ChequeBookRequest_TobeReversedScreen;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AR_1_ctschqbookVO.CODE']")
	private WebElement CSM_ChequeBookRequest_TobeReversedScreen_code_Doubleclick;

	public WebElement CSM_ChequeBookRequest_TobeReversedScreen_code_Doubleclick() {
		return CSM_ChequeBookRequest_TobeReversedScreen_code_Doubleclick;
	}

	@FindBy(xpath = "//span[text()='Reverse Chequebook']//parent::a")
	private WebElement CSM_ChequeBookRequest_Reversedchequebook;

	public WebElement CSM_ChequeBookRequest_Reversedchequebook() {
		return CSM_ChequeBookRequest_Reversedchequebook;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000RV_1_ctschqbookVO.CODE']")
	private WebElement CSM_ChequeBookRequest_Reversedchequebook_code_doubleclick;

	public WebElement CSM_ChequeBookRequest_Reversedchequebook_code_doubleclick() {
		return CSM_ChequeBookRequest_Reversedchequebook_code_doubleclick;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000RV_reverse_key']")
	private WebElement CSM_ChequeBookRequest_Reversedchequebook_ReverseButton;

	public WebElement CSM_ChequeBookRequest_Reversedchequebook_ReverseButton() {
		return CSM_ChequeBookRequest_Reversedchequebook_ReverseButton;
	}
	// Anandh

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement csm_chequeBookRequestModule;

	public WebElement csmChequeBookRequestModule() {
		return csm_chequeBookRequestModule;
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

	@FindBy(xpath = "//input[@id='chequeBookQueryTbl_Id_Q000QR_gs_CODE']")
	private WebElement chequeBooQueryModule_ChequeCode;

	public WebElement chequeBooQueryModuleChequeCode() {
		return chequeBooQueryModule_ChequeCode;
	}

	@FindBy(xpath = "//span[@id='spanLookup_status_sl_Q000QR']//span")
	private WebElement chequeBooQueryModule_LiveSearch;

	public WebElement chequeBooQueryModuleLiveSearch() {
		return chequeBooQueryModule_LiveSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.GL_CODE']")
	private WebElement chequeBooQueryModuleLiveSearch_GlCode;

	public WebElement chequeBooQueryModuleLiveSearchGlCode() {
		return chequeBooQueryModuleLiveSearch_GlCode;
	}

	@FindBy(xpath = "//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.CIF_SUB_NO']")
	private WebElement chequeBooQueryModuleLiveSearch_CIFNo;

	public WebElement chequeBooQueryModuleLiveSearchCIFNo() {
		return chequeBooQueryModuleLiveSearch_CIFNo;
	}

	@FindBy(xpath = "//table[@id='chequeBookQueryTbl_Id_Q000QR']//tr[2]")
	private WebElement chequeBooQueryModuleLiveSearch_TableValidation;

	public WebElement chequeBooQueryModuleLiveSearchTableValidation() {
		return chequeBooQueryModuleLiveSearch_TableValidation;
	}

	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement toBeDestroy_MainModule;

	public WebElement toBeDestroyMainModule() {
		return toBeDestroy_MainModule;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement toBeDestroy_SearchChequeCode;

	public WebElement toBeDestroySearchChequeCode() {
		return toBeDestroy_SearchChequeCode;
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

	@FindBy(id = "chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE")
	private WebElement chequeBookMaintenance_SearchChequeCode;

	public WebElement chequeBookMaintenanceSearchChequeCode() {
		return chequeBookMaintenance_SearchChequeCode;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CODE")
	private WebElement chequebookRequestApproveGridCodeInput;

	public WebElement chequebookRequestApproveGridCodeInput() {
		return chequebookRequestApproveGridCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.CODE")
	private WebElement chequebookRequestApplyToSubmitGridCodeInput;

	public WebElement chequebookRequestApplyToSubmitGridCodeInput() {
		return chequebookRequestApplyToSubmitGridCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE")
	private WebElement chequebookRequestTocancelGridCodeInput;

	public WebElement chequebookRequestTocancelGridCodeInput() {
		return chequebookRequestTocancelGridCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AC_gs_ctschqbookVO.CODE")
	private WebElement chequebookRequestApproveCancelGridCodeInput;

	public WebElement chequebookRequestApproveCancelGridCodeInput() {
		return chequebookRequestApproveCancelGridCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.CODE")
	private WebElement chequebookRequestSubmitGridCodeInput;

	public WebElement chequebookRequestSubmitGridCodeInput() {
		return chequebookRequestSubmitGridCodeInput;
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

	@FindBy(xpath = "//b[contains(text(),'Total All')]//parent::td[@id='td_chargesGridId_Q000AP_0_chargeDesc']//following-sibling::td[contains(@id,'td_chargesGridId_Q000AP') and contains(@id,'ctsChargesEntityVO.AMOUNT') and @tdlabel='CV Amount']")
	private WebElement chequebookApprovalChargeAmount;

	public WebElement chequebookApprovalChargeAmount() {
		return chequebookApprovalChargeAmount;
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

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000TC']//tbody//tr[2]//td[2]")
	private WebElement chequebookRequest_GridRequestNumber;

	public WebElement chequebookRequestGridRequestNumber() {
		return chequebookRequest_GridRequestNumber;
	}

	@FindBy(xpath = "//button[contains(@id,'chequeBook_toCancel')]")
	private WebElement chequebookRequest_ToCancelButton;

	public WebElement chequebookRequestToCancelButton() {
		return chequebookRequest_ToCancelButton;
	}

	@FindBy(xpath = "//button[contains(@id,'chequeBook_cancel_')]")
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

	@FindBy(xpath = "//div[contains(text(),'1709')]//parent::div//following-sibling::center//input[1]")
	private WebElement chequebookRequestMaintenance_DeleteConfirmationOkButton;

	public WebElement chequebookRequestMaintenanceDeleteConfirmationOkButton() {
		return chequebookRequestMaintenance_DeleteConfirmationOkButton;
	}

//	@FindBy(xpath = "//div[contains(text(),'Are you Sure?')]//parent::div//following-sibling::center//input[@value='Ok ']")
//	private WebElement chequebookRequest_DeleteConfirmationOkButton;
//
//	public WebElement chequebookRequestDeleteConfirmationOkButton() {
//		return chequebookRequest_DeleteConfirmationOkButton;
//	}
	@FindBy(xpath = "//div[contains(text(),'Cheque Book Already Assigned Or Submitted')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement chequebookRequestMaintenance_AlreadyAssignedOrSubmittedPopup;

	public WebElement chequebookRequestMaintenanceAlreadyAssignedOrSubmittedPopup() {
		return chequebookRequestMaintenance_AlreadyAssignedOrSubmittedPopup;
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

	@FindBy(id = "infoBarSearchButton_Q000TD")
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

	@FindBy(xpath = "//div[contains(text(),'2499')]//parent::div//following-sibling::center//input")
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

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParam_Parameters;

	public WebElement csmParamParameters() {
		return csmParam_Parameters;
	}

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement parameters_AccountsParameters;

	public WebElement parametersAccountsParameters() {
		return parameters_AccountsParameters;
	}

	@FindBy(xpath = "//td[text()='General Ledger']")
	private WebElement accountsParameters_GeneralLedger;

	public WebElement accountsParametersGeneralLedger() {
		return accountsParameters_GeneralLedger;
	}

	@FindBy(xpath = "//td[text()='General Ledger']//ancestor::li//span[text()='Maintenance']")
	private WebElement generalLedger_Maintenance;

	public WebElement generalLedgerMaintenance() {
		return generalLedger_Maintenance;
	}

	@FindBy(xpath = "//input[@name='genLedgerParamCO.genLedgerVO.GL_CODE']")
	private WebElement generalLedger_Code;

	public WebElement generalLedgerCode() {
		return generalLedger_Code;
	}

	@FindBy(xpath = "//input[@name='genLedgerParamCO.genLedgerVO.BRIEF_DESC_ENG']")
	private WebElement generalLedger_BriefName;

	public WebElement generalLedgerBriefName() {
		return generalLedger_BriefName;
	}

	@FindBy(xpath = "//input[@name='genLedgerParamCO.genLedgerVO.LONG_DESC_ENG']")
	private WebElement generalLedger_LongName;

	public WebElement generalLedgerLongName() {
		return generalLedger_LongName;
	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement generalLedger_AdditionalDetails;

	public WebElement generalLedgerAdditionalDetails() {
		return generalLedger_AdditionalDetails;
	}

	@FindBy(xpath = "//select[@name='genLedgerParamCO.genLedgerVO.GL_CATEGORY']")
	private WebElement generalLedger_GlCategory;

	public WebElement generalLedgerGlCategory() {
		return generalLedger_GlCategory;
	}

	@FindBy(xpath = "//select[@name='genLedgerParamCO.genLedgerVO.AC_SIGN']")
	private WebElement generalLedger_AccountSign;

	public WebElement generalLedgerAccountSign() {
		return generalLedger_AccountSign;
	}

	@FindBy(xpath = "//label[text()='Save ']")
	private WebElement generalLedger_Save;

	public WebElement generalLedgerSave() {
		return generalLedger_Save;
	}

	@FindBy(xpath = "//div[text()='Saved Successfully']//ancestor::div//center//input[@id='_popup_path_sol_ok']")
	private WebElement generalLedger_SavePopupOkButton;

	public WebElement generalLedgerSavePopupOkButton() {
		return generalLedger_SavePopupOkButton;
	}

	@FindBy(xpath = "//input[@id='genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE']")
	private WebElement generalLedgerApprove_SearchGlCode;

	public WebElement generalLedgerApproveSearchGlCode() {
		return generalLedgerApprove_SearchGlCode;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement generalLedger_Approve;

	public WebElement generalLedgerApprove() {
		return generalLedger_Approve;
	}

	@FindBy(xpath = "//button[@id='genLedgerParamMaint_approve_P014P']")
	private WebElement generalLedger_ApproveButon;

	public WebElement generalLedgerApproveButon() {
		return generalLedger_ApproveButon;
	}

	@FindBy(xpath = "//div[text()='Confirm Approve Process']//ancestor::div//center//input[1]")
	private WebElement generalLedger_ConfirmApproveButon;

	public WebElement generalLedgerConfirmApproveButon() {
		return generalLedger_ConfirmApproveButon;
	}

	@FindBy(xpath = "//div[text()='Record was Approved Successfully']//ancestor::div//center//input[1]")
	private WebElement generalLedger_AfterApproveOkButon;

	public WebElement generalLedgerAfterApproveOkButon() {
		return generalLedger_AfterApproveOkButon;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement csmParam_SystemParameter;

	public WebElement csmParamSystemParameter() {
		return csmParam_SystemParameter;
	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement systemParameter_UserMainModule;

	public WebElement systemParameterUserMainModule() {
		return systemParameter_UserMainModule;
	}

	@FindBy(xpath = "//td[text()='User']//ancestor::li//span[text()='Maintenance']")
	private WebElement user_Maintenance;

	public WebElement userMaintenance() {
		return user_Maintenance;
	}

	@FindBy(xpath = "//td[text()='User']//ancestor::li//span[text()='Update after Approve']")
	private WebElement user_UpdateAfterApprove;

	public WebElement userUpdateAfterApprove() {
		return user_UpdateAfterApprove;
	}

	@FindBy(name = "CODE")
	private WebElement user_searchUserCode;

	public WebElement userSearchUserCode() {
		return user_searchUserCode;
	}

	@FindBy(xpath = "//input[@name='USER_ID']")
	private WebElement user_SearchUserID;

	public WebElement userSearchUserID() {
		return user_SearchUserID;
	}

	@FindBy(xpath = "//span[text()=' Account Types ']")
	private WebElement user_AccountTypeAccess;

	public WebElement userAccountTypeAccess() {
		return user_AccountTypeAccess;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-tellerParam_popupAccountTypes_div_E000MA']")
	private WebElement userAccess_Label;

	public WebElement userAccessLabel() {
		return userAccess_Label;
	}

	@FindBy(xpath = "//span[text()=' CIF Types ']")
	private WebElement user_CIFTypeAccess;

	public WebElement userCIFTypeAccess() {
		return user_CIFTypeAccess;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.CIF_TYPE']")
	private WebElement user_CIFTypeAccessInputBox;

	public WebElement userCIFTypeAccessInputBox() {
		return user_CIFTypeAccessInputBox;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.TRX_TYPE']")
	private WebElement user_CIFTypeTransactionInputBox;

	public WebElement userCIFTypeTransactionInputBox() {
		return user_CIFTypeTransactionInputBox;
	}

	@FindBy(xpath = "//td[@id='add_tab4_GridTbl_Id_E000MA']")
	private WebElement userAccess_PlusIcon;

	public WebElement userAccessPlusIcon() {
		return userAccess_PlusIcon;
	}

	@FindBy(xpath = "//td[@title='Add new row']")
	private WebElement limitButton_AddIcon;

	public WebElement limitButtonAddIcon() {
		return limitButton_AddIcon;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")
	private WebElement limitButton_OkButton;

	public WebElement limitButtonOkButton() {
		return limitButton_OkButton;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstelleracctypedetVO.ACC_TYPE']")
	private WebElement userAccess_SearchAccountType;

	public WebElement userAccessSearchAccountType() {
		return userAccess_SearchAccountType;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstelleracctypedetVO.TRX_TYPE']")
	private WebElement userAccess_SearchTransaction;

	public WebElement userAccessSearchTransaction() {
		return userAccess_SearchTransaction;
	}

	@FindBy(xpath = "//td[@tdlabel='W/D Limit']//input")
	private WebElement userAccess_SearchWdLimit;

	public WebElement userAccessSearchWdLimit() {
		return userAccess_SearchWdLimit;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement userAccess_OkButton;

	public WebElement userAccessOkButton() {
		return userAccess_OkButton;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']//ancestor::button")
	private WebElement userAccess_UpdateAfterApproveButton;

	public WebElement userAccessUpdateAfterApproveButton() {
		return userAccess_UpdateAfterApproveButton;
	}

	@FindBy(xpath = "//label[contains(text(),'Show All Trx')]//parent::td//preceding-sibling::td//input[1]")
	private WebElement userAccess_ShowAllTrxFlag;

	public WebElement userAccessShowAllTrxFlag() {
		return userAccess_ShowAllTrxFlag;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Update after Approve')]//parent::td//following-sibling::td//span")
	private WebElement userUpdateAfterApprove_closeLabel;

	public WebElement userUpdateAfterApproveCloseLabel() {
		return userUpdateAfterApprove_closeLabel;
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

	@FindBy(xpath = "//td[text()='User']//ancestor::li//span[text()='Approve']")
	private WebElement userAccess_ApproveModule;

	public WebElement userAccessApproveModule() {
		return userAccess_ApproveModule;
	}

	@FindBy(xpath = "//td[contains(text(),'Populate User')]")
	private WebElement user_PopulateUserFeature;

	public WebElement userPopulateUserFeature() {
		return user_PopulateUserFeature;
	}

	@FindBy(xpath = "(//td[text()='Populate User']//ancestor::li//span[text()='Maintenance'])[2]")
	private WebElement populateUser_MaitenanceFeature;

	public WebElement populateUserMaintenanceFeature() {
		return populateUser_MaitenanceFeature;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.TELLER_POPULATION_CODE")
	private WebElement populateUserMaintenance_populateCodeInput;

	public WebElement populateUserMaintenancePopulateCodeInput() {
		return populateUserMaintenance_populateCodeInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.BRIEF_NAME_ENG")
	private WebElement populateUserMaintenance_populateBriefNameInput;

	public WebElement populateUserMaintenancepopulateBriefNameInput() {
		return populateUserMaintenance_populateBriefNameInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.LONG_NAME_ENG")
	private WebElement populateuserMaintenance_populateLongDescription;

	public WebElement populateUserMaintenancePopulateLongDescription() {
		return populateuserMaintenance_populateLongDescription;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.BRIEF_NAME_ARAB")
	private WebElement populateUserMaintenance_populateBriefNameArabInput;

	public WebElement populateUserMaintenancepopulateBriefNameArabInput() {
		return populateUserMaintenance_populateBriefNameArabInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.LONG_NAME_ARAB")
	private WebElement populateUserMaintenance_populateLongDescNameArabInput;

	public WebElement populateUserMaintenancepopulateLongDescNameArabInput() {
		return populateUserMaintenance_populateLongDescNameArabInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.TELLER_CODE")
	private WebElement populateUserMaintenance_TellercodeInput;

	public WebElement populateUserMaintenanceTellercodeInput() {
		return populateUserMaintenance_TellercodeInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.SUSP_USR_LOG_BR_YN")
	private WebElement populateUserMaintenance_SuspendUserInLoggedInBranchFlag;

	public WebElement populateUserMaintenanceSuspendUserInLoggedInBranchFlag() {
		return populateUserMaintenance_SuspendUserInLoggedInBranchFlag;
	}

	@FindBy(xpath = "//td[@title='Add new row']//div//span")
	private WebElement populateUserMaintenance_AddButton;

	public WebElement populateUserMaintenanceAddButton() {
		return populateUserMaintenance_AddButton;
	}

	@FindBy(name = "lookupTxt_ctstellerPopulateBranchesVO.DESTINATION_BRANCH_CODE")
	private WebElement populateUserMaintenance_DestinationBranchCode;

	public WebElement populateUserMaintenanceDestinationBranchCode() {
		return populateUserMaintenance_DestinationBranchCode;
	}

	@FindBy(name = "lookupTxt_ctstellerPopulateBranchesVO.TMPL_CODE")
	private WebElement populateUserMaintenance_DestinationBranchTemplateCode;

	public WebElement populateUserMaintenanceDestinationBranchTemplateCode() {
		return populateUserMaintenance_DestinationBranchTemplateCode;
	}

	@FindBy(xpath = "(//td[text()='Populate User']//ancestor::li//span[text()='Approve'])[2]")
	private WebElement populateUser_ApproveFeature;

	public WebElement populateUserApproveFeature() {
		return populateUser_ApproveFeature;
	}

	@FindBy(name = "TELLER_POPULATION_CODE")
	private WebElement populateApprove_SearchPopulateCode;

	public WebElement populateApproveSearchPopulateCode() {
		return populateApprove_SearchPopulateCode;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement populateUser_ConfirmPopulateOkButton;

	public WebElement populateUserConfirmPopulateOkButton() {
		return populateUser_ConfirmPopulateOkButton;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement populateUser_ApproveSuccessPopulateOkButton;

	public WebElement populateUserApproveSuccessPopulateOkButton() {
		return populateUser_ApproveSuccessPopulateOkButton;
	}

	@FindBy(xpath = "//td[text()='Populate User']//ancestor::li//span[text()='Populate']")
	private WebElement populateUser_PopulateFeature;

	public WebElement populateUserPopulateFeature() {
		return populateUser_PopulateFeature;
	}

	@FindBy(id = "populateTellerMaint_FormId_E000POPO_Populate_key")
	private WebElement populatefeature_PopulateButton;

	public WebElement populateFeaturePpulateButton() {
		return populatefeature_PopulateButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Confirm Populate Process')]//ancestor::div//center//input[1]")
	private WebElement populatefeature_ConfirmPopulateOkButton;

	public WebElement populatefeatureConfirmPopulateOkButton() {
		return populatefeature_ConfirmPopulateOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Record was Populated Successfully')]//ancestor::div//center//input[1]")
	private WebElement populatefeature_SuccessPopulateOkButton;

	public WebElement populatefeatureSuccessPopulateOkButton() {
		return populatefeature_SuccessPopulateOkButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement populateUser_MaintenanceScreenClose;

	public WebElement populateUserMaintenanceScreenCloseButton() {
		return populateUser_MaintenanceScreenClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Maintenance')]")
	private WebElement populateUser_MaintenanceScreenLabel;

	public WebElement populateUserMaintenanceScreenLabel() {
		return populateUser_MaintenanceScreenLabel;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Approve')]//parent::td//following-sibling::td//span")

	private WebElement populateUser_ApproveScreenClose;

	public WebElement populateUserApproveScreenClose() {
		return populateUser_ApproveScreenClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Approve')]")
	private WebElement populateUser_ApproveScreenLabel;

	public WebElement populateUserApproveScreenLabel() {
		return populateUser_ApproveScreenLabel;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Populate')]//parent::td//following-sibling::td//span")
	private WebElement populateUser_PopulateScreenClose;

	public WebElement populateUserPopulateScreenClose() {
		return populateUser_PopulateScreenClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Populate')]")
	private WebElement populateUser_PopulateUserScreenLabel;

	public WebElement populateUserPopulateUserScreenLabel() {
		return populateUser_PopulateUserScreenLabel;
	}

	@FindBy(id = "STATUS_DESC_E000MT")
	private WebElement userMaintenance_UserStatus;

	public WebElement userMaintenanceUserStatus() {
		return userMaintenance_UserStatus;
	}

	@FindBy(name = "tellerparamCO.ctstellerVO.SHOW_TODAY_TRX")
	private WebElement user_ShowTodayTrxFlg;

	public WebElement userShowTodayTrxFlag() {
		return user_ShowTodayTrxFlg;
	}

	@FindBy(xpath = "//td[@tdlabel='W/D Limit']//input")
	private WebElement accountType_withdrawLimitInput;

	public WebElement accountTypeWithdrawLimitInput() {
		return accountType_withdrawLimitInput;
	}

	@FindBy(xpath = "//td[@tdlabel='Deposit Limit']//input")
	private WebElement accountType_DepositeLimitInput;

	public WebElement accountTypeDepositeLimitInput() {
		return accountType_DepositeLimitInput;
	}

	@FindBy(xpath = "//td[@tdlabel='Overdraw Limit']//input")
	private WebElement accountType_OverdrawnLimitInput;

	public WebElement accountTypeOverdrawnLimitInput() {
		return accountType_OverdrawnLimitInput;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-tellerParam_popupAccountTypes_div_E000MA']")
	private WebElement accountTypeAccess_label;

	public WebElement accountTypeAccesslabel() {
		return accountTypeAccess_label;
	}

	@FindBy(xpath = "//span[contains(text(),' Limits ')]//parent::a")
	private WebElement accountTypeAccess_LimitButton;

	public WebElement accountTypeAccessLimitButton() {
		return accountTypeAccess_LimitButton;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerlimitVO.CY_CODE']")
	private WebElement limitAccess_CurrencyCode;

	public WebElement limitAccessCurrencyCode() {
		return limitAccess_CurrencyCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerlimitVO.TRX_TYPE']")
	private WebElement limitAccess_TransactionType;

	public WebElement limitAccessTransactionType() {
		return limitAccess_TransactionType;
	}

	@FindBy(xpath = "//td[@tdlabel='W/D Limit']//input")
	private WebElement limitAccess_WithdrawLimitInput;

	public WebElement limitAccessWithdrawLimitInput() {
		return limitAccess_WithdrawLimitInput;
	}

	@FindBy(xpath = "//select[@name='tellerparamCO.ctstellerVO.VIEW_DORMANT_ACC']")
	private WebElement userUpdateAfterApprove_DormantAccountDropdown;

	public WebElement userUpdateAfterApproveDormantAccountDropdown() {
		return userUpdateAfterApprove_DormantAccountDropdown;
	}

	@FindBy(id = "lookuptxt_cif_no_E000MA")
	private WebElement userUpdateAfterApprove_CIFNumberInput;

	public WebElement userUpdateAfterApproveCIFNumberInput() {
		return userUpdateAfterApprove_CIFNumberInput;
	}

	@FindBy(id = "lookuptxt_cif_no_E000P")
	private WebElement userApprove_CIFNumberInput;

	public WebElement userApproveCIFNumberInput() {
		return userApprove_CIFNumberInput;
	}

	@FindBy(name = "tellerparamCO.ctstellerVO.FORBID_TRS_ON_ITS_ACC")
	private WebElement userUpdateAfterApprove_TrxOnHisOtherTellerAccDropdown;

	public WebElement userUpdateAfterApproveTrxOnHisOtherTellerAccDropdown() {
		return userUpdateAfterApprove_TrxOnHisOtherTellerAccDropdown;
	}

	@FindBy(xpath = "//td[contains(text(),'Cheques')]")
	private WebElement systemParameter_ChequesFeature;

	public WebElement systemParameterChequesFeature() {
		return systemParameter_ChequesFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'ChequeBook')]")
	private WebElement cheques_ChequebookFeature;

	public WebElement chequesChequebookFeature() {
		return cheques_ChequebookFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'ChequeBook')]//ancestor::a//following-sibling::ul//span[contains(text(),'Update After Approve')]")
	private WebElement chequeBook_UpdateAfterApproveFeature;

	public WebElement chequeBookUpdateAfterApproveFeature() {
		return chequeBook_UpdateAfterApproveFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'ChequeBook')]//ancestor::a//following-sibling::ul//span[text()='Approve']")
	private WebElement chequeBook_ApproveFeature;

	public WebElement chequeBookApproveFeature() {
		return chequeBook_ApproveFeature;
	}

	@FindBy(id = "chequesBookList_GridTbl_Id_P029MA_gs_ctschequesVO.CODE")
	private WebElement chequeBook_SearchChequeCode;

	public WebElement chequeBookSearchChequeCode() {
		return chequeBook_SearchChequeCode;
	}

	@FindBy(id = "chequesBookList_GridTbl_Id_P029P_gs_ctschequesVO.CODE")
	private WebElement chequeBookApprove_SearchChequeCode;

	public WebElement chequeBookApprove_SearchChequeCode() {
		return chequeBookApprove_SearchChequeCode;
	}

	@FindBy(name = "chequesbookCO.ctschequesVO.ALLOW_AUTO_APPROVE_YN")
	private WebElement chequeBook_AllowAutoApproveFlag;

	public WebElement chequeBookAllowAutoApproveFlag() {
		return chequeBook_AllowAutoApproveFlag;
	}

	@FindBy(name = "chequesbookCO.ctschequesVO.ALLOW_AUTO_SUBMIT_YN")
	private WebElement chequeBook_AllowAutoSubmitFlag;

	public WebElement chequeBookAllowAutoSubmitFlag() {
		return chequeBook_AllowAutoSubmitFlag;
	}

	@FindBy(name = "chequesbookCO.ctschequesVO.AUTO_SUBMIT")
	private WebElement chequeBook_AutoSubmitUponApproveFlag;

	public WebElement chequeBookAutoSubmitUponApproveFlag() {
		return chequeBook_AutoSubmitUponApproveFlag;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Cheques / ChequeBook / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookUpdateAfterApprove_TabClose;

	public WebElement chequeBookUpdateAfterApproveTabClose() {
		return chequeBookUpdateAfterApprove_TabClose;
	}

	@FindBy(xpath = "//input[contains(@id,'chq_fr_amendable_')]")
	private WebElement chequeBook_AllowAmendFromNumberFlag;

	public WebElement chequeBookAllowAmendFromNumberFlag() {
		return chequeBook_AllowAmendFromNumberFlag;
	}

	@FindBy(xpath = "//input[contains(@id,'disable_generate_')]")
	private WebElement chequeBook_DisableGenerateFromNumberFlag;

	public WebElement chequeBookDisableGenerateFromNumberFlag() {
		return chequeBook_DisableGenerateFromNumberFlag;
	}

	@FindBy(xpath = "//input[contains(@id,'lookuptxt_in_house_schema')]")
	private WebElement chequebookInHouseSchemaInput;

	public WebElement chequebookInHouseSchemaInput() {
		return chequebookInHouseSchemaInput;
	}

	@FindBy(xpath = "//input[contains(@id,'ctschequeglcyVO.GL_CODE_lookuptxt_tab6_GridTbl_Id')]")
	private WebElement chequeBook_AccountTypeAccessGlcodeInput;

	public WebElement chequeBookAccountTypeAccessGlcodeInput() {
		return chequeBook_AccountTypeAccessGlcodeInput;
	}

	@FindBy(xpath = "//input[contains(@id,'ctschequeglcyVO.CURRENCY_CODE_lookuptxt_tab6_GridTbl_Id_')]")
	private WebElement chequeBook_AccountTypeAccessCurrencyCodeInput;

	public WebElement chequeBookAccountTypeAccessCurrencyCodeInput() {
		return chequeBook_AccountTypeAccessCurrencyCodeInput;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")
	private WebElement chequeBook_AccountTypeAccessOkButton;

	public WebElement chequeBookAccountTypeAccessOkButton() {
		return chequeBook_AccountTypeAccessOkButton;
	}

	@FindBy(xpath = "//td[contains(text(),'Parameters')]")
	private WebElement csmParam_ParameterFeature;

	public WebElement csmParamParameterFeature() {
		return csmParam_ParameterFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'System Parameters')]")
	private WebElement parameters_SystemParametersFeature;

	public WebElement parametersSystemParametersFeature() {
		return parameters_SystemParametersFeature;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement parameter_ControlRecordsFeature;

	public WebElement parameterControlRecordsFeature() {
		return parameter_ControlRecordsFeature;
	}

	@FindBy(xpath = "//td[text()='Control Record']//ancestor::a//following-sibling::ul//span[contains(text(),'Update After Approve')]")
	private WebElement controlRecord_UpdateAfterApproveFeature;

	public WebElement controlRecordUpdateAfterApproveFeature() {
		return controlRecord_UpdateAfterApproveFeature;
	}

	@FindBy(xpath = "//td[text()='Control Record']//ancestor::a//following-sibling::ul//span[text()='Approve']")
	private WebElement controlRecord_ApproveFeature;

	public WebElement controlRecordApproveFeature() {
		return controlRecord_ApproveFeature;
	}

	@FindBy(xpath = "//input[@name='controlrecordCO.ctscontrolVO.CHQBOOK_REJECT_REASON']")
	private WebElement controlRecords_ReasonOnRejectingFlag;

	public WebElement controlRecordsReasonOnRejectingFlag() {
		return controlRecords_ReasonOnRejectingFlag;
	}

	@FindBy(name = "controlrecordCO.ctscontrolVO.CHQBOOK_PROCESS")
	private WebElement controlRecords_AdvancedChequebookProcessFlag;

	public WebElement controlRecordsAdvancedChequebookProcessFlag() {
		return controlRecords_AdvancedChequebookProcessFlag;
	}

	@FindBy(xpath = "//a[contains(text(), 'Other Information ')]")
	private WebElement controlRecords_OtherInformationTab;

	public WebElement controlRecordsOtherInformationTab() {
		return controlRecords_OtherInformationTab;
	}

	@FindBy(xpath = "//input[@name='controlrecordCO.ctscontrolVO.REJECTION_REASON_MAND_YN']")
	private WebElement controlRecords_RejectReasonMandatoryFlag;

	public WebElement controlRecordsRejectReasonMandatoryFlag() {
		return controlRecords_RejectReasonMandatoryFlag;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Control Record / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement controlRecords_ControlRecordUpdateAfterApprove;

	public WebElement controRecordUpdatAfterApproveTabClose() {
		return controlRecords_ControlRecordUpdateAfterApprove;
	}

	@FindBy(xpath = "//a[contains(text(),' Alert Activation ')]")
	private WebElement controlRecords_AlertActivationTab;

	public WebElement controlRecordsAlertActivationTab() {
		return controlRecords_AlertActivationTab;
	}

	@FindBy(xpath = "//span[contains(text(),'Account Balance Overdrawn')]//parent::td//div/div")
	private WebElement alertActivationTab_AccountBalanceOverDrawn;

	public WebElement alertActivationTabAccountBalanceOverDrawn() {
		return alertActivationTab_AccountBalanceOverDrawn;
	}

	@FindBy(xpath = "//span[contains(text(),'Staff Accounts Transaction')]//parent::td")
	private WebElement alertActivationTab_StaffAccountTransactions;

	public WebElement alertActivationTabStaffAccountTransactions() {
		return alertActivationTab_StaffAccountTransactions;
	}

	@FindBy(xpath = "//span[contains(text(),'Staff Accounts Transaction')]//parent::td//following-sibling::td[1]//input")
	private WebElement alertActivationTab_StaffAccountTransactionsCheckBox;

	public WebElement alertActivationTabStaffAccountTransactionsCheckBox() {
		return alertActivationTab_StaffAccountTransactionsCheckBox;
	}

	@FindBy(xpath = "//span[contains(text(),'Amendment of CIF')]//ancestor::td[@title='Amendment of CIF']")
	private WebElement alertActivationTab_AmendCIFSection;

	public WebElement alertActivationTabAmendCIFSection() {
		return alertActivationTab_AmendCIFSection;
	}

	@FindBy(xpath = "//span[contains(text(),'Reinstate CIF')]//parent::td//following-sibling::td//input")
	private WebElement alertActivation_residentCIFFlagStatus;

	public WebElement alertActivationresidentCIFFlagStatus() {
		return alertActivation_residentCIFFlagStatus;
	}

	@FindBy(xpath = "(//td[@title='Account Balance Overdrawn']/div/div)[1]")
	private WebElement alertActivation_AccountBalanceOverdrawnSection;

	public WebElement alertActivationAccountBalanceOverdrawnSection() {
		return alertActivation_AccountBalanceOverdrawnSection;
	}

	@FindBy(xpath = "//span[contains(text(),'Account Dormant')]")
	private WebElement alertActivation_AccountDormantLabel;

	public WebElement alertActivationAccountDormantLabel() {
		return alertActivation_AccountDormantLabel;
	}

	@FindBy(xpath = "//span[contains(text(),'Account Dormant')]//parent::td//following-sibling::td//input")
	private WebElement alertActivation_AccountDormantFlagStatus;

	public WebElement alertActivationAccountDormantFlagStatus() {
		return alertActivation_AccountDormantFlagStatus;
	}

	@FindBy(xpath = "(//span[contains(text(),'CIF is Non-Resident')]//parent::td//following-sibling::td//input)[1]")
	private WebElement alertActivation_CIFisNonResidentFlagStatus;

	public WebElement alertActivationCIFisNonResidentFlagStatus() {
		return alertActivation_CIFisNonResidentFlagStatus;
	}

	@FindBy(xpath = "(//span[contains(text(),'CIF is Non-Resident')])[1]")
	private WebElement alertActivation_CIFisNonResidentLabel;

	public WebElement alertActivationCIFisNonResidentLabel() {
		return alertActivation_CIFisNonResidentLabel;
	}

	@FindBy(xpath = "(//span[contains(text(),'No Signature Found')]//parent::td//following-sibling::td//input)[1]")
	private WebElement alertActivation_NoSignatureFoundFlagStatus;

	public WebElement alertActivationNoSignatureFoundFlagStatus() {
		return alertActivation_NoSignatureFoundFlagStatus;
	}

	@FindBy(xpath = "//td[@title='0026-No Signature Found']//span")
	private WebElement alertActivation_NoSignatureFoundLabel;

	public WebElement alertActivationNoSignatureFoundLabel() {
		return alertActivation_NoSignatureFoundLabel;
	}

	@FindBy(xpath = "(//span[contains(text(),'Value Date Changed')])[1]")
	private WebElement alertActivation_ValueDateChangedLabel;

	public WebElement alertActivationValueDateChangedLabel() {
		return alertActivation_ValueDateChangedLabel;
	}

	@FindBy(xpath = "(//span[contains(text(),'Value Date Changed')]//parent::td//following-sibling::td//input)[1]")
	private WebElement alertActivation_ValueDateChangedFlag;

	public WebElement alertActivationValueDateChangedFlag() {
		return alertActivation_ValueDateChangedFlag;
	}

	@FindBy(xpath = "(//span[contains(text(),'Overdraw Limit Exceeded')])[1]")
	private WebElement alertActivation_OverdrawLimitExceededLabel;

	public WebElement alertActivationOverdrawLimitExceededLabel() {
		return alertActivation_OverdrawLimitExceededLabel;
	}

	@FindBy(xpath = "(//span[contains(text(),'Overdraw Limit Exceeded')]//parent::td//following-sibling::td//input)[1]")
	private WebElement alertActivation_OverdrawLimitExceededFlagStatus;

	public WebElement alertActivationOverdrawLimitExceededFlagStatus() {
		return alertActivation_OverdrawLimitExceededFlagStatus;
	}

	@FindBy(xpath = "(//td[@title='KYC Outstanding']/div/div[1])[1]")
	private WebElement alertActivation_KYCOutStandingLabel;

	public WebElement alertActivationKYCOutStandingLabel() {
		return alertActivation_KYCOutStandingLabel;
	}

	@FindBy(xpath = "//td[@title='KYC Outstanding']//following-sibling::td//input")
	private WebElement alertActivation_KYCOutStandingFlagStatus;

	public WebElement alertActivationKYCOutStandingFlagStatus() {
		return alertActivation_KYCOutStandingFlagStatus;
	}

	@FindBy(xpath = "//input[starts-with(@id,'apply_chq_print_third_party_yn_') and @type='checkbox']")
	private WebElement controlRecord_ApplyChequebookThroughThirdPartyFlag;

	public WebElement controlRecordApplyChequebookThroughThirdPartyFlag() {
		return controlRecord_ApplyChequebookThroughThirdPartyFlag;
	}

	@FindBy(id = "auditButton_O001UP")
	private WebElement controlRecords_AuditButton;

	public WebElement controlRecordsAuditButton() {
		return controlRecords_AuditButton;
	}

	@FindBy(name = "ACTION_DATE")
	private WebElement controlRecordsAudit_ActionDate;

	public WebElement controlRecordsAuditActionDate() {
		return controlRecordsAudit_ActionDate;
	}

	@FindBy(name = "USER_ID")
	private WebElement controlRecordsAudit_UserName;

	public WebElement controlRecordsAuditUserName() {
		return controlRecordsAudit_UserName;
	}

	@FindBy(id = "__overlayClose")
	private WebElement controlRecords_AuditTabClose;

	public WebElement controlRecordsAuditTabClose() {
		return controlRecords_AuditTabClose;
	}

//Gowri**********************************************************************************
	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement ChequeBookRequest;

	public WebElement ChequeBookRequest() {
		return ChequeBookRequest;
	}

	@FindBy(xpath = "//span[text()='In Branch']")
	private WebElement ChequeBookInBranch;

	public WebElement ChequeBookInBranch() {
		return ChequeBookInBranch;
	}

	@FindBy(xpath = "//td[text()='Send To/Receive From Provider']")
	private WebElement ReceiveFromProviderSelect;

	public WebElement ReceiveFromProviderSelect() {
		return ReceiveFromProviderSelect;
	}

	@FindBy(xpath = "//span[text()='Send To Provider']")
	private WebElement sendToProviderButton;

	public WebElement sendToProviderButton() {
		return sendToProviderButton;
	}

	@FindBy(id = "chqBkImpExpGridTbl_Id_Q000TP_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInSendToProviderScreen;

	public WebElement searchChequeBookCodeInSendToProviderScreen() {
		return searchChequeBookCodeInSendToProviderScreen;
	}

	@FindBy(xpath = "//table[@id='chequeBookImpExpTbl_Q000TP']//following-sibling::table//a[2]")
	private WebElement chequebookSentToProviderProceedButton;

	public WebElement chequebookSentToProviderProceedButton() {
		return chequebookSentToProviderProceedButton;
	}

	@FindBy(xpath = "//label[text()='Batch No ']//parent::td//following-sibling::td//select")
	private WebElement BatchNoSelect;

	public WebElement BatchNoSelect() {
		return BatchNoSelect;
	}

	@FindBy(id = "td_chqBkImpExpGridTbl_Id_Q000TP_0_cb")
	private WebElement SelectCheckBox;

	public WebElement SelectCheckBox() {
		return SelectCheckBox;
	}

	@FindBy(xpath = "//a[@role='button' and .=' Proceed ']")
	private WebElement proceedButtonInSendToProviderScreen;

	public WebElement proceedButtonInSendToProviderScreen() {
		return proceedButtonInSendToProviderScreen;
	}

	@FindBy(xpath = "//table[@id='chequeBookImpExpTbl_Q000RP']//following-sibling::table//a[contains(@id,'anchor_')]")
	private WebElement ProceedButton;

	public WebElement ProceedButton() {
		return ProceedButton;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement MaintenanceButton;

	public WebElement MaintenanceButton() {
		return MaintenanceButton;
	}

	@FindBy(id = "infoBarSearchButton_Q000MT")
	private WebElement SearchIcon;

	public WebElement SearchIcon() {
		return SearchIcon;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE")
	private WebElement ChequeBookCode;

	public WebElement ChequeBookCode() {
		return ChequeBookCode;
	}

	@FindBy(xpath = "//td[text()='Sent to Provider']")
	private WebElement sendToProviderValidateMessage;

	public WebElement sendToProviderValidateMessage() {
		return sendToProviderValidateMessage;
	}

	@FindBy(xpath = "//td[text()='Send to Branch']")
	private WebElement ValidateMessage;

	public WebElement ValidateMessage() {
		return ValidateMessage;
	}

	@FindBy(xpath = "//span[text()='To Reactivate']")
	private WebElement toReactivateScreen;

	public WebElement toReactivateScreen() {
		return toReactivateScreen;
	}

	@FindBy(xpath = "//td[text()='470']")
	private WebElement chequeBookCode;

	public WebElement chequeBookCode() {
		return chequeBookCode;
	}

	@FindBy(xpath = "//span[text()='Reactivate']")
	private WebElement reactivateScreen;

	public WebElement reactivateScreen() {
		return reactivateScreen;
	}

	@FindBy(xpath = "//label[text()='Reactivate ']")
	private WebElement reactivateClickButton;

	public WebElement reactivateClickButton() {
		return reactivateClickButton;
	}

	@FindBy(xpath = "(//a[text()=' Search '])[2]")
	private WebElement searchIcon;

	public WebElement searchIcon() {
		return searchIcon;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000MT_1_statusDesc']")
	private WebElement validatePopup;

	public WebElement validatePopup() {
		return validatePopup;
	}

	@FindBy(xpath = "//span[text()='To Be Reversed Chequebook']")
	private WebElement toBeReversedChequeBook;

	public WebElement toBeReversedChequeBook() {
		return toBeReversedChequeBook;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AR_gs_ctschqbookVO.CODE']")
	private WebElement chequeBookCodeToBeReversed;

	public WebElement chequeBookCodeToBeReversed() {
		return chequeBookCodeToBeReversed;
	}

	@FindBy(xpath = "//div[text()=' Do You Want To Proceed?']")
	private WebElement confirmMessagePopup;

	public WebElement confirmMessagePopup() {
		return confirmMessagePopup;
	}

	@FindBy(xpath = "//input[@value='Ok ']")
	private WebElement clickOkButton;

	public WebElement clickOkButton() {
		return clickOkButton;
	}

	@FindBy(xpath = "//label[text()='To Be Reversed ']")
	private WebElement clickTheToBeReversedButton;

	public WebElement clickTheToBeReversedButton() {
		return clickTheToBeReversedButton;
	}

	@FindBy(xpath = "//div[text()=' Do You Want To Proceed?']")
	private WebElement proceedMessagePopup;

	public WebElement proceedMessagePopup() {
		return proceedMessagePopup;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE")
	private WebElement maintenanceChequeBookCode;

	public WebElement maintenanceChequeBookCode() {
		return maintenanceChequeBookCode;
	}

	@FindBy(xpath = "//td[text()='Reversed']")
	private WebElement statusPopupMessage;

	public WebElement statusPopupMessage() {
		return statusPopupMessage;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000RV_gs_ctschqbookVO.CODE")
	private WebElement reverseChequeBookCode;

	public WebElement reverseChequeBookCode() {
		return reverseChequeBookCode;
	}

	@FindBy(xpath = "//span[text()='Reverse Chequebook']")
	private WebElement reverseChequeBookScreen;

	public WebElement reverseChequeBookScreen() {
		return reverseChequeBookScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000AR_1_ctschqbookVO.CODE")
	private WebElement doubleClickTheRecord;

	public WebElement doubleClickTheRecord() {
		return doubleClickTheRecord;
	}

	// ***************************Creation of
	// chequebook*****************************************//

	// *********************check the field collected by
	// id*************************************************//
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement submitScreenChequeBookRequest;

	public WebElement submitScreenChequeBookRequest() {
		return submitScreenChequeBookRequest;
	}

	@FindBy(id = "infoBarSearchButton_Q000SB")
	private WebElement searchIconInSubmitScreen;

	public WebElement searchIconInSubmitScreen() {
		return searchIconInSubmitScreen;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.CODE")
	private WebElement chequeCodeInSubmitScreen;

	public WebElement chequeCodeInSubmitScreen() {
		return chequeCodeInSubmitScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000SB_1_ctschqbookVO.CODE")
	private WebElement doubleClickInSubmitScreen;

	public WebElement doubleClickInSubmitScreen() {
		return doubleClickInSubmitScreen;
	}

	@FindBy(xpath = "//span[text()='Request Information']//parent::div//child::span/span")
	private WebElement requestInformationInSubmitScreen;

	public WebElement requestInformationInSubmitScreen() {
		return requestInformationInSubmitScreen;
	}

	@FindBy(id = "lookuptxt_collected_by_id_Q000SB")
	private WebElement collectedByIdField;

	public WebElement collectedByIdField() {
		return collectedByIdField;
	}

	// ***********************Chequebook creation in maintenance screen under
	// checkbook request****************************//

	@FindBy(xpath = "//label[@id='lbl_num_of_chqbooks_Q000MT']//parent::td//following-sibling::td//input")
	private WebElement numberOfChequeBooksInMaintenance;

	public WebElement numberOfChequeBooksInMaintenance() {
		return numberOfChequeBooksInMaintenance;
	}

	@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000MT")
	private WebElement chequeCodeInMaintenanceScreen;

	public WebElement chequeCodeInMaintenanceScreen() {
		return chequeCodeInMaintenanceScreen;
	}

	@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[1]")
	private WebElement branchCodeInMaintenanceScreen;

	public WebElement branchCodeInMaintenanceScreen() {
		return branchCodeInMaintenanceScreen;
	}

	@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[2]")
	private WebElement currencyCodeInMaintenanceScreen;

	public WebElement currencyCodeInMaintenanceScreen() {
		return currencyCodeInMaintenanceScreen;
	}

	@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[3]")
	private WebElement glCodeInMaintenanceScreen;

	public WebElement glCodeInMaintenanceScreen() {
		return glCodeInMaintenanceScreen;
	}

	@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[4]")
	private WebElement cifCodeInMaintenanceScreen;

	public WebElement cifCodeInMaintenanceScreen() {
		return cifCodeInMaintenanceScreen;
	}

	@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[5]")
	private WebElement serialNoInMaintenanceScreen;

	public WebElement serialNoInMaintenanceScreen() {
		return serialNoInMaintenanceScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000MT_btn_save")
	private WebElement saveButtonInMaintenanceScreen;

	public WebElement saveButtonInMaintenanceScreen() {
		return saveButtonInMaintenanceScreen;
	}

	@FindBy(xpath = "//a[text()='Chequebook Request / Maintenance']")
	private WebElement randomClickInChequeBookCreation;

	public WebElement randomClickInChequeBookCreation() {
		return randomClickInChequeBookCreation;
	}

	// ********************creation of cif in FOM********************************//

	@FindBy(xpath = "//td[text()='Front Office Management']")
	private WebElement frontOfficeManagementScreen;

	public WebElement frontOfficeManagementScreen() {
		return frontOfficeManagementScreen;
	}

	@FindBy(id = "infoBarSearchButton_F00I1MT")
	private WebElement searchIconInMaintenanceScreen;

	public WebElement searchIconInMaintenanceScreen() {
		return searchIconInMaintenanceScreen;
	}

	@FindBy(id = "fomGridTbl_Id_F00I1MT_gs_cifVO.STATUS")
	private WebElement statusButtonInMaintenanceScreen;

	public WebElement statusButtonInMaintenanceScreen() {
		return statusButtonInMaintenanceScreen;
	}

	@FindBy(id = "fomMaintForm_F00I1MT_CIF_Products_key")
	private WebElement cifProducts;

	public WebElement cifProducts() {
		return cifProducts;
	}

	@FindBy(id = "cifProductsVO_SHORT_ACC_NAME_ENG_F00I1MT")
	private WebElement accountBriefName;

	public WebElement accountBriefName() {
		return accountBriefName;
	}

	@FindBy(id = "cifProductsVO_SHORT_ACC_NAME_ARAB_F00I1MT")
	private WebElement necessaryFieldInChequeBook;

	public WebElement necessaryFieldInChequeBook() {
		return necessaryFieldInChequeBook;
	}

	@FindBy(id = "cifProductsVO_ISSUE_CHQBK_F00I1MT")
	private WebElement clickCheckBoXInFomScreen;

	public WebElement clickCheckBoXInFomScreen() {
		return clickCheckBoXInFomScreen;
	}

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveButtonInFomScreen;

	public WebElement saveButtonInFomScreen() {
		return saveButtonInFomScreen;
	}

	@FindBy(xpath = "//div[text()='[1717] User Has No Access To Modify Any CIF Information .']")
	private WebElement errorPopupMessageInFom;

	public WebElement errorPopupMessageInFom() {
		return errorPopupMessageInFom;
	}

	// @CHB_049 testcase
	@FindBy(xpath = "//span[text()='Apply to Submit']")
	private WebElement applyToSubmitScreen;

	public WebElement applyToSubmitScreen() {
		return applyToSubmitScreen;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.CODE")
	private WebElement checkCodeInApplyToSubmit;

	public WebElement checkCodeInApplyToSubmit() {
		return checkCodeInApplyToSubmit;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TR_1_ctschqbookVO.CODE")
	private WebElement doubleClickInApplyToSubmitScreen;

	public WebElement doubleClickInApplyToSubmitScreen() {
		return doubleClickInApplyToSubmitScreen;
	}

	@FindBy(id = "infoBarSearchButton_Q000TR")
	private WebElement searchIconInApplyToSubmit;

	public WebElement searchIconInApplyToSubmit() {
		return searchIconInApplyToSubmit;
	}

	// @CHB_078
	@FindBy(id = "from_number_Q000TR")
	private WebElement fromNumber;

	public WebElement fromNumber() {
		return fromNumber;
	}

	@FindBy(id = "number_to_Q000TR")
	private WebElement toNumber;

	public WebElement toNumber() {
		return toNumber;
	}

	// @CHB_050
	@FindBy(id = "approveBut_Q000TR")
	private WebElement bmApproval;

	public WebElement bmApproval() {
		return bmApproval;
	}

	@FindBy(id = "usr_name_alert_Q000TR")
	private WebElement usernameInBmApproval;

	public WebElement usernameInBmApproval() {
		return usernameInBmApproval;
	}

	@FindBy(id = "pwd_alert_Q000TR")
	private WebElement passwordInBmApproval;

	public WebElement passwordInBmApproval() {
		return passwordInBmApproval;
	}

	@FindBy(id = "sendButtonForApprove_Q000TR")
	private WebElement submitButtonINBmApproval;

	public WebElement submitButtonINBmApproval() {
		return submitButtonINBmApproval;
	}

	@FindBy(id = "Approve_key")
	private WebElement approveButtonInBmApproval;

	public WebElement approveButtonInBmApproval() {
		return approveButtonInBmApproval;
	}

	// CHB_082
	@FindBy(xpath = "//div[text()=' Do You Want To Proceed?']")
	private WebElement confirmErrorMessagePopup;

	public WebElement confirmErrorMessagePopup() {
		return confirmErrorMessagePopup;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement okButtonInReverseChequeBookSubMenu;

	public WebElement okButtonInReverseChequeBookSubMenu() {
		return okButtonInReverseChequeBookSubMenu;
	}

	@FindBy(id = "from_number_Q000MT")
	private WebElement fromNumberInMaintenanceScreen;

	public WebElement fromNumberInMaintenanceScreen() {
		return fromNumberInMaintenanceScreen;
	}

	@FindBy(id = "number_to_Q000MT")
	private WebElement toNumberInMaintenanceScreen;

	public WebElement toNumberInMaintenanceScreen() {
		return toNumberInMaintenanceScreen;
	}

	// CHB_085

	@FindBy(id = "chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE")
	private WebElement codeInToCancelScreen;

	public WebElement codeInToCancelScreen() {
		return codeInToCancelScreen;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AC_gs_ctschqbookVO.CODE")
	private WebElement codeInApproveCancelScreen;

	public WebElement codeInApproveCancelScreen() {
		return codeInApproveCancelScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000AC_5_ctschqbookVO.CHEQUE_CODE")
	private WebElement retrieveTheRecord;

	public WebElement retrieveTheRecord() {
		return retrieveTheRecord;
	}

	// CHB_141
	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement toBeDestroyedScreen;

	public WebElement toBeDestroyedScreen() {
		return toBeDestroyedScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TD_1_ctschqbookVO.CODE")
	private WebElement retrieveApprovedRecordInToBeDestroyedScreen;

	public WebElement retrieveApprovedRecordInToBeDestroyedScreen() {
		return retrieveApprovedRecordInToBeDestroyedScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000TD_to_destroy_key")
	private WebElement toDestroyButton;

	public WebElement toDestroyButton() {
		return toDestroyButton;
	}

	@FindBy(id = "status_remarks_Q000TD")
	private WebElement reasonMessage;

	public WebElement reasonMessage() {
		return reasonMessage;
	}

	@FindBy(xpath = "//span[text()='Approve Destroyed']")
	private WebElement approveDestroyedScreen;

	public WebElement approveDestroyedScreen() {
		return approveDestroyedScreen;
	}

	@FindBy(id = "infoBarSearchButton_Q000AD")
	private WebElement searchIconInApproveDestroyedScreen;

	public WebElement searchIconInApproveDestroyedScreen() {
		return searchIconInApproveDestroyedScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000AD_5_ctschqbookVO.CODE")
	private WebElement doubleClickTheRecordInApproveDestroyedScreen;

	public WebElement doubleClickTheRecordInApproveDestroyedScreen() {
		return doubleClickTheRecordInApproveDestroyedScreen;
	}

	// chequeBookCreation_OkbuttonWarningPopUp()
	@FindBy(id = "chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE")
	private WebElement chequeCodeInApproveDestroyedScreen;

	public WebElement chequeCodeInApproveDestroyedScreen() {
		return chequeCodeInApproveDestroyedScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000AD_1_ctschqbookVO.CODE")
	private WebElement retrieveRecordInApproveDestroyedScreen;

	public WebElement retrieveRecordInApproveDestroyedScreen() {
		return retrieveRecordInApproveDestroyedScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000AD_reject_key")
	private WebElement rejectButton;

	public WebElement rejectButton() {
		return rejectButton;
	}

	// CHB_142
	// toBeReversedChequeBook
	// doubleClickTheRecord
	// clickTheToBeReversedButton
	// okButtonInReverseChequeBookSubMenu
	// reverseChequeBookScreen
	// reverseChequeBookCode
	// chequeBookCreation_OkbuttonWarningPopUp

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000RV_1_statusDesc")
	private WebElement retrieveRecordInReverseChequeBookSubMenu;

	public WebElement retrieveRecordInReverseChequeBookSubMenu() {
		return retrieveRecordInReverseChequeBookSubMenu;
	}

	@FindBy(xpath = "//label[text()='Reject ']")
	private WebElement rejectButtonInReverseChequeBookSubMenu;

	public WebElement rejectButtonInReverseChequeBookSubMenu() {
		return rejectButtonInReverseChequeBookSubMenu;
	}

	@FindBy(xpath = "//div[text()='[890] Invalid/Missing Reason Code']")
	private WebElement validatePopupInReverseChequeBookSubMenu;

	public WebElement validatePopupInReverseChequeBookSubMenu() {
		return validatePopupInReverseChequeBookSubMenu;
	}

	@FindBy(id = "status_remarks_Q000RV")
	private WebElement reasonBox;

	public WebElement reasonBox() {
		return reasonBox;
	}

	// prerequesties for this test case CHB_179
	// CHB_179

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement csmParamsAccountsParameters;

	public WebElement csmParams_AccountsParameters() {
		return csmParamsAccountsParameters;
	}

	@FindBy(xpath = "//td[text()='General Ledger']")
	private WebElement genralLedgerInParams;

	public WebElement genralLedgerInParams() {
		return genralLedgerInParams;
	}

	@FindBy(id = "genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE")
	private WebElement csmParam_General_ledger_Approve_inputField;

	public WebElement csmParam_General_ledger_Approve_inputField() {
		return csmParam_General_ledger_Approve_inputField;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveButton;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveButton() {
		return csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveButton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveAbutton_Ok;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveAbutton_Ok() {
		return csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveAbutton_Ok;
	}

	// test case 142
	// @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	// private WebElement chequeBookCreation_OkbuttonWarningPopUp;
	// public WebElement chequeBookCreation_OkbuttonWarningPopUp() {
//		return chequeBookCreation_OkbuttonWarningPopUp;
	// }

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement searchChequeCodeInCBMaintenance;

	public WebElement searchChequeCodeInCBMaintenance() {
		return searchChequeCodeInCBMaintenance;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_BR']")
	private WebElement searchBranchCodeInCBMaintenance;

	public WebElement searchBranchCodeInCBMaintenance() {
		return searchBranchCodeInCBMaintenance;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_CY']")
	private WebElement searchCurrenyCodeInCBMaintenance;

	public WebElement searchCurrenyCodeInCBMaintenance() {
		return searchCurrenyCodeInCBMaintenance;
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

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement controlRecordSubMenu;

	public WebElement controlRecordSubMenu() {
		return controlRecordSubMenu;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement controlRecordSubMenuUpdateAfterApprove;

	public WebElement controlRecordSubMenuUpdateAfterApprove() {
		return controlRecordSubMenuUpdateAfterApprove;
	}

	@FindBy(id = "chqbook_reject_reason_O001UP")
	private WebElement controlRecordReasonOnRejectingFlag;

	public WebElement controlRecordReasonOnRejectingFlag() {
		return controlRecordReasonOnRejectingFlag;
	}

	@FindBy(xpath = "//a[text()=' Other Information ']")
	private WebElement controlRecordOtherInformationTab;

	public WebElement controlRecordOtherInformationTab() {
		return controlRecordOtherInformationTab;
	}

	@FindBy(id = "rejection_reason_mand_yn_O001UP")
	private WebElement controlRecordRecordsRejectionFlag;

	public WebElement controlRecordRecordsRejectionFlag() {
		return controlRecordRecordsRejectionFlag;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement updateAfterApproveButtonInControlRecord;

	public WebElement updateAfterApproveButtonInControlRecord() {
		return updateAfterApproveButtonInControlRecord;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement confirmOKButtonInControlRecord;

	public WebElement confirmOKButtonInControlRecord() {
		return confirmOKButtonInControlRecord;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement successOKButtonInControlRecord;

	public WebElement successOKButtonInControlRecord() {
		return successOKButtonInControlRecord;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement controlRecordApproveSubmenu;

	public WebElement controlRecordApproveSubmenu() {
		return controlRecordApproveSubmenu;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement controlRecordApproveSubmenuApproveButton;

	public WebElement controlRecordApproveSubmenuApproveButton() {
		return controlRecordApproveSubmenuApproveButton;
	}

	// chb_51
	@FindBy(id = "lookuptxt_cifVO_CIF_TYPE_F00I1MT")
	private WebElement frontOfficeManagementCifType;

	public WebElement frontOfficeManagementCifType() {
		return frontOfficeManagementCifType;
	}

	@FindBy(id = "lookuptxt_cifVO_CIF_TYPE_F00I1MT")
	private WebElement csm_Fom_Cif_Type;

	public WebElement csm_Fom_Cif_Type() {
		return csm_Fom_Cif_Type;
	}

	@FindBy(id = "lookuptxt_cifVO_ID_TYPE_F00I1MT")
	private WebElement csm_Fom_IdType;

	public WebElement csm_Fom_IdType() {
		return csm_Fom_IdType;
	}

	@FindBy(name = "fomCO.cifVO.ID_NO")
	private WebElement csm_Fom_Value_Id;

	public WebElement csm_Fom_Value_Id() {
		return csm_Fom_Value_Id;
	}

	@FindBy(name = "fomCO.cifVO.BIRTH_DATE")
	private WebElement csm_Fom_DateOfBirth_Input;

	public WebElement csm_Fom_DateOfBirth_Input() {
		return csm_Fom_DateOfBirth_Input;
	}

	@FindBy(xpath = "//select[@name='fomCO.cifVO.MARITAL_STATUS']")
	private WebElement csm_Fom_MartialStatus_Input;

	public WebElement csm_Fom_MartialStatus_Input() {
		return csm_Fom_MartialStatus_Input;
	}

	@FindBy(xpath = "//select[@id='cifVO_SEXE_F00I1MT']")
	private WebElement csm_Fom_Gender_Input;

	public WebElement csm_Fom_Gender_Input() {
		return csm_Fom_Gender_Input;
	}

	@FindBy(xpath = "//select[@id='cifVO_LANGUAGE_F00I1MT']")
	private WebElement csm_Fom_Language_Input;

	public WebElement csm_Fom_Language_Input() {
		return csm_Fom_Language_Input;
	}

	@FindBy(name = "fomCO.cifVO.SHORT_NAME_ENG")
	private WebElement csm_Fom_ShortName_Input;

	public WebElement csm_Fom_ShortName_Input() {
		return csm_Fom_ShortName_Input;
	}

	@FindBy(name = "fomCO.cifVO.LONG_NAME_ENG")
	private WebElement csm_Fom_LongName_Input;

	public WebElement csm_Fom_LongName_Input() {
		return csm_Fom_LongName_Input;
	}

	@FindBy(name = "fomCO.cifVO.CARD_NAME")
	private WebElement csm_Fom_CardName_Input;

	public WebElement csm_Fom_CardName_Input() {
		return csm_Fom_CardName_Input;
	}

	@FindBy(name = "addressCO.ADDRESS1_ENG")
	private WebElement csm_Fom_Block_Input;

	public WebElement csm_Fom_Block_Input() {
		return csm_Fom_Block_Input;
	}

	@FindBy(xpath = "(//span[text()='Additional Details'])[1]")
	private WebElement csm_Fom_Additional_Details_Tab;

	public WebElement csm_Fom_Additional_Details_Tab() {
		return csm_Fom_Additional_Details_Tab;
	}

	@FindBy(id = "lookuptxt_cifVO_ECO_SECTOR_F00I1MT")
	private WebElement csm_Fom_Economic_Sector_Input;

	public WebElement csm_Fom_Economic_Sector_Input() {
		return csm_Fom_Economic_Sector_Input;
	}

	@FindBy(id = "lookuptxt_cifVO_PRIORITY_CODE_F00I1MT")
	private WebElement csm_Fom_Ranking_Input;

	public WebElement csm_Fom_Ranking_Input() {
		return csm_Fom_Ranking_Input;
	}

	@FindBy(name = "addressCO.TEL")
	private WebElement csm_Fom_HomeTel_Input;

	public WebElement csm_Fom_HomeTel_Input() {
		return csm_Fom_HomeTel_Input;
	}

	@FindBy(name = "addressCO.WORK_TEL")
	private WebElement csm_Fom_WorkTel_Input;

	public WebElement csm_Fom_WorkTel_Input() {
		return csm_Fom_WorkTel_Input;
	}

	@FindBy(id = "fomMaintForm_F00I1MT_Save_key")
	private WebElement csm_Fom_Save_Button;

	public WebElement csm_Fom_Save_Button() {
		return csm_Fom_Save_Button;
	}

//Ajith*******************************************
	@FindBy(xpath = "//a[@id='P029MA']")
	private WebElement updateAfterApprove_ChequeBook_482;

	public WebElement updateAfterApprove_ChequeBook_482() {
		return updateAfterApprove_ChequeBook_482;
	}

	@FindBy(xpath = "//div[@id='_selenuimP0058']//td[text()='ChequeBook']")
	private WebElement chequeBook_Params_482;

	public WebElement chequeBook_Params_482() {
		return chequeBook_Params_482;
	}

	@FindBy(xpath = "//div[@id='_selenuimP0058']//td[text()='Cheques']")
	private WebElement cheques_Params_482;

	public WebElement cheques_Params_482() {
		return cheques_Params_482;
	}

	@FindBy(xpath = "//div[@id='_selenuimO001']//td[text()='Control Record']")
	private WebElement controlRecord_Params_482;

	public WebElement controlRecord_Params_482() {
		return controlRecord_Params_482;
	}

	@FindBy(xpath = "//div[@id='_selenuimSP001']//td[text()='System Parameters']")
	private WebElement systemParameters_Params_482;

	public WebElement systemParameters_Params_482() {
		return systemParameters_Params_482;
	}

	@FindBy(xpath = "//div[@id='_selenuimP000']//td[text()='Parameters']")
	private WebElement parameters_Params_482;

	public WebElement parameters_Params_482() {
		return parameters_Params_482;
	}

	@FindBy(xpath = "//input[@id='chequesBookList_GridTbl_Id_P029MA_gs_ctschequesVO.CODE']")
	private WebElement searchChequeBookCodeInUpdateAfterApprove_482;

	public WebElement searchChequeBookCodeInUpdateAfterApprove_482() {
		return searchChequeBookCodeInUpdateAfterApprove_482;
	}

	@FindBy(xpath = "//td[@id='td_chequesBookList_GridTbl_Id_P029MA_1_ctschequesVO.CODE']")
	private WebElement selectSearchedChequeBookCodeInUpdateAfterApprove_482;

	public WebElement selectSearchedChequeBookCodeInUpdateAfterApprove_482() {
		return selectSearchedChequeBookCodeInUpdateAfterApprove_482;
	}

	@FindBy(xpath = "//input[@id='chequesBookList_GridTbl_Id_P029P_gs_ctschequesVO.CODE']")
	private WebElement searchChequeBookCodeInrApproveScreen_482;

	public WebElement searchChequeBookCodeInrApproveScreen_482() {
		return searchChequeBookCodeInrApproveScreen_482;
	}

	@FindBy(xpath = "//td[@id='td_chequesBookList_GridTbl_Id_P029P_1_ctschequesVO.CODE']")
	private WebElement selectSearchedChequeBookCodeInApproveScreen_482;

	public WebElement selectSearchedChequeBookCodeInApproveScreen_482() {
		return selectSearchedChequeBookCodeInApproveScreen_482;
	}

	@FindBy(xpath = "//label[@id='chequesBookMaint_FormId_P029P_Approve_key']")
	private WebElement approveButtonInApproveScreen_482;

	public WebElement approveButtonInApproveScreen_482() {
		return approveButtonInApproveScreen_482;
	}

	@FindBy(xpath = "//label[@id='chequesBookMaint_FormId_P029MA_Update_After_Approve_key']")
	private WebElement updateAfterApproveButtonInUpdateApproveScreen_482;

	public WebElement updateAfterApproveButtonInUpdateApproveScreen_482() {
		return updateAfterApproveButtonInUpdateApproveScreen_482;
	}

	@FindBy(xpath = "//input[@id='chqbook_process_O001UP']")
	private WebElement chequeBookAdvancedProcessCheckBox_482;

	public WebElement chequeBookAdvancedProcessCheckBox_482() {
		return chequeBookAdvancedProcessCheckBox_482;
	}

	@FindBy(xpath = "//div[@id='_selenuimO001']//td[text()='Control Record']")
	private WebElement controlRecords_482;

	public WebElement controlRecords_482() {
		return controlRecords_482;
	}

	@FindBy(xpath = "//a[@id='O001UP']//span[text()='Update After Approve']")
	private WebElement updateAfterApproveControlRecords_482;

	public WebElement updateAfterApproveControlRecords_482() {
		return updateAfterApproveControlRecords_482;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']/ancestor::button")
	private WebElement updateAfterApproveButtonControlRecords_482;

	public WebElement updateAfterApproveButtonControlRecords_482() {
		return updateAfterApproveButtonControlRecords_482;
	}

	@FindBy(xpath = "//a[@id='O001P']//span[text()='Approve']")
	private WebElement approveScreenControlRecords_482;

	public WebElement approveScreenControlRecords_482() {
		return approveScreenControlRecords_482;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']/ancestor::button")
	private WebElement approveButtonControlRecords_482;

	public WebElement approveButtonControlRecords_482() {
		return approveButtonControlRecords_482;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement confirmOk_Params_482;

	public WebElement confirmOk_Params_482() {
		return confirmOk_Params_482;
	}

	@FindBy(xpath = "//a[@id='P029P']")
	private WebElement approveScreen_482;

	public WebElement approveScreen_ChequeBook_482() {
		return approveScreen_482;
	}

	@FindBy(xpath = "//input[@id='require_cancel_reason_P029MA']")
	private WebElement requireCancelReasonFlag;

	public WebElement requireCancelReasonFlag() {
		return requireCancelReasonFlag;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.NUM_OF_CHQBOOKS']")
	private WebElement noOfChequeBooks;

	public WebElement noOfChequeBooks() {
		return noOfChequeBooks;
	}

	@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000MT")
	private WebElement chequeBookCreation_chequeCode;

	public WebElement chequeBookCreation_chequeCode() {
		return chequeBookCreation_chequeCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBookCreation_BranchCode;

	public WebElement chequeBookCreation_BranchCode() {
		return chequeBookCreation_BranchCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBookCreation_CurrencyCode;

	public WebElement chequeBookCreation_CurrencyCode() {
		return chequeBookCreation_CurrencyCode;
	}

	@FindBy(xpath = "//input[@id='cy_name_Q000MT']")
	private WebElement chequeBookCreation_CurrencyCodeValidation;

	public WebElement chequeBookCreation_CurrencyCodeValidation() {
		return chequeBookCreation_CurrencyCodeValidation;
	}

	@FindBy(xpath = "//*[@id='acc_type_Q000MT']")
	private WebElement chequeBookCreation_AccountTypeValidation;

	public WebElement chequeBookCreation_AccountTypeValidation() {
		return chequeBookCreation_AccountTypeValidation;
	}

	@FindBy(xpath = "//*[@id='CIF_NAME_Q000MT']")
	private WebElement chequeBookCreation_AmountCIFValidation;

	public WebElement chequeBookCreation_AmountCIFValidation() {
		return chequeBookCreation_AmountCIFValidation;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBookCreation_GlCode;

	public WebElement chequeBookCreation_GlCode() {
		return chequeBookCreation_GlCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBookCreation_CifCode;

	public WebElement chequeBookCreation_CifCode() {
		return chequeBookCreation_CifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement chequeBookCreation_SerialNo;

	public WebElement chequeBookCreation_SerialNo() {
		return chequeBookCreation_SerialNo;
	}

	@FindBy(xpath = "//input[@id='chr_ac_cif_Q000MT']")
	private WebElement chequeBookCreation_DeductChargeValidation;

	public WebElement chequeBookCreation_DeductChargeValidation() {
		return chequeBookCreation_DeductChargeValidation;
	}

	@FindBy(id = "chequeBookDefFormId_Q000MT_btn_save")
	private WebElement chequeBookCreation_Save;

	public WebElement chequeBookCreation_Save() {
		return chequeBookCreation_Save;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement chequeBookMaintenance;

	public WebElement chequeBookMaintenance() {
		return chequeBookMaintenance;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement chequeBookCreation_OkbuttonWarningPopUp;

	public WebElement chequeBookCreation_OkbuttonWarningPopUp() {
		return chequeBookCreation_OkbuttonWarningPopUp;
	}
	// ******************************************************************************************************//
	// *****************************Cancel
	// ******************************************************************//

	@FindBy(id = "Q000TC")
	private WebElement toCancelScreen;

	public WebElement toCancelScreen() {
		return toCancelScreen;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInToCancelScreen;

	public WebElement searchChequeBookCodeInToCancelScreen() {
		return searchChequeBookCodeInToCancelScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TC_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInToCancelScreen;

	public WebElement selectChequeBookCodeInToCancelScreen() {
		return selectChequeBookCodeInToCancelScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000TC_toCancel_key")
	private WebElement toCancelButton;

	public WebElement toCancelButton() {
		return toCancelButton;
	}

	@FindBy(xpath = "//select[@id='product_type_QG001MT']")
	private WebElement productType;

	public WebElement productType() {
		return productType;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AC_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInApproveCancelScreen;

	public WebElement searchChequeBookCodeInApproveCancelScreen() {
		return searchChequeBookCodeInApproveCancelScreen;
	}

	@FindBy(id = "chequeBook_cancel_Q000AC")
	private WebElement cancelButton;

	public WebElement cancelButton() {
		return cancelButton;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AC_1_ctschqbookVO.CODE']")
	private WebElement selectChequeBookCodeInApproveCancelScreen;

	public WebElement selectChequeBookCodeInApproveCancelScreen() {
		return selectChequeBookCodeInApproveCancelScreen;
	}

	@FindBy(id = "Q000AC")
	private WebElement approveCancelScreen;

	public WebElement approveCancelScreen() {
		return approveCancelScreen;
	}

	@FindBy(id = "Chequebook Request / To Cancel")
	private WebElement chequebookRequestToCancel;

	public WebElement chequebookRequestToCancel() {
		return chequebookRequestToCancel;
	}

	@FindBy(xpath = "//*[@id='chq_cancel_reason_desc_Q000TC']")
	private WebElement chequebookCancelReasonValidation;

	public WebElement chequebookCancelReasonValidation() {
		return chequebookCancelReasonValidation;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement okButtonInCancelReasonPopUp;

	public WebElement okButtonInCancelReasonPopUp() {
		return okButtonInCancelReasonPopUp;
	}

	@FindBy(id = "lookuptxt_chq_cancel_reason_Q000TC")
	private WebElement cancelReason;

	public WebElement cancelReason() {
		return cancelReason;
	}

	@FindBy(xpath = "//div[text()='WARNING']/following-sibling::div/a")
	private WebElement closeIconInWarningPopUpcancelScreen;

	public WebElement closeIconInWarningPopUpcancelScreen() {
		return closeIconInWarningPopUpcancelScreen;
	}

	@FindBy(xpath = "//div[text()='Warning']/following-sibling::div/a")
	private WebElement closeIconInWarningPopUpSubmitScreen;

	public WebElement closeIconInWarningPopUpSubmitScreen() {
		return closeIconInWarningPopUpSubmitScreen;
	}
	// ************************************************************************************************************//
	// ********************************************Approve
	// Screen**************************************************//

	@FindBy(id = "Q000AP")
	private WebElement approveSubMenu;

	public WebElement approveSubMenu() {
		return approveSubMenu;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInApproveScreen;

	public WebElement searchChequeBookCodeInApproveScreen() {
		return searchChequeBookCodeInApproveScreen;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CODE']")
	private WebElement selectChequeBookCodeInApproveScreen;

	public WebElement selectChequeBookCodeInApproveScreen() {
		return selectChequeBookCodeInApproveScreen;
	}

	@FindBy(xpath = "//button[@id='chequebookChargesWaive_Q000AP']")
	private WebElement chargeWaiverButtonInApproveScreen;

	public WebElement chargeWaiverButtonInApproveScreen() {
		return chargeWaiverButtonInApproveScreen;
	}

	@FindBy(xpath = "//div[@id='chequeBookChargesDiv_Q000AP']//span[text()='Charges']")
	private WebElement chargeTabInApproveScreen;

	public WebElement chargeTabInApproveScreen() {
		return chargeTabInApproveScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000AP_Approve_key")
	private WebElement approveButton;

	public WebElement approveButton() {
		return approveButton;
	}

	@FindBy(id = "chequeBook_reject_Q000AP")
	private WebElement rejectButtonInApproveScreen;

	public WebElement rejectButtonInApproveScreen() {
		return rejectButtonInApproveScreen;
	}

	@FindBy(xpath = "//div[text()='[890] Invalid/Missing Reason Code']")
	private WebElement rejectReasonPopupValidationInApproveChequeBookScreen;

	public WebElement rejectReasonPopupValidationInApproveChequeBookScreen() {
		return rejectReasonPopupValidationInApproveChequeBookScreen;
	}

	@FindBy(xpath = "//div[text()='[890] Invalid/Missing Reason Code']/parent::div/following-sibling::center/input[@id='_popup_path_sol_ok']")
	private WebElement okButtonInCannotProceedPopupInApproveChequeBookScreen;

	public WebElement okButtonInCannotProceedPopupInApproveChequeBookScreen() {
		return okButtonInCannotProceedPopupInApproveChequeBookScreen;
	}

	@FindBy(xpath = "//label[text()='Reason']/parent::td/following-sibling::td//textarea")
	private WebElement rejectReasonFieldInApproveScreen;

	public WebElement rejectReasonFieldInApproveScreen() {
		return rejectReasonFieldInApproveScreen;
	}

	// ****************************************************************************************************//
	// ************************************Submit*********************************************************//
	@FindBy(id = "Q000TR")
	private WebElement applyToSubmitSubMenu;

	public WebElement applyToSubmitSubMenu() {
		return applyToSubmitSubMenu;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.CODE']")
	private WebElement searchChequeBookCodeInApplyToSubmitScreen;

	public WebElement searchChequeBookCodeInApplyToSubmitScreen() {
		return searchChequeBookCodeInApplyToSubmitScreen;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000TR_1_ctschqbookVO.CODE']")
	private WebElement selectChequeBookCodeInApplyToSubmitScreen;

	public WebElement selectChequeBookCodeInApplyToSubmitScreen() {
		return selectChequeBookCodeInApplyToSubmitScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000TR_applySubmit_key")
	private WebElement applyToSubmitButton;

	public WebElement applyToSubmitButton() {
		return applyToSubmitButton;
	}
	// ******************************************************************************************************************//
	// ***********************************************Submit
	// Screen*****************************************************//

	@FindBy(id = "Q000SB")
	private WebElement submitSubMenuInChequebookRequest;

	public WebElement submitSubMenuInChequebookRequest() {
		return submitSubMenuInChequebookRequest;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInSubmitScreen;

	public WebElement searchChequeBookCodeInSubmitScreen() {
		return searchChequeBookCodeInSubmitScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000SB_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInSubmitScreen;

	public WebElement selectChequeBookCodeInSubmitScreen() {
		return selectChequeBookCodeInSubmitScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000SB_submit")
	private WebElement submitButton;

	public WebElement submitButton() {
		return submitButton;
	}
//************************************************************************************************************//
//***************************************Reverse Cancellation*************************************************//

	@FindBy(id = "Q000TQ")
	private WebElement toReverseCancellationSubMenu;

	public WebElement toReverseCancellationSubMenu() {
		return toReverseCancellationSubMenu;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TQ_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInToReverseCancellationScreen;

	public WebElement searchChequeBookCodeInToReverseCancellationScreen() {
		return searchChequeBookCodeInToReverseCancellationScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TQ_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInToReverseCancellationScreen;

	public WebElement selectChequeBookCodeInToReverseCancellationScreen() {
		return selectChequeBookCodeInToReverseCancellationScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000TQ_reverse_key.CODE")
	private WebElement reverseButtonInToReverseCancellationScreen;

	public WebElement reverseButtonInToReverseCancellationScreen() {
		return reverseButtonInToReverseCancellationScreen;
	}
	// *****************************************************Reverse Chequebook
	// **************************************//

	@FindBy(id = "Q000RV")
	private WebElement reverseChequeBookSubMenu;

	public WebElement reverseChequeBookSubMenu() {
		return reverseChequeBookSubMenu;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000RV_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInReverseChequeBookScreen;

	public WebElement searchChequeBookCodeInReverseChequeBookScreen() {
		return searchChequeBookCodeInReverseChequeBookScreen;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000RV_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInReverseChequeBookScreen;

	public WebElement selectChequeBookCodeInReverseChequeBookScreen() {
		return selectChequeBookCodeInReverseChequeBookScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000RV_reject_key")
	private WebElement rejectButtonReverseChequeBookScreen;

	public WebElement rejectButtonReverseChequeBookScreen() {
		return rejectButtonReverseChequeBookScreen;
	}

	@FindBy(xpath = "//div[text()='[890] Invalid/Missing Reason Code']")
	private WebElement rejectReasonPopupValidationReverseChequeBookScreen;

	public WebElement rejectReasonPopupValidationReverseChequeBookScreen() {
		return rejectReasonPopupValidationReverseChequeBookScreen;
	}

	@FindBy(xpath = "//div[text()='[890] Invalid/Missing Reason Code']/parent::div/following-sibling::center/input[@id='_popup_path_sol_ok']")
	private WebElement okButtonInCannotProceedPopupReverseChequeBookScreen;

	public WebElement okButtonInCannotProceedPopupReverseChequeBookScreen() {
		return okButtonInCannotProceedPopupReverseChequeBookScreen;
	}

	@FindBy(id = "//label[text()='Reason']/parent::td/following-sibling::td//textarea")
	private WebElement rejectReasonFieldInReverseChequeBookScreen;

	public WebElement rejectReasonFieldInReverseChequeBookScreen() {
		return rejectReasonFieldInReverseChequeBookScreen;
	}

	// ****************************************************Approve Cancellation
	// Reversal *************************************//
	@FindBy(id = "Q000AQ")
	private WebElement approveCancellationReversal;

	public WebElement approveCancellationReversal() {
		return approveCancellationReversal;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AQ_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInApproveCancellationReversalScreen;

	public WebElement searchChequeBookCodeInApproveCancellationReversalScreen() {
		return searchChequeBookCodeInApproveCancellationReversalScreen;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AQ_gs_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInApproveCancellationReversalScreen;

	public WebElement selectChequeBookCodeInApproveCancellationReversalScreen() {
		return selectChequeBookCodeInApproveCancellationReversalScreen;
	}

	@FindBy(id = "chequeBookDefFormId_Q000AQ_reverse_key")
	private WebElement reverseButtonInApproveCancellationReversalScreen;

	public WebElement reverseButtonInApproveCancellationReversalScreen() {
		return reverseButtonInApproveCancellationReversalScreen;
	}

	@FindBy(id = "approveBut_Q000TQ")
	private WebElement approveButtonInSendAlertReverseCancellationScreen;

	public WebElement approveButtonInSendAlertReverseCancellationScreen() {
		return approveButtonInSendAlertReverseCancellationScreen;
	}

	@FindBy(id = "usr_name_alert_Q000TQ")
	private WebElement userNameInUserInformatioPopUp;

	public WebElement userNameInUserInformatioPopUp() {
		return userNameInUserInformatioPopUp;
	}

	@FindBy(xpath = "//label[@id='ApproveAlertsForm_Q000TQ_password_key']/parent::td/following-sibling::td//input")
	private WebElement passwordInUserInformatioPopUp;

	public WebElement passwordInUserInformatioPopUp() {
		return passwordInUserInformatioPopUp;
	}

	@FindBy(id = "sendButtonForApprove_Q000TQ")
	private WebElement submitButtonInUserInformatioPopUp;

	public WebElement submitButtonInUserInformatioPopUp() {
		return submitButtonInUserInformatioPopUp;
	}

	@FindBy(id = "alertsOpenItemApprove_Q000TQ")
	private WebElement approveButtonInApproveItemPopUp;

	public WebElement approveButtonInApproveItemPopUp() {
		return approveButtonInApproveItemPopUp;
	}

	@FindBy(id = "alertsOpenItemReject_Q000TQ")
	private WebElement rejectButtonInApproveItemPopUp;

	public WebElement rejectButtonInApproveItemPopUp() {
		return rejectButtonInApproveItemPopUp;
	}

	// ***************************************************** Appprove
	// Cancel**********************************************//
	@FindBy(id = "chequeBook_reject_Q000AC")
	private WebElement rejectButtonInApproveCancelScreen;

	public WebElement rejectButtonInApproveCancelScreen() {
		return rejectButtonInApproveCancelScreen;
	}

	@FindBy(xpath = "//div[text()='[890] Invalid/Missing Reason Code']")
	private WebElement rejectReasonPopupValidationInApproveCancelChequeBookScreen;

	public WebElement rejectReasonPopupValidationInApproveCancelChequeBookScreen() {
		return rejectReasonPopupValidationInApproveCancelChequeBookScreen;
	}

	@FindBy(xpath = "//div[text()='[890] Invalid/Missing Reason Code']/parent::div/following-sibling::center/input[@id='_popup_path_sol_ok']")
	private WebElement okButtonInCannotProceedPopupInApproveCancelChequeBookScreen;

	public WebElement okButtonInCannotProceedPopupInApproveCancelChequeBookScreen() {
		return okButtonInCannotProceedPopupInApproveCancelChequeBookScreen;
	}

	@FindBy(id = "//label[text()='Reason']/parent::td/following-sibling::td//textarea")
	private WebElement rejectReasonFieldInApproveCancelChequeBookScreen;

	public WebElement rejectReasonFieldInApproveCancelChequeBookScreen() {
		return rejectReasonFieldInApproveCancelChequeBookScreen;
	}

	// *****************************************************to reverse cancellation
	// Batch*******************************//

	@FindBy(id = "Q000BTQ")
	private WebElement toReverseCancellationBatchSubMenu;

	public WebElement toReverseCancellationBatchSubMenu() {
		return toReverseCancellationBatchSubMenu;
	}

	@FindBy(id = "anchor_1440806148")
	private WebElement retrievebuttonInToReverseCancellationBatchScreen;

	public WebElement retrievebuttonInToReverseCancellationBatchScreen() {
		return retrievebuttonInToReverseCancellationBatchScreen;
	}

	@FindBy(id = "chequebookBulkCancel_to_reverse_cancel_Q000BTQ")
	private WebElement reversebuttonInToReverseCancellationBatchScreen;

	public WebElement reversebuttonInToReverseCancellationBatchScreen() {
		return reversebuttonInToReverseCancellationBatchScreen;
	}

	@FindBy(id = "Q000SP")
	private WebElement suspendScreen;

	public WebElement suspendScreen() {
		return suspendScreen;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000SP_gs_ctschqbookVO.CODE")
	private WebElement suspendSearchCheuqueCode;

	public WebElement suspendSearchCheuqueCode() {
		return suspendSearchCheuqueCode;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000SP_1_ctschqbookVO.CODE']")
	private WebElement suspendSelectCheuqueCode;

	public WebElement suspendSelectCheuqueCode() {
		return suspendSelectCheuqueCode;
	}

	@FindBy(id = "chequeBookDefFormId_Q000SP_suspend_key")
	private WebElement suspendButton;

	public WebElement suspendButton() {
		return suspendButton;
	}

	// CB--->ChequeBook
	@FindBy(id = "infoBarSearchButton_Q000MT")
	private WebElement searchButtonInCBMaintenance;

	public WebElement searchButtonInCBMaintenance() {
		return searchButtonInCBMaintenance;
	}

	@FindBy(id = "search_chequeBookGridTbl_Id_Q000MT")
	private WebElement searchChequeBookGridInCBMaintenance;

	public WebElement searchChequeBookGridInCBMaintenance() {
		return searchChequeBookGridInCBMaintenance;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInCBMaintenance;

	public WebElement searchChequeBookCodeInCBMaintenance() {
		return searchChequeBookCodeInCBMaintenance;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_GL']")
	private WebElement searchGlCodeInCBMaintenance;

	public WebElement searchGlCodeInCBMaintenance() {
		return searchGlCodeInCBMaintenance;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_CIF']")
	private WebElement searchCIFCodeInCBMaintenance;

	public WebElement searchCIFCodeInCBMaintenance() {
		return searchCIFCodeInCBMaintenance;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_SL']")
	private WebElement searchSLInMaintenance;

	public WebElement searchSLInMaintenance() {
		return searchSLInMaintenance;
	}

	@FindBy(id = "fbox_chequeBookGridTbl_Id_Q000MT_search")
	private WebElement findButtonInCBMaintenance;

	public WebElement findButtonInCBMaintenance() {
		return findButtonInCBMaintenance;
	}

	@FindBy(xpath = "//td[text()='Submitted']")
	private WebElement submittedRecordValidationInCBMaintenance;

	public WebElement submittedRecordValidationInCBMaintenance() {
		return submittedRecordValidationInCBMaintenance;
	}

	@FindBy(xpath = "//td[text()='Suspended']")
	private WebElement suspendRecordValidationInCBMaintenance;

	public WebElement suspendRecordValidationInCBMaintenance() {
		return suspendRecordValidationInCBMaintenance;
	}

	@FindBy(xpath = "//td[text()='To be Cancelled']")
	private WebElement toBeCancelledRecordValidationInCBMaintenance;

	public WebElement toBeCancelledRecordValidationInCBMaintenance() {
		return toBeCancelledRecordValidationInCBMaintenance;
	}

	@FindBy(xpath = "//td[text()='Deleted']")
	private WebElement rejectedRecordValidationInCBMaintenance;

	public WebElement rejectedRecordValidationInCBMaintenance() {
		return rejectedRecordValidationInCBMaintenance;
	}

	@FindBy(xpath = "//td[text()='Cancelled']")
	private WebElement cancelledRecordValidationInCBMaintenance;

	public WebElement cancelledRecordValidationInCBMaintenance() {
		return cancelledRecordValidationInCBMaintenance;
	}

	@FindBy(xpath = "//td[text()='Sent to Provider']")
	private WebElement sentToProviderRecordValidationInCBMaintenance;

	public WebElement sentToProviderRecordValidationInCBMaintenance() {
		return sentToProviderRecordValidationInCBMaintenance;
	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement approvedRecordValidationInCBMaintenance;

	public WebElement approvedRecordValidationInCBMaintenance() {
		return approvedRecordValidationInCBMaintenance;
	}

	@FindBy(xpath = "//td[text()='Destroyed']")
	private WebElement destroyedRecordValidationInCBMaintenance;

	public WebElement destroyedRecordValidationInCBMaintenance() {
		return destroyedRecordValidationInCBMaintenance;
	}

	@FindBy(xpath = "//td[text()='To Reverse Cancellation']")
	private WebElement toReverseCancellationRecordValidationInCBMaintenance;

	public WebElement toReverseCancellationRecordValidationInCBMaintenance() {
		return toReverseCancellationRecordValidationInCBMaintenance;
	}

	@FindBy(id = "Q000MT")
	private WebElement CBMaintenanceScreen;

	public WebElement CBMaintenanceScreen() {
		return CBMaintenanceScreen;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement viewMemoPopupClose;

	public WebElement viewMemoPopupClose() {
		return viewMemoPopupClose;
	}
//Anandh

	@FindBy(xpath = "//textarea[@id='status_remarks_Q000TD']")
	private WebElement toBeDestroyed_Reason;

	public WebElement toBeDestroyed_Reason() {
		return toBeDestroyed_Reason;
	}

	@FindBy(id = "Q000BAQ")
	private WebElement approveReversalOfCancellationBatchSubMenu;

	public WebElement approveReversalOfCancellationBatchSubMenu() {
		return approveReversalOfCancellationBatchSubMenu;
	}

	@FindBy(id = "anchor_463075865")
	private WebElement retrieveButtonInApproveReversalOfCancellationBatchScreen;

	public WebElement retrieveButtonInApproveReversalOfCancellationBatchScreen() {
		return retrieveButtonInApproveReversalOfCancellationBatchScreen;
	}

	@FindBy(id = "chequebookBulkCancel_approve_reverse_cancel_Q000BAQ")
	private WebElement approveReverseButtonInApproveReversalOfCancellationBatch;

	public WebElement approveReverseButtonInApproveReversalOfCancellationBatch() {
		return approveReverseButtonInApproveReversalOfCancellationBatch;
	}

	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[1]")
	private WebElement branchCode;

	public WebElement branchCode() {
		return branchCode;
	}

	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[2]")
	private WebElement currencyCode;

	public WebElement currencyCode() {
		return currencyCode;
	}

	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[3]")
	private WebElement glCode;

	public WebElement glCode() {
		return glCode;
	}

	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[4]")
	private WebElement cifCode;

	public WebElement cifCode() {
		return cifCode;
	}

	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[5]")
	private WebElement serialNumber;

	public WebElement serialNumber() {
		return serialNumber;
	}

	@FindBy(xpath = "//label[text()='Request No ']/parent::td/ancestor::tr//input[@name='amendChequeCardCO.ctsAmendProductVO.CHEQUEBOOK_CODE']")
	private WebElement chequeRequestNo;

	public WebElement chequeRequestNo() {
		return chequeRequestNo;
	}

	@FindBy(xpath = "//button[@id='retrieveBtn_QG001MT']")
	private WebElement retrieve;

	public WebElement retrieve() {
		return retrieve;
	}

	@FindBy(xpath = "//td[text()='Amend Cheque/Card status']")
	private WebElement AmendChequeCardMenu;

	public WebElement AmendChequeCardMenu() {
		return AmendChequeCardMenu;
	}

	@FindBy(xpath = "(//span[text()='Maintenance'])[1]")
	private WebElement MaintenanceIcon;

	public WebElement MaintenanceIcon() {
		return MaintenanceIcon;
	}
	// td[text()='694']/parent::tr//input

	@FindBy(xpath = "//button[@id='amendChequeCard_update_QG001MT']")
	private WebElement updateAmend;

	public WebElement updateAmend() {
		return updateAmend;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']/preceding-sibling::td/span")
	private WebElement chequebookRequestModule;

	public WebElement chequebookRequestModule() {
		return chequebookRequestModule;
	}

	@FindBy(xpath = "//span[text()='Chequebook Query']")
	private WebElement chequebookQuerySubMenu;

	public WebElement chequebookQuerySubMenu() {
		return chequebookQuerySubMenu;
	}

	@FindBy(xpath = "//input[@value='Ok ']")
	private WebElement confirmSaveRecord;

	public WebElement confirmSaveRecord() {
		return confirmSaveRecord;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement recordSavedSuccessfully;

	public WebElement recordSavedSuccessfully() {
		return recordSavedSuccessfully;
	}

	@FindBy(xpath = "//input[@id='chequeBookQueryTbl_Id_Q000QR_gs_CODE']")
	private WebElement chequebookCodeInCheckbooQueryScreen;

	public WebElement chequebookCodeInCheckbooQueryScreen() {
		return chequebookCodeInCheckbooQueryScreen;
	}

	@FindBy(xpath = "//td[text()='Apply To Submit']")
	private WebElement applyToSubmitValidation;

	public WebElement applyToSubmitValidation() {
		return applyToSubmitValidation;
	}

	@FindBy(xpath = "//a[text()='Chequebook Request / Chequebook Query']")
	private WebElement chequeBookRequest_ChequeBookQuery;

	public WebElement chequeBookRequest_ChequeBookQuery() {
		return chequeBookRequest_ChequeBookQuery;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_Q000MT']")
	private WebElement searchIconInChequeBookMaintenanceScreen;

	public WebElement searchIconInChequeBookMaintenanceScreen() {
		return searchIconInChequeBookMaintenanceScreen;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE']")
	private WebElement searchChequeBookCodeInChequeBookMaintenanceScreen;

	public WebElement searchChequeBookCodeInChequeBookMaintenanceScreen() {
		return searchChequeBookCodeInChequeBookMaintenanceScreen;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000MT_1_ctschqbookVO.CODE']")
	private WebElement selectSearchedChequeBookCodeInChequeBookMaintenanceScreen;

	public WebElement selectSearchedChequeBookCodeInChequeBookMaintenanceScreen() {
		return selectSearchedChequeBookCodeInChequeBookMaintenanceScreen;
	}

	@FindBy(xpath = "//select[@id='check_status_type_QG001MT']")
	private WebElement selectChequeBookStatusInAmendChequeCardStatus;

	public WebElement selectChequeBookStatusInAmendChequeCardStatus() {
		return selectChequeBookStatusInAmendChequeCardStatus;
	}

	@FindBy(xpath = "//td[text()='Amend Cheque/Card status']")
	private WebElement csm_AmendChequeCardStatusModule;

	public WebElement csmAmendChequeCardStatusModule() {
		return csm_AmendChequeCardStatusModule;
	}

	@FindBy(xpath = "//td[text()='Amend Cheque/Card status']//ancestor::div//span[text()='Maintenance']")
	private WebElement csm_AmendChequeCardStatusMaintenance;

	public WebElement csmAmendChequeCardStatusMaintenance() {
		return csm_AmendChequeCardStatusMaintenance;
	}

	@FindBy(xpath = "//select[@id='product_type_QG001MT']")
	private WebElement amendChequeCard_ProductTypeDropdown;

	public WebElement amendChequeCardProductTypeDropdown() {
		return amendChequeCard_ProductTypeDropdown;
	}

	@FindBy(xpath = "//input[@id='BR_CODE_QG001MT']")
	private WebElement amendChequeCard_BranchCodeInput;

	public WebElement amendChequeCardBranchCodeInput() {
		return amendChequeCard_BranchCodeInput;
	}

	@FindBy(xpath = "//input[@id='CY_CODE_QG001MT']")
	private WebElement amendChequeCard_CurrencyCodeInput;

	public WebElement amendChequeCardCurrencyCodeInput() {
		return amendChequeCard_CurrencyCodeInput;
	}

	@FindBy(xpath = "//input[@id='GL_CODE_QG001MT']")
	private WebElement amendChequeCard_GLCodeInput;

	public WebElement amendChequeCardGLCodeInput() {
		return amendChequeCard_GLCodeInput;
	}

	@FindBy(xpath = "//input[@id='CIF_SUB_NO_QG001MT']")
	private WebElement amendChequeCard_CIFNoInput;

	public WebElement amendChequeCardCIFNoInput() {
		return amendChequeCard_CIFNoInput;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_SL_NO_QG001MT']")
	private WebElement amendChequeCard_SerialNoInput;

	public WebElement amendChequeCardSerialNoInput() {
		return amendChequeCard_SerialNoInput;
	}

	@FindBy(xpath = "//input[@id='requestNo_QG001MT']")
	private WebElement amendChequeCard_RequestNoInput;

	public WebElement amendChequeCardRequestNoInput() {
		return amendChequeCard_RequestNoInput;
	}

	@FindBy(xpath = "//select[@name='amendChequeCardCO.ctsAmendProductVO.STATUS']")
	private WebElement amendChequeCard_StatusDropdown;

	public WebElement amendChequeCardStatusDropdown() {
		return amendChequeCard_StatusDropdown;
	}

	@FindBy(xpath = "//button[@id='retrieveBtn_QG001MT']")
	private WebElement amendChequeCard_RetriveButton;

	public WebElement amendChequeCardRetriveButton() {
		return amendChequeCard_RetriveButton;
	}

	@FindBy(xpath = "//input[@name='jqg_ammendChequeBookGridTbl_Id_QG001MT_1']")
	private WebElement amendChequeCard_ChequeBookCheckBox;

	public WebElement amendChequeCardChequeBookCheckBox() {
		return amendChequeCard_ChequeBookCheckBox;
	}

	@FindBy(xpath = "//button[@id='amendChequeCard_update_QG001MT']")
	private WebElement amendChequeCard_UpdateButton;

	public WebElement amendChequeCardUpdateButton() {
		return amendChequeCard_UpdateButton;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement amendChequeCard_ValidationElement;

	public WebElement amendChequeCardValidationElement() {
		return amendChequeCard_ValidationElement;
	}

	@FindBy(xpath = "//div[text()='record saved successfully']//parent::div//following-sibling::center//input")
	private WebElement amendChequecard_SaveSuccessOkButton;

	public WebElement amendChequeCardSaveSuccessOkButton() {
		return amendChequecard_SaveSuccessOkButton;
	}

	// Chequebook P2
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

	@FindBy(xpath = "//div[@id='panel_4_P024MA']//span[text()='Main Details']")
	private WebElement Parameters_SystemParameters_TransactionType_MainDetails_609;

	public WebElement Parameters_SystemParameters_TransactionType_MainDetails_609() {
		return Parameters_SystemParameters_TransactionType_MainDetails_609;
	}

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609;
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

	@FindBy(xpath = "//input[@id='multi_cy_P029MA']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency_609;
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

	@FindBy(xpath = "(//div[@id='chequeBookChargesDiv_Q000MT']/div/span[2]/span)[1]")
	private WebElement ChequebookRequest_Maintenance_Charges_609;

	public WebElement ChequebookRequest_Maintenance_Charges_609() {
		return ChequebookRequest_Maintenance_Charges_609;
	}

	@FindBy(xpath = "//td[@id='td_chargesGridId_Q000MT_1_ctsChargesEntityVO.AMOUNT']")
	private WebElement ChequebookRequest_Maintenance_AmendChargesGrid_609;

	public WebElement ChequebookRequest_Maintenance_AmendChargesGrid_609() {
		return ChequebookRequest_Maintenance_AmendChargesGrid_609;
	}

	@FindBy(xpath = "//input[@id='1_chequeBookCO.type_ctsChargesEntityVO.AMOUNT_chargesGridId_Q000MT']")
	private WebElement ChequebookRequest_Maintenance_AmendChargesAmount_609;

	public WebElement ChequebookRequest_Maintenance_AmendChargesAmount_609() {
		return ChequebookRequest_Maintenance_AmendChargesAmount_609;
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

//		@FindBy(xpath = "//table[@id='chqBkAddAccGridTbl_Id_Q000MT']/tbody/tr[2]/td[6]//div//span/span")
//		private WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SiNosearch_609;
//		public WebElement ChequebookRequest_Maintenance_AdditionalAccounts_SiNosearch_609() {
//			return ChequebookRequest_Maintenance_AdditionalAccounts_SiNosearch_609;
//		}

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

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000MT_0_ctsChargesEntityVO.AMOUNT'])[2]")
	private WebElement ChequebookRequest_Maintenance_TotalAmount_609;

	public WebElement ChequebookRequest_Maintenance_TotalAmount_609() {
		return ChequebookRequest_Maintenance_TotalAmount_609;
	}

	@FindBy(xpath = "(//div[@id='jqgh_chargesGridId_Q000MT_vatCtsChargesEntityVO.AMOUNT'])[1]")
	private WebElement ChequebookRequest_Maintenance_Vat_609;

	public WebElement ChequebookRequest_Maintenance_Vat_609() {
		return ChequebookRequest_Maintenance_Vat_609;
	}

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000MT_0_ctsChargesEntityVO.AMOUNT'])[1]")
	private WebElement ChequebookRequest_Maintenance_CV_609;

	public WebElement ChequebookRequest_Maintenance_CV_609() {
		return ChequebookRequest_Maintenance_CV_609;
	}

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000MT_0_ctsChargesEntityVO.AMOUNT_FC'])[1]")
	private WebElement ChequebookRequest_Maintenance_FC_609;

	public WebElement ChequebookRequest_Maintenance_FC_609() {
		return ChequebookRequest_Maintenance_FC_609;
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

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Maintenance_TransactionNumber_609;

	public WebElement Transactions_Maintenance_TransactionNumber_609() {
		return Transactions_Maintenance_TransactionNumber_609;
	}

	@FindBy(xpath = "//a[@id='Q000TC']/span[text()='To Cancel']")
	private WebElement ChequebookRequest_ToCancel_609;

	public WebElement ChequebookRequest_ToCancel_609() {
		return ChequebookRequest_ToCancel_609;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement ChequebookRequest_ToCancel_ChequeCode_609;

	public WebElement ChequebookRequest_ToCancel_ChequeCode_609() {
		return ChequebookRequest_ToCancel_ChequeCode_609;
	}

	@FindBy(xpath = "(//span[text()='Charges'])[3]")
	private WebElement ChequebookRequest_ToCancel_Charges_609;

	public WebElement ChequebookRequest_ToCancel_Charges_609() {
		return ChequebookRequest_ToCancel_Charges_609;
	}

	@FindBy(xpath = "(//td[@id='td_chargesGridId_Q000TC_0_ctsChargesEntityVO.AMOUNT_FC'])[2]")
	private WebElement ChequebookRequest_ToCancel_FC_609;

	public WebElement ChequebookRequest_ToCancel_FC_609() {
		return ChequebookRequest_ToCancel_FC_609;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000TC_toCancel_key']")
	private WebElement ChequebookRequest_ToCancel_ToCancelBtn609;

	public WebElement ChequebookRequest_ToCancel_ToCancelBtn609() {
		return ChequebookRequest_ToCancel_ToCancelBtn609;
	}

	@FindBy(xpath = "//input[@id='avail_bal_D001MT']")
	private WebElement Transactions_Maintenance_Balance_609;

	public WebElement Transactions_Maintenance_Balance_609() {
		return Transactions_Maintenance_Balance_609;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
	private WebElement TransactionNo_609;

	public WebElement TransactionNo_609() {
		return TransactionNo_609;
	}

	// new Amend
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

//				@FindBy(id="submit_464136045")
//				private WebElement multiChequesEntryTransactionDetails_SaveButton;
	//
//				public WebElement multiChequesEntryTransactionDetailsSaveButton() {
//					return multiChequesEntryTransactionDetails_SaveButton;
//				}
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

	@FindBy(xpath = "//input[@id='jqg_ammendChequeBookGridTbl_Id_QG001MT_1']")
	private WebElement CheckBox_Amend_Retrive;

	public WebElement CheckBox_Amend_Retrive() {
		return CheckBox_Amend_Retrive;
	}

	@FindBy(xpath = "//td[text()='Submitted']")
	private WebElement applyToSubmitValidate;

	public WebElement applyToSubmitValidate() {
		return applyToSubmitValidate;
	}

	@FindBy(id = "Q000AP")
	private WebElement chequebookRequest_ApproveFeature;

	public WebElement chequebookRequestApproveFeature() {
		return chequebookRequest_ApproveFeature;
	}

	@FindBy(xpath = "//div[contains(text(),'6162') or contains(text(),'6161') or contains(text(),'Suspense Account')]//parent::div//following-sibling::center//input")
	private WebElement csm_SuspenseOkButton;

	public WebElement csmSuspenseOkButton() {
		return csm_SuspenseOkButton;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement closeButtonInAlertPopup;

	public WebElement closeButtonInAlertPopup() {
		return closeButtonInAlertPopup;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.CODE")
	private WebElement csm_ApplyToSubmit_CodeSearchField;

	public WebElement csm_ApplyToSubmit_CodeSearchField() {
		return csm_ApplyToSubmit_CodeSearchField;
	}

	@FindBy(id = "code_Q000TR")
	private WebElement csm_ApplyToSubmit_Request_No;

	public WebElement csm_ApplyToSubmit_Request_No() {
		return csm_ApplyToSubmit_Request_No;
	}

	@FindBy(id = "chequeBook_applySubmit_Q000TR")
	private WebElement csm_ApplySubmitButton;

	public WebElement csm_ApplySubmitButton() {
		return csm_ApplySubmitButton;
	}

	@FindBy(id = "code_Q000SB")
	private WebElement csm_Submit_Request_No;

	public WebElement csm_Submit_Request_No() {
		return csm_Submit_Request_No;
	}

	@FindBy(id = "chequeBook_submit_Q000SB")
	private WebElement csm_SubmitButton;

	public WebElement csm_SubmitButton() {
		return csm_SubmitButton;
	}

	@FindBy(id = "infoBarSearchButton_Q000MT")
	private WebElement csm_Maintenance_SearchButton;

	public WebElement csm_Maintenance_SearchButton() {
		return csm_Maintenance_SearchButton;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE")
	private WebElement csm_Maintenance_CodeSearchField;

	public WebElement csm_Maintenance_CodeSearchField() {
		return csm_Maintenance_CodeSearchField;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000MT_1_ctschqbookVO.CODE")
	private WebElement csm_Maintenance_FirstRecord;

	public WebElement csm_Maintenance_FirstRecord() {
		return csm_Maintenance_FirstRecord;
	}

	@FindBy(xpath = "//td[text()='Submitted']")
	private WebElement csm_SubmittedText;

	public WebElement csm_SubmittedText() {
		return csm_SubmittedText;
	}

	@FindBy(xpath = "//div[contains(text(),'6162')]/parent::div//following-sibling::center//input")
	private WebElement csm_Submit_Suspense_Acc_Warning_Popup_Ok_btn;

	public WebElement csm_Submit_Suspense_Acc_Warning_Popup_Ok_btn() {
		return csm_Submit_Suspense_Acc_Warning_Popup_Ok_btn;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE")
	private WebElement csm_ToCancelCodeSearchField;

	public WebElement csm_ToCancelCodeSearchField() {
		return csm_ToCancelCodeSearchField;
	}

	@FindBy(id = "spanLookup_chq_cancel_reason_Q000TC")
	private WebElement csm_ToCancelCancelReasonIcon;

	public WebElement csm_ToCancelCancelReasonIcon() {
		return csm_ToCancelCancelReasonIcon;
	}

	@FindBy(id = "td_gridtab_chq_cancel_reason_Q000TC_1_BRIEF_NAME_ENG")
	private WebElement csm_ToCancelCancelReasonText;

	public WebElement csm_ToCancelCancelReasonText() {
		return csm_ToCancelCancelReasonText;
	}

	@FindBy(id = "chequeBookDefFormId_Q000TC_toCancel_key")
	private WebElement csm_ToCancelToCancelButton;

	public WebElement csm_ToCancelToCancelButton() {
		return csm_ToCancelToCancelButton;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AC_gs_ctschqbookVO.CODE")
	private WebElement csm_ApproveCancelCodeSearchField;

	public WebElement csm_ApproveCancelCodeSearchField() {
		return csm_ApproveCancelCodeSearchField;
	}

	@FindBy(id = "code_Q000AC")
	private WebElement csm_Approve_Cancel_Request_No;

	public WebElement csm_Approve_Cancel_Request_No() {
		return csm_Approve_Cancel_Request_No;
	}

	@FindBy(id = "chequeBook_cancel_Q000AC")
	private WebElement csm_ApproveCancelCancelButton;

	public WebElement csm_ApproveCancelCancelButton() {
		return csm_ApproveCancelCancelButton;
	}

	@FindBy(xpath = "//td[text()='Cancelled']")
	private WebElement csm_CancelledText;

	public WebElement csm_CancelledText() {
		return csm_CancelledText;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE")
	private WebElement csm_ToBeDestroyedCodeSearchField;

	public WebElement csm_ToBeDestroyedCodeSearchField() {
		return csm_ToBeDestroyedCodeSearchField;
	}

	@FindBy(id = "status_remarks_Q000TD")
	private WebElement csm_ToBeDestroyedRemarksField;

	public WebElement csm_ToBeDestroyedRemarksField() {
		return csm_ToBeDestroyedRemarksField;
	}

	@FindBy(id = "chequeBook_toDestroy_Q000TD")
	private WebElement csm_ToBeDestroyedToDestroyButton;

	public WebElement csm_ToBeDestroyedToDestroyButton() {
		return csm_ToBeDestroyedToDestroyButton;
	}

	@FindBy(id = "Q000AD")
	private WebElement csm_ApproveDestroyedSection;

	public WebElement csm_ApproveDestroyedSection() {
		return csm_ApproveDestroyedSection;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE")
	private WebElement csm_ApproveDestroyedCodeSearchField;

	public WebElement csm_ApproveDestroyedCodeSearchField() {
		return csm_ApproveDestroyedCodeSearchField;
	}

	@FindBy(id = "chequeBook_destroy_Q000AD")
	private WebElement csm_ApproveDestroyedDestroyButton;

	public WebElement csm_ApproveDestroyedDestroyButton() {
		return csm_ApproveDestroyedDestroyButton;
	}

	@FindBy(xpath = "//td[text()='Destroyed']")
	private WebElement csm_DestroyedText;

	public WebElement csm_DestroyedText() {
		return csm_DestroyedText;
	}

	@FindBy(id = "code_Q000AD")
	private WebElement csm_Approve_Destroy_Request_No;

	public WebElement csm_Approve_Destroy_Request_No() {
		return csm_Approve_Destroy_Request_No;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement chequeBookRequest_SubMenu_Code;

	public WebElement chequeBookRequest_SubMenu_Code() {
		return chequeBookRequest_SubMenu_Code;
	}

	@FindBy(xpath = "//label[text()='To Reactivate ']")
	private WebElement chequeBookRequest_ToReactivate_ToReactivateSubmitButton;

	public WebElement chequeBookRequest_ToReactivate_ToReactivateSubmitButton() {
		return chequeBookRequest_ToReactivate_ToReactivateSubmitButton;
	}

	@FindBy(xpath = "//span[text()='Remove Tab']")
	private WebElement chequeBookRequest_SubMenu_RemoveTab;

	public WebElement chequeBookRequest_SubMenu_RemoveTab() {
		return chequeBookRequest_SubMenu_RemoveTab;
	}

	@FindBy(xpath = "//label[text()='Reactivate ']")
	private WebElement chequeBookRequest_Reactivate_ReactivateSubmitButton;

	public WebElement chequeBookRequest_Reactivate_ReactivateSubmitButton() {
		return chequeBookRequest_Reactivate_ReactivateSubmitButton;
	}

	@FindBy(xpath = "//input[@name='statusDesc']")
	private WebElement chequeBookRequest_SubMenu_StatusDesc;

	public WebElement chequeBookRequest_SubMenu_StatusDesc() {
		return chequeBookRequest_SubMenu_StatusDesc;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement chequeBookRequest_ViewMemoCloseButton;

	public WebElement chequeBookRequest_ViewMemoCloseButton() {
		return chequeBookRequest_ViewMemoCloseButton;
	}

	@FindBy(xpath = "//input[@id='status_Q000MT']")
	private WebElement chequeBookRequest_SubMenu_RecordStatus;

	public WebElement chequeBookRequest_SubMenu_RecordStatus() {
		return chequeBookRequest_SubMenu_RecordStatus;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement chequeBookRequest_SubMenu_AlertClose;

	public WebElement chequeBookRequest_SubMenu_AlertClose() {
		return chequeBookRequest_SubMenu_AlertClose;
	}

	@FindBy(id = "infoBarSearchButton_Q000MT")
	private WebElement chequeBookRequest_SubMenu_SearchButton;

	public WebElement chequeBookRequest_SubMenu_SearchButton() {
		return chequeBookRequest_SubMenu_SearchButton;
	}

	@FindBy(xpath = "//td[text()=' Q000MT ']")
	private WebElement chequeBookRequest_MaintenanceScreen;

	public WebElement chequeBookRequest_MaintenanceScreen() {
		return chequeBookRequest_MaintenanceScreen;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000MT']/tbody/tr[2]")
	private WebElement chequeBookRequest_Maintenance_RecordRow1;

	public WebElement chequeBookRequest_Maintenance_RecordRow1() {
		return chequeBookRequest_Maintenance_RecordRow1;
	}

	@FindBy(id = "code_Q000TRE")
	private WebElement chequeBookRequest_ToReactivate_Request_No;

	public WebElement chequeBookRequest_ToReactivate_Request_No() {
		return chequeBookRequest_ToReactivate_Request_No;
	}

	@FindBy(xpath = "//label[text()='To Be Reversed ']")
	private WebElement chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton;

	public WebElement chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton() {
		return chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement chequeBookRequest_ConfirmOkButton;

	public WebElement chequeBookRequest_ConfirmOkButton() {
		return chequeBookRequest_ConfirmOkButton;
	}

	@FindBy(xpath = "//label[text()='Reverse ']")
	private WebElement chequeBookRequest_Reverse_ReverseSubmitButton;

	public WebElement chequeBookRequest_Reverse_ReverseSubmitButton() {
		return chequeBookRequest_Reverse_ReverseSubmitButton;
	}

	@FindBy(xpath = "//span[@id='hdr_runn_date']")
	private WebElement chequeBookRequest_HeaderRunningDate;

	public WebElement chequeBookRequest_HeaderRunningDate() {
		return chequeBookRequest_HeaderRunningDate;
	}

	@FindBy(xpath = "//input[@name='newUserRunDate']")
	private WebElement chequeBookRequest_UserRunningDateInputField;

	public WebElement chequeBookRequest_UserRunningDateInputField() {
		return chequeBookRequest_UserRunningDateInputField;
	}

	@FindBy(xpath = "//button[@id='_header_rundate_dialog_close']/span")
	private WebElement chequeBookRequest_CalendarCloseButton;

	public WebElement chequeBookRequest_CalendarCloseButton() {
		return chequeBookRequest_CalendarCloseButton;
	}

	@FindBy(xpath = "//label[text()='User Running Date ']/ancestor::tr/descendant::img")
	private WebElement chequeBookRequest_UserRunningDateCalendarImg;

	public WebElement chequeBookRequest_UserRunningDateCalendarImg() {
		return chequeBookRequest_UserRunningDateCalendarImg;
	}

	@FindBy(xpath = "//label[text()='User Running Date ']/ancestor::tr/descendant::span")
	private WebElement chequeBookRequest_UserRunningDateCalendarUseButton;

	public WebElement chequeBookRequest_UserRunningDateCalendarUseButton() {
		return chequeBookRequest_UserRunningDateCalendarUseButton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement chequeBookRequest_CalendarSuccessfullyPopup;

	public WebElement chequeBookRequest_CalendarSuccessfullyPopup() {
		return chequeBookRequest_CalendarSuccessfullyPopup;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement chequeBookRequest_CalendarHolidayConfirmPopup;

	public WebElement chequeBookRequest_CalendarHolidayConfirmPopup() {
		return chequeBookRequest_CalendarHolidayConfirmPopup;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement chequeBookRequest_WarningPopup;

	public WebElement chequeBookRequest_WarningPopup() {
		return chequeBookRequest_WarningPopup;
	}

	@FindBy(xpath = "//div[contains(text(),'Suspense Account')]/ancestor::div[2]/descendant::input")
//	@FindBy(xpath = "//div[contains(text(),'Suspense Account')]")
	private WebElement chequeBookRequest_SuspenseAccountWarningPopupOkButton;

	public WebElement chequeBookRequest_SuspenseAccountWarningPopupOkButton() {
		return chequeBookRequest_SuspenseAccountWarningPopupOkButton;
	}

	@FindBy(xpath = "//span[text()='Close']")
	private WebElement chequeBookRequest_ChangeRunningDateCloseButton;

	public WebElement chequeBookRequest_ChangeRunningDateCloseButton() {
		return chequeBookRequest_ChangeRunningDateCloseButton;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_NumberOfChequebook;

	public WebElement chequeBookRequest_Maintenance_NumberOfChequebook() {
		return chequeBookRequest_Maintenance_NumberOfChequebook;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_ChequeCODE;

	public WebElement chequeBookRequest_Maintenance_ChequeCODE() {
		return chequeBookRequest_Maintenance_ChequeCODE;
	}

	@FindBy(xpath = "//span[@id='spanLookup_acc_sl_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_AccountNumberLookup;

	public WebElement chequeBookRequest_Maintenance_AccountNumberLookup() {
		return chequeBookRequest_Maintenance_AccountNumberLookup;
	}

	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.BRANCH_CODE']")
	private WebElement chequeBookRequest_Maintenance_BranchCODE;

	public WebElement chequeBookRequest_Maintenance_BranchCODE() {
		return chequeBookRequest_Maintenance_BranchCODE;
	}

	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.CURRENCY_CODE']")
	private WebElement chequeBookRequest_Maintenance_Currency;

	public WebElement chequeBookRequest_Maintenance_Currency() {
		return chequeBookRequest_Maintenance_Currency;
	}

	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.GL_CODE']")
	private WebElement chequeBookRequest_Maintenance_GL;

	public WebElement chequeBookRequest_Maintenance_GL() {
		return chequeBookRequest_Maintenance_GL;
	}

	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.CIF_SUB_NO']")
//	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_CifNo;

	public WebElement chequeBookRequest_Maintenance_CifNo() {
		return chequeBookRequest_Maintenance_CifNo;
	}

	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.SL_NO']")
	private WebElement chequeBookRequest_Maintenance_SerialNo;

	public WebElement chequeBookRequest_Maintenance_SerialNo() {
		return chequeBookRequest_Maintenance_SerialNo;
	}

	@FindBy(xpath = "//td[@id='td_gridtab_acc_sl_Q000MT_1_amfVO.BRANCH_CODE']")
	private WebElement chequeBookRequest_Maintenance_BranchCodeRecord;

	public WebElement chequeBookRequest_Maintenance_BranchCodeRecord() {
		return chequeBookRequest_Maintenance_BranchCodeRecord;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_add_ref_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_AccountNumberRefNo;

	public WebElement chequeBookRequest_Maintenance_AccountNumberRefNo() {
		return chequeBookRequest_Maintenance_AccountNumberRefNo;
	}

	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement chequeBookRequest_Maintenance_SaveButton;

	public WebElement chequeBookRequest_Maintenance_SaveButton() {
		return chequeBookRequest_Maintenance_SaveButton;
	}

	@FindBy(xpath = "//input[@name='USER_ID']")
//	@FindBy(xpath = "//input[@id='alertsGrid_Id_Q000MT_gs_alertsParamCO.userId']")
	private WebElement chequeBookRequest_Maintenance_AlertBoxUserIdInput;

	public WebElement chequeBookRequest_Maintenance_AlertBoxUserIdInput() {
		return chequeBookRequest_Maintenance_AlertBoxUserIdInput;
	}

	@FindBy(xpath = "//td[@tdlabel='User Id']")
//	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_Q000MT_1_alertsParamCO.userId']")
	private WebElement chequeBookRequest_Maintenance_AlertBoxUserIdFirstRow;

	public WebElement chequeBookRequest_Maintenance_AlertBoxUserIdFirstRow() {
		return chequeBookRequest_Maintenance_AlertBoxUserIdFirstRow;
	}

	@FindBy(xpath = "//span[text()=' Send ']")
//	@FindBy(xpath = "//a[@id='sendBut_Q000MT']/span")
	private WebElement chequeBookRequest_Maintenance_AlertBoxSendButton;

	public WebElement chequeBookRequest_Maintenance_AlertBoxSendButton() {
		return chequeBookRequest_Maintenance_AlertBoxSendButton;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000MT_1_ctschqbookVO.CODE']")
	private WebElement chequeBookRequest_Maintenance_SavedRecord;

	public WebElement chequeBookRequest_Maintenance_SavedRecord() {
		return chequeBookRequest_Maintenance_SavedRecord;
	}

	@FindBy(xpath = "//span[text()='Alerts']/parent::div")
	private WebElement chequeBookRequest_AlertBox;

	public WebElement chequeBookRequest_AlertBox() {
		return chequeBookRequest_AlertBox;
	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement chequeBookRequest_AlertBox_TrxNoInput;

	public WebElement chequeBookRequest_AlertBox_TrxNoInput() {
		return chequeBookRequest_AlertBox_TrxNoInput;
	}

	@FindBy(xpath = "//a[text()='Open Item']")
	private WebElement chequeBookRequest_AlertBox_OpenItem;

	public WebElement chequeBookRequest_AlertBox_OpenItem() {
		return chequeBookRequest_AlertBox_OpenItem;
	}

	@FindBy(xpath = "//button[@id='chequebookChargesWaive_Q000AP_ALERT']/span")
	private WebElement chequeBookRequest_AlertBox_WaiveChargesButton;

	public WebElement chequeBookRequest_AlertBox_WaiveChargesButton() {
		return chequeBookRequest_AlertBox_WaiveChargesButton;
	}

	@FindBy(xpath = "//button[@id='alertsOpenItemApprove_RCVALERT']/span")
	private WebElement chequeBookRequest_AlertBox_ApproveButton;

	public WebElement chequeBookRequest_AlertBox_ApproveButton() {
		return chequeBookRequest_AlertBox_ApproveButton;
	}

	@FindBy(xpath = "//span[text()='Approve Item']/../a/span")
	private WebElement chequeBookRequest_AlertBox_ApproveItemClose;

	public WebElement chequeBookRequest_AlertBox_ApproveItemClose() {
		return chequeBookRequest_AlertBox_ApproveItemClose;
	}

	@FindBy(xpath = "//input[@id='code_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_RequestNumber;

	public WebElement chequeBookRequest_Maintenance_RequestNumber() {
		return chequeBookRequest_Maintenance_RequestNumber;
	}

	@FindBy(xpath = "//span[text()=' Status ' and @class='ui-button-text']")
	private WebElement chequeBookRequest_Maintenance_StatusTable;

	public WebElement chequeBookRequest_Maintenance_StatusTable() {
		return chequeBookRequest_Maintenance_StatusTable;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookBulkCancelGridTbl_Id_Q000BAQ_0_cb']//input")
	private WebElement CheckBox_Q000BAQ;

	public WebElement CheckBox_Q000BAQ() {
		return CheckBox_Q000BAQ;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookBulkCancelGridTbl_Id_Q000BAQ_1_ctschqbookVO.ACC_CIF']")
	private WebElement CheckBox_Q000BAQ_CIF;

	public WebElement CheckBox_Q000BAQ_CIF() {
		return CheckBox_Q000BAQ_CIF;
	}

	@FindBy(xpath = "//label[@id='chequebookBulkCancelFormId_Q000BAQ_retrieve_key']//ancestor::a")
	private WebElement CheckBox_Q000BAQ_Retrieve;

	public WebElement CheckBox_Q000BAQ_Retrieve() {
		return CheckBox_Q000BAQ_Retrieve;
	}

	@FindBy(xpath = "//a[text()='×']")
	private WebElement Q000BAQ_Warning_popUp;

	public WebElement Q000BAQ_Warning_popUp() {
		return Q000BAQ_Warning_popUp;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_CIF']")
	private WebElement Q000MT_Maintenance_Cif_Search;

	public WebElement Q000MT_Maintenance_Cif_Search() {
		return Q000MT_Maintenance_Cif_Search;
	}

	@FindBy(xpath = "//div[text()='Status']")
	private WebElement Status_Validate;

	public WebElement Status_Validate() {
		return Status_Validate;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.CODE']")
	private WebElement csm_Submit_CodeSearchField;

	public WebElement csm_Submit_CodeSearchField() {
		return csm_Submit_CodeSearchField;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000SB_1_ctschqbookVO.CODE']")
	private WebElement csm_Submit_FirstRecord;

	public WebElement csm_Submit_FirstRecord() {
		return csm_Submit_FirstRecord;
	}

	@FindBy(id = "chequeBookrequestInfo")
	private WebElement csm_RequestInformation;

	public WebElement csm_RequestInformation() {
		return csm_RequestInformation;
	}

	@FindBy(name = "chequeBookCO.ctschqbookVO.COLLECTED_BY")
	private WebElement csm_Submit_RequestInformation_CollectedByField;

	public WebElement csm_Submit_RequestInformation_CollectedByField() {
		return csm_Submit_RequestInformation_CollectedByField;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000TR_1_ctschqbookVO.CODE']")
	private WebElement csm_ApplyToSubmit_FirstRecord;

	public WebElement csm_ApplyToSubmit_FirstRecord() {
		return csm_ApplyToSubmit_FirstRecord;
	}

	@FindBy(xpath = "//a[@id='Q000BTD']")
	private WebElement csm_chequeBookRequest_BulkDestroy;

	public WebElement csm_chequeBookRequest_BulkDestroy() {
		return csm_chequeBookRequest_BulkDestroy;
	}

	@FindBy(xpath = "//button[@id='chequeBookBulkDestory_retrieve_Q000BAD']")
	private WebElement csm_chequeBookRequest_Retrive_btnn;

	public WebElement csm_chequeBookRequest_Retrive_btnn() {
		return csm_chequeBookRequest_Retrive_btnn;
	}

	@FindBy(xpath = "//input[@id='jqg_chequeBookBulkDestroyGridTbl_Id_Q000BTD_1']")
	private WebElement csm_chequeBookRequest_CodeSearching;

	public WebElement csm_chequeBookRequest_CodeSearching() {
		return csm_chequeBookRequest_CodeSearching;
	}

	@FindBy(xpath = "//td[@id=td_chequeBookBulkDestroyGridTbl_Id_Q000BTD_2_ctschqbookVO.CODE")
	private WebElement csm_chequeBookRequest_SelectData;

	public WebElement csm_chequeBookRequest_SelectData() {
		return csm_chequeBookRequest_SelectData;
	}

	@FindBy(xpath = "//textarea[@id='status_remarks_bulk_destroy_Q000BTD']")
	private WebElement csm_chequeBookRequest_Remarks;

	public WebElement csm_chequeBookRequest_Remarks() {
		return csm_chequeBookRequest_Remarks;
	}

	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BTD_to_destroy_key']")
	private WebElement csm_chequeBookRequest_ToDestry;

	public WebElement csm_chequeBookRequest_ToDestry() {
		return csm_chequeBookRequest_ToDestry;
	}

	@FindBy(xpath = "//span[text()='Approve / Reject Bulk Destroy']")
	private WebElement csm_chequeBookRequest_ApproveRejectBulkDestroy;

	public WebElement csm_chequeBookRequest_ApproveRejectBulkDestroy() {
		return csm_chequeBookRequest_ApproveRejectBulkDestroy;
	}

	@FindBy(xpath = "//button[@id='chequeBookBulkDestory_retrieve_Q000BAD']")
	private WebElement csm_chequeBookRequest_Retrivebtn;

	public WebElement csm_chequeBookRequest_Retrivebtn() {
		return csm_chequeBookRequest_Retrivebtn;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookBulkDestroyGridTbl_Id_Q000BAD_1_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequest_SameData;

	public WebElement csm_chequeBookRequest_SameData() {
		return csm_chequeBookRequest_SameData;
	}

	@FindBy(xpath = "//td[@id='search_chequeBookBulkDestroyGridTbl_Id_Q000BTD']/div/span")
	private WebElement csm_chequeBookRequest_Searchbtn;

	public WebElement csm_chequeBookRequest_Searchbtn() {
		return csm_chequeBookRequest_Searchbtn;

	}

	@FindBy(xpath = "//input[@id='jqg2']")
	private WebElement csm_chequeBookRequest_Searchbox;

	public WebElement csm_chequeBookRequest_Searchbox() {
		return csm_chequeBookRequest_Searchbox;

	}

	@FindBy(xpath = "//a[@id='fbox_chequeBookBulkDestroyGridTbl_Id_Q000BTD_search']")
	private WebElement csm_chequeBookRequest_Findbtn;

	public WebElement csm_chequeBookRequest_Findbtn() {
		return csm_chequeBookRequest_Findbtn;

	}

	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement csm_chequeBookRequest_Tobedestroy;

	public WebElement csm_chequeBookRequest_Tobedestroy() {
		return csm_chequeBookRequest_Tobedestroy;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequest_Codebox;

	public WebElement csm_chequeBookRequest_Codebox() {
		return csm_chequeBookRequest_Codebox;
	}

	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BTD_retrieve_key']")
	private WebElement csm_chequeBookRequest_retrieve;

	public WebElement csm_chequeBookRequest_retrieve() {
		return csm_chequeBookRequest_retrieve;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookBulkDestroyGridTbl_Id_Q000BTD_1_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequest_Code_Get;

	public WebElement csm_chequeBookRequest_Code_Get() {
		return csm_chequeBookRequest_Code_Get;
	}

	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BAD_retrieve_key']")
	private WebElement csm_chequeBookRequest_retrieve_Q00BAD;

	public WebElement csm_chequeBookRequest_retrieve_Q00BAD() {
		return csm_chequeBookRequest_retrieve_Q00BAD;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequest_Codevalue;

	public WebElement csm_chequeBookRequest_Codevalue() {
		return csm_chequeBookRequest_Codevalue;
	}

	@FindBy(xpath = "//input[@id='bulk_destroy_period_O001UP']")
	private WebElement csm_BulkDestroyPeriod;

	public WebElement csm_BulkDestroyPeriod() {
		return csm_BulkDestroyPeriod;
	}

	@FindBy(xpath = "//div[@id='suspiciousGrid_div_Q000MT']//parent::div//child::button")
	private WebElement Chequebook_Request_Maintenance_Suspicious_Popup_Ok_Btn;

	public WebElement Chequebook_Request_Maintenance_Suspicious_Popup_Ok_Btn() {
		return Chequebook_Request_Maintenance_Suspicious_Popup_Ok_Btn;
	}

	@FindBy(xpath = "//span[contains(text(),' account_type_currency_key ')]")
	private WebElement chequeBook_AccountTypeCurrencyKeyButton;

	public WebElement chequeBookAccountTypeCurrencyKeyButton() {
		return chequeBook_AccountTypeCurrencyKeyButton;
	}

	@FindBy(xpath = "//div[@id='jqgh_tab6_GridTbl_Id_P029MA_ctschequeglcyVO.GL_CODE']")
	private WebElement chequeBook_AccountTypeCurrencyKey_Acc_Type;

	public WebElement chequeBook_AccountTypeCurrencyKey_Acc_Type() {
		return chequeBook_AccountTypeCurrencyKey_Acc_Type;
	}

	@FindBy(xpath = "//td[@id='add_tab6_GridTbl_Id_P029MA']")
	private WebElement chequeBook_AccountTypeCurrencyKey_Table_Add_Btn;

	public WebElement chequeBook_AccountTypeCurrencyKey_Table_Add_Btn() {
		return chequeBook_AccountTypeCurrencyKey_Table_Add_Btn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequeglcyVO.GL_CODE']")
	private WebElement chequeBook_AccountTypeCurrencyKey_Table_GL_Code_input;

	public WebElement chequeBook_AccountTypeCurrencyKey_Table_GL_Code_input() {
		return chequeBook_AccountTypeCurrencyKey_Table_GL_Code_input;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequeglcyVO.CURRENCY_CODE']")
	private WebElement chequeBook_AccountTypeCurrencyKey_Table_Currency_input;

	public WebElement chequeBook_AccountTypeCurrencyKey_Table_Currency_input() {
		return chequeBook_AccountTypeCurrencyKey_Table_Currency_input;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]")
	private WebElement chequeBook_AccountTypeCurrencyKey_Table_Ok_Btn;

	public WebElement chequeBook_AccountTypeCurrencyKey_Table_Ok_Btn() {
		return chequeBook_AccountTypeCurrencyKey_Table_Ok_Btn;
	}

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	private WebElement chequeBook_AccountTypeCurrencyKey_Table_Cancel_Btn;

	public WebElement chequeBook_AccountTypeCurrencyKey_Table_Cancel_Btn() {
		return chequeBook_AccountTypeCurrencyKey_Table_Cancel_Btn;
	}

	@FindBy(id = "code_P024MA")
	private WebElement csmParam_Transactiontype_UpdateAfterApprove_Code_Input;

	public WebElement csmParam_Transactiontype_UpdateAfterApprove_Code_Input() {
		return csmParam_Transactiontype_UpdateAfterApprove_Code_Input;
	}

	@FindBy(xpath = "//span[contains(text(),'Gl Charges')]//parent::a")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_button;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_button() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_button;
	}

	@FindBy(xpath = "//td[@id='add_tab4_GridTbl_Id_P029MA']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Add_Btn;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Add_Btn() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Add_Btn;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequesChargesVO.ENTITY_CODE']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_GLCode;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_GLCode() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_GLCode;
	}

	@FindBy(xpath = "//select[contains(@id,'ctschequesChargesVO.ISSUE_TYPE')]")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Issue_Type_LOV;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Issue_Type_LOV() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Issue_Type_LOV;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequesChargesVO.CHEQUE_TYPE']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Cheque_Type;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Cheque_Type() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Cheque_Type;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequesChargesVO.LEAVES']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Leaves;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Leaves() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Leaves;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequesChargesVO.CHARGES_SCHEMA']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Approve_Charges;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Approve_Charges() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Approve_Charges;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid Entry')]")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Invalid_Entry_Popup;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Invalid_Entry_Popup() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Invalid_Entry_Popup;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequesChargesVO.TRX_TYPE']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Trx_Type;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Trx_Type() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Trx_Type;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequesChargesVO.DESTROY_CHARGES']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Destroy_charges;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Destroy_charges() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Destroy_charges;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequesChargesVO.CANCEL_CHARGES']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Cancel_charges;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Cancel_charges() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Cancel_charges;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequesChargesVO.SUBMIT_CHARGES']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Submit_charges;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Submit_charges() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Submit_charges;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequesChargesVO.IN_HOUSE_SCHEMA']")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_In_House_Schema;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_In_House_Schema() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_In_House_Schema;
	}

	@FindBy(xpath = "//span[text()='Ok']//parent::button")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Ok_Btn;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Ok_Btn() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Ok_Btn;
	}

	@FindBy(xpath = "//button[contains(@id,'cancel_btn')]")
	private WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Cancel_Btn;

	public WebElement csmParam_chqbook_UpdateAfterApprove_GLCharges_Cancel_Btn() {
		return csmParam_chqbook_UpdateAfterApprove_GLCharges_Cancel_Btn;
	}

	@FindBy(id = "chqBkImpExpGridTbl_Id_Q000RP_gs_ctschqbookVO.CODE")

	private WebElement csmReceiveFromProviderSearchChequebookCodeInput;

	public WebElement csmReceiveFromProviderSearchChequebookCodeInput() {
		return csmReceiveFromProviderSearchChequebookCodeInput;
	}

	@FindBy(id = "chequeBook_sentToBranch_Q000TB")
	private WebElement sentToBranchButton;

	public WebElement sentToBranchButton() {
		return sentToBranchButton;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TB_gs_ctschqbookVO.CODE")
	private WebElement sentToBranchGridCodeInput;

	public WebElement sentToBranchGridCodeInput() {
		return sentToBranchGridCodeInput;
	}

	@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000TB")
	private WebElement sentToBranchChequeCodeInput;

	public WebElement sentToBranchChequeCodeInput() {
		return sentToBranchChequeCodeInput;
	}

	@FindBy(id = "chqBkImpExpGridTbl_Id_Q000RB_gs_ctschqbookVO.CODE")
	private WebElement receivedByBranchCheuqeCodeInput;

	public WebElement receivedByBranchCheuqeCodeInput() {
		return receivedByBranchCheuqeCodeInput;
	}

	@FindBy(xpath = "//form[@id='chequeBookImpExpFormId_Q000RB']//a[contains(@id,'anchor')]")
	private WebElement receivedByBranchProceedButton;

	public WebElement receivedByBranchProceedButton() {
		return receivedByBranchProceedButton;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TS_gs_ctschqbookVO.CODE")
	private WebElement toSuspendCheuqeCodeInput;

	public WebElement toSuspendCheuqeCodeInput() {
		return toSuspendCheuqeCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TRE_gs_ctschqbookVO.CODE")
	private WebElement toReActivateChequeCodeInput;

	public WebElement toReActivateChequeCodeInput() {
		return toReActivateChequeCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000RE_gs_ctschqbookVO.CODE")
	private WebElement reActivateChequeCodeInput;

	public WebElement reActivateChequeCodeInput() {
		return reActivateChequeCodeInput;
	}

	@FindBy(id = "chequeBook_toSuspend_Q000TS")
	private WebElement toSuspendButton;

	public WebElement toSuspendButton() {
		return toSuspendButton;
	}

	@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000TS")
	private WebElement toSuspendChequeValidation;

	public WebElement toSuspendChequeValidation() {
		return toSuspendChequeValidation;
	}

	@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000SP")
	private WebElement suspendChequeValidation;

	public WebElement suspendChequeValidation() {
		return suspendChequeValidation;
	}

	@FindBy(xpath = "//a[@class='tbClose']//parent::td//following-sibling::td//span")
	private List<WebElement> closeAllTab;

	public List<WebElement> closeAllTab() {
		return closeAllTab;
	}

	@FindBy(id = "chequeBook_toReactivate_Q000TRE")
	private WebElement toReactivateButton;

	public WebElement toReactivateButton() {
		return toReactivateButton;
	}

	@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000TRE")
	private WebElement toReactivateCheuqeCodeeValidation;

	public WebElement toReactivateCheuqeCodeeValidation() {
		return toReactivateCheuqeCodeeValidation;
	}

	@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000RE")
	private WebElement reactivateCheuqeCodeeValidation;

	public WebElement reactivateCheuqeCodeeValidation() {
		return reactivateCheuqeCodeeValidation;
	}

	@FindBy(id = "chequeBook_reactivate_Q000RE")
	private WebElement reactivateButton;

	public WebElement reactivateButton() {
		return reactivateButton;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AR_gs_ctschqbookVO.CODE']")
	private WebElement tobeReversedScreenSearchChequeCode;

	public WebElement tobeReversedScreenSearchChequeCode() {
		return tobeReversedScreenSearchChequeCode;
	}

	@FindBy(xpath = "//button[@id='chequeBook_toBeReversed_Q000AR']")
	private WebElement toBereversedButton;

	public WebElement toBereversedButton() {
		return toBereversedButton;
	}

	@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000AR")
	private WebElement toBeReversedCodeValidation;

	public WebElement toBeReversedCodeValidation() {
		return toBeReversedCodeValidation;
	}

	@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000RV")
	private WebElement reversedCodeValidation;

	public WebElement reversedCodeValidation() {
		return reversedCodeValidation;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000RV_gs_ctschqbookVO.CODE']")
	private WebElement reversedChequebookCode;

	public WebElement reversedChequebookCode() {
		return reversedChequebookCode;
	}

	@FindBy(id = "chequeBook_reverse_Q000RV")
	private WebElement reverseButton;

	public WebElement reverseButton() {
		return reverseButton;
	}

	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000MT_1_ctschqbookVO.CODE']")
	private WebElement chequebookMaintenanceGridLoadValidation;

	public WebElement chequebookMaintenanceGridLoadValidation() {
		return chequebookMaintenanceGridLoadValidation;
	}

	@FindBy(id = "collected_by_Q000TR")
	private WebElement requestInformationCollectedByInput;

	public WebElement requestInformationCollectedByInput() {
		return requestInformationCollectedByInput;
	}

	@FindBy(id = "lookuptxt_collected_by_id_Q000TR")
	private WebElement requestInformationCollectedByIDField;

	public WebElement requestInformationCollectedByIDField() {
		return requestInformationCollectedByIDField;
	}

	@FindBy(id = "collected_by_Q000SB")
	private WebElement requestSubmitInformationCollectedByInput;

	public WebElement requestSubmitInformationCollectedByInput() {
		return requestSubmitInformationCollectedByInput;
	}

	@FindBy(id = "lookuptxt_collected_by_id_Q000SB")
	private WebElement requestSubmitInformationCollectedByIDInput;

	public WebElement requestSubmitInformationCollectedByIDInput() {
		return requestSubmitInformationCollectedByIDInput;
	}

	@FindBy(id = "lookuptxt_bulk_cif_Q000BTC")
	private WebElement toCancelBatchCIFNumberInput;

	public WebElement toCancelBatchCIFNumberInput() {
		return toCancelBatchCIFNumberInput;
	}

	@FindBy(id = "lookuptxt_chq_cancel_reason_Q000BTC")
	private WebElement toCancelBatchCancelReasonInput;

	public WebElement toCancelBatchCancelReasonInput() {
		return toCancelBatchCancelReasonInput;
	}

	@FindBy(id = "chequebookBulkCancel_to_cancel_Q000BTC")
	private WebElement toCancelBatchToCancelButton;

	public WebElement toCancelBatchToCancelButton() {
		return toCancelBatchToCancelButton;
	}

	@FindBy(xpath = "//label[@id='chequebookBulkCancelFormId_Q000BTC_retrieve_key']//ancestor::a")
	private WebElement toCancelBatchRetriveButton;

	public WebElement toCancelBatchRetriveButton() {
		return toCancelBatchRetriveButton;
	}

	@FindBy(xpath = "//td[contains(@id,'td_chequeBookBulkCancelGridTbl_Id_Q000BTC_0_cb')]")
	private WebElement toCancelSCreenrecordLoadValidation;

	public WebElement toCancelSCreenrecordLoadValidation() {
		return toCancelSCreenrecordLoadValidation;
	}

	@FindBy(id = "lookuptxt_bulk_cif_Q000BAC")
	private WebElement approveBatchCancelCIFNumberInput;

	public WebElement approveBatchCancelCIFNumberInput() {
		return approveBatchCancelCIFNumberInput;
	}

	@FindBy(xpath = "//label[@id='chequebookBulkCancelFormId_Q000BAC_retrieve_key']//ancestor::a")
	private WebElement approveCancelBatchRetriveButton;

	public WebElement approveCancelBatchRetriveButton() {
		return approveCancelBatchRetriveButton;
	}

	@FindBy(id = "chequebookBulkCancel_approve_cancel_Q000BAC")
	private WebElement approveCancelButtonBatch;

	public WebElement approveCancelButtonBatch() {
		return approveCancelButtonBatch;
	}

	@FindBy(xpath = "//div[contains(text(),'32900')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement chequebookErrorPopupForNoChequebookWithFilter;

	public WebElement chequebookErrorPopupForNoChequebookWithFilter() {
		return chequebookErrorPopupForNoChequebookWithFilter;
	}

	@FindBy(id = "lookuptxt_bulk_cif_Q000BTQ")
	private WebElement reverseCancellationBatchCIFNumberInput;

	public WebElement reverseCancellationBatchCIFNumberInput() {
		return reverseCancellationBatchCIFNumberInput;
	}

	@FindBy(xpath = "//label[@id='chequebookBulkCancelFormId_Q000BTQ_retrieve_key']//ancestor::a")
	private WebElement reverseCancellationBatchRetriveButton;

	public WebElement reverseCancellationBatchRetriveButton() {
		return reverseCancellationBatchRetriveButton;
	}

	@FindBy(id = "chequebookBulkCancel_to_reverse_cancel_Q000BTQ")
	private WebElement reverseCancellationBatchReverseButton;

	public WebElement reverseCancellationBatchReverseButton() {
		return reverseCancellationBatchReverseButton;
	}

	@FindBy(id = "lookuptxt_bulk_cif_Q000BAQ")
	private WebElement reverseCancellationApproveBatchCIFNumberInput;

	public WebElement reverseCancellationApproveBatchCIFNumberInput() {
		return reverseCancellationApproveBatchCIFNumberInput;
	}

	@FindBy(xpath = "//label[@id='chequebookBulkCancelFormId_Q000BAQ_retrieve_key']//ancestor::a")
	private WebElement reverseCancellationApproveBatchRetriveButton;

	public WebElement reverseCancellationApproveBatchRetriveButton() {
		return reverseCancellationApproveBatchRetriveButton;
	}

	@FindBy(id = "chequebookBulkCancel_approve_reverse_cancel_Q000BAQ")
	private WebElement reverseCancellationBatchApproveReverseButton;

	public WebElement reverseCancellationBatchApproveReverseButton() {
		return reverseCancellationBatchApproveReverseButton;
	}

	@FindBy(xpath = "//tr[@id='1']//input[contains(@id,'chequeBookBulkCancelGridTbl_Id_Q000BTQ')]")
	private WebElement reverseCancellationGridRecordPopulationValidation;

	public WebElement reverseCancellationGridRecordPopulationValidation() {
		return reverseCancellationGridRecordPopulationValidation;
	}

	@FindBy(xpath = "//tr[@id='1']//input[contains(@id,'chequeBookBulkCancelGridTbl_Id_Q000BAQ_')]")
	private WebElement approveReverseCancellationGridRecordPopulationValidation;

	public WebElement approveReverseCancellationGridRecordPopulationValidation() {
		return approveReverseCancellationGridRecordPopulationValidation;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TQ_gs_ctschqbookVO.CODE")
	private WebElement toReverseCancellationSearchChequeCodeGridInput;

	public WebElement toReverseCancellationSearchChequeCodeGridInput() {
		return toReverseCancellationSearchChequeCodeGridInput;
	}

	@FindBy(id = "chequeBook_reverseCancel_Q000TQ")
	private WebElement toReverseCancellationReverseButton;

	public WebElement toReverseCancellationReverseButton() {
		return toReverseCancellationReverseButton;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000AQ_gs_ctschqbookVO.CODE")
	private WebElement approveReverseCancellationSearchChequeCodeGridInput;

	public WebElement approveReverseCancellationSearchChequeCodeGridInput() {
		return approveReverseCancellationSearchChequeCodeGridInput;
	}

	@FindBy(id = "chequeBook_approveCancel_Q000AQ")
	private WebElement approveReverseCancellationReverseButton;

	public WebElement approveReverseCancellationReverseButton() {
		return approveReverseCancellationReverseButton;
	}

	@FindBy(id = "chq_amendable_P029MA")
	private WebElement chequebookChequePaperAmendableFlag;

	public WebElement chequebookChequePaperAmendableFlag() {
		return chequebookChequePaperAmendableFlag;
	}

	@FindBy(id = "number_of_cheques_Q000MT")
	private WebElement chequebookRequestNumberOfPaperInputBox;

	public WebElement chequebookRequestNumberOfPaperInputBox() {
		return chequebookRequestNumberOfPaperInputBox;
	}

	@FindBy(id = "status_br_Q000QR")
	private WebElement branchCodeInChequeBookQuery;

	public WebElement branchCodeInChequeBookQuery() {
		return branchCodeInChequeBookQuery;
	}

	@FindBy(id = "status_cy_Q000QR")
	private WebElement currencyCodeInChequeBookQuery;

	public WebElement currencyCodeInChequeBookQuery() {
		return currencyCodeInChequeBookQuery;
	}

	@FindBy(id = "status_gl_Q000QR")
	private WebElement glCodeInChequeBookQuery;

	public WebElement glCodeInChequeBookQuery() {
		return glCodeInChequeBookQuery;
	}

	@FindBy(id = "status_cif_Q000QR")
	private WebElement cifCodeInChequeBookQuery;

	public WebElement cifCodeInChequeBookQuery() {
		return cifCodeInChequeBookQuery;
	}

	@FindBy(id = "lookuptxt_status_sl_Q000QR")
	private WebElement serialNoInChequeBookQuery;

	public WebElement serialNoInChequeBookQuery() {
		return serialNoInChequeBookQuery;
	}

	@FindBy(xpath = "//td[@id='chequeBookQueryTbl_Id_Q000QR_pager_left']//span[@class='ui-icon ui-icon-refresh']")
	private WebElement chequebookQueryClearButton;

	public WebElement chequebookQueryClearButton() {
		return chequebookQueryClearButton;
	}

	@FindBy(id = "td_chequeBookQueryTbl_Id_Q000QR_1_BRANCH_CODE")
	private WebElement chequebookQueryScreenRecordPopulatedValidation;

	public WebElement chequebookQueryScreenRecordPopulatedValidation() {
		return chequebookQueryScreenRecordPopulatedValidation;
	}

	@FindBy(id = "chequeBookQueryTbl_Id_Q000QR_gs_CODE")
	private WebElement chequebookQueryScreenChequeCodeSearchInput;

	public WebElement chequebookQueryScreenChequeCodeSearchInput() {
		return chequebookQueryScreenChequeCodeSearchInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000PT_gs_ctschqbookVO.ACC_BR")
	private WebElement chequebookPrintScreenBranchCodeInput;

	public WebElement chequebookPrintScreenBranchCodeInput() {
		return chequebookPrintScreenBranchCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000PT_gs_ctschqbookVO.ACC_CY")
	private WebElement chequebookPrintScreenCurrencyCodeInput;

	public WebElement chequebookPrintScreenCurrencyCodeInput() {
		return chequebookPrintScreenCurrencyCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000PT_gs_ctschqbookVO.ACC_GL")
	private WebElement chequebookPrintScreenGLCodeInput;

	public WebElement chequebookPrintScreenGLCodeInput() {
		return chequebookPrintScreenGLCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000PT_gs_ctschqbookVO.ACC_CIF")
	private WebElement chequebookPrintScreenCIFCodeInput;

	public WebElement chequebookPrintScreenCIFCodeInput() {
		return chequebookPrintScreenCIFCodeInput;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000PT_gs_ctschqbookVO.ACC_SL")
	private WebElement chequebookPrintScreenSerialNumberInput;

	public WebElement chequebookPrintScreenSerialNumberInput() {
		return chequebookPrintScreenSerialNumberInput;
	}

	@FindBy(id = "forbid_other_br_chq_O001UP")
	private WebElement controlRecordDonotAllowChequeBookRequestForAnAccountFromOtherThanHisHerMainBranch;

	public WebElement controlRecordDonotAllowChequeBookRequestForAnAccountFromOtherThanHisHerMainBranch() {
		return controlRecordDonotAllowChequeBookRequestForAnAccountFromOtherThanHisHerMainBranch;
	}

	@FindBy(xpath = "//div[contains(text(),'3079')]")
	private WebElement chequebookRequestotherBranchStopperValidationPopup;

	public WebElement chequebookRequestotherBranchStopperValidationPopup() {
		return chequebookRequestotherBranchStopperValidationPopup;
	}

	@FindBy(id = "max_nbr_of_chqbooks_P029MA")
	private WebElement chequebookMaxiumumNumberOfChequebookPerRequest;

	public WebElement chequebookMaxiumumNumberOfChequebookPerRequest() {
		return chequebookMaxiumumNumberOfChequebookPerRequest;
	}

	@FindBy(xpath = "//div[contains(text(),'902866')]")
	private WebElement chequebookMaxiumumNumberOfChequebookValidationPopup;

	public WebElement chequebookMaxiumumNumberOfChequebookValidationPopup() {
		return chequebookMaxiumumNumberOfChequebookValidationPopup;
	}

	@FindBy(xpath = "//div[contains(text(),'902866')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement chequebookMaxiumumNumberOfChequebookValidationPopupOkButtton;

	public WebElement chequebookMaxiumumNumberOfChequebookValidationPopupOkButtton() {
		return chequebookMaxiumumNumberOfChequebookValidationPopupOkButtton;
	}

	@FindBy(id = "chq_unique_O001UP")
	private WebElement chequeUniqueBasedOnDropdown;

	public WebElement chequeUniqueBasedOnDropdown() {
		return chequeUniqueBasedOnDropdown;
	}

	@FindBy(id = "reuse_chq_nbr_yn_P029MT")
	private WebElement chequebookReuseCancelledReversedCancelledFlag;

	public WebElement chequebookReuseCancelledReversedCancelledFlag() {
		return chequebookReuseCancelledReversedCancelledFlag;
	}

	@FindBy(xpath = "//input[contains(@id,'reuse_chq_nbr_yn_')]")
	private WebElement chequebookUpdatedAfterApproveReuseCancelledReversedCancelledFlag;

	public WebElement chequebookUpdatedAfterApproveReuseCancelledReversedCancelledFlag() {
		return chequebookUpdatedAfterApproveReuseCancelledReversedCancelledFlag;
	}

	@FindBy(xpath = "//input[@id='code_P029MT']")
	private WebElement chequebookMaintenanceChequeCodeInput;

	public WebElement chequebookMaintenanceChequeCodeInput() {
		return chequebookMaintenanceChequeCodeInput;
	}

	@FindBy(xpath = "//input[@id='brief_name_eng_P029MT']")
	private WebElement chequebookMaintenanceBriefNameInput;

	public WebElement chequebookMaintenanceBriefNameInput() {
		return chequebookMaintenanceBriefNameInput;
	}

	@FindBy(xpath = "//input[@id='number_of_cheques_P029MT']")
	private WebElement chequebookMaintenanceNumberOfChequesInput;

	public WebElement chequebookMaintenanceNumberOfChequesInput() {
		return chequebookMaintenanceNumberOfChequesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'lookuptxt_cheque_types_')]")
	private WebElement chequebookMaintenanceChequeTypeInput;

	public WebElement chequebookMaintenanceChequeTypeInput() {
		return chequebookMaintenanceChequeTypeInput;
	}

	@FindBy(xpath = "//input[contains(@id,'lookuptxt_leaves_')]")
	private WebElement chequebookMaintenanceChequeLeavesInput;

	public WebElement chequebookMaintenanceChequeLeavesInput() {
		return chequebookMaintenanceChequeLeavesInput;
	}

	@FindBy(id = "chequesBookMaint_Maint_save_P029MT")
	private WebElement chequebookMaintenanceSaveButton;

	public WebElement chequebookMaintenanceSaveButton() {
		return chequebookMaintenanceSaveButton;
	}

	@FindBy(xpath = "//button[contains(@id,'chequeBook_approve')]")
	private WebElement chequebookApproveButton;

	public WebElement chequebookApproveButton() {
		return chequebookApproveButton;
	}

	@FindBy(id = "status_remarks_Q000AC")
	private WebElement chequebookApproveCancelRejectReasonInput;

	public WebElement chequebookApproveCancelRejectReasonInput() {
		return chequebookApproveCancelRejectReasonInput;
	}

	@FindBy(id = "status_remarks_Q000RV")
	private WebElement reverseRejectReasonInput;

	public WebElement reverseRejectReasonInput() {
		return reverseRejectReasonInput;
	}

	@FindBy(xpath = "//div[contains(text(),'890')]")
	private WebElement chequebookRejectReasonMandatoryValidationPopup;

	public WebElement chequebookRejectReasonMandatoryValidationPopup() {
		return chequebookRejectReasonMandatoryValidationPopup;
	}

	@FindBy(xpath = "//div[contains(text(),'890')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement chequebookRejectReasonValidationPopupOkButton;

	public WebElement chequebookRejectReasonValidationPopupOkButton() {
		return chequebookRejectReasonValidationPopupOkButton;
	}

	@FindBy(id = "chequeBook_reject_Q000AC")
	private WebElement approveCancelRejectButton;

	public WebElement approveCancelRejectButton() {
		return approveCancelRejectButton;
	}

	@FindBy(id = "chequeBook_reject_Q000RV")
	private WebElement reverseRejectButton;

	public WebElement reverseRejectButton() {
		return reverseRejectButton;
	}

	@FindBy(id = "status_remarks_Q000AP")
	private WebElement approveRejectReasonInput;

	public WebElement approveRejectReasonInput() {
		return approveRejectReasonInput;
	}

	@FindBy(id = "chequeBook_reject_Q000AP")
	private WebElement approveRejectButton;

	public WebElement approveRejectButton() {
		return approveRejectButton;
	}

	@FindBy(id = "status_remarks_Q000SB")
	private WebElement submitRejectReasonInput;

	public WebElement submitRejectReasonInput() {
		return submitRejectReasonInput;
	}

	@FindBy(id = "chequeBook_reject_Q000SB")
	private WebElement submitRejectButton;

	public WebElement submitRejectButton() {
		return submitRejectButton;
	}

	@FindBy(xpath = "//input[contains(@id,'bulk_destroy_period_')]")
	private WebElement controlRecordBulkDestroyPeriod;

	public WebElement controlRecordBulkDestroyPeriod() {
		return controlRecordBulkDestroyPeriod;
	}

	@FindBy(id = "bulk_destroy_period_Q000BTD")
	private WebElement bulkDestroyScreenPeriod;

	public WebElement bulkDestroyScreenPeriod() {
		return bulkDestroyScreenPeriod;
	}

	@FindBy(id = "chequeBookBulkDestory_retrieve_Q000BTD")
	private WebElement bulkDestroyRetriveButton;

	public WebElement bulkDestroyRetriveButton() {
		return bulkDestroyRetriveButton;
	}

	@FindBy(id = "status_remarks_Q000AC_ALERT")
	private WebElement chequebookApproveCancelAlertRejectRemark;

	public WebElement chequebookApproveCancelAlertRejectRemark() {
		return chequebookApproveCancelAlertRejectRemark;
	}

	@FindBy(id = "status_remarks_Q000AP_ALERT")
	private WebElement chequebookApproveAlertRejectRemark;

	public WebElement chequebookApproveAlertRejectRemark() {
		return chequebookApproveAlertRejectRemark;
	}

	@FindBy(id = "status_remarks_Q000SB_ALERT")
	private WebElement chequebookSubmitAlertRejectRemark;

	public WebElement chequebookSubmitAlertRejectRemark() {
		return chequebookSubmitAlertRejectRemark;
	}

	// Q000RV
	@FindBy(id = "status_remarks_Q000RV_ALERT")
	private WebElement chequebookReverseAlertRejectRemark;

	public WebElement chequebookReverseAlertRejectRemark() {
		return chequebookReverseAlertRejectRemark;
	}

	@FindBy(xpath = "//textarea[@id='status_remarks_Q000AP']")
	private WebElement chequebookApproveScreenRejectRemark;

	public WebElement chequebookApproveScreenRejectRemark() {
		return chequebookApproveScreenRejectRemark;
	}

	@FindBy(xpath = "//button[@id='chequeBook_reject_Q000AP']")
	private WebElement chequebookApproveScreenRejectButton;

	public WebElement chequebookApproveScreenRejectButton() {
		return chequebookApproveScreenRejectButton;
	}

	@FindBy(id = "status_remarks_Q000SB")
	private WebElement chequebookSubmitRejectReason;

	public WebElement chequebookSubmitRejectReason() {
		return chequebookSubmitRejectReason;
	}

	@FindBy(id = "status_remarks_Q000AD")
	private WebElement chequebookDestroyRejectRemakField;

	public WebElement chequebookDestroryRejectReasonField() {
		return chequebookDestroyRejectRemakField;
	}

	@FindBy(id = "chequeBook_reject_Q000AD")
	private WebElement chequebookDestroyRejectButton;

	public WebElement chequebookDestroyRejectButton() {
		return chequebookDestroyRejectButton;
	}

	@FindBy(id = "status_remarks_Q000RV")
	private WebElement chequebookReverseRejectRemakField;

	public WebElement chequebookReverseRejectRemakField() {
		return chequebookReverseRejectRemakField;
	}

	@FindBy(id = "chequeBook_reject_Q000RV")
	private WebElement chequebookReverseRejectButton;

	public WebElement chequebookReverseRejectButton() {
		return chequebookReverseRejectButton;
	}

	@FindBy(id = "status_remarks_bulk_destroy_Q000BTD")
	private WebElement cheuqebookBulkDestroyRemark;

	public WebElement cheuqebookBulkDestroyRemark() {
		return cheuqebookBulkDestroyRemark;
	}

	@FindBy(id = "chequeBookBulkDestory_to_destroy_Q000BTD")
	private WebElement chequebookBulkDestroyDestroyButton;

	public WebElement chequebookBulkDestroyDestroyButton() {
		return chequebookBulkDestroyDestroyButton;
	}

	@FindBy(id = "chequeBookBulkDestory_retrieve_Q000BAD")
	private WebElement chequebookApproveBulkDestroyRetriveButton;

	public WebElement chequebookApproveBulkDestroyRetriveButton() {
		return chequebookApproveBulkDestroyRetriveButton;
	}

	@FindBy(xpath = "//table[@id='chequeBookBulkDestroyGridTbl_Id_Q000BAD']//tr[@id='1']")
	private WebElement chequebookApproveBulkDestroyRecordPopulateValidation;

	public WebElement chequebookApproveBulkDestroyRecordPopulateValidation() {
		return chequebookApproveBulkDestroyRecordPopulateValidation;
	}

	@FindBy(xpath = "//table[@id='chequeBookBulkDestroyGridTbl_Id_Q000BTD']//tr[@id='1']")
	private WebElement chequebookBulkDestroyRecordPopulateValidation;

	public WebElement chequebookBulkDestroyRecordPopulateValidation() {
		return chequebookBulkDestroyRecordPopulateValidation;
	}

	@FindBy(id = "chequeBookBulkDestory_destroy_Q000BAD")
	private WebElement chequebookApproveBulkDestroyDestroyButton;

	public WebElement chequebookApproveBulkDestroyDestroyButton() {
		return chequebookApproveBulkDestroyDestroyButton;
	}

	@FindBy(id = "chequeBookBulkDestory_reject_destroy_Q000BAD")
	private WebElement chequebookApproveBulkDestroyRejectButton;

	public WebElement chequebookApproveBulkDestroyRejectButton() {
		return chequebookApproveBulkDestroyRejectButton;
	}

	@FindBy(id = "cb_chequeBookBulkDestroyGridTbl_Id_Q000BAD")
	private WebElement approveRejectBulkDestroyAllRecordCheckBox;

	public WebElement approveRejectBulkDestroyAllRecordCheckBox() {
		return approveRejectBulkDestroyAllRecordCheckBox;
	}

	@FindBy(xpath = "//input[@id='physical_status_G001H']")
	private WebElement Status_OF_Card;

	public WebElement Status_OF_Card() {
		return Status_OF_Card;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001MT_gs_cardsMgtVO.CARD_TYPE']")
	private WebElement InputCardMaintenance;

	public WebElement InputCardMaintenance() {
		return InputCardMaintenance;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_G001MT']")
	private WebElement SearchCardMaintenance;

	public WebElement SearchCardMaintenance() {
		return SearchCardMaintenance;
	}

	@FindBy(id = "multi_cy_P029MA")
	private WebElement chequesMultiCurrencyFlag;

	public WebElement chequesMultiCurrencyFlag() {
		return chequesMultiCurrencyFlag;
	}

	@FindBy(xpath = "//span[contains(text(),'Additional A/C')]")
	private WebElement chequebookMaintenanceAdditionalAccountSectionValidation;

	public WebElement chequebookMaintenanceAdditionalAccountSectionValidation() {
		return chequebookMaintenanceAdditionalAccountSectionValidation;
	}

	@FindBy(xpath = "//span[contains(text(),' CIF Charges ')]//parent::a")
	private WebElement chequebookCIFChargesButton;

	public WebElement chequebookCIFChargesButton() {
		return chequebookCIFChargesButton;
	}

	@FindBy(xpath = "//div[@id='tab2_GridTbl_Id_P029MA_pager']//span[@class='ui-icon ui-icon-plus']")
	private WebElement chequebookCIFChargesAddButton;

	public WebElement chequebookCIFChargesAddButton() {
		return chequebookCIFChargesAddButton;
	}

	@FindBy(xpath = "//input[contains(@id,'ENTITY_CODE_lookuptxt_tab2_GridTbl_Id_P029MA')]")
	private WebElement chequebookCIFChargesCIFCodeInput;

	public WebElement chequebookCIFChargesCIFCodeInput() {
		return chequebookCIFChargesCIFCodeInput;
	}

	@FindBy(xpath = "//input[contains(@id,'CHEQUE_TYPE_lookuptxt_tab2_GridTbl_Id_P029MA')]")
	private WebElement chequebookCIFChargesChequeTypeInput;

	public WebElement chequebookCIFChargesChequeTypeInput() {
		return chequebookCIFChargesChequeTypeInput;
	}

	@FindBy(xpath = "//input[contains(@id,'LEAVES_lookuptxt_tab2_GridTbl_Id_P029MA')]")
	private WebElement chequebookCIFChargesChequeLeavesInput;

	public WebElement chequebookCIFChargesChequeLeavesInput() {
		return chequebookCIFChargesChequeLeavesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'CHARGES_SCHEMA_lookuptxt_tab2_GridTbl_Id_P029MA')]")
	private WebElement chequebookCIFChargesChequeSchemaInput;

	public WebElement chequebookCIFChargesChequeSchemaInput() {
		return chequebookCIFChargesChequeSchemaInput;
	}

	@FindBy(xpath = "//input[contains(@id,'TRX_TYPE_lookuptxt_tab2_GridTbl_Id_P029MA')]")
	private WebElement chequebookCIFChargesTrxTypeInput;

	public WebElement chequebookCIFChargesTrxTypeInput() {
		return chequebookCIFChargesTrxTypeInput;
	}

	@FindBy(xpath = "//input[contains(@id,'DESTROY_CHARGES_lookuptxt_tab2_GridTbl_Id_P029MA')]")
	private WebElement chequebookCIFChargesDestroyChargesInput;

	public WebElement chequebookCIFChargesDestroyChargesInput() {
		return chequebookCIFChargesDestroyChargesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'CANCEL_CHARGES_lookuptxt_tab2_GridTbl_Id_P029MA')]")
	private WebElement chequebookCIFChargesCancelChargesInput;

	public WebElement chequebookCIFChargesCancelChargesInput() {
		return chequebookCIFChargesCancelChargesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'SUBMIT_CHARGES_lookuptxt_tab2_GridTbl_Id_P029MA')]")
	private WebElement chequebookCIFChargesSubmitChargesInput;

	public WebElement chequebookCIFChargesSubmitChargesInput() {
		return chequebookCIFChargesSubmitChargesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'IN_HOUSE_SCHEMA_lookuptxt_tab2_GridTbl_Id_P029MA')]")
	private WebElement chequebookCIFChargesInHouseChargesInput;

	public WebElement chequebookCIFChargesInHouseChargesInput() {
		return chequebookCIFChargesInHouseChargesInput;
	}

	@FindBy(id = "bill_P029MA")
	private WebElement chequebookBillFlag;

	public WebElement chequebookBillFlag() {
		return chequebookBillFlag;
	}

	@FindBy(id = "ok_btn_1_P029MA")
	private WebElement chequebookCIFChargesOkButton;

	public WebElement chequebookCIFChargesOkButton() {
		return chequebookCIFChargesOkButton;
	}

	@FindBy(xpath = "//td[contains(@id,'td_chargesGridId_Q000AP_1_chargeDesc')]")
	private WebElement chequebookApprovalChargeDescription;

	public WebElement chequebookApprovalChargeDescription() {
		return chequebookApprovalChargeDescription;
	}

	@FindBy(xpath = "//div[@id='chequeBookChargesDiv_Q000AP']//div[contains(@class,'collapsibleContainerTitle ui-state-focus ui-corner-top')]//span[contains(text(),'Charges')]")
	private WebElement chequebookApprovalChargeSection;

	public WebElement chequebookApprovalChargeSection() {
		return chequebookApprovalChargeSection;
	}

	@FindBy(xpath = "//div[contains(text(),'1905')]")
	private WebElement chequebookTransactionPopup;

	public WebElement chequebookTransactionPopup() {
		return chequebookTransactionPopup;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div/text()[4]")
	private WebElement chequebookTransactionNoWithWarningPopup;

	public WebElement chequebookTransactionNoWithWarningPopup() {
		return chequebookTransactionNoWithWarningPopup;
	}

	@FindBy(xpath = "//div[contains(text(),'1905')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement chequebookTransactionPopupOkButton;

	public WebElement chequebookTransactionPopupOkButton() {
		return chequebookTransactionPopupOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'1908')]//ancestor::div[@id='div__popup_path_sol_confirm']//a[@class='jMsgbox-closeWrap']")
	private WebElement chequebookPrintCreditDebitPopupCloseButton;

	public WebElement chequebookPrintCreditDebitPopupCloseButton() {
		return chequebookPrintCreditDebitPopupCloseButton;
	}

	@FindBy(id = "chq_urgent_P029MA")
	private WebElement chequebookNormalUrgerDropdown;

	public WebElement chequebookNormalUrgerDropdown() {
		return chequebookNormalUrgerDropdown;

	}

	@FindBy(id = "stop_prod_proc_insuf_bal_yn_O001UP")
	private WebElement chequebookStopProductWileInsufficientBalance;

	public WebElement chequebookStopProductWileInsufficientBalance() {
		return chequebookStopProductWileInsufficientBalance;
	}

	@FindBy(id = "allow_overdrawn_P017MA")
	private WebElement accountTypeAllowOverdrawnFlag;

	public WebElement accountTypeAllowOverdrawnFlag() {
		return accountTypeAllowOverdrawnFlag;
	}

	@FindBy(xpath = "//div[contains(text(),'CONFIRM')]//parent::div//parent::div//div[contains(text(),'2120')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement chequebookAmountExceedAvailableBalanceConfirmationWarningPopupOkButton;

	public WebElement chequebookAmountExceedAvailableBalanceConfirmationWarningPopupOkButton() {
		return chequebookAmountExceedAvailableBalanceConfirmationWarningPopupOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot Proceed')]//parent::div//parent::div[@id='div__popup_path_sol_ok']//div//div[contains(text(),'86')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement chequebookAmountExceedAvailableBalanceCanNotProceedPopupOkButton;

	public WebElement chequebookAmountExceedAvailableBalanceCanNotProceedPopupOkButton() {
		return chequebookAmountExceedAvailableBalanceCanNotProceedPopupOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Amount Exceeds Available Balance in Account')]//ancestor::div//div[contains(text(),'Cannot Proceed')]")
	private WebElement chequebookAmountExceedAvailableBalanceCanNotProceedPopup;

	public WebElement chequebookAmountExceedAvailableBalanceCanNotProceedPopup() {
		return chequebookAmountExceedAvailableBalanceCanNotProceedPopup;
	}

	@FindBy(id = "lookuptxt_specific_charges_P029MA")
	private WebElement chequebookSpecificChargeInput;

	public WebElement chequebookSpecificChargeInput() {
		return chequebookSpecificChargeInput;
	}

	@FindBy(id = "lookuptxt_charges_schema_P029MA")
	private WebElement chequebookNormalChargeInput;

	public WebElement chequebookNormalChargeInput() {
		return chequebookNormalChargeInput;
	}

	@FindBy(id = "lookuptxt_trx_type_P029MA")
	private WebElement chequebookTransactionTypeInput;

	public WebElement chequebookTransactionTypeInput() {
		return chequebookTransactionTypeInput;
	}

	@FindBy(xpath = "//div[contains(text(),'WARNING')]//ancestor::div[@id='div__popup_path_sol_ok']//div[contains(text(),'Amount Exceeds Available Balance')]//ancestor::div[@id='div__popup_path_sol_ok']//input[@id='_popup_path_sol_ok']")
	private WebElement chequebookRequestAmountExceedsAvailableBalanceWarningPopup;

	public WebElement chequebookRequestAmountExceedsAvailableBalanceWarningPopup() {
		return chequebookRequestAmountExceedsAvailableBalanceWarningPopup;
	}

	@FindBy(xpath = "//span[contains(text(),' Gl Charges ')]//parent::a")
	private WebElement chequebookglChargesButton;

	public WebElement chequebookglChargesButton() {
		return chequebookglChargesButton;
	}

	@FindBy(xpath = "//td[@id='tab4_GridTbl_Id_P029MA_pager_left']//span[@class='ui-icon ui-icon-plus']")
	private WebElement chequebookglChargesAddButton;

	public WebElement chequebookglChargesAddButton() {
		return chequebookglChargesAddButton;
	}

	@FindBy(xpath = "//input[contains(@id,'ENTITY_CODE_lookuptxt_tab4_GridTbl_Id_P029MA')]")
	private WebElement glChargesGLCodeInput;

	public WebElement glChargesGlCodeInput() {
		return glChargesGLCodeInput;
	}

	@FindBy(xpath = "//select[contains(@id,'ctschequesChargesVO.ISSUE_TYPE')]")
	private WebElement glChargesIssueTypepDropdow;

	public WebElement glChargesIssueTypepDropdow() {
		return glChargesIssueTypepDropdow;
	}

	@FindBy(xpath = "//input[contains(@id,'CHEQUE_TYPE_lookuptxt_tab4_GridTbl_Id_P029MA')]")
	private WebElement glChargesChequeTypeInput;

	public WebElement glChargesChequeTypeInput() {
		return glChargesChequeTypeInput;
	}

	@FindBy(xpath = "//input[contains(@id,'LEAVES_lookuptxt_tab4_GridTbl_Id_P029MA')]")
	private WebElement glChargesChequeLeavesInput;

	public WebElement glChargesChequeLeavesInput() {
		return glChargesChequeLeavesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'CHARGES_SCHEMA_lookuptxt_tab4_GridTbl_Id_P029MA')]")
	private WebElement glChargesApproveChargesInput;

	public WebElement glChargesApproveChargesInput() {
		return glChargesApproveChargesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'TRX_TYPE_lookuptxt_tab4_GridTbl_Id_P029MA')]")
	private WebElement glChargesTransactionTypeInput;

	public WebElement glChargesTransactionTypeInput() {
		return glChargesTransactionTypeInput;
	}

	@FindBy(xpath = "//input[contains(@id,'DESTROY_CHARGES_lookuptxt_tab4_GridTbl_Id_P029MA')]")
	private WebElement glChargesDestroyChargesInput;

	public WebElement glChargesDestroyChargesInput() {
		return glChargesDestroyChargesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'CANCEL_CHARGES_lookuptxt_tab4_GridTbl_Id_P029MA')]")
	private WebElement glChargesCancelChargesInput;

	public WebElement glChargesCancelChargesInput() {
		return glChargesCancelChargesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'SUBMIT_CHARGES_lookuptxt_tab4_GridTbl_Id_P029MA')]")
	private WebElement glChargesSubmitChargesInput;

	public WebElement glChargesSubmitChargesInput() {
		return glChargesSubmitChargesInput;
	}

	@FindBy(xpath = "//input[contains(@id,'IN_HOUSE_SCHEMA_lookuptxt_tab4_GridTbl_Id_P029MA')]")
	private WebElement glChargesInHouseSchemaChargesInput;

	public WebElement glChargesInHouseSchemaChargesInput() {
		return glChargesInHouseSchemaChargesInput;
	}

	@FindBy(id = "ok_btn_3_P029MA")
	private WebElement glChargesOkButton;

	public WebElement glChargesOkButton() {
		return glChargesOkButton;
	}

	@FindBy(id = "allow_clearing_C0011MA")
	private WebElement chargeAllowModifyAndClearFlag;

	public WebElement chargeAllowModifyAndClearFlag() {
		return chargeAllowModifyAndClearFlag;
	}

	@FindBy(id = "allow_modify_C0011MA")
	private WebElement chargeAllowModifyFlag;

	public WebElement chargeAllowModifyFlag() {
		return chargeAllowModifyFlag;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011MA_Update_After_Approve_key']//ancestor::button")
	private WebElement chargeUpdateAfterApproveButton;

	public WebElement chargeUpdateAfterApproveButton() {
		return chargeUpdateAfterApproveButton;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011P_Approve_key']//ancestor::button")
	private WebElement chargeApproveButton;

	public WebElement chargeApproveButton() {
		return chargeApproveButton;
	}

	@FindBy(id = "chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.CODE")
	private WebElement chargeUpdateAfterApproveSearchcGridChargeCodeInput;

	public WebElement chargeUpdateAfterApproveSearchcGridChargeCodeInput() {
		return chargeUpdateAfterApproveSearchcGridChargeCodeInput;
	}

	@FindBy(id = "chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE")
	private WebElement chargeApproveSearchcGridChargeCodeInput;

	public WebElement chargeApproveSearchcGridChargeCodeInput() {
		return chargeApproveSearchcGridChargeCodeInput;
	}

	@FindBy(id = "chequebookChargesWaive_Q000AP")
	private WebElement chargeApproveChargeWaiveButton;

	public WebElement chargeApproveChargeWaiveButton() {
		return chargeApproveChargeWaiveButton;
	}

	@FindBy(id = "chequeBookChargesDiv_Q000MT")
	private WebElement chequebookMaintenanceChargesSection;

	public WebElement chequebookMaintenanceChargesSection() {
		return chequebookMaintenanceChargesSection;
	}

	@FindBy(xpath = "//table[@id='chargesGridId_Q000MT']//following-sibling::td[contains(@id,'td_chargesGridId_Q000MT') and contains(@id,'ctsChargesEntityVO.AMOUNT') and @tdlabel='CV Amount']")
	private WebElement chequebookChargeAmountField;

	public WebElement chequebookChargeAmountField() {
		return chequebookChargeAmountField;
	}

	@FindBy(xpath = "//input[contains(@id,'chequeBookCO.type_ctsChargesEntityVO.AMOUNT_chargesGridId_Q000MT')]")
	private WebElement chequebookChargeAmountInputField;

	public WebElement chequebookChargeAmountInputField() {
		return chequebookChargeAmountInputField;
	}

	@FindBy(id = "genLedgerParamListGridTbl_Id_P014UP_gs_GL_CODE")
	private WebElement generalLedgerUpdateAfterApproveGridSearchInput;

	public WebElement generalLedgerUpdateAfterApproveGridSearchInput() {
		return generalLedgerUpdateAfterApproveGridSearchInput;
	}

	@FindBy(xpath = "//a[@href='#trackTab-2_P014UP']")
	private WebElement generalLedgerUpdateAfterApproveAdditionalDetailsTab;

	public WebElement generalLedgerUpdateAfterApproveAdditionalDetailsTab() {
		return generalLedgerUpdateAfterApproveAdditionalDetailsTab;
	}

	@FindBy(id = "allow_internal_overdraw_P014UP")
	private WebElement generalLedgerAllowOverdrawnDropdown;

	public WebElement generalLedgerAllowOverdrawnDropdown() {
		return generalLedgerAllowOverdrawnDropdown;
	}

	@FindBy(xpath = "//label[@id='genLedgerParamFormId_P014UP_update_key']//ancestor::button")
	private WebElement generalLedgerUpdateAfterApproveButton;

	public WebElement generalLedgerUpdateAfterApproveButton() {
		return generalLedgerUpdateAfterApproveButton;
	}

	@FindBy(id = "genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE")
	private WebElement generalLedgerApproveGridSearchInput;

	public WebElement generalLedgerApproveGridSearchInput() {
		return generalLedgerApproveGridSearchInput;
	}

	@FindBy(xpath = "//label[@id='genLedgerParamFormId_P014P_approve_key']//ancestor::button")
	private WebElement generalLedgerApproveButton;

	public WebElement generalLedgerApproveButton() {
		return generalLedgerApproveButton;
	}

	@FindBy(id = "infoBarSearchButton_P038MT")
	private WebElement InternalGeneralLedgerSearchButtton;

	public WebElement InternalGeneralLedgerSearchButtton() {
		return InternalGeneralLedgerSearchButtton;
	}

	@FindBy(id = "internalgeneralledgerList_GridTbl_Id_P038MT_gs_genLedgerVO.GL_CODE")
	private WebElement InternalGeneralLedgerUpdateGridSearchInput;

	public WebElement InternalGeneralLedgerUpdateGridSearchInput() {
		return InternalGeneralLedgerUpdateGridSearchInput;
	}

	@FindBy(id = "affect_flag_P038MT")
	private WebElement InternalGeneralLedgerAffectChequebookFlag;

	public WebElement InternalGeneralLedgerAffectChequebookFlag() {
		return InternalGeneralLedgerAffectChequebookFlag;
	}

	@FindBy(xpath = "//label[@id='internalgeneralledgerMaint_FormId_P038MT_update_key']//ancestor::button")
	private WebElement InternalGeneralLedgerUpdateButton;

	public WebElement InternalGeneralLedgerUpdateButton() {
		return InternalGeneralLedgerUpdateButton;
	}

	@FindBy(id = "view_show_recieve_E000MA")
	private WebElement userShowSentToReceiveFromDropdown;

	public WebElement userShowSentToReceiveFromDropdown() {
		return userShowSentToReceiveFromDropdown;
	}

	@FindBy(xpath = "//span[contains(text(),' Allowed Chequebook Branches ')]//parent::a")
	private WebElement userAllowedBranchesChequebookButton;

	public WebElement userAllowedBranchesChequebookButton() {
		return userAllowedBranchesChequebookButton;
	}

	@FindBy(id = "add_tab22_GridTbl_Id_E000MA")
	private WebElement userAllowedBranchesAddButtton;

	public WebElement userAllowedBranchesAddButtton() {
		return userAllowedBranchesAddButtton;
	}

	@FindBy(xpath = "//input[contains(@id,'ALLOWED_CHQBOOK_BR_lookuptxt_tab22_GridTbl_Id_E000MA')]")
	private WebElement userAllowedBrancheCodeInput;

	public WebElement userAllowedBrancheCodeInput() {
		return userAllowedBrancheCodeInput;
	}

	@FindBy(id = "ok_btn_22_E000MA")
	private WebElement userAllowedBrancheOkButton;

	public WebElement userAllowedBrancheOkButton() {
		return userAllowedBrancheOkButton;
	}

	@FindBy(id = "cheque_digits_num_O001UP")
	private WebElement controlRecordChequeDigitNumberInput;

	public WebElement controlRecordChequeDigitNumberInput() {
		return controlRecordChequeDigitNumberInput;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.CODE']")
	private WebElement Input_Chequebook_submit;

	public WebElement Input_Chequebook_submit() {
		return Input_Chequebook_submit;
	}

	@FindBy(xpath = "//input[@id='ammendChequeCardGridTbl_Id_QG001P_gs_ctsAmendProductVO.CHEQUEBOOK_CODE']")
	private WebElement Approve_Input_QG001P;

	public WebElement Approve_Input_QG001P() {
		return Approve_Input_QG001P;
	}

	@FindBy(xpath = "//label[@id='amendChequeCardDefFormId_QG001P_approve_key']")
	private WebElement Approve_Button_QG001P;

	public WebElement Approve_Button_QG001P() {
		return Approve_Button_QG001P;
	}

	@FindBy(xpath = "//textarea[@id='remarks_Q000TC']")
	private WebElement Remarks_Tocancel;

	public WebElement Remarks_Tocancel() {
		return Remarks_Tocancel;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000UP_gs_ctschqbookVO.CODE']")
	private WebElement Amend_Submitted_Input;

	public WebElement Amend_Submitted_Input() {
		return Amend_Submitted_Input;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE']")
	private WebElement ChequebookReq_Maintenance_Input;

	public WebElement ChequebookReq_Maintenance_Input() {
		return ChequebookReq_Maintenance_Input;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.statusDesc']")
	private WebElement Status_Maintenance;

	public WebElement Status_Maintenance() {
		return Status_Maintenance;
	}

	@FindBy(xpath = "//label[@id ='chequeBookDefFormId_Q000TC_toCancel_key']")
	private WebElement Tocancelbutton;

	public WebElement Tocancelbutton() {
		return Tocancelbutton;
	}

	@FindBy(xpath = "//label[@id ='chequeBookDefFormId_Q000AC_Cancel_key']")
	private WebElement Approvecancelbutton;

	public WebElement Approvecancelbutton() {
		return Approvecancelbutton;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE']")
	private WebElement InputToCancel;

	public WebElement InputToCancel() {
		return InputToCancel;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement InputToDestroy;

	public WebElement InputToDestroy() {
		return InputToDestroy;
	}

	@FindBy(xpath = "//textarea[@name='chequeBookCO.ctschqbookVO.STATUS_REMARKS']")
	private WebElement InputToDestroyRmemarks;

	public WebElement InputToDestroyRmemarks() {
		return InputToDestroyRmemarks;
	}

	@FindBy(xpath = "//input[@id='chequeNo_QG001MT']")
	private WebElement InputChequeNo;

	public WebElement InputChequeNo() {
		return InputChequeNo;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]")
	private WebElement ValidationInvalidchequePopup;

	public WebElement ValidationInvalidchequePopup() {
		return ValidationInvalidchequePopup;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001H_gs_cardsMgtVO.CARD_TYPE']")
	private WebElement InputHot;

	public WebElement InputHot() {
		return InputHot;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_status_reason_G001H']")
	private WebElement InputReasonHot;

	public WebElement InputReasonHot() {
		return InputReasonHot;
	}

	@FindBy(xpath = "//label[@id='cardsManagementMaintForm_G001H_Hot_key']")
	private WebElement HotButton;

	public WebElement HotButton() {
		return HotButton;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_card_type_QG001MT']")
	private WebElement CardTypeInput;

	public WebElement CardTypeInput() {
		return CardTypeInput;
	}

	@FindBy(xpath = "//select[@id='currentStatus_type_QG001MT']")
	private WebElement SelectCardStatus;

	public WebElement SelectCardStatus() {
		return SelectCardStatus;
	}

	@FindBy(xpath = "//td[@title='Clear Search']")
	private WebElement ClearSearch;

	public WebElement ClearSearch() {
		return ClearSearch;
	}

	@FindBy(xpath = "(//div[@id='eventList_G001H']//parent::div//button)[2]")
	private WebElement DismissButton;

	public WebElement DismissButton() {
		return DismissButton;
	}

	@FindBy(id = "def_charge_in_trs_P024MA")
	private WebElement trxTypeDefaultChargetoTransactionFlag;

	public WebElement trxTypeDefaultChargetoTransactionFlag() {
		return trxTypeDefaultChargetoTransactionFlag;
	}

	@FindBy(id = "td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.AMOUNT")
	private WebElement transactionMaintenanceSearchTransactionAmount;

	public WebElement transactionMaintenanceSearchTransactionAmount() {
		return transactionMaintenanceSearchTransactionAmount;
	}

	@FindBy(id = "allow_clearing_chrg_P024MA")
	private WebElement trxTypeAllowUserClearingChargeFlag;

	public WebElement trxTypeAllowUserClearingChargeFlag() {
		return trxTypeAllowUserClearingChargeFlag;
	}

	@FindBy(id = "allow_modify_chrg_P024MA")
	private WebElement trxTypeAllowModifyAmountFlag;

	public WebElement trxTypeAllowModifyAmountFlag() {
		return trxTypeAllowModifyAmountFlag;
	}
}
