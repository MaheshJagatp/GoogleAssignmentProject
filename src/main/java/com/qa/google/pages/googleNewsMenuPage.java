package com.qa.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;

public class googleNewsMenuPage extends TestBase {

	@FindBy(xpath=configuration.newsSerach)
	WebElement newsSearch;
	
	@FindBy(xpath=configuration.newsLogo)
	WebElement newslogo;
	
	@FindBy(xpath=configuration.newssignin)
	WebElement newsSignIn;
	
	@FindBy(xpath=configuration.gmailUsername)
	WebElement gmailusername ;
	@FindBy(xpath=configuration.usernamenxtBtn)
	WebElement  usernxt;
	@FindBy(xpath=configuration.gmailPassword)
	WebElement  gmailPassword;
	@FindBy(xpath=configuration.passwordnxtbtn)
	WebElement  passwordnxt;
	
	@FindBy(xpath=configuration.newssignlogo)
	WebElement newssignlogo;
	
	@FindBy(xpath=configuration.newssignout)
	WebElement newssignOut;
	
	
	public  googleNewsMenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String checkNewsTitle() {
		
		 return driver.getTitle();
	}
	
	public boolean verifyNewsFeild() {
		newsSearch.isDisplayed();
		newslogo.isDisplayed();
		return true;
	}
	
	public boolean loginnewsTest(String username,String password) throws InterruptedException {
		newsSignIn.click();
		gmailusername.sendKeys(username);
		usernxt.click();
		gmailPassword.sendKeys(password);
		Thread.sleep(3000);
		passwordnxt.click();
		newssignlogo.click();
		newssignOut.click();
		return true;
	}
	
}
