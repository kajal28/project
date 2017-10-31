package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivjay\\Desktop\\selenium setup\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.bluestone.com//");
		Actions a=new Actions(d);
		a.moveToElement(d.findElement(By.linkText(""))))

	}

}
