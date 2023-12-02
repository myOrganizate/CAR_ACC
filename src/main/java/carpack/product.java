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
		 private int quantity;
		 
	
	
	
	
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
      this.prices="200";
         this.image="im1";
         this.availability="yes";
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
		            // Remove the old product from the appropriate category list
		            if ("Exterior".equals(prod.get(i).Categories)) {
		                prodExterior.remove(prod.get(i));
		            } else if ("Interior".equals(prod.get(i).Categories)) {
		                prodInterior.remove(prod.get(i));
		            } else if ("Electronic".equals(prod.get(i).Categories)) {
		                prodElectronic.remove(prod.get(i));
		            }

		            // Update the product attributes
		            prod.get(i).id = idd;
		            prod.get(i).description = description;
		            prod.get(i).prices = prices;
		            prod.get(i).availability = availability;
		            prod.get(i).Categories = Categorie;
		            prod.get(i).image = image;

		            // Add the updated product to the appropriate category list
		            if ("Exterior".equals(Categorie)) {
		                prodExterior.add(prod.get(i));
		            } else if ("Interior".equals(Categorie)) {
		                prodInterior.add(prod.get(i));
		            } else if ("Electronic".equals(Categorie)) {
		                prodElectronic.add(prod.get(i));
		            }
		        }
		    }
		}
	 
	  public String getId() {
	        return id;
	    }

	    // Getter for the description
	    public String getDescription() {
	        return description;
	    }
	    public String getemail() {
	        return email != null ? email : ""; // Return the email or an empty string if it's null
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	 
	 
	 
	 
	 
	 
	
	 
	 public static void deleteProduct(String id) {
		    // Remove the product from the 'prod' list
		    for (int i = 0; i < prod.size(); i++) {
		        if (prod.get(i).id.equals(id)) {
		            prod.remove(i);
		            break; // Exit the loop once the product is found and removed
		        }
		    }

		    // Remove the product from the 'prodInterior' list
		    for (int j = 0; j < prodInterior.size(); j++) {
		        if (prodInterior.get(j).id.equals(id)) {
		            prodInterior.remove(j);
		            break; // Exit the loop once the product is found and removed
		        }
		    }

		    // Remove the product from the 'prodExterior' list
		    for (int j = 0; j < prodExterior.size(); j++) {
		        if (prodExterior.get(j).id.equals(id)) {
		            prodExterior.remove(j);
		            break; // Exit the loop once the product is found and removed
		        }
		    }

		    // Remove the product from the 'prodElectronic' list
		    for (int j = 0; j < prodElectronic.size(); j++) {
		        if (prodElectronic.get(j).id.equals(id)) {
		            prodElectronic.remove(j);
		            break; // Exit the loop once the product is found and removed
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
	
	
	

 public String getPrices() {
     return prices;
 }

 public String getImage() {
     return image;
 }

 public String getCategories() {
     return Categories;
 }

 public static List<product> filterProductcatprice(String category, String minPrice, String maxPrice) {
	    List<product> filteredProducts = new ArrayList<product>();

	    for (product product : prod) {
	        String productPrice = product.getPrice();
	        if (product.getCategory().equals(category) && isPriceInRange(productPrice, minPrice, maxPrice)) {
	            filteredProducts.add(product);
	        }
	    }

	    // Print the filtered products
//	    for (product filteredProduct : filteredProducts) {
//	        System.out.print("Product Name: " + filteredProduct.getDescription() + "\t");
//	        System.out.print("Product Category: " + filteredProduct.getCategory() + "\t");
//	        System.out.println("Product Price: " + filteredProduct.getPrice());
//	        // Add any other relevant information here
//	    }

	    return filteredProducts;
	}
 
 
 public static  List<product>filterProductnameprice(String description, String minPrice, String maxPrice) {
	    List<product> filteredProducts = new ArrayList<product>();

	    for (product product : prod) {
	        String productDescription = product.getDescription();
	        String productPrice = product.getPrice();
	        
	        if (productDescription.equals(description) && isPriceInRange(productPrice, minPrice, maxPrice)) {
	            filteredProducts.add(product);
	        }
	    }

	    // Print the filtered products
//	    for (product filteredProduct : filteredProducts) {
//	        System.out.print("Product Name: " + filteredProduct.getDescription() + "\t");
//	        System.out.print("Product Category: " + filteredProduct.getCategory() + "\t");
//	        System.out.println("Product Price: " + filteredProduct.getPrice());
//	        // Add any other relevant information here
//	    }

	    return filteredProducts;
	}
 
 
 public static List<product>filterProductavaprice(String availability, String minPrice, String maxPrice) {
	    List<product> filteredProducts = new ArrayList<product>();

	    for (product product : prod) {
	        String productavailability = product.getAvailability();
	        String productPrice = product.getPrice();
	        
	        if (productavailability.equals(availability) && isPriceInRange(productPrice, minPrice, maxPrice)) {
	            filteredProducts.add(product);
	        }
	    }

	    // Print the filtered products
//	    for (product filteredProduct : filteredProducts) {
//	        System.out.print("Product Name: " + filteredProduct.getDescription() + "\t");
//	        System.out.print("Product Category: " + filteredProduct.getCategory() + "\t");
//	        System.out.println("Product Price: " + filteredProduct.getPrice());
//	        // Add any other relevant information here
//	    }

	    return filteredProducts;
	}
 

 
 public static  List<product> filterProductBynameandavay(String availability, String name) {
	    List<product> filteredProducts = new ArrayList<product>();

	    for (product product : prod) {
	        if (product.getDescription().equalsIgnoreCase(name) && product.getAvailability().equalsIgnoreCase(availability)) {
	            filteredProducts.add(product);
	        }
	    }

	    // Print the filtered products
//	    for (product filteredProduct : filteredProducts) {
//	        System.out.print("Product Name: " + filteredProduct.getDescription() + "\t");
//	        System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
//	        System.out.print("Product Price: " + filteredProduct.getPrices() + "\t");
//	        System.out.println("Product Availability: " + filteredProduct.getAvailability());
//	        // Add any other relevant information here
//	    }

	    return filteredProducts;
	}
 
 public  static  List<product> filterProductBycatgoryandname(String category, String name) {
	    List<product> filteredProducts = new ArrayList<product>();

	    for (product product : prod) {
	        if (product.getCategories().equalsIgnoreCase(category) && product.getDescription().equalsIgnoreCase(name)) {
	            filteredProducts.add(product);
	        }
	    }

	    // Print the filtered products
//	    for (product filteredProduct : filteredProducts) {
//	        System.out.print("Product Name: " + filteredProduct.getDescription() + "\t");
//	        System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
//	        System.out.print("Product Price: " + filteredProduct.getPrices() + "\t");
//	        System.out.println("Product Availability: " + filteredProduct.getAvailability());
//	        // Add any other relevant information here
//	    }

	    return filteredProducts;
	}
 
 
 
 
 
 public static  List<product> filterProductBycatgoryandavay(String category, String availability) {
	    List<product> filteredProducts = new ArrayList<product>();

	    for (product product : prod) {
	        if (product.getCategories().equalsIgnoreCase(category) && product.getAvailability().equalsIgnoreCase(availability)) {
	            filteredProducts.add(product);
	        }
	    }

	    // Print the filtered products
//	    for (product filteredProduct : filteredProducts) {
//	        System.out.print("Product Name: " + filteredProduct.getDescription() + "\t");
//	        System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
//	        System.out.print("Product Price: " + filteredProduct.getPrices() + "\t");
//	        System.out.println("Product Availability: " + filteredProduct.getAvailability());
//	        // Add any other relevant information here
//	    }

	    return filteredProducts;
	}
 public String getAvailability() {
     return availability;
 }
 
 
 public static List<product> filterProductByprice(String minPrice, String maxPrice) {
	    List<product> filteredProducts = new ArrayList<product>();

	    for (product product : prod) {
	        String productPrice = product.getPrice();

	        if (isPriceInRange(productPrice, minPrice, maxPrice)) {
	            filteredProducts.add(product);
	        }
	    }

	    // Print the filtered products
//	    for (product filteredProduct : filteredProducts) {
//	        System.out.print("Product Name: " + filteredProduct.getDescription() + "\t");
//	        System.out.print("Product Category: " + filteredProduct.getCategory() + "\t");
//	        System.out.println("Product Price: " + filteredProduct.getPrice());
//	        // Add any other relevant information here
//	    }

	    return filteredProducts;
	}
 public static List<product> filterProductByname(String name) {
	    List<product> filteredProducts = new ArrayList<product>();

	    for (product product : prod) {
	        String productName = product.getDescription();

	        if (productName.equalsIgnoreCase(name)) {
	            filteredProducts.add(product);
	        }
	    }

	    // Print the filtered products
//	    for (product filteredProduct : filteredProducts) {
//	        System.out.print("Product Name: " + filteredProduct.getDescription() + "\t");
//	        System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
//	        System.out.println("Product Price: " + filteredProduct.getPrices());
//	        // Add any other relevant information here
//	    }

	    return filteredProducts;
	}

 
 public static List<product> filterProductByCategory(String category) {
	    List<product> filteredProducts = new ArrayList<product>();

	    List<product> productList = getProductListByCategory(category);

	    // You can directly return the filtered list without printing
	    return productList;
	}

 private  static List<product> getProductListByCategory(String category) {
	    if ("interior".equalsIgnoreCase(category)) {
	        return prodInterior;
	    } else if ("exterior".equalsIgnoreCase(category)) {
	        return prodExterior;
	    } else if ("electronic".equalsIgnoreCase(category)) {
	        return prodElectronic;
	    } else {
	        return new ArrayList<product>(); // or throw an exception for unknown category
	    }
	}
 public static List<product> filterProductByAvailability(String availability) {
	    List<product> filteredProducts = new ArrayList<product>();

	    for (product product : prod) {
	        String productAvailability = product.getAvailability();

	        if (productAvailability.equalsIgnoreCase(availability)) {
	            filteredProducts.add(product);
	        }
	    }

	    // Print the filtered products
//	    for (product filteredProduct : filteredProducts) {
//	        System.out.print("Product Name: " + filteredProduct.getDescription() + "\t");
//	        System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
//	        System.out.println("Product Price: " + filteredProduct.getPrices());
	        // Add any other relevant information here
//	    }

	    return filteredProducts;
	}
 public int getQuantity() {
     return quantity;
 }

 public void setQuantity(int quantity) {
     this.quantity = quantity;
 }



 
 
 
 
 
 
 
 
 
 

	public String getCategory() {
	    return Categories;
	}

	public String getPrice() {
	    return prices;
	}

	private static boolean isPriceInRange(String productPrice, String minPrice, String maxPrice) {
	    try {
	        double price = Double.parseDouble(productPrice);
	        double min = Double.parseDouble(minPrice);
	        double max = Double.parseDouble(maxPrice);
	        return price >= min && price <= max;
	    } catch (NumberFormatException e) {
	        // Handle the case where price or minPrice or maxPrice is not a valid number
	        return false;
	    }
	}



	




	

	


}
