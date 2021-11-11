package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginscript 
{
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
	   Generic g1=new Generic(driver);
	   Thread.sleep(3000);
	   g1.username1("naveenap9902@gmail.com");
	   g1.password1("naveenap9902");
	   g1.loginsumbit();
	}
}
