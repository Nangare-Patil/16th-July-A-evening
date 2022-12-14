package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		Thread.sleep(1000);
		//1st way
		// String myText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText();
		//
		// System.out.println("text is "+myText);
		//2nd way
		//System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText());
		//3rd way
		WebElement myElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		System.out.println(myElement.getText());


	}

}
