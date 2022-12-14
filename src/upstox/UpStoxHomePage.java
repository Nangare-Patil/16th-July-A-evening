package upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxHomePage 

{

	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userId;
	@FindBy(id = "funds") private WebElement funds;
	@FindBy(xpath = "//div[text()='Logout']") private WebElement logOutButton;
	public UpStoxHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void validateUserID()
	{
	String actualUSerID = userId.getText();
	String expectedUserID="Rajendra J.";
	
	if(actualUSerID.equals(expectedUserID))
	{
	System.out.println("Actual and Expected UserID are matching TC is Passed");
	}
	else
	{
	System.out.println("Actual and Expected UserID are not matching TC is Failed");
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
