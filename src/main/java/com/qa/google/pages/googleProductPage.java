package com.qa.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;

public class googleProductPage extends TestBase {

	@FindBy(xpath=configuration.androidautologo)
	WebElement AndroidAutoLogo ;
	
	@FindBy(xpath=configuration.androidoslogo)
	WebElement  AndroidOS;
	
	@FindBy(xpath=configuration.calenderlogo)
	WebElement Calenderlogo ;
	
	@FindBy(xpath=configuration.chromelogo)
	WebElement  ChromeLogo;
	
	@FindBy(xpath=configuration.contactlogo)
	WebElement ContactLogo ;
	
	@FindBy(xpath=configuration.earthlogo)
	WebElement  EarthLogo;
	
	@FindBy(xpath=configuration.financelogo)
	WebElement FinanceLogo ;
	
	@FindBy(xpath=configuration.formslogo)
	WebElement  FormsLogo;
	
	@FindBy(xpath=configuration.gboardlogo)
	WebElement GboardLogo ;
	
	@FindBy(xpath=configuration.messagelogo)
	WebElement  MessageLogo;
	
	@FindBy(xpath=configuration.playprotectlogo)
	WebElement PlayProtectLogo ;
	
	@FindBy(xpath=configuration.transaltelogo)
	WebElement TranslateLogo ;
	
	@FindBy(xpath=configuration.youtubekidslogo)
	WebElement  YouTubeKids;
	
	@FindBy(xpath=configuration.finalmorelink)
	WebElement finalMoreLink;
	
	
	public  googleProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyProductPage() {
		//finalMoreLink.sendKeys(Keys.PAGE_DOWN);
		
		AndroidAutoLogo.isDisplayed();
		AndroidOS.isDisplayed();
		Calenderlogo.isDisplayed();
		ChromeLogo.isDisplayed();
		ContactLogo.isDisplayed();
		EarthLogo.isDisplayed();
		FinanceLogo.isDisplayed();
		FormsLogo.isDisplayed();
		GboardLogo.isDisplayed();
		MessageLogo.isDisplayed();
		PlayProtectLogo.isDisplayed();
		TranslateLogo.isDisplayed();
		YouTubeKids.isDisplayed();
		return true;
	}
	
}
