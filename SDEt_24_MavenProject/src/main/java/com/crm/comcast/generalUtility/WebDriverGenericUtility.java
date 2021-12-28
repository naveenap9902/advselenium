package com.crm.comcast.generalUtility;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
/**
 * This Generic Utility consist of all the WebDriver generic Methods
 * @author NAVEEN PATIL
 *
 */
public class WebDriverGenericUtility 
{
	/**
	 * This is Implicitly wait method(20)
	 * @param driver
	 */
	   public void waitUntilPageLoad(WebDriver driver)
	   {
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
	   }
	   
	   /**
	    * This method wait for the element to be visible(Explicitly wait)
	    * @param driver
	    * @param element
	    * 
	    */
	   public void waitForElementVisibility(WebDriver driver,WebElement element)
	   {
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOf(element));
	   }
	   /**
	    * This method wait for the element to be clicked , its custom wait created to avoid element InterAceptable Exception
	    * @param element
	    * @throws throwable
	    * here we specify Thread.sleep 
	    */
	   
	   public void waitAndClick(WebElement element) throws InterruptedException
	   {
		   int count = 0;
	       while(count<20) {
		    	   try {
		    	       element.click();
		    	       break;
		    	   }catch(Throwable e){
		    		   Thread.sleep(1000);
		    		   count++;
		    	   }
	       }
	       
	   }
	   /**
	    * this method is used to handle dropdowns
	    * @param element(pass the address of dropdown)
	    * @param option
	    */
	       
	   public void select(WebElement element, String option)
	   {
		   Select select=new Select(element);
		   select.selectByVisibleText(option);
		   
	   }
	   
	   /**
	    * this methods enables user to handle dropdown using index
	    * @param element
	    * @param index
	    */
	      
	   public void select(WebElement element, int index)
	   {
		   Select select=new Select(element);
		   select.selectByIndex(index);   
	   }
	   /**
	    * This method will perform mouse over action
	    * @param driver
	    * @param element
	    */
	   
	   public void mouseOver(WebDriver driver,WebElement element)
	   {
		   Actions act = new Actions(driver);
		   act.moveToElement(element).perform();
	   }
	   
	   /**
	    * This method performs right click operation 
	    * @param driver
	    * @param element
	    */
	   public void rightClick(WebDriver driver,WebElement element)
	   {
		   Actions act = new Actions(driver);
		   act.contextClick(element).perform();
	   }
	   
	   /**
	    * This method helps to switch the control from one window to another
	    * @param driver
	    * @param partialWinTitle(for contains method)
	    */
	   public void switchToWindow(WebDriver driver, String partialWinTitle)
	   {
		   Set<String> window = driver.getWindowHandles();
		   Iterator<String> it = window.iterator();
		   while(it.hasNext())
		   {
			   String winId=it.next();
			   String title=driver.switchTo().window(winId).getTitle();
	           if(title.contains(partialWinTitle))
	           {
	        	   break;
	           }
		   }	   
	   }
	   /**
	    * Accept alert(to handle alert popup) 
	    * @param driver
	    */
	   
	   public void acceptAlert(WebDriver driver)
	   {
		   driver.switchTo().alert().accept();
	   }
	   
	   /**
	    * Cancel Alert
	    * @param driver
	    */
	   public void cancelAlert(WebDriver driver)
	   {
		   driver.switchTo().alert().dismiss();
	   }
	   /**
	    * This method used for scrolling action to Specific element
	    * @param driver
	    * @param element
	    */
	   public void scrollToWebElement(WebDriver driver, WebElement element) {
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		  int y= element.getLocation().getY();
		   js.executeScript("window.scrollBy(0,"+y+")");
	   }
	   /**
	    * it is used to switch frame based on index
	    * @param driver
	    * @param index
	    */
	   
	    public void switchFrame(WebDriver driver,int index) {
	    	driver.switchTo().frame(index);
	    }   
	    /**
	     * switch frame based on webElement
	     * @param driver
	     * @param element
	     */
	    public void switchFrame(WebDriver driver,WebElement element) {
	    	driver.switchTo().frame(element);
	    } 
		/**
		 * switch frame based on id or Name
		 * @param driver
		 * @param idOrName
		 */
	    public void switchFrame(WebDriver driver,String idOrName) {
	    	driver.switchTo().frame(idOrName);
	    } 
/**
 * this method is used to take screenshot
 * @param driver
 * @param screenshotName
 * @throws Throwable
 */
	    public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
	    	TakesScreenshot ts=(TakesScreenshot)driver;
	    	File src=ts.getScreenshotAs(OutputType.FILE);
	    	File dest=new File("./screenshot/"+screenshotName+".PNG");
	    	Files.copy(src, dest);
	    }
	    
	    /**
	     * pass the enter key throw actions class
	     * @param driver
	     */
	   public void passEnterKey(WebDriver driver) 
	   {
		   Actions act = new Actions(driver);
		   act.sendKeys(Keys.ENTER).perform();
	   } 
}
