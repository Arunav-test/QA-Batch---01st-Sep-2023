package Methods;

public class Method_Ex {
	//accessmodifier returnType methodName
	
	public void addition()
	{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Addition of two numbers is "+a+" and "+b+" is "+c);

	}

	public static void main(String[] args) {
		
		//ClassName objectname = new ClassName();
		
		Method_Ex m= new Method_Ex();
		m.addition();
	}

}
