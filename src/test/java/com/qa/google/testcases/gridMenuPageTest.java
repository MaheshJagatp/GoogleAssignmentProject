package com.qa.google.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.googleSearchPage;
import com.qa.google.pages.gridMenuPage;

public class gridMenuPageTest extends TestBase {
	googleSearchPage googlesearchpage;
	gridMenuPage gridmenupage;
		
	@BeforeMethod
	public void setup() {
		initialization();
		googlesearchpage=new googleSearchPage();
		gridmenupage = new gridMenuPage();
		googlesearchpage.clickOnGrid();
		
	}
	
	
	@Test(priority=1)
	public void GridBtnTest() {
		
		boolean b= gridmenupage.clickOnProduct();
		Assert.assertEquals(b, true,"Test Fail");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
