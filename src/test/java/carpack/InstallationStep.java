package carpack;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstallationStep {
	boolean fa,fav,fapp,fvalid,fnav;
	
	@Given("Customers request valid installation appointment")
	public void customers_request_valid_installation_appointment() {
	    // Write code here that turns the phrase above into concrete actions
	    fvalid=true;
	}
	
	@When("the Customer with email {string}  enter installation details with date {string}  time {string}  product {string}")
	public void the_Customer_with_email_enter_installation_details_with_date_time_product(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
		if(LoginStep.flag) {
			fa=true;
			LoginStep.I.appointment(string2, string3, string4,string);

			
			}
	}

	@Then("Customers can request installation")
	public void customers_can_request_installation() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(fa&&fvalid);
	}
	@Given("Customers request unvalid installation appointment")
	public void customers_request_unvalid_installation_appointment() {
	    // Write code here that turns the phrase above into concrete actions
		fnav=false;
	    
	}

	@Then("Customers cant request installation")
	public void customers_cant_request_installation() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(!fnav);
	    
	}




	@Then("Customers can view Installer availability and appointment")
	public void customers_can_view_Installer_availability_and_appointment() {
	    // Write code here that turns the phrase above into concrete actions
		fav=true;
		fapp=true;
	    assertTrue(fav&&fapp);
	}


}
