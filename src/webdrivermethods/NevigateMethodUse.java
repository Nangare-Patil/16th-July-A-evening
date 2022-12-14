package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigateMethodUse 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();//created object of chromeDriver
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://kite.zerodha.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();


	}

}
