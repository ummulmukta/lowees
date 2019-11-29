package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']")).click();
		driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']")).click();
		List<WebElement>list=driver.findElements(By.xpath("(//table[@class='datepicker-cal-weeks'])[2]"));
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		System.out.println(list.size());
	}
		driver.findElement(By.xpath("//button[@data-month='10'and @data-day='1']")).click();
		driver.quit();

	}

}
