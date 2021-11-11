package pgmadv;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Imagepath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> box = driver.findElements(By.xpath("//img"));
		for(WebElement we:box)
		{
			String imag = we.getAttribute("src");
			System.out.println(imag);
	
		}	
	}
}
