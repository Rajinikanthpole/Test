package org.demos;

import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import demos.cross1;

public class Browser1 extends cross1 {
	@Parameters("browser")
	@BeforeTest
	public void openbrowser(String b) {
		getDriver(b);
		maximize();
	}
	@Test
	public void open1() {
		enterUrl("https://www.facebook.com/");
		String acctualTitle = getTitle();
		String expectedtitle = "Facebook";
		Assert.assertTrue(acctualTitle.contains(expectedtitle));	
	}
	public void close() {
		driver.close();getTitle();
	}

}
