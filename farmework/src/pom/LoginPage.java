package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement urname;
	
	@FindBy(name="pwd")
	private WebElement passwrd;
	
	@FindBy(xpath="//div[.='Login']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement errorMsg;
	
	@FindBy(xpath="//a[@id='logoutLink']/..")
	private WebElement logout;
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement urname()
	{
		return urname;
		
	}
	
	public WebElement passwrd()
	{
		return passwrd;
		
	}
	
	public WebElement loginbtn()
	{
		return loginbtn;
		
	}
	
	public WebElement errorMsg()
	{
		return errorMsg;
		
	}
	
	public WebElement logoutlink()
	{
		return logout;
	}

	
	
}
