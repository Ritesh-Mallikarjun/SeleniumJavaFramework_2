package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
public static void main(String[] args) {
	googleSearch();
}
public static void googleSearch() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Amazon Mechanical Turk");
	driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
	driver.close();
	System.out.println("Test completed done!!!!");
}
}
 