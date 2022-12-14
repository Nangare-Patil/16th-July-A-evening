package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFail 

{
  @Test
  public void f() 
  {
	  Assert.fail();
  }
}
