package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class LoginPageObject extends BasePage {
	private WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterToUsernameTextbox(String string) {
		waitForElementVisible(driver, string);
	}

	public void enterToPasswordTextbox(String string) {
		// TODO Auto-generated method stub
		
	}

	public DashboardPageObject clickToLoginButton() {
		// TODO Auto-generated method stub
		return null;
	}
}