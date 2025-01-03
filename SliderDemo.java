package AutomationPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement minslider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println(minslider.getLocation()); // x=86, y=233
			
		act.dragAndDropBy(minslider, 100, 233).perform();
		
		System.out.println(minslider.getLocation());
		
		

		WebElement maxslider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println(maxslider.getLocation()); // x=86, y=233
			
		act.dragAndDropBy(maxslider, -150, 233).perform();
		
		System.out.println(maxslider.getLocation());
		
		
	}

}
