package carpack;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RoleStep {
	
	static boolean fManageproducts;
	static boolean fManagecategories;
	static boolean fManageuseraccounts;
	
	
	
	
	static boolean fBrowseproducts;
	static boolean fmakepurchases;
	static boolean fvieworders;
	
	
	static boolean fViewrequests ;
	static boolean fschedulappointments;


	
	@Given("the admin is login")
	public void the_admin_is_login() {
	    // Write code here that turns the phrase above into concrete actions
		LoginStep.flagadmin=true;

	    
	}

	@When("admin can Manage products, categories, and  Manage user accounts")
	public void admin_can_Manage_products_categories_and_Manage_user_accounts() {
	    // Write code here that turns the phrase above into concrete actions
		
		fManageproducts=true;
		fManagecategories=true;
		fManageuseraccounts=true;
		
		LoginStep.A.createpro("1", "redlight", "20$", "In Stock ", "Interior");
		LoginStep.A.createpro("2", "greenlight", "20$", "In Stock ", "Interior");
		LoginStep.A.createpro("3", "bluelight", "20$", "In Stock ", "Interior");
		
		LoginStep.A.updProduct("2", "greenligh", "20$", "In Stock ", "Exterior");
		LoginStep.A.deleteProduct("3");
		
		LoginStep.A.addint("4", "yellolight","30$", "In Stock ", "Interior");
		LoginStep.A.addex("5", "orangelight","30$", "In Stock ", "Exterior");
		LoginStep.A.addelec("6", "pinklight","30$", "In Stock ", "Electronic");
		
		LoginStep.A.createuser("jodi@gmail.com", "123", "059865432", "jodi", "nablus", "20");
		LoginStep.A.updateuser("jodi@gmail.com", "123", "059865432", "jodi", "nablus", "21");
		
		
		
		
		
		

	}

	@Then("can Manage products, categories, and user accounts")
	public void can_Manage_products_categories_and_user_accounts() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(fManageproducts && fManagecategories &&fManageuseraccounts);


	   
	}

	@Given("the user is login")
	public void the_user_is_login() {
	    // Write code here that turns the phrase above into concrete actions
		LoginStep.flag=true;

	}

	@When("Customer can Browse products,make purchases, and view orders")
	public void customer_can_Browse_products_make_purchases_and_view_orders() {
	    // Write code here that turns the phrase above into concrete actions
		
		fBrowseproducts=true;
		fmakepurchases=true;
			 fvieworders=true;
			 
			 LoginStep.U.Browseproducts();
			 LoginStep.U.order("2", "greenligh", "20$", "In Stock ", "Exterior");
			 LoginStep.U.vieworders();
			 
			 
			 
			 
			 
			 
			 

	}

	@Then("Browse products, make purchases, and view orders")
	public void browse_products_make_purchases_and_view_orders() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(fBrowseproducts && fmakepurchases&&fvieworders);

	    
	}

	@Given("the  Installer  is login")
	public void the_Installer_is_login() {
	    // Write code here that turns the phrase above into concrete actions
		LoginStep.flagIns=true;

	   
	}

	@When("Installer  View installation requests and schedule appointments")
	public void installer_View_installation_requests_and_schedule_appointments() {
	    // Write code here that turns the phrase above into concrete actions
		
		fViewrequests =true;
		fschedulappointments=true;
		 LoginStep.I.Viewinstallationreq();
		 LoginStep.I.appointment("1-1-2024", "3:00", "wheel product");
		 
		
		

	    
	}

	@Then("View installation requests and schedule appointments")
	public void view_installation_requests_and_schedule_appointments() {
	    // Write code here that turns the phrase above into concrete actions
		
		assertTrue(fViewrequests && fschedulappointments);

	    
	}

}
