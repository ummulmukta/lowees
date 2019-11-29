package com.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelwithHashmap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			Map<String,String>map= new HashMap<>();
			map.put(key, value)
			

	}

}
