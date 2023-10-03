package Methods;

public class Method_Ex {
	//accessmodifier returnType methodName
	
	public void addition()
	{	
	int a=50;
	int b=30;
	int c=a+b;
	System.out.println("Addition of two numbers is "+a+" and "+b+" is "+c);
	}
	
	
	public void subraction()
	{	
	int m=50;
	int n=30;
	int k=m-n;
	System.out.println("Subraction of two numbers is "+m+" and "+n+" is "+k);
}

	public static void main(String[] args) {
		
		//ClassName objectname = new ClassName();
		Method_Ex m = new Method_Ex();
		m.addition();
		m.addition();
		m.addition();
		m.addition();
		m.addition();
		
		
	}	
		

}
