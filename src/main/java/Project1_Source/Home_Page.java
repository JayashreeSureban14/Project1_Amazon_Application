package Project1_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	ChromeDriver driver;
	
	//step 1
	@FindBy(xpath="(//span[.='Sign in'])[2]")
	WebElement hover_signin_button;
	
	@FindBy(id="ap_email")
	WebElement email_text;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement password_text;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	
	//search box
	@FindBy(id="twotabsearchtextbox")
	WebElement search_product_tf;
	
	//returns & orders
	@FindBy(id="nav-orders")
	WebElement returns_and_orders_btn;
	
	
	//step 2
	public void hover_sign_in()
	{
		hover_signin_button.click();
	}
	
	public void email()
	{
		email_text.sendKeys("9986263210");
	}
	
	public void cont()
	{
		continue_button.click();
	}
	
	public void password()
	{
		password_text.sendKeys("Amazon@123");
	}
	
	public void signin()
	{
		signin_button.click();
	}
	
	public void incorrect_email()
	{
		email_text.sendKeys("jaya@gmail.com");
	}
	
	
	public void search_product()
	{
		search_product_tf.sendKeys("shoes");
		search_product_tf.sendKeys(Keys.ENTER);
	}
	
	public void returns_and_orders()
	{
		returns_and_orders_btn.click();
	}
	
	//step 3
	public Home_Page(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
