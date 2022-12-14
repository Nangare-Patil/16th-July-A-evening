package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodUse 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();//created object of chromeDriver
		
		//1. get- to enter url in browser or to open an application.
		driver.get("https://paytm.com/");
		
		//2. close: to close the current tab of the browser opened by Selenium tool.
		//driver.close();
		
		//quit: to close the all the tabs present in browser opened by Selenium tool.
		driver.quit();

	}

}
