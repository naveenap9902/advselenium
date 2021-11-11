package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependances {
	@Test
	public void compose()
	{
		System.out.println("compose");
	}
	@Test(dependsOnMethods="compose")
	public void sentItems()
	{
		System.out.println("sent items");
		Assert.fail();
		System.out.println("world");
	}
	@Test(dependsOnMethods="sentItems")
	public void trash()
	{
		System.out.println("trash");
	}	
}
