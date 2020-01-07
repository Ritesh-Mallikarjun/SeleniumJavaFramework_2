package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenersDemo {

	@Test
	public void test1(){
		System.out.println("this is test 1");
	}
	@Test
	public void test2(){
		System.out.println("this is test 2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3(){
		System.out.println("this is test 3");
	}
	@Test
	public void test4(){
		System.out.println("this is test 4");
	}
}
