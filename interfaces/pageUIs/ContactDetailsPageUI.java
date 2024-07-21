package pageUIs;

public class ContactDetailsPageUI {
	public static final String CONTACT_DETAILS_PAGE_HEADER = "xpath=//h6[text()='Contact Details']";
	public static final String STREET1_TEXTBOX = "xpath=//label[text()='Street 1']/parent::div/following-sibling::div/input";
	public static final String CITY_TEXTBOX = "xpath=//label[text()='City']/parent::div/following-sibling::div/input";
	public static final String PROVINCE_TEXTBOX = "xpath=//label[text()='State/Province']/parent::div/following-sibling::div/input";
	public static final String POSTAL_CODE_TEXTBOX = "xpath=//label[text()='Zip/Postal Code']/parent::div/following-sibling::div/input";
	public static final String COUNTRY_DROPDOWN_PARENT = "xpath=//label[text()='Country']/parent::div/following-sibling::div//i[contains(@class,'bi-caret-down-fill')]";
	public static final String COUNTRY_DROPDOWN_ITEM = "xpath=//label[text()='Country']/parent::div/following-sibling::div//div[@class='oxd-select-option']/span";
	public static final String COUNTRY_DROPDOWN_SELECTED_TEXT = "xpath=//label[text()='Country']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']";
	public static final String MOBILE_TEXTBOX = "xpath=//label[text()='Mobile']/parent::div/following-sibling::div/input";
	public static final String WORK_EMAIL_TEXTBOX = "xpath=//label[text()='Work Email']/parent::div/following-sibling::div/input";
	public static final String SAVE_BUTTON_AT_CONTACT_DETAILS = "xpath=//div[contains(@class,'orangehrm-horizontal-padding')]//button[contains(string(),'Save')]";
	
	public static final String ADD_BUTTON_AT_ATTACHMENTS = "xpath=//div[@class='orangehrm-attachment']//button[contains(string(),'Add')]";
	public static final String COMMENT_TEXTAREA = "xpath=//label[text()='Comment']/parent::div/following-sibling::div/textarea";
	public static final String SAVE_BUTTON_AT_ATTACHMENT = "xpath=//div[contains(@class,'orangehrm-attachment')]//button[contains(string(),'Save')]";
	public static final String TOTAL_NUMBER_OF_ROWS_IN_TABLE = "xpath=//div[@class='oxd-table']/div[@class='oxd-table-body']/div";
}
