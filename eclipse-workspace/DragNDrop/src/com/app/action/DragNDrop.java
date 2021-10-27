package com.app.action;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://jqueryui.com/droppable/");
//       driver.switchTo().frame(0);
 //       Thread.sleep(2000);
//        WebElement sourceElemet= driver.findElement(By.id("draggable"));
//        WebElement targetElemen =driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
//        action.dragAndDrop(sourceElemet, targetElemen).build().perform();
//        Thread.sleep(2000);
        
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
       WebElement s1= driver.findElement(By.id("column-a"));
       WebElement t2= driver.findElement(By.id("column-b"));
       action.dragAndDrop(t2,s1).build().perform();
       Thread.sleep(2000);
	}

}
