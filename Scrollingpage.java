package AutomationPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) {

		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1500)");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll to element
		
		WebElement element = driver.findElement(By.xpath("//a[text()='View News Archive']"));
		js.executeScript("arguments[0].scrollIntoView()",element);
		
		
		
		
	}
	

}
