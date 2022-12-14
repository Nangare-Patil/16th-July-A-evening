package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled 
{
	@Test
	 public void D()
	 {
	 Reporter.log("D method is running", true);
	 }
	 @Test(enabled = false)
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
