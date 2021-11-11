package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instalogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("input[id='username']")).sendKeys("hello");
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("input[id='password']")).sendKeys("world");
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[type='submit']")).click(); 
	}

}
