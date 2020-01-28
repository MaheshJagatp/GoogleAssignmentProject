package com.qa.google.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.googleSearchPage;
import com.qa.google.pages.gridMenuPage;
import com.qa.google.pages.mapMenuPage;

public class mapMenuPageTest extends TestBase{
	
	googleSearchPage googlesearchpage;
	gridMenuPage gridmenupage;
	mapMenuPage mapmenupage;
	
	public mapMenuPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		googlesearchpage=new googleSearchPage();
		gridmenupage = new gridMenuPage();
		mapmenupage =new mapMenuPage();
		googlesearchpage.clickOnGrid();
		gridmenupage.mapsClick();
		
	}
	
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String title=mapmenupage.checkMapTitle();
		Assert.assertEquals(title, "Google Maps","page title is not matched");
	}
	
	@Test(priority=2)
	public void checkGooglePage() {
		boolean b=mapmenupage.verifySearchField();
		Assert.assertEquals(b, true,"Search page Test Fail");
	}
	
	@Test(priority=3)
	public void checkoginTest() throws InterruptedException {
		boolean a=mapmenupage.loginMapTest(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals(a, true,"map login failed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	
	

}
