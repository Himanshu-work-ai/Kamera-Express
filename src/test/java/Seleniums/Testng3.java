package Seleniums;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng3 {
	
	WebDriver driver=new ChromeDriver();
	
	@Test (priority = 1)
	void register() {
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test (priority = 2)
	void fullname() {
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Himanshu");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Himanshu");
	}
	
	@Test (priority = 3)
	void address() {
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("BTM, Bangalore, 560078");
	}
	
	@Test (priority = 4)
	void email() {
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("himanshu202524@yopmail.com");
	}
	
	@Test (priority = 5)
	void phone() {
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9900223356");
	}
	
	@Test (priority = 6)
	void gender() {
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
	}
	
	@Test (priority = 7)
	void hobbies() {
		driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
	}
	
	@Test (priority = 8)
	void languages() {
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='English']")).click();
		
	}
	
	
	void skills() {
		driver.findElement(By.xpath("//select[@id=\"Skills\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"C++\"]")).click();
	}
	

}
