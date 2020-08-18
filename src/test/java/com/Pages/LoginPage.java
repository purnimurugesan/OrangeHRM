package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver wdriver) {
	driver = wdriver;
	PageFactory.initElements(driver, this);
	}

	@FindBy (id ="txtUsername")
	WebElement username;


	@FindBy (id ="txtPassword")
	WebElement password;

	
	@FindBy (id ="btnLogin")
	WebElement submit;

	
	

	public void login(String user,String pass) {
	
	username.sendKeys(user);
	password.sendKeys(pass);
	submit.click();
	}
	
}
