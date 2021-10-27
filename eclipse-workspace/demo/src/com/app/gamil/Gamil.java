package com.app.gamil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gamil {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("identifierId")).sendKeys("prashant@angularminds.in");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f1 mobile phones");
		Thread.sleep(2000);
	//	driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
		
     	driver.findElement(By.id("nav-search-submit-button")).click();
     	Thread.sleep(3000);
     	driver.findElement(By.linkText("Get It by Tomorrow")).click();
     	Thread.sleep(3000);
     	driver.navigate().to("https://www.selenium.dev/");
     	Thread.sleep(3000);
     	
	//	Thread.sleep(2000);
	//	String at = driver.getTitle();
	//	String et = "gmail";
	/*	driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failuer");
		} */
		driver.quit();
	}
}
