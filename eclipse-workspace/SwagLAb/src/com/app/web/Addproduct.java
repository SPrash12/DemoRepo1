package com.app.web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Addproduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
	//	Add produact 1
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(4000);
    //    driver.findElement(By.className("shopping_cart_link")).click();
    //    Thread.sleep(4000);
    // to add another product  
	// continue shopping	
	//	 driver.findElement(By.id("continue-shopping")).click();
	//        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,-250)","");
        Thread.sleep(3000);
   // add product 2
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(4000);
       
   // checkout
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("raj");
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("perry");
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("411041");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)","");
        Thread.sleep(3000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,-400)","");
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);
    // logout
        driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
        driver.close();
	}

}
