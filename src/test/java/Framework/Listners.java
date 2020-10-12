package Framework;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class Listners implements ITestListener {
	Base b=new Base();
	
	public void onTestSuccess(ITestResult result)
	{
		//System.out.println("Listners test case is passed on every successfully test");
	}
	
	public void onTestStart(ITestResult result)
	{
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		try {
			b.getscreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result)
	{
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	public void onStart(ITestContext context)
	{
		
	}
	
	public void onFinish(ITestContext context)
	{
		
	}


	

	

}
