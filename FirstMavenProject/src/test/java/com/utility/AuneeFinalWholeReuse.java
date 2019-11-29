package com.utility;

import java.io.File;
import java.io.FileInputStream;
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

public class AuneeFinalWholeReuse {

	public static String ReuseWholeSheet(String excelpath)
			throws EncryptedDocumentException, InvalidFormatException, IOException {

		FileInputStream fis = new FileInputStream(excelpath);

		Workbook workbook = WorkbookFactory.create(fis);

		Sheet sheet = workbook.getSheetAt(0);

		DataFormatter dataFormatter = new DataFormatter();

		Iterator<Row> rowIterator = sheet.rowIterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();

			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
			}
			System.out.println();
		}
		return excelpath;

	}
}
