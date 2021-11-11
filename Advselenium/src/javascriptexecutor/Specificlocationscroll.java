package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Specificlocationscroll {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Point loc = ele.getLocation();
	System.out.println(loc);
	int x = loc.getX();
	System.out.println(x);
	int y = loc.getY();
	System.out.println(y);
	js.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(2000);
	ele.click();
}
}
