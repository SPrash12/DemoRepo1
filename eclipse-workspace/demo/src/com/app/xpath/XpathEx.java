package com.app.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().deleteAllCookies();
        driver.get("http://admin.liveexamcenter.in/auth/login");
        Thread.sleep(2000);
      //  WebElement email=  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("prashant@angularminds.in");
        WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
     //   Thread.sleep(2000);
        WebElement password1= driver.findElement(By.xpath("//input[@type='password']"));
      //  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwerty");
        WebElement submit= driver.findElement(By.xpath("//button[@type='submit']"));
      //  driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
        
       sendkeys(driver, email,2,"prashant@angularminds.in");
       Thread.sleep(3000);
       sendkeys(driver,password1 ,2, "qwerty");
       Thread.sleep(3000);
       clickon(driver, submit, 2);
       Thread.sleep(4000);
       driver.close();
	}
	 public static void sendkeys(WebDriver driver1, WebElement element, int timeout ,String value) {
     	new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
     	element.sendKeys(value);
     }
	 
     public static void clickon(WebDriver deriver1,WebElement element,int timeout) {
    	 new WebDriverWait(deriver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
    	 element.click();
     }
	 
}
