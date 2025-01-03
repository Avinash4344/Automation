package AutomationPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.id("country"));
		
		Select select = new Select(country);
		
		//select by drop down option
		//select.selectByVisibleText("France");
		//select.selectByValue("japan");
		//select.selectByIndex(5);
		List<WebElement> options= select.getOptions();
		System.out.println(options.size());
		
		/*for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i));
		}
		*/
		
		for(WebElement opt:options) {
			opt.getText();
		}
		
		
		
	}

}
