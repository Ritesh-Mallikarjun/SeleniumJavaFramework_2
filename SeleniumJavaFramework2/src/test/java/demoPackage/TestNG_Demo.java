package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {

	WebDriver driver;
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

	}
	@Test
	public void googleSearch() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Amazon Mechanical Turk");
		Thread.sleep(1000);
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("Test1 completed done!!!!");
	}
}
