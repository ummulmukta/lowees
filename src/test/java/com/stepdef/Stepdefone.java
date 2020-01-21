package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import com.common.Basic;
import com.common.Testlisten;

//import cucumber.api.Scenario;
//import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
@Listeners(Testlisten.class)
public class Stepdefone extends Basic {
	//WebDriver driver;
	
	
	/*
	 * @After public void teardown(Scenario sc) { if(sc.isFailed()) { final byte[]
	 * screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	 * sc.embed(screenshot, "image/png"); // ... and embed it in the report.
	 * 
	 * } }
	 */
	//public WebDriver driver;
	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
		driver=getBrowser(driver,"BrowserName");
	   
	}

	@When("^I enter username$")
	public void i_enter_username() throws Throwable {
	//WebElement a=  driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
	 // a.sendKeys(Keys.ENTER);
	 // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("grfhg"); 
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
	  driver.findElement(By.linkText("Books")).click(); 
	   
	}

	@Then("^I should be logged in sucessfully$")
	public void i_should_be_logged_in_sucessfully() throws Throwable {
	   
	   
	}

	@Given("^User search from All$")
	public void user_search_from_All() throws Throwable {
	   
	   
	}

	@When("^Select Alexa Skills$")
	public void select_Alexa_Skills() throws Throwable {
	   
	   
	}

	@Then("^Select shoud be successful$")
	public void select_shoud_be_successful() throws Throwable {
	   
	   
	}

	@Given("^User navigate for Lenovo Laptop$")
	public void user_navigate_for_Lenovo_Laptop() throws Throwable {
	   
	   
	}

	@When("^Add the laptop to the Cart$")
	public void add_the_laptop_to_the_Cart() throws Throwable {
	   
	   
	}

	@Then("^User basket should display with added item$")
	public void user_basket_should_display_with_added_item() throws Throwable {
	   
	   
	}


}
