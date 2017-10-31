package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Good Times\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com");
		Set<String> set=d.getWindowHandles();
		
// to close in run time
//	for(String s:set)
//	{
//		d.switchTo().window(s);
//		String s1=d.getTitle();
//		if(s1.equals("Optum"))
//		{
//			d.close();
//
//		}
//		
//  }
//	d.quit();

	Iterator<String> itr=set.iterator();
		String s1 = itr.next();
		String s2 = itr.next();
		String s3 = itr.next();
		String s4 = itr.next();
		d.switchTo().window(s3);
		d.close();
		Thread.sleep(1000);
		d.quit();
	}  
	}

