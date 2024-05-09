package Project1_Testcases;

import org.testng.annotations.Test;

import Project1_Source.Home_Page;
import Project1_Source.Search_Product_Page;

public class TC8_Sorting_Product extends Launch_And_Quit_Browser
{
	
	@Test
	public void search_products_shoes()
	{
	
		Home_Page h1=new Home_Page(driver);
		h1.search_product();
		
		Search_Product_Page s1=new Search_Product_Page(driver);
		s1.category();
		s1.price_select();
		
		s1.customer_rating();
	}

}
