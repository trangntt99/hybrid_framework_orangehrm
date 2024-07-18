package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;

public class QualificationsPageObject extends BaseActions {
	private WebDriver driver;
	
	public QualificationsPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}