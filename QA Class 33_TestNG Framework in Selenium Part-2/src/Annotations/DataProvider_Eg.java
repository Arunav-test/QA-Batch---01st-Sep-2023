package Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Eg {
	
	@DataProvider(name="data")
	public Object[][] testData() {
		
		return new Object[][] {{"standard_user","secret_sauce"},
			                   {"locked_out_user","secret_sauce"},
			                   {"performance_glitch_user","secret_sauce"},
			                   {"error_user","secret_sauce"},
			                   {"visual_user","secret_sauce"}};
			           
		}
		
	
	
	@Test(dataProvider="data")
	public void loginTest(String uname, String pwd) {
		
		System.out.println(uname+" | "+pwd);
	}

}
