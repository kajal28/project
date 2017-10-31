package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Good Times\\Desktop\\chromedriver.exe");
		  WebDriver d=new ChromeDriver();
		  d.get("file:///C:/Users/Good%20Times/Desktop/multiple%20dropdown.html");
		  
	//	 WebElement e = d.findElement(By.xpath("//select[@id='abc']"));
		 
		  Select s=new Select(d.findElement(By.xpath("//select[@id='abc']")));
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
		  s.selectByVisibleText("C");
		  Thread.sleep(2000);
		  s.selectByVisibleText("B");
		  r.keyRelease(KeyEvent.VK_CONTROL);

		
		  
		  
		
		
	}
	

}
