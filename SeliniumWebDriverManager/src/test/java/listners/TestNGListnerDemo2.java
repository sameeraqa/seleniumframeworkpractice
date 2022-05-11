package listners;


import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(listners.TestngListners.class)
public class TestNGListnerDemo2 {
	
	@Test
   public void test6() {
	   System.out.println("I am inside Test6");
   }
	@Test
   public void test7() {
	   System.out.println("I am inside Test7");
	   //Assert.assertTrue(false);
   }
	@Test
   public void test8() {
	   System.out.println("I am inside Test8");
	   throw new SkipException("This test is skipped");
   }
	@Test
   public void test9() {
	   System.out.println("I am inside Test9");
   }
	@Test
   public void test10() {
	   System.out.println("I am inside Test10");
   }
	

}
