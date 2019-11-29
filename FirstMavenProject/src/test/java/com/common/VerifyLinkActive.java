package com.common;

import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLinkActive {
	
	
	
	
	public static void main(String[] args) throws IOException {
		 WebDriver  driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("http://www.amazon.com");
	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println(links.size());
	        
	        Iterator<WebElement> it = links.iterator();
	        
	        while(it.hasNext()){
	            
	          String  url = it.next().getAttribute("href");
	         // System.out.println(url);
	          verifylink(url);
	          
	          
	          
	}}
public static void verifylink(String linkurl) throws IOException {
	URL url=new URL(linkurl);
	 HttpURLConnection huc = (HttpURLConnection)url.openConnection();
	 
     
     huc.setConnectTimeout(3000);
     
     huc.connect();
     
     if(huc.getResponseCode()==200) {
     	System.out.println(linkurl+"   "+huc.getResponseMessage());
     }
     if(huc.getResponseCode()==huc.HTTP_NOT_FOUND) {
     	System.out.println(linkurl+"  "+huc.getResponseMessage()+huc.HTTP_NOT_FOUND);
     }
	
}
}
