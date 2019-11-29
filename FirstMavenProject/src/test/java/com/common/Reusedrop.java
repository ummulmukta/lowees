package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reusedrop {
public static void resusee(WebElement a,String b) {
Select s=new Select(a);
s.selectByVisibleText(b);


	
}

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	
	
	
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Reusedrop.resusee(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")), "Alexa Skills");
}
}
