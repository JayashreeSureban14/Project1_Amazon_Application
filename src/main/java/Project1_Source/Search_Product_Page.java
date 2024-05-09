package Project1_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Product_Page 
{
	ChromeDriver driver;
	
	//step 1
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[10]")
	WebElement womens_sneakers;
	
	@FindBy(xpath="//span[contains(text(),'₹1,000 - ₹2,500')]")
	WebElement price;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
	WebElement select_product;
	
	@FindBy(id="p_72/1318476031")
	WebElement customer_4rating;
	
	@FindBy(id="add-to-cart-button")
	WebElement add_to_cart_button;
	
	@FindBy(id="quantity")
	WebElement select_quantity;
	
	@FindBy(partialLinkText="Cart")
	WebElement go_to_cart_btn;
	
	@FindBy(xpath="(//span[@class='a-size-small sc-action-delete'])[2]")
	WebElement delete_from_cart_btn;
	
	
	//step 2
	public void category()
	{
		womens_sneakers.click();
	}
	
	public void price_select()
	{
		price.click();
	}
	
	public void select_product_details()
	{
		select_product.click();
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> g1=s1.iterator(); //return type of iterator is Iterator itself
		String parent=g1.next(); //1st time-it gives parent window
		String child=g1.next(); //2nd time-it gives child window
		
		driver.switchTo().window(child); //switching to child window
	}
	
	public void add_to_Cart()
	{
		add_to_cart_button.click();
	}
	
	public void customer_rating()
	{
		customer_4rating.click();
	}
	
	public void select_product_quantity()
	{
		select_quantity.click();
		
		Select s1=new Select(select_quantity);
		s1.selectByValue("2");
	}
	
	public void go_to_cart()
	{
		go_to_cart_btn.click();
	}
	
	public void remove_from_cart()
	{
		delete_from_cart_btn.click();
	}
	
	
	//step 3
	public Search_Product_Page(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
