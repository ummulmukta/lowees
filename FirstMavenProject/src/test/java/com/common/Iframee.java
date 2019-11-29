package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframee {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Checkboxradio"));
	List<WebElement>list=driver.findElements(By.tagName("iframe"));
	System.out.println(list.size());

		//System.out.println(driver.findElement(By.tagName("iframe")).getSize();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.chord(Keys.ALT,Keys.CONTROL));
		ac.
		ac.sendKeys(Keys);
		ac.moveToElement(driver.findElement(By.xpath("//input[@id='checkbox-1']"))).click().build().perform();
		/*
		 * WebElement c=driver.findElement(By.xpath("//input[@id='checkbox-1']"));
		 * c.click();
		 */
		//boolean m=c.isEnabled();
		//System.out.println(m);
		//boolean a=c.isSelected();
		//System.out.println(a);
		

	}

}
