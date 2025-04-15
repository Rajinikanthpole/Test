package org.demos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.FbLogin;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbIndex {

	public WebDriver driver;
	public FbLogin fbLogin;
	
	@BeforeTest
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
	}
	@Parameters({"username","password"})
	@Test
	public void caseOne() throws Exception {
		fbLogin = new FbLogin(driver);
		fbLogin.fb_login("helll@gmail.com","Hello@1234");
	}
	
}
