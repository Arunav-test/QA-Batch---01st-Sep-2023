package UTIL;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TESTBASE.TestBase;

public class TestUtil extends TestBase{
	
	public static int randomNumber() {
		
		int rand= (int) (Math.random()*100);
		System.out.println(rand);
		
		return rand;
		
	}
	
	public static String DateTime() {
		LocalDateTime myDateObj = LocalDateTime.now();
		   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	    return formattedDate;
	    
	}
	
public static void Screenshot() throws IOException  {
		
		String name = driver.getTitle()+"_"+DateTime();

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		System.out.println(System.getProperty("user.dir") +"\\SCREENSHOTS\\");

		File DestFile = new File(System.getProperty("user.dir") + "\\SCREENSHOTS\\" +  name+".jpeg");

		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public static void main(String[] args) {
		//randomNumber();
		DateTime();
	}
	
	public static void  selectDropdown(WebElement dropdown, String value) {
		Select sel= new Select(dropdown);
		sel.selectByValue(value);
	}
	

}
