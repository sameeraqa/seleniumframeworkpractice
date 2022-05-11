package groups;

import org.testng.annotations.Test;
@Test(groups="AllClassTests")
public class TestngGroupsDemo {
	
	@Test(groups= {"sanity"})
	   public void test6() {
		   System.out.println("I am inside Test6");
	   }
		@Test(groups= {"sanity","smoke"})
	   public void test7() {
		   System.out.println("I am inside Test7");
	   }
		@Test(groups= {"windows.regression"})
	   public void test8() {
		   System.out.println("I am inside Test8");
	   }
		@Test(groups="smoke")
	   public void test9() {
		   System.out.println("I am inside Test9");
	   }
		@Test(groups= {"linux.regression"})
	   public void test10() {
		   System.out.println("I am inside Test10");
	   }

}
