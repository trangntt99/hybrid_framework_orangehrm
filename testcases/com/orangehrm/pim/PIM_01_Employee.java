package com.orangehrm.pim;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BaseTest;
import reportConfig.ExtentTestManager;

import org.testng.annotations.Parameters;

public class PIM_01_Employee extends BaseTest {
	private WebDriver driver;
	private String browserName;
	
	@Parameters({"url", "browser"})
	@BeforeClass
	public void beforeClass(String url, String browserName) {
		driver = getBrowserDriver(browserName, url);
		this.browserName = browserName;
	}
	
	@Test
	public void Employee_01_Add_New(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_01_Add_New");
	}
	
	@Test
	public void Employee_02_Personal_Details(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_02_Personal_Details");
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
