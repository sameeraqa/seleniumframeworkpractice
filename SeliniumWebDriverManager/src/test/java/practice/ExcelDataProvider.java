package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.ConfigDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.ExcelUtil;

public class ExcelDataProvider {
	
	WebDriver driver = null;
	@BeforeTest
	public void setup() { 
	 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();			
	
	}
	@Test(dataProvider="test1data")
	public void test(String userName,String password) throws InterruptedException {
		System.out.println(userName +" | " +password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		//driver.findElement(By.id("btnLogin")).click();	
		
	}
	
	
	@DataProvider(name="test1data")
	public Object[][] getData() {
		String excelpath ="C:\\Users\\samee\\eclipse-workspace\\SeliniumWebDriverManager\\Excel\\Data.xlsx";
		
		Object[][] data=testData(excelpath, "Sheet1");
		return data;
	}
	
  public static Object[][] testData(String excelPath,String sheetName) {
	  
	  ExcelUtil exutil=new ExcelUtil(excelPath, sheetName);
	
		int rowCount=exutil.getRowCount();
		int colCount=exutil.getColumnCount();
		Object data [][]=new Object[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String celldata=exutil.getCellData(i, j);
				//System.out.println(celldata+" | ");
				data[i-1][j]=celldata;
				
			}
			
		}
		return data;
	
	}

	
}
