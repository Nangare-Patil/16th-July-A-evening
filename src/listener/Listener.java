package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Listener implements ITestListener

{
	@Override
	public void onTestSuccess(ITestResult result) 
	{
	String methodName = result.getName();
	Reporter.log("TC "+methodName+" is completed successfuly",true);
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
	Reporter.log("TC "+result.getName()+ " is failed",true);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
	Reporter.log("TC "+result.getName()+" is skipped please check",true);
	}
}
