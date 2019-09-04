package com.stepdef;

import org.testng.Assert;

import com.common.Base;
import com.common.ScreenShott;
import com.pageobject.DropPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Droppdown extends Base{
	DropPage pf;
	
	@When("^Click all$")
	public void click_all() throws Throwable {
		getdriver();
		//driver.navigate().back();
	    DropPage d=new DropPage(driver);
	    d.dr();
	    ScreenShott.ScreenS(driver,"baby");
	    
	    
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
