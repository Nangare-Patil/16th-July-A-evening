package TestNGUpStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EUpStoxWelcomePage1 
{

	//variable declaration
	
		@FindBy (xpath = "//div[text()='No, I’m good']") private WebElement noIamGoodButton;
		
		public EUpStoxWelcomePage1 (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void clickOnNoIamGoodButton()
		{
			noIamGoodButton.click();
		}
}
