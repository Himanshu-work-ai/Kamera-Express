package Seleniums;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {
	
WebDriver driver=new ChromeDriver();
	
	//@Test(priority=1)
    @BeforeTest

	void navigate () {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=2)
	void login() throws InterruptedException{
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin"); 
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=3)
	void post() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("Hola");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		
	}
	
//	@AfterTest
//	void close() {
//		driver.quit();
//	}

}
