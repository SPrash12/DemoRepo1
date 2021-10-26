package com.app.addpro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddAndCheckout {

	public String baseUrl = "https://www.saucedemo.com/";
	public String driverpath = "/usr/bin/chromedriver";
	public WebDriver driver;

	@BeforeTest
	public void launchingBrowser() throws InterruptedException {
		System.out.println("Launching the browser'...");
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(2000);
	}

	@Test
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-250)", "");
		Thread.sleep(3000);
		// add product 2
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(3000);
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
	}

	@AfterTest
	public void close_driver() {
		System.out.println("After test close browser...... ");
		driver.close();
	}
}
