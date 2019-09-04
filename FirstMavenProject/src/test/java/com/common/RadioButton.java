package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ad = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		ad.click();

		boolean b = ad.isEnabled();
		System.out.println(b);

		boolean e = ad.isSelected();
		System.out.println(e);
		
		boolean d=ad.isDisplayed();
		System.out.println(d);
	}

}
