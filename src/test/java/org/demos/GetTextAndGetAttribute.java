package org.demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetTextAndGetAttribute {
	WebDriver driver;
	
	@Test
	public void GetText() {
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/login/");
		WebElement element =driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
	//	return element.getText();
	    System.out.println("Extracted text: " + element.getText());

	}
	
	
	

}
