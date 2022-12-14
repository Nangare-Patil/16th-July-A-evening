package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame 

{

	public static void main(String[] args) 
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		
		WebElement mainPageElement = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		System.out.println("Main page element text is "+mainPageElement.getText());
		
		//switching focus from main page to parent frame
		driver.switchTo().frame("frame1");
		String parentFrametext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(parentFrametext);
		
		//switching focus from parent frame to child frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		String childFrametext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(childFrametext);
		
		//to get text from main page, need to switch selenium focus from child frame to main page
		driver.switchTo().defaultContent();
		System.out.println(mainPageElement.getText());


	}

}
