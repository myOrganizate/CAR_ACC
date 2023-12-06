package carpack;

import java.util.List;
import java.util.logging.Logger;
import java.util.ArrayList;
import carpack.Installer;




public class user {
	 private static final Logger logger = Logger.getLogger(Installer.class.getName());


		
	static 	boolean y;
		
		
		  String app;
		  private static final String DEFAULT_PASSWORD = "useruser";
		  private static final String DEFAULT_EMAIL = "Jodikmal@gmail.com";
		  


		
	 
		  
		  

		 static List<String> emailu =new ArrayList<String>();
		 static List<String> passu =new ArrayList<String>();
		 static List<String> phone1 =new ArrayList<String>() ;
		 static List<user> useru = new ArrayList<user>();
		 static List<product> order =new ArrayList<product>();
		 
		
		 
		 String name;
		     String address;
		    private String emaill; // Assuming a typo, perhaps you meant 'email'
		    private String passs;
		     String phone;
		     String age;
			
		

			
			 public user() {
				
					this.name="jodikmal";
					this.address="Nablus";
					this.emaill=DEFAULT_EMAIL;
					this.passs=DEFAULT_PASSWORD;
					this.phone="059986789";
					this.age="20";
					
					emailu.add(DEFAULT_EMAIL);
					passu.add(DEFAULT_PASSWORD);
					phone1.add("059986789");
					useru.add(this);
					
					
					if (!useru.contains(this)) {
					    useru.add(this);
					} else {
					}

					
					
					if (!passu.contains(DEFAULT_PASSWORD))
						passu.add(DEFAULT_PASSWORD);
					
					
					if (!emailu.contains(DEFAULT_EMAIL))
						emailu.add(DEFAULT_EMAIL);
					
					
					
				}
			 
			 
			 public user(String email,String pass,String addrees,String name,String phone,String age) {
					this.name=name;
					this.address=addrees;
					this.emaill=email;
					this.passs=pass;
					this.phone=phone;
					this.age=age;
					
					emailu.add(email);
					passu.add(pass);
					
			
				
					
					phone1.add(phone);
					
					if(!useru.contains(this))
						useru.add(this);
					
					
					if (!passu.contains(pass))
						passu.add(pass);
					if (!emailu.contains(email))
						emailu.add(email);
				 
			 }
			
			public String getemail() {
				if(!emailu.contains(DEFAULT_EMAIL))
					emailu.add(DEFAULT_EMAIL);
				return emaill;
			}
			public void setemail(String email) {
				if (!emailu.contains(DEFAULT_EMAIL))
    		       emailu.add(DEFAULT_EMAIL);
				this.emaill = email;
				

			}
			public String getPass() {
				return passs;
			}
			public void setPass(String pass) {
				this.passs = pass;
			
			}
			public void setName(String name) {
				this.name = name;
			
			}
		    
			public static  int checkpass(String p) {
				if (!passu.contains(DEFAULT_PASSWORD))
					 passu.add(DEFAULT_PASSWORD);
				for(int i=0;i<passu.size();i++)
				{
					if(p.equals(passu.get(i)))
				    return 1;
				}
				return 0;
			
				
			}
			
			public static int checkemail(String e) {
							
							if (!emailu.contains(DEFAULT_EMAIL))
								 emailu.add(DEFAULT_EMAIL);
					
							for(int i=0;i<emailu.size();i++)
							{
								if(e.equals(emailu.get(i)))
							    return 1;
							}
							return 0;
							
				

				
			}
			
			public  String getCustomerName() {
				return this.name;
			}

			public void setCustomerName(String customerName) {
				this.name = customerName;
			}

			public String getCustomerPhoneNumber() {
				return this.phone;
			}

			public void setCustomerPhoneNumber(String customerPhoneNumber) {
				this.phone = customerPhoneNumber;
			}

			public  String getCustomerAddress() {
				return this.address;
			}

