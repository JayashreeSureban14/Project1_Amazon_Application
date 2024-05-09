package Project1_Testcases;

import org.testng.annotations.Test;

import Project1_Source.Registration_Page;

public class TC1_Register_NewUser extends Launch_And_Quit_Browser
{
	
	@Test
	public void new_user_signup() throws InterruptedException
	{

		Registration_Page r1=new Registration_Page(driver);
		r1.signin_hover_over();
		r1.firstname_lastname();
		Thread.sleep(1000);
		r1.mobile_number();
		Thread.sleep(1000);
		r1.password();
		Thread.sleep(1000);
		r1.verify_mobile();
	}
	

}
