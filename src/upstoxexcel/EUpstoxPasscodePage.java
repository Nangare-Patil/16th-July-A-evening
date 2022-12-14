package upstoxexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EUpstoxPasscodePage 

{

	
	@FindBy (name="yob") private WebElement passcode;
	
	public EUpstoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  sendPasscode(String passcd)
	{
		passcode.sendKeys(passcd);
	}
}
