package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups= {"Alltestgroup"})
public class TestNGGroupDemo 
{
	WebDriver driver;
	
	@Test(groups= {"smoke"})
	public void test1(){
		System.out.println("this is test 1");
	}
		
	@Test(groups= {"globalization"})
	public void test2() {
		System.out.println("this is test 2 ");
	}
	@Test(groups={"exploratory","system"})
	public void test3() {
		System.out.println("this is test 3 ");
	}
	@Test(groups= {"smoke","functional","system"})
	public void test4() {
		System.out.println("this is test 4 ");
	}
	@Test(groups= {"windows.system"})
	public void test5() {
		System.out.println("this is test 5 ");
	}
	@Test(groups= {"windows.usability"})
	public void test6() {
		System.out.println("this is test 6 ");
	}
}
