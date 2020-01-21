package com.common;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPracticeRegularExpression {

	public static void main(String[] args) {//(//span[@class='inline-amount-titles'])[5]
		
			System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.quit();
		WebElement a=driver.findElement(By.xpath("(//span[@class='inline-amount-titles'])[5]"));
		//By byXpath = By.xpath("//*[@id='content']/table/tbody/tr/td[2]");
		//List<WebElement> links = driver.findElements(By.xpath("//span[@class='inline-amount-titles']"));

		//List<String> texts = links.stream().map(WebElement::getText).collect(Collectors.toList());
		//System.out.println(texts);
		String s=a.getText();
		/*
		 * String[] ss=s.split(","); ArrayList<String>set=new ArrayList<>(); for(String
		 * sss:ss) { set.add(sss); } System.out.println(set);
		 */
		
		String reg="(\\d{1} \\D{6}, \\d{1} \\D{4})";
		//String reg="(\\d{1} [a-zA-Z]{6}, \\d{1} [a-zA-Z]{4})";
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(s);
		if(m.find()==true) {
			System.out.println(m.group().trim());
		}
		else {
			System.out.println("false");
		}
		driver.quit();
		

	}

}
