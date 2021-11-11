package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Facelogin extends Generic
{
@Test
public void login() throws InterruptedException 
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("world");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	
}
}
