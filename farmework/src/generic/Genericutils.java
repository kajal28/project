package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Genericutils extends BaseTest
{
	public static void selectByText(WebElement element , String str)
	{
		Select s = new Select(element);
		s.selectByVisibleText(str);
	}
	
	public static void selectByIndex(WebElement element , int n)
	{
		Select s = new Select(element);
		s.selectByIndex(n);
	}
	
	public static void mouseHover(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	public static void scroll(int x , int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x+","+y+")", "");
	}
}
