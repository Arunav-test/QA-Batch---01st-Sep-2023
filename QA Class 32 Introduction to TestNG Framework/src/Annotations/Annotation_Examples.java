package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Examples {
	
	@AfterMethod
	public void teardown() {
		
		System.out.println("***************calling tear down method*************8");
	}


	@Test
	public void method1() {
		System.out.println("Calling method 1");
	}
	@Test
	public void method2() {
		System.out.println("Calling method 2");
	}
	@BeforeMethod
	public void setup() {
		
		System.out.println("**************calling set up method**************");
	}
	@Test
	public void method3() {
		System.out.println("Calling method 3");
	}
	
	@BeforeTest
	public void init() {
		
		System.out.println("^^^^^^^^^^^^ init ^^^^^^^^^^^^^^^^^^^");
	}
	
	@AfterTest
	public void close() {
		
		System.out.println("^^^^^^^^^^^^^^^^ close ^^^^^^^^^^^^^^^^^");
	}
	
	@BeforeClass
	public void start() {
		System.out.println("###################start############");
	}
	@AfterClass
	public void end() {
		System.out.println("###################end############");
	}
}
