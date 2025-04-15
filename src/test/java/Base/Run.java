package Base;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Run extends Baseclass {
	
	@BeforeClass
	public void Openbrowser() {
		getDriver();
	}
	@Test
	public void openUrl() {
		enterUrl("https://www.facebook.com/");
		maximize();
		String title = getTitle();
		Assert.assertTrue(title.contains("Facebook"),"Facebook title verifying");
		
	}
	@AfterClass
	public void closewindow() {
		close();
	}
}
