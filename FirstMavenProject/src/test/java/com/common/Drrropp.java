package com.common;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drrropp {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select s=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		s.selectByVisibleText("Amazon Fresh");
		List<WebElement>list=s.getOptions();
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
		
		
		

	}

}
