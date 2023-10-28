package carpack;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;





public class product {
	
	  String id;
		
		String Categories;
		String availability;
		String prices;
		 String image;
		static String a;
		String email;
		
		//"Exterior" "Interior" "Electronic"
		 static boolean flageorder;
		 String description;
		 
		 static List<product> prod =new ArrayList<product>() ;
		 static List<product> prodInterior =new ArrayList<product>() ;
		 static List<product> prodExterior =new ArrayList<product>() ;
		 static List<product> prodElectronic =new ArrayList<product>() ;
		 static boolean fexist;
		 static String fint;
		 static String fextt;
		 static String felec;
		 static List<product> order =new ArrayList<product>();
	
	
	
	
		 public product(String id, String description, String prices, String availability, String Categories, String image, String customerEmail) {
			  this.id=id;
		         this.description=description;
		      this.prices=prices;
		         this.image=image;
		         this.availability= availability;
		         this.Categories=Categories;
		         this.email=customerEmail;
		        
		       if(!prod.contains(this))
		         prod.add(this);
		 		
		 		if (Categories.equals("Exterior"))
		 			prodExterior.add(this);
		 		if (Categories.equals("Interior"))
		 			prodInterior.add(this);
		 		if (Categories.equals("Electronic"))
		 			prodElectronic.add(this);	
			
		 }
	
	 public product() { 
         this.id="1";
         this.description="car light";
      this.prices="200$";
         this.image="im1";
         this.availability="In Stock ";
         this.Categories="Electronic";
        
       
 		if( prod.isEmpty())
         prod.add(this);
 		
 		if (Categories.equals("Exterior"))
 			prodExterior.add(this);
 		if (Categories.equals("Interior"))
 			prodInterior.add(this);
 		if (Categories.equals("Electronic"))
 			prodElectronic.add(this);	
	     
}
	 
	 public product(String id,String description,String prices,String availability,String Categories,String image) { 
		  this.id=id;
	         this.description=description;
	      this.prices=prices;
	         this.image=image;
	         this.availability= availability;
	         this.Categories=Categories;
	        
	       if(!prod.contains(this))
	         prod.add(this);
	 		
	 		if (Categories.equals("Exterior"))
	 			prodExterior.add(this);
	 		if (Categories.equals("Interior"))
	 			prodInterior.add(this);
	 		if (Categories.equals("Electronic"))
	 			prodElectronic.add(this);	
		
		
		
		
	}
	 
	 
	 public void createProduct(String id,String description,String prices,String availability,String Categories)
		{
			this.id=id;
			this.prices=prices;
			this.description=description;
			this.availability=availability;
			this.Categories=Categories;
			
		
			
			
			
			
			
			if(!prod.contains(this))
				prod.add(this);
			
			
			
			if (Categories.equals("Exterior"))
	 			prodExterior.add(this);
	 		if (Categories.equals("Interior"))
	 			prodInterior.add(this);
	 		if (Categories.equals("Electronic"))
	 			prodElectronic.add(this);	
		
			
			
			
		}
	 public void updateProduct(String idd, String description, String prices, String availability, String Categorie, String image) {
		    for (int i = 0; i < prod.size(); i++) {
		        if (prod.get(i).id.equals(idd)) {
		            prod.get(i).id = idd;
		            prod.get(i).description = description;
		            prod.get(i).prices = prices;
		            prod.get(i).availability = availability;

		            // Update the category
		            prod.get(i).Categories = Categorie;

		            // Update the image (if required)
		            prod.get(i).image = image;

		            // Check the new category and add the product to the appropriate list
		            if (Categorie.equals("Exterior")) {
		                prodExterior.add(prod.get(i));
		            } else if (Categorie.equals("Interior")) {
		                prodInterior.add(prod.get(i));
		            } else if (Categorie.equals("Electronic")) {
		                prodElectronic.add(prod.get(i));
		            }
		        }
		    }
		}
	 
	 public static void deleteProduct(String id) {
		    for (int i = 0; i < prod.size(); i++) {
		        if (prod.isEmpty()) {
		            break;
		        } else if (prod.get(i).id.equals(id)) {
		            prod.remove(i);

		            // Use the 'id' to find the correct product to remove from other lists
		            for (int j = 0; j < prodInterior.size(); j++) {
		                if (prodInterior.get(j).id.equals(id)) {
		                    prodInterior.remove(j);
		                    break;
		                }
		            }

		            for (int j = 0; j < prodExterior.size(); j++) {
		                if (prodExterior.get(j).id.equals(id)) {
		                    prodExterior.remove(j);
		                    break;
		                }
		            }

		            for (int j = 0; j < prodElectronic.size(); j++) {
		                if (prodElectronic.get(j).id.equals(id)) {
		                    prodElectronic.remove(j);
		                    break;
		                }
		            }
		        
	
	 
	 
	
		        }
		    }
	

}


	
	public product searchProduct(String id)
	{
		if(prod.isEmpty())
			
			return null;
	

		
		for(int i=0;i<prod.size();i++)
		{
			
			 if(prod.get(i).id.equals(id)) {
				 fexist=true;
				return  prod.get(i);
				
				
			}
			    
			
		}
		return null;
		
		
	

}
	
	
	

