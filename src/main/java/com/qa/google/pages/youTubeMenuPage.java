package com.qa.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;

public class youTubeMenuPage extends TestBase {
	
	
	@FindBy(xpath=configuration.youtubeSearch)
	WebElement youtubeSerach;
	
	@FindBy(xpath=configuration.youtubeLogo)
	WebElement youtubeLogo;
	
	@FindBy(xpath=configuration.youtubesignin)
	WebElement youTubeSignIn;
	
	@FindBy(xpath=configuration.gmailUsername)
	WebElement gmailusername ;
	@FindBy(xpath=configuration.usernamenxtBtn)
	WebElement  usernxt;
	@FindBy(xpath=configuration.gmailPassword)
	WebElement  gmailPassword;
	@FindBy(xpath=configuration.passwordnxtbtn)
	WebElement  passwordnxt;
	
	@FindBy(xpath=configuration.youtubesignlogo)
	WebElement youTubeSignLogo;
	
	@FindBy(xpath=configuration.youtubesignout)
	WebElement youTubeSignOut;
	
	public  youTubeMenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String checkYoutubeTitle() {
		
		 return driver.getTitle();
	}
	
	public boolean verifyYoutubeFeild() {
		youtubeSerach.isDisplayed();
		youtubeLogo.isDisplayed();
		return true;
	}
	


	public boolean loginYouTubeTest(String username,String password) throws InterruptedException {
		youTubeSignIn.click();
		gmailusername.sendKeys(username);
		usernxt.click();
		gmailPassword.sendKeys(password);
		Thread.sleep(3000);
		passwordnxt.click();
		youTubeSignLogo.click();
		youTubeSignOut.click();
		return true;
	}
}
