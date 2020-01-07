package package_AutoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.InvalidArgumentException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	public static void main(String[] args) throws Exception {
		autoit_test();
	}

	public static void autoit_test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("tinyupload");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.partialLinkText("TinyUpload.com - best file hosting solution, with no limits ...")).click();
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("C:\\Users\\Windows\\Documents\\SeleniumAuotitscript.exe");
		System.out.println("the title in this page is : "+driver.getTitle());

		driver.close();
		System.out.println("testing completed");
	}
}