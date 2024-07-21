package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;
import pageUIs.ContactDetailsPageUI;
import pageUIs.PersonalDetailsPageUI;

public class ContactDetailsPageObject extends BaseActions {
	private WebDriver driver;
	
	public ContactDetailsPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public boolean isPersonalDetailsHeaderDisplayed() {
		waitForElementVisible(driver, ContactDetailsPageUI.CONTACT_DETAILS_PAGE_HEADER);
		return isElementDisplayed(driver, ContactDetailsPageUI.CONTACT_DETAILS_PAGE_HEADER);
	}

	public void enterToStreet1Textbox(String street1) {
		waitForElementVisible(driver, ContactDetailsPageUI.STREET1_TEXTBOX);
		sendkeyToElement(driver, ContactDetailsPageUI.STREET1_TEXTBOX, street1);
	}

	public void enterToCityTextbox(String city) {
		waitForElementVisible(driver, ContactDetailsPageUI.CITY_TEXTBOX);
		sendkeyToElement(driver, ContactDetailsPageUI.CITY_TEXTBOX, city);
	}

	public void enterToProvinceTextbox(String province) {
		waitForElementVisible(driver, ContactDetailsPageUI.PROVINCE_TEXTBOX);
		sendkeyToElement(driver, ContactDetailsPageUI.PROVINCE_TEXTBOX, province);
	}

	public void enterToPostalCodeTextbox(String postalCode) {
		waitForElementVisible(driver, ContactDetailsPageUI.POSTAL_CODE_TEXTBOX);
		sendkeyToElement(driver, ContactDetailsPageUI.POSTAL_CODE_TEXTBOX, postalCode);
	}

	public void selectToCountryDropdown(String country) {
		waitForElementVisible(driver, ContactDetailsPageUI.COUNTRY_DROPDOWN_PARENT);
		selectItemInDropdown(driver, ContactDetailsPageUI.COUNTRY_DROPDOWN_PARENT, ContactDetailsPageUI.COUNTRY_DROPDOWN_ITEM, country);
	}

	public void enterToMobileTextbox(String mobile) {
		waitForElementVisible(driver, ContactDetailsPageUI.MOBILE_TEXTBOX);
		sendkeyToElement(driver, ContactDetailsPageUI.MOBILE_TEXTBOX, mobile);
	}

	public void enterToWorkEmailTextbox(String workEmail) {
		waitForElementVisible(driver, ContactDetailsPageUI.WORK_EMAIL_TEXTBOX);
		sendkeyToElement(driver, ContactDetailsPageUI.WORK_EMAIL_TEXTBOX, workEmail);
	}

	public void clickToSaveButtonAtContactDetailsPart() {
		waitForElementClickable(driver, ContactDetailsPageUI.SAVE_BUTTON_AT_CONTACT_DETAILS);
		clickToElement(driver, ContactDetailsPageUI.SAVE_BUTTON_AT_CONTACT_DETAILS);
	}

	public void clickToAddButton() {
		waitForElementClickable(driver, ContactDetailsPageUI.ADD_BUTTON_AT_ATTACHMENTS);
		clickToElement(driver, ContactDetailsPageUI.ADD_BUTTON_AT_ATTACHMENTS);
	}

	public void enterToCommentTextbox(String comment) {
		waitForElementVisible(driver, ContactDetailsPageUI.COMMENT_TEXTAREA);
		sendkeyToElement(driver, ContactDetailsPageUI.COMMENT_TEXTAREA, comment);
	}

	public void clickToSaveButtonAtAttachmentsPart() {
		waitForElementClickable(driver, ContactDetailsPageUI.SAVE_BUTTON_AT_ATTACHMENT);
		clickToElement(driver, ContactDetailsPageUI.SAVE_BUTTON_AT_ATTACHMENT);
	}

	public int getTotalNumberOfRowsInTable() {
		return getListElementSize(driver, ContactDetailsPageUI.TOTAL_NUMBER_OF_ROWS_IN_TABLE);
	}

	public String getStreet1Value() {
		waitForElementVisible(driver, ContactDetailsPageUI.STREET1_TEXTBOX);
		return getElementAttribute(driver, ContactDetailsPageUI.STREET1_TEXTBOX, "value");
	}

	public String getCityValue() {
		waitForElementVisible(driver, ContactDetailsPageUI.CITY_TEXTBOX);
		return getElementAttribute(driver, ContactDetailsPageUI.CITY_TEXTBOX, "value");	
	}

	public String getProvinceValue() {
		waitForElementVisible(driver, ContactDetailsPageUI.PROVINCE_TEXTBOX);
		return getElementAttribute(driver, ContactDetailsPageUI.PROVINCE_TEXTBOX, "value");
	}

	public String getPostalCodeValue() {
		waitForElementVisible(driver, ContactDetailsPageUI.POSTAL_CODE_TEXTBOX);
		return getElementAttribute(driver, ContactDetailsPageUI.POSTAL_CODE_TEXTBOX, "value");
	}

	public String getCountryValue() {
		waitForElementVisible(driver, ContactDetailsPageUI.COUNTRY_DROPDOWN_SELECTED_TEXT);
		return getElementText(driver, ContactDetailsPageUI.COUNTRY_DROPDOWN_SELECTED_TEXT);
	}

	public String getMobileValue() {
		waitForElementVisible(driver, ContactDetailsPageUI.MOBILE_TEXTBOX);
		return getElementAttribute(driver, ContactDetailsPageUI.MOBILE_TEXTBOX, "value");
	}

	public String getWorkEmailValue() {
		waitForElementVisible(driver, ContactDetailsPageUI.WORK_EMAIL_TEXTBOX);
		return getElementAttribute(driver, ContactDetailsPageUI.WORK_EMAIL_TEXTBOX, "value");
	}
}
