package AutomationPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		driver.manage().window().maximize();
	
		
		
		
		WebElement username =driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement pass =driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys("demo");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login.click();
		
		
		driver.findElement(By.xpath("//a[@class=\"parent collapsed\"][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id=\"collapse-5\"]//a[normalize-space()='Customers']")).click();
		
		String text = driver.findElement(By.xpath("//div[contains(text(), 'Showing')]")).getText();
		
		int total = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("pages")-1));	
		System.out.println(total);
		
	/*	
		for(int p=1;p<=5;p++) {
			
			if(p>1) {
				WebElement pages=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				pages.click();
				
				
			}
		}
		
		*/
		
		
	}

}
