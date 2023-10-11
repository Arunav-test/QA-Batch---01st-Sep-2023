package com.janbask.C;

import com.janbask.A.Protected_Example;

public class T extends Protected_Example{

	public static void main(String[] args) {
		
		/*
		 * Protected_Example p = new Protected_Example(); System.out.println(p.age);
		 * System.out.println(p.name); p.method1();
		 */
		
		T t = new T();
		System.out.println(t.age);
		System.out.println(t.name);
		t.method1();

	}

}
