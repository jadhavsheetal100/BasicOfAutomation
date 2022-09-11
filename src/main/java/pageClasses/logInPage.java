package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class logInPage {
	@FindBy (id="login2")
	private WebElement login;
	@FindBy (id="loginusername")
	private WebElement userName;
	@FindBy (id="loginpassword")
	private WebElement passWord;
	@FindBy (xpath="//button[text()='Log in']")
	private WebElement loginButton;
	@FindBy (xpath="//a[@class='nav-link' and @id='nameofuser']")
	private WebElement welCome;
//	public logInPage(WebDriver driver)
//	{
//		login=driver.findElement(By.id("login2"));
//		userName=driver.findElement(By.id("loginusername"));
//		passWord=driver.findElement(By.id("loginpassword"));
//		loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
//	}
	
//	public void logInPage1(WebDriver driver)
//	{
//		login=driver.findElement(By.id("login2"));
//		userName=driver.findElement(By.id("loginusername"));
//		passWord=driver.findElement(By.id("loginpassword"));
//		loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
//		welCome = driver.findElement(By.xpath("//a[@class='nav-link' and @id='nameofuser']"));
//	}
	public logInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement login()
	{
		login.click();
		return login;
	}
	public void userName()
	{
		userName.sendKeys("SheetalNaina");
	}	
	public void passWord()
	{
		passWord.sendKeys("SheetalNaina");
	}
	public void loginButton()
	{
		loginButton.click();
	}
	public String welCome()
	{
		
		return welCome.getText();
		
	}

}
