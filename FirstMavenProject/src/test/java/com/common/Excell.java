package com.common;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell {
	
	public static void main(String[] args) throws Throwable {
		//FileInputStream fis = new FileInputStream("./xxcel/Book1.xls");
		FileInputStream fis = new FileInputStream("C:\\Users\\farha\\Documents\\Book1.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet a = wb.getSheet("mukta");
		//String d = a.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(d);
		int totalrow=a.getLastRowNum();
		
		for(int i=0;i<=totalrow;i++) {
			String result=a.getRow(i).getCell(1).getStringCellValue();
			//double resultnumeric=a.getRow(i).getCell(2).getNumericCellValue();
			System.out.println(result);
			double resultnumeric=a.getRow(i).getCell(2).getNumericCellValue();
			System.out.println(resultnumeric);
		}

	}

}
