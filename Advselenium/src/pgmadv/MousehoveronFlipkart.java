package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoveronFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("(//div[.='Fashion'])[2]"));
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(ele).perform();
}
}
