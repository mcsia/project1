package Login.facebook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;


public class Base {
	public WebDriver driver;
	Properties prop;
	FileInputStream fis;
	
	public WebDriver initialisingbrowser() throws IOException
	{
      prop= new Properties();
      fis= new FileInputStream("C:\\Users\\madhu\\eclipse-workspace\\facebook\\src\\main\\java\\Login\\facebook\\data.properties");
	 prop.load(fis);
	 String browser= prop.getProperty("browser");
	 if(browser.equals("chrome"))
	 {
		System.out.println("This is from inside chrome check and passed");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\eclipse-workspace\\DriverFile\\chromedriver.exe");
		 driver= new ChromeDriver();
		 System.out.println("Chrome is initiated");
	 }
	 /*else if(browser.equals("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Madhumathy\\seleniumdriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	 }
	 else if(browser.equals("IE"))
			 {
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\Madhumathy\\seleniumdriver\\IEDriverServer.exe");
		 driver= new InternetExplorerDriver();
			 }*/
	return driver;
	
	}
	public String getUrl() throws IOException
	{
	  prop=new Properties();
	  fis= new FileInputStream("C:\\\\Users\\\\madhu\\\\eclipse-workspace\\\\facebook\\\\src\\\\main\\\\java\\\\Login\\\\facebook\\\\data.properties");
		prop.load(fis);
	  String url=	prop.getProperty("url");
	  return url;
	}

}
