package com.qa.google.util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.google.base.TestBase;

public class TestUtil extends TestBase{

	public static long page_load_time=20;
	public static long implicit_time=15;
	public static Xls_Reader excel=null;
	
	public static void swithToPanel() {
		driver.switchTo().frame(0);
		
	}
	
	public static void switchToTab() {
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> ite = winids.iterator();
		
		String main = ite.next();
		String tab1 = ite.next();
		
		driver.switchTo().window(tab1);
		
		
	}
	
	public static Object[][] getData(String sheetname1){
		
		if(excel==null) {
			excel= new Xls_Reader("D:\\java_test\\GoogleAssignmentProject\\"
					+ "src\\main\\java\\com\\qa\\google\\testdata\\datasheet.xlsx");
		}
		String Sheetname=sheetname1;
		
		int rowcunt=excel.getRowCount(Sheetname);
		int colcunt=excel.getColumnCount(Sheetname);
		
		Object [] [] data=new Object [rowcunt-1][colcunt];
		
		for(int i=2;i<=rowcunt;i++) {
			for(int j=0;j<colcunt;j++) {
				data[i-2][j]=excel.getCellData(Sheetname, j, i);
			}
		}
		
		
		return data;
	}
	
	
	public static void takeScreenShot() throws IOException  {
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hrs = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		//System.out.println(+year + "-" + month + "-" + day + "-" + hrs + "-" + min + "-" + second);

		

		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\Screenshot\\" + day + " " + month + " " + year + "  " + hrs
				+ " " + min + " " + second + ".jpeg";
		FileUtils.copyFile(ss, new File(path));

	}
	
	
	
}
