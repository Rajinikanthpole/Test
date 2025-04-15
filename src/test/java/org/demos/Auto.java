package org.demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto {
	//public static void main(String[] args) {
		
	
	WebDriver driver;

	
	@BeforeTest
	public void PageOpen() {
		//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	driver.get("https://demo.automationtesting.in/");
//	this.driver = driver;
//	PageFactory.initElements(driver,this);
	
	}
	@Test
	public void Login() {
	driver.findElement(By.linkText("Skip Sign In")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Rajinikanth");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Pole");
	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Vilasagar");
	driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("rajini.pole@gmail.com");
    driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8008239359");
    driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
    driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
 //   driver.findElement(By.linkText("Ukrainian")).click();
    WebElement element = driver.findElement(By.id("Skills"));
    Select s= new Select(element);
    s.selectByIndex(3);
    WebElement element1 = driver.findElement(By.id("countries"));
    Select s1= new Select(element1);
    s1.selectByIndex(0);
    
//    System.out.println(driver.getCurrentUrl());
    
	
	
		
       }
}