			public void setCustomerAddress(String s) {
				this.address = s;
			}

			public  String getCustomerAge() {
				return this.age;
			}

			public void setCustomerAge(String s) {
				this.age = s;
			}
			
			
			public void createCustomer(String email,String pass,String phone,String name,String address,String age) {
				
				this.name=name;
				this.address=address;
				this.emaill=email;
				this.passs=pass;
				this.phone=phone;
				this.age=age;
				
				if(!useru.contains(this))
					useru.add(this);
			}
			
			
			
			public void deleteCustomer(String email)
			{
				
				for(int i=0;i<useru.size();i++)
				{
					if(useru.isEmpty())
						break;
					else if(useru.get(i).emaill.equals(email)) {
						useru.remove(i);
						
					}
					
					
				}
				}
			
			
			
			public void reqinst(String date, String time, String detail) {
			    app = "date:" + date + "time" + time + "detail" + detail;
			    
			    if (!(Installer.appo.contains(app))) {
			        Installer.appo.add(app);
			    }
			}

			
			
			
			
			
			public void updatCustomer(String email,String name,String age,String add,String phone)
			{
				this.setCustomerName(name);
				this.setCustomerAge(age);
				this.setCustomerAddress(add);
				this.setCustomerPhoneNumber(phone);
				
				
				
				for(int i=0;i<useru.size();i++)
				{
					
				if(useru.get(i).getemail().equals(email))
					useru.set(i, this);
				}
			
			}
			
			
			
			
			
			
			
	
			

			
			public static void printCustomer() {
			    List<String> uniqueCustomerInfo = new ArrayList<String>();
			    List<user> uniqueCustomers = new ArrayList<user>();
			    
			    for (user customer : useru) {
			        String customerInfo = customer.name + " " + customer.phone + " " + customer.address + " " + customer.age;
			        
			        if (!uniqueCustomerInfo.contains(customerInfo)) {
			            uniqueCustomerInfo.add(customerInfo);
			            uniqueCustomers.add(customer);
			        }
			    }
			    
			    useru.clear();
			    useru.addAll(uniqueCustomers);
			    
			    if (useru.isEmpty()) {
			    	logger.info("No customers available to delete.");
			    } else {
			    	for (user customer : useru) {
			    	    String j = "Customer: " + "Name: " + customer.name + " Phone: " + customer.phone + " Address: " + customer.address + " Age: " + customer.age;
			    	    logger.info(j);
			    	
			        }
			    }
			}
			 public static void editProfile(String newEmail, String newPassword, String newPhone, String newName, String newAddress, String newAge) {
				 for(int i=0;i<useru.size();i++) {
				    if (useru.get(i).getemail().equals(newEmail)) {
				    	
				       useru.get(i) .emaill = newEmail;
				       useru.get(i) .passs = newPassword;
				       useru.get(i) .phone = newPhone;
				        useru.get(i) .name = newName;
				        useru.get(i) .address = newAddress;
				        useru.get(i) .age = newAge;
				        
				    }
				}
			 }
			 public static boolean printProfile(String email) {
		
				 
				 for(int i=0;i<useru.size();i++) {
					
		
				if (useru.get(i).getemail().equals(email)) {
						
					    	
					logger.info("User Profile:");
					logger.info("Email: " + email);
					logger.info("Password: " + useru.get(i).passs);
					logger.info("Phone: " + useru.get(i).phone);
					logger.info("Name: " + useru.get(i).name);
					logger.info("Address: " + useru.get(i).address);
					logger.info("Age: " + useru.get(i).age);
				    y= true;
				    
					    }
					    else {
					    	y= false;
					    }
					    
					 
				}
			  
				 return y;   

			 }
			 public int checkPhone(String num)
				{
					for(int i=0;i<phone1.size();i++)
					{
						if(num.equals(phone1.get(i)))
							return 1;
					}
				return 0;
					
				}
}
			
			
			
			
			
			
			
			
		
			
			
			
		




