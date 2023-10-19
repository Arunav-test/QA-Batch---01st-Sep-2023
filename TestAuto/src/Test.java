import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "");
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://www.saucedemo.com");

	}

}
