package demoPackage;

import org.openqa.selenium.WebDriver;

public class ExceptionHandlingJava {
	public static void main(String[] args) 
	{
		try
		{
			exception();	
		}
		catch(Exception e) {
		e.printStackTrace();	
		}
	}
		
	public static void exception() throws Exception 
		{
			System.out.println("hi i am good");
			int i = 1/0;
			System.out.println("hi now i am bad");

		}

	}