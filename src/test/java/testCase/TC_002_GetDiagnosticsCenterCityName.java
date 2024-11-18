package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SurgeriesPage;
import testBase.BaseClass;

public class TC_002_GetDiagnosticsCenterCityName extends BaseClass {

	@Test(priority = 1,groups = {"Master","Sanity","Regression"})
	public void ValidatingSurgeriPage() {
		logger.info("********* Test case 5 started *********");
		HomePage hp = new HomePage(BaseClass.driver);
		hp.homepageNavigation();
		hp.clickONSurgeries();
		SurgeriesPage sp = new SurgeriesPage(driver);
		String actual_title = "Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests";
		String expected_title = hp.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		logger.info("********* Test case 5 Ended *********");
	}

	@Test(priority = 2,groups = {"Master","Sanity","Regression"})
	public void getMainCityNamesofDiagnosticsCenter() {
		logger.info("********* Test case 6 started *********");
		SurgeriesPage sp = new SurgeriesPage(driver);
		sp.ClickOnLabTest();
		sp.waitUnitlVisibilityOfLocations();
		System.out.println("------------- Cities with Diagnostics Center -------------");
		sp.getDiagnosticsCitys();
		sp.clickonAurangabad();
		logger.info("********* Test case 6 Ended *********");
	}

}
