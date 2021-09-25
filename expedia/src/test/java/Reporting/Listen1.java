package Reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The Test start now " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("The Test start now" + result.getName());
		}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The Test failed " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The Test skipped" + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The Test failed " + result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("The Test start now " + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("The Test finish "+ context.getName());
		
	}

}
