package practice;

import org.testng.annotations.Test;
/*
 * Dependency takes precedence if priority is set
 */

public class TestNgDependencyMethods {
	
	@Test(dependsOnMethods = {"test2","test3"})
	public void test1()
	{
		System.out.println("Insise test1");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("Insise test2");
	}
	
	@Test()
	public void test3()
	{
		System.out.println("Insise test3");
	}

}
