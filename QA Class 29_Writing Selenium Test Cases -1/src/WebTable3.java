import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {
	
	
	public  static void  searchTable(String name) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		//td[contains(text(),'Francisco Chang')]
		//td[contains(text(),'Helen Bennett')]/following::td[1]
		String firstXpath="//td[contains(text(),'";
		String secondXpath="')]/following::td[1]";
		String salaryXpath= "')]/following::td[2]";
		
		String Country=driver.findElement(By.xpath(firstXpath+name+secondXpath)).getText();
		String Salary=driver.findElement(By.xpath(firstXpath+name+salaryXpath)).getText();
		System.out.println(name+"|"+ Country+" | "+Salary);
		
		
	}

	public static void main(String[] args) {
		
	//	searchTable("Francisco Chang");
	//	searchTable("Helen Bennett");
		searchTable("Yoshi Tannamuri");

	}

}
