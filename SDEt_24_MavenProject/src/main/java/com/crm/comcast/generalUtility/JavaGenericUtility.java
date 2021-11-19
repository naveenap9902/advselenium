package com.crm.comcast.generalUtility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;
/**
 * This class consist of all the java Generic utility
 * @author NAVEEN PATIL
 *
 */
public class JavaGenericUtility 
{
	public int getRanDomNumber() 
	{
		Random ranDom = new Random();
		int ranDomNum = ranDom.nextInt(10000);
		return ranDomNum;
	}
	
	/**
	 * its used to get the current System date with Time
	 * @return
	 */
	public String getSystmeDate() {
		Date date = new Date();
		String systemDateAndTime = date.toString();
		return systemDateAndTime;
	}
	/**
	 * its used to get the current System date with YYYY-MM-DD format
	 * @return
	 */
	public String getSystmeDate_YYYY_MM__DD() {
		Date date = new Date();
		String systemDateAndTime = date.toString();
		System.out.println(systemDateAndTime);
		String[] arr = systemDateAndTime.split(" ");
        String DD = arr[2];
        String YYYY = arr[5];   
        int MM = date.getMonth()+1;
        
        String finalFromat = YYYY+"-"+MM+"-"+DD;
		return finalFromat;	  
	}
	
    /**
     * used to pass the keyboard functionalities(Virtual Keys)
     * @throws Throwable
     */
    public void pressVirtualEnterKey() throws Throwable {
    	
    	Robot rc=new Robot();
    	rc.keyPress(KeyEvent.VK_ENTER);
    	rc.keyRelease(KeyEvent.VK_ENTER);
    }


}
