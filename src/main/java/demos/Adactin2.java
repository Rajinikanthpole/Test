package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("email")).sendKeys("8008239359");
        driver.findElement(By.name("pass")).sendKeys("rajini");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       // driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.partialLinkText("Forgotten")).click(); 
        System.out.println(driver.getCurrentUrl());
        
        driver.close();
	}

}
