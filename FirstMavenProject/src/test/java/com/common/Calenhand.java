package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenhand {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.expedia.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']")).click();

driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']")).click();
List<WebElement>list=driver.findElements(By.xpath("(//div[@class='datepicker-cal-month'])[1]"));
//driver.findElement(By.xpath("//button[@data-day='24' and @data-month='9']")).click();
for(int i=0;i<list.size();i++) {
	String date=list.get(i).getText();
	//if(date.equalsIgnoreCase("22")) {
		//list.get(i).click();
		//break;
	//}
	if(date.equalsIgnoreCase("23")) {
		list.get(i).click();
	break;
	}
}
	
	
}




}