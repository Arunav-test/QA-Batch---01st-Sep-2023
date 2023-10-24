package Annotations;

import org.testng.annotations.Test;

public class GroupTestEg {
	
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("****** test1 ************");
	}
	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("****** test2 ************");
	}
	@Test(groups= {"smoke"})
	public void test3() {
		System.out.println("****** test3 ************");
	}
	@Test(groups= {"reg"})
	public void test4() {
		System.out.println("****** test4 ************");
	}
	@Test(groups= {"smoke"})
	public void test5() {
		System.out.println("****** test5 ************");
	}
	@Test(groups= {"sanity"})
	public void test6() {
		System.out.println("****** test6 ************");
	}

}
