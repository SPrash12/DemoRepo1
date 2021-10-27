package com.app.web;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

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
		Thread.sleep(2000);
		// driver.findElement(By.id("login-button")).click();

		// ByxPath
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// Thread.sleep(3000);
		//filter Dropdown
		WebElement web1 = driver.findElement(By.className("product_sort_container"));
		web1.click();
		Select dropdown = new Select(web1);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Price (low to high)");
		Thread.sleep(6000);
		// Logout
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);

		// about
		// driver.findElement(By.id("about_sidebar_link")).click();
		// Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);

		driver.close();

	
		/*
		 * sendkeys(driver, userName, 1, "performance_glitch_user"); //
		 * Thread.sleep(2000); sendkeys(driver, Pass, 1, "secret_sauce");
		 * Thread.sleep(2000); clickon(driver, submit, 2); Thread.sleep(2000); //
		 * clickon(driver, menu, 2); // Thread.sleep(2000); clickon(driver, logout, 0);
		 * driver.close();
		 * 
		 * } 
		 * public static void sendkeys(WebDriver driver1,WebElement element,int
		 * Timeout, String Value) { new WebDriverWait(driver1,
		 * Timeout).until(ExpectedConditions.visibilityOf(element));
		 * element.sendKeys(Value); } public static void clickon(WebDriver
		 * driver1,WebElement element,int timeout){ new WebDriverWait(driver1,
		 * timeout).until(ExpectedConditions.elementToBeClickable(element));
		 * element.click(); }
		 */
	}
}
