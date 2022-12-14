package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTesting
{
	WebDriver driver;
	@Parameters("browserName")
  @Test
  public void browserTest(String bname) 
  {
	 if(bname.equals("firefox")) 
	 {
		 System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//geckodriver.exe");
			
		 driver=new FirefoxDriver();	
	 }
	 else if (bname.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
			
		 driver=new ChromeDriver();	
	 }
	 
	 driver.get("https://paytm.com/");
	 driver.manage().window().maximize();
  }
}
