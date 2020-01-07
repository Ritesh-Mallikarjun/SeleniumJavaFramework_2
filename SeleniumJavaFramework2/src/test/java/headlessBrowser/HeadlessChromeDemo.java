package headlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {
	
		public static void test() {
			WebDriverManager.chromedriver().setup();
			//ChromeOptions are to be used for making it headless
			ChromeOptions options = new ChromeOptions();
			options.addArguments("Headless");
			options.addArguments("Window-size=1920,1080");
			// options passing it chromeDriver as an arguments;
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("automation");
			System.out.println("the title in this page is : "+driver.getTitle());
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			
			driver.close();
			System.out.println("testing completed");
		}
}
