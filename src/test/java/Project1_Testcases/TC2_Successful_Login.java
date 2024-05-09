package Project1_Testcases;

import org.testng.annotations.Test;

import Project1_Source.Home_Page;

public class TC2_Successful_Login extends Launch_And_Quit_Browser
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
		
	}
}
