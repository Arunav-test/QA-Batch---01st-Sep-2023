package TESTCASES;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PAGES.HomePage;
import PAGES.LoginPage;
import TESTBASE.TestBase;
import UTIL.TestUtil;

public class LogoutTest extends TestBase{

	HomePage h;
	@BeforeMethod
	public void init() throws IOException {
		//launch the browser  & url specified in the config properties file
		intialization();
       LoginPage l= new LoginPage();
       h = new HomePage();
		
		l.login("standard_user", "secret_sauce");
	}
	
	@Test
	public void logout() throws IOException {
		
		h.logout();
		
	}
	
	@AfterMethod
	public void teardown() throws IOException {
		TestUtil.Screenshot();
		driver.quit();
	}
}
