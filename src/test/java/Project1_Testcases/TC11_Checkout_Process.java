package Project1_Testcases;

import org.testng.annotations.Test;

import Project1_Source.Checkout_Payment_Page;
import Project1_Source.Home_Page;
import Project1_Source.Search_Product_Page;

public class TC11_Checkout_Process extends Launch_And_Quit_Browser
{
	@Test
	public void chechout_process()
	{
		Home_Page hm=new Home_Page(driver); //login
		hm.hover_sign_in();
		hm.email();
		hm.cont();
		hm.password();
		hm.signin();
		
		hm.search_product(); //search product
		
		Search_Product_Page sp=new Search_Product_Page(driver);
		sp.select_product_details();
		sp.add_to_Cart();
		
		Checkout_Payment_Page cp=new Checkout_Payment_Page(driver);
		cp.proceed_to_buy();
		cp.select_address();
		cp.use_this_address();
		cp.payment_net_banking();
	}
}
