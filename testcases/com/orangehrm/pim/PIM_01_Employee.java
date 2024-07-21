package com.orangehrm.pim;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
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
	private LoginPageObject loginPage;
	private DashboardPageObject dashboardPage;
	private EmployeeListPageObject employeeListPage;
	private AddEmployeePageObject addEmployeePage;
	private PersonalDetailsPageObject personalDetailsPage;

	@Parameters({ "url", "browser" })
	@BeforeClass
	public void beforeClass(String url, String browserName) {
		driver = getBrowserDriver(browserName, url);
		this.browserName = browserName;
		firstName = "Michael";
		lastName = "Owen";
		nickName = "golden_boy";
		driverLicenseNumber = "D08954796";
		licenseExpiryDate = "2024-01-03";
		ssnNumber = "344-60-6920";
		sinNumber = "968563231";
		nationality = "American";
		maritalSatus = "Single";
		dateOfBirth = "1986-01-11";
		genderStatus = "Male";
		smokerStatus = "Yes";
		bloodType = "A";
		imgName = "bg1.jpg";
		comment = "Upload file";

		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.enterToUsernameTextbox(GlobalConstants.ADMIN_USERNAME);
		loginPage.enterToPasswordTextbox(GlobalConstants.ADMIN_PASSWORD);
		dashboardPage = loginPage.clickToLoginButton();

		employeeListPage = dashboardPage.openPIMModule();
	}

	@Test
	public void Employee_01_Add_New(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_01_Add_New");
		addEmployeePage = employeeListPage.clickToAddEmployeeButton();
		addEmployeePage.enterToFirstNameTextbox(firstName);
		addEmployeePage.enterToLastNameTextbox(lastName);
		employeeID = addEmployeePage.getEmployeeID();
		addEmployeePage.clickToSaveButton();

		Assert.assertTrue(addEmployeePage.isSuccessMessageDisplayed("Successfully Saved"));
		addEmployeePage.waitForSpinnerIconInvisible();

		personalDetailsPage = PageGeneratorManager.getPersonalDetailsPage(driver);
		Assert.assertTrue(personalDetailsPage.isPersonalDetailsHeaderDisplayed());
		personalDetailsPage.waitForSpinnerIconInvisible();

		Assert.assertEquals(personalDetailsPage.getFirstNameValue(), firstName);
		Assert.assertEquals(personalDetailsPage.getLastNameValue(), lastName);
		Assert.assertEquals(personalDetailsPage.getEmployeeIDValue(), employeeID);

		employeeListPage = personalDetailsPage.clickToEmployeeListButton();

		employeeListPage.enterToEmployeeIDTextbox(employeeID);
		employeeListPage.clickToSearchButton();
		Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("Id", "1", employeeID));
		Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("First (& Middle) Name", "1", firstName));
		Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("Last Name", "1", lastName));
	}

	@Test
	public void Employee_02_Personal_Details(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(),
				"Employee_02_Personal_Details");

		personalDetailsPage = employeeListPage.clickToEditIconByEmployeeID(employeeID);
		Assert.assertTrue(personalDetailsPage.isPersonalDetailsHeaderDisplayed());

		Assert.assertEquals(personalDetailsPage.getFirstNameValue(), firstName);
		Assert.assertEquals(personalDetailsPage.getLastNameValue(), lastName);
		Assert.assertEquals(personalDetailsPage.getEmployeeIDValue(), employeeID);

		personalDetailsPage.enterToNicknameTextbox(nickName);
		personalDetailsPage.enterToDriverLicenseNumberTextbox(driverLicenseNumber);
		personalDetailsPage.enterToLicenseExpiryDatePicker(licenseExpiryDate);
		personalDetailsPage.enterToSocialSecurityNumberTextbox(ssnNumber);
		personalDetailsPage.enterToSocialInsuranceNumberTextbox(sinNumber);
		personalDetailsPage.selectToNationalityDropdown(nationality);
		personalDetailsPage.selectToMaritalStatusDropdown(maritalSatus);
		personalDetailsPage.enterToDateOfBirthDatePicker(dateOfBirth);
		personalDetailsPage.clickToRadioButtonByLabelName(genderStatus);
		personalDetailsPage.clickToCheckboxByLabelName(smokerStatus);
		personalDetailsPage.clickToSaveButtonAtPersonalDetailsPart();
		
		Assert.assertTrue(personalDetailsPage.isSuccessMessageDisplayed("Successfully Updated"));
		personalDetailsPage.waitForSpinnerIconInvisible();
		
		Assert.assertEquals(personalDetailsPage.getNicknameValue(), nickName);
		Assert.assertEquals(personalDetailsPage.getDriverLicenseNumberValue(), driverLicenseNumber);
		Assert.assertEquals(personalDetailsPage.getLicenseExpiryDateValue(), licenseExpiryDate);
		Assert.assertEquals(personalDetailsPage.getSocialSecurityNumberValue(), ssnNumber);
		Assert.assertEquals(personalDetailsPage.getSocialInsuranceNumberValue(), sinNumber);
		Assert.assertEquals(personalDetailsPage.getNationalityDropdowmSelectedText(), nationality);
		Assert.assertEquals(personalDetailsPage.getMaritalStatusDropdowmSelectedText(), maritalSatus);
		Assert.assertEquals(personalDetailsPage.getDateOfBirthValue(), dateOfBirth);
		Assert.assertTrue(personalDetailsPage.isRadioButtonSelectedByLabelName(genderStatus));
		Assert.assertTrue(personalDetailsPage.isCheckboxSelectedByLabelName(smokerStatus));
		
		personalDetailsPage.selectToBloodTypeDropdown(bloodType);
		personalDetailsPage.clickToSaveButtonAtCustomFieldsPart();
		Assert.assertTrue(personalDetailsPage.isSuccessMessageDisplayed("Successfully Saved"));
		personalDetailsPage.waitForSpinnerIconInvisible();
		
		personalDetailsPage.clickToAddButton();
		personalDetailsPage.uploadFile(imgName);
		personalDetailsPage.enterToCommentTextbox(comment);
		personalDetailsPage.clickToSaveButtonAtAttachmentsPart();
		Assert.assertTrue(personalDetailsPage.isSuccessMessageDisplayed("Successfully Saved"));
		personalDetailsPage.waitForSpinnerIconInvisible();

		int totalOfRecords = personalDetailsPage.getTotalNumberOfRowsInTable();
		Assert.assertTrue(personalDetailsPage.isValueDisplayedAtColumnName("File Name", String.valueOf(totalOfRecords), imgName));
		Assert.assertTrue(personalDetailsPage.isValueDisplayedAtColumnName("Description", String.valueOf(totalOfRecords), comment));
		Assert.assertTrue(personalDetailsPage.isValueDisplayedAtColumnName("Added By", String.valueOf(totalOfRecords), GlobalConstants.ADMIN_USERNAME));
	}

	@Test
	public void Employee_03_Contact_Details(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(),
				"Employee_03_Contact_Details");
	}

	@Test
	public void Employee_04_Emergency_Contacts(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(),
				"Employee_04_Emergency_Contacts");
	}

	@Test
	public void Employee_05_Dependents(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(),
				"Employee_05_Dependents");
	}

	@Test
	public void Employee_06_Immigration(Method method) {
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(),
				"Employee_06_Immigration");
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
		ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(),
				"Employee_10_Qualifications");
	}

	@AfterClass
	public void afterClass() {
		closeBrowserDriver();
	}

	private String browserName, employeeID, firstName, lastName, nickName;
	private String driverLicenseNumber, licenseExpiryDate, ssnNumber, sinNumber, nationality, maritalSatus;
	private String dateOfBirth, genderStatus, smokerStatus, bloodType, imgName, comment;
}
