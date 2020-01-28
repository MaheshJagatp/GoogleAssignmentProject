package com.qa.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;

public class mapMenuPage extends TestBase{

	@FindBy(xpath=configuration.mapsearch)
	WebElement MapSearch;
	
	@FindBy(xpath=configuration.mapSignIn)
	WebElement mapSignIn;
	
	@FindBy(xpath=configuration.gmailUsername)
	WebElement gmailusername ;
	@FindBy(xpath=configuration.usernamenxtBtn)
	WebElement  usernxt;
	@FindBy(xpath=configuration.gmailPassword)
	WebElement  gmailPassword;
	@FindBy(xpath=configuration.passwordnxtbtn)
	WebElement  passwordnxt;
	
	@FindBy(xpath=configuration.mapSignLogo)
	WebElement mapsignlogo;
	
	@FindBy(xpath=configuration.mapsignout)
	WebElement mapSignOut;
	
	
	
	public  mapMenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String checkMapTitle() {
		 return driver.getTitle();
	}
	
	public boolean verifySearchField() {
		MapSearch.isDisplayed();
		return true;
	}
	
	public boolean loginMapTest(String username,String password) throws InterruptedException {
		mapSignIn.click();
		gmailusername.sendKeys(username);
		usernxt.click();
		gmailPassword.sendKeys(password);
		Thread.sleep(3000);
		passwordnxt.click();
		mapsignlogo.click();
		mapSignOut.click();
		return true;
	}
	
	
}
