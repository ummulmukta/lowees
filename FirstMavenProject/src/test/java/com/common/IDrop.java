package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IDrop {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://jqueryui.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	Actions ac=new Actions(driver);
	WebElement drag=driver.findElement(By.xpath("//*[contains(text(),'Drag me to my target')]"));
	WebElement drop =driver.findElement(By.xpath("//*[@id='droppable']"));
	ac.dragAndDrop(drag,drop).build().perform();
	
	
}
}
