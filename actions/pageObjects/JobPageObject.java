package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class JobPageObject extends BasePage {
	private WebDriver driver;
	
	public JobPageObject(WebDriver driver) {
		this.driver = driver;
	}
}