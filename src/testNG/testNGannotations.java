package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations 
{
	@Test
	 public void myTest () 
	 {
	 Reporter.log("Hi this is MyTest", true);
	 }
	 
	 @Test
	 public void myTest1 () 
	 {
	 Reporter.log("Hi this is MyTest1", true);
	 }
	 @BeforeMethod
	 public void beforeMethod()
	 {
	 Reporter.log("Before method is running", true);
	 }
	 
	 
	 @AfterMethod
	 public void afterMethod()
	 {
	 Reporter.log("After meethod is running", true);
	 }
	 
	 @BeforeClass
	 public void beforeClass()
	 {
	 Reporter.log("Before class is running", true);
	 }
	 
	 @AfterClass
	 public void afterClass()
	 {
	 Reporter.log("After class is running", true);
	 }
	 

}
