package com.inetBanking.pageObjects;

import org.apache.poi.hssf.record.PageBreakRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}	
		@FindBy(name = "uid")
		@CacheLookup
		WebElement txtUsername;
		
		@FindBy(name = "password")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(name = "btnLogin")
		@CacheLookup
		WebElement txtLogin;
		
		public void setUserName(String uName)
		{
			txtUsername.sendKeys(uName);
		}
		
		public void setPassword(String pWord)
		{
			txtPassword.sendKeys(pWord);
		}
		
		public void clickLogin()
		{
			txtLogin.click();	
		}
		
		
		
		
		
		
		
		
		
	
	

}
