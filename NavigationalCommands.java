package AutomationPractise;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
			
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/"); //accepts only in string format
		
		
		//URL myurl = new URL("https://demo.nopcommerce.com/"); //accepts in string and object format
		//driver.navigate().to(myurl);
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
