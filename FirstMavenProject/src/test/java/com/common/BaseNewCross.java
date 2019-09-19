package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseNewCross {
	  WebDriver driver;

	
	
@Test
@Parameters("broowsser")
	public void getBrowser(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (BrowserName.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", "./Drivver/geckodriver.exe");
			driver = new FirefoxDriver();     
		}

		else if (BrowserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".");
			driver = new InternetExplorerDriver();
		}
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
		driver.quit();
	}
}
