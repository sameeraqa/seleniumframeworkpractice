package practice;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReprtTestNg {
	
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extent;
	
	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		}

	@Test
	public void test1() throws IOException {
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");
        
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        test.addScreenCaptureFromPath("screenshot.png");

	}

	@AfterSuite
	public void tearDown() {
		extent.flush();

	}

}
