package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys("8008239359",Keys.ENTER);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rajin1996@");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("(Refurbished) iQOO Z3 5G (Cyber Blue, 8GB RAM, 256GB Storage)\r\n" +"");
		Thread.sleep(2000);
	   // driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click(); 
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	     }

}
