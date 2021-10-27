package com.app.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SwaagLab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver	driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		
		Actions action = new Actions(driver);
		// login
		WebElement username = driver.findElement(By.id("user-name"));    //.sendKeys("performance_glitch_user");
		action.moveToElement(username).build().perform();

		System.out.println("into series of actions");


		WebElement pass= driver.findElement(By.id("password"));     //.sendKeys("secret_sauce");
		action.moveToElement(pass).build().perform();

		WebElement enter = driver.findElement(By.xpath("//input[@type='submit']")) ;     //.click();
		action.moveToElement(enter).build().perform();	
		Thread.sleep(2000);



		Action seriesOfaction;
		seriesOfaction=action.sendKeys(username, "performance_glitch_user").
				sendKeys(pass, "secret_sauce").
				keyDown(enter, Keys.SHIFT).
				keyUp(enter, Keys.SHIFT).
				build();

		seriesOfaction.perform();
		Thread.sleep(3000);
   
		driver.findElement(By.id("shopping_cart_container")).click();   	 
		WebElement cart= driver.findElement(By.id("shopping_cart_container"));
		 	 
		action.moveToElement(cart).build().perform();
		action.click().build().perform();	
		
		
/*		org.openqa.selenium.interactions.Action addcart;
		addcart = action.keyDown(Keys.SHIFT).keyUp(Keys.SHIFT).build();
		addcart.perform();   */


		/*   Actions action1 = new Actions(driver);
        WebElement cart= driver.findElement(By.id("shopping_cart_container"));
	    action1.moveToElement(cart).build().perform();

        Action addcart;
        System.out.println("into action class");
        addcart = action1.keyDown(Keys.SHIFT).sendKeys(cart, Keys.SHIFT).build();
        addcart.perform(); */


		/*	WebElement sidebar=driver.findElement(By.cssSelector("#div.page_wrapper div.header_container:nth-child(1) "
				+ "div.primary_header div:nth-child(1)"
				+ " div:nth-child(1) div:nth-child(1) > div.bm-burger-button"));
		action.moveToElement(sidebar).build().perform();
		System.out.println("Element found");
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	sidebar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='react-burger-menu-btn']")));

		Action seriesOfAction;
		System.out.println("into series of actions");
		seriesOfAction= action.keyDown(sidebar, Keys.SHIFT).keyUp(sidebar, Keys.SHIFT).build();
		seriesOfAction.perform();
		System.out.println("Action performed");
		Thread.sleep(2000); */

		//logout
		/*		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		action.moveToElement(logout).build().perform();
		Action series2;
		series2=action.keyDown(logout, Keys.SHIFT).keyUp(logout, Keys.SHIFT).build();
		series2.perform();
		System.out.println("logout successully...!");
		Thread.sleep(3000);*/
		/*	action.keyDown(element1, Keys.SHIFT).build().perform();
		action.keyUp(element1, Keys.SHIFT).build().perform();
		Thread.sleep(2000); */

	}

}
