package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	@Test(dataProvider="testdata1")
	public void test1(String username,String password) throws InterruptedException {
		System.out.println("username:"+username+ " | " +"password: "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
	}
	
	
	@DataProvider(name="testdata1")
	public Object[][] getData() {
		String path="C:\\Users\\Windows\\eclipse-workspace\\SeleniumJavaFramework2\\excel\\Data.xlsx";
		Object data[][]= testdata(path,"Sheet1");
		return data;
	}
	
	public Object[][] testdata(String path,String sheetName)
	{
		ExcelUtils utt = new ExcelUtils(path,sheetName);
		int rowCount= utt.getRowCount();
		int colCount= utt.getColCount();
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData=utt.getCellStringData(i,j);
				System.out.print("Celldata: "+cellData+" | ");
				data[i-1][j]=cellData;
			}
			System.out.println();
		}
		return data;
	}
}
