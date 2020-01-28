package com.qa.google.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.googleSearchPage;
import com.qa.google.pages.gridMenuPage;
import com.qa.google.pages.mapMenuPage;
import com.qa.google.pages.youTubeMenuPage;

public class youtubePageTest extends TestBase{
	
	
	googleSearchPage googlesearchpage;
	gridMenuPage gridmenupage;
	youTubeMenuPage youtubepage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		googlesearchpage=new googleSearchPage();
		gridmenupage = new gridMenuPage();
		youtubepage =new youTubeMenuPage();
		googlesearchpage.clickOnGrid();
		gridmenupage.youtubeclick();
		
	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String title=youtubepage.checkYoutubeTitle();
		Assert.assertEquals(title, "YouTube","page title is not matched");
	}
	
	@Test(priority=2)
	public void checkYoutubePage() {
		boolean b=youtubepage.verifyYoutubeFeild();
		Assert.assertEquals(b, true,"Search page Test Fail");
	}
	
	@Test(priority=3)
	public void checkYouTubeloginTest() throws InterruptedException {
		boolean a=youtubepage.loginYouTubeTest(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals(a, true,"Youtube Signin failed");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
