package ReadToExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLoginWithExcelData {

	public static void main(String[] args) throws InterruptedException {
		
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA Batch - 01st Sep 2023\\Excel_Parameterization\\src\\TestData\\SAUCE_LOGIN.xlsx");

		int totalRows=xls.getRowCount("SAUCE");
		//System.out.println(totalRows);
		
		String value=xls.getCellData("SAUCE", "PASSWORD", 2);
		//System.out.println(value);
		
		
		for(int i=2;i<=totalRows;i++) {
			
			String uname= xls.getCellData("SAUCE", "USERNAME", i);
			String pwd =xls.getCellData("SAUCE", "PASSWORD", i);
			System.out.println(uname+" | "+pwd);
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(1000);
			driver.quit();
			
			
		}
	}

}
