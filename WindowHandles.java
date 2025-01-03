package AutomationPractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://demo.nopcommerce.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
			
			Set<String> windowids = driver.getWindowHandles();
			//Approach 1
			
			/*List<String> windowlist = new ArrayList(windowids);
			String parentid = windowlist.get(0);
			String childid = windowlist.get(1);
			
			driver.switchTo().window(childid);
			System.out.println(driver.getTitle());
			
			*/
			
			//Approach 2
			
			for(String win:windowids) {
				
				String title = driver.switchTo().window(win).getTitle();
				
				if(title.equals("OrangeHRM")) {
					
					System.out.println(driver.getCurrentUrl());
					
				}
				
				
				
			}
			
			
	}

}
