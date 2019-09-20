package com.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceldataPasswebpage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./Drivver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();

ArrayList<String>usename=readexceldata(0);
ArrayList<String>password=readexceldata(1);
for(int i=0;i<usename.size();i++) {
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(usename.get(i));
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("")).sendKeys(password.get(i));
	Thread.sleep(2000);
	driver.findElement(By.xpath("")).click();
}
	}
public static ArrayList<String> readexceldata(int col) throws Exception {
	FileInputStream fis=new FileInputStream("C:\\Users\\farha\\Documents\\Book1.xls");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s=wb.getSheet("mukta");
	Iterator<Row>it=s.iterator();
	it.next();
	ArrayList<String>list=new ArrayList<String>();
	while(it.hasNext()) {
		
		list.add(it.next().getCell(col).getStringCellValue());
	}
	
	System.out.println(list);
	return list;
	
	
}
}
