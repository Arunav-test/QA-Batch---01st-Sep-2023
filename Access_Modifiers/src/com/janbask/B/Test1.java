package com.janbask.B;

import com.janbask.A.Protected_Example;

public class Test1 extends Protected_Example{

	public static void main(String[] args) {
	
		
		Test1 t= new Test1();
		System.out.println(t.age);
		System.out.println(t.name);
		t.method1();

	}

}
