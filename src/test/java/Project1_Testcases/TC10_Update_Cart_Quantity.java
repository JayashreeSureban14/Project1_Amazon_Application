package Project1_Testcases;

import org.testng.annotations.Test;

import Project1_Source.Home_Page;
import Project1_Source.Search_Product_Page;

public class TC10_Update_Cart_Quantity extends Launch_And_Quit_Browser
{
	@Test
	public void cart_update()
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
		
		sp.select_product_quantity(); //select product
		
		sp.add_to_Cart(); //add item to cart
		sp.go_to_cart(); //go to cart
		
		sp.remove_from_cart(); //remove item from cart
			
	}
}
