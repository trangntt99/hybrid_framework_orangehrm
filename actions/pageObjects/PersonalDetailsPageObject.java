package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;
import commons.PageGeneratorManager;
import pageUIs.AddEmployeePageUI;
import pageUIs.PersonalDetailsPageUI;

public class PersonalDetailsPageObject extends BaseActions {
	private WebDriver driver;
	
	public PersonalDetailsPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public String getFirstNameValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.FIRSTNAME_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.FIRSTNAME_TEXTBOX, "value");
	}

	public String getLastNameValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.LASTNAME_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.LASTNAME_TEXTBOX, "value");
	}

	public String getEmployeeIDValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.EMPLOYEEID_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.EMPLOYEEID_TEXTBOX, "value");
	}

	public EmployeeListPageObject clickToEmployeeListButton() {
		waitForElementClickable(driver, PersonalDetailsPageUI.EMPLOYEE_LIST_BUTTON);
		clickToElement(driver, PersonalDetailsPageUI.EMPLOYEE_LIST_BUTTON);
		return PageGeneratorManager.getEmployeeListPage(driver);
	}

	public boolean isPersonalDetailsHeaderDisplayed() {
		waitForElementVisible(driver, PersonalDetailsPageUI.PERSONAL_DETAILS_PAGE_HEADER);
		return isElementDisplayed(driver, PersonalDetailsPageUI.PERSONAL_DETAILS_PAGE_HEADER);
	}

	public void enterToNicknameTextbox(String nickName) {
		waitForElementVisible(driver, PersonalDetailsPageUI.NICKNAME_TEXTBOX);
		sendkeyToElement(driver, PersonalDetailsPageUI.NICKNAME_TEXTBOX, nickName);
	}

	public void enterToDriverLicenseNumberTextbox(String driverLicenseNumber) {
		waitForElementVisible(driver, PersonalDetailsPageUI.DRIVER_LICENSE_NUMBER_TEXTBOX);
		sendkeyToElement(driver, PersonalDetailsPageUI.DRIVER_LICENSE_NUMBER_TEXTBOX, driverLicenseNumber);
	}

	public void enterToLicenseExpiryDatePicker(String driverLicenseExpiryDate) {
		waitForElementVisible(driver, PersonalDetailsPageUI.DRIVER_EXPIRY_DATE_PICKER);
		sendkeyToElement(driver, PersonalDetailsPageUI.DRIVER_EXPIRY_DATE_PICKER, driverLicenseExpiryDate);
	}

	public void enterToSocialSecurityNumberTextbox(String ssnNumber) {
		waitForElementVisible(driver, PersonalDetailsPageUI.SOCIAL_SECURITY_NUMBER_TEXTBOX);
		sendkeyToElement(driver, PersonalDetailsPageUI.SOCIAL_SECURITY_NUMBER_TEXTBOX, ssnNumber);
	}

	public void enterToSocialInsuranceNumberTextbox(String sinNumber) {
		waitForElementVisible(driver, PersonalDetailsPageUI.SOCIAL_INSURANCE_NUMBER_TEXTBOX);
		sendkeyToElement(driver, PersonalDetailsPageUI.SOCIAL_INSURANCE_NUMBER_TEXTBOX, sinNumber);
	}

	public void selectToNationalityDropdown(String nationalityName) {
		waitForElementVisible(driver, PersonalDetailsPageUI.NATIONALITY_DROPDOWN_PARENT);
		selectItemInDropdown(driver, PersonalDetailsPageUI.NATIONALITY_DROPDOWN_PARENT, PersonalDetailsPageUI.NATIONALITY_DROPDOWN_ITEM, nationalityName);
	}

	public void selectToMaritalStatusDropdown(String maritalStatus) {
		waitForElementVisible(driver, PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_PARENT);
		selectItemInDropdown(driver, PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_PARENT, PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_ITEM, maritalStatus);
	}

	public void enterToDateOfBirthDatePicker(String dateOfBirth) {
		waitForElementVisible(driver, PersonalDetailsPageUI.DATE_OF_BIRTH_PICKER);
		sendkeyToElement(driver, PersonalDetailsPageUI.DATE_OF_BIRTH_PICKER, dateOfBirth);
	}

	public void clickToSaveButtonAtPersonalDetailsPart() {
		waitForElementClickable(driver, PersonalDetailsPageUI.SAVE_BUTTON_AT_PERSONAL_DETAILS);
		clickToElement(driver, PersonalDetailsPageUI.SAVE_BUTTON_AT_PERSONAL_DETAILS);
	}

	public String getNicknameValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.NICKNAME_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.NICKNAME_TEXTBOX, "value");
	}

	public String getDriverLicenseNumberValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.DRIVER_LICENSE_NUMBER_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.DRIVER_LICENSE_NUMBER_TEXTBOX, "value");
	}

	public String getLicenseExpiryDateValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.DRIVER_EXPIRY_DATE_PICKER);
		return getElementAttribute(driver, PersonalDetailsPageUI.DRIVER_EXPIRY_DATE_PICKER, "value");
	}

	public String getSocialSecurityNumberValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.SOCIAL_SECURITY_NUMBER_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.SOCIAL_SECURITY_NUMBER_TEXTBOX, "value");
	}

	public String getSocialInsuranceNumberValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.SOCIAL_INSURANCE_NUMBER_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.SOCIAL_INSURANCE_NUMBER_TEXTBOX, "value");
	}

	public String getNationalityDropdowmSelectedText() {
		waitForElementVisible(driver, PersonalDetailsPageUI.NATIONALITY_DROPDOWN_SELECTED_TEXT);
		return getElementText(driver, PersonalDetailsPageUI.NATIONALITY_DROPDOWN_SELECTED_TEXT);
	}

	public String getMaritalStatusDropdowmSelectedText() {
		waitForElementVisible(driver, PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_SELECTED_TEXT);
		return getElementText(driver, PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_SELECTED_TEXT);
	}

	public String getDateOfBirthValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.DATE_OF_BIRTH_PICKER);
		return getElementAttribute(driver, PersonalDetailsPageUI.DATE_OF_BIRTH_PICKER, "value");
	}
	
	public void selectToBloodTypeDropdown(String bloodType) {
		waitForElementVisible(driver, PersonalDetailsPageUI.BLOOD_TYPE_DROPDOWN_PARENT);
		selectItemInDropdown(driver, PersonalDetailsPageUI.BLOOD_TYPE_DROPDOWN_PARENT, PersonalDetailsPageUI.BLOOD_TYPE_DROPDOWN_ITEM, bloodType);
	}

	public void clickToSaveButtonAtCustomFieldsPart() {
		waitForElementClickable(driver, PersonalDetailsPageUI.SAVE_BUTTON_AT_CUSTOM_FIELDS);
		clickToElement(driver, PersonalDetailsPageUI.SAVE_BUTTON_AT_CUSTOM_FIELDS);
	}

	public void clickToAddButton() {
		waitForElementClickable(driver, PersonalDetailsPageUI.ADD_BUTTON_AT_ATTACHMENTS);
		clickToElement(driver, PersonalDetailsPageUI.ADD_BUTTON_AT_ATTACHMENTS);
	}

	public void enterToCommentTextbox(String comment) {
		waitForElementVisible(driver, PersonalDetailsPageUI.COMMENT_TEXTAREA);
		sendkeyToElement(driver, PersonalDetailsPageUI.COMMENT_TEXTAREA, comment);
	}

	public void clickToSaveButtonAtAttachmentsPart() {
		waitForElementClickable(driver, PersonalDetailsPageUI.SAVE_BUTTON_AT_ATTACHMENT);
		clickToElement(driver, PersonalDetailsPageUI.SAVE_BUTTON_AT_ATTACHMENT);
	}

	public int getTotalNumberOfRowsInTable() {
		return getListElementSize(driver, PersonalDetailsPageUI.TOTAL_NUMBER_OF_ROWS_IN_TABLE);
	}
}
