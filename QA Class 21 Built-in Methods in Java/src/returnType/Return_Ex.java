package returnType;

public class Return_Ex {
	
	public int add() {
		
		int a =20;
		int b=10;
		int c=a+b;
		
		return c;
	}
	
	public static void main(String[] args) {
		
		Return_Ex r = new Return_Ex();
		int value= r.add();
		System.out.println(value);
		if(value%2==0)

			System.out.println("even number");
		else
			System.out.println("odd number");
		
		
	}
}
