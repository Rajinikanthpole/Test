package demos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PageSize;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class Datainfy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.datainfy.com/");
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		//driver.findElement(By.xpath("//img[@alt='Logo']")).click();
		driver.findElement(By.xpath("//a[@class='nav-link drop_arrow']")).click();
		driver.findElement(By.xpath("//a[@class='nav-link active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='nav-link drop_arrow'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@class='nav-link drop_arrow'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='nav-link'])[2]")).click();
		
       


	}

}
