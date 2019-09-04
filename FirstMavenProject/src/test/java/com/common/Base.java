package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver driver;
public WebDriver getdriver() {
	System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	return driver;
	
	
}
}
