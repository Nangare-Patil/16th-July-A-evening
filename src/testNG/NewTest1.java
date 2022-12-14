package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 
{
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		System.out.println("This Is Console Window");
		
		Reporter.log("Hi This Is Normal Reporter");
		
		Reporter.log("Hi This Is String Reporter", true);
		
	  
  }
}
