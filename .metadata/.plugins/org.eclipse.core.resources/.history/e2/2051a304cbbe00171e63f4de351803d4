package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException
	{
  System.setProperty("webdriver.gecko.driver","C:\\Users\\Good Times\\Desktop\\geckodriver.exe");
  WebDriver d=new FirefoxDriver();
  d.get("https://demo.actitime.com/login.do;jsessionid=BB3B8FB58DFB1EF05FC62080DBC6AB1F");
  d.findElement(By.id("username")).sendKeys("admin");
  Thread.sleep(2000);
  d.findElement(By.name("pwd")).sendKeys("manager");
  Thread.sleep(1000);
  d.findElement(By.linkText("Login ")).click();
	}

}
