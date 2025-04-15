package demos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cross1 {
	
		public  WebDriver driver;
		
		public void browser_open() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		}
		
		
		
		public void getDriver(String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				System.out.println("chrome is opened");
			}
			else if (browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
				System.out.println("edge is opened");
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				System.out.println("firefox is opened");
			}
		}
		public void enterUrl(String text) {
			driver.get(text);
			
			
		}
		public void maximize() {
			driver.manage().window().maximize();
		}
		public  String getTitle() {
			String title = driver.getTitle();
			return title;
			
		
		
		

	}

}

