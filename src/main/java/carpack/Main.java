package carpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.mail.MessagingException;


public class Main {
	
	
	private static final String OPT = "Select your option : ";
	private static final String TT ="\t";
	private static final String STR="  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★";
	private static final String S1=" ";
	static String mostBoughtProduct = "";
	static int maxQuantityAcrossCustomers = 0;
	static int customercount=0;
	static int installercount=0;
	
	
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//ArrayList<product> products = new ArrayList<product>();
		ArrayList<product> products = new ArrayList<product>();
        ArrayList<product> productsExterior = new ArrayList<product>();
        
        
        ArrayList<product> productsInterior = new ArrayList<product>();
        ArrayList<product> productsElectronic = new ArrayList<product>();
        ArrayList<product> bag = new ArrayList<product>();
        ArrayList<String> allemail=new ArrayList<String>();
        int userType = -1;
        
        user r = new user();
        ArrayList<String> appoin=new ArrayList<String>();
        ArrayList<String> sch=new ArrayList<String>();
        
	    Scanner scc = new Scanner(System.in);
	    boolean flagintitail = false;
	    int userselected = 0;
	    user cc = null; // Declare the user object outside the loop
	 //   user u=new user();
	    admin aa = new admin();
	    int pr1 = 0;
	    product p=null;
	    int buycount=0;
	    int reqcount=0;
	    int Totalprofit=0;

	    Installer w = new Installer();
	    

	    boolean flagadmin = false;
	    String nameofprod = null;

	    String ayam;
	    int countprod = 0;
	    int countprod1 = 0;
	    boolean flagworker = false;
	    boolean flaguser = false;
	    boolean flagaccount = false;
	    String emails = null;

	    userselected = firstMenu();

