package Annotations;

import org.testng.annotations.Test;

public class invocationTimeoutEg {
	
	@Test(invocationTimeOut=2)
	public void loop() {
		
		int limit=2;
		int i=0;
		
		while(i<limit)
			System.out.println(i);
	}

}
