package upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPassCodePage 

{

	//variable declare
	@FindBy(name = "yob") private WebElement yob;
	
	//variable initialize
	public UpStoxPassCodePage(WebDriver driver)
	{
	PageFactory.initElements(driver,this );
	}
	
	//methods
	public void enterPassCode()
	{
	yob.sendKeys("1991");
	}
}
