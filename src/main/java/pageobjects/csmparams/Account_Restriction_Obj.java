package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Restriction_Obj {
	WebDriver driver;

	public Account_Restriction_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='_selenuim_CATEG_1']//child::td[text()='Parameters']")
	private WebElement CSMSADS_ParametersMainMenu;

	public WebElement CSMSADSParametersMainMenu() {
		return CSMSADS_ParametersMainMenu;
	}

	@FindBy(xpath = "//td[text()='Account Restrictions']")
	private WebElement CSMSADS_AccountRestrictionsInParameters;

	public WebElement CSMSADSAccountRestrictionsInParameters() {
		return CSMSADS_AccountRestrictionsInParameters;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSMSADS_MaintenanceInAccountRestrictions;

	public WebElement CSMSADSMaintenanceInAccountRestrictions() {
		return CSMSADS_MaintenanceInAccountRestrictions;
	}

	@FindBy(id = "code_UR00M")
	private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance_s;

	public WebElement CSMSADSEnterTheValueInCodeUnderMaintenance() {
		return CSMSADS_EnterTheValueInCodeUnderMaintenance;
	}

	@FindBy(xpath = "//input[@name='ctsRestrictionsVO.CODE_TYPE_DESC']")
	private WebElement CSMSADS_EnterTheValueInDescriptionUnderMaintenance;

	public WebElement CSMSADSEnterTheValueInDescriptionUnderMaintenance() {
		return CSMSADS_EnterTheValueInDescriptionUnderMaintenance;
	}

	@FindBy(id = "personal_account_access_UR00M")
	private WebElement CSMSADS_CheckBoxInGrantAccessToPersonalAccounts;

	public WebElement CSMSADSCheckBoxInGrantAccessToPersonalAccounts() {
		return CSMSADS_CheckBoxInGrantAccessToPersonalAccounts;
	}

	@FindBy(xpath = "//td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']//preceding-sibling::div/child::div")
	private WebElement CSMSADS_RootIconInApplicationsOROPTs;

	public WebElement CSMSADSRootIconInApplicationsOROPTs() {
		return CSMSADS_RootIconInApplicationsOROPTs;
	}

	@FindBy(id = "td_ctsRestOptTreeGridTbl_Id_UR00M_7_progDesc")
	private WebElement CSMSADS_RADMApplicationInApplicationsOROPTs;

	public WebElement CSMSADSRADMApplicationInApplicationsOROPTs() {
		return CSMSADS_RADMApplicationInApplicationsOROPTs;
	}

	@FindBy(id = "RADM__RADM_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M")
	private WebElement CSMSADS_RADMApplicationCheckboxInApplicationsOROPTs;

	public WebElement CSMSADSRADMApplicationCheckboxInApplicationsOROPTs() {
		return CSMSADS_RADMApplicationCheckboxInApplicationsOROPTs;
	}

	@FindBy(id = "td_ctsRestOptTreeGridTbl_Id_UR00M_8_progDesc")
	private WebElement CSMSADS_RETApplicationInApplicationsOROPTs;

	public WebElement CSMSADSRETApplicationInApplicationsOROPTs() {
		return CSMSADS_RETApplicationInApplicationsOROPTs;
	}

	@FindBy(id = "RET__RET_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M")
	private WebElement CSMSADS_RETApplicationCheckboxInApplicationsOROPTs;

	public WebElement CSMSADSRETApplicationCheckboxInApplicationsOROPTs() {
		return CSMSADS_RETApplicationCheckboxInApplicationsOROPTs;
	}

	@FindBy(xpath = "//td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']//preceding-sibling::div/child::div")
	private WebElement CSMSADS_RootIconInCompaniesORBranchesInMaintenance;

	public WebElement CSMSADSRootIconInCompaniesORBranchesInMaintenance() {
		return CSMSADS_RootIconInCompaniesORBranchesInMaintenance;
	}

	@FindBy(id = "td_ctsRestBranchesTreeGridTbl_Id_UR00M_11_progDesc")
	private WebElement CSMSADS_1BAJapplicationInCompaniesORBranches;

	public WebElement CSMSADS1BAJapplicationInCompaniesORBranches() {
		return CSMSADS_1BAJapplicationInCompaniesORBranches;
	}

	@FindBy(id = "ROOT__1__branchGrid_hasRestrictionYN_ctsRestBranchesTreeGridTbl_Id_UR00M")
	private WebElement CSMSADS_1BAJApplicationCheckboxInCompaniesORBranches;

	public WebElement CSMSADS1BAJApplicationCheckboxInCompaniesORBranches() {
		return CSMSADS_1BAJApplicationCheckboxInCompaniesORBranches;
	}

	@FindBy(id = "userGridId_UR00M_gs_usrVO.USER_ID")
	private WebElement CSMSADS_EnterTheUserIDInUserIDTab;

	public WebElement CSMSADSEnterTheUserIDInUserIDTab() {
		return CSMSADS_EnterTheUserIDInUserIDTab;
	}

	@FindBy(id = "td_userGridId_UR00M_1_usrVO.USER_ID") // id="td_userGridId_UR00M_1_usrVO.USER_ID"
	private WebElement CSMSADS_UserIDName;

	public WebElement CSMSADSUserIDName() {
		return CSMSADS_UserIDName;
	}

//			@FindBy(id = "jqg_userGridId_UR00M_1")
//			private WebElement CSMSADS_UserIDCheckbox;
	//
//			public WebElement CSMSADSUserIDCheckbox() {
//				return CSMSADS_UserIDCheckbox;
//			}

	@FindBy(id = "add_restrictionsGridTbl_Id_UR00M")
	private WebElement CSMSADS_AddButtonInRestrictionType;

	public WebElement CSMSADSAddButtonInRestrictionType() {
		return CSMSADS_AddButtonInRestrictionType;
	}

	@FindBy(xpath = "//td[@id='td_restrictionsGridTbl_Id_UR00M_1_restrictionType']//child::select")
	private WebElement CSMSADS_SelectTIconUnderRestrictionType;

	public WebElement CSMSADSSelectTIconUnderRestrictionType() {
		return CSMSADS_SelectTIconUnderRestrictionType;
	}

	@FindBy(id = "spanLookup_glCode_no_UR00M")
	private WebElement CSMSADS_SearchTheGLCode;

	public WebElement CSMSADSSearchTheGLCode() {
		return CSMSADS_SearchTheGLCode;
	}

	@FindBy(id = "gridtab_glCode_no_UR00M_gs_GL_CODE")
	private WebElement CSMSADS_EnterTheGLCodeInSearchPopUp;

	public WebElement CSMSADSEnterTheGLCodeInSearchPopUp() {
		return CSMSADS_EnterTheGLCodeInSearchPopUp;
	}

	@FindBy(id = "td_gridtab_glCode_no_UR00M_1_GL_CODE")
	private WebElement CSMSADS_ClickSearchedGLCodeInSearchPopup;

	public WebElement CSMSADSClickSearchedGLCodeInSearchPopup() {
		return CSMSADS_ClickSearchedGLCodeInSearchPopup;
	}

	@FindBy(xpath = "//select[@name='ctsRestrictionsCO.cifRangeRestLevel']")
	private WebElement CSMSADS_AccountBalanceSelectTabInRestrictionLevel;

	public WebElement CSMSADSAccountBalanceSelectTabInRestrictionLevel() {
		return CSMSADS_AccountBalanceSelectTabInRestrictionLevel;
	}

	@FindBy(xpath = "(//td[@id='td_cifTypeGridId_UR00M_1_CIF_TYPE']//following::span//span)[1]")
	private WebElement ciftype_search;

	public WebElement ciftype_search() {
		return ciftype_search;
	}

	@FindBy(xpath = "//select[@name='ctsRestrictionsCO.cifTypeRestLevel']")
	private WebElement CSMSADS_AccountBalanceSelectTabInRestrictionLevel_CifType;

	public WebElement CSMSADS_AccountBalanceSelectTabInRestrictionLevel_CifType() {
		return CSMSADS_AccountBalanceSelectTabInRestrictionLevel_CifType;
	}

	@FindBy(id = "add_cifGridId_UR00M")
	private WebElement CSMSADS_AddButtonUnderRestrictionType;

	public WebElement CSMSADS_AddButtonUnderRestrictionType() {
		return CSMSADS_AddButtonUnderRestrictionType;
	}

	@FindBy(id = "add_cifTypeGridId_UR00M")
	private WebElement CSMSADS_AddButtonUnderRestrictionTypeCifType;

	public WebElement CSMSADS_AddButtonUnderRestrictionTypeCifType() {
		return CSMSADS_AddButtonUnderRestrictionTypeCifType;
	}

	@FindBy(xpath = "//td[@id='td_cifGridId_UR00M_1_CIF_NO']//child::span//preceding-sibling::span/span")
	private WebElement CSMSADS_SearchIconInCIFNOUnderTheRestrictionLevel;

	public WebElement CSMSADSSearchIconInCIFNOUnderTheRestrictionLevel() {
		return CSMSADS_SearchIconInCIFNOUnderTheRestrictionLevel;
	}

	@FindBy(xpath = "//input[@name='CIF_NO']")
	private WebElement CSMSADS_EnterTheCIFNoInTheSearchBox;

	public WebElement CSMSADSEnterTheCIFNoInTheSearchBox() {
		return CSMSADS_EnterTheCIFNoInTheSearchBox;
	}

	@FindBy(xpath = "(//td[@tdlabel='CIF No'])[2]")
	private WebElement CSMSADS_SearchedCIFNoInSearchPopup;

	public WebElement CSMSADS_SearchedCIFNoInSearchPopup() {
		return CSMSADS_SearchedCIFNoInSearchPopup;
	}

	@FindBy(id = "ctsRestrictionsMaint_save_UR00M")
	private WebElement CSMSADS_SaveButtonUnderMaintenanceScreen;

	public WebElement CSMSADS_SaveButtonUnderMaintenanceScreen() {
		return CSMSADS_SaveButtonUnderMaintenanceScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMSADS_OkButtonInSuccessPopUpMenu;

	public WebElement CSMSADSOkButtonInSuccessPopUpMenu() {
		return CSMSADS_OkButtonInSuccessPopUpMenu;
	}

	@FindBy(xpath = "//td[text()='User']//ancestor::a")
	private WebElement CSMSADS_UserInParametersUnderSADSApplication;

	public WebElement CSMSADSUserInParametersUnderSADSApplication() {
		return CSMSADS_UserInParametersUnderSADSApplication;
	}

	@FindBy(id = "P005M")
	private WebElement CSMSADS_MaintenanceInUserUnderParameters;

	public WebElement CSMSADSMaintenanceInUserUnderParameters() {
		return CSMSADS_MaintenanceInUserUnderParameters;
	}

	@FindBy(id = "infoBarSearchButton_P005M")
	private WebElement CSMSADS_SearchButtonUnderMaintenanceScreen;

	public WebElement CSMSADSSearchButtonUnderMaintenanceScreen() {
		return CSMSADS_SearchButtonUnderMaintenanceScreen;
	}

	@FindBy(id = "userListGridTbl_Id_P005M_gs_usrVO.USER_ID")
	private WebElement CSMSADS_EnterUserIDInSearchUnderMaintenanceScreen;

	public WebElement CSMSADSEnterUserIDInSearchUnderMaintenanceScreen() {
		return CSMSADS_EnterUserIDInSearchUnderMaintenanceScreen;
	}

	@FindBy(id = "td_userListGridTbl_Id_P005M_1_usrVO.USER_ID")
	private WebElement CSMSADS_SearchedIDUnderMaintenanceScreen;

	public WebElement CSMSADSSearchedIDUnderMaintenanceScreen() {
		return CSMSADS_SearchedIDUnderMaintenanceScreen;
	}

	@FindBy(id = "spanLookup_CIF_NO_P005M")
	private WebElement CSMSADS_SearchButtonInEmployeeDetails;

	public WebElement CSMSADSSearchButtonInEmployeeDetails() {
		return CSMSADS_SearchButtonInEmployeeDetails;
	}

	@FindBy(id = "gridtab_CIF_NO_P005M_gs_CIF_NO")
	private WebElement CSMSADS_CIFNoInSearchBox;

	public WebElement CSMSADSCIFNoInSearchBox() {
		return CSMSADS_CIFNoInSearchBox;
	}

	@FindBy(id = "td_gridtab_CIF_NO_P005M_1_CIF_NO")
	private WebElement CSMSADS_CSearchedCIFNOInSearchBox;

	public WebElement CSMSADSCSearchedCIFNOInSearchBox() {
		return CSMSADS_CSearchedCIFNOInSearchBox;
	}

	@FindBy(id = "physical_user_P005M")
	private WebElement CSMSADS_CheckThePhysicalUserCheckBoxInPrivilege;

	public WebElement CSMSADSCheckThePhysicalUserCheckBoxInPrivilege() {
		return CSMSADS_CheckThePhysicalUserCheckBoxInPrivilege;
	}

	@FindBy(id = "userFormId_P005M_Save_key")
	private WebElement CSMSADS_SaveButtonInMaintenanceScreen;

	public WebElement CSMSADSSaveButtonInMaintenanceScreen() {
		return CSMSADS_SaveButtonInMaintenanceScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMSADS_OkButtonInSuccessPopUpInUser;

	public WebElement CSMSADSOkButtonInSuccessPopUpInUser() {
		return CSMSADS_OkButtonInSuccessPopUpInUser;
	}

	// ******************************************* SADS (SYSADM1) @TSA_158_02
	// ***************************************//

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement CSMSADS_ParameterInSADSApplication;

	public WebElement CSMSADSParameterInSADSApplication() {
		return CSMSADS_ParameterInSADSApplication;
	}

	@FindBy(xpath = "//span[text()='Approve']//ancestor::a")
	private WebElement CSMSADS_ApproveInUserUnderParameters;

	public WebElement CSMSADSApproveInUserUnderParameters() {
		return CSMSADS_ApproveInUserUnderParameters;
	}

	@FindBy(id = "infoBarSearchButton_P005P")
	private WebElement CSMSADS_SearchButtonUnderApproveScreen;

	public WebElement CSMSADSSearchButtonUnderApproveScreen() {
		return CSMSADS_SearchButtonUnderApproveScreen;
	}

	@FindBy(id = "userListGridTbl_Id_P005P_gs_usrVO.USER_ID")
	private WebElement CSMSADS_EnterUserIDInSearchUnderApproveScreen;

	public WebElement CSMSADSEnterUserIDInSearchUnderApproveScreen() {
		return CSMSADS_EnterUserIDInSearchUnderApproveScreen;
	}

	@FindBy(id = "td_userListGridTbl_Id_P005P_1_usrVO.USER_ID")
	private WebElement CSMSADS_SearchedIDunderApproveScreen;

	public WebElement CSMSADSSearchedIDunderApproveScreen() {
		return CSMSADS_SearchedIDunderApproveScreen;
	}

	@FindBy(id = "userFormId_P005P_Approve_key")
	private WebElement CSMSADS_ClickApproveButtonInApproveScreen;

	public WebElement CSMSADS_ClickApproveButtonInApproveScreen() {
		return CSMSADS_ClickApproveButtonInApproveScreen;
	}

	// ******************************************* CSM @TSA_158_03
	// *******************************************//

//			@FindBy(id = "hdr_runn_date")
//			private WebElement CSM_DateToChangeTheCurrentDate;
	//
//			public WebElement CSMDateToChangeTheCurrentDate() {
//				return CSM_DateToChangeTheCurrentDate;
//			}
	//
//			@FindBy(id = "global_user_run_date")
//			private WebElement CSM_DateInUserRunningDate;
	//
//			public WebElement CSMDateInUserRunningDate() {
//				return CSM_DateInUserRunningDate;
//			}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValues;

	public WebElement Transactions_transactionNo_codeValues()

	{
		return Transactions_transactionNo_codeValues;
	}

//				@FindBy(xpath="//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
//				 private WebElement Transactions_Approvebtn;
//				public WebElement Transactions_Approvebtn()
//				 {
//				return Transactions_Approvebtn;
//				}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_successokbtn;

	public WebElement Transactions_successokbtn() {
		return Transactions_successokbtn;
	}

	@FindBy(xpath = "//button[@id='submit_255022178']")
	private WebElement Transactions_Approvebtns;

	public WebElement Transactions_Approvebtns() {
		return Transactions_Approvebtns;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement Transactions_Approvebtn;

	public WebElement Transactions_Approvebtn() {
		return Transactions_Approvebtn;
	}

//			@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
//			private WebElement CSM_UseButtonInChangeRunningDate;
	//
//			public WebElement CSMUseButtonInChangeRunningDate() {
//				return CSM_UseButtonInChangeRunningDate;
//			}
	//
//			@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
//			private WebElement CSM_ClearCacheInTechnicalDetailsIcon;
	//
//			public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
//				return CSM_ClearCacheInTechnicalDetailsIcon;
	//
//			}
	//
//			@FindBy(id = "_popup_path_sol_ok")
//			private WebElement CSM_OkButtonInInformationPopUpMenu;
	//
//			public WebElement CSMOkButtonInInformationPopUpMenu() {
//				return CSM_OkButtonInInformationPopUpMenu;
//			}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}
//			@FindBy(id = "_header_rundate_dialog_close")
//			private WebElement CSM_CloseButtonInChangeRunningDate;
	//
//			public WebElement CSMCloseButtonInChangeRunningDate() {
//				return CSM_CloseButtonInChangeRunningDate;
//			}
	//
//			@FindBy(id = "tech_details_icon")
//			private WebElement CSM_TechnicalDetailsIcon;
	//
//			public WebElement CSMTechnicalDetailsIcon() {
//				return CSM_TechnicalDetailsIcon;
//			}
	//
//			@FindBy(id = "_popup_path_sol_ok")
//			private WebElement CSM_OkButtonUnderInformationPopUp;
	//
//			public WebElement CSMOkButtonUnderInformationPopUp() {
//				return CSM_OkButtonUnderInformationPopUp;
//			}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu() {
		return CSM_TransactionsMainMenu;
	}

	@FindBy(id = "D001MT")
	private WebElement CSM_MaintenanceUnderTransactions;

	public WebElement CSMMaintenanceUnderTransactions() {
		return CSM_MaintenanceUnderTransactions;
	}

	@FindBy(id = "lookuptxt_trx_type_D001MT")
	private WebElement CSM_TRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen() {
		return CSM_TRXTypeInMaintenanceScreen;
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

	@FindBy(xpath = "//a[@id='D001AU']")
	private WebElement Transactions_Approvescrn;

	public WebElement Transactions_Approvescrn() {
		return Transactions_Approvescrn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValue;

	public WebElement Transactions_transactionNo_codeValue() {
		return Transactions_transactionNo_codeValue;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_Doubleclk;

	public WebElement Transactions_transactionNo_Doubleclk() {
		return Transactions_transactionNo_Doubleclk;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_searchbtn;

	public WebElement Transactions_searchbtn() {
		return Transactions_searchbtn;
	}
//				@FindBy(id="Transactions / Maintenance")
//				private WebElement CSM_TransactionsMaintenanceForLoading;
	//
//				public WebElement CSM_TransactionsMaintenanceForLoading() {
//					return CSM_TransactionsMaintenanceForLoading;
//				}

	@FindBy(id = "trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeInCreditAc;

	public WebElement CSMBranchCodeInCreditAc() {
		return CSM_BranchCodeInCreditAc;
	}

	@FindBy(id = "trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodeCreditAc;

	public WebElement CSMCurrencyCodeCreditAc() {
		return CSM_CurrencyCodeCreditAc;
	}

	@FindBy(id = "trs_ac_gl_D001MT")
	private WebElement CSM_GLCodeCreditAc;

	public WebElement CSMGLCodeCreditAc() {
		return CSM_GLCodeCreditAc;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInCreditAc;

	public WebElement CSMCIFCodeInCreditAc() {
		return CSM_CIFCodeInCreditAc;
	}

	@FindBy(id = "lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialInCreditAc;

	public WebElement CSMSerialInCreditAc() {
		return CSM_SerialInCreditAc;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu;

	public WebElement CSMOkButtonInWarningPopUpMenu() {
		return CSM_OkButtonInWarningPopUpMenu;
	}

	@FindBy(id = "lookuptxt_trs_cy_D001MT")
	private WebElement CSM_CurrencyInMaintenanceScreen;

	public WebElement CSMCurrencyInMaintenanceScreen() {
		return CSM_CurrencyInMaintenanceScreen;
	}

	@FindBy(id = "amount_D001MT")
	private WebElement CSM_AmountInMaintenanceScreen;

	public WebElement CSMAmountInMaintenanceScreen() {
		return CSM_AmountInMaintenanceScreen;
	}

	@FindBy(xpath = "//td[text()='USD']")
	private WebElement CSM_CurrencyName;

	public WebElement CSMCurrencyName() {
		return CSM_CurrencyName;
	}

	@FindBy(id = "trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen;

	public WebElement CSMSaveButtonInMaintenanceScreen() {
		return CSM_SaveButtonInMaintenanceScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu;

	public WebElement CSMOkButtonInSuccessPopUpMenu() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}

	@FindBy(xpath = "//div[contains(text(),'User does not have access to make a Transaction on his own Account.')]//following::input[@id='_popup_path_sol_ok']")
	private WebElement validation_popup;

	public WebElement validation_popup() {
		return validation_popup;
	}

	@FindBy(xpath = "//div[@id='_selenuimQUER']/child::h3")
	private WebElement CSM_QueriesMainMenu;

	public WebElement CSMQueriesMainMenu() {
		return CSM_QueriesMainMenu;
	}

	@FindBy(xpath = "//td[text()='Statement Of Accounts']")
	private WebElement CSM_StatementOfAccountsInQueries;

	public WebElement CSMStatementOfAccountsInQueries() {
		return CSM_StatementOfAccountsInQueries;
	}

	@FindBy(id = "QUER001T")
	private WebElement CSM_ByTradeDateUnderStatementOfAccountsSubMenu;

	public WebElement CSMByTradeDateUnderStatementOfAccountsSubMenu() {
		return CSM_ByTradeDateUnderStatementOfAccountsSubMenu;
	}

	@FindBy(id = "accCy_QUER001T")
	private WebElement CSM_CurrencyValueIinAccountUnderByTradeDateScreen;

	public WebElement CSMCurrencyValueIinAccountUnderByTradeDateScreen() {
		return CSM_CurrencyValueIinAccountUnderByTradeDateScreen;
	}

	@FindBy(id = "accGl_QUER001T")
	private WebElement CSM_GLCodeInAccountUnderByTradeDateScreen;

	public WebElement CSMGLCodeInAccountUnderByTradeDateScreen() {
		return CSM_GLCodeInAccountUnderByTradeDateScreen;
	}

	@FindBy(id = "accCif_QUER001T")
	private WebElement CSM_CIFCodeInAccountUnderByTradeDateScreen;

	public WebElement CSMCIFCodeInAccountUnderByTradeDateScreen() {
		return CSM_CIFCodeInAccountUnderByTradeDateScreen;
	}

	@FindBy(id = "lookuptxt_accSl_QUER001T")
	private WebElement CSM_SerialInAccountUnderByTradeDateScreen;

	public WebElement CSMSerialInAccountUnderByTradeDateScreen() {
		return CSM_SerialInAccountUnderByTradeDateScreen;
	}

	@FindBy(id = "dtOpened_QUER001T")
	private WebElement CSM_FromDateInPeriodicityOfStatement;

	public WebElement CSMFromDateInPeriodicityOfStatement() {
		return CSM_FromDateInPeriodicityOfStatement;
	}

	@FindBy(id = "dtClosed_QUER001T")
	private WebElement CSM_ToDateInPeriodicityOfStatement;

	public WebElement CSMToDateInPeriodicityOfStatement() {
		return CSM_ToDateInPeriodicityOfStatement;
	}

	@FindBy(id = "sfsdfsdf")
	private WebElement CSM_RetrieveButtonUnderByTradeDateScreen;

	public WebElement CSMRetrieveButtonUnderByTradeDateScreen() {
		return CSM_RetrieveButtonUnderByTradeDateScreen;
	}

//			@FindBy(id = "_popup_path_sol_ok")
//			private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;
	//
//			public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
//				return CSM_OkButtonInAccessDeniedPopUpMenu;
//			}

	@FindBy(xpath = "//div[text()='[293] No access']")
	private WebElement CSM_ValidateIfTheStatementOfAccountDisplayedAsAccessDenied;

	public WebElement CSMValidateIfTheStatementOfAccountDisplayedAsAccessDenied() {
		return CSM_ValidateIfTheStatementOfAccountDisplayedAsAccessDenied;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement getTransactionNumber;

	public WebElement getTransactionNumber() {
		return getTransactionNumber;
	}

	// TSA_067
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement sads_ParameterFeature;

	public WebElement sadsParameterFeature() {
		return sads_ParameterFeature;
	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement parameter_UserFeature;

	public WebElement parameterUserFeature() {
		return parameter_UserFeature;
	}

	@FindBy(xpath = "//td[text()='User']//ancestor::a/following-sibling::ul//span[text()='Maintenance']")
	private WebElement user_MaintenanceFeature;

	public WebElement userMaintenanceFeature() {
		return user_MaintenanceFeature;
	}

	@FindBy(xpath = "//input[@name='USER_ID']")
	private WebElement user_SearchUserName;

	public WebElement userSearchUserName() {
		return user_SearchUserName;
	}

	@FindBy(id = "lookuptxt_CIF_NO_P005M")
	private WebElement user_CIFNumberInput;

	public WebElement userCIFNumberInput() {
		return user_CIFNumberInput;
	}

	@FindBy(xpath = "//td[text()='User']//ancestor::a/following-sibling::ul//span[text()='Approve']")
	private WebElement user_ApproveFeature;

	public WebElement userApproveFeature() {
		return user_ApproveFeature;
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

	@FindBy(xpath = "//a[contains(text(),' Search ')]")
	private WebElement csm_SearchButton;

	public WebElement csmSearchButton() {
		return csm_SearchButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]/ancestor::div//following-sibling::center//input")
	private WebElement sads_SaveSuccessOkButton;

	public WebElement sadsSaveSuccessOkButton() {
		return sads_SaveSuccessOkButton;
	}

	@FindBy(xpath = "//label[contains(text(),'Approve ')]//ancestor::button")
	private WebElement csm_ApproveBtnWithLabel;

	public WebElement csmApproveBtnWithLabel() {
		return csm_ApproveBtnWithLabel;
	}

	@FindBy(xpath = "//div[text()='Record was Approved Successfully']//ancestor::div//center//input[1]")
	private WebElement csm_ApproveSuccessOkButton;

	public WebElement csmApproveSuccessOkButton() {
		return csm_ApproveSuccessOkButton;
	}

	@FindBy(name = "tellerparamCO.ctstellerVO.FORBID_TRS_ON_ITS_ACC")
	private WebElement userUpdateAfterApprove_TrxOnHisOtherTellerAccDropdown;

	public WebElement userUpdateAfterApproveTrxOnHisOtherTellerAccDropdown() {
		return userUpdateAfterApprove_TrxOnHisOtherTellerAccDropdown;
	}

	@FindBy(id = "lookuptxt_cif_no_E000MA")
	private WebElement userUpdateAfterApprove_CIFNumberInput;

	public WebElement userUpdateAfterApproveCIFNumberInput() {
		return userUpdateAfterApprove_CIFNumberInput;
	}

	@FindBy(id = "tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_Userid;
	}

	@FindBy(id = "tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")
	private WebElement csmParam_User_Approve_UserID;

	public WebElement csmParam_User_Approve_UserID() {
		return csmParam_User_Approve_UserID;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.CHQ_NUM']")
	private WebElement csm_Transactions_Maintenance_ChequeNo;

	public WebElement csm_Transactions_Maintenance_ChequeNo() {
		return csm_Transactions_Maintenance_ChequeNo;
	}

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

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement multiChequesEntry_BranchCodeInput;

	public WebElement multiChequesEntryBranchCodeInput() {
		return multiChequesEntry_BranchCodeInput;
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

//			@FindBy(id="submit_464136045")
//			private WebElement multiChequesEntryTransactionDetails_SaveButton;
	//
//			public WebElement multiChequesEntryTransactionDetailsSaveButton() {
//				return multiChequesEntryTransactionDetails_SaveButton;
//			}
	@FindBy(id = "proceed_D001CEMT")
	private WebElement multiChequesEntry_ProceedButton;

	public WebElement multiChequesEntryProceedButton() {
		return multiChequesEntry_ProceedButton;
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

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csm_QuitOkButton;

	public WebElement csmQuitOkButton() {
		return csm_QuitOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'is Non Resident')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactionMaintenance_IsNoResidentOkbuton;

	public WebElement transactionMaintenanceIsNoResidentOkbuton() {
		return transactionMaintenance_IsNoResidentOkbuton;
	}

	@FindBy(xpath = "//td[@title='Add new row']//span[@class='ui-icon ui-icon-plus']")
	private WebElement csmCommon_GridAddButton;

	public WebElement csmCommonGridAddButton() {
		return csmCommon_GridAddButton;
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

	@FindBy(xpath = "//span[contains(text(),'Save')]//parent::button")
	private WebElement csm_SaveButton;

	public WebElement csmSaveButton() {
		return csm_SaveButton;
	}

	@FindBy(xpath = "//td[text()='Control Record']")

	private WebElement controlRecordInSystemParameters;

	public WebElement controlRecordInSystemParameters()

	{

		return controlRecordInSystemParameters;

	}

	@FindBy(xpath = "//span[text()='Update After Approve']")

	private WebElement updateAfterApproveButtonInControlRecord;

	public WebElement updateAfterApproveButtonInControlRecord()

	{

		return updateAfterApproveButtonInControlRecord;

	}

	@FindBy(xpath = "//a[text()=' Alert Activation ']")

	private WebElement alertActivationButton;

	public WebElement alertActivationButton()

	{

		return alertActivationButton;

	}

	@FindBy(xpath = "(//span[text()='Transactions']//parent::td//div)[1]")

	private WebElement maximizeTransactionFlagInAlertActivation;

	public WebElement maximizeTransactionFlagInAlertActivation()

	{

		return maximizeTransactionFlagInAlertActivation;

	}

	@FindBy(xpath = "(//span[text()='Transactions']//parent::td//div)[1]")

	private WebElement maximizeFlagInAlertActivation;

	public WebElement maximizeFlagInAlertActivation()

	{

		return maximizeFlagInAlertActivation;

	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_33_CUSTOM_FIELD'])[1]")

	private WebElement staffAccountsTransactionFlag;

	public WebElement staffAccountsTransactionFlag()

	{

		return staffAccountsTransactionFlag;

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

	@FindBy(xpath = "//*[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_inputfield;

	public WebElement csmParam_Transactiontype_inputfield() {
		return csmParam_Transactiontype_inputfield;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code;

	public WebElement CSMParam_TransactionType_Approve_code() {
		return CSMParam_TransactionType_Approve_code;
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

	@FindBy(xpath = "(//input[@gridid='tab4_GridTbl_Id_O001UP'])[1]")

	private WebElement staffAccountsTransactionFlagCheckBox;

	public WebElement staffAccountsTransactionFlagCheckBox()

	{

		return staffAccountsTransactionFlagCheckBox;

	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement updateAfterApproveButtonInUpdateAfterApprove;

	public WebElement updateAfterApproveButtonInUpdateAfterApprove() {
		return updateAfterApproveButtonInUpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement confirmOkButton;

	public WebElement confirmOkButton() {
		return confirmOkButton;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement successOkButton;

	public WebElement successOkButton() {
		return successOkButton;
	}

	@FindBy(xpath = "//a[@id='E000P']")
	private WebElement approveScreenInUser;

	public WebElement approveScreenInUser() {
		return approveScreenInUser;
	}

	@FindBy(xpath = "//span[text()='Approve']//parent::a[@id='O001P']")
	private WebElement approveScreenIncontrolRecords;

	public WebElement approveScreenIncontrolRecords() {
		return approveScreenIncontrolRecords;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement userIdInUpdateAfterApprove;

	public WebElement userIdInUpdateAfterApprove() {
		return userIdInUpdateAfterApprove;
	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID")
	private WebElement doubleClickUserInUpdateAfterApprove;

	public WebElement doubleClickUserInUpdateAfterApprove() {
		return doubleClickUserInUpdateAfterApprove;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement approveButtonInUser;

	public WebElement approveButtonInUser() {
		return approveButtonInUser;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement approveButtonIncontrolrecord;

	public WebElement approveButtonIncontrolrecord() {
		return approveButtonIncontrolrecord;
	}

	@FindBy(xpath = "//input[@name='TYPE_CODE']")
	private WebElement Enter_ciftype;

	public WebElement Enter_ciftype() {
		return Enter_ciftype;
	}

	@FindBy(xpath = "//div[@id=\"div__popup_path_sol_ok\"]//div/div[contains(text(),'Code Already in Use')]")
	private WebElement AccountRestriction_CodeAlready_use_PopUp;

	public WebElement AccountRestriction_CodeAlready_use_PopUp() {
		return AccountRestriction_CodeAlready_use_PopUp;
	}

//			@FindBy(xpath = "//td[text()='Accounts']")
//			private WebElement csm_AccountsMainModule;
	//
//			public WebElement csmAccountsMainModule() {
//				return csm_AccountsMainModule;
//			}
	//
//			@FindBy(xpath = "//td[text()='Fixed Maturity Accounts']")
//			private WebElement accounts_FixedMaturiyAccounts;
	//
//			public WebElement accountsFixedMaturityAccounts() {
//				return accounts_FixedMaturiyAccounts;
//			}
	//
//			@FindBy(xpath = "//span[text()='Opening']")
//			private WebElement fixedMaturiyAccounts_Opening;
	//
//			public WebElement fixedMaturiyAccountsOpening() {
//				return fixedMaturiyAccounts_Opening;
//			}
	//
//			@FindBy(xpath = "//td[text()='General Accounts']//ancestor::a")
//			private WebElement accounts_GeneralAccounts;
	//
//			public WebElement accountsGeneralAccounts() {
//				return accounts_GeneralAccounts;
//			}
	//
//			@FindBy(xpath = "//td[text()='General Accounts']//ancestor::li//span[text()='Opening']")
//			private WebElement generalAccounts_Opening;
	//
//			public WebElement generalAccountsOpening() {
//				return generalAccounts_Opening;
//			}
	//
//			@FindBy(xpath = "//a[@id='A003']//span[text()='Account Query']")
//			private WebElement accounts_AccountQuery;
	//
//			public WebElement accountsAccountQuery() {
//				return accounts_AccountQuery;
//			}
	//
//			@FindBy(xpath = "//td[text()='Closed Dormant Accounts']")
//			private WebElement accounts_ClosedDormantAccounts;
	//
//			public WebElement accountsClosedDormantAccounts() {
//				return accounts_ClosedDormantAccounts;
//			}
	//
//			@FindBy(xpath = "//td[text()='Closed Dormant Accounts']//ancestor::li//span[text()='Maintenance']")
//			private WebElement closedDormantAccounts_Maintenance;
	//
//			public WebElement closedDormantAccountsMaintenance() {
//				return closedDormantAccounts_Maintenance;
//			}
	//
//			@FindBy(xpath = "//input[@id='lookuptxt_CIF_A002CDAMT']")
//			private WebElement closedDormantAccount_InputCIFCode;
	//
//			public WebElement closedDormantAccountInputCIFCode() {
//				return closedDormantAccount_InputCIFCode;
//			}
	//
//			@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A001MT']")
//			private WebElement fom_CurrencyCode;
	//
//			public WebElement fomCurrencyCode() {
//				return fom_CurrencyCode;
//			}
	//
//			@FindBy(xpath = "//input[@id='lookuptxt_glType_A001MT']")
//			private WebElement fom_GlCode;
	//
//			public WebElement fomGLCode() {
//				return fom_GlCode;
//			}
	//
//			@FindBy(xpath = "//input[@id='lookuptxt_cifNo_A001MT']")
//			private WebElement fom_CIFNo;
	//
//			public WebElement fomCIFNo() {
//				return fom_CIFNo;
//			}
	//
//			@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A002MT']")
//			private WebElement generalAccounts_CurrencyCode;
	//
//			public WebElement generalAccountsCurrencyCode() {
//				return generalAccounts_CurrencyCode;
//			}
	//
//			@FindBy(xpath = "//input[@name='accountsManagementCO.currencyDesc']")
//			private WebElement generalAccounts_CurrencyDescription;
	//
//			public WebElement generalAcccountsCurrencyDescription() {
//				return generalAccounts_CurrencyDescription;
//			}
	//
//			@FindBy(xpath = "//input[@name='accountsManagementCO.glDesc']")
//			private WebElement generalAccounts_glDescription;
	//
//			public WebElement generalAccountsGlDescription() {
//				return generalAccounts_glDescription;
//			}
	//
//			@FindBy(xpath = "//input[@name='accountsManagementCO.cifName']")
//			private WebElement generalAccounts_CIFName;
	//
//			public WebElement generalAccountsCIFName() {
//				return generalAccounts_CIFName;
//			}
	//
//			@FindBy(xpath = "//span[text()='close']")
//			private WebElement accounts_MemoClose;
	//
//			public WebElement accountsMemoClose() {
//				return accounts_MemoClose;
//			}
//			@FindBy(xpath = "//input[@id='lookuptxt_glType_A002MT']")
//			private WebElement generalAccounts_GLType;
	//
//			public WebElement generalAccountsGLType() {
//				return generalAccounts_GLType;
//			}
	//
//			@FindBy(xpath = "//input[@id='lookuptxt_cifNo_A002MT']")
//			private WebElement generalAccounts_CIFNo;
	//
//			public WebElement generalAccountsCIFNo() {
//				return generalAccounts_CIFNo;
//			}
//			@FindBy(xpath = "//input[@name='accountsManagementCO.cifName']")
//			private WebElement generalAccounts_CIFNameDescription;
	//
//			public WebElement generalAccountsCIFNameDescription() {
//				return generalAccounts_CIFNameDescription;
//			}
	@FindBy(xpath = "//td[text()='PassBooks']")
	private WebElement CSMCore_Passbook;

	public WebElement CSMCore_Passbook() {
		return CSMCore_Passbook;
	}

//			@FindBy(xpath = "//td[text()='PassBooks']//following::span[text()='Maintenance']")
//			private WebElement CSMCore_Passbook_Maintenece;
	//
//			public WebElement CSMCore_Passbook_Maintenece() {
//				return CSMCore_Passbook_Maintenece;
//			}
//			@FindBy(xpath = "//input[@name='passBookCO.passBookVO.PASSBK_TYPE']")
//			private WebElement CSMCore_Passbook_Maintenece_PassbookType;
	//
//			public WebElement CSMCore_Passbook_Maintenece_PassbookType() {
//				return CSMCore_Passbook_Maintenece_PassbookType;
//			}
//			@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_CY']")
//			private WebElement CSMCore_Passbook_Maintenece_AccCurrency;
	//
//			public WebElement CSMCore_Passbook_Maintenece_AccCurrency() {
//				return CSMCore_Passbook_Maintenece_AccCurrency;
//			}
//			@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_GL']")
//			private WebElement CSMCore_Passbook_Maintenece_AccGl;
	//
//			public WebElement CSMCore_Passbook_Maintenece_AccGl() {
//				return CSMCore_Passbook_Maintenece_AccGl;
//			}
//			@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_CIF']")
//			private WebElement CSMCore_Passbook_Maintenece_AccCIF;
	//
//			public WebElement CSMCore_Passbook_Maintenece_AccCIF() {
//				return CSMCore_Passbook_Maintenece_AccCIF;
//			}
//			@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_SL']")
//			private WebElement CSMCore_Passbook_Maintenece_AccSl;
	//
//			public WebElement CSMCore_Passbook_Maintenece_AccSl() {
//				return CSMCore_Passbook_Maintenece_AccSl;
//			}
//			
//			@FindBy(xpath="//td[@id='add_cifTypeGridId_UR00M']")
//			private WebElement ciftype_Addbtn;
//			public WebElement ciftype_Addbtn() {
//				  return ciftype_Addbtn;
//			}
	@FindBy(xpath = "//td[text()='Special Conditions']")
	private WebElement CSMCore_SpecialConditions;

	public WebElement CSMCore_SpecialConditions() {
		return CSMCore_SpecialConditions;
	}

	@FindBy(xpath = "//td[text()='Special Conditions']//following::span[text()='Maintenance']")
	private WebElement CSMCore_SpecialConditions_Maintenance;

	public WebElement CSMCore_SpecialConditions_Maintenance() {
		return CSMCore_SpecialConditions_Maintenance;
	}

	@FindBy(xpath = "//input[@name='spcondsCO.specialConditionsVO.CIF_NO']")
	private WebElement CSMCore_SpecialConditions_Maintenance_CIFNo;

	public WebElement CSMCore_SpecialConditions_Maintenance_CIFNo() {
		return CSMCore_SpecialConditions_Maintenance_CIFNo;
	}

	@FindBy(xpath = "//select[@name='spcondsCO.specialConditionsVO.FORBID_TRX']")
	private WebElement CSMCore_SpecialConditions_Maintenance_ForbidRestrict;

	public WebElement CSMCore_SpecialConditions_Maintenance_ForbidRestrict() {
		return CSMCore_SpecialConditions_Maintenance_ForbidRestrict;
	}

	@FindBy(xpath = "//select[@name='spcondsCO.specialConditionsVO.FORBID_PRODUCT']")
	private WebElement CSMCore_SpecialConditions_Maintenance_ForbidProduct;

	public WebElement CSMCore_SpecialConditions_Maintenance_ForbidProduct() {
		return CSMCore_SpecialConditions_Maintenance_ForbidProduct;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_spcondsReasonLiveSearch_SPC00MT']")
	private WebElement CSMCore_SpecialConditions_Maintenance_Reason;

	public WebElement CSMCore_SpecialConditions_Maintenance_Reason() {
		return CSMCore_SpecialConditions_Maintenance_Reason;
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
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon_609;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_609() {
		return CSM_ClearCacheInTechnicalDetailsIcon_609;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_609;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_609() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday_609;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu_609;

	public WebElement CSMOkButtonInInformationPopUpMenu_609() {
		return CSM_OkButtonInInformationPopUpMenu_609;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_609;

	public WebElement CSM_CloseButtonInChangeRunningDate_609() {
		return CSM_CloseButtonInChangeRunningDate_609;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon_609;

	public WebElement CSMTechnicalDetailsIcon_609() {
		return CSM_TechnicalDetailsIcon_609;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_609;

	public WebElement CSMOkButtonUnderInformationPopUp_609() {
		return CSM_OkButtonUnderInformationPopUp;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_609;

	public WebElement CSM_OkButtonInAccessDeniedPopUpMenu_609() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_609;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement csmStopperMessagePopupInTransactions_609;

	public WebElement csmStopperMessagePopupInTransactions_609() {
		return csmStopperMessagePopupInTransactions_609;
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

	@FindBy(xpath = "//a[@id='A002ACT']/span[text()='Authorize Close With Transfer']")
	private WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_609;

	public WebElement Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_609() {
		return Accounts_GeneralAccounts_AuthorizeCloseWithTransfer_609;
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

//			 @FindBy(xpath="//span[text()='Approve']")
//			 private WebElement accountRestrictionsApprove;
//			 public WebElement accountRestrictions_Approve() {
//				 return accountRestrictionsApprove;
//			 }
//			 @FindBy(xpath="//span[text()='Update After Approve']")
//			 private WebElement accountRestrictionsUpdateAfterApprove;
//			 public WebElement accountRestrictions_UpdateAfterApprove() {
//				 return accountRestrictionsUpdateAfterApprove;
//			 }
//			 @FindBy(xpath="//span[text()='List of Restriction']")
//			 private WebElement accountRestrictionsListOfRestriction;
//			 public WebElement accountRestrictions_ListOfRestriction() {
//				 return accountRestrictionsListOfRestriction;
//			 }
//			@FindBy(xpath="//input[@id='code_UR00M']")
//			private WebElement code;
//			public WebElement code() {
//				return code;
//			}
//			
//			
//			
//			@FindBy(xpath="//input[@id='jqg_userGridId_UR00M_1']")
//			private WebElement userIDFirstCheckBox;
//			public WebElement userID_FirstCheckBox() {
//				return userIDFirstCheckBox;
//			}
//			@FindBy(xpath="//td[text()='KARTHIK']/preceding-sibling::td[@id='td_userGridId_UR00T_0_cb']//input")
//			private WebElement sads_UserId_CheckBox;
//			public WebElement sads_UserId_CheckBox()
//			{
//				return sads_UserId_CheckBox;
//			}
//			@FindBy(id="td_chequeBookGridTbl_Id_Q000TC_1_ctschqbookVO.CODE")
//			private WebElement csm_ChequebookRequest_ToCancel_Validation_615;
//			public WebElement csm_ChequebookRequest_ToCancel_Validation_615()
//			{
//				return csm_ChequebookRequest_ToCancel_Validation_615;
//			}
//			@FindBy(id="chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.ACC_CIF")
//		    private WebElement csm_ChequebookRequest_SubmitScreen_CifInput_615;
//		    public WebElement csm_ChequebookRequest_SubmitScreen_CifInput_615()
//		    {
//		    	return csm_ChequebookRequest_SubmitScreen_CifInput_615;
//		    }
//		    @FindBy(xpath="//span[text()='Submit']")
//		    private WebElement csm_ChequebookRequest_SubmitScreen_615;
//		    public WebElement csm_ChequebookRequest_SubmitScreen_615()
//		    {
//		    	return csm_ChequebookRequest_SubmitScreen_615;
//		    }
//		    @FindBy(id="chequeBookGridTbl_Id_Q000RV_gs_ctschqbookVO.ACC_CIF")
//		    private WebElement csm_ChequebookRequest_ReverseChequebookTab_CifInput_615;
//		    public WebElement csm_ChequebookRequest_ReverseChequebookTab_CifInput_615()
//		    {
//		    	return csm_ChequebookRequest_ReverseChequebookTab_CifInput_615;
//		    }
//		    @FindBy(id="chequeBookGridTbl_Id_Q000RE_gs_ctschqbookVO.ACC_CIF")
//		    private WebElement csm_ChequebookRequest_ReactivateTab_CifInput_615;
//		    public WebElement csm_ChequebookRequest_ReactivateTab_CifInput_615()
//		    {
//		    	return csm_ChequebookRequest_ReactivateTab_CifInput_615;
//		    }
//		    @FindBy(xpath="//span[text()='Reactivate']")
//		    private WebElement csm_ChequebookRequest_ReactivateTab_615;
//		    public WebElement csm_ChequebookRequest_ReactivateTab_615()
//		    {
//		    	return csm_ChequebookRequest_ReactivateTab_615;
//		    }
//		    @FindBy(id="gridtab_status_sl_Q000QR_gs_amfVO.CIF_SUB_NO")
//		    private WebElement csm_ChequebookRequest_ChequebookQueryTab_CifInput_615;
//		    public WebElement csm_ChequebookRequest_ChequebookQueryTab_CifInput_615()
//		    {
//		    	return csm_ChequebookRequest_ChequebookQueryTab_CifInput_615;
//		    }
//		    @FindBy(id="spanLookup_status_sl_Q000QR")
//		    private WebElement csm_ChequebookRequest_ChequebookQueryTab_SearchIcon_615;
//		    public WebElement csm_ChequebookRequest_ChequebookQueryTab_SearchIcon_615()
//		    {
//		    	return csm_ChequebookRequest_ChequebookQueryTab_SearchIcon_615;
//		    }
//		    @FindBy(xpath="//span[text()='Chequebook Query']")
//		    private WebElement csm_ChequebookRequest_ChequebookQueryTab_615;
//		    public WebElement csm_ChequebookRequest_ChequebookQueryTab_615()
//		    {
//		    	return csm_ChequebookRequest_ChequebookQueryTab_615;
//		    }
//		    @FindBy(id="td_chequeBookGridTbl_Id_Q000PT_1_ctschqbookVO.CODE")
//			private WebElement csm_ChequebookRequest_PrintScreen_Validation_615;
//			public WebElement csm_ChequebookRequest_PrintScreen_Validation_615()
//			{
//				return csm_ChequebookRequest_PrintScreen_Validation_615;
//			}
//			@FindBy(id="chequeBookGridTbl_Id_Q000PT_gs_ctschqbookVO.ACC_CIF")
//			private WebElement csm_ChequebookRequest_PrintScreen_Cif_InputField_615;
//			public WebElement csm_ChequebookRequest_PrintScreen_Cif_InputField_615()
//			{
//				return csm_ChequebookRequest_PrintScreen_Cif_InputField_615;
//			}
//			@FindBy(xpath="//span[text()='Print']")
//			private WebElement csm_ChequebookRequest_PrintScreen_615;
//			public WebElement csm_ChequebookRequest_PrintScreen_615()
//			{
//				return csm_ChequebookRequest_PrintScreen_615;
//			}
//			@FindBy(id="td_chequeBookGridTbl_Id_Q000TD_1_ctschqbookVO.CODE")
//			private WebElement csm_ChequebookReuest_ToBeDestroyed_Validation_615;
//			public WebElement csm_ChequebookReuest_ToBeDestroyed_Validation_615()
//			{
//				return csm_ChequebookReuest_ToBeDestroyed_Validation_615;
//			}
//			@FindBy(id="chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.ACC_CIF")
//			private WebElement csm_ChequebookRequest_ToBeDestroyed_Cif_InputField_615;
//			public WebElement csm_ChequebookRequest_ToBeDestroyed_Cif_InputField_615()
//			{
//				return csm_ChequebookRequest_ToBeDestroyed_Cif_InputField_615;
//			}
//			@FindBy(name="ACC_CIF")
//			private WebElement csm_ChequebookRequest_ToCancel_Cif_InputField_615;
//			public WebElement csm_ChequebookRequest_ToCancel_Cif_InputField_615()
//			{
//				return csm_ChequebookRequest_ToCancel_Cif_InputField_615;
//			}
//			@FindBy(xpath="//span[text()='To Be Destroyed']")
//			private WebElement csm_ChequebookRequest_ToBeDestroyed_615;
//			public WebElement csm_ChequebookRequest_ToBeDestroyed_615()
//			{
//				return csm_ChequebookRequest_ToBeDestroyed_615;
//			}
//			@FindBy(id = "code_UR00M")
//			private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance_615;
//			public WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance_615() 
//			{
//				return CSMSADS_EnterTheValueInCodeUnderMaintenance_615;
//			}
//			@FindBy(xpath="//span[text()='To Cancel']")
//			private WebElement csm_ChequebookRequest_ToCancel_615;
//			public WebElement csm_ChequebookRequest_ToCancel_615()
//			{
//				return csm_ChequebookRequest_ToCancel_615;
//			}
//			@FindBy(id = "_popup_path_sol_ok")
//			private WebElement CSMSADS_ClickOkButtonInSuccessPopUpMenu;
//			public WebElement CSMSADSClickOkButtonInSuccessPopUpMenu() 
//			{
//				return CSMSADS_ClickOkButtonInSuccessPopUpMenu;
//			}
//			@FindBy(id = "UR00P")
//			private WebElement CSMSADS_ApproveUnderAccountRestrictions;
//			public WebElement CSMSADSApproveUnderAccountRestrictions() 
//			{
//				return CSMSADS_ApproveUnderAccountRestrictions;
//			}
//			@FindBy(id = "ctsRestrictionsListGridTbl_Id_UR00P_gs_code")
//			private WebElement CSMSADS_EnterCodeInApproveScreen;
//		    public WebElement CSMSADSEnterCodeInApproveScreen() 
//		    {
//				return CSMSADS_EnterCodeInApproveScreen;
//			}
//		    @FindBy(id = "td_ctsRestrictionsListGridTbl_Id_UR00P_1_code")
//			private WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen;
//		    public WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen() 
//		    {
//				return CSMSADS_ClickTheSelectedCodeInApproveScreen;
//			}
//		    @FindBy(id = "ctsRestrictionsMaint_approve_UR00P")
//			private WebElement CSMSADS_ApproveButtonInApproveScreen;
//		    public WebElement CSMSADSApproveButtonInApproveScreen() 
//		    {
//				return CSMSADS_ApproveButtonInApproveScreen;
//			}
//		    @FindBy(id="add_restrictionsGridTbl_Id_UR00M")
//			private WebElement csm_Sads_AccountRestriction_Maintenance_AddButton_615;
//			public WebElement csm_Sads_AccountRestriction_Maintenance_AddButton_615()
//			{
//				return csm_Sads_AccountRestriction_Maintenance_AddButton_615;
//			}
//			@FindBy(xpath="//td[@id='td_restrictionsGridTbl_Id_UR00M_1_restrictionType']//child::select")
//			private WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption_615;
//			public WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption_615()
//			{
//				return csm_Sads_AccountRestriction_Maintenance_SelectOption_615;
//			}
//			@FindBy(id="cifRangeRestLevel_UR00M")
//			private WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel_615;
//			public WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel_615()
//			{
//				return csm_Sads_AccountRestriction_Maintenance_RestrictionLevel_615;
//			}
//			@FindBy(id="add_cifGridId_UR00M")
//			private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon_615;
//			public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon_615()
//			{
//				return csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon_615;
//			}
//			@FindBy(xpath="(//span[@role='button'])[1]")
//			private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon_615;
//			public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon_615()
//			{
//				return csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon_615;
//			}
//			@FindBy(xpath="(//td[@tdlabel='CIF No'])[2]")
//			private WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif_615;
//			public WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif_615()
//			{
//				return csm_Sads_AccountRestriction_Maintenance_DoubleClickCif_615;
//			}
//			@FindBy(xpath="//input[@name='CIF_NO']")
//			private WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox_615;
//			public WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox_615()
//			{
//				return csm_Sads_AccountRestriction_Maintenance_CifInputBox_615;
//			}
//			@FindBy(xpath="//label[text()='Save ']")
//			private WebElement saveButton1;
//			public WebElement save_Button() 
//			{
//			return saveButton1;
//			}
//			@FindBy(id="hdr_runn_date")
//			private WebElement CSM_DateToChangeTheCurrentDate;
//			public WebElement CSMDateToChangeTheCurrentDate()
//			{
//				return CSM_DateToChangeTheCurrentDate;
//			}
//			@FindBy(id="global_user_run_date")
//			private WebElement CSM_DateInUserRunningDate;
//			public WebElement CSMDateInUserRunningDate()
//			{
//				return CSM_DateInUserRunningDate;
//			}
//			@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
//			private WebElement CSM_UseButtonInChangeRunningDate;
//			public WebElement CSMUseButtonInChangeRunningDate() 
//			{
//				return CSM_UseButtonInChangeRunningDate;
//			}
//			@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
//			private WebElement CSMOkButtonInAccessDeniedPopUpMenu;
//			public WebElement CSMOkButtonInAccessDeniedPopUpMenu()
//			{
//				return CSMOkButtonInAccessDeniedPopUpMenu;
//			}
//			@FindBy(id="_header_rundate_dialog_close")
//			private WebElement CSM_CloseButtonInChangeRunningDate;
//			public WebElement CSMCloseButtonInChangeRunningDate() 
//			{
//				return CSM_CloseButtonInChangeRunningDate;
//			}
//			@FindBy(xpath = "//td[text()='Chequebook Request']")
//			private WebElement ChequeBookRequest;
//			public WebElement ChequeBookRequest()
//			{
//				return ChequeBookRequest;
//			}
//			@FindBy(xpath = "//span[text()='Reverse Chequebook']")
//			private WebElement reverseChequeBookScreen;
//			public WebElement reverseChequeBookScreen()
//			{
//				return reverseChequeBookScreen;
//			}
//			 
//			    @FindBy(id = "code_UR00M")
//				private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance;
//				public WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance() 
//				{
//					return CSMSADS_EnterTheValueInCodeUnderMaintenance;
//				}
//			    @FindBy(id="add_restrictionsGridTbl_Id_UR00M")
//				private WebElement csm_Sads_AccountRestriction_Maintenance_AddButton1;
//				public WebElement csm_Sads_AccountRestriction_Maintenance_AddButton()
//				{
//					return csm_Sads_AccountRestriction_Maintenance_AddButton;
//				}
//				
//				@FindBy(xpath="//td[@id='td_restrictionsGridTbl_Id_UR00M_1_restrictionType']//child::select")
//				private WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption1;
//				public WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption()
//				{
//					return csm_Sads_AccountRestriction_Maintenance_SelectOption;
//				}
//				@FindBy(id="cifRangeRestLevel_UR00M")
//				private WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel1;
//				public WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel()
//				{
//					return csm_Sads_AccountRestriction_Maintenance_RestrictionLevel;
//				}
//				@FindBy(id="add_cifGridId_UR00M")
//				private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon1;
//				public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon()
//				{
//					return csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon;
//				}
//				@FindBy(xpath="(//span[@role='button'])[1]")
//				private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon1;
//				public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon()
//				{
//					return csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon;
//				}
//				@FindBy(xpath="//input[@name='CIF_NO']")
//				private WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox1;
//				public WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox()
//				{
//					return csm_Sads_AccountRestriction_Maintenance_CifInputBox;
//				}
//				
//				@FindBy(xpath="(//td[@tdlabel='CIF No'])[2]")
//				private WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif1;
//				public WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif()
//				{
//					return csm_Sads_AccountRestriction_Maintenance_DoubleClickCif;
//				}
//				
//		//core
//				
//				@FindBy(xpath="//td[text()='Chequebook Request']")
//				private WebElement CSM_Chequebookrequest;
//				public WebElement CSM_Chequebookrequest() {
//					return CSM_Chequebookrequest;
//				}
//				@FindBy(xpath="//span[text()='Maintenance']")
//				private WebElement CSM_Chequebookrequest_maintenance;
//				public WebElement CSM_Chequebookrequest_maintenance() {
//					return CSM_Chequebookrequest_maintenance;	
//				}
//				
//				@FindBy(id="infoBarSearchButton_Q000MT")
//				private WebElement CSM_Chequebookrequest_maintenance_Search;
//				public WebElement CSM_Chequebookrequest_maintenance_Search() {
//					return CSM_Chequebookrequest_maintenance_Search;	
//				}
//				@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_CIF']")
//				private WebElement CSM_Chequebookrequest_maintenance_Search_cifinput;
//				public WebElement CSM_Chequebookrequest_maintenance_Search_cifinput() {
//					return CSM_Chequebookrequest_maintenance_Search_cifinput;	
//				}
//				@FindBy(xpath="//span[text()='Received by branch']")
//				private WebElement CSM_Chequebookrequest_Received;
//				public WebElement CSM_Chequebookrequest_Received() {
//					return CSM_Chequebookrequest_Received;	
//				}
//				
//				@FindBy(xpath="//input[@id='chqBkImpExpGridTbl_Id_Q000RB_gs_ctschqbookVO.ACC_CIF']")
//				private WebElement CSM_Chequebookrequest_Received_inputCIFNo;
//				public WebElement CSM_Chequebookrequest_Received_inputCIFNo() {
//					return CSM_Chequebookrequest_Received_inputCIFNo;	
//				}
//				
//				@FindBy(xpath="//td[text()='Send To/Receive From Provider']")
//				private WebElement CSM_Chequebookrequest_SendToReceiveFromProvider;
//				public WebElement CSM_Chequebookrequest_SendToReceiveFromProvider() {
//					return CSM_Chequebookrequest_SendToReceiveFromProvider;	
//				}
//				@FindBy(xpath="//span[text()='Receive From Provider']")
//				private WebElement CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider;
//				public WebElement CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider() {
//					return CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider;	
//				}
//				@FindBy(xpath="//input[@id='chqBkImpExpGridTbl_Id_Q000RP_gs_ctschqbookVO.ACC_CIF']")
//				private WebElement CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider_cifno;
//				public WebElement CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider_cifno() {
//					return CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider_cifno;	
//				}
//				@FindBy(xpath="//span[text()='Send To Branch']")
//				private WebElement CSM_Chequebookrequest_SendToBranch;
//				public WebElement CSM_Chequebookrequest_SendToBranch() {
//					return CSM_Chequebookrequest_SendToBranch;	
//				}
//				
//				@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000TB_gs_ctschqbookVO.ACC_CIF']")
//				private WebElement CSM_Chequebookrequest_SendToBranch_cifno;
//				public WebElement CSM_Chequebookrequest_SendToBranch_cifno() {
//					return CSM_Chequebookrequest_SendToBranch_cifno;	
//				}	
//				
//				@FindBy(xpath="//td[text()='Accounts']")
//				private WebElement CSM_AccountMenu;
//				public WebElement CSM_AccountMenu() {
//					return CSM_AccountMenu;	
//				}	
//				@FindBy(xpath="//td[text()='Fixed Maturity Accounts']")
//				private WebElement CSM_AccountMenu_FMA;
//				public WebElement CSM_AccountMenu_FMA() {
//					return CSM_AccountMenu_FMA;	
//				}
//				@FindBy(xpath="//span[text()='Reject']")
//				private WebElement CSM_AccountMenu_FMA_reject;
//				public WebElement CSM_AccountMenu_FMA_reject() {
//					return CSM_AccountMenu_FMA_reject;	
//				}
//				@FindBy(xpath="//input[@id='fixedMaturityAccountsGridTbl_Id_A001XJ_gs_amfVO.CIF_SUB_NO']")
//				private WebElement CSM_AccountMenu_FMA_rejectCIF;
//				public WebElement CSM_AccountMenu_FMA_rejectCIF() {
//					return CSM_AccountMenu_FMA_rejectCIF;	
//				}
//				@FindBy(xpath="//span[text()='Reactivate']")
//				private WebElement CSM_AccountMenu_FMA_Reactivete;
//				public WebElement CSM_AccountMenu_FMA_Reactivete() {
//					return CSM_AccountMenu_FMA_Reactivete;	
//				}
//				@FindBy(xpath="//input[@id='fixedMaturityAccountsGridTbl_Id_A001YP_gs_amfVO.CIF_SUB_NO']")
//				private WebElement CSM_AccountMenu_FMA_ReactiveteCIF;
//				public WebElement CSM_AccountMenu_FMA_ReactiveteCIF() {
//					return CSM_AccountMenu_FMA_ReactiveteCIF;	
//				}
	//
//				@FindBy(xpath="//td[text()='General Accounts']")
//				private WebElement CSM_AccountMenu_GeneralAcc;
//				public WebElement CSM_AccountMenu_GeneralAcc() {
//					return CSM_AccountMenu_GeneralAcc;	
//				}
//				@FindBy(xpath="//span[text()='Reactivate']")
//				private WebElement CSM_AccountMenu_GeneralAcc_Reactive;
//				public WebElement CSM_AccountMenu_GeneralAcc_Reactive() {
//					return CSM_AccountMenu_GeneralAcc_Reactive;	
//				}
//				@FindBy(xpath="//input[@id='generalAccountsGridTbl_Id_A002YR_gs_amfVO.CIF_SUB_NO']")
//				private WebElement CSM_AccountMenu_GeneralAcc_ReactiveCIF;
//				public WebElement CSM_AccountMenu_GeneralAcc_ReactiveCIF() {
//					return CSM_AccountMenu_GeneralAcc_ReactiveCIF;	
//				}
//				@FindBy(xpath="//span[text()='Suspend']")
//				private WebElement CSM_AccountMenu_GeneralAcc_Suspend;
//				public WebElement CSM_AccountMenu_GeneralAcc_Suspend() {
//					return CSM_AccountMenu_GeneralAcc_Suspend;	
//				}
//				@FindBy(xpath="//input[@id='generalAccountsGridTbl_Id_A002ZP_gs_amfVO.CIF_SUB_NO']")
//				private WebElement CSM_AccountMenu_GeneralAcc_SuspendCIF;
//				public WebElement CSM_AccountMenu_GeneralAcc_SuspendCIF() {
//					return CSM_AccountMenu_GeneralAcc_SuspendCIF;	
//				}
//				
//				@FindBy(id="_popup_path_sol_ok")
//				private WebElement CSM_OkButtonUnderInformationPopUp;
//				public WebElement CSMOkButtonUnderInformationPopUp() 
//				{
//					return CSM_OkButtonUnderInformationPopUp;
//				}
//				@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
//				private WebElement CSM_ClearCacheInTechnicalDetailsIcon;
//				public WebElement CSM_ClearCacheInTechnicalDetailsIcon() 
//				{
//					return CSM_ClearCacheInTechnicalDetailsIcon;
//				}
//				@FindBy(id="tech_details_icon")
//				private WebElement CSM_TechnicalDetailsIcon;
//				public WebElement CSMTechnicalDetailsIcon() 
//				{
//					return CSM_TechnicalDetailsIcon;
//				}

	//

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement menuOptionParameter_611;

	public WebElement menuOption_Parameter_611() {
		return menuOptionParameter;
	}

	@FindBy(xpath = "//td[text()='Account Restrictions']")
	private WebElement accountRestrictions_611;

	public WebElement accountRestrictions_611() {
		return accountRestrictions;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement accountRestrictionsMaintenance_611;

	public WebElement accountRestrictions_Maintenance_611() {
		return accountRestrictionsMaintenance;
	}

	@FindBy(id = "code_UR00M")
	private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance1;

	public WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance_611() {
		return CSMSADS_EnterTheValueInCodeUnderMaintenance;
	}

	@FindBy(xpath = "//input[@id='description_UR00M']")
	private WebElement description_611;

	public WebElement description_611() {
		return description;
	}

	@FindBy(xpath = "//select[@id='and_or_UR00M']")
	private WebElement And_Or_611;

	public WebElement And_Or_611() {
		return And_Or;
	}

	@FindBy(xpath = "//tbody/tr[@id='ROOT__ROOT']/td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']/div[1]/div[1]")
	private WebElement applicationOTPsRoot_611;

	public WebElement applicationOTPs_Root_611() {
		return applicationOTPsRoot;
	}

	@FindBy(xpath = "//tbody/tr[@id='RET__RET']/td/div[1]/div[1]")
	private WebElement RETFlag_611;

	public WebElement RET_Flag_611() {
		return RETFlag;
	}

	@FindBy(xpath = " //span[text()='Transactions']//ancestor::td[1]/div/div")
	private WebElement TransactionFlag_611;

	public WebElement Transaction_Flag_611() {
		return TransactionFlag;
	}

	@FindBy(xpath = "//span[text()='Transactions']//parent::td/preceding-sibling::td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_hasRestrictionYN']/input")
	private WebElement transactionCheckbox_611;

	public WebElement transactiopn_Checkbox_611() {
		return transactionCheckbox;
	}

	@FindBy(xpath = "//tbody/tr[@id='ROOT__ROOT__branchGrid']/td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']/div[1]/div[1]")
	private WebElement companiesBranchesRootFlag_611;

	public WebElement companiesBranches_RootFlag_611() {
		return companiesBranchesRootFlag;
	}

	@FindBy(xpath = "//span[text()='1 - BAJJ']//parent::td//preceding-sibling::td[2]/input")
	private WebElement branch1CheckBox_611;

	public WebElement branch1_CheckBox_611() {
		return branch1CheckBox;
	}

	@FindBy(xpath = "//input[@id='userGridId_UR00M_gs_usrVO.USER_ID']")
	private WebElement userIDSearchField_611;

	public WebElement userID_SearchField_611() {
		return userIDSearchField;
	}

	@FindBy(name = "jqg_userGridId_UR00M_1")
	private WebElement CSMSADS_UserIDCheckbox_611;

	public WebElement CSMSADSUserIDCheckbox_611() {
		return CSMSADS_UserIDCheckbox;
	}

	@FindBy(id = "add_restrictionsGridTbl_Id_UR00M")
	private WebElement csm_Sads_AccountRestriction_Maintenance_AddButton_611;

	public WebElement csm_Sads_AccountRestriction_Maintenance_AddButton_611() {
		return csm_Sads_AccountRestriction_Maintenance_AddButton;
	}

	@FindBy(xpath = "//td[@id='td_restrictionsGridTbl_Id_UR00M_1_restrictionType']//child::select")
	private WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption_611;

	public WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption_611() {
		return csm_Sads_AccountRestriction_Maintenance_SelectOption;
	}

	@FindBy(id = "cifRangeRestLevel_UR00M")
	private WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel_611;

	public WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel_611() {
		return csm_Sads_AccountRestriction_Maintenance_RestrictionLevel;
	}

	@FindBy(id = "add_cifGridId_UR00M")
	private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon_611;

	public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon_611() {
		return csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon;
	}

	@FindBy(xpath = "(//span[@role='button'])[1]")
	private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon_611;

	public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon_611() {
		return csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon;
	}

	@FindBy(xpath = "//input[@name='CIF_NO']")
	private WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox_611;

	public WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox_611() {
		return csm_Sads_AccountRestriction_Maintenance_CifInputBox;
	}

	@FindBy(xpath = "(//td[@tdlabel='CIF No'])[2]")
	private WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif_611;

	public WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif_611() {
		return csm_Sads_AccountRestriction_Maintenance_DoubleClickCif;
	}

	@FindBy(xpath = "//label[text()='Save ']")
	private WebElement saveButton_611;

	public WebElement save_Button_611() {
		return saveButton_611;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMSADS_ClickOkButtonInSuccessPopUpMenu1;

	public WebElement CSMSADSClickOkButtonInSuccessPopUpMenu_611() {
		return CSMSADS_ClickOkButtonInSuccessPopUpMenu;
	}

	@FindBy(id = "UR00P")
	private WebElement CSMSADS_ApproveUnderAccountRestrictions1;

	public WebElement CSMSADSApproveUnderAccountRestrictions_611() {
		return CSMSADS_ApproveUnderAccountRestrictions;
	}

	@FindBy(id = "ctsRestrictionsListGridTbl_Id_UR00P_gs_code")
	private WebElement CSMSADS_EnterCodeInApproveScreen1;

	public WebElement CSMSADSEnterCodeInApproveScreen_611() {
		return CSMSADS_EnterCodeInApproveScreen;
	}

	@FindBy(id = "td_ctsRestrictionsListGridTbl_Id_UR00P_1_code")
	private WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen1;

	public WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen_611() {
		return CSMSADS_ClickTheSelectedCodeInApproveScreen;
	}

	@FindBy(id = "ctsRestrictionsMaint_approve_UR00P")
	private WebElement CSMSADS_ApproveButtonInApproveScreen1;

	public WebElement CSMSADSApproveButtonInApproveScreen_611() {
		return CSMSADS_ApproveButtonInApproveScreen;
	}

	@FindBy(xpath = "//span[text()='1 - BAJJ']//ancestor::td[1]/div/div")
	private WebElement branch1Flag_611;

	public WebElement branch1_Flag_611() {
		return branch1Flag;
	}

	// checkrequest suspend screen

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement Checkbookrequestmenu;

	public WebElement Checkbookrequestmenu_611() {
		return Checkbookrequestmenu;
	}

	@FindBy(xpath = "//span[text()='Suspend']")
	private WebElement Checkbookrequestmenu_Suspend;

	public WebElement Checkbookrequestmenu_Suspend_611() {
		return Checkbookrequestmenu_Suspend;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000SP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement Checkbookrequestmenu_Cifnumsearchbox;

	public WebElement Checkbookrequestmenu_Suspend_Cifnumsearchbox_611() {
		return Checkbookrequestmenu_Cifnumsearchbox;
	}

	// checkbookrequest (to be submit) screen

	@FindBy(xpath = "//span[text()='Apply to Submit']")
	private WebElement Checkbookrequestmenu_TobeSubmitscreen;

	public WebElement Checkbookrequestmenu_TobeSubmitscreen_611() {
		return Checkbookrequestmenu_TobeSubmitscreen;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.ACC_CIF']")
	private WebElement Checkbookrequestmenu_TobeSubmitscreen_Cifnumsearchbox;

	public WebElement Checkbookrequestmenu_TobeSubmitscreen_Cifnumsearchbox_611() {
		return Checkbookrequestmenu_TobeSubmitscreen_Cifnumsearchbox;
	}

	// checkbookrequest (Approve) screen

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Checkbookrequestmenu_Approvescreeen;

	public WebElement Checkbookrequestmenu_Approvescreeen_611() {
		return Checkbookrequestmenu_Approvescreeen;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement Checkbookrequestmenu_Approvescreen_cifnumsearchbox;

	public WebElement Checkbookrequestmenu_Approvescreen_cifnumsearchbox_611() {
		return Checkbookrequestmenu_Approvescreen_cifnumsearchbox;
	}

	// checkbookrequest (Batch Approval) screen

	@FindBy(xpath = "//span[text()='Batch Approval']")
	private WebElement Checkbookrequestmenu_BatchApprovalscreen;

	public WebElement Checkbookrequestmenu_BatchApprovalscreen_611() {
		return Checkbookrequestmenu_BatchApprovalscreen;
	}

	@FindBy(xpath = "//input[@id='chqBkImpExpGridTbl_Id_Q000BP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement Checkbookrequestmenu_BatchApprovalscreen_cifnumsearchbox;

	public WebElement Checkbookrequestmenu_BatchApprovalscreen_cifnumsearchbox_611() {
		return Checkbookrequestmenu_BatchApprovalscreen_cifnumsearchbox;
	}

	// checkbookrequest (In Branch) screen

	@FindBy(xpath = "//span[text()='In Branch']")
	private WebElement Checkbookrequestmenu_Inbranchscreen;

	public WebElement Checkbookrequestmenu_Inbranchscreen_611() {
		return Checkbookrequestmenu_Inbranchscreen;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000IB_gs_ctschqbookVO.ACC_CIF']")
	private WebElement Checkbookrequestmenu_Inbranchscreen_cifnumsearchbox;

	public WebElement Checkbookrequestmenu_Inbranchscreen_cifnumsearchbox_611() {
		return Checkbookrequestmenu_Inbranchscreen_cifnumsearchbox;
	}

	// checkbookrequest (Maintenance) lookup screen

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Checkbookrequestmenu_Maintenancemenu;

	public WebElement Checkbookrequestmenu_Maintenancemenu_611() {
		return Checkbookrequestmenu_Maintenancemenu;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement Checkbookrequestmenu_Maintenance_Noofcheckbook;

	public WebElement Checkbookrequestmenu_Maintenance_Noofcheckbook_611() {
		return Checkbookrequestmenu_Maintenance_Noofcheckbook;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement Checkbookrequestmenu_Maintenance_Chequebookcode;

	public WebElement Checkbookrequestmenu_Maintenance_Chequebookcode_611() {
		return Checkbookrequestmenu_Maintenance_Chequebookcode;
	}

	@FindBy(xpath = "//span[@id='spanLookup_acc_sl_Q000MT']")
	private WebElement Checkbookrequestmenu_Maintenance_Lookupbtn;

	public WebElement Checkbookrequestmenu_Maintenance_Lookupbtn_611() {
		return Checkbookrequestmenu_Maintenance_Lookupbtn;
	}

	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.CIF_SUB_NO']")
	private WebElement Checkbookrequestmenu_Maintenance_Lookupcifnum;

	public WebElement Checkbookrequestmenu_Maintenance_Lookupcifnum_611() {
		return Checkbookrequestmenu_Maintenance_Lookupcifnum;
	}

	@FindBy(xpath = "//td[text()='Skkowsi']")
	private WebElement Checkbookrequestmenu_Maintenance_Lookupcifnum_doubleclickowsi;

	public WebElement Checkbookrequestmenu_Maintenance_Lookupcifnum_doubleclickowsi_611() {
		return Checkbookrequestmenu_Maintenance_Lookupcifnum_doubleclickowsi;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement Checkbookrequestmenu_Maintenance_Cannotproceed;

	public WebElement Checkbookrequestmenu_Maintenance_Cannotproceed_611() {
		return Checkbookrequestmenu_Maintenance_Cannotproceed;
	}

	// checkbookrequest (Maintenance) manual screen

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement Checkbookrequestmenu_Maintenance_Branchcode;

	public WebElement Checkbookrequestmenu_Maintenance_Branchcode_611() {
		return Checkbookrequestmenu_Maintenance_Branchcode;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement Checkbookrequestmenu_Maintenance_currencycode;

	public WebElement Checkbookrequestmenu_Maintenance_currencycode_611() {
		return Checkbookrequestmenu_Maintenance_currencycode;

	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement Checkbookrequestmenu_Maintenance_GLcode;

	public WebElement Checkbookrequestmenu_Maintenance_GLcode_611() {
		return Checkbookrequestmenu_Maintenance_GLcode;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement Checkbookrequestmenu_Maintenance_Cifcode;

	public WebElement Checkbookrequestmenu_Maintenance_Cifcode_611() {
		return Checkbookrequestmenu_Maintenance_Cifcode;
	}

	@FindBy(id = "lookuptxt_acc_sl_Q000MT")
	private WebElement Checkbookrequestmenu_Maintenance_SerialNumber;

	public WebElement CheckbookrequestmenuMaintenanceSerialNumber() {
		return Checkbookrequestmenu_Maintenance_SerialNumber;
	}
	// checkbookrequest (To be reversed) screen

	@FindBy(xpath = "//span[text()='To Be Reversed Chequebook']")
	private WebElement Checkbookrequestmenu_Tobereversed;

	public WebElement Checkbookrequestmenu_Tobereversed_611() {
		return Checkbookrequestmenu_Tobereversed;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AR_gs_ctschqbookVO.ACC_CIF']")
	private WebElement Checkbookrequestmenu_Tobereversed_Cifnum;

	public WebElement Checkbookrequestmenu_Tobereversed_Cifnum_611() {
		return Checkbookrequestmenu_Tobereversed_Cifnum;
	}
	// checkbookrequest (Accounts_Account Query) screen

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement Csm_AccountMenu;

	public WebElement Csm_AccountMenu_611() {
		return Csm_AccountMenu;
	}

	@FindBy(xpath = "//span[text()='Account Query']")
	private WebElement Csm_AccountMenu_Accountsquery;

	public WebElement Csm_AccountMenu_Accountsquery_611() {
		return Csm_AccountMenu_Accountsquery;
	}

	@FindBy(xpath = "//input[@id='accountQueryGrid_Id_A003_gs_CIF_SUB_NO']")
	private WebElement Csm_AccountMenu_Accountsquery_Cifnum;

	public WebElement Csm_AccountMenu_Accountsquery_Cifnum_611() {
		return Csm_AccountMenu_Accountsquery_Cifnum;
	}
	// checkbookrequest (Accounts_General Account) screen

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement Csm_AccountMenu_Generalaccount;

	public WebElement Csm_AccountMenu_Generalaccount_611() {
		return Csm_AccountMenu_Generalaccount;
	}

	@FindBy(xpath = "//span[text()='Approve Suspend']")
	private WebElement Csm_AccountMenu_Generalaccount_Approvesuspend;

	public WebElement Csm_AccountMenu_Generalaccount_Approvesuspend_611() {
		return Csm_AccountMenu_Generalaccount_Approvesuspend;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002SP_gs_amfVO.CIF_SUB_NO']")
	private WebElement Csm_AccountMenu_Generalaccount_Approvesuspend_Cifnum;

	public WebElement Csm_AccountMenu_Generalaccount_Approvesuspend_Cifnum_611() {
		return Csm_AccountMenu_Generalaccount_Approvesuspend_Cifnum;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement csm_AccountsMainModule;

	public WebElement csmAccountsMainModule() {
		return csm_AccountsMainModule;
	}

	@FindBy(xpath = "//td[text()='Fixed Maturity Accounts']")
	private WebElement accounts_FixedMaturiyAccounts;

	public WebElement accountsFixedMaturityAccounts() {
		return accounts_FixedMaturiyAccounts;
	}

	@FindBy(xpath = "//span[text()='Opening']")
	private WebElement fixedMaturiyAccounts_Opening;

	public WebElement fixedMaturiyAccountsOpening() {
		return fixedMaturiyAccounts_Opening;
	}

	@FindBy(xpath = "//td[text()='General Accounts']//ancestor::a")
	private WebElement accounts_GeneralAccounts;

	public WebElement accountsGeneralAccounts() {
		return accounts_GeneralAccounts;
	}

	@FindBy(xpath = "//td[text()='General Accounts']//ancestor::li//span[text()='Opening']")
	private WebElement generalAccounts_Opening;

	public WebElement generalAccountsOpening() {
		return generalAccounts_Opening;
	}

	@FindBy(xpath = "//a[@id='A003']//span[text()='Account Query']")
	private WebElement accounts_AccountQuery;

	public WebElement accountsAccountQuery() {
		return accounts_AccountQuery;
	}

	@FindBy(xpath = "//td[text()='Closed Dormant Accounts']")
	private WebElement accounts_ClosedDormantAccounts;

	public WebElement accountsClosedDormantAccounts() {
		return accounts_ClosedDormantAccounts;
	}

	@FindBy(xpath = "//td[text()='Closed Dormant Accounts']//ancestor::li//span[text()='Maintenance']")
	private WebElement closedDormantAccounts_Maintenance;

	public WebElement closedDormantAccountsMaintenance() {
		return closedDormantAccounts_Maintenance;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CIF_A002CDAMT']")
	private WebElement closedDormantAccount_InputCIFCode;

	public WebElement closedDormantAccountInputCIFCode() {
		return closedDormantAccount_InputCIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A001MT']")
	private WebElement fom_CurrencyCode;

	public WebElement fomCurrencyCode() {
		return fom_CurrencyCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_glType_A001MT']")
	private WebElement fom_GlCode;

	public WebElement fomGLCode() {
		return fom_GlCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifNo_A001MT']")
	private WebElement fom_CIFNo;

	public WebElement fomCIFNo() {
		return fom_CIFNo;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A002MT']")
	private WebElement generalAccounts_CurrencyCode;

	public WebElement generalAccountsCurrencyCode() {
		return generalAccounts_CurrencyCode;
	}

	@FindBy(xpath = "//input[@name='accountsManagementCO.currencyDesc']")
	private WebElement generalAccounts_CurrencyDescription;

	public WebElement generalAcccountsCurrencyDescription() {
		return generalAccounts_CurrencyDescription;
	}

	@FindBy(xpath = "//input[@name='accountsManagementCO.glDesc']")
	private WebElement generalAccounts_glDescription;

	public WebElement generalAccountsGlDescription() {
		return generalAccounts_glDescription;
	}

	@FindBy(xpath = "//input[@name='accountsManagementCO.cifName']")
	private WebElement generalAccounts_CIFName;

	public WebElement generalAccountsCIFName() {
		return generalAccounts_CIFName;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement accounts_MemoClose;

	public WebElement accountsMemoClose() {
		return accounts_MemoClose;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_glType_A002MT']")
	private WebElement generalAccounts_GLType;

	public WebElement generalAccountsGLType() {
		return generalAccounts_GLType;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifNo_A002MT']")
	private WebElement generalAccounts_CIFNo;

	public WebElement generalAccountsCIFNo() {
		return generalAccounts_CIFNo;
	}

	@FindBy(xpath = "//input[@name='accountsManagementCO.cifName']")
	private WebElement generalAccounts_CIFNameDescription;

	public WebElement generalAccountsCIFNameDescription() {
		return generalAccounts_CIFNameDescription;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CIF_A002CDAMT']")
	private WebElement ClosedDormantAccount_CIFNo;

	public WebElement ClosedDormantAccountCIFNo() {
		return ClosedDormantAccount_CIFNo;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A001MT']")
	private WebElement fma_CurrecyCode;

	public WebElement fmaCurrecyCode() {
		return fma_CurrecyCode;
	}

	@FindBy(xpath = "//input[@name='accountsManagementCO.currencyDesc']")
	private WebElement fma_CurrecyCodeDescription;

	public WebElement fmaCurrecyCodeDescription() {
		return fma_CurrecyCodeDescription;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_glType_A001MT']")
	private WebElement fma_GlType;

	public WebElement fmaGlType() {
		return fma_GlType;
	}

	@FindBy(xpath = "//input[@name='accountsManagementCO.glDesc']")
	private WebElement fma_GlTypeDescription;

	public WebElement fmaGlTypeDescription() {
		return fma_GlTypeDescription;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifNo_A001MT']")
	private WebElement fma_CIFNo;

	public WebElement fmaCIFNo() {
		return fma_CIFNo;
	}

	@FindBy(xpath = "//input[@name='accountsManagementCO.cifName']")
	private WebElement fma_CIFNoDescription;

	public WebElement fmaCIFNoDescription() {
		return fma_CIFNoDescription;
	}

	@FindBy(xpath = "//input[@name='BRANCH_CODE']")
	private WebElement accountQuery_SearchBranchCode;

	public WebElement accountQuerySearchBranchCode() {
		return accountQuery_SearchBranchCode;
	}

	@FindBy(xpath = "//input[@name='CURRENCY_CODE']")
	private WebElement accountQuery_SearchCurrencyCode;

	public WebElement accountQuerySearchCurrencyCode() {
		return accountQuery_SearchCurrencyCode;
	}

	@FindBy(xpath = "//input[@name='GL_CODE']")
	private WebElement accountQuery_SearchGLCode;

	public WebElement accountQuerySearchGLCode() {
		return accountQuery_SearchGLCode;
	}

	@FindBy(xpath = "//input[@name='CIF_SUB_NO']")
	private WebElement accountQuery_SearchCIFCode;

	public WebElement accountQuerySearchCIFCode() {
		return accountQuery_SearchCIFCode;
	}

	@FindBy(xpath = "//input[@name='SL_NO']")
	private WebElement accountQuery_SearchSerialNumber;

	public WebElement accountQuerySearchSerialNumber() {
		return accountQuery_SearchSerialNumber;
	}

	@FindBy(xpath = "//input[@name='STATUS']")
	private WebElement accountQuery_SearchStatus;

	public WebElement accountQuerySearchStatus() {
		return accountQuery_SearchStatus;
	}

	@FindBy(xpath = "//td[@tdlabel='S/L No']")
	private WebElement accountQuery_GetSerialNumber;

	public WebElement accountQueryGetSerialNumber() {
		return accountQuery_GetSerialNumber;
	}

	@FindBy(xpath = "//a[contains(text(),'Accounts / Account Query')]//parent::td//following-sibling::td//span")
	private WebElement accountQuery_AccountQueryTabClose;

	public WebElement accountQueryAccountQueryTabClose() {
		return accountQuery_AccountQueryTabClose;
	}
	// Sads_At_071

//				@FindBy(xpath = "//td[text()='PassBooks']")
//				private WebElement CSMCore_Passbook;
	//
//				public WebElement CSMCore_Passbook() {
//					return CSMCore_Passbook;
//				}
	@FindBy(xpath = "//td[text()='PassBooks']//following::span[text()='Maintenance']")
	private WebElement CSMCore_Passbook_Maintenece;

	public WebElement CSMCore_Passbook_Maintenece() {
		return CSMCore_Passbook_Maintenece;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.PASSBK_TYPE']")
	private WebElement CSMCore_Passbook_Maintenece_PassbookType;

	public WebElement CSMCore_Passbook_Maintenece_PassbookType() {
		return CSMCore_Passbook_Maintenece_PassbookType;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_CY']")
	private WebElement CSMCore_Passbook_Maintenece_AccCurrency;

	public WebElement CSMCore_Passbook_Maintenece_AccCurrency() {
		return CSMCore_Passbook_Maintenece_AccCurrency;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_GL']")
	private WebElement CSMCore_Passbook_Maintenece_AccGl;

	public WebElement CSMCore_Passbook_Maintenece_AccGl() {
		return CSMCore_Passbook_Maintenece_AccGl;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_CIF']")
	private WebElement CSMCore_Passbook_Maintenece_AccCIF;

	public WebElement CSMCore_Passbook_Maintenece_AccCIF() {
		return CSMCore_Passbook_Maintenece_AccCIF;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_SL']")
	private WebElement CSMCore_Passbook_Maintenece_AccSl;

	public WebElement CSMCore_Passbook_Maintenece_AccSl() {
		return CSMCore_Passbook_Maintenece_AccSl;
	}
//				@FindBy(xpath="(//td[@id='td_cifTypeGridId_UR00M_1_CIF_TYPE']//following::span//span)[1]")
//				private WebElement ciftype_search;
//				public WebElement ciftype_search() {
//					  return ciftype_search;
//				}

	@FindBy(xpath = "//td[@id='add_cifTypeGridId_UR00M']")
	private WebElement ciftype_Addbtn;

	public WebElement ciftype_Addbtn() {
		return ciftype_Addbtn;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement menuOptionParameter_626;

	public WebElement menuOption_Parameter_626() {
		return menuOptionParameter;
	}

	@FindBy(xpath = "//td[text()='Account Restrictions']")
	private WebElement accountRestrictions_626;

	public WebElement accountRestrictions_626() {
		return accountRestrictions;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement accountRestrictionsMaintenance_626;

	public WebElement accountRestrictions_Maintenance_626() {
		return accountRestrictionsMaintenance;
	}

	@FindBy(xpath = "//input[@id='description_UR00M']")
	private WebElement description_626;

	public WebElement description_626() {
		return description;
	}

	@FindBy(xpath = "//select[@id='and_or_UR00M']")
	private WebElement And_Or_626;

	public WebElement And_Or_626() {
		return And_Or;
	}

	@FindBy(xpath = "//tbody/tr[@id='ROOT__ROOT']/td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']/div[1]/div[1]")
	private WebElement applicationOTPsRoot_626;

	public WebElement applicationOTPs_Root_626() {
		return applicationOTPsRoot;
	}

	@FindBy(xpath = "//tbody/tr[@id='RET__RET']/td/div[1]/div[1]")
	private WebElement RETFlag_626;

	public WebElement RET_Flag_626() {
		return RETFlag;
	}

	@FindBy(xpath = " //span[text()='Transactions']//ancestor::td[1]/div/div")
	private WebElement TransactionFlag_626;

	public WebElement Transaction_Flag_626() {
		return TransactionFlag;
	}

	@FindBy(xpath = "//span[text()='Transactions']//parent::td/preceding-sibling::td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_hasRestrictionYN']/input")
	private WebElement transactionCheckbox_626;

	public WebElement transactiopn_Checkbox_626() {
		return transactionCheckbox;
	}

	@FindBy(xpath = "//tbody/tr[@id='ROOT__ROOT__branchGrid']/td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']/div[1]/div[1]")
	private WebElement companiesBranchesRootFlag_626;

	public WebElement companiesBranches_RootFlag_626() {
		return companiesBranchesRootFlag;
	}

	@FindBy(xpath = "//span[text()='1 - BAJJ']//ancestor::td[1]/div/div")
	private WebElement branch1Flag_626;

	public WebElement branch1_Flag_626() {
		return branch1Flag;
	}

	@FindBy(xpath = "//span[text()='1 - BAJJ']//parent::td//preceding-sibling::td[2]/input")
	private WebElement branch1CheckBox_626;

	public WebElement branch1_CheckBox_626() {
		return branch1CheckBox;
	}

	@FindBy(xpath = "//input[@id='userGridId_UR00M_gs_usrVO.USER_ID']")
	private WebElement userIDSearchField_626;

	public WebElement userID_SearchField_626() {
		return userIDSearchField;
	}

	@FindBy(name = "jqg_userGridId_UR00M_1")
	private WebElement CSMSADS_UserIDCheckbox_626;

	public WebElement CSMSADSUserIDCheckbox_626() {
		return CSMSADS_UserIDCheckbox;
	}

	@FindBy(xpath = "//td[@id='restrictionsGridTbl_Id_UR00T_pager_left']//table//td/div/span[@class='ui-icon ui-icon-plus']")
	private WebElement restrictionTypeGLAddbutton;

	public WebElement restrictionType_GL_Addbutton() {
		return restrictionTypeGLAddbutton;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement ChequebookRequest;

	public WebElement ChequebookRequest() {
		return ChequebookRequest;
	}

	@FindBy(xpath = "//td[text()='Send To/Receive From Provider']")
	private WebElement Sendto;

	public WebElement Sendto() {
		return Sendto;
	}

	@FindBy(xpath = "//span[text()='Send To Provider']")
	private WebElement SendToProvider;

	public WebElement SendToProvider() {
		return SendToProvider;
	}

	@FindBy(xpath = "//input[@id='chqBkImpExpGridTbl_Id_Q000TP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement CIFSearch;

	public WebElement CIFSearch() {
		return CIFSearch;
	}

	@FindBy(xpath = "//span[text()='To Cancel']")
	private WebElement ToBeCancel;

	public WebElement ToBeCancel() {
		return ToBeCancel;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.ACC_CIF']")
	private WebElement ToCancelSearch;

	public WebElement ToCancelSearch() {
		return ToCancelSearch;
	}

	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement ToBeDestroyed;

	public WebElement ToBeDestroyed() {
		return ToBeDestroyed;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.ACC_CIF']")
	private WebElement ToDesSearch;

	public WebElement ToDesSearch() {
		return ToDesSearch;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement EndPath;

	public WebElement EndPath() {
		return EndPath;
	}

	@FindBy(xpath = "//input[@id='fomGridTbl_Id_F00I1MT_gs_cifVO.CIF_NO']")
	private WebElement FOM_Cif_Search;

	public WebElement FOM_Cif_Search() {
		return FOM_Cif_Search;
	}

	@FindBy(xpath = "//td[@title='993848']")
	private WebElement Double_Click_CIF_Get;

	public WebElement Double_Click_CIF_Get() {
		return Double_Click_CIF_Get;
	}

	@FindBy(xpath = "//button[@id='fom_CIF_Related_Acc_btn_F00I1MT']")
	private WebElement Get_CIF_Related_Accounts;

	public WebElement Get_CIF_Related_Accounts() {
		return Get_CIF_Related_Accounts;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Get_POPUP_OK;

	public WebElement Get_POPUP_OK() {
		return Get_POPUP_OK;
	}

	@FindBy(xpath = "//button[@id='fom_Other_Financial_Engage_btn_F00I1MT']")
	private WebElement Other_Financial_Engagements;

	public WebElement Other_Financial_Engagements() {
		return Other_Financial_Engagements;
	}

	@FindBy(xpath = "//label[@id='fomMaintForm_F00I1MT_Trx_Type_Charges_key']")
	private WebElement Trx_Type_Charges;

	public WebElement Trx_Type_Charges() {
		return Trx_Type_Charges;
	}

	@FindBy(xpath = " //td[text()='Accounts']")
	private WebElement Accounts;

	public WebElement Accounts() {
		return Accounts;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement General_Accounts;

	public WebElement General_Accounts() {
		return General_Accounts;
	}

	@FindBy(xpath = "//span[text()='Approve Reject']")
	private WebElement Approve_Reject;

	public WebElement Approve_Reject() {
		return Approve_Reject;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002RJ_gs_amfVO.CIF_SUB_NO']")
	private WebElement Approve_Reject_CIF_Search;

	public WebElement Approve_Reject_CIF_Search() {
		return Approve_Reject_CIF_Search;
	}

	@FindBy(xpath = "//span[text()='Authorize']")
	private WebElement Authorize;

	public WebElement Authorize() {
		return Authorize;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AU_gs_amfVO.CIF_SUB_NO']")
	private WebElement Authorize_CIF_Search;

	public WebElement Authorize_CIF_Search() {
		return Authorize_CIF_Search;
	}

	@FindBy(xpath = "//span[text()='Approve Reactivate']")
	private WebElement Approve_ReActivate;

	public WebElement Approve_ReActivate() {
		return Approve_ReActivate;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002RE_gs_amfVO.CIF_SUB_NO']")
	private WebElement Approve_ReActivate_CIFSearch;

	public WebElement Approve_ReActivate_CIFSearch() {
		return Approve_ReActivate_CIFSearch;
	}

	@FindBy(xpath = "//td[text()='Front Office Management']")
	private WebElement Front_office_Management;

	public WebElement Front_office_Management() {
		return Front_office_Management;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement FOM_Maintenance;

	public WebElement FOM_Maintenance() {
		return FOM_Maintenance;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_F00I1MT']")
	private WebElement FOM_Search;

	public WebElement FOM_Search() {
		return FOM_Search;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice;

	public WebElement ClosePopupmsg_frontoffice() {
		return ClosePopupmsg_frontoffice;
	}
	//

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement menuOptionParameter;

	public WebElement menuOption_Parameter() {
		return menuOptionParameter;
	}

	@FindBy(xpath = "//td[text()='Account Restrictions']")
	private WebElement accountRestrictions;

	public WebElement accountRestrictions() {
		return accountRestrictions;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement accountRestrictionsMaintenance;

	public WebElement accountRestrictions_Maintenance() {
		return accountRestrictionsMaintenance;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement accountRestrictionsApprove;

	public WebElement accountRestrictions_Approve() {
		return accountRestrictionsApprove;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement accountRestrictionsUpdateAfterApprove;

	public WebElement accountRestrictions_UpdateAfterApprove() {
		return accountRestrictionsUpdateAfterApprove;
	}

	@FindBy(xpath = "//span[text()='List of Restriction']")
	private WebElement accountRestrictionsListOfRestriction;

	public WebElement accountRestrictions_ListOfRestriction() {
		return accountRestrictionsListOfRestriction;
	}

	@FindBy(xpath = "//input[@id='code_UR00M']")
	private WebElement code;

	public WebElement code() {
		return code;
	}

	@FindBy(xpath = "//input[@id='description_UR00M']")
	private WebElement description;

	public WebElement description() {
		return description;
	}

	@FindBy(xpath = "//select[@id='and_or_UR00M']")
	private WebElement And_Or;

	public WebElement And_Or() {
		return And_Or;
	}

	@FindBy(xpath = "//tbody/tr[@id='ROOT__ROOT']/td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']/div[1]/div[1]")
	private WebElement applicationOTPsRoot;

	public WebElement applicationOTPs_Root() {
		return applicationOTPsRoot;
	}

	@FindBy(xpath = "//tr[@id='RET__RET']//input")
	private WebElement RETFlag;

	public WebElement RET_Flag() {
		return RETFlag;
	}

	@FindBy(xpath = "//tr[@id='RET__RET']//td[@aria-describedby='ctsRestOptTreeGridTbl_Id_UR00M_progDesc']")
	private WebElement ret_Flag_Header;

	public WebElement retFlagHeader() {
		return ret_Flag_Header;
	}

	@FindBy(xpath = "//tr[@id='RETP__RETP']//td[@aria-describedby='ctsRestOptTreeGridTbl_Id_UR00M_progDesc']")
	private WebElement retp_Flag_Header;

	public WebElement retpFlagHeader() {
		return retp_Flag_Header;
	}

	@FindBy(xpath = "//tr[@id='RETP__RETP']//input")
	private WebElement RETP_lag;

	public WebElement RETP_Flag() {
		return RETP_lag;
	}

	@FindBy(xpath = " //span[text()='Transactions']//ancestor::td[1]/div/div")
	private WebElement TransactionFlag;

	public WebElement Transaction_Flag() {
		return TransactionFlag;
	}

	@FindBy(xpath = "//span[text()='Transactions']//parent::td/preceding-sibling::td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_hasRestrictionYN']/input")
	private WebElement transactionCheckbox;

	public WebElement transactiopn_Checkbox() {
		return transactionCheckbox;
	}

	@FindBy(xpath = "//tbody/tr[@id='ROOT__ROOT__branchGrid']/td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']/div[1]/div[1]")
	private WebElement companiesBranchesRootFlag;

	public WebElement companiesBranches_RootFlag() {
		return companiesBranchesRootFlag;
	}

	@FindBy(xpath = "//span[text()='1 - BAJJ']//ancestor::td[1]/div/div")
	private WebElement branch1Flag;

	public WebElement branch1_Flag() {
		return branch1Flag;
	}

	@FindBy(xpath = "//span[text()='1 - BAJJ']//parent::td//preceding-sibling::td[2]/input")
	private WebElement branch1CheckBox;

	public WebElement branch1_CheckBox() {
		return branch1CheckBox;
	}

	@FindBy(xpath = "//input[@id='userGridId_UR00M_gs_usrVO.USER_ID']")
	private WebElement userIDSearchField;

	public WebElement userID_SearchField() {
		return userIDSearchField;
	}

	@FindBy(name = "jqg_userGridId_UR00M_1")
	private WebElement CSMSADS_UserIDCheckbox;

	public WebElement CSMSADSUserIDCheckbox() {
		return CSMSADS_UserIDCheckbox;
	}

	@FindBy(xpath = "//input[@id='jqg_userGridId_UR00M_1']")
	private WebElement userIDFirstCheckBox;

	public WebElement userID_FirstCheckBox() {
		return userIDFirstCheckBox;
	}

	@FindBy(xpath = "//td[text()='KARTHIK']/preceding-sibling::td[@id='td_userGridId_UR00T_0_cb']//input")
	private WebElement sads_UserId_CheckBox;

	public WebElement sads_UserId_CheckBox() {
		return sads_UserId_CheckBox;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TC_1_ctschqbookVO.CODE")
	private WebElement csm_ChequebookRequest_ToCancel_Validation_615;

	public WebElement csm_ChequebookRequest_ToCancel_Validation_615() {
		return csm_ChequebookRequest_ToCancel_Validation_615;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.ACC_CIF")
	private WebElement csm_ChequebookRequest_SubmitScreen_CifInput_615;

	public WebElement csm_ChequebookRequest_SubmitScreen_CifInput_615() {
		return csm_ChequebookRequest_SubmitScreen_CifInput_615;
	}

	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement csm_ChequebookRequest_SubmitScreen_615;

	public WebElement csm_ChequebookRequest_SubmitScreen_615() {
		return csm_ChequebookRequest_SubmitScreen_615;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000RV_gs_ctschqbookVO.ACC_CIF")
	private WebElement csm_ChequebookRequest_ReverseChequebookTab_CifInput_615;

	public WebElement csm_ChequebookRequest_ReverseChequebookTab_CifInput_615() {
		return csm_ChequebookRequest_ReverseChequebookTab_CifInput_615;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000RE_gs_ctschqbookVO.ACC_CIF")
	private WebElement csm_ChequebookRequest_ReactivateTab_CifInput_615;

	public WebElement csm_ChequebookRequest_ReactivateTab_CifInput_615() {
		return csm_ChequebookRequest_ReactivateTab_CifInput_615;
	}

	@FindBy(xpath = "//span[text()='Reactivate']")
	private WebElement csm_ChequebookRequest_ReactivateTab_615;

	public WebElement csm_ChequebookRequest_ReactivateTab_615() {
		return csm_ChequebookRequest_ReactivateTab_615;
	}

	@FindBy(id = "gridtab_status_sl_Q000QR_gs_amfVO.CIF_SUB_NO")
	private WebElement csm_ChequebookRequest_ChequebookQueryTab_CifInput_615;

	public WebElement csm_ChequebookRequest_ChequebookQueryTab_CifInput_615() {
		return csm_ChequebookRequest_ChequebookQueryTab_CifInput_615;
	}

	@FindBy(id = "spanLookup_status_sl_Q000QR")
	private WebElement csm_ChequebookRequest_ChequebookQueryTab_SearchIcon_615;

	public WebElement csm_ChequebookRequest_ChequebookQueryTab_SearchIcon_615() {
		return csm_ChequebookRequest_ChequebookQueryTab_SearchIcon_615;
	}

	@FindBy(xpath = "//span[text()='Chequebook Query']")
	private WebElement csm_ChequebookRequest_ChequebookQueryTab_615;

	public WebElement csm_ChequebookRequest_ChequebookQueryTab_615() {
		return csm_ChequebookRequest_ChequebookQueryTab_615;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000PT_1_ctschqbookVO.CODE")
	private WebElement csm_ChequebookRequest_PrintScreen_Validation_615;

	public WebElement csm_ChequebookRequest_PrintScreen_Validation_615() {
		return csm_ChequebookRequest_PrintScreen_Validation_615;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000PT_gs_ctschqbookVO.ACC_CIF")
	private WebElement csm_ChequebookRequest_PrintScreen_Cif_InputField_615;

	public WebElement csm_ChequebookRequest_PrintScreen_Cif_InputField_615() {
		return csm_ChequebookRequest_PrintScreen_Cif_InputField_615;
	}

	@FindBy(xpath = "//span[text()='Print']")
	private WebElement csm_ChequebookRequest_PrintScreen_615;

	public WebElement csm_ChequebookRequest_PrintScreen_615() {
		return csm_ChequebookRequest_PrintScreen_615;
	}

	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TD_1_ctschqbookVO.CODE")
	private WebElement csm_ChequebookReuest_ToBeDestroyed_Validation_615;

	public WebElement csm_ChequebookReuest_ToBeDestroyed_Validation_615() {
		return csm_ChequebookReuest_ToBeDestroyed_Validation_615;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.ACC_CIF")
	private WebElement csm_ChequebookRequest_ToBeDestroyed_Cif_InputField_615;

	public WebElement csm_ChequebookRequest_ToBeDestroyed_Cif_InputField_615() {
		return csm_ChequebookRequest_ToBeDestroyed_Cif_InputField_615;
	}

	@FindBy(name = "ACC_CIF")
	private WebElement csm_ChequebookRequest_ToCancel_Cif_InputField_615;

	public WebElement csm_ChequebookRequest_ToCancel_Cif_InputField_615() {
		return csm_ChequebookRequest_ToCancel_Cif_InputField_615;
	}

	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement csm_ChequebookRequest_ToBeDestroyed_615;

	public WebElement csm_ChequebookRequest_ToBeDestroyed_615() {
		return csm_ChequebookRequest_ToBeDestroyed_615;
	}

	@FindBy(id = "code_UR00M")
	private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance_615;

	public WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance_615() {
		return CSMSADS_EnterTheValueInCodeUnderMaintenance_615;
	}

	@FindBy(xpath = "//span[text()='To Cancel']")
	private WebElement csm_ChequebookRequest_ToCancel_615;

	public WebElement csm_ChequebookRequest_ToCancel_615() {
		return csm_ChequebookRequest_ToCancel_615;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMSADS_ClickOkButtonInSuccessPopUpMenu;

	public WebElement CSMSADSClickOkButtonInSuccessPopUpMenu() {
		return CSMSADS_ClickOkButtonInSuccessPopUpMenu;
	}

	@FindBy(id = "ctsRestrictionsListGridTbl_Id_UR00P_gs_code")
	private WebElement CSMSADS_EnterCodeInApproveScreen;

	public WebElement CSMSADSEnterCodeInApproveScreen() {
		return CSMSADS_EnterCodeInApproveScreen;
	}

	@FindBy(id = "td_ctsRestrictionsListGridTbl_Id_UR00P_1_code")
	private WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen;

	public WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen() {
		return CSMSADS_ClickTheSelectedCodeInApproveScreen;
	}

	@FindBy(id = "ctsRestrictionsMaint_approve_UR00P")
	private WebElement CSMSADS_ApproveButtonInApproveScreen;

	public WebElement CSMSADSApproveButtonInApproveScreen() {
		return CSMSADS_ApproveButtonInApproveScreen;
	}

	@FindBy(id = "add_restrictionsGridTbl_Id_UR00M")
	private WebElement csm_Sads_AccountRestriction_Maintenance_AddButton_615;

	public WebElement csm_Sads_AccountRestriction_Maintenance_AddButton_615() {
		return csm_Sads_AccountRestriction_Maintenance_AddButton_615;
	}

	@FindBy(xpath = "//td[@id='td_restrictionsGridTbl_Id_UR00M_1_restrictionType']//child::select")
	private WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption_615;

	public WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption_615() {
		return csm_Sads_AccountRestriction_Maintenance_SelectOption_615;
	}

	@FindBy(id = "cifRangeRestLevel_UR00M")
	private WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel_615;

	public WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel_615() {
		return csm_Sads_AccountRestriction_Maintenance_RestrictionLevel_615;
	}

	@FindBy(id = "add_cifGridId_UR00M")
	private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon_615;

	public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon_615() {
		return csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon_615;
	}

	@FindBy(xpath = "(//span[@role='button'])[1]")
	private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon_615;

	public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon_615() {
		return csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon_615;
	}

	@FindBy(xpath = "(//td[@tdlabel='CIF No'])[2]")
	private WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif_615;

	public WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif_615() {
		return csm_Sads_AccountRestriction_Maintenance_DoubleClickCif_615;
	}

	@FindBy(xpath = "//input[@name='CIF_NO']")
	private WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox_615;

	public WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox_615() {
		return csm_Sads_AccountRestriction_Maintenance_CifInputBox_615;
	}

	@FindBy(xpath = "//label[text()='Save ']")
	private WebElement saveButton;

	public WebElement save_Button() {
		return saveButton;
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

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSMOkButtonInAccessDeniedPopUpMenu;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
		return CSMOkButtonInAccessDeniedPopUpMenu;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;

	public WebElement CSMCloseButtonInChangeRunningDate() {
		return CSM_CloseButtonInChangeRunningDate;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement ChequeBookRequest;

	public WebElement ChequeBookRequest() {
		return ChequeBookRequest;
	}

	@FindBy(xpath = "//span[text()='Reverse Chequebook']")
	private WebElement reverseChequeBookScreen;

	public WebElement reverseChequeBookScreen() {
		return reverseChequeBookScreen;
	}

	@FindBy(id = "code_UR00M")
	private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance;

	public WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance() {
		return CSMSADS_EnterTheValueInCodeUnderMaintenance;
	}

	@FindBy(id = "add_restrictionsGridTbl_Id_UR00M")
	private WebElement csm_Sads_AccountRestriction_Maintenance_AddButton;

	public WebElement csm_Sads_AccountRestriction_Maintenance_AddButton() {
		return csm_Sads_AccountRestriction_Maintenance_AddButton;
	}

	@FindBy(xpath = "//td[@id='td_restrictionsGridTbl_Id_UR00M_1_restrictionType']//child::select")
	private WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption;

	public WebElement csm_Sads_AccountRestriction_Maintenance_SelectOption() {
		return csm_Sads_AccountRestriction_Maintenance_SelectOption;
	}

	@FindBy(id = "cifRangeRestLevel_UR00M")
	private WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel;

	public WebElement csm_Sads_AccountRestriction_Maintenance_RestrictionLevel() {
		return csm_Sads_AccountRestriction_Maintenance_RestrictionLevel;
	}

	@FindBy(id = "add_cifGridId_UR00M")
	private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon;

	public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon() {
		return csm_Sads_AccountRestriction_Maintenance_Cif_AddIcon;
	}

	@FindBy(xpath = "(//span[@role='button'])[1]")
	private WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon;

	public WebElement csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon() {
		return csm_Sads_AccountRestriction_Maintenance_Cif_SearchIcon;
	}

	@FindBy(xpath = "//input[@name='CIF_NO']")
	private WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox;

	public WebElement csm_Sads_AccountRestriction_Maintenance_CifInputBox() {
		return csm_Sads_AccountRestriction_Maintenance_CifInputBox;
	}

	@FindBy(xpath = "(//td[@tdlabel='CIF No'])[2]")
	private WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif;

	public WebElement csm_Sads_AccountRestriction_Maintenance_DoubleClickCif() {
		return csm_Sads_AccountRestriction_Maintenance_DoubleClickCif;
	}

	// core

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement CSM_Chequebookrequest;

	public WebElement CSM_Chequebookrequest() {
		return CSM_Chequebookrequest;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSM_Chequebookrequest_maintenance;

	public WebElement CSM_Chequebookrequest_maintenance() {
		return CSM_Chequebookrequest_maintenance;
	}

	@FindBy(id = "infoBarSearchButton_Q000MT")
	private WebElement CSM_Chequebookrequest_maintenance_Search;

	public WebElement CSM_Chequebookrequest_maintenance_Search() {
		return CSM_Chequebookrequest_maintenance_Search;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_CIF']")
	private WebElement CSM_Chequebookrequest_maintenance_Search_cifinput;

	public WebElement CSM_Chequebookrequest_maintenance_Search_cifinput() {
		return CSM_Chequebookrequest_maintenance_Search_cifinput;
	}

	@FindBy(xpath = "//span[text()='Received by branch']")
	private WebElement CSM_Chequebookrequest_Received;

	public WebElement CSM_Chequebookrequest_Received() {
		return CSM_Chequebookrequest_Received;
	}

	@FindBy(xpath = "//input[@id='chqBkImpExpGridTbl_Id_Q000RB_gs_ctschqbookVO.ACC_CIF']")
	private WebElement CSM_Chequebookrequest_Received_inputCIFNo;

	public WebElement CSM_Chequebookrequest_Received_inputCIFNo() {
		return CSM_Chequebookrequest_Received_inputCIFNo;
	}

	@FindBy(xpath = "//td[text()='Send To/Receive From Provider']")
	private WebElement CSM_Chequebookrequest_SendToReceiveFromProvider;

	public WebElement CSM_Chequebookrequest_SendToReceiveFromProvider() {
		return CSM_Chequebookrequest_SendToReceiveFromProvider;
	}

	@FindBy(xpath = "//span[text()='Receive From Provider']")
	private WebElement CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider;

	public WebElement CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider() {
		return CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider;
	}

	@FindBy(xpath = "//input[@id='chqBkImpExpGridTbl_Id_Q000RP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider_cifno;

	public WebElement CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider_cifno() {
		return CSM_Chequebookrequest_SendToReceiveFromProvider_ReceivefromProvider_cifno;
	}

	@FindBy(xpath = "//span[text()='Send To Branch']")
	private WebElement CSM_Chequebookrequest_SendToBranch;

	public WebElement CSM_Chequebookrequest_SendToBranch() {
		return CSM_Chequebookrequest_SendToBranch;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TB_gs_ctschqbookVO.ACC_CIF']")
	private WebElement CSM_Chequebookrequest_SendToBranch_cifno;

	public WebElement CSM_Chequebookrequest_SendToBranch_cifno() {
		return CSM_Chequebookrequest_SendToBranch_cifno;
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement CSM_AccountMenu;

	public WebElement CSM_AccountMenu() {
		return CSM_AccountMenu;
	}

	@FindBy(xpath = "//td[text()='Fixed Maturity Accounts']")
	private WebElement CSM_AccountMenu_FMA;

	public WebElement CSM_AccountMenu_FMA() {
		return CSM_AccountMenu_FMA;
	}

	@FindBy(xpath = "//span[text()='Reject']")
	private WebElement CSM_AccountMenu_FMA_reject;

	public WebElement CSM_AccountMenu_FMA_reject() {
		return CSM_AccountMenu_FMA_reject;
	}

	@FindBy(xpath = "//input[@id='fixedMaturityAccountsGridTbl_Id_A001XJ_gs_amfVO.CIF_SUB_NO']")
	private WebElement CSM_AccountMenu_FMA_rejectCIF;

	public WebElement CSM_AccountMenu_FMA_rejectCIF() {
		return CSM_AccountMenu_FMA_rejectCIF;
	}

	@FindBy(xpath = "//span[text()='Reactivate']")
	private WebElement CSM_AccountMenu_FMA_Reactivete;

	public WebElement CSM_AccountMenu_FMA_Reactivete() {
		return CSM_AccountMenu_FMA_Reactivete;
	}

	@FindBy(xpath = "//input[@id='fixedMaturityAccountsGridTbl_Id_A001YP_gs_amfVO.CIF_SUB_NO']")
	private WebElement CSM_AccountMenu_FMA_ReactiveteCIF;

	public WebElement CSM_AccountMenu_FMA_ReactiveteCIF() {
		return CSM_AccountMenu_FMA_ReactiveteCIF;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement CSM_AccountMenu_GeneralAcc;

	public WebElement CSM_AccountMenu_GeneralAcc() {
		return CSM_AccountMenu_GeneralAcc;
	}

	@FindBy(xpath = "//span[text()='Reactivate']")
	private WebElement CSM_AccountMenu_GeneralAcc_Reactive;

	public WebElement CSM_AccountMenu_GeneralAcc_Reactive() {
		return CSM_AccountMenu_GeneralAcc_Reactive;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002YR_gs_amfVO.CIF_SUB_NO']")
	private WebElement CSM_AccountMenu_GeneralAcc_ReactiveCIF;

	public WebElement CSM_AccountMenu_GeneralAcc_ReactiveCIF() {
		return CSM_AccountMenu_GeneralAcc_ReactiveCIF;
	}

	@FindBy(xpath = "//span[text()='Suspend']")
	private WebElement CSM_AccountMenu_GeneralAcc_Suspend;

	public WebElement CSM_AccountMenu_GeneralAcc_Suspend() {
		return CSM_AccountMenu_GeneralAcc_Suspend;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002ZP_gs_amfVO.CIF_SUB_NO']")
	private WebElement CSM_AccountMenu_GeneralAcc_SuspendCIF;

	public WebElement CSM_AccountMenu_GeneralAcc_SuspendCIF() {
		return CSM_AccountMenu_GeneralAcc_SuspendCIF;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon;

	public WebElement CSMTechnicalDetailsIcon() {
		return CSM_TechnicalDetailsIcon;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
		return CSM_ClearCacheInTechnicalDetailsIcon;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;

	public WebElement CSMOkButtonInInformationPopUpMenu() {
		return CSM_OkButtonInInformationPopUpMenu;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp;

	public WebElement CSMOkButtonUnderInformationPopUp() {
		return CSM_OkButtonUnderInformationPopUp;
	}

	@FindBy(xpath = "//td[contains(text(),'Transfer Accounts')]")
	private WebElement csm_TranferAccountsMainFeature;

	public WebElement csmTransferAccountsMainFeature() {
		return csm_TranferAccountsMainFeature;
	}

	@FindBy(xpath = "//td[text()='Transfer Accounts']//ancestor::h3//following-sibling::ul//span[text()='Maintenance']")
	private WebElement transferAccounts_MaintenanceFeature;

	public WebElement transferAccountsMaintenanceFeature() {
		return transferAccounts_MaintenanceFeature;
	}

	@FindBy(xpath = "//select[@name='transferAccountsCO.cts_TRSFR_ACCVO.TRANSFER_TYPE']")
	private WebElement transferAccounts_TranferAccountsDropdown;

	public WebElement transferAccountsTranferAccountsDropdown() {
		return transferAccounts_TranferAccountsDropdown;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_BR")
	private WebElement transferAccounts_ToAccountBranchCode;

	public WebElement transferAccountsToAccountBranchCode() {
		return transferAccounts_ToAccountBranchCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CY")
	private WebElement transferAccounts_ToAccountCurrencyCode;

	public WebElement transferAccountsToAccountCurrencyCode() {
		return transferAccounts_ToAccountCurrencyCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_GL")
	private WebElement transferAccounts_ToAccountGlCode;

	public WebElement transferAccountsToAccountGlCode() {
		return transferAccounts_ToAccountGlCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CIF")
	private WebElement transferAccounts_ToAccountCIFCode;

	public WebElement transferAccountsToAccountCIFCode() {
		return transferAccounts_ToAccountCIFCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_SL")
	private WebElement transferAccounts_ToAccountSerialNumber;

	public WebElement transferAccountsToAccountSerialNumber() {
		return transferAccounts_ToAccountSerialNumber;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_BR")
	private WebElement transferAccounts_fromAccountBranchCode;

	public WebElement transferAccountsFromAccountBranchCode() {
		return transferAccounts_fromAccountBranchCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CY")
	private WebElement transferAccounts_fromAccountCurrencyCode;

	public WebElement transferAccountsFromAccountCurrencyCode() {
		return transferAccounts_fromAccountCurrencyCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_GL")
	private WebElement transferAccounts_fromAccountGlCode;

	public WebElement transferAccountsFromAccountGlCode() {
		return transferAccounts_fromAccountGlCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CIF")
	private WebElement transferAccounts_FromAccountCIFCode;

	public WebElement transferAccountsFromAccountCIFCode() {
		return transferAccounts_FromAccountCIFCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_SL")
	private WebElement transferAccounts_FromAccountSerialNumber;

	public WebElement transferAccountsFromAccountSerialNumber() {
		return transferAccounts_FromAccountSerialNumber;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.REASON_CODE")
	private WebElement transferAccounts_ReasonCodeInput;

	public WebElement transferAccountsReasonCodeInput() {
		return transferAccounts_ReasonCodeInput;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.DESTINATION_BRANCH")
	private WebElement transferAccounts_DestinationInput;

	public WebElement transferAccountsDestinationInput() {
		return transferAccounts_DestinationInput;
	}

	@FindBy(id = "transferAccountsMaint_setExceptions_TA001MT")
	private WebElement transferAccounts_SetExceptionButton;

	public WebElement transferAccountsSetExceptionButton() {
		return transferAccounts_SetExceptionButton;
	}

	@FindBy(id = "transferAccounts_retrieve_TA001MT")
	private WebElement transferAccounts_RetriveButton;

	public WebElement transferAccountsRetriveButton() {
		return transferAccounts_RetriveButton;
	}

	@FindBy(xpath = "(//td[@tdlabel='Exception Factor'])[1]")
	private WebElement transferAccounts_BlankExceptionfactorFirstGridInput;

	public WebElement transferAccountsBlankExceptionfactorFirstGridInput() {
		return transferAccounts_BlankExceptionfactorFirstGridInput;
	}

	@FindBy(xpath = "(//td[@tdlabel='Exception Factor'])[2]")
	private WebElement transferAccounts_BlankExceptionfactorSecondGridInput;

	public WebElement transferAccountsBlankExceptionfactorSecondGridInput() {
		return transferAccounts_BlankExceptionfactorSecondGridInput;
	}

	@FindBy(xpath = "//select[@gridid='transferAccountsCriteriaTbl_Id_TA001MT']")
	private WebElement transferAccounts_ExceptionFactorDropdown;

	public WebElement transferAccountsExceptionFactorDropdown() {
		return transferAccounts_ExceptionFactorDropdown;
	}

	@FindBy(name = "lookupTxt_transferAccountsCriteriaVO.CRITERIA_VALUE")
	private WebElement transferAccounts_CriteriaValueInput;

	public WebElement transferAccountsCriteriaValueInput() {
		return transferAccounts_CriteriaValueInput;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")
	private WebElement transferAccounts_ExceptionOkButton;

	public WebElement transferAccountsExceptionOkButton() {
		return transferAccounts_ExceptionOkButton;
	}

	@FindBy(xpath = "//input[@id='rangeDef_TA001MTC']")
	private WebElement transferAccounts_BYCIFFlag;

	public WebElement transferAccountsBYCIFFlag() {
		return transferAccounts_BYCIFFlag;
	}

	@FindBy(xpath = "//input[@id='rangeDef_TA001MTG']")
	private WebElement transferAccounts_BYGLFlag;

	public WebElement transferAccountsBYGLFlag() {
		return transferAccounts_BYGLFlag;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.CIF_NO")
	private WebElement transferAccounts_CIFNumberInput;

	public WebElement transferAccountsCIFNumberInput() {
		return transferAccounts_CIFNumberInput;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.ORIGINAL_GL")
	private WebElement transferAccounts_GLNumberInput;

	public WebElement transferAccountsGLNumberInput() {
		return transferAccounts_GLNumberInput;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.DESTINATION_GL")
	private WebElement transferAccounts_DestinationGLNumberInput;

	public WebElement transferAccountsDestinationGLNumberInput() {
		return transferAccounts_DestinationGLNumberInput;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TRANSFER_CARDS_INFO_YN']")
	private WebElement transferAccounts_TransferOfCardsInformationFlag;

	public WebElement transferAccountsTransferOfCardsInformationFlag() {
		return transferAccounts_TransferOfCardsInformationFlag;
	}

	@FindBy(xpath = "//input[@type='file']")
	private WebElement transferAccounts_ChooseFileButton;

	public WebElement transferAccountsChooseFileButton() {
		return transferAccounts_ChooseFileButton;
	}

	@FindBy(xpath = "//input[@name='BATCH_NO']")
	private WebElement transferAccouunts_SearchBatchNumber;

	public WebElement transferAccountsSearchBatchNumber() {
		return transferAccouunts_SearchBatchNumber;
	}

	@FindBy(xpath = "//input[@name='DESTINATION_GL']")
	private WebElement transferAccounts_SearchDestinationGlInput;

	public WebElement transferAccountsSearchDestinationGlInput() {
		return transferAccounts_SearchDestinationGlInput;
	}

	@FindBy(xpath = "//input[@name='DESTINATION_BRANCH']")
	private WebElement transferAccounts_SearchDestinationBranchInput;

	public WebElement transferAccountsSearchDestinationBranchInput() {
		return transferAccounts_SearchDestinationBranchInput;
	}

	@FindBy(xpath = "//input[@name='transferTypeDesc']")
	private WebElement transferAccouunts_SearchTransferTypeInput;

	public WebElement transferAccountsSearchTransferTypeInput() {
		return transferAccouunts_SearchTransferTypeInput;
	}

	@FindBy(xpath = "//input[@name='statusDesc']")
	private WebElement transferAccouunts_SearchStatusDescInput;

	public WebElement transferAccouuntsSearchStatusDescInput() {
		return transferAccouunts_SearchStatusDescInput;
	}

	@FindBy(xpath = "//select[@name='transferAccountsCO.cts_TRSFR_ACCVO.TRANSFER_TYPE']")
	private WebElement transferAccouunts_TransferTypeDropdown;

	public WebElement transferAccouuntsTransferTypeDropdown() {
		return transferAccouunts_TransferTypeDropdown;
	}

	@FindBy(xpath = "//input[@name='FROM_ACC_GL']")
	private WebElement transferAccouunts_SearchFromGLInput;

	public WebElement transferAccouuntsSearchFromGLInput() {
		return transferAccouunts_SearchFromGLInput;
	}

	@FindBy(xpath = "//input[@name='FROM_ACC_CIF']")
	private WebElement transferAccouunts_SearchFromCIFInput;

	public WebElement transferAccouuntsFSearchFromCIFInput() {
		return transferAccouunts_SearchFromCIFInput;
	}

	@FindBy(xpath = "//input[@name='FROM_ACC_SL']")
	private WebElement transferAccouunts_SearchFromSerialNumberInput;

	public WebElement transferAccouuntsSearchFromSerialNumberInput() {
		return transferAccouunts_SearchFromSerialNumberInput;
	}

	@FindBy(xpath = "//a[text()='Transfer Accounts / Maintenance']//parent::td//following-sibling::td//span")
	private WebElement transferAccounts_MaintenanceCloseButton;

	public WebElement transferAccountsMaintenanceCloseButton() {
		return transferAccounts_MaintenanceCloseButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Transfer Accounts')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transferAccounts_TransferSuccessOkButton;

	public WebElement transferAccountsTransferSuccessOkButton() {
		return transferAccounts_TransferSuccessOkButton;
	}

	@FindBy(xpath = "//tr[@id='1']//td[@tdlabel='Batch No']")
	private WebElement transferAccounts_GetBatchNumber;

	public WebElement transferAccountsGetBatchNumber() {
		return transferAccounts_GetBatchNumber;
	}

	@FindBy(xpath = "//label[contains(text(),'Transfer ')]//ancestor::button")

	private WebElement transferAccounts_TransferButtton;

	public WebElement transferAccountsTransferButtton() {
		return transferAccounts_TransferButtton;
	}

	@FindBy(id = "TA001P")
	private WebElement transferAccounts_ApproveFeature;

	public WebElement transferAccountsApproveFeature() {
		return transferAccounts_ApproveFeature;
	}

	@FindBy(id = "TA001T")
	private WebElement transferAccounts_TransferFeature;

	public WebElement transferAccountsTransferFeature() {
		return transferAccounts_TransferFeature;
	}

	@FindBy(id = "TA001Q")
	private WebElement transferAccounts_QueryFeature;

	public WebElement transferAccountsQueryFeature() {
		return transferAccounts_QueryFeature;
	}

	@FindBy(id = "TA001TC")
	private WebElement transferAccounts_CancelFeature;

	public WebElement transferAccountsCancelFeature() {
		return transferAccounts_CancelFeature;
	}

	@FindBy(id = "TA001CP")
	private WebElement transferAccounts_ApproveCancelFeature;

	public WebElement transferAccountsApproveCancelFeature() {
		return transferAccounts_ApproveCancelFeature;
	}

	@FindBy(xpath = "//a[text()='Transfer Accounts / Approve']//parent::td//following-sibling::td//span")
	private WebElement transferAccounts_ApproveFeatureCloseButton;

	public WebElement transferAccountsApproveFeatureCloseButton() {
		return transferAccounts_ApproveFeatureCloseButton;
	}

	@FindBy(xpath = "//tr[@id='1']//td[2]")
	private WebElement transferAccounts_RetriveGridVerification;

	public WebElement transferAccountsRetriveGridVerification() {
		return transferAccounts_RetriveGridVerification;
	}

	@FindBy(xpath = "//input[@name='statusDesc']")
	private WebElement transferAccounts_RecordStatus;

	public WebElement transferAccountsRecordStatus() {
		return transferAccounts_RecordStatus;
	}

	@FindBy(xpath = "//textarea[@name='alertDescTranslated']")
	private WebElement transferAccounts_GetBarchNumberFromAlert;

	public WebElement transferAccountsGetBarchNumberFromAlert() {
		return transferAccounts_GetBarchNumberFromAlert;
	}

	@FindBy(xpath = "//td[@tdlabel='Status']")
	private WebElement transferAccounts_MaintenanceRecordStatus;

	public WebElement transferAccountsMaintenanceRecordStatus() {
		return transferAccounts_MaintenanceRecordStatus;
	}

	@FindBy(xpath = "//div[contains(text(),'Please wait while server request completes')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement csm_PleaseWaitServerOkbuton;

	public WebElement csmPleaseWaitServerOkbuton() {
		return csm_PleaseWaitServerOkbuton;
	}

	@FindBy(xpath = "//td[text()='Cards Management']")
	private WebElement csm_CardsManagementFeature;

	public WebElement csmCrdsManagementFeature() {
		return csm_CardsManagementFeature;
	}

	@FindBy(xpath = "//input[@name='ACC_CIF']")
	private WebElement cardsManagement_InputCIFNumber;

	public WebElement cardsManagementInputCIFNumber() {
		return cardsManagement_InputCIFNumber;
	}

	@FindBy(xpath = "//input[@name='ACC_GL']")
	private WebElement cardsManagement_InputGLNumber;

	public WebElement cardsManagementInputGLNumber() {
		return cardsManagement_InputGLNumber;
	}

	@FindBy(xpath = "//input[@name='STATUS']")
	private WebElement cardsManagement_InputCardStatus;

	public WebElement cardsManagementInputCardStatus() {
		return cardsManagement_InputCardStatus;
	}

	@FindBy(xpath = "//td[@tdlabel='Application ID']")
	private WebElement cardsManagement_GetApplicationID;

	public WebElement cardsManagementGetApplicationID() {
		return cardsManagement_GetApplicationID;
	}

	@FindBy(xpath = "//td[@tdlabel='SL']")
	private WebElement cardsManagement_GetSerialNumber;

	public WebElement cardsManagementGetSerialNumber() {
		return cardsManagement_GetSerialNumber;
	}

	@FindBy(xpath = "//span[contains(text(),'Query')]")
	private WebElement cardManagement_QueryFeature;

	public WebElement cardManagementQueryFeature() {
		return cardManagement_QueryFeature;
	}

	@FindBy(xpath = "//div[@id='_selenuimG001']//td[contains(text(),'Card Request')]")
	private WebElement cardsmanagement_CardRequest;

	public WebElement cardsManagementCardsRequest() {
		return cardsmanagement_CardRequest;
	}

	@FindBy(xpath = "//a[@id='G001MT']//span[contains(text(),'Maintenance')]")
	private WebElement cardRequest_Maintenance;

	public WebElement cardRequestMaintenance() {
		return cardRequest_Maintenance;
	}

	@FindBy(id = "lookuptxt_card_type_G001MT")
	private WebElement cardsRequest_CardTypeInput;

	public WebElement cardsRequestCardTypeInput() {
		return cardsRequest_CardTypeInput;
	}

	@FindBy(id = "lookuptxt_cif_G001MT")
	private WebElement cardsRequest_CIFNumberInput;

	public WebElement cardsRequestCIFNumberInput() {
		return cardsRequest_CIFNumberInput;
	}

	@FindBy(id = "lookuptxt_status_reason_G001MT")
	private WebElement cardsRequest_cardRequestReasonField;

	public WebElement cardsRequestCardRequestReasonField() {
		return cardsRequest_cardRequestReasonField;
	}

	@FindBy(id = "effective_date_G001MT")
	private WebElement cardsRequest_EffectiveDateInput;

	public WebElement cardsRequestEffectiveDateInput() {
		return cardsRequest_EffectiveDateInput;
	}

	@FindBy(xpath = "//a[@title='Account Details']//span")
	private WebElement cardsRequest_AccountDetails;

	public WebElement cardsRequestAccountDetails() {
		return cardsRequest_AccountDetails;
	}

	@FindBy(xpath = "//td[@tdlabel='A/C Br']")
	private WebElement cardsAccountDetails_EmptyBranchNumber;

	public WebElement cardsAccountDetailsEmptyBranchNumber() {
		return cardsAccountDetails_EmptyBranchNumber;
	}

	@FindBy(xpath = "//td[@tdlabel='A/C Br']//input")
	private WebElement cardsAccountDetails_BranchNumberInput;

	public WebElement cardsAccountDetailsBranchNumberInput() {
		return cardsAccountDetails_BranchNumberInput;
	}

	@FindBy(xpath = "//td[@tdlabel='A/C Cy']//input")
	private WebElement cardsAccountDetails_CurrencyInput;

	public WebElement cardsAccountDetailsCurrencyInput() {
		return cardsAccountDetails_CurrencyInput;
	}

	@FindBy(xpath = "//td[@tdlabel='A/C Gl']//input")
	private WebElement cardsAccountDetails_GLInput;

	public WebElement cardsAccountDetailsGLInput() {
		return cardsAccountDetails_GLInput;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_accountVO.ACC_SL']")
	private WebElement cardsAccountDetails_SerialNumberInput;

	public WebElement cardsAccountDetailsSerialNumberInput() {
		return cardsAccountDetails_SerialNumberInput;
	}

	@FindBy(xpath = "//a[@title='Information']//span")
	private WebElement cardsRequest_InformationTab;

	public WebElement cardsRequestInformationTab() {
		return cardsRequest_InformationTab;
	}

	@FindBy(id = "purchaser_name_G001MT")
	private WebElement cardsInformation_PurchaserNameInput;

	public WebElement cardsInformationPurchasernameInput() {
		return cardsInformation_PurchaserNameInput;
	}

	@FindBy(id = "purchaser_email_G001MT")
	private WebElement cardsInformation_PurchaserEmailIDInput;

	public WebElement cardsInformationPurachaserEmailID() {
		return cardsInformation_PurchaserEmailIDInput;
	}

	@FindBy(id = "purchaser_phone_G001MT")
	private WebElement cardsInformation_PurchaserPhoneNumberInput;

	public WebElement cardsInformationPurchaserPhoneNumberInput() {
		return cardsInformation_PurchaserPhoneNumberInput;
	}

	@FindBy(id = "lookuptxt_purchaser_id_type_G001MT")
	private WebElement cardsInformation_PurchaserIDTypeInput;

	public WebElement cardsInformationPurchaserIDTypeInput() {
		return cardsInformation_PurchaserIDTypeInput;
	}

	@FindBy(id = "purchaser_id_no_G001MT")
	private WebElement cardsInformation_PurchaserIDNumberInput;

	public WebElement cardsInformationPurchaserIDNumberInput() {
		return cardsInformation_PurchaserIDNumberInput;
	}

	@FindBy(name = "CARD_TYPE")
	private WebElement cardsRequestMaintenance_SearchCardType;

	public WebElement cardsRequestMaintenanceSearchCardType() {
		return cardsRequestMaintenance_SearchCardType;
	}

	@FindBy(name = "STATUS")
	private WebElement cardsRequestMaintenance_SearchCardStatus;

	public WebElement cardsRequestMaintenanceSearchCardStatus() {
		return cardsRequestMaintenance_SearchCardStatus;
	}

	@FindBy(xpath = "//tr[@id='1']//td[@tdlabel='Application ID']")
	private WebElement cardsRequestSearchGrid_GetApplicationID;

	public WebElement cardsRequestSearchGridGetApplicationID() {
		return cardsRequestSearchGrid_GetApplicationID;
	}

	@FindBy(xpath = "//label[contains(text(),'Reject ')]//ancestor::button")
	private WebElement csm_rejectButton;

	public WebElement csmRejectButton() {
		return csm_rejectButton;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-refresh']")
	private WebElement csm_GridRefreshed;

	public WebElement csmGridRefreshed() {
		return csm_GridRefreshed;
	}

	@FindBy(xpath = "//span[contains(text(),'Alerts')]//parent::div//span[contains(text(),'close')]")
	private WebElement csm_AlertPopUpCloseButton;

	public WebElement csmAlertPopUpCloseButton() {
		return csm_AlertPopUpCloseButton;
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

	@FindBy(xpath = "//tr[@id='ROOT__ROOT']//td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']")
	private WebElement accountsApplicatio_OPTRoot;

	public WebElement accountsApplicatioOPTRoot() {
		return accountsApplicatio_OPTRoot;
	}

	@FindBy(xpath = "//tbody/tr[@id='ROOT__ROOT__branchGrid']/td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']/div[1]/div[1]")
	private WebElement companiesAndBranches_Root;

	public WebElement companiesAndBranchesRoot() {
		return companiesAndBranches_Root;
	}

	@FindBy(xpath = "//tr[@id='ROOT__1__branchGrid']//input")
	private WebElement restrict_branch_Code_One;

	public WebElement restrictBranchCodeOne() {
		return restrict_branch_Code_One;
	}

	@FindBy(xpath = "//input[@id='userGridId_UR00M_gs_usrVO.USER_ID']")
	private WebElement restrict_UserName_Input;

	public WebElement restrictUserNameInput() {
		return restrict_UserName_Input;
	}

	@FindBy(xpath = "//input[@id='jqg_userGridId_UR00M_1']")
	private WebElement restrict_UserName_Checkbox;

	public WebElement restrictUserNameCheckbox() {
		return restrict_UserName_Checkbox;
	}

	@FindBy(xpath = "//tr[@id='ROOT__ROOT__branchGrid']//td[@aria-describedby='ctsRestBranchesTreeGridTbl_Id_UR00M_progDesc']")
	private WebElement branch_code_root_label;

	public WebElement branchCodeRootLabel() {
		return branch_code_root_label;
	}

	@FindBy(xpath = "//tr[@id='ROOT__1__branchGrid']//td[@aria-describedby='ctsRestBranchesTreeGridTbl_Id_UR00M_progDesc']")
	private WebElement branch_Code_One_header;

	public WebElement branchCodeOneHeader() {
		return branch_Code_One_header;
	}

	@FindBy(xpath = "//td[@id='add_restrictionsGridTbl_Id_UR00M']//span[@class='ui-icon ui-icon-plus']")
	private WebElement sads_RestrictionAddButton;

	public WebElement sadsRestrictionAddButton() {
		return sads_RestrictionAddButton;
	}

	@FindBy(xpath = "//select[@gridid='restrictionsGridTbl_Id_UR00M']")
	private WebElement sads_RestrictionTypeDropdown;

	public WebElement sadsRestrictionTypeDropdown() {
		return sads_RestrictionTypeDropdown;
	}

	@FindBy(xpath = "//td[@id='add_cifGridId_UR00M']//span[@class='ui-icon ui-icon-plus']")
	private WebElement sads_CIFNoAddButton;

	public WebElement sadsCIFNoAddButton() {
		return sads_CIFNoAddButton;
	}

	@FindBy(xpath = "//span[contains(@id,'CIF_NO_spanLookup_cifGridId_UR00M')]")
	private WebElement sads_CIF_NOLiveSearch;

	public WebElement sadsCIFNOLiveSearch() {
		return sads_CIF_NOLiveSearch;
	}

	@FindBy(xpath = "//input[contains(@id,'CIF_NO_cifGridId_UR00M_gs_CIF_NO')]")
	private WebElement sads_LiveSearch_CIFNo_Input;

	public WebElement sadsLiveSearchCIFNoInput() {

		return sads_LiveSearch_CIFNo_Input;
	}

	@FindBy(xpath = "//button[@id='ctsRestrictionsMaint_save_UR00M']")
	private WebElement sads_RestrictionMaintenanceSaveButton;

	public WebElement sadsRestrictionSaveButton() {
		return sads_RestrictionMaintenanceSaveButton;
	}

	@FindBy(xpath = "//input[@id='ctsRestrictionsListGridTbl_Id_UR00P_gs_code']")
	private WebElement sads_ApproveSearchRestrictionCode;

	public WebElement sadsApproveSearchRestrictionCode() {
		return sads_ApproveSearchRestrictionCode;
	}

	@FindBy(xpath = "//div[@id='_selenuimUR00P']")
	private WebElement sads_AccountsRestriction_ApproveFeature;

	public WebElement sadsAccountsRestrictionApproveFeature() {
		return sads_AccountsRestriction_ApproveFeature;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement sads_AccountsRestrictionApproveOkButton;

	public WebElement sadsAccountsRestrictionApproveOkButton() {
		return sads_AccountsRestrictionApproveOkButton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement sads_AccountsRestrictionSaveOkButton;

	public WebElement sadsAccountsRestrictionSaveOkButton() {
		return sads_AccountsRestrictionSaveOkButton;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000PT']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csm_ChequebookRequest_PrintScreen_CIFValidation;

	public WebElement csmChequebookRequestPrintScreenCIFValidation() {
		return csm_ChequebookRequest_PrintScreen_CIFValidation;
	}

	@FindBy(id = "td_gridtab_status_sl_Q000QR_1_amfVO.CIF_SUB_NO")
	private WebElement csm_ChequebookRequest_QueryScreen_CIFValidation;

	public WebElement csmChequebookRequestQueryScreenCIFValidation() {
		return csm_ChequebookRequest_QueryScreen_CIFValidation;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000RE']//tr[@id='1']//td[@tdlabel='Code']")
	private WebElement csm_Chequebook_Reactivate_CIF_Validation;

	public WebElement csmChequebookReactivateCIFValidation() {
		return csm_Chequebook_Reactivate_CIF_Validation;
	}

	@FindBy(id = "chequeBookGridTbl_Id_Q000SP_gs_ctschqbookVO.ACC_CIF")
	private WebElement csm_Chequebook_SupendScreenGrid_CIFInput;

	public WebElement csmChequebookSupendScreenGridCIFInput() {
		return csm_Chequebook_SupendScreenGrid_CIFInput;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000SP']//tr[@id='1']//td[@tdlabel='Code']")
	private WebElement csm_ChequebookRequest_SuspendScreen_CIFValidation;

	public WebElement csmChequebookRequestSuspendScreenCIFValidation() {
		return csm_ChequebookRequest_SuspendScreen_CIFValidation;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000RV']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csm_ChequebookRequest_ReverseScreen_CIFValidation;

	public WebElement csmChequebookRequestReverseScreenCIFValidation() {
		return csm_ChequebookRequest_ReverseScreen_CIFValidation;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000SB']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csm_ChequebookRequest_SubmitScreen_CIFValidation;

	public WebElement csmChequebookRequestSubmitScreenCIFValidation() {
		return csm_ChequebookRequest_SubmitScreen_CIFValidation;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000TC']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebook_ToCancelScreen_CIFValidation;

	public WebElement csmChequebookToCancelScreenCIFCalidation() {
		return csmChequebook_ToCancelScreen_CIFValidation;
	}

	@FindBy(xpath = "//table[@id='fixedMaturityAccountsGridTbl_Id_Q000TR']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement fma_AppyToSubmitGrid_CIF_VisibilityCheck;

	public WebElement fmaApplyToSubmitGridCIFVisibilityCheck() {
		return fma_AppyToSubmitGrid_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000AP']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement chequebook_ApproveGrid_CIF_VisibilityCheck;

	public WebElement chequebookApproveGridCIFVisibilityCheck() {
		return chequebook_ApproveGrid_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000IB']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement chequebook_InBranchGrid_CIF_VisibilityCheck;

	public WebElement chequebookInBranchGridCIFVisibilityCheck() {
		return chequebook_InBranchGrid_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000MT']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebook_MaintenanceScreen_CIFValidation;

	public WebElement csmChequebookMaintenanceScreenCIFCalidation() {
		return csmChequebook_MaintenanceScreen_CIFValidation;
	}

	@FindBy(xpath = "//table[@id='gridtab_acc_sl_Q000MT']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebookMaintenance_AccountLookup_validation;

	public WebElement csmChequebookMaintenanceAccountLookupvalidation() {
		return csmChequebookMaintenance_AccountLookup_validation;
	}

	@FindBy(xpath = "//table[@id='chqBkImpExpGridTbl_Id_Q000BP']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebook_BatchApproval_CIFVisibilityCheck;

	public WebElement csmChequebokBatchApprovalCIFVisibilityCheck() {
		return csmChequebook_BatchApproval_CIFVisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000TC']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebook_ToCancel_CIF_VisibilityCheck;

	public WebElement csmChequebookToCancelCIFVisibilityCheck() {
		return csmChequebook_ToCancel_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000TD']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebook_ToBeDestroyed_CIF_VisibilityCheck;

	public WebElement csmChequebookToBeDestroyedCIFVisibilityCheck() {
		return csmChequebook_ToBeDestroyed_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000AR']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebook_ToBeReversed_CIF_VisibilityCheck;

	public WebElement csmChequebookToBeReversedCIFVisibilityCheck() {
		return csmChequebook_ToBeReversed_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='chqBkImpExpGridTbl_Id_Q000RP']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebook_ReceiveFromProvider_CIF_VisibilityCheck;

	public WebElement csmChequebookReceiveFromProviderCIFVisibilityCheck() {
		return csmChequebook_ReceiveFromProvider_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//input[@id='chqBkImpExpGridTbl_Id_Q000TP_gs_ctschqbookVO.ACC_CIF']")
	private WebElement csmChequebook_SentToProvider_CIFNO_Search;

	public WebElement csmChequebookSentToProviderCIFNOSearch() {
		return csmChequebook_SentToProvider_CIFNO_Search;
	}

	@FindBy(xpath = "//table[@id='chqBkImpExpGridTbl_Id_Q000TP']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebook_SentToProvider_CIF_VisibilityCheck;

	public WebElement csmChequebookSentToProviderCIFVisibilityCheck() {
		return csmChequebook_SentToProvider_CIF_VisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='gridtab_acc_sl_Q000MT']//tr[@id='1']//td[@tdlabel='CIF']")
	private WebElement csmChequebook_SentToBranch_CIF_VisibilityCheck;

	public WebElement csmChequebookSentToBranchCIFVisibilityCheck() {
		return csmChequebook_SentToBranch_CIF_VisibilityCheck;
	}

	// New Changes By Kailash
	@FindBy(xpath = "//input[@type='file']")
	private WebElement TransferAccount_FileInput;

	public WebElement TransferAccount_FileInput() {
		return TransferAccount_FileInput;
	}

	@FindBy(xpath = "//div[@id='lookupid_dest_branch_TA001MT']//input")
	private WebElement CSMCore_DestinationBranch_Maintenance_TA;

	public WebElement CSMCore_DestinationBranch_Maintenance_TA() {
		return CSMCore_DestinationBranch_Maintenance_TA;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']//*[text()='ERROR']")
	private WebElement CSMCore_ErrorPopupMSG_Maintenance_TA;

	public WebElement CSMCoreErrorPopupMSG_Maintenance_TA() {
		return CSMCore_ErrorPopupMSG_Maintenance_TA;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSMCore_ErrorPopupOKButton_Maintenance_TA;

	public WebElement CSMCoreErrorPopupOKButton_Maintenance_TA() {
		return CSMCore_ErrorPopupOKButton_Maintenance_TA;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_TA001MT']")
	private WebElement CSMCore_ClickSearch_Maintenance_TransferScreen_TA;

	public WebElement CSMCoreClickSearch_Maintenance_TransferScreen_TA() {
		return CSMCore_ClickSearch_Maintenance_TransferScreen_TA;
	}

	@FindBy(xpath = "//table[@id='transferAccountsListGridTbl_Id_TA001MT']//tr[@id='1']//td[@id='td_transferAccountsListGridTbl_Id_TA001MT_1_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_GetBatchNoFromSearch_Maintenance_TransferScreen_TA;

	public WebElement CSMCoreGetBatchNoFromSearch_Maintenance_TransferScreen_TA() {
		return CSMCore_GetBatchNoFromSearch_Maintenance_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_EnterBatchNo_Approve_TransferScreen_TA;

	public WebElement CSMCoreEnterBatchNo_Approve_TransferScreen_TA() {
		return CSMCore_EnterBatchNo_Approve_TransferScreen_TA;
	}

	@FindBy(xpath = "//div//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_transferTypeDesc']")
	private WebElement CSMCore_EnterTransferType_Search_maintenace_TransferScreen_TA;

	public WebElement CSMCoreEnterTransferType_Search_maintenace_TransferScreen_TA() {
		return CSMCore_EnterTransferType_Search_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//div//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_rangeDefinitionDesc']")
	private WebElement CSMCore_EnterRangesDefinition_Search_maintenace_TransferScreen_TA;

	public WebElement CSMCoreEnterRangesDefinition_Search_maintenace_TransferScreen_TA() {
		return CSMCore_EnterRangesDefinition_Search_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//div//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_statusDesc']")
	private WebElement CSMCore_EnterStatus_Search_maintenace_TransferScreen_TA;

	public WebElement CSMCoreEnterStatus_Search_maintenace_TransferScreen_TA() {
		return CSMCore_EnterStatus_Search_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//div//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_closeReasonDesc']")
	private WebElement CSMCore_EnterReason_Search_maintenace_TransferScreen_TA;

	public WebElement CSMCoreEnterReason_Search_maintenace_TransferScreen_TA() {
		return CSMCore_EnterReason_Search_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//div//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_EnterBatch_No_maintenace_TransferScreen_TA;

	public WebElement CSMCoreEnterBatch_No_maintenace_TransferScreen_TA() {
		return CSMCore_EnterBatch_No_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//label[@labelkey='ranges_definition_key']")
	private WebElement CSMCore_RangeDefinitionKeyText_maintenace_TransferScreen_TA;

	public WebElement CSMCoreRangeDefinitionKeyText_maintenace_TransferScreen_TA() {
		return CSMCore_RangeDefinitionKeyText_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@role='checkbox']")
	private WebElement CSMCore_Checkbox_maintenace_TransferScreen_TA;

	public WebElement CSMCoreCheckbox_maintenace_TransferScreen_TA() {
		return CSMCore_Checkbox_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_BR']")
	private WebElement CSMCore_FromAccountBranchCOde_maintenace_TransferScreen_TA;

	public WebElement CSMCoreFromAccountBranchCOde_maintenace_TransferScreen_TA() {
		return CSMCore_FromAccountBranchCOde_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_BR']")
	private WebElement CSMCore_TOAccountBranchCOde_maintenace_TransferScreen_TA;

	public WebElement CSMCoreTOAccountBranchCOde_maintenace_TransferScreen_TA() {
		return CSMCore_TOAccountBranchCOde_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CY']")
	private WebElement CSMCore_FromAccountCurrencyCode_maintenace_TransferScreen_TA;

	public WebElement CSMCoreFromAccountCurrencyCode_maintenace_TransferScreen_TA() {
		return CSMCore_FromAccountCurrencyCode_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CY']")
	private WebElement CSMCore_TOAccountCurrencyCode_maintenace_TransferScreen_TA;

	public WebElement CSMCoreTOAccountCurrencyCode_maintenace_TransferScreen_TA() {
		return CSMCore_TOAccountCurrencyCode_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_FromAccountGLCode_maintenace_TransferScreen_TA;

	public WebElement CSMCoreFromAccountGLCode_maintenace_TransferScreen_TA() {
		return CSMCore_FromAccountGLCode_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_GL']")
	private WebElement CSMCore_TOAccountGLCode_maintenace_TransferScreen_TA;

	public WebElement CSMCoreTOAccountGLCode_maintenace_TransferScreen_TA() {
		return CSMCore_TOAccountGLCode_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CIF']")
	private WebElement CSMCore_FromAccountCIFCode_maintenace_TransferScreen_TA;

	public WebElement CSMCoreFromAccountCIFCode_maintenace_TransferScreen_TA() {
		return CSMCore_FromAccountCIFCode_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CIF']")
	private WebElement CSMCore_TOAccountCIFCode_maintenace_TransferScreen_TA;

	public WebElement CSMCoreTOAccountCIFCode_maintenace_TransferScreen_TA() {
		return CSMCore_TOAccountCIFCode_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_from_acc_sl_TA001MT']")
	private WebElement CSMCore_FromAccountSLCode_maintenace_TransferScreen_TA;

	public WebElement CSMCoreFromAccountSLCode_maintenace_TransferScreen_TA() {
		return CSMCore_FromAccountSLCode_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_acc_sl_TA001MT']")
	private WebElement CSMCore_TOAccountSLCode_maintenace_TransferScreen_TA;

	public WebElement CSMCoreTOAccountSLCode_maintenace_TransferScreen_TA() {
		return CSMCore_TOAccountSLCode_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_original_gl_TA001MT']")
	private WebElement CSMCore_OriginalGL_maintenace_TransferScreen_TA;

	public WebElement CSMCoreOriginalGL_maintenace_TransferScreen_TA() {
		return CSMCore_OriginalGL_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_destination_gl_TA001MT']")
	private WebElement CSMCore_DestinationGL_maintenace_TransferScreen_TA;

	public WebElement CSMCoreDestinationGL_maintenace_TransferScreen_TA() {
		return CSMCore_DestinationGL_maintenace_TransferScreen_TA;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001P_reject_key']")
	private WebElement CSMCore_RejectBtn_Approve_TransferScreen_TA;

	public WebElement CSMCoreRejectBtn_Approve_TransferScreen_TA() {
		return CSMCore_RejectBtn_Approve_TransferScreen_TA;
	}

	@FindBy(xpath = "//div[@id='jqgh_transferAccountsListGridTbl_Id_TA001MT_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_BatchNoHeaderClick_Maintenance_TransferScreen_TA;

	public WebElement CSMCoreBatchNoHeaderClick_Maintenance_TransferScreen_TA() {
		return CSMCore_BatchNoHeaderClick_Maintenance_TransferScreen_TA;
	}

	@FindBy(xpath = "//a[@id='TA001P']//span[text()='Approve']")
	private WebElement CSMCore_ApproveScreen_TA;

	public WebElement CSMCoreApproveScreen_TA() {
		return CSMCore_ApproveScreen_TA;
	}

	@FindBy(xpath = "(//input[@type='text'][@name='FROM_ACC_CIF'])[2]")
	private WebElement CSMCore_EnterCIFNo_ApproveScreen_TA;

	public WebElement CSMCoreEnterCIFNo_ApproveScreen_TA() {
		return CSMCore_EnterCIFNo_ApproveScreen_TA;
	}

	@FindBy(xpath = "//tbody//tr//td[@id='td_transferAccountsListGridTbl_Id_TA001P_1_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_ClickOnEnteredBatchNo_ApproveScreen_TA;

	public WebElement CSMCoreClickOnEnteredBatchNo_ApproveScreen_TA() {
		return CSMCore_ClickOnEnteredBatchNo_ApproveScreen_TA;
	}

	@FindBy(xpath = "//*[@id='transferAccountsMaintFormId_TA001P_approve_key']")
	private WebElement CSMCore_ApproveBtn_ApproveScreen_TA;

	public WebElement CSMCoreApproveBtn_ApproveScreen_TA() {
		return CSMCore_ApproveBtn_ApproveScreen_TA;
	}

	@FindBy(xpath = "//a[@id='TA001T']")
	private WebElement CSMCore_TransferScreen_TA;

	public WebElement CSMCoreTransferScreen_TA() {
		return CSMCore_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_EnterBatchNo_TransferScreen_TA;

	public WebElement CSMCoreEnterBatchNo_TransferScreen_TA() {
		return CSMCore_EnterBatchNo_TransferScreen_TA;
	}

	@FindBy(xpath = "//tbody//tr//td[@id='td_transferAccountsListGridTbl_Id_TA001T_1_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_ClickOnEnteredBatchNo_TransferScreen_TA;

	public WebElement CSMCoreClickOnEnteredBatchNo_TransferScreen_TA() {
		return CSMCore_ClickOnEnteredBatchNo_TransferScreen_TA;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001T_Transfer_key']")
	private WebElement CSMCore_TransferBtn_TransferScreen_TA;

	public WebElement CSMCoreTransferBtn_TransferScreen_TA() {
		return CSMCore_TransferBtn_TransferScreen_TA;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement CSMCore_PopupMsgForTransfer_Transfer_TransferScreen_TA;

	public WebElement CSMCorePopupMsgForTransfer_Transfer_TransferScreen_TA() {
		return CSMCore_PopupMsgForTransfer_Transfer_TransferScreen_TA;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSMCore_OkBtn_PopupMsgForTransfer_Transfer_TransferScreen_TA;

	public WebElement CSMCoreOkBtn_PopupMsgForTransfer_Transfer_TransferScreen_TA() {
		return CSMCore_OkBtn_PopupMsgForTransfer_Transfer_TransferScreen_TA;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement CSMSADS_ApproveUnderAccountRestrictions;

	public WebElement CSMSADSApproveUnderAccountRestrictions() {
		return CSMSADS_ApproveUnderAccountRestrictions;
	}

	@FindBy(xpath = "//td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_8_progDesc']")
	private WebElement CSMSADS_RET_Label;

	public WebElement CSMSADS_RET_Label() {
		return CSMSADS_RET_Label;
	}

	@FindBy(xpath = "//td[@title='RET']//div[contains(@class,'treeclick')]")
	private WebElement CSMSADS_RET_Flag_icon;

	public WebElement CSMSADS_RET_Flag_icon() {
		return CSMSADS_RET_Flag_icon;
	}

	@FindBy(xpath = "//div[@id='receive_alert_div']")
	private WebElement CSM_Alert_Popup;

	public WebElement CSM_Alert_Popup() {
		return CSM_Alert_Popup;
	}

	@FindBy(xpath = "//button[@id='snoozeRcvAlertBtn_RCVALERT']")
	private WebElement CSM_Alert_Popup_Snooze_Btn;

	public WebElement CSM_Alert_Popup_Snooze_Btn() {
		return CSM_Alert_Popup_Snooze_Btn;
	}

	@FindBy(xpath = "//input[contains(@id,'CIF_TYPE_cifTypeGridId_UR00M_gs_COMP_CODE')]")
	private WebElement CSM_SADS_Comp_Code_In_SearchPopUp;

	public WebElement CSM_SADS_Comp_Code_In_SearchPopUp() {
		return CSM_SADS_Comp_Code_In_SearchPopUp;
	}

	@FindBy(xpath = "//input[@id='accBr_N001MT']")
	private WebElement CSM_Lost_Found_Management_Branch_Code_Input;

	public WebElement CSM_Lost_Found_Management_Branch_Code_Input() {
		return CSM_Lost_Found_Management_Branch_Code_Input;
	}

	@FindBy(id = "accCy_N001MT")
	private WebElement CSM_Lost_Found_Management_Currency_Code_Input;

	public WebElement CSM_Lost_Found_Management_Currency_Code_Input() {
		return CSM_Lost_Found_Management_Currency_Code_Input;
	}

	@FindBy(id = "accGl_N001MT")
	private WebElement CSM_Lost_Found_Management_GL_Code_Input;

	public WebElement CSM_Lost_Found_Management_GL_Code_Input() {
		return CSM_Lost_Found_Management_GL_Code_Input;
	}

	@FindBy(id = "accCif_N001MT")
	private WebElement CSM_Lost_Found_Management_CIF_Code_Input;

	public WebElement CSM_Lost_Found_Management_CIF_Code_Input() {
		return CSM_Lost_Found_Management_CIF_Code_Input;
	}

	@FindBy(id = "lookuptxt_accSl_N001MT")
	private WebElement CSM_Lost_Found_Management_Serial_No_Input;

	public WebElement CSM_Lost_Found_Management_Serial_No_Input() {
		return CSM_Lost_Found_Management_Serial_No_Input;
	}

	@FindBy(xpath = "//input[@id='accountQueryGrid_Id_A003_gs_CIF_SUB_NO']")
	private WebElement generalAccounts_Query_SearchCIFNumber;

	public WebElement generalAccountsQuerySearchCIFNumber() {
		return generalAccounts_Query_SearchCIFNumber;
	}

	@FindBy(xpath = "//table[@id='accountQueryGrid_Id_A003']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement generalAccounts_Query_CifVisibilityCheck;

	public WebElement generalAccountsQueryCifVisibilityCheck() {
		return generalAccounts_Query_CifVisibilityCheck;
	}

	@FindBy(xpath = "//td[@tdlabel='Restriction Criteria']//select[@gridid='restrictionsGridTbl_Id_UR00M']")
	private WebElement restrictionMaintenance_restrictionCriteriaDropdown;

	public WebElement restrictionMaintenanceRestrictionCriteria() {
		return restrictionMaintenance_restrictionCriteriaDropdown;
	}

	@FindBy(xpath = "//select[@id='cifRangeRestLevel_UR00M']")
	private WebElement restrictionMaintenance_RestrictionLevelDropdown;

	public WebElement restrictionMaintenanceRestrictionLevelDropdown() {
		return restrictionMaintenance_RestrictionLevelDropdown;
	}

	@FindBy(xpath = "//input[contains(@id,'TO_CIF') and @name='CIF_NO']")
	private WebElement restrictionMaintenance_ToCIFInput;

	public WebElement restrictionMaintenanceToCIFInput() {
		return restrictionMaintenance_ToCIFInput;
	}

	@FindBy(xpath = "//input[contains(@id,'FROM_CIF') and @name='CIF_NO']")
	private WebElement restrictionMaintenance_FromCIFInput;

	public WebElement restrictionMaintenanceFromCIFInput() {
		return restrictionMaintenance_FromCIFInput;
	}

	@FindBy(xpath = "//span[contains(@id,'FROM_CIF_spanLookup')]//span")
	private WebElement restrictionMaintenance_fromCIFLiveSearch;

	public WebElement restrictionMaintenanceFromCIFLiveSearch() {
		return restrictionMaintenance_fromCIFLiveSearch;
	}

	@FindBy(xpath = "//span[contains(@id,'TO_CIF_spanLookup')]//span")
	private WebElement restrictionMaintenance_ToCIFLiveSearch;

	public WebElement restrictionMaintenanceToCIFLiveSearch() {
		return restrictionMaintenance_ToCIFLiveSearch;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002RJ']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement generalAccounts_ApproveRejectCIFVisibliyCheck;

	public WebElement generalAccountssApproveRejectCIFVisibliyCheck() {
		return generalAccounts_ApproveRejectCIFVisibliyCheck;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002RE']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement generalAccounts_ApproveReactivateCIFVisibilityCheck;

	public WebElement generalAccountsApproveReactivateCIFVisibilityCheck() {
		return generalAccounts_ApproveReactivateCIFVisibilityCheck;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002SP']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement generalAccounts_ApproveSuspendCIFVisibiityCheck;

	public WebElement generalAccountsApproveSuspendCIFVisibiityCheck() {
		return generalAccounts_ApproveSuspendCIFVisibiityCheck;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002AU']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement generalAccounts_AuthorizeCIFVisibiityCheck;

	public WebElement generalAccountsAuthorizeCIFVisibiityCheck() {
		return generalAccounts_AuthorizeCIFVisibiityCheck;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002ACT_gs_amfVO.CIF_SUB_NO']")
	private WebElement generalAccountsAuthorizeCloseWithTransferCIFSearchInput;

	public WebElement generalAccountsAuthorizeCloseWithTransferCIFSearchInput() {
		return generalAccountsAuthorizeCloseWithTransferCIFSearchInput;
	}

	@FindBy(xpath = "//table[@id='generalAccountsGridTbl_Id_A002ACT']//tr[@id='1']//td[@tdlabel='CIF / SUB']")
	private WebElement generalAccountsAuthorizeCloseWithTransferCIFVisibilityCheck;

	public WebElement generalAccountsAuthorizeCloseWithTransferCIFVisibilityCheck() {
		return generalAccountsAuthorizeCloseWithTransferCIFVisibilityCheck;
	}

	@FindBy(xpath = "//span[contains(@id,'CIF_TYPE_spanLookup_cifTypeGridId_UR00M')]//span")
	private WebElement accountsRectrictionMaintenance_CIFTypeLiveSearch;

	public WebElement accountsRestrictionMaintenanceCIFTypeLiveSearch() {
		return accountsRectrictionMaintenance_CIFTypeLiveSearch;
	}

	@FindBy(xpath = "//input[contains(@id,'CIF_TYPE_cifTypeGridId_UR00M_gs_TYPE_CODE')]")
	private WebElement accountsRestrictionMaintenance_CIFTypeLiveSearchInput;

	public WebElement accountsRestrictionMaintenanceCIFTypeLiveSearchInput() {
		return accountsRestrictionMaintenance_CIFTypeLiveSearchInput;
	}

	//// td[@tdlabel='Code' and text()='9']
	@FindBy(xpath = "//td[@id='add_cifTypeGridId_UR00M']")
	private WebElement accountsRestriction_CIFTypeAddButon;

	public WebElement accountsRestrictionCIFTypeAddButon() {
		return accountsRestriction_CIFTypeAddButon;
	}

	@FindBy(xpath = "//td[@id='add_restrictionsGridTbl_Id_UR00M']")
	private WebElement accountsRestriction_RestrictionTypeAddButton;

	public WebElement accountsRestrictionRestrictionTypeAddButton() {
		return accountsRestriction_RestrictionTypeAddButton;
	}

	@FindBy(xpath = "//span[@id='spanLookup_glCode_no_UR00M']//span")
	private WebElement acounstRestriction_GLCodeLiveSearch;

	public WebElement acounstRestrictionGLCodeLiveSearch() {
		return acounstRestriction_GLCodeLiveSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_glCode_no_UR00M_gs_GL_CODE']")
	private WebElement acounstRestriction_GLCodeLiveSearchInput;

	public WebElement acounstRestrictionGLCodeLiveSearchInput() {
		return acounstRestriction_GLCodeLiveSearchInput;
	}

	// td[@tdlabel='Gl Code' and text()='805231']
	@FindBy(xpath = "//td[@id='add_cifRangeGridId_UR00M']//span")
	private WebElement sads_RangeCIFNoAddButton;

	public WebElement sadsRangeCIFNoAddButton() {
		return sads_RangeCIFNoAddButton;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_CIF_TYPE']")
	private WebElement SADS_Account_Restrictions_CIF_Type_Input;

	public WebElement SADS_Account_Restrictions_CIF_Type_Input() {
		return SADS_Account_Restrictions_CIF_Type_Input;
	}

	@FindBy(xpath = "(//input[@name='duesManagementCO.duesVO.DR_AC_BR'])[1]")
	private WebElement CSM_DuesManagement_maintenance_branchcode;

	public WebElement CSM_DuesManagement_maintenance_branchcode() {
		return CSM_DuesManagement_maintenance_branchcode;
	}

	@FindBy(xpath = "(//input[@name='duesManagementCO.duesVO.DR_AC_CY'])[1]")
	private WebElement CSM_DuesManagement_maintenance_currencycode;

	public WebElement CSM_DuesManagement_maintenance_currencycode() {
		return CSM_DuesManagement_maintenance_currencycode;
	}

	@FindBy(xpath = "(//input[@name='duesManagementCO.duesVO.DR_AC_GL'])[1]")
	private WebElement CSM_DuesManagement_maintenance_GLcode;

	public WebElement CSM_DuesManagement_maintenance_GLcode() {
		return CSM_DuesManagement_maintenance_GLcode;
	}

	@FindBy(xpath = "(//input[@name='duesManagementCO.duesVO.DR_AC_CIF'])[1]")
	private WebElement CSM_DuesManagement_maintenance_cifcode;

	public WebElement CSM_DuesManagement_maintenance_cifcode() {
		return CSM_DuesManagement_maintenance_cifcode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_accSl_DUES01MT']")
	private WebElement CSM_DuesManagement_maintenance_serialcode;

	public WebElement CSM_DuesManagement_maintenance_serialcode() {
		return CSM_DuesManagement_maintenance_serialcode;
	}

	@FindBy(xpath = "//div[contains(text(),'Please wait while server request completes')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement serverRequest_OkButon;

	public WebElement serverRequestOkButton() {
		return serverRequest_OkButon;
	}

	@FindBy(xpath = "//button[@id='ctsRestrictionsMaint_approve_UR00P']")
	private WebElement sads_AccountsRestrictionApproveButton;

	public WebElement sadsAccountsRestrictionApproveButton() {
		return sads_AccountsRestrictionApproveButton;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_from_acc_add_ref_TA001MT']")
	private WebElement TransferAccount_GetFromAccountNumber;

	public WebElement TransferAccount_GetFromAccountNumber() {
		return TransferAccount_GetFromAccountNumber;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_acc_add_ref_TA001MT']")
	private WebElement TransferAccount_Enter_the_ToAccount;

	public WebElement TransferAccount_Enter_the_ToAccount() {
		return TransferAccount_Enter_the_ToAccount;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifVO_CIF_TYPE_F00I1MT']")
	private WebElement CSMCore_FOM_Maintenance_CIFNo;

	public WebElement CSMCore_FOM_Maintenance_CIFNo() {
		return CSMCore_FOM_Maintenance_CIFNo;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cif_no_GLBVIEW001']")
	private WebElement CSMCore_360Degree_Screen_CIFNo;

	public WebElement CSMCore_360Degree_Screen_CIFNo() {
		return CSMCore_360Degree_Screen_CIFNo;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_debitAcc_currency;

	public WebElement Transactions_debitAcc_currency() {
		return Transactions_debitAcc_currency;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_EnterAmount;

	public WebElement Transactions_EnterAmount() {
		return Transactions_EnterAmount;
	}

	@FindBy(xpath = "//span[text()='Remove Tab']")
	private WebElement Transactions_maitenance_Remove_tab;

	public WebElement Transactions_maitenance_Remove_tab() {
		return Transactions_maitenance_Remove_tab;
	}

	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement CSMCore_Transactions_Maintenance;

	public WebElement CSMCore_Transactions_Maintenance() {
		return CSMCore_Transactions_Maintenance;
	}

}
