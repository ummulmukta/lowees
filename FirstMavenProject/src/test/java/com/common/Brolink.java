package com.common;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brolink {

	public static void main(String[] args) throws IOException {
		 
	        
	      
	        
	      WebDriver  driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("http://www.amazon.com");
	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println(links.size());
	        
	        Iterator<WebElement> it = links.iterator();
	        
	        while(it.hasNext()){
	            
	          String  url = it.next().getAttribute("href");
	          System.out.println(url);
	            HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
                
               
                
                huc.connect();
                
                if(huc.getResponseCode()==200) {
                	System.out.println(url+"   "+huc.getResponseMessage());
                }
			/*
			 * if(huc.getResponseCode()==huc.HTTP_NOT_FOUND) {
			 * System.out.println(url+"  "+huc.getResponseMessage()+huc.HTTP_NOT_FOUND); }
			 */
	          //  System.out.println(url);

	}

	}}
