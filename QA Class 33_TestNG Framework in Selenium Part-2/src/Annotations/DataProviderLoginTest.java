package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLoginTest {
	@DataProvider(name="data")
	public Object[][] testData() {
		
		return new Object[][] {{"standard_user","secret_sauce"},
			                   {"locked_out_user","secret_sauce"},
			                   {"performance_glitch_user","secret_sauce"},
			                   {"error_user","secret_sauce"},
			                   {"visual_user","secret_sauce"}};
			           
		}
		
	
	
	@Test(dataProvider="data")
	public void loginTest(String uname, String pwd) throws InterruptedException {
		
		System.out.println(uname+" | "+pwd);
		
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(2000);
			driver.quit();
	}


}
