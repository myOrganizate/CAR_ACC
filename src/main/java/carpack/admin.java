package carpack;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.it.Date;

public class admin {
	
	
	 String email;
	 String password;
	 
	 
	
	
	 
	 
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
	
	

	
	
	
	
	     

}
