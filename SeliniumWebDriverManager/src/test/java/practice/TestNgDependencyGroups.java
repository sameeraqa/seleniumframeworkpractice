package practice;

import org.testng.annotations.Test;
/*
 * Dependency takes precedence if priority is set
 */

public class TestNgDependencyGroups {
	
	@Test(dependsOnGroups =("sanity.*"))
	public void test1()
	{
		System.out.println("Insise test1");
	}
	
	@Test(groups="sanity1")
	public void test2()
	{
		System.out.println("Insise test2");
	}
	
	@Test(groups="sanity2")
	public void test3()
	{
		System.out.println("Insise test3");
	}

}
