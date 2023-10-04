package Interfaces;

public class hdfc implements CentralBank {

	public static void main(String[] args) {
		hdfc h = new hdfc();
		h.savings();
		h.loan();
		h.creditcard();
		
	}

	@Override
	public void savings() {
		System.out.println("hdfc saving interest rate is 4%");
		
	}

	@Override
	public void loan() {
		System.out.println("hdfc loan intereset rate is 3%");
		
	}

	@Override
	public void creditcard() {
		System.out.println("hdfc credit card charges 100$");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
