package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automexercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/login");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rajinikanthpole");
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Rajinikanthpole@gmail22.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rajinikanth1234@");
		driver.findElement(By.xpath("(//select[@class='form-control'])[1]")).sendKeys("15");
		driver.findElement(By.xpath("//select[@id='months']")).sendKeys("August");
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1997");
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Rajinikanth");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Pole");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Aptsol");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("4-35-1494/2/64,ramarao nagar,kukatpally");
		driver.findElement(By.xpath("//select[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Telangana");
		driver.findElement(By.id("city")).sendKeys("Karimnagar");
		driver.findElement(By.name("zipcode")).sendKeys("500001");
		driver.findElement(By.name("mobile_number")).sendKeys("8309502055");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//driver.findElement(By.xpath("(//h4[@class='panel-title'])[2]")).click();
		

	}

}
