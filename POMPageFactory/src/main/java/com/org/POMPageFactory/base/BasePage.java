package com.org.POMPageFactory.base;

import org.openqa.selenium.WebDriver;

public class BasePage {

	public WebDriver driver;
	
	public boolean verifyTitle(String expected){
		
		return true;
	}
	
	public boolean verifyText(String locator, String expectedText){
		System.out.println("Verify The TEXT");
		return true;
	}
	
	public boolean isElementPresent(String locator){
		System.out.println("Is Element Present");
		return true;
	}
	
}