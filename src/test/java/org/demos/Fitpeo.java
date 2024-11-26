package org.demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fitpeo {
	public WebDriver driver;

	@BeforeTest
	public void Browser_lanuch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.fitpeo.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
	}

	@Test
	public void navigate_to_Revenue_Calculator() {
		driver.findElement(By.linkText("Revenue Calculator")).click();

	}

	@Test
	public void Slider() throws InterruptedException {

		driver.findElement(By.linkText("Revenue Calculator")).click();
		WebElement slider = driver
				.findElement(By.xpath("//input[@data-index]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 94, 0).release().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='range']")).sendKeys(
				Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT,
				Keys.ARROW_LEFT);
	}
	@Test
	public void Udate_text_filed() throws InterruptedException {
		driver.findElement(By.partialLinkText("Revenue Calculator")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='number']"))
				.sendKeys(Keys.ENTER, Keys.CONTROL + "a", Keys.BACK_SPACE);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("560",
				Keys.ENTER);

	}

	@Test
	public void Select_CPT_Codes() {
		driver.findElement(By.linkText("Revenue Calculator")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();

	}
	@Test
	public void Re_Update_Text_Filed() throws InterruptedException {
		driver.findElement(By.linkText("Revenue Calculator")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@class,'MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng')]")));
		driver.findElement(By.xpath("//*[starts-with(@type,'number')]")).sendKeys(Keys.ENTER, Keys.CONTROL + "a", Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[starts-with(@type,'number')]")).sendKeys("820",Keys.ENTER);
		

	}
	@AfterTest
	public void quits() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	

}
