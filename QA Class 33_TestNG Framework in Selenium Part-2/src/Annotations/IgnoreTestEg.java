package Annotations;

import org.testng.annotations.Test;

public class IgnoreTestEg {
	
	@Test(enabled=true)
	public void logintest() {
		
		System.out.println("login test");
	}
	
@Test	
public void carttest() {
		
		System.out.println("cart test");
	}


}
