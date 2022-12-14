package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodUse 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		

	}

}
