import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://omayo.blogspot.com/");

WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
List<WebElement> Rows =table.findElements(By.tagName("tr"));// contains row information
System.out.println("total number of rows "+Rows.size());

//finds number of columns

     List<WebElement> row0= Rows.get(0).findElements(By.tagName("th"));
	List<WebElement> row1= Rows.get(1).findElements(By.tagName("td"));
     List<WebElement> row2= Rows.get(2).findElements(By.tagName("td"));
	  List<WebElement> row3= Rows.get(3).findElements(By.tagName("td"));
	  List<WebElement> row4= Rows.get(4).findElements(By.tagName("td"));
	 
  System.out.println(row0.size()); 
	
	  System.out.println(row1.size()); System.out.println(row2.size());
	  System.out.println(row3.size()); System.out.println(row4.size());
	 
 

for(int i=0;i<row1.size();i++) {
	System.out.print(row0.get(i).getText()+" | ");
	
	  System.out.print(row1.get(i).getText()+" | ");
	  System.out.print(row2.get(i).getText()+" | ");
	  System.out.print(row3.get(i).getText()+" | ");
	  System.out.print(row4.get(i).getText()+" | "); 
	  System.out.println();
	 
}



    	
    
    
    


    driver.quit();

	}

}
