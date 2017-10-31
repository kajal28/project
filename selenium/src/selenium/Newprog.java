package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newprog {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Good Times\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("file:///C:/Users/Good%20Times/Desktop/demo.html");
		WebElement e = d.findElement(By.xpath("//input[@value='a']"));
		 JavascriptExecutor j = (JavascriptExecutor) d;
		 j.executeScript("arguments[0].value=arguments[1]", e , "hgghhc" , "ggtvcjhj");

	}

}
