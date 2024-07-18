package pageUIs;

public class BaseActionsPageUI {
	public static final String SPINNER_ICON = "css=div.oxd-loading-spinner-container";
	public static final String ORANGEHRM_LOGO = "css=a.oxd-brand div.oxd-brand-banner>img";
	public static final String UPLOAD_FILE_TYPE = "css=input[type='file']";
	public static final String DYNAMIC_SUCCESS_MESSAGE = "xpath=//p[contains(@class, 'oxd-text--toast-message') and text()='%s']";
	public static final String DYNAMIC_INDEX_BY_COLUMN_NAME = "xpath=//div[text()='%s']/preceding-sibling::div";
	public static final String DYNAMIC_INDEX_BY_COLUMN_INDEX_ROW_INDEX = "xpath=//div[@class='oxd-table-card']/div[@role='row'][%s]/div[%s]/div[contains(text(),'%s')]";
}
