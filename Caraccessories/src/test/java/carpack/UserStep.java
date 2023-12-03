package carpack;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStep {
	
	static boolean fupdate;
	static boolean fvieworder;
	static boolean fviewhis;
	
	
	@When("the Customer with email {string} can edit his profile newpass{string},newPhone{string},newName{string},newAddress{string},newAge{string}")
	public void the_Customer_with_email_can_edit_his_profile(String email, String newPass, String newPhone, String newName, String newAddress, String newAge) {
	    if (LoginStep.flag) {
	        LoginStep.U.editProfile(email, newPass, newPhone, newName, newAddress, newAge);
	        fupdate = true;
	    }
	}

	
	@Then("Customers can edit their profiles")
	public void customers_can_edit_their_profiles() {
		
		
	    assertTrue(fupdate&&LoginStep.flag);
	}

	@When("the Customer  with email {string} can View order history")
	public void the_Customer_with_email_can_View_order_history(String string) {
		if(LoginStep.flag) {
			RoleStep.p.vieworder(string);
			fvieworder=true;
			
		}
		
	   
	}

	@Then("Customers can View order history")
	public void customers_can_View_order_history() {
		assertTrue(fvieworder&&LoginStep.flag);
	    
	}

	@When("the Customer  with email {string} can View  installation requests")
	public void the_Customer_with_email_can_View_installation_requests(String string) {
		
		if(LoginStep.flag) {
			LoginStep.I.Viewinstallationreq(string);
			fviewhis=true;
			
		}
		
		
	    
	}

	@Then("Customers can View  installation requests")
	public void customers_can_View_installation_requests() {
		assertTrue(fviewhis&&LoginStep.flag);
	    
	}



}
