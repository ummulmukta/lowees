package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Actions action=new Actions(driver);
		//WebElement from=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2'])[1]"));
		//from.sendKeys(Keys.ENTER);
		//from.click();
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='nav-a nav-a-2'])[1]")));
		
		//WebElement to=driver.findElement(By.xpath("//span[contains(text(),'Wedding Registry')]"));
//action.moveToElement(from).moveToElement(to).click().build().perform();
	}

}
