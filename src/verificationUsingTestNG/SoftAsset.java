package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsset 

{
	SoftAssert soft=new SoftAssert(); //Created Object of Soft Assert
  @Test
  public void f() 
  {
	//if a and b are not equal and b is null then TC is passed
	  
	  String a="Hi";
	  String b="Hi";

	  soft.assertNotEquals(a, b,"a and b are equals TC is Failed");
	  soft.assertNull(b,"b is notnull TC is Failed");
	  
	  soft.assertAll();
  }
}
