
package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().to("https://www.amazon.in/");
	//	driver.close();
		driver.quit();

	}

}
