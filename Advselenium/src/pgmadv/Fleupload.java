package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fleupload {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/HTML%20Pages/fileupload.html");
			WebElement ele = driver.findElement(By.xpath("//input[@id='upload']"));
			Thread.sleep(2000);
			ele.sendKeys("C:\\Users\\NAVEEN PATIL\\OneDrive\\Desktop\\HTML Pages\\SeleniumUrl's.txt");
}
}
	