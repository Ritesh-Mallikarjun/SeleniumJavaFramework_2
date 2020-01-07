package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlesearch_pageobject {
	//By class reference variable;
	By textEntry = By.name("q");
	By buttonEntry = By.className("gNO89b");
	WebDriver driver=null;
	
	public Googlesearch_pageobject(WebDriver driver) {
		this.driver=driver;
	}

	public void textbox_SearchNew(String text) {
	    driver.findElement(textEntry).sendKeys(text);	
	}
	
	public void searchButton() {
	    driver.findElement(buttonEntry).sendKeys(Keys.RETURN);	
	}
}
