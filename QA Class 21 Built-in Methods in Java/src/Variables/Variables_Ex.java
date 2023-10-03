package Variables;

public class Variables_Ex {
	
	int deptNo=23;
	
	public void m1() {
		String name="Kevin";
		char grade='A';
		System.out.println(name);
		System.out.println(grade);
		System.out.println(deptNo);
		
		
	}
	
	public void m2() {
		String name="Bruce";
		char grade='C';
		System.out.println(name);
		System.out.println(grade);
		System.out.println(deptNo);
		
		
	}

	public static void main(String[] args) {
		Variables_Ex v = new Variables_Ex();
		v.m1();
		v.m2();
		

	}

}
