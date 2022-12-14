package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals
{
  @Test
  public void demo() 
  
  {
	  String a="Akshay";
	  String b="Akshay";
	  
	  //if both are same or equal then TC should be pass
	  
	  Assert.assertEquals(a, b,"a and b are not matching TC failed");
  }
}
