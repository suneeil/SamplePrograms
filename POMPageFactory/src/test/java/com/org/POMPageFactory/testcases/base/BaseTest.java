package com.org.POMPageFactory.testcases.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.org.POMPageFactory.util.AppConstants;

public class BaseTest {
	//Any test that starts will first call init
	
	
	public WebDriver driver; //This needs to be public to access in all tests
	public void init(String browserType){
		if ("Mozilla".equals(browserType)) {
			System.setProperty("webdriver.gecko.driver",AppConstants.FIREFOX_DRIVER_EXE);
			WebDriver driver = new FirefoxDriver();
		}else if("Chrome".equals(browserType)){
			System.setProperty("webdriver.chrome.driver", AppConstants.CHROME_DRIVER_EXE);
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	}
	
}
