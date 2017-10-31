package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public static WebDriver driver;
	
	public BasePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public static void pageVerify(String eTitle , String aTitle)
	{
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleContains(eTitle));
//			if(eTitle.equals(aTitle))
			{
				Reporter.log("Title is matching:Pass" , true);
			}
		}
		catch (Exception e) 
		{
			Reporter.log("Title is not matching:Fail" , true);
		}
	}
	
	public static void eleVerify(WebElement element)
	{
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Error message is displayed:Pass" , true);
		}
		catch (Exception e) 
		{
			Reporter.log("Error message is not displayed:Fail" , true);
		}
	}
}
