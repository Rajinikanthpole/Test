package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8008239359");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Rajin1996@");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("//div[@class='a-section _video-player_static-card_pvea-static-card-background-gradient__1jwm9']")).click();

	}

}
