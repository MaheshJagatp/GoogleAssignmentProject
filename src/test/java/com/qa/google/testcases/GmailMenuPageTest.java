package com.qa.google.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.qa.google.base.TestBase;
import com.qa.google.pages.googleGmailMenuPage;
import com.qa.google.pages.googleSearchPage;
import com.qa.google.pages.gridMenuPage;
import com.qa.google.util.TestUtil;

public class GmailMenuPageTest extends TestBase {
	
	googleSearchPage googlesearchpage;
	gridMenuPage gridmenupage;
	googleGmailMenuPage gmailpage;
	String sheetname1="testdata";
	
	public GmailMenuPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		googlesearchpage=new googleSearchPage();
		gridmenupage = new gridMenuPage();
		gmailpage =new googleGmailMenuPage();
		googlesearchpage.clickOnGrid();
		gridmenupage.googleGmailClick();
		
	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String title=gmailpage.checkGmailTitle();
		Assert.assertEquals(title,"Gmail - Email from Google","page title is not matched");
	}
	
	@Test(priority=2)
	public void checkGmailPage() {
		boolean b=gmailpage.verifyGmialFeild();
		Assert.assertEquals(b, true,"Search page Test Fail");
	}
	
	
	
	
	
	@Test(priority=3)
	public void checkpgmialloginTest() throws InterruptedException {
		boolean a=gmailpage.signIntoGmail(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(a, true,"gmail Signin failed");
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
