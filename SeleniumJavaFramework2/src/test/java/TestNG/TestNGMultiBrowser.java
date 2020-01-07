package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowser 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser name is :"+browserName);
		System.out.println("Thread Count is :"+ Thread.currentThread().getName());
		
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) 
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
	}
		
	@Test
	public void test() {
		driver.get("https://www.google.com");
	}
	@AfterTest
	public void tearDown() {
		System.out.println("browser run successfully");
		driver.close();
	}
	
}
