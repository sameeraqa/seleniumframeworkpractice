package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.GoogleSearchPage;
import pageobject.GoogleSearchPageObject;

public class Locators {

	public static void main(String[] args) {
		getDetails();
	}
	
	public static void getDetails() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		GoogleSearchPageObject obj =new GoogleSearchPageObject(driver);
		obj.setTextInSearchBox("Automation step by step");
		obj.setButtonSearchBox();
		 
		
	}

}
