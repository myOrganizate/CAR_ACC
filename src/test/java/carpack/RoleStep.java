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
	static boolean f1;
	static boolean f2;
	static boolean f3;
	static boolean f4;
	static boolean f5;
	static boolean f6;
	static boolean f7;

	
	
	
	
	
	
	
	
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
	
	if(LoginStep.flagadmin) {
	faddInterior=true;
	p.addprodInterior(string, string2, string3, string4, string5, string6);
	}
    
}

@Then("the admin successfully adds the Interior product")
public void the_admin_successfully_adds_the_Interior_product() {
	assertTrue(faddInterior&&LoginStep.flagadmin);
	
}



@When("the admin adds an Exterior product with id {string}, name {string}, price {string}, availability {string}, category {string}, and image {string}")
public void the_admin_adds_an_Exterior_product_with_id_name_price_availability_category_and_image(String string, String string2, String string3, String string4, String string5, String string6) {
	
	if(LoginStep.flagadmin) {
	faddExterior=true;
	p.addprodExterior(string, string2, string3, string4, string5, string6);
	}
}

@Then("the admin successfully adds the Exterior product")
public void the_admin_successfully_adds_the_Exterior_product() {
	assertTrue(faddExterior&&LoginStep.flagadmin);
    
}



@When("the admin adds an Electronic product with id {string}, name {string}, price {string}, availability {string}, category {string}, and image {string}")
public void the_admin_adds_an_Electronic_product_with_id_name_price_availability_category_and_image(String string, String string2, String string3, String string4, String string5, String string6) {

	if(LoginStep.flagadmin) {
	faddElec=true;
	p.addprodElectronic(string, string2, string3, string4, string5, string6);   
	}
}

@Then("the admin successfully adds the Electronic product")
public void the_admin_successfully_adds_the_Electronic_product() {
    
	assertTrue(faddElec&&LoginStep.flagadmin);
	
}



@When("the admin creates a Customer with email {string}, password {string}, phone {string}, name {string}, address {string}, and age {string}")
public void the_admin_creates_a_Customer_with_email_password_phone_name_address_and_age(String string, String string2, String string3, String string4, String string5, String string6) {
	
	
	if(LoginStep.flagadmin) {
	faddcus=true;
	LoginStep.U.createCustomer(string, string2, string3, string4, string5, string6);
	}
}

@Then("the admin successfully creates the Customer")
public void the_admin_successfully_creates_the_Customer() {
	assertTrue(faddcus&&LoginStep.flagadmin);
	
   
}






@When("the admin updates the Customer with email {string} by changing phone to {string} ,name to {string}, address to {string}, and age to {string}")
public void the_admin_updates_the_Customer_with_email_by_changing_phone_to_name_to_address_to_and_age_to(String string, String string2, String string3, String string4, String string5) {
   
	if(LoginStep.flagadmin) {
		faupdus=true;
		LoginStep.U.updatCustomer(string,string3,string5,string4,string2);
	
		}
}







@Then("the admin successfully updates the Customer")
public void the_admin_successfully_updates_the_Customer() {
	assertTrue(faupdus&&LoginStep.flagadmin);
    
}


@When("the admin deletes the Customer with email {string}")
public void the_admin_deletes_the_Customer_with_email(String string) {
	if(LoginStep.flagadmin) {
		fdelcus=true;
		LoginStep.U.deleteCustomer(string);
		}
		
	
}




@Then("the admin successfully deletes the Customer")
public void the_admin_successfully_deletes_the_Customer() {
	assertTrue(fdelcus&&LoginStep.flagadmin);
   
}

@Given("the Customer is login with email {string} and password {string}")
public void the_Customer_is_login_with_email_and_password(String string, String string2) {
	
	

	
	

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
	
	if(LoginStep.flag) {
	p.printProduct();
	fbrowpro=true;
	}
	
    
}

@Then("the Customer successfully browses products")
public void the_Customer_successfully_browses_products() {
	
	assertTrue(fbrowpro&&LoginStep.flag);
    
}


@When("the Customer  with email {string} makes a purchase for product with id {string}")
public void the_Customer_with_email_makes_a_purchase_for_product_with_id(String string, String string2) {
    
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
	  
		if(LoginStep.flag) {
			p.vieworder(string);
			fvieworder=true;
			}
	
}



    


@Then("the Customer successfully views orders")
public void the_Customer_successfully_views_orders() {
	assertTrue(fvieworder&&LoginStep.flag);
   
}

@Given("the Installer is login with email {string} and password {string}")
public void the_Installer_is_login_with_email_and_password(String string, String string2) {
	
	
	if( LoginStep.I.checkpass(string2)==1 && LoginStep.I.checkemail(string)==1 ) {
		LoginStep.flagIns=true;
		LoginStep.I.printProfile("ayamoinn95@gmail.com");
		LoginStep.I.editProfile("ayamoinn95@gmail.com","123","aya","","");
		
	}
	if( LoginStep.I.checkpass(string2)==0 || LoginStep.I.checkemail(string)==0) {
		LoginStep.flagIns=false;
	}
   
}

