package carpack;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStep {
	
	
	
	static boolean fpav;
	product p=new product();
	static boolean fext;
	static boolean fint;
	static boolean felec;
	static String s;
	
	@Given("Product  available")
	public void product_available() {
	    // Write code here that turns the phrase above into concrete actions
		fpav=true;
		
	}

	@Then("Products organized into categories \\( {string}, {string},{string})")
	public void products_organized_into_categories(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(fpav);
	}

	@Given("Product  not available")
	public void product_not_available() {
	    // Write code here that turns the phrase above into concrete actions
		fpav=false;
		
	    
	}

	@Then("Products cant organized into categories \\( {string}, {string},{string})")
	public void products_cant_organized_into_categories(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		
		assertTrue(!fpav);
	   
	}

	@Given("Product  available in our stock")
	public void product_available_in_our_stock() {
	    // Write code here that turns the phrase above into concrete actions
		fpav=true;
		
	   
	}

	@Given("Product have categorie \\( {string}, {string},{string})")
	public void product_have_categorie(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		
		s=p.searchProductcat("2");
		if(s=="Exterior")
			fext=true;
		if(s=="Interior")
			fint=true;
		if(s=="Electronic")
			felec=true;
		
		
	   
	}

	@When("Search for Product")
	public void search_for_Product() {
	    // Write code here that turns the phrase above into concrete actions
		product t =p.searchProduct("2");
	    
	}

	@Then("I should see a product details\\({string},{string},{string} ,{string} )")
	public void i_should_see_a_product_details(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
		p.printProduct("2");
	   
	}

	@Then("I should be able to filter the product by\\({string},{string},{string})")
	public void i_should_be_able_to_filter_the_product_by(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



}
