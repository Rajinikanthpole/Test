package org.demos;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script {
    public  WebDriver driver;
    @Test
     public void javascript() {
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    	 driver.get("https://adactinhotelapp.com/");
    	WebElement Username = driver.findElement(By.id("username"));
    	WebElement Password = driver.findElement(By.name("password"));
    	WebElement Login = driver.findElement(By.name("login"));
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].setAttribute('value','Rajinikanth123')",Username);
    	js.executeScript("arguments[0].setAttribute('value','ZJ45XJF')",Password);
    	js.executeScript("arguments[0].click()",Login);

    	
     }
   
    	    	
    	
    



}
