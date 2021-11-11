package assertions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserdymanic 
{
	@Test
	public void test()
	{
	System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("naveenap9902@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("naveenap9902");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertTrue(title.contains("Feed "));
	System.out.println("test case is pass");
}
}