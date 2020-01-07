package demoPackage;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo2_FluentWait {
	 
	public static void main(String[] args) {

	}
	public static void seleniumwait() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		// Implicit wait is set for entire session of browser.
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//250 Milliseconds is default polling time of implicit wait

		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		//driver.findElement(By.linkText("What's IT automation? - Red Hat")).click();
		//Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(6000)).ignoring(NoSuchElementException.class);

		WebElement elementweb = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element= driver.findElement(By.linkText("What's IT automation? - Red Hat"));

				if(element.isEnabled()) {
					System.out.println("Element Found");
				}
				return element;
			}
		});
		elementweb.click();
		driver.close();
	}
}
