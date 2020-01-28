package com.qa.google.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.gmailInboxPage;
import com.qa.google.pages.googleGmailMenuPage;
import com.qa.google.pages.googleSearchPage;
import com.qa.google.pages.gridMenuPage;

public class gmailInboxPageTest extends TestBase {
	
	googleSearchPage googlesearchpage;
	gridMenuPage gridmenupage;
	googleGmailMenuPage gmailpage;
	gmailInboxPage gmailinboxpage;
	
	public gmailInboxPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		googlesearchpage=new googleSearchPage();
		gridmenupage = new gridMenuPage();
		gmailpage =new googleGmailMenuPage();
		gmailinboxpage=new gmailInboxPage();
		googlesearchpage.clickOnGrid();
		gridmenupage.googleGmailClick();
		
		gmailpage.signIntoGmail(prop.getProperty("username"),prop.getProperty("password"));
		
		
	}
	@Test(priority=1)
	public void countMailTest() {
	int count=	gmailinboxpage.countInboxmail();
		System.out.println("Count of inbox mail-> "+count);
		
	}
	@Test(priority=2)
	public void countStarMailTest() {
	int count=	gmailinboxpage.countStarMail();
		System.out.println("Count of Star mail-> "+count);
		
	}
	
	@Test(priority=3)
	public void countUnreadMailTest() {
	int count=	gmailinboxpage.countUnreadMail();
		System.out.println("Count of unread mail-> "+count);
		
	}
	
	@Test(priority=4)
	public void composebtnTest()  {
		boolean b=gmailinboxpage.verifycomposemail();
		Assert.assertEquals(b, true,"Compose btn Test fail");
	}
	
	@Test(priority=5)
	public void sentMailTest()  {
		boolean b=gmailinboxpage.sendMail();
		Assert.assertEquals(b, true,"Email not send");
		
	}
	
	@Test(priority=6)
	public void serchInMail()  {
		boolean b=gmailinboxpage.searchMailTest();
		Assert.assertEquals(b, true,"specific search not send");
		
	}
	
	@Test(priority=7)
	public void countAttachmentMailTest() {
	int count=	gmailinboxpage.attachmentcount();
		System.out.println("Count of attachment mail-> "+count);
		
	}
	
	@Test(priority=8)
	public void settingPageTest()   {
		boolean b=gmailinboxpage.verifySettingPage();
		Assert.assertEquals(b, true,"Setting page is not display");
		
		
	}
	
	@Test(priority=9)
	public void createNewLabelTest() {
	boolean b=gmailinboxpage.createnewlabel(prop.getProperty("labelname"));
		Assert.assertEquals(b, true,"new label is not craeted");
		
	}
	
	@Test(priority=10)
	public void moveToLabel() {
		boolean b=gmailinboxpage.movetolabel(prop.getProperty("labelname"));
		Assert.assertEquals(b, true," label is not moved");

	
	}
	
	
	@Test(priority=11)
	public void signOutTest() {
	boolean b=gmailinboxpage.signout();
	Assert.assertEquals(b, true,"Sign Out failed");	
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
