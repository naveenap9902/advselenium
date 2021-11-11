package pgmadv;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="./Sws/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
	}
}
