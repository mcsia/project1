package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	WebDriver driver;
	By username=By.id("email");
	By password=By.id("pass");
	By login= By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		}
	public WebElement getUsername()
	{
	  return driver.findElement(username);
	}
	public WebElement getPassword()
	{
	   return driver.findElement(password);	
	}
	public WebElement getLogin()
	{
	  return driver.findElement(login);
	}

}
