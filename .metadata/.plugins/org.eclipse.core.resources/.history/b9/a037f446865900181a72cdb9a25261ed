package com.org.POMPageFactory.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.org.POMPageFactory.pages.LaunchPage;
import com.org.POMPageFactory.pages.LoginPage;
import com.org.POMPageFactory.testcases.base.BaseTest;
import com.org.POMPageFactory.util.AppConstants;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginTest(){
		init(AppConstants.BROWSER);
		LaunchPage launchPage = PageFactory.initElements(driver, LaunchPage.class);
		LoginPage loginPage = launchPage.gotoLoginPage();
		loginPage.doLogin("", "");
	}
	
}
