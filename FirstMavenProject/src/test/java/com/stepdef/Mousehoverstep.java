package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.common.Base;
import com.common.ScreenShott;
import com.common.Sdrfh;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mousehoverstep extends Base{
	@Given("^user able to go home page$")
	public void user_able_to_go_home_page() throws Throwable {
	   driver=getdriver();
	}

	@When("^Click Account and List$")
	public void click_Account_and_List() throws Throwable {
		Actions ac=new Actions(driver);
		
	   WebElement ad= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	   //ad.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER));
	   ad.sendKeys(Keys.ENTER);
	   //ad.click();
	   Thread.sleep(3000);
	   WebElement d=driver.findElement(By.xpath("//span[contains(text(),'Wedding Registry')]"));
	   ac.moveToElement(ad).moveToElement(d).click().build().perform();
	   ScreenShott.ScreenS(driver,"mousehv");
	Thread.sleep(2000);
	System.out.println(d);
	}

	@When("^User able to click wedding registry$")
	public void user_able_to_click_wedding_registry() throws Throwable {
	//ctrl+d and ctrl+c  copy page title from webpage
		//right click,vew page source,copy from title
		//find page title from head tag in html page
		//click on * right corner of url add bookmark and copy
		
		Sdrfh.scshot(driver,"username");
		
		
		
		
		
	}

	@Then("^user go to wedding registry pageuceccfully$")
	public void user_go_to_wedding_registry_pageuceccfully() throws Throwable {
	   Assert.assertEquals(driver.getTitle(),"Amazon Wedding"); 
	   System.out.println(driver.getTitle());
	   driver.quit();
	}
}
