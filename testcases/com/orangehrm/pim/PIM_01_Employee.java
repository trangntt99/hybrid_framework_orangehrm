package com.orangehrm.pim;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.AddEmployeePageObject;
import pageObjects.ContactDetailsPageObject;
import pageObjects.DashboardPageObject;
import pageObjects.EmployeeListPageObject;
import pageObjects.LoginPageObject;
import pageObjects.PersonalDetailsPageObject;
import reportConfig.ExtentTestManager;

import org.testng.annotations.Parameters;

public class PIM_01_Employee extends BaseTest {
	private WebDriver driver;
	private String browserName, employeeID, firstName, lastName;
	private LoginPageObject loginPage;
	private DashboardPageObject dashboardPage;
	private EmployeeListPageObject employeeListPage;
	private AddEmployeePageObject addEmployeePage;
	private PersonalDetailsPageObject personalDetailsPage;
	private ContactDetailsPageObject contactDetailsPage;

	@Parameters({"url", "browser"})
	@BeforeClass
	public void beforeClass(String url, String browserName) {
		driver = getBrowserDriver(browserName, url);
		this.browserName = browserName;
		
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.enterToUsernameTextbox("automationfc");
		loginPage.enterToPasswordTextbox("<s362guQO9J1");
		dashboardPage = loginPage.clickToLoginButton();

		employeeListPage = dashboardPage.openPIMModule();
	}
	
	@Test
	public void Employee_01_Add_New(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_01_Add_New");
		addEmployeePage = employeeListPage.clickToAddEmployeeButton();
		addEmployeePage.enterToFirstNameTextbox("");
		addEmployeePage.enterToLastNameTextbox("");
		employeeID = addEmployeePage.getEmployeeID();
		addEmployeePage.clickToSaveButton();
		addEmployeePage.isSuccessMessageDisplayed("Successfully Saved");
		// //p[contains(@class, 'oxd-text--toast-message') and text()='Successfully Saved']
		
		personalDetailsPage =  PageGeneratorManager.getPersonalDetailsPage(driver);
	}
	
	@Test
	public void Employee_02_Personal_Details(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_02_Personal_Details");
		Assert.assertEquals(personalDetailsPage.getFirstNameValue(), "");
		Assert.assertEquals(personalDetailsPage.getLastNameValue(), "");
		Assert.assertEquals(personalDetailsPage.getEmployeeIDValue(), employeeID);
		
		employeeListPage = personalDetailsPage.clickToEmployeeListButton();
		
		employeeListPage.enterToEmployeeIDTextbox(employeeID);
		employeeListPage.clickToSearchButton();
		Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("Id", employeeID));
		Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("First (& Middle) Name", ""));
		Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("Last Name", ""));
	}
	
	@Test
	public void Employee_03_Contact_Details(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_03_Contact_Details");
	}
	
	@Test
	public void Employee_04_Emergency_Contacts(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_04_Emergency_Contacts");
	}
	
	@Test
	public void Employee_05_Dependents(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_05_Dependents");
	}
	
	@Test
	public void Employee_06_Immigration(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_06_Immigration");
	}
	
	@Test
	public void Employee_07_Job(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_07_Job");
	}
	
	@Test
	public void Employee_08_Salary(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_08_Salary");
	}
	
	@Test
	public void Employee_09_Report(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_09_Report");
	}
	
	@Test
	public void Employee_10_Qualifications(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_10_Qualifications");
	}

	@AfterClass
	public void afterClass() {
		closeBrowserDriver();
	}
}
