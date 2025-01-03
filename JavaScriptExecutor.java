package AutomationPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("name"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('Value', 'john')", name);
		
		WebElement radio = driver.findElement(By.id("male"));
		js.executeScript("arguments[0].click()",radio );
		
		
		
	}

}
