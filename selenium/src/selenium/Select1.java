package selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

public class Select1 {

	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Good Times\\Desktop\\geckodriver.exe");
WebDriver d=new FirefoxDriver();
d.get("file:///C:/Users/Good%20Times/Desktop/dropdown1.html");
WebElement e = d.findElement(By.xpath("//select[@id='abc']"));
Select s=new Select(e);
Thread.sleep(1000);
List<WebElement> list = s.getOptions();
HashSet<String>h=new HashSet<>();
ArrayList<String> a=new ArrayList<String>();

for(WebElement e1:list)
{
	String s1=e1.getText();
	a.add(s1);
	h.add(s1);
}
for(String s2:h)
{
	int count=0;
	for(String s3:a)
		{
		if(s2.equals(s3))
		{
			count++;
		}
		}
	if(count>1)
		{
		System.out.println(s2);
		}
	}
	}
}
//if(!(h.add(s1)))


