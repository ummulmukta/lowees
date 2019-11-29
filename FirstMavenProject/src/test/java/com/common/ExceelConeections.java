package com.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceelConeections {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("./ExFol/test.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		String ss=s.getRow(2).getCell(1).getStringCellValue();
System.out.println(ss);
WebDriver driver=new ChromeDriver();
//Explicit wait
WebDriverWait w=new WebDriverWait(driver,30);
w.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

	}

}
