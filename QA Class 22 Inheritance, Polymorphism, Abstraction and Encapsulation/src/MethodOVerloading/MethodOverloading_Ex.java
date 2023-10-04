package MethodOVerloading;

public class MethodOverloading_Ex {
	
	
	// same method name but different parameters/arguments
	
	public void method(int a , int b) {
		System.out.println("two argument");
		
	}
	
	public void method(int a, int b,int c) {
		
		System.out.println("three arguments");
	}
public void method(double a, int b,int c) {
		
		System.out.println("double int, int arguments");
	}
public void method(int a, double b) {
	
	System.out.println("int and double arguments");
}
public void method(String a) {
	
	System.out.println("string arguments");
}
public void method(char a) {
	
	System.out.println("char arguments");
}


	public static void main(String[] args) {

MethodOverloading_Ex m = new MethodOverloading_Ex();
m.method(23.6,25,6);

	}

}
