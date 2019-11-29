package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import com.common.Base;
//import com.common.Base;
import com.common.CrosBrowsserBase;
import com.common.ScreenShott;
import com.pageobject.DropPage;
import com.testrunner.Testrun;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Droppdown extends CrosBrowsserBase {
	//WebDriver driver;
	//DropPage pf;
	
	@When("^Click all$")
	@Parameters("browser")
	public void click_all() throws Throwable {
	getBrowser("");
		//driver.navigate().back();
	//setUpScenario("browser");
	
	    DropPage d=new DropPage(driver);
	    d.dr();
	    ScreenShott.ScreenS(driver,"baby");
	    
	
		/*
		 * Select set=new
		 * Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		 * set.selectByVisibleText("Baby"); set.getFirstSelectedOption();
		 */
	}

	@When("^User able to click baby$")
	public void user_able_to_click_baby() throws Throwable {


	}

	@Then("^user go to baby page suceccfully$")
	public void user_go_to_baby_page_suceccfully() throws Throwable {
		//String b=driver.getTitle();
	  Assert.assertEquals(driver.getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"); 
	System.out.println("Expected title matched");
	driver.quit();
	}


}
