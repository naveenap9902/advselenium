package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoid {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Sws/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/link1.html");
		Thread.sleep(3000);
		driver.findElement(By.id("a1")).click();

}
}
