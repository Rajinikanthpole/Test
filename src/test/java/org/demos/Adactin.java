package org.demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Adactin {
	public WebDriver driver;
	
	@BeforeTest
	public void Browser_launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Rajinikanth123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ZJ45XJ");
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='login_button']")).click();
		
	}
//	@Test
//	public void login() throws InterruptedException {
//	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Rajinikanth123");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ZJ45XJ");
////		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@class='login_button']")).click();
//		
//	}
	@Test
	public void Select_loction() throws InterruptedException {
		WebElement element= driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(element);
		s.selectByIndex(1);
	//	s.selectByValue("Hotel Creek");
	//	s.selectByVisibleText("Hotel Hervey");
		
	}
	@Test
	public void Select_hotels() {
		WebElement element = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s = new Select(element);
		s.selectByValue("Hotel Creek");
		
	}
	@Test
	public void Select_room_type() {
		WebElement element = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s = new Select(element);
		s.selectByVisibleText("Double");
	}
	@Test
	 public void Select_rooms() {
		WebElement element = driver.findElement(By.id("room_nos"));
		Select s = new Select(element);
		s.selectByIndex(2);
		
	}
	@Test
	public void Check_in_date() throws InterruptedException {
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		element.clear();
	    element.sendKeys("11/12/2024");
		
	}
	@Test
	public void Check_out_date() throws InterruptedException {
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		element.clear();
		element.sendKeys("15/12/2024");
	}
	@Test
	public void Adults() throws InterruptedException {
		
		WebElement element = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s = new Select(element);
        s.selectByIndex(1);
		}
        @Test
        public void Children() throws InterruptedException {
//        	Thread.sleep(3000);
        	WebElement element = driver.findElement(By.xpath("//select[@name='child_room']"));
        	Select s = new Select(element);
        	s.selectByValue("2");
        }
        @Test
        public void search() {
        	driver.findElement(By.id("Submit")).click();
        	Actions act = new Actions(driver);
        	WebElement e = driver.findElement(By.xpath("//input[normalize-space(@name)='radiobutton_0']"));
        	act.moveToElement(e).click().perform();
        	
        }
//        @Test
//        public void Check_box() throws InterruptedException {
//        	Thread.sleep(3000);
//        //	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@name,'radiobutton_0')]")));
//        //	WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[normalize-space(@name)='radiobutton_0']")));
//        //	radioButton.click();
//
//            driver.findElement(By.xpath("//input[normalize-space(@name)='radiobutton_0']")).click();
//           
//        }
	

}
