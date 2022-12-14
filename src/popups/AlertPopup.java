package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(1000);
		
		String myText = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		System.out.println(myText);

		

	}

}
