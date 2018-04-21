package com.org.POMPageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.org.POMPageFactory.base.BasePage;

public class LaunchPage extends BasePage{
	
	
	public LaunchPage(WebDriver driver){
		/*System.out.println("Driver Launch Here ");
		driver.get("http://www.gmail.com");*/
		this.driver = driver;
	}
	
	
	public LoginPage gotoLoginPage(){
		/*LoginPage loginPage = new LoginPage();
		return loginPage;*/
		driver.get("http://www.facebook.com");
		//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		//return loginPage;
		return PageFactory.initElements(driver, LoginPage.class);
	}
}