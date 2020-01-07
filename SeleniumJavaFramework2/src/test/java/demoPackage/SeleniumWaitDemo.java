package demoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {
	static WebDriver driver;
	public static void main(String[] args) {
		seleniumwait();
	}
	public static void seleniumwait() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		// Implicit wait is set for entire session of browser.
		     //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//250 miliseconds is default polling time of implicit wait
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//Explicit wait can be for specific condition
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		// No such element present but still we will try
		driver.findElement(By.name("btbt")).click();
		driver.close();
	}
}
