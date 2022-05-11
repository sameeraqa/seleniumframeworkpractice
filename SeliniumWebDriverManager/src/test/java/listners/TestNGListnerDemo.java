package listners;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(listners.TestngListners.class)
public class TestNGListnerDemo {
	
	WebDriver driver = null;
	
	@Test
   public void test1() {
	   System.out.println("I am inside Test1");
   }
	@Test
   public void test2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(null);
		driver.get("https://www.google.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//inp"));
		System.out.println("Count of input elements" + elements.size());
	   System.out.println("I am inside Test2");
   }
	@Test
   public void test3() {
	   System.out.println("I am inside Test3");
	   throw new SkipException("This test is skipped");
   }
	@Test
   public void test4() {
	   System.out.println("I am inside Test4");
   }
	@Test
   public void test5() {
	   System.out.println("I am inside Test5");
   }
	

}
