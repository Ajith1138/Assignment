package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMSADS_TransactiononstaffaccObj {
	WebDriver driver;

	public CSMSADS_TransactiononstaffaccObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement userSubMenu;

	public WebElement userSubMenu() {
		return userSubMenu;
	}

	@FindBy(xpath = "//a[@id='O001P']")
	private WebElement csm_User_ApproveScreen;

	public WebElement csm_User_ApproveScreen() {
		return csm_User_ApproveScreen;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement csm_TransferAccounts_ApproveSubmenu_ApproveButton_615;

	public WebElement csm_TransferAccounts_ApproveSubmenu_ApproveButton_615() {
		return csm_TransferAccounts_ApproveSubmenu_ApproveButton_615;
	}

	@FindBy(xpath = "//a[@id='controlRecord_tab_AlertActivation_O001UP']")
	private WebElement alertActivationButton_626;

	public WebElement alertActivationButton_626() {
		return alertActivationButton_626;
	}

	@FindBy(xpath = "(//td[@title='Transactions']//ancestor::div)[11]")
	private WebElement Transactions_CR;

	public WebElement Transactions_CR() {
		return Transactions_CR;
	}

	@FindBy(xpath = "//td[@id='td_tab4_GridTbl_Id_O001UP_1_ctscontrolAlertVO.ACTIVATE']//input[@id='1x1x10_ctscontrolAlertVO.ACTIVATE']")
	private WebElement Transactions_AccountOverdawn;

	public WebElement Transactions_AccountOverdawn() {
		return Transactions_AccountOverdawn;
	}

	@FindBy(xpath = "//a[text()=' Alert Activation ']")
	private WebElement alertActivationButton_612;

	public WebElement alertActivationButton_612() {
		return alertActivationButton_612;
	}

	@FindBy(id = "td_tab4_GridTbl_Id_O001UP_33_CUSTOM_FIELD")
	private WebElement staffAccountsTransactionFlag_612;

	public WebElement staffAccountsTransactionFlag_612() {
		return staffAccountsTransactionFlag_612;
	}

	@FindBy(xpath = "//span[contains(text(),'Staff Accounts Transaction')]//parent::td")

	private WebElement alertActivationTab_StaffAccountTransactions_612;

	public WebElement alertActivationTabStaffAccountTransactions_612() {

		return alertActivationTab_StaffAccountTransactions_612;

	}

	@FindBy(xpath = "//a[@id='O001P']//span[text()='Approve']")
	private WebElement csmParam_Approve_612;

	public WebElement csmParamApprove_612() {
		return csmParam_Approve_612;
	}

	@FindBy(id = "lookuptxt_trx_type_D001CEMT")
	private WebElement CSM_TRXTypeInMaintenanceScreenMulticheckque_605;

	public WebElement CSMTRXTypeInMaintenanceScreenMulticheckque_605() {
		return CSM_TRXTypeInMaintenanceScreenMulticheckque_605;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001CEMT']")
	private WebElement CSM_SerialInCreditAcInput_605;

	public WebElement CSM_SerialInCreditAcInput_605() {
		return CSM_SerialInCreditAcInput_605;
	}

	@FindBy(id = "lookuptxt_trx_type_D001MT")
	private WebElement CSM_TRXTypeInMaintenanceScreen_612;

	public WebElement CSMTRXTypeInMaintenanceScreen_612() {
		return CSM_TRXTypeInMaintenanceScreen_612;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement CSM_BranchCodeInCreditAcc_612;

	public WebElement CSMBranchCodeInCreditAcc_612() {
		return CSM_BranchCodeInCreditAcc_612;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSM_GLCodeCreditAcc_612;

	public WebElement CSMGLCodeCreditAcc_612() {
		return CSM_GLCodeCreditAcc_612;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement CSM_CurrencyCodeCreditAcc_612;

	public WebElement CSMCurrencyCodeCreditAcc_612() {
		return CSM_CurrencyCodeCreditAcc_612;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement CSM_CIFCodeInCreditAcc_612;

	public WebElement CSMCIFCodeInCreditAcc_612() {
		return CSM_CIFCodeInCreditAcc_612;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSM_SerialInCreditAcc_612;

	public WebElement CSMSerialInCreditAcc_612() {
		return CSM_SerialInCreditAcc_612;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
	private WebElement CSM_CurrencyCodeCreditAcInput_612;

	public WebElement CSM_CurrencyCodeCreditAcInput_612() {
		return CSM_CurrencyCodeCreditAcInput_612;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_GL']")
	private WebElement CSM_GLCodeCreditAcInput_612;

	public WebElement CSM_GLCodeCreditAcInput_612() {
		return CSM_GLCodeCreditAcInput_612;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSM_SerialInCreditAcInput_612;

	public WebElement CSM_SerialInCreditAcInput_612() {
		return CSM_SerialInCreditAcInput_612;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CSM_CIFCodeInCreditAcInput_612;

	public WebElement CSM_CIFCodeInCreditAcInput_612() {
		return CSM_CIFCodeInCreditAcInput_612;
	}

//Sprint 66
	@FindBy(id = "userMaint_save_P005M")
	private WebElement sadsUserSaveButton;

	public WebElement sadsUserSaveButton() {
		return sadsUserSaveButton;
	}

/////karthi new 

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

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;

	public WebElement CSMOkButtonInInformationPopUpMenu() {
		return CSM_OkButtonInInformationPopUpMenu;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
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

	@FindBy(id = "D001MT")
	private WebElement CSM_MaintenanceUnderTransactions;

	public WebElement CSMMaintenanceUnderTransactions() {
		return CSM_MaintenanceUnderTransactions;
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

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
		return CSM_OkButtonInAccessDeniedPopUpMenu;
	}

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

	@FindBy(xpath = "//div[contains(text(),'is Non Resident')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactionMaintenance_IsNoResidentOkbuton;

	public WebElement transactionMaintenanceIsNoResidentOkbuton() {
		return transactionMaintenance_IsNoResidentOkbuton;
	}

	@FindBy(xpath = "(//span[text()='Transactions']//parent::td//div)[1]")

	private WebElement maximizeTransactionFlagInAlertActivation;

	public WebElement maximizeTransactionFlagInAlertActivation()

	{

		return maximizeTransactionFlagInAlertActivation;

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

	@FindBy(xpath = "//span[contains(text(),'Staff Accounts Transaction')]//parent::td//following-sibling::td[1]//input")
	private WebElement alertActivationTab_StaffAccountTransactionsCheckBox;

	public WebElement alertActivationTabStaffAccountTransactionsCheckBox() {
		return alertActivationTab_StaffAccountTransactionsCheckBox;
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

	@FindBy(xpath = "//div[@id=\"div__popup_path_sol_ok\"]//div/div[contains(text(),'Code Already in Use')]")
	private WebElement AccountRestriction_CodeAlready_use_PopUp;

	public WebElement AccountRestriction_CodeAlready_use_PopUp() {
		return AccountRestriction_CodeAlready_use_PopUp;
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

	@FindBy(xpath = "//input[@id='lookuptxt_COMP_CODE_P005M']")
	private WebElement csm_sads_companycode;

	public WebElement csm_sads_companycode() {
		return csm_sads_companycode;
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

	@FindBy(xpath = "//span[contains(text(),'Save')]//parent::button")
	private WebElement csm_SaveButton;

	public WebElement csmSaveButton() {
		return csm_SaveButton;
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

	@FindBy(xpath = "//label[contains(text(),'Update After Approve ')]//ancestor::button")
	private WebElement csmParam_UpdateAfterApproveBtn;

	public WebElement csmParamUpdateAfterApproveBtn() {
		return csmParam_UpdateAfterApproveBtn;
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

	@FindBy(xpath = "//div[contains(text(),'Cannot clear charges')]//parent::div//following-sibling::center//input[1]")
	private WebElement csm_canNotClearChargesOkButton;

	public WebElement csmCanNotClearChargesOkButton() {
		return csm_canNotClearChargesOkButton;
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

	@FindBy(id = "lookuptxt_cif_no_E000P")
	private WebElement userApprove_CIFNumberInput;

	public WebElement userApproveCIFNumberInput() {
		return userApprove_CIFNumberInput;
	}

	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID']")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;
	}

	// ANANDH TC

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

	@FindBy(name = "controlrecordCO.ctscontrolVO.CHQ_UNIQUE")
	private WebElement controlRecords_ChequeUniqueBasedOnDropdown;

	public WebElement controlRecordsChequeUniqueBasedOnDropdown() {
		return controlRecords_ChequeUniqueBasedOnDropdown;
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

	@FindBy(name = "controlrecordCO.ctscontrolVO.APPLY_CHQ_PRINT_THIRD_PARTY_YN")
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

	// Razia tc

	@FindBy(xpath = "//div[@id='_selenuim_CATEG_1']//child::td[text()='Parameters']")
	private WebElement CSMSADS_ParametersMainMenu;

	public WebElement CSMSADS_ParametersMainMenu() {
		return CSMSADS_ParametersMainMenu;
	}

	@FindBy(xpath = "//td[text()='Account Restrictions']")
	private WebElement CSMSADS_AccountRestrictionsInParameters;

	public WebElement CSMSADS_AccountRestrictionsInParameters() {
		return CSMSADS_AccountRestrictionsInParameters;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSMSADS_MaintenanceInAccountRestrictions;

	public WebElement CSMSADS_MaintenanceInAccountRestrictions() {
		return CSMSADS_MaintenanceInAccountRestrictions;
	}

	@FindBy(id = "code_UR00M")
	private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance;

	public WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance() {
		return CSMSADS_EnterTheValueInCodeUnderMaintenance;
	}

	@FindBy(xpath = "//input[@name='ctsRestrictionsVO.CODE_TYPE_DESC']")
	private WebElement CSMSADS_EnterTheValueInDescriptionUnderMaintenance;

	public WebElement CSMSADS_EnterTheValueInDescriptionUnderMaintenance() {
		return CSMSADS_EnterTheValueInDescriptionUnderMaintenance;
	}

	@FindBy(id = "personal_account_access_UR00M")
	private WebElement CSMSADS_CheckBoxInGrantAccessToPersonalAccounts;

	public WebElement CSMSADS_CheckBoxInGrantAccessToPersonalAccounts() {
		return CSMSADS_CheckBoxInGrantAccessToPersonalAccounts;
	}

	@FindBy(xpath = "//td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']//preceding-sibling::div/child::div")
	private WebElement CSMSADS_RootIconInApplicationsOROPTs;

	public WebElement CSMSADS_RootIconInApplicationsOROPTs() {
		return CSMSADS_RootIconInApplicationsOROPTs;
	}

	@FindBy(id = "td_ctsRestOptTreeGridTbl_Id_UR00M_7_progDesc")
	private WebElement CSMSADS_RADMApplicationInApplicationsOROPTs;

	public WebElement CSMSADS_RADMApplicationInApplicationsOROPTs() {
		return CSMSADS_RADMApplicationInApplicationsOROPTs;
	}

	@FindBy(id = "RADM__RADM_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M")
	private WebElement CSMSADS_RADMApplicationCheckboxInApplicationsOROPTs;

	public WebElement CSMSADS_RADMApplicationCheckboxInApplicationsOROPTs() {
		return CSMSADS_RADMApplicationCheckboxInApplicationsOROPTs;
	}

	@FindBy(id = "td_ctsRestOptTreeGridTbl_Id_UR00M_8_progDesc")
	private WebElement CSMSADS_RETApplicationInApplicationsOROPTs;

	public WebElement CSMSADS_RETApplicationInApplicationsOROPTs() {
		return CSMSADS_RETApplicationInApplicationsOROPTs;
	}

	@FindBy(id = "RET__RET_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M")
	private WebElement CSMSADS_RETApplicationCheckboxInApplicationsOROPTs;

	public WebElement CSMSADS_RETApplicationCheckboxInApplicationsOROPTs() {
		return CSMSADS_RETApplicationCheckboxInApplicationsOROPTs;
	}

	@FindBy(xpath = "//td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']//preceding-sibling::div/child::div")
	private WebElement CSMSADS_RootIconInCompaniesORBranchesInMaintenance;

	public WebElement CSMSADS_RootIconInCompaniesORBranchesInMaintenance() {
		return CSMSADS_RootIconInCompaniesORBranchesInMaintenance;
	}

	@FindBy(xpath = "(//td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']//preceding-sibling::div/child::div)[2]")
	private WebElement CSMSADS_1BAJapplicationInCompaniesORBranches;

	public WebElement CSMSADS_1BAJapplicationInCompaniesORBranches() {
		return CSMSADS_1BAJapplicationInCompaniesORBranches;
	}

	@FindBy(xpath = "//input[@id='ROOT__1__branchGrid_hasRestrictionYN_ctsRestBranchesTreeGridTbl_Id_UR00M']")
	private WebElement CSMSADS1BAJApplicationCheckboxInCompaniesORBranches;

	public WebElement CSMSADS1BAJApplicationCheckboxInCompaniesORBranches() {
		return CSMSADS1BAJApplicationCheckboxInCompaniesORBranches;
	}

	@FindBy(id = "userGridId_UR00M_gs_usrVO.USER_ID")
	private WebElement CSMSADS_EnterTheUserIDInUserIDTab;

	public WebElement CSMSADS_EnterTheUserIDInUserIDTab() {
		return CSMSADS_EnterTheUserIDInUserIDTab;
	}

	@FindBy(xpath = "//td[text()='RAZIA']")
	private WebElement CSMSADS_UserIDCheckbox;

	public WebElement CSMSADSUserIDCheckbox() {
		return CSMSADS_UserIDCheckbox;
	}

	@FindBy(id = "add_restrictionsGridTbl_Id_UR00M")
	private WebElement CSMSADS_AddButtonInRestrictionType;

	public WebElement CSMSADS_AddButtonInRestrictionType() {
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

	@FindBy(id = "add_cifGridId_UR00M")
	private WebElement CSMSADS_AddButtonUnderRestrictionType;

	public WebElement CSMSADS_AddButtonUnderRestrictionType() {
		return CSMSADS_AddButtonUnderRestrictionType;
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

	@FindBy(id = "UR00P")
	private WebElement CSMSADS_ApproveUnderAccountRestrictions;

	public WebElement CSMSADSApproveUnderAccountRestrictions() {
		return CSMSADS_ApproveUnderAccountRestrictions;
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

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMSADS_ClickOkButtonInSuccessPopUpMenu;

	public WebElement CSMSADSClickOkButtonInSuccessPopUpMenu() {
		return CSMSADS_ClickOkButtonInSuccessPopUpMenu;
	}

	@FindBy(id = "td_userGridId_UR00M_1_usrVO.USER_ID")
	private WebElement CSMSADS_UserIDName;

	public WebElement CSMSADSUserIDName() {
		return CSMSADS_UserIDName;
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

	// id="td_userListGridTbl_Id_P005M_1_usrVO.USER_ID"
	@FindBy(xpath = "//td[text()='RAZIA']")
	private WebElement CSMSADS_SearchedIDUnderMaintenanceScreen;

	public WebElement CSMSADSSearchedIDUnderMaintenanceScreen() {
		return CSMSADS_SearchedIDUnderMaintenanceScreen;
	}

	@FindBy(xpath = "//span[@id='spanLookup_CIF_NO_P005M']") // spanLookup_CIF_NO_P005M
	private WebElement CSMSADS_SearchButtonInEmployeeDetails;

	public WebElement CSMSADSSearchButtonInEmployeeDetails() {
		return CSMSADS_SearchButtonInEmployeeDetails;
	}

	@FindBy(id = "gridtab_CIF_NO_P005M_gs_CIF_NO") // input[@id='lookuptxt_CIF_NO_P005M']")
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

	// ******************************************* SADS (SYSADM1) @TSA_150_1
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

	// core xpath
	@FindBy(xpath = "	//span [text()='360 Degrees view']")
	private WebElement CSM_360_Degree_viewflag;

	public WebElement CSM360Degreeviewflag() {
		return CSM_360_Degree_viewflag;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement CSM_360_Degree_viewflag_warningpop;

	public WebElement CSM360Degreeviewflagwarningpop() {
		return CSM_360_Degree_viewflag_warningpop;
	}

	@FindBy(xpath = "//input[@name='dashboardCO.cifVO.CIF_NO']")
	private WebElement CSM_360_Degree_viewflag_Cifno;

	public WebElement CSM360Degree_viewflagCifno() {
		return CSM_360_Degree_viewflag_Cifno;
	}

	@FindBy(xpath = "//div[text()='[902863] You Have No Access To View Accounts Details Related To This CIF']")
	private WebElement CSM_360_Degree_viewflag_AccessDeniedpop;

	public WebElement CSM_360_Degree_viewflag_AccessDeniedpop() {
		return CSM_360_Degree_viewflag_AccessDeniedpop;
	}

	@FindBy(xpath = "//a[text()='360 Degrees view']")
	private WebElement CSM_360_Degree_Randomclk;

	public WebElement CSM_360_Degree_Randomclk() {
		return CSM_360_Degree_Randomclk;
	}

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

	@FindBy(xpath = "//input[@id='lookuptxt_CIF_NO_P005M']")
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

	// .transaction

	@FindBy(id = "lookuptxt_trx_type_D001MT")
	private WebElement CSM_TRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen() {
		return CSM_TRXTypeInMaintenanceScreen;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement CSM_BranchCodeInCreditAcc;

	public WebElement CSMBranchCodeInCreditAcc() {
		return CSM_BranchCodeInCreditAcc;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement CSM_CurrencyCodeCreditAcc;

	public WebElement CSMCurrencyCodeCreditAcc() {
		return CSM_CurrencyCodeCreditAcc;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSM_GLCodeCreditAcc;

	public WebElement CSMGLCodeCreditAcc() {
		return CSM_GLCodeCreditAcc;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement CSM_CIFCodeInCreditAcc;

	public WebElement CSMCIFCodeInCreditAcc() {
		return CSM_CIFCodeInCreditAcc;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSM_SerialInCreditAcc;

	public WebElement CSMSerialInCreditAcc() {
		return CSM_SerialInCreditAcc;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement controlRecordInSystemParameters;

	public WebElement controlRecordInSystemParameters() {
		return controlRecordInSystemParameters;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement updateAfterApproveButtonInControlRecord;

	public WebElement updateAfterApproveButtonInControlRecord() {
		return updateAfterApproveButtonInControlRecord;
	}

	@FindBy(xpath = "//a[text()=' Alert Activation ']")
	private WebElement alertActivationButton;

	public WebElement alertActivationButton() {
		return alertActivationButton;
	}

	// (//span[text()='Account Balance Overdrawn'])[1]//ancestor::td/div/div
	@FindBy(xpath = "//tr[@id='TRX']//span")
	private WebElement maximizeFlagInAlertActivation;

	public WebElement maximizeFlagInAlertActivation() {
		return maximizeFlagInAlertActivation;
	}

	@FindBy(id = "td_tab4_GridTbl_Id_O001UP_33_CUSTOM_FIELD")
	private WebElement staffAccountsTransactionFlag;

	public WebElement staffAccountsTransactionFlag() {
		return staffAccountsTransactionFlag;
	}

	@FindBy(id = "tab4_GridTbl_Id_O001UP")
	private WebElement staffAccountsTransactionFlagCheckBox;

	public WebElement staffAccountsTransactionFlagCheckBox() {
		return staffAccountsTransactionFlagCheckBox;
	}

	@FindBy(xpath = "//span[contains(text(),'Staff Accounts Transaction')]//parent::td")

	private WebElement alertActivationTab_StaffAccountTransactions;

	public WebElement alertActivationTabStaffAccountTransactions() {

		return alertActivationTab_StaffAccountTransactions;

	}

	@FindBy(xpath = "//a[@id='O001P']//span[text()='Approve']")
	private WebElement csmParam_Approve;

	public WebElement csmParamApprove() {
		return csmParam_Approve;
	}

	@FindBy(xpath = "//span[text()='Bulk Remittance']")
	private WebElement bulkRemittance_Transaction;

	public WebElement bulkRemittance_Transaction() {
		return bulkRemittance_Transaction;
	}

	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement bulkRemittanceType_Transaction;

	public WebElement bulkRemittanceType_Transaction() {
		return bulkRemittanceType_Transaction;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001RE']")
	private WebElement TrxType_Transaction;

	public WebElement TrxType_Transaction() {
		return TrxType_Transaction;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001RE']")
	private WebElement Currencycode_CustomberAccount_Transaction;

	public WebElement Currencycode_CustomberAccount_Transaction() {
		return Currencycode_CustomberAccount_Transaction;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001RE']")
	private WebElement Glcode_CustomberAccount_Transaction;

	public WebElement Glcode_CustomberAccount_Transaction() {
		return Glcode_CustomberAccount_Transaction;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001RE']")
	private WebElement cifcode_CustomberAccount_Transaction;

	public WebElement cifcode_CustomberAccount_Transaction() {
		return cifcode_CustomberAccount_Transaction;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001RE']")
	private WebElement serial_CustomberAccount_Transaction;

	public WebElement serial_CustomberAccount_Transaction() {
		return serial_CustomberAccount_Transaction;
	}

	@FindBy(xpath = "//div[contains(text(), 'User does not have access to make a Transaction on his own Account')]")
	private WebElement popup_validation;

	public WebElement popup_validation() {
		return popup_validation;
	}

	@FindBy(xpath = "//select[@id='and_or_UR00M']")
	private WebElement OrRestriction;

	public WebElement OrRestriction() {
		return OrRestriction;
	}

	@FindBy(xpath = "(//td[@id=\"td_cifTypeGridId_UR00M_1_CIF_TYPE\"]//following::span//span)[1]")
	private WebElement ciftype_search;

	public WebElement ciftype_search() {
		return ciftype_search;
	}

	@FindBy(xpath = "//td[@id='add_cifTypeGridId_UR00M']")
	private WebElement ciftype_Addbtn;

	public WebElement ciftype_Addbtn() {
		return ciftype_Addbtn;
	}

	@FindBy(xpath = "//input[@name='TYPE_CODE']")
	private WebElement Enter_ciftype;

	public WebElement Enter_ciftype() {
		return Enter_ciftype;
	}

	@FindBy(xpath = "(//td[text()='6868'])[1]")
	private WebElement Doubletab_ciftype;

	public WebElement Doubletab_ciftype() {
		return Doubletab_ciftype;
	}

	@FindBy(xpath = "//input[@name='TYPE_CODE']")
	private WebElement Enter_Ciftype;

	public WebElement Enter_Ciftype() {

		return Enter_Ciftype;

	}

	@FindBy(xpath = "//td[text()='Dues Management']")
	private WebElement CSM_DuesManagement;

	public WebElement CSM_DuesManagement() {
		return CSM_DuesManagement;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSM_DuesManagement_maintenance;

	public WebElement CSM_DuesManagement_maintenance() {
		return CSM_DuesManagement_maintenance;
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

	// Account detail add
	@FindBy(xpath = "//label[text()='Account Details ']")
	private WebElement CSM_AccountDetailsInMaintenanceScreen;

	public WebElement CSM_AccountDetailsInMaintenanceScreen() {
		return CSM_AccountDetailsInMaintenanceScreen;
	}

	@FindBy(id = "add_trxMgntAccountDtlGridTbl_Id_D001MT")
	private WebElement CSM_addbtn_AccountDetails;

	public WebElement CSM_addbtn_AccountDetails() {
		return CSM_addbtn_AccountDetails;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']")
	private WebElement Transaction_maintenance_AccountdetailsButton_plusicon_tableclick;

	public WebElement TransactionmaintenanceAccountdetailsButtonplusicontableclick() {
		return Transaction_maintenance_AccountdetailsButton_plusicon_tableclick;

	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']//input")
	private WebElement CSM_addbtn_Branch;

	public WebElement CSM_addbtn_Branch() {
		return CSM_addbtn_Branch;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']//input")
	private WebElement CSM_addbtn_Gl;

	public WebElement CSM_addbtn_Gl() {
		return CSM_addbtn_Gl;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF']//input")
	private WebElement CSM_addbtn_Cif;

	public WebElement CSM_addbtn_Cif() {
		return CSM_addbtn_Cif;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL']")
	private WebElement CSM_addbtn_Sl;

	public WebElement CSM_addbtn_Sl() {
		return CSM_addbtn_Sl;
	}

	//
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.FC_AMOUNT']//input")
	private WebElement CSM_addbtn_Amount;

	public WebElement CSM_addbtn_Amount() {
		return CSM_addbtn_Amount;
	}

	// @FindBy(id="new_1685338823692_ctstrsACCDETVO.INSTRUCTIONS1")
	// private WebElement CSM_addbtn_instr1;
	//
	// public WebElement CSM_addbtn_instr1() {
//			return CSM_addbtn_instr1;
	// }
	// @FindBy(id="new_1685338823692_ctstrsACCDETVO.INSTRUCTIONS2")
	// private WebElement CSM_addbtn_instr2;
	//
	// public WebElement CSM_addbtn_instr2() {
//			return CSM_addbtn_instr2;
	// }
	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']//span")
	private WebElement CSM_addbtn_ok;

	public WebElement CSM_addbtn_ok() {
		return CSM_addbtn_ok;
	}

	@FindBy(id = "amount_D001MT")
	private WebElement CSM_AmountUnderMaintenanceScreen;

	public WebElement CSMAmountUnderMaintenanceScreen() {
		return CSM_AmountUnderMaintenanceScreen;
	}

	@FindBy(xpath = "//div[text()='Success']//following::div//following::div//child::div")
	private WebElement CSM_GetTheTransactionNo;

	public WebElement CSMGetTheTransactionNo() {
		return CSM_GetTheTransactionNo;
	}

	@FindBy(id = "D001AU")
	private WebElement CSM_ApproveScreenUnderTransactions;

	public WebElement CSMApproveScreenUnderTransactions() {
		return CSM_ApproveScreenUnderTransactions;
	}

	@FindBy(id = "trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_TransactionNoInApproveScreen;

	public WebElement CSMTransactionNoInApproveScreen() {
		return CSM_TransactionNoInApproveScreen;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_DoubleClickOnTheTransactionNo;

	public WebElement CSMDoubleClickOnTheTransactionNo() {
		return CSM_DoubleClickOnTheTransactionNo;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement CSM_ApproveButtonInApproveScreen;

	public WebElement CSMApproveButtonInApproveScreen() {
		return CSM_ApproveButtonInApproveScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation() {
		return CSM_OkButtonInSuccessPopUpMenuForTranscation;
	}

	@FindBy(xpath = "//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Economic Sector: Limit Amount should be between 0.0  and 300')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement csm_transaction_warningpop_Economicsector_limitAmount;

	public WebElement csm_transaction_warningpop_Economicsector_limitAmount_118() {
		return csm_transaction_warningpop_Economicsector_limitAmount;
	}

	// @FindBy(xpath="//div[text()='Cannot
	// Proceed']//parent::div//following-sibling::div//div[contains(text(),'Economic
	// Sector: Limit Amount should be between 0.0 and
	// 300')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	// private WebElement Csm_maintenance_cannotproceedpop ;
	//
	// public WebElement Csm_maintenance_cannotproceedpop_117() {
	// return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
	// }

	@FindBy(xpath = "//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Currency: Limit Amount should be between 0.0  and 300.00')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_CurrencyLimit_pop_ok;

	public WebElement CSM_CurrencyLimit_pop_ok() {
		return CSM_CurrencyLimit_pop_ok;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement CSM_cannotproceed_msg;

	public WebElement CSM_cannotproceed_msg117() {
		return CSM_cannotproceed_msg;
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

	// debit
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

	//// param prerequites
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

	@FindBy(xpath = "//select[@id='view_show_recieve_E000MA']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch() {
		return csmParam_User_Userid_doubleclick_logintobranch;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement success_ok;

	public WebElement success_ok() {
		return success_ok;
	}
	// check if the retrive button is in the field

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmparam_Transactiontype_UPA_Confirm_success69;

	public WebElement csmparam_Transactiontype_UPA_Confirm_success69() {
		return csmparam_Transactiontype_UPA_Confirm_success69;
	}

	// span[text()='Approve']
	@FindBy(xpath = "//a[@id='E000P']//span[text()='Approve']")
	private WebElement csmParam_User_Approve;

	public WebElement csmParam_User_Approve() {
		return csmParam_User_Approve;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement csmParam_User_Approvebttn;

	public WebElement csmParam_User_Approvebttn() {
		return csmParam_User_Approvebttn;
	}

	// id="td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID"

	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID']")
	private WebElement csmParam_User_Approve_Username_doubleclick;

	public WebElement csmParam_User_Approve_Username_doubleclick() {
		return csmParam_User_Approve_Username_doubleclick;
	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")
	private WebElement csmParam_User_Approve_Username_doubleclick2;

	public WebElement csmParam_User_Approve_Username_doubleclick2() {
		return csmParam_User_Approve_Username_doubleclick2;
	}

	@FindBy(id = "tellerParamMaint_FormId_E000P_Approve_key")
	private WebElement csmParam_User_Approve_Username_doubleclick_Approve;

	public WebElement csmParam_User_Approve_Username_doubleclick_Approve() {
		return csmParam_User_Approve_Username_doubleclick_Approve;
	}

	@FindBy(xpath = "//span[text()=' Limits ']")
	private WebElement csm_sysparam_user_updateafterapprove_Limits;

	public WebElement csm_sysparam_user_updateafterapprove_Limits() {
		return csm_sysparam_user_updateafterapprove_Limits;
	}

	@FindBy(id = "add_tab3_C_GridTbl_Id_E000MA")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn;
	}

	@FindBy(id = "td_tab3_C_GridTbl_Id_E000MA_0_rn")
	private WebElement limits_retriveTheRecord;

	public WebElement limits_retriveTheRecord() {
		return limits_retriveTheRecord;
	}

	@FindBy(xpath = "//td[@id='del_tab3_C_GridTbl_Id_E000MA']")
	private WebElement limits_DeleteButton;

	public WebElement limits_DeleteButton() {
		return limits_DeleteButton;
	}

	@FindBy(xpath = "(//input[@role='livesearch'])[1]")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_currency;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_currency() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_currency;
	}

	@FindBy(xpath = "(//input[@role='livesearch'])[2]")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx;
	}

	// (//td[@id='td_tab3_C_GridTbl_Id_E000MA_1_TRX_DESC'])[2]//following-sibling::td[1]//input
	@FindBy(xpath = "//td[@tdlabel='W/D Limit']//input")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits;
	}

	@FindBy(xpath = "//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Warn User If Limit Exceed']/input")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check;
	}

	@FindBy(xpath = "//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Proceed If Limit Exceed']//input")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_ok;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_ok() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_ok;
	}

	// 029 param

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

	@FindBy(xpath = "//a[@id='P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPAField;

	public WebElement csmParam_AccountParameters_AccountTypes_UPAField() {
		return csmParam_AccountParameters_AccountTypes_UPAField;
	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode;
	}

	// td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']
	@FindBy(xpath = "(//td[text()='96145'])[1]")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;
	}

	@FindBy(xpath = "//div[@id='instructionsColl_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions() {
		return csmParam_AccountParameters_AccountTypes_Instructions;
	}

	@FindBy(xpath = "//input[@id='allow_overdrawn_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag() {
		return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017MA_Update_After_Approve_key']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton() {
		return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton;
	}

	@FindBy(xpath = "//a[@id='P017P']//span[2]")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField() {
		return csmParam_AccountParameters_AccountTypes_ApproveField;
	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode;
	}

	@FindBy(xpath = "//td[@id='td_acctypeList_GridTbl_Id_P017P_1_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017P_Approve_key']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Amount Exceeds')]")
	private WebElement AmountExceedsWarningPopUp;

	public WebElement AmountExceedsWarningPopUp() {
		return AmountExceedsWarningPopUp;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement csmParam_Transactiontype;

	public WebElement csmParam_Transactiontype() {
		return csmParam_Transactiontype;
	}

	@FindBy(xpath = "//a[@id='P024MA']")
	private WebElement csmParam_Transactiontype_Updateafterapprovefield;

	public WebElement csmParam_Transactiontype_Updateafterapprovefield() {
		return csmParam_Transactiontype_Updateafterapprovefield;
	}

//					@FindBy(xpath = "//*[@id=\"transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE\"]")
//					private WebElement csmParam_Transactiontype_inputfield ;
//					public WebElement csmParam_Transactiontype_inputfield() {
//					return csmParam_Transactiontype_inputfield;
//					}
//					

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_inputfield_doubleclick;

	public WebElement csmParam_Transactiontype_inputfield_doubleclick() {
		return csmParam_Transactiontype_inputfield_doubleclick;
	}

	@FindBy(xpath = "//input[@id=\"proceed_on_insuff_fund_P024MA\"]")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds() {
		return csmParam_Transactiontype_proceedoninsufficentfunds;
	}

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement csmParam_Transactiontype_Forceoverdrawn;

	public WebElement csmParam_Transactiontype_Forceoverdrawn() {
		return csmParam_Transactiontype_Forceoverdrawn;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton() {
		return csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton;
	}

	// @FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	// private WebElement
	// csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton_Ok ;
	//
	// public WebElement
	// csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton_Ok() {
	// return csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton_Ok;
	// }
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
	// =@122

	@FindBy(xpath = "//a[@id='E000MA']")

	private WebElement updateAfterApproveInUser;

	public WebElement updateAfterApproveInUser()

	{

		return updateAfterApproveInUser;

	}

	@FindBy(xpath = "(//input[@name='USER_ID'])[2]")

	private WebElement userIdInApproveScreen;

	public WebElement userIdInApproveScreen()

	{

		return userIdInApproveScreen;

	}

	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID']")

	private WebElement doubleClickRecordInApproveScreen;

	public WebElement doubleClickRecordInApproveScreen()

	{

		return doubleClickRecordInApproveScreen;

	}

	@FindBy(xpath = "//td[@id='td_tab5_E_GridTbl_Id_E000MA_0_rn']")

	private WebElement selectRowForDeleteInEcoSector;

	public WebElement selectRowForDeleteInEcoSector()

	{

		return selectRowForDeleteInEcoSector;

	}

	@FindBy(xpath = "//td[@id='del_tab5_E_GridTbl_Id_E000MA']")

	private WebElement deleteButtonInEcoSector;

	public WebElement deleteButtonInEcoSector()

	{

		return deleteButtonInEcoSector;

	}

	@FindBy(xpath = "//span[text()='grant_all_key']")

	private WebElement grantallkey_InEcoSector;

	public WebElement grantallkey_InEcoSector()

	{

		return grantallkey_InEcoSector;

	}

	@FindBy(xpath = "//span[text()=' Limits ']")

	private WebElement limitsButtonInUpdateAfterApprove;

	public WebElement limitsButtonInUpdateAfterApprove()

	{

		return limitsButtonInUpdateAfterApprove;

	}

	@FindBy(xpath = "//td[@id='add_tab3_C_GridTbl_Id_E000MA']")

	private WebElement addIconInUpdateAfterApprove;

	public WebElement addIconInUpdateAfterApprove()

	{

		return addIconInUpdateAfterApprove;

	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerlimitVO.CY_CODE']")

	private WebElement accountCurrencyInUpdateAfterApprove;

	public WebElement accountCurrencyInUpdateAfterApprove()

	{

		return accountCurrencyInUpdateAfterApprove;

	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerlimitVO.TRX_TYPE']")

	private WebElement transactionBoxInUpdateAfterApprove;

	public WebElement transactionBoxInUpdateAfterApprove()

	{

		return transactionBoxInUpdateAfterApprove;

	}

	@FindBy(xpath = "//td[@tdlabel='W/D Limit']//input")

	private WebElement withdrawalLimitInUpdateAfterApprove;

	public WebElement withdrawalLimitInUpdateAfterApprove()

	{

		return withdrawalLimitInUpdateAfterApprove;

	}

	@FindBy(xpath = "//td[@tdlabel='Deposit Limit']//input")

	private WebElement depositLimitInUpdateAfterApprove;

	public WebElement depositLimitInUpdateAfterApprove()

	{

		return depositLimitInUpdateAfterApprove;

	}

	@FindBy(xpath = "//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Warn User If Limit Exceed']/input")

	private WebElement warnUserIfLimitExceedFlagInUpdateAfterApprove;

	public WebElement warnUserIfLimitExceedFlagInUpdateAfterApprove()

	{

		return warnUserIfLimitExceedFlagInUpdateAfterApprove;

	}

	@FindBy(xpath = "//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Proceed If Limit Exceed']//input")

	private WebElement proceedIfLimitExceedFlagInUpdateAfterApprove;

	public WebElement proceedIfLimitExceedFlagInUpdateAfterApprove()

	{

		return proceedIfLimitExceedFlagInUpdateAfterApprove;

	}

	// confirmOkButton()

	@FindBy(xpath = "//span[text()='Ok']")

	private WebElement okButtonInUpdateAfterApprove;

	public WebElement okButtonInUpdateAfterApprove()

	{

		return okButtonInUpdateAfterApprove;

	}

	@FindBy(id = "tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")

	private WebElement userIdInApprove;

	public WebElement userIdInApprove()

	{

		return userIdInApprove;

	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")

	private WebElement doubleClickUserIdInApprove;

	public WebElement doubleClickUserIdInApprove()

	{

		return doubleClickUserIdInApprove;

	}

	// TRS_122

	@FindBy(xpath = "//span[text()=' Eco Sector ']")

	private WebElement ecoSectorInUpdateAfterApprove;

	public WebElement ecoSectorInUpdateAfterApprove()

	{

		return ecoSectorInUpdateAfterApprove;

	}

	@FindBy(id = "add_tab5_E_GridTbl_Id_E000MA")

	private WebElement addIconInEcoSectorLimit;

	public WebElement addIconInEcoSectorLimit()

	{

		return addIconInEcoSectorLimit;

	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.CIF_TYPE']")

	private WebElement ecoSectorLimit;

	public WebElement ecoSectorLimit()

	{

		return ecoSectorLimit;

	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.TRX_TYPE']")

	private WebElement transactionInEcoSectorLimit;

	public WebElement transactionInEcoSectorLimit()

	{

		return transactionInEcoSectorLimit;

	}

	// withdrawalLimitInUpdateAfterApprove

	// depositLimitInUpdateAfterApprove

	@FindBy(xpath = "//td[@tdlabel='Overdraw Limit']//input")

	private WebElement overdrawLimitInUpdateAfterApprove;

	public WebElement overdrawLimitInUpdateAfterApprove()

	{

		return overdrawLimitInUpdateAfterApprove;

	}

	@FindBy(xpath = "//td[@tdlabel='Local Approval Limit']//input")

	private WebElement localApprovalLimitLimitInUpdateAfterApprove;

	public WebElement localApprovalLimitLimitInUpdateAfterApprove()

	{

		return localApprovalLimitLimitInUpdateAfterApprove;

	}

	@FindBy(xpath = "	//div[contains(text(),'Saved Successfully')]//following::input")

	private WebElement getTransactionOkPop;

	public WebElement getTransactionOkPop()

	{

		return getTransactionOkPop;

	}

	@FindBy(xpath = "//span[text()='Delete All']")

	private WebElement ecoSectorInUpdateAfterApprove_DeleteAll;

	public WebElement ecoSectorInUpdateAfterApprove_DeleteAll()

	{

		return ecoSectorInUpdateAfterApprove_DeleteAll;

	}

//					@FindBy(xpath="(//input[@name='trxMgntCO.ctstrsVO.BRANCH_CODE'])[2]")
//					private WebElement CSM_Transaction_TellerAC_Branchinput;
//					public WebElement CSM_Transaction_TellerAC_Branchinput() {
//						return CSM_Transaction_TellerAC_Branchinput;
//					}
//					
//					@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.CTRL_CY']")
//					private WebElement CSM_Transaction_TellerAc_Currencyinput;
//					public WebElement CSM_Transaction_TellerAc_Currencyinput() {
//						return CSM_Transaction_TellerAc_Currencyinput;
//					}
//					@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.CTRL_GL']")
//					private WebElement CSM_Transaction_TellerAc_Glinput;
//					public WebElement CSM_Transaction_TellerAc_Glinput() {
//						return CSM_Transaction_TellerAc_Glinput;
//					}
//					
//					@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.CTRL_CIF']")
//					private WebElement CSM_Transaction_TellerAc_Cifinput;
//					public WebElement CSM_Transaction_TellerAc_Cifinput() {
//						return CSM_Transaction_TellerAc_Cifinput;
//					}
//					@FindBy(xpath="//input[@id='lookuptxt_ctrl_sl_D001MT']")
//					private WebElement CSM_Transaction_TellerAc_Serialinput;
//					public WebElement CSM_Transaction_TellerAc_Serialinput() {
//						return CSM_Transaction_TellerAc_Serialinput;
//					}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement CSM_BranchCodeInCreditAcMInput;

	public WebElement CSM_BranchCodeInCreditAcMInput() {
		return CSM_BranchCodeInCreditAcMInput;

	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
	private WebElement CSM_CurrencyCodeCreditAcInput;

	public WebElement CSM_CurrencyCodeCreditAcInput() {
		return CSM_CurrencyCodeCreditAcInput;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_GL']")
	private WebElement CSM_GLCodeCreditAcInput;

	public WebElement CSM_GLCodeCreditAcInput() {
		return CSM_GLCodeCreditAcInput;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CSM_CIFCodeInCreditAcInput;

	public WebElement CSM_CIFCodeInCreditAcInput() {
		return CSM_CIFCodeInCreditAcInput;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSM_SerialInCreditAcInput;

	public WebElement CSM_SerialInCreditAcInput() {
		return CSM_SerialInCreditAcInput;
	}

	@FindBy(xpath = "//span[text()='Remove Tab']")
	private WebElement csmParam_User_UPA_CloseIcon;

	public WebElement csmParam_User_UPA_CloseIcon() {
		return csmParam_User_UPA_CloseIcon;
	}

	@FindBy(xpath = "//span[text()='Transactions']//parent::td/div/div")
	private WebElement csmParam_controlRecord_AlertActivation_Transaction;

	public WebElement csmParam_controlRecord_AlertActivation_Transaction() {
		return csmParam_controlRecord_AlertActivation_Transaction;
	}

	// deveshTc

	// Parameters Menu
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmSads_parameters_MenuOption;

	public WebElement csmSads_parameters_MenuOption() {
		return csmSads_parameters_MenuOption;
	}

	// User
	@FindBy(xpath = "//td[text()='User']")
	private WebElement csmSads_parameters_User;

	public WebElement csmSads_parameters_User() {
		return csmSads_parameters_User;
	}

	// Maintenance under User
	@FindBy(xpath = "//a[@id='P005M']/span[2]")
	private WebElement parameters_User_Maintenance;

	public WebElement parameters_User_Maintenance() {
		return parameters_User_Maintenance;
	}

	// Approve under User
	@FindBy(xpath = "//a[@id='P005M']/span[2]")
	private WebElement parameters_User_Approve;

	public WebElement parameters_User_Approve() {
		return parameters_User_Approve;
	}

	// Search Button
	@FindBy(xpath = "//a[@id='infoBarSearchButton_P005M']")
	private WebElement user_Maintenance_SearchButton;

	public WebElement user_Maintenance_SearchButton() {
		return user_Maintenance_SearchButton;
	}

	// Search Button under approve
	@FindBy(xpath = "//a[@id='infoBarSearchButton_P005P']")
	private WebElement user_Approve_SearchButton;

	public WebElement user_Approve_SearchButton() {
		return user_Approve_SearchButton;
	}

	// user id input
	@FindBy(xpath = "//input[@id='userListGridTbl_Id_P005M_gs_usrVO.USER_ID']")
	private WebElement user_Maintenance_UserID;

	public WebElement user_Maintenance_UserID() {
		return user_Maintenance_UserID;
	}

	// user id input under approve
	@FindBy(xpath = "//input[@id='userListGridTbl_Id_P005P_gs_usrVO.USER_ID']")
	private WebElement user_Approve_UserID;

	public WebElement user_Approve_UserID() {
		return user_Approve_UserID;
	}

	// first row user id
	@FindBy(xpath = "//td[@id='td_userListGridTbl_Id_P005M_1_usrVO.USER_ID']")
	private WebElement user_Maintenance_FirstRowUserID;

	public WebElement user_Maintenance_FirstRowUserID() {
		return user_Maintenance_FirstRowUserID;
	}

	// first row user id under approve
	@FindBy(xpath = "//td[@id='td_userListGridTbl_Id_P005P_1_usrVO.USER_ID']")
	private WebElement user_Approve_FirstRowUserID;

	public WebElement user_Approve_FirstRowUserID() {
		return user_Approve_FirstRowUserID;
	}

	// company
	@FindBy(xpath = "//input[@id='lookuptxt_COMP_CODE_P005M']")
	private WebElement user_Maintenance_Company;

	public WebElement user_Maintenance_Company() {
		return user_Maintenance_Company;
	}

	// company Lookup Button
	@FindBy(xpath = "//span[@id='spanLookup_COMP_CODE_P005M']")
	private WebElement user_Maintenance_CompanyLookupButton;

	public WebElement user_Maintenance_CompanyLookupButton() {
		return user_Maintenance_CompanyLookupButton;
	}

	// company code Lookup input
	@FindBy(xpath = "//input[@id='gridtab_COMP_CODE_P005M_gs_COMP_CODE']")
	private WebElement user_Maintenance_CompanyCodeInputLookup;

	public WebElement user_Maintenance_CompanyCodeInputLookup() {
		return user_Maintenance_CompanyCodeInputLookup;
	}

	// branch
	@FindBy(xpath = "//input[@id='lookuptxt_BRANCH_CODE_P005M']")
	private WebElement user_Maintenance_BranchCode;

	public WebElement user_Maintenance_BranchCode() {
		return user_Maintenance_BranchCode;
	}

	// Branch code Lookup Button
	@FindBy(xpath = "//span[@id='spanLookup_BRANCH_CODE_P005M']/span")
	private WebElement user_Maintenance_BranchCodeLookupButton;

	public WebElement user_Maintenance_BranchCodeLookupButton() {
		return user_Maintenance_BranchCodeLookupButton;
	}

	// Branch code Lookup input
	@FindBy(xpath = "//input[@id='gridtab_BRANCH_CODE_P005M_gs_BRANCH_CODE']")
	private WebElement user_Maintenance_BranchCodeInputLookup;

	public WebElement user_Maintenance_BranchCodeInputLookup() {
		return user_Maintenance_BranchCodeInputLookup;
	}

	// cif no lookup button
	@FindBy(xpath = "//span[@id='spanLookup_CIF_NO_P005M']")
	private WebElement user_Maintenance_CifNoLookupButton;

	public WebElement user_Maintenance_CifNoLookupButton() {
		return user_Maintenance_CifNoLookupButton;
	}

	// cif no input search
	@FindBy(xpath = "//input[@id='gridtab_CIF_NO_P005M_gs_CIF_NO']")
	private WebElement user_Maintenance_CifNoInputSearch;

	public WebElement user_Maintenance_CifNoInputSearch() {
		return user_Maintenance_CifNoInputSearch;
	}

	// Approve button under User approve
	@FindBy(xpath = "//button[@id='userMaint_approve_P005P']")
	private WebElement user_Approve_ApproveButton;

	public WebElement user_Approve_ApproveButton() {
		return user_Approve_ApproveButton;
	}

	// save button under User maintenance
	@FindBy(xpath = "//button[@id='userMaint_save_P005M']")
	private WebElement user_Maintenance_SaveButton;

	public WebElement user_Maintenance_SaveButton() {
		return user_Maintenance_SaveButton;
	}

	// Transactions Menu
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement transactions_MenuOption;

	public WebElement transactions_MenuOption() {
		return transactions_MenuOption;
	}

	// Transaction Maintenance
	@FindBy(xpath = "//a[@id='D001MT']/span[text()='Maintenance']")
	private WebElement transactions_Maintenance;

	public WebElement transactions_Maintenance() {
		return transactions_Maintenance;
	}

	// Transaction Search button
	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement transactions_SearchButton;

	public WebElement transactions_SearchButton() {
		return transactions_SearchButton;
	}

	// Trx type input field
	@FindBy(xpath = "//input[@id='gridtab_trx_type_D001MT_gs_CODE']")
	private WebElement transactions_TrxTypeCode;

	public WebElement transactions_TrxTypeCode() {
		return transactions_TrxTypeCode;
	}

	// Trx type lookup button
	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']/span")
	private WebElement transactions_TrxType_LookupButton;

	public WebElement transactions_TrxType_LookupButton() {
		return transactions_TrxType_LookupButton;
	}

	// credit account details lookup button
	@FindBy(xpath = "//span[@id='spanLookup_trs_ac_sl_D001MT']/span")
	private WebElement transactions_Maintenance_CreditAccountLookupButton;

	public WebElement transactions_Maintenance_CreditAccountLookupButton() {
		return transactions_Maintenance_CreditAccountLookupButton;
	}

	// credit account details lookup button
	@FindBy(xpath = "//span[@id='spanLookup_trs_ac_sl_D001MT']/span")
	private WebElement transactions_Maintenance_FromAccountLookupButton;

	public WebElement transactions_Maintenance_FromAccountLookupButton() {
		return transactions_Maintenance_FromAccountLookupButton;
	}

	// Debit A/c Currency code
	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement transactions_Maintenance_FromCurrencyCode;

	public WebElement transactions_Maintenance_FromCurrencyCode() {
		return transactions_Maintenance_FromCurrencyCode;
	}

	// To A/c Currency code
	@FindBy(xpath = "//input[@id='ctrl_cy_D001MT']")
	private WebElement transactions_Maintenance_ToCurrencyCode;

	public WebElement transactions_Maintenance_ToCurrencyCode() {
		return transactions_Maintenance_ToCurrencyCode;
	}

	// Debit A/c GL code
	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement transactions_Maintenance_GlCode;

	public WebElement transactions_Maintenance_GlCode() {
		return transactions_Maintenance_GlCode;
	}

	// To A/c GL code
	@FindBy(xpath = "//input[@id='ctrl_gl_D001MT']")
	private WebElement transactions_Maintenance_ToGlCode;

	public WebElement transactions_Maintenance_ToGlCode() {
		return transactions_Maintenance_ToGlCode;
	}

	// Debit A/c CIF No
	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement transactions_Maintenance_CifNo;

	public WebElement transactions_Maintenance_CifNo() {
		return transactions_Maintenance_CifNo;
	}

	// To A/c CIF No
	@FindBy(xpath = "//input[@id='ctrl_cif_D001MT']")
	private WebElement transactions_Maintenance_ToCifNo;

	public WebElement transactions_Maintenance_ToCifNo() {
		return transactions_Maintenance_ToCifNo;
	}

	// ViewMemo CloseButton
	@FindBy(xpath = "//span[text()='close']")
	private WebElement transactions_ViewMemoCloseButton;

	public WebElement transactions_ViewMemoCloseButton() {
		return transactions_ViewMemoCloseButton;
	}

	// Debit A/c Sl No
	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement transactions_Maintenance_SlNo;

	public WebElement transactions_Maintenance_SlNo() {
		return transactions_Maintenance_SlNo;
	}

	// From A/c Additional reference
	@FindBy(xpath = "//input[@id='lookuptxt_acc_additional_reference_D001MT']")
	private WebElement transactions_Maintenance_AdditionalRef;

	public WebElement transactions_Maintenance_AdditionalRef() {
		return transactions_Maintenance_AdditionalRef;
	}

	// To A/c Sl No
	@FindBy(xpath = "//input[@id='lookuptxt_ctrl_sl_D001MT']")
	private WebElement transactions_Maintenance_ToSlNo;

	public WebElement transactions_Maintenance_ToSlNo() {
		return transactions_Maintenance_ToSlNo;
	}

	// To account details lookup button
	@FindBy(xpath = "//span[@id='spanLookup_to_trs_ac_sl_D001MT']/span")
	private WebElement transactions_Maintenance_ToAccountLookupButton;

	public WebElement transactions_Maintenance_ToAccountLookupButton() {
		return transactions_Maintenance_ToAccountLookupButton;
	}

	// credit A/c branch code lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.BRANCH_CODE']")
	private WebElement transactions_Maintenance_BranchCodeLookupInput;

	public WebElement transactions_Maintenance_BranchCodeLookupInput() {
		return transactions_Maintenance_BranchCodeLookupInput;
	}

	// credit A/c currency lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.CURRENCY_CODE']")
	private WebElement transactions_Maintenance_CurrencyLookupInput;

	public WebElement transactions_Maintenance_CurrencyLookupInput() {
		return transactions_Maintenance_CurrencyLookupInput;
	}

	// credit A/c GL code lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.GL_CODE']")
	private WebElement transactions_Maintenance_GlCodeLookupInput;

	public WebElement transactions_Maintenance_GlCodeLookupInput() {
		return transactions_Maintenance_GlCodeLookupInput;
	}

	// credit A/c CIF lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.CIF_SUB_NO']")
	private WebElement transactions_Maintenance_CifLookupInput;

	public WebElement transactions_Maintenance_CifLookupInput() {
		return transactions_Maintenance_CifLookupInput;
	}

	// credit A/c Slno lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.SL_NO']")
	private WebElement transactions_Maintenance_SlNoLookupInput;

	public WebElement transactions_Maintenance_SlNoLookupInput() {
		return transactions_Maintenance_SlNoLookupInput;
	}

	// credit A/c Branch code first value
	@FindBy(xpath = "//td[@id='td_gridtab_trs_ac_sl_D001MT_1_amfVO.BRANCH_CODE']")
	private WebElement transactions_Maintenance_LookupFirstRecord;

	public WebElement transactions_Maintenance_LookupFirstRecord() {
		return transactions_Maintenance_LookupFirstRecord;
	}

	// Currency
	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement transactions_Maintenance_Currency;

	public WebElement transactions_Maintenance_Currency() {
		return transactions_Maintenance_Currency;
	}

	// Amount
	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement transactions_Maintenance_Amount;

	public WebElement transactions_Maintenance_Amount() {
		return transactions_Maintenance_Amount;
	}

	// Amount label
	@FindBy(xpath = "//label[@id='lbl_amount_D001MT']")
	private WebElement transactions_Maintenance_AmountLabel;

	public WebElement transactions_Maintenance_AmountLabel() {
		return transactions_Maintenance_AmountLabel;
	}

	// Debit A/c branch code lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.BRANCH_CODE']")
	private WebElement transactions_Maintenance_ToBranchCodeLookupInput;

	public WebElement transactions_Maintenance_ToBranchCodeLookupInput() {
		return transactions_Maintenance_ToBranchCodeLookupInput;
	}

	// Debit A/c currency lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.CURRENCY_CODE']")
	private WebElement transactions_Maintenance_ToCurrencyLookupInput;

	public WebElement transactions_Maintenance_ToCurrencyLookupInput() {
		return transactions_Maintenance_ToCurrencyLookupInput;
	}

	// Debit A/c GL code lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.GL_CODE']")
	private WebElement transactions_Maintenance_ToGlCodeLookupInput;

	public WebElement transactions_Maintenance_ToGlCodeLookupInput() {
		return transactions_Maintenance_ToGlCodeLookupInput;
	}

	// Debit A/c CIF lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.CIF_SUB_NO']")
	private WebElement transactions_Maintenance_ToCifLookupInput;

	public WebElement transactions_Maintenance_ToCifLookupInput() {
		return transactions_Maintenance_ToCifLookupInput;
	}

	// Debit A/c Slno lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.SL_NO']")
	private WebElement transactions_Maintenance_ToSlNoLookupInput;

	public WebElement transactions_Maintenance_ToSlNoLookupInput() {
		return transactions_Maintenance_ToSlNoLookupInput;
	}

	// Debit A/c Branch code first value
	@FindBy(xpath = "//td[@id='td_gridtab_to_trs_ac_sl_D001MT_1_amfVO.BRANCH_CODE']")
	private WebElement transactions_Maintenance_ToAccountLookupFirstRecord;

	public WebElement transactions_Maintenance_ToAccountLookupFirstRecord() {
		return transactions_Maintenance_ToAccountLookupFirstRecord;
	}

	// Save Button
	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement transactions_SaveButton;

	public WebElement transactions_SaveButton() {
		return transactions_SaveButton;
	}

	// Display message
	@FindBy(xpath = "//div[contains(text(),'Cannot Proceed, From ACC & To ACC are the same')]")
	private WebElement transactions_CannotProceedDisplayMessage;

	public WebElement transactions_CannotProceedDisplayMessage() {
		return transactions_CannotProceedDisplayMessage;
	}

	@FindBy(xpath = "//div[contains(text(),'[3089] User does not have access to make a Transaction on his own Account.')]")
	private WebElement transactions_CannotProceedDontHaveAccessToMakeTransactionOnOwnAccount;

	public WebElement transactions_CannotProceedDontHaveAccessToMakeTransactionOnOwnAccount() {
		return transactions_CannotProceedDontHaveAccessToMakeTransactionOnOwnAccount;
	}

	// New button
	@FindBy(xpath = "//a[@id='addNewGridRec_D001MT']")
	private WebElement transactions_Maintenance_NewButton;

	public WebElement transactions_Maintenance_NewButton() {
		return transactions_Maintenance_NewButton;
	}

	// Cannot Proceed ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement transactions_Maintenance_CannotProceedOkButton;

	public WebElement transactions_Maintenance_CannotProceedOkButton() {
		return transactions_Maintenance_CannotProceedOkButton;
	}

	// reload tab warning message
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement transactions_ReloadTabWarningMessageOkButton;

	public WebElement transactions_ReloadTabWarningMessageOkButton() {
		return transactions_ReloadTabWarningMessageOkButton;
	}

//					// Display message
//					@FindBy(xpath = "//div[text()='Cannot Proceed, From ACC & To ACC are the same']")
//					private WebElement transactions_CannotProceedDisplayMessage;
	//
//					public WebElement transactions_CannotProceedDisplayMessage() {
//						return transactions_CannotProceedDisplayMessage;
//					}

	// Bulk remittance
	@FindBy(xpath = "//a[@id='D001RE']/span[2]")
	private WebElement transactions_BulkRemittance;

	public WebElement transactions_BulkRemittance() {
		return transactions_BulkRemittance;
	}

	// Bulk remittance Type
	@FindBy(xpath = "//select[@id='bulkRemittanceType_D001RE']")
	private WebElement transactions_BulkRemittance_BulkRemittanceType;

	public WebElement transactions_BulkRemittance_BulkRemittanceType() {
		return transactions_BulkRemittance_BulkRemittanceType;
	}

	// Mode Of Payment
	@FindBy(xpath = "//select[@id='trsfr_method_D001RE']")
	private WebElement transactions_BulkRemittance_ModeOfPayment;

	public WebElement transactions_BulkRemittance_ModeOfPayment() {
		return transactions_BulkRemittance_ModeOfPayment;
	}

	// Trx Type
	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001RE']")
	private WebElement transactions_BulkRemittance_TrxType;

	public WebElement transactions_BulkRemittance_TrxType() {
		return transactions_BulkRemittance_TrxType;
	}

	// Remittance Type
	@FindBy(xpath = "//input[@id='lookuptxt_remittance_Type_D001RE']")
	private WebElement transactions_BulkRemittance_RemittanceType;

	public WebElement transactions_BulkRemittance_RemittanceType() {
		return transactions_BulkRemittance_RemittanceType;
	}

	// Account no lookup button
	@FindBy(xpath = "//span[@id='spanLookup_trs_ac_sl_D001RE']")
	private WebElement transactions_BulkRemittance_AccountNoLookupButton;

	public WebElement transactions_BulkRemittance_AccountNoLookupButton() {
		return transactions_BulkRemittance_AccountNoLookupButton;
	}

	// branch code lookup input text
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001RE_gs_amfVO.BRANCH_CODE']")
	private WebElement transactions_BulkRemittance_BranchCodeLookupinput;

	public WebElement transactions_BulkRemittance_BranchCodeLookupinput() {
		return transactions_BulkRemittance_BranchCodeLookupinput;
	}

	// branch code lookup first row
	@FindBy(xpath = "//td[@id='td_gridtab_trs_ac_sl_D001RE_1_amfVO.BRANCH_CODE']")
	private WebElement transactions_BulkRemittance_BranchCodeLookupFirstRow;

	public WebElement transactions_BulkRemittance_BranchCodeLookupFirstRow() {
		return transactions_BulkRemittance_BranchCodeLookupFirstRow;
	}

	// currency lookup input text
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001RE_gs_amfVO.CURRENCY_CODE']")
	private WebElement transactions_BulkRemittance_CurrencyLookupinput;

	public WebElement transactions_BulkRemittance_CurrencyLookupinput() {
		return transactions_BulkRemittance_CurrencyLookupinput;
	}

	// Gl code lookup input text
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001RE_gs_amfVO.GL_CODE']")
	private WebElement transactions_BulkRemittance_GlCodeLookupinput;

	public WebElement transactions_BulkRemittance_GlCodeLookupinput() {
		return transactions_BulkRemittance_GlCodeLookupinput;
	}

	// Cif No lookup input text
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001RE_gs_amfVO.CIF_SUB_NO']")
	private WebElement transactions_BulkRemittance_CifNoLookupinput;

	public WebElement transactions_BulkRemittance_CifNoLookupinput() {
		return transactions_BulkRemittance_CifNoLookupinput;
	}

	// Sl No lookup input text
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001RE_gs_amfVO.SL_NO']")
	private WebElement transactions_BulkRemittance_SlNoLookupinput;

	public WebElement transactions_BulkRemittance_SlNoLookupinput() {
		return transactions_BulkRemittance_SlNoLookupinput;
	}

	// warning ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement transactions_BulkRemittance_WarningOkButton;

	public WebElement transactions_BulkRemittance_WarningOkButton() {
		return transactions_BulkRemittance_WarningOkButton;
	}

	// add new row button
	@FindBy(xpath = "//td[@id='add_bulkRemittanceGridTbl_Id_D001RE' and @class='ui-pg-button ui-corner-all']")
	private WebElement transactions_BulkRemittance_AddNewRowButton;

	public WebElement transactions_BulkRemittance_AddNewRowButton() {
		return transactions_BulkRemittance_AddNewRowButton;
	}

	// Select all remittance
	@FindBy(xpath = "//input[@id='cb_bulkRemittanceGridTbl_Id_D001RE']")
	private WebElement transactions_BulkRemittance_SelectAllCheckbox;

	public WebElement transactions_BulkRemittance_SelectAllCheckbox() {
		return transactions_BulkRemittance_SelectAllCheckbox;
	}

	// Amount
	@FindBy(xpath = "//input[@id='amount_D001RE']")
	private WebElement transactions_BulkRemittance_Amount;

	public WebElement transactions_BulkRemittance_Amount() {
		return transactions_BulkRemittance_Amount;
	}

	// instrument acc lookup branch code input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001RE_gs_amfVO.BRANCH_CODE']")
	private WebElement transactions_BulkRemittance_InstrumentAccountBranchCodeInput;

	public WebElement transactions_BulkRemittance_InstrumentAccountBranchCodeInput() {
		return transactions_BulkRemittance_InstrumentAccountBranchCodeInput;
	}

	// instrument acc lookup currency
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001RE_gs_amfVO.CURRENCY_CODE']")
	private WebElement transactions_BulkRemittance_InstrumentAccountCurrencyInput;

	public WebElement transactions_BulkRemittance_InstrumentAccountCurrencyInput() {
		return transactions_BulkRemittance_InstrumentAccountCurrencyInput;
	}

	// instrument acc lookup gl code
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001RE_gs_amfVO.GL_CODE']")
	private WebElement transactions_BulkRemittance_InstrumentAccountGlCodeInput;

	public WebElement transactions_BulkRemittance_InstrumentAccountGlCodeInput() {
		return transactions_BulkRemittance_InstrumentAccountGlCodeInput;
	}

	// instrument acc lookup cif no
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001RE_gs_amfVO.CIF_SUB_NO']")
	private WebElement transactions_BulkRemittance_InstrumentAccountCifNoInput;

	public WebElement transactions_BulkRemittance_InstrumentAccountCifNoInput() {
		return transactions_BulkRemittance_InstrumentAccountCifNoInput;
	}

	// instrument acc lookup sl no
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001RE_gs_amfVO.SL_NO']")
	private WebElement transactions_BulkRemittance_InstrumentAccountSlNoInput;

	public WebElement transactions_BulkRemittance_InstrumentAccountSlNoInput() {
		return transactions_BulkRemittance_InstrumentAccountSlNoInput;
	}

	// save button
	@FindBy(xpath = "//div[@id='multiChequesEntyDetToolBar_D001RE']/descendant::span")
	private WebElement transactions_BulkRemittance_SaveButton;

	public WebElement transactions_BulkRemittance_SaveButton() {
		return transactions_BulkRemittance_SaveButton;
	}

	// Proceed Button
	@FindBy(xpath = "//td[@id='proceed_D001RE']")
	private WebElement transactions_BulkRemittance_ProceedButton;

	public WebElement transactions_BulkRemittance_ProceedButton() {
		return transactions_BulkRemittance_ProceedButton;
	}

	// User
	@FindBy(xpath = "//td[text()='User']")
	private WebElement systemParameters_User;

	public WebElement systemParameters_User() {
		return systemParameters_User;
	}

	// Approve under User
	@FindBy(xpath = "//a[@id='E000P']/span[2]")
	private WebElement systemParameters_User_Approve;

	public WebElement systemParameters_User_Approve() {
		return systemParameters_User_Approve;
	}

	// Approve button under User approve
	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement systemParameters_User_ApproveButton;

	public WebElement systemParameters_User_ApproveButton() {
		return systemParameters_User_ApproveButton;
	}

	// Update After Approve under User
	@FindBy(xpath = "//a[@id='E000MA']/span[2]")
	private WebElement systemParameters_User_UpdateAfterApprove;

	public WebElement systemParameters_User_UpdateAfterApprove() {
		return systemParameters_User_UpdateAfterApprove;
	}

	// Update After Approve button under user
	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement systemParameters_User_UpdateAfterApproveButton;

	public WebElement systemParameters_User_UpdateAfterApproveButton() {
		return systemParameters_User_UpdateAfterApproveButton;
	}

	// Confirm ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement systemParameters_User_ConfirmOkButton;

	public WebElement systemParameters_User_ConfirmOkButton() {
		return systemParameters_User_ConfirmOkButton;
	}

	// Success ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement systemParameters_User_SuccessOkButton;

	public WebElement systemParameters_User_SuccessOkButton() {
		return systemParameters_User_SuccessOkButton;
	}

	// Cif lookup under user
	@FindBy(xpath = "//span[@id='spanLookup_cif_no_E000MA']")
	private WebElement systemParameters_User_CifLookupButton;

	public WebElement systemParameters_User_CifLookupButton() {
		return systemParameters_User_CifLookupButton;
	}

	// Cif no input box in lookup under user
	@FindBy(xpath = "//input[@id='gridtab_cif_no_E000MA_gs_CIF_NO']")
	private WebElement systemParameters_User_CifLookupCifNoInputBox;

	public WebElement systemParameters_User_CifLookupCifNoInputBox() {
		return systemParameters_User_CifLookupCifNoInputBox;
	}

//					// branch code first row 
//					@FindBy(xpath = "//td[@id='td_gridtab_cif_no_E000MA_1_BRANCH_CODE']")
//					private WebElement systemParameters_User_CifLookupFirstRowBranchCode;
	//
//					public WebElement systemParameters_User_CifLookupFirstRowBranchCode() {
//						return systemParameters_User_CifLookupFirstRowBranchCode;
//					}

	// User id input
	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement user_UpdateAfterApprove_UserIdInput;

	public WebElement user_UpdateAfterApprove_UserIdInput() {
		return user_UpdateAfterApprove_UserIdInput;
	}

	// transaction on his/other accounts dropdown
	@FindBy(xpath = "//select[@id='forbid_trs_on_its_acc_E000MA']")
	private WebElement user_UpdateAfterApprove_TransactionOnHisOtherAccountsDropdown;

	public WebElement user_UpdateAfterApprove_TransactionOnHisOtherAccountsDropdown() {
		return user_UpdateAfterApprove_TransactionOnHisOtherAccountsDropdown;
	}

	// User id input
	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement user_Approve_UserIdInput;

	public WebElement user_Approve_UserIdInput() {
		return user_Approve_UserIdInput;
	}

	// searched User id under user update after approve screen
	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID' and @title='USERA']")
	private WebElement user_UpdateAfterApprove_FirstRowSearchedUserID;

	public WebElement user_UpdateAfterApprove_FirstRowSearchedUserID() {
		return user_UpdateAfterApprove_FirstRowSearchedUserID;
	}

	// searched User id under user update after approve screen
	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID' and @title='USERA']")
	private WebElement user_Approve_FirstRowSearchedUserID;

	public WebElement user_Approve_FirstRowSearchedUserID() {
		return user_Approve_FirstRowSearchedUserID;
	}

	// Parameters Menu
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement parameters_MenuOption;

	public WebElement parameters_MenuOption() {
		return parameters_MenuOption;
	}

	// System Parameters Menu
	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement parameters_SystemParameters_MenuOption;

	public WebElement parameters_SystemParameters_MenuOption() {
		return parameters_SystemParameters_MenuOption;
	}

	// Control Record
	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement systemParameters_ControlRecord;

	public WebElement systemParameters_ControlRecord() {
		return systemParameters_ControlRecord;
	}

	// Approve under Control Record
	@FindBy(xpath = "//a[@id='O001P']/span[2]")
	private WebElement systemParameters_ControlRecord_Approve;

	public WebElement systemParameters_ControlRecord_Approve() {
		return systemParameters_ControlRecord_Approve;
	}

	// Approve button under Control Record approve
	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement systemParameters_ControlRecord_ApproveButton;

	public WebElement systemParameters_ControlRecord_ApproveButton() {
		return systemParameters_ControlRecord_ApproveButton;
	}

	// Update After Approve under Cotrol Record
	@FindBy(xpath = "//a[@id='O001UP']/span[2]")
	private WebElement systemParameters_ControlRecord_UpdateAfterApprove;

	public WebElement systemParameters_ControlRecord_UpdateAfterApprove() {
		return systemParameters_ControlRecord_UpdateAfterApprove;
	}

	// Update After Approve button
	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement systemParameters_ControlRecord_UpdateAfterApproveButton;

	public WebElement systemParameters_ControlRecord_UpdateAfterApproveButton() {
		return systemParameters_ControlRecord_UpdateAfterApproveButton;
	}

	// Confirm Ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement systemParameters_ControlRecord_ConfirmOkButton;

	public WebElement systemParameters_ControlRecord_ConfirmOkButton() {
		return systemParameters_ControlRecord_ConfirmOkButton;
	}

	// Success Ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement systemParameters_ControlRecord_SuccessOkButton;

	public WebElement systemParameters_ControlRecord_SuccessOkButton() {
		return systemParameters_ControlRecord_SuccessOkButton;
	}

	// Bulk Destroy
	@FindBy(xpath = "//input[@id='bulk_destroy_period_O001UP']")
	private WebElement systemParameters_ControlRecord_BulkDestroyPeriod;

	public WebElement systemParameters_ControlRecord_BulkDestroyPeriod() {
		return systemParameters_ControlRecord_BulkDestroyPeriod;
	}

	// chequebook advanced process
	@FindBy(xpath = "//input[@id='chqbook_process_O001UP']")
	private WebElement systemParameters_ControlRecord_ChequebookAdvancedProcessFlag;

	public WebElement systemParameters_ControlRecord_ChequebookAdvancedProcessFlag() {
		return systemParameters_ControlRecord_ChequebookAdvancedProcessFlag;
	}

	// chequebook advanced process
	@FindBy(xpath = "//input[@id='chqbook_process_O001UP' and @checked='checked']")
	private WebElement systemParameters_ControlRecord_CheckedChequebookAdvancedProcessFlag;

	public WebElement systemParameters_ControlRecord_CheckedChequebookAdvancedProcessFlag() {
		return systemParameters_ControlRecord_CheckedChequebookAdvancedProcessFlag;
	}

	// alert activation tab
	@FindBy(xpath = "//a[@id='controlRecord_tab_AlertActivation_O001UP']")
	private WebElement controlRecord_UpdateAfterApprove_AlertActivationTab;

	public WebElement controlRecord_UpdateAfterApprove_AlertActivationTab() {
		return controlRecord_UpdateAfterApprove_AlertActivationTab;
	}

	// Account Balance OverDrawn dropdown
//					@FindBy(xpath = "//span[text()='Account Balance Overdrawn']")
	@FindBy(xpath = "//td[@title='Account Balance Overdrawn']/div/div")
	private WebElement controlRecord_AlertActivationTab_AccountBalanceOverdrawn;

	public WebElement controlRecord_AlertActivationTab_AccountBalanceOverdrawn() {
		return controlRecord_AlertActivationTab_AccountBalanceOverdrawn;
	}

	// Staff Accounts Transaction Span
//					@FindBy(xpath = "//td[@id='td_tab4_GridTbl_Id_O001UP_33_CUSTOM_FIELD']/span[text()='0048-Staff Accounts Transaction']")
//					@FindBy(xpath = "//td[@title='0048-Staff Accounts Transaction']/span")
	@FindBy(xpath = "//tr[@id='1x1x48']")
	private WebElement controlRecord_AlertActivationTab_StaffAccountsTransactionSpan;

	public WebElement controlRecord_AlertActivationTab_StaffAccountsTransactionSpan() {
		return controlRecord_AlertActivationTab_StaffAccountsTransactionSpan;
	}

	// Staff Accounts Transaction checked checkbox
	@FindBy(xpath = "//span[text()='0048-Staff Accounts Transaction']/../../td[2]/input[@checked='checked']")
//					@FindBy(xpath = "//span[text()='0048-Staff Accounts Transaction']/../../td[2]/input")
	private WebElement controlRecord_AlertActivationTab_StaffAccountsTransactionCheckedCheckbox;

	public WebElement controlRecord_AlertActivationTab_StaffAccountsTransactionCheckedCheckbox() {
		return controlRecord_AlertActivationTab_StaffAccountsTransactionCheckedCheckbox;
	}

	// Staff Accounts Transaction unchecked checkbox
	@FindBy(xpath = "//span[text()='0048-Staff Accounts Transaction']/../../td[2]/input")
	private WebElement controlRecord_AlertActivationTab_StaffAccountsTransactionCheckbox;

	public WebElement controlRecord_AlertActivationTab_StaffAccountsTransactionCheckbox() {
		return controlRecord_AlertActivationTab_StaffAccountsTransactionCheckbox;
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

	@FindBy(xpath = "//input[@id='alertsGrid_Id_D001MT_gs_alertsParamCO.userId']")
	private WebElement CSMCore_Transactions_Maintenance_alertwindow;

	public WebElement CSMCore_Transactions_Maintenance_alertwindow() {
		return CSMCore_Transactions_Maintenance_alertwindow;
	}

	// 72 sprint new objects

	@FindBy(xpath = "//a[@id='infoBarSearchButton_F00I1MT']")
	private WebElement FOM_Maintenance_searchBtn;

	public WebElement FOM_Maintenance_searchBtn() {
		return FOM_Maintenance_searchBtn;
	}

	@FindBy(xpath = "//input[@id='fomGridTbl_Id_F00I1MT_gs_cifVO.CIF_NO']")
	private WebElement FOM_Maintenance_searchBtn_Enter_CIFNo;

	public WebElement FOM_Maintenance_searchBtn_Enter_CIFNo() {
		return FOM_Maintenance_searchBtn_Enter_CIFNo;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Maintenance_CifCodeGrid;

	public WebElement Accounts_GeneralAccounts_Maintenance_CifCodeGrid() {
		return Accounts_GeneralAccounts_Maintenance_CifCodeGrid;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002PR_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Print_CifCode;

	public WebElement Accounts_GeneralAccounts_Print_CifCode() {
		return Accounts_GeneralAccounts_Print_CifCode;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002XJ_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Reject_CifCode;

	public WebElement Accounts_GeneralAccounts_Reject_CifCode() {
		return Accounts_GeneralAccounts_Reject_CifCode;
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

	@FindBy(xpath = "//input[@id='gridtab_cifNo_A002MT_gs_CIF_NO']")
	private WebElement Accounts_GeneralAccounts_Opening_Cif;

	public WebElement Accounts_GeneralAccounts_Opening_Cif() {
		return Accounts_GeneralAccounts_Opening_Cif;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002CLT_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_CloseWithTransfer_CifCode;

	public WebElement Accounts_GeneralAccounts_CloseWithTransfer_CifCode() {
		return Accounts_GeneralAccounts_CloseWithTransfer_CifCode;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AC_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_AuthorizeClose_CifCode;

	public WebElement Accounts_GeneralAccounts_AuthorizeClose_CifCode() {
		return Accounts_GeneralAccounts_AuthorizeClose_CifCode;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002CL_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Close_CifCode;

	public WebElement Accounts_GeneralAccounts_Close_CifCode() {
		return Accounts_GeneralAccounts_Close_CifCode;
	}

	@FindBy(xpath = "//span[text()=' Send ']//parent::a")
	private WebElement Transaction_maintanance_alertclickingUserId_SendBtn;

	public WebElement Transaction_maintanance_alertclickingUserId_SendBtn() {
		return Transaction_maintanance_alertclickingUserId_SendBtn;
	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo;

	public WebElement BMUserAlertEnterTRXNo() {
		return BMUser_Alert_EnterTRXNo;
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

	@FindBy(xpath = "//input[@id='amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_Amount;
	}

	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey;
	}

//razia
	@FindBy(xpath = "//table[@id='alertsGrid_Id_D001MT']")
	private WebElement Transaction_maintanance_alertclickingUserId;

	public WebElement Transaction_maintanance_alertclickingUserId() {
		return Transaction_maintanance_alertclickingUserId;
	}

	@FindBy(id = "_selenuim_CATEG_1")
	private WebElement Sads_parameter;

	public WebElement Sads_parameter() {
		return Sads_parameter;
	}

	@FindBy(xpath = "//td[text()='Account Restrictions']")
	private WebElement Sads_parameter_AccountRes;

	public WebElement Sads_parameter_AccountRes() {
		return Sads_parameter_AccountRes;
	}

	@FindBy(xpath = "//a[@id='UR00M']")
	private WebElement Sads_parameter_ACCRES_Maintance;

	public WebElement Sads_parameter_ACCRES_Maintance() {
		return Sads_parameter_ACCRES_Maintance;
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

}
