package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Good Times\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/login.php?login_attempt=1&lwv=120&lwc=1348028");
Thread.sleep(2000);
d.findElement(By.id("email")).sendKeys("8082685928");
Thread.sleep(1000);
d.findElement(By.id("pass")).sendKeys("loveukaju");
Thread.sleep(2000);
d.findElement(By.name("login")).click();

		

	}

}					
