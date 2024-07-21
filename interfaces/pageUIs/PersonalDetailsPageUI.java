package pageUIs;

public class PersonalDetailsPageUI {
	public static final String FIRSTNAME_TEXTBOX = "name=firstName";
	public static final String LASTNAME_TEXTBOX = "name=lastName";
	public static final String EMPLOYEEID_TEXTBOX = "xpath=//label[text()='Employee Id']/parent::div/following-sibling::div/input";
	public static final String EMPLOYEE_LIST_BUTTON = "xpath=//a[text()='Employee List']";
	public static final String PERSONAL_DETAILS_PAGE_HEADER = "xpath=//h6[text()='Personal Details']";
	public static final String NICKNAME_TEXTBOX = "xpath=//label[text()='Nickname']/parent::div/following-sibling::div/input";
	public static final String DRIVER_LICENSE_NUMBER_TEXTBOX = "xpath=//label[text()=\"Driver's License Number\"]/parent::div/following-sibling::div/input";
	public static final String DRIVER_EXPIRY_DATE_PICKER = "xpath=//label[text()='License Expiry Date']/parent::div/following-sibling::div//input";
	public static final String SOCIAL_SECURITY_NUMBER_TEXTBOX = "xpath=//label[text()='SSN Number']/parent::div/following-sibling::div/input";
	public static final String SOCIAL_INSURANCE_NUMBER_TEXTBOX = "xpath=//label[text()='SIN Number']/parent::div/following-sibling::div/input";
	public static final String NATIONALITY_DROPDOWN_PARENT = "xpath=//label[text()='Nationality']/parent::div/following-sibling::div//i[contains(@class,' bi-caret-down-fill')]";
	public static final String NATIONALITY_DROPDOWN_ITEM = "xpath=//label[text()='Nationality']/parent::div/following-sibling::div//div[@class='oxd-select-option']/span";
	public static final String NATIONALITY_DROPDOWN_SELECTED_TEXT = "xpath=//label[text()='Nationality']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']";
	public static final String MARITAL_STATUS_DROPDOWN_PARENT = "xpath=//label[text()='Marital Status']/parent::div/following-sibling::div//i[contains(@class,' bi-caret-down-fill')]";
	public static final String MARITAL_STATUS_DROPDOWN_ITEM = "xpath=//label[text()='Marital Status']/parent::div/following-sibling::div//div[@class='oxd-select-option']/span";
	public static final String MARITAL_STATUS_DROPDOWN_SELECTED_TEXT = "xpath=//label[text()='Marital Status']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']";
	public static final String DATE_OF_BIRTH_PICKER = "xpath=//label[text()='Date of Birth']/parent::div/following-sibling::div//input";
	public static final String SAVE_BUTTON_AT_PERSONAL_DETAILS = "xpath=//div[contains(@class,'orangehrm-horizontal-padding')]//button[contains(string(),'Save')]";
	
	public static final String BLOOD_TYPE_DROPDOWN_PARENT = "xpath=//label[text()='Blood Type']/parent::div/following-sibling::div//i[contains(@class,' bi-caret-down-fill')]";
	public static final String BLOOD_TYPE_DROPDOWN_ITEM = "xpath=//label[text()='Blood Type']/parent::div/following-sibling::div//div[@class='oxd-select-option']/span";
	public static final String BLOOD_TYPE_DROPDOWN_SELECTED_TEXT = "xpath=//label[text()='Blood Type']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']";
	public static final String SAVE_BUTTON_AT_CUSTOM_FIELDS = "xpath=//div[contains(@class,'orangehrm-custom-fields')]//button[contains(string(),'Save')]";
	
	public static final String ADD_BUTTON_AT_ATTACHMENTS = "xpath=//div[@class='orangehrm-attachment']//button[contains(string(),'Add')]";
	public static final String COMMENT_TEXTAREA = "xpath=//label[text()='Comment']/parent::div/following-sibling::div/textarea";
	public static final String SAVE_BUTTON_AT_ATTACHMENT = "xpath=//div[contains(@class,'orangehrm-attachment')]//button[contains(string(),'Save')]";
	public static final String TOTAL_NUMBER_OF_ROWS_IN_TABLE = "xpath=//div[@class='oxd-table']/div[@class='oxd-table-body']/div";

	public static final String CONTACT_DETAILS_BUTTON = "xpath=//a[text()='Contact Details']";
}
