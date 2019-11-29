package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		 Dimension d=new Dimension(500,500);//reSise window
		 driver.manage().window().setSize(d);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ad = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		ad.click();
		// ad.getCssValue("color");
		// ad.getAttribute("background-color");
		System.out.println(ad.getCssValue("color"));
		;
		boolean b = ad.isEnabled();
		System.out.println(b);

		boolean e = ad.isSelected();
		System.out.println(e);

		boolean eh = ad.isDisplayed();
		System.out.println(eh);
		WebElement z = driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]"));
		// z.getAttribute("background-color");
		System.out.println(z.getCssValue("color"));
		/*
		 * String color =
		 * driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]")).
		 * getCssValue("color"); System.out.println(color); String
		 * g=String.format(color, ""); String hex = Color.fromString(color).asHex();
		 * System.out.println(hex);
		 * 
		 * String headerColor =
		 * driver.findElement(By.xpath(".//*[@id='LoginName']/h1")).getCssValue(
		 * "backgroud-color"); Assert.assertEquals("some message", "#FFFFFF",
		 * headerColor); OR
		 * 
		 * if(headerColor.contains(#FFFFFF)){ System.Out.Print("Color Mathes"); } else {
		 * System.Out.Print("Color Mathes"); } some time color code should be displayed
		 * in rga format eg: rgba(45, 45, 45, 1), so instead of #ffffff you have to use
		 * rgba(45, 45, 45, 1)
		 */}

}
