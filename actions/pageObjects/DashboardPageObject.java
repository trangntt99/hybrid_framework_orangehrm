package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;
import commons.PageGeneratorManager;
import pageUIs.DashboardPageUI;

public class DashboardPageObject extends BaseActions {
	private WebDriver driver;
	
	public DashboardPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public EmployeeListPageObject openPIMModule() {
		waitForElementClickable(driver, DashboardPageUI.PIM_MODULE);
		clickToElement(driver, DashboardPageUI.PIM_MODULE);
		waitForSpinnerIconInvisible();
		return PageGeneratorManager.getEmployeeListPage(driver);
	}
}