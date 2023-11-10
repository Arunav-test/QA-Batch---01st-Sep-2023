import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;







public class Drop_Down  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	     WebElement dropdown =driver.findElement(By.xpath("//select[@id='first']"));
	     Select sel = new Select(dropdown);
	     Thread.sleep(2000);
	     sel.selectByIndex(3);//select using index
	     Thread.sleep(2000);
	     sel.selectByValue("Google");
	     Thread.sleep(2000);
	     sel.selectByVisibleText("Bing");
	   List<WebElement> values=  sel.getOptions();
	   System.out.println(values.size());
	   
	   for(int i=0;i<values.size();i++) {
		   
		   System.out.println(values.get(i).getText());
	   }
		
   driver.quit();
		 

	}

}
