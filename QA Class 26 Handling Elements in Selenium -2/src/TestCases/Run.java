package TestCases;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		
		LoginTest l = new LoginTest();
		l.login();
		AddTocart a = new AddTocart();
		a.addtocart();
		Logout lo= new Logout();
		lo.logout();
		MultipleLogin mul = new MultipleLogin();
		mul.login("standard_user", "secret_sauce");
		

	}

}
