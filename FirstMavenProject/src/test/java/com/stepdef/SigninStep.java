package com.stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SigninStep extends Base {
	@Given("^Go to home page$")
	public void go_to_home_page() throws Throwable {
	   driver=getdriver();
	   
	   
	}

	@Given("^Click on signin button$")
	public void click_on_signin_button() throws Throwable {
	  // driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
	   //driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).submit();
	   driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
	}

	@Given("^Enter Username$")
	public void enter_Username() throws Throwable {
	  // driver.findElement(By.id("//input[@id='ap_email']")).sendKeys("rtfghj");
	   driver.findElement(By.id("ap_email")).sendKeys("login_practice@yahoo.com");
	  // driver.findElement(By.xpath("")).sendKeys("");
	}

	@Given("^enter password$")
	public void enter_password() throws Throwable {
	   driver.findElement(By.name("password")).sendKeys("Sony1983");
	   
	}

	@Given("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
	  driver.findElement(By.xpath("//input[@id='signInSubmit']")).submit(); 
	   
	}

	@Then("^login should  be successfull$")
	public void login_should_be_successfull() throws Throwable {
		//String actualTitle = driver.getTitle();
		//driver.getPageSource();
		//String expectedTitle = "Title of Page";
	   Assert.assertEquals(driver.getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	//Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",driver.getTitle());
		System.out.println("test passed"+driver.getTitle());
	driver.quit();
	
}}
