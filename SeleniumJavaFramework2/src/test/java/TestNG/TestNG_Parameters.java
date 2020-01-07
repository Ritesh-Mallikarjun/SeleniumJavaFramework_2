package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters 
{
	@Test
	@Parameters({"MyName"})
	public void test(@Optional("Trump") String Name) 
	{
		System.out.println("My name is :"+ Name);
	}
	
}
