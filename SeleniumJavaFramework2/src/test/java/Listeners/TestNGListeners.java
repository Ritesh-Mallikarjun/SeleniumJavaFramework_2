package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("test is started "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test is successfull "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test is failed "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test is skipped "+result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("test is skipped "+result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("test is skipped "+context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("test is completed "+context.getName());
	}

	
	
}
