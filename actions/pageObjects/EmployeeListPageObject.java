package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class EmployeeListPageObject extends BasePage {
	private WebDriver driver;
	
	public EmployeeListPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public AddEmployeePageObject clickToAddEmployeeButton() {
		// TODO Auto-generated method stub
		return null;
	}

	public void enterToEmployeeIDTextbox(String employeeID) {
		// TODO Auto-generated method stub
		
	}

	public void clickToSearchButton() {
		// TODO Auto-generated method stub
		
	}

	public boolean isValueDisplayedAtColumnName(String string, String employeeID) {
		// TODO Auto-generated method stub
		return false;
	}
}