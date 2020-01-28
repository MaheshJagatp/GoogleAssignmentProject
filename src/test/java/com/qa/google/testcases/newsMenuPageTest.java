package com.qa.google.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.googleNewsMenuPage;
import com.qa.google.pages.googleSearchPage;
import com.qa.google.pages.gridMenuPage;

public class newsMenuPageTest extends TestBase {
	
	googleSearchPage googlesearchpage;
	gridMenuPage gridmenupage;
	googleNewsMenuPage googlenewspage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		googlesearchpage=new googleSearchPage();
		gridmenupage = new gridMenuPage();
		googlenewspage =new googleNewsMenuPage();
		googlesearchpage.clickOnGrid();
		gridmenupage.googleNewsclick();
		
	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String title=googlenewspage.checkNewsTitle();
		Assert.assertEquals(title,"Google News","page title is not matched");
	}
	
	@Test(priority=2)
	public void checkYoutubePage() {
		boolean b=googlenewspage.verifyNewsFeild();
		Assert.assertEquals(b, true,"Search page Test Fail");
	}
	@Test(priority=3)
	public void checkplayloginTest() throws InterruptedException {
		boolean a=googlenewspage.loginnewsTest(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(a, true,"Youtube Signin failed");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
