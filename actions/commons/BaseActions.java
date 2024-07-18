package commons;

import org.openqa.selenium.WebDriver;

import pageUIs.AddEmployeePageUI;
import pageUIs.BaseActionsPageUI;
import pageUIs.EmployeeListPageUI;

public class BaseActions extends BasePage {
	private WebDriver driver;

	public BaseActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitForSpinnerIconInvisible() {
		waitForListElementInvisible(driver, BaseActionsPageUI.SPINNER_ICON);
	}
	
	public boolean isSuccessMessageDisplayed(String messageContent) {
		waitForElementVisible(driver, BaseActionsPageUI.DYNAMIC_SUCCESS_MESSAGE, messageContent);
		return isElementDisplayed(driver, BaseActionsPageUI.DYNAMIC_SUCCESS_MESSAGE, messageContent);
	}

	public boolean isValueDisplayedAtColumnName(String columnName, String rowIndex, String rowValue) {
		int columnIndex = getListElementSize(driver, BaseActionsPageUI.DYNAMIC_INDEX_BY_COLUMN_NAME, columnName) + 1;
		return isElementDisplayed(driver, BaseActionsPageUI.DYNAMIC_INDEX_BY_COLUMN_INDEX_ROW_INDEX, rowIndex, String.valueOf(columnIndex), rowValue);
	}
}
