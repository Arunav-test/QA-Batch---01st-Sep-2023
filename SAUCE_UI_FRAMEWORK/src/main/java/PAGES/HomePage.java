package PAGES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TESTBASE.TestBase;
import UTIL.TestUtil;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart ;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menu ;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	WebElement remove ;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement filter ;
	
	@FindBy(xpath="//a[normalize-space()='LinkedIn']")
	WebElement linkedin ;
	
	@FindBy(xpath="//a[normalize-space()='Facebook']")
	WebElement facebook ;
	
	@FindBy(xpath="//a[normalize-space()='Twitter']")
	WebElement twitter;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void addtocart() {
		addtocart.click();
		cart.click();
	}
	
   public void removecart() {
	addtocart.click();
	remove.click();
}
   
   public void clickFacebook() {
	   facebook.click();
   }
   public void clickLinkedin() {
	   linkedin.click();
   }
   public void clickTwitter() {
	   twitter.click();
   }
   
   public void logout() {
	   menu.click();
	   logout.click();
   }
   
   public void filter(String value) {
	   TestUtil.selectDropdown(filter, value);
   }
   
   
}
