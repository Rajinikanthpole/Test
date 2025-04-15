package org.demos;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	public WebDriver driver;
	@BeforeTest
	public void wiat() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://online.actitime.com/rpole/login.do");
		//driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("rajini.pole@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Rajin2024",Keys.ENTER);  
		Thread.sleep(3000);
//      driver.findElement(By.partialLinkText("Login ")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	}
	@Test
	public void tasks() throws InterruptedException {
		Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	    driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Rajinikanth545");
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Hello");
	    driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
	   
	 
       Actions act = new Actions(driver);
	   WebElement element =  driver.findElement(By.xpath("(//*[starts-with(@class,'itemRow cpItemRow ')])[1]\r\n"+ ""));
	 //  act.moveToElement(element).Click().build().perform();
	   element.click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
//	   WebElement dropdownbottonElement = driver.findElement(By.xpath("//*[starts-with(@class,'emptySelection')]"));
//	   dropdownbottonElement.click();
//	   Select element1 = new Select(element);
//	   element1.selectByVisibleText("Big Bang Company");
//	   dropdownbottonElement.click();
//	   
	}
	@Test
	public void Bigbang() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Big Bang Company']")).click();
		driver.findElement(By.xpath("//div[text()='Flight operations']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Flight analysis']")).click();
		driver.findElement(By.xpath("(//div[text()='Add Task'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='components-TruncatedText-oneLine--k4DPsC7f'])[13]")).sendKeys("11/02/2025");    
		
	}
	
      @Test
      public void Flight() {
    	  driver.findElement(By.xpath("(//div[text()='Flight operations'])[2]")).click();
      }
      
	

}
