package com.app.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataDriven {
     WebDriver driver= new ChromeDriver();
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		
	}
	
	@Test(dataProvider="testData1")
	public void Test1(String username,String password) throws InterruptedException {
		System.out.println(username + " | "+password) ;
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		System.out.println("Enter username :"+username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("Enter pass. :"+password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("lonin successful");
		Thread.sleep(2000);
//		driver.close();
	}
	
	
	@DataProvider(name="testData1")
	public Object getdata() {
		String excelpath ="/home/am-pc-41/eclipse-workspace/ExcelDataDriven/excel/excelData2.xlsx";
		String sheetName="SwagLab";
	   Object [][]data=	multipleData(excelpath, sheetName);
	   return data;	
	}
	
	
	public Object[][] multipleData(String excelpath,String sheetName) {
		EcxelData excl= new EcxelData(excelpath, sheetName);
		int rowcount=excl.getRow();
		int colcount=excl.getCol();
		Object [][]obj=new Object[rowcount-1][colcount];
				String TestData=null;
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				TestData=excl.getStringSheetData(i, j);
			//	System.out.print(TestData +" | ");
				obj[i-1][j]=TestData;
			}
			System.out.println();
		}
		return obj;
	}
}
