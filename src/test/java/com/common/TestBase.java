package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class TestBase {
	/*public WebDriver driver;
	public WebDriver  getdriver() {
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;*/
	public WebDriver driver;
	//public String BrowserName; 
	 
	@Parameters("browser")
	
	public WebDriver getBrowser(WebDriver driver,String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
			driver = new ChromeDriver();
		}

		

		
		  else if (BrowserName.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver.exe");
		  driver = new FirefoxDriver(); }
		 
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
}}
