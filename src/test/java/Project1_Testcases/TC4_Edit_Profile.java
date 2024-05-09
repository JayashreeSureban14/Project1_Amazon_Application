package Project1_Testcases;

import org.testng.annotations.Test;

import Project1_Source.Home_Page;
import Project1_Source.Manage_Profile_Page;

public class TC4_Edit_Profile extends Launch_And_Quit_Browser
{

	@Test
	public void login()
	{
	
		Home_Page h1=new Home_Page(driver);
		h1.hover_sign_in();
		h1.email();
		h1.cont();
		h1.password();
		h1.signin();
		
		Manage_Profile_Page m1=new Manage_Profile_Page(driver);
		m1.account_and_lists(); 
		m1.manage_profiles(); 
		m1.view();
		
		m1.preferred_dept_gender();
		m1.gender_add();
		m1.women_add();
		m1.women_add_save();
		
	//	m1.height_weight_dept(); //not working
	//	m1.height_weight_add();
		
	//	m1.age_group_dept(); //not working
	}

}
