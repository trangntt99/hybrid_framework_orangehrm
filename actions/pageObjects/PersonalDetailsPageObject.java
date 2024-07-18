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
}
