package Base;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Open extends Newclass {
	
	@BeforeClass
	public void launch() {
		getBrowser();
	}
	@BeforeMethod
	public void getExtracDetails() {
		System.out.println(Newclass.PrintTitle());
		System.out.println(Newclass.getUrls());
	}
	@Test
	public void testName() {
		driver.findElement(By.id("username")).sendKeys("rajinikanth123");
	}
	@AfterClass
	public void close() {
		driver.close();
		
	}

}
