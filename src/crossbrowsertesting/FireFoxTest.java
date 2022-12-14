package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest 

{
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		
  }
}
