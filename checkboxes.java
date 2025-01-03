package AutomationPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkboxes {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select specify check box
		
		driver.findElement(By.id("tuesday")).click();
		
		//select multiple checkbox
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		/*for(int i=0;i<checkbox.size();i++) {
			
			checkbox.get(i).click();
			
		}*/
		
		for(WebElement box:checkbox) {
			
			box.click();
			
		}
		
		
		//select last three check boxes
		
		
		
		
		
		
		
		
		
		
	}

}
