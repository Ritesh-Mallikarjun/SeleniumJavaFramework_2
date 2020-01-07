package TestNG;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_FailedTestCase {

	@Test
	public void test1() {
		System.out.println("this is test 1");
	}
	@Test
	public void test2() {
		System.out.println("this is test 2");
		//int i=2*i;
	}
	@Test(retryAnalyzer = TestNG.RetryAnalyzer.class) // automated way of retrying failed test cases using (retryAnalyzer = TestNG.RetryAnalyzer.class)
	public void test3() {
		//Assert.fail();
		System.out.println("this is test 3");
		//Assert.assertTrue(false);
	}
}
 