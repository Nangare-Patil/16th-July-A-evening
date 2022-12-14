package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn 
{
	@Test
	 public void D() throws InterruptedException
	 {
	 Thread.sleep(100);
	 Reporter.log("D method is running", true);
	 }
	 @Test(timeOut = 100)
	 public void B() throws InterruptedException
	 {
	 //Thread.sleep(500);
	 Reporter.log("B method is running", true);
	 }
	 @Test(dependsOnMethods = {"B","C"}, invocationCount = 3)
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
