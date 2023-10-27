package TESTCASES;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PAGES.LoginPage;
import TESTBASE.TestBase;
import UTIL.TestUtil;

public class LoginTest extends TestBase{
	
	@BeforeMethod
	public void init() throws IOException {
		//launch the browser  & url specified in the config properties file
		intialization();
	}
	
	@Test(priority=1)
	public void validLogin() throws IOException {
		
		LoginPage l= new LoginPage();
		
		l.login("standard_user", "secret_sauce");
	String actual=	driver.findElement(By.xpath("//span[@class='title']")).getText();
		
		assertEquals(actual, "Products");
		
		
		
	}
	
	@Test(priority=2)
	public void invalidLogin() throws IOException {
		
		LoginPage l= new LoginPage();
		
		l.login("username1", "secret_sauce");
		
String actual=	driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		
		assertEquals(actual, "Epic sadface: Username and password do not match any user in this service");
		
		
	}
	
	@AfterMethod
	public void teardown() throws IOException {
		TestUtil.Screenshot();
		driver.quit();
	}

}
