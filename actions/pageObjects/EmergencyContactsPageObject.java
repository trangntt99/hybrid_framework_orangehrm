package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;

public class EmergencyContactsPageObject extends BaseActions {
	private WebDriver driver;
	
	public EmergencyContactsPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}