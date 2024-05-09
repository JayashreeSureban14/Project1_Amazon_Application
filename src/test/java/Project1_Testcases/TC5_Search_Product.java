package Project1_Testcases;

import org.testng.annotations.Test;

import Project1_Source.Home_Page;

public class TC5_Search_Product extends Launch_And_Quit_Browser
{
	
	@Test
	public void search_products_shoes()
	{
	
		Home_Page h1=new Home_Page(driver);
		h1.search_product();
	}
}
