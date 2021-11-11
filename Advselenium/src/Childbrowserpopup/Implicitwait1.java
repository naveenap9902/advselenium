package Childbrowserpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitwait1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("(//a[.='Mobiles'])[2]")).click();
		driver.findElement(By.xpath("(//a[.='Best Sellers'])[1]")).click();
		driver.findElement(By.xpath("(//a[.=' Electronics '])[1]")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("(//a[.='Fashion'])[1]")).click();
	}
}
