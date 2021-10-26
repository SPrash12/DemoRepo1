package com.app.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
      
	WebDriver driver;
	@Given(value = "^Open the chrome and start the application$")
	public void open_the_chrome() throws InterruptedException {
		System.out.println("This step open the chrome browser and launch the application..!");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@When("user enters  username  and valid password")
	public void user_enters_username_and_valid_password()  throws InterruptedException {
		System.out.println("this step enter valid user name and password...");
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
	@Then(value="^user should be able to login successfully$")	
	public void use_should_login() {
		System.out.println("user should login successfully...!");
		
}
	@And("And user should abe to add product")
	public void and_user_should_abe_to_add_product() throws InterruptedException {
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
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();;
		Thread.sleep(4000);
        driver.findElement(By.name("remove-sauce-labs-bike-light")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("continue-shopping")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();;
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
		
	}
	@Then("user should be able to logout successfully")
	public void user_should_be_able_to_logout_successfully() throws InterruptedException {
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		driver.close();
	}

}