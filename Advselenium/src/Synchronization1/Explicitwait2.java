package Synchronization1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait2 
{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(3000);
	WebDriverWait wait=new WebDriverWait(driver, 10);
	//driver.findElement(By.xpath("(//a[.='Mobiles'])[2]")).click();
	driver.findElement(By.xpath("(//a[.='Best Sellers'])[1]")).click();
	wait.until(ExpectedConditions.titleContains("Amazon.in"));
	driver.findElement(By.xpath("(//a[.=' Electronics '])[1]")).click();
	//WebDriverWait wait1=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleContains("world"));
	String title = driver.getTitle();
	System.out.println(title);
}
}