	    while (userselected != 99) {
	        String ayy = "USERNAME : ";
	        String ayy1 = "PASSWORD : ";

	        if (userselected == 1) {
	            int userselected1 = 0;
	            System.out.print(ayy);
	            String a1 = scc.next();
	            System.out.print(ayy1);
	            String a2 = scc.next();
	            if (aa.checkemail(a1) == 1 && aa.checkpass(a2) == 1) {
	                flagadmin = true;
	                userType = 1;
	            }

	            do {
	                if (flagadmin) {
	                    userselected1 = adminMenue();
	                    switch (userselected1) {
	                        case 1:
	                        	
	                            user.printCustomer();
	                            break;

	                        case 2:
	                            System.out.print("Enter email of Customer you need to add: ");
	                            String e = scc.next();
	                            System.out.print("Enter pass of Customer you need to add: ");
	                           String pp = scc.next();
	                            System.out.print("Enter phone of Customer you need to add: ");
	                            String ph = scc.next();
	                            System.out.print("Enter name of Customer you need to add: ");
	                            String n = scc.next();
	                            System.out.print("Enter address of Customer you need to add: ");
	                            String add = scc.next();
	                            System.out.print("Enter age of Customer you need to add: ");
	                            String ag = scc.next();

	                            cc = new user(e, pp, add, n, ph, ag); // Create a new user object
	               			 


	                            break;
		                        
		                        
		                    case 3:
		                    	 System.out.print("Enter email of Customer you need to delete : ");
		                    	 String cuss = scc.next();
		                    	 
		                        r.deleteCustomer(cuss);
		                        break;
		                    case 4:
		                    	 System.out.print("Enter email of Customer you need to update: ");
		                    	 String cp = scc.next();
		                    	 
		                    	 
		                    	 System.out.print("Enter new name to update: ");
		                    	 String cn = scc.next();
		                    	 System.out.print("Enter new age to update: ");
		                    	 String ca = scc.next();
		                    	 System.out.print("Enter new address to update: ");
		                    	 String cad = scc.next();
		                    	 System.out.print("Enter new phone to update: ");
		                    	 String cd = scc.next();
		                    	 
		                    	
		                    	 
		                    	r.updatCustomer(cp,cn,ca,cad,cd);
		                    	
		                        break;
		                    case 5:
		                        if (products.isEmpty()) {
		                            System.out.println("No products available.");
		                        } else {
		                            for (int i = 0; i < products.size(); i++) {
		                                String a = "Product : " + products.get(i).id + " " + products.get(i).description + " " + products.get(i).prices + " " +
		                                           products.get(i).availability + " " + products.get(i).Categories;
		                                System.out.println(a);
		                            }
		                        }
		                        break;
		                       
		                  
		                        
		                    case 6:
		                       System.out.print("Enter id of Product you need to add: ");
		                        String id = scc.next();
		                        System.out.print("Enter description of Product you need to add: ");
		                        String desc = scc.next();
		                        System.out.print("Enter prices of Product you need to add: ");
		                        String prices = scc.next();
		                        System.out.print("Enter availability of Product you need to add: ");
		                        String availability = scc.next();
		                        System.out.print("Enter Categories of Product you need to add: ");
		                        String Catttt = scc.next();

		                        System.out.print("Enter image of Product you need to add: ");
		                        String imagg = scc.next();

		                        p = new product(id, desc, prices, availability, Catttt, imagg);
		                        
		                        
		                        
		                      
	                           
	                            
	                           
	                            products.add(p); // Add the product to the main products list

	                            if ("Exterior".equals(Catttt)) {
	                                productsExterior.add(p); // Add to the exterior products list if it's an exterior product
	                            }
	                            if ("Interior".equals(Catttt)) {
	                                productsInterior.add(p); // Add to the exterior products list if it's an exterior product
	                            }
	                            if ("Electronic".equals(Catttt)) {
	                                productsElectronic.add(p); // Add to the exterior products list if it's an exterior product
	                            }
	                            
	                            break;
	                            
	                            
		                    case 7:
		                        System.out.print("Enter id of Product you need to delete: ");
		                        String idd = scc.next();
		                        product.deleteProduct(idd);

		                        // You should also remove the product from the main list 'products'
		                        for (product prod : products) {
		                            if (prod.id.equals(idd)) {
		                                products.remove(prod);
		                                break; // Exit the loop once the product is found and removed
		                            }
		                        }
		                        break;
		                     
		                
		                    case 8:
		                        System.out.print("Enter id of Product you need to update: ");
		                        String iddd = scc.next();
		                        System.out.print("Enter description of Product you need to update: ");
		                        String descriptionn = scc.next();
		                        System.out.print("Enter price of Product you need to update: ");
		                        String pricee = scc.next();
		                        System.out.print("Enter availability of Product you need to update: ");
		                        String availab = scc.next();
		                        System.out.print("Enter Category of Product you need to update: ");
		                        String Categoriee = scc.next();
		                        System.out.print("Enter image URL of Product you need to update: ");
		                        String image = scc.next(); // You'll need to get the image URL from the user

		                        // Call the updateProduct method with the image parameter
		                        p.updateProduct(iddd, descriptionn, pricee, availab, Categoriee, image);


		            		            // Use the 'id' to find the correct product to remove from other lists
		            		            for (int j = 0; j <  productsInterior.size(); j++) {
		            		                if ( productsInterior.get(j).id.equals(iddd)) {
		            		                	 productsInterior.remove(j);
		            		                    break;
		            		                }
		            		            }

		            		            for (int j = 0; j < productsExterior.size(); j++) {
		            		                if (productsExterior.get(j).id.equals(iddd)) {
		            		                	productsExterior.remove(j);
		            		                    break;
		            		                }
		            		            }

		            		            for (int j = 0; j < productsElectronic.size(); j++) {
		            		                if (productsElectronic.get(j).id.equals(iddd)) {
		            		                	productsElectronic.remove(j);
		            		                    break;
		            		                }
		            		            }
		                        // Remove the old product from the main products list
		                       

		                        // Add the updated product to the appropriate category list
		                        if ("Exterior".equals(Categoriee)) {
		                            productsExterior.add(p);
		                        } else if ("Interior".equals(Categoriee)) {
		                            productsInterior.add(p);
		                        } else if ("Electronic".equals(Categoriee)) {
		                            productsElectronic.add(p);
		                        }
		                        break;
		                        
		                    case 9:

			                       for(int i=0;i<productsExterior.size();i++) {
			                    	   String a = "Product : " +productsExterior.get(i).id + " " + productsExterior.get(i).description + " " + productsExterior.get(i).prices + " " +
			                    			   productsExterior.get(i).availability + " " + productsExterior.get(i).Categories;
			               	        System.out.println(a);
			                       }
		                        break;
		                    	
		                    	
		                    case 10:
		                    	
		                    	 System.out.print("Enter id of Exterior Product you need to add: ");
			                        String idex = scc.next();
			                        System.out.print("Enter description of Exterior Product you need to add: ");
			                        String descex = scc.next();
			                        System.out.print("Enter prices of Exterior Product you need to add: ");
			                        String pricesex = scc.next();
			                        System.out.print("Enter availability of Exterior Product you need to add: ");
			                        String availabilityex = scc.next();
			                      
			                        String Catex ="Exterior";
			                        System.out.print("Enter image of  Exterior Product you need to add: ");
			                        String imagex = scc.next();
			                       
			                        
			                      p=new product(idex,descex,pricesex,availabilityex,Catex,imagex);
		                           
		                            
		                           
		                            products.add(p); // Add the product to the main products list

		                            if ("Exterior".equals(Catex)) {
		                                productsExterior.add(p); // Add to the exterior products list if it's an exterior product
		                            }
		                            if ("Interior".equals(Catex)) {
		                                productsInterior.add(p); // Add to the exterior products list if it's an exterior product
		                            }
		                            if ("Electronic".equals(Catex)) {
		                                productsElectronic.add(p); // Add to the exterior products list if it's an exterior product
		                            }
		                            
		                    	
		                    	break;
		                    case 11:
		                    
		                        System.out.print("Enter id of Exterior  Product you need to delete: ");
		                        String iddex = scc.next();
		                        product.deleteProduct(iddex);

		                        // You should also remove the product from the main list 'products'
		                        for (product prod : products) {
		                            if (prod.id.equals(iddex)) {
		                                products.remove(prod);
		                                productsExterior.remove(prod);
		                                
		                                break; // Exit the loop once the product is found and removed
		                            }
		                        }
		                        break;
		                    case 12:
		                    	
		                    	System.out.print("Enter id of Exterior Product you need to update: ");
		                    	String idddex = scc.next();

		                    	

		                    	System.out.print("Enter description of Exterior Product you need to update: ");
		                    	String descriptionnex = scc.next();
		                    	System.out.print("Enter price of Exterior Product you need to update: ");
		                    	String priceeex = scc.next();
		                    	System.out.print("Enter availability of Exterior Product you need to update: ");
		                    	String availabex = scc.next();
		                    	System.out.print("Enter Category of Exterior Product you need to update: ");
		                    	String Categorieeex = scc.next();
		                    	System.out.print("Enter image URL of Exterior Product you need to update: ");
		                    	String imageex = scc.next();

		                    	// Call a method to update the product
		                    	
		                    	
		                    	
		                    	p.updateProduct(idddex, descriptionnex, priceeex, availabex, Categorieeex, imageex);

		                    	// Use the 'id' to find the correct product to remove from other lists
		                    	for (int j = 0; j <productsInterior.size(); j++) {
		                    	    if (productsInterior.get(j).id.equals(idddex)) {
		                    	        productsInterior.remove(j);
		                    	        break;
		                    	    }
		                    	}

		                    	for (int j = 0; j <productsExterior.size(); j++) {
		                    	    if (productsExterior.get(j).id.equals(idddex)) {
		                    	        productsExterior.remove(j);
		                    	        break;
		                    	    }
		                    	}

		                    	for (int j = 0; j < productsElectronic.size(); j++) {
		                    	    if (productsElectronic.get(j).id.equals(idddex)) {
		                    	        productsElectronic.remove(j);
		                    	        break;
		                    	    }
		                    	}

		                    	// Add the updated product to the appropriate category list
		                    	if ("Exterior".equals(Categorieeex)) {
		                    	    productsExterior.add(new product(idddex, descriptionnex, priceeex, availabex, Categorieeex, imageex));
		                    	} else if ("Interior".equals(Categorieeex)) {
		                    	    productsInterior.add(new product(idddex, descriptionnex, priceeex, availabex, Categorieeex, imageex));
		                    	} else if ("Electronic".equals(Categorieeex)) {
		                    	    productsElectronic.add(new product(idddex, descriptionnex, priceeex, availabex, Categorieeex, imageex));
		                    	}
	            		                
			                        break;
	            		              
			                        
			                        
	            		         //       }
	            		                
			                       // }
			                        
	            		                
		                    	
		                    case 13:
		                    
		                    	  for(int i=0;i<productsInterior.size();i++) {
			                    	   String a = "Product : " +productsInterior.get(i).id + " " + productsInterior.get(i).description + " " + productsInterior.get(i).prices + " " +
			                    			   productsInterior.get(i).availability + " " + productsInterior.get(i).Categories;
			               	        System.out.println(a);
			                       }
		                        break;
		                    	
		                    	


		                    	
		                    	
		                    case 14:
		                    	System.out.print("Enter id of Interior Product you need to add: ");
		                        String idin = scc.next();
		                        System.out.print("Enter description of Interior Product you need to add: ");
		                        String descin = scc.next();
		                        System.out.print("Enter prices of Interior Product you need to add: ");
		                        String pricesin = scc.next();
		                        System.out.print("Enter availability of Interiorr Product you need to add: ");
		                        String availabilityin = scc.next();
		                      
		                        String Catin ="Interior";
		                        System.out.print("Enter image of  Interior Product you need to add: ");
		                        String imagin = scc.next();
		                       
		                        
		                      p=new product(idin,descin,pricesin,availabilityin,Catin,imagin);
	                           
	                            
	                           
	                            products.add(p); // Add the product to the main products list

	                            if ("Exterior".equals(Catin)) {
	                                productsExterior.add(p); // Add to the exterior products list if it's an exterior product
	                            }
	                            if ("Interior".equals(Catin)) {
	                                productsInterior.add(p); // Add to the exterior products list if it's an exterior product
	                            }
	                            if ("Electronic".equals(Catin)) {
	                                productsElectronic.add(p); // Add to the exterior products list if it's an exterior product
	                            }
	                            
	                    	
	                    	break;
		                    	
		                    case 15:
		                    	System.out.print("Enter id of Interior Product you need to delete: ");
		                        String iddin = scc.next();
		                        product.deleteProduct(iddin);

		                        // You should also remove the product from the main list 'products'
		                        for (product prod : products) {
		                            if (prod.id.equals(iddin)) {
		                                products.remove(prod);
		                                productsInterior.remove(prod);
		                                
		                                break; // Exit the loop once the product is found and removed
		                            }
		                        }
		                        break;
		                    	
		                    case 16:
		                    	 System.out.print("Enter id of Interior Product you need to update: ");
			                        String idddin = scc.next();
			                        
			                    //    for (int l = 0; l < productsInterior.size(); l++) {
	            		          //      if (productsExterior.get(l).id.equals(idddin)) {
	            		                	
	            		                
			                        
			                        
			                        
			                        
			                        System.out.print("Enter description of Interior Product you need to update: ");
			                        String descriptionnen = scc.next();
			                        System.out.print("Enter price of Interior  Product you need to update: ");
			                        String priceeen = scc.next();
			                        System.out.print("Enter availability of Interior Product you need to update: ");
			                        String availaben = scc.next();
			                        System.out.print("Enter Category of Interior Productt you need to update: ");
			                        String Categorieeen = scc.next();
			                        System.out.print("Enter image URL of Interior Product you need to update: ");
			                        String imageen = scc.next(); // You'll need to get the image URL from the user

			                        // Call the updateProduct method with the image parameter
			                        p.updateProduct(idddin, descriptionnen, priceeen, availaben, Categorieeen, imageen);


			            		            // Use the 'id' to find the correct product to remove from other lists
			            		            for (int j = 0; j <  productsInterior.size(); j++) {
			            		                if ( productsInterior.get(j).id.equals(idddin)) {
			            		                	 productsInterior.remove(j);
			            		                    break;
			            		                }
			            		            }

			            		            for (int j = 0; j < productsExterior.size(); j++) {
			            		                if (productsExterior.get(j).id.equals(idddin)) {
			            		                	productsExterior.remove(j);
			            		                    break;
			            		                }
			            		            }

			            		            for (int j = 0; j < productsElectronic.size(); j++) {
			            		                if (productsElectronic.get(j).id.equals(idddin)) {
			            		                	productsElectronic.remove(j);
			            		                    break;
			            		                }
			            		            }
			                        // Remove the old product from the main products list
			                       

			                        // Add the updated product to the appropriate category list
			                        if ("Exterior".equals(Categorieeen)) {
			                            productsExterior.add(p);
			                        } else if ("Interior".equals(Categorieeen)) {
			                            productsInterior.add(p);
			                        } else if ("Electronic".equals(Categorieeen)) {
			                            productsElectronic.add(p);
			                        }
	            		                
			                        break;
	            		              
			                        
			                        
	            		         //       }
	            		                
			                      //  }
			                        
		                    	
		                    	
		                    case 17 :
		                    	

		                    	  for(int i=0;i<productsElectronic.size();i++) {
			                    	   String a = "Product : " +productsElectronic.get(i).id + " " + productsElectronic.get(i).description + " " + productsElectronic.get(i).prices + " " +
			                    			   productsElectronic.get(i).availability + " " + productsElectronic.get(i).Categories;
			               	        System.out.println(a);
			                       }
		                       
		                    	break;
		                    case 18 :
		                    	 System.out.print("Enter id of Electronic Product you need to add: ");
			                        String idelc = scc.next();
			                        System.out.print("Enter description of Electronic Product you need to add: ");
			                        String descelec = scc.next();
			                        System.out.print("Enter prices of Electronic Product you need to add: ");
			                        String priceselec = scc.next();
			                        System.out.print("Enter availability of Electronic Product you need to add: ");
			                        String availabilityelec = scc.next();
			                      
			                        String Catelec ="Electronic";
			                        System.out.print("Enter image of  Electronic Product you need to add: ");
			                        String imagelec = scc.next();
			                       
			                        
			                      p=new product(idelc,descelec,priceselec,availabilityelec,Catelec,imagelec);
		                           
		                            
		                           
		                            products.add(p); // Add the product to the main products list

		                            if ("Exterior".equals(Catelec)) {
		                                productsExterior.add(p); // Add to the exterior products list if it's an exterior product
		                            }
		                            if ("Interior".equals(Catelec)) {
		                                productsInterior.add(p); // Add to the exterior products list if it's an exterior product
		                            }
		                            if ("Electronic".equals(Catelec)) {
		                                productsElectronic.add(p); // Add to the exterior products list if it's an exterior product
		                            }
		                            
		                    	
		                    	break;
		                    	
		                    	
		                    	
		                    	
		                    case 19:
		                    	
		                    	
		                    	 System.out.print("Enter id of Electronic  Product you need to delete: ");
			                        String iddelec = scc.next();
			                        product.deleteProduct(iddelec);

			                        // You should also remove the product from the main list 'products'
			                        for (product prod : products) {
			                            if (prod.id.equals(iddelec)) {
			                                products.remove(prod);
			                                productsElectronic.remove(prod);
			                                
			                                break; // Exit the loop once the product is found and removed
			                            }
			                        }
			                        break;
			                        
			                        
			                        
		                    case 20 :
		                    	System.out.print("Enter id of Electronic  Product you need to update: ");
		                        String idddelec = scc.next();
		                        
		                     //   for (int l = 0; l < productsElectronic .size(); l++) {
            		           //     if (productsExterior.get(l).id.equals(idddelec)) {
            		                	
            		                
		                        
		                        
		                        
		                        
		                        System.out.print("Enter description of Electronic  Product you need to update: ");
		                        String descriptionnel = scc.next();
		                        System.out.print("Enter price of Electronic  Product you need to update: ");
		                        String priceeel = scc.next();
		                        System.out.print("Enter availability of Electronic  Product you need to update: ");
		                        String availabel = scc.next();
		                        System.out.print("Enter Category of Electronic  Product you need to update: ");
		                        String Categorieeel = scc.next();
		                        System.out.print("Enter image URL of Electronic  Product you need to update: ");
		                        String imageel = scc.next(); // You'll need to get the image URL from the user

		                        // Call the updateProduct method with the image parameter
		                        p.updateProduct(idddelec, descriptionnel, priceeel, availabel, Categorieeel, imageel);


		            		            // Use the 'id' to find the correct product to remove from other lists
		            		            for (int j = 0; j <  productsElectronic.size(); j++) {
		            		                if ( productsElectronic.get(j).id.equals(idddelec)) {
		            		                	 productsElectronic.remove(j);
		            		                    break;
		            		                }
		            		            }

		            		            for (int j = 0; j < productsExterior.size(); j++) {
		            		                if (productsExterior.get(j).id.equals(idddelec)) {
		            		                	productsExterior.remove(j);
		            		                    break;
		            		                }
		            		            }

		            		            for (int j = 0; j < productsElectronic.size(); j++) {
		            		                if (productsElectronic.get(j).id.equals(idddelec)) {
		            		                	productsElectronic.remove(j);
		            		                    break;
		            		                }
		            		            }
		                        // Remove the old product from the main products list
		                       

		                        // Add the updated product to the appropriate category list
		                        if ("Exterior".equals(Categorieeel)) {
		                            productsExterior.add(p);
		                        } else if ("Interior".equals(Categorieeel)) {
		                            productsInterior.add(p);
		                        } else if ("Electronic".equals(Categorieeel)) {
		                            productsElectronic.add(p);
		                        }
            		                
		                        break;
            		              
		                        
		                        
            		      //          }
            		                
		                    //    }
		                        

		                            
		                    case 21:
		                    	
		                    	
		                    		
                                
		                    	if (sch.isEmpty()) {
		                    	    System.out.println("There are no appointments available.");
		                    	} else {
		                    	    // Iterate through the sch ArrayList and print each element
		                    	    for (int i = 0; i < sch.size(); i++) {
		                    	        System.out.println( "" + sch.get(i));
		                    	    }
		                    	}
	                            break;
	                            
		                    
                               
                               
		                    case 22:
		                
		                        System.out.print("Enter Email of user for appointment update: ");
		                        String emailUpdate = scc.next();
		                        System.out.print("Enter the old Date of the appointment: ");
		                        String oldDate = scc.next();
		                        System.out.print("Enter the old Time of the appointment: ");
		                        String oldTime = scc.next();
		                        System.out.print("Enter the old name of product: ");
		                        String oldDetail = scc.next();
		                        
		                        System.out.print("Enter the new Date for the appointment: ");
		                        String newDate = scc.next();
		                        System.out.print("Enter the new Time for the appointment: ");
		                        String newTime = scc.next();
		                        System.out.print("Enter updated name of product that you want to install: ");
		                        String newDetail = scc.next();

		                        // Construct the old and new appointments
		                        String oldAppointment = "date: " + oldDate + " time: " + oldTime + " detail: " + oldDetail + " for customer: " + emailUpdate;
		                        String newAppointment = "date: " + newDate + " time: " + newTime + " detail: " + newDetail + " for customer: " + emailUpdate;

		                        // Update the appointment in 'appo' list
		                        Installer.updateappointment(emailUpdate, oldDate, oldTime, oldDetail, newDate, newTime, newDetail);


		                        // Update the appointment in 'appoin' list
		                        for (int i = 0; i < appoin.size(); i++) {
		                            if (appoin.get(i).equals(oldAppointment)) {
		                                appoin.set(i, newAppointment);
		                                break;
		                            }
		                        }

		                        System.out.println("Appointment updated successfully: " + newAppointment);
		                        break;
		                    	
		                    case 23:
		                        System.out.print("Enter Email of user for appointment deletion: ");
		                        String emailDelete = scc.next();
		                        System.out.print("Enter Date of the appointment to be deleted: ");
		                        String dateToDelete = scc.next();
		                        System.out.print("Enter Time of the appointment to be deleted: ");
		                        String timeToDelete = scc.next();
		                        System.out.print("Enter name of product of this appointment to be deleted: ");
		                        String detailToDelete = scc.next();

		                        // Delete the appointment from 'appoin' list
		                        String appointmentToDelete = "date: " + dateToDelete + " time: " + timeToDelete + " detail: " + detailToDelete + " for customer: " + emailDelete;

		                        if (appoin.contains(appointmentToDelete)) {
		                            appoin.remove(appointmentToDelete);
		                        }

		                        // Call the 'Installer.deleteappointment' function
		                        boolean isDeleted = Installer.deleteappointment(emailDelete, dateToDelete, timeToDelete, detailToDelete);

		                        if (isDeleted) {
		                            System.out.println("Appointment deleted successfully.");
		                        } else {
		                            System.out.println("No matching appointment found for deletion.");
		                        }
		                        break;
		                        
		                    	
		                    case 24:
		                        System.out.print("Enter Date of the appointment to be added: ");
		                        String addap = scc.next();
		                        System.out.print("Enter Time of the appointment to be added: ");
		                        String addtime = scc.next();
		                        String d = addap + "\t" + addtime;

		                        // Call your method to add the appointment
		                        Installer.scheduleapp(addap, addtime);

		                        // Add the appointment to the sch ArrayList
		                        sch.add(d);
		                        break;

		                    case 25:
		                        System.out.print("Enter old Date of the appointment: ");
		                        String oldDatee = scc.next();
		                        System.out.print("Enter old Time of the appointment: ");
		                        String oldTimee = scc.next();

		                        System.out.print("Enter new Date of the appointment: ");
		                        String newDatee = scc.next();
		                        System.out.print("Enter new Time of the appointment: ");
		                        String newTimee = scc.next();

		                        // Call your method to update the appointment
		                        Installer.updateappo(oldDatee, oldTimee, newDatee, newTimee);

		                        // Update the sch ArrayList with the new appointment details
		                        sch.remove(oldDatee + "\t" + oldTimee);
		                        sch.add(newDatee + "\t" + newTimee);
		                        break;

		                    case 26:
		                        System.out.print("Enter Date of the appointment to be deleted: ");
		                        String deleteDate = scc.next();
		                        System.out.print("Enter Time of the appointment to be deleted: ");
		                        String deleteTime = scc.next();

		                        // Call your method to delete the appointment
		                        Installer.deleteappo(deleteDate, deleteTime);

		                        // Remove the appointment from the sch ArrayList
		                        sch.remove(deleteDate + "\t" + deleteTime);
		                        break;
		                	   
		                     
		                    case 27:
		                        System.out.println("  * * * * * * * * * * * * * * * *REPORT * * * * * * * * * * * * * * * * * * * * * * * * * *");

		                        System.out.println("1.Total number of customer: " +customercount );
		                        System.out.println("2.Total number of installer: " +installercount );
		                        System.out.println("3.count of buy product : " +buycount );
		                        
		                        
		                        System.out.println("4.Total Installation request count : " + reqcount);
		                        System.out.println("5.Total profit : " + Totalprofit);

		                        
		                        String mostBoughtProduct = null;
		                        int maxQuantityAcrossCustomers = 0;

		                        // Iterate through all products in the store
		                        
		                        for (product productInCart : bag) {
		                            int totalQuantity = 0;

		                            // Iterate through the shopping bags of all customers
		                            for (product productInBag : bag) {
		                                if (productInBag.getId().equals(productInCart.getId())) {
		                                    totalQuantity += productInBag.getQuantity(); // Use the getQuantity method
		                                }
		                            }

		                            // Update the most bought product if the total quantity is greater than the current max
		                            if (totalQuantity > maxQuantityAcrossCustomers) {
		                                mostBoughtProduct = productInCart.getDescription();
		                                maxQuantityAcrossCustomers = totalQuantity;
		                            }
		                        }

		                        // Print the most bought product information
		                        if (mostBoughtProduct != null) {
		                            System.out.println("4.The most bought product is : " + mostBoughtProduct);
		                            System.out.println("5.Total quantity sold for this most bought product : " + maxQuantityAcrossCustomers);
		                        } else {
		                            System.out.println("No products have been bought yet.");
		                        }
		                        System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		                        break;
		                     
		                     
		                        
		                        
		            
		                    default:
		                        System.out.println("Thank you");
		                        break;
		                }
		            }
	                else {
		                System.out.println("Your USERNAME or PASSWORD is incorrect");
		                System.out.println("Please try again");
		            }
		        } while (userselected1 < 28);{    
	       			 

	        			userselected =firstMenu();
	        			

	        		}
	            
		        
		  
		    }
	        
	        
	        

	        
	        
	        
	        
	        
	         if (userselected == 2) {
	            int userselected2 = 0;

	            System.out.print(ayy);
	            String w1 = scc.next();
	            System.out.print(ayy1);
	            String w2 = scc.next();
	            if (w.checkemail(w1) == 1 && w.checkpass(w2) == 1) {
	                flagworker = true;
	                if(!allemail.contains(w1) ) {
	                allemail.add(w1);
	                installercount++;
	                }
	                userType = 2;
	            }

	            do {
	                if (flagworker) {
	                	
	                    userselected2 = InstallerMenu();
	                    switch (userselected2) {
	                    case 1:
                        	
	                    
	                            
	                            // Prompt the user for their email (identifier)
	                           
	                            boolean instfound = false;
	                     
	                            instfound=Installer.printProfile(w1);
	                       
	                            if (!instfound) {
	                                System.out.println("Email not found. Please provide a valid email.");
	                            }
	                            break;    
                            
      
                          
                        
                        	
                        case 2:
                        	
                        	
                        	
                        	if (allemail.contains(w1)) {
                        	    // Prompt the installer for updated profile information
                        	    System.out.print("Enter new password: ");
                        	    String newPassword = scc.next();
                        	    System.out.print("Enter new phone: ");
                        	    String newPhone = scc.next();
                        	    System.out.print("Enter new name: ");
                        	    String newName = scc.next();
                        	    System.out.print("Enter new address: ");
                        	    String newAddress = scc.next();

                        	    // Call the editProfile method with the identifier w1
                        	    Installer.editProfile(w1, newPassword, newPhone, newName, newAddress);

                        	    System.out.println("Profile updated successfully!");
                        	} else {
                        	    System.out.println("Email not found. Please provide a valid email.");
                        	}
                              break;
                       
	                        case 3:
	                        	
	                        	System.out.println("ALL Request: ");
	                        	for (String appointment : appoin) {
	                        	    System.out.println(appointment);
	                        	}
	                            
	                            break;
	                        case 4:
//	                        	  System.out.print("Enter Email of user you want to apply the installation: ");
//	                                String em = scc.next();
//	                        	
	                            
	                            System.out.print("Enter Date: ");
                                String datepr = scc.next();
                                System.out.print("Enter Time: ");
                                String timepr= scc.next();
//                                System.out.print("Enter name of product that you want to install it : ");
//                                String decpr= scc.next();
                                String s=datepr+"\t"+timepr;
                            	sch.add(s);
//                            appoin.add(Installer.appointment(datepr,timepr,decpr,em));
                            	System.out.println("Your APPOINTMENTS: ");
	                        	for (String appointment : sch) {
	                        	    System.out.println(appointment);
	                        	}
                            	break;
	                           
	                     case 5:
	                    	 System.out.println("Your APPOINTMENTS: ");
	                        	for (String appointment : sch) {
	                        	    System.out.println(appointment);
	                        	}
	                       	
	                       	break;
	
	                   	        
	                   	        
	                       
	                        default:
	                            System.out.println("Welcome ");
	                            break;
	                    }
	                } else {
	                    System.out.println("Your USERNAME or PASSWORD is incorrect");
	                    System.out.println("Please try again");
	                    break;
	                }

	            } while (userselected2 < 6);
	            	{    
	       			 

	        			userselected =firstMenu();
	        			

	        		}
	            

	            System.out.println("");
	        }
	        
	        
	        
	        
	        
	        
	        
	         if (userselected == 3) {
	        	 
	            System.out.println("1- You have an account");
	            System.out.println("2- Create account");
	            System.out.print("Your option is: ");
	            int x = scc.nextInt();

	            int userselected3 = 0;
	           


	            do {
	                String cc1 = null;
	                String cc2;
	                if (x == 1) {
	                	
	                    if (!flagaccount) {
	                        System.out.print(ayy);
	                        cc1 = scc.next();
	                        emails = cc1;
	                       
	                        System.out.print(ayy1);
	                        cc2 = scc.next();
	                        flagaccount = true;
	                        
	                     

	                      

	                        
	                        if (!allemail.contains(emails) && user.checkemail(cc1) == 1 && user.checkpass(cc2) == 1) {

	                        	allemail.add(emails);
	                            flaguser = true;
	                            userType = 3;

	                            // Increment customercount only when a new account is created
	                            customercount++;
	                        }
	                    }
	                  //  else {
	                        if (flaguser) {
	                        	
	                        	
	                        	
	                        	
	                        	
	                        	
	                            userselected3 = customerMenu();
	                            switch (userselected3) {
	                            
	                            case 1:
	                            	   if (products.isEmpty()) {
	   		                            System.out.println("No products available.");
	   		                        } else {
	   		                            for (int i = 0; i < products.size(); i++) {
	   		                                String a = "Product : " + products.get(i).id + " " + products.get(i).description + " " + products.get(i).prices + " " +
	   		                                           products.get(i).availability + " " + products.get(i).Categories;
	   		                                System.out.println(a);
	   		                            }
	   		                        }
	   		                        break;
	                            
	                            
	                            
	                                
	                            case 2:
	                                System.out.print("Enter the ID of the product: ");
	                                String id = scc.next();
	                                System.out.print("Enter the name of the product: ");
	                                String description = scc.next();
	                                System.out.print("Enter the Quantity of the product: ");
	                                int quantity = scc.nextInt(); // Read an integer for quantity

	                                // Find the product with the given ID and description in the products list
	                                product selectedProduct = null;
	                                for (product pp : products) {
	                                    if (pp.getId().equals(id) && pp.getDescription().equals(description)) {
	                                        selectedProduct = pp;
	                                        break;
	                                    }
	                                }

	                                if (selectedProduct != null) {
	                                    // Set the email and quantity for the selected product
	                                    selectedProduct.setEmail(emails);
	                                    selectedProduct.setQuantity(quantity);

	                                    // Add the selected product to the 'bag'.
	                                    bag.add(selectedProduct);

	                                    // Confirm that the product has been added to the 'bag'.
	                                    System.out.println("Product has been added to your bag :)");
	                                } else {
	                                    System.out.println("The product with the provided ID and description does not exist in the product list.");
	                                }
	                                break;
	                                
	                            case 3:
	                                	System.out.print("Enter the ID of the product you want to delete from the Shopping Cart: ");
	                                	String productIDToDelete = scc.next();
	                                	boolean productFound = false;

	                                	// Iterate through the 'bag' list to find and remove the product.
	                                	for (product productInCart : bag) {
	                                	    if (productInCart.id.equals(productIDToDelete) && productInCart.email.equals(emails)) {
	                                	        bag.remove(productInCart);
	                                	        productFound = true;
	                                	        break; // Exit the loop after removing the product.
	                                	    }
	                                	}

	                                	if (productFound) {
	                                	    System.out.println("Product has been successfully removed from your Shopping Cart.");
	                                	} else {
	                                	    System.out.println("Product with ID " + productIDToDelete + " was not found in your Shopping Cart.");
	                                	}
	                                	
	                                  
	                                    break;
	                                case 4:
	                                    boolean ordersFound = false;

	                                    
	                                    
	                                
	                                    System.out.println(" Shopping cart to customer with email: " + emails);
	                                    
	                                    for (product productInCart : bag) {
	                                    	
	                                    	
	                                        if (productInCart.getemail().equals(emails)) {
	                                        	
	                                        	
	                                            // Display the order details with tabs
	                                            System.out.print("Product ID: " + productInCart.getId() + "\t");
	                                            System.out.print("Product name: " + productInCart.getDescription() + "\t");
	                                            System.out.print("Product Price: " + productInCart.getPrices() + "\t");
	                                            buycount++;
	                                            int price = Integer.parseInt(productInCart.getPrices());
	                                            Totalprofit += price * productInCart.getQuantity();
	                                            
	                                            System.out.print("Product Image: " + productInCart.getImage() + "\t");
	                                            System.out.println("Product Category: " + productInCart.getCategories());
	                                            
	                                          

	                                            ordersFound = true;
	                                        }
	                                        
	                                    }
	                                    

	                                    if (!ordersFound) {
	                                        System.out.println("No orders found for the customer with email: " + emails);
	                                    }
	                                    
	                                    System.out.println(" Do you want to confirm your order? Enter yes or no: ");
	                                    String conf = scc.next();

	                                    if (conf.equals("yes")) {
	                                    	
	                                        try {
	                                        	
	                                           sendEmail.sendemail("Jodikmal@gmail.com", "1", "user");
	                                        } catch (MessagingException e) {
	                                            e.printStackTrace();
	                                        }
	                                    	 System.out.println("Your purchases price: " + Totalprofit);
	                                    	 System.out.println("Total number of products bought: " + buycount);
	                                    }
	                                    else {
	                                    	
	                                    }
	                                    	
	                                    
	                                    break;
	                                    
	                                    
	                                case 5:
	                                    System.out.print("Enter your email: ");
	                                    String userEmail = scc.next();

	                                    // Check if the provided email exists in the 'emails' list
	                                    if (allemail.contains(userEmail)) {
	                                        // Prompt the customer for updated profile information
	                                        System.out.print("Enter new password: ");
	                                        String newPassword = scc.next();
	                                        System.out.print("Enter new phone: ");
	                                        String newPhone = scc.next();
	                                        System.out.print("Enter new name: ");
	                                        String newName = scc.next();
	                                        System.out.print("Enter new address: ");
	                                        String newAddress = scc.next();
	                                        System.out.print("Enter new age: ");
	                                        String newAge = scc.next();

	                                        // Call the editProfile method with the identifier email
	                                        user.editProfile(userEmail, newPassword, newPhone, newName, newAddress, newAge);

	                                        System.out.println("Profile updated successfully!");
	                                    } else {
	                                        System.out.println("Email not found. Please provide a valid email.");
	                                    }
	                                    break;
	                                	
	                                  
	                                
	                                	
	                                case 6:
	                                   
	                                    
	                                    // Prompt the user for their email (identifier)
	                                   
	                                    boolean userFound = false;
	                             
	                                    userFound=user.printProfile(emails);
	                               
	                                    if (!userFound) {
	                                        System.out.println("Email not found. Please provide a valid email.");
	                                    }
	                                    break;
	                                    
	                                case 7:
	                                	
	                                	
	                                	
	                                	
	                                	
	                                    if (sch.isEmpty()) {
	                                        System.out.println("There are no appointments available.");
	                                    } else {
	                                        // Iterate through the sch ArrayList and check availability
	                                        System.out.print("Enter the Date when you want to apply the installation : ");
	                                        String datepr = scc.next();
	                                        System.out.print("Enter Time when you want to apply the installation : ");
	                                        String timepr = scc.next();

	                                        String g = datepr + "\t" + timepr;

	                                        boolean appointmentAvailable = false; // Flag to track availability

	                                        for (int i = 0; i < sch.size(); i++) {
	                                            if (sch.get(i).equals(g)) {
	                                                // Appointment is available
	                                                appointmentAvailable = true;
	                                                System.out.println("It's an available appointment ");
	                                                System.out.print("Enter your Email ");
	                                                String em = scc.next();
	                                                System.out.print("Enter name of product that you want to install: ");
	                                                String decpr = scc.next();
	                                                reqcount++;
	                                                appoin.add(Installer.appointment(datepr, timepr, decpr, em));
	                                              
	                                                try {
														sendEmail.sendemail("ayamoinn95@gmail.com", "1","installer");
													} catch (MessagingException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
	                                                
	                                                
	                                                break; // Break out of the loop once an available appointment is found
	                                            }
	                                        }

	                                        if (!appointmentAvailable) {
	                                            System.out.println("It's an unavailable appointment ");
	                                        }
	                                    }
	                                    break;

	                                case 8:
	                                	
	                                	
	                                	
	                                	 
	                                		
	                                		 boolean found = false;

	                                    System.out.print("Your Installation Services : ");
	                                    for (String installation : appoin) {
	                                        if (installation.contains("for customer: " + emails)) {
	                                            System.out.println(installation);
	                                            found = true;
	                                        }
	                                    }

	                                    if (!found) {
	                                        System.out.println("No installation services found for the specified customer.");
	                                    }
	                                    break;
	                                case 9:
	                                    System.out.print("Enter Category : ");
	                                    String category = scc.next();
	                                    
	                                    // Call the filterProductByCategory method and store the result in a list
	                                    List<product> filteredProducts = product.filterProductByCategory(category);

	                                    // Print the filtered products
	                                    if (filteredProducts.isEmpty()) {
	                                        System.out.println("No products found for the specified category.");
	                                    } else {
	                                        System.out.println("Filtered Products:");
	                                        for (product filteredProduct : filteredProducts) {
	                                            // Display the details of each filtered product
	                                            System.out.print("Product ID: " + filteredProduct.getId()+ "\t");
	                                            System.out.print("Product Description: " + filteredProduct.getDescription()+ "\t");
	                                            System.out.print("Product Price: " + filteredProduct.getPrices());
	                                            System.out.print("Product Availability: " + filteredProduct.getAvailability()+ "\t");
	                                            System.out.print("Product Category: " + filteredProduct.getCategories()+ "\t");
	                                            System.out.println();
	                                
	                                            
	                                        }
	                                    }
	                                    break;
	                                case 10:
	                                    System.out.print("Enter product name :");
	                                    String name = scc.next();

	                                    // Call the filterProductByname method and store the result in a list
	                                    List<product> filteredProductname = product.filterProductByname(name);

	                                    // Print the filtered products
	                                    if (filteredProductname.isEmpty()) {
	                                        System.out.println("No products found for the specified name.");
	                                    } else {
	                                        System.out.println("Filtered Products:");
	                                        for (product filteredProduct : filteredProductname) {
	                                            // Display the details of each filtered product
	                                            System.out.print("Product ID: " + filteredProduct.getId() + "\t");
	                                            System.out.print("Product Description: " + filteredProduct.getDescription() + "\t");
	                                            System.out.print("Product Price: " + filteredProduct.getPrices());
	                                            System.out.print("Product Availability: " + filteredProduct.getAvailability() + "\t");
	                                            System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
	                                            System.out.println();
	                                            
	                                        }
	                                    }
	                                    break;
	                                case 11:
	                                    System.out.print("Enter Availability:");
	                                    String availability = scc.next();

	                                    // Call the filterProductByAvailability method and store the result in a list
	                                    List<product> filteredProductAvailability = product.filterProductByAvailability(availability);

	                                    // Print the filtered products
	                                    if (filteredProductAvailability.isEmpty()) {
	                                        System.out.println("No products found for the specified availability.");
	                                    } else {
	                                        System.out.println("Filtered Products:");
	                                        for (product filteredProduct : filteredProductAvailability) {
	                                            // Display the details of each filtered product
	                                            System.out.print("Product ID: " + filteredProduct.getId() + "\t");
	                                            System.out.print("Product Description: " + filteredProduct.getDescription() + "\t");
	                                            System.out.print("Product Price: " + filteredProduct.getPrices());
	                                            System.out.print("Product Availability: " + filteredProduct.getAvailability() + "\t");
	                                            System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
	                                            System.out.println();
	                                        }
	                                    }
	                                    break;
	                            	  
	                              case 12:
	                            	   System.out.print("Enter min price range:");
	                            	    String min = scc.next();
	                             
	                            	    System.out.print("Enter max price range:");
	                            	    String max = scc.next();
	                            	 
	                            	    

	                            	    // Call the filterProductByAvailability method and store the result in a list
	                            	    List<product> filteredProductprice= product.filterProductByprice(min,max);

	                            	    // Print the filtered products
	                            	    if (filteredProductprice.isEmpty()) {
	                            	        System.out.println("No products found for the specified range");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct : filteredProductprice) {
	                            	            // Display the details of each filtered product
	                            	            System.out.print("Product ID: " + filteredProduct.getId() + "\t");
	                            	            System.out.print("Product Description: " + filteredProduct.getDescription() + "\t");
	                            	            System.out.print("Product Price: " + filteredProduct.getPrices());
	                            	            System.out.print("Product Availability: " + filteredProduct.getAvailability() + "\t");
	                            	            System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
	                            	            System.out.println();
	                            	        }
	                            	    }
	                            	    break;
	                            	  
	                            	  
	                            	
	                            	  
	                              case 13:
	                            	  //Searching Products by category and price"
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  System.out.print("Enter min price range:");
	                            	    String minn = scc.next();
	                             
	                            	    System.out.print("Enter max price range:");
	                            	    String maxx = scc.next();
	                            	    System.out.print("Enter Category:");
	                            	    String cat= scc.next();
	                            	 
	                            	 
	                            	    

	                            	    // Call the filterProductByAvailability method and store the result in a list
	                            	    List<product> filteredProductpriceandcat= product.filterProductcatprice(cat, minn, maxx);

	                            	    // Print the filtered products
	                            	    if (filteredProductpriceandcat.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct : filteredProductpriceandcat) {
	                            	            // Display the details of each filtered product
	                            	            System.out.print("Product ID: " + filteredProduct.getId() + "\t");
	                            	            System.out.print("Product Description: " + filteredProduct.getDescription() + "\t");
	                            	            System.out.print("Product Price: " + filteredProduct.getPrices());
	                            	            System.out.print("Product Availability: " + filteredProduct.getAvailability() + "\t");
	                            	            System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
	                            	            System.out.println();
	                            	        }
	                            	    }
	                            	    break;
	                            	  
	                            	  
	                            	
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  
	                            	 
	                              case 14:
	                            	//  Searching Products by name and price
	                            	  
	                            	  
	                             	  
	                            	  System.out.print("Enter min price range:");
	                            	    String minnn = scc.next();
	                             
	                            	    System.out.print("Enter max price range:");
	                            	    String maxxx = scc.next();
	                            	    System.out.print("Enter product name:");
	                            	    String namee= scc.next();
	                            	 
	                            	 
	                            	    

	                            	    // Call the filterProductByAvailability method and store the result in a list
	                            	    List<product> filteredProductpriceandname= product.filterProductnameprice(namee, minnn, maxxx);

	                            	    // Print the filtered products
	                            	    if (filteredProductpriceandname.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct : filteredProductpriceandname) {
	                            	            // Display the details of each filtered product
	                            	            System.out.print("Product ID: " + filteredProduct.getId() + "\t");
	                            	            System.out.print("Product Description: " + filteredProduct.getDescription() + "\t");
	                            	            System.out.print("Product Price: " + filteredProduct.getPrices());
	                            	            System.out.print("Product Availability: " + filteredProduct.getAvailability() + "\t");
	                            	            System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
	                            	            System.out.println();
	                            	        }
	                            	    }
	                            	    break;
	                            	    
	                            	  
	                              case 15:
	                            	  //Searching Products by availablity and price
	                             	  System.out.print("Enter min price range:");
	                            	    String minnnn = scc.next();
	                             
	                            	    System.out.print("Enter max price range:");
	                            	    String maxxxx = scc.next();
	                            	    System.out.print("Enter availablity:");
	                            	    String availablity= scc.next();
	                            	 
	                            	 
	                            	    

	                            	    // Call the filterProductByAvailability method and store the result in a list
	                            	    List<product> filteredProductpriceandavailablity= product.filterProductavaprice(availablity, minnnn, maxxxx);

	                            	    // Print the filtered products
	                            	    if (filteredProductpriceandavailablity.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct : filteredProductpriceandavailablity) {
	                            	            // Display the details of each filtered product
	                            	            System.out.print("Product ID: " + filteredProduct.getId() + "\t");
	                            	            System.out.print("Product Description: " + filteredProduct.getDescription() + "\t");
	                            	            System.out.print("Product Price: " + filteredProduct.getPrices());
	                            	            System.out.print("Product Availability: " + filteredProduct.getAvailability() + "\t");
	                            	            System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
	                            	            System.out.println();
	                            	        }
	                            	    }
	                            	    break;
	                            	    
	                            	  
	                            	  
	                            	  
	                            	  
	                              case 16:
	                            	  //Searching Products by category and name 
	                            	  // filterProductBycatgoryandname(String category, String name)
	                            	  
	                             	  System.out.print("Enter name of product :");
	                            	    String proname= scc.next();
	                             
	                            	    System.out.print("Enter Category:");
	                            	    String catg = scc.next();
	                            	   
	                            	    // Call the filterProductByAvailability method and store the result in a list
	                            	    List<product> filteredProductcatgandname= product.filterProductBycatgoryandname(catg, proname);

	                            	    // Print the filtered products
	                            	    if (filteredProductcatgandname.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct :filteredProductcatgandname) {
	                            	            // Display the details of each filtered product
	                            	            System.out.print("Product ID: " + filteredProduct.getId() + "\t");
	                            	            System.out.print("Product Description: " + filteredProduct.getDescription() + "\t");
	                            	            System.out.print("Product Price: " + filteredProduct.getPrices());
	                            	            System.out.print("Product Availability: " + filteredProduct.getAvailability() + "\t");
	                            	            System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
	                            	            System.out.println();
	                            	        }
	                            	    }
	                            	    break;
	                            	    
	                              case 17:
	                            	  // Searching Products by availablity and name
	                            	  //filterProductBynameandavay(String availability, String name) 
	                            	  
	                            	  System.out.print("Enter name of product :");
	                            	    String prodname= scc.next();
	                             
	                            	    System.out.print("Enter availablity:");
	                            	    String ava = scc.next();
	                            	   
	                            	    // Call the filterProductByAvailability method and store the result in a list
	                            	    List<product> filteredProductavaandname= product.filterProductBynameandavay(ava, prodname);

	                            	    // Print the filtered products
	                            	    if (filteredProductavaandname.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct :filteredProductavaandname) {
	                            	            // Display the details of each filtered product
	                            	            System.out.print("Product ID: " + filteredProduct.getId() + "\t");
	                            	            System.out.print("Product Description: " + filteredProduct.getDescription() + "\t");
	                            	            System.out.print("Product Price: " + filteredProduct.getPrices());
	                            	            System.out.print("Product Availability: " + filteredProduct.getAvailability() + "\t");
	                            	            System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
	                            	            System.out.println();
	                            	        }
	                            	    }
	                            	    break;
	                              case 18:
	                            	  
	                            	 
	                            	  // Searching Products by category and availablity
	                            	  //filterProductBycatgoryandavay(String category, String availability)
	                            	  
	                            	  System.out.print("Enter Category :");
	                            	    String prodcat= scc.next();
	                             
	                            	    System.out.print("Enter availablity:");
	                            	    String proava = scc.next();
	                            	   
	                            	    // Call the filterProductByAvailability method and store the result in a list
	                            	    List<product> filterProductBycatgoryandavay= product.filterProductBycatgoryandavay(prodcat, proava);

	                            	    // Print the filtered products
	                            	    if (filterProductBycatgoryandavay.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct :filterProductBycatgoryandavay) {
	                            	            // Display the details of each filtered product
	                            	            System.out.print("Product ID: " + filteredProduct.getId() + "\t");
	                            	            System.out.print("Product Description: " + filteredProduct.getDescription() + "\t");
	                            	            System.out.print("Product Price: " + filteredProduct.getPrices());
	                            	            System.out.print("Product Availability: " + filteredProduct.getAvailability() + "\t");
	                            	            System.out.print("Product Category: " + filteredProduct.getCategories() + "\t");
	                            	            System.out.println();
	                            	        }
	                            	    }
	                            	    break;	
	                              case 19:
	                            	  if (sch.isEmpty()) {
	                            		    System.out.println("There are no appointments available.");
	                            		} else {
	                            		    // Iterate through the sch ArrayList and print each element
	                            		    for (int i = 0; i < sch.size(); i++) {
	                            		        System.out.println("" + sch.get(i));
	                            		    }
	                            		}
	                            	  break;
	                                		
	                                		
	                                		
	                                
	                                	
	                                 
	                                
	                                        }
	                            
	                            
	                            
	                            
	                            
	                            
	                                   // }
	                                }
	                            } 
	                else {
	    				emails=createAccountCus();
	    				x=1;
	    	
	    				flaguser=true;
	    				
	    			}
	                        
	                    } while (userselected3 < 20);

	                    userselected = firstMenu();
	                }
	        
	        
	        
	        
	     
	        
	        
	        
	        
	        
	        
	        
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static int firstMenu() {
	    int selection;
	    Scanner sc = new Scanner(System.in);
	    
	  //  System.out.printf("An exception occurred with message: %s%n", "your_message");
	    System.out.printf("%s%n", STR);
	    System.out.println("★        Welcome:            ★");
	    System.out.printf("%s%n", STR);
	    System.out.println("★        Login as :          ★");
	    System.out.println("★        1- Admin            ★");
	    System.out.println("★        2- Installer        ★");
	    System.out.println("★        3- Customer         ★");
	    System.out.println("★        4- Exit             ★");
	    System.out.printf("%s%n", STR);
	    System.out.print(OPT);
	    
	    selection = sc.nextInt();
	    
	 
	    
	    return selection;
	}
	public static int adminMenue() {
	    int selection;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("          Admin");
	    System.out.println("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★★ ★ ★ ★ ★ ★   ");
	    System.out.printf("★%s1-%sShow customer%s                         ★ %n", S1, S1, TT);
	    System.out.printf("★%s2-%sAdd new Customer%s                         ★ %n", S1, S1, TT);
	    System.out.printf("★%s3-%sDelete Customer%s                         ★ %n", S1, S1, TT);
	    System.out.printf("★%s4-%sUpdate Customer %s                         ★ %n", S1, S1, TT);
	      
	    
	    
	    System.out.printf("★%s5-%sShow Product list %s                         ★ %n", S1, S1, TT);
	    System.out.printf("★%s6-%sAdd Product %s                         ★ %n", S1, S1, TT);
	    System.out.printf("★%s7-%sDelete Product %s                         ★ %n", S1, S1, TT);
	    System.out.printf("★%s8-%sUpdate Product %s                         ★ %n", S1, S1, TT);
	    
	    System.out.printf("★%s9-%sShow Exterior Product list %s         ★ %n", S1, S1, TT);
	   System.out.printf("★%s10-%sAdd Exterior Product %s                 ★ %n", S1, S1, TT);
	   System.out.printf("★%s11-%sDelete  Exterior Product %s                 ★ %n", S1, S1, TT);
	   System.out.printf("★%s12-%sUpdate Exterior Product %s                 ★ %n", S1, S1, TT);
	   
	    
	    System.out.printf("★%s13-%sShow Interior Product list %s         ★ %n", S1, S1, TT);
	    System.out.printf("★%s14-%sAdd Interior Product %s                 ★ %n", S1, S1, TT);
	   System.out.printf("★%s15-%sDelete  Interior Product %s                 ★  %n", S1, S1, TT);
	    System.out.printf("★%s16-%sUpdate Interior Product %s                 ★%n", S1, S1, TT);
	    
	    
	    
	    System.out.printf("★%s17-%sShow Electronic Product list %s         ★ %n", S1, S1, TT);
	    System.out.printf("★%s18-%sAdd Electronic Product %s                 ★ %n", S1, S1, TT);
	    System.out.printf("★%s19-%sDelete Electronic Product %s         ★%n", S1, S1, TT);
	    System.out.printf("★%s20-%sUpdate Electronic Product %s         ★   %n", S1, S1, TT);
	   
	    System.out.printf("★%s21-%sview installation appointments %s%s ★ %n", S1, S1, TT, TT);
	    
	    System.out.printf("★%s22-%supdate installation request %s%s ★%n", S1, S1, TT, TT);
	    System.out.printf("★%s23-%sdelete installation request  %s%s ★%n", S1, S1, TT, TT);
	    
	    System.out.printf("★%s24-%sadd installation appointments %s%s ★%n", S1, S1, TT, TT);
	    System.out.printf("★%s25-%supdate installation appointments %s%s ★%n", S1, S1, TT, TT);
	    System.out.printf("★%s26-%sdelete installation appointments %s%s ★%n", S1, S1, TT, TT);
	   
	    System.out.printf("★%s27-%sview report                %s%s ★%n", S1, S1, TT, TT);
	    
	   
	    
	    
	    
	    
	   // System.out.printf("★%s25-%sMain Menu %s%s ★%n", S1, S1, TT, TT);
	    
	   
	    System.out.println("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★★ ★ ★ ★ ★ ★   ");
	    System.out.print(OPT);
	    selection = sc.nextInt();

	    return selection;
	}
	
	
	
	public static int customerMenu() {
	    int selection;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("            Customer");
	    System.out.println("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★  ");
	    
	    
       System.out.printf("★%-2s1-%-21s                              ★%n", "", "Browse products");
	    System.out.printf("★%-2s2-%-21s                       ★%n", "", "Add product to Shopping cart");
	    System.out.printf("★%-2s3-%-21s                  ★%n", "", "Delete Product from Shopping cart");
	    System.out.printf("★%-2s4-%-21s                              ★%n", "", "View My Shopping cart");
	    System.out.printf("★%-2s5-%-21s                              ★%n", "", "edit profile");
	    System.out.printf("★%-2s6-%-21s                              ★%n", "", "My profile");
	    System.out.printf("★%-2s7-%-21s  ★%n", "", "request installation services for certain product");
	    System.out.printf("★%-2s8-%-21s                ★%n", "", "Print My All Installation Services ");
	    

	    System.out.printf("★%-2s9-%-21s                ★%n", "", "filter Products By Category\t");
	    System.out.printf("★%-2s10-%-21s                ★%n", "", "filter Products By Name \t\t");
	    System.out.printf("★%-2s11-%-21s                ★%n", "", "filter Products By Availability\t");
	    System.out.printf("★%-2s12-%-21s                ★%n", "", "filter Products By price\t\t");
	    
	    
	    
    System.out.printf("★%-2s13-%-21s          ★%n", "", "Searching Products by category and price");
   System.out.printf("★%-2s14-%-21s             ★%n", "", " Searching Products by name and price");
   System.out.printf("★%-2s15-%-21s      ★%n", "", " Searching Products by availablity and price");
   System.out.printf("★%-2s16-%-21s          ★%n", "", "Searching Products by category and name ");
	    System.out.printf("★%-2s17-%-21s       ★%n", "", " Searching Products by availablity and name");
	    
	    System.out.printf("★%-2s18-%-21s    ★%n", "", "Searching Products by category and availablity");
	    System.out.printf("★%-2s19-%-21s       ★%n", "", "view installer availability and appointment");
	    


	    
	    
	   // System.out.printf("★%-2s9-%-21s★%n", "", " Main Menu ");
	   
	    
	    System.out.println("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★  ");
	    System.out.println(OPT);

	    selection = sc.nextInt();

	    return selection;
	}

	public static int InstallerMenu() {
	    int selection;
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("            Installer");
	    System.out.println("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
	    System.out.println("★    1- My profile                 ★");
	    System.out.println("★    2- edit profile               ★");
	    System.out.println("★    3- View installation requests ★");
	    System.out.println("★    4- schedule appointments      ★");
	    System.out.println("★    5- view My appointments      ★");
	  //  System.out.println("★    5- Main Menu        ★");
	   
	    System.out.println("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
	    System.out.println(OPT);

	    selection = sc.nextInt();
	    

	    return selection;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String createAccountCus() {
	    user ff = new user();
	    Scanner n = new Scanner(System.in);
	    System.out.println("Welcome");
	    System.out.println("You are now in the create account page.");
	    System.out.println("Enter your information");
	    System.out.print("Phone : ");
	    ff.phone = n.next();
	    System.out.print("Name : ");
	    ff.name = n.next();
	    System.out.print("Address : ");
	    ff.address = n.next();
	    System.out.print("Age: ");
	    ff.age = n.next();

	    System.out.print("Email : ");
	    String hh = n.next();
	    ff.setemail(hh);

	    // Ask for the password and confirm password
	    System.out.print("Password : ");
	    String password = n.next();
	    
	    System.out.print("Confirm password : ");
	    String confirmPassword = n.next();
	    
	    if (password.equals(confirmPassword)) {
	        ff.setPass(password);  // Set the password only if it matches the confirmation
	    } else {
	        System.out.println("Passwords do not match. Account creation failed.");
	        return null; // Return null or handle the failed creation as needed
	    }

	    if (!user.passu.contains(ff.getPass())) {
	        user.passu.add(ff.getPass());
	    }
	    
	    if (!user.emailu.contains(hh)) {
	        user.emailu.add(ff.getemail());
	    }
	    
	    if (!user.useru.contains(ff)) {
	        user.useru.add(ff);
	    }

	    return ff.getemail();
	}
	
	
	
	
	
}

