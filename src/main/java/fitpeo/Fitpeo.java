package fitpeo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Fitpeo {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fitpeo.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.linkText("Revenue Calculator")).click();
		WebElement slider = driver.findElement(By.xpath("//input[@aria-orientation='horizontal']"));
		Actions actions = new Actions(driver);
	
	
		actions.clickAndHold(slider);
		actions.moveByOffset(94,0).release().perform();
		driver.findElement(By.xpath("//input[@type='range']")).sendKeys(Keys.ARROW_LEFT,Keys.ARROW_LEFT,Keys.ARROW_LEFT,Keys.ARROW_LEFT);
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ENTER,Keys.CONTROL+"a",Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("560");
	}

}
