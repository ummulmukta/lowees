package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropPage {
WebDriver driver;
public DropPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void dr() {
	Select set=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
	set.selectByVisibleText("Baby");
	set.getFirstSelectedOption();
			
}
}
