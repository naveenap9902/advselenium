package pgmadv;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample11 {
	public static void main(String[] args) throws InterruptedException {
		String key1="webdriver.gecko.driver";
		String value1="./Sws/geckodriver.exe";
		System.setProperty(key1,value1);
		FirefoxDriver d1=new FirefoxDriver();
		System.out.println("Firefox launched");
		Thread.sleep(3000);
		d1.close();
		
		String key2="webdriver.chrome.driver";
		String value2="./Sws/chromedriver.exe";
		System.setProperty(key2,value2);
		ChromeDriver d2=new ChromeDriver();
		System.out.println("chrome driver");
		System.out.println("chrome launched");
		Thread.sleep(2000);
		d2.quit();
	}

}
