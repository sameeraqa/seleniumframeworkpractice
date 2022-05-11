package practice;
import org.testng.annotations.Test;

import config.ConfigDemo;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgDemo {

	WebDriver driver = null;
	public static String  browsername=null; 
	private static Logger log =LogManager.getLogger(ConfigDemo.class);

	
	 @BeforeTest
		public void setup() {
		 
		 ConfigDemo.getProperties();
		 
		 if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
			log.info("Chrome Driver loaded successfuly");
		 }else if(browsername.equalsIgnoreCase("IE")) {
			 WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
			 log.info("IE Driver loaded successfuly");
		 }
		}
    @Test
	public void googleSearch() {
    	
		driver.get("https://www.google.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//input"));
		System.out.println("Count of input elements" + elements.size());
		// WebElement textBox=driver.findElement(By.name("q"));
		// textBox.sendKeys("automation step by step");
	}
    
   @AfterTest
	public void tearDown() {
		driver.close();
		// driver.quit();
	}

}
