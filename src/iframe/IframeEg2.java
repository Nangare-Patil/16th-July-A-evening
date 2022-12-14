package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 
{

	public static void main(String[] args) 
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.switchTo().frame("courses-iframe");// switching selenium focus from main page to iframe
		
		String myText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity')]")).getText();
		System.out.println(myText);
		
		driver.switchTo().defaultContent();// switching selenium focus from iframe to main page
		
		String myText1 = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
		System.out.println(myText1);

		

	}

}
