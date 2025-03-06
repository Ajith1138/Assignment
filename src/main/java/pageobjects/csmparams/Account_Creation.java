package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Creation {
	WebDriver driver;

	// initialize driver , web elements
	public Account_Creation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// below all annotation return web element
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Parameterbutton;

	public WebElement Parameterbutton() {
		return Parameterbutton;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement SystemParametersbutton;

	public WebElement SystemParametersbutton() {
		return SystemParametersbutton;
	}

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement AccountParametertransfer;

	public WebElement AccountParametertransfer() {
		return AccountParametertransfer;
	}

	@FindBy(xpath = "//td[text()='General Ledger']")
	private WebElement GeneralLedgerTransfer;

	public WebElement GeneralLedgerTransfer() {
		return GeneralLedgerTransfer;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a[@id='P010MT']")
	private WebElement Maintenance12;

	public WebElement Maintenance12() {
		return Maintenance12;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a[@id='P014MT']")
	private WebElement GendralLedger_Maintenance12;

	public WebElement GendralLedger_Maintenance12() {
		return GendralLedger_Maintenance12;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a[@id='F00I1MT']")
	private WebElement fOM_Maintenance;

	public WebElement fOM_Maintenance() {
		return fOM_Maintenance;
	}

	@FindBy(xpath = "//input[@id='genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE']")
	private WebElement CodevalueGL;

	public WebElement CodevalueGL() {
		return CodevalueGL;
	}

	@FindBy(xpath = "//input[@name='fomCO.cifVO.SHORT_NAME_ENG']")
	private WebElement BrifeName_Transfer;

	public WebElement BrifeName_Transfer() {
		return BrifeName_Transfer;
	}

	@FindBy(xpath = "//input[@name='genLedgerParamCO.genLedgerVO.BRIEF_DESC_ENG']")
	private WebElement BrifeName_gENDRALlEDGER;

	public WebElement BrifeName_gENDRALlEDGER() {
		return BrifeName_gENDRALlEDGER;
	}

	@FindBy(xpath = "//input[@name='fomCO.cifVO.LONG_NAME_ENG']")
	private WebElement LongName_transfer;

	public WebElement LongName_transfer() {
		return LongName_transfer;
	}

	@FindBy(xpath = "//input[@name='ciftypeparamCO.rifcttVO.LONG_DESC_ENG']")
	private WebElement LongName_CIFType;

	public WebElement LongName_CIFType() {
		return LongName_CIFType;
	}

	@FindBy(xpath = "//input[@name='genLedgerParamCO.genLedgerVO.LONG_DESC_ENG']")
	private WebElement LongName_gendral_Ledger;

	public WebElement LongName_gendral_Ledger() {
		return LongName_gendral_Ledger;
	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement Additionaldetails_Transfer;

	public WebElement Additionaldetails_Transfer() {
		return Additionaldetails_Transfer;
	}

	@FindBy(xpath = "//select[@id='gl_category_P014MT']")
	private WebElement GL_Category_Transfer;;

	public WebElement GL_Category_Transfer() {
		return GL_Category_Transfer;
	}

	@FindBy(id = "ac_sign_P014MT")
	private WebElement aCCOUNTsIGN_Transfer;

	public WebElement aCCOUNTsIGN_Transfer() {
		return aCCOUNTsIGN_Transfer;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010MT_Save_key']")
	private WebElement Save_Button_submit;

	public WebElement Save_Button_submit() {
		return Save_Button_submit;
	}

	@FindBy(xpath = "//span[text()='Approve']//parent::a")
	private WebElement ApprovebuttonAlert;

	public WebElement ApprovebuttonAlert() {
		return ApprovebuttonAlert;
	}

	@FindBy(xpath = "//span[text()='Approve']//parent::a[@id='P017P']")
	private WebElement ApprovebuttonAccType;

	public WebElement ApprovebuttonAccType() {
		return ApprovebuttonAccType;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg;

	public WebElement POPupmsg() {
		return POPupmsg;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017P_Approve_key']")
	private WebElement SubmitApproveAlert;

	public WebElement SubmitApproveAlert() {
		return SubmitApproveAlert;
	}

	@FindBy(xpath = "//button[@id='genLedgerParamMaint_approve_P014P']")
	private WebElement SubmitApproveAlert_GL;

	public WebElement SubmitApproveAlert_GL() {
		return SubmitApproveAlert_GL;
	}

	@FindBy(xpath = "//button[@id='fom_Approve_btn_F00I1P']")
	private WebElement SubmitApproveFOM;

	public WebElement SubmitApproveFOM() {
		return SubmitApproveFOM;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement UserApprovebutton;

	public WebElement UserApprovebutton() {
		return UserApprovebutton;
	}

	@FindBy(xpath = "//td[text()='Account Type']")
	private WebElement Account_Type_transfer;

	public WebElement Account_Type_transfer() {
		return Account_Type_transfer;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a[@id='P017MT']")
	private WebElement Account_Type_maintenance;

	public WebElement Account_Type_maintenance() {
		return Account_Type_maintenance;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_type_code_P017MT']")
	private WebElement Account_type_code;

	public WebElement Account_type_code() {
		return Account_type_code;

	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
	private WebElement Account_type_code_AccType;

	public WebElement Account_type_code_AccType() {
		return Account_type_code_AccType;

	}

	@FindBy(xpath = "//span[text()='Instructions']")
	private WebElement Instructions_Transfer;

	public WebElement Instructions_Transfer() {
		return Instructions_Transfer;

	}

	@FindBy(xpath = "//select[@id='term_ind_P017MT']")
	private WebElement Period_Transfer;

	public WebElement Period_Transfer() {
		return Period_Transfer;

	}

	@FindBy(xpath = "//select[@id='bc_ind_P017MT']")
	private WebElement Client_Name_Transfer;

	public WebElement Client_Name_Transfer() {
		return Client_Name_Transfer;

	}

	@FindBy(xpath = "//span[text()='Card Details']")
	private WebElement Card_Details_TRANSFER;

	public WebElement Card_Details_TRANSFER() {
		return Card_Details_TRANSFER;

	}

	@FindBy(xpath = "//select[@id='affect_card_P017MT']")
	private WebElement Affect_Card_Transfer;

	public WebElement Affect_Card_Transfer() {
		return Affect_Card_Transfer;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_default_card_P017MT']")
	private WebElement Default_Card_Transfer;

	public WebElement Default_Card_Transfer() {
		return Default_Card_Transfer;

	}

	@FindBy(xpath = "//input[@id='affection_P017MT2']")
	private WebElement Affect_Chequebook;

	public WebElement Affect_Chequebook() {
		return Affect_Chequebook;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_chqbook_num_P017MT']")
	private WebElement Cheque_BookCode;

	public WebElement Cheque_BookCode() {
		return Cheque_BookCode;

	}

	@FindBy(xpath = "//button[@id='acctypeMaint_Maint_save_P017MT']")
	private WebElement Save_AccountType_Transfer;

	public WebElement Save_AccountType_Transfer() {
		return Save_AccountType_Transfer;

	}

	@FindBy(xpath = "//label[@id='genLedgerParamFormId_P014MT_Save_key']")
	private WebElement Save_AccountType_GL;

	public WebElement Save_AccountType_GL() {
		return Save_AccountType_GL;

	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approve_Transfer;

	public WebElement Approve_Transfer() {
		return Approve_Transfer;

	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
	private WebElement Accounttype_Tyepcode;

	public WebElement Accounttype_Tyepcode() {
		return Accounttype_Tyepcode;

	}

	@FindBy(xpath = " //td[text()='CIF Parameters']")
	private WebElement CIF_Parameters;

	public WebElement CIF_Parameters() {
		return CIF_Parameters;

	}

	@FindBy(xpath = "//td[text()='CIF Type']")
	private WebElement CIF_Type;

	public WebElement CIF_Type() {
		return CIF_Type;

	}

	@FindBy(xpath = "//input[@id='type_code_P010MT']")
	private WebElement CIF_Type_Code;

	public WebElement CIF_Type_Code() {
		return CIF_Type_Code;

	}

	@FindBy(xpath = "//input[@name='ciftypeparamCO.rifcttVO.BRIEF_DESC_ENG']")
	private WebElement CIF_Brief_Name;

	public WebElement CIF_Brief_Name() {
		return CIF_Brief_Name;

	}

	@FindBy(xpath = "//input[@id='vt_ind_P010MTV']")
	private WebElement CIF_Individual;

	public WebElement CIF_Individual() {
		return CIF_Individual;

	}

	@FindBy(xpath = "//input[@id='client_P010MT']")
	private WebElement CIF_Type_Client;

	public WebElement CIF_Type_Client() {
		return CIF_Type_Client;

	}

	@FindBy(xpath = "//input[@id='staff_P010MT']")
	private WebElement CIF_Staff;

	public WebElement CIF_Staff() {
		return CIF_Staff;

	}

	@FindBy(xpath = "//input[@id='min_age_P010MT']")
	private WebElement CIF_min_age;

	public WebElement CIF_min_age() {
		return CIF_min_age;

	}

	@FindBy(xpath = "//input[@id='max_age_P010MT']")
	private WebElement CIF_Max_Age;

	public WebElement CIF_Max_Age() {
		return CIF_Max_Age;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_default_eco_sector_P010MT']")
	private WebElement CIF_Ecosector;

	public WebElement CIF_Ecosector() {
		return CIF_Ecosector;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_default_sub_eco_sector_P010MT']")
	private WebElement CIF_Sub_Ecosector;

	public WebElement CIF_Sub_Ecosector() {
		return CIF_Sub_Ecosector;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_default_civil_code_P010MT']")
	private WebElement CIF_Civil_Code;

	public WebElement CIF_Civil_Code() {
		return CIF_Civil_Code;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_default_nationality_P010MT']")
	private WebElement CIF_Nationality;

	public WebElement CIF_Nationality() {
		return CIF_Nationality;
	}

	@FindBy(id = "lookuptxt_default_role_code_P010MT")
	private WebElement CIF_Role_Code;

	public WebElement CIF_Role_Code() {
		return CIF_Role_Code;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_default_priority_P010MT']")
	private WebElement CIF_priority;

	public WebElement CIF_priority() {
		return CIF_priority;

	}

	@FindBy(xpath = " //input[@id='allow_kyc_not_completed_P010MT']")
	private WebElement Allow_Type_KYC_Creation;

	public WebElement Allow_Type_KYC_Creation() {
		return Allow_Type_KYC_Creation;

	}

	@FindBy(xpath = "//span[text()='Allowed Account Types']")
	private WebElement Allowed_Account_Type;

	public WebElement Allowed_Account_Type() {
		return Allowed_Account_Type;

	}

	@FindBy(xpath = "//td[@id='add_tab4_GridTbl_Id_P010MT']")
	private WebElement Add_Button_Transfer;

	public WebElement Add_Button_Transfer() {
		return Add_Button_Transfer;

	}

	@FindBy(xpath = "//td[@id='add_tab5_C_GridTbl_Id_E000MA']")
	private WebElement Add_Button_UserCIFType;

	public WebElement Add_Button_UserCIFType() {
		return Add_Button_UserCIFType;

	}

	@FindBy(xpath = "//td[@id='add_tab4_GridTbl_Id_E000MA']")
	private WebElement Add_Button_User_AccType;

	public WebElement Add_Button_User_AccType() {
		return Add_Button_User_AccType;

	}

	@FindBy(xpath = " //input[@id='genLedgerParamCode_P014MT']")
	private WebElement Gl_Code_Transfer;

	public WebElement Gl_Code_Transfer() {
		return Gl_Code_Transfer;

	}

	@FindBy(xpath = " //input[@name='lookupTxt_rifcttAccTypeVO.GL_CODE']")
	private WebElement Gl_Code_Transfer_AllowedAccTypes;

	public WebElement Gl_Code_Transfer_AllowedAccTypes() {
		return Gl_Code_Transfer_AllowedAccTypes;

	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement user_Transfer;

	public WebElement user_Transfer() {
		return user_Transfer;
	}

	@FindBy(xpath = "//span[text()=' CIF Types ']")
	private WebElement CifType_User;

	public WebElement CifType_User() {
		return CifType_User;
	}

	@FindBy(xpath = "//span[text()=' Account Types ']")
	private WebElement AccountType_User;

	public WebElement AccountType_User() {
		return AccountType_User;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstelleracctypedetVO.ACC_TYPE']")
	private WebElement AccountType_enterGL;

	public WebElement AccountType_enterGL() {
		return AccountType_enterGL;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstelleracctypedetVO.TRX_TYPE']")
	private WebElement TransactionSerail_number;

	public WebElement TransactionSerail_number() {
		return TransactionSerail_number;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.TRX_TYPE']")
	private WebElement TransactionSerail_CIFnumber;

	public WebElement TransactionSerail_CIFnumber() {
		return TransactionSerail_CIFnumber;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.CIF_TYPE']")
	private WebElement CIFNumber_user;

	public WebElement CIFNumber_user() {
		return CIFNumber_user;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement userIdInUpdateAfterApproveScreen;

	public WebElement userIdInUpdateAfterApproveScreen() {
		return userIdInUpdateAfterApproveScreen;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement userIdInApproveScreen;

	public WebElement userIdInApproveScreen() {
		return userIdInApproveScreen;
	}

	@FindBy(xpath = "//a[@id='E000MA']")
	private WebElement updateAfterApproveInUser;

	public WebElement updateAfterApproveInUser() {
		return updateAfterApproveInUser;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement userIdInUpdateAfterApprove;

	public WebElement userIdInUpdateAfterApprove() {
		return userIdInUpdateAfterApprove;
	}

	@FindBy(xpath = "//table[@id='tellerParamList_GridTbl_Id_E000MA']")
	private WebElement doubleClickUserInUpdateAfterApprove;

	public WebElement doubleClickUserInUpdateAfterApprove() {
		return doubleClickUserInUpdateAfterApprove;
	}

	@FindBy(xpath = "//table[@id='genLedgerParamListGridTbl_Id_P014P']")
	private WebElement doubleClickApprove_GL;

	public WebElement doubleClickApprove_GL() {
		return doubleClickApprove_GL;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002AU']")
	private WebElement doubleClick_Accounts_Authorize;

	public WebElement doubleClick_Accounts_Authorize() {
		return doubleClick_Accounts_Authorize;
	}

	@FindBy(xpath = "//table[@id='fomGridTbl_Id_F00I1P']")
	private WebElement doubleClick_Approve_FOM;

	public WebElement doubleClick_Approve_FOM() {
		return doubleClick_Approve_FOM;
	}

	@FindBy(xpath = "//table[@id='acctypeList_GridTbl_Id_P017P']")
	private WebElement doubleClickACCtypeInUpdateAfterApprove;

	public WebElement doubleClickACCtypeInUpdateAfterApprove() {
		return doubleClickACCtypeInUpdateAfterApprove;
	}

	@FindBy(xpath = "//table[@id='cifTypeParamList_GridTbl_Id_P010P']")
	private WebElement doubleClickCIFApprove;

	public WebElement doubleClickCIFApprove() {
		return doubleClickCIFApprove;
	}

	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.CODE']")
	private WebElement doubleClickUserApprove;

	public WebElement doubleClickUserApprove() {
		return doubleClickUserApprove;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010P_Approve_key']")
	private WebElement SubmitApproveAlertinCIFType;

	public WebElement SubmitApproveAlertinCIFType() {
		return SubmitApproveAlertinCIFType;
	}

	/*
	 * @FindBy(xpath="//td[@id='add_tab3_C_GridTbl_Id_E000MA']") private WebElement
	 * addIconInUpdateAfterApprove; public WebElement addIconInUpdateAfterApprove()
	 * { return addIconInUpdateAfterApprove; }
	 */
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement okButtonInUpdateAfterApprove;

	public WebElement okButtonInUpdateAfterApprove() {
		return okButtonInUpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement okButton_Cancel;

	public WebElement okButton_Cancel() {
		return okButton_Cancel;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement UpdateAfterApprove_button;

	public WebElement UpdateAfterApprove_button() {
		return UpdateAfterApprove_button;
	}

	@FindBy(xpath = "//span[text()='Approve']//parent::a[@id='E000P']")
	private WebElement userIdInApprove;

	public WebElement userIdInApprove() {
		return userIdInApprove;
	}

	// CSM CORE
	@FindBy(xpath = "//td[text()='Front Office Management']")
	private WebElement FrontOffice_Transfer;

	public WebElement FrontOffice_Transfer() {
		return FrontOffice_Transfer;
	}

	@FindBy(xpath = "//select[@id='entity_type_P010MT']")
	private WebElement Entity_Type_Transfer;

	public WebElement Entity_Type_Transfer() {
		return Entity_Type_Transfer;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010P_gs_rifcttVO.TYPE_CODE']")
	private WebElement TypeCode;

	public WebElement TypeCode() {
		return TypeCode;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice;

	public WebElement ClosePopupmsg_frontoffice() {
		return ClosePopupmsg_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_CIF_TYPE_F00I1MT']")
	private WebElement CSM_CIF_Type_frontoffice;

	public WebElement CSM_CIF_Type_frontoffice() {
		return CSM_CIF_Type_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_ID_TYPE_F00I1MT']")
	private WebElement idtype_frontoffice;

	public WebElement idtype_frontoffice() {
		return idtype_frontoffice;
	}

	@FindBy(xpath = "//input[@id='cifVO_ID_NO_F00I1MT']")
	private WebElement CIF_IDNO_frontoffice;

	public WebElement CIF_IDNO_frontoffice() {
		return CIF_IDNO_frontoffice;
	}

	@FindBy(xpath = "//input[@id='cifVO_BIRTH_DATE_F00I1MT']")
	private WebElement DOB_frontoffice;

	public WebElement DOB_frontoffice() {
		return DOB_frontoffice;
	}

	@FindBy(xpath = "//input[@id='cifVO_ID_EXPIRY_DATE_F00I1MT']")
	private WebElement ID_Expirydate_frontoffice;

	public WebElement ID_Expirydate_frontoffice() {
		return ID_Expirydate_frontoffice;
	}

	@FindBy(xpath = "//select[@name='fomCO.cifVO.MARITAL_STATUS']")
	private WebElement Marital_Status_frontoffice;

	public WebElement Marital_Status_frontoffice() {
		return Marital_Status_frontoffice;
	}

	@FindBy(xpath = "//select[@id='cifVO_SEXE_F00I1MT']")
	private WebElement gender_frontoffice;

	public WebElement gender_frontoffice() {
		return gender_frontoffice;
	}

	@FindBy(xpath = "//select[@id='cifVO_LANGUAGE_F00I1MT']")
	private WebElement Language_frontoffice;

	public WebElement Language_frontoffice() {
		return Language_frontoffice;
	}

	@FindBy(xpath = "//input[@id='cifVO_SHORT_NAME_ENG_F00I1MT']")
	private WebElement Short_Name_frontoffice;

	public WebElement Short_Name_frontoffice() {
		return Short_Name_frontoffice;
	}

	@FindBy(xpath = "//input[@id='cifVO_LONG_NAME_ENG_F00I1MT']")
	private WebElement Long_Name_frontoffice;

	public WebElement Long_Name_frontoffice() {
		return Long_Name_frontoffice;
	}

	@FindBy(xpath = "//input[@id='addressCO_ADDRESS1_ENG_F00I1MT']")
	private WebElement Address_Block_frontoffice;

	public WebElement Address_Block_frontoffice() {
		return Address_Block_frontoffice;
	}

	@FindBy(xpath = "//input[@id='addressCO_ADDRESS1_ENG_F00I1MT']")
	private WebElement statement_frontoffice;

	public WebElement statement_frontoffice() {
		return statement_frontoffice;
	}

	@FindBy(xpath = "//input[@id='addressCO_TEL_F00I1MT']")
	private WebElement Address_TElnumber_frontoffice;

	public WebElement Address_TElnumber_frontoffice() {
		return Address_TElnumber_frontoffice;
	}

	@FindBy(xpath = "//input[@id='addressCO_WORK_TEL_F00I1MT']")
	private WebElement Address_Worknumber_frontoffice;

	public WebElement Address_Worknumber_frontoffice() {
		return Address_Worknumber_frontoffice;
	}

	@FindBy(xpath = "//input[@id='addressCO_MOBILE_F00I1MT']")
	private WebElement Address_MOBnumber_frontoffice;

	public WebElement Address_MOBnumber_frontoffice() {
		return Address_MOBnumber_frontoffice;
	}

	@FindBy(xpath = "//select[@id='cifVO_MAIL_STMT_F00I1MT']")
	private WebElement Statement_frontoffice;

	public WebElement Statement_frontoffice() {
		return Statement_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_ECONOMIC_AGENT_F00I1MT']")
	private WebElement Economic_AgentKey_frontoffice;

	public WebElement Economic_AgentKey_frontoffice() {
		return Economic_AgentKey_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_ECO_SECTOR_F00I1MT']")
	private WebElement Eco_Sector_frontoffice;

	public WebElement Eco_Sector_frontoffice() {
		return Eco_Sector_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_SUB_ECO_SECTOR_F00I1MT']")
	private WebElement Sub_ECOSector_frontoffice;

	public WebElement Sub_ECOSector_frontoffice() {
		return Sub_ECOSector_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_PRIORITY_CODE_F00I1MT']")
	private WebElement Ranking_frontoffice;

	public WebElement Ranking_frontoffice() {
		return Ranking_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_DIVISION_F00I1MT']")
	private WebElement Division_frontoffice;

	public WebElement Division_frontoffice() {
		return Division_frontoffice;
	}

//		@FindBy(xpath="")
//		private WebElement Division_Accounts;
//		public WebElement Division_Accounts() {
//			return Division_Accounts;
//		}
	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_DEPT_F00I1MT']")
	private WebElement DepartmentOne_frontoffice;

	public WebElement DepartmentOne_frontoffice() {
		return DepartmentOne_frontoffice;
	}

	@FindBy(xpath = "//label[@id='fomMaintForm_F00I1MT_Save_key']")
	private WebElement Save_Key_frontoffice;

	public WebElement Save_Key_frontoffice() {
		return Save_Key_frontoffice;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement Save_Key_Accounts_Authorize;

	public WebElement Save_Key_Accounts_Authorize() {
		return Save_Key_Accounts_Authorize;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002MT_Save_key']")
	private WebElement Save_Key_Accounts;

	public WebElement Save_Key_Accounts() {
		return Save_Key_Accounts;
	}

	@FindBy(xpath = "//label[@id='fomMaintForm_F00I1MT_Validate_key']")
	private WebElement Validate_Key_frontoffice;

	public WebElement Validate_Key_frontoffice() {
		return Validate_Key_frontoffice;
	}

	@FindBy(xpath = "//select[@id='us_acc_holder_F00I1MT']")
	private WebElement NoValueFATCA_frontoffice;

	public WebElement NoValueFATCA_frontoffice() {
		return NoValueFATCA_frontoffice;
	}

	@FindBy(xpath = "//select[@id='pep_F00I1MT']")
	private WebElement NoValuePEP_frontoffice;

	public WebElement NoValuePEP_frontoffice() {
		return NoValuePEP_frontoffice;
	}

	@FindBy(xpath = "//button[@id='ok_F00I1MT']")
	private WebElement OKButton_NoValuePEP_frontoffice;

	public WebElement OKButton_NoValuePEP_frontoffice() {
		return OKButton_NoValuePEP_frontoffice;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement getCIFno_frontoffice;

	public WebElement getCIFno_frontoffice() {
		return getCIFno_frontoffice;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement Accopunts_CSM;

	public WebElement Accopunts_CSM() {
		return Accopunts_CSM;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement GeneralAccounts_frontoffice;

	public WebElement GeneralAccounts_frontoffice() {
		return GeneralAccounts_frontoffice;
	}

	@FindBy(xpath = "//span[text()='Opening']")
	private WebElement Opening_frontoffice;

	public WebElement Opening_frontoffice() {
		return Opening_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A002MT']")
	private WebElement Currencycodevalue_frontoffice;

	public WebElement Currencycodevalue_frontoffice() {
		return Currencycodevalue_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_glType_A002MT']")
	private WebElement GlType_frontoffice;

	public WebElement GlType_frontoffice() {
		return GlType_frontoffice;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifNo_A002MT']")
	private WebElement CiFNo_Accounts;

	public WebElement CiFNo_Accounts() {
		return CiFNo_Accounts;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.CIF_SUB_NO']")
	private WebElement CiFNo_Authorize_Accounts;

	public WebElement CiFNo_Authorize_Accounts() {
		return CiFNo_Authorize_Accounts;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_divisionId_A002MT']")
	private WebElement Division_Accounts;

	public WebElement Division_Accounts() {
		return Division_Accounts;
	}

	@FindBy(xpath = "//input[@name='accountsManagementCO.amfVO.DEPT']")
	private WebElement Department_Accounts;

	public WebElement Department_Accounts() {
		return Department_Accounts;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_DEPT_F00I1MT']")
	private WebElement Department_FOM;

	public WebElement Department_FOM() {
		return Department_FOM;
	}

	@FindBy(xpath = "//span[text()='Mailing details']")
	private WebElement MailingDetails_Accounts;

	public WebElement MailingDetails_Accounts() {
		return MailingDetails_Accounts;
	}

	@FindBy(xpath = "//textarea[@id='description_A002MT']")
	private WebElement Description_Accounts;

	public WebElement Description_Accounts() {
		return Description_Accounts;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement ConfirmButton_User;

	public WebElement ConfirmButton_User() {
		return ConfirmButton_User;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_LEGAL_STATUS_F00I1MT']")
	private WebElement Legal_Status_frontoffice;

	public WebElement Legal_Status_frontoffice() {
		return Legal_Status_frontoffice;
	}

	@FindBy(xpath = "//label[@id='fomMaintForm_F00I1MT_Fatca_key']")
	private WebElement FATCP_frontoffice;

	public WebElement FATCP_frontoffice() {
		return FATCP_frontoffice;
	}

	@FindBy(xpath = "//label[@id='fomMaintForm_F00I1MT_Pep_key']")
	private WebElement PEP_frontoffice;

	public WebElement PEP_frontoffice() {
		return PEP_frontoffice;
	}

	@FindBy(xpath = "//input[@id='fomGridTbl_Id_F00I1P_gs_cifVO.CIF_NO']")
	private WebElement CIFNOApprove_Frontoffice;

	public WebElement CIFNOApprove_Frontoffice() {
		return CIFNOApprove_Frontoffice;
	}

	@FindBy(xpath = "//label[@id='generalAccountForm_A002AU_Authorize_key']")
	private WebElement Authorize_Key;

	public WebElement Authorize_Key() {
		return Authorize_Key;
	}

	@FindBy(xpath = "//span[text()='Authorize']//parent::a[@id='A002AU']")
	private WebElement Authorize_Accounts;

	public WebElement Authorize_Accounts() {
		return Authorize_Accounts;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Successok_Button;

	public WebElement Successok_Button() {
		return Successok_Button;
	}

	@FindBy(xpath = "//select[@id='forbid_trs_on_its_acc_E000MA']")
	private WebElement trxOnHisOtherTellerAccDropdown;

	public WebElement trxOnHisOtherTellerAccDropdown() {
		return trxOnHisOtherTellerAccDropdown;
	}

	@FindBy(id = "lookuptxt_cif_no_E000MA")
	private WebElement userCIFNumberInput;

	public WebElement userCIFNumberInput() {
		return userCIFNumberInput;
	}
}
