package com.common;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrosBrowsserBase {
	public WebDriver driver;
	 
	@Test  
	@Parameters("browser")
	
	public void getBrowser(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		

		else if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./GekoDriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		  Select s=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		  s.selectByVisibleText("Amazon Fresh"); List<WebElement>list=s.getOptions();
		  System.out.println(list.size());
		 
driver.quit();

		
	}
}
