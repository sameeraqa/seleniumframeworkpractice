package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver=null;
	
	By text_box_googlesearch =By.name("q");
	By button_googlesearch =By.className("gNO89b");
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(text_box_googlesearch).sendKeys(text);
	}
	
	public void setButtonSearchBox() {
		driver.findElement(button_googlesearch).sendKeys(Keys.RETURN);
	}
	
	

}
