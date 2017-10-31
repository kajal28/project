package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Good Times\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://mail.google.com/mail/u/0/#inbox");
		WebElement e = d.findElement(By.id("identifierId"));
		e.click();
		e.sendKeys("mago.kajal");
		d.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		d.findElement( By.name("password")).sendKeys("8425906003kajal");
		Thread.sleep(1000);
		d.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Inbox"));

	}

}
