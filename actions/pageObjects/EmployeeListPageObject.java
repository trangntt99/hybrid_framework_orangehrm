package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;
import commons.PageGeneratorManager;
import pageUIs.AddEmployeePageUI;
import pageUIs.EmployeeListPageUI;

public class EmployeeListPageObject extends BaseActions {
	private WebDriver driver;
	
	public EmployeeListPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public AddEmployeePageObject clickToAddEmployeeButton() {
		waitForElementClickable(driver, EmployeeListPageUI.ADD_EMPLOYEE_BUTTON);
		clickToElement(driver, EmployeeListPageUI.ADD_EMPLOYEE_BUTTON);
		waitForSpinnerIconInvisible();
		return PageGeneratorManager.getEmployeePage(driver);
	}

	public void enterToEmployeeIDTextbox(String employeeID) {
		waitForElementVisible(driver, EmployeeListPageUI.EMPLOYEE_ID_TEXTBOX);
		sendkeyToElement(driver, EmployeeListPageUI.EMPLOYEE_ID_TEXTBOX, employeeID);
	}

	public void clickToSearchButton() {
		waitForElementClickable(driver, EmployeeListPageUI.SEARCH_BUTTON);
		clickToElement(driver, EmployeeListPageUI.SEARCH_BUTTON);
		waitForSpinnerIconInvisible();
	}
}