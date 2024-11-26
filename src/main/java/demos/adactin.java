package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.cssSelector("[class='login_register']")).click();
		driver.findElement(By.id("username")).sendKeys("Rajinikanth123",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("Rajin1996@",Keys.ENTER);
		driver.findElement(By.name("re_password")).sendKeys("Rajin1996@",Keys.ENTER);
		driver.findElement(By.name("full_name")).sendKeys("Rajinikanth Pole",Keys.ENTER);
		driver.findElement(By.name("email_add")).sendKeys("pole.rajin1996@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
