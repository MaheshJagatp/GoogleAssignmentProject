package com.qa.google.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.googleSearchPage;

public class GoogleSearchPageTest extends TestBase {

	googleSearchPage googlesearchpage;

	public GoogleSearchPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		googlesearchpage = new googleSearchPage();

	}

	@Test(priority = 1)
	public void homePageTest() {
		boolean b = googlesearchpage.checkGoogleSeachPage();
		Assert.assertEquals(b, true, "Test Fail");
	}

	@Test(priority = 2)
	public void checkLanguage() {
		boolean b = googlesearchpage.checkLanguageChange();
		Assert.assertEquals(b, true, "Test Fail");
	}

	@Test(priority = 3)
	public void serachOpeartion() {
		boolean a = googlesearchpage.searchOpreation();
		Assert.assertEquals(a, true, "Test Fail");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
