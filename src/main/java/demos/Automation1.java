package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rajinikanthpole@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rajinikanth1234@");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//driver.findElement(By.xpath("(//div[@class='panel-heading'])[2]")).click();
		driver.findElement(By.xpath("(//img[@alt='ecommerce website products'])[2]")).click();
		

	}

}
