package Project1_Testcases;

import org.testng.annotations.Test;

import Project1_Source.Home_Page;
import Project1_Source.Orders_Page;

public class TC14_5_Star_Rating extends Launch_And_Quit_Browser
{
	@Test
	public void rating_5star()
	{
		Home_Page hm=new Home_Page(driver); //login
		hm.hover_sign_in();
		hm.email();
		hm.cont();
		hm.password();
		hm.signin();
		
		hm.returns_and_orders(); //returns and orders
		
		Orders_Page op=new Orders_Page(driver);
		op.orders_placed_in();
		op.select_year_2023();
		op.write_product_review();
		op.overall_rating_5star();
	}
}
