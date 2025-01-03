package AutomationPractise;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//fullpage screensot
	/*	TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);
	
		//specific area of page
		WebElement featuredproducts = driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
		File file1 =featuredproducts.getScreenshotAs(OutputType.FILE);
		File file2 = new File(System.getProperty("user.dir") + "\\screenshots\\products.png");
		file1.renameTo(file2);
		driver.quit();
		
		*/
		
		//specific webElement
		
		WebElement logo = driver.findElement(By.xpath("//div[@class=\"header-logo\"]//img"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File tar = new File(System.getProperty("user.dir") + "\\screenshots\\logo.png");
		src.renameTo(tar);
		
		
	}

}
