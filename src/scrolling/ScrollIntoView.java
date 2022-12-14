package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		WebElement legend = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));

		//scrolling into view
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		js1.executeScript("arguments[0].scrollIntoView(true)", legend);
		
		System.out.println(legend.getText());
		
		
		
		
		
		
		
		
		
	}

}
