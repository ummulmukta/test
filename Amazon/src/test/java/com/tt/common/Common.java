package com.tt.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Common {
	private static String getURL = "https://www.amazon.com/";

	public static String getGetURL() {
		return getURL;
	}

	WebDriver driver;

	public static WebDriver getBrowser(String BrowserName, WebDriver driver) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		if (BrowserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "./Driver/operadriver.exe");
			driver = new OperaDriver();
		}

		else if (BrowserName.equalsIgnoreCase("geckodriver")) {
			System.setProperty("webdriver.opera.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

}
