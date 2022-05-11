package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngMultiBrowser {
	
	WebDriver driver = null;
	public static String  browsername=null;
	
	
	@BeforeTest
	@Parameters("browsername")
	public void setUp(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		 }else if(browsername.equalsIgnoreCase("IE")) {
			 WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
		 }else if(browsername.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		
	}
	
	@Test
	public void test() {
		
	}
	@AfterTest
	public void tearDown() {
		
		driver.close();
	}

	
}
