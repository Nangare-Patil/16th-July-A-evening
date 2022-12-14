package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();//created object of chromeDriver
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		String expectedTitle="Velocity | Best software testing centre in Pune and Mumbai";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
		System.out.println("Title is matching TC is passed");
		}
		else
		{
		System.out.println("Title is not matching TC is failed");
		}
		driver.close();


	}

}