	public String searchProductcat(String id)
	{
		if(prod.isEmpty())
			
			return null;
	

		
		for(int i=0;i<prodExterior.size();i++)
		{
			
			
			 if(prodExterior.get(i).id.equals(id)) {
				 
				fextt="yes";
				return  "Exterior";
				
			}
		}
			 
			 
		for(int i=0;i<prodInterior.size();i++) { 
			 if(prodInterior.get(i).id.equals(id)) {
				 fint="yes";	
				 return  "Interior";
					
				}
			 }
		
		for(int i=0;i<prodElectronic.size();i++) {
			 if(prodElectronic.get(i).id.equals(id)) {
				 felec="yes";
				 return "Electronic";
				 
					
					
				}
		
			 
			 
			    
			
		}
		
		
		
		
		
		return null;
		
		
	

}
	
	
	
	public void addprodInterior(String id,String description,String prices,String availability,String Categorie,String img) {
		 product newProduct = new product(id, description, prices, availability, Categorie,image);

		if(!prod.contains(newProduct))
			prod.add(newProduct);
		
		if(!prodInterior.contains(newProduct))
			prodInterior.add(newProduct);
		
		
	}
	
	public void addprodExterior(String id,String description,String prices,String availability,String Categorie,String imag) {
		 product newProduct = new product(id, description, prices, availability, Categorie,image);
		
		if(!prod.contains(newProduct))
	    prod.add(newProduct);
		
		if(!prodExterior.contains(newProduct))
			prodExterior.add(newProduct);
		
		
	}
	
	public static void addprodElectronic(String id, String description, String prices, String availability, String Categorie,String image) {
	    // Create a new instance of your product class
	    product newProduct = new product(id, description, prices, availability, Categorie,image);

	    
	    prod.add(newProduct);
	    prodElectronic.add(newProduct);
	}
	
	public static void printProduct() {
	    for (int i = 0; i < prod.size(); i++) {
	        String a = "Product : " + prod.get(i).id + " " + prod.get(i).description + " " + prod.get(i).prices + " " +
	                prod.get(i).availability + " " + prod.get(i).Categories;
	        System.out.println(a);
	    }
	}
	
	

	public static void printProduct(String id) {
		
	
		
		for(int i=0;i<prod.size();i++)
		{
			
			 if(prod.get(i).id.equals(id)) {
			
			
			a="Product : "+prod.get(i).id+" "+prod.get(i).description+" "+prod.get(i).prices+" "+
					prod.get(i).availability+" " +prod.get(i).Categories+" " +prod.get(i).image;
			
			 }
			 
		}
		
		 System.out.println(a);
		
		
	}
	
	
	
	
	
	
	
	
	public static void printProductExterior() {
	    for (int i = 0; i < prodExterior.size(); i++) {
	        String a = "Product : " + prodExterior.get(i).id + " " + prodExterior.get(i).description + " " + prodExterior.get(i).prices + " " +
	        		prodExterior.get(i).availability + " " + prodExterior.get(i).Categories;
	        System.out.println(a);
	    }
	}
	public static void printprodInterior() {
	    for (int i = 0; i < prodInterior.size(); i++) {
	        String a = "Product : " + prodInterior.get(i).id + " " + prodInterior.get(i).description + " " + prodInterior.get(i).prices + " " +
	        		prodInterior.get(i).availability + " " + prodInterior.get(i).Categories;
	        System.out.println(a);
	    }
	}
	public static void printprodElectronic() {
	    for (int i = 0; i < prodElectronic.size(); i++) {
	        String a = "Product : " + prodElectronic.get(i).id + " " + prodElectronic.get(i).description + " " + prodElectronic.get(i).prices + " " +
	        		prodElectronic.get(i).availability + " " + prodElectronic.get(i).Categories;
	        System.out.println(a);
	    }
	}
	
	
	
	
	
	public void order(String id, String email) {
	    for (product orderedProduct : prod) {
	        if (orderedProduct.id.equals(id)) {
	            // Add the email address of the customer to the product
	            orderedProduct.email = email;
	            // Add the ordered product to the 'order' list
	            order.add(orderedProduct);
	            flageorder = true; // Set the flag to indicate that an order was placed
	            break; // Break the loop once the product is found
	        }
	    }
	}

	public static void vieworder(String customerEmail) {
	    for (product orderedProduct : order) {
	        if (orderedProduct.email.equals(customerEmail)) {
	            // Print order details
	            System.out.println("Product ID: " + orderedProduct.id);
	            System.out.println("Description: " + orderedProduct.description);
	            System.out.println("Price: " + orderedProduct.prices);
	            // Add more order information here
	        }
	    }
	}
	
	
	
 public void filter(String s) {
	 
	
	 
 }
	
	




	




	

	


}
