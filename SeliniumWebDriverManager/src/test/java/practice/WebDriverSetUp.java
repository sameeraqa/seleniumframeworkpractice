package practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSetUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().driverVersion("2.36").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> elements=driver.findElements(By.xpath("//input"));
		System.out.println("Count of input elements"+elements.size());
		//WebElement textBox=		
		//textBox.sendKeys("automation step by step");
		driver.close();
		//driver.quit();

	}

}
