package Seleniums;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testng2 {
	
	WebDriver driver=new ChromeDriver();
	
	@Test (priority=1)
	void signin() {
		driver.get("https://demo.automationtesting.in/SignIn.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test (priority = 2)
	void email() {
		driver.findElement(By.xpath("//input[@placeholder=\"E mail\"]")).sendKeys("himanshu@yopmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Asdf@1243");
	}
	
	@Test (priority = 3)
	void enter() {
		driver.findElement(By.xpath("//img[@id=\"enterbtn\"]")).click();
	}

}
