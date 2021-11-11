package pgmadv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetchurl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> box = driver.findElements(By.xpath("//a"));
		for(WebElement links:box)
		{
			String pr = links.getAttribute("href");
			System.out.println(pr);
		}	
	}
}
