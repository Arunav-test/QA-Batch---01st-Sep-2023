package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLogin {
	
	public void login(String uname, String pwd) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		try {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println(uname+ "-> login successfull");
		}
		catch(Exception e) {
			System.out.println(uname+"-> login failed");
			//String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
		    //System.out.println(error);
		}
		System.out.println("********************");
		//Thread.sleep(2000);
		driver.quit();

	
	}

	public static void main(String[] args) throws InterruptedException {

		MultipleLogin mul = new MultipleLogin();
       mul.login("standard_user", "secret_sauce");
       mul.login("problem_user", "secret_sauce");
       mul.login("performance_glitch_user", "secret_sauce");
       mul.login("error_user", "secret_sauce");
       mul.login("locked_out_user", "secret_sauce");
       

	}

}
