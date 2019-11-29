package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadwholeDataIterator {
	public static FileInputStream fis;
	public static Workbook wb;
	public static Sheet a;
	//public static Row b;

	public static String dataRead(String excelpath, String sh) {

		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a = wb.getSheet(sh);
Iterator<Row>row=a.iterator();
while(row.hasNext()) {
	Row rows=row.next();
	Iterator<Cell>cells=rows.cellIterator();
	while(cells.hasNext()) {
		Cell cell=cells.next();
		//System.out.println(cell.toString()+";");
		System.out.print(cell.toString());
		//System.out.println(cell.getRichStringCellValue().getString().trim().equals("as")+";");
	}
	//System.out.println();
}
//wb.close();
//fis.close();
return sh;


}
	
	





}
