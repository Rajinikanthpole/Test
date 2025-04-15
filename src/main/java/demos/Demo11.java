package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.xpath("//label[@class='interest']"));
		
		for (WebElement e : elements) {
		//	System.out.println(e.getText());
			System.out.println("hii");
		}


	}

}
