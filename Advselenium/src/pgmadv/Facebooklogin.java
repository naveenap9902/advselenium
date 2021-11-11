package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hello");
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("input[id='password']")).sendKeys("world");
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[value='1']")).click(); 
	}
}
