import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public  static void  searchTable(String name) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		String firstXpath="//td[contains(text(),'";
		String secondXpath="')]/preceding-sibling::td/input[@type='checkbox']";
	
		System.out.println(firstXpath+name+secondXpath);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");//top to bottom
		Thread.sleep(3000);
		
		  
		driver.findElement(By.xpath(firstXpath+name+secondXpath)).click();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		searchTable("Helen Bennett");

	}

}
