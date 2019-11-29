package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.com/Hotels");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[contains(text(),'Check-in')])[1]")).click();
		List<WebElement>alldates=driver.findElements(By.xpath("(//table[@class='datepicker-cal-weeks'])[1]//td"));
		Thread.sleep(2000);
		int total=alldates.size();
		for(int i=0;i<total;i++) {
		//for(WebElement ele:alldates) {
			
			
			//String a=alldates.get(i).getText();
			
			//System.out.println(a);
			
			if(alldates.equals("24")) {
				
				String a=alldates.get(i).getText();
				
			}
		}

	}

}
