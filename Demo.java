package AutomationPractise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	WebDriver driver;
	
	
	@Test
	public void popups() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://practice-automation.com/");
		
		
		
		//driver.get("https://practice-automation.com/hover/");


		
		Thread.sleep(3000);
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'COMPOSE')]")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
			
		 driver.findElement(By.xpath("//a[text()=\"Popups\"]")).click();
		 
		 
		 
		 
		 
		Thread.sleep(2000);
		driver.findElement(By.id("confirm")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
//		
//		Actions action = new Actions(driver);
//		WebElement str = driver.findElement(By.id("mouse_over"));
//		action.moveToElement(str);
		
	
	}
	
	
}
