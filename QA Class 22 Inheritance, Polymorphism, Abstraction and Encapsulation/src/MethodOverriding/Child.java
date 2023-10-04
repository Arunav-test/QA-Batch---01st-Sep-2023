package MethodOverriding;

public class Child extends Parent {
	
	public void car() {
		System.out.println("child owns a car");
	}
	//method overriding- is a relationship/inheritance
	public void house() {
		System.out.println("child owns a house given by parent");
	}

	public static void main(String[] args) {

Child c = new Child();
c.car();
c.factory();
c.house();

	}

}
