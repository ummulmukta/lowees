package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropCalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']")).click();
List<WebElement>list=driver.findElements(By.xpath("(//div[@class='datepicker-cal-month'])[1]"));
driver.findElement(By.xpath("//button[@data-month='9'and @data-day='21']")).click();
		
		
	}

}
