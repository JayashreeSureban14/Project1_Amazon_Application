package Project1_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_Profile_Page 
{
	ChromeDriver driver;
	//step 1
	@FindBy(xpath="(//span[@class='nav-icon nav-arrow'])[2]") //accounts and lists hover over
	WebElement hoverover_accounts_lists;
	
	@FindBy(xpath="//span[.='Manage Profiles']")
	WebElement manage_progiles_btn;
	
	@FindBy(linkText="View")
	WebElement view_button;
	
	@FindBy(xpath="(//ul[@class='accordion-trigger-content preview desktop'])[1]")
	WebElement preferred_department;
	
	@FindBy(xpath="//button[.='Add']")
	WebElement add_gender_button;
	
	@FindBy(xpath="//button[.='Women']")
	WebElement woment_button;
	
	@FindBy(xpath="//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement save_women_button;
	
	
	
/*	@FindBy(xpath="//div[.='Height and weight']")
	WebElement height_and_weight;
	
	@FindBy(xpath="//button[.='Add']")
	WebElement height_weight_add_button; */
	
	
/*	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[3]")
	WebElement age_group_dept;
	
*/	
	//step 2
	public void account_and_lists()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(hoverover_accounts_lists).perform(); 
		//hoverover_accounts_lists.click();
	}
	
	public void manage_profiles()
	{
		manage_progiles_btn.click();
	}
	
	public void view()
	{
		view_button.click();
	}
	
	public void preferred_dept_gender()
	{
		preferred_department.click();
	}
	
	public void gender_add()
	{
		add_gender_button.click();
	}
	
	public void women_add()
	{
		woment_button.click();
	}
	
	public void women_add_save()
	{
		save_women_button.click();
	}
	
/*	public void height_weight_dept()
	{
		height_and_weight.click();
	}
	
	public void height_weight_add()
	{
		height_weight_add_button.click();
	} */
	

/*	public void age_group_dept()
	{
		age_group_dept.click();
	}
	
*/
	//step 3
	public Manage_Profile_Page(ChromeDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
