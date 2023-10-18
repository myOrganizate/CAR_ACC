package carpack;

import java.util.List;



import java.util.ArrayList;
import carpack.Installer;



public class user {

		
		
		 String name;
		  String address; 
		  String age;
		  String phone;
		  String app;
		  product p=new product();
	 

		 static List<String> emailu =new ArrayList<String>();
		 static List<String> passu =new ArrayList<String>();
		 static List<user> customerData =new ArrayList<user>();
		 static List<String> phone1 =new ArrayList<String>() ;
		// static List<user> user1 =new ArrayList<user>();
		 static List<product> order =new ArrayList<product>();
		 
		 
		 private String emaill;
			private String passs;
		

			public user(String em, String pa) {
				// TODO Auto-generated constructor stub
				emaill=em;
				passs=pa;
				emailu.add(em);
				passu.add(pa);
			
			}
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
					
					customerData.add(this);
					if (!passu.contains("useruser"))
						passu.add("useruser");
					if (!emailu.contains("lujainuser@gmail.com"))
						emailu.add("lujainuser@gmail.com");
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
		    
			public int checkpass(String p) {
				for(int i=0;i<passu.size();i++)
				{
					if(p.equals(passu.get(i)))
				    return 1;
				}
				return 0;
			
				
			}
			public int checkemail(String e) {
		
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
				
				if(!customerData.contains(this))
					customerData.add(this);
			}
			
			
			/*
			public void updatCustomer(String name1,String age1,String adderess1,String ph1)
			{
				this.setCustomerName(name1);
				this.setCustomerAge(age1);
				this.setCustomerAddress(adderess1);
				this.setCustomerPhoneNumber(ph1);
				
				
				
				for(int i=0;i<customerData.size();i++)
				{
					
				if(customerData.get(i).getCustomerPhoneNumber().equals(ph1))
					customerData.set(i, this);
				}
			
			}
			*/
			public void deleteCustomer(String ph1)
			{
				
				for(int i=0;i<customerData.size();i++)
				{
					if(customerData.isEmpty())
						break;
					else if(customerData.get(i).getCustomerPhoneNumber().equals(ph1)) {
						customerData.remove(i);
						
					}
					
					
				}
				}
			
			public void  reqinst(String date,String time,String detail) {
				
				app="date:"+date+"time"+time+"detail"+detail;
				if(!(Installer.appo.contains(app)))
				Installer.appo.add(app);
				
				
			}
			
			
			public void order(String id,String description,String prices,String availability,String Categories) {
				
				p.order(id, description, prices, availability, Categories);
				
				if(!order.contains(this)&&product.flageorder)
				 order.add(p);
				
			}
			public void updateuser(String email,String pass,String phone,String name,String address,String age) {
				
				
				for(int i=0;i<customerData.size();i++)
				{
					
					if(customerData.get(i).phone.equals(phone)) {
						
					
						customerData.set(i, this);
		
						
							
					}
						
					
						
						
					}
				
				
			}
			
			
			public void Browseproducts() {
			    p.printProduct();
				
				
				
			}
			
			public void vieworders() {
		
				for(int i=0;i<order.size();i++)
				{
					
								
				
			}
			}
			
			
			
		



}
