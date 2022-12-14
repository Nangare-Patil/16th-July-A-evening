package upstoxexcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EUpStoxTest 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium-java-4.4.0 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//read data from excel
		File myFile= new File("F:\\Selenium\\New Microsoft Excel Worksheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		String userid = mySheet.getRow(0).getCell(0).getStringCellValue();

		
		//create an object of upStoxLoginPage
		EUpstoxLoginPage login=new EUpstoxLoginPage(driver);
		login.enterUserName(userid);
		login.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnSignInButton();
		

		//create an object of upStoxPasscodePage
		Thread.sleep(1000);
		EUpstoxPasscodePage passcode= new EUpstoxPasscodePage(driver);
		passcode.sendPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
		
		//create an object of upStoxWelcomePage
		Thread.sleep(8000);
		EUpStoxWelcomePage welcome= new EUpStoxWelcomePage(driver);
		welcome.clickOnNoIamGoodButton();
		
		//create an object of upStoxHomePage
		Thread.sleep(8000);
		EUpstoxHomePage home= new EUpstoxHomePage(driver);
		home.validateUserID(mySheet.getRow(0).getCell(3).getStringCellValue(), driver);
		home.clickOnFundsButton();
		
		//create an object of upStoxFundsPage
		Thread.sleep(1000);
		EUpStoxFundsPage fund= new EUpStoxFundsPage(driver);
		fund.getMyFunds();
		Thread.sleep(4000);
		home.logout();
		driver.close();

	}

}
