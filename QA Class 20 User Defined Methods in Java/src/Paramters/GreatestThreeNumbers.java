package Paramters;

public class GreatestThreeNumbers {
	
	public void greatestthree(int a, int b , int c) {
		
		if(a>b & a> c)
			System.out.println(a+ "is greatest");
		else if(b>c)
			System.out.println(b+" is greatest");
		else 
			System.out.println(c+" is greatest");
		
		
		
	}

	public static void main(String[] args) {
		GreatestThreeNumbers g = new GreatestThreeNumbers();
		g.greatestthree(20, 10, 30);
		
		g.greatestthree(15, 21, 39);

	}

}
