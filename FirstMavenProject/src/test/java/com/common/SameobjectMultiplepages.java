package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SameobjectMultiplepages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().window().getPosition();
	//	driver.manage().window().setSize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='u_0_b']")));
		System.out.println(driver.getTitle());

	}

}
