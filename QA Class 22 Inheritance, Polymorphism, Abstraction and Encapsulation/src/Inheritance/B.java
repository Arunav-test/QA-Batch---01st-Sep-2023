package Inheritance;

public class B extends A{
	
	public void car() {
		
		System.out.println("child owns a car");
	}

	public static void main(String[] args) {
		
		B b = new B();
		b.car();
		b.house();
		b.factory();
		System.out.println(b.name);
		System.out.println(b.grade);

	}

}
