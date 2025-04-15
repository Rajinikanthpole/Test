package org.demos;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.reactor.Command.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdactinHotel {
	
	
	WebDriver driver;
	
	
	@BeforeTest
	public void HotelLoginPage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://adactinhotelapp.com/");
		
	}
	@Test(priority=1)
	public void AdctinTextVisble() {
		driver.findElement(By.xpath("//img[@alt='AdactIn Group']")).click();
		 boolean displayed = driver.findElement(By.xpath("//p[text()='Adactin Launches The Adactin Hotel App! ']")).isDisplayed();
		 assertTrue(displayed);
		 System.out.println(driver.findElement(By.xpath("//p[text()='Adactin Launches The Adactin Hotel App! ']")));
	}
	@Test(priority = 2)
	public void Login_Userename_and_Password() {
		driver.findElement(By.id("username")).sendKeys("test0000007");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
	@Test(priority = 3)
	public void Search_Hotel() {
		WebElement search=driver.findElement(By.id("location"));
		Select s = new Select(search);
		s.selectByIndex(2);
		
		WebElement hotels=driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");
	//	s1.selectByVisibleText("Hotel Hervey");	
	}
	@Test(priority = 4)
	public void Room_type() {
		WebElement room_type= driver.findElement(By.id("room_type"));
		Select s2 = new Select(room_type);
		s2.selectByVisibleText("Deluxe");
		
	}
	@Test(priority = 5)
	public void Number_of_Rooms() {
		WebElement numberofrooms = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(numberofrooms);
		s3.selectByIndex(4);
	}
	@Test(priority = 6)
	public void Check_In_and_Check_out_Date() {
		driver.findElement(By.xpath("//input[@id='datepick_in']")).clear();
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("07/04/2025");
		driver.findElement(By.xpath("//input[@id='datepick_out']")).clear();
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("08/04/2025");
	}
	@Test(priority = 7)
	public void Adults_and_Childrens() {
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4= new Select(adult);
		s4.selectByIndex(2);
		WebElement children = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(children);
		s5.selectByIndex(2);
	}
	@Test(priority = 8)
	public void Search() {
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
	}
	@Test(priority = 9)
	public void Search_hotel_and_Contiue() {
	  driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	  driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}
	@Test(priority = 10)
	public void Screenshot() throws IOException {
		TakesScreenshot src = (TakesScreenshot)driver;
		File screen = src.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\rajin\\eclipse-workspace\\New folder\\Demos\\target\\screen.jpeg");
		FileUtils.copyFile(screen, dest);
		
		}
	@AfterTest
	public void colse() {
		driver.close(); 
	}
	
	

}
