package testCase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.HospetialPage;
import testBase.BaseClass;

public class TC_001_NearBy_Hospetial extends BaseClass {
	public List<WebElement> list = new ArrayList<>();
	public List<WebElement> ResultHospetial = new ArrayList<>();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	@Test(priority=1,groups = {"Master","Sanity"})
	public void validationgPagePractoPage() {
		logger.info("********Starting Test Case 1 ***********");
		HomePage hm = new HomePage(driver);
		String actual_title = "Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests";
		String expected_title = hm.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		logger.info("****Test case 1 Ended ********");
	}
	
	@Test(priority = 2,groups = {"Master","Sanity"})
	public void SearchAllHospetial() {
		logger.info("********* Test Case 2 Started *********");
		HomePage hm = new HomePage(driver);
		hm.searchAllHospetials();
		logger.info("****Test case 2 Ended ********");
	}
	
	@Test(priority = 3,groups = {"Master","Sanity"})
	public void SelectLocation() {
		logger.info("********* Test Case 3 Started *********");
		HospetialPage hp = new HospetialPage(driver);
		hp.clickLocationInput();
		hp.clearLocation();
		hp.SetLocation();
		hp.BangloreLocationSelection();
		logger.info("****Test case 3 Ended ********");
	}
	
	@Test(priority = 4,groups = {"Master","Sanity"})
	public void getHospetialListWithGivenFecilities() {
		logger.info("*************Test case 4 starting************");
		HospetialPage hp = new HospetialPage(driver);
		 hp.filterHospetial();
		logger.info("********* Hospetial List obtained *********");
		logger.info("**********Test Case 4 Ended*************");
	}
	
	
	
	
}
