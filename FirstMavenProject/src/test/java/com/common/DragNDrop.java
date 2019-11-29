package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com");
		
		driver.findElement(By.linkText("Droppable")).click();
		
		
		
		
		
		  //driver.findElement(By.linkText("Droppable")).click(); Thread.sleep(2000);
		 // driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		  Actions a=new Actions(driver); //a.sendKeys(Keys.chord(Keys.SHIFT,Keys.ALT));
		  
		  WebElement from=driver.findElement(By.
		  xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		  Thread.sleep(2000);
		  WebElement to=driver.findElement(By.id("droppable"));
		  Thread.sleep(2000);
		  
		  a.dragAndDrop(from, to).build().perform(); Thread.sleep(2000);
		 // driver.switchTo().parentFrame(); //Both the same - going back to the main
		  //page from thr frame //driver.switchTo().defaultContent(); WebElement
		/*
		 * d=driver.findElement(By.linkText("Resizable"));
		 * 
		 * System.out.println(d.getText()); d.click(); //
		 * System.out.print(d.getText());StaleElementReferenceException if click first
		 * then get text
		 */
		  
		  //Stale Element Reference Exception
		  
		List<WebElement> aa= driver.findElements(By.tagName("iframe"));
		System.out.println(aa.size());
		 
		 
		//a.sendKeys(Keys.chord(Keys.SHIFT,Keys.ALT));
		
		
		 		 
		 
	}

}
