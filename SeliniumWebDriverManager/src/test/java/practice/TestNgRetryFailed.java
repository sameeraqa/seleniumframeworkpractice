package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import listners.RetryAnalyzer;
/*
 * Uncomment when you want to test retry funcionality
 */
public class TestNgRetryFailed {
	
	@Test()
	public void test1()
	{
		System.out.println("Insise test1");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("Insise test2");
		//int i=1/0;
	}
	
	//@Test(retryAnalyzer=RetryAnalyzer.class)
	@Test
	public void test3()
	{
		System.out.println("Insise test3");
		Assert.assertTrue(0>1);
	}

}
