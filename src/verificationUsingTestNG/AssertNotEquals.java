package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals 
{
  @Test
  public void demo() 
  {
	  String a="abc";
	  String b="abc";
	  
	  Assert.assertNotEquals(a, b,"a and b are same Tc is failed");
	   
  }
}
