package Seleniums;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class kameraexpres {
	
	WebDriver driver=new ChromeDriver();
	Actions actions = new Actions(driver);  // this I have added globally so that actions doesn't have to be used in other methods individually.

	
	@Test (priority = 1)
	void url () {
		
		driver.get("https://www.kamera-express.nl/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@cs-consent=\"all\"]")).click();

	}
	
	@Test (priority = 2)
	void register () {
		WebElement regis = driver.findElement(By.xpath("//div[@class='header-content-bottom']//button[@class='user-button sf-button--text no-underline sf-button']"));
		actions.moveToElement(regis).perform();
		
		WebElement createacc = driver.findElement(By.xpath("//div[@class='header-content-bottom']//div[@class='register-cta-container']//a"));
		createacc.click();
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Himanshu");
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Himanshu");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("himanshu2120233120@yopmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Asdf@1234");
		driver.findElement(By.xpath("//input[@name='confirm_password']")).sendKeys("Asdf@1234");
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='recommendations_commerce']")).click();
		driver.findElement(By.xpath("//input[@id='register']")).click();
	}

		@Test (priority = 3)
		void home() {
			WebElement home = driver.findElement(By.xpath("//img[@alt=\"Kamera Express\"]"));
			home.click();
		}


	@Test (priority = 4)
	void camera () {
		WebElement cameras = driver.findElement(By.xpath("//a[@title=\"Fotocamera's\"]"));
		cameras.click();
		
		
		WebElement allecamera = driver.findElement(By.xpath("//div[@class='containers-mapper']//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[2]//h6[1]"));
		allecamera.click();
	
	}
	
	
	@Test (priority = 5)
	 void panasonic () {
		 WebElement panasonic = driver.findElement(By.xpath("//div[@id='plp-page-wrapper']//div[1]//div[1]//div[2]//div[4]//div[1]//div[2]//button[1]//div[1]//div[1]//*[name()='svg']"));
		 panasonic.click();
	 }
	
	
	
//	@Test (priority = 7)
//	void cart () {
//		WebElement cart = driver.findElement(By.xpath("//div[@id=\"__layout\"]/div/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/button"));
//		cart.click();
//		
//		WebElement gotocart = driver.findElement(By.xpath("(//button[@data-dd-action-name='view-cart'])[1]"));
//		gotocart.click();
//	}
//	 
	
	
	


}
