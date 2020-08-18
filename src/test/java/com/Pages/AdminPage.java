package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	WebDriver driver;
	
	public AdminPage(WebDriver wdriver) {
		driver = wdriver;
		PageFactory.initElements(driver, this);
		}
	
@FindBy(id="menu_admin_viewAdminModule")
WebElement admin;	
	
@FindBy(id="menu_admin_UserManagement")
WebElement usermanagement;

@FindBy(id="menu_admin_viewSystemUsers")
WebElement systemusers;

@FindBy(id="searchSystemUser_userName")
WebElement username;



@FindBy(id="searchBtn")
WebElement search;

public void admin(String uname) {
	admin.click();
	usermanagement.click();
	systemusers.click();
	username.sendKeys(uname);
	
	search.click();
}


}
