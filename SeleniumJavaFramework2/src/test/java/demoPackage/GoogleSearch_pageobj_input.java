package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Googlesearch_pageobject;

public class GoogleSearch_pageobj_input {
	public static void main(String[] args) {
		googleSearch();
	}
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		//new comments for page object model to perform actions
		Googlesearch_pageobject pageobject = new Googlesearch_pageobject(driver);
		
		driver.get("https://www.google.com/");
		pageobject.textbox_SearchNew("Amazon Forest");
		pageobject.searchButton();
		driver.close();
		
		System.out.println("Test completed done!!!!");
	}
}
