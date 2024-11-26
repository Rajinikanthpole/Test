package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("LoginHeaderText")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//input[normalize-space(@placeholder)='Enter Mobile Number']")).sendKeys("8008239359",Keys.ENTER);
        driver.findElement(By.xpath("//button[@type='button']")).click();
		
		

	}

}
