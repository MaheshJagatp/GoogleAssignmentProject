package com.qa.google.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.google.util.TestUtil;
import com.qa.google.util.webEventlistner;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver edriver;
	public static webEventlistner eventlistner;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fp = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\google\\config\\config.properties");
			prop.load(fp);

		} catch (FileNotFoundException t) {
			t.printStackTrace();
		} catch (IOException t) {
			t.printStackTrace();
		}
	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mahesh\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		edriver = new EventFiringWebDriver(driver);
		eventlistner = new webEventlistner();
		edriver.register(eventlistner);
		driver = edriver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_time, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}
