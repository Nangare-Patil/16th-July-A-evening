package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 

{

	protected WebDriver driver;
	
	public void launchBrowser() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://neostox.com/");
		
		Reporter.log("Launching Browser",true);
		
		Thread.sleep(1000);
		
	}
	
	
}
