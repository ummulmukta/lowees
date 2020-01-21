package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Listeners;

import com.common.Testlisten;
import com.common.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
@Listeners( Testlisten.class)
public class TessCls extends TestBase {
	//WebDriver driver;
	@Given("^User able to go home page$")
	public void user_able_to_go_home_page() throws Throwable {
	    
		driver=getBrowser(driver,"chrome"); 
	}

	@When("^enter email$")
	public void enter_email() throws Throwable {
		Actions ac=new Actions(driver);
	//WebElement a=
		//driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
	//a.sendKeys(Keys.ENTER);
	WebElement b=driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]"));
	ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))).moveToElement(b).click().build().perform();
		
		 //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ghj");  
	  
	}

	@When("^enter pass$")
	public void enter_pass() throws Throwable {
	 // driver.findElement(By.id("gmm"));  
	   
	}

	@When("^able click$")
	public void able_click() throws Throwable {
	  
	   
	}


}
