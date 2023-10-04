package Abstractions;

public class Test extends Abstraction_Ex {

	public static void main(String[] args) {
	
		Test t = new Test();
		t.savings();
		t.loan();
		t.creditcard();
		t.kyc();

	}

	@Override
	public void savings() {
		System.out.println("savings");
		
	}

	@Override
	public void loan() {
		System.out.println("loan");
		
	}

	@Override
	public void creditcard() {
		System.out.println("credit card");
		
	}

}
