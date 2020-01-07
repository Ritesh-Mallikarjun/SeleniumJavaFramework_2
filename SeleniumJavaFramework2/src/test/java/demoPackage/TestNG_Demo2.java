package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo2 {

	WebDriver driver;
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

	}
	@Test
	public void googleSearch2() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Donald Duck");
		Thread.sleep(1000);
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
		System.out.println("Test2 completed done!!!!");
	}
	@Test
	public void googleSearch3() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("jackson");
		Thread.sleep(1000);
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
	}
	@Test
	public void googleSearch4() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("bugati");
		Thread.sleep(1000);
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
	}
	@Test
	public void googleSearch5() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("katy perry");
		Thread.sleep(3000);
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
		System.out.println("Test5 completed done!!!!");
	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("Test completed done!!!!");
	}
}
