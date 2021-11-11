package assertions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Refresh1 
{
	@Test
	public void refresh()
	{
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.click();
		driver.navigate().refresh();//new session 
		ele.click();//fail	
	}
}
