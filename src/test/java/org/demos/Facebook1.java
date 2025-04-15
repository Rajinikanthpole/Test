package org.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.seleniumhq.jetty9.util.preventers.LoginConfigurationLeakPreventer;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demos.Facebook;
import net.bytebuddy.asm.Advice.Enter;

public class Facebook1<LoginPage> extends Facebook {
	WebDriver driver;
	Facebook f;
	@BeforeTest
	public void openbrowser() {
		getDriver();
		enterURL("https://www.facebook.com/");
		maximize();
		
	}

}
