package AutomationPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver() ;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://ui.vision/demo/webtest/frames/");
			driver.manage().window().maximize();
			
			//frame 1
			WebElement frame = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
			
			driver.switchTo().frame(frame);
			
			driver.findElement(By.name("mytext1")).sendKeys("Hello");
			
			driver.switchTo().defaultContent(); //coming back to main frame

			//frame 2
			WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
			
			
			driver.switchTo().frame(frame2);
			
			driver.findElement(By.name("mytext2")).sendKeys("Hello");
			
			
	}

}
