package db_practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOrg1RetryAnalyserTest 
{
	@Test(retryAnalyzer=com.crm.comcast.generalUtility.RetryAnalyser.class)
	public void createOrg1()
	{
		Reporter.log("create org 1",true);
		Assert.fail();
	/*	int count =1;
		if(count==1)
		{
			Reporter.log("create org 1",true);
			count++;
			Assert.fail();
		}
	}*/
	}
}
