package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AuneeOneMain {
	public static final String SAMPLE_XLSX_FILE_PATH = "./AuneeExcel/TestDate_Practitioner-Excel.xlsx";
	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

		 Sheet sheet = workbook.getSheetAt(0);

	        // Create a DataFormatter to format and get each cell's value as String
	        DataFormatter dataFormatter = new DataFormatter();

	        // 1. You can obtain a rowIterator and columnIterator and iterate over them
	        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
	        Iterator<Row> rowIterator = sheet.rowIterator();
	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();

	            // Now let's iterate over the columns of the current row
	            Iterator<Cell> cellIterator = row.cellIterator();

	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                String cellValue = dataFormatter.formatCellValue(cell);
	                System.out.print(cellValue + "\t");
	            }
	            System.out.println();
	        }


	}

}
