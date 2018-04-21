package com.org.POMPageFactory.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.POMPageFactory.base.BasePage;
import com.org.POMPageFactory.pages.LaunchPage;
import com.org.POMPageFactory.pages.LoginPage;
import com.org.POMPageFactory.session.LandingPage;


public class ProfileTest extends BasePage{

	@Test
	public void testProfile() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:/MyWorkSpace/DesignePattern/POMPageFactory/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		LaunchPage launchPage = PageFactory.initElements(driver, LaunchPage.class);
		LoginPage loginPage = launchPage.gotoLoginPage();
		loginPage.verifyTitle("Title");
		Object page = loginPage.doLogin("suneeil@ymail.com", "ka04em1689SAI@RAM");
		Thread.sleep(5000);
		
			
			if(page instanceof LoginPage){
				System.out.println("Assert Login Failure");
				Assert.fail("Unsuccessful Login");
			}else if(page instanceof LandingPage){
				System.out.println("Login Success");
			}
			
		LandingPage landingPage = (LandingPage) page;
		landingPage.verifyTitle("Title");
		((LandingPage) landingPage).gotoProfilePage();
	}
		
}