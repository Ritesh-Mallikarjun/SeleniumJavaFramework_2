package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesPage {
public static void main(String[] args) {
	googleSearch();
}
public static  void googleSearch() {
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("ignoreProtectedModeSettings", true);
	WebDriverManager.iedriver().setup();
	@SuppressWarnings("deprecation")
	WebDriver driver= new InternetExplorerDriver(caps);
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Amazon Mechanical Turk");
	driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
	driver.close();
	System.out.println("Test completed done!!!!");
}
}
 