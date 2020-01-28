package com.qa.google.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;
import com.qa.google.util.TestUtil;

public class googleGmailMenuPage extends TestBase{
	
	@FindBy(xpath=configuration.gmailLogo)
	WebElement gmaillogo;
	
	@FindBy(xpath=configuration.signin)
	WebElement gmailSignin;
	
	@FindBy(xpath=configuration.gmailUsername)
	WebElement gmailusername ;
	@FindBy(xpath=configuration.usernamenxtBtn)
	WebElement  usernxt;
	@FindBy(xpath=configuration.gmailPassword)
	WebElement  gmailPassword;
	@FindBy(xpath=configuration.passwordnxtbtn)
	WebElement  passwordnxt;
	
	@FindBy(xpath=configuration.gmailcheckpath)
	WebElement  gmailcheck;
	
	public  googleGmailMenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String checkGmailTitle() {
		
		 return driver.getTitle();
	}
	
	public boolean verifyGmialFeild() {
		gmaillogo.isDisplayed();
		
		return true;
	}
	
	
	public boolean signIntoGmail(String Username,String Password) throws InterruptedException {
		gmailSignin.click();
		Thread.sleep(4000);
		
		TestUtil.switchToTab();
		
		gmailusername.sendKeys(Username);
		usernxt.click();
		Thread.sleep(4000);
		gmailPassword.sendKeys(Password);
		passwordnxt.click();
		gmailcheck.isDisplayed();
		Thread.sleep(5000);
		return true;
	}
	
	
	
	
	

}
