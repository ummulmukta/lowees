package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagechild extends DropPage {

	public pagechild(WebDriver driver) {
		super(driver);
	
	}
@FindBy(xpath="//input[@id='u_0_r']")
	WebElement a;
public WebElement getA() {
	return a;
}
	

	

}
