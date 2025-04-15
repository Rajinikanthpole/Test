package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newclass {
	 public WebDriverManager driverManager;
	 public static WebDriver driver;
	 public void getBrowser() {
		 driverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://adactinhotelapp.com/");
	 }
	  public static String getUrls() {
		  return driver.getCurrentUrl();
		  
	  }
	  public static String PrintTitle() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		  return driver.getTitle();
	  }

}
