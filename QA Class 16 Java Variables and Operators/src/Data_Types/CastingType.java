package Data_Types;

public class CastingType {

	public static void main(String[] args) {
		
		int a=(int) 20.38;
		
		char c='A';
		String v= Character.toString(c);
		
		if(v.equals(c))
			System.out.println("true");
		else
			System.out.println("false");
		
		
		double b= 30;
		
		System.out.println(b);
		System.out.println(a);
		
		String value="234";
		int j= Integer.parseInt(value);//converting string to integer
		
		int output=j/2;
		System.out.println(output);
		

	}

}
