
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling  {
	
	public static int  generateId() {
		
		int value=(int) (Math.random()*10000);
		return value;
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		String username="Steve"+generateId();
		System.out.println(username);
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/register.htm");
	driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Steve");
	driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("kevin");
	driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("23 baker street");
	driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("sydney");
	driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("nsw");
	driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2145");
	
	driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("23gh6565");
	driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	
	
		 
		
		
		
	

	}

}
