package selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class downloadpopupfile {
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxProfile f=new FirefoxProfile();
		f.setPreference("browser.download.folderList", 0);
		f.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Good Times\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver(f);
		d.get("http://docs.seleniumhq.org/download/");
		//Thread.sleep(2000);
		d.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();

}
}