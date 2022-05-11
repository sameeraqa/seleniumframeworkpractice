package priority;


import org.testng.annotations.Test;
/*
 * Default priority is alphabetic order
 * if given priority lowest number get executed first
 * given same priority for both checks for alphabetic order
 * Nonprioritized executes firsts and then executes prioritized
 * 
 * 
 */

public class TestngPriority {
	
	
	@Test(priority=1)
	   public void c_method() {
		   System.out.println("I am inside c");
	   }
		@Test
	   public void b_method() {
			
		   System.out.println("I am inside b");
	   }
		@Test(priority=1)
	   public void a_method() {
		   System.out.println("I am inside a");
	   }
		@Test(priority=-1)
	   public void e_method() {
		   System.out.println("I am inside e");
	   }
		@Test(priority=0)
	   public void d_method() {
		   System.out.println("I am inside d");
	   }

}
