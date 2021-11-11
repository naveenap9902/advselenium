package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keysenumclear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/HTML%20Pages/allin.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='a1']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);
		
	}
}
