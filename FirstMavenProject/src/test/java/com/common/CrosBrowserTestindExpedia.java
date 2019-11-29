package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CrosBrowserTestindExpedia {
	@Test
 public void ss() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='primary-header-hotel']")).click();
		//driver.findElement(By.cssSelector("button[id='tab-hotel-tab-hp']")).click();
		  driver.findElement(By.xpath("//input[@id='hotel-checkin-hlp']")).click();
		  driver.findElements(By.xpath("(//div[@class='datepicker-cal-month'])[1]"));
		  driver.findElement(By.xpath("//button[@data-month='9' and @data-day='24']")).
		  click();
		 //Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='hotel-checkout-hlp']")).click();
		//WebDriverWait wait=new WebDriverWait(driver,50);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']"))); 
				
//driver.findElement(By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']")).sendKeys(Keys.ENTER);

		
		driver.findElements(By.xpath("(//div[@class='datepicker-cal-month'])[2]"));

		driver.findElement(By.xpath("//button[@data-month='10' and @data-day='20']")).click();
		Thread.sleep(2000);
	driver.quit();	
		
  }
}
