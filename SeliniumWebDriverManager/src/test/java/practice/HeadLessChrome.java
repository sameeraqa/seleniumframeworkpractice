package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessChrome {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		System.out.println("completed");
	}

}
