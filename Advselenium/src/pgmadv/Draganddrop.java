package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
	WebElement e1 = driver.findElement(By.xpath("(//div[.='Madrid'])[2]"));
	WebElement e2=driver.findElement(By.xpath("//div[.='Spain']"));
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.dragAndDrop(e1, e2).perform();

	}
}
