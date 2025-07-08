package Seleniums;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class projecttranktechnologies {
	
	WebDriver driver=new ChromeDriver();
	Actions actions = new Actions(driver);  // this I have added globally so that someone hasn't used this everytime
	
	@BeforeTest  // doesn't have to put priority after putting before test
	@Test
	void url () {
		
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test 
	void verticlss () throws InterruptedException {
		WebElement verticals = driver.findElement(By.xpath("//li[@class='drop_down']/a[normalize-space()='Verticals']"));
		verticals.click();
        Actions actions = new Actions(driver);
        WebElement trade = driver.findElement(By.xpath("//strong[normalize-space()='Trading']"));
        actions.moveToElement(trade).perform(); // whenever using action class .perform is mandatory to add
        
        WebElement stocks = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']"));
        actions.moveToElement(stocks).click().perform();
                
	}
	
	@Test 
	void retail () {
		WebElement verticals = driver.findElement(By.xpath("//li[@class='drop_down']/a[normalize-space()='Verticals']"));
		verticals.click();
		WebElement retailandecom = driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		actions.moveToElement(retailandecom).perform();
		
		WebElement ecomm = driver.findElement(By.xpath("//div[@id='retailEcommerce']//li[1]//a[1]"));
		actions.moveToElement(ecomm).click().perform();
	}
	
	@Test
	void heatlcare () {
		WebElement verticals = driver.findElement(By.xpath("//li[@class='drop_down']/a[normalize-space()='Verticals']"));
		verticals.click();
		WebElement healths = driver.findElement(By.xpath("//strong[normalize-space()='Healthcare']"));
		actions.moveToElement(healths).perform();
		
		WebElement dietandNut = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[contains(text(),'Diet &')]"));
		actions.moveToElement(dietandNut).click().perform();
	}
	
	@Test
	void fintech() {
		WebElement verticals = driver.findElement(By.xpath("//li[@class='drop_down']/a[normalize-space()='Verticals']"));
		verticals.click();
		WebElement fintechh = driver.findElement(By.xpath("//strong[normalize-space()='Fintech']"));
		actions.moveToElement(fintechh).perform();
		
		WebElement prosoftdev = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[contains(text(),'Pos Software')]"));
		actions.moveToElement(prosoftdev).click().perform();
		
	}
	

}
