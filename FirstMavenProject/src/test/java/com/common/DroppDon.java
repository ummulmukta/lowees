package com.common;

import java.io.IOException;
import java.util.List;
//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroppDon {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		  Select se=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		  se.selectByVisibleText("May"); 
		  WebElement may=se.getFirstSelectedOption();
		  
		  ScreenShott.ScreenS(driver,"drop");
		  
		 
		
		
		List<WebElement> option = se.getOptions();
		System.out.println(option.size());
		
		for(int i=0; i<option.size();i++) {
		System.out.println(option.get(i).getText());
		}
		
		
		
	}

}
