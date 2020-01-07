package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenersDemo2 {

	@Test
	public void test5(){
		System.out.println("this is test 5");
	}
	@Test
	public void test6(){
		System.out.println("this is test 6");
		Assert.assertTrue(false);
	}
	@Test
	public void test7(){
		System.out.println("this is test 7");
	}
	@Test
	public void test8(){
		System.out.println("this is test 8");
	}
}
