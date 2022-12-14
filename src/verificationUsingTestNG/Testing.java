package verificationUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing 
{
  @Test
  public void verifycheckox() 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));

		//if(checkBox1.isSelected())
			// {
			// Reporter.log("CheckBox is selected TC is passed", true);
			// }
			// else 
			// {
			// Reporter.log("CheckBox is not selected TC is failed", true);
			// }
		
		checkBox1.click();
		Assert.assertTrue(checkBox1.isSelected(),"TC is failed checkbox is not selected");
  }
}
