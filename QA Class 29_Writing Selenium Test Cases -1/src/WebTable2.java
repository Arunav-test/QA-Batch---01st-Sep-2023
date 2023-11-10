import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// https://www.hyrtutorials.com/p/add-padding-to-containers.html
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		WebElement table=driver.findElement(By.id("contactList"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		

	}

}
