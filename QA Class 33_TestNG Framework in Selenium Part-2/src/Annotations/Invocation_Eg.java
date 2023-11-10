package Annotations;

import org.testng.annotations.Test;

public class Invocation_Eg {
	
	@Test(invocationCount=10)
	public void register() {
		
		System.out.println("Registeration");
	}

}
