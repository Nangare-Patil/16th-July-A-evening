package upstoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage1 

{

	//variable declaration(globally)--> no of elements = no of variable
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(name="userId") private WebElement userID;
	
	@FindBy(id="password") private WebElement password;
	
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signInButton;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public UpStoxLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Utilize within a method with access level public

	public void enterUserID()
	{
		userID.sendKeys("BB3263");
	}
	
	public void enterPassword()
	{
		password.sendKeys("Rajendra@123");
	}
	
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	
	
	
	
}
