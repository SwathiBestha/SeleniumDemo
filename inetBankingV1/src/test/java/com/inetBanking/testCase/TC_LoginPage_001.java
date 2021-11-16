package com.inetBanking.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass{
	
	@Test
	public void LoginTest()
	{
		driver.get(baseUrl);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(Username);
		lp.setPassword(Password);
		lp.clickLogin();
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
		  Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
		
	}

}
