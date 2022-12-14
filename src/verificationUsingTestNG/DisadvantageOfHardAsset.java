package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisadvantageOfHardAsset 
{
  @Test
  public void f()
  {
	  String a=null;
	  String b=null;
	  
	  //if both are not equal and b is not null then TC should be pass)
	  
	  Assert.assertNotEquals(a, b,"a and b are equal TC is Failed");
	  Assert.assertNotNull(b,"b is null TC is failed");
	  
  }
}
