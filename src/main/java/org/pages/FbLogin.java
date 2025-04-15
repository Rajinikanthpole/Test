package org.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbLogin {

	public WebDriver driver;
	
	public FbLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	private WebElement emailId;
	@FindBy(id = "pass")
	private WebElement passcode;
	@FindBy(xpath = "//*[starts-with(@class,'_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy')]")
	private WebElement loginBtn;
	
	public void fb_login(String emailAddress,String passwordCode) {
		emailId.sendKeys(emailAddress);
		passcode.sendKeys(passwordCode);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
//		loginBtn.click();
	}
	
}
