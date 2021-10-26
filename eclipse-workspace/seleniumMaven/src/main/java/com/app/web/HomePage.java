package com.app.web;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public String baseUrl="https://www.saucedemo.com/";
    public String driverpath="/usr/bin/chromedriver";
     WebDriver driver;
     
     @Before
     public void launchingBrowser() throws InterruptedException {
    	 System.out.println("Launching the chrome browser...!");
    	 System.setProperty("webdriver.chrome.driver", driverpath);
    	 driver= new ChromeDriver();
    	 driver.get(baseUrl);
    	 Thread.sleep(2000);
     }
     @Test
     public void HomePage() throws InterruptedException  {
    	
    	 driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
 		Thread.sleep(2000);
 		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
    	 driver.close();
     }
}
