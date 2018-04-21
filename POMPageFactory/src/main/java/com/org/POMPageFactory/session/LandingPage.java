package com.org.POMPageFactory.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.POMPageFactory.base.BasePage;

public class LandingPage extends BasePage{
	
	
	
	@FindBy(xpath="//div[@data-click='profile_icon']//span")
	WebElement profile;
	public LandingPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	
	
	public ProfilePage gotoProfilePage(){
		//ProfilePage proifle = new ProfilePage();
		System.out.println(" On Landing Go to Profile");
		profile.click();
		return PageFactory.initElements(driver, ProfilePage.class);
	}
	
	
	
	
	public void verifyProfile(){
		
	}
	
}
