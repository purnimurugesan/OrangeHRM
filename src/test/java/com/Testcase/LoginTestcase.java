package com.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.baseclass.Library;
import com.seleniumreusable.SeleniumUtility;

public class LoginTestcase extends Library {
	LoginPage page;
	SeleniumUtility selutil;

	@BeforeMethod
	public void init_browser() {
	logger.info("Launching browser for TC_01_loginpage");
	browserSetUp();
	}

	@Test(priority=1)
	public void orangeHrmLo() {
	logger.info("Entering userid and password");
	page = new LoginPage(driver);
	page.login("Admin","admin123");

	
	


	}

	@AfterMethod
	public void closebrowser() {
	
	logger.info("Closing browser for TC_01_loginPage");
	selutil = new SeleniumUtility(driver);
	selutil.getScreenshot();
	selutil.getpageTitle();
	tearDown();
	}



}
