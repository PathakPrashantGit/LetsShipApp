package Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {
	ExtentReports repo = Reports.getReport();
	ExtentTest test;
	public void onTestStart(ITestResult result)
	{
		test =repo.createTest(result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS, result.getName()+" Test is Passed");
	}
	public void onTestFailure(ITestResult result)
	{
		test.log(Status.FAIL, result.getName()+" test is failed");
		String sc = null;
		try {
			sc =ScreenShots.getScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(sc,result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test.log(Status.SKIP, result.getName()+" Test is Skipped");
	}
	public void onFinish(ITestContext context)
	{
		repo.flush();
	}

}
