package com.qa.google.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;
import com.qa.google.util.TestUtil;

public class googleSearchPage extends TestBase {

	@FindBy(xpath = configuration.SearchFeild)
	WebElement SearchField;

	@FindBy(xpath = configuration.GoogleSearchBtn)
	WebElement GoogleSearchBtn;

	@FindBy(xpath = configuration.ImFeelLuckyBtn)
	WebElement ImFeelLuckyBtn;

	@FindBy(xpath = configuration.SignInBtn)
	WebElement SignInBtn;
	// Grid btn

	@FindBy(xpath = configuration.grid)
	WebElement Grid;

	@FindBy(xpath = configuration.languagehindi)
	WebElement hindiLanguage;

	@FindBy(xpath = configuration.languageArraypath)
	WebElement languagearraypath;

	public googleSearchPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean checkGoogleSeachPage() {

		SearchField.isDisplayed();
		GoogleSearchBtn.isDisplayed();
		ImFeelLuckyBtn.isDisplayed();
		SignInBtn.isDisplayed();

		return true;
	}

	public gridMenuPage clickOnGrid() {
		Grid.click();
		TestUtil.swithToPanel();
		return new gridMenuPage();
	}

	public boolean checkLanguageChange() {
		boolean a = false;

		String s1 = hindiLanguage.getText();
		hindiLanguage.click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@id=\"SIvCob\"]/a"));
		for (int i = 0; i < list.size(); i++) {
			if (s1 == list.get(i).getText()) {
				Assert.fail();
				return false;

			}
			return true;
		}
		return true;

	}

	public boolean searchOpreation() {
		SearchField.sendKeys("rajnikant");
		List<WebElement> lb = driver
				.findElements(By.xpath("//ul[@role='listbox']" + "//li/descendant::div[@class='sbl1']"));

		// System.out.println(lb.size());

		for (int i = 0; i < lb.size(); i++) {
			// System.out.println(lb.get(i).getText());

			if (lb.get(i).getText().contains("rajnikant"))
				lb.get(i).click();
			break;

		}
		boolean b = driver.findElement(By.xpath("//div[@class='r']" + "/a/h3[contains(text(),\"rajnikant\")]"))
				.isDisplayed();

		return true;
	}

}
