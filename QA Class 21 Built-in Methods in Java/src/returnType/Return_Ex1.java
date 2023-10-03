package returnType;

public class Return_Ex1 {
	
	public int method1() {
		String name="Kane";
		int age =25;
		double salary=345.67;
		char grade='A';
		int deptno=23;
		
		return age;
		
		
	}

	public static void main(String[] args) {
		
		Return_Ex1 r=new Return_Ex1();
		
		System.out.println(r.method1());
		
	}

}
