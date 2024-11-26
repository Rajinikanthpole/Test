package demos;

import java.lang.classfile.ClassFile.Option;
import java.lang.module.ModuleDescriptor.Opens;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdouble {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demoqa.com/select-menu");
		WebElement element = driver.findElement(By.id("cars"));
		Select s = 	new Select(element);
		s.selectByIndex(0);
		s.selectByValue("saab");
		//Thread.sleep(2000);
		s.selectByVisibleText("Audi");
		List<WebElement> x = s.getAllSelectedOptions();
		for (WebElement webElement : x) {
			System.out.println(webElement.getText());
		}

	}

}
