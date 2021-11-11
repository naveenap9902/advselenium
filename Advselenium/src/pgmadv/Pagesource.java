package pgmadv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Sws/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getCurrentUrl());
	}
}
