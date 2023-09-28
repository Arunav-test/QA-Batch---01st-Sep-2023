package Conditions;

public class GreatestThreeNumbers {

	public static void main(String[] args) {
		int a=20;
		int b=40;
		int c=150;
		
		if(a>b & a>c)
        System.out.println(a+" is greatest");
		else if(b>c)
			System.out.println(b+" is greatest");
		else
			System.out.println(c+" is greatest ");
	}

}
