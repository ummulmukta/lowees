package com.common;

import java.io.FileInputStream;





import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\farha\\Documents\\test.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
Sheet a=wb.getSheet("practice");
String d=a.getRow(0).getCell(0).getStringCellValue();
System.out.println(d);
		
	}

}
