package com.qa.google.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.googleSearchMenuPage;
import com.qa.google.pages.googleSearchPage;
import com.qa.google.pages.gridMenuPage;
import com.qa.google.util.TestUtil;

public class googleSearchMenuTest extends TestBase {

	googleSearchPage googlesearchpage;
	gridMenuPage gridmenupage;
	googleSearchMenuPage googlesearchPage;
	String sheetname1="testdata";
		
	public googleSearchMenuTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		googlesearchpage=new googleSearchPage();
		gridmenupage = new gridMenuPage();
		googlesearchPage =new googleSearchMenuPage();
		googlesearchpage.clickOnGrid();
		gridmenupage.googleSerachPage();
		
	}
	
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String title=googlesearchPage.checkTitle();
		Assert.assertEquals(title, "Google","page title is not matched");
	}
	
	@Test(priority=2)
	public void checkGooglePage() {
		boolean b=googlesearchPage.checkGoogleSeachPage();
		Assert.assertEquals(b, true,"Search page Test Fail");
	}
	
	
	
	@Test(priority=3)
	public void signInSerchPageTest() throws InterruptedException
	{
		boolean a=googlesearchPage.checkGoogleLogin(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals(a, true,"SignIn Search Page Is failed");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
