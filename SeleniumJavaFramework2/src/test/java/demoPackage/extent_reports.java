package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extent_reports {
	static WebDriver driver;
public static void main(String[] args) {
	
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentReports.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test = extent.createTest("MyFirstTest","Sample test in searching text in google" );
	WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
	
	test.log(Status.INFO,"information started test1");
	driver.get("https://www.google.com/");
	test.pass("Welcome to google");
	driver.findElement(By.name("q")).sendKeys("Amazon Mechanical Turk");
	test.pass("entered key text successfully");
	driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
	test.pass("button entered successfully");
	driver.close();
	test.info("test compelted successfully");
	System.out.println("Test completed done!!!!");
	
	// second test to be started
	ExtentTest test2 = extent.createTest("MySecondTest","Sample test in searching text in google" );
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
	test2.log(Status.INFO,"information started test2");
	driver.get("https://www.google.com/");
	test2.pass("Welcome to google");
	driver.findElement(By.name("q")).sendKeys("Amazon forest");
	test2.pass("entered key text successfully");
	driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	test2.pass("button entered successfully");
	driver.close();
	test2.info("test2 compelted successfully");
	System.out.println("Test completed done!!!!");
	extent.flush();
}
}
