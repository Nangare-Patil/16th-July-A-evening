package TestNGUpStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class EUpStoxTest1 
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
		EUpstoxLoginPage1 login=new EUpstoxLoginPage1(driver);
		login.enterUserName(userid);
		login.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnSignInButton();
		

		//create an object of upStoxPasscodePage
		Thread.sleep(1000);
		EUpstoxPasscodePage1 passcode= new EUpstoxPasscodePage1(driver);
		passcode.sendPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
		
		//create an object of upStoxWelcomePage
		Thread.sleep(8000);
		EUpStoxWelcomePage1 welcome= new EUpStoxWelcomePage1(driver);
		welcome.clickOnNoIamGoodButton();
		
		//create an object of upStoxHomePage
		Thread.sleep(8000);
		EUpstoxHomePage1 home= new EUpstoxHomePage1(driver);
		home.validateUserID(mySheet.getRow(0).getCell(3).getStringCellValue(), driver);
		home.clickOnFundsButton();
		
		//create an object of upStoxFundsPage
		Thread.sleep(1000);
		EUpStoxFundsPage1 fund= new EUpStoxFundsPage1(driver);
		fund.getMyFunds();
		Thread.sleep(4000);
		home.logout();
		driver.close();


	}

}
