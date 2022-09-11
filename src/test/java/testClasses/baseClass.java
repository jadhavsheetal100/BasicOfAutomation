package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageClasses.logInPage;

public class baseClass {
	static WebDriver driver;
	logInPage lp;
	@BeforeSuite
	public void launchURL()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---start-maximized");
		options.addArguments("--disable-notifications");	
		driver=new ChromeDriver(options);
		driver.get("https://www.demoblaze.com/");
	}
	@BeforeClass
	public void objectCreation()
	{
		lp=new logInPage(driver);
		//lp.logInPage1(driver);
	}

}
