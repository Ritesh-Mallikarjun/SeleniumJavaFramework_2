package TestNG;

import org.testng.annotations.Test;

public class TestNG_Dependancies {
	
	//@Test(dependsOnMethods = {"test3"},priority = 0)
	@Test(dependsOnGroups = {"sanity.*"}) // regular expression with dependency on groups
	public void test1() {
		System.out.println("this is test 1");
	}
	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("this is test 2");
	}
	@Test(groups= {"sanity"})
	public void test3() {
		System.out.println("this is test 3");
	}
}
