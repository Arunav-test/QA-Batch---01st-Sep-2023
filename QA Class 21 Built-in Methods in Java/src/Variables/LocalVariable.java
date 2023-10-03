package Variables;

public class LocalVariable {
	String name="bob";
	int age =40;
	
	public void method1() {
		//local variables
		
		String name="Steve";
		int age =27;
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public void method2() {
		String name="James";
		int age =30;
		System.out.println(name);
		System.out.println(age);
		
	}
	public static void main(String[] args) {
	  LocalVariable l = new LocalVariable();
	  
	//  l.method1();
	//  l.method2();
	  
	  System.out.println(l.name);
	  System.out.println(l.age);
	  

	}

}
