package com.atmecs.utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static String[][] getData(String file) throws Exception {
		FileInputStream fileInput = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook book = new XSSFWorkbook(fileInput);
		org.apache.poi.ss.usermodel.Sheet sheet = book.getSheetAt(0);
		int row1 = sheet.getLastRowNum();
		row1 += 1;
		int col = sheet.getRow(0).getLastCellNum();
		String array[][] = new String[row1][col];
		int count = 0;
		for (Row row : sheet) {
			int count1 = 0;
			for (Cell cell : row) {
				String Data = cell.toString();
				array[count][count1] = Data;
				count1++;
			}
			count++;
		}
		return array;
	}
}
