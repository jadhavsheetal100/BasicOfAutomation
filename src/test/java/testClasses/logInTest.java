package testClasses;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logInTest extends baseClass {
	@Test
	public void verifyLoginTab() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertTrue(lp.login().isEnabled());
		Thread.sleep(2000);
		lp.userName();
		Thread.sleep(2000);
		lp.passWord();
		Thread.sleep(2000);
		lp.loginButton();
		Thread.sleep(2000);
	}
	@Test
	public void verifyWelcomeTab()
	{
		lp.welCome();
	}


}
