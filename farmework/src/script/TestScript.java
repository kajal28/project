package script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class TestScript extends BaseTest
{
	public LoginPage l;
	@Test
	public void invalidlogin() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		 l= new LoginPage(driver);
		l.urname().sendKeys(Excel.readData("Sheet1", 1, 1));
		l.passwrd().sendKeys(Excel.readData("Sheet1", 1, 2));
		l.loginbtn().click();
		BasePage.eleVerify(l.errorMsg());
	}
	
	@Test
	public void validLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		l= new LoginPage(driver);
		l.urname().sendKeys(Excel.readData("Sheet1", 2, 1));
		l.passwrd().sendKeys(Excel.readData("Sheet1", 2, 2));
		l.loginbtn().click();
		Thread.sleep(2000);
		BasePage.pageVerify(driver.getTitle(), "actiTIME-Enter Time-Track");
		l.logoutlink().click();
	}
}
