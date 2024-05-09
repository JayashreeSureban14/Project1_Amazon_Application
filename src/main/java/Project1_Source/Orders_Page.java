package Project1_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders_Page 
{
	ChromeDriver driver;
	//step 1
	
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	WebElement orders_placed_dropdown;
	
	@FindBy(id="time-filter_3")
	WebElement select_year_option;
	
	@FindBy(id="Write-a-product-review_2")
	WebElement write_product_review_btn;
	
	@FindBy(xpath="(//button[@class='ryp__star__button'])[5]")
	WebElement overall_rating_btn;
	
	//step 2
	public void orders_placed_in()
	{
		orders_placed_dropdown.click();
	}
	
	public void select_year_2023()
	{
		select_year_option.click();
	}
	
	public void write_product_review()
	{
		write_product_review_btn.click();
	}
	
	public void overall_rating_5star()
	{
		overall_rating_btn.click();
	}
	
	//step 3
	public Orders_Page(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
