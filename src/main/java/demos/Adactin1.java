package demos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.id("username")).sendKeys("Rajinikanth123",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("Rajin1996@",Keys.ENTER);
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.xpath("//select[@id='location']")).sendKeys("sydney",Keys.ENTER);
		driver.findElement(By.xpath("//select[@id='hotels']")).sendKeys("hotelcreek",Keys.ENTER);
		driver.findElement(By.xpath("//select[@name='room_type']")).sendKeys("standard",Keys.ENTER);
		driver.findElement(By.xpath("//select[@name='room_nos']")).sendKeys("1-one",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='datepick_in']")).clear();
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("12/08/2025");
		driver.findElement(By.xpath("//input[@name='datepick_out']")).clear();
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("13/08/2025");	
		driver.findElement(By.xpath("//select[@name='adult_room']")).sendKeys("2-two",Keys.ENTER);
		driver.findElement(By.xpath("//select[@name='child_room']")).sendKeys("2-two",Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	//	driver.findElement(By.xpath("//*[starts-with(@name,'radiobutton_0')]")).click();
		driver.findElement(By.xpath("//input[normalize-space(@name)='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Rajinikanth",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Pole",Keys.ENTER);
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("kukatpally,hyderabad",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1111222244446666",Keys.ENTER);
		driver.findElement(By.xpath("//select[@name='cc_type']")).sendKeys("visa",Keys.ENTER);
		driver.findElement(By.xpath("//select[@name='cc_exp_month']")).sendKeys("may",Keys.ENTER);
		driver.findElement(By.xpath("//select[@name='cc_exp_year']")).sendKeys("2021",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("721");
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='cancelall']")).click();
		
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.xpath("//input[@name='logout']")).click();
		driver.quit();
	}

}
