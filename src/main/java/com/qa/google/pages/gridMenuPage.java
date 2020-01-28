package com.qa.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;

public class gridMenuPage extends TestBase {

	@FindBy(xpath = configuration.account)
	WebElement Account;

	@FindBy(xpath = configuration.Search)
	WebElement Search;

	@FindBy(xpath = configuration.map)
	WebElement Map;

	@FindBy(xpath = configuration.youtube)
	WebElement YouTube;

	@FindBy(xpath = configuration.play)
	WebElement Play;

	@FindBy(xpath = configuration.news)
	WebElement News;

	@FindBy(xpath = configuration.gmail)
	WebElement Gmail;

	@FindBy(xpath = configuration.contacts)
	WebElement Contacts;

	@FindBy(xpath = configuration.drive)
	WebElement Drive;

	@FindBy(xpath = configuration.calender)
	WebElement Calender;

	@FindBy(xpath = configuration.translate)
	WebElement Translate;

	@FindBy(xpath = configuration.photos)
	WebElement Photos;

	@FindBy(xpath = configuration.shopping)
	WebElement Shopping;

	@FindBy(xpath = configuration.duo)
	WebElement Duo;

	public gridMenuPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean clickOnProduct() {
		boolean a = false;
		if (Account.isDisplayed() == true && Search.isDisplayed() == true && Map.isDisplayed() == true
				&& YouTube.isDisplayed() == true && Play.isDisplayed() == true && News.isDisplayed() == true
				&& Gmail.isDisplayed() == true && Contacts.isDisplayed() == true && Drive.isDisplayed() == true
				&& Calender.isDisplayed() == true && Translate.isDisplayed() == true && Photos.isDisplayed() == true
				&& Shopping.isDisplayed() == true && Duo.isDisplayed()) {
			a = true;
		}

		return a;
	}

	public accountMenuPage AccountClick() {
		Account.click();
		return new accountMenuPage();
	}

	public googleSearchMenuPage googleSerachPage() {
		Search.click();
		return new googleSearchMenuPage();
	}

	public mapMenuPage mapsClick() {
		Map.click();
		return new mapMenuPage();
	}

	public youTubeMenuPage youtubeclick() {
		YouTube.click();
		return new youTubeMenuPage();
	}

	public googlePlayMenuPage googlePlayclick() {
		Play.click();
		return new googlePlayMenuPage();
	}

	public googleNewsMenuPage googleNewsclick() {
		News.click();
		return new googleNewsMenuPage();
	}

	public void googleGmailClick() {
		Gmail.click();
	}
}
