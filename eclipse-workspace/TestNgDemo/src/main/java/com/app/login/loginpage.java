package com.app.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginpage {
	public String baseUrl = "https://www.saucedemo.com/";
	public String driverpath = "/usr/bin/chromedriver";
	public static WebDriver driver =new ChromeDriver();
	
	
	//	@BeforeTest
	public void launchingBrowser() throws InterruptedException {
		System.out.println("Before Launching the browser'...");
		System.setProperty("webdriver.chrome.driver", driverpath);
		//		driver= new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(2000);	
	}
	//	@Test
	public void HomePage() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		System.out.println("Enter username");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		System.out.println("Enter pass.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("lonin successful");
		Thread.sleep(2000);




	}
	//	@AfterTest
	public void close_driver() {
		System.out.println("After test close browser...... ");
		driver.close();
	}
}
