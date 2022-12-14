package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions
{

	public static void main(String[] args) throws InterruptedException
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		//userName.sendKeys("Hi Hello");
		
		Actions act= new Actions(driver);
		//act.moveToElement(userName).sendKeys("Good even").build().perform();
		//act.sendKeys(userName, "Good night").perform();
		
		WebElement createNewAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		act.click(createNewAcc).perform();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		act.click(day).perform();
		//how to handle drop down
		// act.sendKeys(Keys.ARROW_UP).perform();
		// Thread.sleep(500);
		// act.sendKeys(Keys.ARROW_UP).perform();
		// Thread.sleep(500);
		// act.sendKeys(Keys.ARROW_UP).perform();
		// Thread.sleep(500);
		// act.sendKeys(Keys.ARROW_UP).perform();
		for(int i=1;i<=10;i++)
		{
		act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		WebElement firstname = driver.findElement(By.name("firstname"));
		act.keyDown(firstname,Keys.SHIFT).sendKeys("velocity").build().perform();

	}

}
