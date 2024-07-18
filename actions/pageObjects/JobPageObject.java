package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;
import commons.BasePage;

public class JobPageObject extends BaseActions {
	private WebDriver driver;
	
	public JobPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}