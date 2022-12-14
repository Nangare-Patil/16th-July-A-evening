package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut
{
  @Test (timeOut = 200)
  public void D() throws InterruptedException 
  {
	  Thread.sleep(100);
	  Reporter.log("Method D is Running", true);
  }
  
  @Test
  public void B()
  {
      Reporter.log("B method is running", true);
  }
  
  @Test
  public void A()
  {
     Reporter.log("A method is running", true);
  }
  
  @Test
  public void C()
  {
     Reporter.log("C method is running", true);
  }

}
