package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

				driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
				//Click to get a pop up
		
		  driver.findElement(By.xpath("//input[contains(@value,'Confirmation Alert')]")
		  ).click(); 
		  Thread.sleep(5000); // Get the text from pop up
		  System.out.println(driver.switchTo().alert().getText()); // Accept the Alert
		  
		  Thread.sleep(3000); driver.switchTo().alert().accept();
		  
		  //driver.quit();
		 
			}


	}


