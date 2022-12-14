package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetCurrentUrl 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();//created object of chromeDriver
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		String myTitle = driver.getTitle();
		System.out.println("Title of webPage is "+myTitle);
		
		System.out.println(driver.getCurrentUrl());
		String myUrl = driver.getCurrentUrl();
		System.out.println("My current url is "+myUrl);


	}

}
