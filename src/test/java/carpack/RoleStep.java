package carpack;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RoleStep {
	
	
	static boolean fManageproducts;
	static boolean fManagecategories;
	static boolean fManageuseraccounts;
	static boolean faddproduct;
	static boolean fupdateproduct;
	static boolean fdeleteproduct;
	static boolean faddInterior;
	static boolean faddExterior;
	static boolean faddElec;
	
	static boolean faddcus;
	static boolean faupdus;
	static boolean fdelcus;
	static boolean fbrowpro;
	static boolean fpunch;
	static boolean fvieworder;
	static boolean fapp;
	static boolean fins;
	
	
	
	
	
	
	
	
	static boolean fBrowseproducts;
	static boolean fmakepurchases;
	static boolean fvieworders;
	
	
	static boolean fViewrequests ;
	static boolean fschedulappointments;
	static product p=new product();


	 @Given("the admin is login")
	    public void the_admin_is_login() {
	       
		 
		 
		 LoginStep.flagadmin=true;
		 
	    }

	    @When("the admin can add product id {string}, name {string}, price {string}, availability {string}, Categorie {string}, image {string}")
	    public void the_admin_can_add_product(String id, String name, String price, String availability, String category, String image) {
	      
	    	
	    	if(LoginStep.flagadmin) {
	    	faddproduct=true;
	    	p.createProduct(id, name, price, availability, category);
	    	
	    	}
	    	
	    	
	    }

	    @Then("admin can add product")
	    public void admin_can_add_product() {
	   
	    	
	    	assertTrue(faddproduct&&LoginStep.flagadmin);
	    }

	    @When("the admin can update product id {string}, name {string}, price {string}, availability {string}, Categorie {string}, image {string}")
	    public void the_admin_can_update_product(String id, String name, String price, String availability, String category, String image) {
	      
	    	
	    	if(LoginStep.flagadmin) {
	    	fupdateproduct=true;
	    	p.updateProduct(id, name, price, availability, category, image);
	    	}
	    	
	    }

	    @Then("admin can update product")
	    public void admin_can_update_product() {
	       
	    	assertTrue(fupdateproduct&&LoginStep.flagadmin);
	    }

	    @When("the admin can delete product id {string}")
	    public void the_admin_can_delete_product(String id) {
	    
	    	if(LoginStep.flagadmin) {
	    	p.deleteProduct(id);
	    	fdeleteproduct=true;
	    	}
	    	
	    	
	    }

	    @Then("admin can delete product")
	    public void admin_can_delete_product() {
	    	assertTrue(fdeleteproduct&&LoginStep.flagadmin);
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

@Given("the admin is login with email {string} and password {string}")
public void the_admin_is_login_with_email_and_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	
	if(string.equals("lujain@gmail.com")) {
		LoginStep.is_admin=true;
		LoginStep.A.setPassword(string2);
		LoginStep.A.setEmail(string);
		if( LoginStep.A.checkpass(string2)==1 && LoginStep.A.checkemail(string)==1 ) {
			LoginStep.flagadmin=true;
		}
		if(LoginStep. A.checkpass(string2)==0 || LoginStep.A.checkemail(string)==0) {
			LoginStep.flagadmin=false;
		}
	}
   
}

@When("the admin adds an Interior product with id {string}, name {string}, price {string}, availability {string}, category {string}, and image {string}")
public void the_admin_adds_an_Interior_product_with_id_name_price_availability_category_and_image(String string, String string2, String string3, String string4, String string5, String string6) {
    // Write code here that turns the phrase above into concrete actions
	
	if(LoginStep.flagadmin) {
	faddInterior=true;
	p.addprodInterior(string, string2, string3, string4, string5, string6);
	}
    
}

@Then("the admin successfully adds the Interior product")
public void the_admin_successfully_adds_the_Interior_product() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(faddInterior&&LoginStep.flagadmin);
	
}



@When("the admin adds an Exterior product with id {string}, name {string}, price {string}, availability {string}, category {string}, and image {string}")
public void the_admin_adds_an_Exterior_product_with_id_name_price_availability_category_and_image(String string, String string2, String string3, String string4, String string5, String string6) {
    // Write code here that turns the phrase above into concrete actions
	
	if(LoginStep.flagadmin) {
	faddExterior=true;
	p.addprodExterior(string, string2, string3, string4, string5, string6);
	}
}

@Then("the admin successfully adds the Exterior product")
public void the_admin_successfully_adds_the_Exterior_product() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(faddExterior&&LoginStep.flagadmin);
    
}



@When("the admin adds an Electronic product with id {string}, name {string}, price {string}, availability {string}, category {string}, and image {string}")
public void the_admin_adds_an_Electronic_product_with_id_name_price_availability_category_and_image(String string, String string2, String string3, String string4, String string5, String string6) {
    // Write code here that turns the phrase above into concrete actions

	if(LoginStep.flagadmin) {
	faddElec=true;
	p.addprodElectronic(string, string2, string3, string4, string5, string6);   
	}
}

@Then("the admin successfully adds the Electronic product")
public void the_admin_successfully_adds_the_Electronic_product() {
    // Write code here that turns the phrase above into concrete actions
    
	assertTrue(faddElec&&LoginStep.flagadmin);
	
}



