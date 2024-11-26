package demos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoss {

	private static final String TakesScreenshot = null;

	public static <takescreen> void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	      
		
		File S = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File D= new File("C:\\Users\\rajin\\OneDrive\\Documents\\Downloads\\screenshot.jpg");
		FileUtils.copyFile(S, D);
		
	
        
        

	}
	

	
}

