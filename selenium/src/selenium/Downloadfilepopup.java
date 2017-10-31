package selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Downloadfilepopup
{
		public static void main(String[] args) throws InterruptedException, AWTException
		{
			
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Good Times\\Desktop\\geckodriver.exe");
			WebDriver d = new FirefoxDriver();
			d.get("http://docs.seleniumhq.org/download/");
			Thread.sleep(2000);
			

			
			d.findElement(By.xpath("//a[contains(.,'3.6.0')]")).click();
			Thread.sleep(3000);
		Robot r=new Robot();
	Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_LEFT);
	r.keyRelease(KeyEvent.VK_LEFT);			
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
			d.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
			
			
			
			
	}

}

