package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
// Ignore at the class level
public class TestNG_IgnoreTest {

	//@Ignore  --> Ignore at test level
	@Test
	public void test1() {
		System.out.println("this is test 1");
	}
	@Test
	public void test2() {
		System.out.println("this is test 2");
	}
}
 