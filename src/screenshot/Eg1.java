package screenshot;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;


public class Eg1 

{

	public static void main(String[] args)
	
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
			driver.get("https://vctcpune.com/selenium/practice.html");
				
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println(source);
			
			File destination = new File("F:\\Selenium\\ScreenShots\\myFile.png");//png,jpg,jpeg
			
		


	}

}
