package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic1 
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
	     driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
}
