package org.demos;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@BeforeTest
	public void Open() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://freelance-learn-automation.vercel.app/signup");
	}
	@Test
	public void Sigup() {
		driver.findElement(By.id("name")).sendKeys("Rajinikanth");
		driver.findElement(By.name("email")).sendKeys("pole.rajin1996@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rajinikanth1996");
	}
	@Test
	public void Checkbox() {
		List<WebElement> e = driver.findElements(By.xpath("//input[@type='checkbox']"));	
		for(WebElement webElement:e) {
			webElement.click();
		List<WebElement> e1 =driver.findElements(By.xpath("//label[@class='interest']"));
		for (WebElement webElement2 : e) {
			System.out.println(webElement2.getText());
		}
			
		}
			}
		
	@Test
	public void State() {
		WebElement bb = driver.findElement(By.xpath("//select[@name='state']"));
		Select select = new Select(bb);
		select.selectByVisibleText("Telangana");
	
		
	}
	@Test
	public void Hobbies() {
		Select s1= new Select(driver.findElement(By.name("hobbies")));
		s1.selectByIndex(2);
		List<WebElement> e = driver.findElements(By.name("hobbies"));
		for (WebElement webElement :e) {
			System.out.println(webElement.getText());
		}
		
	}
	@Test
	public void Sigup1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
	}
	@AfterTest
	public void Close() {
		driver.close();
	}
	
}

