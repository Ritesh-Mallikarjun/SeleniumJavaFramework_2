package TestNG;

import org.testng.annotations.Test;

public class Priority_Demo 
{
	@Test
	public void tart() {
		System.out.println("this is a test 1 ");
	}
	@Test(priority = 0)
	public void taar() {
		System.out.println("this is a test 2");
	}
	@Test(priority = 0)
	public void tara() {
		System.out.println("this is a test 3");
	}
	
}
