package testng1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Facebooklogin extends Generic1
{
	@Test
	public void login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("world");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);	
		}
}