@When("the admin creates a Customer with email {string}, password {string}, phone {string}, name {string}, address {string}, and age {string}")
public void the_admin_creates_a_Customer_with_email_password_phone_name_address_and_age(String string, String string2, String string3, String string4, String string5, String string6) {
    // Write code here that turns the phrase above into concrete actions
	
	
	if(LoginStep.flagadmin) {
	faddcus=true;
	LoginStep.U.createCustomer(string, string2, string3, string4, string5, string6);
	}
}

@Then("the admin successfully creates the Customer")
public void the_admin_successfully_creates_the_Customer() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(faddcus&&LoginStep.flagadmin);
	
   
}






@When("the admin updates the Customer with email {string} by changing phone to {string} ,name to {string}, address to {string}, and age to {string}")
public void the_admin_updates_the_Customer_with_email_by_changing_phone_to_name_to_address_to_and_age_to(String string, String string2, String string3, String string4, String string5) {
    // Write code here that turns the phrase above into concrete actions
   
	if(LoginStep.flagadmin) {
		faupdus=true;
		LoginStep.U.updatCustomer(string,string3,string5,string4,string2);
	
		}
}







@Then("the admin successfully updates the Customer")
public void the_admin_successfully_updates_the_Customer() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(faupdus&&LoginStep.flagadmin);
    
}


@When("the admin deletes the Customer with email {string}")
public void the_admin_deletes_the_Customer_with_email(String string) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flagadmin) {
		fdelcus=true;
		LoginStep.U.deleteCustomer(string);
		}
		
	
}




@Then("the admin successfully deletes the Customer")
public void the_admin_successfully_deletes_the_Customer() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(fdelcus&&LoginStep.flagadmin);
   
}

@Given("the Customer is login with email {string} and password {string}")
public void the_Customer_is_login_with_email_and_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	
	

	
	

	if(LoginStep. U.checkemail(string)==1) {
		LoginStep.flag=true;
		LoginStep. flagemail=true;
	}
	if( LoginStep.U.checkemail(string)==0) {
		LoginStep.flag=false;
		LoginStep.flagemail=false;
	}
	
		if( LoginStep.U.checkpass(string2)==1) {
			LoginStep.flag=true;
			LoginStep.flagpass=true;
			if (!user.passu.contains(LoginStep.U.getPass()))
				user.passu.add(LoginStep.U.getPass());
		}
		if( LoginStep.U.checkpass(string2)==0) {
			LoginStep.flag=false;
			LoginStep.flagpass=false;
		
		 
		}
	
    
}

@When("the Customer browses products")
public void the_Customer_browses_products() {
    // Write code here that turns the phrase above into concrete actions
	
	if(LoginStep.flag) {
	p.printProduct();
	fbrowpro=true;
	}
	
    
}

@Then("the Customer successfully browses products")
public void the_Customer_successfully_browses_products() {
    // Write code here that turns the phrase above into concrete actions
	
	assertTrue(fbrowpro&&LoginStep.flag);
    
}


@When("the Customer  with email {string} makes a purchase for product with id {string}")
public void the_Customer_with_email_makes_a_purchase_for_product_with_id(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    
	if(LoginStep.flag) {
		p.order(string2, string);
		fpunch=true;
		}
}




@Then("the Customer successfully makes a purchase")
public void the_Customer_successfully_makes_a_purchase() {
	
	assertTrue(fpunch&&LoginStep.flag);
	
    
}
@When("the Customer  with email {string} can views orders")
public void the_Customer_with_email_can_views_orders(String string) {
    // Write code here that turns the phrase above into concrete actions
	  
		if(LoginStep.flag) {
			p.vieworder(string);
			fvieworder=true;
			}
	
}



    


@Then("the Customer successfully views orders")
public void the_Customer_successfully_views_orders() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(fvieworder&&LoginStep.flag);
   
}

@Given("the Installer is login with email {string} and password {string}")
public void the_Installer_is_login_with_email_and_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	
	
	if( LoginStep.I.checkpass(string2)==1 && LoginStep.I.checkemail(string)==1 ) {
		LoginStep.flagIns=true;
	}
	if( LoginStep.I.checkpass(string2)==0 || LoginStep.I.checkemail(string)==0) {
		LoginStep.flagIns=false;
	}
   
}

@When("the Installer views installation requests")
public void the_Installer_views_installation_requests() {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flagIns) {
	fins=true;
	LoginStep.I.Viewinstallationreq();
	}
    
	
}

@Then("the Installer successfully views installation requests")
public void the_Installer_successfully_views_installation_requests() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(fins&&LoginStep.flagIns);
	
}



@When("the Installer schedules an appointment with date {string}, time {string}")
public void the_Installer_schedules_an_appointment_with_date_time(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flagIns) {
		fapp=true;
		LoginStep.I.scheduleapp(string, string2);
	}
    
}
	
	


@Then("the Installer successfully schedules an appointment")
public void the_Installer_successfully_schedules_an_appointment() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(fapp&&LoginStep.flagIns);
}



	





}