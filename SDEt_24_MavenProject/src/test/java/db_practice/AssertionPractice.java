package db_practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {
	@Test
	public void demoTest()
	{
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals("A", "");
		System.out.println("step3");
		Assert.assertTrue(false);
		System.out.println("step4");
		Assert.assertEquals("naveen","naveen");
		SoftAssert s=new SoftAssert();

	}

}
