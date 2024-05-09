package Project1_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page 
{
	ChromeDriver driver;
	
	//step 1 - find and locate elements
	@FindBy(xpath="(//a[.='Start here.'])[2]")
	WebElement sign_hover_over;
	
	@FindBy(id="ap_customer_name")
	WebElement your_name_tf;
	
	@FindBy(id="ap_phone_number")
	WebElement mobile_no_tf;
	
	@FindBy(id="ap_password")
	WebElement password_tf;
	
	@FindBy(id="continue")
	WebElement verify_mobile_number_btn;
	
	//step 2 - methods for each element
	public void signin_hover_over()
	{
		sign_hover_over.click();
	}
	
	public void firstname_lastname()
	{
		your_name_tf.sendKeys("Sachit Sureban");
	}
	
	public void mobile_number()
	{
		mobile_no_tf.sendKeys("9876543210");
	}
	
	public void password()
	{
		password_tf.sendKeys("As@123#Z");
	}
	
	public void verify_mobile()
	{
		verify_mobile_number_btn.click();
	}
	
	//step 3 - initialize
	public Registration_Page(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
