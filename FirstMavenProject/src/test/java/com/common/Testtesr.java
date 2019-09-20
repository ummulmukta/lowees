package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class Testtesr {
@Test

	public void tesfg() {
		

		System.setProperty("webdriver.gecko.driver", "./Drivver/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
		driver.quit();
	}

}
