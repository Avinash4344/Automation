package AutomationPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demoooo {
	
	WebDriver driver;
	
	@Test(groups = {"smoke"})
	public void test1() {
		
		System.out.println("Test1111");
		
		Assert.assertTrue(false);
		
	}

	@Test(groups = {"smoke"} , invocationCount  = 4)
	public void test2() {
		System.out.println("Test2222");
		
	}

	
	@Test(groups = {"sanity"})
	public void test3() {
		System.out.println("Test3333");
		
	}

	
	@Test(groups = {"sanity"})

	public void test4() {
		System.out.println("Test444");
		}
	

	@Test(groups = {"smoke"})
	public void test5() {
		System.out.println("Test555");
		
	}
	
	/*
	@Test
	public void FirefoxTest() {	 
        //Initializing the firefox driver (Gecko)
    driver = new InternetExplorerDriver();
    driver.get("https://www.google.com"); 
    
     }

	
	
    @Test
	public void ChromeTest()
	{ 
  //Initialize the chrome driver
  driver = new ChromeDriver();
  driver.get("https://www.facebook.com"); 
	}
	
	*/

	
	
	
	
	
}
