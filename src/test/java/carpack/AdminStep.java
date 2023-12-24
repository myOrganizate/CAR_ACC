package carpack;

import static org.junit.Assert.assertTrue; 

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStep {
	
	static boolean upin;
	static boolean upex;
	static boolean upelec;
	
	static boolean delin;
	static boolean delex;
	static boolean delelec;
	static boolean viewacc;
	
	static boolean app;
	static boolean ins;
	static boolean upapp;
	static boolean delapp;
	
	
	
	
	@When("the admin update an Interior product who has id {string}, newname {string}, newprice {string}, newavailability {string}, newcategory {string}, and newimage {string}")
	public void the_admin_update_an_Interior_product_who_has_id_newname_newprice_newavailability_newcategory_and_newimage(String string, String string2, String string3, String string4, String string5, String string6) {
		
		if(LoginStep.flagadmin) {
		RoleStep.p.updateProduct(string, string2, string3, string4, string5, string6);
		upin=true;
		}
		
	   
	}

	@Then("the admin successfully update the Interior product")
	public void the_admin_successfully_update_the_Interior_product() {
		assertTrue(upin&&LoginStep.flagadmin);
	    
	}

	@When("the admin update an Exterior product who has id {string}, newname {string}, newprice {string}, newavailability {string}, newcategory {string}, and inewmage {string}")
	public void the_admin_update_an_Exterior_product_who_has_id_newname_newprice_newavailability_newcategory_and_inewmage(String string, String string2, String string3, String string4, String string5, String string6) {
		
		if(LoginStep.flagadmin) {
			RoleStep.p.updateProduct(string, string2, string3, string4, string5, string6);
			upex=true;
			}
	    
	}

	@Then("the admin successfully update the Exterior product")
	public void the_admin_successfully_update_the_Exterior_product() {
		assertTrue(upex&&LoginStep.flagadmin);
		
	    
	}

	@When("the admin update an Electronic product who has id {string}, newname {string}, newprice {string}, newavailability {string}, newcategory {string}, and newimage {string}")
	public void the_admin_update_an_Electronic_product_who_has_id_newname_newprice_newavailability_newcategory_and_newimage(String string, String string2, String string3, String string4, String string5, String string6) {
		
		if(LoginStep.flagadmin) {
			RoleStep.p.updateProduct(string, string2, string3, string4, string5, string6);
			upelec=true;
			}
	    
	
	    
	}

	@Then("the admin successfully update the Electronic product")
	public void the_admin_successfully_update_the_Electronic_product() {
		assertTrue(upelec&&LoginStep.flagadmin);
		
	    
	}

	@When("the admin delete an Interior product with id {string}")
	public void the_admin_delete_an_Interior_product_with_id(String string) {
		if(LoginStep.flagadmin) {
			RoleStep.p.deleteProduct(string);
			delin=true;
			}
		
		
	    
	}

	@Then("the admin successfully delete the Interior product")
	public void the_admin_successfully_delete_the_Interior_product() {
	    
		assertTrue(delin&&LoginStep.flagadmin);
		
	}

	@When("the admin delete an Exterior product with id {string}")
	public void the_admin_delete_an_Exterior_product_with_id(String string) {
		if(LoginStep.flagadmin) {
			RoleStep.p.deleteProduct(string);
			delex=true;
			}
		
		
		
	}

	@Then("the admin successfully delete the Exterior product")
	public void the_admin_successfully_delete_the_Exterior_product() {
		assertTrue(delex&&LoginStep.flagadmin);
	    
	}

	@When("the admin delete an Electronic product with id {string}")
	public void the_admin_delete_an_Electronic_product_with_id(String string) {
		if(LoginStep.flagadmin) {
			RoleStep.p.deleteProduct(string);
			delelec=true;
			}
		
		
		
	}

	@Then("the admin successfully delete the Electronic product")
	public void the_admin_successfully_delete_the_Electronic_product() {
		
		assertTrue(delelec&&LoginStep.flagadmin);
	    
	}

	@When("Admin can View Customer accounts")
	public void admin_can_View_Customer_accounts() {
		if(LoginStep.flagadmin) {
			LoginStep.U.printCustomer();
			viewacc=true;
			}
		
	   
	}

	@Then("can View Customer account")
	public void can_View_Customer_account() {
		assertTrue(viewacc&&LoginStep.flagadmin);
	    
	}

	@When("Admin can Schedule  appointment with  date {string}, time {string}")
	public void admin_can_Schedule_appointment_with_date_time(String string, String string2) {
		if(LoginStep.flagadmin) {
			
			LoginStep.I.scheduleapp(string, string2);
			app=true;
	}

		
			
	   
	}

	@Then("Admin can Schedule  appointment successfully")
	public void admin_can_Schedule_appointment_successfully() {
		
		assertTrue(app&&LoginStep.flagadmin);
	}

	
	@When("can view installation appointment")
	public void can_view_installation_appointment() {
		if(LoginStep.flagadmin) {
			LoginStep.I.Viewinstallationreq();
			ins=true;
			}
	}
	
	@Then("Admin can view installation appointments")
	public void admin_can_view_installation_appointments() {
		assertTrue(ins&&LoginStep.flagadmin);
	    
	}
	

	@When("Admin can update appointment from date {string}, time {string} to date {string}, time {string}")
	public void admin_can_update_appointment_from_date_time_to_date_time(String string, String string2, String string3, String string4) {
		if(LoginStep.flagadmin) {
			LoginStep.I.updateappo(string, string2, string3, string4);
			LoginStep.I.updateappointment("",string, string2, "",string3, string4,"");
			upapp=true;
			
		}
	    
	
		
		
		
	}



	
	
	
	

	

	@Then("Admin can update appointment successfully")
	public void admin_can_update_appointment_successfully() {
		assertTrue(upapp&&LoginStep.flagadmin);
	 
	}

	

	@When("Admin can delete  appointment date {string}, time {string}")
	public void admin_can_delete_appointment_date_time(String string, String string2) {
		
		if(LoginStep.flagadmin) {
			LoginStep.I.deleteappo(string, string2);
			LoginStep.I.deleteappointment("",string, string2,"");
			
			delapp=true;
			
		}
	    
	   
	}
	
	

	@Then("Admin can delete appointment successfully")
	public void admin_can_delete_appointment_successfully() {
		assertTrue(delapp&&LoginStep.flagadmin);
	    
	}




}
