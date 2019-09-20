package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Listenermailclass {
	@Test
	public void mm() {
	WebDriver driver = new FirefoxDriver();
	 EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver); 
	 Webdrivereventlisten  eCapture = new Webdrivereventlisten(); 
	 //Registering with EventFiringWebDriver
	                //Register method allows to register our implementation of WebDriverEventListner to listen to the WebDriver events

	 eventHandler.register(eCapture);
	//navigating to the webpage "www.softwaretestingmaterial.com"
	 eventHandler.navigate().to("https://www.softwaretestingmaterial.com/100-software-testing-interview-questions/"); 
	 eventHandler.findElement(By.id("email")).sendKeys("asdsadsa");
	 //navigating to the webpage "www.softwaretestingmaterial.com/category/selenium/"
	 eventHandler.navigate().to("https://www.softwaretestingmaterial.com/agile-testing-interview-questions/"); 
	 //navigating back to the first page
	 eventHandler.navigate().back();
	 eventHandler.quit();
	                //Unregister allows to detach
	 eventHandler.unregister(eCapture);
	 System.out.println("End of Listners Class");
	
	//Verify the Output in the console. You could find the logs in the console.
	
	
	
	
	}}
