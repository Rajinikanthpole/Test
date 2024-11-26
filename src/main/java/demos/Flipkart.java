package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static <WebDriver> void main(String[] args) {
		// TODO Auto-generated method stub
	      org.openqa.selenium.WebDriver driver =new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.flipkart.com/");
	      driver.findElement(By.linkText("Login")).click();
	      driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("8008239359",Keys.ENTER);
	      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone",Keys.ENTER);
	     // driver.findElement(By.xpath("//div[@class='XqNaEv'][1]")).click();
	     // driver.findElement(By.xpath("//div[@class='_6i1qKy'][1]")).click();
	        WebElement checkbox = driver.findElement(By.xpath("//div[text()='Samsung']/preceding-sibling::div"));

	    
	    

	}

}
