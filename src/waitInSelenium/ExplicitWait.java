package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWait 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(5000));
		
		w.until(ExpectedConditions.elementSelectionStateToBe(driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")), true));
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	}

}
