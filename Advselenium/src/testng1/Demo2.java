package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void test2()
	{
	Reporter.log("1", true);	
	}
	@Test
	public void test3()
	{
		Reporter.log("2",true);
		
	}

}
