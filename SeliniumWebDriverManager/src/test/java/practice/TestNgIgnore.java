package practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class TestNgIgnore {
	
	@Test()
	@Ignore
	public void test1()
	{
		System.out.println("Insise test1");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("Insise test2");
	}
	

}
