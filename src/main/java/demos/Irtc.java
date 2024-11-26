package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irtc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath(" //a[text()=' LOGIN '] ")).click();
		driver.findElement(By.xpath("//*[starts-with(@formcontrolname,'userid')]")).sendKeys("rajinikanthpole1996");
		driver.findElement(By.xpath("//*[starts-with(@formcontrolname,'password')]")).sendKeys("Rajin1996@");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[starts-with(@type,'submit')])[2]")).click();	
	    driver.findElement(By.xpath("(//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[1]")).sendKeys("secunderbad");
		
		driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[2]")).click();

	}
}