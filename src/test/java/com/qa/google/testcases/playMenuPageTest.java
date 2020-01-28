package com.qa.google.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.googlePlayMenuPage;
import com.qa.google.pages.googleSearchPage;
import com.qa.google.pages.gridMenuPage;


public class playMenuPageTest extends TestBase{

	googleSearchPage googlesearchpage;
	gridMenuPage gridmenupage;
	googlePlayMenuPage googleplaymenupage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		googlesearchpage=new googleSearchPage();
		gridmenupage = new gridMenuPage();
		googleplaymenupage =new googlePlayMenuPage();
		googlesearchpage.clickOnGrid();
		gridmenupage.googlePlayclick();
		
	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String title=googleplaymenupage.checkplayTitle();
		Assert.assertEquals(title, "Google Play","page title is not matched");
	}
	
	@Test(priority=2)
	public void checkYoutubePage() {
		boolean b=googleplaymenupage.verifyplayFeild();
		Assert.assertEquals(b, true,"Search page Test Fail");
	}
	
	@Test(priority=3)
	public void checkYouTubeloginTest() throws InterruptedException {
		boolean a=googleplaymenupage.loginplayTest(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals(a, true,"Youtube Signin failed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