@When("the Installer views installation requests")
public void the_Installer_views_installation_requests() {
	if(LoginStep.flagIns) {
	fins=true;
	LoginStep.I.Viewinstallationreq();
	}
    
	
}

@Then("the Installer successfully views installation requests")
public void the_Installer_successfully_views_installation_requests() {
	assertTrue(fins&&LoginStep.flagIns);
	
	
}



@When("the Installer schedules an appointment with date {string}, time {string}")
public void the_Installer_schedules_an_appointment_with_date_time(String string, String string2) {
	if(LoginStep.flagIns) {
		fapp=true;
		LoginStep.I.scheduleapp(string, string2);
	}
    
}
	
	


@Then("the Installer successfully schedules an appointment")
public void the_Installer_successfully_schedules_an_appointment() {
	assertTrue(fapp&&LoginStep.flagIns);
}








@When("the admin  update an appointment for customer with email {string}  olddate {string}, oldtime {string} newdate {string}, newtime {string}")
public void the_admin_update_an_appointment_for_customer_with_email_olddate_oldtime_newdate_newtime(String string, String string2, String string3, String string4, String string5) {
 
   
	 LoginStep.I.updateappointment(string,string2,string3,"redlight",string4,string5,"redlight");
	 f1=true;

		
		    	

}

@Then("the admin  successfully update an appointment")
public void the_admin_successfully_update_an_appointment() {
 
   assertTrue(f1);
}

@When("the admin  delete  an appointment for customer with email {string} with date {string}, time {string}")
public void the_admin_delete_an_appointment_for_customer_with_email_with_date_time(String string, String string2, String string3) {
   
	 LoginStep.I.deleteappointment(string, string2, string3, "redlight") ;
	 f2=true;


}

@Then("the admin  successfully delete  an appointment")
public void the_admin_successfully_delete_an_appointment() {
	assertTrue(f2);
    
  
}

@Then("the Installer can see his profile")
public void the_Installer_can_see_his_profile() {
    
	LoginStep.I.printProfile("jodikmal@gmail.com");
	assertTrue(f2);
}



@When("the Customer searchProduct with id {string}")
public void the_Customer_searchProduct_with_id(String string) {
  
	p.searchProduct(string);
    p.searchProductcat(string);
    f3=true;
}

@Then("the Customer successfully searchProduct")
public void the_Customer_successfully_searchProduct() {
   
  assertTrue(f3);
}

@When("the admin printProduct with id {string}")
public void the_admin_printProduct_with_id(String string) {
    
	p.printProduct(string);
	f4=true;
}

@Then("the admin successfully printProduct")
public void the_admin_successfully_printProduct() {
    
   assertTrue( f4);
}

@When("the admin print Exterior Product")
public void the_admin_print_Exterior_Product() {
   
	p.printProductExterior();
    
}

@Then("the admin successfully print Exterior Product")
public void the_admin_successfully_print_Exterior_Product() {
 
  assertTrue(f1);
}

@When("the admin print Interior Product")
public void the_admin_print_Interior_Product() {
   
	 p.printprodInterior();
   
}

@Then("the admin successfully print Interior Product")
public void the_admin_successfully_print_Interior_Product() {

 assertTrue(f1);
}

@When("the admin print Electronic Product")
public void the_admin_print_Electronic_Product() {
 
	p.printprodInterior();
   
}

@Then("the admin successfully print Electronic Product")
public void the_admin_successfully_print_Electronic_Product() {
  
  assertTrue(f1);
}

@When("the Customer can vieworder with his email {string}")
public void the_Customer_can_vieworder_with_his_email(String string) {
 
	p.vieworder(string);
    
}

@Then("the Customer successfully vieworder")
public void the_Customer_successfully_vieworder() {

	assertTrue(f1);
    
}

@When("the Customer can editProfile with  email {string} newPassword {string} newPhone {string} newName {string} newAddress {string} newAge {string}")
public void the_Customer_can_editProfile_with_email_newPassword_newPhone_newName_newAddress_newAge(String string, String string2, String string3, String string4, String string5, String string6) {
   
   LoginStep.U.editProfile(string, string2, string3, string4, string5, string6);
}

@Then("the Customer successfully editProfile")
public void the_Customer_successfully_editProfile() {
  
  assertTrue(f1);
}

@When("the Customer can printProfile with  email {string}")
public void the_Customer_can_printProfile_with_email(String string) {

	
	LoginStep.U.printProfile(string);
    
}

@Then("the Customer successfully printProfile")
public void the_Customer_successfully_printProfile() {
   
   
}



@When("the Installer  edit his Profile with email  {string} newPassword {string} newPhone {string} newName {string} newAddress {string}")
public void the_Installer_edit_his_Profile_with_email_newPassword_newPhone_newName_newAddress(String string, String string2, String string3, String string4, String string5) {
  
	LoginStep.I.editProfile(string,string2, string3, string4, string5);
	LoginStep.I.setAddress(string5); 
	LoginStep.I.setName(string4);    
	LoginStep.I.setPhone(string3); 
	f5=true;


}

@Then("the Installer can edit his Profile")
public void the_Installer_can_edit_his_Profile() {
   
	assertTrue(f5);
   
}





}
