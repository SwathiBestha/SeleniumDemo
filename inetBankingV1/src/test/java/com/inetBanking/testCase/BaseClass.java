package com.inetBanking.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl = "http://demo.guru99.com/V4/";
	public String Username = "mngr366746";
	public String Password = "utEgYjU";
	
	public static WebDriver driver;
	
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\git\\repository\\inetBankingV1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
