package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Sws/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/quet2.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a2")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.id("a2")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("a3")).click();
	}

}
