package Annotations;

import org.testng.annotations.Test;

public class ExceptionExpected {
	
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void exceptionExample() {
		int[] a = new int[3];
		a[3]=2;
		System.out.println(a[3]);
		
	}

}
