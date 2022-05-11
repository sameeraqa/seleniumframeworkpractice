package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		
		DesiredCapabilities descap=new DesiredCapabilities();
		descap.setCapability("ignoreProtectedModeSettings", true);
		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver(descap);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automated testing");
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		driver.close();

	}

}
