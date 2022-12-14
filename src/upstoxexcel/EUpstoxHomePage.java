package upstoxexcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.CommonlyUsedMethods;

public class EUpstoxHomePage 

{

	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private  WebElement userId;
	@FindBy(id="funds") private WebElement funds;
	@FindBy(xpath = "//div[text()='Logout']") private WebElement logOutButton;
	
	public EUpstoxHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  validateUserID (String expUN, WebDriver driver) throws IOException
	{
		String actualUserName= userId.getText();
		
		
		//scroll to userID
		CommonlyUsedMethods.scrollIntoView(driver, userId);
		//take screenSHot
		CommonlyUsedMethods.takeScreenShot(driver, actualUserName);
		
		
		if(actualUserName.equals(expUN))
		{
			System.out.println("Actual and Expected UserNAme are matching TC is Passed");
		}
		else
		{
			System.out.println("Actual and Expected UserNAme are not matching TC is failed");
		}	
	}
	
	public void clickOnFundsButton()
	{
	funds.click();
	}
	public void logout() throws InterruptedException
	{
	 userId.click();
	 Thread.sleep(500);
	 logOutButton.click();
	}
	
	
	
	
	
	
}

