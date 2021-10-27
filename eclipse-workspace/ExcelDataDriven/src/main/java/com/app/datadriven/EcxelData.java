package com.app.datadriven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EcxelData {

	static String projectpath;
	static XSSFWorkbook Wbook;
	static XSSFSheet sheet1;

	public EcxelData(String excelPath,String sheetName) {
		try {
			projectpath= System.getProperty("user.dir");
			Wbook = new XSSFWorkbook(excelPath);
			sheet1= Wbook.getSheet(sheetName);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		getRow();
		getStringSheetData(0, 0);
		getSheetNumericData(1,1);
	}
	public static int getRow() {
		int rows=0;
		try {
			 rows=sheet1.getPhysicalNumberOfRows();
			System.out.println("no.of rows:"+rows);
		}catch(Exception e) {
			System.out.println(e);
		}
		return rows;
	}
	public static int getCol() {
		int cols =0;
		try {
			 cols=sheet1.getRow(0).getPhysicalNumberOfCells();
			System.out.println("no.of rows:"+cols);
		}catch(Exception e) {
			System.out.println(e);
		}
		return cols;
	}
	public static String getStringSheetData(int rownum,int colNum) {
		String cellData=null;
		try {

			 cellData=sheet1.getRow(rownum).getCell(colNum).getStringCellValue();
		//	System.out.println(cellData);
		}catch(Exception e) {
			System.out.println(e);
		}
		return cellData;
	}
	public static void getSheetNumericData(int rownum,int colNum) {
		try {

			double cellData=sheet1.getRow(rownum).getCell(colNum).getNumericCellValue();
		//	System.out.println(cellData);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}	