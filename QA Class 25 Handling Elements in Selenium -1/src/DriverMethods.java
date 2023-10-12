import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		//driver.close();
		driver.quit();
		

	}

}
