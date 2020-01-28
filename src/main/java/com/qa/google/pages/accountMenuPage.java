package com.qa.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;

public class accountMenuPage extends TestBase {

	@FindBy(xpath = configuration.googleAccount)
	WebElement googleAccount;

	@FindBy(xpath = configuration.SigninAccountBtn)
	WebElement signinAccountbtn;

	@FindBy(xpath = configuration.gmailUsername)
	WebElement gmailusername;
	@FindBy(xpath = configuration.usernamenxtBtn)
	WebElement usernxt;
	@FindBy(xpath = configuration.gmailPassword)
	WebElement gmailPassword;
	@FindBy(xpath = configuration.passwordnxtbtn)
	WebElement passwordnxt;

	@FindBy(xpath = configuration.accountSignInLogo)
	WebElement acccountsigninlogo;

	@FindBy(xpath = configuration.accountSignoutBtn)
	WebElement accountsignout;

	public accountMenuPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyAccountPageTitle() {
		return driver.getTitle();
	}

	public boolean verifyGoogleAccount() {
		return googleAccount.isDisplayed();
	}

	public boolean loginGoogleAccount(String username, String Passsword) throws InterruptedException {
		signinAccountbtn.click();
		gmailusername.sendKeys(username);
		usernxt.click();
		gmailPassword.sendKeys(Passsword);
		Thread.sleep(3000);
		passwordnxt.click();
		acccountsigninlogo.click();
		accountsignout.click();
		return true;
	}

}
