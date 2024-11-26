package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.cssSelector("input.login_input")).sendKeys("pole.rajin1996@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Rajinikanth");
		driver.findElement(By.cssSelector("input[type='Submit']")).click();

	}

	

}
