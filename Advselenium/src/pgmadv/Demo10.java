package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Sws/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/quet1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("hiii");
		Thread.sleep(2000);
		driver.findElement(By.id("a2")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("a3")).click();
	}
}
