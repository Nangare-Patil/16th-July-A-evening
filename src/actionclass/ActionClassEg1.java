package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEg1 

{

	public static void main(String[] args) throws InterruptedException
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Mouse action--> move to Element
		
		//1.Create object of Actions class and pass driver object as an argument
		Actions act= new Actions(driver);
		
		//2.By using one of the actions class methods perform required actions
		Thread.sleep(3000);
		
		WebElement refElement = driver.findElement(By.linkText("SALES"));
		act.moveToElement(refElement).perform();
		Thread.sleep(3000);
		
		//Mouse action--> click
		WebElement clickMe = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
		// act.moveToElement(clickMe).perform();
		// Thread.sleep(7000);
		// act.click().perform();
		// act.moveToElement(clickMe).click().build().perform();
		// act.click(clickMe).perform();

		//Mouse action--> Drag and Drop
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target = driver.findElement(By.id("amt8"));
		
		//act.moveToElement(source).clickAndHold().release(target).build().perform();
		act.dragAndDrop(source, target).perform();
		
	}

}
