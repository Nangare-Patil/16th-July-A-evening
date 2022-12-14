package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
{
  @Test (invocationCount = 5)
  public void InvocationsCount() 
  {
	  Reporter.log("My Method Is Running", true);
  }
}
