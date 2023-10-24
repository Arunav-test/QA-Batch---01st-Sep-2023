package Annotations;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Depends {
	
	@Test()
	public void login() {
		
		System.out.println("login ");
		assertEquals("product", "products");
	}
	
	@Test(dependsOnMethods="login")
	public void logout() {
		System.out.println("logout ");
	}
	
	@Test(dependsOnMethods="logout")
	public void cart() {
		System.out.println("cart ");
	}

}
