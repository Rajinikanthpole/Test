package org.demos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public WebDriver driver;
	@Test
	public void facebook() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Rajinikanth123");
		TakesScreenshot screen1 = (TakesScreenshot)driver;
		File src1 = screen1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\\\Users\\\\rajin\\\\OneDrive\\\\Desktop\\\\img1.png");
		FileUtils.copyFile(src1, dest1);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ZJ46XJ");
		driver.findElement(By.xpath("//input[@class='login_button']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot screen =(TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File  dest = new File("C:\\Users\\rajin\\OneDrive\\Desktop\\img.png");
		FileUtils.copyFile(src, dest);
		
		
	}

}
