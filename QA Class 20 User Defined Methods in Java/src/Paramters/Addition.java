package Paramters;

public class Addition {
	
	//method with arguments/parameters
	public void add(int a, int b)
	{

	int c=a+b;
	System.out.println("Addition of two numbers is "+a+" and "+b+" is "+c);

	}

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(10,20);
		a.add(30,40);
		a.add(15,25);
	}

}
