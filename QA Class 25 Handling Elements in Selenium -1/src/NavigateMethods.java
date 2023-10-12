import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.bing.com");
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		driver.navigate().to("https://www.saucedemo.com");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}

}
