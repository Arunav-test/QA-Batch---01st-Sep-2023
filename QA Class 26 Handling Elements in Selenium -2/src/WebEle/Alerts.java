package WebEle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(2000);
		Alert al =driver.switchTo().alert();
		String text= al.getText();
	//	al.accept();// click ok
        al.dismiss();// click cancel
        System.out.println(text);
	}

}
