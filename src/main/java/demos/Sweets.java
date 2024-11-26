package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sweets {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sweetshop.netlify.app/login");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='exampleInputEmail']")).sendKeys("rajinikanthpole@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword']")).sendKeys("Rajini1234@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='btn btn-success btn-block addItem'])[1]")).click();

	}

}
