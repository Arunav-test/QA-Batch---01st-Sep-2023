package Annotations;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LoginRetry {
	
	@Test(retryAnalyzer=Annotations.RetryLogic.class)
	public void logintest() {
		
		System.out.println("login test");
		assertEquals(true, false);
	}
	
	@Test(retryAnalyzer=Annotations.RetryLogic.class)
public void carttest() {
		
		System.out.println("cart test");
		assertEquals(true, false);
	}
	

}
