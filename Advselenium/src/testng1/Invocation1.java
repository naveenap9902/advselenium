package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation1 {
	@Test(invocationCount=3,priority=1)
	public void test1()
	{
		Reporter.log("1",true);
	}
	@Test(invocationCount=2)
	public void test2()
	{
		Reporter.log("2",true);
	}

}
