package com.qa.google.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;
import com.qa.google.config.configuration;

public class gmailInboxPage extends TestBase {

	@FindBy(xpath = configuration.inboxcount)
	WebElement inboxCount;

	@FindBy(xpath = configuration.counttxt)
	WebElement CountTxt;

	@FindBy(xpath = configuration.nextbtn)
	WebElement nextBtn;

	@FindBy(xpath = configuration.composebtn)
	WebElement composeBtn;

	@FindBy(xpath = configuration.sendto)
	WebElement sendTo;

	@FindBy(xpath = configuration.subject)
	WebElement Subject;

	@FindBy(xpath = configuration.mailtextbox)
	WebElement mailTextBox;

	@FindBy(xpath = configuration.sendtobtn)
	WebElement sendToBtn;

	@FindBy(xpath = configuration.sentmenu)
	WebElement SentMenu;

	@FindBy(xpath = configuration.searchinmail)
	WebElement serchInMail;

	@FindBy(xpath = configuration.mailtobeserch)
	WebElement mailToBeSerch;

	@FindBy(xpath = configuration.settingbtn)
	WebElement settingBtn;

	@FindBy(xpath = configuration.setting2btn)
	WebElement setting2Btn;

	@FindBy(xpath = configuration.settingtxt)
	WebElement SettingTxt;

	@FindBy(xpath = configuration.morebtn)
	WebElement moreBtn;

	@FindBy(xpath = configuration.newLabelBtn)
	WebElement newLabelBtn;

	@FindBy(xpath = configuration.toperform)
	WebElement ToPerform;

	@FindBy(xpath = configuration.testingbtn)
	WebElement TestingBtn;

	@FindBy(xpath = configuration.labelname)
	WebElement Labelname;

	@FindBy(xpath = configuration.labelokbtn)
	WebElement LabelOkBtn;

	@FindBy(xpath = configuration.signoutgmail)
	WebElement SignOutGmail;
	@FindBy(xpath = configuration.signoutgmailbtn)
	WebElement SignOutGmainBtn;

	@FindBy(xpath = configuration.onemailinbox)
	WebElement OneMailInbox;
	@FindBy(xpath = configuration.labelbtn)
	WebElement LabelBtn;
	@FindBy(xpath = configuration.searchinlabel)
	WebElement SearchInLabel;

	public gmailInboxPage() {
		PageFactory.initElements(driver, this);
	}

	public int countInboxmail() {
		int sum = 0;

		List<WebElement> list = inboxCount.findElements(By.tagName("tr"));

		sum += list.size();

		return sum;
	}

	public int countStarMail() {
		int sum = 0;
		List<WebElement> list = driver.findElements(
				By.xpath("//*[@class='UI']/div/" + "div/div[3]/div/table/tbody/tr/td//span[@title='Starred']"));

		sum += list.size();
		return sum;

	}

	public int countUnreadMail() {
		int sum = 0;
		List<WebElement> list = driver.findElements(By.xpath(
				"//*[@class='UI']" + "/div/div/div[3]/div/table/tbody/tr/td/div" + "[contains(text(),\"unread, \")]"));

		sum += list.size();
		return sum;

	}

	public boolean verifycomposemail() {
		composeBtn.click();
		sendTo.isDisplayed();

		return true;

	}

	public boolean sendMail() {

		composeBtn.click();

		sendTo.sendKeys(prop.getProperty("sendto"));
		Subject.sendKeys(prop.getProperty("subject"));
		mailTextBox.sendKeys(prop.getProperty("mailtextbox"));
		sendToBtn.click();
		SentMenu.click();
		return true;
	}

	public boolean searchMailTest() {
		serchInMail.sendKeys("mahesh");
		serchInMail.sendKeys(Keys.ENTER);
		// mailToBeSerch.isDisplayed();

		return true;
	}

	// *[@class='UI']/div/div/div[3]/div/table/tbody/tr/td/div[2]/div/span[contains(text(),"Attachment:")]

	public int attachmentcount() {
		int sum = 0;
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='UI']/div/div/div[3]"
				+ "/div/table/tbody/tr/td/div[2]/div/span[contains(text(),\"Attachment:\")]"));

		sum += list.size();
		return sum;
	}

	public boolean verifySettingPage() {
		settingBtn.click();

		setting2Btn.click();

		SettingTxt.isDisplayed();

		return true;
	}

	public boolean createnewlabel(String labelname) {
		Actions action = new Actions(driver);
		action.moveToElement(ToPerform).build().perform();

		moreBtn.click();
		newLabelBtn.click();

		Labelname.sendKeys(labelname);
		LabelOkBtn.click();
		TestingBtn.isDisplayed();
		return true;

	}

	public boolean movetolabel(String label) {
		OneMailInbox.click();
		LabelBtn.click();
		SearchInLabel.sendKeys(label);
		SearchInLabel.sendKeys(Keys.ENTER);
		return true;
	}

	public boolean signout() {

		SignOutGmail.click();
		SignOutGmainBtn.click();

		return true;
	}

}
