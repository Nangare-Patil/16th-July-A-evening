package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserID 
{
  @Test
  public void validateUpstoxUserID() 
  {
	  Reporter.log("Reporter ID Validated", true);
  }
  
  @BeforeMethod
  public void loginToUpstox()
  {
  Reporter.log("Login success...",true);
  }
  
  @AfterMethod
  public void logOutFromUpstox()
  {
  Reporter.log("Logging Out", true);
  }
  @BeforeClass
  public void launchBrowser()
  {
  Reporter.log("launching Browser", true);
  }
  @AfterClass
  public void closeBrowser()
  {
  Reporter.log("closing browser", true);
  }
}
