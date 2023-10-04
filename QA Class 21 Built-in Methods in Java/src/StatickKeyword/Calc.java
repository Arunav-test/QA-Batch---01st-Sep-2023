package StatickKeyword;

public class Calc {
	//static variables
	static int age=20;
	static String  name="Lee";
	
	//static method
	public static void add() {
		int a=10;
		int b=20;
		System.out.println("Adddition of two numbers is "+(a+b));
	}
	//non static method
	public  void sub() {
		int a=10;
		int b=20;
		System.out.println("Subraction of two numbers is "+(a-b));
	}

	public static void main(String[] args) {
		
		
		add();
		Calc c = new Calc();
		c.sub();
		System.out.println(age);
		System.out.println(name);

	}

}
