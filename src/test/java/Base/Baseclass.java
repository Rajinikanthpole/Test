package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	 WebDriver driver;
	
	 public void getDriver() {
		driver = new ChromeDriver();
	}
	 public void enterUrl(String text) {
		 driver.get(text);
	 }
	 public void maximize() {
		 driver.manage().window().maximize();
	 }
	 public String getTitle() {
		 String title = driver.getTitle();
		 return title;		 
	 }
	 public void close() {
		 driver.close();
	 }
	 public void sendkeys(WebElement element,String text) {
		 element.sendKeys(text);
	 }

}
