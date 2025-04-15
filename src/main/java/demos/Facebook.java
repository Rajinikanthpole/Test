package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement Emailaddress;
	public static void enterURL(String text) {
		driver.get(text);
	}
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	public static void maximize() {
		driver.manage().window().maximize();
	
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public void setLogin(WebElement login) {
		Login = login;
	}

	public void setEmailaddress(WebElement emailaddress) {
		Emailaddress = emailaddress;
	}
	@FindBy(name="pass")
	private WebElement Password;
	
	@FindBy(name="submit")
	private WebElement Login;
	
	public void LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmailaddress() {
		return Emailaddress;
	}
	public void  loginWithVaild(String name, String pass) {
		getEmailaddress().sendKeys(name);
		getPassword().sendKeys(pass);
		getLogin().click();
	}

}
