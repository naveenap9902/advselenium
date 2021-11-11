package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priporityoftesc 
{
	@Test(priority=1)
	public void tes1()
	{
		Reporter.log("1",true);	
	}
	@Test(priority=1)
	public void test2()
	{
		Reporter.log("3",true);
	}
}
