package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.user.HomePageObject;


public class PageGeneratorManager {
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
}
