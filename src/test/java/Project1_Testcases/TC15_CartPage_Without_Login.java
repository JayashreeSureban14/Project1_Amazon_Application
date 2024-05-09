package Project1_Testcases;

import org.testng.annotations.Test;

import Project1_Source.Home_Page;
import Project1_Source.Search_Product_Page;

public class TC15_CartPage_Without_Login extends Launch_And_Quit_Browser
{
	@Test
	public void without_login()
	{
		Home_Page hm=new Home_Page(driver);
		hm.search_product();
		
		Search_Product_Page sp=new Search_Product_Page(driver);
		sp.select_product_details();
		sp.add_to_Cart();
		sp.go_to_cart();
	}
}
