package Methods;

public class Math_Op {
	
	public void mul() {
		
		int a=5;
		int b=7;
		int c=a*b;
		
		System.out.println("Mutliplication of two numbers is "+a+" and "+b+" is "+c);

	}
public void div() {
		
		int a=20;
		int b=5;
		int c=a*b;
		
		System.out.println("Division of two numbers is "+a+" and "+b+" is "+c);

	}

	public static void main(String[] args) {
		Math_Op mat= new Math_Op();
		mat.mul();
		mat.mul();
		mat.mul();
		mat.mul();
		mat.mul();
		mat.mul();
		
	}

}
