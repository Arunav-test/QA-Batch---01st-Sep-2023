package Inheritance;

public class A {
	String name="Waynes";
	char grade='H';
	
	public void factory() {
		
		System.out.println("parent owns a factory");
	}
	
	public void house() {
		System.out.println("parent owns a house");
	}

	public static void main(String[] args) {
		
		A a = new A();
		a.factory();
		a.house();
		
		System.out.println(a.name);
		System.out.println(a.grade);
		

	}

}
