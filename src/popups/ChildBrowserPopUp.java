package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		String mainPageID = driver.getWindowHandle();
		
		System.out.println(mainPageID);
		
		// clicking on new window button--> will open new child browser
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allPageIds = driver.getWindowHandles();
		
		//printing all ids
		
		System.out.println(allPageIds);
		Iterator<String> it = allPageIds.iterator();
		
		//getting IDs of all pages
		
		String idOfMainPage = it.next();
		String idOfChildPage = it.next();
		
		//we need to switch to child page
		
		driver.switchTo().window(idOfChildPage);//my focus changed from Main page to child page
		driver.manage().window().maximize();
		
		//driver.close();
		//driver.quit();
		//current focus is on child page---> actions will be done on child page now
		driver.findElement(By.id("the7-search")).sendKeys("Good evening");
		Thread.sleep(5000);
		
		// if we want to do actions again on page then we have to switch focus form child to main page
		
		driver.switchTo().window(idOfMainPage);
		String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		System.out.println("Main page text is "+myText);


	}

}
