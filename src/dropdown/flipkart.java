package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart

{

	public static void main(String[] args) throws InterruptedException
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.flipkart.com/");
		
		Thread.sleep(700);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Thread.sleep(1000);


		WebElement fashion = driver.findElement(By.xpath("//div[@class='eFQ30H'][4]"));

		Actions action = new Actions(driver);

		
		action.moveToElement(fashion).perform();
		
		Thread.sleep(1000);
		
		WebElement MensBottomWear = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		
		Thread.sleep(700);
		
		action.moveToElement(MensBottomWear).click().perform();
	
		
		

	}

}
