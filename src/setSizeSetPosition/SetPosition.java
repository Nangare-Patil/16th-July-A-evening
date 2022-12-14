package setSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition 
{

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		Point position = driver.manage().window().getPosition();
		
		System.out.println(position);
		
		Point p=new Point(60, 10);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		

	}

}
