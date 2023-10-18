package carpack;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.it.Date;

public class admin {
	
	
	 String email;
	 String password;
	 
	 
	// static List<String> emailAdmin =new ArrayList<String>() ;
	 //static List<String> passAdmin =new ArrayList<String>() ;
	product p=new product();
	user u=new user();
	
	 
	 
	public String getEmail() {
		
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
		
		
	}
	
	
	public int checkemail(String string) {
	
		if(string.equals("lujain@gmail.com") ) {
			return 1;
		}
		
		return 0;
	}
	
	public int checkpass(String string2) {
		
		if(string2.equals("lujain")) {
			return 1;
		}
		
		return 0;
	}
	
	public void createpro(String id,String description,String prices,String availability,String Categories) {
		
		p.createProduct(id, description, prices, availability, Categories);
		
	}
	
	public void updProduct(String id,String description,String prices,String availability,String Categories) {
		
		p.updateProduct(id, description, prices, availability, Categories);
		
	}
	
	public void deleteProduct(String id) {
		p.deleteProduct(id);
		
	}
	
	public product prosearcht(String id) {
		return p.searchProduct(id);
		
	}
	public void  addint(String id,String description,String prices,String availability,String Categorie) {
		p.addprodInterior(id, description, prices, availability, Categorie);
	}
	
	public void  addex(String id,String description,String prices,String availability,String Categorie) {
		p.addprodExterior(id, description, prices, availability, Categorie);
	}
	
	public void  addelec(String id,String description,String prices,String availability,String Categorie) {
		p.addprodElectronic(id, description, prices, availability, Categorie);
	}
	
	public void updateuser(String email,String pass,String phone,String name,String address,String age) {
		u.updateuser(email, pass, phone, name, address, age);
		
	}
	public void createuser(String email,String pass,String phone,String name,String address,String age) {
		u.createCustomer(email, pass, phone, name, address, age);
		
	}
	
	
	
	
	
	     

}
