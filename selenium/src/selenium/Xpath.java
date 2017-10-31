package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Xpath {

	private static Object e;

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.gecko.driver","C:\\Users\\Good Times\\Desktop\\geckodriver.exe");
WebDriver d=new FirefoxDriver();
//d.get("file:///C:/Users/Good%20Times/Desktop/demo2.html");
//Thread.sleep(1000);
//d.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("A");
//Thread.sleep(1000);
//d.findElement(By.xpath("(//input)[1]")).sendKeys("hello");
// (to select all and comment use ctrl=7)
//
//d.get("https://demo.actitime.com/login.do;jsessionid=BB3B8FB58DFB1EF05FC62080DBC6AB1F");
//d.findElement(By.id("username")).sendKeys("admin");
//Thread.sleep(2000);
//d.findElement(By.name("pwd")).sendKeys("manager");
//Thread.sleep(1000);
//d.findElement(By.xpath("//a[.='Login ']")).click();


d.get("https://www.goibibo.com/bus/#home");
//Thread.sleep(1000);
//WebElement e = d.findElement(By.id("gi_source"));
//e.click();
//e.sendKeys("ban");
//Thread.sleep(1500);
//d.findElement(By.xpath("//span[.='Bangalore, Karnataka']")).click();
//Thread.sleep(1500);
//WebElement e1= d.findElement(By.id("gi_destination"));
//e1.click();
//e1.sendKeys("che");
//Thread.sleep(2000);
//d.findElement(By.xpath("//span[.='Chennai, Tamil Nadu']")).click();
//Thread.sleep(2000);
////d.findElement(By.className("icon-calendar1 ico22 lh1-2 widgetCalIcon ")).click();
////Thread.sleep(2000);
//d.findElement(By.id("gi_search_btn")).click();
//Thread.sleep(2000);
//d.findElement(By.xpath("//span[.='National  travels']/../../..//span[.='11:30']/../../..//button[.='Select Seats']")).click();
JavascriptExecutor j=(JavascriptExecutor) d;
j.executeScript("document.getElementById('gi_source').value='banglore';","");
Thread.sleep(1000);
j.executeScript("document.getElementById('gi_search_btn').click();", "");
Thread.sleep(3000);
j.executeScript("window.scrollBy(0,2500);", "");
Thread.sleep(2000);
j.executeScript("window.scrollBy(0,-2500);", "");


	}

	
	}
	
	


