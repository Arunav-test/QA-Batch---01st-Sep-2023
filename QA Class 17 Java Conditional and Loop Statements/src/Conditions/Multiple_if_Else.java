package Conditions;

public class Multiple_if_Else {

	public static void main(String[] args) {
		int a=20;
		int b=40;
		int c=150;
		
		if(a>b)
		{
			if(a>c)
				System.out.println(a+" is greater");
		}
		else if(b>c)
			System.out.println(b+" is greater");
		else
			System.out.println(c+" is greater");
			
	}

}
