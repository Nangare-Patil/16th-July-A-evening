package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse 
{
  @Test
  public void f() 
  {
	  boolean b=false;
	  
	  Assert.assertFalse(b,"b is true TC is Failed");
  }
}
