package AutomationPractise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'" ); //zoom level
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='100%'" ); 
		
		
		
		
		
		
	}

}
