package pgmadv;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./Sws/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
	}
}
 