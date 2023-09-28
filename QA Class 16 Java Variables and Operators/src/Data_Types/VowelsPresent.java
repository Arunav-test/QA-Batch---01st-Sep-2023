package Data_Types;

public class VowelsPresent {

	public static void main(String[] args) {
		String s1="sam";
		String s2="sam";
		String s3="s";
		char s4='s';
		String v= Character.toString(s4);
		if(s3.contains(v))
			System.out.println("true");
		else
			System.out.println("false");

	}

}
