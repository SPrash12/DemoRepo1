package com.app.addproduct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.login.loginpage;

public class AddProduct extends loginpage {

	loginpage l1 = new loginpage();

	@BeforeTest
	public void login() throws InterruptedException {
		System.out.println("in login method");

		l1.launchingBrowser();
		//	System.out.println("calling from login method");
		//	l1.HomePage();
		//	System.out.println("entering the user id and password  and login...");
	}

	@Test
	public void adProduct() throws InterruptedException {
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,250)", "");
		// Thread.sleep(3000);
		l1.HomePage();

		loginpage.driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		// checkout
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("groot");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("groot");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("562355");
		Thread.sleep(1000);
		driver.findElement(By.name("continue")).click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		driver.findElement(By.name("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("back-to-products")).click();
		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
	// close the browser
		l1.close_driver();
	}
}
