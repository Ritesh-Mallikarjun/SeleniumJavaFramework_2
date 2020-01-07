package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import pageobject.Googlesearch_pom;

public class GoogleSearch_pom_action {
	public static void main(String[] args) {
		googleSearch();
	}
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//new comments for page object model to perform actions
		Googlesearch_pom.textbox_Search(driver).sendKeys("Amazon Mechanical Turk");
		Googlesearch_pom.textbox_Search(driver).sendKeys(Keys.ENTER);
		driver.close();
		System.out.println("Test completed done!!!!");
	}
}
