package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");//switching selenium focus from main page to frame
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		driver.switchTo().defaultContent();//switching selenium focus from frame to main page
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();

		
		

	}

}
