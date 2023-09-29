package arrays;

public class Array_Ex {

	public static void main(String[] args) {
		//DataType[] arrayName= new DataType[size]
		
		String[] Students= new String[5];
		Students[3]="Steve";
		Students[2]="Henry";
		Students[0]="Kevin";
		Students[2]="Mary";
		
		System.out.println(Students.length);
		
		/*
		 * System.out.println(Students[0]); System.out.println(Students[1]);
		 * System.out.println(Students[2]); System.out.println(Students[3]);
		 * System.out.println(Students[4]);
		 */
		
		for(int i=0;i<Students.length;i++) {
			
			System.out.println(Students[i]);
		}
		

	}

}
