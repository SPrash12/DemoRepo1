package com.app.datadriven;

public class DataDemo {

	public static void main(String[] args) {
	
		String projectpath= System.getProperty("user.dir");
       EcxelData d1= new EcxelData(projectpath+"/excel/excelData2.xlsx", "SwagLab");
       d1.getRow();
       d1.getSheetNumericData(1, 1);
       d1.getStringSheetData(0, 0);
	}

}
