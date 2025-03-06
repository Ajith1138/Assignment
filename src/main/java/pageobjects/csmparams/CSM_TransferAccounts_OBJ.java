package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_TransferAccounts_OBJ {
	WebDriver driver;

	public CSM_TransferAccounts_OBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Transfer_RetriveRecord;

	public WebElement CSMCoreTransferAccountsTransferRetriveRecord() {
		return CSMCore_TransferAccounts_Transfer_RetriveRecord;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu_612() {
		return CSM_TransactionsMainMenu;
	}

	@FindBy(id = "D001MT")
	private WebElement CSM_MaintenanceUnderTransactions;

	public WebElement CSMMaintenanceUnderTransactions_612() {
		return CSM_MaintenanceUnderTransactions;
	}

	@FindBy(id = "lookuptxt_trx_type_D001MT")
	private WebElement CSM_TRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen_612() {
		return CSM_TRXTypeInMaintenanceScreen;
	}

	// debit
	@FindBy(id = "trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeINdebitAc;

	public WebElement CSM_BranchCodeINdebitAc_612() {
		return CSM_BranchCodeINdebitAc;
	}

	@FindBy(id = "trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodedebitAc;

	public WebElement CSM_CurrencyCodedebitAc_612() {
		return CSM_CurrencyCodedebitAc;
	}

	@FindBy(id = "trs_ac_gl_D001MT")
	private WebElement CSM_GLCodedebitAc;

	public WebElement CSM_GLCodedebitAc_612() {
		return CSM_GLCodedebitAc;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeIndebitAc;

	public WebElement CSM_CIFCodeIndebitAc_612() {
		return CSM_CIFCodeIndebitAc;
	}

	@FindBy(id = "lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialIndebitAc;

	public WebElement CSM_SerialIndebitAc_612() {
		return CSM_SerialIndebitAc;
	}

	@FindBy(id = "trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen;

	public WebElement CSMSaveButtonInMaintenanceScreen_612() {
		return CSM_SaveButtonInMaintenanceScreen;
	}

	@FindBy(xpath = "//div[text()='Success']//following::div//following::div//child::div")
	private WebElement CSM_GetTheTransactionNo;

	public WebElement CSMGetTheTransactionNo_612() {
		return CSM_GetTheTransactionNo;
	}

	@FindBy(id = "D001AU")
	private WebElement CSM_ApproveScreenUnderTransactions;

	public WebElement CSMApproveScreenUnderTransactions_612() {
		return CSM_ApproveScreenUnderTransactions;
	}

	@FindBy(id = "trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_TransactionNoInApproveScreen;

	public WebElement CSMTransactionNoInApproveScreen_612() {
		return CSM_TransactionNoInApproveScreen;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")

	private WebElement Transactions_transactionNo_Doubleclk;

	public WebElement Transactions_transactionNo_Doubleclk_612() {

		return Transactions_transactionNo_Doubleclk;

	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_DoubleClickOnTheTransactionNo;

	public WebElement CSMDoubleClickOnTheTransactionNo_612() {
		return CSM_DoubleClickOnTheTransactionNo;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement CSM_ApproveButtonInApproveScreen;

	public WebElement CSMApproveButtonInApproveScreen_612() {
		return CSM_ApproveButtonInApproveScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation_612() {
		return CSM_OkButtonInSuccessPopUpMenuForTranscation;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu;

	public WebElement CSMOkButtonInSuccessPopUpMenu_612() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")

	private WebElement getTransactionNumber;

	public WebElement getTransactionNumber_612()

	{

		return getTransactionNumber;

	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu_612;

	public WebElement CSMOkButtonInSuccessPopUpMenu() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement CSM_OkButtonInWarningPopUpToGoBackToMaintenance;

	public WebElement CSMOkButtonInWarningPopUpToGoBackToMaintenance_612() {
		return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
	}

	@FindBy(id = "infoBarSearchButton_D001MT")
	private WebElement CSM_SearchButtonInMaintenanceScreen;

	public WebElement CSMSearchButtonInMaintenanceScreen_612() {
		return CSM_SearchButtonInMaintenanceScreen;
	}

	@FindBy(id = "trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_EnterTheTransactionNoInSearchBox;

	public WebElement CSMEnterTheTransactionNoInSearchBox_612() {
		return CSM_EnterTheTransactionNoInSearchBox;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu;

	public WebElement CSMOkButtonInWarningPopUpMenu_612() {
		return CSM_OkButtonInWarningPopUpMenu;
	}

	@FindBy(id = "amount_D001MT")
	private WebElement CSM_AmountInMaintenanceScreen;

	public WebElement CSMAmountInMaintenanceScreen_612() {
		return CSM_AmountInMaintenanceScreen;
	}

	@FindBy(id = "lookuptxt_trs_cy_D001MT")
	private WebElement CSM_CurrencyInMaintenanceScreen;

	public WebElement CSMCurrencyInMaintenanceScreen_612() {
		return CSM_CurrencyInMaintenanceScreen;
	}

	@FindBy(xpath = "//span[text()='Apply to Void House Cheque']")
	private WebElement CSM_ApplytoVoidHouseChequemenu_612;

	public WebElement CSMApplytoVoidHouseChequemenu612() {
		return CSM_ApplytoVoidHouseChequemenu_612;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VCL_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNo_612;

	public WebElement CSMApplytoVoidHouseChequemenuTransactionNo_612() {
		return CSM_ApplytoVoidHouseChequemenu_TransactionNo_612;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001VCL_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612;

	public WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612() {
		return CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001VCL']")
	private WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612;

	public WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612() {
		return CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612;
	}

	@FindBy(xpath = "//span[contains(text(),'Apply to Void House Cheques')]//parent::button")
	private WebElement CSM_ApplytoVoidHouseCheque_Button_612;

	public WebElement CSM_ApplytoVoidHouseCheque_Button_612() {
		return CSM_ApplytoVoidHouseCheque_Button_612;
	}

	@FindBy(xpath = "//span[text()='Void House Cheques']")
	private WebElement CSM_trsVoidHouseChequeMenu_612;

	public WebElement CSM_trsVoidHouseChequeMenu_612() {
		return CSM_trsVoidHouseChequeMenu_612;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VC_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_TRS_VoidHouseChequeMenu_TransactionNo_612;

	public WebElement CSM_TRS_VoidHouseChequeMenu_TransactionNo_612() {
		return CSM_TRS_VoidHouseChequeMenu_TransactionNo_612;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001VC_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612;

	public WebElement CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612() {
		return CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612;
	}

	@FindBy(xpath = "//span[contains(text(),'Void')]//parent::button")
	private WebElement CSM_TRS_VoidHouseChequeMenu_VoidBtn_612;

	public WebElement CSM_TRS_VoidHouseChequeMenu_VoidBtn_612() {
		return CSM_TRS_VoidHouseChequeMenu_VoidBtn_612;
	}

	// @ta_60

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement CSM_AccountsMenu_612;

	public WebElement CSMAccountsMenu612() {
		return CSM_AccountsMenu_612;
	}

	@FindBy(xpath = "//span[text()='General Accounts']")
	private WebElement CSM_AccountsMenu_GeneralAcc_612;

	public WebElement CSM_AccountsMenuGeneralAcc612() {
		return CSM_AccountsMenu_GeneralAcc_612;
	}

	@FindBy(xpath = "//span[text()='Suspend']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_612;

	public WebElement CSM_AccountsMenuGeneralAccSuspend612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_612;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002ZP_gs_amfVO.GL_CODE']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002ZP_gs_amfVO.GL_CODE']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_612;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_statusReasonCode_A002ZP']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612;
	}

	@FindBy(xpath = "//textarea[@id='reasonChangeStatus_A002ZP']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612;
	}

	@FindBy(xpath = "//label[text()='Suspend ']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_SuspendButton_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_SuspendButton_612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_SuspendButton_612;
	}

	@FindBy(xpath = "//span[text()='Approve Suspend']")
	private WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_612() {
		return CSM_AccountsMenu_GeneralAcc_ApproveSuspend_612;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002SP_gs_amfVO.GL_CODE']")
	private WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612() {
		return CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612;
	}

//    	(//td[text()='8796'])[2]
	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002SP_1_amfVO.GL_CODE']")
	private WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_612() {
		return CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_612;
	}

	@FindBy(xpath = "//label[text()='Authorize Suspend ']")
	private WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_AuthorizeSuspendBtn612;

	public WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_AuthorizeSuspendBtn612() {
		return CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_AuthorizeSuspendBtn612;
	}

	// ta_061
	@FindBy(xpath = "//span[text()='Close']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Close_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Close_612() {
		return CSM_AccountsMenu_GeneralAcc_Close_612;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002CL_gs_amfVO.GL_CODE']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Close_Glinput_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Close_Glinput_612() {
		return CSM_AccountsMenu_GeneralAcc_Close_Glinput_612;
	}

	@FindBy(xpath = "//td[text()='840']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Close_Glinput_Doubeltab612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Close_Glinput_Doubeltab612() {
		return CSM_AccountsMenu_GeneralAcc_Close_Glinput_612;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_statusReasonCode_A002CL']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Close_Glinput_Doubeltab_StatusReason_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Close_Glinput_Doubeltab_StatusReason_612() {
		return CSM_AccountsMenu_GeneralAcc_Close_Glinput_Doubeltab_StatusReason_612;
	}

	@FindBy(xpath = "//textarea[@id='reasonChangeStatus_A002CL']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Close_NarrativeReason_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Close_NarrativeReason_612() {
		return CSM_AccountsMenu_GeneralAcc_Close_NarrativeReason_612;
	}

	@FindBy(xpath = "//label[text()='Close ']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Close_NarrativeReason_CloseButton612;

	public WebElement CSM_AccountsMenu_GeneralAcc_Close_NarrativeReason_CloseButton612() {
		return CSM_AccountsMenu_GeneralAcc_Close_NarrativeReason_CloseButton612;
	}

	@FindBy(xpath = "//span[text()='Authorize Close']")
	private WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_612;

	public WebElement CSM_AccountsMenu_GeneralAccAuthorizeClose612() {
		return CSM_AccountsMenu_GeneralAcc_AuthorizeClose_612;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002AC_gs_amfVO.GL_CODE']")
	private WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_GLinput_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_GLinput_612() {
		return CSM_AccountsMenu_GeneralAcc_AuthorizeClose_GLinput_612;
	}

	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002AC_1_amfVO.CURRENCY_CODE']")
	private WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_Doulbletab_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_Doulbletab_612() {
		return CSM_AccountsMenu_GeneralAcc_AuthorizeClose_Doulbletab_612;
	}

	@FindBy(xpath = "//label[text()='Authorize Close ']")
	private WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_Doulbletab_AuthorizeCloseButton_612;

	public WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_Doulbletab_AuthorizeCloseButton_612() {
		return CSM_AccountsMenu_GeneralAcc_AuthorizeClose_Doulbletab_AuthorizeCloseButton_612;
	}

	// @TA_58

	@FindBy(xpath = "//span[text()='Reverse']")
	private WebElement CSM_Transaction_ReverseMenu_612;

	public WebElement CSM_Transaction_ReverseMenu_612() {
		return CSM_Transaction_ReverseMenu_612;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001WV_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_ReverseMenu_TransNo_612;

	public WebElement CSM_Transaction_ReverseMenu_TransNo_612() {
		return CSM_Transaction_ReverseMenu_TransNo_612;
	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement CSM_Transaction_ReverseMenu_TransNo_Doubletab_612;

	public WebElement CSM_Transaction_ReverseMenu_TransNo_Doubletab_612() {
		return CSM_Transaction_ReverseMenu_TransNo_Doubletab_612;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001WV']")
	private WebElement CSM_Transaction_ReverseMenu_TransNo_Doubletab_ReasonSelect612;

	public WebElement CSM_Transaction_ReverseMenu_TransNo_Doubletab_ReasonSelect612() {
		return CSM_Transaction_ReverseMenu_TransNo_Doubletab_ReasonSelect612;
	}

	@FindBy(xpath = "//button//span[contains(text(),'To Reverse')]//parent::button")
	private WebElement CSM_Transaction_ReverseMenu_ToReverseButton_612;

	public WebElement CSM_Transaction_ReverseMenu_ToReverseButton_612() {
		return CSM_Transaction_ReverseMenu_ToReverseButton_612;
	}

	@FindBy(xpath = "//span[text()='Approve Reverse']")
	private WebElement CSM_Transaction_ApproveReverseMenu_612;

	public WebElement CSM_Transaction_ApproveReverseMenu_612() {
		return CSM_Transaction_ApproveReverseMenu_612;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RV_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_ApproveReverseMenu_TransNo_612;

	public WebElement CSM_Transaction_ApproveReverseMenu_TransNo_612() {
		return CSM_Transaction_ApproveReverseMenu_TransNo_612;
	}

	@FindBy(xpath = "(//td[text()='To be Reversed'])[1]")
	private WebElement CSM_Transaction_ApproveReverseMenu_DoubleTab_612;

	public WebElement CSM_Transaction_ApproveReverseMenu_DoubleTab_612() {
		return CSM_Transaction_ApproveReverseMenu_DoubleTab_612;
	}

	@FindBy(xpath = "//button//span[contains(text(),'Reverse')]//parent::button")
	private WebElement CSM_Transaction_ApproveReverseMenu_ReverseButton_612;

	public WebElement CSM_Transaction_ApproveReverseMenu_ReverseButton_612() {
		return CSM_Transaction_ApproveReverseMenu_ReverseButton_612;
	}
	// Ta_121

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_TransferAccounts_Maintanance_viewMemo;

	public WebElement CSMCore_TransferAccounts_Maintanance_viewMemo() {
		return CSMCore_TransferAccounts_Maintanance_viewMemo;
	}
	// TA_118

	@FindBy(xpath = "//a[text()='REASON']")
	private WebElement CSMCore_TransferAccounts_Transfer_Doubletab_Reasonclk;

	public WebElement CSMCore_TransferAccounts_Transfer_Doubletab_Reasonclk() {
		return CSMCore_TransferAccounts_Transfer_Doubletab_Reasonclk;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_TransferAccounts_Transfer_Doubletab_Reasonclk_close;

	public WebElement CSMCore_TransferAccounts_Transfer_Doubletab_Reasonclk_close() {
		return CSMCore_TransferAccounts_Transfer_Doubletab_Reasonclk_close;
	}

	@FindBy(xpath = "//input[@id='cb_transferAccountsDetailTbl_Id_TA001T']")
	private WebElement CSMCore_TransferAccounts_Transfer_Doubletab_TransferMangement_selectdata;

	public WebElement CSMCore_TransferAccounts_Transfer_Doubletab_TransferMangement_selectdata() {
		return CSMCore_TransferAccounts_Transfer_Doubletab_TransferMangement_selectdata;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001T_set_exceptions_key']")
	private WebElement CSMCore_TransferAccounts_Transfer_Doubletab_SetExceptionBtn;

	public WebElement CSMCore_TransferAccounts_Transfer_Doubletab_SetExceptionBtn() {
		return CSMCore_TransferAccounts_Transfer_Doubletab_SetExceptionBtn;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement CSMCore_TransferAccounts_Transfer_Doubletab_SetExceptionBtn_popclose;

	public WebElement CSMCore_TransferAccounts_Transfer_Doubletab_SetExceptionBtn_popclose() {
		return CSMCore_TransferAccounts_Transfer_Doubletab_SetExceptionBtn_popclose;
	}

	@FindBy(xpath = "//label[text()='View successful Transfers ']")
	private WebElement CSMCore_TransferAccounts_Transfer_Doubletab_ViewSuccessfulTransfer;

	public WebElement CSMCore_TransferAccounts_Transfer_Doubletab_ViewSuccessfulTransfer() {
		return CSMCore_TransferAccounts_Transfer_Doubletab_ViewSuccessfulTransfer;
	}

	// 137
	@FindBy(xpath = "//span[text()='Query']")
	private WebElement CSMCore_TransferAccounts_Queryfield_612;

	public WebElement CSMCoreTransferAccountsQueryfield612() {
		return CSMCore_TransferAccounts_Queryfield_612;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001Q_gs_transferTypeDesc']")
	private WebElement CSMCore_TransferAccounts_Queryfield_TransferTypeinput_612;

	public WebElement CSMCoreTransferAccountsQueryfieldTransferTypeinput_612() {
		return CSMCore_TransferAccounts_Queryfield_TransferTypeinput_612;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001Q_gs_statusDesc']")
	private WebElement CSMCore_TransferAccounts_Queryfield_Statusinput_612;

	public WebElement CSMCoreTransferAccountsQueryfieldStatusinput_612() {
		return CSMCore_TransferAccounts_Queryfield_Statusinput_612;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001Q_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_TransferAccounts_Queryfield_BatchNo_612;

	public WebElement CSMCore_TransferAccounts_Queryfield_BatchNo_612() {
		return CSMCore_TransferAccounts_Queryfield_BatchNo_612;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001Q_1_transferTypeDesc']")
	private WebElement CSMCore_TransferAccounts_Queryfield_Statusinput_Doubletab_612;

	public WebElement CSMCoreTransferAccountsQueryfieldStatusinputDoubletab_612() {
		return CSMCore_TransferAccounts_Queryfield_Statusinput_Doubletab_612;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001Q_2_transferTypeDesc']")
	private WebElement CSMCore_TransferAccounts_Queryfield_Statusinput_Doubletab_branch612;

	public WebElement CSMCore_TransferAccounts_Queryfield_Statusinput_Doubletab_branch612() {
		return CSMCore_TransferAccounts_Queryfield_Statusinput_Doubletab_branch612;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001Q_set_exceptions_key']")
	private WebElement CSMCore_TransferAccounts_Queryfield_SetExceptions_612;

	public WebElement CSMCore_TransferAccounts_Queryfield_SetExceptions_612() {
		return CSMCore_TransferAccounts_Queryfield_SetExceptions_612;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement CSMCore_TransferAccounts_Queryfield_SetExceptions_popupClose612;

	public WebElement CSMCoreTransferAccountsQueryfieldSetExceptionspopupClose612() {
		return CSMCore_TransferAccounts_Queryfield_SetExceptions_popupClose612;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001Q_view_successful_transfers_key']")
	private WebElement CSMCore_TransferAccounts_Queryfield_ViewsuccessfulTransferBtn_612;

	public WebElement CSMCore_TransferAccounts_Queryfield_ViewsuccessfulTransferBtn_612() {
		return CSMCore_TransferAccounts_Queryfield_ViewsuccessfulTransferBtn_612;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001Q_view_exceptions_key']")
	private WebElement CSMCore_TransferAccounts_Queryfield_ViewFailureBtn_612;

	public WebElement CSMCore_TransferAccounts_Queryfield_ViewFailureBtn_612() {
		return CSMCore_TransferAccounts_Queryfield_ViewFailureBtn_612;
	}
	// 138

	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement CSMCore_TransferAccounts_Cancel_612;

	public WebElement CSMCore_TransferAccounts_Cancel_612() {
		return CSMCore_TransferAccounts_Cancel_612;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001TC_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_TransferAccounts_Cancel_BatchNo_612;

	public WebElement CSMCore_TransferAccounts_Cancel_BatchNo_612() {
		return CSMCore_TransferAccounts_Cancel_BatchNo_612;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001TC_1_transferTypeDesc']")
	private WebElement CSMCore_TransferAccounts_Cancel_BatchNo_DoubleTab_612;

	public WebElement CSMCore_TransferAccounts_Cancel_BatchNo_DoubleTab_612() {
		return CSMCore_TransferAccounts_Cancel_BatchNo_DoubleTab_612;
	}

	@FindBy(xpath = "//label[text()='btn.cancel ']")
	private WebElement CSMCore_TransferAccounts_Cancel_BatchNo_DoubleTab_CancelButton_612;

	public WebElement CSMCore_TransferAccounts_Cancel_BatchNo_DoubleTab_CancelButton_612() {
		return CSMCore_TransferAccounts_Cancel_BatchNo_DoubleTab_CancelButton_612;
	}

	@FindBy(xpath = "//span[text()='Approve Cancel']")
	private WebElement CSMCore_TransferAccounts_ApproveCancelField_612;

	public WebElement CSMCore_TransferAccounts_ApproveCancelField_612() {
		return CSMCore_TransferAccounts_ApproveCancelField_612;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001CP_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_TransferAccounts_ApproveCancelField_BatchNoinput_612;

	public WebElement CSMCore_TransferAccounts_ApproveCancelField_BatchNoinput_612() {
		return CSMCore_TransferAccounts_ApproveCancelField_BatchNoinput_612;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001CP_1_transferTypeDesc']")
	private WebElement CSMCore_TransferAccounts_ApproveCancelField_DoubleTab_612;

	public WebElement CSMCore_TransferAccounts_ApproveCancelField_DoubleTab_612() {
		return CSMCore_TransferAccounts_ApproveCancelField_DoubleTab_612;
	}

	@FindBy(xpath = "//label[text()='Cancel ']")
	private WebElement CSMCore_TransferAccounts_ApproveCancelField_DoubleTab_CancelButton_612;

	public WebElement CSMCore_TransferAccounts_ApproveCancelField_DoubleTab_CancelButton_612() {
		return CSMCore_TransferAccounts_ApproveCancelField_DoubleTab_CancelButton_612;

	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_TA001MT']")
	private WebElement CSMCore_TransferAccounts_MaintenaceScreenSearch_612;

	public WebElement CSMCore_TransferAccounts_MaintenaceScreenSearch_612() {
		return CSMCore_TransferAccounts_MaintenaceScreenSearch_612;

	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_TransferAccounts_MaintenaceScreen_BatchNo_612;

	public WebElement CSMCore_TransferAccounts_MaintenaceScreen_BatchNo_612() {
		return CSMCore_TransferAccounts_MaintenaceScreen_BatchNo_612;

	}
	// 056

	@FindBy(xpath = "//span[text()='Apply to Void Outward Cheques']")
	private WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_612;

	public WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_612() {
		return CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_612;

	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VOL_gs_ctstrsVO.TRS_NO']")
	private WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_TransNo_612;

	public WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_TransNo_612() {
		return CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_TransNo_612;

	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_TransNo_DoubleClk_612;

	public WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_TransNo_DoubleClk_612() {
		return CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_TransNo_DoubleClk_612;

	}

	@FindBy(xpath = "///select[@id='holdReason_D001VOL']")
	private WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_TransNo_DoubleClk_VoidReasonDropDown_612;

	public WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_TransNo_DoubleClk_VoidReasonDropDown_612() {
		return CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_TransNo_DoubleClk_VoidReasonDropDown_612;

	}

	@FindBy(xpath = "//button//span[contains(text(),'Apply to Void Outward Cheques')]//parent::button")
	private WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_ApplytoVoidOutwardChequesBtn_612;

	public WebElement CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_ApplytoVoidOutwardChequesBtn_612() {
		return CSMCore_Transaction_ApplytoVoidOutwardChequesMenu_ApplytoVoidOutwardChequesBtn_612;

	}

	@FindBy(xpath = "//span[text()='Voiding Outward Cheques']")
	private WebElement CSMCore_Transaction_VoidingOutwardChequesMenu_612;

	public WebElement CSMCore_Transaction_VoidingOutwardChequesMenu_612() {
		return CSMCore_Transaction_VoidingOutwardChequesMenu_612;

	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VO_gs_ctstrsVO.TRS_NO']")
	private WebElement CSMCore_Transaction_VoidingOutwardChequesMenu_TransNo_612;

	public WebElement CSMCore_Transaction_VoidingOutwardChequesMenu_TransNo_612() {
		return CSMCore_Transaction_VoidingOutwardChequesMenu_TransNo_612;

	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001VO_1_ctstrsVO.TRS_NO']")
	private WebElement CSMCore_Transaction_VoidingOutwardChequesMenu_TransNo_DoubleTab_612;

	public WebElement CSMCore_Transaction_VoidingOutwardChequesMenu_TransNo_DoubleTab_612() {
		return CSMCore_Transaction_VoidingOutwardChequesMenu_TransNo_DoubleTab_612;

	}

	@FindBy(xpath = "//button//span[contains(text(),'voiding Outward Cheque')]//parent::button")
	private WebElement CSMCore_Transaction_VoidingOutwardChequesButton_612;

	public WebElement CSMCore_Transaction_VoidingOutwardChequesButton_612() {
		return CSMCore_Transaction_VoidingOutwardChequesButton_612;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_bank_cif_D001MT']")
	private WebElement CSMCore_Transaction_Maintenace_BankCIF_612;

	public WebElement CSMCore_Transaction_Maintenace_BankCIF_612() {
		return CSMCore_Transaction_Maintenace_BankCIF_612;

	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.CHQ_NUM']")
	WebElement CSMCore_Transaction_Maintenace_DocumentNo_612;

	public WebElement CSMCore_Transaction_Maintenace_DocumentNo_612() {
		return CSMCore_Transaction_Maintenace_DocumentNo_612;

	}
	// 57

	@FindBy(xpath = "//td[text()='Clearing Maintenance']")
	WebElement CSMCore_ClearingMaintenaceMenu_612;

	public WebElement CSMCore_ClearingMaintenaceMenu_612() {
		return CSMCore_ClearingMaintenaceMenu_612;

	}

	@FindBy(xpath = "//td[text()='Transfers']")
	WebElement CSMCore_ClearingMaintenaceMenu_TransfersSubmenu_612;

	public WebElement CSMCore_ClearingMaintenaceMenu_TransfersSubmenu_612() {
		return CSMCore_ClearingMaintenaceMenu_TransfersSubmenu_612;

	}

	@FindBy(xpath = "//span[text()='Clearing /Voiding Transfers']")
	WebElement CSMCore_ClearingMaintenaceMenu_TransfersSubmenu_ClearingVoidTransferField612;

	public WebElement CSMCore_ClearingMaintenaceMenu_TransfersSubmenu_ClearingVoidTransferField612() {
		return CSMCore_ClearingMaintenaceMenu_TransfersSubmenu_ClearingVoidTransferField612;

	}

	@FindBy(xpath = "//input[@id='criteria_trxNo_I000TCV']")
	WebElement CSMCore_ClearingMaintenaceMenu_ClearingVoidTransferField_Tranactioncheckbox_612;

	public WebElement CSMCore_ClearingMaintenaceMenu_ClearingVoidTransferField_Tranactioncheckbox_612() {
		return CSMCore_ClearingMaintenaceMenu_ClearingVoidTransferField_Tranactioncheckbox_612;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_trxFromLkp_I000TCV']")
	WebElement CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_Tranactioncheckbox_Form_612;

	public WebElement CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_Tranactioncheckbox_Form_612() {
		return CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_Tranactioncheckbox_Form_612;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_trxToLkp_I000TCV']")
	WebElement CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_Tranactioncheckbox_To_612;

	public WebElement CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_Tranactioncheckbox_To_612() {
		return CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_Tranactioncheckbox_To_612;
	}

	@FindBy(xpath = "//label[text()='Clear / Void ']")
	WebElement CSMCore_ClearingMaintenaceMenu_ClearingVoidTransferField_clearvoidButton_612;

	public WebElement CSMCore_ClearingMaintenaceMenu_ClearingVoidTransferField_clearvoidButton_612() {
		return CSMCore_ClearingMaintenaceMenu_ClearingVoidTransferField_clearvoidButton_612;
	}

	@FindBy(xpath = "//select[@id='1_ctsBatchVO.STATUS_depositChequesGridId_I000TCV']")
	WebElement CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_clearvoidButton_Status_612;

	public WebElement CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_clearvoidButton_Status_612() {
		return CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_clearvoidButton_Status_612;
	}

	@FindBy(xpath = "//button[@id='depositCheque_save_btn_I000TCV']")
	WebElement CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_clearvoidButton_Status_SaveButton_612;

	public WebElement CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_clearvoidButton_Status_SaveButton_612() {
		return CSMCore_ClearingMaintenaceMenu__ClearingVoidTransferField_clearvoidButton_Status_SaveButton_612;
	}

	@FindBy(xpath = "//span[text()='Authorize Clearing']")
	WebElement CSMCore_ClearingMaintenaceMenu__Transfer_AuthorizeClearingFields_612;

	public WebElement CSMCore_ClearingMaintenaceMenu__Transfer_AuthorizeClearingFields_612() {
		return CSMCore_ClearingMaintenaceMenu__Transfer_AuthorizeClearingFields_612;
	}

	@FindBy(xpath = "//label[text()='Authorize Clearing <Specified> ']")
	WebElement CSMCore_ClearingMaintenaceMenu__Transfer_AuthorizeClearingSpecifiedButton_612;

	public WebElement CSMCore_ClearingMaintenaceMenu__Transfer_AuthorizeClearingSpecifiedButton_612() {
		return CSMCore_ClearingMaintenaceMenu__Transfer_AuthorizeClearingSpecifiedButton_612;
	}

	@FindBy(xpath = "//input[@id='jqg_authorizeClearingGridId_I000TAC_1']")
	WebElement CSMCore_ClearingMaintenaceMenu__Transfer_AuthorizeClearingSpecifiedButton_ClkCheckbox612;

	public WebElement CSMCore_ClearingMaintenaceMenu__Transfer_AuthorizeClearingSpecifiedButton_ClkCheckbox612() {
		return CSMCore_ClearingMaintenaceMenu__Transfer_AuthorizeClearingSpecifiedButton_ClkCheckbox612;
	}

	@FindBy(xpath = "//label[text()='Authorize ']")
	WebElement CSMCore_ClearingMaintenaceMenu_ClkCheckbox_AuthorizeBtn612;

	public WebElement CSMCore_ClearingMaintenaceMenu_ClkCheckbox_AuthorizeBtn612() {
		return CSMCore_ClearingMaintenaceMenu_ClkCheckbox_AuthorizeBtn612;
	}

	@FindBy(xpath = "//input[@id='rangeDef_TA001MTG']")
	WebElement CSMCore_glfrom_Range_Definition;

	public WebElement CSMCore_glfrom_Range_Definition() {
		return CSMCore_glfrom_Range_Definition;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_original_gl_TA001MT']")
	WebElement CSMCore_TransferAcc_Maintenance_originalGl;

	public WebElement CSMCore_TransferAcc_Maintenance_originalGl() {
		return CSMCore_TransferAcc_Maintenance_originalGl;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_destination_gl_TA001MT']")
	WebElement CSMCore_TransferAcc_Maintenance_DestinationGl;

	public WebElement CSMCore_TransferAcc_Maintenance_DestinationGl() {
		return CSMCore_TransferAcc_Maintenance_DestinationGl;
	}

	// ta_45

	@FindBy(xpath = "//a[@id='O001MT']")
	WebElement CSMparam_sysparam_controlrecord_Maintenace;

	public WebElement CSMparam_sysparam_controlrecord_Maintenace() {
		return CSMparam_sysparam_controlrecord_Maintenace;
	}

	@FindBy(xpath = "//td[text()='Dues Management']")
	WebElement CSMcore_DuesManagement;

	public WebElement CSMcore_DuesManagement() {
		return CSMcore_DuesManagement;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	WebElement CSMcore_DuesManagement_Maintenance;

	public WebElement CSMcore_DuesManagement_Maintenance() {
		return CSMcore_DuesManagement_Maintenance;
	}

	@FindBy(xpath = "//input[@id='accBr_DUES01MT']")
	WebElement CSMcore_DuesManagement_Maintenance_DebitAc_branch;

	public WebElement CSMcore_DuesManagement_Maintenance_DebitAc_branch() {
		return CSMcore_DuesManagement_Maintenance;
	}

	@FindBy(xpath = "//input[@id='accCy_DUES01MT']")
	WebElement CSMcore_DuesManagement_Maintenance_DebitAc_Currency;

	public WebElement CSMcore_DuesManagement_Maintenance_DebitAc_Currency() {
		return CSMcore_DuesManagement_Maintenance_DebitAc_Currency;
	}

	@FindBy(xpath = "//input[@id='accGl_DUES01MT']")
	WebElement CSMcore_DuesManagement_Maintenance_DebitAc_Gl;

	public WebElement CSMcore_DuesManagement_Maintenance_DebitAc_Gl() {
		return CSMcore_DuesManagement_Maintenance_DebitAc_Gl;
	}

	@FindBy(xpath = "//input[@id='accCif_DUES01MT']")
	WebElement CSMcore_DuesManagement_Maintenance_DebitAc_CIf;

	public WebElement CSMcore_DuesManagement_Maintenance_DebitAc_CIf() {
		return CSMcore_DuesManagement_Maintenance_DebitAc_CIf;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_accSl_DUES01MT']")
	WebElement CSMcore_DuesManagement_Maintenance_DebitAc_serial;

	public WebElement CSMcore_DuesManagement_Maintenance_DebitAc_serial() {
		return CSMcore_DuesManagement_Maintenance_DebitAc_serial;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_TA001MT']")
	WebElement CSMcore_transferAcc_Maintenance_Search;

	public WebElement CSMcore_transferAcc_Maintenance_Search() {
		return CSMcore_transferAcc_Maintenance_Search;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	WebElement CSMcore_transferAcc_Maintenance_batchnoinput;

	public WebElement CSMcore_transferAcc_Maintenance_batchnoinput() {
		return CSMcore_transferAcc_Maintenance_batchnoinput;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001MT_1_cts_TRSFR_ACCVO.BATCH_NO']")
	WebElement CSMcore_transferAcc_Maintenance_batchNo_Doubletab;

	public WebElement CSMcore_transferAcc_Maintenance_batchNo_Doubletab() {
		return CSMcore_transferAcc_Maintenance_batchNo_Doubletab;
	}

//New Changes By Kailash
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

	@FindBy(xpath = "//input[@name='SL_NO']")
	private WebElement CSMCore_EnterSiNoInSearch_MaintenanceInGeneralAccountsUnderAccountsScreen;

	public WebElement CSMCoreEnterSiNoInSearch_MaintenanceInGeneralAccountsUnderAccountsScreen() {
		return CSMCore_EnterSiNoInSearch_MaintenanceInGeneralAccountsUnderAccountsScreen;
	}

	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002MA_1_amfVO.CIF_SUB_NO'][text()='993674']//preceding-sibling::td[@id='td_generalAccountsGridTbl_Id_A002MA_1_amfVO.BRANCH_CODE']")
	private WebElement CSMCore_GetBranchCodefor993674_02InSearch_MaintenanceInGeneralAccountsUnderAccountsScreen;

	public WebElement CSMCoreGetBranchCodefor993674_02InSearch_MaintenanceInGeneralAccountsUnderAccountsScreen() {
		return CSMCore_GetBranchCodefor993674_02InSearch_MaintenanceInGeneralAccountsUnderAccountsScreen;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001MT_btn_save']")
	private WebElement CSMCore_SaveBtn_Maintenance_TA;

	public WebElement CSMCoreSaveBtn_Maintenance_TA() {
		return CSMCore_SaveBtn_Maintenance_TA;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001MT_set_exceptions_key']")
	private WebElement CSMCore_SetExceptionsButton_Maintenance_TA;

	public WebElement CSMCoreSetExceptionsButton_Maintenance_TA() {
		return CSMCore_SetExceptionsButton_Maintenance_TA;
	}

	@FindBy(xpath = "//input[@name='CIF_SUB_NO']")
	private WebElement CSMCore_EnterCifNoInSearch_MaintenanceInGeneralAccountsUnderAccountsScreen;

	public WebElement CSMCoreEnterCifNoInSearch_MaintenanceInGeneralAccountsUnderAccountsScreen() {
		return CSMCore_EnterCifNoInSearch_MaintenanceInGeneralAccountsUnderAccountsScreen;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_dest_branch_TA001MT']")
	private WebElement CSMCore_DestinationBranch_Maintenance_TA1;

	public WebElement CSMCoreDestinationBranch_Maintenance_TA() {
		return CSMCore_DestinationBranch_Maintenance_TA;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001MT_retrieve_key']")
	private WebElement CSMCore_Retrievebutton_Maintenance_TA;

	public WebElement CSMCoreRetrievebutton_Maintenance_TA() {
		return CSMCore_Retrievebutton_Maintenance_TA;
	}

	@FindBy(id = "infoBarSearchButton_G001MT")
	private WebElement csm_CardsManagement_CardRequest_SearchIcon_615;

	public WebElement csmCardsManagementCardRequestSearchIcon615() {
		return csm_CardsManagement_CardRequest_SearchIcon_615;
	}

	@FindBy(xpath = "//input[@name='ACC_GL']")
	private WebElement csm_CardsManagement_CardRequest_GL_Input_615;

	public WebElement csmCardsManagementCardRequestGLInput615() {
		return csm_CardsManagement_CardRequest_GL_Input_615;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001MT_gs_cardsAccountCO.accountVO.ACC_CIF']")
	private WebElement csm_CardsManagement_CardRequest_Cif_Input_615;

	public WebElement csmCardsManagementCardRequestCifInput615() {
		return csm_CardsManagement_CardRequest_Cif_Input_615;
	}

	@FindBy(xpath = "//input[@name='ACC_SL']")
	private WebElement csm_CardsManagement_CardRequest_SerialNo_Input_615;

	public WebElement csmCardsManagementCardRequestSerialNoInput615() {
		return csm_CardsManagement_CardRequest_SerialNo_Input_615;
	}

	// karthi 58 sprint
	// Transfer Accounts Menu
	@FindBy(xpath = "//td[text()='Transfer Accounts']")
	private WebElement transferAccounts_MenuOption;

	public WebElement transferAccounts_MenuOption() {
		return transferAccounts_MenuOption;
	}

	// Transfer Accounts Maintenance
	@FindBy(xpath = "//a[@id='TA001MT']/span[text()='Maintenance']")
	private WebElement transferAccounts_Maintenance;

	public WebElement transferAccounts_Maintenance() {
		return transferAccounts_Maintenance;
	}

	// Transfer Accounts Approve
	@FindBy(xpath = "//a[@id='TA001P']/span[text()='Approve']")
	private WebElement transferAccounts_Approve;

	public WebElement transferAccounts_Approve() {
		return transferAccounts_Approve;
	}

	// Transfer Accounts Transfer
	@FindBy(xpath = "//a[@id='TA001T']/span[text()='Transfer']")
	private WebElement transferAccounts_Transfer;

	public WebElement transferAccounts_Transfer() {
		return transferAccounts_Transfer;
	}

	// --------------------------------------------------------------//

	// alert Box Header
	@FindBy(xpath = "//span[text()='Alerts']/parent::div")
	private WebElement alertBox_Header;

	public WebElement alertBox_Header() {
		return alertBox_Header;
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

	// --------------------------------------------------------------//

	// Batch number search input under Transfer
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement transferAccounts_Transfer_BatchNumberSearchInput;

	public WebElement transferAccounts_Transfer_BatchNumberSearchInput() {
		return transferAccounts_Transfer_BatchNumberSearchInput;
	}

	// status under Maintenance
	@FindBy(xpath = "//input[@id='status_txtField_TA001T']")
	private WebElement transferAccounts_Maintenance_BatchNumberStatus;

	public WebElement transferAccounts_Maintenance_BatchNumberStatus() {
		return transferAccounts_Maintenance_BatchNumberStatus;
	}

	// Batch number search input under Maintenance
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement transferAccounts_Maintenance_BatchNumberSearchInput;

	public WebElement transferAccounts_Maintenance_BatchNumberSearchInput() {
		return transferAccounts_Maintenance_BatchNumberSearchInput;
	}

	// Status of First Record under Maintenance
	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001MT_1_statusDesc']")
	private WebElement transferAccounts_Maintenance_FirstRecordStatus;

	public WebElement transferAccounts_Maintenance_FirstRecordStatus() {
		return transferAccounts_Maintenance_FirstRecordStatus;
	}

	// Transfer type
	@FindBy(xpath = "//select[@id='transferTypeId_TA001MT']")
	private WebElement transferAccounts_Maintenance_TransferType;

	public WebElement transferAccounts_Maintenance_TransferType() {
		return transferAccounts_Maintenance_TransferType;
	}

	// Reason code
	@FindBy(xpath = "//input[@id='lookuptxt_statusReasonCode_TA001MT']")
	private WebElement transferAccounts_Maintenance_ReasonCode;

	public WebElement transferAccounts_Maintenance_ReasonCode() {
		return transferAccounts_Maintenance_ReasonCode;
	}

	// FromAccount Lookup button
	@FindBy(xpath = "//span[@id='spanLookup_from_acc_sl_TA001MT']")
	private WebElement transferAccounts_Maintenance_FromAccountLookupButton;

	public WebElement transferAccounts_Maintenance_FromAccountLookupButton() {
		return transferAccounts_Maintenance_FromAccountLookupButton;
	}

	// ToAccount Lookup button
	@FindBy(xpath = "//span[@id='spanLookup_to_acc_sl_TA001MT']")
	private WebElement transferAccounts_Maintenance_ToAccountLookupButton;

	public WebElement transferAccounts_Maintenance_ToAccountLookupButton() {
		return transferAccounts_Maintenance_ToAccountLookupButton;
	}

	// FromAccount BranchCode
	@FindBy(xpath = "//input[@id='gridtab_from_acc_sl_TA001MT_gs_amfVO.BRANCH_CODE']")
	private WebElement transferAccounts_Maintenance_FromAccountBranchCode;

	public WebElement transferAccounts_Maintenance_FromAccountBranchCode() {
		return transferAccounts_Maintenance_FromAccountBranchCode;
	}

	// FromAccount Currency
	@FindBy(xpath = "//input[@id='gridtab_from_acc_sl_TA001MT_gs_amfVO.CURRENCY_CODE']")
	private WebElement transferAccounts_Maintenance_FromAccountCurrencyCode;

	public WebElement transferAccounts_Maintenance_FromAccountCurrencyCode() {
		return transferAccounts_Maintenance_FromAccountCurrencyCode;
	}

	// FromAccount GL Code
	@FindBy(xpath = "//input[@id='gridtab_from_acc_sl_TA001MT_gs_amfVO.GL_CODE']")
	private WebElement transferAccounts_Maintenance_FromAccountGlCode;

	public WebElement transferAccounts_Maintenance_FromAccountGlCode() {
		return transferAccounts_Maintenance_FromAccountGlCode;
	}

	// FromAccount CIF Code
	@FindBy(xpath = "//input[@id='gridtab_from_acc_sl_TA001MT_gs_amfVO.CIF_SUB_NO']")
	private WebElement transferAccounts_Maintenance_FromAccountCifCode;

	public WebElement transferAccounts_Maintenance_FromAccountCifCode() {
		return transferAccounts_Maintenance_FromAccountCifCode;
	}

	// ToAccount BranchCode
	@FindBy(xpath = "//input[@id='gridtab_to_acc_sl_TA001MT_gs_amfVO.BRANCH_CODE']")
	private WebElement transferAccounts_Maintenance_ToAccountBranchCode;

	public WebElement transferAccounts_Maintenance_ToAccountBranchCode() {
		return transferAccounts_Maintenance_ToAccountBranchCode;
	}

	// ToAccount Currency
	@FindBy(xpath = "//input[@id='gridtab_to_acc_sl_TA001MT_gs_amfVO.CURRENCY_CODE']")
	private WebElement transferAccounts_Maintenance_ToAccountCurrencyCode;

	public WebElement transferAccounts_Maintenance_ToAccountCurrencyCode() {
		return transferAccounts_Maintenance_ToAccountCurrencyCode;
	}

	// ToAccount GL Code
	@FindBy(xpath = "//input[@id='gridtab_to_acc_sl_TA001MT_gs_amfVO.GL_CODE']")
	private WebElement transferAccounts_Maintenance_ToAccountGlCode;

	public WebElement transferAccounts_Maintenance_ToAccountGlCode() {
		return transferAccounts_Maintenance_ToAccountGlCode;
	}

	// ToAccount CIF Code
	@FindBy(xpath = "//input[@id='gridtab_to_acc_sl_TA001MT_gs_amfVO.CIF_SUB_NO']")
	private WebElement transferAccounts_Maintenance_ToAccountCifCode;

	public WebElement transferAccounts_Maintenance_ToAccountCifCode() {
		return transferAccounts_Maintenance_ToAccountCifCode;
	}

	// From Account Lookup First Value
	@FindBy(xpath = "//td[@id='td_gridtab_from_acc_sl_TA001MT_1_amfVO.BRANCH_CODE']")
	private WebElement transferAccounts_Maintenance_FromAccountLookupFirstRecord;

	public WebElement transferAccounts_Maintenance_FromAccountLookupFirstRecord() {
		return transferAccounts_Maintenance_FromAccountLookupFirstRecord;
	}

	// To Account Lookup First Value
	@FindBy(xpath = "//td[@id='td_gridtab_to_acc_sl_TA001MT_1_amfVO.BRANCH_CODE']")
	private WebElement transferAccounts_Maintenance_ToAccountLookupFirstRecord;

	public WebElement transferAccounts_Maintenance_ToAccountLookupFirstRecord() {
		return transferAccounts_Maintenance_ToAccountLookupFirstRecord;
	}

	// Destination Branch
	@FindBy(xpath = "//input[@id='lookuptxt_dest_branch_TA001MT']")
	private WebElement transferAccounts_Maintenance_DestinationBranch;

	public WebElement transferAccounts_Maintenance_DestinationBranch() {
		return transferAccounts_Maintenance_DestinationBranch;
	}

	// Destination Branch lookup button
	@FindBy(xpath = "//span[@id='spanLookup_dest_branch_TA001MT']")
	private WebElement transferAccounts_Maintenance_DestinationBranchLookup;

	public WebElement transferAccounts_Maintenance_DestinationBranchLookup() {
		return transferAccounts_Maintenance_DestinationBranchLookup;
	}

	// Destination Branch lookup branch code input
	@FindBy(xpath = "//input[@id='gridtab_dest_branch_TA001MT_gs_BRANCH_CODE']")
	private WebElement transferAccounts_Maintenance_DestinationBranchLookupBranchCodeInput;

	public WebElement transferAccounts_Maintenance_DestinationBranchLookupBranchCodeInput() {
		return transferAccounts_Maintenance_DestinationBranchLookupBranchCodeInput;
	}

	// Destination Branch lookup branch code first row
	@FindBy(xpath = "//td[@id='td_gridtab_dest_branch_TA001MT_1_BRANCH_CODE']")
	private WebElement transferAccounts_Maintenance_DestinationBranchLookupBranchCodeFirstRow;

	public WebElement transferAccounts_Maintenance_DestinationBranchLookupBranchCodeFirstRow() {
		return transferAccounts_Maintenance_DestinationBranchLookupBranchCodeFirstRow;
	}

	// Retrieve button under maintenance
	@FindBy(xpath = "//button[@id='transferAccounts_retrieve_TA001MT']/span")
	private WebElement transferAccounts_Maintenance_RetrieveButton;

	public WebElement transferAccounts_Maintenance_RetrieveButton() {
		return transferAccounts_Maintenance_RetrieveButton;
	}

	// Save button under maintenance
	@FindBy(xpath = "//button[@id='transferAccounts_save_TA001MT']/span")
	private WebElement transferAccounts_Maintenance_SaveButton;

	public WebElement transferAccounts_Maintenance_SaveButton() {
		return transferAccounts_Maintenance_SaveButton;
	}

	// FromGL search under approve
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement transferAccounts_Approve_FromGlSearchInput;

	public WebElement transferAccounts_Approve_FromGlSearchInput() {
		return transferAccounts_Approve_FromGlSearchInput;
	}

	// ToGL search under approve
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.TO_ACC_GL']")
	private WebElement transferAccounts_Approve_ToGlSearchInput;

	public WebElement transferAccounts_Approve_ToGlSearchInput() {
		return transferAccounts_Approve_ToGlSearchInput;
	}

	// First Batch number search under approve
	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001P_1_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement transferAccounts_Approve_FirstBatchNumberRecord;

	public WebElement transferAccounts_Approve_FirstBatchNumberRecord() {
		return transferAccounts_Approve_FirstBatchNumberRecord;
	}

	// Approve Button under approve
	@FindBy(xpath = "//button[@id='transferAccounts_approve_TA001P']/span")
	private WebElement transferAccounts_Approve_ApproveButton;

	public WebElement transferAccounts_Approve_ApproveButton() {
		return transferAccounts_Approve_ApproveButton;
	}

	// FromGL search under Transfer
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement transferAccounts_Transfer_FromGlSearchInput;

	public WebElement transferAccounts_Transfer_FromGlSearchInput() {
		return transferAccounts_Transfer_FromGlSearchInput;
	}

	// ToGL search under Transfer
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.TO_ACC_GL']")
	private WebElement transferAccounts_Transfer_ToGlSearchInput;

	public WebElement transferAccounts_Transfer_ToGlSearchInput() {
		return transferAccounts_Transfer_ToGlSearchInput;
	}

	// First Batch number search under Transfer
	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001T_1_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement transferAccounts_Transfer_FirstBatchNumberRecord;

	public WebElement transferAccounts_Transfer_FirstBatchNumberRecord() {
		return transferAccounts_Transfer_FirstBatchNumberRecord;
	}

	// transfer button under Transfer
	@FindBy(xpath = "//button[@id='transferAccounts_transfer_TA001T']/span")
	private WebElement transferAccounts_Transfer_TransferButton;

	public WebElement transferAccounts_Transfer_TransferButton() {
		return transferAccounts_Transfer_TransferButton;
	}

	// Search button under maintenance
	@FindBy(xpath = "//a[@id='infoBarSearchButton_TA001MT']")
	private WebElement transferAccounts_Maintenance_SearchButton;

	public WebElement transferAccounts_Maintenance_SearchButton() {
		return transferAccounts_Maintenance_SearchButton;
	}

	// row 1
	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_0_rn']")
	private WebElement transferAccounts_Maintenance_Row1;

	public WebElement transferAccounts_Maintenance_Row1() {
		return transferAccounts_Maintenance_Row1;
	}

	// Approve screen Transfer type
	@FindBy(xpath = "//select[@id='transferTypeId_TA001P']")
	private WebElement transferAccounts_Approve_TransferType;

	public WebElement transferAccounts_Approve_TransferType() {
		return transferAccounts_Approve_TransferType;
	}

	// Transfer screen Transfer type
	@FindBy(xpath = "//select[@id='transferTypeId_TA001T']")
	private WebElement transferAccounts_Transfer_TransferType;

	public WebElement transferAccounts_Transfer_TransferType() {
		return transferAccounts_Transfer_TransferType;
	}

	// Transfer completed message
	@FindBy(xpath = "//div[text()='Transfer Accounts']/../following-sibling::div/div")
	private WebElement transferAccounts_Transfer_TransferCompletedMessage;

	public WebElement transferAccounts_Transfer_TransferCompletedMessage() {
		return transferAccounts_Transfer_TransferCompletedMessage;
	}

	// Transfer completed alert box ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement transferAccounts_Transfer_TransferCompletedMessageOkButton;

	public WebElement transferAccounts_Transfer_TransferCompletedMessageOkButton() {
		return transferAccounts_Transfer_TransferCompletedMessageOkButton;
	}

	/////////////////////////////////////// TA_046///////////////////////////////

	// Cif
	@FindBy(xpath = "//input[@id='lookuptxt_original_CIF_TA001MT']")
	private WebElement transferAccounts_Maintenance_Cif;

	public WebElement transferAccounts_Maintenance_Cif() {
		return transferAccounts_Maintenance_Cif;
	}

	// Original GL
	@FindBy(xpath = "//input[@id='lookuptxt_original_gl_TA001MT']")
	private WebElement transferAccounts_Maintenance_OriginalGL;

	public WebElement transferAccounts_Maintenance_OriginalGL() {
		return transferAccounts_Maintenance_OriginalGL;
	}

	// Destination GL
	@FindBy(xpath = "//input[@id='lookuptxt_destination_gl_TA001MT']")
	private WebElement transferAccounts_Maintenance_DestinationGL;

	public WebElement transferAccounts_Maintenance_DestinationGL() {
		return transferAccounts_Maintenance_DestinationGL;
	}

	// OriginalGL search under approve
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.ORIGINAL_GL']")
	private WebElement transferAccounts_Approve_OriginalGlSearchInput;

	public WebElement transferAccounts_Approve_OriginalGlSearchInput() {
		return transferAccounts_Approve_OriginalGlSearchInput;
	}

	// DestinationGL search under approve
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.DESTINATION_GL']")
	private WebElement transferAccounts_Approve_DestinationGlSearchInput;

	public WebElement transferAccounts_Approve_DestinationGlSearchInput() {
		return transferAccounts_Approve_DestinationGlSearchInput;
	}

	// Reason under maintenance
	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_1_reason']/a")
	private WebElement transferAccounts_Maintenance_Reason;

	public WebElement transferAccounts_Maintenance_Reason() {
		return transferAccounts_Maintenance_Reason;
	}

	// Reason lookup under maintenance
	@FindBy(xpath = "//span[@id='spanLookup_statusReasonCode_TA001MT']")
	private WebElement transferAccounts_Maintenance_ReasonLookup;

	public WebElement transferAccounts_Maintenance_ReasonLookup() {
		return transferAccounts_Maintenance_ReasonLookup;
	}

	// Reason lookup code input under maintenance
	@FindBy(xpath = "//input[@id='gridtab_statusReasonCode_TA001MT_gs_CODE']")
	private WebElement transferAccounts_Maintenance_ReasonLookupCodeInput;

	public WebElement transferAccounts_Maintenance_ReasonLookupCodeInput() {
		return transferAccounts_Maintenance_ReasonLookupCodeInput;
	}

	// Reason lookup first row reason code under maintenance
	@FindBy(xpath = "//td[@id='td_gridtab_statusReasonCode_TA001MT_1_CODE']")
	private WebElement transferAccounts_Maintenance_ReasonLookupFirstRowCode;

	public WebElement transferAccounts_Maintenance_ReasonLookupFirstRowCode() {
		return transferAccounts_Maintenance_ReasonLookupFirstRowCode;
	}

	// Reason window title
	@FindBy(xpath = "//span[@id='ui-dialog-title-dialog_div_TA001MT']/parent::div")
	private WebElement transferAccounts_Maintenance_ReasonWindowTitle;

	public WebElement transferAccounts_Maintenance_ReasonWindowTitle() {
		return transferAccounts_Maintenance_ReasonWindowTitle;
	}

	// Failure Reason row 1
	@FindBy(xpath = "//td[@id='td_transferAccountsExcepTbl_Id_TA001MT_1_transferAccountsExcepVO.EXCEP_REASON']")
	private WebElement transferAccounts_Maintenance_FailureReasonRow1;

	public WebElement transferAccounts_Maintenance_FailureReasonRow1() {
		return transferAccounts_Maintenance_FailureReasonRow1;
	}

	// Failure Reason row 2
	@FindBy(xpath = "//td[@id='td_transferAccountsExcepTbl_Id_TA001MT_2_transferAccountsExcepVO.EXCEP_REASON']")
	private WebElement transferAccounts_Maintenance_FailureReasonRow2;

	public WebElement transferAccounts_Maintenance_FailureReasonRow2() {
		return transferAccounts_Maintenance_FailureReasonRow2;
	}

	// Set Exception button
	@FindBy(xpath = "//button[@id='transferAccountsMaint_setExceptions_TA001MT']/span")
	private WebElement transferAccounts_Maintenance_SetExceptionButton;

	public WebElement transferAccounts_Maintenance_SetExceptionButton() {
		return transferAccounts_Maintenance_SetExceptionButton;
	}

	// Set Exception add new row button
	@FindBy(xpath = "//td[@id='add_transferAccountsCriteriaTbl_Id_TA001MT']")
	private WebElement transferAccounts_Maintenance_SetExceptionAddNewRowButton;

	public WebElement transferAccounts_Maintenance_SetExceptionAddNewRowButton() {
		return transferAccounts_Maintenance_SetExceptionAddNewRowButton;
	}

	// Set Exception Exception Factor field
	@FindBy(xpath = "//td[@id='td_transferAccountsCriteriaTbl_Id_TA001MT_1_transferAccountsCriteriaVO.EXCEPTION_FACTOR']")
	private WebElement transferAccounts_Maintenance_ExceptionFactor;

	public WebElement transferAccounts_Maintenance_ExceptionFactor() {
		return transferAccounts_Maintenance_ExceptionFactor;
	}

	// Exception Factor column field
	@FindBy(xpath = "//th[@id='transferAccountsCriteriaTbl_Id_TA001MT_transferAccountsCriteriaVO.EXCEPTION_FACTOR']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorColumnField;

	public WebElement transferAccounts_Maintenance_ExceptionFactorColumnField() {
		return transferAccounts_Maintenance_ExceptionFactorColumnField;
	}

	// Set Exception Exception Factor DropDown
	@FindBy(xpath = "//select[@gridid='transferAccountsCriteriaTbl_Id_TA001MT']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorDropdown;

	public WebElement transferAccounts_Maintenance_ExceptionFactorDropdown() {
		return transferAccounts_Maintenance_ExceptionFactorDropdown;
	}

	// ExceptionFactor Account Currency
	@FindBy(xpath = "//option[text()='Account Currency']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorAccontCurrency;

	public WebElement transferAccounts_Maintenance_ExceptionFactorAccontCurrency() {
		return transferAccounts_Maintenance_ExceptionFactorAccontCurrency;
	}

	// ExceptionFactor CIF Type
	@FindBy(xpath = "//option[text()='CIF Type']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorCifType;

	public WebElement transferAccounts_Maintenance_ExceptionFactorCifType() {
		return transferAccounts_Maintenance_ExceptionFactorCifType;
	}

	// ExceptionFactor Dues
	@FindBy(xpath = "//option[text()='Dues']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorDues;

	public WebElement transferAccounts_Maintenance_ExceptionFactorDues() {
		return transferAccounts_Maintenance_ExceptionFactorDues;
	}

	// ExceptionFactor Facility Type
	@FindBy(xpath = "//option[text()='Facility Type']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorFacilityType;

	public WebElement transferAccounts_Maintenance_ExceptionFactorFacilityType() {
		return transferAccounts_Maintenance_ExceptionFactorFacilityType;
	}

	// ExceptionFactor Gl Type
	@FindBy(xpath = "//option[text()='GL Type']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorGlType;

	public WebElement transferAccounts_Maintenance_ExceptionFactorGlType() {
		return transferAccounts_Maintenance_ExceptionFactorGlType;
	}

	// ExceptionFactor Legal Status
	@FindBy(xpath = "//option[text()='Legal Status']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorLegalStatus;

	public WebElement transferAccounts_Maintenance_ExceptionFactorLegalStatus() {
		return transferAccounts_Maintenance_ExceptionFactorLegalStatus;
	}

	// ExceptionFactor Special Condition
	@FindBy(xpath = "//option[text()='Special Condition']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorSpecialCondition;

	public WebElement transferAccounts_Maintenance_ExceptionFactorSpecialCondition() {
		return transferAccounts_Maintenance_ExceptionFactorSpecialCondition;
	}

	// ExceptionFactor Ranking
	@FindBy(xpath = "//option[text()='Ranking']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorRanking;

	public WebElement transferAccounts_Maintenance_ExceptionFactorRanking() {
		return transferAccounts_Maintenance_ExceptionFactorRanking;
	}

	// ExceptionFactor Resident
	@FindBy(xpath = "//option[text()='Resident']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorResident;

	public WebElement transferAccounts_Maintenance_ExceptionFactorResident() {
		return transferAccounts_Maintenance_ExceptionFactorResident;
	}

	// ExceptionFactor Account Status
	@FindBy(xpath = "//option[text()='Account Status']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorAccountStatus;

	public WebElement transferAccounts_Maintenance_ExceptionFactorAccountStatus() {
		return transferAccounts_Maintenance_ExceptionFactorAccountStatus;
	}

	// ExceptionFactor A/C used in TFA
	@FindBy(xpath = "//option[text()='A/C used in TFA']")
	private WebElement transferAccounts_Maintenance_ExceptionFactorAccountUsedInTFA;

	public WebElement transferAccounts_Maintenance_ExceptionFactorAccountUsedInTFA() {
		return transferAccounts_Maintenance_ExceptionFactorAccountUsedInTFA;
	}

	// Audit Button under maintenance screen
	@FindBy(xpath = "//a[@id='auditButton_TA001MT']")
	private WebElement transferAccounts_Maintenance_AuditButton;

	public WebElement transferAccounts_Maintenance_AuditButton() {
		return transferAccounts_Maintenance_AuditButton;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParam_Parameters;

	public WebElement csmParam_Parameters() {
		return csmParam_Parameters;
	}

	// AccountsParameters
	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement csmParam_Parameters_AccountsParameters;

	public WebElement csmParam_Parameters_AccountsParameters() {
		return csmParam_Parameters_AccountsParameters;
	}

	// AccountsSuspendReason
	@FindBy(xpath = "//td[text()='Accounts Suspend Reason']")
	private WebElement accountsParameters_AccountsSuspendReason;

	public WebElement accountsParameters_AccountsSuspendReason() {
		return accountsParameters_AccountsSuspendReason;
	}

	// Maintenance under AccountsSuspendReason
	@FindBy(xpath = "//a[@id='P040MT']")
	private WebElement accountsParameters_AccountsSuspendReason_Maintenance;

	public WebElement accountsParameters_AccountsSuspendReason_Maintenance() {
		return accountsParameters_AccountsSuspendReason_Maintenance;
	}

	// Code
	@FindBy(xpath = "//input[@id='code_P040MT']")
	private WebElement accountsSuspendReason_Maintenance_Code;

	public WebElement accountsSuspendReason_Maintenance_Code() {
		return accountsSuspendReason_Maintenance_Code;
	}

	// status type dropdown
	@FindBy(xpath = "//select[@id='status_type_P040MT']")
	private WebElement accountsSuspendReason_Maintenance_StatusTypeDropdown;

	public WebElement accountsSuspendReason_Maintenance_StatusTypeDropdown() {
		return accountsSuspendReason_Maintenance_StatusTypeDropdown;
	}

	// Brief Name
	@FindBy(xpath = "//input[@id='brief_name_eng_P040MT']")
	private WebElement accountsSuspendReason_Maintenance_BriefName;

	public WebElement accountsSuspendReason_Maintenance_BriefName() {
		return accountsSuspendReason_Maintenance_BriefName;
	}

	// cannot reopen account flag
	@FindBy(xpath = "//input[@id='cannot_reopen_account_yn_P040MT']")
	private WebElement accountsSuspendReason_Maintenance_CannotReopenAccountFlag;

	public WebElement accountsSuspendReason_Maintenance_CannotReopenAccountFlag() {
		return accountsSuspendReason_Maintenance_CannotReopenAccountFlag;
	}

	// save button
	@FindBy(xpath = "//button[@id='accountsuspendreasonMaint_Maint_save_P040MT']")
	private WebElement accountsSuspendReason_Maintenance_SaveButton;

	public WebElement accountsSuspendReason_Maintenance_SaveButton() {
		return accountsSuspendReason_Maintenance_SaveButton;
	}

	// update button
	@FindBy(xpath = "//button[@id='update_btn_P040MT']")
	private WebElement accountsSuspendReason_Maintenance_UpdateButton;

	public WebElement accountsSuspendReason_Maintenance_UpdateButton() {
		return accountsSuspendReason_Maintenance_UpdateButton;
	}

	// Confirm ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement accountsSuspendReason_Maintenance_ConfirmOkButton;

	public WebElement accountsSuspendReason_Maintenance_ConfirmOkButton() {
		return accountsSuspendReason_Maintenance_ConfirmOkButton;
	}

	// warning ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement accountsSuspendReason_Maintenance_WarningOkButton;

	public WebElement accountsSuspendReason_Maintenance_WarningOkButton() {
		return accountsSuspendReason_Maintenance_WarningOkButton;
	}

	// Record success ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement accountsSuspendReason_Maintenance_RecordSuccessOkButton;

	public WebElement accountsSuspendReason_Maintenance_RecordSuccessOkButton() {
		return accountsSuspendReason_Maintenance_RecordSuccessOkButton;
	}

	// Search button
	@FindBy(xpath = "//a[@id='infoBarSearchButton_P040MT']")
	private WebElement accountsSuspendReason_Maintenance_SearchButton;

	public WebElement accountsSuspendReason_Maintenance_SearchButton() {
		return accountsSuspendReason_Maintenance_SearchButton;
	}

	// Search code
	@FindBy(xpath = "//input[@id='accountsuspendreasonList_GridTbl_Id_P040MT_gs_amfSuspendReasonVO.CODE']")
	private WebElement accountsSuspendReason_Maintenance_SearchCode;

	public WebElement accountsSuspendReason_Maintenance_SearchCode() {
		return accountsSuspendReason_Maintenance_SearchCode;
	}

	// First row Search code
	@FindBy(xpath = "//td[@id='td_accountsuspendreasonList_GridTbl_Id_P040MT_1_amfSuspendReasonVO.CODE']")
	private WebElement accountsSuspendReason_Maintenance_FirstRowCode;

	public WebElement accountsSuspendReason_Maintenance_FirstRowCode() {
		return accountsSuspendReason_Maintenance_FirstRowCode;
	}

	// delete
	@FindBy(xpath = "//button[@id='fom_Delete_btn_P040MT']/span[2]")
	private WebElement accountsSuspendReason_Maintenance_DeleteButton;

	public WebElement accountsSuspendReason_Maintenance_DeleteButton() {
		return accountsSuspendReason_Maintenance_DeleteButton;
	}

	// Accounts Menu
	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement accounts_MenuOption;

	public WebElement accounts_MenuOption() {
		return accounts_MenuOption;
	}

	// General Accounts
	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement accounts_GeneralAccounts;

	public WebElement accounts_GeneralAccounts() {
		return accounts_GeneralAccounts;
	}

	// Account Query Screen
	@FindBy(xpath = "//a[@id='A003']")
	private WebElement accounts_AccountQuery;

	public WebElement accounts_AccountQuery() {
		return accounts_AccountQuery;
	}

	// Maintenance under General Accounts
	@FindBy(xpath = "//a[@id='A002MA']/span[text()='Maintenance']")
	private WebElement accounts_GeneralAccounts_Maintenance;

	public WebElement accounts_GeneralAccounts_Maintenance() {
		return accounts_GeneralAccounts_Maintenance;
	}

	// Branch code search input under maintenance
	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.BRANCH_CODE']")
	private WebElement generalAccounts_Maintenance_BranchCodeSearchInput;

	public WebElement generalAccounts_Maintenance_BranchCodeSearchInput() {
		return generalAccounts_Maintenance_BranchCodeSearchInput;
	}

	// Currency search input under maintenance
	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CURRENCY_CODE']")
	private WebElement generalAccounts_Maintenance_CurrencySearchInput;

	public WebElement generalAccounts_Maintenance_CurrencySearchInput() {
		return generalAccounts_Maintenance_CurrencySearchInput;
	}

	// Gl Code search input under maintenance
	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.GL_CODE']")
	private WebElement generalAccounts_Maintenance_GlCodeSearchInput;

	public WebElement generalAccounts_Maintenance_GlCodeSearchInput() {
		return generalAccounts_Maintenance_GlCodeSearchInput;
	}

	// Cif Code search input under maintenance
	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement generalAccounts_Maintenance_CifCodeSearchInput;

	public WebElement generalAccounts_Maintenance_CifCodeSearchInput() {
		return generalAccounts_Maintenance_CifCodeSearchInput;
	}

	// Serial Number search input under maintenance
	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.SL_NO']")
	private WebElement generalAccounts_Maintenance_SlNoSearchInput;

	public WebElement generalAccounts_Maintenance_SlNoSearchInput() {
		return generalAccounts_Maintenance_SlNoSearchInput;
	}

	// First Record Status under maintenance
	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002MA_1_amfVO.STATUS']")
	private WebElement generalAccounts_Maintenance_FirstRecordStatus;

	public WebElement generalAccounts_Maintenance_FirstRecordStatus() {
		return generalAccounts_Maintenance_FirstRecordStatus;
	}

	// First Record AdditionalReference under maintenance
	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002MA_1_amfVO.ADDITIONAL_REFERENCE']")
	private WebElement generalAccounts_Maintenance_FirstRecordAdditionalReference;

	public WebElement generalAccounts_Maintenance_FirstRecordAdditionalReference() {
		return generalAccounts_Maintenance_FirstRecordAdditionalReference;
	}

	// First Record IBAN Account Number under maintenance
	@FindBy(xpath = "//td[@id='td_generalAccountsGridTbl_Id_A002MA_1_amfVO.IBAN_ACC_NO']")
	private WebElement generalAccounts_Maintenance_FirstRecordIBANnumber;

	public WebElement generalAccounts_Maintenance_FirstRecordIBANnumber() {
		return generalAccounts_Maintenance_FirstRecordIBANnumber;
	}

	// Branch code search input under Account query
	@FindBy(xpath = "//input[@id='accountQueryGrid_Id_A003_gs_BRANCH_CODE']")
	private WebElement accounts_AccountQuery_BranchCodeSearchInput;

	public WebElement accounts_AccountQuery_BranchCodeSearchInput() {
		return accounts_AccountQuery_BranchCodeSearchInput;
	}

	// Currency search input under Account query
	@FindBy(xpath = "//input[@id='accountQueryGrid_Id_A003_gs_CURRENCY_CODE']")
	private WebElement accounts_AccountQuery_CurrencySearchInput;

	public WebElement accounts_AccountQuery_CurrencySearchInput() {
		return accounts_AccountQuery_CurrencySearchInput;
	}

	// Gl Code search input under Account query
	@FindBy(xpath = "//input[@id='accountQueryGrid_Id_A003_gs_GL_CODE']")
	private WebElement accounts_AccountQuery_GlCodeSearchInput;

	public WebElement accounts_AccountQuery_GlCodeSearchInput() {
		return accounts_AccountQuery_GlCodeSearchInput;
	}

	// Cif Code search input under Account query
	@FindBy(xpath = "//input[@id='accountQueryGrid_Id_A003_gs_CIF_SUB_NO']")
	private WebElement accounts_AccountQuery_CifCodeSearchInput;

	public WebElement accounts_AccountQuery_CifCodeSearchInput() {
		return accounts_AccountQuery_CifCodeSearchInput;
	}

	// Serial Number search input under Account query
	@FindBy(xpath = "//input[@id='accountQueryGrid_Id_A003_gs_SL_NO']")
	private WebElement accounts_AccountQuery_SlNoSearchInput;

	public WebElement accounts_AccountQuery_SlNoSearchInput() {
		return accounts_AccountQuery_SlNoSearchInput;
	}

	// First Record branch code under Account query
	@FindBy(xpath = "//td[@id='td_accountQueryGrid_Id_A003_1_BRANCH_CODE']")
	private WebElement accounts_AccountQuery_FirstRecordBranchCode;

	public WebElement accounts_AccountQuery_FirstRecordBranchCode() {
		return accounts_AccountQuery_FirstRecordBranchCode;
	}

	// warning message ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement generalAccounts_Maintenance_WarningMessageOkButton;

	public WebElement generalAccounts_Maintenance_WarningMessageOkButton() {
		return generalAccounts_Maintenance_WarningMessageOkButton;
	}

	// No records
	@FindBy(xpath = "//div[text()='No records to view']")
	private WebElement generalAccounts_Maintenance_NoRecordsToView;

	public WebElement generalAccounts_Maintenance_NoRecordsToView() {
		return generalAccounts_Maintenance_NoRecordsToView;
	}

	// Avail CV Bal
	@FindBy(xpath = "//input[@id='amfCvAvailBalFmtStr_A003']")
	private WebElement accounts_AccountQuery_AvailCVbal;

	public WebElement accounts_AccountQuery_AvailCVbal() {
		return accounts_AccountQuery_AvailCVbal;
	}

	// User Running Date calendar use button
	@FindBy(xpath = "//label[text()='User Running Date ']/ancestor::tr/descendant::span")
	private WebElement chequeBookRequest_UserRunningDateCalendarUseButton;

	public WebElement chequeBookRequest_UserRunningDateCalendarUseButton() {
		return chequeBookRequest_UserRunningDateCalendarUseButton;
	}

	// calender popup after select
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement chequeBookRequest_CalendarSuccessfullyPopup;

	public WebElement chequeBookRequest_CalendarSuccessfullyPopup() {
		return chequeBookRequest_CalendarSuccessfullyPopup;
	}

	@FindBy(xpath = "//button[@id='_header_rundate_dialog_close']/span")
	private WebElement chequeBookRequest_CalendarCloseButton;

	public WebElement chequeBookRequest_CalendarCloseButton() {
		return chequeBookRequest_CalendarCloseButton;
	}

	// chequeBookRequest_HeaderRunningDate
	@FindBy(xpath = "//span[@id='hdr_runn_date']")
	private WebElement chequeBookRequest_HeaderRunningDate;

	public WebElement chequeBookRequest_HeaderRunningDate() {
		return chequeBookRequest_HeaderRunningDate;
	}

	// User Running Date input calendar
	@FindBy(xpath = "//input[@name='newUserRunDate']")
	private WebElement chequeBookRequest_UserRunningDateInputField;

	public WebElement chequeBookRequest_UserRunningDateInputField() {
		return chequeBookRequest_UserRunningDateInputField;
	}

	// calender holiday popup
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement chequeBookRequest_CalendarHolidayConfirmPopup;

	public WebElement chequeBookRequest_CalendarHolidayConfirmPopup() {
		return chequeBookRequest_CalendarHolidayConfirmPopup;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg;

	public WebElement POPupmsg() {
		return POPupmsg;
	}

	@FindBy(xpath = "//td[text()='Transfer Accounts']")
	private WebElement CSMCore_TransferAccounts;

	public WebElement CSMCoreTransferAccounts() {
		return CSMCore_TransferAccounts;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a")
	private WebElement CSMCore_TransferAccounts_Maintanance;

	public WebElement CSMCoreTransferAccountsMaintanance() {
		return CSMCore_TransferAccounts_Maintanance;
	}

	@FindBy(xpath = "//select[@name='transferAccountsCO.cts_TRSFR_ACCVO.TRANSFER_TYPE']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TransferType;

	public WebElement CSMCoreTransferAccountsMaintananceTransferType() {
		return CSMCore_TransferAccounts_Maintanance_TransferType;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_statusReasonCode_TA001MT']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Reason;

	public WebElement CSMCoreTransferAccountsMaintananceReason() {
		return CSMCore_TransferAccounts_Maintanance_Reason;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.DESTINATION_BRANCH']")
	private WebElement CSMCore_TransferAccounts_Maintanance_DestinationBranch;

	public WebElement CSMCoreTransferAccountsMaintananceDestinationBranch() {
		return CSMCore_TransferAccounts_Maintanance_DestinationBranch;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_BR']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_BranchCode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccBranchCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_BranchCode;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CY']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_Cycode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccCyCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_Cycode;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_GLcode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccGLCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_GLcode;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CIF']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_CIFcode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccCIFCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_CIFcode;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_SL']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_SLcode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccSLCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_SLcode;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_BR']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_Branchcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccBranchCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_Branchcode;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CY']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_CYcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccCYCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_CYcode;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_GLcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccGLCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_GLcode;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CIF']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_CIFcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccCIFCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_CIFcode;
	}

	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_SL']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_SLcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccSLCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_SLcode;
	}

	@FindBy(xpath = "//input[@id='transfer_cards_info_yn_TA001MT']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TransferOnCardInformationCheckBox;

	public WebElement CSMCoreTransferAccountsMaintananceTransferOnCardInformationCheckBox() {
		return CSMCore_TransferAccounts_Maintanance_TransferOnCardInformationCheckBox;
	}

	@FindBy(xpath = "//label[text()='Retrieve ']//parent::span//parent::button")
	private WebElement CSMCore_TransferAccounts_Maintanance_RetriveButton;

	public WebElement CSMCoreTransferAccountsMaintananceRetriveButton() {
		return CSMCore_TransferAccounts_Maintanance_RetriveButton;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_0_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no1;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno1() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no1;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_1_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no2;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno2() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no2;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_2_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no3;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno3() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no3;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_3_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no4;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno4() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no4;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_4_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no5;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno5() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no5;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_5_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no6;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno6() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no6;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_6_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no7;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno7() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no7;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_7_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no8;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno8() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no8;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_8_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no9;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno9() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no9;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_9_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no10;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno10() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no10;
	}

	@FindBy(xpath = "//label[text()='Save ']//parent::span//parent::button")
	private WebElement CSMCore_TransferAccounts_Maintanance_SaveButton;

	public WebElement CSMCoreTransferAccountsMaintananceSaveButton() {
		return CSMCore_TransferAccounts_Maintanance_SaveButton;
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

	@FindBy(xpath = "//span[text()='Approve']//parent::a")
	private WebElement CSMCore_TransferAccounts_Approve;

	public WebElement CSMCoreTransferAccountsApprove() {
		return CSMCore_TransferAccounts_Approve;
	}

	@FindBy(xpath = "//input[@id='batchNo_TA001P']")
	private WebElement CSMCore_TransferAccounts_Approve_GetBatchNo;

	public WebElement CSMCoreTransferAccountsApproveGetBatchNo() {
		return CSMCore_TransferAccounts_Approve_GetBatchNo;
	}

	// input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord;

	public WebElement CSMCoreTransferAccountsApproveEnterGlforRetriveRecord() {
		return CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.FROM_ACC_CIF']")
	private WebElement CSMCore_TransferAccounts_Approve_EnterCIFforRetriveRecord;

	public WebElement CSMCoreTransferAccountsApproveEnterCIFforRetriveRecord() {
		return CSMCore_TransferAccounts_Approve_EnterCIFforRetriveRecord;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.FROM_ACC_SL']")
	private WebElement CSMCore_TransferAccounts_Approve_EnterSLforRetriveRecord;

	public WebElement CSMCoreTransferAccountsApproveEnterSLforRetriveRecord() {
		return CSMCore_TransferAccounts_Approve_EnterSLforRetriveRecord;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_searchbutton_EnteroriginalGlforRetriveRecord;

	public WebElement CSMCoreTransferAccountssearchbuttonEnteroriginalGlforRetriveRecord() {
		return CSMCore_TransferAccounts_searchbutton_EnteroriginalGlforRetriveRecord;
	}

	@FindBy(xpath = "//table[@id='transferAccountsListGridTbl_Id_TA001P']")
	private WebElement CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord_doubleclick;

	public WebElement CSMCoreTransferAccountsApproveEnterGlforRetriveRecorddoubleclick() {
		return CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord_doubleclick;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp;

	public WebElement CSMOkButtonUnderInformationPopUp() {
		return CSM_OkButtonUnderInformationPopUp;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement updateAfterApprove_User_Param;

	public WebElement updateAfterApprove_User_Param() {
		return updateAfterApprove_User_Param;
	}

	// input[@id='accountsuspendreasonList_GridTbl_Id_P040MA_gs_amfSuspendReasonVO.CODE']
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
	}

	@FindBy(xpath = "//input[@id='accountsuspendreasonList_GridTbl_Id_P040MA_gs_amfSuspendReasonVO.CODE']")
	private WebElement Account_Reason_code_param;

	public WebElement Account_Reason_code_param() {
		return Account_Reason_code_param;
	}

	@FindBy(xpath = "//select[@id='status_type_P040MA']")
	private WebElement Status_Type_Account_Reason_code_param;

	public WebElement Status_Type_Account_Reason_code_param() {
		return Status_Type_Account_Reason_code_param;
	}

	@FindBy(xpath = "//input[@id='brief_name_eng_P040MA']")
	private WebElement Brief_name_Account_Reason_code_param;

	public WebElement Brief_name_Account_Reason_code_param() {
		return Brief_name_Account_Reason_code_param;
	}

	@FindBy(xpath = "//input[@id='cannot_reopen_account_yn_P040MA']")
	private WebElement Cannot_Reopen_flag_Account_Reason_code_param;

	public WebElement Cannot_Reopen_flag_Account_Reason_code_param() {
		return Cannot_Reopen_flag_Account_Reason_code_param;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_original_CIF_TA001MT']")
	private WebElement Original_CIF_Transfer_type;

	public WebElement Original_CIF_Transfer_type() {
		return Original_CIF_Transfer_type;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_original_gl_TA001MT']")
	private WebElement Original_GL_Transfer_type;

	public WebElement Original_GL_Transfer_type() {
		return Original_GL_Transfer_type;
	}

	@FindBy(xpath = "//input[@id='accountsuspendreasonList_GridTbl_Id_P040P_gs_amfSuspendReasonVO.CODE']")
	private WebElement Approve_code_value_account_reason;

	public WebElement Approve_code_value_account_reason() {
		return Approve_code_value_account_reason;
	}

	@FindBy(xpath = "//td[@id='td_accountsuspendreasonList_GridTbl_Id_P040MA_1_amfSuspendReasonVO.CODE']")
	private WebElement Double_click_account_reason_code;

	public WebElement Double_click_account_reason_code() {
		return Double_click_account_reason_code;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001T_1_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecord_doubleclick;

	public WebElement CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick() {
		return CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecord_doubleclick;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001MT_1_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecordunderSearchbutton_doubleclick;

	public WebElement CSMCoreTransferAccountsTransferEnterGlforRetriveRecordunderSearchbuttondoubleclick() {
		return CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecordunderSearchbutton_doubleclick;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001P_approve_key']")
	private WebElement CSMCore_TransferAccounts_Approve_ApproveButton;

	public WebElement CSMCoreTransferAccountsApproveApproveButton() {
		return CSMCore_TransferAccounts_Approve_ApproveButton;
	}

	@FindBy(xpath = "//span[text()='Transfer']//parent::span//parent::a")
	private WebElement CSMCore_TransferAccounts_Transfer;

	public WebElement CSMCoreTransferAccountsTransfer() {
		return CSMCore_TransferAccounts_Transfer;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Transfer_RetriveRecordGL;

	public WebElement CSMCoreTransferAccountsTransferRetriveRecordGL() {
		return CSMCore_TransferAccounts_Transfer_RetriveRecordGL;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.TO_ACC_BR']")
	private WebElement CSMCore_TransferAccounts_Transfer_Branchcode;

	public WebElement CSMCore_TransferAccounts_Transfer_Branchcode() {
		return CSMCore_TransferAccounts_Transfer_Branchcode;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Transfer_RetriveRecordApprovedStatus;

	public WebElement CSMCoreTransferAccountsTransferRetriveRecordApprovedStatus() {
		return CSMCore_TransferAccounts_Transfer_RetriveRecordApprovedStatus;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.BATCH_NO']")
	private WebElement CSMCore_TransferAccounts_Transfer_RetriveRecordBatchNo;

	public WebElement CSMCoreTransferAccountsTransferRetriveRecordBatchNo() {
		return CSMCore_TransferAccounts_Transfer_RetriveRecordBatchNo;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.FROM_ACC_CIF']")
	private WebElement CSMCore_TransferAccounts_Transfer_RetriveRecordCIF;

	public WebElement CSMCoreTransferAccountsTransferRetriveRecordCIF() {
		return CSMCore_TransferAccounts_Transfer_RetriveRecordCIF;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.FROM_ACC_SL']")
	private WebElement CSMCore_TransferAccounts_Transfer_RetriveRecordSL;

	public WebElement CSMCoreTransferAccountsTransferRetriveRecordSL() {
		return CSMCore_TransferAccounts_Transfer_RetriveRecordSL;
	}

	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001T_Transfer_key']")
	private WebElement CSMCore_TransferAccounts_Transfer_RetriveRecord_TransferButton;

	public WebElement CSMCoreTransferAccountsTransferRetriveRecordTransferButton() {
		return CSMCore_TransferAccounts_Transfer_RetriveRecord_TransferButton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSMCore_OK_Button;

	public WebElement CSMCoreOKButton() {
		return CSMCore_OK_Button;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_closeSymbol;

	public WebElement CSMCorecloseSymbol() {
		return CSMCore_closeSymbol;
	}

	// TA_026
	@FindBy(xpath = "//input[@id='lookuptxt_original_CIF_TA001MT']")
	private WebElement CSMCore_TransferAccounts_ByGLTOGL_CIFInput;

	public WebElement CSMCoreTransferAccountsByGLTOGLCIFInput() {
		return CSMCore_TransferAccounts_ByGLTOGL_CIFInput;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_original_gl_TA001MT']")
	private WebElement CSMCore_TransferAccounts_ByGLTOGL_OriginalGL;

	public WebElement CSMCoreTransferAccountsByGLTOGLOriginalGL() {
		return CSMCore_TransferAccounts_ByGLTOGL_OriginalGL;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_destination_gl_TA001MT']")
	private WebElement CSMCore_TransferAccounts_ByGLTOGL_DestinationGL;

	public WebElement CSMCoreTransferAccountsByGLTOGLDestinationGL() {
		return CSMCore_TransferAccounts_ByGLTOGL_DestinationGL;
	}

	// TA_029

	@FindBy(xpath = "//a[@id='infoBarSearchButton_TA001MT']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchbtn;

	public WebElement CSMCoreTransferAccountsmaintenancesearchbtn() {
		return CSMCore_TransferAccounts_maintenance_searchbtn;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.ORIGINAL_GL']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord;

	public WebElement CSMCoreTransferAccountsmaintenancesearchbtnenterrecord() {
		return CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_statusDesc']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord_ActiveStatus;

	public WebElement CSMCoreTransferAccountsmaintenancesearchbtnenterrecordActiveStatus() {
		return CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord_ActiveStatus;
	}

	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001MT_1_cts_TRSFR_ACCVO.ORIGINAL_GL']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord_doubleClick;

	public WebElement CSMCoreTransferAccountsmaintenancesearchbtnenterrecorddoubleClick() {
		return CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord_doubleClick;
	}

	// Transfer account param page object to deal with No access privilage alert
	// flags
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

	@FindBy(xpath = "//span[text()='No Access Privelege']//parent::td/div")
	private WebElement NoAccessprivilege_transfer72;

	public WebElement NoAccessprivilege_transfer72() {
		return NoAccessprivilege_transfer72;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_1_CUSTOM_FIELD'])[2]")
	private WebElement TransferBranchCreationUncheck_072;

	public WebElement TransferBranchCreationUncheck_072() {
		return TransferBranchCreationUncheck_072;
	}

	@FindBy(xpath = "//span[text()='1513-Transfer Batch Creation']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_1_ctscontrolAlertVO.ACTIVATE']/input")
	private WebElement TransferBranchCreationUncheckBOX_072;

	public WebElement TransferBranchCreationUncheckBOX_072() {
		return TransferBranchCreationUncheckBOX_072;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_2_CUSTOM_FIELD'])[2]")
	private WebElement TransactionCancellation_Uncheckbutton072;

	public WebElement TransactionCancellation_Uncheckbutton072() {
		return TransactionCancellation_Uncheckbutton072;
	}

	@FindBy(xpath = "//span[text()='1514-Transfer Cancellation']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_2_ctscontrolAlertVO.ACTIVATE']/input")
	private WebElement TransactionCancellation_Uncheckbutton_BOX_072;

	public WebElement TransactionCancellation_Uncheckbutton__BOX_072() {
		return TransactionCancellation_Uncheckbutton_BOX_072;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_3_CUSTOM_FIELD'])[2]")
	private WebElement NoAccessprivelegeUncheckbutton_072;

	public WebElement NoAccessprivelegeUncheckbutton_072() {
		return NoAccessprivelegeUncheckbutton_072;
	}

	@FindBy(xpath = "//span[text()='1515-No Access Privelege']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_3_ctscontrolAlertVO.ACTIVATE']/input")
	private WebElement NoAccessprivelegeUncheckbutton_BOX_072;

	public WebElement NoAccessprivelegeUncheckbutton_BOX_072() {
		return NoAccessprivelegeUncheckbutton_BOX_072;
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
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approvefield_Alert;

	public WebElement ApprovefieldAlert() {
		return Approvefield_Alert;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement Submit_Approvebutton_Alert;

	public WebElement SubmitApprovebuttonAlert() {
		return Submit_Approvebutton_Alert;
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

	// Approve reject page object on Transfer accounts

	@FindBy(xpath = "//label[text()='Reject ']//parent::span//parent::button")
	private WebElement csm_TransactionType_Approvefield_Rejectbutton;

	public WebElement csmTransactionTypeApprovefieldRejectbutton() {
		return csm_TransactionType_Approvefield_Rejectbutton;
	}

	// Cards management TA_082

	@FindBy(xpath = "//td[text()='Cards Management']")
	private WebElement csmCore_CardsManagement;

	public WebElement csmCoreCardsManagement() {
		return csmCore_CardsManagement;
	}

	@FindBy(xpath = "//td[text()='Card Request']")
	private WebElement csmCore_CardRequest;

	public WebElement csmCoreCardRequest() {
		return csmCore_CardRequest;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a")
	private WebElement csmCore_CardRequest_Maintenance;

	public WebElement csmCoreCardRequestMaintenance() {
		return csmCore_CardRequest_Maintenance;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_G001MT']")
	private WebElement csmCore_CardRequest_Maintenance_SearchButton;

	public WebElement csmCoreCardRequestMaintenanceSearchButton() {
		return csmCore_CardRequest_Maintenance_SearchButton;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001MT_gs_cardsAccountCO.accountVO.ACC_GL']")
	private WebElement csmCore_CardRequest_Maintenance_SearchButton_GL;

	public WebElement csmCoreCardRequestMaintenanceSearchButtonGL() {
		return csmCore_CardRequest_Maintenance_SearchButton_GL;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001MT_gs_cardsAccountCO.accountVO.ACC_CIF']")
	private WebElement csmCore_CardRequest_Maintenance_SearchButton_CIF;

	public WebElement csmCoreCardRequestMaintenanceSearchButtonCIF() {
		return csmCore_CardRequest_Maintenance_SearchButton_CIF;
	}

	@FindBy(xpath = "//input[@id='cardsMgmtGridTbl_Id_G001MT_gs_cardsAccountCO.accountVO.ACC_SL']")
	private WebElement csmCore_CardRequest_Maintenance_SearchButton_SL;

	public WebElement csmCoreCardRequestMaintenanceSearchButtonSL() {
		return csmCore_CardRequest_Maintenance_SearchButton_SL;
	}

	@FindBy(xpath = "//input[@id='application_id_G001MT']")
	private WebElement csmCore_CardRequest_Maintenance_SearchButton_ApplicationNo;

	public WebElement csmCoreCardRequestMaintenanceSearchButtonApplicationNo() {
		return csmCore_CardRequest_Maintenance_SearchButton_ApplicationNo;
	}

	@FindBy(xpath = "//table[@id='cardsMgmtGridTbl_Id_G001MT']")
	private WebElement csmCore_CardRequest_Maintenance_SearchButton_doubleclick;

	public WebElement csmCore_CardRequest_Maintenance_SearchButton_doubleclick() {
		return csmCore_CardRequest_Maintenance_SearchButton_doubleclick;
	}

	@FindBy(xpath = "//input[@id='rangeDef_TA001MTC']")
	private WebElement check_flag_ByCIF_Core_application;

	public WebElement check_flag_ByCIF_Core_application() {
		return check_flag_ByCIF_Core_application;
	}

	@FindBy(xpath = "//tr[@id='TA']")
	private WebElement ControlRecords_UAA_AlertActivation_transferAccounts_section;

	public WebElement ControlRecords_UAA_AlertActivation_transferAccounts_section() {
		return ControlRecords_UAA_AlertActivation_transferAccounts_section;
	}

	@FindBy(xpath = "//tr[@id='TA']//div")
	private WebElement ControlRecords_UAA_AlertActivation_transferAccounts_tree_btn;

	public WebElement ControlRecords_UAA_AlertActivation_transferAccounts_tree_btn() {
		return ControlRecords_UAA_AlertActivation_transferAccounts_tree_btn;
	}

	@FindBy(xpath = "//td[contains(@title,'No Access Privelege')]//parent::td/div")
	private WebElement ControlRecords_UAA_AlertActivation_tab_transferAccounts_section_NoAccessPrivelege;

	public WebElement ControlRecords_UAA_AlertActivation_tab_transferAccounts_section_NoAccessPrivelege() {
		return ControlRecords_UAA_AlertActivation_tab_transferAccounts_section_NoAccessPrivelege;
	}

	@FindBy(xpath = "//td[contains(@title,'No Access Privelege')]//following-sibling::td//input[@type='checkbox']")
	private WebElement ControlRecords_UAA_AlertActivation_tab_transferAccounts_section_NoAccessPrivelege_flag;

	public WebElement ControlRecords_UAA_AlertActivation_tab_transferAccounts_section_NoAccessPrivelege_flag() {
		return ControlRecords_UAA_AlertActivation_tab_transferAccounts_section_NoAccessPrivelege_flag;
	}

	@FindBy(xpath = "//table[@id='transferAccountsDetailTbl_Id_TA001MT']//tr[@id='1']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Selected_Record;

	public WebElement CSMCore_TransferAccounts_Maintanance_Selected_Record() {
		return CSMCore_TransferAccounts_Maintanance_Selected_Record;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.ORIGINAL_GL']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchgrid_original_GL;

	public WebElement CSMCore_TransferAccounts_maintenance_searchgrid_original_GL() {
		return CSMCore_TransferAccounts_maintenance_searchgrid_original_GL;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.CIF_NO']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchgrid_original_CIF;

	public WebElement CSMCore_TransferAccounts_maintenance_searchgrid_original_CIF() {
		return CSMCore_TransferAccounts_maintenance_searchgrid_original_CIF;
	}

	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_statusDesc']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchgrid_Status;

	public WebElement CSMCore_TransferAccounts_maintenance_searchgrid_Status() {
		return CSMCore_TransferAccounts_maintenance_searchgrid_Status;
	}

	@FindBy(xpath = "//select[contains(@id,'transferAccountsCriteriaVO.EXCEPTION_FACTOR')]")
	private WebElement transferAccounts_Exceptionfactor_Dropdown;

	public WebElement transferAccounts_Exceptionfactor_Dropdown() {
		return transferAccounts_Exceptionfactor_Dropdown;
	}

	@FindBy(xpath = "//table[@id='transferAccountsCriteriaTbl_Id_TA001MT']//tr[3]//td[2]")
	private WebElement transferAccounts_Maintenance_ExceptionFactor_Row2;

	public WebElement transferAccounts_Maintenance_ExceptionFactor_Row2() {
		return transferAccounts_Maintenance_ExceptionFactor_Row2;
	}

}
