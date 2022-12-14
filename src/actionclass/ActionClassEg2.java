package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEg2 
{

	public static void main(String[] args) 
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Mouse action--> Double Click
		//1.Create object of Actions class and pass driver object as a Argument
		Actions act= new Actions(driver);
		
		//2. By using one of the actions class methods, perform desired action
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		// act.moveToElement(doubleClickButton).perform();
		// act.doubleClick().perform();
		// act.moveToElement(doubleClickButton).doubleClick().build().perform();
		// act.doubleClick(doubleClickButton).perform();
		//Mouse action--> Context Click-->(Right Click)
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		// act.moveToElement(rightClickButton).perform();
		// act.contextClick().perform();
		// act.moveToElement(rightClickButton).contextClick().build().perform();
		act.contextClick(rightClickButton).perform();


	}

}
