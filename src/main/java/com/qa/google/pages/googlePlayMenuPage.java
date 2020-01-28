package com.qa.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;

public class googlePlayMenuPage extends TestBase {
	
	
	@FindBy(xpath=configuration.playSearch)
	WebElement palySearch;
	
	@FindBy(xpath=configuration.playLogo)
	WebElement palylogo;
	
	@FindBy(xpath=configuration.playsignin)
	WebElement playSignIn;
	
	@FindBy(xpath=configuration.gmailUsername)
	WebElement gmailusername ;
	@FindBy(xpath=configuration.usernamenxtBtn)
	WebElement  usernxt;
	@FindBy(xpath=configuration.gmailPassword)
	WebElement  gmailPassword;
	@FindBy(xpath=configuration.passwordnxtbtn)
	WebElement  passwordnxt;
	
	@FindBy(xpath=configuration.playsignlogo)
	WebElement playsignlogo;
	
	@FindBy(xpath=configuration.playsignout)
	WebElement playsignOut;

	public  googlePlayMenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String checkplayTitle() {
		
		 return driver.getTitle();
	}
	
	public boolean verifyplayFeild() {
		palySearch.isDisplayed();
		palylogo.isDisplayed();
		return true;
	}
	
	public boolean loginplayTest(String username,String password) throws InterruptedException {
		playSignIn.click();
		gmailusername.sendKeys(username);
		usernxt.click();
		gmailPassword.sendKeys(password);
		Thread.sleep(3000);
		passwordnxt.click();
		playsignlogo.click();
		playsignOut.click();
		return true;
	}
	
	
}
