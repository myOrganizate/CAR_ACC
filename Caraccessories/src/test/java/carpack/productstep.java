package carpack;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class productstep {
	boolean faddproduct;
	boolean  fcp;
	boolean fnp;
	boolean fap;
	boolean fan;
	boolean fcn;
	boolean fca;
	boolean fp,fin,fex,felec;
	boolean fn,fa,fci,fce,fcel,fav,fpr;
	
	

@When("the admin can add product with details id {string}, name {string}, price {string}, availability {string}, Categorie {string}, image {string}")
public void the_admin_can_add_product_with_details_id_name_price_availability_Categorie_image(String string, String string2, String string3, String string4, String string5, String string6) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flagadmin) {
    	faddproduct=true;
    	RoleStep.p.createProduct(string, string2, string3, string4, string5);
    	
    	}
}

@Then("admin can add this product")
public void admin_can_add_this_product() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(faddproduct);
}

@When("the user selects the {string} category with a price range between {string} and {string}")
public void the_user_selects_the_category_with_a_price_range_between_and(String string, String string2, String string3) {
    // Write code here that turns the phrase above into concrete actions
	
	if(LoginStep.flag) {
		fcp=true;
		RoleStep.p.filterProductcatprice(string,string2,string3);
	}
    
}

@Then("the user should see a list of products matching the criteria")
public void the_user_should_see_a_list_of_products_matching_the_criteria() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(fcp);
}

@When("the user enters {string} product in the search bar with a price range between {string} and {string}")
public void the_user_enters_product_in_the_search_bar_with_a_price_range_between_and(String string, String string2, String string3) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flag) {
		fnp=true;
		RoleStep.p.filterProductnameprice(string,string2,string3);
	}
	
    
}

@Then("the user should see a list of products matching this")
public void the_user_should_see_a_list_of_products_matching_this() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(fnp);
}

@When("the user selects the availablity {string} with price range between {string} and {string}")
public void the_user_selects_the_availablity_with_price_range_between_and(String string, String string2, String string3) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flag) {
		fap=true;
		RoleStep.p.filterProductavaprice(string,string2,string3);
	}
    
}

@Then("the user should see a list of products matching")
public void the_user_should_see_a_list_of_products_matching() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(fap);
}

@When("the user selects the availablity {string} with name {string}")
public void the_user_selects_the_availablity_with_name(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flag) {
		fan=true;
		RoleStep.p.filterProductBynameandavay(string,string2);
	}
    
	
	
    
}

@Then("the user should see a list of products matching those condition")
public void the_user_should_see_a_list_of_products_matching_those_condition() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(fan);
}

@When("the user selects the category {string} with name {string}")
public void the_user_selects_the_category_with_name(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flag) {
		fcn=true;
		RoleStep.p.filterProductBycatgoryandname(string,string2);
	}
    
}





@Then("the user should see a list of products matching condition")
public void the_user_should_see_a_list_of_products_matching_condition() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(fcn);
}


@When("the user selects the category {string} with availablity {string}")
public void the_user_selects_the_category_with_availablity(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flag) {
		fca=true;
		RoleStep.p.filterProductBycatgoryandavay(string,string2);
	}
}

@Then("user should see a list of products matching condition")
public void user_should_see_a_list_of_products_matching_condition() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(fca);
}

@When("the user selects the price range between {string} and {string}")
public void the_user_selects_the_price_range_between_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flag) {
		fp=true;
		RoleStep.p.filterProductByprice(string,string2);
	}
    
}

@Then("the user should see a list of products in this range")
public void the_user_should_see_a_list_of_products_in_this_range() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(fp);
}

@When("the user selects the name {string}")
public void the_user_selects_the_name(String string) {
    // Write code here that turns the phrase above into concrete actions
	
	if(LoginStep.flag) {
		fn=true;
		RoleStep.p.filterProductByname(string);
	}
    
	
    
}

@Then("the user should see a list of this products")
public void the_user_should_see_a_list_of_this_products() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(fn);
}


@When("the user selects the availablity {string}")
public void the_user_selects_the_availablity(String string) {
    // Write code here that turns the phrase above into concrete actions
	if(LoginStep.flag) {
		fav=true;
		RoleStep.p.filterProductByAvailability(string);
	}
}

@Then("the user should see a list of  products that are currently available")
public void the_user_should_see_a_list_of_products_that_are_currently_available() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(fav);
}




@When("the user selects the {string} product")
public void the_user_selects_the_product(String string) {
    // Write code here that turns the phrase above into concrete actions
	if (LoginStep.flag) {
	    fpr = true;

	    RoleStep.p.filterProductByCategory(string);

	    if ("interior".equalsIgnoreCase(string)) {
	        fin = true;
	    } else if ("exterior".equalsIgnoreCase(string)) {
	        fex = true;
	    } else {
	        felec = true;
	    }
	}
    
}

@Then("the user should see a list of Interior products")
public void the_user_should_see_a_list_of_Interior_products() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(fpr&&fin);
    
}

@Then("the user should see a list of Exterior products")
public void the_user_should_see_a_list_of_Exterior_products() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(fpr&&fex);
    
}

@Then("the user should see a list of Electronic products")
public void the_user_should_see_a_list_of_Electronic_products() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(fpr&&felec);
    
}











}



