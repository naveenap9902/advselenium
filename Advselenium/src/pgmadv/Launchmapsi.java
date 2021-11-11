package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchmapsi {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/maps/@14.5671502,74.9404456,8z");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='searchbox-directions-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bengaluru, Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Gokak, Karnataka");
driver.findElement()
}
}
