package com.crm.comcast.generalUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/**
 * this generic class is used to run the inconsistent testcases again and again 
 * @author NAVEEN PATIL
 *
 */
public class RetryAnalyser implements IRetryAnalyzer 
{
int count=0;
int retryCount=4;
	public boolean retry(ITestResult result) 
	{
	while(count<retryCount)
	{
		count++;
		return true;
	}
		return false;
	}
}
