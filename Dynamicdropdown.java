package AutomationPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> options =  driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role='option']"));
		
		System.out.println(options.size());
		for(int i=0;i<options.size();i++) {
			String name = options.get(i).getText();
			
			if(name.equals("selenium rich foods")) {
				options.get(i).click();
				break;
			}
		}
 		
	}

}
