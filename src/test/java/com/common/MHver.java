package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MHver {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Actions ac=new Actions(driver);
	WebElement a=driver.findElement(By.linkText("DEMO SITES"));
	a.click();
	WebElement b=driver.findElement(By.linkText("Basic Demo Site"));
	ac.moveToElement(a).moveToElement(b).click().build().perform();
	//ac.moveToElement(a).moveToElement(b).click().build().perform();

	}

}
