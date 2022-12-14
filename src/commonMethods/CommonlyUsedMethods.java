package commonMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods 
{

	//screenshot method
	public static void takeScreenShot(WebDriver driver, String name) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("F:\\Selenium\\ScreenShots"+name+".png");
	FileHandler.copy(src, dest);
	}
	//scorllinto view
	public static void scrollIntoView(WebDriver driver,WebElement element )
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
}
