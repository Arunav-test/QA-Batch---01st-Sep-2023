package Annotations;

import org.testng.annotations.Test;

public class Priority_Eg {
	
	@Test(priority=-2)
	public void subtraction() {
		
		System.out.println("subtraction");
	}
	@Test(priority=0)
	public void additon() {
		
		System.out.println("additon");
	}
	@Test(priority=-1)
public void muliplication() {
		
		System.out.println("muliplication");
	}

@Test(priority=0)
public void division() {
	
	System.out.println("division");
}




}
