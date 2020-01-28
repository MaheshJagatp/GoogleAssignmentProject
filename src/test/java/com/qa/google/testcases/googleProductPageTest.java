package com.qa.google.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.google.base.TestBase;
import com.qa.google.pages.googleProductPage;

public class googleProductPageTest extends TestBase {
	googleProductPage googleproduct;
	
	
	public googleProductPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		googleproduct=new googleProductPage();
		
		
		}
	
	@Test(priority=1)
	public void checkProductOfGoogle() {
		driver.navigate().to("http://about.google/intl/en/products/");
		boolean a=googleproduct.verifyProductPage();
		Assert.assertEquals(a, true,"Product Test case Fail");
		
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
