package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue 
{
  @Test
  public void f() 
  
  {
	  boolean a=true;
	  
	  Assert.assertTrue(a,"a is false TC is failed");
  }
}
