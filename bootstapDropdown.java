package AutomationPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstapDropdown {

	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//select single option
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]")).click();
		driver.findElement(By.xpath("//input[@value=\"jQuery\"]")).click();
		
		//capture all options
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());  //14
		
		//get all options
		for(WebElement op:options) {
			System.out.println(op.getText());
			
		}
		
		
		//select multiple options
		
		for(WebElement opt:options) {
			if(opt.getText().equals("Java") || opt.getText().equals("jQuery")) {
				opt.click();
			}
		}
		
		
		
	}

}
