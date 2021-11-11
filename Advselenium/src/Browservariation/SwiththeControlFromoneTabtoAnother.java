package Browservariation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwiththeControlFromoneTabtoAnother {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//a[.='मराठी']"));
		Robot r=new Robot();
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);
		Set<String> alltab = driver.getWindowHandles();
	     ArrayList<String> l=new ArrayList<String>(alltab);
		String wh = l.get(1);
		driver.switchTo().window(wh);
 
}
}
