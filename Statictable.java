package AutomationPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//rows
		int rows =driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		
		System.out.println("num of rows : "+rows);
		
		//columns
		
		int columns = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println("num of columns : "+ columns);
		
		//read data from specific row and column 5th row and 1st columns
		
		String text = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
		System.out.println(text);
		
		//read data from all the rows and columns
		
		System.out.println();
		
	/*	for(int r=2;r<=rows;r++) {
			for(int c=1;c<=columns;c++) {
			
				String totalvalues = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.print(totalvalues + "\t");
				
				
			}
			System.out.println();
		}
		*/
		
		
	/*	for(int r=2;r<=rows;r++) {
			
			String author = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
			if(author.equals("Mukesh")) {
				
				String book = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText();

				System.out.println(book + "\t" + author);
			}
				
		}
		
		*/
		int total =0;
		for(int r=2;r<=rows;r++) {
			
			String price = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText();
			total = total+Integer.parseInt(price);
			

		}
		
		System.out.println(total);
		
	}

}
