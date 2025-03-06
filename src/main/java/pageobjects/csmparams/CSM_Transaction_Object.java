package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Transaction_Object {
	WebDriver driver;

	public CSM_Transaction_Object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement CSM_BranchCodeInCreditAcMInput_612;

	public WebElement CSM_BranchCodeInCreditAcMInput_612() {
		return CSM_BranchCodeInCreditAcMInput_612;

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

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CSM_CIFCodeInCreditAcInput_612;

	public WebElement CSM_CIFCodeInCreditAcInput_612() {
		return CSM_CIFCodeInCreditAcInput_612;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSM_SerialInCreditAcInput_612;

	public WebElement CSM_SerialInCreditAcInput_612() {
		return CSM_SerialInCreditAcInput_612;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement csm_SecondAccountCIFCodeUnderMaintenenanceTRX;

	public WebElement csmSecondAccountCIFCodeUnderMaintenenanceTRX() {
		return csm_SecondAccountCIFCodeUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement csm_SecondAccountSINOUnderMaintenenanceTRX;

	public WebElement csmSecondAccountSINOUnderMaintenenanceTRX() {
		return csm_SecondAccountSINOUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement transactions_MenuOption;

	public WebElement transactions_MenuOption() {
		return transactions_MenuOption;
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
	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']")
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

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_BranchCode;

	public WebElement Transactions_Maintenance_BranchCode() {
		return Transactions_Maintenance_BranchCode;
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
	@FindBy(xpath = "//div[contains(text(),'[3089] User does not have access to make a Transaction on his own Account.')]")
	private WebElement transactions_CannotProceedDisplayMessage;

	public WebElement transactions_CannotProceedDisplayMessage() {
		return transactions_CannotProceedDisplayMessage;
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

	@FindBy(xpath = "//td[text()='Transfer Accounts']")
	private WebElement transferAccounts_MenuOption;

	public WebElement transferAccounts_MenuOption() {
		return transferAccounts_MenuOption;
	}

	// Transfer Accounts Maintenance
	@FindBy(xpath = "//a[@id='TA001MT']")
	private WebElement transferAccounts_Maintenance;

	public WebElement transferAccounts_Maintenance() {
		return transferAccounts_Maintenance;
	}

	// Transfer Accounts Approve
	@FindBy(xpath = "//a[@id='TA001P']")
	private WebElement transferAccounts_Approve;

	public WebElement transferAccounts_Approve() {
		return transferAccounts_Approve;
	}

	// Transfer Accounts Transfer
	@FindBy(xpath = "//a[@id='TA001T']")
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

	// Parameters Menu
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
	@FindBy(xpath = "//a[@id='A002MA']")
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

	// User id input
	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement user_Approve_UserIdInput;

	public WebElement user_Approve_UserIdInput() {
		return user_Approve_UserIdInput;
	}

	// searched User id under user update after approve screen
	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID' and @title='USERA']")
	private WebElement user_Approve_FirstRowSearchedUserID;

	public WebElement user_Approve_FirstRowSearchedUserID() {
		return user_Approve_FirstRowSearchedUserID;
	}

	// Card Number
	@FindBy(xpath = "//input[@id='lookuptxt_CARD_NO_D001MT']")
	private WebElement transactions_Maintenance_CardNo;

	public WebElement transactions_Maintenance_CardNo() {
		return transactions_Maintenance_CardNo;
	}

	// Account details button
	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Account_details_key']/ancestor::button/span[2]")
//    					@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Account_details_key']")
	private WebElement transactions_Maintenance_AccountDetailsButton;

	public WebElement transactions_Maintenance_AccountDetailsButton() {
		return transactions_Maintenance_AccountDetailsButton;
	}

	// Booked Entries button
	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']/ancestor::button/span[2]")
	private WebElement transactions_Maintenance_BookedEntriesButton;

	public WebElement transactions_Maintenance_BookedEntriesButton() {
		return transactions_Maintenance_BookedEntriesButton;
	}

	// Account details GL column row 1
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']")
	private WebElement transactions_Maintenance_DebitAccountGLColumnRow1;

	public WebElement transactions_Maintenance_DebitAccountGLColumnRow1() {
		return transactions_Maintenance_DebitAccountGLColumnRow1;
	}

	// Account details GL column row 2
	@FindBy(xpath = "//tr[3]/td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']")
	private WebElement transactions_Maintenance_DebitAccountGLColumnRow2;

	public WebElement transactions_Maintenance_DebitAccountGLColumnRow2() {
		return transactions_Maintenance_DebitAccountGLColumnRow2;
	}

	// Account details row 2
	@FindBy(xpath = "//table[@id='trxMgntAccountDtlGridTbl_Id_D001MT']/tbody/tr[3]/td[1]")
	private WebElement transactions_Maintenance_DebitAccountRow2;

	public WebElement transactions_Maintenance_DebitAccountRow2() {
		return transactions_Maintenance_DebitAccountRow2;
	}

	// Account details GL
//    					@FindBy(xpath = "//tr[@class='jqgfirstrow']/following-sibling::tr/td[14]")
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountGL;

	public WebElement transactions_Maintenance_DebitAccountGL() {
		return transactions_Maintenance_DebitAccountGL;
	}

	// CIF
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountCif;

	public WebElement transactions_Maintenance_DebitAccountCif() {
		return transactions_Maintenance_DebitAccountCif;
	}

	// SL No
	@FindBy(xpath = "//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL']")
	private WebElement transactions_Maintenance_DebitAccountSlNo;

	public WebElement transactions_Maintenance_DebitAccountSlNo() {
		return transactions_Maintenance_DebitAccountSlNo;
	}

	// Amount in Trs CY
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.FC_AMOUNT']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountAmountInTrs;

	public WebElement transactions_Maintenance_DebitAccountAmountInTrs() {
		return transactions_Maintenance_DebitAccountAmountInTrs;
	}

	// Instruction1
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS1']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountInstruction1;

	public WebElement transactions_Maintenance_DebitAccountInstruction1() {
		return transactions_Maintenance_DebitAccountInstruction1;
	}

	// Instruction2
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS2']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountInstruction2;

	public WebElement transactions_Maintenance_DebitAccountInstruction2() {
		return transactions_Maintenance_DebitAccountInstruction2;
	}

	// AccountDetails ok button
	@FindBy(xpath = "//span[text()='ok']")
	private WebElement transactions_Maintenance_AccountDetailsOkButton;

	public WebElement transactions_Maintenance_AccountDetailsOkButton() {
		return transactions_Maintenance_AccountDetailsOkButton;
	}

	// Account Details Add button
	@FindBy(xpath = "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement transactions_Maintenance_AccountDetailsAddButton;

	public WebElement transactions_Maintenance_AccountDetailsAddButton() {
		return transactions_Maintenance_AccountDetailsAddButton;
	}

	// AvailBalAfterAmount
	@FindBy(xpath = "//input[@id='avail_bal_after_D001MT']")
	private WebElement transactions_Maintenance_AvailBalAfterAmount;

	public WebElement transactions_Maintenance_AvailBalAfterAmount() {
		return transactions_Maintenance_AvailBalAfterAmount;
	}

	// to AvailBalAfterAmount
	@FindBy(xpath = "//input[@id='to_avail_bal_after_D001MT']")
	private WebElement transactions_Maintenance_ToAvailBalAfterAmount;

	public WebElement transactions_Maintenance_ToAvailBalAfterAmount() {
		return transactions_Maintenance_ToAvailBalAfterAmount;
	}

	// Transaction Approve screen
	@FindBy(xpath = "//a[@id='D001AU']")
	private WebElement transactions_Approve;

	public WebElement transactions_Approve() {
		return transactions_Approve;
	}

	// Transaction Reject screen
	@FindBy(xpath = "//a[@id='D001RJ']")
	private WebElement transactions_Reject;

	public WebElement transactions_Reject() {
		return transactions_Reject;
	}

	// search TransactionNo in approve screen
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement transactions_Approve_TransactionNo;

	public WebElement transactions_Approve_TransactionNo() {
		return transactions_Approve_TransactionNo;
	}

	// search TransactionNo in Maintenance screen
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement transactions_Maintenance_TransactionNo;

	public WebElement transactions_Maintenance_TransactionNo() {
		return transactions_Maintenance_TransactionNo;
	}

	// search active status in approve Screen
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_statusDesc']")
	private WebElement transactions_Approve_StatusSearch;

	public WebElement transactions_Approve_StatusSearch() {
		return transactions_Approve_StatusSearch;
	}

	// search active status in maintenance Screen
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_statusDesc']")
	private WebElement transactions_Maintenance_StatusSearch;

	public WebElement transactions_Maintenance_StatusSearch() {
		return transactions_Maintenance_StatusSearch;
	}

	// TransactionNo first active record in approve screen
	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement transactions_Approve_TransactionNoFirstActiveRecord;

	public WebElement transactions_Approve_TransactionNoFirstActiveRecord() {
		return transactions_Approve_TransactionNoFirstActiveRecord;
	}

	// TransactionNo first active record in Maintenance screen
	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement transactions_Maintenance_TransactionNoFirstActiveRecord;

	public WebElement transactions_Maintenance_TransactionNoFirstActiveRecord() {
		return transactions_Maintenance_TransactionNoFirstActiveRecord;
	}

	// Approve button in transaction
//    					@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	@FindBy(xpath = "//div[@id='trxMgmtToolBar_D001AU']/descendant::button[1]")
	private WebElement transactions_Approve_ApproveButton;

	public WebElement transactions_Approve_ApproveButton() {
		return transactions_Approve_ApproveButton;
	}

	// Search in maintenance
	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement transactions_Maintenance_SearchButton;

	public WebElement transactions_Maintenance_SearchButton() {
		return transactions_Maintenance_SearchButton;
	}

	// warning message HEAder
	@FindBy(xpath = "//div[text()='WARNING']")
	private WebElement transactions_Maintenance_WarningMessageHeader;

	public WebElement transactions_Maintenance_WarningMessageHeader() {
		return transactions_Maintenance_WarningMessageHeader;
	}

	// warning message ok button
//    					@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	@FindBy(xpath = "//div[text()='WARNING']/../following-sibling::center/input")
	private WebElement transactions_Maintenance_WarningMessageOkButton;

	public WebElement transactions_Maintenance_WarningMessageOkButton() {
		return transactions_Maintenance_WarningMessageOkButton;
	}

	// warning message
	@FindBy(xpath = "//div[text()='WARNING']/../following-sibling::div/div")
//    					@FindBy(xpath = "(//div[@class='jMsgbox-contentWrap'])[1]")
	private WebElement transactions_Maintenance_WarningMessage;

	public WebElement transactions_Maintenance_WarningMessage() {
		return transactions_Maintenance_WarningMessage;
	}

	// Success message
//    					@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	@FindBy(xpath = "//div[text()='Success']/../following-sibling::div/div")
//    					@FindBy(xpath = "(//div[@class='jMsgbox-contentWrap'])[1]")
	private WebElement transactions_Maintenance_SuccessMessage;

	public WebElement transactions_Maintenance_SuccessMessage() {
		return transactions_Maintenance_SuccessMessage;
	}

	// Success message in approve screen
	@FindBy(xpath = "//div[text()='Success']/../following-sibling::div/div")
	private WebElement transactions_Approve_SuccessMessage;

	public WebElement transactions_Approve_SuccessMessage() {
		return transactions_Approve_SuccessMessage;
	}

	// Success message ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement transactions_Maintenance_SuccessMessageOkButton;

	public WebElement transactions_Maintenance_SuccessMessageOkButton() {
		return transactions_Maintenance_SuccessMessageOkButton;
	}

	//////////////////////////////////////////////////////////////////////////

	// Alert Grid User_ID input
	@FindBy(xpath = "//input[@id='alertsGrid_Id_D001MT_gs_alertsParamCO.userId']")
	private WebElement transactions_Teller_AlertGrid_UserID;

	public WebElement transactions_Teller_AlertGrid_UserID() {
		return transactions_Teller_AlertGrid_UserID;
	}

	// Alert Grid User_ID First row
	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_D001MT_1_alertsParamCO.userId']")
	private WebElement transactions_Teller_AlertGrid_FirstRowUserID;

	public WebElement transactions_Teller_AlertGrid_FirstRowUserID() {
		return transactions_Teller_AlertGrid_FirstRowUserID;
	}

	// AlertBoxInBM_TrxNo
	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement transactions_AlertBoxInBM_TrxNo;

	public WebElement transactions_AlertBoxInBM_TrxNo() {
		return transactions_AlertBoxInBM_TrxNo;
	}

	// FirstTrxNoCheckbox
	@FindBy(xpath = "//input[@id='jqg_trsAckTOutAlertGrid_Id_RCVALERT_1.TODO_PARAM']")
	private WebElement transactions_AlertBoxInBM_FirstTrxNoCheckbox;

	public WebElement transactions_AlertBoxInBM_FirstTrxNoCheckbox() {
		return transactions_AlertBoxInBM_FirstTrxNoCheckbox;
	}

	// Local SendAlert Approve button
	@FindBy(xpath = "//a[@id='approveBut_D001MT']")
	private WebElement transactions_SendAlertBoxLocal_ApproveButton;

	public WebElement transactions_SendAlertBoxLocal_ApproveButton() {
		return transactions_SendAlertBoxLocal_ApproveButton;
	}

	// User information user input field
	@FindBy(xpath = "//input[@id='usr_name_alert_D001MT']")
	private WebElement transactions_UserInformation_UserInputField;

	public WebElement transactions_UserInformation_UserInputField() {
		return transactions_UserInformation_UserInputField;
	}

	// User information Password input field
	@FindBy(xpath = "//input[@id='pwd_alert_D001MT']")
	private WebElement transactions_UserInformation_PwdInputField;

	public WebElement transactions_UserInformation_PwdInputField() {
		return transactions_UserInformation_PwdInputField;
	}

	// User information Submit button
	@FindBy(xpath = "//button[@id='sendButtonForApprove_D001MT']")
	private WebElement transactions_UserInformation_SubmitButton;

	public WebElement transactions_UserInformation_SubmitButton() {
		return transactions_UserInformation_SubmitButton;
	}

	// Local Alert Approve button
	@FindBy(xpath = "//button[@id='alertsOpenItemApprove_D001MT']")
	private WebElement transactions_ApproveItemAlertBox_ApproveButton;

	public WebElement transactions_ApproveItemAlertBox_ApproveButton() {
		return transactions_ApproveItemAlertBox_ApproveButton;
	}

	// Local Alert Reject button
	@FindBy(xpath = "//button[@id='alertsOpenItemReject_D001MT']")
	private WebElement transactions_ApproveItemAlertBox_RejectButton;

	public WebElement transactions_ApproveItemAlertBox_RejectButton() {
		return transactions_ApproveItemAlertBox_RejectButton;
	}

	// Local Alert Modify button
	@FindBy(xpath = "//a[@id='trxMgntAlertModifyButton_RCVALERT']")
	private WebElement transactions_ApproveItemAlertBox_ModifyButton;

	public WebElement transactions_ApproveItemAlertBox_ModifyButton() {
		return transactions_ApproveItemAlertBox_ModifyButton;
	}

	// Alert Reject Reason dropdown
	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001AU_ALERT']")
		private WebElement transactions_ApproveItemAlertBox_RejectReason;

		public WebElement transactions_ApproveItemAlertBox_RejectReason() {
			return transactions_ApproveItemAlertBox_RejectReason;
		}

	// Alert Modify Reason textarea
	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001AU_ALERT']")
	private WebElement transactions_ApproveItemAlertBox_ModifyReason;

	public WebElement transactions_ApproveItemAlertBox_ModifyReason() {
		return transactions_ApproveItemAlertBox_ModifyReason;
	}

	// Local alert approve Record current status
	@FindBy(xpath = "//input[@id='current_status_D001MT']")
	private WebElement transactions_LocalAlertApprove_CurrentStatus;

	public WebElement transactions_LocalAlertApprove_CurrentStatus() {
		return transactions_LocalAlertApprove_CurrentStatus;
	}

	// Reject Confirmation ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement transactions_ApproveItemAlertBox_ConfirmOkButton;

	public WebElement transactions_ApproveItemAlertBox_ConfirmOkButton() {
		return transactions_ApproveItemAlertBox_ConfirmOkButton;
	}

	// Charges details cash deduct
	@FindBy(xpath = "//select[@id='cash_deduct_ind_D001MT']")
	private WebElement transactions_TrxManagement_ChargesDeductDropdown;

	public WebElement transactions_TrxManagement_ChargesDeductDropdown() {
		return transactions_TrxManagement_ChargesDeductDropdown;
	}

	// Charges button
	@FindBy(xpath = "//button[@id='btnCharges_D001MT']")
	private WebElement transactions_TrxManagement_ChargesButton;

	public WebElement transactions_TrxManagement_ChargesButton() {
		return transactions_TrxManagement_ChargesButton;
	}

	// Waive Charges button
	@FindBy(xpath = "//button[@id='btnWaiveCharges_D001MT']")
	private WebElement transactions_TrxManagement_WaiveChargesButton;

	public WebElement transactions_TrxManagement_WaiveChargesButton() {
		return transactions_TrxManagement_WaiveChargesButton;
	}

	// new amount under Charges button
	@FindBy(xpath = "//input[@id='new_amount_input_D001MT']")
	private WebElement transactions_TrxManagement_NewAmount;

	public WebElement transactions_TrxManagement_NewAmount() {
		return transactions_TrxManagement_NewAmount;
	}

	// apply to select amount under Charges button
	@FindBy(xpath = "//button[@id='appToSelAmnt_D001MT']")
	private WebElement transactions_TrxManagement_ApplyToSelectAmount;

	public WebElement transactions_TrxManagement_ApplyToSelectAmount() {
		return transactions_TrxManagement_ApplyToSelectAmount;
	}

	// New Amount Editable textbox
	@FindBy(xpath = "//td[@tdlabel='New Amount']/div/input")
	private WebElement transactions_TrxManagement_NewAmountEditableTextBox;

	public WebElement transactions_TrxManagement_NewAmountEditableTextBox() {
		return transactions_TrxManagement_NewAmountEditableTextBox;
	}

	// mode of payment dropdown
	@FindBy(xpath = "//select[@id='trsfr_method_D001MT']")
	private WebElement transactions_TrxManagement_ModeOfPaymentDropdown;

	public WebElement transactions_TrxManagement_ModeOfPaymentDropdown() {
		return transactions_TrxManagement_ModeOfPaymentDropdown;
	}

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
//    					@FindBy(xpath = "//span[text()='Account Balance Overdrawn']")
	@FindBy(xpath = "//td[@title='Account Balance Overdrawn']/div/div")
	private WebElement controlRecord_AlertActivationTab_AccountBalanceOverdrawn;

	public WebElement controlRecord_AlertActivationTab_AccountBalanceOverdrawn() {
		return controlRecord_AlertActivationTab_AccountBalanceOverdrawn;
	}

	// Staff Accounts Transaction Span
//    					@FindBy(xpath = "//td[@id='td_tab4_GridTbl_Id_O001UP_33_CUSTOM_FIELD']/span[text()='0048-Staff Accounts Transaction']")
//    					@FindBy(xpath = "//td[@title='0048-Staff Accounts Transaction']/span")
	@FindBy(xpath = "//tr[@id='1x1x48']")
	private WebElement controlRecord_AlertActivationTab_StaffAccountsTransactionSpan;

	public WebElement controlRecord_AlertActivationTab_StaffAccountsTransactionSpan() {
		return controlRecord_AlertActivationTab_StaffAccountsTransactionSpan;
	}

	// Staff Accounts Transaction checked checkbox
	@FindBy(xpath = "//span[text()='0048-Staff Accounts Transaction']/../../td[2]/input[@checked='checked']")
//    					@FindBy(xpath = "//span[text()='0048-Staff Accounts Transaction']/../../td[2]/input")
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

//    					// branch code first row 
//    					@FindBy(xpath = "//td[@id='td_gridtab_cif_no_E000MA_1_BRANCH_CODE']")
//    					private WebElement systemParameters_User_CifLookupFirstRowBranchCode;
	//
//    					public WebElement systemParameters_User_CifLookupFirstRowBranchCode() {
//    						return systemParameters_User_CifLookupFirstRowBranchCode;
//    					}

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

	// searched User id under user update after approve screen
	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID' and @title='USERA']")
	private WebElement user_UpdateAfterApprove_FirstRowSearchedUserID;

	public WebElement user_UpdateAfterApprove_FirstRowSearchedUserID() {
		return user_UpdateAfterApprove_FirstRowSearchedUserID;
	}

	// ChequeBook Request Menu
	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement chequeBookRequest_MenuOption;

	public WebElement chequeBookRequest_MenuOption() {
		return chequeBookRequest_MenuOption;
	}

	// Transactions Men
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

	// calendar close
	@FindBy(xpath = "//button[@id='_header_rundate_dialog_close']/span")
	private WebElement chequeBookRequest_CalendarCloseButton;

	public WebElement chequeBookRequest_CalendarCloseButton() {
		return chequeBookRequest_CalendarCloseButton;
	}

	// User Running Date calendar img
	@FindBy(xpath = "//label[text()='User Running Date ']/ancestor::tr/descendant::img")
	private WebElement chequeBookRequest_UserRunningDateCalendarImg;

	public WebElement chequeBookRequest_UserRunningDateCalendarImg() {
		return chequeBookRequest_UserRunningDateCalendarImg;
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

	// calender holiday popup
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement chequeBookRequest_CalendarHolidayConfirmPopup;

	public WebElement chequeBookRequest_CalendarHolidayConfirmPopup() {
		return chequeBookRequest_CalendarHolidayConfirmPopup;
	}

	// confirm ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement chequeBookRequest_ConfirmOkButton;

	public WebElement chequeBookRequest_ConfirmOkButton() {
		return chequeBookRequest_ConfirmOkButton;
	}

	// warning popup after save
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement chequeBookRequest_WarningPopup;

	public WebElement chequeBookRequest_WarningPopup() {
		return chequeBookRequest_WarningPopup;
	}

	// warning popup suspense accont
	@FindBy(xpath = "//div[contains(text(),'Suspense Account')]/ancestor::div[2]/descendant::input")
//    					@FindBy(xpath = "//div[contains(text(),'Suspense Account')]")
	private WebElement chequeBookRequest_SuspenseAccountWarningPopupOkButton;

	public WebElement chequeBookRequest_SuspenseAccountWarningPopupOkButton() {
		return chequeBookRequest_SuspenseAccountWarningPopupOkButton;
	}

	// change running date dialog box close button
	@FindBy(xpath = "//span[text()='Close']")
	private WebElement chequeBookRequest_ChangeRunningDateCloseButton;

	public WebElement chequeBookRequest_ChangeRunningDateCloseButton() {
		return chequeBookRequest_ChangeRunningDateCloseButton;
	}

//    					// Suspend
//    					@FindBy(xpath = "//span[text()='Suspend']")
//    					private WebElement chequeBookRequest_Suspend;
	//
//    					public WebElement chequeBookRequest_Suspend() {
//    						return chequeBookRequest_Suspend;
//    					}
	// --------------------------------SubMenu's----------------------------------//
	// Reactivate
	@FindBy(xpath = "//span[text()='Reactivate']")
	private WebElement chequeBookRequest_Reactivate;

	public WebElement chequeBookRequest_Reactivate() {
		return chequeBookRequest_Reactivate;
	}

	// To Reactivate
	@FindBy(xpath = "//span[text()='To Reactivate']")
	private WebElement chequeBookRequest_ToReactivate;

	public WebElement chequeBookRequest_ToReactivate() {
		return chequeBookRequest_ToReactivate;
	}

	// To Be Reversed Chequebook
	@FindBy(xpath = "//span[text()='To Be Reversed Chequebook']")
	private WebElement chequeBookRequest_ToBeReversedChequebook;

	public WebElement chequeBookRequest_ToBeReversedChequebook() {
		return chequeBookRequest_ToBeReversedChequebook;
	}

	// Reverse Chequebook
	@FindBy(xpath = "//span[text()='Reverse Chequebook']")
	private WebElement chequeBookRequest_ReverseChequebook;

	public WebElement chequeBookRequest_ReverseChequebook() {
		return chequeBookRequest_ReverseChequebook;
	}

	// Approve
	@FindBy(xpath = "//span[text()='Apply to Submit']")
	private WebElement chequeBookRequest_ApplyToSubmit;

	public WebElement chequeBookRequest_ApplyToSubmit() {
		return chequeBookRequest_ApplyToSubmit;
	}

	// Submit
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement chequeBookRequest_Submit;

	public WebElement chequeBookRequest_Submit() {
		return chequeBookRequest_Submit;
	}

	// Apply to submit
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement chequeBookRequest_Approve;

	public WebElement chequeBookRequest_Approve() {
		return chequeBookRequest_Approve;
	}

	// To Cancel
	@FindBy(xpath = "//span[text()='To Cancel']")
	private WebElement chequeBookRequest_ToCancel;

	public WebElement chequeBookRequest_ToCancel() {
		return chequeBookRequest_ToCancel;
	}

	// Approve Cancel
	@FindBy(xpath = "//span[text()='Approve Cancel']")
	private WebElement chequeBookRequest_ApproveCancel;

	public WebElement chequeBookRequest_ApproveCancel() {
		return chequeBookRequest_ApproveCancel;
	}

	// To be destroyed
	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement chequeBookRequest_ToBeDestroyed;

	public WebElement chequeBookRequest_ToBeDestroyed() {
		return chequeBookRequest_ToBeDestroyed;
	}

	// Approve Destroyed
	@FindBy(xpath = "//span[text()='Approve Destroyed']")
	private WebElement chequeBookRequest_ApproveDestroyed;

	public WebElement chequeBookRequest_ApproveDestroyed() {
		return chequeBookRequest_ApproveDestroyed;
	}

	// To Suspend
	@FindBy(xpath = "//span[text()='To Suspend']")
	private WebElement chequeBookRequest_ToSuspend;

	public WebElement chequeBookRequest_ToSuspend() {
		return chequeBookRequest_ToSuspend;
	}

	// Suspend
	@FindBy(xpath = "//span[text()='Suspend']")
	private WebElement chequeBookRequest_Suspend;

	public WebElement chequeBookRequest_Suspend() {
		return chequeBookRequest_Suspend;
	}

	// Send To Branch
	@FindBy(xpath = "//span[text()='Send To Branch']")
	private WebElement chequeBookRequest_SendToBranch;

	public WebElement chequeBookRequest_SendToBranch() {
		return chequeBookRequest_SendToBranch;
	}

	// In Branch
	@FindBy(xpath = "//span[text()='In Branch']")
	private WebElement chequeBookRequest_InBranch;

	public WebElement chequeBookRequest_InBranch() {
		return chequeBookRequest_InBranch;
	}

	// Approve / Reject Bulk Destroy
	@FindBy(xpath = "//span[text()='Approve / Reject Bulk Destroy']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy;

	public WebElement chequeBookRequest_ApproveRejectBulkDestroy() {
		return chequeBookRequest_ApproveRejectBulkDestroy;
	}

	// Bulk Destroy
	@FindBy(xpath = "//span[text()='Bulk Destroy']")
	private WebElement chequeBookRequest_BulkDestroy;

	public WebElement chequeBookRequest_BulkDestroy() {
		return chequeBookRequest_BulkDestroy;
	}

	// Destination Branch
	@FindBy(xpath = "//input[@id='lookuptxt_destinationBranch_Q000TB']")
	private WebElement chequeBookRequest_DestinationBranch;

	public WebElement chequeBookRequest_DestinationBranch() {
		return chequeBookRequest_DestinationBranch;
	}

	// Printing Location
	@FindBy(xpath = "//select[@id='printingLocation_Q000MT']")
	private WebElement chequeBookRequest_PrintingLocation;

	public WebElement chequeBookRequest_PrintingLocation() {
		return chequeBookRequest_PrintingLocation;
	}

	// In house select
	@FindBy(xpath = "//option[text()='In house']")
	private WebElement chequeBookRequest_InHouse;

	public WebElement chequeBookRequest_InHouse() {
		return chequeBookRequest_InHouse;
	}

	// ViewMemo CloseButton
	@FindBy(xpath = "//span[text()='close']")
	private WebElement chequeBookRequest_ViewMemoCloseButton;

	public WebElement chequeBookRequest_ViewMemoCloseButton() {
		return chequeBookRequest_ViewMemoCloseButton;
	}

	// --------------------------------Inside
	// SubMenu's----------------------------------//
	// Code input field
	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement chequeBookRequest_SubMenu_Code;

	public WebElement chequeBookRequest_SubMenu_Code() {
		return chequeBookRequest_SubMenu_Code;
	}

	// Maintenance screen
	@FindBy(xpath = "//td[text()=' Q000MT ']")
	private WebElement chequeBookRequest_MaintenanceScreen;

	public WebElement chequeBookRequest_MaintenanceScreen() {
		return chequeBookRequest_MaintenanceScreen;
	}

	// Status Desc input field
	@FindBy(xpath = "//input[@name='statusDesc']")
	private WebElement chequeBookRequest_SubMenu_StatusDesc;

	public WebElement chequeBookRequest_SubMenu_StatusDesc() {
		return chequeBookRequest_SubMenu_StatusDesc;
	}

	// record table row
	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000MT']/tbody/tr[2]")
	private WebElement chequeBookRequest_Maintenance_RecordRow1;

	public WebElement chequeBookRequest_Maintenance_RecordRow1() {
		return chequeBookRequest_Maintenance_RecordRow1;
	}

	// Search button
	@FindBy(xpath = "//a[text()=' Search ']")
	private WebElement chequeBookRequest_SubMenu_SearchButton;

	public WebElement chequeBookRequest_SubMenu_SearchButton() {
		return chequeBookRequest_SubMenu_SearchButton;
	}

	// Status button
	@FindBy(xpath = "//input[@id='status_Q000MT']")
	private WebElement chequeBookRequest_SubMenu_RecordStatus;

	public WebElement chequeBookRequest_SubMenu_RecordStatus() {
		return chequeBookRequest_SubMenu_RecordStatus;
	}

	// request number
	@FindBy(xpath = "//input[@id='code_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_RequestNumber;

	public WebElement chequeBookRequest_Maintenance_RequestNumber() {
		return chequeBookRequest_Maintenance_RequestNumber;
	}

	// Reactivate Button
	@FindBy(xpath = "//label[text()='Reactivate ']")
	private WebElement chequeBookRequest_Reactivate_ReactivateSubmitButton;

	public WebElement chequeBookRequest_Reactivate_ReactivateSubmitButton() {
		return chequeBookRequest_Reactivate_ReactivateSubmitButton;
	}

	// To Reactivate Button
	@FindBy(xpath = "//label[text()='To Reactivate ']")
	private WebElement chequeBookRequest_ToReactivate_ToReactivateSubmitButton;

	public WebElement chequeBookRequest_ToReactivate_ToReactivateSubmitButton() {
		return chequeBookRequest_ToReactivate_ToReactivateSubmitButton;
	}

	// To Be Reversed Button
	@FindBy(xpath = "//label[text()='To Be Reversed ']")
	private WebElement chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton;

	public WebElement chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton() {
		return chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton;
	}

	// To Be Reversed screen Status
	@FindBy(xpath = "//input[@id='status_Q000AR']")
	private WebElement chequeBookRequest_ToBeReversed_Status;

	public WebElement chequeBookRequest_ToBeReversed_Status() {
		return chequeBookRequest_ToBeReversed_Status;
	}

	// Approve Button
	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement chequeBookRequest_Approve_ApproveButton;

	public WebElement chequeBookRequest_Approve_ApproveButton() {
		return chequeBookRequest_Approve_ApproveButton;
	}

	// Reverse Button
	@FindBy(xpath = "//label[text()='Reverse ']")
	private WebElement chequeBookRequest_Reverse_ReverseSubmitButton;

	public WebElement chequeBookRequest_Reverse_ReverseSubmitButton() {
		return chequeBookRequest_Reverse_ReverseSubmitButton;
	}

	// Apply Submit Button
	@FindBy(xpath = "//label[text()='Apply Submit ']")
	private WebElement chequeBookRequest_AppltToSubmit_ApplySubmitButton;

	public WebElement chequeBookRequest_AppltToSubmit_ApplySubmitButton() {
		return chequeBookRequest_AppltToSubmit_ApplySubmitButton;
	}

	// Submit Button
	@FindBy(xpath = "//label[text()='Submit ']")
	private WebElement chequeBookRequest_Submit_SubmitButton;

	public WebElement chequeBookRequest_Submit_SubmitButton() {
		return chequeBookRequest_Submit_SubmitButton;
	}

	// Cancel reason lookup button
	@FindBy(xpath = "//span[@id='spanLookup_chq_cancel_reason_Q000TC']/span")
	private WebElement chequeBookRequest_ToCancel_CancelReasonLookupButton;

	public WebElement chequeBookRequest_ToCancel_CancelReasonLookupButton() {
		return chequeBookRequest_ToCancel_CancelReasonLookupButton;
	}

	// Cancel reason lookup code input
	@FindBy(xpath = "//input[@id='gridtab_chq_cancel_reason_Q000TC_gs_CODE']")
	private WebElement chequeBookRequest_ToCancel_CancelCodeInputLookup;

	public WebElement chequeBookRequest_ToCancel_CancelCodeInputLookup() {
		return chequeBookRequest_ToCancel_CancelCodeInputLookup;
	}

	// Cancel reason desc
	@FindBy(xpath = "//input[@id='chq_cancel_reason_desc_Q000TC']")
	private WebElement chequeBookRequest_ToCancel_CancelReasonDesc;

	public WebElement chequeBookRequest_ToCancel_CancelReasonDesc() {
		return chequeBookRequest_ToCancel_CancelReasonDesc;
	}

	// To Cancel Button
	@FindBy(xpath = "//label[text()='To Cancel ']")
	private WebElement chequeBookRequest_ToCancel_ToCancelButton;

	public WebElement chequeBookRequest_ToCancel_ToCancelButton() {
		return chequeBookRequest_ToCancel_ToCancelButton;
	}

	// Approve Cancel Button
	@FindBy(xpath = "//label[text()='Cancel ']")
	private WebElement chequeBookRequest_ApproveCancel_CancelButton;

	public WebElement chequeBookRequest_ApproveCancel_CancelButton() {
		return chequeBookRequest_ApproveCancel_CancelButton;
	}

	// To Destroyed Button
	@FindBy(xpath = "//label[text()='To Destroy ']")
	private WebElement chequeBookRequest_ToBeDestroyed_ToDestroyButton;

	public WebElement chequeBookRequest_ToBeDestroyed_ToDestroyButton() {
		return chequeBookRequest_ToBeDestroyed_ToDestroyButton;
	}

	// Destroy reason
	@FindBy(xpath = "//textarea[@id='status_remarks_Q000TD']")
	private WebElement chequeBookRequest_ToBeDestroyed_DestroyReason;

	public WebElement chequeBookRequest_ToBeDestroyed_DestroyReason() {
		return chequeBookRequest_ToBeDestroyed_DestroyReason;
	}

	// Approve Destroyed Button
	@FindBy(xpath = "//label[text()='Destroy ']")
	private WebElement chequeBookRequest_ApproveDestroyed_DestroyButton;

	public WebElement chequeBookRequest_ApproveDestroyed_DestroyButton() {
		return chequeBookRequest_ApproveDestroyed_DestroyButton;
	}

	// To Suspend Button
	@FindBy(xpath = "//label[text()='To Suspend ']")
	private WebElement chequeBookRequest_ToSuspend_ToSuspendButton;

	public WebElement chequeBookRequest_ToSuspend_ToSuspendButton() {
		return chequeBookRequest_ToSuspend_ToSuspendButton;
	}

	// Suspend Button
	@FindBy(xpath = "//label[text()='Suspend ']")
	private WebElement chequeBookRequest_Suspend_SuspendButton;

	public WebElement chequeBookRequest_Suspend_SuspendButton() {
		return chequeBookRequest_Suspend_SuspendButton;
	}

	// remove tab Button
	@FindBy(xpath = "//span[text()='Remove Tab']")
	private WebElement chequeBookRequest_SubMenu_RemoveTab;

	public WebElement chequeBookRequest_SubMenu_RemoveTab() {
		return chequeBookRequest_SubMenu_RemoveTab;
	}

	// Alert Close Button
	@FindBy(xpath = "//span[text()='close']")
	private WebElement chequeBookRequest_SubMenu_AlertClose;

	public WebElement chequeBookRequest_SubMenu_AlertClose() {
		return chequeBookRequest_SubMenu_AlertClose;
	}

	// ---------------------------Maintenance-------------------------//

	// NumberOfChequebook
	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_NumberOfChequebook;

	public WebElement chequeBookRequest_Maintenance_NumberOfChequebook() {
		return chequeBookRequest_Maintenance_NumberOfChequebook;
	}

	// CHEQUE_CODE input
	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_ChequeCODE;

	public WebElement chequeBookRequest_Maintenance_ChequeCODE() {
		return chequeBookRequest_Maintenance_ChequeCODE;
	}

	// Account Number Lookup
	@FindBy(xpath = "//span[@id='spanLookup_acc_sl_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_AccountNumberLookup;

	public WebElement chequeBookRequest_Maintenance_AccountNumberLookup() {
		return chequeBookRequest_Maintenance_AccountNumberLookup;
	}

	// BranchCode Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.BRANCH_CODE']")
//    					@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_BranchCODE;

	public WebElement chequeBookRequest_Maintenance_BranchCODE() {
		return chequeBookRequest_Maintenance_BranchCODE;
	}

	// Currency Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.CURRENCY_CODE']")
//    					@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_Currency;

	public WebElement chequeBookRequest_Maintenance_Currency() {
		return chequeBookRequest_Maintenance_Currency;
	}

	// GL Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.GL_CODE']")
//    					@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_GL;

	public WebElement chequeBookRequest_Maintenance_GL() {
		return chequeBookRequest_Maintenance_GL;
	}

	// Cif No Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.CIF_SUB_NO']")
//    					@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_CifNo;

	public WebElement chequeBookRequest_Maintenance_CifNo() {
		return chequeBookRequest_Maintenance_CifNo;
	}

	// Sl No Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.SL_NO']")
//    					@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_SerialNo;

	public WebElement chequeBookRequest_Maintenance_SerialNo() {
		return chequeBookRequest_Maintenance_SerialNo;
	}

	// BranchCODE Record
	@FindBy(xpath = "//td[@id='td_gridtab_acc_sl_Q000MT_1_amfVO.BRANCH_CODE']")
	private WebElement chequeBookRequest_Maintenance_BranchCodeRecord;

	public WebElement chequeBookRequest_Maintenance_BranchCodeRecord() {
		return chequeBookRequest_Maintenance_BranchCodeRecord;
	}

	// account no ref no
	@FindBy(xpath = "//input[@id='lookuptxt_acc_add_ref_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_AccountNumberRefNo;

	public WebElement chequeBookRequest_Maintenance_AccountNumberRefNo() {
		return chequeBookRequest_Maintenance_AccountNumberRefNo;
	}

	// Save Button
	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement chequeBookRequest_Maintenance_SaveButton;

	public WebElement chequeBookRequest_Maintenance_SaveButton() {
		return chequeBookRequest_Maintenance_SaveButton;
	}

	// AlertBoxUserIdInput
	@FindBy(xpath = "//input[@name='USER_ID']")
//    					@FindBy(xpath = "//input[@id='alertsGrid_Id_Q000MT_gs_alertsParamCO.userId']")
	private WebElement chequeBookRequest_Maintenance_AlertBoxUserIdInput;

	public WebElement chequeBookRequest_Maintenance_AlertBoxUserIdInput() {
		return chequeBookRequest_Maintenance_AlertBoxUserIdInput;
	}

	// AlertBoxUserId first row
	@FindBy(xpath = "//td[@tdlabel='User Id']")
//    					@FindBy(xpath = "//td[@id='td_alertsGrid_Id_Q000MT_1_alertsParamCO.userId']")
	private WebElement chequeBookRequest_Maintenance_AlertBoxUserIdFirstRow;

	public WebElement chequeBookRequest_Maintenance_AlertBoxUserIdFirstRow() {
		return chequeBookRequest_Maintenance_AlertBoxUserIdFirstRow;
	}

	// alert box send button
	@FindBy(xpath = "//span[text()=' Send ']")
//    					@FindBy(xpath = "//a[@id='sendBut_Q000MT']/span")
	private WebElement chequeBookRequest_Maintenance_AlertBoxSendButton;

	public WebElement chequeBookRequest_Maintenance_AlertBoxSendButton() {
		return chequeBookRequest_Maintenance_AlertBoxSendButton;
	}

	// alert Box
	@FindBy(xpath = "//span[text()='Alerts']/parent::div")
	private WebElement chequeBookRequest_AlertBox;

	public WebElement chequeBookRequest_AlertBox() {
		return chequeBookRequest_AlertBox;
	}

	// alert box Trx No
	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement chequeBookRequest_AlertBox_TrxNoInput;

	public WebElement chequeBookRequest_AlertBox_TrxNoInput() {
		return chequeBookRequest_AlertBox_TrxNoInput;
	}

	// open item
	@FindBy(xpath = "//a[text()='Open Item']")
	private WebElement chequeBookRequest_AlertBox_OpenItem;

	public WebElement chequeBookRequest_AlertBox_OpenItem() {
		return chequeBookRequest_AlertBox_OpenItem;
	}

	// approve button in alert box
	@FindBy(xpath = "//button[@id='alertsOpenItemApprove_RCVALERT']/span")
	private WebElement chequeBookRequest_AlertBox_ApproveButton;

	public WebElement chequeBookRequest_AlertBox_ApproveButton() {
		return chequeBookRequest_AlertBox_ApproveButton;
	}

	// approve item close button in alert box
	@FindBy(xpath = "//span[text()='Approve Item']/../a/span")
	private WebElement chequeBookRequest_AlertBox_ApproveItemClose;

	public WebElement chequeBookRequest_AlertBox_ApproveItemClose() {
		return chequeBookRequest_AlertBox_ApproveItemClose;
	}

	// Charges Button in alert box
	@FindBy(xpath = "//div[@id='chequeBookChargesDiv_Q000AP_ALERT']")
	private WebElement chequeBookRequest_AlertBox_Charges;

	public WebElement chequeBookRequest_AlertBox_Charges() {
		return chequeBookRequest_AlertBox_Charges;
	}

	// Waive charges button
	@FindBy(xpath = "//button[@id='chequebookChargesWaive_Q000AP_ALERT']/span")
	private WebElement chequeBookRequest_AlertBox_WaiveChargesButton;

	public WebElement chequeBookRequest_AlertBox_WaiveChargesButton() {
		return chequeBookRequest_AlertBox_WaiveChargesButton;
	}

	// Delete Button
	@FindBy(xpath = "//label[text()='Delete ']")
	private WebElement chequeBookRequest_Maintenance_DeleteButton;

	public WebElement chequeBookRequest_Maintenance_DeleteButton() {
		return chequeBookRequest_Maintenance_DeleteButton;
	}

	// Saved Record
	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000MT_1_ctschqbookVO.CODE']")
	private WebElement chequeBookRequest_Maintenance_SavedRecord;

	public WebElement chequeBookRequest_Maintenance_SavedRecord() {
		return chequeBookRequest_Maintenance_SavedRecord;
	}

	// Status Table
//    					@FindBy(xpath = "//a[@id='anchor_1955379083']/span[2]")
	@FindBy(xpath = "//span[text()=' Status ' and @class='ui-button-text']")
	private WebElement chequeBookRequest_Maintenance_StatusTable;

	public WebElement chequeBookRequest_Maintenance_StatusTable() {
		return chequeBookRequest_Maintenance_StatusTable;
	}

	// retrieve button in approve reject bulk destroy screen
	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BAD_retrieve_key']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_RetrieveKey;

	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_RetrieveKey() {
		return chequeBookRequest_ApproveRejectBulkDestroy_RetrieveKey;
	}

	// First Record Row
	@FindBy(xpath = "//table[@id='chequeBookBulkDestroyGridTbl_Id_Q000BAD']/tbody/tr[@id='1']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_FirstRecordRow;

	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_FirstRecordRow() {
		return chequeBookRequest_ApproveRejectBulkDestroy_FirstRecordRow;
	}

	// select all rows approve reject bulk destroy screen
	@FindBy(xpath = "//input[@id='cb_chequeBookBulkDestroyGridTbl_Id_Q000BAD']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows;

	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows() {
		return chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows;
	}

	// Record 1 checkbox in approve reject bulk destroy screen
	@FindBy(xpath = "//label[@id='jqg_chequeBookBulkDestroyGridTbl_Id_Q000BAD_1']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_FirstCheckbox;

	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_FirstCheckbox() {
		return chequeBookRequest_ApproveRejectBulkDestroy_FirstCheckbox;
	}

	// Record 2 checkbox in approve reject bulk destroy screen
	@FindBy(xpath = "//label[@id='jqg_chequeBookBulkDestroyGridTbl_Id_Q000BAD_2']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_SecondCheckbox;

	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_SecondCheckbox() {
		return chequeBookRequest_ApproveRejectBulkDestroy_SecondCheckbox;
	}

	// Destroy button approve reject bulk destroy screen
	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BAD_destroy_key']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_DestroyButton;

	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_DestroyButton() {
		return chequeBookRequest_ApproveRejectBulkDestroy_DestroyButton;
	}

	// retrieve button in bulk destroy screen
	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BTD_retrieve_key']")
	private WebElement chequeBookRequest_BulkDestroy_RetrieveKey;

	public WebElement chequeBookRequest_BulkDestroy_RetrieveKey() {
		return chequeBookRequest_BulkDestroy_RetrieveKey;
	}

	// First bulk destroy Record Row
	@FindBy(xpath = "//table[@id='chequeBookBulkDestroyGridTbl_Id_Q000BTD']/tbody/tr[@id='1']")
	private WebElement chequeBookRequest_BulkDestroy_FirstRecordRow;

	public WebElement chequeBookRequest_BulkDestroy_FirstRecordRow() {
		return chequeBookRequest_BulkDestroy_FirstRecordRow;
	}

	// bulk destroy remarks field
	@FindBy(xpath = "//textarea[@name='chequeBookCO.ctschqbookVO.STATUS_REMARKS']")
	private WebElement chequeBookRequest_BulkDestroy_Remarks;

	public WebElement chequeBookRequest_BulkDestroy_Remarks() {
		return chequeBookRequest_BulkDestroy_Remarks;
	}

	// bulk destroy To Destroy button
	@FindBy(xpath = "//button[@id='chequeBookBulkDestory_to_destroy_Q000BTD']/span")
	private WebElement chequeBookRequest_BulkDestroy_ToDestroyButton;

	public WebElement chequeBookRequest_BulkDestroy_ToDestroyButton() {
		return chequeBookRequest_BulkDestroy_ToDestroyButton;
	}

	// Charges Collapsible tab
	@FindBy(xpath = "//div[@id='chequeBookChargesDiv_Q000AP']/div[2]")
	private WebElement chequeBookRequest_Maintenance_ChargesCollapsible;

	public WebElement chequeBookRequest_Maintenance_ChargesCollapsible() {
		return chequeBookRequest_Maintenance_ChargesCollapsible;
	}

	// Waive Charges
	@FindBy(xpath = "//button[@id='chequebookChargesWaive_Q000AP']/span")
	private WebElement chequeBookRequest_Maintenance_WaiveCharges;

	public WebElement chequeBookRequest_Maintenance_WaiveCharges() {
		return chequeBookRequest_Maintenance_WaiveCharges;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement Transactions_CannotProceedPopUp_609;

	public WebElement Transactions_CannotProceedPopUp_609() {
		return Transactions_CannotProceedPopUp_609;
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

	// Date Start

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CoreTransactionsFlag;

	public WebElement Core_TransactionsFlag() {
		return CoreTransactionsFlag;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement TransactionsMaintenance;

	public WebElement Transactions_Maintenance() {
		return TransactionsMaintenance;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement MaintenanceTRXTypeBox;

	public WebElement Maintenance_TRXTypeBox() {
		return MaintenanceTRXTypeBox;
	}

	@FindBy(xpath = "//input[@id='trx_type_desc_D001MT']")
	private WebElement TRXTypeBoxClick;

	public WebElement TRXType_BoxClick() {
		return TRXTypeBoxClick;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement TRXTypeCurrencyCode;

	public WebElement TRXType_CurrencyCode() {
		return TRXTypeCurrencyCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement TRXTypeGLCode;

	public WebElement TRXType_GLCode() {
		return TRXTypeGLCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement TRXTypeCifCode;

	public WebElement TRXType_CifCode() {
		return TRXTypeCifCode;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement OkPopup;

	public WebElement Ok_Popup() {
		return OkPopup;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopup;

	public WebElement Close_Popup() {
		return ClosePopup;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement TRXTypeSerialNo;

	public WebElement TRXTypeSerial_No() {
		return TRXTypeSerialNo;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement CurrencyCodeFlag;

	public WebElement CurrencyCode_Flag() {
		return CurrencyCodeFlag;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement DebitAmount;

	public WebElement Debit_Amount() {
		return DebitAmount;
	}

	@FindBy(xpath = "//label[text()='Account Details ']")
	private WebElement AccountDetailsIcon;

	public WebElement Account_DetailsIcon() {
		return AccountDetailsIcon;
	}

	@FindBy(xpath = "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']//span")
	private WebElement AddIconAccountDetails;

	public WebElement AddIcon_AccountDetails() {
		return AddIconAccountDetails;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_rn']")
	private WebElement FirstRowClick;

	public WebElement First_RowClick() {
		return FirstRowClick;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']//input")
	private WebElement BrachCodeAccountDetails;

	public WebElement BranchCode_AccountDetails() {
		return BrachCodeAccountDetails;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']//input")
	private WebElement GLCodeAccountDetails;

	public WebElement GLCode_AccountDetails() {
		return GLCodeAccountDetails;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF']//input")
	private WebElement CIFCodeAccountDetails;

	public WebElement CIFCode_AccountDetails() {
		return CIFCodeAccountDetails;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_SL']//input")
	private WebElement SerialNumberAccountDetails;

	public WebElement SerialNumber_AccountDetails() {
		return SerialNumberAccountDetails;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.FC_AMOUNT']//input")
	private WebElement FirstAmountAccountDetails;

	public WebElement FirstAmount_AccountDetails() {
		return FirstAmountAccountDetails;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS1']//input")
	private WebElement FirstInstructions;

	public WebElement First_Instructions() {
		return FirstInstructions;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS2']//input")
	private WebElement SecondInstructions;

	public WebElement Second_Instructions() {
		return SecondInstructions;
	}

	@FindBy(xpath = "((//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_rn'])[2]")
	private WebElement SecondRowClick;

	public WebElement Second_RowClick() {
		return SecondRowClick;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']//input")
	private WebElement SecondBranchCode;

	public WebElement Second_BranchCode() {
		return SecondBranchCode;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']//input")
	private WebElement SecondGlCode;

	public WebElement Second_Glcode() {
		return SecondGlCode;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF']//input")
	private WebElement SecondCifCode;

	public WebElement Second_CifCode() {
		return SecondCifCode;
	}

	@FindBy(xpath = "//table[@id='liveSearchTb_new_1685593408516_ctstrsACCDETVO.AC_SL']//input")
	private WebElement SecondSerialNumber;

	public WebElement Second_SerialNumber() {
		return SecondSerialNumber;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.FC_AMOUNT']//input")
	private WebElement SecondDebitAmount;

	public WebElement Second_DebitAmount() {
		return SecondDebitAmount;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS1']//input")
	private WebElement FirstInstructionsTwo;

	public WebElement FirstInstructions_Two() {
		return FirstInstructionsTwo;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS2']//input")
	private WebElement SecondInstructionsTwo;

	public WebElement SecondInstructions_Two() {
		return SecondInstructionsTwo;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement OkButtonAccountDetails;

	public WebElement OkButton_AccountDetails() {
		return OkButtonAccountDetails;
	}

	@FindBy(xpath = "//span[contains(text(),' Save ')]")
	private WebElement SaveButton;

	public WebElement Save_Button() {
		return SaveButton;
	}

	@FindBy(xpath = "//input[@id='ctrl_cy_D001MT']")
	private WebElement TRXTypeCurrencyCode2_604;

	public WebElement TRXType_CurrencyCode2_604() {
		return TRXTypeCurrencyCode2_604;
	}

	@FindBy(xpath = "//input[@id='ctrl_gl_D001MT']")
	private WebElement TRXTypeGLCode2_604;

	public WebElement TRXType_GLCode2_604() {
		return TRXTypeGLCode;
	}

	@FindBy(xpath = "//input[@id='ctrl_cif_D001MT']")
	private WebElement TRXTypeCifCode2;

	public WebElement TRXType_CifCode2_604() {
		return TRXTypeCifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_ctrl_sl_D001MT']")
	private WebElement TRXTypeSerialNo2;

	public WebElement TRXTypeSerial_No2_604() {
		return TRXTypeSerialNo;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Debit_Amount;

	public WebElement Debit_Amount_604() {
		return Debit_Amount;
	}
	// kou

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice_611;

	public WebElement ClosePopupmsg_frontoffice_611() {
		return ClosePopupmsg_frontoffice_611;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate_611;

	public WebElement CSMDateToChangeTheCurrentDate_611() {
		return CSM_DateToChangeTheCurrentDate_611;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate_611;

	public WebElement CSMDateInUserRunningDate_611() {
		return CSM_DateInUserRunningDate_611;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate_611;

	public WebElement CSMUseButtonInChangeRunningDate_611() {
		return CSM_UseButtonInChangeRunningDate_611;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_611;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_611() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday_611;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_611;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu_611() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_611;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_611;

	public WebElement CSMCloseButtonInChangeRunningDate_611() {
		return CSM_CloseButtonInChangeRunningDate;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon_611;

	public WebElement CSMTechnicalDetailsIcon_611() {
		return CSM_TechnicalDetailsIcon_611;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon_611;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_611() {
		return CSM_ClearCacheInTechnicalDetailsIcon_611;

	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_611;

	public WebElement CSMOkButtonUnderInformationPopUp_611() {
		return CSM_OkButtonUnderInformationPopUp_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Transactions_Trxtypevalue_611;

	public WebElement Transactions_Trxtypevalue_611() {
		return Transactions_Trxtypevalue_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_debitAcc_Currencycode_611;

	public WebElement Transactions_debitAcc_Currencycode_611() {
		return Transactions_debitAcc_Currencycode_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_debitAcc_Glcode_611;

	public WebElement Transactions_debitAcc_Glcode_611() {
		return Transactions_debitAcc_Glcode_611;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_debitAcc_Cifcode_611;

	public WebElement Transactions_debitAcc_Cifcode_611() {
		return Transactions_debitAcc_Cifcode_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_debitAcc_serialcode_611;

	public WebElement Transactions_debitAcc_serialcode_611() {
		return Transactions_debitAcc_serialcode_611;
	}
//    								@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
//    								private WebElement CSM_SerialIndebitAc;
//    								public WebElement CSM_SerialIndebitAc() {
//    									return CSM_SerialIndebitAc;
//    								}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn_611;

	public WebElement Transactions_Warning_okbtn_611() {
		return Transactions_Warning_okbtn_611;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_debitAcc_currency_611;

	public WebElement Transactions_debitAcc_currency_611() {
		return Transactions_debitAcc_currency_611;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_EnterAmount_611;

	public WebElement Transactions_EnterAmount_611() {
		return Transactions_EnterAmount_611;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered_611;

	public WebElement checkIfValueIsEntered_611() {
		return checkIfValueIsEntered_611;
	}

	@FindBy(id = "trxMgntSaveBtn_D001MT")
	private WebElement CSMSaveButtonInMaintenanceScreen_611;

	public WebElement CSMSaveButtonInMaintenanceScreen_611() {
		return CSMSaveButtonInMaintenanceScreen_611;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_611;

	public WebElement getTransactionNumber_611() {
		return getTransactionNumber_611;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMOkButtonInSuccessPopUpMenu_611;

	public WebElement CSMOkButtonInSuccessPopUpMenu_611() {
		return CSMOkButtonInSuccessPopUpMenu_611;
	}

	@FindBy(xpath = "//a[@id='D001AU']")
	private WebElement Transactions_Approvescrn_611;

	public WebElement Transactions_Approvescrn_611() {
		return Transactions_Approvescrn_611;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValues_611;

	public WebElement Transactions_transactionNo_codeValues_611() {
		return Transactions_transactionNo_codeValues_611;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_Doubleclk_611;

	public WebElement Transactions_transactionNo_Doubleclk_611() {
		return Transactions_transactionNo_Doubleclk_611;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement Transactions_Approvebtn_611;

	public WebElement Transactions_Approvebtn_611() {
		return Transactions_Approvebtn_611;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_successokbtn_611;

	public WebElement Transactions_successokbtn_611() {
		return Transactions_successokbtn_611;
	}
	// _popup_path_sol_confirm_ok
	// _popup_path_sol_ok

//    								@FindBy(xpath = "//span[text()='close']")
//    							  	private WebElement CSMCore_closeSymbol;
//    							  	public WebElement CSMCorecloseSymbol_611() {
//    							  		return CSMCore_closeSymbol;
//    							  	}

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

	@FindBy(xpath = "//a[@id='E000MA']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_611;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_611() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_611;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UserId;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UserId() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_UserId;
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

	@FindBy(xpath = "//a[@id='E000P']")
	private WebElement Parameters_SystemParameters_User_Approve_611;

	public WebElement Parameters_SystemParameters_User_Approve_611() {
		return Parameters_SystemParameters_User_Approve_611;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement Parameters_SystemParameters_User_Approve_UserId;

	public WebElement Parameters_SystemParameters_User_Approve_UserId() {
		return Parameters_SystemParameters_User_Approve_UserId;
	}
	// (//table[@id='tellerParamList_GridTbl_Id_E000P']//td[text()='VIJAY'])[1]

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

	// Karthi

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParam_ParameterMainModule_609;

	public WebElement csmParamParameterMainModule_609() {
		return csmParam_ParameterMainModule_609;
	}

	@FindBy(xpath = "//*[@id=\"transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE\"]")
	private WebElement csmParam_Transactiontype_inputfield_609;

	public WebElement csmParam_Transactiontype_inputfield_609() {
		return csmParam_Transactiontype_inputfield_609;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_inputfield_doubleclick_609;

	public WebElement csmParam_Transactiontype_inputfield_doubleclick_609() {
		return csmParam_Transactiontype_inputfield_doubleclick_609;
	}

	@FindBy(xpath = "//td[@id='td_tab12_GridTbl_Id_P024MA_1_ctstrxtypeAccVO.TRX_DEFAULT_ACC']/input")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_DefaultCheckBox;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_DefaultCheckBox() {
		return CsmParam_Transactiontype_AdditionalInfo_CreditACC_DefaultCheckBox;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_606;

	public WebElement getTransactionNumber_606() {
		return getTransactionNumber_606;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice_606;

	public WebElement ClosePopupmsg_frontoffice_606() {
		return ClosePopupmsg_frontoffice_606;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_609;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_609() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_609;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok_609;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok_609() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok_609;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code_609;

	public WebElement CSMParam_TransactionType_Approve_code_609() {
		return CSMParam_TransactionType_Approve_code_609;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate_606;

	public WebElement CSMDateToChangeTheCurrentDate_606() {
		return CSM_DateToChangeTheCurrentDate_606;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate_606;

	public WebElement CSMDateInUserRunningDate_606() {
		return CSM_DateInUserRunningDate_606;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValues_606;

	public WebElement Transactions_transactionNo_codeValues_606()

	{
		return Transactions_transactionNo_codeValues_606;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_successokbtn_606;

	public WebElement Transactions_successokbtn_606() {
		return Transactions_successokbtn_606;
	}

	@FindBy(xpath = "//button[@id='submit_255022178']")
	private WebElement Transactions_Approvebtns_606;

	public WebElement Transactions_Approvebtns_606() {
		return Transactions_Approvebtns_606;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement Transactions_Approvebtn_606;

	public WebElement Transactions_Approvebtn_606() {
		return Transactions_Approvebtn_606;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate_606;

	public WebElement CSMUseButtonInChangeRunningDate_606() {
		return CSM_UseButtonInChangeRunningDate_606;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon_606;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_606() {
		return CSM_ClearCacheInTechnicalDetailsIcon_606;

	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_606;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu_606() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_606;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_606;

	public WebElement CSMCloseButtonInChangeRunningDate_606() {
		return CSM_CloseButtonInChangeRunningDate_606;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon_606;

	public WebElement CSMTechnicalDetailsIcon_606() {
		return CSM_TechnicalDetailsIcon_606;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_606;

	public WebElement CSMOkButtonUnderInformationPopUp_606() {
		return CSM_OkButtonUnderInformationPopUp_606;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_606;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_606() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday_606;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions_Transactions_606;

	public WebElement Transactions_Transactions_606() {
		return Transactions_Transactions_606;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a[@id='D001MT']")
	private WebElement Transactions_MaintenanceScrn_606;

	public WebElement Transactions_MaintenanceScrn_606() {
		return Transactions_MaintenanceScrn_606;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Transactions_Trxtypevalue_606;

	public WebElement Transactions_Trxtypevalue_606() {
		return Transactions_Trxtypevalue_606;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_debitAcc_Currencycode_606;

	public WebElement Transactions_debitAcc_Currencycode_606() {
		return Transactions_debitAcc_Currencycode_606;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_debitAcc_Glcode_606;

	public WebElement Transactions_debitAcc_Glcode_606() {
		return Transactions_debitAcc_Glcode_606;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_debitAcc_Cifcode_606;

	public WebElement Transactions_debitAcc_Cifcode_606() {
		return Transactions_debitAcc_Cifcode_606;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_debitAcc_serialcode_606;

	public WebElement Transactions_debitAcc_serialcode_606() {
		return Transactions_debitAcc_serialcode_606;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn_606;

	public WebElement Transactions_Warning_okbtn_606() {
		return Transactions_Warning_okbtn_606;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_debitAcc_currency_606;

	public WebElement Transactions_debitAcc_currency_606() {
		return Transactions_debitAcc_currency_606;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered_606;

	public WebElement checkIfValueIsEntered_606() {
		return checkIfValueIsEntered_606;
	}

	@FindBy(id = "trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen_606;

	public WebElement CSMSaveButtonInMaintenanceScreen_606() {
		return CSM_SaveButtonInMaintenanceScreen_606;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu_606;

	public WebElement CSMOkButtonInSuccessPopUpMenu_606() {
		return CSM_OkButtonInSuccessPopUpMenu_606;
	}

	@FindBy(xpath = "//a[@id='D001AU']")
	private WebElement Transactions_Approvescrn_606;

	public WebElement Transactions_Approvescrn_606() {
		return Transactions_Approvescrn_606;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValue_606;

	public WebElement Transactions_transactionNo_codeValue_606() {
		return Transactions_transactionNo_codeValue_606;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")

	private WebElement Transactions_transactionNo_Doubleclk_606;

	public WebElement Transactions_transactionNo_Doubleclk_606() {

		return Transactions_transactionNo_Doubleclk_606;

	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement Csm_Transaction_Maintannce_CreditAcc_Gl_606;

	public WebElement Csm_Transaction_Maintannce_CreditAcc_Gl_606() {
		return Csm_Transaction_Maintannce_CreditAcc_Gl_606;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement Csm_Transaction_Maintannce_CreditAcc_CIF_606;

	public WebElement Csm_Transaction_Maintannce_CreditAcc_CIF_606() {
		return Csm_Transaction_Maintannce_CreditAcc_CIF_606;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement Csm_Transaction_Maintannce_CreditAcc_SL_606;

	public WebElement Csm_Transaction_Maintannce_CreditAcc_SL_606() {
		return Csm_Transaction_Maintannce_CreditAcc_SL_606;
	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement csmParam_Systemparameter_User_606;

	public WebElement csmParam_Systemparameter_User_606() {
		return csmParam_Systemparameter_User_606;
	}

	@FindBy(xpath = "//span[text()='Update after Approve']")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_606;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_606() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_606;
	}

	@FindBy(id = "tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_606;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_606() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_Userid_606;
	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick_606;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick_606() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick_606;
	}

	@FindBy(xpath = "//span[text()=' Account Types ']")
	private WebElement AccountType_User_606;

	public WebElement AccountType_User_606() {
		return AccountType_User_606;
	}

	@FindBy(xpath = "//td[@id='add_tab4_GridTbl_Id_E000MA']")
	private WebElement Add_Button_User_AccType_606;

	public WebElement Add_Button_User_AccType_606() {
		return Add_Button_User_AccType_606;

	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstelleracctypedetVO.ACC_TYPE']")
	private WebElement AccountType_enterGL_606;

	public WebElement AccountType_enterGL_606() {
		return AccountType_enterGL_606;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstelleracctypedetVO.TRX_TYPE']")
	private WebElement TransactionSerail_number_606;

	public WebElement TransactionSerail_number_606() {
		return TransactionSerail_number_606;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_E000MA_1_ctstelleracctypedetVO.SEE_ACC_POSITION']//input)[2]")
	private WebElement CSMParam_User_Accounttype_ViewAccountPostionCheckBox_606;

	public WebElement CSMParam_User_Accounttype_ViewAccountPostionCheckBox_606() {
		return CSMParam_User_Accounttype_ViewAccountPostionCheckBox_606;
	}

	@FindBy(xpath = "//div[text()='Duplicated Entry Of Record']//parent::div//following-sibling::center//input")
	private WebElement CSMParam_User_IfDupilcateEntryoccursInAnytab_Ok_606;

	public WebElement CSMParam_User_IfDupilcateEntryoccursInAnytab_Ok_606() {
		return CSMParam_User_IfDupilcateEntryoccursInAnytab_Ok_606;
	}

	@FindBy(xpath = "//td[@id='del_tab4_GridTbl_Id_E000MA']")
	private WebElement CSMParam_User_AccountType_deleteBtn_606;

	public WebElement CSMParam_User_AccountType_deleteBtn_606() {
		return CSMParam_User_AccountType_deleteBtn_606;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement okButtonInUpdateAfterApprove_606;

	public WebElement okButtonInUpdateAfterApprove_606() {
		return okButtonInUpdateAfterApprove_606;
	}

	@FindBy(xpath = "//span[text()=' CIF Types ']")
	private WebElement CifType_User_606;

	public WebElement CifType_User_606() {
		return CifType_User_606;
	}

	@FindBy(xpath = "//td[@id='add_tab5_C_GridTbl_Id_E000MA']")
	private WebElement Add_Button_UserCIFType_606;

	public WebElement Add_Button_UserCIFType_606() {
		return Add_Button_UserCIFType_606;

	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.CIF_TYPE']")
	private WebElement CIFNumber_user_606;

	public WebElement CIFNumber_user_606() {
		return CIFNumber_user_606;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.TRX_TYPE']")
	private WebElement TransactionSerail_CIFnumber_606;

	public WebElement TransactionSerail_CIFnumber_606() {
		return TransactionSerail_CIFnumber_606;
	}

	@FindBy(xpath = "(//td[@id='td_tab5_C_GridTbl_Id_E000MA_1_ctstellerciftypedetVO.SEE_ACC_POSITION']//input)[2]")
	private WebElement CSMParam_User_CIFtype_ViewAccountPostionCheckBox_606;

	public WebElement CSMParam_User_CIFtype_ViewAccountPostionCheckBox_606() {
		return CSMParam_User_CIFtype_ViewAccountPostionCheckBox_606;
	}

	@FindBy(xpath = "//td[@id='del_tab5_C_GridTbl_Id_E000MA']")
	private WebElement CSMParam_User_CIFtype_deletebtn_606;

	public WebElement CSMParam_User_CIFtype_deletebtn_606() {
		return CSMParam_User_CIFtype_deletebtn_606;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_606;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_606() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_606;
	}

	@FindBy(id = "E000P")
	private WebElement csmParam_User_Approve_606;

	public WebElement csmParam_User_Approve_606() {
		return csmParam_User_Approve_606;
	}

	@FindBy(id = "tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")
	private WebElement csmParam_User_Approve_UserID_606;

	public WebElement csmParam_User_Approve_UserID_606() {
		return csmParam_User_Approve_UserID_606;
	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")
	private WebElement csmParam_User_Approve_Username_doubleclick_606;

	public WebElement csmParam_User_Approve_Username_doubleclick_606() {
		return csmParam_User_Approve_Username_doubleclick_606;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSMCore_Transactions_606;

	public WebElement CSMCore_Transactions_606() {
		return CSMCore_Transactions_606;
	}

	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_606;

	public WebElement CSMCore_Transactions_Maintenance_606() {
		return CSMCore_Transactions_Maintenance_606;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_TRXType_606;

	public WebElement CSMCore_Transactions_Maintenance_TRXType_606() {
		return CSMCore_Transactions_Maintenance_TRXType_606;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement CSMCore_Transactions_Maintenance_BranchCode_606;

	public WebElement CSMCore_Transactions_Maintenance_BranchCode_606() {
		return CSMCore_Transactions_Maintenance_BranchCode_606;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_GLCode_606;

	public WebElement CSMCore_Transactions_Maintenance_GLCode_606() {
		return CSMCore_Transactions_Maintenance_GLCode_606;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CSMCore_Transactions_Maintenance_CIFCode_606;

	public WebElement CSMCore_Transactions_Maintenance_CIFCode_606() {
		return CSMCore_Transactions_Maintenance_CIFCode_606;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_SerialNo_606;

	public WebElement CSMCore_Transactions_Maintenance_SerialNo_606() {
		return CSMCore_Transactions_Maintenance_SerialNo_606;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_CurrencyCode_606;

	public WebElement CSMCore_Transactions_Maintenance_CurrencyCode_606() {
		return CSMCore_Transactions_Maintenance_CurrencyCode_606;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.avail_bal']")
	private WebElement Transaction_Maintanance_AvailableBalancefield_606;

	public WebElement Transaction_Maintanance_AvailableBalancefield_606() {
		return Transaction_Maintanance_AvailableBalancefield_606;
	}

	@FindBy(xpath = "//button[@id='cb_trsPosition_D001MT']")
	private WebElement Transaction_Maintanance_AccountPositionButton_606;

	public WebElement Transaction_Maintanance_AccountPositionButton_606() {
		return Transaction_Maintanance_AccountPositionButton_606;
	}

	@FindBy(xpath = "//span[text()='ok']//parent::button")
	private WebElement Transaction_Maintanance_AccountPositionButton_Okbtn_606;

	public WebElement Transaction_Maintanance_AccountPositionButton_Okbtn_606() {
		return Transaction_Maintanance_AccountPositionButton_Okbtn_606;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement CSMParam_TransactionType_UPA_606;

	public WebElement CSMParam_TransactionType_UPA_606() {
		return CSMParam_TransactionType_UPA_606;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.AUTO_APPROVE_WITHIN_LIMIT']")
	private WebElement CSMParam_transactionType_Automaticapproveflag_606;

	public WebElement CSMParam_transactionType_Automaticapproveflag_606() {
		return CSMParam_transactionType_Automaticapproveflag_606;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code_606;

	public WebElement CSMParam_TransactionType_UPA_code_606() {
		return CSMParam_TransactionType_UPA_code_606;
	}

	@FindBy(xpath = "//a[@id='controlRecord_tab_AdditionalDetails_O001UP']")
	private WebElement CSMParam_ControlRecord_AdditonalDetails_606;

	public WebElement CSMParam_ControlRecord_AdditonalDetails_606() {
		return CSMParam_ControlRecord_AdditonalDetails_606;
	}

	@FindBy(xpath = "//input[@id='valid_alrt_lmt_on_apprv_trx_yn_O001UP']")
	private WebElement CSMParam_ControlRecord_AdditonalDetails_validateagainstAlertcheckbox_606;

	public WebElement CSMParam_ControlRecord_AdditonalDetails_validateagainstAlertcheckbox_606() {
		return CSMParam_ControlRecord_AdditonalDetails_validateagainstAlertcheckbox_606;
	}

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement csmParam_AccountParameters_606;

	public WebElement csmParam_AccountParameters_606() {
		return csmParam_AccountParameters_606;
	}

	@FindBy(xpath = "//td[text()='Account Type']")
	private WebElement csmParam_AccountParameters_AccountTypes_606;

	public WebElement csmParam_AccountParameters_AccountTypes_606() {
		return csmParam_AccountParameters_AccountTypes_606;
	}

	@FindBy(xpath = "//a[@id='P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPAField_606;

	public WebElement csmParam_AccountParameters_AccountTypes_UPAField_606() {
		return csmParam_AccountParameters_AccountTypes_UPAField_606;
	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_606;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_606() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_606;
	}

	@FindBy(xpath = "//table[@id='acctypeList_GridTbl_Id_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_606;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_606() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_606;
	}

	@FindBy(xpath = "//div[@id='instructionsColl_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_606;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_606() {
		return csmParam_AccountParameters_AccountTypes_Instructions_606;
	}

	@FindBy(xpath = "//input[@id='allow_overdrawn_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_606;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_606() {
		return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_606;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017MA_Update_After_Approve_key']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton_606;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton_606() {
		return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton_606;
	}

	@FindBy(xpath = "//td[text()='Account Type']/ancestor::a/following-sibling::ul//span[text()='Approve']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_606;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_606() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_606;
	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_606;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_606() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_606;
	}

	@FindBy(xpath = "//td[@id='td_acctypeList_GridTbl_Id_P017P_1_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_606;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_606() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_606;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017P_Approve_key']")
	private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton_606;

	public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton_606() {
		return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton_606;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_606;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_606() {
		return csmParam_Transactiontype_proceedoninsufficentfunds_606;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement csmParam_Transactiontype_ForceOverDrawn_606;

	public WebElement csmParam_Transactiontype_ForceOverDrawn_606() {
		return csmParam_Transactiontype_ForceOverDrawn_606;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu_606;

	public WebElement CSMOkButtonInWarningPopUpMenu_606() {
		return CSM_OkButtonInWarningPopUpMenu_606;
	}

	@FindBy(xpath = "//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Amount Exceeds Available Balance in Account')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement AmountExceedsWarningPopUp_606;

	public WebElement AmountExceedsWarningPopUp_606() {
		return AmountExceedsWarningPopUp_606;
	}

	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID']")
	private WebElement CSM_doubleclkuserid_under_UAA_606;

	public WebElement CSM_doubleclkuserid_under_UAA_606() {
		return CSM_doubleclkuserid_under_UAA_606;
	}

	@FindBy(xpath = "//input[@id='bypass_int_acc_restrictions_E000MA']")
	private WebElement CSM_bypassAcRestKey_Checkbox_under_UAA_606;

	public WebElement CSM_bypassAcRestKey_Checkbox_under_UAA_606() {
		return CSM_bypassAcRestKey_Checkbox_under_UAA_606;
	}
	// Kailash

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement ParameterMainModule_626;

	public WebElement ParameterMainModule_626() {
		return ParameterMainModule_626;
	}

	@FindBy(xpath = "//td[text()='System Parameters']//parent::td")
	private WebElement Systemparameter_626;

	public WebElement Systemparameter_626() {
		return Systemparameter_626;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement TransactionType_parameter_626;

	public WebElement TransactionType_parameter_626() {
		return TransactionType_parameter_626;
	}

	@FindBy(xpath = "//span[text()='Update after Approve']")
	private WebElement UpdateAfterApprove_Transafer_626;

	public WebElement UpdateAfterApprove_Transafer_626() {
		return UpdateAfterApprove_Transafer_626;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Code_Transaction_typer_626;

	public WebElement Code_Transaction_typer_626() {
		return Code_Transaction_typer_626;
	}

	@FindBy(xpath = "//select[@id='trsfr_type_P024MA']")
	private WebElement localtransactiontype_Transafer_626;

	public WebElement localtransactiontype_Transafer_626() {
		return localtransactiontype_Transafer_626;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit_626;

	public WebElement doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit_626() {
		return doubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit_626;
	}

	@FindBy(xpath = "//input[@id='cr_dr_forex_P024MAD']")

	private WebElement Main_debit_CSMParam_626;

	public WebElement Main_debit_CSMParam_626() {

		return Main_debit_CSMParam_626;

	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement Proceed_on_fund_626;

	public WebElement Proceed_on_fund_626() {
		return Proceed_on_fund_626;
	}

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")

	private WebElement Force_overdarw_debit_CSMParam_626;

	public WebElement Force_overdarw_debit_CSMParam_626() {

		return Force_overdarw_debit_CSMParam_626;

	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement updateAfterApprove_User_Param_609;

	public WebElement updateAfterApprove_User_Param_609() {
		return updateAfterApprove_User_Param_609;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_626;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_626() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_626;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement POPupmsg_609;

	public WebElement POPupmsg_609() {
		return POPupmsg_609;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement User_Approve_Tarnsaction_609;

	public WebElement User_Approve_Tarnsaction_609() {
		return User_Approve_Tarnsaction_609;
	}

	@FindBy(id = "infoBarSearchButton_D001MT")
	private WebElement CSM_SearchButtonInMaintenanceScreen_609;

	public WebElement CSMSearchButtonInMaintenanceScreen_609() {
		return CSM_SearchButtonInMaintenanceScreen_609;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement code_Approve_Transaction_609;

	public WebElement code_Approve_Transaction_609() {
		return code_Approve_Transaction_609;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement submit_user_approve_609;

	public WebElement submit_user_approve_609() {
		return submit_user_approve_609;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice_626;

	public WebElement ClosePopupmsg_frontoffice_626() {
		return ClosePopupmsg_frontoffice_626;
	}

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate_626;

	public WebElement CSMDateToChangeTheCurrentDate_626() {
		return CSM_DateToChangeTheCurrentDate_626;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate_626;

	public WebElement CSMDateInUserRunningDate_626() {
		return CSM_DateInUserRunningDate_626;
	}

//    							    							"//label[@id='Application_Running_Date_key']//preceding::button"

	@FindBy(xpath = "//button[@value='Submit']")
	private WebElement CSM_UseButtonInChangeRunningDate_626;

	public WebElement CSMUseButtonInChangeRunningDate_626() {
		return CSM_UseButtonInChangeRunningDate_626;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_626;

	public WebElement CSMCloseButtonInChangeRunningDate_626() {
		return CSM_CloseButtonInChangeRunningDate_626;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu_626;

	public WebElement CSMTransactionsMainMenu_626() {
		return CSM_TransactionsMainMenu_626;
	}

	@FindBy(id = "D001MT")
	private WebElement CSM_MaintenanceUnderTransactions_626;

	public WebElement CSMMaintenanceUnderTransactions_626() {
		return CSM_MaintenanceUnderTransactions_626;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_626;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday_626() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday_626;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_626;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu_626() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_626;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon_626;

	public WebElement CSMTechnicalDetailsIcon_626() {
		return CSM_TechnicalDetailsIcon_626;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon_626;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_626() {
		return CSM_ClearCacheInTechnicalDetailsIcon_626;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_626;

	public WebElement CSMOkButtonUnderInformationPopUp_626() {
		return CSM_OkButtonUnderInformationPopUp_626;
	}

	@FindBy(xpath = "(//span[text()='Maintenance'])[1]")
	private WebElement Maintenance_button_626;

	public WebElement Maintenance_button_626() {
		return Maintenance_button_626;
	}

	@FindBy(id = "trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeINdebitAc_626;

	public WebElement CSM_BranchCodeINdebitAc_626() {
		return CSM_BranchCodeINdebitAc_626;
	}

	@FindBy(id = "trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodedebitAc_626;

	public WebElement CSM_CurrencyCodedebitAc_626() {
		return CSM_CurrencyCodedebitAc_626;
	}

	@FindBy(id = "trs_ac_gl_D001MT")
	private WebElement CSM_GLCodedebitAc_626;

	public WebElement CSM_GLCodedebitAc_626() {
		return CSM_GLCodedebitAc_626;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeIndebitAc_626;

	public WebElement CSM_CIFCodeIndebitAc_626() {
		return CSM_CIFCodeIndebitAc_626;
	}

	@FindBy(id = "lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialIndebitAc_626;

	public WebElement CSM_SerialIndebitAc_626() {
		return CSM_SerialIndebitAc_626;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement currency_code_value_626;

	public WebElement currency_code_value_626() {
		return currency_code_value_626;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInCreditAc_626;

	public WebElement CSMCIFCodeInCreditAc_626() {
		return CSM_CIFCodeInCreditAc_626;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement TrX_Type_Transaction1_626;

	public WebElement TrX_Type_Transaction1_626() {
		return TrX_Type_Transaction1_626;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_closeSymbol_626;

	public WebElement CSMCorecloseSymbol_626() {
		return CSMCore_closeSymbol_626;
	}

	@FindBy(id = "lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialInDebitAc;

	public WebElement CSMSerialInDebitAc() {
		return CSM_SerialInDebitAc;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement Save_button_Transaction_626;

	public WebElement Save_button_Transaction_626() {
		return Save_button_Transaction_626;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement ParameterMainModule_609;

	public WebElement ParameterMainModule_609() {
		return ParameterMainModule_609;
	}

	@FindBy(xpath = "//td[text()='System Parameters']//parent::td")
	private WebElement Systemparameter_609;

	public WebElement Systemparameter_609() {
		return Systemparameter_609;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_2_ctstrxtypeVO.CODE']")
	private WebElement DdoubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit;

	public WebElement DdoubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit() {
		return DdoubleClickUserInUpdateAfterApprovetRANSACTIOTYPE_debit;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_debitAcc_currency_626;

	public WebElement Transactions_debitAcc_currency_626() {
		return Transactions_debitAcc_currency_626;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_626;

	public WebElement getTransactionNumber_626() {
		return getTransactionNumber_626;
	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement User;

	public WebElement User() {
		return User;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement UserID_Name;

	public WebElement UserID_Name() {
		return UserID_Name;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement UserID_Name_DClick;

	public WebElement UserID_Name_DClick() {
		return UserID_Name_DClick;
	}

	@FindBy(xpath = "//input[@id='mask_trx_amt_approve_yn_E000MA']")
	private WebElement Mask_CheckBOX;

	public WebElement Mask_CheckBOX() {
		return Mask_CheckBOX;
	}

	@FindBy(xpath = "//a[@id='anchor_179480304']")
	private WebElement Trx_TYpe;

	public WebElement Trx_TYpe() {
		return Trx_TYpe;
	}

	@FindBy(xpath = "//td[@id='add_tab16_GridTbl_Id_E000MA']")
	private WebElement Add_button;

	public WebElement Add_button() {
		return Add_button;
	}

	@FindBy(xpath = "//button[@id='ok_btn_15_E000MA']")
	private WebElement Click_ok;

	public WebElement Click_ok() {
		return Click_ok;
	}

	@FindBy(xpath = "//button[@value='Submit']")
	private WebElement Submit_UpdateAfterApprove;

	public WebElement Submit_UpdateAfterApprove() {
		return Submit_UpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Confirm_ok;

	public WebElement Confirm_ok() {
		return Confirm_ok;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement approve_User;

	public WebElement approve_User() {
		return approve_User;
	}

	@FindBy(xpath = "//input[@name='USER_ID']")
	private WebElement approve_User_input;

	public WebElement approve_User_input() {
		return approve_User_input;
	}

	// Razia

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement csmSystemParametersTransactionType_612;

	public WebElement csmSystemParametersTransactionType_612() {
		return csmSystemParametersTransactionType_612;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement csmSystemParametersTransactionTypeUA_612;

	public WebElement csmSystemParametersTransactionTypeUA_612() {
		return csmSystemParametersTransactionTypeUA_612;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE")
	private WebElement csmSystemParametersTransactionTypeUACodeInput_612;

	public WebElement csmSystemParametersTransactionTypeUACodeInput_612() {
		return csmSystemParametersTransactionTypeUACodeInput_612;
	}

	@FindBy(id = "td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE")
	private WebElement csm_SystemParameters_TransactionTypeUA_CodeDoubleClick;

	public WebElement csmSystemParametersTransactionTypeUACodeDoubleClick_612() {
		return csm_SystemParameters_TransactionTypeUA_CodeDoubleClick;
	}

	@FindBy(xpath = "//input[@id='nostro_mvt_P024MA']")
	private WebElement csmParam_Users_AlloweInternalGL_612;

	public WebElement csmParam_Users_AlloweInternalGL_612() {
		return csmParam_Users_AlloweInternalGL_612;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_612;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_612() {
		return csmParam_Transactiontype_proceedoninsufficentfunds_612;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csmTransactionTypeUpdateAfterApproveButton_612;

	public WebElement csmTransactionTypeUpdateAfterApproveButton_612() {
		return csmTransactionTypeUpdateAfterApproveButton_612;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement csmTransactionTypeApproveScreen_612;

	public WebElement csmTransactionTypeApproveScreen_612() {
		return csmTransactionTypeApproveScreen_612;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE")
	private WebElement csmTransactionTypeApproveScreenCodeInput_612;

	public WebElement csmTransactionTypeApproveScreenCodeInput_612() {
		return csmTransactionTypeApproveScreenCodeInput_612;
	}

	@FindBy(xpath = "//table[@id='transactionTypesList_GridTbl_Id_P024P']")
	private WebElement csmTransactionTypeApproveScreenCodeInputDoubleClick_612;

	public WebElement csmTransactionTypeApproveScreenCodeInputDoubleClick_612() {
		return csmTransactionTypeApproveScreenCodeInputDoubleClick_612;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement csmTransactionTypeSuccessOkButton_612;

	public WebElement csmTransactionTypeSuccessOkButton_612() {
		return csmTransactionTypeSuccessOkButton_612;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmTransactionTypeConfirmOkButton_612;

	public WebElement csmTransactionTypeConfirmOkButton_612() {
		return csmTransactionTypeConfirmOkButton_612;
	}

	@FindBy(xpath = "//td[text()='General Ledger']")
	private WebElement csmParam_General_ledger;

	public WebElement csmParam_General_ledger_612() {
		return csmParam_General_ledger;
	}

	@FindBy(id = "P014UP")
	private WebElement csmParam_General_ledger_Updateafterapprove;

	public WebElement csmParam_General_ledger_Updateafterapprove_612() {
		return csmParam_General_ledger_Updateafterapprove;
	}

	@FindBy(id = "genLedgerParamListGridTbl_Id_P014UP_gs_GL_CODE")
	private WebElement csmParam_General_ledger_code;

	public WebElement csmParam_General_ledger_code_612() {
		return csmParam_General_ledger_code;
	}

	@FindBy(xpath = "(//table[@id='genLedgerParamListGridTbl_Id_P014UP'])[1]")
	private WebElement csmParam_General_ledger_code_doubleclick;

	public WebElement csmParam_General_ledger_code_doubleclick_612() {
		return csmParam_General_ledger_code_doubleclick;
	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement csmParam_General_ledger_code_additionaloptions;

	public WebElement csmParam_General_ledger_code_additionaloptions_612() {
		return csmParam_General_ledger_code_additionaloptions;
	}

	@FindBy(id = "allow_internal_overdraw_P014UP")
	private WebElement csmParam_General_ledger_code_additionaloptions_dropdown;

	public WebElement csmParam_General_ledger_code_additionaloptions_dropdown_612() {
		return csmParam_General_ledger_code_additionaloptions_dropdown;
	}

	@FindBy(xpath = "//td[text()='General Ledger']//ancestor::a//following-sibling::ul//span[text()='Approve']")
	private WebElement csmParam_General_ledger_Approve;

	public WebElement csmParam_General_ledger_Approve_612() {
		return csmParam_General_ledger_Approve;
	}

	@FindBy(id = "genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE")
	private WebElement csmParam_General_ledger_Approve_inputfield;

	public WebElement csmParam_General_ledger_Approve_inputfield_612() {
		return csmParam_General_ledger_Approve_inputfield;
	}

	@FindBy(id = "genLedgerParamFormId_P014UP_update_key")
	private WebElement csmParam_General_ledger_upadatebutton;

	public WebElement csmParam_General_ledger_upadatebutton_612() {
		return csmParam_General_ledger_upadatebutton;
	}

	@FindBy(xpath = "(//table[@id='genLedgerParamListGridTbl_Id_P014P'])[1]")
	private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick;

	public WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_612() {
		return csmParam_General_ledger_Approve_inputfield_doubleclick;
	}

	@FindBy(xpath = "//label[@id='genLedgerParamFormId_P014P_approve_key']")
	private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve;

	public WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_612() {
		return csmParam_General_ledger_Approve_inputfield_doubleclick_Approve;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK;

	public WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK_612() {
		return csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK;
	}

	@FindBy(xpath = "//td[contains(text(), 'You do not have enough cash to complete this transaction')]")
	private WebElement csm_Transaction_maintanance_warning_popUp_612;

	public WebElement csm_Transaction_maintanance_warning_popUp_612() {
		return csm_Transaction_maintanance_warning_popUp_612;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu_612;

	public WebElement CSMTransactionsMainMenu_612() {
		return CSM_TransactionsMainMenu_612;
	}

	@FindBy(id = "D001MT")
	private WebElement CSMMaintenanceUnderTransactions_612;

	public WebElement CSMMaintenanceUnderTransactions_612() {
		return CSMMaintenanceUnderTransactions_612;
	}

	@FindBy(id = "lookuptxt_trx_type_D001MT")
	private WebElement CSMTRXTypeInMaintenanceScreen_612;

	public WebElement CSMTRXTypeInMaintenanceScreen_612() {
		return CSMTRXTypeInMaintenanceScreen_612;
	}

	@FindBy(id = "trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeINdebitAc_612;

	public WebElement CSM_BranchCodeINdebitAc_612() {
		return CSM_BranchCodeINdebitAc_612;
	}

	@FindBy(id = "trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodedebitAc_612;

	public WebElement CSM_CurrencyCodedebitAc_612() {
		return CSM_CurrencyCodedebitAc_612;
	}

	@FindBy(id = "trs_ac_gl_D001MT")
	private WebElement CSM_GLCodedebitAc_612;

	public WebElement CSM_GLCodedebitAc_612() {
		return CSM_GLCodedebitAc_612;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeIndebitAc_612;

	public WebElement CSM_CIFCodeIndebitAc_612() {
		return CSM_CIFCodeIndebitAc_612;
	}

	@FindBy(id = "lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialIndebitAc_612;

	public WebElement CSM_SerialIndebitAc_612() {
		return CSM_SerialIndebitAc_612;
	}

//    							    											@FindBy(id="_popup_path_sol_ok")
//    							    											private WebElement CSM_OkButtonInWarningPopUpMenu;
	//
//    							    											public WebElement CSMOkButtonInWarningPopUpMenu_612() {
//    							    												return CSM_OkButtonInWarningPopUpMenu;
//    							    											}
	@FindBy(id = "amount_D001MT")
	private WebElement CSMAmountInMaintenanceScreen_612;

	public WebElement CSMAmountInMaintenanceScreen_612() {
		return CSMAmountInMaintenanceScreen_612;
	}

	@FindBy(id = "lookuptxt_trs_cy_D001MT")
	private WebElement CSM_CurrencyInMaintenanceScreen;

	public WebElement CSMCurrencyInMaintenanceScreen_612() {
		return CSM_CurrencyInMaintenanceScreen;
	}

	@FindBy(id = "trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen_612;

	public WebElement CSMSaveButtonInMaintenanceScreen_612() {
		return CSM_SaveButtonInMaintenanceScreen_612;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")

	private WebElement getTransactionNumber_612;

	public WebElement getTransactionNumber_612()

	{

		return getTransactionNumber_612;

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

	private WebElement Transactions_transactionNo_Doubleclk_612;

	public WebElement Transactions_transactionNo_Doubleclk_612() {

		return Transactions_transactionNo_Doubleclk_612;

	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu_612;

	public WebElement CSMOkButtonInSuccessPopUpMenu_612() {
		return CSM_OkButtonInSuccessPopUpMenu_612;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.RELEASE_DATE']")
	private WebElement CSM_Transaction_maintanance_EndingDate_612;

	public WebElement CSM_Transaction_maintanance_EndingDate_612() {
		return CSM_Transaction_maintanance_EndingDate_612;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.VALUE_DATE']")
	private WebElement CSM_Transaction_maintanance_StartingDate;

	public WebElement CSM_Transaction_maintanance_StartingDate_612() {
		return CSM_Transaction_maintanance_StartingDate;
	}

	// Vijay

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

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement Parameters_SystemParameters_TransactionType_609;

	public WebElement Parameters_SystemParameters_TransactionType_609() {
		return Parameters_SystemParameters_TransactionType_609;
	}

	@FindBy(xpath = "//a[@id='P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Code;
	}

	@FindBy(xpath = "//a[@id='P024P']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_609;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_609() {
		return Parameters_SystemParameters_TransactionType_Approve_609;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_Code;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_Code() {
		return Parameters_SystemParameters_TransactionType_Approve_Code;
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

	@FindBy(xpath = "//td[text()='User']")
	private WebElement Parameters_SystemParameters_User_609;

	public WebElement Parameters_SystemParameters_User_609() {
		return Parameters_SystemParameters_User_609;
	}

	@FindBy(xpath = "//a[@id='E000MA']")
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

	@FindBy(xpath = "//a[@id='E000P']")
	private WebElement Parameters_SystemParameters_User_Approve_609;

	public WebElement Parameters_SystemParameters_User_Approve_609() {
		return Parameters_SystemParameters_User_Approve_609;
	}

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement Parameters_SystemParameters_User_Approve_UserId_609;

	public WebElement Parameters_SystemParameters_User_Approve_UserId_609() {
		return Parameters_SystemParameters_User_Approve_UserId_609;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement CSM_SimpleOk_609;

	public WebElement CSM_SimpleOk_609() {
		return CSM_SimpleOk_609;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions_609;

	public WebElement Transactions_609() {
		return Transactions_609;
	}

	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement Transactions_Maintenance_609;

	public WebElement Transactions_Maintenance_609() {
		return Transactions_Maintenance_609;
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
	private WebElement ViewMomo_PopUp_609;

	public WebElement ViewMomo_PopUp_609() {
		return ViewMomo_PopUp_609;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ViewMomo_PopUp_Close_609;

	public WebElement ViewMomo_PopUp_Close_609() {
		return ViewMomo_PopUp_Close_609;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_cy_D001MT_gs_CURRENCY_CODE']")
	private WebElement Transactions_Maintenance_Currency_CurrencyCode;

	public WebElement Transactions_Maintenance_Currency_CurrencyCode() {
		return Transactions_Maintenance_Currency_CurrencyCode;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trs_cy_D001MT']/span")
	private WebElement Transactions_Maintenance_CurrencySearch;

	public WebElement Transactions_Maintenance_CurrencySearch() {
		return Transactions_Maintenance_CurrencySearch;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_Maintenance_Amount;

	public WebElement Transactions_Maintenance_Amount() {
		return Transactions_Maintenance_Amount;
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
	private WebElement BMUser_Alert_EnterTRXNo_609;

	public WebElement BMUserAlertEnterTRXNo_609() {
		return BMUser_Alert_EnterTRXNo_609;
	}

	@FindBy(xpath = "//input[@id='jqg_trsAckTOutAlertGrid_Id_RCVALERT_1']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_609;

	public WebElement BMUserAlertEnterTRXNoselectRecord_609() {
		return BMUser_Alert_EnterTRXNo_selectRecord_609;
	}

	@FindBy(xpath = "//a[@id='openBut_RCVALERT']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_609;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_609() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_609;
	}

	@FindBy(xpath = "//input[@id='amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_Amount() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_Amount;
	}

	@FindBy(xpath = "//input[@id='input_amount_D001AU_ALERT']")
	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount_609;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount_609() {
		return BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount_609;
	}

	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_609;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey_609() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_609;
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

	@FindBy(xpath = "//input[@id='current_status_D001MT']")
	private WebElement Transactions_Maintenance_Status_609;

	public WebElement Transactions_Maintenance_Status_609() {
		return Transactions_Maintenance_Status_609;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_609;
	}

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609;
	}

	@FindBy(xpath = "//div[text()='WARNING']")
	private WebElement Transaction_AmountExceeds_Warning_609;

	public WebElement Transaction_AmountExceeds_Warning_609() {
		return Transaction_AmountExceeds_Warning_609;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered_615;

	public WebElement checkIfValueIsEntered_615() {
		return checkIfValueIsEntered_615;
	}

	@FindBy(xpath = "//input[@id='gridtab_trx_type_D001MT_gs_CODE']")
	private WebElement Transactions_Maintenance_TrxTypeCode_615;

	public WebElement Transactions_Maintenance_TrxTypeCode_615() {
		return Transactions_Maintenance_TrxTypeCode_615;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_GlCode_615;

	public WebElement Transactions_Maintenance_GlCode_615() {
		return Transactions_Maintenance_GlCode_615;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CifCode_615;

	public WebElement Transactions_Maintenance_CifCode_615() {
		return Transactions_Maintenance_CifCode_615;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_SerialNo_615;

	public WebElement Transactions_Maintenance_SerialNo_615() {
		return Transactions_Maintenance_SerialNo_615;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trs_cy_D001MT']/span")
	private WebElement Transactions_Maintenance_CurrencySearch_615;

	public WebElement Transactions_Maintenance_CurrencySearch_615() {
		return Transactions_Maintenance_CurrencySearch_615;
	}

	@FindBy(xpath = "//input[@id='gridtab_trs_cy_D001MT_gs_CURRENCY_CODE']")
	private WebElement Transactions_Maintenance_Currency_CurrencyCode_615;

	public WebElement Transactions_Maintenance_Currency_CurrencyCode_615() {
		return Transactions_Maintenance_Currency_CurrencyCode_615;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement Transactions_Maintenance_Amount_615;

	public WebElement Transactions_Maintenance_Amount_615() {
		return Transactions_Maintenance_Amount_615;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement Transactions_Maintenance_ChequeNo_615;

	public WebElement Transactions_Maintenance_ChequeNo_615() {
		return Transactions_Maintenance_ChequeNo_615;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement Transactions_Maintenance_CreditBranchCode_615;

	public WebElement Transactions_Maintenance_CreditBranchCode_615() {
		return Transactions_Maintenance_CreditBranchCode_615;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001MT']")
	private WebElement Transactions_Maintenance_CreditCurrencyCode_615;

	public WebElement Transactions_Maintenance_CreditCurrencyCode_615() {
		return Transactions_Maintenance_CreditCurrencyCode_615;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement Transactions_Maintenance_CreditGlCode_615;

	public WebElement Transactions_Maintenance_CreditGlCode_615() {
		return Transactions_Maintenance_CreditGlCode_615;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement Transactions_Maintenance_CreditCifCode_615;

	public WebElement Transactions_Maintenance_CreditCifCode_615() {
		return Transactions_Maintenance_CreditCifCode_615;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement Transactions_Maintenance_CreditSerialNo_615;

	public WebElement Transactions_Maintenance_CreditSerialNo_615() {
		return Transactions_Maintenance_CreditSerialNo_615;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_Ok_615;

	public WebElement CSM_Ok_615() {
		return CSM_Ok_615;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement Transactions_Maintenance_SaveBtn_615;

	public WebElement Transactions_Maintenance_SaveBtn_615() {
		return Transactions_Maintenance_SaveBtn_615;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber_615;

	public WebElement getTransactionNumber_615() {
		return getTransactionNumber_615;
	}

	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement Transactions_Maintenance_615;

	public WebElement Transactions_Maintenance_615() {
		return Transactions_Maintenance_615;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Transactions_Approve_615;

	public WebElement Transactions_Approve_615() {
		return Transactions_Approve_615;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Approve_Code_615;

	public WebElement Transactions_Approve_Code_615() {
		return Transactions_Approve_Code_615;
	}

	@FindBy(xpath = "//label[@id='Approve_key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_615;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsApproveKey_615() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_ApproveKey_615;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement Transactions_Approve_ApproveBtn_615;

	public WebElement Transactions_Approve_ApproveBtn_615() {
		return Transactions_Approve_ApproveBtn_615;
	}

	@FindBy(xpath = "//label[contains(text(),'Update After Approve ')]//ancestor::button")
	private WebElement csmParam_UpdateAfterApproveBtn;

	public WebElement csmParamUpdateAfterApproveBtn() {
		return csmParam_UpdateAfterApproveBtn;
	}

	@FindBy(xpath = "//div[text()='Confirm Save Process']//ancestor::div//center//input[1]")
	private WebElement csm_SaveConfirmOkButton;

	public WebElement csmSaveConfirmOkButton() {
		return csm_SaveConfirmOkButton;
	}

	@FindBy(xpath = "//div[text()='Record was Updated Successfully']//ancestor::div//center//input[1]")
	private WebElement update_OkButton;

	public WebElement updateOkButton() {
		return update_OkButton;
	}

	@FindBy(xpath = "//label[contains(text(),'Approve ')]//ancestor::button")
	private WebElement csm_ApproveBtnWithLabel;

	public WebElement csmApproveBtnWithLabel() {
		return csm_ApproveBtnWithLabel;
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

	@FindBy(id = "hder_logout_icon_id")
	private WebElement csm_logoutButton;

	public WebElement csmLogoutButton() {
		return csm_logoutButton;
	}

	@FindBy(id = "j_username")
	private WebElement csm_UserName;

	public WebElement csmUserName() {
		return csm_UserName;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValues;

	public WebElement Transactions_transactionNo_codeValues()

	{
		return Transactions_transactionNo_codeValues;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_successokbtn;

	public WebElement Transactions_successokbtn() {
		return Transactions_successokbtn;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement Transactions_Approvebtn;

	public WebElement Transactions_Approvebtn() {
		return Transactions_Approvebtn;
	}

	// Tharun
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

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement saveBtninmaintanceintransactioncsmcore;

	public WebElement saveBtninmaintanceintransactioncsmcore() {
		return saveBtninmaintanceintransactioncsmcore;
	}

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

	/////////////////// objects for @CHTR_P2_069_CR csm Core

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement click_the_Transactions69CR;

	public WebElement click_the_Transactions69CR() {
		return click_the_Transactions69CR;
	}

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

////////////////    							    											 @CHTR_P2_180_CR2  core objects

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

	@FindBy(xpath = "//button[@class='path-btn-def-access-progref  ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")
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

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement uncheck_theproceedonInsufficientFund;

	public WebElement uncheck_theproceedonInsufficientFund() {
		return uncheck_theproceedonInsufficientFund;
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

	@FindBy(xpath = "//a[@id='C0011MA']")
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

	@FindBy(xpath = "//a[@id='C0011P']")
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

	@FindBy(xpath = "//a[@id='P0032MA']")
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

	@FindBy(xpath = "//a[@id='P0032P']")
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

	@FindBy(xpath = "//a[@id='P024MA']")
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

	@FindBy(xpath = "//a[@id='P024P']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_7181;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_7181() {
		return Parameters_SystemParameters_TransactionType_Approve_7181;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_Code_7181;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_Code_7181() {
		return Parameters_SystemParameters_TransactionType_Approve_Code_7181;
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

	@FindBy(xpath = "//input[@id='gridtab_trx_type_D001MT_gs_CODE']")
	private WebElement Transactions_Maintenance_TrxType_7181;

	public WebElement Transactions_Maintenance_TrxType_7181() {
		return Transactions_Maintenance_TrxType_7181;
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

	// Razia

	@FindBy(id = "hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate_612;

	public WebElement CSMDateToChangeTheCurrentDate_612() {
		return CSM_DateToChangeTheCurrentDate_612;
	}

	@FindBy(id = "global_user_run_date")
	private WebElement CSM_DateInUserRunningDate_612;

	public WebElement CSMDateInUserRunningDate_612() {
		return CSM_DateInUserRunningDate_612;
	}

	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate_612;

	public WebElement CSMUseButtonInChangeRunningDate_612() {
		return CSM_UseButtonInChangeRunningDate_612;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_612;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu_612() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_612;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon_612;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon_612() {
		return CSM_ClearCacheInTechnicalDetailsIcon_612;

	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu_612;

	public WebElement CSMOkButtonInInformationPopUpMenu_612() {
		return CSM_OkButtonInInformationPopUpMenu_612;
	}

	@FindBy(id = "_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate_612;

	public WebElement CSMCloseButtonInChangeRunningDate_612() {
		return CSM_CloseButtonInChangeRunningDate_612;
	}

	@FindBy(id = "tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon_612;

	public WebElement CSMTechnicalDetailsIcon_612() {
		return CSM_TechnicalDetailsIcon_612;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp_612;

	public WebElement CSMOkButtonUnderInformationPopUp_612() {
		return CSM_OkButtonUnderInformationPopUp_612;
	}

	// vijay
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
		return CSM_OkButtonUnderInformationPopUp_609;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu_609;

	public WebElement CSM_OkButtonInAccessDeniedPopUpMenu_609() {
		return CSM_OkButtonInAccessDeniedPopUpMenu_609;
	}

	@FindBy(xpath = "//label[@id='logout']")
	private WebElement CSM_Logout_609;

	public WebElement CSM_Logout_609() {
		return CSM_Logout_609;
	}
	// karthi

	// sridar

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement Chequebook1;

	public WebElement Chequebook1() {
		return Chequebook1;
	}

	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement Destroyed_cheque;

	public WebElement Destroyed_cheque() {
		return Destroyed_cheque;
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

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
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

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement currency_code_value;

	public WebElement currency_code_value() {
		return currency_code_value;
	}

	// input[@id='linktoother_trx_P024MA']
	@FindBy(xpath = "//input[@id='linktoother_trx_P024MA']")
	private WebElement Linked_transaction_CSMparam;

	public WebElement Linked_transaction_CSMparam() {
		return Linked_transaction_CSMparam;
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

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement user_update_approve_IdInApproveScreen;

	public WebElement user_update_approve_IdInApproveScreen() {
		return user_update_approve_IdInApproveScreen;
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

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement CSM_SearchButtonInMaintenanceScreenApprove;

	public WebElement CSM_SearchButtonInMaintenanceScreenApprove() {
		return CSM_SearchButtonInMaintenanceScreenApprove;
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

	/// Jay Start

	@FindBy(xpath = "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement Add_Button_Transaction;

	public WebElement Add_Button_Transaction() {
		return Add_Button_Transaction;
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

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
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

	@FindBy(xpath = "//a[text()=' Additional Details ']")
	private WebElement Additional_details_Record;

	public WebElement Additional_details_Record() {
		return Additional_details_Record;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement Control_Record_CSM_Parameters;

	public WebElement Control_Record_CSM_Parameters() {
		return Control_Record_CSM_Parameters;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Transaction_code_Transaction_Type;

	public WebElement Transaction_code_Transaction_Type() {
		return Transaction_code_Transaction_Type;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001ZN_1_ctstrsVO.TRS_NO']")
	private WebElement DoubleClick_Cancel_Transaction_Type;

	public WebElement DoubleClick_Cancel_Transaction_Type() {
		return DoubleClick_Cancel_Transaction_Type;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement DoubleClick_Transaction_Type_Automatic_flag;

	public WebElement DoubleClick_Transaction_Type_Automatic_flag() {
		return DoubleClick_Transaction_Type_Automatic_flag;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement Control_record_Transaction;

	public WebElement Control_record_Transaction() {
		return Control_record_Transaction;
	}

	@FindBy(xpath = "//select[@id='send_clear_entry_O001UP']")
	private WebElement Send_clear_filed_Control_record_and_cheque_Entry;

	public WebElement Send_clear_filed_Control_record_and_cheque_Entry() {
		return Send_clear_filed_Control_record_and_cheque_Entry;
	}

	@FindBy(xpath = "//input[@id='no_clearing_entries_O001MT']")
	private WebElement No_clearingEntries_control_record;

	public WebElement No_clearingEntries_control_record() {
		return No_clearingEntries_control_record;
	}

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Che_related_cheque_clearing_other;

	public WebElement Che_related_cheque_clearing_other() {
		return Che_related_cheque_clearing_other;
	}

	@FindBy(xpath = "//td[text()='Deposit Cheques']")
	private WebElement Deposit_cheques_transaction;

	public WebElement Deposit_cheques_transaction() {
		return Deposit_cheques_transaction;
	}

	@FindBy(xpath = "//span[text()='Clearing/Voiding Deposits']")
	private WebElement Clearing_voiding_Deposits_transaction;

	public WebElement Clearing_voiding_Deposits_transaction() {
		return Clearing_voiding_Deposits_transaction;
	}

	@FindBy(xpath = "//input[@id='criteria_trxNo_I000DCV']")
	private WebElement Trasnaction_box_clearing;

	public WebElement Trasnaction_box_clearing() {
		return Trasnaction_box_clearing;
	}

	@FindBy(xpath = "//div[@id='lookupid_trxFromLkp_I000TCV']")
	private WebElement Trasnscation_From_clearing;

	public WebElement Trasnscation_From_clearing() {
		return Trasnscation_From_clearing;
	}

	@FindBy(xpath = "//div[@id='lookupid_trxToLkp_I000TCV']")
	private WebElement Trasnscation_To_clearing;

	public WebElement Trasnscation_To_clearing() {
		return Trasnscation_To_clearing;
	}

	@FindBy(xpath = "//td[text()='Transfers']")
	private WebElement Transfers_clearing_box;

	public WebElement Transfers_clearing_box() {
		return Transfers_clearing_box;
	}

	@FindBy(xpath = "//label[@id='depositChequesMaintForm_I000DCV_clear_void_key']")
	private WebElement clear_void_box;

	public WebElement clear_void_box() {
		return clear_void_box;
	}

	@FindBy(xpath = "//td[text()='Clearing Maintenance']")
	private WebElement Clearing_maintenance_transaction;

	public WebElement Clearing_maintenance_transaction() {
		return Clearing_maintenance_transaction;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement Cheque_number_transaction;

	public WebElement Cheque_number_transaction() {
		return Cheque_number_transaction;
	}

	@FindBy(xpath = "//input[@id='chq_date_D001MT']")
	private WebElement Cheque_Date_transaction;

	public WebElement Cheque_Date_transaction() {
		return Cheque_Date_transaction;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement Double_Transaction_Approve_proceed;

	public WebElement Double_Transaction_Approve_proceed() {
		return Double_Transaction_Approve_proceed;
	}

	// CHTR_P2_010

	@FindBy(xpath = "//input[@id='backdated_chq_P024MA']")
	private WebElement CSMParam_TransactionType_AllowtoProceed_Backdate;

	public WebElement CSMParam_TransactionType_AllowtoProceed_Backdate() {
		return CSMParam_TransactionType_AllowtoProceed_Backdate;
	}

	@FindBy(xpath = "//input[@id='cc_maintain_serial_no_P024MA']")
	private WebElement CSMParam_TransactionType_checkChequeValidityDuring_withdraw;

	public WebElement CSMParam_TransactionType_checkChequeValidityDuring_withdraw() {
		return CSMParam_TransactionType_checkChequeValidityDuring_withdraw;
	}

	@FindBy(xpath = "//input[@id='allow_proceed_pdc_P024MA']")
	private WebElement CSMParam_TransactionType_AllowToProceedPostDate;

	public WebElement CSMParam_TransactionType_AllowToProceedPostDate() {
		return CSMParam_TransactionType_AllowToProceedPostDate;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement CSM_Transaction_maintanance_ChequeNo;

	public WebElement CSM_Transaction_maintanance_ChequeNo() {
		return CSM_Transaction_maintanance_ChequeNo;
	}

	@FindBy(xpath = "//input[@id='chq_date_D001MT']")
	private WebElement CSM_Transaction_maintanance_ChequeDate;

	public WebElement CSM_Transaction_maintanance_ChequeDate() {
		return CSM_Transaction_maintanance_ChequeDate;
	}

	@FindBy(xpath = "//div[contains(text(),' Cheque is backdated')]")
	private WebElement CSM_Transaction_maintanance_ValidateChequeBackwardDate;

	public WebElement CSM_Transaction_maintanance_ValidateChequeBackwardDate() {
		return CSM_Transaction_maintanance_ValidateChequeBackwardDate;
	}

	@FindBy(xpath = "//div[contains(text(),' Cheque Date is Post Dated.')]")
	private WebElement CSM_Transaction_maintanance_ValidateChequePostDate;

	public WebElement CSM_Transaction_maintanance_ValidateChequePostDate() {
		return CSM_Transaction_maintanance_ValidateChequePostDate;
	}

	@FindBy(xpath = "//div[contains(text(),' Invalid/Missing Cheque Account No.')]")
	private WebElement CSM_Transaction_maintanance_Validate_InvalidMissingChequeAcc;

	public WebElement CSM_Transaction_maintanance_Validate_InvalidMissingChequeAcc() {
		return CSM_Transaction_maintanance_Validate_InvalidMissingChequeAcc;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid /Missing Cheque Code')]")
	private WebElement CSM_Transaction_maintanance_Validate_InvalidMissingChequeCode;

	public WebElement CSM_Transaction_maintanance_Validate_InvalidMissingChequeCode() {
		return CSM_Transaction_maintanance_Validate_InvalidMissingChequeCode;
	}

	@FindBy(xpath = "//select[@name='transactiontypesCO.ctstrxtypeVO.CHQ_RELATED']")
	private WebElement CSMparam_TransactionType_ChequeInfo_HouseCheque;

	public WebElement CSMparam_TransactionType_ChequeInfo_HouseCheque() {
		return CSMparam_TransactionType_ChequeInfo_HouseCheque;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement Transactions_maintenance_DocumentNo;

	public WebElement Transactions_maintenance_DocumentNo() {
		return Transactions_maintenance_DocumentNo;
	}

	@FindBy(xpath = "//span[text()='Apply to Void Inward Cheques']")
	private WebElement Transactions_ApplyToVoidInwardCheques_Field;

	public WebElement Transactions_ApplyToVoidInwardCheques_Field() {
		return Transactions_ApplyToVoidInwardCheques_Field;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001VIL_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo;

	public WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo() {
		return Transactions_ApplyToVoidInwardCheques_Field_TransactionNo;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001VIL']")
	private WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick;

	public WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick() {
		return Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001VIL']")
	private WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick_VoidReason;

	public WebElement Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick_VoidReason() {
		return Transactions_ApplyToVoidInwardCheques_Field_TransactionNo_DoubleClick_VoidReason;
	}

	@FindBy(xpath = "//span[contains(text(),'Apply to void inward Cheque')]//parent::button")
	private WebElement Transactions_ApplyToVoidInwardCheques_Button;

	public WebElement Transactions_ApplyToVoidInwardCheques_Button() {
		return Transactions_ApplyToVoidInwardCheques_Button;
	}

	@FindBy(xpath = "//span[text()='Voiding  Inward Cheques']")
	private WebElement Transactions_VoidingInwardCheque_Field;

	public WebElement Transactions_VoidingInwardCheque_Field() {
		return Transactions_VoidingInwardCheque_Field;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001OD_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_VoidingInwardCheque_Field_TransactionNo;

	public WebElement Transactions_VoidingInwardCheque_Field_TransactionNo() {
		return Transactions_VoidingInwardCheque_Field_TransactionNo;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001OD']")
	private WebElement Transactions_VoidingInwardCheque_Field_TransactionNo_DoubleClick;

	public WebElement Transactions_VoidingInwardCheque_Field_TransactionNo_DoubleClick() {
		return Transactions_VoidingInwardCheque_Field_TransactionNo_DoubleClick;
	}

	@FindBy(xpath = "//span[contains(text(),' Voiding Inward Cheques ')]//parent::button")
	private WebElement Transactions_VoidingInwardCheque_Button;

	public WebElement Transactions_VoidingInwardCheque_Button() {
		return Transactions_VoidingInwardCheque_Button;
	}

	@FindBy(xpath = "//td[text()='Void']")
	private WebElement Transactions_maintenance_StatusVOID;

	public WebElement Transactions_maintenance_StatusVOID() {
		return Transactions_maintenance_StatusVOID;
	}

//    							    														@FindBy(xpath = "//*[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
//    							    														private WebElement csmParam_Transactiontype_inputfield;
	//
//    							    														public WebElement csmParam_Transactiontype_inputfield() {
//    							    															return csmParam_Transactiontype_inputfield;
//    							    														}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_Maintanance_SearchButton_Input;

	public WebElement CSM_Transaction_Maintanance_SearchButton_Input() {
		return CSM_Transaction_Maintanance_SearchButton_Input;
	}

	// CHTR_P2_193

	@FindBy(xpath = "//span[text()='Apply to Clear Inward Cheques']")
	private WebElement CSM_Transaction_Maintanance_ApplytoClearInward;

	public WebElement CSM_Transaction_Maintanance_ApplytoClearInward() {
		return CSM_Transaction_Maintanance_ApplytoClearInward;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AC_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_Maintanance_ApplytoClearInward_TransactionNO;

	public WebElement CSM_Transaction_Maintanance_ApplytoClearInward_TransactionNO() {
		return CSM_Transaction_Maintanance_ApplytoClearInward_TransactionNO;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001AC']")
	private WebElement CSM_Transaction_Maintanance_ApplytoClearInward_TransactionNO_Doubleclick;

	public WebElement CSM_Transaction_Maintanance_ApplytoClearInward_TransactionNO_Doubleclick() {
		return CSM_Transaction_Maintanance_ApplytoClearInward_TransactionNO_Doubleclick;
	}

	@FindBy(xpath = "//span[contains(text(),' Apply Clearing Inward Cheque ')]//parent::button")
	private WebElement CSM_Transaction_Maintanance_ApplytoClearInward_Button;

	public WebElement CSM_Transaction_Maintanance_ApplytoClearInward_Button() {
		return CSM_Transaction_Maintanance_ApplytoClearInward_Button;
	}

	@FindBy(xpath = "//span[text()='Clearing Inward Cheques']")
	private WebElement CSM_Transaction_Maintanance_ClearingInwardCheque;

	public WebElement CSM_Transaction_Maintanance_ClearingInwardCheque() {
		return CSM_Transaction_Maintanance_ClearingInwardCheque;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001E_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_TransactionNO;

	public WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_TransactionNO() {
		return CSM_Transaction_Maintanance_ClearingInwardCheque_TransactionNO;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001E']")
	private WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_TransactionNO_DoubleClick;

	public WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_TransactionNO_DoubleClick() {
		return CSM_Transaction_Maintanance_ClearingInwardCheque_TransactionNO_DoubleClick;
	}

	@FindBy(xpath = "//span[contains(text(),' Clear Inward Cheque ')]//parent::button")
	private WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_Button;

	public WebElement CSM_Transaction_Maintanance_ClearingInwardCheque_Button() {
		return CSM_Transaction_Maintanance_ClearingInwardCheque_Button;
	}

	@FindBy(xpath = "//td[text()='Cleared']")
	private WebElement CSM_Transaction_Maintanance_ClearedStatus;

	public WebElement CSM_Transaction_Maintanance_ClearedStatus() {
		return CSM_Transaction_Maintanance_ClearedStatus;
	}

	@FindBy(xpath = "//td[text()='Template Entries']")
	private WebElement Template_Entries;

	public WebElement Template_Entries() {
		return Template_Entries;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Template_Entries_Maintenance;

	public WebElement Template_Entries_Maintenance() {
		return Template_Entries_Maintenance;
	}

	@FindBy(xpath = "//input[@name='templateentriesCO.ctstrsdetTemplateVO.CODE']")
	private WebElement Template_Entries_Maintenance_Code;

	public WebElement Template_Entries_Maintenance_Code() {
		return Template_Entries_Maintenance_Code;
	}

	@FindBy(xpath = "//input[@name='templateentriesCO.ctstrsdetTemplateVO.BRIEF_NAME_ENG']")
	private WebElement Template_Entries_Maintenance_BriefName;

	public WebElement Template_Entries_Maintenance_BriefName() {
		return Template_Entries_Maintenance_BriefName;
	}

	@FindBy(xpath = "//td[@id='td_tab3_GridTbl_Id_P0070MT_1_ctstrsdetTemplateVO.LINE_ORDER']//input")
	private WebElement Template_Entries_Maintenance_LineOrder;

	public WebElement Template_Entries_Maintenance_LineOrder() {
		return Template_Entries_Maintenance_LineOrder;
	}

	@FindBy(xpath = "//td[@id='td_tab3_GridTbl_Id_P0070MT_1_ctstrsdetTemplateVO.GROUP_NO']//input")
	private WebElement Template_Entries_Maintenance_GroupNO;

	public WebElement Template_Entries_Maintenance_GroupNO() {
		return Template_Entries_Maintenance_GroupNO;
	}

	@FindBy(xpath = "//label[@labelkey='Save_key']")
	private WebElement Template_Entries_Maintenance_Save;

	public WebElement Template_Entries_Maintenance_Save() {
		return Template_Entries_Maintenance_Save;
	}

	@FindBy(xpath = "//select[@id='document_type_P024MA']")
	private WebElement Document_Type_Bill;

	public WebElement Document_Type_Bill() {
		return Document_Type_Bill;
	}

	@FindBy(xpath = "//input[@id='templateEntriesList_GridTbl_Id_P0070P_gs_ctstrsdetTemplateVO.CODE']")
	private WebElement Template_Code_value;

	public WebElement Template_Code_value() {
		return Template_Code_value;
	}

	@FindBy(xpath = "//label[@id='templateEntriesMaint_FormId_P0070P_Approve_key']")
	private WebElement Approve_submit_Template;

	public WebElement Approve_submit_Template() {
		return Approve_submit_Template;
	}

	// Karthi*************************************************************************************************

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement CSMParam_TransactionType_UPA;

	public WebElement CSMParam_TransactionType_UPA() {
		return CSMParam_TransactionType_UPA;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code;

	public WebElement CSMParam_TransactionType_UPA_code() {
		return CSMParam_TransactionType_UPA_code;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code_doubleClick;

	public WebElement CSMParam_TransactionType_UPA_code_doubleClick() {
		return CSMParam_TransactionType_UPA_code_doubleClick;
	}

	@FindBy(xpath = "//input[@id='nostro_mvt_P024MA']")
	private WebElement CSMParam_TransactionType_AllowInternalGL;

	public WebElement CSMParam_TransactionType_AllowInternalGL() {
		return CSMParam_TransactionType_AllowInternalGL;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']/ancestor::a/following-sibling::ul//span[text()='Approve']")
	private WebElement CSMParam_TransactionType_Approve;

	public WebElement CSMParam_TransactionType_Approve() {
		return CSMParam_TransactionType_Approve;
	}

	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code;

	public WebElement CSMParam_TransactionType_Approve_code() {
		return CSMParam_TransactionType_Approve_code;
	}

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClick;

	public WebElement CSMParam_TransactionType_Approve_code_doubleClick() {
		return CSMParam_TransactionType_Approve_code_doubleClick;
	}

	@FindBy(xpath = "(//td[text()='55']//following::td[text()='Transfer intra'])[1]")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClickforTRS_064;

	public WebElement CSMParam_TransactionType_Approve_code_doubleClickforTRS_064() {
		return CSMParam_TransactionType_Approve_code_doubleClickforTRS_064;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSMCore_Transactions;

	public WebElement CSMCore_Transactions() {
		return CSMCore_Transactions;
	}

	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement CSMCore_Transactions_Maintenance;

	public WebElement CSMCore_Transactions_Maintenance() {
		return CSMCore_Transactions_Maintenance;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_TRXType;

	public WebElement CSMCore_Transactions_Maintenance_TRXType() {
		return CSMCore_Transactions_Maintenance_TRXType;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement CSMCore_Transactions_Maintenance_BranchCode;

	public WebElement CSMCore_Transactions_Maintenance_BranchCode() {
		return CSMCore_Transactions_Maintenance_BranchCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_GLCode;

	public WebElement CSMCore_Transactions_Maintenance_GLCode() {
		return CSMCore_Transactions_Maintenance_GLCode;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CSMCore_Transactions_Maintenance_CIFCode;

	public WebElement CSMCore_Transactions_Maintenance_CIFCode() {
		return CSMCore_Transactions_Maintenance_CIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_SerialNo;

	public WebElement CSMCore_Transactions_Maintenance_SerialNo() {
		return CSMCore_Transactions_Maintenance_SerialNo;
	}

	// TSA_024

	@FindBy(xpath = "//input[@id='short_desc_arab_P024MA']")
	private WebElement CSMparam_transactionType_UPAA_Arabicword_No1;

	public WebElement CSMparam_transactionType_UPAA_Arabicword_No1() {
		return CSMparam_transactionType_UPAA_Arabicword_No1;
	}

	@FindBy(xpath = "//input[@id='long_desc_arab_P024MA']")
	private WebElement CSMparam_transactionType_UPAA_Arabicword_No2;

	public WebElement CSMparam_transactionType_UPAA_Arabicword_No2() {
		return CSMparam_transactionType_UPAA_Arabicword_No2;
	}// trs debit

	// TRS_027

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions_Transactions;

	public WebElement Transactions_Transactions() {
		return Transactions_Transactions;
	}

	@FindBy(xpath = "//span[text()='Maintenance']//parent::a[@id='D001MT']")
	private WebElement Transactions_MaintenanceScrn;

	public WebElement Transactions_MaintenanceScrn() {
		return Transactions_MaintenanceScrn;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Transactions_Trxtypevalue;

	public WebElement Transactions_Trxtypevalue() {
		return Transactions_Trxtypevalue;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_debitAcc_Glcode;

	public WebElement Transactions_debitAcc_Glcode() {
		return Transactions_debitAcc_Glcode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_debitAcc_Cifcode;

	public WebElement Transactions_debitAcc_Cifcode() {
		return Transactions_debitAcc_Cifcode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_debitAcc_serialcode;

	public WebElement Transactions_debitAcc_serialcode() {
		return Transactions_debitAcc_serialcode;
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

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn;

	public WebElement Transactions_Warning_okbtn() {
		return Transactions_Warning_okbtn;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement Transactions_savebtn;

	public WebElement Transactions_savebtn() {
		return Transactions_savebtn;
	}

	@FindBy(xpath = "//label[text()='Show fees Separately in Statement Of Account	']//parent::td/preceding-sibling::td//input[@type='checkbox']")
	private WebElement csmparam_TRXType_Showseparatelyinstatementofaccflag;

	public WebElement csmparamTRXTypeShowseparatelyinstatementofaccflag() {
		return csmparam_TRXType_Showseparatelyinstatementofaccflag;
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

	@FindBy(xpath = "//span[text()='Approve']//parent::a[@id='D001AU']")
	private WebElement Transactions_Approvescrn;

	public WebElement Transactions_Approvescrn() {
		return Transactions_Approvescrn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValue2;

	public WebElement Transactions_transactionNo_codeValue2() {
		return Transactions_transactionNo_codeValue2;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_code;

	public WebElement Transactions_transactionNo_code() {
		return Transactions_transactionNo_code;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Maintenance')]//parent::td//following-sibling::td//span")

	private WebElement transaction_closeTransactionTab;

	public WebElement transactionCloseTransactionTab() {

		return transaction_closeTransactionTab;

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

	@FindBy(xpath = "//div[contains(text(),'Confirm Delete Process')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_confirm_ok']")

	private WebElement csm_Delete_ConfirmationOkButton;

	public WebElement csmDeleteConfirmationOkButton() {

		return csm_Delete_ConfirmationOkButton;

	}

	@FindBy(xpath = "//input[@id='1_ctstrxtypeStatusVO.APPL_OVERDRAW_ONLY']")

	private WebElement transactionTypeStatus_ApplyOverdrawOnly;

	public WebElement transactionTypeStatus_ApplyOverdrawOnly()

	{

		return transactionTypeStatus_ApplyOverdrawOnly;

	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_searchbtn;

	public WebElement Transactions_searchbtn() {
		return Transactions_searchbtn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_trxno_code;

	public WebElement Transactions_trxno_code() {
		return Transactions_trxno_code;
	}

	// id="td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO"
	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_doubleclk_codevalue;

	public WebElement Transactions_doubleclk_codevalue() {
		return Transactions_doubleclk_codevalue;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
	private WebElement Transactions_BookedEntries;

	public WebElement Transactions_BookedEntries() {
		return Transactions_BookedEntries;
	}

	@FindBy(xpath = "//div[contains(text(),'Not A Valid Non Internal GL')]")
	private WebElement nonInternalGlCodeValidationPopUp;

	public WebElement nonInternalGlCodeValidationPopUp() {
		return nonInternalGlCodeValidationPopUp;
	}

//TRS_024
	@FindBy(xpath = "//input[@id='rqst_cy_nomination_det_P024MA']")
	private WebElement TransactionType_UPAA_dealwithCurrencyDominationChequbox;

	public WebElement TransactionType_UPAA_dealwithCurrencyDominationChequbox() {
		return TransactionType_UPAA_dealwithCurrencyDominationChequbox;
	}

//TRS_063

	@FindBy(xpath = "(//td[text()='55']//following::td[text()='Transfer intra'])[1]")
	private WebElement csmParam_Transactiontype_inputfield_doubleclickforTRS_064;

	public WebElement csmParam_Transactiontype_inputfield_doubleclickforTRS_064() {
		return csmParam_Transactiontype_inputfield_doubleclickforTRS_064;
	}

	@FindBy(id = "td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE")
	private WebElement csm_TransactionType_ApproveScreen_CodeInput_DoubleClick;

	public WebElement csmTransactionTypeApproveScreenCodeInputDoubleClick() {
		return csm_TransactionType_ApproveScreen_CodeInput_DoubleClick;
	}

	@FindBy(xpath = "")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064;
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

	@FindBy(xpath = "//td[text()='Account Type']/ancestor::a/following-sibling::ul//span[text()='Approve']")
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

	@FindBy(xpath = "//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Amount Exceeds Available Balance in Account')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement AmountExceedsWarningPopUp;

	public WebElement AmountExceedsWarningPopUp() {
		return AmountExceedsWarningPopUp;
	}

	@FindBy(xpath = "//input[@id='branch_code_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit() {
		return CSMCore_Transactions_Maintenance_BranchCodeForCredit;
	}

	@FindBy(xpath = "//input[@id='ctrl_cy_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit() {
		return CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit;
	}

	@FindBy(xpath = "//input[@id='ctrl_gl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_GLCodeCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_GLCodeCodeForCredit() {
		return CSMCore_Transactions_Maintenance_GLCodeCodeForCredit;
	}

	@FindBy(xpath = "//input[@id='ctrl_cif_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit() {
		return CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_ctrl_sl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_SerialNoCodeForCredit;

	public WebElement CSMCore_Transactions_Maintenance_SerialNoCodeForCredit() {
		return CSMCore_Transactions_Maintenance_SerialNoCodeForCredit;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement csmParam_Transactiontype_ForceOverDrawn;

	public WebElement csmParam_Transactiontype_ForceOverDrawn() {
		return csmParam_Transactiontype_ForceOverDrawn;
	}

//TRS_111

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

	@FindBy(xpath = "//a[@id='E000MA']")
	private WebElement updateAfterApproveInUser;

	public WebElement updateAfterApproveInUser() {
		return updateAfterApproveInUser;

	}

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

	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement userIdInUpdateAfterApprove;

	public WebElement userIdInUpdateAfterApprove() {
		return userIdInUpdateAfterApprove;
	}

	@FindBy(xpath = "//td[@tdlabel='Deposit Limit']//input")
	private WebElement depositLimitInUpdateAfterApprove;

	public WebElement depositLimitInUpdateAfterApprove() {
		return depositLimitInUpdateAfterApprove;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement updateAfterApproveButtonInUpdateAfterApprove;

	public WebElement updateAfterApproveButtonInUpdateAfterApprove() {
		return updateAfterApproveButtonInUpdateAfterApprove;
	}

	@FindBy(xpath = "//a[@id='E000P']")
	private WebElement approveScreenInUser;

	public WebElement approveScreenInUser() {
		return approveScreenInUser;
	}

	@FindBy(id = "tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")
	private WebElement userIdInApprove;

	public WebElement userIdInApprove() {
		return userIdInApprove;
	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")
	private WebElement doubleClickUserIdInApprove;

	public WebElement doubleClickUserIdInApprove() {
		return doubleClickUserIdInApprove;
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

	@FindBy(xpath = "//td[@tdlabel='W/D Limit']//input")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits;
	}

	@FindBy(xpath = "//td[@tdlabel='W/D Limit']//input")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimitsNo2;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimitsNo2() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimitsNo2;
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

	@FindBy(xpath = "//a[text()='Transactions / Maintenance']")
	private WebElement clicksomething;

	public WebElement clicksomething() {
		return clicksomething;
	}

	@FindBy(id = "ok_btn_2_E000MA")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_ok;

	public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_ok() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_ok;
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

	@FindBy(xpath = "//button[@id='submit_255022178']")
	private WebElement Transactions_Approvebtns;

	public WebElement Transactions_Approvebtns() {
		return Transactions_Approvebtns;
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

	@FindBy(xpath = "(//td[text()='840'])[1]")
	private WebElement limits_retriveTheRecordfor_TRS110;

	public WebElement limits_retriveTheRecordfor_TRS110() {
		return limits_retriveTheRecordfor_TRS110;
	}

	@FindBy(xpath = "//td[text()='452']")
	private WebElement limits_retriveTheRecord;

	public WebElement limits_retriveTheRecord() {
		return limits_retriveTheRecord;
	}

	@FindBy(xpath = "//td[text()='CASH WD']")
	private WebElement limits_retriveTheRecord_DataNo2;

	public WebElement limits_retriveTheRecord_DataNo2() {
		return limits_retriveTheRecord_DataNo2;
	}

	@FindBy(xpath = "//td[text()='Deposit Rita']")
	private WebElement limits_retriveTheRecordtoDelete;

	public WebElement limits_retriveTheRecordtoDelete() {
		return limits_retriveTheRecordtoDelete;
	}

	@FindBy(xpath = "//td[@id='del_tab3_C_GridTbl_Id_E000MA']")
	private WebElement limits_DeleteButton;

	public WebElement limits_DeleteButton() {
		return limits_DeleteButton;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']//parent::div//following-sibling::div//div[contains(text(),'Currency: Limit Amount should be between')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement CannotProceed_Warning_popup;

	public WebElement CannotProceed_Warning_popup() {
		return CannotProceed_Warning_popup;
	}

	@FindBy(xpath = "//div[contains(text(),'WARNING')]//parent::div//following-sibling::div//div[contains(text(),'Currency: Limit Amount should be between')]//parent::div//following-sibling::center//input")
	private WebElement Warning_popup;

	public WebElement Warning_popup() {
		return Warning_popup;
	}

	// TRS_127
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

	// TRS_139
	@FindBy(xpath = "//td[text()='Control Record']//parent::td")
	private WebElement SystemParameters_ControlRecord;

	public WebElement SystemParameters_ControlRecord_606() {
		return SystemParameters_ControlRecord;
	}

	@FindBy(xpath = "//td[text()='Control Record']/ancestor::a/following-sibling::ul//span[text()='Update After Approve']")
	private WebElement SystemParameters_ControlRecord_UPA;

	public WebElement SystemParameters_ControlRecord_UPA_606() {
		return SystemParameters_ControlRecord_UPA;
	}

	@FindBy(xpath = "//a[text()=' Alert Activation ']")
	private WebElement SystemParameters_ControlRecord_UPA_AlertActivation;

	public WebElement SystemParameters_ControlRecord_UPA_AlertActivation_606() {
		return SystemParameters_ControlRecord_UPA_AlertActivation;
	}

	@FindBy(xpath = "//span[text()='Account Balance Overdrawn']//parent::td/div")
	private WebElement ControlRecord_UPA_AlertActivation_flag;

	public WebElement ControlRecord_UPA_AlertActivation_flag_606() {
		return ControlRecord_UPA_AlertActivation_flag;
	}

	@FindBy(xpath = "//tr[@id='TRX']")
	private WebElement ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn1;

	public WebElement ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn1_606() {
		return ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn1;
	}

	@FindBy(xpath = "//input[@id='TRX_ctscontrolAlertVO.ACTIVATE_tab4_GridTbl_Id_O001UP']")
	private WebElement ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn1_Checkbox1;

	public WebElement ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn1_Checkbox1_606() {

		return ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn1_Checkbox1;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_1_CUSTOM_FIELD'])[2]")
	private WebElement ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn2;

	public WebElement ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn2_606() {

		return ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn2;
	}

	@FindBy(xpath = "//input[@id='1x1x10_ctscontrolAlertVO.ACTIVATE_tab4_GridTbl_Id_O001UP']")
	private WebElement ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn2_CheckBox2;

	public WebElement ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn2_CheckBox2_606() {

		return ControlRecord_UPA_AlertActivation_flag_AccountBalanceOverdrawn2_CheckBox2;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement ControlRecord_UPA_AlertActivation_UPAButton;

	public WebElement ControlRecord_UPA_AlertActivation_UPAButton_606() {

		return ControlRecord_UPA_AlertActivation_UPAButton;
	}

	@FindBy(xpath = "//td[text()='Control Record']/ancestor::a/following-sibling::ul//span[text()='Approve']")
	private WebElement ControlRecord_UPA_AlertActivation_ApproveField;

	public WebElement ControlRecord_UPA_AlertActivation_ApproveField_606() {

		return ControlRecord_UPA_AlertActivation_ApproveField;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement ControlRecord_UPA_AlertActivation_ApproveField_ApproveButton;

	public WebElement ControlRecord_UPA_AlertActivation_ApproveField_ApproveButton_606() {

		return ControlRecord_UPA_AlertActivation_ApproveField_ApproveButton;
	}

	// TRS_140
	@FindBy(xpath = "//td[text()='System Parameters']//parent::td")
	private WebElement csmParam_Systemparameter;

	public WebElement csmParam_Systemparameter() {
		return csmParam_Systemparameter;
	}

	@FindBy(xpath = "//label[@id='lbl_multi_branch_P024MA']")
	private WebElement SystemParameters_TransactionType_UPA_EnableMultiBranchCkeckbox;

	public WebElement SystemParameters_TransactionType_UPA_EnableMultiBranchCkeckbox_606() {

		return SystemParameters_TransactionType_UPA_EnableMultiBranchCkeckbox;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_4_CUSTOM_FIELD'])[1]")
	private WebElement ControlRecords_UPA_AlertActivation_AccountBalanceoverdrawn_intraBranch;

	public WebElement ControlRecords_UPA_AlertActivation_AccountBalanceoverdrawn_intraBranch_606() {

		return ControlRecords_UPA_AlertActivation_AccountBalanceoverdrawn_intraBranch;
	}

	@FindBy(xpath = "//input[@id='1x1x13_ctscontrolAlertVO.ACTIVATE_tab4_GridTbl_Id_O001UP']")
	private WebElement ControlRecords_UPA_AlertActivation_AccountBalanceoverdrawn_intraBranch_checkBox;

	public WebElement ControlRecords_UPA_AlertActivation_AccountBalanceoverdrawn_intraBranch_checkBox_606() {

		return ControlRecords_UPA_AlertActivation_AccountBalanceoverdrawn_intraBranch_checkBox;
	}

	@FindBy(xpath = "//label[text()='Account Details ']//parent::span//parent::button")
	private WebElement Transaction_maintenance_AccountdetailsButton;

	public WebElement TransactionmaintenanceAccountdetailsButton() {
		return Transaction_maintenance_AccountdetailsButton;
	}

	@FindBy(xpath = "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement Transaction_maintenance_AccountdetailsButton_plusicon;

	public WebElement TransactionmaintenanceAccountdetailsButtonplusicon() {
		return Transaction_maintenance_AccountdetailsButton_plusicon;
	}
	// table[@id='trxMgntAccountDtlGridTbl_Id_D001MT']

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']")
	private WebElement Transaction_maintenance_AccountdetailsButton_plusicon_tableclick;

	public WebElement TransactionmaintenanceAccountdetailsButtonplusicontableclick() {
		return Transaction_maintenance_AccountdetailsButton_plusicon_tableclick;
	}

	@FindBy(xpath = "(//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_rn'])[2]")
	private WebElement Transaction_maintenance_AccountdetailsButton_plusicon_tableclick_no2;

	public WebElement TransactionmaintenanceAccountdetailsButtonplusicontableclickno2() {
		return Transaction_maintenance_AccountdetailsButton_plusicon_tableclick_no2;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']//input")
	private WebElement Transaction_maintenance_AccountdetailsButton_Branchcode;

	public WebElement Transaction_maintenance_AccountdetailsButton_Branchcode() {
		return Transaction_maintenance_AccountdetailsButton_Branchcode;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']//input")
	private WebElement Transaction_maintenance_AccountdetailsButton_GLcode;

	public WebElement Transaction_maintenance_AccountdetailsButton_GLcode() {
		return Transaction_maintenance_AccountdetailsButton_GLcode;
	}

	@FindBy(xpath = " //td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF']//input")
	private WebElement Transaction_maintenance_AccountdetailsButton_CIFcode;

	public WebElement Transaction_maintenance_AccountdetailsButton_CIFcode() {
		return Transaction_maintenance_AccountdetailsButton_CIFcode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL']")
	private WebElement Transaction_maintenance_AccountdetailsButton_SLcode;

	public WebElement Transaction_maintenance_AccountdetailsButton_SLcode() {
		return Transaction_maintenance_AccountdetailsButton_SLcode;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.FC_AMOUNT']//input")
	private WebElement Transaction_maintenance_AccountdetailsButton_Amount;

	public WebElement Transaction_maintenance_AccountdetailsButton_Amount() {
		return Transaction_maintenance_AccountdetailsButton_Amount;
	}

	@FindBy(xpath = "//span[text()='ok']//parent::button")
	private WebElement Transaction_maintenance_AccountdetailsButton_OKbutton;

	public WebElement Transaction_maintenance_AccountdetailsButton_OKbutton() {
		return Transaction_maintenance_AccountdetailsButton_OKbutton;
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

	@FindBy(xpath = "//label[@id='Reject_Key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectKey;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItemsRejectKey() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectKey;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ClosePopupmsg_frontoffice;

	public WebElement ClosePopupmsg_frontoffice() {
		return ClosePopupmsg_frontoffice;
	}

	@FindBy(xpath = "//select[@id='trsfr_method_D001MT']")
	private WebElement csm_Transaction_ModeOfPayment;

	public WebElement csmTransactionModeOfPayment() {
		return csm_Transaction_ModeOfPayment;
	}

	// TRS239
	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA0']")
	private WebElement csmParam_TransactionType_UPA_CashRadioButton;

	public WebElement csmParam_TransactionType_UPA_CashRadioButton() {
		return csmParam_TransactionType_UPA_CashRadioButton;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement csmParam_TransactionType_UPA_DetectfromdebitoraccRadioButton;

	public WebElement csmParam_TransactionType_UPA_DetectfromdebitoraccRadioButton() {
		return csmParam_TransactionType_UPA_DetectfromdebitoraccRadioButton;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA2']")
	private WebElement csmParam_TransactionType_UPA_DetectfromCreditoraccRadioButton;

	public WebElement csmParam_TransactionType_UPA_DetectfromCreditoraccRadioButton() {
		return csmParam_TransactionType_UPA_DetectfromCreditoraccRadioButton;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.DEDUCT_CASH']")
	private WebElement csmParam_TransactionType_UPA_CashCheckbox;

	public WebElement csmParam_TransactionType_UPA_CashCheckbox() {
		return csmParam_TransactionType_UPA_CashCheckbox;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.DEDUCT_CREDITOR']")
	private WebElement csmParam_TransactionType_UPA_DetectfromCreditoraccCheckbox;

	public WebElement csmParam_TransactionType_UPA_DetectfromCreditoraccCheckbox() {
		return csmParam_TransactionType_UPA_DetectfromCreditoraccCheckbox;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.DEDUCT_DEBITOR']")
	private WebElement csmParam_TransactionType_UPA_DetectfromDEBITORaccCheckbox;

	public WebElement csmParam_TransactionType_UPA_DetectfromDEBITORaccCheckbox() {
		return csmParam_TransactionType_UPA_DetectfromDEBITORaccCheckbox;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CARD_NO_D001MT']")
	private WebElement csm_Transactions_Maintenace_CardCode;

	public WebElement csm_Transactions_Maintenace_CardCode() {
		return csm_Transactions_Maintenace_CardCode;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement csm_Transactions_Maintenace_searchButton;

	public WebElement csm_Transactions_Maintenace_searchButton() {
		return csm_Transactions_Maintenace_searchButton;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement csm_Transactions_Maintenace_searchButton_TransactionNo;

	public WebElement csm_Transactions_Maintenace_searchButton_TransactionNo() {
		return csm_Transactions_Maintenace_searchButton_TransactionNo;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement csm_Transactions_Maintenace_searchButton_TransactionNo_DoubleClick;

	public WebElement csm_Transactions_Maintenace_searchButton_TransactionNo_DoubleClick() {
		return csm_Transactions_Maintenace_searchButton_TransactionNo_DoubleClick;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.avail_bal_after']")
	private WebElement transactions_AvailableBalanceAfterfield;

	public WebElement transactionsAvailableBalanceAfterfield() {
		return transactions_AvailableBalanceAfterfield;
	}
	// TRS_465

	// Transaction new priority test cases
	@FindBy(xpath = "//a[@id='transactionTypes_tab_additionalinfo_P024MA']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo;

	public WebElement CsmParam_Transactiontype_AdditionalInfo() {
		return CsmParam_Transactiontype_AdditionalInfo;
	}

	@FindBy(xpath = "//td[@id='add_tab12_GridTbl_Id_P024MA']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_Credit_PlusBtn;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_Credit_PlusBtn() {
		return CsmParam_Transactiontype_AdditionalInfo_Credit_PlusBtn;
	}

	@FindBy(id = "td_tab12_GridTbl_Id_P024MA_1_ctstrxtypeAccVO.ACC_BR")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACCExistOrNot;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACCExistOrNot() {
		return CsmParam_Transactiontype_AdditionalInfo_CreditACCExistOrNot;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeAccVO.ACC_BR']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACCBranchCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACCBranchCode() {
		return CsmParam_Transactiontype_AdditionalInfo_CreditACCBranchCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeAccVO.ACC_CY']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_CYCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_CYCode() {
		return CsmParam_Transactiontype_AdditionalInfo_CreditACC_CYCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeAccVO.ACC_GL']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_GLCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_GLCode() {
		return CsmParam_Transactiontype_AdditionalInfo_CreditACC_GLCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeAccVO.ACC_CIF']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_CIFCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_CIFCode() {
		return CsmParam_Transactiontype_AdditionalInfo_CreditACC_CIFCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeAccVO.ACC_SL']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_SLCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_CreditACC_SLCode() {
		return CsmParam_Transactiontype_AdditionalInfo_CreditACC_SLCode;
	}

	// DEBIT

	@FindBy(xpath = "//td[@id='add_tab11_GridTbl_Id_P024MA']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_Debit_PlusBtn;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_Debit_PlusBtn() {
		return CsmParam_Transactiontype_AdditionalInfo_Debit_PlusBtn;
	}

	@FindBy(xpath = "//td[@id='td_tab11_GridTbl_Id_P024MA_1_ctstrxtypeAccVO.ACC_BR']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_DebitACCExistOrNot;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_DebitACCExistOrNot() {
		return CsmParam_Transactiontype_AdditionalInfo_DebitACCExistOrNot;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeAccVO.ACC_BR']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_DebitACCBranchCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_DebitACCBranchCode() {
		return CsmParam_Transactiontype_AdditionalInfo_DebitACCBranchCode;
	}

	@FindBy(xpath = " //input[@name='lookupTxt_ctstrxtypeAccVO.ACC_CY']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_CYCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_CYCode() {
		return CsmParam_Transactiontype_AdditionalInfo_debitACC_CYCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeAccVO.ACC_GL']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_GLCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_GLCode() {
		return CsmParam_Transactiontype_AdditionalInfo_debitACC_GLCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeAccVO.ACC_CIF']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_CIFCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_CIFCode() {
		return CsmParam_Transactiontype_AdditionalInfo_debitACC_CIFCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeAccVO.ACC_SL']")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_SLCode;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_SLCode() {
		return CsmParam_Transactiontype_AdditionalInfo_debitACC_SLCode;
	}

	@FindBy(xpath = "//td[@id='td_tab11_GridTbl_Id_P024MA_1_ctstrxtypeAccVO.TRX_DEFAULT_ACC']/input")
	private WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_DefaultCheckBox;

	public WebElement CsmParam_Transactiontype_AdditionalInfo_debitACC_DefaultCheckBox() {
		return CsmParam_Transactiontype_AdditionalInfo_debitACC_DefaultCheckBox;
	}

	// Credit account
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement Csm_Transaction_Maintannce_CreditAcc_Gl;

	public WebElement Csm_Transaction_Maintannce_CreditAcc_Gl() {
		return Csm_Transaction_Maintannce_CreditAcc_Gl;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement Csm_Transaction_Maintannce_CreditAcc_CIF;

	public WebElement Csm_Transaction_Maintannce_CreditAcc_CIF() {
		return Csm_Transaction_Maintannce_CreditAcc_CIF;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement Csm_Transaction_Maintannce_CreditAcc_SL;

	public WebElement Csm_Transaction_Maintannce_CreditAcc_SL() {
		return Csm_Transaction_Maintannce_CreditAcc_SL;
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
	// TRNS_P2_091

	@FindBy(xpath = "//input[@name='trxMgntCO.avail_bal']")
	private WebElement Transaction_Maintanance_AvailableBalancefield;

	public WebElement Transaction_Maintanance_AvailableBalancefield() {
		return Transaction_Maintanance_AvailableBalancefield;
	}

	@FindBy(xpath = "//button[@id='cb_trsPosition_D001MT']")
	private WebElement Transaction_Maintanance_AccountPositionButton;

	public WebElement Transaction_Maintanance_AccountPositionButton() {
		return Transaction_Maintanance_AccountPositionButton;
	}

	@FindBy(xpath = "//span[text()='ok']//parent::button")
	private WebElement Transaction_Maintanance_AccountPositionButton_Okbtn;

	public WebElement Transaction_Maintanance_AccountPositionButton_Okbtn() {
		return Transaction_Maintanance_AccountPositionButton_Okbtn;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_E000MA_1_ctstelleracctypedetVO.SEE_ACC_POSITION']//input)[2]")
	private WebElement CSMParam_User_Accounttype_ViewAccountPostionCheckBox;

	public WebElement CSMParam_User_Accounttype_ViewAccountPostionCheckBox() {
		return CSMParam_User_Accounttype_ViewAccountPostionCheckBox;
	}

	@FindBy(xpath = "//div[text()='Duplicated Entry Of Record']//parent::div//following-sibling::center//input")
	private WebElement CSMParam_User_IfDupilcateEntryoccursInAnytab_Ok;

	public WebElement CSMParam_User_IfDupilcateEntryoccursInAnytab_Ok() {
		return CSMParam_User_IfDupilcateEntryoccursInAnytab_Ok;
	}

	@FindBy(xpath = "//td[@id='del_tab4_GridTbl_Id_E000MA']")
	private WebElement CSMParam_User_AccountType_deleteBtn;

	public WebElement CSMParam_User_AccountType_deleteBtn() {
		return CSMParam_User_AccountType_deleteBtn;
	}

	@FindBy(xpath = "(//td[@id='td_tab5_C_GridTbl_Id_E000MA_1_ctstellerciftypedetVO.SEE_ACC_POSITION']//input)[2]")
	private WebElement CSMParam_User_CIFtype_ViewAccountPostionCheckBox;

	public WebElement CSMParam_User_CIFtype_ViewAccountPostionCheckBox() {
		return CSMParam_User_CIFtype_ViewAccountPostionCheckBox;
	}

	@FindBy(xpath = "//td[@id='del_tab5_C_GridTbl_Id_E000MA']")
	private WebElement CSMParam_User_CIFtype_deletebtn;

	public WebElement CSMParam_User_CIFtype_deletebtn() {
		return CSMParam_User_CIFtype_deletebtn;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.AUTO_APPROVE_WITHIN_LIMIT']")
	private WebElement CSMParam_transactionType_Automaticapproveflag;

	public WebElement CSMParam_transactionType_Automaticapproveflag() {
		return CSMParam_transactionType_Automaticapproveflag;
	}

	@FindBy(xpath = "//a[@id='controlRecord_tab_AdditionalDetails_O001UP']")
	private WebElement CSMParam_ControlRecord_AdditonalDetails;

	public WebElement CSMParam_ControlRecord_AdditonalDetails() {
		return CSMParam_ControlRecord_AdditonalDetails;
	}

	@FindBy(xpath = "//input[@id='valid_alrt_lmt_on_apprv_trx_yn_O001UP']")
	private WebElement CSMParam_ControlRecord_AdditonalDetails_validateagainstAlertcheckbox;

	public WebElement CSMParam_ControlRecord_AdditonalDetails_validateagainstAlertcheckbox() {
		return CSMParam_ControlRecord_AdditonalDetails_validateagainstAlertcheckbox;
	}

	@FindBy(xpath = "//td[contains(text(), 'You do not have enough cash to complete this transaction')]")
	private WebElement csm_Transaction_maintanance_warning_popUp;

	public WebElement csm_Transaction_maintanance_warning_popUp() {
		return csm_Transaction_maintanance_warning_popUp;
	}

	// TRNS_P2_076
	@FindBy(xpath = "//input[@id='bypass_int_acc_restrictions_E000MA']")
	private WebElement csmParam_Users_ByPassInternalAccount;

	public WebElement csmParam_Users_ByPassInternalAccount() {
		return csmParam_Users_ByPassInternalAccount;
	}

	@FindBy(xpath = "//input[@id='multi_branch_P024MA']")
	private WebElement csmParam_Users_EnableMultiBranch;

	public WebElement csmParam_Users_EnableMultiBranch() {
		return csmParam_Users_EnableMultiBranch;
	}

	@FindBy(xpath = "//input[@id='nostro_mvt_P024MA']")
	private WebElement csmParam_Users_AlloweInternalGL;

	public WebElement csmParam_Users_AlloweInternalGL() {
		return csmParam_Users_AlloweInternalGL;
	}

	@FindBy(xpath = "//td[@id='td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID']")
	private WebElement CSM_doubleclkuserid_under_UAA;

	public WebElement CSM_doubleclkuserid_under_UAA() {
		return CSM_doubleclkuserid_under_UAA;
	}

	@FindBy(xpath = "//input[@id='bypass_int_acc_restrictions_E000MA']")
	private WebElement CSM_bypassAcRestKey_Checkbox_under_UAA;

	public WebElement CSM_bypassAcRestKey_Checkbox_under_UAA() {
		return CSM_bypassAcRestKey_Checkbox_under_UAA;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key")
	private WebElement CSM_UAAbutton_under_UAA;

	public WebElement CSM_UAAbutton_under_UAA() {
		return CSM_UAAbutton_under_UAA;
	}

	// Razia Steps

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu() {
		return CSM_TransactionsMainMenu;
	}

	// id="D001MT"
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSM_MaintenanceUnderTransactions;

	public WebElement CSMMaintenanceUnderTransactions() {
		return CSM_MaintenanceUnderTransactions;
	}

	// id="lookuptxt_trx_type_D001MT"
	// input[@id='lookuptxt_trx_type_D001MT']
	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement TRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen() {
		return TRXTypeInMaintenanceScreen;
	}

	// id="trs_ac_br_D001MT"
	@FindBy(xpath = "//*[@id='trs_ac_br_D001MT']")
	private WebElement CSM_BranchCodeInCreditAc;

	public WebElement CSMBranchCodeInCreditAc() {
		return CSM_BranchCodeInCreditAc;
	}

	// id="trs_ac_cy_D001MT"
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CY']")
	private WebElement CSM_CurrencyCodeCreditAc;

	public WebElement CSMCurrencyCodeCreditAc() {
		return CSM_CurrencyCodeCreditAc;
	}

	// id="trs_ac_gl_D001MT
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement CSM_GLCodeCreditAc;

	public WebElement CSMGLCodeCreditAc() {
		return CSM_GLCodeCreditAc;
	}
	// id="trs_ac_cif_D001MT

	// id="lookuptxt_trs_ac_sl_D001MT"
	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement CSM_SerialInCreditAc;

	public WebElement CSMSerialInCreditAc() {
		return CSM_SerialInCreditAc;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu;

	public WebElement CSMOkButtonInWarningPopUpMenu() {
		return CSM_OkButtonInWarningPopUpMenu;
	}
	// id="lookuptxt_trs_cy_D001MT"

	@FindBy(id = "amount_D001MT")
	private WebElement CSM_AmountInMaintenanceScreen;

	public WebElement CSMAmountInMaintenanceScreen() {
		return CSM_AmountInMaintenanceScreen;
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

	@FindBy(xpath = "//div[text()='Success']//following::div//following::div//child::div")
	private WebElement CSM_GetTheTransactionNo;

	public WebElement CSMGetTheTransactionNo() {
		return CSM_GetTheTransactionNo;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_DoubleClickOnTheTransactionNo;

	public WebElement CSMDoubleClickOnTheTransactionNo() {
		return CSM_DoubleClickOnTheTransactionNo;
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
	private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation() {
		return CSM_OkButtonInSuccessPopUpMenuForTranscation;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu;

	public WebElement CSMOkButtonInSuccessPopUpMenu() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}

	@FindBy(xpath = "//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Economic Sector: Limit Amount should be between 0.0  and 300')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement csm_transaction_warningpop_Economicsector_limitAmount;

	public WebElement csm_transaction_warningpop_Economicsector_limitAmount_118() {
		return csm_transaction_warningpop_Economicsector_limitAmount;
	}

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

	// (xpath="//td[text()='ANANDH']")

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

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement csmParam_User_Approvebttn;

	public WebElement csmParam_User_Approvebttn() {
		return csmParam_User_Approvebttn;
	}

	@FindBy(xpath = "//td[text()='7852']")
	private WebElement csmParam_User_Approve_Username_doubleclick2;

	public WebElement csmParam_User_Approve_Username_doubleclick2() {
		return csmParam_User_Approve_Username_doubleclick2;
	}

	// 029 param
	@FindBy(xpath = "//*[@id=\"transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE\"]")
	private WebElement csmParam_Transactiontype_inputfield;

	public WebElement csmParam_Transactiontype_inputfield() {
		return csmParam_Transactiontype_inputfield;
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

	@FindBy(xpath = "//a[@id='P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPAField;

	public WebElement csmParam_AccountParameters_AccountTypes_UPAField() {
		return csmParam_AccountParameters_AccountTypes_UPAField;
	}

	@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE']")
	private WebElement csmParam_AccountParameters_AccountTypes_update_after_approve_TypeCode;

	public WebElement csmParam_AccountParameters_AccountTypes_update_after_approve_TypeCode() {
		return csmParam_AccountParameters_AccountTypes_update_after_approve_TypeCode;
	}

	// (//td[text()='96145'])[1]
	// td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']
	@FindBy(xpath = "//table[@id='acctypeList_GridTbl_Id_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;

	public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick() {
		return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;
	}

	@FindBy(xpath = "//div[@id='instructionsColl_P017MA']")
	private WebElement csmParam_AccountParameters_AccountTypes_Instructions;

	public WebElement csmParam_AccountParameters_AccountTypes_Instructions() {
		return csmParam_AccountParameters_AccountTypes_Instructions;
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

//    				@FindBy(xpath = "//*[@id=\"transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE\"]")
//    				private WebElement csmParam_Transactiontype_inputfield ;
//    				public WebElement csmParam_Transactiontype_inputfield() {
//    				return csmParam_Transactiontype_inputfield;
//    				}
//    				

	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement csmParam_Transactiontype_inputfield_doubleclick;

	public WebElement csmParam_Transactiontype_inputfield_doubleclick() {
		return csmParam_Transactiontype_inputfield_doubleclick;
	}

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement csmParam_Transactiontype_Forceoverdrawn;

	public WebElement csmParam_Transactiontype_Forceoverdrawn() {
		return csmParam_Transactiontype_Forceoverdrawn;
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

	@FindBy(xpath = "(//input[@name='USER_ID'])[2]")
	private WebElement userIdInApproveScreen;

	public WebElement userIdInApproveScreen() {
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

	// confirmOkButton()

	// CSMOkButtonInAccessDeniedPopUpMenu

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

	// Vimal********************************************************************
	@FindBy(xpath = "//div[@id='_selenuim_CATEG_1']")
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

	@FindBy(xpath = "//input[@name='ctsRestrictionsVO.CODE']") // id="code_UR00M"
	private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance;

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

	@FindBy(id = "td_userGridId_UR00M_1_usrVO.USER_ID")
	private WebElement CSMSADS_UserIDName;

	public WebElement CSMSADSUserIDName() {
		return CSMSADS_UserIDName;
	}

	@FindBy(id = "jqg_userGridId_UR00M_1")
	private WebElement CSMSADS_UserIDCheckbox;

	public WebElement CSMSADSUserIDCheckbox() {
		return CSMSADS_UserIDCheckbox;
	}

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

	@FindBy(id = "spanLookup_COMP_CODE_P005M")
	private WebElement CSMSADS_CompanySearchButtonInEmployeeDetails;

	public WebElement CSMSADSCompanySearchButtonInEmployeeDetails() {
		return CSMSADS_CompanySearchButtonInEmployeeDetails;
	}

	@FindBy(id = "gridtab_COMP_CODE_P005M_gs_COMP_CODE")
	private WebElement CSMSADS_CompanyCodeInSearchBox;

	public WebElement CSMSADSCompanyCodeInSearchBox() {
		return CSMSADS_CompanyCodeInSearchBox;
	}

	@FindBy(id = "td_gridtab_COMP_CODE_P005M_1_COMP_CODE")
	private WebElement CSMSADS_DoubleClickOnTheCompanySearchedCode;

	public WebElement CSMSADSDoubleClickOnTheCompanySearchedCode() {
		return CSMSADS_DoubleClickOnTheCompanySearchedCode;
	}

	@FindBy(id = "spanLookup_BRANCH_CODE_P005M")
	private WebElement CSMSADS_BranchSearchButtonInEmployeeDetails;

	public WebElement CSMSADSBranchSearchButtonInEmployeeDetails() {
		return CSMSADS_BranchSearchButtonInEmployeeDetails;
	}

	@FindBy(id = "gridtab_BRANCH_CODE_P005M_gs_BRANCH_CODE")
	private WebElement CSMSADS_BranchCodeInSearchBox;

	public WebElement CSMSADSBranchCodeInSearchBox() {
		return CSMSADS_BranchCodeInSearchBox;
	}

	@FindBy(id = "td_gridtab_BRANCH_CODE_P005M_1_BRANCH_CODE")
	private WebElement CSMSADS_DoubleClickOnTheBranchSearchedCode;

	public WebElement CSMSADSDoubleClickOnTheBranchSearchedCode() {
		return CSMSADS_DoubleClickOnTheBranchSearchedCode;
	}

	@FindBy(id = "spanLookup_division_P005M")
	private WebElement CSMSADS_DivisionSearchButtonInEmployeeDetails;

	public WebElement CSMSADSDivisionSearchButtonInEmployeeDetails() {
		return CSMSADS_DivisionSearchButtonInEmployeeDetails;
	}

	@FindBy(id = "gridtab_division_P005M_gs_DIVISION_CODE")
	private WebElement CSMSADS_DivisionCodeInSearchBox;

	public WebElement CSMSADSDivisionCodeInSearchBox() {
		return CSMSADS_DivisionCodeInSearchBox;
	}

	@FindBy(id = "td_gridtab_division_P005M_1_DIVISION_CODE")
	private WebElement CSMSADS_DoubleClickOnTheDivisionSearchedCode;

	public WebElement CSMSADSDoubleClickOnTheDivisionSearchedCode() {
		return CSMSADS_DoubleClickOnTheDivisionSearchedCode;
	}

	@FindBy(id = "spanLookup_Departmnt_P005M")
	private WebElement CSMSADS_DepartmentSearchButtonInEmployeeDetails;

	public WebElement CSMSADSDepartmentSearchButtonInEmployeeDetails() {
		return CSMSADS_DepartmentSearchButtonInEmployeeDetails;
	}

	@FindBy(id = "gridtab_Departmnt_P005M_gs_DEPT_CODE")
	private WebElement CSMSADS_DepartmentCodeInSearchBox;

	public WebElement CSMSADSDepartmentCodeInSearchBox() {
		return CSMSADS_DepartmentCodeInSearchBox;
	}

	@FindBy(id = "td_gridtab_Departmnt_P005M_1_DEPT_CODE")
	private WebElement CSMSADS_DoubleClickOnTheDepartmentSearchedCode;

	public WebElement CSMSADSDoubleClickOnTheDepartmentSearchedCode() {
		return CSMSADS_DoubleClickOnTheDepartmentSearchedCode;
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

	// ******************************************* Approve User
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

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSMSADS_OkButtonInSuccessPopupInUserApprove;

	public WebElement CSMSADSOkButtonInSuccessPopupInUserApprove() {
		return CSMSADS_OkButtonInSuccessPopupInUserApprove;
	}

	// ******************************************* Transaction
	// *******************************************//

//    				"//label[@id='Application_Running_Date_key']//preceding::button"

	@FindBy(id = "amount_D001AU")
	private WebElement CSM_AmountValue;

	public WebElement CSMAmountValue() {
		return CSM_AmountValue;
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

	@FindBy(id = "td_statementOfAccountsDetGridTbl_Id_QUER001T_1_hstvo.OP_NO")
	private WebElement CSM_ValidateIfTheStatementOfAccountIsDisplayed;

	public WebElement CSMValidateIfTheStatementOfAccountIsDisplayed() {
		return CSM_ValidateIfTheStatementOfAccountIsDisplayed;
	}

	// ********************************************** No access to Economic sector
	// ********************************************

	@FindBy(xpath = "//span[text()='close']//parent::a")
	private WebElement CSM_CloseButtonInViewMemoPopupMenu;

	public WebElement CSMCloseButtonInViewMemoPopupMenu() {
		return CSM_CloseButtonInViewMemoPopupMenu;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_OkButtonInCannotProceedPopUpMenu;

	public WebElement CSMOkButtonInCannotProceedPopUpMenu() {
		return CSM_OkButtonInCannotProceedPopUpMenu;
	}

	@FindBy(xpath = "//div[contains(text(),'User Does Not have Access')]")
	private WebElement CSM_ValidateUserDoesNotHaveAcces;

	public WebElement CSMValidateUserDoesNotHaveAcces() {
		return CSM_ValidateUserDoesNotHaveAcces;
	}

	// ***************************************** No access to Currency
	// ***************************************

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_ClickOkButtonInCannotProceedPopupMenu;

	public WebElement CSMClickOkButtonInCannotProceedPopupMenu() {
		return CSM_ClickOkButtonInCannotProceedPopupMenu;
	}

	@FindBy(xpath = "//div[text()='User does not have rights to trade with selected Currency.: 144']")
	private WebElement CSM_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency;

	public WebElement CSM_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency() {
		return CSM_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency;
	}

	@FindBy(id = "lookuptxt_ctrl_sl_D001MT")
	private WebElement CSM_SerialValue;

	public WebElement CSMSerialValue() {
		return CSM_SerialValue;
	}

	// @TRS_10

	@FindBy(id = "trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_EnterTheTransactionNoInSearchBox;

	public WebElement CSMEnterTheTransactionNoInSearchBox() {
		return CSM_EnterTheTransactionNoInSearchBox;
	}

	@FindBy(id = "td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO")
	private WebElement CSM_DoubleClickOnTheSearchedTransactionNo;

	public WebElement CSMDoubleClickOnTheSearchedTransactionNo() {
		return CSM_DoubleClickOnTheSearchedTransactionNo;
	}

	@FindBy(id = "statementOfAccountsDetGridTbl_Id_QUER001T_gs_hstvo.OP_NO")
	private WebElement CSM_EnterTheOpNoInByTradeDateScreen;

	public WebElement CSMEnterTheOpNoInByTradeDateScreen() {
		return CSM_EnterTheOpNoInByTradeDateScreen;
	}

//    				@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_hstvo.OP_NO")
//    				private WebElement CSM_DoubleClickTheSearchedOpNo;
	//
//    				public WebElement CSMDoubleClickTheSearchedOpNo() {
//    					return CSM_DoubleClickTheSearchedOpNo;
//    				}

	@FindBy(id = "td_statementOfAccountsDetGridTbl_Id_QUER001T_1_transCvAmt")
	private WebElement CSM_ValidateTheCreditAmount;

	public WebElement CSMValidateTheCreditAmount() {
		return CSM_ValidateTheCreditAmount;
	}

	@FindBy(id = "trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodeDebitAc;

	public WebElement CSMCurrencyCodeDebitAc() {
		return CSM_CurrencyCodeDebitAc;
	}

	@FindBy(id = "trs_ac_gl_D001MT")
	private WebElement CSM_GLCodeDebitAc;

	public WebElement CSMGLCodeDebitAc() {
		return CSM_GLCodeDebitAc;
	}

	@FindBy(id = "trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInDebitAc;

	public WebElement CSMCIFCodeInDebitAc() {
		return CSM_CIFCodeInDebitAc;
	}

	@FindBy(id = "td_statementOfAccountsDetGridTbl_Id_QUER001T_1_transCvAmt")
	private WebElement CSM_ValidateTheDebitAmount;

	public WebElement CSM_ValidateTheDebitAmount() {
		return CSM_ValidateTheDebitAmount;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement csmParam_Transactiontype_proceedoninsufficentfunds;

	public WebElement csmParam_Transactiontype_proceedoninsufficentfunds() {
		return csmParam_Transactiontype_proceedoninsufficentfunds;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParam_ParametersUndercsmParamApplication;

	public WebElement csmParamParametersUndercsmParamApplication() {
		return csmParam_ParametersUndercsmParamApplication;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement csmParam_SystemParametersUnderParametersMainMenu;

	public WebElement csmParamSystemParametersUnderParametersMainMenu() {
		return csmParam_SystemParametersUnderParametersMainMenu;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement csmParam_TransactionTypeUnderSystemParameters;

	public WebElement csmParamTransactionTypeUnderSystemParameters() {
		return csmParam_TransactionTypeUnderSystemParameters;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement csmParam_UpdateAfterApproveInTransactionType;

	public WebElement csmParamUpdateAfterApproveInTransactionType() {
		return csmParam_UpdateAfterApproveInTransactionType;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE")
	private WebElement csmParam_EnterTheTrxTypeInCode;

	public WebElement csmParamEnterTheTrxTypeInCode() {
		return csmParam_EnterTheTrxTypeInCode;
	}

	@FindBy(id = "td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE")
	private WebElement csmParam_DoubleClickOnTheSearchedCode;

	public WebElement csmParamDoubleClickOnTheSearchedCode() {
		return csmParam_DoubleClickOnTheSearchedCode;
	}

	@FindBy(xpath = "//input[@id='multi_branch_P024MA']")
	private WebElement csmParam_CheckTheEnableMultiBranchFlag;

	public WebElement csmParamCheckTheEnableMultiBranchFlag() {
		return csmParam_CheckTheEnableMultiBranchFlag;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csmParam_UpdateAfterApproveButton;

	public WebElement csmParamUpdateAfterApproveButton() {
		return csmParam_UpdateAfterApproveButton;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_OkButtonInConfirmPopUpMenuInUpdateAfterApprove;

	public WebElement csmParamOkButtonInConfirmPopUpMenuInUpdateAfterApprove() {
		return csmParam_OkButtonInConfirmPopUpMenuInUpdateAfterApprove;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement csmParam_OkButtonInSuccessPopUpMenuInUpdateAfterApprove;

	public WebElement csmParamOkButtonInSuccessPopUpMenuInUpdateAfterApprove() {
		return csmParam_OkButtonInSuccessPopUpMenuInUpdateAfterApprove;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement csmParam_ApproveUnderTransactionType;

	public WebElement csmParamApproveUnderTransactionType() {
		return csmParam_ApproveUnderTransactionType;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE")
	private WebElement csmParam_TrxTypeInCodeUnderApproveScreen;

	public WebElement csmParam_TrxTypeInCodeUnderApproveScreen() {
		return csmParam_TrxTypeInCodeUnderApproveScreen;
	}

	@FindBy(id = "td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE")
	private WebElement csmParam_DoubleClickOnTheSearchedCodeInApproveScreen;

	public WebElement csmParamDoubleClickOnTheSearchedCodeInApproveScreen() {
		return csmParam_DoubleClickOnTheSearchedCodeInApproveScreen;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement csmParam_ApproveButtonInApproveScreen;

	public WebElement csmParamApproveButtonInApproveScreen() {
		return csmParam_ApproveButtonInApproveScreen;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_OkButtonInConfirmPopUpUnderApproveScreen;

	public WebElement csmParamOkButtonInConfirmPopUpUnderApproveScreen() {
		return csmParam_OkButtonInConfirmPopUpUnderApproveScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement csmParam_OkButtonInSuccessPopUpUnderApproveScreen;

	public WebElement csmParam_OkButtonInSuccessPopUpUnderApproveScreen() {
		return csmParam_OkButtonInSuccessPopUpUnderApproveScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen;

	public WebElement csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen() {
		return csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen;
	}

	@FindBy(id = "back_dated_vdate_P024MA")
	private WebElement csmParam_AllowBackDatedValueDateFlag;

	public WebElement csmParamAllowBackDatedValueDateFlag() {
		return csmParam_AllowBackDatedValueDateFlag;
	}

	@FindBy(id = "post_dated_vdate_P024MA")
	private WebElement csmParam_AllowPostDatedValueDateFlag;

	public WebElement csmParam_AllowPostDatedValueDateFlag() {
		return csmParam_AllowPostDatedValueDateFlag;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement csm_StopperMessageInCannotProceedPopUpMenu;

	public WebElement csmStopperMessageInCannotProceedPopUpMenu() {
		return csm_StopperMessageInCannotProceedPopUpMenu;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement csm_OkButtonInCannotProceedPopUpMenuInMaintenance;

	public WebElement csm_OkButtonInCannotProceedPopUpMenuInMaintenance() {
		return csm_OkButtonInCannotProceedPopUpMenuInMaintenance;
	}

	@FindBy(id = "amount_D001MT")
	private WebElement csm_AmountInMaintenanceScreen;

	public WebElement csmAmountInMaintenanceScreen() {
		return csm_AmountInMaintenanceScreen;
	}

	@FindBy(id = "value_date_D001MT")
	private WebElement csm_ValueDateInMaintenanceScreen;

	public WebElement csmValueDateInMaintenanceScreen() {
		return csm_ValueDateInMaintenanceScreen;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_TransactionUnderTheCSMApplication;

	public WebElement csmTransactionUnderTheCSMApplication() {
		return csm_TransactionUnderTheCSMApplication;
	}

	@FindBy(xpath = "//div//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement csm_TrxTypeUnderTheTransaction;

	public WebElement csmTrxTypeUnderTheTransaction() {
		return csm_TrxTypeUnderTheTransaction;
	}

	@FindBy(xpath = "//span[@id='spanLookup_trs_ac_sl_D001MT']")
	private WebElement csm_FirstAccountCheckUnderTheTransaction;

	public WebElement csmFirstAccountCheckUnderTheTransaction() {
		return csm_FirstAccountCheckUnderTheTransaction;
	}

	@FindBy(xpath = "//div//input[@name='amfVO.GL_CODE']")
	private WebElement csm_FirstAccountCheckGLCodeUnderTheTransaction;

	public WebElement csmFirstAccountCheckGLCodeUnderTheTransaction() {
		return csm_FirstAccountCheckGLCodeUnderTheTransaction;
	}

	@FindBy(xpath = "//tr//td[contains(text(),'312')]")
	private WebElement csm_FirstAccountCheckGLCodeSelectUnderTheTransaction;

	public WebElement csmFirstAccountCheckGLCodeSelectUnderTheTransaction() {
		return csm_FirstAccountCheckGLCodeSelectUnderTheTransaction;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement csm_CurrencyUnderTheTransaction;

	public WebElement csmCurrencyUnderTheTransaction() {
		return csm_CurrencyUnderTheTransaction;
	}

	@FindBy(xpath = "//span[@id='spanLookup_to_trs_ac_sl_D001MT']")
	private WebElement csm_SecondAccountCheckUnderTheTransaction;

	public WebElement csmSecondAccountCheckUnderTheTransaction() {
		return csm_SecondAccountCheckUnderTheTransaction;
	}

	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.GL_CODE']")
	private WebElement csm_SecondAccountCheckGLCodeUnderTheTransaction;

	public WebElement csmSecondAccountCheckGLCodeUnderTheTransaction() {
		return csm_SecondAccountCheckGLCodeUnderTheTransaction;
	}

	@FindBy(xpath = "//tr//td[contains(text(),'313')]")
	private WebElement csm_SecondAccountCheckGLCodeSelectUnderTheTransaction;

	public WebElement csmSecondAccountCheckGLCodeSelectUnderTheTransaction() {
		return csm_SecondAccountCheckGLCodeSelectUnderTheTransaction;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT'][@value='Submit']")
	private WebElement csm_SaveUnderTheTransaction;

	public WebElement csmSaveUnderTheTransaction() {
		return csm_SaveUnderTheTransaction;
	}

	@FindBy(xpath = "//input[@type='button'][@value='Ok']")
	private WebElement csm_WarningMessage;

	public WebElement csmWarningMessage() {
		return csm_WarningMessage;
	}

//    				Take the 3rd value as Transaction number

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement csm_TransactionNoPopupUnderTheTransaction;

	public WebElement csmTransactionNoPopupUnderTheTransaction() {
		return csm_TransactionNoPopupUnderTheTransaction;
	}

	@FindBy(xpath = "//input[@name='TRS_NO']")
	private WebElement csm_TransactionNoUnderTheApprove;

	public WebElement csmTransactionNoUnderTheApprove() {
		return csm_TransactionNoUnderTheApprove;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO'][@title='7600']")
	private WebElement csm_SelectTransactionNoUnderTheApprove;

	public WebElement csmSelectTransactionNoUnderTheApprove() {
		return csm_SelectTransactionNoUnderTheApprove;
	}

	@FindBy(xpath = "//*[text()='Approve']")
	private WebElement csm_ApproveUnderTheApprove;

	public WebElement csmApproveUnderTheApprove() {
		return csm_ApproveUnderTheApprove;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok'][@value='Ok']")
	private WebElement csm_ApproveSuccessUnderTheApprove;

	public WebElement csmApproveSuccessUnderTheApprove() {
		return csm_ApproveSuccessUnderTheApprove;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement csm_SearchUnderTheMaintenance;

	public WebElement csmSearchUnderTheMaintenance() {
		return csm_SearchUnderTheMaintenance;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO'][@title='7600']")
	private WebElement csm_SelectTransactionNoUnderTheMaintenance;

	public WebElement csmSelectTransactionNoUnderTheMaintenance() {
		return csm_SelectTransactionNoUnderTheMaintenance;
	}

	@FindBy(xpath = "//*[text()='Booked Entries ']")
	private WebElement csm_BookedEnteriesUnderTheMaintenance;

	public WebElement csmBookedEnteriesUnderTheMaintenance() {
		return csm_BookedEnteriesUnderTheMaintenance;
	}

	@FindBy(xpath = "//div//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
	private WebElement csm_FirstTransactionCurrencyUnderTheMaintenance;

	public WebElement csmFirstTransactionCurrencyUnderTheMaintenance() {
		return csm_FirstTransactionCurrencyUnderTheMaintenance;
	}

	@FindBy(xpath = "//div//input[@name='trxMgntCO.ctstrsVO.TRS_CY']")
	private WebElement csm_CurrencyCodeUnderTheMaintenance;

	public WebElement csmCurrencyCodeUnderTheMaintenance() {
		return csm_CurrencyCodeUnderTheMaintenance;
	}

	/*
	 * Queries screen
	 */

	@FindBy(xpath = "//*[text()='Queries']")
	private WebElement csm_Queries;

	public WebElement csmQueries() {
		return csm_Queries;
	}

	@FindBy(xpath = "//*[text()='Statement Of Accounts']")
	private WebElement csm_StatementOfAccountsUnderTheQueries;

	public WebElement csmStatementOfAccountsUnderTheQueries() {
		return csm_StatementOfAccountsUnderTheQueries;
	}

	@FindBy(xpath = "//*[text()='By Trade Date']")
	private WebElement csm_TradeByDateUnderTheQueries;

	public WebElement csmTradeByDateUnderTheQueries() {
		return csm_TradeByDateUnderTheQueries;
	}

	@FindBy(xpath = "//span[@id='spanLookup_accSl_QUER001T']")
	private WebElement csm_AccountSearchIconUnderTheTradeByDateUnderTheQueries;

	public WebElement csmAccountSearchIconUnderTheTradeByDateUnderTheQueries() {
		return csm_AccountSearchIconUnderTheTradeByDateUnderTheQueries;
	}

	@FindBy(xpath = "//input[@id='gridtab_accSl_QUER001T_gs_amfVO.GL_CODE']")
	private WebElement csm_GLCodeUnderTheTradeByDateUnderTheQueries;

	public WebElement csmGLCodeUnderTheTradeByDateUnderTheQueries() {
		return csm_GLCodeUnderTheTradeByDateUnderTheQueries;
	}

	@FindBy(xpath = "//td[@id='td_gridtab_accSl_QUER001T_1_amfVO.GL_CODE']")
	private WebElement csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries;

	public WebElement csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries() {
		return csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries;
	}

	@FindBy(xpath = "//label[@id='statementOfAccountsForm_QUER001T_Retrieve_key']")
	private WebElement csm_RetrieveButtonUnderTheTradeByDateUnderTheQueries;

	public WebElement csmRetrieveButtonUnderTheTradeByDateUnderTheQueries() {
		return csm_RetrieveButtonUnderTheTradeByDateUnderTheQueries;
	}

	@FindBy(xpath = "//td[@title='1110457']//parent::tr//td[@id='td_statementOfAccountsDetGridTbl_Id_QUER001T_2_transCvAmt']']")
	private WebElement csm_CVValueUnderTheTradeByDateUnderTheQueries;

	public WebElement csmCVValueUnderTheTradeByDateUnderTheQueries() {
		return csm_CVValueUnderTheTradeByDateUnderTheQueries;
	}

	@FindBy(xpath = "//div[@id='lookupid_trs_ac_sl_D001MT']")
	private WebElement csm_CreditAccountForDepositTransactionWithSameCurrency;

	public WebElement csmCreditAccountForDepositTransactionWithSameCurrency() {
		return csm_CreditAccountForDepositTransactionWithSameCurrency;
	}

	@FindBy(xpath = "//div//input[@id='trs_ac_gl_D001MT']")
	private WebElement csm_FirstAccountGLCodeUnderMaintenenanceTRX;

	public WebElement csmFirstAccountGLCodeUnderMaintenenanceTRX() {
		return csm_FirstAccountGLCodeUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//div//input[@id='trs_ac_cif_D001MT']")
	private WebElement csm_FirstAccountCIFCodeUnderMaintenenanceTRX;

	public WebElement csmFirstAccountCIFCodeUnderMaintenenanceTRX() {
		return csm_FirstAccountCIFCodeUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//div//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement csm_FirstAccountSerialNoUnderMaintenenanceTRX;

	public WebElement csmFirstAccountSerialNoUnderMaintenenanceTRX() {
		return csm_FirstAccountSerialNoUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//div//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement csm_CurrencyCodeForTRXUnderMaintenenanceTRX;

	public WebElement csmCurrencyCodeForTRXUnderMaintenenanceTRX() {
		return csm_CurrencyCodeForTRXUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//div//input[@id='amount_D001MT']")
	private WebElement csm_EnterAmountForTRXUnderMaintenenanceTRX;

	public WebElement csmEnterAmountForTRXUnderMaintenenanceTRX() {
		return csm_EnterAmountForTRXUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Account_details_key']")
	private WebElement csm_AccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_AccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement csm_AddRowUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmAddRowUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_AddRowUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR']")
	private WebElement csm_FirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmFirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_FirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR,account.CURRENCY_CODE:ctstrsACCDETVO.AC_CY,account.GL_CODE:ctstrsACCDETVO.AC_GL']")
	private WebElement csm_FirstAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmFirstAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_FirstAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR,account.CURRENCY_CODE:ctstrsACCDETVO.AC_CY,account.GL_CODE:ctstrsACCDETVO.AC_GL,account.CIF_SUB_NO:ctstrsACCDETVO.AC_CIF,criteria.trxType:lookuptxt_trx_type_D001MT,memoSC.optRef:trxmgnt_memoOptRef_D001MT']")
	private WebElement csm_FirstAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmFirstAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_FirstAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='trxMgntCO.ctstrsACCDETVO.AC_BR:ctstrsACCDETVO.AC_BR,trxMgntCO.ctstrsACCDETVO.AC_CY:ctstrsACCDETVO.AC_CY,trxMgntCO.ctstrsACCDETVO.AC_GL:ctstrsACCDETVO.AC_GL,trxMgntCO.ctstrsACCDETVO.AC_CIF:ctstrsACCDETVO.AC_CIF,trxMgntCO.ctstrsACCDETVO.AC_SL:ctstrsACCDETVO.AC_SL_lookuptxt,trxMgntCO.ctstrsVO.TRX_TYPE:lookuptxt_trx_type_D001MT,trxMgntCO.ctstrsVO.TRS_DATE:TRS_DATE_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CIF:trs_ac_cif_D001MT,trxMgntCO.ctstrsVO.TRSFR_METHOD:trsfr_method_D001MT,trxMgntCO.ctstrsVO.VALUE_DATE:value_date_D001MT,trxMgntCO.linkOpened:confirmVal_D001MT']")
	private WebElement csm_FirstAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmFirstAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_FirstAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='trxMgntCO.ctstrsACCDETVO.AC_BR:ctstrsACCDETVO.AC_BR,trxMgntCO.ctstrsACCDETVO.AC_CY:ctstrsACCDETVO.AC_CY,trxMgntCO.ctstrsACCDETVO.AC_GL:ctstrsACCDETVO.AC_GL,trxMgntCO.ctstrsACCDETVO.AC_CIF:ctstrsACCDETVO.AC_CIF,trxMgntCO.ctstrsACCDETVO.AC_SL:ctstrsACCDETVO.AC_SL_lookuptxt,trxMgntCO.ctstrsACCDETVO.FC_AMOUNT:ctstrsACCDETVO.FC_AMOUNT,trxMgntCO.trxMgntAccDetGrid:trxMgntAccDetGrid_D001MT,trxMgntCO.ctstrsVO.TRS_CY:lookuptxt_trs_cy_D001MT,trxMgntCO.ctstrsVO.TRS_AC_BR:trs_ac_br_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CY:trs_ac_cy_D001MT,trxMgntCO.ctstrsVO.TRS_AC_GL:trs_ac_gl_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CIF:trs_ac_cif_D001MT,trxMgntCO.ctstrsVO.TRS_AC_SL:lookuptxt_trs_ac_sl_D001MT,trxMgntCO.ctstrsVO.CH_AC_BR:ch_ac_br_D001MT,trxMgntCO.ctstrsVO.CH_AC_CY:ch_ac_cy_D001MT,trxMgntCO.ctstrsVO.CH_AC_GL:ch_ac_gl_D001MT,trxMgntCO.ctstrsVO.CH_AC_CIF:ch_ac_cif_D001MT,trxMgntCO.ctstrsVO.CH_AC_SL:lookuptxt_ch_ac_sl_D001MT,trxMgntCO.ctstrsVO.EXCHANGE_RATE:exchange_rate_D001MT,trxMgntCO.ctstrsVO.MULT_DIV_IND:mult_div_ind_D001MT,trxMgntCO.ctstrsVO.TRX_TYPE:lookuptxt_trx_type_D001MT,trxMgntCO.ctstrsVO.CASH_DEDUCT_IND:cash_deduct_ind_D001MT,trxMgntCO.ctstrsVO.TRSFR_METHOD:trsfr_method_D001MT,trxMgntCO.ctstrsVO.VALUE_DATE:value_date_D001MT,trxMgntCO.ctstrsVO.AMOUNT:amount_D001MT,trxMgntCO.ctstrsVO.TRS_AC_AMOUNT:trs_ac_amount_D001MT,_pageRef:pageRef_D001MT,iv_crud:ivcrud_D001MT']")
	private WebElement csm_FirstAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmFirstAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_FirstAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']")
	private WebElement csm_FirstAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmFirstAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_FirstAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "(//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR'])[2]")
	private WebElement csm_SecondAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmSecondAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_SecondAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR']")
	private WebElement csm_SecondAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmSecondAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_SecondAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR,account.CURRENCY_CODE:ctstrsACCDETVO.AC_CY,account.GL_CODE:ctstrsACCDETVO.AC_GL']")
	private WebElement csm_SecondAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmSecondAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_SecondAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR,account.CURRENCY_CODE:ctstrsACCDETVO.AC_CY,account.GL_CODE:ctstrsACCDETVO.AC_GL,account.CIF_SUB_NO:ctstrsACCDETVO.AC_CIF,criteria.trxType:lookuptxt_trx_type_D001MT,memoSC.optRef:trxmgnt_memoOptRef_D001MT']")
	private WebElement csm_SecondAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmSecondAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_SecondAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='trxMgntCO.ctstrsACCDETVO.AC_BR:ctstrsACCDETVO.AC_BR,trxMgntCO.ctstrsACCDETVO.AC_CY:ctstrsACCDETVO.AC_CY,trxMgntCO.ctstrsACCDETVO.AC_GL:ctstrsACCDETVO.AC_GL,trxMgntCO.ctstrsACCDETVO.AC_CIF:ctstrsACCDETVO.AC_CIF,trxMgntCO.ctstrsACCDETVO.AC_SL:ctstrsACCDETVO.AC_SL_lookuptxt,trxMgntCO.ctstrsVO.TRX_TYPE:lookuptxt_trx_type_D001MT,trxMgntCO.ctstrsVO.TRS_DATE:TRS_DATE_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CIF:trs_ac_cif_D001MT,trxMgntCO.ctstrsVO.TRSFR_METHOD:trsfr_method_D001MT,trxMgntCO.ctstrsVO.VALUE_DATE:value_date_D001MT,trxMgntCO.linkOpened:confirmVal_D001MT']")
	private WebElement csm_SecondAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmSecondAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_SecondAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@params='trxMgntCO.ctstrsACCDETVO.AC_BR:ctstrsACCDETVO.AC_BR,trxMgntCO.ctstrsACCDETVO.AC_CY:ctstrsACCDETVO.AC_CY,trxMgntCO.ctstrsACCDETVO.AC_GL:ctstrsACCDETVO.AC_GL,trxMgntCO.ctstrsACCDETVO.AC_CIF:ctstrsACCDETVO.AC_CIF,trxMgntCO.ctstrsACCDETVO.AC_SL:ctstrsACCDETVO.AC_SL_lookuptxt,trxMgntCO.ctstrsACCDETVO.FC_AMOUNT:ctstrsACCDETVO.FC_AMOUNT,trxMgntCO.trxMgntAccDetGrid:trxMgntAccDetGrid_D001MT,trxMgntCO.ctstrsVO.TRS_CY:lookuptxt_trs_cy_D001MT,trxMgntCO.ctstrsVO.TRS_AC_BR:trs_ac_br_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CY:trs_ac_cy_D001MT,trxMgntCO.ctstrsVO.TRS_AC_GL:trs_ac_gl_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CIF:trs_ac_cif_D001MT,trxMgntCO.ctstrsVO.TRS_AC_SL:lookuptxt_trs_ac_sl_D001MT,trxMgntCO.ctstrsVO.CH_AC_BR:ch_ac_br_D001MT,trxMgntCO.ctstrsVO.CH_AC_CY:ch_ac_cy_D001MT,trxMgntCO.ctstrsVO.CH_AC_GL:ch_ac_gl_D001MT,trxMgntCO.ctstrsVO.CH_AC_CIF:ch_ac_cif_D001MT,trxMgntCO.ctstrsVO.CH_AC_SL:lookuptxt_ch_ac_sl_D001MT,trxMgntCO.ctstrsVO.EXCHANGE_RATE:exchange_rate_D001MT,trxMgntCO.ctstrsVO.MULT_DIV_IND:mult_div_ind_D001MT,trxMgntCO.ctstrsVO.TRX_TYPE:lookuptxt_trx_type_D001MT,trxMgntCO.ctstrsVO.CASH_DEDUCT_IND:cash_deduct_ind_D001MT,trxMgntCO.ctstrsVO.TRSFR_METHOD:trsfr_method_D001MT,trxMgntCO.ctstrsVO.VALUE_DATE:value_date_D001MT,trxMgntCO.ctstrsVO.AMOUNT:amount_D001MT,trxMgntCO.ctstrsVO.TRS_AC_AMOUNT:trs_ac_amount_D001MT,_pageRef:pageRef_D001MT,iv_crud:ivcrud_D001MT']")
	private WebElement csm_SecondAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmSecondAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_SecondAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//*[text()='ok']")
	private WebElement csm_ClickOKUnderAccuntDetailsLabelUnderMaintenenanceTRX;

	public WebElement csmClickOKUnderAccuntDetailsLabelUnderMaintenenanceTRX() {
		return csm_ClickOKUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//*[text()='ok']")
	private WebElement csm_ClickOKUnderMaintenanceTRX;

	public WebElement csmClickOKUnderMaintenanceTRX() {
		return csm_ClickOKUnderMaintenanceTRX;
	}

	@FindBy(xpath = "//input[@id='branch_code_D001MT']")
	private WebElement csm_BranchCodeForCurrencyUnderMaintenanceTRX;

	public WebElement csmBranchCodeForCurrencyUnderMaintenanceTRX() {
		return csm_BranchCodeForCurrencyUnderMaintenanceTRX;
	}

	@FindBy(xpath = "//input[@id='ctrl_cy_D001MT']")
	private WebElement csm_CurrencyCodeForCurrencyUnderMaintenanceTRX;

	public WebElement csmCurrencyCodeForCurrencyUnderMaintenanceTRX() {
		return csm_CurrencyCodeForCurrencyUnderMaintenanceTRX;
	}

	@FindBy(xpath = "//input[@id='ctrl_gl_D001MT']")
	private WebElement csm_GLCodeForCurrencyUnderMaintenanceTRX;

	public WebElement csmGLCodeForCurrencyUnderMaintenanceTRX() {
		return csm_GLCodeForCurrencyUnderMaintenanceTRX;
	}

	@FindBy(xpath = "//input[@id='ctrl_cif_D001MT']")
	private WebElement csm_CIFCodeForCurrencyUnderMaintenanceTRX;

	public WebElement csmCIFCodeForCurrencyUnderMaintenanceTRX() {
		return csm_CIFCodeForCurrencyUnderMaintenanceTRX;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_ctrl_sl_D001MT']")
	private WebElement csm_SICodeForCurrencyUnderMaintenanceTRX;

	public WebElement csmSICodeForCurrencyUnderMaintenanceTRX() {
		return csm_SICodeForCurrencyUnderMaintenanceTRX;
	}

	@FindBy(xpath = "(//input[@id='_popup_path_sol_ok'])[2]")
	private WebElement csm_ConcurrentPopUp;

	public WebElement csmConcurrentPopUp() {
		return csm_ConcurrentPopUp;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csm_ClickOnParametersUnderCSMParams;

	public WebElement csmClickOnParametersUnderCSMParams() {
		return csm_ClickOnParametersUnderCSMParams;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement csm_SecondAccountBranchCodeUnderMaintenenanceTRX;

	public WebElement csmSecondAccountBranchCodeUnderMaintenenanceTRX() {
		return csm_SecondAccountBranchCodeUnderMaintenenanceTRX;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement csm_SecondAccountGLCodeUnderMaintenenanceTRX;

	public WebElement csmSecondAccountGLCodeUnderMaintenenanceTRX() {
		return csm_SecondAccountGLCodeUnderMaintenenanceTRX;
	}

	// Gowri**********************************************************@FindBy(xpath
	// = "//td[@title='Add new row']//span[@class='ui-icon ui-icon-plus']")
	private WebElement csmCommon_GridAddButton_615;

	public WebElement csmCommon_GridAddButton_615() {
		return csmCommon_GridAddButton_615;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csm_QuitOkButton_615;

	public WebElement csm_QuitOkButton_615() {
		return csm_QuitOkButton_615;
	}

	@FindBy(xpath = "//div[contains(text(),'Confirm Delete Process')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csm_Delete_ConfirmationOkButton_615;

	public WebElement csm_Delete_ConfirmationOkButton_615() {
		return csm_Delete_ConfirmationOkButton_615;
	}

	@FindBy(xpath = "//legend[text()='  Force logout   ']")
	private WebElement ForceLogoutPopup;

	public WebElement ForceLogoutPopup() {
		return ForceLogoutPopup;
	}

	@FindBy(xpath = "//span[text()=' Yes']")
	private WebElement ForceLogoutYes;

	public WebElement ForceLogoutYes() {
		return ForceLogoutYes;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement Transactions;

	public WebElement Transactions() {
		return Transactions;
	}

	@FindBy(xpath = "//a[@id='D001MT']//span[text()='Maintenance']")
	private WebElement Maintenance;

	public WebElement Maintenance() {
		return Maintenance;
	}

	@FindBy(xpath = "//label[text()='TRX Type ']/parent::td/following-sibling::td[1]//input")
	private WebElement TransactionsTrxType;

	public WebElement TransactionsTrxType() {
		return TransactionsTrxType;
	}

	@FindBy(xpath = "//a[text()='Transactions / Maintenance']")
	private WebElement TrxMaintance;

	public WebElement TrxMaintance() {
		return TrxMaintance;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[3]")
	private WebElement BranchCode;

	public WebElement BranchCode() {
		return BranchCode;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[4]")
	private WebElement CurrencyCode;

	public WebElement CurrencyCode() {
		return CurrencyCode;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[5]")
	private WebElement GlCode;

	public WebElement Glcode() {
		return GlCode;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[6]")
	private WebElement CifCode;

	public WebElement CifCode() {
		return CifCode;
	}

	@FindBy(xpath = "//div[text()='WARNING']/parent::div/following-sibling::div/div")
	private WebElement WarningMessage;

	public WebElement WarningMessage() {
		return WarningMessage;
	}

	@FindBy(xpath = "(//input[@value='Ok'])[2]")
	private WebElement WarningMessagePopupOk;

	public WebElement WarningMessagePopupOk() {
		return WarningMessagePopupOk;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//input)[7]")
	private WebElement SerialNo;

	public WebElement SerialNo() {
		return SerialNo;
	}

	@FindBy(xpath = "(//label[text()='Credit A/C ']/ancestor::td[1]//span[@role='button'])[1]")
	private WebElement CreditAccountSearchIcon;

	public WebElement CreditAccountSearchIcon() {
		return CreditAccountSearchIcon;
	}

	@FindBy(xpath = "//div[text()='Access Denied']/parent::div/following-sibling::div/div")
	private WebElement AccessDeniedPopup;

	public WebElement AccessDeniedPopup() {
		return AccessDeniedPopup;
	}

	@FindBy(xpath = "(//input[@value='Ok'])[2]")
	private WebElement AccessDeniedPopupOk;

	public WebElement AccessDeniedPopupOk() {
		return AccessDeniedPopupOk;
	}

	@FindBy(xpath = "//label[text()='Log Out ']")
	private WebElement LogoutButton;

	public WebElement LogoutButton() {
		return LogoutButton;
	}

	@FindBy(xpath = "//div[text()='Cannot proceed']/parent::div/following-sibling::div/div")
	private WebElement csm_Transactions_ExchangeRate_ValidationPopup;

	public WebElement csm_Transactions_ExchangeRate_ValidationPopup() {
		return csm_Transactions_ExchangeRate_ValidationPopup;
	}

	@FindBy(id = "inverseExchangeRate_D001MT")
	private WebElement csm_Transactions_ExchangeRate_InputField;

	public WebElement csm_Transactions_ExchangeRate_InputField() {
		return csm_Transactions_ExchangeRate_InputField;
	}

	@FindBy(xpath = "//span[text()='Reverse']")
	private WebElement csm_Transactions_ReverseTab;

	public WebElement csm_Transactions_ReverseTab() {
		return csm_Transactions_ReverseTab;
	}

	@FindBy(xpath = "//td[text()='Clear']")
	private WebElement csm_Transactions_ReverseTab_ClearIcon;

	public WebElement csm_Transactions_ReverseTab_ClearIcon() {
		return csm_Transactions_ReverseTab_ClearIcon;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValue;

	public WebElement Transactions_transactionNo_codeValue() {
		return Transactions_transactionNo_codeValue;
	}

	@FindBy(xpath = "//span[text()='Reverse']//parent::a")
	private WebElement Transaction_ReverseField;

	public WebElement Transaction_ReverseField() {
		return Transaction_ReverseField;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001WV_gs_ctstrsVO.TRS_NO']")
	private WebElement Transaction_ReverseField_TransactionnoInputField;

	public WebElement Transaction_ReverseField_TransactionnoInputField() {
		return Transaction_ReverseField_TransactionnoInputField;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001WV']")
	private WebElement Transaction_ReverseField_TransactionnoInputField_doubleclick;

	public WebElement Transaction_ReverseField_TransactionnoInputField_doubleclick() {
		return Transaction_ReverseField_TransactionnoInputField_doubleclick;
	}

	@FindBy(xpath = "//select[@id='holdReason_D001WV']")
	private WebElement Transaction_ReverseField_TransactionnoInputField_doubleclick_reason;

	public WebElement Transaction_ReverseField_TransactionnoInputField_doubleclick_reason() {
		return Transaction_ReverseField_TransactionnoInputField_doubleclick_reason;
	}

	@FindBy(xpath = "//button[@id='trxMgntToReverseBtn_D001WV']")
	private WebElement Transaction_ReverseField_TransactionnoInputField_doubleclick_reason_TOReversebutton;

	public WebElement Transaction_ReverseField_TransactionnoInputField_doubleclick_reason_TOReversebutton() {
		return Transaction_ReverseField_TransactionnoInputField_doubleclick_reason_TOReversebutton;
	}

	@FindBy(xpath = "//span[text()='Approve Reverse']//parent::a")
	private WebElement Transaction_ApproveReverseField;

	public WebElement Transaction_ApproveReverseField() {
		return Transaction_ApproveReverseField;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RV_gs_ctstrsVO.TRS_NO']")
	private WebElement Transaction_ApproveReverseField_TransactionNo;

	public WebElement Transaction_ApproveReverseField_TransactionNo() {
		return Transaction_ApproveReverseField_TransactionNo;
	}

	@FindBy(xpath = "//table[@id='trxMgntGridTbl_Id_D001RV']")
	private WebElement Transaction_ApproveReverseField_TransactionNo_doubleClick;

	public WebElement Transaction_ApproveReverseField_TransactionNo_doubleClick() {
		return Transaction_ApproveReverseField_TransactionNo_doubleClick;
	}

	@FindBy(xpath = "//button[@id='trxMgntReverseBtn_D001RV']")
	private WebElement Transaction_ApproveReverseField_TransactionNo_doubleClick_ApproveReversbtn;

	public WebElement Transaction_ApproveReverseField_TransactionNo_doubleClick_ApproveReversbtn() {
		return Transaction_ApproveReverseField_TransactionNo_doubleClick_ApproveReversbtn;
	}

	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement BMUser_Alert_EnterTRXNo;

	public WebElement BMUserAlertEnterTRXNo() {
		return BMUser_Alert_EnterTRXNo;
	}

	@FindBy(id = "exch_rate_update_warn_msg_yn_P024MA")
	private WebElement csm_Param_TransactionType_ExchangeRate_Flag;

	public WebElement csm_Param_TransactionType_ExchangeRate_Flag() {
		return csm_Param_TransactionType_ExchangeRate_Flag;
	}

	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement csm_Transactions_CancelScreen;

	public WebElement csm_Transactions_CancelScreen() {
		return csm_Transactions_CancelScreen;
	}

	@FindBy(name = "TRS_NO")
	private WebElement csm_Transactions_CancelScreen_TrxNo;

	public WebElement csm_Transactions_CancelScreen_TrxNo() {
		return csm_Transactions_CancelScreen_TrxNo;
	}

	@FindBy(id = "td_trxMgntGridTbl_Id_D001ZN_1_ctstrsVO.TRS_NO")
	private WebElement csm_Transactions_CancelScreen_DoubleClick;

	public WebElement csm_Transactions_CancelScreen_DoubleClick() {
		return csm_Transactions_CancelScreen_DoubleClick;
	}

	@FindBy(name = "trxMgntCO.ctstrsVO.VOID_REASON")
	private WebElement csm_Transactions_CancelScreen_ReasonInput;

	public WebElement csm_Transactions_CancelScreen_ReasonInput() {
		return csm_Transactions_CancelScreen_ReasonInput;
	}

	@FindBy(xpath = "(//span[contains(text(),'Cancel')])[4]")
	private WebElement csm_Transactions_CancelScreen_CancelButton;

	public WebElement csm_Transactions_CancelScreen_CancelButton() {
		return csm_Transactions_CancelScreen_CancelButton;
	}

	@FindBy(xpath = "//span[text()='Approve Cancel']")
	private WebElement csm_Transactions_ApproveCancelScreen;

	public WebElement csm_Transactions_ApproveCancelScreen() {
		return csm_Transactions_ApproveCancelScreen;
	}

	@FindBy(id = "td_trxMgntGridTbl_Id_D001CN_1_ctstrsVO.TRS_NO")
	private WebElement csm_Transactions_ApproveCancelScreen_DoubleClickData;

	public WebElement csm_Transactions_ApproveCancelScreen_DoubleClickData() {
		return csm_Transactions_ApproveCancelScreen_DoubleClickData;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve Cancel ')]")
	private WebElement csm_Transactions_ApproveCancelScreen_ApproveCancelButton;

	public WebElement csm_Transactions_ApproveCancelScreen_ApproveCancelButton() {
		return csm_Transactions_ApproveCancelScreen_ApproveCancelButton;
	}

	@FindBy(id = "infoBarSearchButton_D001MT")
	private WebElement csm_Transactions_SearchIcon;

	public WebElement csm_Transactions_SearchIcon() {
		return csm_Transactions_SearchIcon;
	}

	@FindBy(xpath = "//td[text()='Accounts Parameters']")
	private WebElement csm_Params_AccountParameters;

	public WebElement csm_Params_AccountParameters() {
		return csm_Params_AccountParameters;
	}

	@FindBy(xpath = "//td[text()='JV Type']")
	private WebElement csm_Params_JvType;

	public WebElement csm_Params_JvType() {
		return csm_Params_JvType;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement csm_Params_JvType_Maintenance;

	public WebElement csm_Params_JvType_Maintenance() {
		return csm_Params_JvType_Maintenance;
	}

	@FindBy(xpath = "//a[contains(text(),'Search')]")
	private WebElement csm_Params_JvType_Maintenance_SearchIcon;

	public WebElement csm_Params_JvType_Maintenance_SearchIcon() {
		return csm_Params_JvType_Maintenance_SearchIcon;
	}

	@FindBy(name = "TYPE_CODE")
	private WebElement csm_Params_JvType_Maintenance_JvTypeInput;

	public WebElement csm_Params_JvType_Maintenance_JvTypeInput() {
		return csm_Params_JvType_Maintenance_JvTypeInput;
	}

	@FindBy(xpath = "//td[@tdlabel='JV Type']")
	private WebElement csm_Params_JvType_DoubleClickData;

	public WebElement csm_Params_JvType_DoubleClickData() {
		return csm_Params_JvType_DoubleClickData;
	}

	@FindBy(xpath = "//label[text()='update_account_last_transaction_date_key ']//ancestor::tr/child::td//input[1]")
	private WebElement csm_Params_JvType_LastTransactionDate_Flag;

	public WebElement csm_Params_JvType_LastTransactionDate_Flag() {
		return csm_Params_JvType_LastTransactionDate_Flag;
	}

	@FindBy(id = "jvTypesParamMaint_FormId_P016MT_update_key")
	private WebElement csm_Params_JvType_UpdateButton;

	public WebElement csm_Params_JvType_UpdateButton() {
		return csm_Params_JvType_UpdateButton;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csm_Params_JvType_ConfirmOkButton;

	public WebElement csm_Params_JvType_ConfirmOkButton() {
		return csm_Params_JvType_ConfirmOkButton;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement csm_Params_JvType_SuccessOkButton;

	public WebElement csm_Params_JvType_SuccessOkButton() {
		return csm_Params_JvType_SuccessOkButton;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.JV_TYPE")
	private WebElement csm_Params_SystemParameters_TransactionType_JvType_InputField;

	public WebElement csm_Params_SystemParameters_TransactionType_JvType_InputField() {
		return csm_Params_SystemParameters_TransactionType_JvType_InputField;
	}

	@FindBy(id = "td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE")
	private WebElement csm_Params_SystemParameters_TransactionType_DoubleClick_Code;

	public WebElement csm_Params_SystemParameters_TransactionType_DoubleClick_Code() {
		return csm_Params_SystemParameters_TransactionType_DoubleClick_Code;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE")
	private WebElement csm_Params_SystemParameters_Approve_TrxNo;

	public WebElement csm_Params_SystemParameters_Approve_TrxNo() {
		return csm_Params_SystemParameters_Approve_TrxNo;
	}

	@FindBy(id = "td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE")
	private WebElement csm_Params_SystemParameters_Approve_DoubleclickCode;

	public WebElement csm_Params_SystemParameters_Approve_DoubleclickCode() {
		return csm_Params_SystemParameters_Approve_DoubleclickCode;
	}

	@FindBy(xpath = "//input[@id='show_jvref_in_trs_P024MA']")
	private WebElement csm_Params_Systemparameters_TransactionType_RandomClick;

	public WebElement csm_Params_Systemparameters_TransactionType_RandomClick() {
		return csm_Params_Systemparameters_TransactionType_RandomClick;
	}

	@FindBy(xpath = "//label[text()='Booked Entries ']")
	private WebElement csm_Transactions_Maintenance_BookedEntriesButton;

	public WebElement csm_Transactions_Maintenance_BookedEntriesButton() {
		return csm_Transactions_Maintenance_BookedEntriesButton;
	}

	@FindBy(xpath = "//label[text()='Account Details ']")
	private WebElement csm_Transactions_Maintenance_AccountDetailsButton;

	public WebElement csm_Transactions_Maintenance_AccountDetailsButton() {
		return csm_Transactions_Maintenance_AccountDetailsButton;
	}

	@FindBy(id = "add_trxMgntAccountDtlGridTbl_Id_D001MT")
	private WebElement csm_Transactions_Maintenance_AccountDetails_PlusIcon;

	public WebElement csm_Transactions_Maintenance_AccountDetails_PlusIcon() {
		return csm_Transactions_Maintenance_AccountDetails_PlusIcon;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR")
	private WebElement csm_Transactions_Maintenance_AccountDetails_Branch;

	public WebElement csm_Transactions_Maintenance_AccountDetails_Branch() {
		return csm_Transactions_Maintenance_AccountDetails_Branch;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR")
	private WebElement csm_Transactions_Maintenance_AccountDetails_BranchInput;

	public WebElement csm_Transactions_Maintenance_AccountDetails_BranchInput() {
		return csm_Transactions_Maintenance_AccountDetails_BranchInput;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL")
	private WebElement csm_Transactions_Maintenance_AccountDetails_GlInput;

	public WebElement csm_Transactions_Maintenance_AccountDetails_GlInput() {
		return csm_Transactions_Maintenance_AccountDetails_GlInput;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF")
	private WebElement csm_Transactions_Maintenance_AccountDetails_CifInput;

	public WebElement csm_Transactions_Maintenance_AccountDetails_CifInput() {
		return csm_Transactions_Maintenance_AccountDetails_CifInput;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF")
	private WebElement csm_Transactions_Maintenance_AccountDetails_SerialNoInput;

	public WebElement csm_Transactions_Maintenance_AccountDetails_SerialNoInput() {
		return csm_Transactions_Maintenance_AccountDetails_SerialNoInput;
	}

	@FindBy(xpath = "(//input[@role='textbox'])[6]")
	private WebElement csm_Transactions_Maintenance_AccountDetails_AmountInput;

	public WebElement csm_Transactions_Maintenance_AccountDetails_AmountInput() {
		return csm_Transactions_Maintenance_AccountDetails_AmountInput;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS1")
	private WebElement csm_Transactions_Maintenance_AcccountDetails_InstructionsInput1;

	public WebElement csm_Transactions_Maintenance_AcccountDetails_InstructionsInput1() {
		return csm_Transactions_Maintenance_AcccountDetails_InstructionsInput1;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS2")
	private WebElement csm_Transactions_Maintenance_AcccountDetails_InstructionsInput2;

	public WebElement csm_Transactions_Maintenance_AcccountDetails_InstructionsInput2() {
		return csm_Transactions_Maintenance_AcccountDetails_InstructionsInput2;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR")
	private WebElement csm_Transactions_Maintenance_AccountDetails_AnotherBranch;

	public WebElement csm_Transactions_Maintenance_AccountDetails_AnotherBranch() {
		return csm_Transactions_Maintenance_AccountDetails_AnotherBranch;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR")
	private WebElement csm_Transactions_Maintenance_AccountDetails_BranchInput2;

	public WebElement csm_Transactions_Maintenance_AccountDetails_BranchInput2() {
		return csm_Transactions_Maintenance_AccountDetails_BranchInput2;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL")
	private WebElement csm_Transactions_Maintenance_AccountDetails_GlInput2;

	public WebElement csm_Transactions_Maintenance_AccountDetails_GlInput2() {
		return csm_Transactions_Maintenance_AccountDetails_GlInput2;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF")
	private WebElement csm_Transactions_Maintenance_AccountDetails_CifInput2;

	public WebElement csm_Transactions_Maintenance_AccountDetails_CifInput2() {
		return csm_Transactions_Maintenance_AccountDetails_CifInput2;
	}

	@FindBy(name = "lookupTxt_ctstrsACCDETVO.AC_SL")
	private WebElement csm_Transactions_Maintenance_AccountDetails_SerialNoInput2;

	public WebElement csm_Transactions_Maintenance_AccountDetails_SerialNoInput2() {
		return csm_Transactions_Maintenance_AccountDetails_SerialNoInput2;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.FC_AMOUNT")
	private WebElement csm_Transactions_Maintenance_AccountDetails_AmountInput2;

	public WebElement csm_Transactions_Maintenance_AccountDetails_AmountInput2() {
		return csm_Transactions_Maintenance_AccountDetails_AmountInput2;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS1")
	private WebElement csm_Transactions_Maintenance_AccountDetails_Instructions1Input2;

	public WebElement csm_Transactions_Maintenance_AccountDetails_Instructions1Input2() {
		return csm_Transactions_Maintenance_AccountDetails_Instructions1Input2;
	}

	@FindBy(id = "td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS2")
	private WebElement csm_Transactions_Maintenance_AccountDetails_Instructions2Input2;

	public WebElement csm_Transactions_Maintenance_AccountDetails_Instructions2Input2() {
		return csm_Transactions_Maintenance_AccountDetails_Instructions2Input2;
	}

	@FindBy(xpath = "//span[text()='ok']")
	private WebElement csm_Transactions_AccountDetails_OkButton;

	public WebElement csm_Transactions_AccountDetails_OkButton() {
		return csm_Transactions_AccountDetails_OkButton;
	}

	@FindBy(xpath = "//a[text()=' Additional Details ']")
	private WebElement csm_Param_ControlRecord_AdditionalDetails;

	public WebElement csm_Param_ControlRecord_AdditionalDetails() {
		return csm_Param_ControlRecord_AdditionalDetails;
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

	@FindBy(xpath = "//td[text()='User']")
	private WebElement userSubMenu;

	public WebElement userSubMenu() {
		return userSubMenu;
	}

	@FindBy(xpath = "//td[text()='Populate User']")
	private WebElement populateUserSubMenu;

	public WebElement populateUserSubMenu() {
		return populateUserSubMenu;
	}

	@FindBy(xpath = "(//span[text()='Maintenance'])[2]")
	private WebElement maintenanceInPopulateUserSubMenu;

	public WebElement maintenanceInPopulateUserSubMenu() {
		return maintenanceInPopulateUserSubMenu;
	}

	@FindBy(xpath = "//label[@id='lbl_userFormId_0_E000POMT']//parent::td//following-sibling::td[1]//input")
	private WebElement codeInMaintenanceSubMenu;

	public WebElement codeInMaintenanceSubMenu() {
		return codeInMaintenanceSubMenu;
	}

	@FindBy(xpath = "//label[@id='lbl_userFormId_3_E000POMT']//parent::td//following-sibling::td/input")
	private WebElement briefDescriptionInMaintenanceSubMenu;

	public WebElement briefDescriptionInMaintenanceSubMenu() {
		return briefDescriptionInMaintenanceSubMenu;
	}

	@FindBy(xpath = "//label[@id='lbl_userFormId_4_E000POMT']//parent::td//following-sibling::td/input")
	private WebElement longDescriptionInMaintenanceSubMenu;

	public WebElement longDescriptionInMaintenanceSubMenu() {
		return longDescriptionInMaintenanceSubMenu;
	}

	@FindBy(xpath = "//input[@name='populatetellerCO.ctstellerPopulateVO.BRIEF_NAME_ARAB']")
	private WebElement briefDescriptionInArabic;

	public WebElement briefDescriptionInArabic() {
		return briefDescriptionInArabic;
	}

	@FindBy(xpath = "//input[@name='populatetellerCO.ctstellerPopulateVO.LONG_NAME_ARAB']")
	private WebElement longDescriptionInArabic;

	public WebElement longDescriptionInArabic() {
		return longDescriptionInArabic;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_teller_code_E000POMT']")
	private WebElement userCodeInMaintenanceSubMenu;

	public WebElement userCodeInMaintenanceSubMenu() {
		return userCodeInMaintenanceSubMenu;
	}

	@FindBy(xpath = "//td[@id='add_tab2_GridTbl_Id_E000POMT']")
	private WebElement addIconInMaintenanceSubMenu;

	public WebElement addIconInMaintenanceSubMenu() {
		return addIconInMaintenanceSubMenu;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerPopulateBranchesVO.DESTINATION_BRANCH_CODE']")
	private WebElement branchCodeField;

	public WebElement branchCodeField() {
		return branchCodeField;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerPopulateBranchesVO.TMPL_CODE']")
	private WebElement newUserTemplateField;

	public WebElement newUserTemplateField() {
		return newUserTemplateField;
	}

	@FindBy(xpath = "//label[@id='populateTellerMaint_FormId_E000POMT_Save_key']")
	private WebElement saveButtonInPopulateSubMenu;

	public WebElement saveButtonInPopulateSubMenu() {
		return saveButtonInPopulateSubMenu;
	}

	@FindBy(xpath = "//div[text()='Confirm Save Process']")
	private WebElement confirmMessagePopup;

	public WebElement confirmMessagePopup() {
		return confirmMessagePopup;
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

	@FindBy(id = "E000POP")
	private WebElement approveScreenInPopulateUser;

	public WebElement approveScreenInPopulateUser() {
		return approveScreenInPopulateUser;
	}

	@FindBy(id = "populateTellerList_GridTbl_Id_E000POP_gs_ctstellerPopulateVO.TELLER_POPULATION_CODE")
	private WebElement chequeCodeInApproveScreen;

	public WebElement chequeCodeInApproveScreen() {
		return chequeCodeInApproveScreen;
	}

	@FindBy(id = "td_populateTellerList_GridTbl_Id_E000POP_1_ctstellerPopulateVO.TELLER_POPULATION_CODE")
	private WebElement retrieveRecordInApproveScreen;

	public WebElement retrieveRecordInApproveScreen() {
		return retrieveRecordInApproveScreen;
	}

	@FindBy(id = "populateTellerMaint_FormId_E000POP_Approve_key")
	private WebElement approveButton;

	public WebElement approveButton() {
		return approveButton;
	}

	@FindBy(xpath = "//span[text()='Populate']")
	private WebElement populateScreenInPopulateUser;

	public WebElement populateScreenInPopulateUser() {
		return populateScreenInPopulateUser;
	}

	@FindBy(id = "populateTellerList_GridTbl_Id_E000POPO_gs_ctstellerPopulateVO.TELLER_POPULATION_CODE")
	private WebElement chequeCodeInPopulateScreen;

	public WebElement chequeCodeInPopulateScreen() {
		return chequeCodeInPopulateScreen;
	}

	@FindBy(id = "td_populateTellerList_GridTbl_Id_E000POPO_1_ctstellerPopulateVO.TELLER_POPULATION_CODE")
	private WebElement retrieveRecordInPopulateScreen;

	public WebElement retrieveRecordInPopulateScreen() {
		return retrieveRecordInPopulateScreen;
	}

	@FindBy(id = "populateTellerMaint_FormId_E000POPO_Populate_key")
	private WebElement populateButton;

	public WebElement populateButton() {
		return populateButton;
	}

	@FindBy(xpath = "//label[text()='Log Out ']")
	private WebElement logoutButtonInCsmParamsApplication;

	public WebElement logoutButtonInCsmParamsApplication() {
		return logoutButtonInCsmParamsApplication;
	}

	@FindBy(xpath = "(//span[@role='button'])[2]")
	private WebElement searchIconForBranchField;

	public WebElement searchIconForBranchField() {
		return searchIconForBranchField;
	}

	@FindBy(id = "//input[@name='BRANCH_CODE']")
	private WebElement branchCodeIcon;

	public WebElement branchCodeIcon() {
		return branchCodeIcon;
	}

	@FindBy(xpath = "(//td[@tdlabel='Branch Code'])[2]")
	private WebElement doubleClkTheRecord;

	public WebElement doubleClkTheRecord() {
		return doubleClkTheRecord;
	}

	@FindBy(id = "populateTeller_tab_1_E000POMT")
	private WebElement randomClickInDestinationBranches;

	public WebElement randomClickInDestinationBranches() {
		return randomClickInDestinationBranches;
	}

	// TSA_017
	@FindBy(xpath = "susp_usr_log_br_yn_E000POMT")
	private WebElement suspendCheckBoxInPopulateUser;

	public WebElement suspendCheckBoxInPopulateUser() {
		return suspendCheckBoxInPopulateUser;
	}

	// TSA_018
	@FindBy(xpath = "//a[@id='E000MT']")
	private WebElement maintenanceInUserSubMenu;

	public WebElement maintenanceInUserSubMenu() {
		return maintenanceInUserSubMenu;
	}

	@FindBy(id = "infoBarSearchButton_E000MT")
	private WebElement searchIconInUserSubMenu;

	public WebElement searchIconInUserSubMenu() {
		return searchIconInUserSubMenu;
	}

	// TSA_019
	@FindBy(xpath = "//span[text()=' Accounts ']")
	private WebElement accountsDetailsInUserTemplate;

	public WebElement accountsDetailsInUserTemplate() {
		return accountsDetailsInUserTemplate;
	}

	@FindBy(xpath = "//td[@id='td_tab2_GridTbl_Id_E000MA_1_ctstelleraccdetVO.ACC_BR']")
	private WebElement accountBranchInAccountDetails;

	public WebElement accountBranchInAccountDetails() {
		return accountBranchInAccountDetails;
	}

	// TRS_041
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csmTransactionsMenu;

	public WebElement csmTransactionsMenu() {
		return csmTransactionsMenu;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement csmTransactionsMaintenanceSubMenu;

	public WebElement csmTransactionsMaintenanceSubMenu() {
		return csmTransactionsMaintenanceSubMenu;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement csmTransactionsCurrencyField;

	public WebElement csmTransactionsCurrencyField() {
		return csmTransactionsCurrencyField;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement csmTransactionsAmountField;

	public WebElement csmTransactionsAmountField() {
		return csmTransactionsAmountField;
	}

	@FindBy(xpath = "//input[@id='value_date_D001MT']")
	private WebElement csmTransactionsValueDateField;

	public WebElement csmTransactionsValueDateField() {
		return csmTransactionsValueDateField;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement csmTransactionsSaveField;

	public WebElement csmTransactionsSaveField() {
		return csmTransactionsSaveField;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement csmTransactionsApproveScreen;

	public WebElement csmTransactionsApproveScreen() {
		return csmTransactionsApproveScreen;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement csmTransactionsApproveScreenTransactionNumber;

	public WebElement csmTransactionsApproveScreenTransactionNumber() {
		return csmTransactionsApproveScreenTransactionNumber;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement csmTransactionsApproveScreenTransactionNumberDoubleClick;

	public WebElement csmTransactionsApproveScreenTransactionNumberDoubleClick() {
		return csmTransactionsApproveScreenTransactionNumberDoubleClick;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement csmTransactionsApproveScreenApproveButton;

	public WebElement csmTransactionsApproveScreenApproveButton() {
		return csmTransactionsApproveScreenApproveButton;
	}

	@FindBy(id = "infoBarSearchButton_D001MT")
	private WebElement csmTransactionsMaintenanceScreenSearchIcon;

	public WebElement csmTransactionsMaintenanceScreenSearchIcon() {
		return csmTransactionsMaintenanceScreenSearchIcon;
	}

	@FindBy(id = "trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement csmTransactionsMaintenanceScreenTransactionNumber;

	public WebElement csmTransactionsMaintenanceScreenTransactionNumber() {
		return csmTransactionsMaintenanceScreenTransactionNumber;
	}

	@FindBy(id = "td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO")
	private WebElement csmTransactionsMaintenanceScreenTransactionNumberDoubleClick;

	public WebElement csmTransactionsMaintenanceScreenTransactionNumberDoubleClick() {
		return csmTransactionsMaintenanceScreenTransactionNumberDoubleClick;
	}

	@FindBy(id = "trxMgntDefFormId_D001MT_Booked_Entries_key")
	private WebElement csmTransactionsMaintenanceScreenBookedEntries;

	public WebElement csmTransactionsMaintenanceScreenBookedEntries() {
		return csmTransactionsMaintenanceScreenBookedEntries;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement debitAccountGlCode;

	public WebElement debitAccountGlCode() {
		return debitAccountGlCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement debitAccountCifCode;

	public WebElement debitAccountCifCode() {
		return debitAccountCifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement debitAccountSerialNo;

	public WebElement debitAccountSerialNo() {
		return debitAccountSerialNo;
	}

	@FindBy(xpath = "//a[text()='Transactions / Maintenance']")
	private WebElement randomClickInTransactions;

	public WebElement randomClickInTransactions() {
		return randomClickInTransactions;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement creditAccountBranchCode;

	public WebElement creditAccountBranchCode() {
		return creditAccountBranchCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001MT']")
	private WebElement creditAccountCurrency;

	public WebElement creditAccountCurrency() {
		return creditAccountCurrency;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement creditAccountGlCode;

	public WebElement creditAccountGlCode() {
		return creditAccountGlCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement creditAccountCifCode;

	public WebElement creditAccountCifCode() {
		return creditAccountCifCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement creditAccountSerialNo;

	public WebElement creditAccountSerialNo() {
		return creditAccountSerialNo;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday() {
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement csm_Param_ErrorPopup_OkButton;

	public WebElement csm_Param_ErrorPopup_OkButton() {
		return csm_Param_ErrorPopup_OkButton;
	}

	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement csmStopperMessagePopupInTransactions;

	public WebElement csmStopperMessagePopupInTransactions() {
		return csmStopperMessagePopupInTransactions;
	}

	// TRS_078
	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement saveButtonInTransactions;

	public WebElement saveButtonInTransactions() {
		return saveButtonInTransactions;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered;

	public WebElement checkIfValueIsEntered() {
		return checkIfValueIsEntered;
	}

	// CSMOkButtonInInformationPopUpMenu
	@FindBy(xpath = "//span[text()='close']")
	private WebElement closeButtonInAlertPopup;

	public WebElement closeButtonInAlertPopup() {
		return closeButtonInAlertPopup;
	}

	@FindBy(id = "D001AU")
	private WebElement approveScreenInTransactions;

	public WebElement approveScreenInTransactions() {
		return approveScreenInTransactions;
	}

	@FindBy(xpath = "(//td[text()='Toggle']/following-sibling::td)[3]//span")
	private WebElement refreshButtonInApproveScreen;

	public WebElement refreshButtonInApproveScreen() {
		return refreshButtonInApproveScreen;
	}

	@FindBy(id = "trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement transactionNoInApproveScreen;

	public WebElement transactionNoInApproveScreen() {
		return transactionNoInApproveScreen;
	}

	@FindBy(id = "td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO")
	private WebElement doubleClickTransactionNo;

	public WebElement doubleClickTransactionNo() {
		return doubleClickTransactionNo;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement approveButtonInApproveScreen;

	public WebElement approveButtonInApproveScreen() {
		return approveButtonInApproveScreen;
	}

	@FindBy(id = "cyPurchaseSaleDet")
	private WebElement randomClick;

	public WebElement randomClick() {
		return randomClick;
	}

	@FindBy(xpath = "//a[@id='dismissbut_D001MT']")
	private WebElement dismissAlertPopup;

	public WebElement dismissAlertPopup() {
		return dismissAlertPopup;
	}

	@FindBy(xpath = "//div[text()='Transaction No 7685 Approved ']")
	private WebElement successfullyApprovedPopup;

	public WebElement successfullyApprovedPopup() {
		return successfullyApprovedPopup;
	}

	@FindBy(xpath = "//div[text()='Success']")
	private WebElement successMessagePopup;

	public WebElement successMessagePopup() {
		return successMessagePopup;
	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.CODE")
	private WebElement doubleClickUserInUpdateAfterApprove;

	public WebElement doubleClickUserInUpdateAfterApprove() {
		return doubleClickUserInUpdateAfterApprove;
	}

	// warnUserIfLimitExceedFlagInUpdateAfterApprove
	// proceedIfLimitExceedFlagInUpdateAfterApprove
	@FindBy(xpath = "//div[text()='Economic Sector: Limit Amount should be between 0.0  and 300']")
	private WebElement validatePopupInEcoSector;

	public WebElement validatePopupInEcoSector() {
		return validatePopupInEcoSector;
	}

	@FindBy(xpath = "(//input[@id='_popup_path_sol_ok'])[2]")
	private WebElement warningPopupInEcoSector;

	public WebElement warningPopupInEcoSector() {
		return warningPopupInEcoSector;
	}

	@FindBy(xpath = "//div[text()='Success']")
	private WebElement successMessagePopupInApproveScreen;

	public WebElement successMessagePopupInApproveScreen() {
		return successMessagePopupInApproveScreen;
	}

	// csmStopperMessagePopupInTransactions
	@FindBy(xpath = "//td[@id='td_tab5_E_GridTbl_Id_E000MA_1_rn']")
	private WebElement deleteRowInEcoSector;

	public WebElement deleteRowInEcoSector() {
		return deleteRowInEcoSector;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement holidayOkButtonInRunningDate;

	public WebElement holidayOkButtonInRunningDate() {
		return holidayOkButtonInRunningDate;
	}

	@FindBy(xpath = "//input[@id='ctrl_gl_D001MT']")
	private WebElement glCodeInTransactions;

	public WebElement glCodeInTransactions() {
		return glCodeInTransactions;
	}

	@FindBy(xpath = "//input[@id='ctrl_cif_D001MT']")
	private WebElement cifCodeInTransactions;

	public WebElement cifCodeInTransactions() {
		return cifCodeInTransactions;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_ctrl_sl_D001MT']")
	private WebElement serialNoInTransactions;

	public WebElement serialNoInTransactions() {
		return serialNoInTransactions;
	}

	// prerequesties
	// TRS_109
	@FindBy(xpath = "//span[text()=' Priority ']")
	private WebElement priorityButton;

	public WebElement priorityButton() {
		return priorityButton;
	}

	@FindBy(id = "add_tab5_P_GridTbl_Id_E000MA")
	private WebElement addIconInPriority;

	public WebElement addIconInPriority() {
		return addIconInPriority;
	}

	// ecoSectorLimit
	// transactionInEcoSectorLimit
	// withdrawalLimitInUpdateAfterApprove
	// proceedIfLimitExceedFlagInUpdateAfterApprove
	// okButtonInUpdateAfterApprove
	@FindBy(xpath = "//span[text()='close']")
	private WebElement closeButtonInTransactions;

	public WebElement closeButtonInTransactions() {
		return addIconInPriority;
	}

	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_D001MT_1_alertsParamCO.userId']")
	private WebElement selectTheUserInAlertScreen;

	public WebElement selectTheUserInAlertScreen() {
		return selectTheUserInAlertScreen;
	}

	@FindBy(xpath = "//span[text()=' Send ']")
	private WebElement sendButtonInAlertScreen;

	public WebElement sendButtonInAlertScreen() {
		return sendButtonInAlertScreen;
	}

	@FindBy(xpath = "//span[text()='Send Alert']")
	private WebElement sendAlertPopup;

	public WebElement sendAlertPopup() {
		return sendAlertPopup;
	}

	// TRS_142
	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement controlRecordInSystemParameters_615;

	public WebElement controlRecordInSystemParameters_615() {
		return controlRecordInSystemParameters_615;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement updateAfterApproveButtonInControlRecord_615;

	public WebElement updateAfterApproveButtonInControlRecord_615() {
		return updateAfterApproveButtonInControlRecord_615;
	}

	@FindBy(xpath = "//a[text()=' Alert Activation ']")
	private WebElement alertActivationButton_615;

	public WebElement alertActivationButton_615() {
		return alertActivationButton_615;
	}

	@FindBy(xpath = "(//span[text()='Account Balance Overdrawn'])[1]//ancestor::td/div/div")
	private WebElement maximizeFlagInAlertActivation_615;

	public WebElement maximizeFlagInAlertActivation_615() {
		return maximizeFlagInAlertActivation_615;
	}

	@FindBy(id = "td_tab4_GridTbl_Id_O001UP_33_CUSTOM_FIELD")
	private WebElement staffAccountsTransactionFlag_615;

	public WebElement staffAccountsTransactionFlag_615() {
		return staffAccountsTransactionFlag_615;
	}

	@FindBy(id = "tab4_GridTbl_Id_O001UP")
	private WebElement staffAccountsTransactionFlagCheckBox;

	public WebElement staffAccountsTransactionFlagCheckBox() {
		return staffAccountsTransactionFlagCheckBox;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement controlRecordUpdateAfterApproveButton_615;

	public WebElement controlRecordUpdateAfterApproveButton_615() {
		return controlRecordUpdateAfterApproveButton_615;
	}

	@FindBy(id = "O001P")
	private WebElement controlRecordApproveScreen;

	public WebElement controlRecordApproveScreen() {
		return controlRecordApproveScreen;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement controlRecordApproveScreenApproveButton_615;

	public WebElement controlRecordApproveScreenApproveButton_615() {
		return controlRecordApproveScreenApproveButton_615;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_14_CUSTOM_FIELD'])[1]")
	private WebElement selectFlagToCheck;

	public WebElement selectFlagToCheck() {
		return selectFlagToCheck;
	}

	@FindBy(xpath = "(//span[text()='0023-CIF Below Minimum Age']//following::td[@id='td_tab4_GridTbl_Id_O001UP_14_ctscontrolAlertVO.ACTIVATE']//input)[1]")
	private WebElement checkTheBelowMinimumAgeFlag;

	public WebElement checkTheBelowMinimumAgeFlag() {
		return checkTheBelowMinimumAgeFlag;
	}

	@FindBy(xpath = "//td[@id='td_tab5_P_GridTbl_Id_E000MA_0_rn']")
	private WebElement deleteButtonInPriority;

	public WebElement deleteButtonInPriority() {
		return deleteButtonInPriority;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement csm_Transaction_CreditAccount_BranchCode_Input;

	public WebElement csmTransactionCreditAccountBranchCodeInput() {
		return csm_Transaction_CreditAccount_BranchCode_Input;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement csm_Transaction_CreditAccount_GlCode_Input;

	public WebElement csmTransactionCreditAccountGlCodeInput() {
		return csm_Transaction_CreditAccount_GlCode_Input;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement csm_Transaction_CreditAccount_CifCode_Input;

	public WebElement csmTransactionCreditAccountCifCodeInput() {
		return csm_Transaction_CreditAccount_CifCode_Input;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement csm_Transaction_CreditAccount_SerialNo_Input;

	public WebElement csmTransactionCreditAccountSerialNoInput() {
		return csm_Transaction_CreditAccount_SerialNo_Input;
	}

	// TSA_073
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_Transactions_MenuOptions;

	public WebElement csm_Transactions_MenuOptions() {
		return csm_Transactions_MenuOptions;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement csm_Alert_Popup_CloseButton_615;

	public WebElement csm_Alert_Popup_CloseButton_615() {
		return csm_Alert_Popup_CloseButton_615;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement csm_Core_CloseSymbol_615;

	public WebElement csm_Core_CloseSymbol_615() {
		return csm_Core_CloseSymbol_615;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.CHQ_NUM']")
	private WebElement csm_Transactions_Maintenance_ChequeNo;

	public WebElement csm_Transactions_Maintenance_ChequeNo() {
		return csm_Transactions_Maintenance_ChequeNo;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement csm_Transactions_Maintenance_DebitAcc_GL_Input_615;

	public WebElement csm_Transactions_Maintenance_DebitAcc_GL_Input_615() {
		return csm_Transactions_Maintenance_DebitAcc_GL_Input_615;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement csm_Transactions_Maintenance_DebitAcc_Cif_Input_615;

	public WebElement csm_Transactions_Maintenance_DebitAcc_Cif_Input_615() {
		return csm_Transactions_Maintenance_DebitAcc_Cif_Input_615;
	}

	@FindBy(id = "lookuptxt_to_trs_ac_sl_D001MT")
	private WebElement csm_Transactions_Maintenance_DebitAcc_SerialNo_Input_615;

	public WebElement csm_Transactions_Maintenance_DebitAcc_SerialNo_Input_615() {
		return csm_Transactions_Maintenance_DebitAcc_SerialNo_Input_615;
	}

	// TSA_073_pre requesties
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement sads_Parameters_Menu_615;

	public WebElement sads_Parameters_Menu_615() {
		return sads_Parameters_Menu_615;
	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement sads_Parameters_User_Submenu_615;

	public WebElement sads_Parameters_User_Submenu_615() {
		return sads_Parameters_User_Submenu_615;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement sads_Parameters_User_Maintenance_615;

	public WebElement sads_Parameters_User_Maintenance_615() {
		return sads_Parameters_User_Maintenance_615;
	}

	@FindBy(xpath = "//a[text()=' Search ']")
	private WebElement sads_User_Maintenance_SearchIcon_615;

	public WebElement sads_User_Maintenance_SearchIcon_615() {
		return sads_User_Maintenance_SearchIcon_615;
	}

	@FindBy(xpath = "//input[@name='USER_ID']")
	private WebElement sads_User_Maintenance_UserId_Input_615;

	public WebElement sads_User_Maintenance_UserId_Input_615() {
		return sads_User_Maintenance_UserId_Input_615;
	}

	@FindBy(id = "td_userListGridTbl_Id_P005M_1_usrVO.USER_ID")
	private WebElement sads_User_Maintenance_UserId_DoubleClick;

	public WebElement sads_User_Maintenance_UserId_DoubleClick() {
		return sads_User_Maintenance_UserId_DoubleClick;
	}

	@FindBy(id = "lookuptxt_CIF_NO_P005M")
	private WebElement sads_User_Maintenance_Cif_Input;

	public WebElement sads_User_Maintenance_Cif_Input() {
		return sads_User_Maintenance_Cif_Input;
	}

	@FindBy(id = "userFormId_P005M_Save_key")
	private WebElement sads_User_Maintenance_Save_Button_615;

	public WebElement sads_User_Maintenance_Save_Button_615() {
		return sads_User_Maintenance_Save_Button_615;
	}

	@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]/ancestor::div//following-sibling::center//input")
	private WebElement sads_SaveSuccessOkButton_615;

	public WebElement sadsSaveSuccessOkButton_615() {
		return sads_SaveSuccessOkButton_615;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement sads_User_Approve_SubMenu_615;

	public WebElement sads_User_Approve_SubMenu_615() {
		return sads_User_Approve_SubMenu_615;
	}

	@FindBy(id = "userFormId_P005P_Approve_key")
	private WebElement sads_User_Approve_SubMenu_ApproveButton_615;

	public WebElement sads_User_Approve_SubMenu_ApproveButton_615() {
		return sads_User_Approve_SubMenu_ApproveButton_615;
	}

	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000MA_2_ctstellerVO.USER_ID")
	private WebElement params_SystemParameters_User_DoubleClickUser;

	public WebElement params_SystemParameters_User_DoubleClickUser() {
		return params_SystemParameters_User_DoubleClickUser;
	}

	@FindBy(id = "lookuptxt_cif_no_E000MA")
	private WebElement params_SystemParameters_User_CifInput;

	public WebElement params_SystemParameters_User_CifInput() {
		return params_SystemParameters_User_CifInput;
	}

	@FindBy(xpath = "//select[@name='tellerparamCO.ctstellerVO.FORBID_TRS_ON_ITS_ACC']")
	private WebElement params_SystemParameters_User_SelectFlag_615;

	public WebElement params_SystemParameters_User_SelectFlag_615() {
		return params_SystemParameters_User_SelectFlag_615;
	}

	// TSA_073_test case
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

	// @FindBy(id="submit_464136045")
	// private WebElement multiChequesEntryTransactionDetails_SaveButton;
	//
	// public WebElement multiChequesEntryTransactionDetailsSaveButton() {
//    				return multiChequesEntryTransactionDetails_SaveButton;
	// }
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

	@FindBy(xpath = "//div[contains(text(),'is Non Resident')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactionMaintenance_IsNoResidentOkbuton;

	public WebElement transactionMaintenanceIsNoResidentOkbuton() {
		return transactionMaintenance_IsNoResidentOkbuton;
	}

	@FindBy(xpath = "//span[contains(text(),'Staff Accounts Transaction')]//parent::td//following-sibling::td[1]//input")
	private WebElement alertActivationTab_StaffAccountTransactionsCheckBox;

	public WebElement alertActivationTabStaffAccountTransactionsCheckBox() {
		return alertActivationTab_StaffAccountTransactionsCheckBox;
	}

	@FindBy(xpath = "//span[contains(text(),'Staff Accounts Transaction')]//parent::td")
	private WebElement alertActivationTab_StaffAccountTransactions;

	public WebElement alertActivationTabStaffAccountTransactions() {
		return alertActivationTab_StaffAccountTransactions;
	}

	@FindBy(id = "Parameters / User / Maintenance")
	private WebElement sadsRandomClick;

	public WebElement sadsRandomClick() {
		return sadsRandomClick;
	}

	@FindBy(id = "lookuptxt_CIF_NO_P005M")
	private WebElement user_CIFNumberInput;

	public WebElement userCIFNumberInput() {
		return user_CIFNumberInput;
	}

	@FindBy(id = "lookuptxt_cif_no_E000MA")
	private WebElement userUpdateAfterApprove_CIFNumberInput;

	public WebElement userUpdateAfterApproveCIFNumberInput() {
		return userUpdateAfterApprove_CIFNumberInput;
	}

	@FindBy(id = "E000P")
	private WebElement csm_User_ApproveScreen;

	public WebElement csm_User_ApproveScreen() {
		return csm_User_ApproveScreen;
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

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE")
	private WebElement transactionType_UpdateAfterApprove_TrxCode;

	public WebElement transactionTypeUpdateAfterApproveTrxCode() {
		return transactionType_UpdateAfterApprove_TrxCode;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE")
	private WebElement transactionType_TransactionCode;

	public WebElement transactionTypeTransactionCode() {
		return transactionType_TransactionCode;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement transactionTypeGrid_NextButton;

	public WebElement transactionTypeGridNextButton() {
		return transactionTypeGrid_NextButton;
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

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")
	private WebElement transactionStatus_OkButton;

	public WebElement transactionStatusOkButton() {
		return transactionStatus_OkButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Transaction Type / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement transactionType_UpdateAfterApproveLabelClose;

	public WebElement transactionTypeUpdateAfterApproveLabelClose() {
		return transactionType_UpdateAfterApproveLabelClose;
	}

	@FindBy(xpath = "//td[contains(text(),'Transaction Type')]//ancestor::a//following-sibling::ul//span[text()='Approve']")
	private WebElement transactionType_ApproveFeature;

	public WebElement transactionTypeApproveFeature() {
		return transactionType_ApproveFeature;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Maintenance')]")
	private WebElement transactionMaintenance_label;

	public WebElement transactionMaintenanceLabel() {
		return transactionMaintenance_label;
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

	@FindBy(xpath = "//label[text()='Value date']/parent::td/following-sibling::td/input")
	private WebElement csm_Transactions_Maintenance_ValueDate_InputField;

	public WebElement csm_Transactions_Maintenance_ValueDate_InputField() {
		return csm_Transactions_Maintenance_ValueDate_InputField;
	}

	@FindBy(id = "avail_bal_after_D001MT")
	private WebElement csm_Transactions_Maintenance_ValidationPopup;

	public WebElement csm_Transactions_Maintenance_ValidationPopup() {
		return csm_Transactions_Maintenance_ValidationPopup;
	}

	// @FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	// private WebElement Transactions_transactionNo_codeValue;
	// public WebElement Transactions_transactionNo_codeValue()
	// {
	// return Transactions_transactionNo_codeValue;
	// }

	// priority 2
	@FindBy(xpath = "//a[text()=' Additional Details ']")
	private WebElement csm_Params_ControlRecord_AdditionalDetails;

	public WebElement csm_Params_ControlRecord_AdditionalDetails() {
		return csm_Params_ControlRecord_AdditionalDetails;
	}

	@FindBy(name = "controlrecordCO.ctscontrolVO.VALID_ALRT_LMT_ON_APPRV_TRX_YN")
	private WebElement csm_Params_ControlRecord_AdditionalDetails_ValidateFlag;

	public WebElement csm_Params_ControlRecord_AdditionalDetails_ValidateFlag() {
		return csm_Params_ControlRecord_AdditionalDetails_ValidateFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.AUTO_APPROVE_WITHIN_LIMIT")
	private WebElement csm_Params_TransactionType_LimitFlag;

	public WebElement csm_Params_TransactionType_LimitFlag() {
		return csm_Params_TransactionType_LimitFlag;
	}

	@FindBy(xpath = "//span[@class='displayProgIcon']//img")
	private WebElement csm_LoadingImage;

	public WebElement csmLoadingImage() {
		return csm_LoadingImage;
	}

	@FindBy(id = "1_ctstellerciftypedetVO.TRX_TYPE_lookuptxt_tab5_E_GridTbl_Id_E000MA")
	private WebElement csm_EcoSector_Existing_TrxType;

	public WebElement csm_EcoSector_Existing_TrxType() {
		return csm_EcoSector_Existing_TrxType;
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParameters_Menu;

	public WebElement csmParametersMenu() {
		return csmParameters_Menu;
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement csmParameters_SystemParameters;

	public WebElement csmParametersSystemParameters() {
		return csmParameters_SystemParameters;
	}

	@FindBy(xpath = "//span[text()=' Gl Charges ']")
	private WebElement csm_SystemParameters_TransactionTypeUA_GlCharges;

	public WebElement csmSystemParametersTransactionTypeUAGlCharges() {
		return csm_SystemParameters_TransactionTypeUA_GlCharges;
	}

	@FindBy(xpath = "//span[text()=' Cif Priority Charges ']")
	private WebElement csm_SystemParameters_TransactionTypeUA_CifPriorityCharges;

	public WebElement csmSystemParametersTransactionTypeUACifPriorityCharges() {
		return csm_SystemParameters_TransactionTypeUA_CifPriorityCharges;
	}

	@FindBy(xpath = "//span[text()=' CIF Types Charges ']")
	private WebElement csm_SystemParameters_TransactionTypeUA_CifTypeCharges;

	public WebElement csmSystemParametersTransactionTypeUACifTypeCharges() {
		return csm_SystemParameters_TransactionTypeUA_CifTypeCharges;
	}

	@FindBy(id = "add_tab27_GridTbl_Id_P024MA")
	private WebElement csm_SystemParameters_TransactionTypeUA_GlCharges_AddButton;

	public WebElement csmSystemParametersTransactionTypeUAGlChargesAddButton() {
		return csm_SystemParameters_TransactionTypeUA_GlCharges_AddButton;
	}

	@FindBy(id = "add_tab26_GridTbl_Id_P024MA")
	private WebElement csm_SystemParameters_TransactionTypeUA_CifTypeCharges_AddButton;

	public WebElement csmSystemParametersTransactionTypeUACifTypeChargesAddButton() {
		return csm_SystemParameters_TransactionTypeUA_CifTypeCharges_AddButton;
	}

//	@FindBy(id = "add_tab28_GridTbl_Id_P024MA")
//	private WebElement csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_AddButton;
//
//	public WebElement csmSystemParametersTransactionTypeUACifPriorityChargesAddButton() {
//		return csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_AddButton;
//	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.ENTITY_CODE']")
	private WebElement csm_SystemParameters_TransactionTypeUA_GlCode_Input;

	public WebElement csmSystemParametersTransactionTypeUAGlCodeInput() {
		return csm_SystemParameters_TransactionTypeUA_GlCode_Input;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.CHARGE_CODE']")
	private WebElement csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input;

	public WebElement csmSystemParametersTransactionTypeUAChargesSchemaInput() {
		return csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input;
	}

//	@FindBy(xpath = "//td[@id='td_tab27_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.CHARGES_CY_POLICY']//select")
//	private WebElement csm_SystemParameters_TransactionTypeUA_GlCharges_Select_Input;
//
//	public WebElement csmSystemParametersTransactionTypeUAGlChargesSelectInput() {
//		return csm_SystemParameters_TransactionTypeUA_GlCharges_Select_Input;
//	}

	@FindBy(id = "td_tab26_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.CHARGES_CY_POLICY")
	private WebElement csm_SystemParameters_TransactionTypeUA_CifTypeCharges_Select_Input;

	public WebElement csmSystemParametersTransactionTypeUACifTypeChargesSelectInput() {
		return csm_SystemParameters_TransactionTypeUA_CifTypeCharges_Select_Input;
	}

	@FindBy(id = "td_tab28_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.CHARGES_CY_POLICY")
	private WebElement csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_Select_Input;

	public WebElement csmSystemParametersTransactionTypeUACifPriorityChargesSelectInput() {
		return csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_Select_Input;
	}

	@FindBy(xpath = "//td[@tdlabel='Cash / Account']//select")
	private WebElement csm_SystemParameters_TransactionTypeUA_Account_Input;

	public WebElement csm_SystemParameters_TransactionTypeUA_Account_Input() {
		return csm_SystemParameters_TransactionTypeUA_Account_Input;
	}

	@FindBy(xpath = "//td[@tdlabel='action']//select")
	private WebElement csm_SystemParameters_TransactionTypeUA_Action_Input;

	public WebElement csmSystemParametersTransactionTypeUAActionInput() {
		return csm_SystemParameters_TransactionTypeUA_Action_Input;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement csm_SystemParameters_TransactionTypeUA_Ok_Buton;

	public WebElement csmSystemParametersTransactionTypeUAOk_Buton() {
		return csm_SystemParameters_TransactionTypeUA_Ok_Buton;
	}

	@FindBy(xpath = "(//table[@id='transactionTypesList_GridTbl_Id_P024MA'])[1]")
	private WebElement csm_TransactionType_UPApproveScreen_CodeInput_DoubleClick;

	public WebElement csmTransactionTypeUPApproveScreenCodeInputDoubleClick() {
		return csm_TransactionType_UPApproveScreen_CodeInput_DoubleClick;
	}

	@FindBy(xpath = "")
	private WebElement doubleclick_fortestcaseTRS_271;

	public WebElement doubleclickfortestcaseTRS_271() {
		return doubleclick_fortestcaseTRS_271;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.DEDUCT_DEBITOR']")
	private WebElement csm_TransactionType_DeductFrom_Flag;

	public WebElement csmTransactionTypeDeductFromFlag() {
		return csm_TransactionType_DeductFrom_Flag;
	}

	@FindBy(id = "deduct_chrg_from_trx_P024MA3")
	private WebElement csm_TransactionType_DeductFrom_RadioButton_Flag;

	public WebElement csmTransactionTypeDeductFromRadioButtonFlag() {
		return csm_TransactionType_DeductFrom_RadioButton_Flag;
	}

	@FindBy(xpath = "//span[text()='GlCharges']")
	private WebElement csm_TransactionType_GlCharges_RandomClick;

	public WebElement csmTransactionTypeGlChargesRandomClick() {
		return csm_TransactionType_GlCharges_RandomClick;
	}

	@FindBy(xpath = "//div[text()='CIF Type']")
	private WebElement csm_TransactionType_CifTypeCharges_RandomClick;

	public WebElement csmTransactionTypeCifTypeChargesRandomClick() {
		return csm_TransactionType_CifTypeCharges_RandomClick;
	}

	@FindBy(id = "td_tab26_GridTbl_Id_P024MA_0_rn")
	private WebElement csm_TransactionType_CifTypeCharges_SelectRow_Delete;

	public WebElement csmTransactionTypeCifTypeChargesSelectRowDelete() {
		return csm_TransactionType_CifTypeCharges_SelectRow_Delete;
	}

//	@FindBy(id = "del_tab26_GridTbl_Id_P024MA")
//	private WebElement csm_TransactionType_CifTypeCharges_DeleteButton;
//
//	public WebElement csmTransactionTypeCifTypeChargesDeleteButton() {
//		return csm_TransactionType_CifTypeCharges_DeleteButton;
//	}

	@FindBy(id = "td_tab27_GridTbl_Id_P024MA_0_rn")
	private WebElement csm_TransactionType_GlCharges_SelectRow_Delete;

	public WebElement csmTransactionTypeGlChargesSelectRowDelete() {
		return csm_TransactionType_GlCharges_SelectRow_Delete;
	}

	@FindBy(id = "del_tab27_GridTbl_Id_P024MA")
	private WebElement csm_TransactionType_GlCharges_DeleteButton;

	public WebElement csmTransactionTypeGlChargesDeleteButton() {
		return csm_TransactionType_GlCharges_DeleteButton;
	}

	@FindBy(id = "td_tab28_GridTbl_Id_P024MA_1_rn")
	private WebElement csm_TransactionType_CifTypePriorityCharges_SelectRow_Delete;

	public WebElement csmTransactionTypeCifTypePriorityChargesSelectRowDelete() {
		return csm_TransactionType_CifTypePriorityCharges_SelectRow_Delete;
	}

	@FindBy(id = "del_tab28_GridTbl_Id_P024MA")
	private WebElement csm_TransactionType_CifPriorityCharges_DeleteButton;

	public WebElement csmTransactionTypeCifPriorityChargesDeleteButton() {
		return csm_TransactionType_CifPriorityCharges_DeleteButton;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.POST_DATED_VDATE']")
	private WebElement csm_TransactionType_AllowPostdatedValueDate;

	public WebElement csmTransactionTypeAllowPostdatedValueDate() {
		return csm_TransactionType_AllowPostdatedValueDate;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.BACK_DATED_VDATE']") // (NoFutureValueDate)
	private WebElement csm_TransactionType_AllowBackdatedValueDate;

	public WebElement csmTransactionTypeAllowBackdatedValueDate() {
		return csm_TransactionType_AllowBackdatedValueDate;
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement transactions_Transactions;

	public WebElement transactionsTransactions() {
		return transactions_Transactions;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement transactions_MaintenanceScreen;

	public WebElement transactionsMaintenanceScreen() {
		return transactions_MaintenanceScreen;
	}

	@FindBy(xpath = "//Input[@name='trxMgntCO.ctstrsVO.TRX_TYPE']")
	private WebElement transactions_TrxTypeInput;

	public WebElement transactionsTrxTypeInput() {
		return transactions_TrxTypeInput;
	}

	@FindBy(xpath = "//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement transactions_DepositAcc_BranchcodeInput;

	public WebElement transactionsDepositAccBranchcodeInput() {
		return transactions_DepositAcc_BranchcodeInput;
	}

	@FindBy(xpath = "//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
	private WebElement transactions_CreditAcc_CurrencycodeInput;

	public WebElement transactionsCreditAccCurrencycodeInput() {
		return transactions_CreditAcc_CurrencycodeInput;
	}

	@FindBy(xpath = "//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_GL']")
	private WebElement transactions_DebitAcc_GlcodeInput;

	public WebElement transactionsDebitAccGlcodeInput() {
		return transactions_DebitAcc_GlcodeInput;
	}

	@FindBy(xpath = "//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement transactions_DebitAcc_CifcodeInput;

	public WebElement transactionsDebitAccCifcodeInput() {
		return transactions_DebitAcc_CifcodeInput;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement transactions_Viewmemo_closebtn;

	public WebElement transactionsViewmemoclosebtn() {
		return transactions_Viewmemo_closebtn;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_SL']")
	private WebElement transactions_DebitAcc_SerialcodeInput;

	public WebElement transactionsDebitAccSerialcodeInput() {
		return transactions_DebitAcc_SerialcodeInput;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement transactions_Warning_Okbtn;

	public WebElement transactionsWarningOkbtn() {
		return transactions_Warning_Okbtn;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_CY']")
	private WebElement transactions_DebitAcc_CurrencyInput;

	public WebElement transactionsDebitAccCurrencyInput() {
		return transactions_DebitAcc_CurrencyInput;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement transactions_EnterAmountInput;

	public WebElement transactionsEnterAmountInput() {
		return transactions_EnterAmountInput;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.VALUE_DATE']")
	private WebElement transactions_Valuedate;

	public WebElement transactions_Valuedate() {
		return transactions_Valuedate;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement transactions_CreditAcc_GlcodeInput;

	public WebElement transactionsCreditAccGlcodeInput() {
		return transactions_CreditAcc_GlcodeInput;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement transactions_CreditAcc_CifcodeInput;

	public WebElement transactionsCreditAccCifcodeInput() {
		return transactions_CreditAcc_CifcodeInput;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_SL']")
	private WebElement transactions_CreditAcc_SerialcodeInput;

	public WebElement transactionsCreditAccSerialcodeInput() {
		return transactions_CreditAcc_SerialcodeInput;
	}

	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement transactions_Maintance_Savebtn;

	public WebElement transactionsMaintanceSavebtn() {
		return transactions_Maintance_Savebtn;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement transaction_Trxsuccesspopup_Okbtn;

	public WebElement transactionTrxsuccesspopupOkbtn() {
		return transaction_Trxsuccesspopup_Okbtn;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement Confirm_Ok;

	public WebElement ConfirmOk() {
		return Confirm_Ok;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement transactions_ApproveScreen;

	public WebElement transactionsApproveScreen() {
		return transactions_ApproveScreen;
	}

	@FindBy(xpath = "//input[@name='TRS_NO']")
	private WebElement transactions_TransactionNo_InputValue;

	public WebElement transactionsTransactionNoInputValue() {
		return transactions_TransactionNo_InputValue;
	}

	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement transactions_TransactionNo_Doubleclk;

	public WebElement transactionsTransactionNoDoubleclk() {
		return transactions_TransactionNo_Doubleclk;
	}

	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement transactions_Approvescreen_Appbtn;

	public WebElement transactionsApprovescreenAppbtn() {
		return transactions_Approvescreen_Appbtn;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement transactions_Maintance_SearchIcon;

	public WebElement transactionsMaintanceSearchIcon() {
		return transactions_Maintance_SearchIcon;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
	private WebElement transactions_Maintance_BookedEntriesBtn;

	public WebElement transactionsMaintanceBookedEntriesBtn() {
		return transactions_Maintance_BookedEntriesBtn;
	}

	@FindBy(xpath = "//a[text()='Transactions / Maintenance']")
	private WebElement csm_Transactions_Maintenance_RandomClick;

	public WebElement csmTransactionsMaintenanceRandomClick() {
		return csm_Transactions_Maintenance_RandomClick;
	}

	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement csm_SystemParameters_TransactionType;

	public WebElement csmSystemParametersTransactionType() {
		return csm_SystemParameters_TransactionType;
	}

	@FindBy(id = "transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE")
	private WebElement csm_SystemParameters_TransactionTypeUA_CodeInput;

	public WebElement csmSystemParametersTransactionTypeUACodeInput() {
		return csm_SystemParameters_TransactionTypeUA_CodeInput;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement csm_SystemParameters_TransactionTypeUA;

	public WebElement csmSystemParametersTransactionTypeUA() {
		return csm_SystemParameters_TransactionTypeUA;
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
	private WebElement csm_TransactionType_ApproveScreen_CodeInput;

	public WebElement csmTransactionTypeApproveScreenCodeInput() {
		return csm_TransactionType_ApproveScreen_CodeInput;
	}

	@FindBy(xpath = "//span[text()=' Transaction Status ']")

	private WebElement TransactionStatusbutton;

	public WebElement TransactionStatusbutton() {

		return TransactionStatusbutton;

	}

	@FindBy(xpath = "//input[@id='new_1692704833105_ctstellerdetVO.SUB_TELLER_CODE_lookuptxt_tab6_GridTbl_Id_E000MA']")

	private WebElement UsercodebuttonTransaction;

	public WebElement UsercodebuttonTransaction() {

		return UsercodebuttonTransaction;

	}

	@FindBy(xpath = "//a[@id='anchor_1206767942']")
	private WebElement SubordinatesTransactionCSMparam;

	public WebElement SubordinatesTransactionCSMparam() {
		return SubordinatesTransactionCSMparam;
	}

	@FindBy(xpath = "//td[text()='User']")

	private WebElement UserCSMParam;

	public WebElement UserCSMParam() {

		return UserCSMParam;
	}

	@FindBy(xpath = "//td[@id='add_tab6_GridTbl_Id_E000MA']")
	private WebElement AddbuttonTransaction;

	public WebElement AddbuttonTransaction() {
		return AddbuttonTransaction;

	}

	@FindBy(xpath = "//select[@id='proceed_cif_blacklisted_P024MA']")

	private WebElement CIFBlacklist;

	public WebElement CIFBlacklist() {

		return CIFBlacklist;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement OkbuttonTransaction;

	public WebElement OkbuttonTransaction() {
		return OkbuttonTransaction;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement userInUpdateAfterApprovesubmit;

	public WebElement userIdInUpdateAfterApprovesubmit() {
		return userIdInUpdateAfterApprove;
	}

	@FindBy(xpath = "//div[@id='panel_4_P024MA']")
	private WebElement CSMParam_TransactionType_MaindetailsTab;

	public WebElement CSMParam_TransactionType_MaindetailsTab() {
		return CSMParam_TransactionType_MaindetailsTab;
	}

	@FindBy(xpath = "//div[@id='panel_2_P024MA']")
	private WebElement csmparam_TRXType_click_AdditionalDetailsTab;

	public WebElement csmparam_TRXType_click_AdditionalDetailsTab() {
		return csmparam_TRXType_click_AdditionalDetailsTab;
	}

	@FindBy(xpath = "//div[@id='panel_3_P024MA']")
	private WebElement csmparam_TRXType_click_AvailableOptionsForDeduct;

	public WebElement csmparam_TRXType_click_AvailableOptionsForDeduct() {
		return csmparam_TRXType_click_AvailableOptionsForDeduct;
	}

//	 Sankar Trx_Obj

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSM_TRSGLCodeCreditAc;

	public WebElement CSM_TRSGLCodeCreditAc() {
		return CSM_TRSGLCodeCreditAc;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSM_TRS_SerialInCreditAc;

	public WebElement CSM_TRS_SerialInCreditAc() {
		return CSM_TRS_SerialInCreditAc;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement CSM_TRS_CIF_Dormant_Acc_Popup_Ok_Btn;

	public WebElement CSM_TRS_CIF_Dormant_Acc_Popup_Ok_Btn() {
		return CSM_TRS_CIF_Dormant_Acc_Popup_Ok_Btn;
	}

	@FindBy(xpath = "//div[contains(text(),'Does Not have Access')]")
	private WebElement CSM_TRS_ValidateUserDoesNotHaveAcces;

	public WebElement CSM_TRS_ValidateUserDoesNotHaveAcces() {
		return CSM_TRS_ValidateUserDoesNotHaveAcces;
	}

	@FindBy(xpath = "//div[contains(text(),'does not have rights to trade with selected Currency')]")
	private WebElement CSM_TRS_ValidateUserDoesNotHaveRights_Popup;

	public WebElement CSM_TRS_ValidateUserDoesNotHaveRights_Popup() {
		return CSM_TRS_ValidateUserDoesNotHaveRights_Popup;
	}

	@FindBy(xpath = "//input[@id='input_amount_D001AU']")
	private WebElement Transactions_Approve_InputAmount_609;

	public WebElement Transactions_Approve_InputAmount_609() {
		return Transactions_Approve_InputAmount_609;
	}

	@FindBy(xpath = "//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='AND/OR']//select")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_AndOr_609;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_AndOr_609() {
		return TransactionType_UpdateAfterApprove_TrxStatus_AndOr_609;
	}// 1

	@FindBy(xpath = "(//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='Priority']//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Priority_609;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Priority_609() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Priority_609;
	}

	@FindBy(xpath = "//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='Status Code']//input")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_StatusCode_609;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_StatusCode_609() {
		return TransactionType_UpdateAfterApprove_TrxStatus_StatusCode_609;
	}

	@FindBy(xpath = "//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='User Level']//input")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_UserLevel_609;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_UserLevel_609() {
		return TransactionType_UpdateAfterApprove_TrxStatus_UserLevel_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_C_GridTbl_Id_E000MA']//div/input)[3]")
	private WebElement User_UpdateAfterApprove_Limits_WithdrawalLimit_609;

	public WebElement User_UpdateAfterApprove_Limits_WithdrawalLimit_609() {
		return User_UpdateAfterApprove_Limits_WithdrawalLimit_609;
	}

	@FindBy(xpath = "//span[text()=' Limits ']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Limits_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Limits_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_Limits_609;
	}

	@FindBy(xpath = "//td[@id='add_tab3_C_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_Limits_Addicon_609;

	public WebElement User_UpdateAfterApprove_Limits_Addicon_609() {
		return User_UpdateAfterApprove_Limits_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab3_C_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_Limits_Deleteicon_609;

	public WebElement User_UpdateAfterApprove_Limits_Deleteicon_609() {
		return User_UpdateAfterApprove_Limits_Deleteicon_609;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='A/C Cy']//input")
	private WebElement User_UpdateAfterApprove_Limits_Currency_609;

	public WebElement User_UpdateAfterApprove_Limits_Currency_609() {
		return User_UpdateAfterApprove_Limits_Currency_609;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='Transaction']//input")
	private WebElement User_UpdateAfterApprove_Limits_TrxType_609;

	public WebElement User_UpdateAfterApprove_Limits_TrxType_609() {
		return User_UpdateAfterApprove_Limits_TrxType_609;
	}

	@FindBy(xpath = "//a[@id='controlRecord_tab_AdditionalDetails_O001UP']")
	private WebElement ControlRecord_UpdateAfterApprove_AdditionalDetails_609;

	public WebElement ControlRecord_UpdateAfterApprove_AdditionalDetails_609() {
		return ControlRecord_UpdateAfterApprove_AdditionalDetails_609;
	}

	@FindBy(xpath = "//input[@id='valid_alrt_lmt_on_apprv_trx_yn_O001UP']")
	private WebElement ControlRecord_UpdateAfterApprove_AdditionalDetailsTab_ValidateagainstAlertLimit_609;

	public WebElement ControlRecord_UpdateAfterApprove_AdditionalDetailsTab_ValidateagainstAlertLimit_609() {
		return ControlRecord_UpdateAfterApprove_AdditionalDetailsTab_ValidateagainstAlertLimit_609;
	}

	@FindBy(xpath = "//input[@id='bypass_int_acc_restrictions_E000MA']")
	private WebElement User_UpdateAfterApprove_BypassInternalAcc_609;

	public WebElement User_UpdateAfterApprove_BypassInternalAcc_609() {
		return User_UpdateAfterApprove_BypassInternalAcc_609;
	}

	@FindBy(xpath = "//input[@id='multi_branch_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_MultiBranch;

	public WebElement TransactionType_UpdateAfterApprove_MultiBranch() {
		return TransactionType_UpdateAfterApprove_MultiBranch;
	}

	@FindBy(xpath = "//input[@id='nostro_mvt_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AllowInternalAcc_609;

	public WebElement TransactionType_UpdateAfterApprove_AllowInternalAcc_609() {
		return TransactionType_UpdateAfterApprove_AllowInternalAcc_609;
	}

	@FindBy(xpath = "//a[@id='transactionTypes_tab_additionalinfo_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Additionalinfo_609;

	public WebElement TransactionType_UpdateAfterApprove_Additionalinfo_609() {
		return TransactionType_UpdateAfterApprove_Additionalinfo_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P024MA']/tbody/tr[2]/td)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_609;
	}

	@FindBy(xpath = "//td[@id='add_tab12_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Addicon_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Addicon_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab12_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Deleteicon_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Deleteicon_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Deleteicon_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P024MA']//tbody//tr[2]//td[3]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_BranchCode_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_BranchCode_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_BranchCode_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P024MA']//tbody//tr[2]//td[4]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CurrencyCode_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CurrencyCode_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CurrencyCode_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P024MA']//tbody//tr[2]//td[5]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_GlCode_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_GlCode_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_GlCode_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P024MA']//tbody//tr[2]//td[6]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CifCode_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CifCode_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_CifCode_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P024MA']//tbody//tr[2]//td[7]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Serialno_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Serialno_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Serialno_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P024MA']//tbody//tr[2]//td[8]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Default_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Default_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Credit_Default_609;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-memoDiv_P024MA' and text()='View Memo']")
	private WebElement ViewMemo_609;

	public WebElement ViewMemo_609() {
		return ViewMemo_609;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-memoDiv_P024MA']//parent::div/a/span")
	private WebElement ViewMemo_Close_609;

	public WebElement ViewMemo_Close_609() {
		return ViewMemo_Close_609;
	}

	@FindBy(xpath = "(//table[@id='tab11_GridTbl_Id_P024MA']/tbody/tr[2]/td)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_609;
	}

	@FindBy(xpath = "//td[@id='add_tab11_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Addicon_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Addicon_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab11_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Deleteicon_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Deleteicon_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Deleteicon_609;
	}

	@FindBy(xpath = "(//table[@id='tab11_GridTbl_Id_P024MA']//tbody//tr[2]//td[3]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_BranchCode_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_BranchCode_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_BranchCode_609;
	}

	@FindBy(xpath = "(//table[@id='tab11_GridTbl_Id_P024MA']//tbody//tr[2]//td[4]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_CurrencyCode_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_CurrencyCode_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_CurrencyCode_609;
	}

	@FindBy(xpath = "(//table[@id='tab11_GridTbl_Id_P024MA']//tbody//tr[2]//td[5]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_GlCode_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_GlCode_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_GlCode_609;
	}

	@FindBy(xpath = "(//table[@id='tab11_GridTbl_Id_P024MA']//tbody//tr[2]//td[6]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_CifCode_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_CifCode_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_CifCode_609;
	}

	@FindBy(xpath = "(//table[@id='tab11_GridTbl_Id_P024MA']//tbody//tr[2]//td[7]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Serialno_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Serialno_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Serialno_609;
	}

	@FindBy(xpath = "(//table[@id='tab11_GridTbl_Id_P024MA']//tbody//tr[2]//td[8]//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Default_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Default_609() {
		return TransactionType_UpdateAfterApprove_AdditionalInfo_Debit_Default_609;
	}

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

	@FindBy(xpath = "//a[@id='QUER001T']")
	private WebElement Queries_StatementofAccounts_ByTradeDate_609;

	public WebElement Queries_StatementofAccounts_ByTradeDate_609() {
		return Queries_StatementofAccounts_ByTradeDate_609;
	}

	@FindBy(xpath = "//input[@id='accBr_QUER001T']")
	private WebElement Queries_StatementofAccounts_ByTradeDate_Branch_609;

	public WebElement Queries_StatementofAccounts_ByTradeDate_Branch_609() {
		return Queries_StatementofAccounts_ByTradeDate_Branch_609;
	}

	@FindBy(xpath = "//input[@id='accCy_QUER001T']")
	private WebElement Queries_StatementofAccounts_ByTradeDate_Currency_609;

	public WebElement Queries_StatementofAccounts_ByTradeDate_Currency_609() {
		return Queries_StatementofAccounts_ByTradeDate_Currency_609;
	}

	@FindBy(xpath = "//input[@id='accGl_QUER001T']")
	private WebElement Queries_StatementofAccounts_ByTradeDate_GL_609;

	public WebElement Queries_StatementofAccounts_ByTradeDate_GL_609() {
		return Queries_StatementofAccounts_ByTradeDate_GL_609;
	}

	@FindBy(xpath = "//input[@id='accCif_QUER001T']")
	private WebElement Queries_StatementofAccounts_ByTradeDate_Cif_609;

	public WebElement Queries_StatementofAccounts_ByTradeDate_Cif_609() {
		return Queries_StatementofAccounts_ByTradeDate_Cif_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_accSl_QUER001T']")
	private WebElement Queries_StatementofAccounts_ByTradeDate_SerialNumber_609;

	public WebElement Queries_StatementofAccounts_ByTradeDate_SerialNumber_609() {
		return Queries_StatementofAccounts_ByTradeDate_SerialNumber_609;
	}

	@FindBy(xpath = "//label[@id='statementOfAccountsForm_QUER001T_Retrieve_key']")
	private WebElement Queries_StatementofAccounts_ByTradeDate_Retrieve_609;

	public WebElement Queries_StatementofAccounts_ByTradeDate_Retrieve_609() {
		return Queries_StatementofAccounts_ByTradeDate_Retrieve_609;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Account_details_key']")
	private WebElement Transactions_Maintenance_AccountDetails;

	public WebElement Transactions_Maintenance_AccountDetails() {
		return Transactions_Maintenance_AccountDetails;
	}

	@FindBy(xpath = "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']/div/span")
	private WebElement Transactions_Maintenance_AccountDetails_Addicon;

	public WebElement Transactions_Maintenance_AccountDetails_Addicon() {
		return Transactions_Maintenance_AccountDetails_Addicon;
	} // (//table[@id='trxMgntAccountDtlGridTbl_Id_D001MT']/tbody/tr/td[text()='1'])[1]
		// (//table[@id='trxMgntAccountDtlGridTbl_Id_D001MT']/tbody//tr//td[text()='2'])[2]

	@FindBy(xpath = "(//table[@id='trxMgntAccountDtlGridTbl_Id_D001MT']//td[@tdlabel='Branch']//input)[1]")
	private WebElement Transactions_Maintenance_AccountDetails_Branch;

	public WebElement Transactions_Maintenance_AccountDetails_Branch() {
		return Transactions_Maintenance_AccountDetails_Branch;
	}

	@FindBy(xpath = "(//table[@id='trxMgntAccountDtlGridTbl_Id_D001MT']//td[@tdlabel='Branch']//input)[1]")
	private WebElement Transactions_Maintenance_AccountDetails2_Branch;

	public WebElement Transactions_Maintenance_AccountDetails2_Branch() {
		return Transactions_Maintenance_AccountDetails2_Branch;
	}

	@FindBy(xpath = "//td[@tdlabel='GL']//input")
	private WebElement Transactions_Maintenance_AccountDetails_GL;

	public WebElement Transactions_Maintenance_AccountDetails_GL() {
		return Transactions_Maintenance_AccountDetails_GL;
	}

	@FindBy(xpath = "//td[@tdlabel='CIF']//input")
	private WebElement Transactions_Maintenance_AccountDetails_CIF;

	public WebElement Transactions_Maintenance_AccountDetails_CIF() {
		return Transactions_Maintenance_AccountDetails_CIF;
	}

	@FindBy(xpath = "//td[@tdlabel='SL']//input")
	private WebElement Transactions_Maintenance_AccountDetails_SL;

	public WebElement Transactions_Maintenance_AccountDetails_SL() {
		return Transactions_Maintenance_AccountDetails_SL;
	}

	@FindBy(xpath = "//td[@tdlabel='Amount in Trs CY']//input")
	private WebElement Transactions_Maintenance_AccountDetails_Amount;

	public WebElement Transactions_Maintenance_AccountDetails_Amount() {
		return Transactions_Maintenance_AccountDetails_Amount;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
	private WebElement Transactions_Maintenance_BookedEntries_609;

	public WebElement Transactions_Maintenance_BookedEntries_609() {
		return Transactions_Maintenance_BookedEntries_609;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Card_No_key']")
	private WebElement Transactions_Maintenance_CardNo_609;

	public WebElement Transactions_Maintenance_CardNo_609() {
		return Transactions_Maintenance_CardNo_609;
	}

	@FindBy(xpath = "//input[@id='rqst_cy_nomination_det_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination_609;
	}

	@FindBy(xpath = "//input[@id='apply_round_chrg_denom_yn_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ApplyRoundingonCharges_609;

	public WebElement TransactionType_UpdateAfterApprove_ApplyRoundingonCharges_609() {
		return TransactionType_UpdateAfterApprove_ApplyRoundingonCharges_609;
	}

	@FindBy(xpath = "//span[text()=' CIF Charges ']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifCharges_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifCharges_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifCharges_609;
	}

	@FindBy(xpath = "//td[@id='add_tab25_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_Addicon_609;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_Addicon_609() {
		return TransactionType_UpdateAfterApprove_CifCharges_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab25_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_Deleteicon_609;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_Deleteicon_609() {
		return TransactionType_UpdateAfterApprove_CifCharges_Deleteicon_609;
	}

	@FindBy(xpath = "//table[@id='tab25_GridTbl_Id_P024MA']//td[@tdlabel='CIF Code']//input")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_CifCode_609;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_CifCode_609() {
		return TransactionType_UpdateAfterApprove_CifCharges_CifCode_609;
	}

	@FindBy(xpath = "//table[@id='tab25_GridTbl_Id_P024MA']//td[@tdlabel='Charge Schema Details']//input")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_ChargeSchema_609;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_ChargeSchema_609() {
		return TransactionType_UpdateAfterApprove_CifCharges_ChargeSchema_609;
	}

	@FindBy(xpath = "(//table[@id='tab25_GridTbl_Id_P024MA']//select)[1]")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_All_609;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_All_609() {
		return TransactionType_UpdateAfterApprove_CifCharges_All_609;
	}

	@FindBy(xpath = "(//table[@id='tab25_GridTbl_Id_P024MA']//select)[2]")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_CashAccount_609;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_CashAccount_609() {
		return TransactionType_UpdateAfterApprove_CifCharges_CashAccount_609;
	}

	@FindBy(xpath = "(//table[@id='tab25_GridTbl_Id_P024MA']//select)[3]")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_Action_609;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_Action_609() {
		return TransactionType_UpdateAfterApprove_CifCharges_Action_609;
	}

	@FindBy(xpath = "//span[text()=' CIF Types Charges ']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifTypeCharges_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifTypeCharges_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifTypeCharges_609;
	}

	@FindBy(xpath = "//td[@id='add_tab26_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Addicon_609;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Addicon_609() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab26_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Deleteicon_609;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Deleteicon_609() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_Deleteicon_609;
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

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_609;
	}
	// table[@id='chargesParamList_GridTbl_Id_C0011P']//td[text()='7']

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Charges_key']")
	private WebElement Transactions_Maintenance_Charges_609;

	public WebElement Transactions_Maintenance_Charges_609() {
		return Transactions_Maintenance_Charges_609;
	}

	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_CY_Denom_key']")
	private WebElement Transactions_Maintenance_CyDenomination_609;

	public WebElement Transactions_Maintenance_CyDenomination_609() {
		return Transactions_Maintenance_CyDenomination_609;
	}

	@FindBy(xpath = "//input[@id='controlRecord_tab_OtherInfo_O001UP']")
	private WebElement ControlRecord_UpdatedAfterApprove_OtherInformation_609;

	public WebElement ControlRecord_UpdatedAfterApprove_OtherInformation_609() {
		return ControlRecord_UpdatedAfterApprove_OtherInformation_609;
	}

	@FindBy(xpath = "//input[@id='only_rm_access_cif_acc_yn_O001UP']")
	private WebElement ControlRecord_UpdatedAfterApprove_OtherInformation_RestrictAccessToCifAcc_609;

	public WebElement ControlRecord_UpdatedAfterApprove_OtherInformation_RestrictAccessToCifAcc_609() {
		return ControlRecord_UpdatedAfterApprove_OtherInformation_RestrictAccessToCifAcc_609;
	}

	@FindBy(xpath = "//a[@id='ANC001MA']")
	private WebElement Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove_609() {
		return Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//li[@id='jvAndAccountsMain_ANC001MA']")
	private WebElement Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove_JvAccountsTab_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove_JvAccountsTab_609() {
		return Parameters_AccountParameters_AccControlRecord_UpdateAfterApprove_JvAccountsTab_609;
	}

	@FindBy(xpath = "//div[@id='div_col_jv_Inner_ANC001MA']/div[1]")
	private WebElement Parameters_AccountParameters_AccControlRecord_JvAccounts_Jv_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_JvAccounts_Jv_609() {
		return Parameters_AccountParameters_AccControlRecord_JvAccounts_Jv_609;
	}

	@FindBy(xpath = "//input[@id='activate_dor_acc_ANC001MA']")
	private WebElement Parameters_AccountParameters_AccControlRecord_JvAccounts_Jv_ActivateDormantAcc_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_JvAccounts_Jv_ActivateDormantAcc_609() {
		return Parameters_AccountParameters_AccControlRecord_JvAccounts_Jv_ActivateDormantAcc_609;
	}

	@FindBy(xpath = "//label[@id='accControlRecordMaintFormId_ANC001MA_update_key']")
	private WebElement Parameters_AccountParameters_AccControlRecord_JvAccounts_Jv_UpdateBtn_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_JvAccounts_Jv_UpdateBtn_609() {
		return Parameters_AccountParameters_AccControlRecord_JvAccounts_Jv_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='ANC001P']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Approve_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_Approve_609() {
		return Parameters_AccountParameters_AccControlRecord_Approve_609;
	}

	@FindBy(xpath = "//label[@id='accControlRecordMaintFormId_ANC001P_approve_key']")
	private WebElement Parameters_AccountParameters_AccControlRecord_Approve_ApproveBtn_609;

	public WebElement Parameters_AccountParameters_AccControlRecord_Approve_ApproveBtn_609() {
		return Parameters_AccountParameters_AccControlRecord_Approve_ApproveBtn_609;
	}

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

	@FindBy(xpath = "//a[@id='A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_609() {
		return Accounts_GeneralAccounts_Maintenance_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Maintenance_CifCodeGrid_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_CifCodeGrid_609() {
		return Accounts_GeneralAccounts_Maintenance_CifCodeGrid_609;
	}

	@FindBy(xpath = "//input[@id='generalAccountsGridTbl_Id_A002MA_gs_amfVO.CIF_SUB_NO']")
	private WebElement Accounts_GeneralAccounts_Maintenance_CifCode_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_CifCode_609() {
		return Accounts_GeneralAccounts_Maintenance_CifCode_609;
	}

	@FindBy(xpath = "//input[@id='statusDesc_A002MA']")
	private WebElement Accounts_GeneralAccounts_Maintenance_Status_609;

	public WebElement Accounts_GeneralAccounts_Maintenance_Status_609() {
		return Accounts_GeneralAccounts_Maintenance_Status_609;
	}

	@FindBy(xpath = "//input[@id='back_dated_vdate_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_Update_AllowBackDatedValue;

	public WebElement Parameters_SystemParameters_TransactionType_Update_AllowBackDatedValue() {
		return Parameters_SystemParameters_TransactionType_Update_AllowBackDatedValue;
	}

	@FindBy(xpath = "//input[@id='post_dated_vdate_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_Update_AllowPostDatedValue_609;

	public WebElement Parameters_SystemParameters_TransactionType_Update_AllowPostDatedValue_609() {
		return Parameters_SystemParameters_TransactionType_Update_AllowPostDatedValue_609;
	}

	@FindBy(xpath = "//input[@id='value_date_D001MT']")
	private WebElement Transaction_Maintance_ValueDate_609;

	public WebElement Transaction_Maintance_ValueDate_609() {
		return Transaction_Maintance_ValueDate_609;
	}

	@FindBy(xpath = "//select[@id='cash_deduct_ind_D001MT']")
	private WebElement Transactions_Maintenance_ChargesDetails_609;

	public WebElement Transactions_Maintenance_ChargesDetails_609() {
		return Transactions_Maintenance_ChargesDetails_609;
	}

	@FindBy(xpath = "//div[@id='_selenuimC0012']")
	private WebElement Charges_MaintenanceofChargesSchema_609;

	public WebElement Charges_MaintenanceofChargesSchema_609() {
		return Charges_MaintenanceofChargesSchema_609;
	}

	@FindBy(xpath = "//a[@id='C0012MA']")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_609;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_609() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromDebtorAccount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromDebtorAccount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromDebtorAccount_609;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='Warn User If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_Limits_WarnUserifLimitExceed_609;

	public WebElement User_UpdateAfterApprove_Limits_WarnUserifLimitExceed_609() {
		return User_UpdateAfterApprove_Limits_WarnUserifLimitExceed_609;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='Proceed If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_Limits_ProceedifLimitExceed_609;

	public WebElement User_UpdateAfterApprove_Limits_ProceedifLimitExceed_609() {
		return User_UpdateAfterApprove_Limits_ProceedifLimitExceed_609;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='Deposit Limit']//input")
	private WebElement User_UpdateAfterApprove_Limits_DepositLimit_609;

	public WebElement User_UpdateAfterApprove_Limits_DepositLimit_609() {
		return User_UpdateAfterApprove_Limits_DepositLimit_609;
	}

	// ---------- Account Type

	@FindBy(xpath = "//span[text()=' Account Types ']")
	private WebElement User_UpdateAfterApprove_AccountType_609;

	public WebElement User_UpdateAfterApprove_AccountType_609() {
		return User_UpdateAfterApprove_AccountType_609;
	}

	@FindBy(xpath = "//td[@id='del_tab4_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_AccountType_DeleteBtn_609;

	public WebElement User_UpdateAfterApprove_AccountType_DeleteBtn_609() {
		return User_UpdateAfterApprove_AccountType_DeleteBtn_609;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_E000MA']//td[@tdlabel='Account Type']//input")
	private WebElement User_UpdateAfterApprove_AccountType_AccountTypes_609;

	public WebElement User_UpdateAfterApprove_AccountType_AccountTypes_609() {
		return User_UpdateAfterApprove_AccountType_AccountTypes_609;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_E000MA']//td[@tdlabel='Transaction']//input")
	private WebElement User_UpdateAfterApprove_AccountType_Transaction_609;

	public WebElement User_UpdateAfterApprove_AccountType_Transaction_609() {
		return User_UpdateAfterApprove_AccountType_Transaction_609;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_E000MA']//td[@tdlabel='W/D Limit']//input")
	private WebElement User_UpdateAfterApprove_AccountType_WithDrawLimit_609;

	public WebElement User_UpdateAfterApprove_AccountType_WithDrawLimit_609() {
		return User_UpdateAfterApprove_AccountType_WithDrawLimit_609;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_E000MA']//td[@tdlabel='Deposit Limit']//input")
	private WebElement User_UpdateAfterApprove_AccountType_DepositLimit_609;

	public WebElement User_UpdateAfterApprove_AccountType_DepositLimit_609() {
		return User_UpdateAfterApprove_AccountType_DepositLimit_609;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_E000MA']//td[@tdlabel='Overdraw Limit']//input")
	private WebElement User_UpdateAfterApprove_AccountType_OverDrawLimit_609;

	public WebElement User_UpdateAfterApprove_AccountType_OverDrawLimit_609() {
		return User_UpdateAfterApprove_AccountType_OverDrawLimit_609;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_E000MA']//td[@tdlabel='Warn User If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_AccountType_WarnUserIfLimitExceed_609;

	public WebElement User_UpdateAfterApprove_AccountType_WarnUserIfLimitExceed_609() {
		return User_UpdateAfterApprove_AccountType_WarnUserIfLimitExceed_609;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_E000MA']//td[@tdlabel='Proceed If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_AccountType_proceedIfLimitExceed_609;

	public WebElement User_UpdateAfterApprove_AccountType_proceedIfLimitExceed_609() {
		return User_UpdateAfterApprove_AccountType_proceedIfLimitExceed_609;
	}

	// ------cif

	@FindBy(xpath = "//span[text()=' CIF Types ']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_CifTypes_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_CifTypes_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_CifTypes_609;
	}

	@FindBy(xpath = "//td[@id='add_tab5_C_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_CifTypes_Addicon_609;

	public WebElement User_UpdateAfterApprove_CifTypes_Addicon_609() {
		return User_UpdateAfterApprove_CifTypes_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab5_C_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_CifTypes_Deleteicon_609;

	public WebElement User_UpdateAfterApprove_CifTypes_Deleteicon_609() {
		return User_UpdateAfterApprove_CifTypes_Deleteicon_609;
	}

	@FindBy(xpath = "//table[@id='tab5_C_GridTbl_Id_E000MA']//td[@tdlabel='Code']//input")
	private WebElement User_UpdateAfterApprove_CifTypes_CifCode_609;

	public WebElement User_UpdateAfterApprove_CifTypes_CifCode_609() {
		return User_UpdateAfterApprove_CifTypes_CifCode_609;
	}

	@FindBy(xpath = "//table[@id='tab5_C_GridTbl_Id_E000MA']//td[@tdlabel='Transaction']//input")
	private WebElement User_UpdateAfterApprove_CifTypes_TrxType_609;

	public WebElement User_UpdateAfterApprove_CifTypes_TrxType_609() {
		return User_UpdateAfterApprove_CifTypes_TrxType_609;
	}

	@FindBy(xpath = "//table[@id='tab5_C_GridTbl_Id_E000MA']//td[@tdlabel='Withdraw Limit']//input")
	private WebElement User_UpdateAfterApprove_CifTypes_WithdrawLimit_609;

	public WebElement User_UpdateAfterApprove_CifTypes_WithdrawLimit_609() {
		return User_UpdateAfterApprove_CifTypes_WithdrawLimit_609;
	}

	@FindBy(xpath = "//table[@id='tab5_C_GridTbl_Id_E000MA']//td[@tdlabel='Deposit Limit']//input")
	private WebElement User_UpdateAfterApprove_CifTypes_DepositLimit_609;

	public WebElement User_UpdateAfterApprove_CifTypes_DepositLimit_609() {
		return User_UpdateAfterApprove_CifTypes_DepositLimit_609;
	}

	@FindBy(xpath = "//table[@id='tab5_C_GridTbl_Id_E000MA']//td[@tdlabel='Warn User If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_CifTypes_WarnUserifLimitExceed_609;

	public WebElement User_UpdateAfterApprove_CifTypes_WarnUserifLimitExceed_609() {
		return User_UpdateAfterApprove_CifTypes_WarnUserifLimitExceed_609;
	}

	@FindBy(xpath = "//table[@id='tab5_C_GridTbl_Id_E000MA']//td[@tdlabel='Proceed If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_CifTypes_ProceedifLimitExceed_609;

	public WebElement User_UpdateAfterApprove_CifTypes_ProceedifLimitExceed_609() {
		return User_UpdateAfterApprove_CifTypes_ProceedifLimitExceed_609;
	}

	/// ***Priority***///

	@FindBy(xpath = "//span[text()=' Priority ']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Priority;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Priority() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_Priority;
	}

	@FindBy(xpath = "//td[@id='add_tab5_P_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_Priority_Addicon;

	public WebElement User_UpdateAfterApprove_Priority_Addicon() {
		return User_UpdateAfterApprove_Priority_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab5_P_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_Priority_Deleteicon;

	public WebElement User_UpdateAfterApprove_Priority_Deleteicon() {
		return User_UpdateAfterApprove_Priority_Deleteicon;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Priority']//input")
	private WebElement User_UpdateAfterApprove_Priority_Priority;

	public WebElement User_UpdateAfterApprove_Priority_Priority() {
		return User_UpdateAfterApprove_Priority_Priority;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Transaction']//input")
	private WebElement User_UpdateAfterApprove_Priority_TrxType;

	public WebElement User_UpdateAfterApprove_Priority_TrxType() {
		return User_UpdateAfterApprove_Priority_TrxType;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='W/D Limit']//input")
	private WebElement User_UpdateAfterApprove_Priority_WithdrawalLimit_609;

	public WebElement User_UpdateAfterApprove_Priority_WithdrawalLimit_609() {
		return User_UpdateAfterApprove_Priority_WithdrawalLimit_609;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Warn User If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_Priority_WarnUserifLimitExceed_609;

	public WebElement User_UpdateAfterApprove_Priority_WarnUserifLimitExceed_609() {
		return User_UpdateAfterApprove_Priority_WarnUserifLimitExceed_609;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Proceed If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_Priority_ProceedifLimitExceed_609;

	public WebElement User_UpdateAfterApprove_Priority_ProceedifLimitExceed_609() {
		return User_UpdateAfterApprove_Priority_ProceedifLimitExceed_609;
	}

	@FindBy(xpath = "//span[text()=' Eco Sector ']")
	private WebElement User_UpdateAfterApprove_EcoSector_609;

	public WebElement User_UpdateAfterApprove_EcoSector_609() {
		return User_UpdateAfterApprove_EcoSector_609;
	}

	@FindBy(xpath = "//td[@id='add_tab5_E_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_EcoSector_Addicon_609;

	public WebElement User_UpdateAfterApprove_EcoSector_Addicon_609() {
		return User_UpdateAfterApprove_EcoSector_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab5_E_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_EcoSector_Deleteicon_609;

	public WebElement User_UpdateAfterApprove_EcoSector_Deleteicon_609() {
		return User_UpdateAfterApprove_EcoSector_Deleteicon_609;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Eco Sector']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_EcoSector_609;

	public WebElement User_UpdateAfterApprove_EcoSector_EcoSector_609() {
		return User_UpdateAfterApprove_EcoSector_EcoSector_609;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Transaction']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_Transaction_609;

	public WebElement User_UpdateAfterApprove_EcoSector_Transaction_609() {
		return User_UpdateAfterApprove_EcoSector_Transaction_609;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='W/D Limit']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_WithdrawLimit_609;

	public WebElement User_UpdateAfterApprove_EcoSector_WithdrawLimit_609() {
		return User_UpdateAfterApprove_EcoSector_WithdrawLimit_609;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Deposit Limit']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_DepositLimit_609;

	public WebElement User_UpdateAfterApprove_EcoSector_DepositLimit_609() {
		return User_UpdateAfterApprove_EcoSector_DepositLimit_609;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Overdraw Limit']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_OverdrawLimit_609;

	public WebElement User_UpdateAfterApprove_EcoSector_OverdrawLimit_609() {
		return User_UpdateAfterApprove_EcoSector_OverdrawLimit_609;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Warn User If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_EcoSector_WarnifUserLimitExceed_609;

	public WebElement User_UpdateAfterApprove_EcoSector_WarnifUserLimitExceed_609() {
		return User_UpdateAfterApprove_EcoSector_WarnifUserLimitExceed_609;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Proceed If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_EcoSector_ProceedifLimitExceed_609;

	public WebElement User_UpdateAfterApprove_EcoSector_ProceedifLimitExceed_609() {
		return User_UpdateAfterApprove_EcoSector_ProceedifLimitExceed_609;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Deposit Limit']//input")
	private WebElement User_UpdateAfterApprove_Priority_DepositLimit_609;

	public WebElement User_UpdateAfterApprove_Priority_DepositLimit_609() {
		return User_UpdateAfterApprove_Priority_DepositLimit_609;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//td//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CifType_609;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CifType_609() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_CifType_609;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//td//input)[2]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_ChargeSchema_609;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_ChargeSchema_609() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_ChargeSchema_609;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//select)[1]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_All_609;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_All_609() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_All_609;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//select)[2]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CashAccount_609;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CashAccount_609() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_CashAccount_609;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//select)[3]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Action_609;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Action_609() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_Action_609;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA2']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromCreditAccount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromCreditAccount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromCreditAccount_609;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA4']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromTellerAccount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromTellerAccount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromTellerAccount_609;
	}

	@FindBy(xpath = "//select[@id='trsfr_method_D001MT']")
	private WebElement Transactions_Maintenance_ModeofPayment_609;

	public WebElement Transactions_Maintenance_ModeofPayment_609() {
		return Transactions_Maintenance_ModeofPayment_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntBatchGridTbl_Id_D001MT_gs_ctstrsCHARGESDETVO.DEDUCT_FROM_ACC_BR']")
	private WebElement Transactions_Maintenance_ChargesBranchCode_609;

	public WebElement Transactions_Maintenance_ChargesBranchCode_609() {
		return Transactions_Maintenance_ChargesBranchCode_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntBatchGridTbl_Id_D001MT_gs_ctstrsCHARGESDETVO.DEDUCT_FROM_ACC_CY']")
	private WebElement Transactions_Maintenance_ChargesCurrencyCode_609;

	public WebElement Transactions_Maintenance_ChargesCurrencyCode_609() {
		return Transactions_Maintenance_ChargesCurrencyCode_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntBatchGridTbl_Id_D001MT_gs_ctstrsCHARGESDETVO.DEDUCT_FROM_ACC_GL']")
	private WebElement Transactions_Maintenance_ChargesGlCode_609;

	public WebElement Transactions_Maintenance_ChargesGlCode_609() {
		return Transactions_Maintenance_ChargesGlCode_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntBatchGridTbl_Id_D001MT_gs_ctstrsCHARGESDETVO.DEDUCT_FROM_ACC_CIF']")
	private WebElement Transactions_Maintenance_ChargesCifCode_609;

	public WebElement Transactions_Maintenance_ChargesCifCode_609() {
		return Transactions_Maintenance_ChargesCifCode_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntBatchGridTbl_Id_D001MT_gs_ctstrsCHARGESDETVO.DEDUCT_FROM_ACC_SL']")
	private WebElement Transactions_Maintenance_ChargesSerialNo_609;

	public WebElement Transactions_Maintenance_ChargesSerialNo_609() {
		return Transactions_Maintenance_ChargesSerialNo_609;
	}

	@FindBy(xpath = "//input[@id='chq_num_D001MT']")
	private WebElement Transactions_Maintenance_ChequeNo_609;

	public WebElement Transactions_Maintenance_ChequeNo_609() {
		return Transactions_Maintenance_ChequeNo_609;
	}

	@FindBy(xpath = "//div[@id='panel_4_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_MainDetails;

	public WebElement Parameters_SystemParameters_TransactionType_MainDetails() {
		return Parameters_SystemParameters_TransactionType_MainDetails;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.avail_bal']")
	private WebElement Transactions_Maintenance_AvailableBalance_609;

	public WebElement Transactions_Maintenance_AvailableBalance_609() {
		return Transactions_Maintenance_AvailableBalance_609;
	}

	@FindBy(xpath = "//input[@id='avail_bal_after_D001MT']")
	private WebElement Transactions_Maintenance_AvailableBalanceAfter_609;

	public WebElement Transactions_Maintenance_AvailableBalanceAfter_609() {
		return Transactions_Maintenance_AvailableBalanceAfter_609;
	}

	@FindBy(xpath = "//select[@id='rejectReason_D001AU_ALERT']")
	private WebElement BMUserAlert_OpenItems_RejectReason_609;

	public WebElement BMUserAlert_OpenItems_RejectReason_609() {
		return BMUserAlert_OpenItems_RejectReason_609;
	}

	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001AU_ALERT']")
	private WebElement BMUserAlert_OpenItems_ModifyReason_609;

	public WebElement BMUserAlert_OpenItems_ModifyReason_609() {
		return BMUserAlert_OpenItems_ModifyReason_609;
	}

	@FindBy(xpath = "//button[@id='alertsOpenItemReject_RCVALERT']")
	private WebElement BMUserAlert_OpenItems_RejectButton_609;

	public WebElement BMUserAlert_OpenItems_RejectButton_609() {
		return BMUserAlert_OpenItems_RejectButton_609;
	}

	@FindBy(xpath = "//a[@id='trxMgntAlertModifyButton_RCVALERT']")
	private WebElement BMUserAlert_OpenItems_ModifyButton_609;

	public WebElement BMUserAlert_OpenItems_ModifyButton_609() {
		return BMUserAlert_OpenItems_ModifyButton_609;
	}

	@FindBy(xpath = "//span[text()=' Gl Charges ']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_GLCharges_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_GLCharges_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_GLCharges_609;
	}

	@FindBy(xpath = "//td[@id='add_tab27_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_Addicon_609;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_Addicon_609() {
		return TransactionType_UpdateAfterApprove_GLCharges_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab27_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_Deleteicon_609;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_Deleteicon_609() {
		return TransactionType_UpdateAfterApprove_GLCharges_Deleteicon_609;
	}

	@FindBy(xpath = "//table[@id='tab27_GridTbl_Id_P024MA']//td[@tdlabel='GL Code']//input")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_GLCode_609;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_GLCode_609() {
		return TransactionType_UpdateAfterApprove_GLCharges_GLCode_609;
	}

	@FindBy(xpath = "//table[@id='tab27_GridTbl_Id_P024MA']//td[@tdlabel='Charge Schema Details']//input")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_ChargeSchema_609;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_ChargeSchema_609() {
		return TransactionType_UpdateAfterApprove_GLCharges_ChargeSchema_609;
	}

	@FindBy(xpath = "(//table[@id='tab27_GridTbl_Id_P024MA']//select)[1]")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_All_609;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_All_609() {
		return TransactionType_UpdateAfterApprove_GLCharges_All_609;
	}

	@FindBy(xpath = "(//table[@id='tab27_GridTbl_Id_P024MA']//select)[2]")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_CashAccount_609;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_CashAccount_609() {
		return TransactionType_UpdateAfterApprove_GLCharges_CashAccount_609;
	}

	@FindBy(xpath = "(//table[@id='tab27_GridTbl_Id_P024MA']//select)[3]")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_Action_609;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_Action_609() {
		return TransactionType_UpdateAfterApprove_GLCharges_Action_609;
	}

	@FindBy(xpath = "//textarea[@name='trxMgntCO.statusReason']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectReason_609;

	public WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectReason_609() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectReason_609;
	}

	@FindBy(xpath = "//label[@id='Reject_Key']")
	private WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectKey_609;

	public WebElement BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectKey_609() {
		return BMUser_Alert_EnterTRXNo_selectRecord_OpenItems_RejectKey_609;
	}

	@FindBy(xpath = "//span[contains(text(),' Transaction Status ')]")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus_609;
	}

	@FindBy(xpath = "//td[@id='del_tab31_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Deleteicon_609;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Deleteicon_609() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Deleteicon_609;
	}

	@FindBy(xpath = "//td[@id='add_tab31_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Addicon_609;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Addicon_609() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Addicon_609;
	}

	// Alert Activation

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA0']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cash_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cash_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cash_609;
	}

	// --

	@FindBy(xpath = "//a[@id='D001ZN']//span[text()='Cancel']")
	private WebElement Transactions_Cancel_609;

	public WebElement Transactions_Cancel_609() {
		return Transactions_Cancel_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001ZN_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Cancel_Code_609;

	public WebElement Transactions_Cancel_Code_609() {
		return Transactions_Cancel_Code_609;
	}
	// table[@id='trxMgntGridTbl_Id_D001ZN']//td[text()='10385']

	@FindBy(xpath = "//select[@id='holdReason_D001ZN']")
	private WebElement Transactions_Cancel_Reason_609;

	public WebElement Transactions_Cancel_Reason_609() {
		return Transactions_Cancel_Reason_609;
	}// 1

	@FindBy(xpath = "//span[contains(text(),' Cancel ')]")
	private WebElement Transactions_Cancel_CancelBtn_609;

	public WebElement Transactions_Cancel_CancelBtn_609() {
		return Transactions_Cancel_CancelBtn_609;
	}

	@FindBy(xpath = "//a[@id='D001CN']")
	private WebElement Transactions_ApproveCancel_609;

	public WebElement Transactions_ApproveCancel_609() {
		return Transactions_ApproveCancel_609;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001CN_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApproveCancel_Code_609;

	public WebElement Transactions_ApproveCancel_Code_609() {
		return Transactions_ApproveCancel_Code_609;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001CN']//td[text()='10387'])[1]

	@FindBy(xpath = "//span[contains(text(),' Approve Cancel ')]")
	private WebElement Transactions_ApproveCancel_ApproveCancelBtn_609;

	public WebElement Transactions_ApproveCancel_ApproveCancelBtn_609() {
		return Transactions_ApproveCancel_ApproveCancelBtn_609;
	}

	@FindBy(xpath = "//select[@id='view_dormant_acc_E000MA']")
	private WebElement SystemParametersUser_UpdateAfterApprove_DormatAC_609;

	public WebElement SystemParametersUser_UpdateAfterApprove_DormatAC_609() {
		return SystemParametersUser_UpdateAfterApprove_DormatAC_609;
	}

	@FindBy(xpath = "//div[contains(text(),'User does not have access to make a Transaction on his own Account')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transactions_UserDoesnothaveAccessToTrxValidaytionPopup;

	public WebElement transactionsUserDoesnothaveAccessToTrxValidaytionPopup() {
		return transactions_UserDoesnothaveAccessToTrxValidaytionPopup;
	}

	@FindBy(id = "lookuptxt_CIF_NO_P005P")
	private WebElement user_ApprovalCIFNumberInput;

	public WebElement userApprovalCIFNumberInput() {
		return user_ApprovalCIFNumberInput;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']//div[@class='jMsgbox-contentWrap']")
	private WebElement Transaction_success_popup_text_msg;

	public WebElement Transaction_success_popup_text_msg() {
		return Transaction_success_popup_text_msg;
	}

	@FindBy(xpath = "//a[@id='accountCharges_btn_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_609;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C Br']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Branch_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Branch_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Branch_609;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C Cy']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Currency_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Currency_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Currency_609;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C Gl']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_GL_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_GL_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_GL_609;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C CIF']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_CIF_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_CIF_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_CIF_609;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C SL']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Serial_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Serial_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Serial_609;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='Reasons']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Reason_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Reason_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Reason_609;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='Charge Schema Details']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Charge_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Charge_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Charge_609;
	}

	@FindBy(xpath = "(//table[@id='tab24_GridTbl_Id_P024MA']//select)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_All_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_All_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_All_609;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='Cash / Account']//select")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_CashAccount_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_CashAccount_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_CashAccount_609;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='action']//select")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Action_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Action_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Action_609;
	}

	@FindBy(xpath = "//td[@id='add_tab24_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Addicon_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Addicon_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab24_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Deleteicon_609;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Deleteicon_609() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Deleteicon_609;
	}

	@FindBy(xpath = "//input[@id='deduct_customer_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCustomerAccount_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCustomerAccount_609() {
		return TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCustomerAccount_609;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA1']")
	private WebElement TransactionType_UpdateAfterApprove_DeductfromCustomerAccountRadio_609;

	public WebElement TransactionType_UpdateAfterApprove_DeductfromCustomerAccountRadio_609() {
		return TransactionType_UpdateAfterApprove_DeductfromCustomerAccountRadio_609;
	}

	@FindBy(xpath = "//input[@id='not_use_in_trx_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_NottobeusedinTransaction_609;

	public WebElement TransactionType_UpdateAfterApprove_NottobeusedinTransaction_609() {
		return TransactionType_UpdateAfterApprove_NottobeusedinTransaction_609;
	}

	@FindBy(xpath = "//input[@id='deduct_creditor_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCreditorAccount_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCreditorAccount_609() {
		return TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCreditorAccount_609;
	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromDebitorAccount_609;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromDebitorAccount_609() {
		return TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromDebitorAccount_609;
	}

	/// ***Sprint 65

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_Maintenance_Currency_609;

	public WebElement Transactions_Maintenance_Currency_609() {
		return Transactions_Maintenance_Currency_609;
	}

	@FindBy(xpath = "//input[@id='same_acc_cy_trs_cy_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_SameAccandTrxCurrency_609;

	public WebElement TransactionType_UpdateAfterApprove_SameAccandTrxCurrency_609() {
		return TransactionType_UpdateAfterApprove_SameAccandTrxCurrency_609;
	}

	@FindBy(xpath = "//input[@id='show_fees_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ShowFeesinSOA_609;

	public WebElement TransactionType_UpdateAfterApprove_ShowFeesinSOA_609() {
		return TransactionType_UpdateAfterApprove_ShowFeesinSOA_609;
	}

	@FindBy(xpath = "//input[@id='proceed_cif_incative_yn_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ProceedifCIFinactive_609;

	public WebElement TransactionType_UpdateAfterApprove_ProceedifCIFinactive_609() {
		return TransactionType_UpdateAfterApprove_ProceedifCIFinactive_609;
	}

	@FindBy(xpath = "//input[@id='exch_rate_update_warn_msg_yn_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ExchangeRateWarningpopup_609;

	public WebElement TransactionType_UpdateAfterApprove_ExchangeRateWarningpopup_609() {
		return TransactionType_UpdateAfterApprove_ExchangeRateWarningpopup_609;
	}

	@FindBy(xpath = "//input[@id='inverseExchangeRate_D001MT']")
	private WebElement Transactions_Maintenance_InverseExchangeRate_609;

	public WebElement Transactions_Maintenance_InverseExchangeRate_609() {
		return Transactions_Maintenance_InverseExchangeRate_609;
	}

	@FindBy(xpath = "//input[@id='default_trscy_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_SetDefaultTrxCurrency_609;

	public WebElement TransactionType_UpdateAfterApprove_SetDefaultTrxCurrency_609() {
		return TransactionType_UpdateAfterApprove_SetDefaultTrxCurrency_609;
	}

	// 65j

	@FindBy(xpath = "//label[contains(text(),'Show All Trx')]//parent::td//preceding-sibling::td//input[1]")
	private WebElement User_UpdateAfterApprove_userAccess_ShowAllTrxFlag;

	public WebElement User_UpdateAfterApprove_userAccess_ShowAllTrxFlag() {
		return User_UpdateAfterApprove_userAccess_ShowAllTrxFlag;
	}

	@FindBy(xpath = "//input[@name='tellerparamCO.ctstellerVO.SHOW_TODAY_TRX']")
	private WebElement User_UpdateAfterApprove_user_ShowTodayTrxFlg;

	public WebElement User_UpdateAfterApprove_user_ShowTodayTrxFlg() {
		return User_UpdateAfterApprove_user_ShowTodayTrxFlg;
	}

	@FindBy(xpath = "//a[contains(text(),' Search ')]")
	private WebElement csm_SearchButton;

	public WebElement csm_SearchButton() {
		return csm_SearchButton;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-refresh']")
	private WebElement csm_GridClearButton;

	public WebElement csm_GridClearButton() {
		return csm_GridClearButton;
	}

	@FindBy(xpath = "(//td[@tdlabel='Transaction No'])[1]")
	private WebElement isTransactionData_AvailableInCSM;

	public WebElement isTransactionData_AvailableInCSM() {
		return isTransactionData_AvailableInCSM;
	}

	@FindBy(xpath = "//input[@name='TRS_DATE']")
	private WebElement transaction_SearchTransactionDate;

	public WebElement transaction_SearchTransactionDate() {
		return transaction_SearchTransactionDate;
	}

	@FindBy(xpath = "//input[@name='TRS_NO']")
	private WebElement transaction_SearchTransactionNo;

	public WebElement transaction_SearchTransactionNo() {
		return transaction_SearchTransactionNo;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='% Override']//input")
	private WebElement User_UpdateAfterApprove_Limits_PercentageOverride_610;

	public WebElement User_UpdateAfterApprove_Limits_PercentageOverride_610() {
		return User_UpdateAfterApprove_Limits_PercentageOverride_610;
	}

	@FindBy(xpath = "//table[@ID='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Priority' and text()='1']")
	private WebElement User_UpdateAfterApprove_SelectPriorityOne_610;

	public WebElement User_UpdateAfterApprove_SelectPriorityOne_610() {
		return User_UpdateAfterApprove_SelectPriorityOne_610;
	}

	@FindBy(xpath = "//td[contains(@id,'GridTbl_Id_P024MA_1_rn')]")
	private WebElement csm_TransactionType_CifTypeCharges_SelectedRow_Delete;

	public WebElement csmTransactionTypeCifTypeChargesSelectedRowDelete() {
		return csm_TransactionType_CifTypeCharges_SelectedRow_Delete;
	}

	@FindBy(xpath = "//div[contains(@aria-labelledby,'transactionTypes_popupCifPriorityCharges_div_P024MA')]//td[@title='Delete selected row']")
	private WebElement csm_TransactionType_CifTypeCharges_DeleteButton;

	public WebElement csmTransactionTypeCifTypeChargesDeleteButton() {
		return csm_TransactionType_CifTypeCharges_DeleteButton;
	}

	@FindBy(xpath = "//div[contains(@aria-labelledby,'transactionTypes_popupCifPriorityCharges_div_P024MA')]//td[@title='Add new row']")
	private WebElement csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_AddButton;

	public WebElement csmSystemParametersTransactionTypeUACifPriorityChargesAddButton() {
		return csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_AddButton;
	}

	@FindBy(xpath = "//select[contains(@id,'ctstrxtypeChargesVO.CHARGES_CY_POLICY')]")
	private WebElement csm_SystemParameters_TransactionTypeUA_GlCharges_Select_Input;

	public WebElement csmSystemParametersTransactionTypeUAGlChargesSelectInput() {
		return csm_SystemParameters_TransactionTypeUA_GlCharges_Select_Input;
	}

	@FindBy(xpath = "//button[contains(@id,'ok_btn')]")
	private WebElement csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_Ok_Btn;

	public WebElement csmSystemParametersTransactionTypeUACifPriorityChargesOkBtn() {
		return csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_Ok_Btn;
	}

	@FindBy(id = "b_link_transaction_P024MA")
	private WebElement csm_SystemParameters_TransactionTypeUA_Link_Transaction_Btn;

	public WebElement csm_SystemParameters_TransactionTypeUA_Link_Transaction_Btn() {
		return csm_SystemParameters_TransactionTypeUA_Link_Transaction_Btn;
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

	@FindBy(xpath = "//a[contains(text(),'Transactions / Approve')]//parent::td//following-sibling::td//span")
	private WebElement transaction_ApproveTransactionTab;

	public WebElement transactionApproveTransactionTabClose() {
		return transaction_ApproveTransactionTab;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Reverse']")
	private WebElement transaction_ReverseScreen;

	public WebElement transactionReverseScreen() {
		return transaction_ReverseScreen;
	}

	@FindBy(name = "TRS_NO")
	private WebElement transactionApprove_TransactionNoSearch;

	public WebElement transactionApproveTransactionNoSearch() {
		return transactionApprove_TransactionNoSearch;
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

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement transaction_TransactionTypeInput;

	public WebElement transactionTransactionTypeInput() {
		return transaction_TransactionTypeInput;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Reverse')]//parent::td//following-sibling::td//span")
	private WebElement close_TransactionReverseScreen;

	public WebElement closeTransactionReverseScreen() {
		return close_TransactionReverseScreen;
	}

	@FindBy(xpath = "//span[contains(text(),' Reverse ')]//parent::button")
	private WebElement reverse_ReverseButton;

	public WebElement reverseReverseButton() {
		return reverse_ReverseButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Approve Reverse')]//parent::td//following-sibling::td//span")
	private WebElement close_TransactionApproveReverseScreen;

	public WebElement closeTransactionApproveReverseScreen() {
		return close_TransactionApproveReverseScreen;
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

	@FindBy(xpath = "//td[text()='Reversed']")
	private WebElement transaction_TransactionReversedStatus;

	public WebElement transactionTransactionReversedStatus() {
		return transaction_TransactionReversedStatus;
	}

	@FindBy(xpath = "//div[contains(text(),'Changes made, are you sure you want to quit')]//parent::div//following-sibling::center//input[1]")
	private WebElement csmCommon_UpdateScreenQuitOkButton;

	public WebElement csmCommonUpdateScreenQuitOkButtton() {
		return csmCommon_UpdateScreenQuitOkButton;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_E000MA']//td[@tdlabel='View A/C Position']//input[@prevvalue=1]")
	private WebElement User_UpdateAfterApprove_AccType_ViewAccPosition_609;

	public WebElement User_UpdateAfterApprove_AccType_ViewAccPosition_609() {
		return User_UpdateAfterApprove_AccType_ViewAccPosition_609;
	}

	@FindBy(xpath = "//table[@id='tab5_C_GridTbl_Id_E000MA']//td[@tdlabel='View A/C Position']//input[@prevvalue=1]")
	private WebElement User_UpdateAfterApprove_CifType_ViewAccPosition_609;

	public WebElement User_UpdateAfterApprove_CifType_ViewAccPosition_609() {
		return User_UpdateAfterApprove_CifType_ViewAccPosition_609;
	}

	/// **Template entries

	@FindBy(xpath = "//td[text()='Template Entries']")
	private WebElement Parameters_SystemParameters_TemplateEntries_609;

	public WebElement Parameters_SystemParameters_TemplateEntries_609() {
		return Parameters_SystemParameters_TemplateEntries_609;
	}

	@FindBy(xpath = "//a[@id='P0070MA']")
	private WebElement TemplateEntries_UpdateAfterApprove_609;

	public WebElement TemplateEntries_UpdateAfterApprove_609() {
		return TemplateEntries_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='templateEntriesList_GridTbl_Id_P0070MA_gs_ctstrsdetTemplateVO.CODE']")
	private WebElement TemplateEntries_UpdateAfterApprove_Code_609;

	public WebElement TemplateEntries_UpdateAfterApprove_Code_609() {
		return TemplateEntries_UpdateAfterApprove_Code_609;
	}
	// (//table[@id='templateEntriesList_GridTbl_Id_P0070MA']//td[text()='50'])[1]

	// Authorizing

	@FindBy(xpath = "//td[@id='add_tab3_GridTbl_Id_P0070MA']/div/span")
	private WebElement TemplateEntries_UpdateAfterApprove_Addicon_609;

	public WebElement TemplateEntries_UpdateAfterApprove_Addicon_609() {
		return TemplateEntries_UpdateAfterApprove_Addicon_609;
	}
	// tr -> i = 2,3..

	@FindBy(xpath = "//td[@id='del_tab3_GridTbl_Id_P0070MA']/div/span")
	private WebElement TemplateEntries_UpdateAfterApprove_Deleteicon_609;

	public WebElement TemplateEntries_UpdateAfterApprove_Deleteicon_609() {
		return TemplateEntries_UpdateAfterApprove_Deleteicon_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Line Order']//input")
	private WebElement TemplateEntries_UpdateAfterApprove_LineOrder_609;

	public WebElement TemplateEntries_UpdateAfterApprove_LineOrder_609() {
		return TemplateEntries_UpdateAfterApprove_LineOrder_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Group No.']//input")
	private WebElement TemplateEntries_UpdateAfterApprove_GroupNo_609;

	public WebElement TemplateEntries_UpdateAfterApprove_GroupNo_609() {
		return TemplateEntries_UpdateAfterApprove_GroupNo_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Amount Sign']//Select")
	private WebElement TemplateEntries_UpdateAfterApprove_AmountSign_609;

	public WebElement TemplateEntries_UpdateAfterApprove_AmountSign_609() {
		return TemplateEntries_UpdateAfterApprove_AmountSign_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Branch Type']//Select")
	private WebElement TemplateEntries_UpdateAfterApprove_BranchType_609;

	public WebElement TemplateEntries_UpdateAfterApprove_BranchType_609() {
		return TemplateEntries_UpdateAfterApprove_BranchType_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Currency Type']//Select")
	private WebElement TemplateEntries_UpdateAfterApprove_CurrencyType_609;

	public WebElement TemplateEntries_UpdateAfterApprove_CurrencyType_609() {
		return TemplateEntries_UpdateAfterApprove_CurrencyType_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Gl Type']//Select")
	private WebElement TemplateEntries_UpdateAfterApprove_GLType_609;

	public WebElement TemplateEntries_UpdateAfterApprove_GLType_609() {
		return TemplateEntries_UpdateAfterApprove_GLType_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='CIF Type']//Select")
	private WebElement TemplateEntries_UpdateAfterApprove_CIFType_609;

	public WebElement TemplateEntries_UpdateAfterApprove_CIFType_609() {
		return TemplateEntries_UpdateAfterApprove_CIFType_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='SL Type']//Select")
	private WebElement TemplateEntries_UpdateAfterApprove_SLType_609;

	public WebElement TemplateEntries_UpdateAfterApprove_SLType_609() {
		return TemplateEntries_UpdateAfterApprove_SLType_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Trade Date Type']//Select")
	private WebElement TemplateEntries_UpdateAfterApprove_TradeDateType_609;

	public WebElement TemplateEntries_UpdateAfterApprove_TradeDateType_609() {
		return TemplateEntries_UpdateAfterApprove_TradeDateType_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Value Date Type']//Select")
	private WebElement TemplateEntries_UpdateAfterApprove_ValueDateType_609;

	public WebElement TemplateEntries_UpdateAfterApprove_ValueDateType_609() {
		return TemplateEntries_UpdateAfterApprove_ValueDateType_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='JV Type Code']//input")
	private WebElement TemplateEntries_UpdateAfterApprove_JVType_609;

	public WebElement TemplateEntries_UpdateAfterApprove_JVType_609() {
		return TemplateEntries_UpdateAfterApprove_JVType_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Entries Level']//Select")
	private WebElement TemplateEntries_UpdateAfterApprove_EntriesLevel_609;

	public WebElement TemplateEntries_UpdateAfterApprove_EntriesLevel_609() {
		return TemplateEntries_UpdateAfterApprove_EntriesLevel_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_P0070MA']//td[@tdlabel='Check on available Balance']//input")
	private WebElement TemplateEntries_UpdateAfterApprove_CheckonAvailBal_609;

	public WebElement TemplateEntries_UpdateAfterApprove_CheckonAvailBal_609() {
		return TemplateEntries_UpdateAfterApprove_CheckonAvailBal_609;
	}

	@FindBy(xpath = "//label[@id='templateEntriesMaint_FormId_P0070MA_Update_After_Approve_key']")
	private WebElement TemplateEntries_UpdateAfterApprove_UpdateBtn_609;

	public WebElement TemplateEntries_UpdateAfterApprove_UpdateBtn_609() {
		return TemplateEntries_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='P0070P']")
	private WebElement TemplateEntries_Approve_609;

	public WebElement TemplateEntries_Approve_609() {
		return TemplateEntries_Approve_609;
	}

	@FindBy(xpath = "//input[@id='templateEntriesList_GridTbl_Id_P0070P_gs_ctstrsdetTemplateVO.CODE']")
	private WebElement TemplateEntries_Approve_Code_609;

	public WebElement TemplateEntries_Approve_Code_609() {
		return TemplateEntries_Approve_Code_609;
	}
	// table[@id='templateEntriesList_GridTbl_Id_P0070P']//td[text()='456']

	@FindBy(xpath = "//label[@id='templateEntriesMaint_FormId_P0070P_Approve_key']")
	private WebElement TemplateEntries_Approve_ApproveBtn_609;

	public WebElement TemplateEntries_Approve_ApproveBtn_609() {
		return TemplateEntries_Approve_ApproveBtn_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_additional_template_entries_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Otherinfo_AdditionalTemplateEntries_609;

	public WebElement TransactionType_UpdateAfterApprove_Otherinfo_AdditionalTemplateEntries_609() {
		return TransactionType_UpdateAfterApprove_Otherinfo_AdditionalTemplateEntries_609;
	}

	@FindBy(xpath = "//input[@id='forbid_multi_cif_trx_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ForbidMultipleCif_609;

	public WebElement TransactionType_UpdateAfterApprove_ForbidMultipleCif_609() {
		return TransactionType_UpdateAfterApprove_ForbidMultipleCif_609;
	}

	@FindBy(xpath = "//input[@id='alert_flow_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Alertflowonoverdrawn_609;

	public WebElement TransactionType_UpdateAfterApprove_Alertflowonoverdrawn_609() {
		return TransactionType_UpdateAfterApprove_Alertflowonoverdrawn_609;
	}

	@FindBy(xpath = "//a[@id='transactionTypes_tab_otherInfo_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Otherinfo_607;

	public WebElement TransactionType_UpdateAfterApprove_Otherinfo_607() {
		return TransactionType_UpdateAfterApprove_Otherinfo_607;
	}

	// Sprint 64
	@FindBy(id = "trxMgntGridTbl_Id_D001WV_gs_ctstrsVO.TRS_NO")
	private WebElement transactionReverseScreenTransactionInput;

	public WebElement transactionReverseScreenTransactionInput() {
		return transactionReverseScreenTransactionInput;
	}

	@FindBy(id = "holdReason_D001WV")
	private WebElement transactionReverseReasonDropdown;

	public WebElement transactionReverseReasonDropdown() {
		return transactionReverseReasonDropdown;
	}

	@FindBy(id = "trxMgntToReverseBtn_D001WV")
	private WebElement transactionReverseButton;

	public WebElement transactionReverseButton() {
		return transactionReverseButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid/Missing trx type')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement transactionInvalidMissingTransactionPopupVerification;

	public WebElement transactionInvalidMissingTransactionPopupVerification() {
		return transactionInvalidMissingTransactionPopupVerification;
	}

	@FindBy(xpath = "//a[@id='Transactions / Maintenance']//parent::td//following-sibling::td//span")
	private WebElement transactionMaintenancsScreenClose;

	public WebElement transactionMaintenanceScreenCloseButton() {
		return transactionMaintenancsScreenClose;
	}

	@FindBy(xpath = "//a[@id='Transactions / Approve']//parent::td//following-sibling::td//span")
	private WebElement transactionApproveScreenClose;

	public WebElement transactionApproveScreenCloseButton() {
		return transactionApproveScreenClose;
	}

	@FindBy(xpath = "//a[@id='Transactions / Reverse']//parent::td//following-sibling::td//span")
	private WebElement transactionReverseScreenClose;

	public WebElement transactionReverseScreenClose() {
		return transactionReverseScreenClose;
	}

	@FindBy(xpath = "//a[@id='Transactions / Approve Reverse']//parent::td//following-sibling::td//span")
	private WebElement transactionApproveReverseCloseButton;

	public WebElement transactionApproveReverseCloseButton() {
		return transactionApproveReverseCloseButton;
	}

	@FindBy(id = "trxMgntGridTbl_Id_D001RV_gs_ctstrsVO.TRS_NO")
	private WebElement transactionApproveReverseTransactionNoInput;

	public WebElement transactionApproveReverseTransactionNoInput() {
		return transactionApproveReverseTransactionNoInput;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement transactionMaintenancePopupMessageExtractor;

	public WebElement transactionMaintenancePopupMessageExtractor() {
		return transactionMaintenancePopupMessageExtractor;
	}

	@FindBy(xpath = "//select[@name='trxMgntCO.ctstrsVO.TRSFR_METHOD']")
	private WebElement transactionMaintenanceModeOfPaymentDropdown;

	public WebElement transactionMaintenanceModeOfPaymentDropdown() {
		return transactionMaintenanceModeOfPaymentDropdown;
	}

	@FindBy(id = "ok_btn_19_P024MA")
	private WebElement transactionTypeCIFChargesOkButton;

	public WebElement transactionTypeCIFChargesGridOkButton() {
		return transactionTypeCIFChargesOkButton;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.t_total_amount']")
	private WebElement transactionGetTotalTransactionAmountField;

	public WebElement transactionGetTotalTransactionAmountField() {
		return transactionGetTotalTransactionAmountField;
	}

	@FindBy(id = "ok_btn_21_P024MA")
	private WebElement transactionTypeGLChargesOkButton;

	public WebElement transactionTypeGLChargesOkButton() {
		return transactionTypeGLChargesOkButton;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstrxtypeChargesVO.ENTITY_CODE_lookuptxt_tab28_GridTbl_Id_P024MA')]")
	private WebElement transactionTypeCIFPriorityChargesPriorityCode;

	public WebElement transactionTypeCIFPriorityChargesPriorityCode() {
		return transactionTypeCIFPriorityChargesPriorityCode;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstrxtypeChargesVO.CHARGE_CODE_lookuptxt_tab28_GridTbl_Id_P024MA')]")
	private WebElement transactionTypeCIFPriorityChargesChargeCode;

	public WebElement transactionTypeCIFPriorityChargesChargeCode() {
		return transactionTypeCIFPriorityChargesChargeCode;
	}

	@FindBy(xpath = "//Select[contains(@id,'ctstrxtypeChargesVO.CHARGES_CY_POLICY')]")
	private WebElement transactionTypeCIFPriorityChargesCYPolicyDropdown;

	public WebElement transactionTypeCIFPriorityChargesCYPolicyDropdown() {
		return transactionTypeCIFPriorityChargesCYPolicyDropdown;
	}

	@FindBy(xpath = "//Select[contains(@id,'ctstrxtypeChargesVO.CASH_ACCOUNT')]")
	private WebElement transactionTypeCIFPriorityChargesCashAccountDropdown;

	public WebElement transactionTypeCIFPriorityChargesCashAccountDropdown() {
		return transactionTypeCIFPriorityChargesCashAccountDropdown;
	}

	@FindBy(xpath = "//Select[contains(@id,'ctstrxtypeChargesVO.ACTION_TYPE')]")
	private WebElement transactionTypeCIFPriorityChargesActionTypeDropdown;

	public WebElement transactionTypeCIFPriorityChargesActionTypeDropdown() {
		return transactionTypeCIFPriorityChargesActionTypeDropdown;
	}

	@FindBy(id = "ok_btn_22_P024MA")
	private WebElement transactionTypeCIFPriorityChargesOkButton;

	public WebElement transactionTypeCIFPriorityChargesOkButton() {
		return transactionTypeCIFPriorityChargesOkButton;
	}

	@FindBy(id = "add_bulkRemittanceGridTbl_Id_D001RE")
	private WebElement bulkRemittanceAddButton;

	public WebElement bulkRemittanceAddButton() {
		return bulkRemittanceAddButton;
	}

	@FindBy(id = "to_trs_ac_gl_D001RE")
	private WebElement bulkRemittanceToGLCode;

	public WebElement bulkRemittanceToGLCode() {
		return bulkRemittanceToGLCode;
	}

	@FindBy(id = "to_trs_ac_cif_D001RE")
	private WebElement bulkRemittanceToCIFCode;

	public WebElement bulkRemittanceToCIFCode() {
		return bulkRemittanceToCIFCode;
	}

	@FindBy(id = "lookuptxt_to_trs_ac_sl_D001RE")
	private WebElement bulkRemittanceToSerialNumber;

	public WebElement bulkRemittanceToSerialNumber() {
		return bulkRemittanceToSerialNumber;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.MULTI_BRANCH']")
	private WebElement transactionType_EnableMultiBranchFalg;

	public WebElement transactionTypeEnableMultiBranchFalg() {
		return transactionType_EnableMultiBranchFalg;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.NOSTRO_MVT")
	private WebElement transactionType_AllowInternalGlsFlag;

	public WebElement transactionTypeAllowInternalGlsFlag() {
		return transactionType_AllowInternalGlsFlag;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid Branch Exchange Earning Account')]")
	private WebElement csm_InvalidBranchExchangeValidation;

	public WebElement csmInvalidBranchExchangeValidation() {
		return csm_InvalidBranchExchangeValidation;
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

	@FindBy(xpath = "//div[contains(text(),'This Trx Type is not allowed for Multi Branch')]//parent::div//following-sibling::center//input[1]")
	private WebElement transactionManagement_MultiBranchValidation;

	public WebElement transactionManagementMultiBranchValidation() {
		return transactionManagement_MultiBranchValidation;
	}

	// Sprint-69
	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_Approve_screen_ApproveBtn;

	public WebElement Parameters_SystemParameters_TransactionType_Approve_screen_ApproveBtn() {
		return Parameters_SystemParameters_TransactionType_Approve_screen_ApproveBtn;
	}

	@FindBy(xpath = "//input[@id='auto_approve_within_limit_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits;
	}

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement Parameters_SystemParameters_User_Approve_screen_ApproveBtn;

	public WebElement Parameters_SystemParameters_User_Approve_screen_ApproveBtn() {
		return Parameters_SystemParameters_User_Approve_screen_ApproveBtn;
	}

	@FindBy(xpath = "(//div[@id='transactionTypes_popupAllowedGLS_div_P024MA']//following-sibling::div//button/span)[1]")
	private WebElement CSM_Ok_On_AllowedGLListPopup;

	public WebElement CSM_Ok_On_AllowedGLListPopup() {
		return CSM_Ok_On_AllowedGLListPopup;
	}

	@FindBy(xpath = "(//div[@id='transactionTypes_popupAllowedCifTypes_div_P024MA']//following-sibling::div//button/span)[1]")
	private WebElement CSM_Ok_On_AllowedCIFListPopup;

	public WebElement CSM_Ok_On_AllowedCIFListPopup() {
		return CSM_Ok_On_AllowedCIFListPopup;
	}

	@FindBy(xpath = "//input[@id='default_acc_bal_in_amt_P024MA']")
	private WebElement DefaultAccountBalanceInAmount_Flag_InUpdateAfterApprove_TransactionType;

	public WebElement DefaultAccountBalanceInAmount_Flag_InUpdateAfterApprove_TransactionType() {
		return DefaultAccountBalanceInAmount_Flag_InUpdateAfterApprove_TransactionType;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement ProceedOnInsufficientFund_Flag_InUpdateAfterApprove_TransactionType;

	public WebElement ProceedOnInsufficientFund_Flag_InUpdateAfterApprove_TransactionType() {
		return ProceedOnInsufficientFund_Flag_InUpdateAfterApprove_TransactionType;
	}

	@FindBy(xpath = "//div[@id='instructionsColl_P017MA']")
	private WebElement Instructions_dropDown_in_update_after_approve_under_account_types;

	public WebElement Instructions_dropDown_in_update_after_approve_under_account_types() {
		return Instructions_dropDown_in_update_after_approve_under_account_types;
	}

	@FindBy(xpath = "//input[@id='allow_overdrawn_P017MA']")
	private WebElement Allow_Overdrawn_in_update_after_approve_under_account_types;

	public WebElement Allow_Overdrawn_in_update_after_approve_under_account_types() {
		return Allow_Overdrawn_in_update_after_approve_under_account_types;
	}

	@FindBy(xpath = "//div[@id='acctypeMaint_MaintToolBar_P017MA']/div/button")
	private WebElement UpdateAfterApproveBtn_in_update_after_approve_under_account_types;

	public WebElement UpdateAfterApproveBtn_in_update_after_approve_under_account_types() {
		return UpdateAfterApproveBtn_in_update_after_approve_under_account_types;
	}

	@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017P_Approve_key']")
	private WebElement ApproveBtnIn_ApproveScreen_under_account_types;

	public WebElement ApproveBtnIn_ApproveScreen_under_account_types() {
		return ApproveBtnIn_ApproveScreen_under_account_types;
	}

	@FindBy(xpath = "//input[@id='dflt_starting_dt_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate_Flag;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate_Flag() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate_Flag;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement CSM_SimpleOk;

	public WebElement CSM_SimpleOk() {
		return CSM_SimpleOk;
	}

	@FindBy(xpath = "//select[@id='proceed_cif_blacklisted_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_BlacklistAction;

	public WebElement TransactionType_UpdateAfterApprove_BlacklistAction() {
		return TransactionType_UpdateAfterApprove_BlacklistAction;
	}

	@FindBy(xpath = "//td[@id='add_tab27_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_Addicon;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_Addicon() {
		return TransactionType_UpdateAfterApprove_GLCharges_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab27_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_Deleteicon;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_Deleteicon() {
		return TransactionType_UpdateAfterApprove_GLCharges_Deleteicon;
	}

	@FindBy(xpath = "//table[@id='tab27_GridTbl_Id_P024MA']//td[@tdlabel='GL Code']//input")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_GLCode;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_GLCode() {
		return TransactionType_UpdateAfterApprove_GLCharges_GLCode;
	}

	@FindBy(xpath = "//table[@id='tab27_GridTbl_Id_P024MA']//td[@tdlabel='Charge Schema Details']//input")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_ChargeSchema;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_ChargeSchema() {
		return TransactionType_UpdateAfterApprove_GLCharges_ChargeSchema;
	}

	@FindBy(xpath = "(//table[@id='tab27_GridTbl_Id_P024MA']//select)[1]")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_All;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_All() {
		return TransactionType_UpdateAfterApprove_GLCharges_All;
	}

	@FindBy(xpath = "(//table[@id='tab27_GridTbl_Id_P024MA']//select)[2]")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_CashAccount;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_CashAccount() {
		return TransactionType_UpdateAfterApprove_GLCharges_CashAccount;
	}

	@FindBy(xpath = "(//table[@id='tab27_GridTbl_Id_P024MA']//select)[3]")
	private WebElement TransactionType_UpdateAfterApprove_GLCharges_Action;

	public WebElement TransactionType_UpdateAfterApprove_GLCharges_Action() {
		return TransactionType_UpdateAfterApprove_GLCharges_Action;
	}

	@FindBy(xpath = "//input[@id='avail_bal_after_D001MT']")
	private WebElement Transactions_Maintenance_AvailableBalanceAfter;

	public WebElement Transactions_Maintenance_AvailableBalanceAfter() {
		return Transactions_Maintenance_AvailableBalanceAfter;
	}

	@FindBy(xpath = "//input[@id='deduct_customer_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCustomerAccount;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCustomerAccount() {
		return TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCustomerAccount;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA1']")
	private WebElement TransactionType_UpdateAfterApprove_DeductfromCustomerAccountRadio;

	public WebElement TransactionType_UpdateAfterApprove_DeductfromCustomerAccountRadio() {
		return TransactionType_UpdateAfterApprove_DeductfromCustomerAccountRadio;
	}

	@FindBy(xpath = "//span[text()=' CIF Charges ']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifCharges;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifCharges() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifCharges;
	}

	@FindBy(xpath = "//td[@id='add_tab25_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_Addicon;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_Addicon() {
		return TransactionType_UpdateAfterApprove_CifCharges_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab25_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_Deleteicon;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_Deleteicon() {
		return TransactionType_UpdateAfterApprove_CifCharges_Deleteicon;
	}

	@FindBy(xpath = "//table[@id='tab25_GridTbl_Id_P024MA']//td[@tdlabel='CIF Code']//input")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_CifCode;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_CifCode() {
		return TransactionType_UpdateAfterApprove_CifCharges_CifCode;
	}

	@FindBy(xpath = "//table[@id='tab25_GridTbl_Id_P024MA']//td[@tdlabel='Charge Schema Details']//input")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_ChargeSchema;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_ChargeSchema() {
		return TransactionType_UpdateAfterApprove_CifCharges_ChargeSchema;
	}

	@FindBy(xpath = "(//table[@id='tab25_GridTbl_Id_P024MA']//select)[1]")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_All;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_All() {
		return TransactionType_UpdateAfterApprove_CifCharges_All;
	}

	@FindBy(xpath = "(//table[@id='tab25_GridTbl_Id_P024MA']//select)[2]")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_CashAccount;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_CashAccount() {
		return TransactionType_UpdateAfterApprove_CifCharges_CashAccount;
	}

	@FindBy(xpath = "(//table[@id='tab25_GridTbl_Id_P024MA']//select)[3]")
	private WebElement TransactionType_UpdateAfterApprove_CifCharges_Action;

	public WebElement TransactionType_UpdateAfterApprove_CifCharges_Action() {
		return TransactionType_UpdateAfterApprove_CifCharges_Action;
	}

	@FindBy(xpath = "//a[@id='accountCharges_btn_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges() {
		return TransactionType_UpdateAfterApprove_AccountCharges;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C Br']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Branch;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Branch() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Branch;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C Cy']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Currency;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Currency() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Currency;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C Gl']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_GL;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_GL() {
		return TransactionType_UpdateAfterApprove_AccountCharges_GL;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C CIF']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_CIF;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_CIF() {
		return TransactionType_UpdateAfterApprove_AccountCharges_CIF;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='A/C SL']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Serial;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Serial() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Serial;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='Reasons']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Reason;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Reason() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Reason;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='Charge Schema Details']//input")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Charge;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Charge() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Charge;
	}

	@FindBy(xpath = "(//table[@id='tab24_GridTbl_Id_P024MA']//select)[1]")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_All;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_All() {
		return TransactionType_UpdateAfterApprove_AccountCharges_All;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='Cash / Account']//select")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_CashAccount;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_CashAccount() {
		return TransactionType_UpdateAfterApprove_AccountCharges_CashAccount;
	}

	@FindBy(xpath = "//table[@id='tab24_GridTbl_Id_P024MA']//td[@tdlabel='action']//select")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Action;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Action() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Action;
	}

	@FindBy(xpath = "//td[@id='add_tab24_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Addicon;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Addicon() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab24_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_AccountCharges_Deleteicon;

	public WebElement TransactionType_UpdateAfterApprove_AccountCharges_Deleteicon() {
		return TransactionType_UpdateAfterApprove_AccountCharges_Deleteicon;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_E000MA']//td[@tdlabel='View A/C Position']//input[@prevvalue=1]")
	private WebElement User_UpdateAfterApprove_AccType_ViewAccPosition;

	public WebElement User_UpdateAfterApprove_AccType_ViewAccPosition() {
		return User_UpdateAfterApprove_AccType_ViewAccPosition;
	}

	@FindBy(xpath = "//div[contains(text(),'Economic Sector') or contains(text(),'CIF Priority')]//parent::div//following-sibling::center//input")
	private WebElement WarningPopupforPriorityInMaintenanceUnderTransactions;

	public WebElement WarningPopupforPriorityInMaintenanceUnderTransactions() {
		return WarningPopupforPriorityInMaintenanceUnderTransactions;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")

	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code() {

		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code;

	}

	@FindBy(xpath = "//span[contains(text(),' Transaction Status ')]")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus;
	}

	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001AU_ALERT']")
	private WebElement BMUserAlert_OpenItems_ModifyReason;

	public WebElement BMUserAlert_OpenItems_ModifyReason() {
		return BMUserAlert_OpenItems_ModifyReason;
	}

	@FindBy(xpath = "//input[@id='value_date_D001MT']")
	private WebElement Transaction_Maintance_ValueDate;

	public WebElement Transaction_Maintance_ValueDate() {
		return Transaction_Maintance_ValueDate;
	}

	@FindBy(xpath = "//input[@id='post_dated_vdate_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_Update_AllowPostDatedValue;

	public WebElement Parameters_SystemParameters_TransactionType_Update_AllowPostDatedValue() {
		return Parameters_SystemParameters_TransactionType_Update_AllowPostDatedValue;
	}

	@FindBy(xpath = "//span[text()=' Limits ']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Limits;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Limits() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_Limits;
	}

	@FindBy(xpath = "//td[@id='add_tab3_C_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_Limits_Addicon;

	public WebElement User_UpdateAfterApprove_Limits_Addicon() {
		return User_UpdateAfterApprove_Limits_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab3_C_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_Limits_Deleteicon;

	public WebElement User_UpdateAfterApprove_Limits_Deleteicon() {
		return User_UpdateAfterApprove_Limits_Deleteicon;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='A/C Cy']//input")
	private WebElement User_UpdateAfterApprove_Limits_Currency;

	public WebElement User_UpdateAfterApprove_Limits_Currency() {
		return User_UpdateAfterApprove_Limits_Currency;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='Transaction']//input")
	private WebElement User_UpdateAfterApprove_Limits_TrxType;

	public WebElement User_UpdateAfterApprove_Limits_TrxType() {
		return User_UpdateAfterApprove_Limits_TrxType;
	}

	@FindBy(xpath = "(//table[@id='tab3_C_GridTbl_Id_E000MA']//div/input)[3]")
	private WebElement User_UpdateAfterApprove_Limits_WithdrawalLimit;

	public WebElement User_UpdateAfterApprove_Limits_WithdrawalLimit() {
		return User_UpdateAfterApprove_Limits_WithdrawalLimit;
	}

	@FindBy(xpath = "//td[@id='del_tab4_GridTbl_Id_E000MA']")
	private WebElement csmParamAccountTypeDeleteButton;

	public WebElement csmParamAccountTypeDeleteButton() {

		return csmParamAccountTypeDeleteButton;
	}

	@FindBy(xpath = "//td[@id='add_tab4_GridTbl_Id_E000MA']")
	private WebElement csmParamAccountTypeAddButton;

	public WebElement csmParamAccountTypeAddButton() {
		return csmParamAccountTypeAddButton;

	}

	@FindBy(xpath = "//input[contains(@id,'ACC_TYPE_lookuptxt_tab4_GridTbl_Id_E000MA')]")
	private WebElement csmParamAccountTypeInput;

	public WebElement csmParamAccountTypeInput() {
		return csmParamAccountTypeInput;

	}

	@FindBy(xpath = "//input[contains(@id,'TRX_TYPE_lookuptxt_tab4_GridTbl_Id_E000MA')]")
	private WebElement csmParamAccountTypeTrxTypeInput;

	public WebElement csmParamAccountTypeTrxTypeInput() {
		return csmParamAccountTypeTrxTypeInput;

	}

	@FindBy(xpath = "//div[contains(text(),'WARNING')]//parent::div//following-sibling::div//div[contains(text(),'Account Type: Limit Amount should be between')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement accountTypeLimitWarningValidation;

	public WebElement accountTypeLimitWarningValidation() {
		return accountTypeLimitWarningValidation;
	}

	@FindBy(xpath = "//input[contains(@id,'CIF_TYPE_lookuptxt_tab5_C_GridTbl_Id_E000MA')]")
	private WebElement cifTypeLimitCIFTypeInput;

	public WebElement cifTypeLimitCIFTypeInput() {
		return cifTypeLimitCIFTypeInput;
	}

	@FindBy(xpath = "//input[contains(@id,'TRX_TYPE_lookuptxt_tab5_C_GridTbl_Id_E000MA')]")
	private WebElement cifTypeLimitTrxTypeInput;

	public WebElement cifTypeLimitTrxTypeInput() {
		return cifTypeLimitTrxTypeInput;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstellerciftypedetVO.WITHD_LIMIT_CV_tab5_C_GridTbl_Id_E000MA')]")
	private WebElement cifTypeLimitWithdrawLimitInput;

	public WebElement cifTypeLimitWithdrawLimitInput() {
		return cifTypeLimitWithdrawLimitInput;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstellerciftypedetVO.DEP_LIMIT_CV_tab5_C_GridTbl_Id_E000MA')]")
	private WebElement cifTypeLimitDepositeLimitInput;

	public WebElement cifTypeLimitDepositeLimitInput() {
		return cifTypeLimitDepositeLimitInput;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstellerciftypedetVO.WARN_USER_LIMIT_EXCEED') and @class='editable']")
	private WebElement cifTypeLimitWarnUserLimitExceedCheckBox;

	public WebElement cifTypeLimitWarnUserLimitExceedCheckBox() {
		return cifTypeLimitWarnUserLimitExceedCheckBox;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstellerciftypedetVO.PROCEED_LIMIT_EXCEED') and @class='editable']")
	private WebElement cifTypeLimitProceedUserLimitExceedCheckBox;

	public WebElement cifTypeLimitProceedUserLimitExceedCheckBox() {
		return cifTypeLimitProceedUserLimitExceedCheckBox;
	}

	@FindBy(id = "ok_btn_4_E000MA")
	private WebElement cifTypeGridOkButton;

	public WebElement cifTypeGridOkButton() {
		return cifTypeGridOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot Proceed')]//parent::div//following-sibling::div//div[contains(text(),'CIF Type: Limit Amount should be between')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement cifTypeLimitCannotProceedValidation;

	public WebElement cifTypeLimitCannotProceedValidation() {
		return cifTypeLimitCannotProceedValidation;
	}

	@FindBy(xpath = "//div[contains(text(),'WARNING')]//parent::div//following-sibling::div//div[contains(text(),'CIF Type: Limit Amount should be between')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement cifTypeLimitWarningValidation;

	public WebElement cifTypeLimitWarningValidation() {
		return cifTypeLimitWarningValidation;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstelleracctypedetVO.DEP_LIMIT_CV')]")
	private WebElement csmParamAccountTypeDepositeLimitInput;

	public WebElement csmParamAccountTypeDepositeLimitInput() {
		return csmParamAccountTypeDepositeLimitInput;

	}

	@FindBy(xpath = "//button[contains(@id,'ok_btn_')]")
	private WebElement csmParamAccountOkButton;

	public WebElement csmParamAccountOkButton() {
		return csmParamAccountOkButton;
	}

	@FindBy(xpath = "(//a[@id='cifPriority_bt_P024MA']/span)[2]")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifPriorityCharges;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifPriorityCharges() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifPriorityCharges;
	}

	@FindBy(xpath = "//td[@id='add_tab28_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_Addicon;

	public WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_Addicon() {
		return TransactionType_UpdateAfterApprove_CifPriorityCharges_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab28_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_Deleteicon;

	public WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_Deleteicon() {
		return TransactionType_UpdateAfterApprove_CifPriorityCharges_Deleteicon;
	}

	@FindBy(xpath = "(//table[@id='tab28_GridTbl_Id_P024MA']//td//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_CifType;

	public WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_CifType() {
		return TransactionType_UpdateAfterApprove_CifPriorityCharges_CifType;
	}

	@FindBy(xpath = "(//table[@id='tab28_GridTbl_Id_P024MA']//td//input)[2]")
	private WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_ChargeSchema;

	public WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_ChargeSchema() {
		return TransactionType_UpdateAfterApprove_CifPriorityCharges_ChargeSchema;
	}

	@FindBy(xpath = "(//table[@id='tab28_GridTbl_Id_P024MA']//select)[1]")
	private WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_All;

	public WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_All() {
		return TransactionType_UpdateAfterApprove_CifPriorityCharges_All;
	}

	@FindBy(xpath = "(//table[@id='tab28_GridTbl_Id_P024MA']//select)[2]")
	private WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_CashAccount;

	public WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_CashAccount() {
		return TransactionType_UpdateAfterApprove_CifPriorityCharges_CashAccount;
	}

	@FindBy(xpath = "(//table[@id='tab28_GridTbl_Id_P024MA']//select)[3]")
	private WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_Action;

	public WebElement TransactionType_UpdateAfterApprove_CifPriorityCharges_Action() {
		return TransactionType_UpdateAfterApprove_CifPriorityCharges_Action;
	}

	@FindBy(xpath = "//input[@id='apply_round_chrg_denom_yn_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ApplyRoundingonCharges;

	public WebElement TransactionType_UpdateAfterApprove_ApplyRoundingonCharges() {
		return TransactionType_UpdateAfterApprove_ApplyRoundingonCharges;
	}

	@FindBy(xpath = "//input[@id='deduct_creditor_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCreditorAccount;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCreditorAccount() {
		return TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromCreditorAccount;
	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromDebitorAccount;

	public WebElement TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromDebitorAccount() {
		return TransactionType_UpdateAfterApprove_AdditionalDetails_DeductfromDebitorAccount;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA2']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromCreditAccount;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromCreditAccount() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromCreditAccount;
	}

	@FindBy(xpath = "//span[text()=' Gl Charges ']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_GLCharges;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_GLCharges() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_GLCharges;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='W/D Limit']//input")
	private WebElement User_UpdateAfterApprove_Priority_WithdrawalLimit;

	public WebElement User_UpdateAfterApprove_Priority_WithdrawalLimit() {
		return User_UpdateAfterApprove_Priority_WithdrawalLimit;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Deposit Limit']//input")
	private WebElement User_UpdateAfterApprove_Priority_DepositLimit;

	public WebElement User_UpdateAfterApprove_Priority_DepositLimit() {
		return User_UpdateAfterApprove_Priority_DepositLimit;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Warn User If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_Priority_WarnUserifLimitExceed;

	public WebElement User_UpdateAfterApprove_Priority_WarnUserifLimitExceed() {
		return User_UpdateAfterApprove_Priority_WarnUserifLimitExceed;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Proceed If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_Priority_ProceedifLimitExceed;

	public WebElement User_UpdateAfterApprove_Priority_ProceedifLimitExceed() {
		return User_UpdateAfterApprove_Priority_ProceedifLimitExceed;
	}

	@FindBy(xpath = "//span[contains(text(),'Eco Sector')]")
	private WebElement User_UpdateAfterApprove_EcoSector;

	public WebElement User_UpdateAfterApprove_EcoSector() {
		return User_UpdateAfterApprove_EcoSector;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Eco Sector']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_EcoSector;

	public WebElement User_UpdateAfterApprove_EcoSector_EcoSector() {
		return User_UpdateAfterApprove_EcoSector_EcoSector;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Transaction']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_Transaction;

	public WebElement User_UpdateAfterApprove_EcoSector_Transaction() {
		return User_UpdateAfterApprove_EcoSector_Transaction;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='W/D Limit']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_WithdrawLimit;

	public WebElement User_UpdateAfterApprove_EcoSector_WithdrawLimit() {
		return User_UpdateAfterApprove_EcoSector_WithdrawLimit;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Deposit Limit']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_DepositLimit;

	public WebElement User_UpdateAfterApprove_EcoSector_DepositLimit() {
		return User_UpdateAfterApprove_EcoSector_DepositLimit;
	}

	@FindBy(xpath = "//td[@id='add_tab5_E_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_EcoSector_Addicon;

	public WebElement User_UpdateAfterApprove_EcoSector_Addicon() {
		return User_UpdateAfterApprove_EcoSector_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab5_E_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_EcoSector_Deleteicon;

	public WebElement User_UpdateAfterApprove_EcoSector_Deleteicon() {
		return User_UpdateAfterApprove_EcoSector_Deleteicon;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Overdraw Limit']//input")
	private WebElement User_UpdateAfterApprove_EcoSector_OverdrawLimit;

	public WebElement User_UpdateAfterApprove_EcoSector_OverdrawLimit() {
		return User_UpdateAfterApprove_EcoSector_OverdrawLimit;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Warn User If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_EcoSector_WarnifUserLimitExceed;

	public WebElement User_UpdateAfterApprove_EcoSector_WarnifUserLimitExceed() {
		return User_UpdateAfterApprove_EcoSector_WarnifUserLimitExceed;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='Proceed If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_EcoSector_ProceedifLimitExceed;

	public WebElement User_UpdateAfterApprove_EcoSector_ProceedifLimitExceed() {
		return User_UpdateAfterApprove_EcoSector_ProceedifLimitExceed;
	}

	@FindBy(xpath = "//span[text()=' CIF Types ']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_CifTypes;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_CifTypes() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_CifTypes;
	}

	@FindBy(xpath = "//span[text()=' Account Types ']")
	private WebElement User_UpdateAfterApprove_AccountType;

	public WebElement User_UpdateAfterApprove_AccountType() {
		return User_UpdateAfterApprove_AccountType;
	}

	@FindBy(xpath = "//table[@id='tab5_C_GridTbl_Id_E000MA']//td[@tdlabel='View A/C Position']//input[@prevvalue=1]")
	private WebElement User_UpdateAfterApprove_CifType_ViewAccPosition;

	public WebElement User_UpdateAfterApprove_CifType_ViewAccPosition() {
		return User_UpdateAfterApprove_CifType_ViewAccPosition;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstelleracctypedetVO.WITHD_LIMIT_CV')]")
	private WebElement csmParamAccountTypeWithdrawLimitInput;

	public WebElement csmParamAccountTypeWithdrawLimitInput() {
		return csmParamAccountTypeWithdrawLimitInput;

	}

	@FindBy(xpath = "//input[contains(@id,'ctstelleracctypedetVO.OVERDRAW_LIMIT')]")
	private WebElement csmParamAccountTypeOverdrawnLimitInput;

	public WebElement csmParamAccountTypeOverdrawnLimitInput() {
		return csmParamAccountTypeOverdrawnLimitInput;
	}

	@FindBy(xpath = "//input[contains(@id,'ctstelleracctypedetVO.WARN_USER_LIMIT_EXCEED') and @class='editable']")
	private WebElement csmParamAccountTypeWarnUserLimitExceedCheckBox;

	public WebElement csmParamAccountTypeWarnUserLimitExceedCheckBox() {
		return csmParamAccountTypeWarnUserLimitExceedCheckBox;

	}

	@FindBy(xpath = "//input[contains(@id,'ctstelleracctypedetVO.PROCEED_LIMIT_EXCEED') and @class='editable']")
	private WebElement csmParamAccountTypeProceedLimitExceedCheckBox;

	public WebElement csmParamAccountTypeProceedLimitExceedCheckBox() {
		return csmParamAccountTypeProceedLimitExceedCheckBox;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot Proceed')]//parent::div//following-sibling::div//div[contains(text(),'Account Type: Limit Amount should be between')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
	private WebElement accountTypeLimitCannotProceedValidation;

	public WebElement accountTypeLimitCannotProceedValidation() {
		return accountTypeLimitCannotProceedValidation;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='Warn User If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_Limits_WarnUserifLimitExceed;

	public WebElement User_UpdateAfterApprove_Limits_WarnUserifLimitExceed() {
		return User_UpdateAfterApprove_Limits_WarnUserifLimitExceed;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-memoDiv_P024MA']//parent::div/a/span")
	private WebElement ViewMemo_Close;

	public WebElement ViewMemo_Close() {
		return ViewMemo_Close;
	}

	@FindBy(xpath = "//input[@id='amount_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Amount;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_Code;
	}

	@FindBy(xpath = "//input[@name='trxMgntCO.avail_bal']")
	private WebElement Transactions_Maintenance_AvailableBalance;

	public WebElement Transactions_Maintenance_AvailableBalance() {
		return Transactions_Maintenance_AvailableBalance;
	}

	@FindBy(xpath = "//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='User Level']//input")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_UserLevel;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_UserLevel() {
		return TransactionType_UpdateAfterApprove_TrxStatus_UserLevel;
	}

	@FindBy(xpath = "//span[text()=' CIF Types Charges ']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifTypeCharges;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifTypeCharges() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CifTypeCharges;
	}

	@FindBy(xpath = "//td[@id='add_tab26_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Addicon;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Addicon() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab26_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Deleteicon;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Deleteicon() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_Deleteicon;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//td//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CifType;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CifType() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_CifType;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//td//input)[2]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_ChargeSchema;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_ChargeSchema() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_ChargeSchema;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//select)[1]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_All;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_All() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_All;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//select)[2]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CashAccount;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CashAccount() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_CashAccount;
	}

	@FindBy(xpath = "(//table[@id='tab26_GridTbl_Id_P024MA']//select)[3]")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Action;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_Action() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_Action;
	}

	@FindBy(xpath = "//select[@id='rejectReason_D001AU_ALERT']")
	private WebElement BMUserAlert_OpenItems_RejectReason;

	public WebElement BMUserAlert_OpenItems_RejectReason() {
		return BMUserAlert_OpenItems_RejectReason;
	}

	@FindBy(xpath = "//button[@id='alertsOpenItemReject_RCVALERT']")
	private WebElement BMUserAlert_OpenItems_RejectButton;

	public WebElement BMUserAlert_OpenItems_RejectButton() {
		return BMUserAlert_OpenItems_RejectButton;
	}

	@FindBy(xpath = "//a[@id='trxMgntAlertModifyButton_RCVALERT']")
	private WebElement BMUserAlert_OpenItems_ModifyButton;

	public WebElement BMUserAlert_OpenItems_ModifyButton() {
		return BMUserAlert_OpenItems_ModifyButton;
	}

	@FindBy(xpath = "//td[@id='del_tab31_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Deleteicon;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Deleteicon() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Deleteicon;
	}

	@FindBy(xpath = "//td[@id='add_tab31_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Addicon;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Addicon() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Addicon;
	}

	@FindBy(xpath = "//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='AND/OR']//select")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_AndOr;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_AndOr() {
		return TransactionType_UpdateAfterApprove_TrxStatus_AndOr;
	}

	@FindBy(xpath = "(//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='Priority']//input)[1]")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Priority;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Priority() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Priority;
	}

	@FindBy(xpath = "//table[@id='tab31_GridTbl_Id_P024MA']//td[@tdlabel='Status Code']//input")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_StatusCode;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_StatusCode() {
		return TransactionType_UpdateAfterApprove_TrxStatus_StatusCode;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn;
	}

	@FindBy(xpath = "//a[@id='D001ZN']//span[text()='Cancel']")
	private WebElement Transactions_Cancel;

	public WebElement Transactions_Cancel() {
		return Transactions_Cancel;
	}

	@FindBy(xpath = "//select[@id='trsfr_method_D001MT']")
	private WebElement Transactions_Maintenance_ModeofPayment;

	public WebElement Transactions_Maintenance_ModeofPayment() {
		return Transactions_Maintenance_ModeofPayment;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011P_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn;
	}

	@FindBy(xpath = "//span[text()='close']")
	private WebElement ViewMomo_PopUp_Close;

	public WebElement ViewMomo_PopUp_Close() {
		return ViewMomo_PopUp_Close;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='Proceed If Limit Exceed']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_Limits_ProceedifLimitExceed;

	public WebElement User_UpdateAfterApprove_Limits_ProceedifLimitExceed() {
		return User_UpdateAfterApprove_Limits_ProceedifLimitExceed;
	}

	@FindBy(xpath = "//input[@id='rqst_cy_nomination_det_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination;
	}

	@FindBy(xpath = "//input[@id='allow_modify_chrg_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AllowUserToModifyTheAmount;

	public WebElement TransactionType_UpdateAfterApprove_AllowUserToModifyTheAmount() {
		return TransactionType_UpdateAfterApprove_AllowUserToModifyTheAmount;
	}

	@FindBy(xpath = "//input[@id='allow_clearing_chrg_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AllowUserToClearTheCharge;

	public WebElement TransactionType_UpdateAfterApprove_AllowUserToClearTheCharge() {
		return TransactionType_UpdateAfterApprove_AllowUserToClearTheCharge;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='Deposit Limit']//input")
	private WebElement User_UpdateAfterApprove_Limits_DepositLimit;

	public WebElement User_UpdateAfterApprove_Limits_DepositLimit() {
		return User_UpdateAfterApprove_Limits_DepositLimit;
	}

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='% Override']//input")
	private WebElement User_UpdateAfterApprove_Limits_PercentageOverride;

	public WebElement User_UpdateAfterApprove_Limits_PercentageOverride() {
		return User_UpdateAfterApprove_Limits_PercentageOverride;
	}

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ForceOverdraw;

	public WebElement TransactionType_UpdateAfterApprove_ForceOverdraw() {
		return TransactionType_UpdateAfterApprove_ForceOverdraw;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_jv_type_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_JvType;

	public WebElement TransactionType_UpdateAfterApprove_JvType() {
		return TransactionType_UpdateAfterApprove_JvType;
	}

	@FindBy(xpath = "//select[@id='trsfr_method_D001MT']")
	private WebElement Transactions_Maintenance_Charges;

	public WebElement Transactions_Maintenance_Charges() {
		return Transactions_Maintenance_Charges;
	}

	@FindBy(xpath = "//table[@id='tab5_E_GridTbl_Id_E000MA']//td[@tdlabel='View A/C Position']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_EcoSector_ViewAccPosition;

	public WebElement User_UpdateAfterApprove_EcoSector_ViewAccPosition() {
		return User_UpdateAfterApprove_EcoSector_ViewAccPosition;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='View A/C Position']//input[@prevvalue='1']")
	private WebElement User_UpdateAfterApprove_Priority_ViewAccPosition;

	public WebElement User_UpdateAfterApprove_Priority_ViewAccPosition() {
		return User_UpdateAfterApprove_Priority_ViewAccPosition;
	}

	@FindBy(xpath = "//td[@id='add_tab4_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_AccountType_AddIcon;

	public WebElement User_UpdateAfterApprove_AccountType_AddIcon() {
		return User_UpdateAfterApprove_AccountType_AddIcon;
	}

	@FindBy(xpath = "//td[@id='add_tab5_C_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_CifType_AddIcon;

	public WebElement User_UpdateAfterApprove_CifType_AddIcon() {
		return User_UpdateAfterApprove_CifType_AddIcon;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement TransactionType_UpdateAfterApprove_DeductfromOtherAccount;

	public WebElement TransactionType_UpdateAfterApprove_DeductfromOtherAccount() {
		return TransactionType_UpdateAfterApprove_DeductfromOtherAccount;
	}

//-----

	@FindBy(xpath = "//input[@id='chargesSchemaParamList_GridTbl_Id_C0012MA_gs_ctschargesSchemaVO.CODE']")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_Code;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_Code() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_Code;
	}

	@FindBy(xpath = "//span[text()=' Define Charges Schema ']")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema;
	}

	@FindBy(xpath = "//td[@id='add_tab23_GridTbl_Id_C0012MA']//span")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema_Addicon;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema_Addicon() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema_Addicon;
	}

	@FindBy(xpath = "//td[@id='del_tab23_GridTbl_Id_C0012MA']//span")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema_DeleteIcon;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema_DeleteIcon() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema_DeleteIcon;
	}

	@FindBy(xpath = "(//table[@id='tab23_GridTbl_Id_C0012MA']//tr//td//input)[1]")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema_ChargeCode;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema_ChargeCode() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_DefineChargeSchema_ChargeCode;
	}

	@FindBy(xpath = "//label[@id='chargesSchemaParamMaint_FormId_C0012MA_Update_After_Approve_key']")
	private WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_UpdateBtn;

	public WebElement Charges_MaintenanceofChargesSchema_UpdateAfterApprove_UpdateBtn() {
		return Charges_MaintenanceofChargesSchema_UpdateAfterApprove_UpdateBtn;
	}

	@FindBy(xpath = "//a[@id='C0012P']")
	private WebElement Charges_MaintenanceofChargesSchema_Approve;

	public WebElement Charges_MaintenanceofChargesSchema_Approve() {
		return Charges_MaintenanceofChargesSchema_Approve;
	}

	@FindBy(xpath = "//input[@id='chargesSchemaParamList_GridTbl_Id_C0012P_gs_ctschargesSchemaVO.CODE']")
	private WebElement Charges_MaintenanceofChargesSchema_Approve_Code;

	public WebElement Charges_MaintenanceofChargesSchema_Approve_Code() {
		return Charges_MaintenanceofChargesSchema_Approve_Code;
	}

	@FindBy(xpath = "//label[@id='chargesSchemaParamMaint_FormId_C0012P_Approve_key']")
	private WebElement Charges_MaintenanceofChargesSchema_Approve_ApproveBtn;

	public WebElement Charges_MaintenanceofChargesSchema_Approve_ApproveBtn() {
		return Charges_MaintenanceofChargesSchema_Approve_ApproveBtn;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromOtherAccount;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromOtherAccount() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromOtherAccount;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_Maintenance_Currency;

	public WebElement Transactions_Maintenance_Currency() {
		return Transactions_Maintenance_Currency;
	}

	@FindBy(xpath = "//span[text()=' Accounts ']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Account;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Account() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_Account;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Account_deleteBtn;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Account_deleteBtn() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_Account_deleteBtn;
	}

	@FindBy(id = "trxMgntGridTbl_Id_D001WV_gs_ctstrsVO.TRS_NO")
	private WebElement Transaction_Reverse_TransactionNo;

	public WebElement Transaction_Reverse_TransactionNo() {
		return Transaction_Reverse_TransactionNo;
	}

	@FindBy(id = "holdReason_D001WV")
	private WebElement Transaction_Reverse_ReverseReason;

	public WebElement Transaction_Reverse_ReverseReason() {
		return Transaction_Reverse_ReverseReason;
	}

	@FindBy(id = "trxMgntToReverseBtn_D001WV")
	private WebElement Transaction_Reverse_ReverseButton;

	public WebElement Transaction_Reverse_ReverseButton() {
		return Transaction_Reverse_ReverseButton;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001RV_gs_ctstrsVO.TRS_NO']")
	private WebElement Transaction_ApproveReverse_TransactionNo;

	public WebElement Transaction_ApproveReverse_TransactionNo() {
		return Transaction_ApproveReverse_TransactionNo;
	}

	@FindBy(xpath = "//button[@id='trxMgntReverseBtn_D001RV']")
	private WebElement Transaction_ApproveReverse_Reversebtn;

	public WebElement Transaction_ApproveReverse_Reversebtn() {
		return Transaction_ApproveReverse_Reversebtn;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001ZN_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_Cancel_Code;

	public WebElement Transactions_Cancel_Code() {
		return Transactions_Cancel_Code;
	}
	// table[@id='trxMgntGridTbl_Id_D001ZN']//td[text()='10385']

	@FindBy(xpath = "//select[@id='holdReason_D001ZN']")
	private WebElement Transactions_Cancel_Reason;

	public WebElement Transactions_Cancel_Reason() {
		return Transactions_Cancel_Reason;
	}// 1

	@FindBy(xpath = "//span[contains(text(),' Cancel ')]")
	private WebElement Transactions_Cancel_CancelBtn;

	public WebElement Transactions_Cancel_CancelBtn() {
		return Transactions_Cancel_CancelBtn;
	}

	@FindBy(xpath = "//a[@id='D001CN']")
	private WebElement Transactions_ApproveCancel;

	public WebElement Transactions_ApproveCancel() {
		return Transactions_ApproveCancel;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001CN_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_ApproveCancel_Code;

	public WebElement Transactions_ApproveCancel_Code() {
		return Transactions_ApproveCancel_Code;
	}
	// (//table[@id='trxMgntGridTbl_Id_D001CN']//td[text()='10387'])[1]

	@FindBy(xpath = "//span[contains(text(),' Approve Cancel ')]")
	private WebElement Transactions_ApproveCancel_ApproveCancelBtn;

	public WebElement Transactions_ApproveCancel_ApproveCancelBtn() {
		return Transactions_ApproveCancel_ApproveCancelBtn;
	}

	@FindBy(id = "def_charge_in_trs_P024MA")
	private WebElement trxTypeDefaultChargetoTransactionFlag;

	public WebElement trxTypeDefaultChargetoTransactionFlag() {
		return trxTypeDefaultChargetoTransactionFlag;
	}

	@FindBy(id = "allow_modify_chrg_P024MA")
	private WebElement trxTypeAllowModifyAmountFlag;

	public WebElement trxTypeAllowModifyAmountFlag() {
		return trxTypeAllowModifyAmountFlag;
	}

	@FindBy(id = "allow_clearing_chrg_P024MA")
	private WebElement trxTypeAllowUserClearingChargeFlag;

	public WebElement trxTypeAllowUserClearingChargeFlag() {
		return trxTypeAllowUserClearingChargeFlag;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_if_amount_less_than_key']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_IfAmountLessThan;
	}

	@FindBy(xpath = "//td[@id='add_tab44_GridTbl_Id_P024MA']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_AddBtn;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_AddBtn() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_AddBtn;
	}

	@FindBy(xpath = "//td[@id='del_tab44_GridTbl_Id_P024MA']")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_DeleteBtn;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_DeleteBtn() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_DeleteBtn;
	}

	@FindBy(xpath = "//table[@id='tab44_GridTbl_Id_P024MA']//td[@tdlabel='CY Code']//input")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_CurrencyCode;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_CurrencyCode() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_CurrencyCode;
	}

	@FindBy(xpath = "//table[@id='tab44_GridTbl_Id_P024MA']//td[@tdlabel='Amount']//input")
	private WebElement SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_Amount;

	public WebElement SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_Amount() {
		return SystemParameters_TransactionType_UpdateAfterApprove_AmountPerCurrencies_Amount;
	}

	@FindBy(xpath = "//a[contains(text(),' Alert Activation')]")
	private WebElement SystemParameters_ControlRecord_AlertActivation;

	public WebElement SystemParameters_ControlRecord_AlertActivation() {
		return SystemParameters_ControlRecord_AlertActivation;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_2_CUSTOM_FIELD']/div/div)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0026-No Signature Found']//parent::td")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_NoSignatureFound;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_NoSignatureFound() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_NoSignatureFound;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0026-No Signature Found']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_NoSignatureFoundFlag;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_NoSignatureFoundFlag() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_NoSignatureFoundFlag;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0011-Account Dormant']//parent::td")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_AccountDormant;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_AccountDormant() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_AccountDormant;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0011-Account Dormant']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_AccountDormantFlag;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_AccountDormantFlag() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_AccountDormantFlag;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0029-Value Date Changed']//parent::td")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_ValueDateChanged;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_ValueDateChanged() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_ValueDateChanged;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0029-Value Date Changed']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_ValueDateChangedFlag;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_ValueDateChangedFlag() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_ValueDateChangedFlag;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0042-Overdraw Limit Exceeded']//parent::td")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_OverDrawLimitExceeded;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_OverDrawLimitExceeded() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_OverDrawLimitExceeded;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0042-Overdraw Limit Exceeded']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_OverDrawLimitExceededFlag;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_OverDrawLimitExceededFlag() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_OverDrawLimitExceededFlag;
	}

	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_4_CUSTOM_FIELD'])[2]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_FixedMaturityAccounts;

	public WebElement SystemParameters_ControlRecord_AlertActivation_FixedMaturityAccounts() {
		return SystemParameters_ControlRecord_AlertActivation_FixedMaturityAccounts;
	}

	@FindBy(xpath = "//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0110-KYC Outstanding']//parent::td")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_KycOutStanding;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_KycOutStanding() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_KycOutStanding;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0110-KYC Outstanding']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_KycOutStandingFlag;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_KycOutStandingFlag() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_KycOutStandingFlag;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0025-CIF is blacklisted']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_CifIsBlacklisted;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_CifIsBlacklisted() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_CifIsBlacklisted;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0024-CIF is suspicious']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_CifIsSuspicious;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_CifIsSuspicious() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_CifIsSuspicious;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0013-Interbranch Entry']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_InterbranchEntry;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_InterbranchEntry() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_InterbranchEntry;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0023-CIF Below Minimum Age']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_CIFBelowMinimumAge;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_CIFBelowMinimumAge() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_CIFBelowMinimumAge;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0014-Account with Link Management']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_AccountwithLinkManagement;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_AccountwithLinkManagement() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_AccountwithLinkManagement;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0012-Exchange rate Changed']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_ExchangeRateChanged;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_ExchangeRateChanged() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_ExchangeRateChanged;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0019-Cancel Transaction']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_CancelTransaction;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_CancelTransaction() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_CancelTransaction;
	}

	@FindBy(xpath = "(//table[@id='tab4_GridTbl_Id_O001UP']//span[text()='0020-Reverse Transaction']//ancestor::tr//input)[1]")
	private WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_ReverseTransaction;

	public WebElement SystemParameters_ControlRecord_AlertActivation_Transactions_ReverseTransaction() {
		return SystemParameters_ControlRecord_AlertActivation_Transactions_ReverseTransaction;
	}

	@FindBy(xpath = "//input[@id='allow_reverse_trx_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AllowReverseTransaction;

	public WebElement TransactionType_UpdateAfterApprove_AllowReverseTransaction() {
		return TransactionType_UpdateAfterApprove_AllowReverseTransaction;
	}

	@FindBy(xpath = "//input[@id='alert_flow_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Alertflowonoverdrawn;

	public WebElement TransactionType_UpdateAfterApprove_Alertflowonoverdrawn() {
		return TransactionType_UpdateAfterApprove_Alertflowonoverdrawn;
	}

	@FindBy(xpath = "//a[@id='transactionTypes_tab_otherInfo_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Otherinfo;

	public WebElement TransactionType_UpdateAfterApprove_Otherinfo() {
		return TransactionType_UpdateAfterApprove_Otherinfo;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_additional_template_entries_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_Otherinfo_AdditionalTemplateEntries;

	public WebElement TransactionType_UpdateAfterApprove_Otherinfo_AdditionalTemplateEntries() {
		return TransactionType_UpdateAfterApprove_Otherinfo_AdditionalTemplateEntries;
	}

	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']//div[text()='Cannot Proceed']")
	private WebElement CannotProceed_Popup;

	public WebElement CannotProceed_Popup() {
		return CannotProceed_Popup;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA0']")
	private WebElement TransactionType_UpdateAfterApprove_DeductfromCash;

	public WebElement TransactionType_UpdateAfterApprove_DeductfromCash() {
		return TransactionType_UpdateAfterApprove_DeductfromCash;
	}

	@FindBy(xpath = "//input[@id='exch_rate_update_warn_msg_yn_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ExchangeRateWarningpopup;

	public WebElement TransactionType_UpdateAfterApprove_ExchangeRateWarningpopup() {
		return TransactionType_UpdateAfterApprove_ExchangeRateWarningpopup;
	}

	@FindBy(xpath = "//input[@id='inverseExchangeRate_D001MT']")
	private WebElement Transactions_Maintenance_InverseExchangeRate;

	public WebElement Transactions_Maintenance_InverseExchangeRate() {
		return Transactions_Maintenance_InverseExchangeRate;
	}

	@FindBy(xpath = "//input[@id='proceed_cif_incative_yn_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ProceedifCIFinactive;

	public WebElement TransactionType_UpdateAfterApprove_ProceedifCIFinactive() {
		return TransactionType_UpdateAfterApprove_ProceedifCIFinactive;
	}

	@FindBy(xpath = "//input[@id='allow_reverse_today_trx_only_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ReverseTodayTransaction;

	public WebElement TransactionType_UpdateAfterApprove_ReverseTodayTransaction() {
		return TransactionType_UpdateAfterApprove_ReverseTodayTransaction;
	}

	@FindBy(xpath = "//input[@id='same_acc_cy_trs_cy_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_SameAccandTrxCurrency;

	public WebElement TransactionType_UpdateAfterApprove_SameAccandTrxCurrency() {
		return TransactionType_UpdateAfterApprove_SameAccandTrxCurrency;
	}

	@FindBy(xpath = "//input[@id='show_fees_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_ShowFeesinSOA;

	public WebElement TransactionType_UpdateAfterApprove_ShowFeesinSOA() {
		return TransactionType_UpdateAfterApprove_ShowFeesinSOA;
	}

	@FindBy(xpath = "//input[@id='cancel_on_creation_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_AllowCancelonCreation;

	public WebElement TransactionType_UpdateAfterApprove_AllowCancelonCreation() {
		return TransactionType_UpdateAfterApprove_AllowCancelonCreation;
	}
	
	@FindBy(xpath = "//input[@id='default_trscy_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_SetDefaultTrxCurrency;

	public WebElement TransactionType_UpdateAfterApprove_SetDefaultTrxCurrency() {
		return TransactionType_UpdateAfterApprove_SetDefaultTrxCurrency;
	}
	
	@FindBy(xpath = "//input[@id='not_use_in_trx_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_NottobeusedinTransaction;

	public WebElement TransactionType_UpdateAfterApprove_NottobeusedinTransaction() {
		return TransactionType_UpdateAfterApprove_NottobeusedinTransaction;
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
	
	@FindBy(xpath = "//input[@id='hide_in_trs_P024MA']")
	private WebElement TransactionType_UpdateAfterApprove_HideinTransaction;

	public WebElement TransactionType_UpdateAfterApprove_HideinTransaction() {
		return TransactionType_UpdateAfterApprove_HideinTransaction;
	}

	@FindBy(xpath = "//input[@id='multi_trx_P024MA']")
	private WebElement MultipleTransfer_UpdateAfterApprove_TransactionType;
	public WebElement MultipleTransfer_UpdateAfterApprove_TransactionType() {
	return MultipleTransfer_UpdateAfterApprove_TransactionType;
		}
		
	@FindBy(xpath = "//td[@id='td_tab31_GridTbl_Id_P024MA_1_ctstrxtypeStatusVO.HIGHLIGHT_RED']//input")
	private WebElement HighlightOfficerwithredInFlag_InTRXStatus_UpdateAfterApprove_TransactionType;
	public WebElement HighlightOfficerwithredInFlag_InTRXStatus_UpdateAfterApprove_TransactionType() {
	return HighlightOfficerwithredInFlag_InTRXStatus_UpdateAfterApprove_TransactionType;
		}

@FindBy(xpath = "//input[@id='trxTypeGroupList_GridTbl_Id_P0057MA_gs_ctstrxtypeGrpVO.CODE']")
		private WebElement TransactionTypeGroup_UpdateAfterApprove_Code;

		public WebElement TransactionTypeGroup_UpdateAfterApprove_Code() {
			return TransactionTypeGroup_UpdateAfterApprove_Code;
		}//table[@id='trxTypeGroupList_GridTbl_Id_P0057MA']//td[text()='500']
		
		@FindBy(xpath = "//td[@id='add_tab2_GridTbl_Id_P0057MA']")
		private WebElement TransactionTypeGroup_UpdateAfterApprove_Addicon;

		public WebElement TransactionTypeGroup_UpdateAfterApprove_Addicon() {
			return TransactionTypeGroup_UpdateAfterApprove_Addicon;
		}
		
		@FindBy(xpath = "//td[@id='del_tab2_GridTbl_Id_P0057MA']")
		private WebElement TransactionTypeGroup_UpdateAfterApprove_Deleteicon;

		public WebElement TransactionTypeGroup_UpdateAfterApprove_Deleteicon() {
			return TransactionTypeGroup_UpdateAfterApprove_Deleteicon;
		}
		
		@FindBy(xpath = "//table[@id='tab2_GridTbl_Id_P0057MA']//td[@tdlabel='Type']//input")
		private WebElement TransactionTypeGroup_UpdateAfterApprove_Type;

		public WebElement TransactionTypeGroup_UpdateAfterApprove_Type() {
			return TransactionTypeGroup_UpdateAfterApprove_Type;
		}

		@FindBy(xpath = "//label[@id='trxTypeGroupMaint_FormId_P0057MA_Update_After_Approve_key']")
		private WebElement TransactionTypeGroup_UpdateAfterApprove_UpdateBtn;

		public WebElement TransactionTypeGroup_UpdateAfterApprove_UpdateBtn() {
			return TransactionTypeGroup_UpdateAfterApprove_UpdateBtn;
		}
		
		@FindBy(xpath = "//input[@id='trxTypeGroupList_GridTbl_Id_P0057P_gs_ctstrxtypeGrpVO.CODE']")
		private WebElement TransactionTypeGroup_Approve_Code;

		public WebElement TransactionTypeGroup_Approve_Code() {
			return TransactionTypeGroup_Approve_Code;
		}//table[@id='trxTypeGroupList_GridTbl_Id_P0057P']//td[text()='300']

		@FindBy(xpath = "//label[@id='trxTypeGroupMaint_FormId_P0057P_Approve_key']")
		private WebElement TransactionTypeGroup_Approve_ApproveBtn;

		public WebElement TransactionTypeGroup_Approve_ApproveBtn() {
			return TransactionTypeGroup_Approve_ApproveBtn;
		}


		@FindBy(xpath = "//div[@ID='panel_5_P024MA']")
		private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeInfo;

		public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeInfo() {
			return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeInfo;
		}
		
		@FindBy(xpath = "//input[@id='default_chq_date_P024MA']")
		private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultChequeDate;

		public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultChequeDate() {
			return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultChequeDate;
		}
		
		@FindBy(xpath = "//input[@id='allow_change_clearing_acc_P024MA']")
		private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowClearingAccount;
		public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowClearingAccount() {
			return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowClearingAccount;
		}
		
		@FindBy(xpath = "//div[@id='panel_3_P024MA']")
		private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AvailableOptionforDeduct_Section;
		public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AvailableOptionforDeduct_Section() {
			return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AvailableOptionforDeduct_Section;
		}
		
		@FindBy(xpath = "//input[@id='deduct_cash_P024MA']")
		private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails_Cash_Flag;
		public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails_Cash_Flag() {
			return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails_Cash_Flag;
		}
		
		@FindBy(xpath = "//div[@ID='panel_6_P024MA']")
		private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_Section;
		public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_Section() {
			return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_Section;
		}

		@FindBy(xpath = "((//td[@class='vAlignTop'])[2]//td)[1]//a")
		private WebElement TransactionType_UpdateAfterApprove_AllowedGL;
		public WebElement TransactionType_UpdateAfterApprove_AllowedGL() {
			return TransactionType_UpdateAfterApprove_AllowedGL;
		}
		
		@FindBy(xpath = "//td[@id='del_tab38_GridTbl_Id_P024MA']/div/span")
		private WebElement TransactionType_UpdateAfterApprove_AllowedGL_Deleteicon;
		public WebElement TransactionType_UpdateAfterApprove_AllowedGL_Deleteicon() {
			return TransactionType_UpdateAfterApprove_AllowedGL_Deleteicon;
		}
		
		@FindBy(xpath = "((//td[@class='vAlignTop'])[2]//td)[2]//a")
		private WebElement TransactionType_UpdateAfterApprove_AllowedCifTypes;
		public WebElement TransactionType_UpdateAfterApprove_AllowedCifTypes() {
			return TransactionType_UpdateAfterApprove_AllowedCifTypes;
		}
		
		@FindBy(xpath = "//td[@id='del_tab39_GridTbl_Id_P024MA']/div/span")
		private WebElement TransactionType_UpdateAfterApprove_AllowedCifTypes_Deleteicon;
		public WebElement TransactionType_UpdateAfterApprove_AllowedCifTypes_Deleteicon() {
			return TransactionType_UpdateAfterApprove_AllowedCifTypes_Deleteicon;
		}
		
		@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
		private WebElement CSM_Transaction_Maintanance_SearchButton;
		public WebElement CSM_Transaction_Maintanance_SearchButton() {
			return CSM_Transaction_Maintanance_SearchButton;
		}
//karthisteps new

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

	@FindBy(xpath =  "//span[text()='Transactions']//parent::td/div/div")
	private WebElement csmParam_controlRecord_AlertActivation_Transaction;

	public WebElement csmParam_controlRecord_AlertActivation_Transaction() {
		return csmParam_controlRecord_AlertActivation_Transaction;
	}	
	
	@FindBy(xpath = "(//td[@id='td_tab4_GridTbl_Id_O001UP_21_CUSTOM_FIELD'])[1]")
	private WebElement CSMParam_controlRecord_specialuser_authOD;

	public WebElement CSMParam_controlRecord_specialuser_authOD() {
		return CSMParam_controlRecord_specialuser_authOD;
	}
	
	@FindBy(xpath = "//input[@id='1x1x30_ctscontrolAlertVO.ACTIVATE_tab4_GridTbl_Id_O001UP']")
	private WebElement CSMParam_controlRecord_specialuser_authOD_chechkbox;

	public WebElement CSMParam_controlRecord_specialuser_authOD_chechkbox() {
		return CSMParam_controlRecord_specialuser_authOD_chechkbox;
	}
	
	@FindBy(xpath = "//input[@id='input_amount_D001AU_ALERT']")

	private WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount;

	public WebElement BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount() {

		return BMUserAlertEnterTRXNoselectRecordOpenItems_InputAmount;

	}

@FindBy(xpath = "//input[@id='current_status_D001MT']")

	private WebElement Transactions_Maintenance_screen_Status_field;

	public WebElement Transactions_Maintenance_screen_Status_field() {

		return Transactions_Maintenance_screen_Status_field;

	}


}