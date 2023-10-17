import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		WebElement fr= driver.findElement(By.id("frame1"));
		
		/*
		 * driver.switchTo().frame(fr);
		 * 
		 * 
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		 * 
		 * WebElement fr2= driver.findElement(By.id("frame3"));
		 * driver.switchTo().frame(fr2);
		 * driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 */
		
       List<WebElement> frames=  driver.findElements(By.tagName("iframe")) ;  
       System.out.println(frames.size());
		
	

	}

}
