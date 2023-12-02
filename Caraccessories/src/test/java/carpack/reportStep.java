package carpack;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class reportStep {
	boolean forder,freq,freport;

@When("user mack order")
public void user_mack_order() {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flag) {
    forder=true;
    freport=true;
    
	}
}

@Then("order will added to this shopping cart")
public void order_will_added_to_this_shopping_cart() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(forder&&LoginStep.flag);
}



@When("user request an installation")
public void user_request_an_installation() {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flag) {
		freq=true;
		freport=true;
		
	}
	
    
}

@Then("request will send to the installer")
public void request_will_send_to_the_installer() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(freq&&LoginStep.flag);
    
}

@Then("will store in report")
public void will_store_in_report() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(freport);
    
}




}
