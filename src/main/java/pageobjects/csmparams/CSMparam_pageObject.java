package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMparam_pageObject {
	WebDriver driver;

	public CSMparam_pageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@ID='panel_5_P024MA']//span[text()='Cheque Info']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeInfo_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeInfo_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeInfo_609;
	}

	@FindBy(xpath = "//input[@id='default_chq_date_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultChequeDate_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultChequeDate_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultChequeDate_609;
	}

	@FindBy(xpath = "//input[@id='dflt_starting_dt_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultStartingDate_609;
	}

	@FindBy(xpath = "//input[@id='deduct_cash_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails_Cash_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails_Cash_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AdditionalDetails_Cash_609;
	}

	@FindBy(xpath = "//input[@id='allow_change_clearing_acc_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowClearingAccount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowClearingAccount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowClearingAccount_609;
	}

	@FindBy(xpath = "//input[@id='rqst_cy_nomination_det_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_CYDenomination_609;
	}

	@FindBy(xpath = "//div[@ID='panel_6_P024MA']//span[text()='Standing Order']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_StandingOrder_609;
	}

	// ------------------
	@FindBy(xpath = "//label[@id='logout']")
	private WebElement CSM_Logout_609;

	public WebElement CSM_Logout_609() {
		return CSM_Logout_609;
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

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement Parameters_SystemParameters_ControlRecord_609;

	public WebElement Parameters_SystemParameters_ControlRecord_609() {
		return Parameters_SystemParameters_ControlRecord_609;
	}

	@FindBy(xpath = "//a[@id='O001UP']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//select[@id='send_clear_entry_O001UP']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry_609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry_609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_SendtoClearEntry_609;
	}
	// Send to Clear Process

	@FindBy(xpath = "//input[@id='chqbook_process_O001UP']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_ChequebookAdvanceProcess_609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_ChequebookAdvanceProcess_609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_ChequebookAdvanceProcess_609;
	}

	@FindBy(xpath = "")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_NoClearingEntries_609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_NoClearingEntries_609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_NoClearingEntries_609;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn609;

	public WebElement Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn609() {
		return Parameters_SystemParameters_ControlRecord_UpdateAfterApprove_UpdateBtn609;
	}

	@FindBy(xpath = "//a[@id='O001P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_ControlRecord_Approve_609;

	public WebElement Parameters_SystemParameters_ControlRecord_Approve_609() {
		return Parameters_SystemParameters_ControlRecord_Approve_609;
	}

	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609;

	public WebElement Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609() {
		return Parameters_SystemParameters_ControlRecord_Approve_ApproveBtn609;
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

	@FindBy(xpath = "//input[@id='multi_cy_P029MA']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_MultiCurrency_609;
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

	@FindBy(xpath = "//input[@id='pop_acc_full_name_to_print_yn_P029MA']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_PopulateAccountsflag_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_PopulateAccountsflag_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_PopulateAccountsflag_609;
	}

	@FindBy(xpath = "//input[@id='allow_auto_approve_yn_P029MA']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_AllowAutoApprove_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_AllowAutoApprove_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_AllowAutoApprove_609;
	}

	@FindBy(xpath = "//input[@id='allow_auto_submit_yn_P029MA']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_AllowAutoSubmit_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_AllowAutoSubmit_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_AllowAutoSubmit_609;
	}

	@FindBy(xpath = "//input[@id='auto_submit_P029MA']")
	private WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_AutoSubmitUponApprove_609;

	public WebElement Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_AutoSubmitUponApprove_609() {
		return Parameters_SystemParameters_Cheques_Chequebook_UpdateAfterApprove_AutoSubmitUponApprove_609;
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

	@FindBy(xpath = "//input[@id='cr_dr_forex_P024MAC']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MainAccCredit_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MainAccCredit_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MainAccCredit_609;
	}

	/// *** Cif Charges ***///

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

	/// *** Cif Type Charges ***///

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

	@FindBy(xpath = "//table[@id='tab26_GridTbl_Id_P024MA']//td[@tdlabel='CIF Type']//input")
	private WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CifType_609;

	public WebElement TransactionType_UpdateAfterApprove_CifTypeCharges_CifType_609() {
		return TransactionType_UpdateAfterApprove_CifTypeCharges_CifType_609;
	}

	@FindBy(xpath = "//table[@id='tab26_GridTbl_Id_P024MA']//td[@tdlabel='Charge Schema Details']//input")
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

	/// *** Transaction Status ***///

	@FindBy(xpath = "//span[contains(text(),' Transaction Status ')]")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_TrxStatus_609;
	}

	@FindBy(xpath = "//td[@id='add_tab31_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Addicon_609;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Addicon_609() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab31_GridTbl_Id_P024MA']/div/span")
	private WebElement TransactionType_UpdateAfterApprove_TrxStatus_Deleteicon_609;

	public WebElement TransactionType_UpdateAfterApprove_TrxStatus_Deleteicon_609() {
		return TransactionType_UpdateAfterApprove_TrxStatus_Deleteicon_609;
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

	@FindBy(xpath = "//input[@id='auto_approve_within_limit_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AutomaticApproveIfUserWithinLimits_609;
	}

	@FindBy(xpath = "//input[@id='allow_reverse_trx_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowReverseTransaction_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowReverseTransaction_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowReverseTransaction_609;
	}

	@FindBy(xpath = "//input[@id='deduct_debitor_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DebtorAccount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DebtorAccount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DebtorAccount_609;
	}

	@FindBy(xpath = "//span[text()='Available Options for Deduct I']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AvailableOptionforDeduct_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AvailableOptionforDeduct_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AvailableOptionforDeduct_609;
	}

	@FindBy(xpath = "//input[@id='deduct_chrg_from_trx_P024MA3']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromDebtorAccount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromDebtorAccount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DeductfromDebtorAccount_609;
	}

	@FindBy(xpath = "//input[@id='allow_modify_chrg_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoModifyAmount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoModifyAmount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoModifyAmount_609;
	}

	@FindBy(xpath = "//input[@id='multi_trx_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MultipleTransfer_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MultipleTransfer_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_MultipleTransfer_609;
	}

	@FindBy(xpath = "//input[@id='multi_branch_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_EnableMultipleBranch_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_EnableMultipleBranch_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_EnableMultipleBranch_609;
	}

	@FindBy(xpath = "//input[@id='allow_clearing_chrg_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoClearCharge_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoClearCharge_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoClearCharge_609;
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

	@FindBy(xpath = "//select[@id='chq_related_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_Cheques_609;
	}
	// House Cheque

	@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ForceOverdraw_609;
	}

	@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ProceedonInsuffucientFund_609;
	}

	@FindBy(xpath = "//input[@id='allow_local_approve_only_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowLocalApprovalOnly_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowLocalApprovalOnly_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowLocalApprovalOnly_609;
	}

	@FindBy(xpath = "//input[@id='default_trscy_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_SetDefaultTrxCurrency_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_SetDefaultTrxCurrency_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_SetDefaultTrxCurrency_609;
	}

	@FindBy(xpath = "//input[@id='default_acc_bal_in_amt_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultAccountBalanceinAmount609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultAccountBalanceinAmount609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_DefaultAccountBalanceinAmount609;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargesonVoiding_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_so_chrg_schema_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChargeSchema_609;
	}

	@FindBy(xpath = "//input[@id='cc_maintain_serial_no_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ChequeValidityDuringWD_609;
	}

	@FindBy(xpath = "//input[@id='charges_on_voiding_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargeonVoid_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargeonVoid_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_ApplyChargeonVoid_609;
	}

	@FindBy(xpath = "//input[@id='allow_change_clearing_acc_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoChangeClearingAccount_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoChangeClearingAccount_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowtoChangeClearingAccount_609;
	}

	@FindBy(xpath = "//input[@id='proceed_drawn_checks_P024MA']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_AllowProceedonDrawnCheques_609;
	}

	@FindBy(xpath = "//div[@id='panel_4_P024MA']//span[text()='Main Details']")
	private WebElement Parameters_SystemParameters_TransactionType_MainDetails_609;

	public WebElement Parameters_SystemParameters_TransactionType_MainDetails_609() {
		return Parameters_SystemParameters_TransactionType_MainDetails_609;
	}

	@FindBy(xpath = "//div[@id='panel_2_P024MA']//span[text()='Additional Details']")
	private WebElement Parameters_SystemParameters_TransactionType_AdditionalDetails_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_AdditionalDetails_UpdateBtn_609() {
		return Parameters_SystemParameters_TransactionType_AdditionalDetails_UpdateBtn_609;
	}

	@FindBy(xpath = "//div[@id='panel_3_P024MA']//span[text()='Available Options for Deduct I']")
	private WebElement Parameters_SystemParameters_TransactionType_AvailableOptionsforDeduct1_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_AvailableOptionsforDeduct1_UpdateBtn_609() {
		return Parameters_SystemParameters_TransactionType_AvailableOptionsforDeduct1_UpdateBtn_609;
	}

	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_TransactionType_UpdateAfterApprove_UpdateBtn_609;
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

	/// **** Parameters -> Account Parameters -> CIF and Account limits ****///

	@FindBy(xpath = "//td[text()='CIF & Account limits']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_609() {
		return Parameters_AccountParameters_CIFAccountLimits_609;
	}

	@FindBy(xpath = "//a[@id='AC002MA']/span[text()='Update After Approve']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='accountLimitsList_GridTbl_Id_AC002MA_gs_ctsAccLimitsVO.CODE']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_LimitCode_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_LimitCode_609() {
		return Parameters_AccountParameters_CIFAccountLimits_LimitCode_609;
	}

	@FindBy(xpath = "//select[@id='acc_limit_type_by_AC002MA']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_LimitType_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_LimitType_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_LimitType_609;
	}// index - 2

	@FindBy(xpath = "//label[@id='accountLimitsMaint_FormId_AC002MA_account_types']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_AccountType_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_AccountType_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_AccountType_609;
	}

	@FindBy(xpath = "//td[@id='add_tab2_GridTbl_Id_AC002MA']/div/span")
	private WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_Addicon_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_Addicon_609() {
		return CIFAccountLimits_UpdateAfterApprove_AccountType_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab2_GridTbl_Id_AC002MA']/div/span")
	private WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_Deleteicon_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_Deleteicon_609() {
		return CIFAccountLimits_UpdateAfterApprove_AccountType_Deleteicon_609;
	}

	@FindBy(xpath = "//td[@tdlabel='Account Type']//input")
	private WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_GL_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_AccountType_GL_609() {
		return CIFAccountLimits_UpdateAfterApprove_AccountType_GL_609;
	}

	@FindBy(xpath = "//td[@id='add_tab3_GridTbl_Id_AC002MA']/div/span")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Addicon_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Addicon_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab3_GridTbl_Id_AC002MA']/div/span")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Deleteicon_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Deleteicon_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Deleteicon_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//select)[1]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_LimitType_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_LimitType_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_LimitType_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//select)[2]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_SingleTotal_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_SingleTotal_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_SingleTotal_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//input)[2]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Currency_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Currency_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Currency_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//input)[3]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Amount_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Amount_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Amount_609;
	}

	@FindBy(xpath = "(//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//select)[3]")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Period_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Period_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_Period_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//label[text()='Allowed CIF Types']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_CifType_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_CifType_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_CifType_609;
	}

	@FindBy(xpath = "//td[@id='add_tab9_1_MAX_GridTbl_Id_AC002MA']/div/span")
	private WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_Addicon_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_Addicon_609() {
		return CIFAccountLimits_UpdateAfterApprove_Max_CifType_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab9_1_MAX_GridTbl_Id_AC002MA']/div/span")
	private WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_Deleteicon_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_Deleteicon_609() {
		return CIFAccountLimits_UpdateAfterApprove_Max_CifType_Deleteicon_609;
	}

	@FindBy(xpath = "//td[@tdlabel='CIF Type']//input")
	private WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_CIF_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_Max_CifType_CIF_609() {
		return CIFAccountLimits_UpdateAfterApprove_Max_CifType_CIF_609;
	}

	@FindBy(xpath = "//table[@id='tab3_GridTbl_Id_AC002MA']//tr[2]//label[text()='Action Details']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_609;
	}

	@FindBy(xpath = "//select[@id='acc_limit_action_type_1_MAX_AC002MA']")
	private WebElement CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_ActionType_609;

	public WebElement CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_ActionType_609() {
		return CIFAccountLimits_UpdateAfterApprove_Max_ActionDetails_ActionType_609;
	}// Warn//Stop

	@FindBy(xpath = "//label[@id='accountLimitsMaint_FormId_AC002MA_Update_After_Approve_key']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_AccountParameters_CIFAccountLimits_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='AC002P']/span[text()='Approve']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_609() {
		return Parameters_AccountParameters_CIFAccountLimits_Approve_609;
	}

	@FindBy(xpath = "//input[@id='accountLimitsList_GridTbl_Id_AC002P_gs_ctsAccLimitsVO.CODE']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_Limitcode_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_Limitcode_609() {
		return Parameters_AccountParameters_CIFAccountLimits_Approve_Limitcode_609;
	}

	@FindBy(xpath = "//label[@id='accountLimitsMaint_FormId_AC002P_Approve_key']")
	private WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_ApproveBtn_609;

	public WebElement Parameters_AccountParameters_CIFAccountLimits_Approve_ApproveBtn_609() {
		return Parameters_AccountParameters_CIFAccountLimits_Approve_ApproveBtn_609;
	}

	/// **** Parameters -> Account Parameters -> Transfer Accounts Exceptions
	/// ****///

	@FindBy(xpath = "//td[text()='Transfer Accounts Exceptions']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_609;
	}

	@FindBy(xpath = "//a[@id='A0016MT']/span[text()='Maintenance']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_Maintenance_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_Maintenance_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_Maintenance_609;
	}

	@FindBy(xpath = "//a[@id='A0016UP']/span[text()='Update After Approve']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='transferAccountsExceptionParamList_GridTbl_Id_A0016UP_gs_ctsTrsfrAccExcepParamVO.CODE']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_Code_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_Code_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_Code_609;
	}
	// (//table[@id='transferAccountsExceptionParamList_GridTbl_Id_A0016UP']//td[text()='6'])[1]

	@FindBy(xpath = "//input[@id='lookuptxt_from_br_code_A0016UP']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_FromBranch_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_FromBranch_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_FromBranch_609;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_br_code_A0016UP']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_ToBranch_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_ToBranch_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_ToBranch_609;
	}

	// table[@id='tab1_GridTbl_Id_A0016UP']/tbody

	@FindBy(xpath = "//td[@id='add_tab1_GridTbl_Id_A0016UP']/div/span")
	private WebElement TransferAccountsExceptions_UpdateAfterApprove_Exceptions_Addicon_609;

	public WebElement TransferAccountsExceptions_UpdateAfterApprove_Exceptions_Addicon_609() {
		return TransferAccountsExceptions_UpdateAfterApprove_Exceptions_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab1_GridTbl_Id_A0016UP']/div/span")
	private WebElement TransferAccountsExceptions_UpdateAfterApprove_Exceptions_Deleteicon_609;

	public WebElement TransferAccountsExceptions_UpdateAfterApprove_Exceptions_Deleteicon_609() {
		return TransferAccountsExceptions_UpdateAfterApprove_Exceptions_Deleteicon_609;
	}

	@FindBy(xpath = "//td[@tdlabel='Exception Factor']//select")
	private WebElement TransferAccountsExceptions_UpdateAfterApprove_Exceptions_ExceptionFactor_609;

	public WebElement TransferAccountsExceptions_UpdateAfterApprove_Exceptions_ExceptionFactor_609() {
		return TransferAccountsExceptions_UpdateAfterApprove_Exceptions_ExceptionFactor_609;
	}

	@FindBy(xpath = "//td[@tdlabel='exception_value_key']//input")
	private WebElement TransferAccountsExceptions_UpdateAfterApprove_Exceptions_ExceptionValue_609;

	public WebElement TransferAccountsExceptions_UpdateAfterApprove_Exceptions_ExceptionValue_609() {
		return TransferAccountsExceptions_UpdateAfterApprove_Exceptions_ExceptionValue_609;
	}

	@FindBy(xpath = "//label[@id='transferAccountsExceptionParamMaint_FormId_A0016UP_Update_After_Approve_key']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='A0016P']/span[text()='Approve']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_Approve_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_Approve_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_Approve_609;
	}

	@FindBy(xpath = "//input[@id='transferAccountsExceptionParamList_GridTbl_Id_A0016P_gs_ctsTrsfrAccExcepParamVO.CODE']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_Approve_Code_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_Approve_Code_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_Approve_Code_609;
	}
	// (//table[@id='transferAccountsExceptionParamList_GridTbl_Id_A0016P']//td[text()='101'])[1]

	@FindBy(xpath = "//label[@id='transferAccountsExceptionParamMaint_FormId_A0016P_Approve_key']")
	private WebElement Parameters_AccountParameters_TransferAccountsExceptions_Approve_ApproveBtn_609;

	public WebElement Parameters_AccountParameters_TransferAccountsExceptions_Approve_ApproveBtn_609() {
		return Parameters_AccountParameters_TransferAccountsExceptions_Approve_ApproveBtn_609;
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

	@FindBy(xpath = "//input[@id='user_is_branch_manager_E000MA']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_BranchManager_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_BranchManager_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_BranchManager_609;
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

	@FindBy(xpath = "//table[@id='tab3_C_GridTbl_Id_E000MA']//td[@tdlabel='Deposit Limit']//input")
	private WebElement User_UpdateAfterApprove_Limits_DepositLimit_609;

	public WebElement User_UpdateAfterApprove_Limits_DepositLimit_609() {
		return User_UpdateAfterApprove_Limits_DepositLimit_609;
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

	// **Cif Type**//

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
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Priority_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_Priority_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_Priority_609;
	}

	@FindBy(xpath = "//td[@id='add_tab5_P_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_Priority_Addicon_609;

	public WebElement User_UpdateAfterApprove_Priority_Addicon_609() {
		return User_UpdateAfterApprove_Priority_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab5_P_GridTbl_Id_E000MA']/div/span")
	private WebElement User_UpdateAfterApprove_Priority_Deleteicon_609;

	public WebElement User_UpdateAfterApprove_Priority_Deleteicon_609() {
		return User_UpdateAfterApprove_Priority_Deleteicon_609;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Priority']//input")
	private WebElement User_UpdateAfterApprove_Priority_Priority_609;

	public WebElement User_UpdateAfterApprove_Priority_Priority_609() {
		return User_UpdateAfterApprove_Priority_Priority_609;
	}

	@FindBy(xpath = "//table[@id='tab5_P_GridTbl_Id_E000MA']//td[@tdlabel='Transaction']//input")
	private WebElement User_UpdateAfterApprove_Priority_TrxType_609;

	public WebElement User_UpdateAfterApprove_Priority_TrxType_609() {
		return User_UpdateAfterApprove_Priority_TrxType_609;
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
	/// *****///

	@FindBy(xpath = "//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_User_UpdateAfterApprove_UpdateBtn_609;
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

	/// *** Charges ***///

	@FindBy(xpath = "//td[text()='Charges']")
	private WebElement Parameters_SystemParameters_Charges_609;

	public WebElement Parameters_SystemParameters_Charges_609() {
		return Parameters_SystemParameters_Charges_609;
	}

	@FindBy(xpath = "//td[text()='Maintenance of Charges']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_609;
	}

	@FindBy(xpath = "//a[@id='C0011MA']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_609;
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

	@FindBy(xpath = "//input[@id='allow_clearing_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowtoModifyandClear_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowtoModifyandClear_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowtoModifyandClear_609;
	}

	@FindBy(xpath = "//input[@id='allow_modify_C0011MA']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_AllowModify_609;
	}

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='C0011P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_609;
	}

	@FindBy(xpath = "//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_Code_609;
	}
	// table[@id='chargesParamList_GridTbl_Id_C0011P']//td[text()='7']

	@FindBy(xpath = "//label[@id='chargesParamMaint_FormId_C0011P_Approve_key']")
	private WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_Charges_MaintenanceofCharges_Approve_ApproveBtn_609;
	}

	/// *** Transaction Type Group ***///

	@FindBy(xpath = "//td[text()='Transaction Type Group']")
	private WebElement Parameters_SystemParameters_TransactionTypeGroup_609;

	public WebElement Parameters_SystemParameters_TransactionTypeGroup_609() {
		return Parameters_SystemParameters_TransactionTypeGroup_609;
	}

	@FindBy(xpath = "//a[@id='P0057MA']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_TransactionTypeGroup_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_TransactionTypeGroup_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_TransactionTypeGroup_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='trxTypeGroupList_GridTbl_Id_P0057MA_gs_ctstrxtypeGrpVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionTypeGroup_UpdateAfterApprove_Code_609;

	public WebElement Parameters_SystemParameters_TransactionTypeGroup_UpdateAfterApprove_Code_609() {
		return Parameters_SystemParameters_TransactionTypeGroup_UpdateAfterApprove_Code_609;
	}
	// (//table[@id='trxTypeGroupList_GridTbl_Id_P0057MA']//td[text()='181'])[1]

	@FindBy(xpath = "//td[@id='add_tab2_GridTbl_Id_P0057MA']/div/span")
	private WebElement TransactionTypeGroup_UpdateAfterApprove_Addicon_609;

	public WebElement TransactionTypeGroup_UpdateAfterApprove_Addicon_609() {
		return TransactionTypeGroup_UpdateAfterApprove_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab2_GridTbl_Id_P0057MA']/div/span")
	private WebElement TransactionTypeGroup_UpdateAfterApprove_Deleteicon_609;

	public WebElement TransactionTypeGroup_UpdateAfterApprove_Deleteicon_609() {
		return TransactionTypeGroup_UpdateAfterApprove_Deleteicon_609;
	}

	@FindBy(xpath = "//table[@id='tab2_GridTbl_Id_P0057MA']//td[@tdlabel='Type']//input")
	private WebElement TransactionTypeGroup_UpdateAfterApprove_Type_609;

	public WebElement TransactionTypeGroup_UpdateAfterApprove_Type_609() {
		return TransactionTypeGroup_UpdateAfterApprove_Type_609;
	}

	@FindBy(xpath = "//label[@id='trxTypeGroupMaint_FormId_P0057MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionTypeGroup_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_TransactionTypeGroup_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_TransactionTypeGroup_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='P0057P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_TransactionTypeGroup_Approve_609;

	public WebElement Parameters_SystemParameters_TransactionTypeGroup_Approve_609() {
		return Parameters_SystemParameters_TransactionTypeGroup_Approve_609;
	}

	@FindBy(xpath = "//input[@id='trxTypeGroupList_GridTbl_Id_P0057P_gs_ctstrxtypeGrpVO.CODE']")
	private WebElement Parameters_SystemParameters_TransactionTypeGroup_Approve_Code_609;

	public WebElement Parameters_SystemParameters_TransactionTypeGroup_Approve_Code_609() {
		return Parameters_SystemParameters_TransactionTypeGroup_Approve_Code_609;
	}
	// (//table[@id='trxTypeGroupList_GridTbl_Id_P0057P']//td[text()='452'])[1]

	@FindBy(xpath = "//label[@id='trxTypeGroupMaint_FormId_P0057P_Approve_key']")
	private WebElement Parameters_SystemParameters_TransactionTypeGroup_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_TransactionTypeGroup_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_TransactionTypeGroup_Approve_ApproveBtn_609;
	}

	/// *** Reason ***///

	@FindBy(xpath = "//td[text()='Reasons']")
	private WebElement Parameters_SystemParameters_Reason_609;

	public WebElement Parameters_SystemParameters_Reason_609() {
		return Parameters_SystemParameters_Reason_609;
	}

	@FindBy(xpath = "//a[@id='P0032MT']//span[text()='Maintenance']")
	private WebElement Parameters_SystemParameters_Reason_Maintenance_609;

	public WebElement Parameters_SystemParameters_Reason_Maintenance_609() {
		return Parameters_SystemParameters_Reason_Maintenance_609;
	}

	@FindBy(xpath = "//select[@id='reason_type_P0032MT']")
	private WebElement Parameters_SystemParameters_Reason_Maintenance_ReasonType_609;

	public WebElement Parameters_SystemParameters_Reason_Maintenance_ReasonType_609() {
		return Parameters_SystemParameters_Reason_Maintenance_ReasonType_609;
	}// 8

	@FindBy(xpath = "//input[@id='auto_set_for_acc_trnsfr_yn_P0032MT']")
	private WebElement Parameters_SystemParameters_Reason_Maintenance_AutomaticallysetforAccountTransfer_609;

	public WebElement Parameters_SystemParameters_Reason_Maintenance_AutomaticallysetforAccountTransfer_609() {
		return Parameters_SystemParameters_Reason_Maintenance_AutomaticallysetforAccountTransfer_609;
	}

	@FindBy(xpath = "//a[@id='P0032MA']//span[text()='Update After Approve']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='reasonsList_GridTbl_Id_P0032MA_gs_ctsreasonsVO.CODE']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_Code_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_Code_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_Code_609;
	}

	// table[@id='reasonsList_GridTbl_Id_P0032MA']//td[text()='960']

	@FindBy(xpath = "//input[@id='lookuptxt_charges_schema_P0032MA']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_ChargeSchema_609;
	}

	@FindBy(xpath = "//input[@id='deduct_avail_charges_P0032MA']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_DeductCharge_609;
	}

	@FindBy(xpath = "//label[@id='reasonsMaint_FormId_P0032MA_Update_After_Approve_key']")
	private WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_SystemParameters_Reason_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='P0032P']//span[text()='Approve']")
	private WebElement Parameters_SystemParameters_Reason_Approve_609;

	public WebElement Parameters_SystemParameters_Reason_Approve_609() {
		return Parameters_SystemParameters_Reason_Approve_609;
	}

	@FindBy(xpath = "//input[@id='reasonsList_GridTbl_Id_P0032P_gs_ctsreasonsVO.CODE']")
	private WebElement Parameters_SystemParameters_Reason_Approve_Code_609;

	public WebElement Parameters_SystemParameters_Reason_Approve_Code_609() {
		return Parameters_SystemParameters_Reason_Approve_Code_609;
	}
	// table[@id='reasonsList_GridTbl_Id_P0032P']//td[text()='960']

	@FindBy(xpath = "//label[@id='reasonsMaint_FormId_P0032P_Approve_key']")
	private WebElement Parameters_SystemParameters_Reason_Approve_ApproveBtn_609;

	public WebElement Parameters_SystemParameters_Reason_Approve_ApproveBtn_609() {
		return Parameters_SystemParameters_Reason_Approve_ApproveBtn_609;
	}

	/// *** Parameters -> Cif Parameters -> Cif Type ***///

	@FindBy(xpath = "//td[text()='CIF Parameters']")
	private WebElement Parameters_CifParameters_609;

	public WebElement Parameters_CifParameters_609() {
		return Parameters_CifParameters_609;
	}

	@FindBy(xpath = "//td[text()='CIF Type']")
	private WebElement Parameters_CifParameters_CifType_609;

	public WebElement Parameters_CifParameters_CifType_609() {
		return Parameters_CifParameters_CifType_609;
	}

	@FindBy(xpath = "//a[@id='P010MA']//span[text()='Update After Approve']")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_609;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010MA_gs_rifcttVO.TYPE_CODE']")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_CifTypeCode_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_CifTypeCode_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_CifTypeCode_609;
	}

	@FindBy(xpath = "//span[contains(text(),' Charges Waiver ')]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td[text()='1'])[1]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Grid_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Grid_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Grid_609;
	}

	@FindBy(xpath = "//td[@id='add_tab12_GridTbl_Id_P010MA']/div/span")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Addicon_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Addicon_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Addicon_609;
	}

	@FindBy(xpath = "//td[@id='del_tab12_GridTbl_Id_P010MA']/div/span")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Deleteicon_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Deleteicon_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_Deleteicon_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//select)[1]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ExemptionType_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ExemptionType_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ExemptionType_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[4]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromDate_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromDate_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromDate_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[5]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToDate_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToDate_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToDate_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[6]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverPercentage_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverPercentage_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverPercentage_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[7]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverAmount_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverAmount_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_WaiverAmount_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//select)[2]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_AverageBalanceBasis_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_AverageBalanceBasis_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_AverageBalanceBasis_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[8]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromBalance_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromBalance_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_FromBalance_609;
	}

	@FindBy(xpath = "(//table[@id='tab12_GridTbl_Id_P010MA']//td//input)[9]")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToBalance_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToBalance_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_ChargesWaiver_ToBalance_609;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010MA_Update_After_Approve_key']")
	private WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_UpdateBtn_609;

	public WebElement Parameters_CifParameters_CifType_UpdateAfterApprove_UpdateBtn_609() {
		return Parameters_CifParameters_CifType_UpdateAfterApprove_UpdateBtn_609;
	}

	@FindBy(xpath = "//a[@id='P010P']//span[text()='Approve']")
	private WebElement Parameters_CifParameters_CifType_Approve_609;

	public WebElement Parameters_CifParameters_CifType_Approve_609() {
		return Parameters_CifParameters_CifType_Approve_609;
	}

	@FindBy(xpath = "//input[@id='cifTypeParamList_GridTbl_Id_P010P_gs_rifcttVO.TYPE_CODE']")
	private WebElement Parameters_CifParameters_CifType_Approve_CifTypeCode_609;

	public WebElement Parameters_CifParameters_CifType_Approve_CifTypeCode_609() {
		return Parameters_CifParameters_CifType_Approve_CifTypeCode_609;
	}

	@FindBy(xpath = "//label[@id='cifTypeParamMaint_FormId_P010P_Approve_key']")
	private WebElement Parameters_CifParameters_CifType_Approve_ApproveBtn_609;

	public WebElement Parameters_CifParameters_CifType_Approve_ApproveBtn_609() {
		return Parameters_CifParameters_CifType_Approve_ApproveBtn_609;
	}
}
