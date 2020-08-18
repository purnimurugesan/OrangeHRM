package com.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.AdminPage;
import com.Pages.LoginPage;
import com.baseclass.Library;
import com.seleniumreusable.SeleniumUtility;

public class AdminTestCase extends Library {
AdminPage page1;
SeleniumUtility selutil;
LoginPage page;

@BeforeMethod
public void orangeHrmLo() {
	logger.info("Launching browser for TC_01_loginpage");
	browserSetUp();
	logger.info("Entering userid and password");
	page = new LoginPage(driver);
	page.login("Admin","admin123");

}
@Test(priority=1)
public void admintab() {
logger.info("Entering adminpage");
page1 = new AdminPage(driver);
page1.admin("thomas.fleming");

}
@AfterMethod
public void closebrowser() {

logger.info("Closing browser for TC_02_AdminPage");
selutil = new SeleniumUtility(driver);
selutil.getScreenshot();
selutil.getpageTitle();
tearDown();
}
}
