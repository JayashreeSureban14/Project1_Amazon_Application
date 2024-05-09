package Project1_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Payment_Page 
{
	ChromeDriver driver;
	
	//step 1
	@FindBy(id="sc-buy-box-ptc-button")
	WebElement proceed_to_buy_btn;
	
	@FindBy(xpath="(//div[@class='a-radio'])[3]")
	WebElement select_address_radio;
	
	@FindBy(id="shipToThisAddressButton")
	WebElement use_this_address_btn;
	
	@FindBy(xpath="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")
	WebElement net_banking_radio;
	
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement credit_debit_card_radio;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement other_upi_apps_radio;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement emi_radio;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement cash_on_delivery_radio;
	
	@FindBy(id="orderSummaryPrimaryActionBtn")
	WebElement use_this_payment_method_btn;
	
	@FindBy(id="spc-gcpromoinput")
	WebElement enter_code_tf;
	
	@FindBy(id="gcApplyButtonId")
	WebElement apply_btn;
	
	//step 2
	public void proceed_to_buy()
	{
		proceed_to_buy_btn.click();
	}
	
	public void select_address()
	{
		select_address_radio.click();
	}
	
	public void use_this_address()
	{
		use_this_address_btn.click();
	}
	
	public void payment_net_banking()
	{
		net_banking_radio.click();
	}
	
	public void credit_debit_card()
	{
		credit_debit_card_radio.click();
	}
	
	public void other_upi_apps()
	{
		other_upi_apps_radio.click();
	}
	
	public void payment_emi()
	{
		emi_radio.click();
	}
	
	public void cash_on_delivery()
	{
		cash_on_delivery_radio.click();
	}
	
	public void use_this_payment()
	{
		use_this_payment_method_btn.click();
	}
	
	public void enter_coupon_code()
	{
		enter_code_tf.sendKeys("abcd12345");
	}
	
	public void apply_coupon_code()
	{
		apply_btn.click();
	}
	
	//step 3
	public Checkout_Payment_Page(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
