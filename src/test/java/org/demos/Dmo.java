package org.demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dmo {
	public WebDriver driver;
@Test
public void testName() throws Exception {
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("nav-link-accountList")).click();
	driver.findElement(By.name("email")).sendKeys("8008239359",Keys.ENTER);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//*[starts-with(@id,'ap_password')]")).sendKeys("Rajin1996@",Keys.ENTER);
	driver.findElement(By.name("field-keywords")).sendKeys("(Refurbished) iQOO Z3 5G (Cyber Blue, 8GB RAM, 256GB Storage)",Keys.ENTER);
	driver.findElement(By.xpath("s-product-image")).click();

}
}
