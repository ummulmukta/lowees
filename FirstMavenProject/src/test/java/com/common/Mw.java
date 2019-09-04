package com.common;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mw {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://accounts.google.com");
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("//a[@class='h-c-button h-c-header__cta-li-link h-c-header__cta-li-link--primary']")).sendKeys(Keys.ENTER);
		/*
		 * Set<String>set=driver.getWindowHandles(); System.out.println(set.size());
		 * Iterator<String>it=set.iterator(); String parantw=it.next(); String
		 * child1=it.next(); String child2=it.next(); driver.switchTo().window(child1);
		 * System.out.println(driver.getTitle()); driver.switchTo().window(parantw);
		 * System.out.println(driver.getTitle()); driver.quit(); // driver.get(
		 * "https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp"
		 * );
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * Actions a = new Actions(driver); a.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"initialView\"]/footer/ul/li[3]/a"))).click().build() .perform();
		 */
		  
		  Set<String> ids = driver.getWindowHandles(); 
		  Iterator<String> it =ids.iterator(); 
		  System.out.println(ids.size()); 
		  String parentid = it.next();
		  String childid = it.next();
		  
		  System.out.println(driver.getCurrentUrl());
		  driver.switchTo().window(childid); System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  driver.switchTo().window(parentid); System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		 
	

	}

}
