package carpack;

import java.util.List;



import java.util.ArrayList;
import carpack.Installer;




public class user {

		
	static 	boolean y;
		 String name;
		  String address; 
		  String age;
		  String phone;
		  String app;
		//  product p=new product();
		//  static String j;
	 
		  
		  

		 static List<String> emailu =new ArrayList<String>();
		 static List<String> passu =new ArrayList<String>();
		// static List<user> customerData =new ArrayList<user>();
		 static List<String> phone1 =new ArrayList<String>() ;
		 static List<user> useru = new ArrayList<user>();
		 static List<product> order =new ArrayList<product>();
		 
		 
		 private String emaill;
			private String passs;
		

			
			 public user() {
					this.name="lujaindarwazeh";
					this.address="Nablus";
					this.emaill="lujainuser@gmail.com";
					this.passs="useruser";
					this.phone="059986789";
					this.age="20";
					
					emailu.add("lujainuser@gmail.com");
					passu.add("useruser");
					
			
				
					
					phone1.add("059986789");
					if(!useru.contains(this))
						useru.add(this);
					
					
					if (!passu.contains("useruser"))
						passu.add("useruser");
					if (!emailu.contains("lujainuser@gmail.com"))
						emailu.add("lujainuser@gmail.com");
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
				return emaill;
			}
			public void setemail(String email) {
				this.emaill = email;
				
				//if (!emailu.contains(email))
					// emailu.add(email);
			}
			public String getPass() {
				return passs;
			}
			public void setPass(String pass) {
				this.passs = pass;
				//if (!passu.contains(pass))
					// passu.add(pass);
			}
		    
			public static  int checkpass(String p) {
				for(int i=0;i<passu.size();i++)
				{
					if(p.equals(passu.get(i)))
				    return 1;
				}
				return 0;
			
				
			}
			public static int checkemail(String e) {
		
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
			
			
			
			public void deleteCustomer(String ph1)
			{
				
				for(int i=0;i<useru.size();i++)
				{
					if(useru.isEmpty())
						break;
					else if(useru.get(i).phone.equals(ph1)) {
						useru.remove(i);
						
					}
					
					
				}
				}
			
			public void  reqinst(String date,String time,String detail) {
				
				app="date:"+date+"time"+time+"detail"+detail;
				if(!(Installer.appo.contains(app)))
				Installer.appo.add(app);
				
				
			}
			
			

			
			
			public void updatCustomer(String name1,String age1,String adderess1,String ph1)
			{
				this.setCustomerName(name1);
				this.setCustomerAge(age1);
				this.setCustomerAddress(adderess1);
				this.setCustomerPhoneNumber(ph1);
				
				
				
				for(int i=0;i<useru.size();i++)
				{
					
				if(useru.get(i).getCustomerPhoneNumber().equals(ph1))
					useru.set(i, this);
				}
			
			}
			
			
		//	public void Browseproducts() {
			//    p.printProduct();
				
				
				
			//}
			

			
			public static void printCustomer() {
			    List<String> uniqueCustomerInfo = new ArrayList<>();
			    List<user> uniqueCustomers = new ArrayList<>();
			    
			    for (user customer : useru) {
			        String customerInfo = customer.name + " " + customer.phone + " " + customer.address + " " + customer.age;
			        
			        if (!uniqueCustomerInfo.contains(customerInfo)) {
			            uniqueCustomerInfo.add(customerInfo);
			            uniqueCustomers.add(customer);
			        }
			    }
			    
			    // Update useru to only include unique customers
			    useru.clear();
			    useru.addAll(uniqueCustomers);
			    
			    if (useru.isEmpty()) {
			        System.out.println("No customers available to delete.");
			    } else {
			        for (user customer : useru) {
			            String j = "Customer: " + customer.name + " " + customer.phone + " " + customer.address + " " + customer.age;
			            System.out.println(j);
			        }
			    }
			}
			 public static void editProfile(String newEmail, String newPassword, String newPhone, String newName, String newAddress, String newAge) {
				    // Check if the email matches the identifierEmail
				 for(int i=0;i<useru.size();i++) {
				    if (useru.get(i).getemail().equals(newEmail)) {
				        // Update the customer's profile information with the new data
				    	
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
					    	
				    System.out.println("User Profile:");
				    System.out.println("Email: " + email);
				    System.out.println("Password: " + useru.get(i).passs);
				    System.out.println("Phone: " + useru.get(i).phone);
				    System.out.println("Name: " + useru.get(i).name);
				    System.out.println("Address: " + useru.get(i).address);
				    System.out.println("Age: " + useru.get(i).age);
				    y= true;
				    
					    }
					    else {
					    	y= false;
					    }
					    
					 
				}
			  
				 return y;   

			 }
}
			
			
			
			
			
			
			
			
		
			
			
			
		




