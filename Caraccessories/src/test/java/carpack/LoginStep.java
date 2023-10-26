package carpack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carpack.Installer;
import carpack.admin;
import carpack.user;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginStep {
	static boolean flag=false;
	static boolean flagemail=false;
	static boolean flagpass=false;
	
	
	static user U=new user();
	static admin A=new admin();
	static Installer I=new Installer();
	static product P= new product();
	
	static boolean flagadmin;
	static boolean flagIns;
	static boolean is_Ins=false;
	static boolean is_admin=false;
	static boolean flagnotlogin=false;
	
	

	
	@Given("that the user is not logged in")
	public void that_the_user_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		flag=false;
	}

	@Given("the email is {string}")
	public void the_email_is(String string) {
		U.setemail(string);
		if( U.checkemail(string)==1) {
			flag=true;
			 flagemail=true;
		}
		if( U.checkemail(string)==0) {
			flag=false;
			flagemail=false;
		}
	   
	}

	@Given("the password is {string}")
	public void the_password_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 U.setPass(string);
			if( U.checkpass(string)==1) {
				flag=true;
				flagpass=true;
				if (!user.passu.contains(U.getPass()))
					user.passu.add(U.getPass());
			}
			if( U.checkpass(string)==0) {
				flag=false;
				flagpass=false;
			
			 
			}
	}

	@Then("the user login succeeds")
	public void the_user_login_succeeds() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(flagemail && flagpass);	}

	@Then("the user is logged in")
	public void the_user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(flagemail && flagpass);
		 }
	
	
	
	@Then("the user login fail")
	public void the_user_login_fail() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(flagemail && flagpass);
	}

	@Then("the user is not logged in")
	public void the_user_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(flagemail && flagpass);
		}
	
	

@Given("that the admin or Installer is not logged in")
public void that_the_admin_or_Installer_is_not_logged_in1() {
    // Write code here that turns the phrase above into concrete actions
	  
    flagadmin=false;
    flagIns=false;
}

@Given("the email is {string} and the pass {string}")
public void the_email_is_and_the_pass1(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	if(string.equals("lujain@gmail.com")) {
		is_admin=true;
	 A.setPassword(string2);
	 A.setEmail(string);
		if( A.checkpass(string2)==1 && A.checkemail(string)==1 ) {
			flagadmin=true;
		}
		if( A.checkpass(string2)==0 || A.checkemail(string)==0) {
			flagadmin=false;
		}
	}
	else
	{
		is_Ins=true;
		 I.setPass(string2);
		 I.setemail(string);
			if( I.checkpass(string2)==1 && I.checkemail(string)==1 ) {
				flagIns=true;
			}
			if( I.checkpass(string2)==0 || I.checkemail(string)==0) {
				flagIns=false;
			}
	}
}



@Then("the admin or Installer is logged in")
public void the_admin_or_Installer_is_logged_in1() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(flagadmin || flagIns);
	}



@Then("the admin or Installer login succeeds")
public void the_admin_or_Installer_login_succeeds() {
    // Write code here that turns the phrase above into concrete actions
	 assertTrue(flagadmin || flagIns);
	 }


}

	
	


	
