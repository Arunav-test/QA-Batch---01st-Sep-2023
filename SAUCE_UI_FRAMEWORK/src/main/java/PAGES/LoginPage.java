package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TESTBASE.TestBase;

public class LoginPage extends TestBase {
	
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement uname;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	
	
	public void login(String username, String password) {
		
		uname.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		
	}

}
