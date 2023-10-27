package TESTCASES;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PAGES.HomePage;
import PAGES.LoginPage;
import TESTBASE.TestBase;
import UTIL.TestUtil;

public class HomeTest extends TestBase {
	
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
	public void addcart() throws IOException {
		

		
		h.addtocart();
		
	}
	
	@Test
	public void removecart() throws IOException {

		
		h.removecart();
		
		
	}
	@Test
	public void verifyFacebook() throws IOException {
		
		
	    h.clickFacebook();
	    String actual= driver.getTitle();
	    
	    assertEquals(actual, "Swag Labs");
	    
		
	}
	
	@Test
	public void filter() {
		h.filter("lohi");
		
		
		
	}
	@AfterMethod
	public void teardown() throws IOException {
		TestUtil.Screenshot();
		driver.quit();
	}


}
