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
	    user cc = null; 
	
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

	                            cc = new user(e, pp, add, n, ph, ag); 
	               			 


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
		                        
		                        
		                        
		                      
	                           
	                            
	                           
	                            products.add(p); 

	                            if ("Exterior".equals(Catttt)) {
	                                productsExterior.add(p); 
	                            }
	                            if ("Interior".equals(Catttt)) {
	                                productsInterior.add(p); 
	                            }
	                            if ("Electronic".equals(Catttt)) {
	                                productsElectronic.add(p); 
	                            }
	                            
	                            break;
	                            
	                            
		                    case 7:
		                        System.out.print("Enter id of Product you need to delete: ");
		                        String idd = scc.next();
		                        product.deleteProduct(idd);

		                        for (product prod : products) {
		                            if (prod.id.equals(idd)) {
		                                products.remove(prod);
		                                break; 
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
		                        String image = scc.next(); 

		                        p.updateProduct(iddd, descriptionn, pricee, availab, Categoriee, image);


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
		                           
		                            
		                           
		                            products.add(p); 

		                            if ("Exterior".equals(Catex)) {
		                                productsExterior.add(p); 
		                            }
		                            if ("Interior".equals(Catex)) {
		                                productsInterior.add(p); 
		                            }
		                            if ("Electronic".equals(Catex)) {
		                                productsElectronic.add(p); 
		                            }
		                            
		                    	
		                    	break;
		                    case 11:
		                    
		                        System.out.print("Enter id of Exterior  Product you need to delete: ");
		                        String iddex = scc.next();
		                        product.deleteProduct(iddex);

		                        
		                        for (product prod : products) {
		                            if (prod.id.equals(iddex)) {
		                                products.remove(prod);
		                                productsExterior.remove(prod);
		                                
		                                break; 
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

		                    	
		                    	
		                    	
		                    	
		                    	p.updateProduct(idddex, descriptionnex, priceeex, availabex, Categorieeex, imageex);

		                    	
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

		                    	
		                    	if ("Exterior".equals(Categorieeex)) {
		                    	    productsExterior.add(new product(idddex, descriptionnex, priceeex, availabex, Categorieeex, imageex));
		                    	} else if ("Interior".equals(Categorieeex)) {
		                    	    productsInterior.add(new product(idddex, descriptionnex, priceeex, availabex, Categorieeex, imageex));
		                    	} else if ("Electronic".equals(Categorieeex)) {
		                    	    productsElectronic.add(new product(idddex, descriptionnex, priceeex, availabex, Categorieeex, imageex));
		                    	}
	            		                
			                        break;
	            		              
			                        
			                   
			                        
	            		                
		                    	
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
	                           
	                            
	                           
	                            products.add(p); 

	                            if ("Exterior".equals(Catin)) {
	                                productsExterior.add(p);
	                            }
	                            if ("Interior".equals(Catin)) {
	                                productsInterior.add(p); 
	                            }
	                            if ("Electronic".equals(Catin)) {
	                                productsElectronic.add(p); 
	                            }
	                            
	                    	
	                    	break;
		                    	
		                    case 15:
		                    	System.out.print("Enter id of Interior Product you need to delete: ");
		                        String iddin = scc.next();
		                        product.deleteProduct(iddin);

		                       
		                        for (product prod : products) {
		                            if (prod.id.equals(iddin)) {
		                                products.remove(prod);
		                                productsInterior.remove(prod);
		                                
		                                break; 
		                            }
		                        }
		                        break;
		                    	
		                    case 16:
		                    	 System.out.print("Enter id of Interior Product you need to update: ");
			                        String idddin = scc.next();
			                        
			               
	            		                
			                        
			                        
			                        
			                        
			                        System.out.print("Enter description of Interior Product you need to update: ");
			                        String descriptionnen = scc.next();
			                        System.out.print("Enter price of Interior  Product you need to update: ");
			                        String priceeen = scc.next();
			                        System.out.print("Enter availability of Interior Product you need to update: ");
			                        String availaben = scc.next();
			                        System.out.print("Enter Category of Interior Productt you need to update: ");
			                        String Categorieeen = scc.next();
			                        System.out.print("Enter image URL of Interior Product you need to update: ");
			                        String imageen = scc.next(); 

			                       
			                        p.updateProduct(idddin, descriptionnen, priceeen, availaben, Categorieeen, imageen);


			            		          
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
			                       
			                       

			                        
			                        if ("Exterior".equals(Categorieeen)) {
			                            productsExterior.add(p);
			                        } else if ("Interior".equals(Categorieeen)) {
			                            productsInterior.add(p);
			                        } else if ("Electronic".equals(Categorieeen)) {
			                            productsElectronic.add(p);
			                        }
	            		                
			                        break;
	            		              
			                        
			                    
			                        
		                    	
		                    	
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
		                           
		                            
		                           
		                            products.add(p); 

		                            if ("Exterior".equals(Catelec)) {
		                                productsExterior.add(p); 
		                            }
		                            if ("Interior".equals(Catelec)) {
		                                productsInterior.add(p); 
		                            }
		                            if ("Electronic".equals(Catelec)) {
		                                productsElectronic.add(p); 
		                            }
		                            
		                    	
		                    	break;
		                    	
		                    	
		                    	
		                    	
		                    case 19:
		                    	
		                    	
		                    	 System.out.print("Enter id of Electronic  Product you need to delete: ");
			                        String iddelec = scc.next();
			                        product.deleteProduct(iddelec);

			                      
			                        for (product prod : products) {
			                            if (prod.id.equals(iddelec)) {
			                                products.remove(prod);
			                                productsElectronic.remove(prod);
			                                
			                                break; 
			                            }
			                        }
			                        break;
			                        
			                        
			                        
		                    case 20 :
		                    	System.out.print("Enter id of Electronic  Product you need to update: ");
		                        String idddelec = scc.next();
		                        
		                 
            		                
		                        
		                        
		                        
		                        
		                        System.out.print("Enter description of Electronic  Product you need to update: ");
		                        String descriptionnel = scc.next();
		                        System.out.print("Enter price of Electronic  Product you need to update: ");
		                        String priceeel = scc.next();
		                        System.out.print("Enter availability of Electronic  Product you need to update: ");
		                        String availabel = scc.next();
		                        System.out.print("Enter Category of Electronic  Product you need to update: ");
		                        String Categorieeel = scc.next();
		                        System.out.print("Enter image URL of Electronic  Product you need to update: ");
		                        String imageel = scc.next(); 

		                        
		                        p.updateProduct(idddelec, descriptionnel, priceeel, availabel, Categorieeel, imageel);


		            		         
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
		                     
		                       

		                      
		                        if ("Exterior".equals(Categorieeel)) {
		                            productsExterior.add(p);
		                        } else if ("Interior".equals(Categorieeel)) {
		                            productsInterior.add(p);
		                        } else if ("Electronic".equals(Categorieeel)) {
		                            productsElectronic.add(p);
		                        }
            		                
		                        break;
            		              
		                        
		                        
            		     

		                            
		                    case 21:
		                    	
		                    	
		                    		
                                
		                    	if (sch.isEmpty()) {
		                    	    System.out.println("There are no appointments available.");
		                    	} else {
		                    	 
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

		                      
		                        String oldAppointment = "date: " + oldDate + " time: " + oldTime + " detail: " + oldDetail + " for customer: " + emailUpdate;
		                        String newAppointment = "date: " + newDate + " time: " + newTime + " detail: " + newDetail + " for customer: " + emailUpdate;

		                      
		                        Installer.updateappointment(emailUpdate, oldDate, oldTime, oldDetail, newDate, newTime, newDetail);


		                    
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

		            
		                        String appointmentToDelete = "date: " + dateToDelete + " time: " + timeToDelete + " detail: " + detailToDelete + " for customer: " + emailDelete;

		                        if (appoin.contains(appointmentToDelete)) {
		                            appoin.remove(appointmentToDelete);
		                        }

		                    
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

		                       
		                        Installer.scheduleapp(addap, addtime);

		                      
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

		                       
		                        Installer.updateappo(oldDatee, oldTimee, newDatee, newTimee);

		                       
		                        sch.remove(oldDatee + "\t" + oldTimee);
		                        sch.add(newDatee + "\t" + newTimee);
		                        break;

		                    case 26:
		                        System.out.print("Enter Date of the appointment to be deleted: ");
		                        String deleteDate = scc.next();
		                        System.out.print("Enter Time of the appointment to be deleted: ");
		                        String deleteTime = scc.next();

		                      
		                        Installer.deleteappo(deleteDate, deleteTime);

		                     
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

		                        
		                        
		                        for (product productInCart : bag) {
		                            int totalQuantity = 0;

		                          
		                            for (product productInBag : bag) {
		                                if (productInBag.getId().equals(productInCart.getId())) {
		                                    totalQuantity += productInBag.getQuantity(); 
		                                }
		                            }

		                         
		                            if (totalQuantity > maxQuantityAcrossCustomers) {
		                                mostBoughtProduct = productInCart.getDescription();
		                                maxQuantityAcrossCustomers = totalQuantity;
		                            }
		                        }

		                      
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
                        	
	                    
	                            
	                           
	                           
	                            boolean instfound = false;
	                     
	                            instfound=Installer.printProfile(w1);
	                       
	                            if (!instfound) {
	                                System.out.println("Email not found. Please provide a valid email.");
	                            }
	                            break;    
                            
      
                          
                        
                        	
                        case 2:
                        	
                        	
                        	
                        	if (allemail.contains(w1)) {
                        	  
                        	    System.out.print("Enter new password: ");
                        	    String newPassword = scc.next();
                        	    System.out.print("Enter new phone: ");
                        	    String newPhone = scc.next();
                        	    System.out.print("Enter new name: ");
                        	    String newName = scc.next();
                        	    System.out.print("Enter new address: ");
                        	    String newAddress = scc.next();

                        	   
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
                        	
	                            
	                            System.out.print("Enter Date: ");
                                String datepr = scc.next();
                                System.out.print("Enter Time: ");
                                String timepr= scc.next();
                                String s=datepr+"\t"+timepr;
                            	sch.add(s);
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

	                            customercount++;
	                        }
	                    }
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
	                                int quantity = scc.nextInt(); 

	                             
	                                product selectedProduct = null;
	                                for (product pp : products) {
	                                    if (pp.getId().equals(id) && pp.getDescription().equals(description)) {
	                                        selectedProduct = pp;
	                                        break;
	                                    }
	                                }

	                                if (selectedProduct != null) {
	                              
	                                    selectedProduct.setEmail(emails);
	                                    selectedProduct.setQuantity(quantity);

	                               
	                                    bag.add(selectedProduct);

	                                    System.out.println("Product has been added to your bag :)");
	                                } else {
	                                    System.out.println("The product with the provided ID and description does not exist in the product list.");
	                                }
	                                break;
	                                
	                            case 3:
	                                	System.out.print("Enter the ID of the product you want to delete from the Shopping Cart: ");
	                                	String productIDToDelete = scc.next();
	                                	boolean productFound = false;

	                                	for (product productInCart : bag) {
	                                	    if (productInCart.id.equals(productIDToDelete) && productInCart.email.equals(emails)) {
	                                	        bag.remove(productInCart);
	                                	        productFound = true;
	                                	        break;
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

	                                    if (allemail.contains(userEmail)) {
	                                      
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

	                                        user.editProfile(userEmail, newPassword, newPhone, newName, newAddress, newAge);

	                                        System.out.println("Profile updated successfully!");
	                                    } else {
	                                        System.out.println("Email not found. Please provide a valid email.");
	                                    }
	                                    break;
	                                	
	                                  
	                                
	                                	
	                                case 6:
	                                   
	                                    
	                                   
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
	                                        System.out.print("Enter the Date when you want to apply the installation : ");
	                                        String datepr = scc.next();
	                                        System.out.print("Enter Time when you want to apply the installation : ");
	                                        String timepr = scc.next();

	                                        String g = datepr + "\t" + timepr;

	                                        boolean appointmentAvailable = false; 

	                                        for (int i = 0; i < sch.size(); i++) {
	                                            if (sch.get(i).equals(g)) {
	                                               
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
													
														e.printStackTrace();
													}
	                                                
	                                                
	                                                break; 
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
	                                    
	                              
	                                    List<product> filteredProducts = product.filterProductByCategory(category);

	                                  
	                                    if (filteredProducts.isEmpty()) {
	                                        System.out.println("No products found for the specified category.");
	                                    } else {
	                                        System.out.println("Filtered Products:");
	                                        for (product filteredProduct : filteredProducts) {
	                                           
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

	                                 
	                                    List<product> filteredProductname = product.filterProductByname(name);

	                                  
	                                    if (filteredProductname.isEmpty()) {
	                                        System.out.println("No products found for the specified name.");
	                                    } else {
	                                        System.out.println("Filtered Products:");
	                                        for (product filteredProduct : filteredProductname) {
	                                          
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

	                                    List<product> filteredProductAvailability = product.filterProductByAvailability(availability);

	                                    if (filteredProductAvailability.isEmpty()) {
	                                        System.out.println("No products found for the specified availability.");
	                                    } else {
	                                        System.out.println("Filtered Products:");
	                                        for (product filteredProduct : filteredProductAvailability) {
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
	                            	 
	                            	    

	                            	    List<product> filteredProductprice= product.filterProductByprice(min,max);

	                            	    if (filteredProductprice.isEmpty()) {
	                            	        System.out.println("No products found for the specified range");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct : filteredProductprice) {
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
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  System.out.print("Enter min price range:");
	                            	    String minn = scc.next();
	                             
	                            	    System.out.print("Enter max price range:");
	                            	    String maxx = scc.next();
	                            	    System.out.print("Enter Category:");
	                            	    String cat= scc.next();
	                            	 
	                            	 
	                            	    

	                            	    List<product> filteredProductpriceandcat= product.filterProductcatprice(cat, minn, maxx);

	                            	    if (filteredProductpriceandcat.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct : filteredProductpriceandcat) {
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
	                            	  
	                            	  
	                             	  
	                            	  System.out.print("Enter min price range:");
	                            	    String minnn = scc.next();
	                             
	                            	    System.out.print("Enter max price range:");
	                            	    String maxxx = scc.next();
	                            	    System.out.print("Enter product name:");
	                            	    String namee= scc.next();
	                            	 
	                            	 
	                            	    

	                            	    List<product> filteredProductpriceandname= product.filterProductnameprice(namee, minnn, maxxx);

	                            	    if (filteredProductpriceandname.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct : filteredProductpriceandname) {
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
	                             	  System.out.print("Enter min price range:");
	                            	    String minnnn = scc.next();
	                             
	                            	    System.out.print("Enter max price range:");
	                            	    String maxxxx = scc.next();
	                            	    System.out.print("Enter availablity:");
	                            	    String availablity= scc.next();
	                            	 
	                            	 
	                            	    

	                            	    List<product> filteredProductpriceandavailablity= product.filterProductavaprice(availablity, minnnn, maxxxx);

	                            	    if (filteredProductpriceandavailablity.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct : filteredProductpriceandavailablity) {
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
	                            	  
	                             	  System.out.print("Enter name of product :");
	                            	    String proname= scc.next();
	                             
	                            	    System.out.print("Enter Category:");
	                            	    String catg = scc.next();
	                            	   
	                            	    List<product> filteredProductcatgandname= product.filterProductBycatgoryandname(catg, proname);

	                            	    if (filteredProductcatgandname.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct :filteredProductcatgandname) {
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
	                            	
	                            	  
	                            	  System.out.print("Enter name of product :");
	                            	    String prodname= scc.next();
	                             
	                            	    System.out.print("Enter availablity:");
	                            	    String ava = scc.next();
	                            	   
	                            	    List<product> filteredProductavaandname= product.filterProductBynameandavay(ava, prodname);

	                            	    if (filteredProductavaandname.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct :filteredProductavaandname) {
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
	                            	  
	                            	 
	                            	
	                            	  System.out.print("Enter Category :");
	                            	    String prodcat= scc.next();
	                             
	                            	    System.out.print("Enter availablity:");
	                            	    String proava = scc.next();
	                            	   
	                            	    List<product> filterProductBycatgoryandavay= product.filterProductBycatgoryandavay(prodcat, proava);

	                            	    if (filterProductBycatgoryandavay.isEmpty()) {
	                            	        System.out.println("No products found ");
	                            	    } else {
	                            	        System.out.println("Filtered Products:");
	                            	        for (product filteredProduct :filterProductBycatgoryandavay) {
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
	                            		    for (int i = 0; i < sch.size(); i++) {
	                            		        System.out.println("" + sch.get(i));
	                            		    }
	                            		}
	                            	  break;
	                                		
	                                		
	                                		
	                                
	                                	
	                                 
	                                
	                                        }
	                            
	                            
	                            
	                            
	                            
	                            
	                                 
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

	    System.out.print("Password : ");
	    String password = n.next();
	    
	    System.out.print("Confirm password : ");
	    String confirmPassword = n.next();
	    
	    if (password.equals(confirmPassword)) {
	        ff.setPass(password);  
	    } else {
	        System.out.println("Passwords do not match. Account creation failed.");
	        return null; 
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

