package AutomationPractise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(3000);
		alert.dismiss();
		
		driver.findElement(By.id("promptBtn")).click();
		Thread.sleep(3000);
		
		alert.sendKeys("jessi");
		alert.accept();
		
		
	}

}
