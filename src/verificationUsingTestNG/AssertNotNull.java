package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull 
{
  @Test
  public void f() 
  {
	  String a="Karad";
	  
	  Assert.assertNotNull(a, "a is null TC is failed");
	  
  }
}
