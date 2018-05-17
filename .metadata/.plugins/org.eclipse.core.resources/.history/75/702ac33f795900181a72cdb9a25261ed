package com.org.POMPageFactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.POMPageFactory.base.BasePage;
import com.org.POMPageFactory.session.LandingPage;

public class LoginPage extends BasePage{

	
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement email;
	@FindBy(xpath="//*[@id='pass']")
	public WebElement password;
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public Object doLogin(String user, String pwd){
		boolean loginStatus = true;
		System.out.println("Loging into FB usig " + user + ", pwd: "+ pwd);
		//LandingPage landPage = new LandingPage();
		email.sendKeys(user);
		password.sendKeys(pwd);
		password.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("")).sendKeys(pwd);
		boolean loginSuccess = true;
		if(loginSuccess)
			return PageFactory.initElements(driver, LandingPage.class);
		else
			return PageFactory.initElements(driver, LoginPage.class);
	}
	
	
	
	
}
