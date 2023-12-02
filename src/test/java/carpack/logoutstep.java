package carpack;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutstep {
	boolean finu,foutu;
	boolean fini,fouti;
	boolean fina,fouta;
	
	

	@Given("that the user is logged in")
	public void that_the_user_is_logged_in() {
		if(LoginStep.flag)
			finu=true;
	    
	}

	@When("the user logs out")
	public void the_user_logs_out() {
		foutu=true;
	    
	}

	@Then("the user not logged in")
	public void the_user_not_logged_in() {
	    assertTrue(foutu);
	}
	
	
	

@Given("that the Admin is logged in")
public void that_the_Admin_is_logged_in() {
	
	if(LoginStep.flagadmin)
		fina=true;
    
}

@When("the Admin logs out")
public void the_Admin_logs_out() {
	fouta=true;
}

@Then("the Admin not logged in")
public void the_Admin_not_logged_in() {
	assertTrue(fouta);
    
}

@Given("that the Installer is logged in")
public void that_the_Installer_is_logged_in() {
	
	if(LoginStep.flagIns)
		fini=true;
	
    
}

@When("the Installer logs out")
public void the_Installer_logs_out() {
	fouti=true;
    
}

@Then("the Installer not logged in")
public void the_Installer_not_logged_in() {
	assertTrue(fouti);
    
}



}