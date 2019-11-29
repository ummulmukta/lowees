package com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseH {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Actions ac=new Actions(driver);
		
		   WebElement ad= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		   //ad.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER));
		  // ad.sendKeys(Keys.ENTER);
		  ad.click();
		   
		   WebElement d=driver.findElement(By.xpath("//span[contains(text(),'Wedding Registry')]"));
		   ac.moveToElement(ad).moveToElement(d).click().build().perform();
		   //ScreenShott.ScreenS(driver,"mousehv");
		//Thread.sleep(2000);
		System.out.println(d);
		}

	}


