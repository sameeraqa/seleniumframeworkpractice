package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {
	
	public static void main(String[] args) {
		
		// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Google search test one", "this is a test to validate google search fi=unctionality");
     // info(details)
        
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		test.log(Status.INFO,"Chrome drive started succesfully");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google site");
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		test.pass("Identified search box and typed input text");
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		test.pass("Clicked on enter key");
		driver.close();
		test.pass("driver closed successfully");
		test.log(Status.INFO,"Test Successful");
		
		 // calling flush writes everything to the log file
        extent.flush();
		
	}

}
