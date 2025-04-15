package org.demos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public WebDriver driver;
	@Test
	public void click_alerts() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("SwitchTo")).click();
		driver.findElement(By.partialLinkText("Alerts")).click();
		//Actions a = new Actions(driver);
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		//a.moveToElement(e).click().build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    System.out.println(driver.switchTo().alert().getText());
     
	    Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Abcd123");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
	}

}
