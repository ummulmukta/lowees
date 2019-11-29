package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MuseHovver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions ac = new Actions(driver);
		WebElement a=driver.findElement(By.xpath("(//a[contains(text(),' My eBay')])[1]"));
		WebElement b=driver.findElement(By.xpath("//a[contains(text(),' Selling')]"));
		ac.moveToElement(a).moveToElement(b).click().build().perform();
		

	}

}
