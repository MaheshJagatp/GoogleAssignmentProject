package com.qa.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;

public class googleSearchMenuPage extends TestBase {
	
	@FindBy(xpath=configuration.SearchFeild)
	WebElement SearchField;
	
	@FindBy(xpath=configuration.GoogleSearchBtn)
	WebElement GoogleSearchBtn;
	
	@FindBy(xpath=configuration.ImFeelLuckyBtn)
	WebElement ImFeelLuckyBtn;
	
	@FindBy(xpath=configuration.SignInBtn)
	WebElement SignInBtn ;
	
	@FindBy(xpath=configuration.gmailUsername)
	WebElement gmailusername ;
	@FindBy(xpath=configuration.usernamenxtBtn)
	WebElement  usernxt;
	@FindBy(xpath=configuration.gmailPassword)
	WebElement  gmailPassword;
	@FindBy(xpath=configuration.passwordnxtbtn)
	WebElement  passwordnxt;
	
	@FindBy(xpath=configuration.searchGmailLogo)
	WebElement  serchLogo;
	@FindBy(xpath=configuration.searchSignout)
	WebElement  serchOut;
	
	
	
	public  googleSearchMenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String checkTitle() {
		
		 return driver.getTitle();
	}
	
	public boolean checkGoogleSeachPage() {
		
		SearchField.isDisplayed();
		GoogleSearchBtn.isDisplayed();
		ImFeelLuckyBtn.isDisplayed();
		SignInBtn.isDisplayed();
		
		return true;
	}
	
	public boolean checkGoogleLogin(String username,String password) throws InterruptedException {
		SignInBtn.click();
		gmailusername.sendKeys(username);
		usernxt.click();
		gmailPassword.sendKeys(password);
		Thread.sleep(3000);
		passwordnxt.click();
		serchLogo.click();
		serchOut.click();
		return true;
	}

}
