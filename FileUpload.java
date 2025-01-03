package AutomationPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).click();
	}

}
