package waits;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//default frequency of poll time for implicit wait 250 ms
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
		
		driver.findElement(By.className("bcnd")).click();
		driver.close();

	}

}
