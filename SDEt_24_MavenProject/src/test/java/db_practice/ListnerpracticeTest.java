package db_practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.generalUtility.BaseAnnotationClass;
@Listeners(com.crm.comcast.generalUtility.ListnerImp.class)
public class ListnerpracticeTest extends BaseAnnotationClass
{
	@Test
	public void listnerPractice()
	{
		System.out.println("test script is failed");
		Assert.fail();
	}
}
