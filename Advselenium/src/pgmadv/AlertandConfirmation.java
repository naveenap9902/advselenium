package pgmadv;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertandConfirmation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		String txt = a1.getText();
		System.out.println(txt);
		
		a1.accept();
		Thread.sleep(2000);
		a1.accept();
}
}