package AutomationPractise;

import org.testng.Assert;

public class TestNG {

	
	@org.testng.annotations.Test
	public void Test() {
			
		String a = "sanju";
		String b = "sanju";
		
		if(a==b) {
			
			System.out.println("Both are same");
			Assert.assertTrue(true);
		}
		
		else{
			System.out.println("Both are not same");
			Assert.assertTrue(false);

		}
	}

}
