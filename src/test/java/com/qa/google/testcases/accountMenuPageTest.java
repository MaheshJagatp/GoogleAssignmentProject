package com.qa.google.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.accountMenuPage;
import com.qa.google.pages.googleSearchPage;
import com.qa.google.pages.gridMenuPage;

public class accountMenuPageTest extends TestBase {
	googleSearchPage googlesearchpage;
	gridMenuPage gridmenupage;
	accountMenuPage accountmenupage;
	String sheetname1="testdata";
	
	public accountMenuPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		googlesearchpage=new googleSearchPage();
		gridmenupage = new gridMenuPage();
		accountmenupage =new accountMenuPage();
		googlesearchpage.clickOnGrid();
		gridmenupage.AccountClick();
		
	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String title=accountmenupage.verifyAccountPageTitle();
		Assert.assertEquals(title, "Google Account","page title is not matched");
	}
	@Test(priority=2)
	public void verifygoogleAccountTest() {
		boolean b=accountmenupage.verifyGoogleAccount();
		Assert.assertEquals(b, true,"Google Account logo is not found");
	}
	
	
	
	
	@Test(priority=3)
	public void verifyaccountLogin() throws InterruptedException {
		boolean b=accountmenupage.loginGoogleAccount(prop.getProperty("username"), prop.getProperty("password"));
	Assert.assertEquals(b, true,"SignIn Account Test Case failed");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
