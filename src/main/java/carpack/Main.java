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
	
	 private static final Logger logger = Logger.getLogger(Main.class.getName());

	 private static final String NO_APPOINTMENTS_MESSAGE = "There are no appointments available.";
	 private static final String EMAIL_NOT_FOUND_MESSAGE = "Email not found. Please provide a valid email.";
	 private static final String PRODUCT_ID_LABEL = "Product ID: ";
	 private static final String PRODUCT_PRICE_LABEL = "Product Price: ";
	 private static final String PRODUCT_CATEGORY_LABEL = "Product Category: ";
	 private static final String PRODUCT_NAME_LABEL = "Product name: ";
	 private static final String PRODUCT_AVAILABILITY_LABEL = "Product Availability: ";
	 private static final String PRODUCT_IMAGE_LABEL = "Product Image: ";
	 private static final String FILTERED_PRODUCTS_LABEL = "Filtered Products:";
	 private static final String AVAILABILITY_PROMPT = "Enter availability:";
	    private static final String NO_PRODUCTS_FOUND_MESSAGE = "No products found ";
	    private static final String MAX_PRICE_PROMPT = "Enter max price range:";
	    private static final String MIN_PRICE_PROMPT = "Enter min price range:";
	    private static final String ELECTRONIC_LABEL = "Electronic";
	    private static final String INTERIOR_LABEL = "Interior";
	    private static final String EXTERIOR_LABEL = "Exterior";
	    private static final String PRODUCT_FORMAT = "Product : %s %s %s %s %s%n";
	    private static final String TIME_LABEL = "time:";
	    private static final String FOR_CUSTOMER_LABEL = " for customer: ";
	    private static final String DATE_LABEL = "date: ";
	    private static final String DETAIL_LABEL = " detail: ";
	    private static final String PRODUCT_LABEL = "Product : ";
	   


	   










	    
	   
















	
	
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ArrayList<product> products = new ArrayList<product>();
        ArrayList<product> productsExterior = new ArrayList<product>();
        
        
        ArrayList<product> productsInterior = new ArrayList<product>();
        ArrayList<product> productsElectronic = new ArrayList<product>();
        ArrayList<product> bag = new ArrayList<product>();
        ArrayList<String> allemail=new ArrayList<String>();
        int Type = -1;
        
        user r = new user();
        ArrayList<String> appoin=new ArrayList<String>();
        ArrayList<String> sch=new ArrayList<String>();
        
	    Scanner scc = new Scanner(System.in);
	    int userselected = 0;
	    user cc = null; 
	
	    admin aa = new admin();
	    product p=null;
	    int buycount=0;
	    int reqcount=0;
	    int totalProfit=0;

	    Installer w = new Installer();
	    

	    boolean flagadmin = false;
	   

	   
	    
	
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
	            logger.info(ayy);
	            String a1 = scc.next();
	            logger.info(ayy1);
	            String a2 = scc.next();
	            if (aa.checkemail(a1) == 1 && aa.checkpass(a2) == 1) {
	                flagadmin = true;
	                Type = 1;
	            }

	            do {
	                if (flagadmin) {
	                    userselected1 = adminMenue();
	                    switch (userselected1) {
	                        case 1:
	                        	
	                            user.printCustomer();
	                            break;

	                        case 2:
	                        	logger.info("Enter email of Customer you need to add: ");
	                            String e = scc.next();
	                            logger.info("Enter pass of Customer you need to add: ");
	                           String pp = scc.next();
	                           logger.info("Enter phone of Customer you need to add: ");
	                            String ph = scc.next();
	                            logger.info("Enter name of Customer you need to add: ");
	                            String n = scc.next();
	                            logger.info("Enter address of Customer you need to add: ");
	                            String add = scc.next();
	                            logger.info("Enter age of Customer you need to add: ");
	                            String ag = scc.next();

	                            cc = new user(e, pp, add, n, ph, ag); 
	               			 


	                            break;
		                        
		                        
		                    case 3:
		                    	logger.info("Enter email of Customer you need to delete : ");
		                    	 String cuss = scc.next();
		                    	 
		                        r.deleteCustomer(cuss);
		                        break;
		                    case 4:
		                    	logger.info("Enter email of Customer you need to update: ");
		                    	 String cp = scc.next();
		                    	 
		                    	 
		                    	 logger.info("Enter new name to update: ");
		                    	 String cn = scc.next();
		                    	 logger.info("Enter new age to update: ");
		                    	 String ca = scc.next();
		                    	 logger.info("Enter new address to update: ");
		                    	 String cad = scc.next();
		                    	 logger.info("Enter new phone to update: ");
		                    	 String cd = scc.next();
		                    	 
		                    	
		                    	 
		                    	r.updatCustomer(cp,cn,ca,cad,cd);
		                    	
		                        break;
		                    case 5:
		                        if (products.isEmpty()) {
		                        	logger.info("No products available.");
		                        } else {
		                            for (int i = 0; i < products.size(); i++) {
		                                String a = PRODUCT_LABEL + products.get(i).id + " " + products.get(i).description + " " + products.get(i).prices + " " +
		                                           products.get(i).availability + " " + products.get(i).categories;
		                                logger.info(a);
		                            }
		                        }
		                        break;
		                       
		                  
		                        
		                    case 6:
		                    	logger.info("Enter id of Product you need to add: ");
		                        String id = scc.next();
		                        logger.info("Enter description of Product you need to add: ");
		                        String desc = scc.next();
		                        logger.info("Enter prices of Product you need to add: ");
		                        String prices = scc.next();
		                        logger.info("Enter availability of Product you need to add: ");
		                        String availability = scc.next();
		                        logger.info("Enter Categories of Product you need to add: ");
		                        String catigor = scc.next();

		                        logger.info("Enter image of Product you need to add: ");
		                        String imagg = scc.next();

		                        p = new product(id, desc, prices, availability, catigor , imagg);
		                        
		                        
		                        
		                      
	                           
	                            
	                           
	                            products.add(p); 

	                            if (EXTERIOR_LABEL.equals(catigor )) {
	                                productsExterior.add(p); 
	                            }
	                            if (INTERIOR_LABEL.equals(catigor )) {
	                                productsInterior.add(p); 
	                            }
	                            if (ELECTRONIC_LABEL.equals(catigor )) {
	                                productsElectronic.add(p); 
	                            }
	                            
	                            break;
	                            
	                            
		                    case 7:
		                    	logger.info("Enter id of Product you need to delete: ");
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
		                        logger.info("Enter id of Product you need to update: ");
		                        String iddd = scc.next();
		                        logger.info("Enter description of Product you need to update: ");
		                        String descriptionn = scc.next();
		                        logger.info("Enter price of Product you need to update: ");
		                        String pricee = scc.next();
		                        logger.info("Enter availability of Product you need to update: ");
		                        String availab = scc.next();
		                        logger.info("Enter Category of Product you need to update: ");
		                        String categoriee = scc.next();
		                        logger.info("Enter image URL of Product you need to update: ");
		                        String image = scc.next(); 

		                        p.updateProduct(iddd, descriptionn, pricee, availab, categoriee, image);


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
		                       

		                        if (EXTERIOR_LABEL.equals(categoriee)) {
		                            productsExterior.add(p);
		                        } else if (INTERIOR_LABEL.equals(categoriee)) {
		                            productsInterior.add(p);
		                        } else if (ELECTRONIC_LABEL.equals(categoriee)) {
		                            productsElectronic.add(p);
		                        }
		                        break;
		                        
		                    case 9:
		                        for (int i = 0; i < productsExterior.size(); i++) {
		                            String logMessage = String.format(PRODUCT_FORMAT ,
		                                    productsExterior.get(i).id,
		                                    productsExterior.get(i).description,
		                                    productsExterior.get(i).prices,
		                                    productsExterior.get(i).availability,
		                                    productsExterior.get(i).categories);

		                            logger.info(logMessage);
		                        }
		                        break;
		                    	
		                    case 10:
		                    	
		                    	 logger.info("Enter id of Exterior Product you need to add: ");
			                        String idex = scc.next();
			                        logger.info("Enter description of Exterior Product you need to add: ");
			                        String descex = scc.next();
			                        logger.info("Enter prices of Exterior Product you need to add: ");
			                        String pricesex = scc.next();
			                        logger.info("Enter availability of Exterior Product you need to add: ");
			                        String availabilityex = scc.next();
			                      
			                        String catex =EXTERIOR_LABEL;
			                        logger.info("Enter image of  Exterior Product you need to add: ");
			                        String imagex = scc.next();
			                       
			                        
			                      p=new product(idex,descex,pricesex,availabilityex,catex,imagex);
		                           
		                            
		                           
		                            products.add(p); 

		                            if (EXTERIOR_LABEL.equals(catex)) {
		                                productsExterior.add(p); 
		                            }
		                            if (INTERIOR_LABEL.equals(catex)) {
		                                productsInterior.add(p); 
		                            }
		                            if (ELECTRONIC_LABEL.equals(catex)) {
		                                productsElectronic.add(p); 
		                            }
		                            
		                    	
		                    	break;
		                    case 11:
		                    
		                        logger.info("Enter id of Exterior  Product you need to delete: ");
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
		                    	
		                    	logger.info("Enter id of Exterior Product you need to update: ");
		                    	String idddex = scc.next();

		                    	

		                    	logger.info("Enter description of Exterior Product you need to update: ");
		                    	String descriptionnex = scc.next();
		                    	logger.info("Enter price of Exterior Product you need to update: ");
		                    	String priceeex = scc.next();
		                    	logger.info("Enter availability of Exterior Product you need to update: ");
		                    	String availabex = scc.next();
		                    	logger.info("Enter Category of Exterior Product you need to update: ");
		                    	String categorieeex = scc.next();
		                    	logger.info("Enter image URL of Exterior Product you need to update: ");
		                    	String imageex = scc.next();

		                    	
		                    	
		                    	
		                    	
		                    	p.updateProduct(idddex, descriptionnex, priceeex, availabex, categorieeex, imageex);

		                    	
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

		                    	
		                    	if (EXTERIOR_LABEL.equals(categorieeex)) {
		                    	    productsExterior.add(new product(idddex, descriptionnex, priceeex, availabex, categorieeex, imageex));
		                    	} else if (INTERIOR_LABEL.equals(categorieeex)) {
		                    	    productsInterior.add(new product(idddex, descriptionnex, priceeex, availabex, categorieeex, imageex));
		                    	} else if (ELECTRONIC_LABEL.equals(categorieeex)) {
		                    	    productsElectronic.add(new product(idddex, descriptionnex, priceeex, availabex, categorieeex, imageex));
		                    	}
	            		                
			                        break;
	            		              
			                        
			                   
			                        
	            		                
		                    	
		                    case 13:
		                        for (int i = 0; i < productsInterior.size(); i++) {
		                            String logMessage = String.format(PRODUCT_FORMAT ,
		                                    productsInterior.get(i).id,
		                                    productsInterior.get(i).description,
		                                    productsInterior.get(i).prices,
		                                    productsInterior.get(i).availability,
		                                    productsInterior.get(i).categories);

		                            logger.info(logMessage);
		                        }
		                        break;
		                    	
		                    	


		                    	
		                    	
		                    case 14:
		                    	logger.info("Enter id of Interior Product you need to add: ");
		                        String idin = scc.next();
		                        logger.info("Enter description of Interior Product you need to add: ");
		                        String descin = scc.next();
		                        logger.info("Enter prices of Interior Product you need to add: ");
		                        String pricesin = scc.next();
		                        logger.info("Enter availability of Interiorr Product you need to add: ");
		                        String availabilityin = scc.next();
		                      
		                        String catin =INTERIOR_LABEL;
		                        logger.info("Enter image of  Interior Product you need to add: ");
		                        String imagin = scc.next();
		                       
		                        
		                      p=new product(idin,descin,pricesin,availabilityin,catin,imagin);
	                           
	                            
	                           
	                            products.add(p); 

	                            if (EXTERIOR_LABEL.equals(catin)) {
	                                productsExterior.add(p);
	                            }
	                            if (INTERIOR_LABEL.equals(catin)) {
	                                productsInterior.add(p); 
	                            }
	                            if (ELECTRONIC_LABEL.equals(catin)) {
	                                productsElectronic.add(p); 
	                            }
	                            
	                    	
	                    	break;
		                    	
		                    case 15:
		                    	logger.info("Enter id of Interior Product you need to delete: ");
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
		                    	 logger.info("Enter id of Interior Product you need to update: ");
			                        String idddin = scc.next();
			                        
			               
	            		                
			                        
			                        
			                        
			                        
			                        logger.info("Enter description of Interior Product you need to update: ");
			                        String descriptionnen = scc.next();
			                        logger.info("Enter price of Interior  Product you need to update: ");
			                        String priceeen = scc.next();
			                        logger.info("Enter availability of Interior Product you need to update: ");
			                        String availaben = scc.next();
			                        logger.info("Enter Category of Interior Productt you need to update: ");
			                        String categorieeen = scc.next();
			                        logger.info("Enter image URL of Interior Product you need to update: ");
			                        String imageen = scc.next(); 

			                       
			                        p.updateProduct(idddin, descriptionnen, priceeen, availaben, categorieeen, imageen);


			            		          
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
			                       
			                       

			                        
			                        if (EXTERIOR_LABEL.equals(categorieeen)) {
			                            productsExterior.add(p);
			                        } else if (INTERIOR_LABEL.equals(categorieeen)) {
			                            productsInterior.add(p);
			                        } else if (ELECTRONIC_LABEL.equals(categorieeen)) {
			                            productsElectronic.add(p);
			                        }
	            		                
			                        break;
	            		              
			                        
			                    
			                        
		                    	
		                    case 17:
		                        for (int i = 0; i < productsElectronic.size(); i++) {
		                            String logMessage = String.format(PRODUCT_FORMAT ,
		                                    productsElectronic.get(i).id,
		                                    productsElectronic.get(i).description,
		                                    productsElectronic.get(i).prices,
		                                    productsElectronic.get(i).availability,
		                                    productsElectronic.get(i).categories);

		                            logger.info(logMessage);
		                        }
		                        break;

		                    case 18 :
		                    	 logger.info("Enter id of Electronic Product you need to add: ");
			                        String idelc = scc.next();
			                        logger.info("Enter description of Electronic Product you need to add: ");
			                        String descelec = scc.next();
			                        logger.info("Enter prices of Electronic Product you need to add: ");
			                        String priceselec = scc.next();
			                        logger.info("Enter availability of Electronic Product you need to add: ");
			                        String availabilityelec = scc.next();
			                      
			                        String Catelec =ELECTRONIC_LABEL;
			                        logger.info("Enter image of  Electronic Product you need to add: ");
			                        String imagelec = scc.next();
			                       
			                        
			                      p=new product(idelc,descelec,priceselec,availabilityelec,Catelec,imagelec);
		                           
		                            
		                           
		                            products.add(p); 

		                            if (EXTERIOR_LABEL.equals(Catelec)) {
		                                productsExterior.add(p); 
		                            }
		                            if (INTERIOR_LABEL.equals(Catelec)) {
		                                productsInterior.add(p); 
		                            }
		                            if (ELECTRONIC_LABEL.equals(Catelec)) {
		                                productsElectronic.add(p); 
		                            }
		                            
		                    	
		                    	break;
		                    	
		                    	
		                    	
		                    	
		                    case 19:
		                    	
		                    	
		                    	 logger.info("Enter id of Electronic  Product you need to delete: ");
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
		                    	logger.info("Enter id of Electronic  Product you need to update: ");
		                        String idddelec = scc.next();
		                        
		                 
            		                
		                        
		                        
		                        
		                        
		                        logger.info("Enter description of Electronic  Product you need to update: ");
		                        String descriptionnel = scc.next();
		                        logger.info("Enter price of Electronic  Product you need to update: ");
		                        String priceeel = scc.next();
		                        logger.info("Enter availability of Electronic  Product you need to update: ");
		                        String availabel = scc.next();
		                        logger.info("Enter Category of Electronic  Product you need to update: ");
		                        String categorieeel = scc.next();
		                        logger.info("Enter image URL of Electronic  Product you need to update: ");
		                        String imageel = scc.next(); 

		                        
		                        p.updateProduct(idddelec, descriptionnel, priceeel, availabel, categorieeel, imageel);


		            		         
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
		                     
		                       

		                      
		                        if (EXTERIOR_LABEL.equals(categorieeel)) {
		                            productsExterior.add(p);
		                        } else if (INTERIOR_LABEL.equals(categorieeel)) {
		                            productsInterior.add(p);
		                        } else if (ELECTRONIC_LABEL.equals(categorieeel)) {
		                            productsElectronic.add(p);
		                        }
            		                
		                        break;
            		              
		                        
		                        
            		     

		                            
		                    case 21:
		                    	
		                    	
		                    		
                                
		                    	if (sch.isEmpty()) {
		                    	    logger.info(NO_APPOINTMENTS_MESSAGE + "\n");
		                    	} else {
		                    	 
		                    	    for (int i = 0; i < sch.size(); i++) {
		                    	    	 logger.info(String.format("%s%n", sch.get(i)));
		                    	    }
		                    	}
	                            break;
	                            
		                    
                               
                               
		                    case 22:
		                
		                        logger.info("Enter Email of user for appointment update: ");
		                        String emailUpdate = scc.next();
		                        logger.info("Enter the old Date of the appointment: ");
		                        String oldDate = scc.next();
		                        logger.info("Enter the old Time of the appointment: ");
		                        String oldTime = scc.next();
		                        logger.info("Enter the old name of product: ");
		                        String oldDetail = scc.next();
		                        
		                        logger.info("Enter the new Date for the appointment: ");
		                        String newDate = scc.next();
		                        logger.info("Enter the new Time for the appointment: ");
		                        String newTime = scc.next();
		                        logger.info("Enter updated name of product that you want to install: ");
		                        String newDetail = scc.next();

		                      
		                        String oldAppointment = DATE_LABEL + oldDate + TIME_LABEL + oldTime + DETAIL_LABEL + oldDetail + FOR_CUSTOMER_LABEL + emailUpdate;
		                        String newAppointment = DATE_LABEL + newDate + TIME_LABEL + newTime + DETAIL_LABEL + newDetail + FOR_CUSTOMER_LABEL + emailUpdate;

		                      
		                        Installer.updateappointment(emailUpdate, oldDate, oldTime, oldDetail, newDate, newTime, newDetail);


		                    
		                        for (int i = 0; i < appoin.size(); i++) {
		                            if (appoin.get(i).equals(oldAppointment)) {
		                                appoin.set(i, newAppointment);
		                                break;
		                            }
		                        }
		                        logger.info(String.format("Appointment updated successfully: %s%n", newAppointment));




	
		                        break;
		                    	
		                    case 23:
		                        logger.info("Enter Email of user for appointment deletion: ");
		                        String emailDelete = scc.next();
		                        logger.info("Enter Date of the appointment to be deleted: ");
		                        String dateToDelete = scc.next();
		                        logger.info("Enter Time of the appointment to be deleted: ");
		                        String timeToDelete = scc.next();
		                        logger.info("Enter name of product of this appointment to be deleted: ");
		                        String detailToDelete = scc.next();

		            
		                        String appointmentToDelete = DATE_LABEL + dateToDelete + TIME_LABEL + timeToDelete + DETAIL_LABEL + detailToDelete + FOR_CUSTOMER_LABEL + emailDelete;

		                        if (appoin.contains(appointmentToDelete)) {
		                            appoin.remove(appointmentToDelete);
		                        }

		                    
		                        boolean isDeleted = Installer.deleteappointment(emailDelete, dateToDelete, timeToDelete, detailToDelete);

		                        if (isDeleted) {
		                            logger.info("Appointment deleted successfully."+ "\n");
		                        } else {
		                            logger.info("No matching appointment found for deletion."+ "\n");
		                        }
		                        break;
		                        
		                    	
		                    case 24:
		                        logger.info("Enter Date of the appointment to be added: ");
		                        String addap = scc.next();
		                        logger.info("Enter Time of the appointment to be added: ");
		                        String addtime = scc.next();
		                        String d = addap + "\t" + addtime;

		                       
		                        Installer.scheduleapp(addap, addtime);

		                      
		                        sch.add(d);
		                        break;

		                    case 25:
		                        logger.info("Enter old Date of the appointment: ");
		                        String oldDatee = scc.next();
		                        logger.info("Enter old Time of the appointment: ");
		                        String oldTimee = scc.next();

		                        logger.info("Enter new Date of the appointment: ");
		                        String newDatee = scc.next();
		                        logger.info("Enter new Time of the appointment: ");
		                        String newTimee = scc.next();

		                       
		                        Installer.updateappo(oldDatee, oldTimee, newDatee, newTimee);

		                       
		                        sch.remove(oldDatee + "\t" + oldTimee);
		                        sch.add(newDatee + "\t" + newTimee);
		                        break;

		                    case 26:
		                        logger.info("Enter Date of the appointment to be deleted: ");
		                        String deleteDate = scc.next();
		                        logger.info("Enter Time of the appointment to be deleted: ");
		                        String deleteTime = scc.next();

		                      
		                        Installer.deleteappo(deleteDate, deleteTime);

		                     
		                        sch.remove(deleteDate + "\t" + deleteTime);
		                        break;
		                	   
		                     
		                    case 27:
		                        logger.info("  * * * * * * * * * * * * * * * *REPORT * * * * * * * * * * * * * * * * * * * * * * * * * *"+ "\n");

		                        logger.info(String.format("1. Total number of customer: %d%n", customercount));
		                        logger.info(String.format("2. Total number of installer: %d%n", installercount));
		                        logger.info(String.format("3. Count of buy product: %d%n", buycount));
		                        logger.info(String.format("4. Total Installation request count: %d%n", reqcount));
		                        logger.info(String.format("5. Total profit: %f%n", totalProfit));

		                        
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
		                        	logger.info(String.format("4. The most bought product is: %s%n", mostBoughtProduct));

		                        	logger.info(String.format("5. Total quantity sold for this most bought product: %d%n", maxQuantityAcrossCustomers));
		                        } else {
		                            logger.info("No products have been bought yet."+ "\n");
		                        }
		                        logger.info("  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *"+ "\n");
		                        break;
		                     
		                     
		                        
		                        
		            
		                    default:
		                        logger.info("Thank you"+ "\n");
		                        break;
		                }
		            }
	                else {
		                logger.info("Your USERNAME or PASSWORD is incorrect"+ "\n");
		                logger.info("Please try again"+ "\n");
		            }
		        } while (userselected1 < 28);{    
	       			 

	        			userselected =firstMenu();
	        			

	        		}
	            
		        
		  
		    }
	        
	        
	        

	        
	        
	        
	        
	        
	         if (userselected == 2) {
	            int userselected2 = 0;

	            logger.info(ayy);
	            String w1 = scc.next();
	            logger.info(ayy1);
	            String w2 = scc.next();
	            if (w.checkemail(w1) == 1 && w.checkpass(w2) == 1) {
	                flagworker = true;
	                if(!allemail.contains(w1) ) {
	                allemail.add(w1);
	                installercount++;
	                }
	                Type = 2;
	            }

	            do {
	                if (flagworker) {
	                	
	                    userselected2 = InstallerMenu();
	                    switch (userselected2) {
	                    case 1:
                        	
	                    
	                            
	                           
	                           
	                            boolean instfound = false;
	                     
	                            instfound=Installer.printProfile(w1);
	                       
	                            if (!instfound) {
	                                logger.info(EMAIL_NOT_FOUND_MESSAGE + "\n");
	                            }
	                            break;    
                            
      
                          
                        
                        	
                        case 2:
                        	
                        	
                        	
                        	if (allemail.contains(w1)) {
                        	  
                        	    logger.info("Enter new password: ");
                        	    String newPassword = scc.next();
                        	    logger.info("Enter new phone: ");
                        	    String newPhone = scc.next();
                        	    logger.info("Enter new name: ");
                        	    String newName = scc.next();
                        	    logger.info("Enter new address: ");
                        	    String newAddress = scc.next();

                        	   
                        	    Installer.editProfile(w1, newPassword, newPhone, newName, newAddress);

                        	    logger.info("Profile updated successfully!"+ "\n");
                        	} else {
                        		logger.info(EMAIL_NOT_FOUND_MESSAGE + "\n");
                        	}
                              break;
                       
	                        case 3:
	                        	
	                        	logger.info("ALL Request: "+ "\n");
	                        	for (String appointment : appoin) {
	                        	    logger.info(appointment+ "\n");
	                        	}
	                            
	                            break;
	                        case 4:
                        	
	                            
	                            logger.info("Enter Date: ");
                                String datepr = scc.next();
                                logger.info("Enter Time: ");
                                String timepr= scc.next();
                                String s=datepr+"\t"+timepr;
                            	sch.add(s);
                            	logger.info("Your APPOINTMENTS: "+ "\n");
                            	for (String appointment : sch) {
                            	    logger.info(String.format("%s%n", appointment));
                            	}
                            	break;
	                           
	                     case 5:
	                    	 logger.info("Your APPOINTMENTS: "+ "\n");
	                        	for (String appointment : sch) {
	                        	    logger.info(appointment+ "\n");
	                        	}
	                       	
	                       	break;
	
	                   	        
	                   	        
	                       
	                        default:
	                            logger.info("Welcome "+ "\n");
	                            break;
	                    }
	                } else {
	                    logger.info("Your USERNAME or PASSWORD is incorrect"+ "\n");
	                    logger.info("Please try again"+ "\n");
	                    break;
	                }

	            } while (userselected2 < 6);
	            	{    
	       			 

	        			userselected =firstMenu();
	        			

	        		}
	            

	            logger.info(""+ "\n");
	        }
	        
	        
	        
	        
	        
	        
	        
	         if (userselected == 3) {
	        	 
	            logger.info("1- You have an account"+ "\n");
	            logger.info("2- Create account"+ "\n");
	            logger.info("Your option is: ");
	            int x = scc.nextInt();

	            int userselected3 = 0;
	           


	            do {
	                String cc1 = null;
	                String cc2;
	                if (x == 1) {
	                	
	                    if (!flagaccount) {
	                        logger.info(ayy);
	                        cc1 = scc.next();
	                        emails = cc1;
	                       
	                        logger.info(ayy1);
	                        cc2 = scc.next();
	                        flagaccount = true;
	                        
	                     

	                      

	                        
	                        if (!allemail.contains(emails) && user.checkemail(cc1) == 1 && user.checkpass(cc2) == 1) {

	                        	allemail.add(emails);
	                            flaguser = true;
	                            Type = 3;

	                            customercount++;
	                        }
	                    }
	                        if (flaguser) {
	                        	
	                        	
	                        	
	                        	
	                        	
	                        	
	                            userselected3 = customerMenu();
	                            switch (userselected3) {
	                            
	                            case 1:
	                            	   if (products.isEmpty()) {
	   		                            logger.info("No products available."+ "\n");
	   		                        } else {
	   		                            for (int i = 0; i < products.size(); i++) {
	   		                                String a = PRODUCT_LABEL + products.get(i).id + " " + products.get(i).description + " " + products.get(i).prices + " " +
	   		                                           products.get(i).availability + " " + products.get(i).categories;
	   		                             logger.info(String.format("%s%n", a));

	   		                            }
	   		                        }
	   		                        break;
	                            
	                            
	                            
	                                
	                            case 2:
	                                logger.info("Enter the ID of the product: ");
	                                String id = scc.next();
	                                logger.info("Enter the name of the product: ");
	                                String description = scc.next();
	                                logger.info("Enter the Quantity of the product: ");
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

	                                    logger.info("Product has been added to your bag :)"+ "\n");
	                                } else {
	                                    logger.info("The product with the provided ID and description does not exist in the product list."+ "\n");
	                                }
	                                break;
	                                
	                            case 3:
	                                	logger.info("Enter the ID of the product you want to delete from the Shopping Cart: ");
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
	                                	    logger.info("Product has been successfully removed from your Shopping Cart."+ "\n");
	                                	} else {
	                                		logger.info(String.format("Product with ID %s was not found in your Shopping Cart.%n", productIDToDelete));

	                                	}
	                                	
	                                  
	                                    break;
	                                case 4:
	                                    boolean ordersFound = false;

	                                    
	                                    
	                                
	                                    logger.info(String.format("Shopping cart to customer with email: %s%n", emails));

	                                    
	                                    for (product productInCart : bag) {
	                                    	
	                                    	
	                                        if (productInCart.getemail().equals(emails)) {
	                                        	
	                                        	
	                                            logger.info(PRODUCT_ID_LABEL + productInCart.getId() + "\t");
	                                            logger.info(PRODUCT_NAME_LABEL + productInCart.getDescription() + "\t");
	                                            logger.info(PRODUCT_PRICE_LABEL + productInCart.getPrices() + "\t");
	                                            buycount++;
	                                            int price = Integer.parseInt(productInCart.getPrices());
	                                            totalProfit += price * productInCart.getQuantity();
	                                            
	                                            logger.info(PRODUCT_IMAGE_LABEL + productInCart.getImage() + "\t");
	                                            logger.info(PRODUCT_CATEGORY_LABEL + productInCart.getCategories()+ "\n");
	                                            
	                                          

	                                            ordersFound = true;
	                                        }
	                                        
	                                    }
	                                    

	                                    if (!ordersFound) {
	                                        logger.info(String.format("No orders found for the customer with email: %s%n", emails));
	                                    }

	                                    
	                                    logger.info(" Do you want to confirm your order? Enter yes or no: "+ "\n");
	                                    String conf = scc.next();

	                                    if (conf.equals("yes")) {
	                                    	

	                                    	try {
	                                    	    sendEmail.sendemail("Jodikmal@gmail.com", "1", "user");
	                                    	} catch (MessagingException e) {
	                                    	   
	                                    	        System.err.println("Error sending email: " + e.getMessage());
	                                    	    
	                                    	}
	                                    	
	                                    	
	                                    	logger.info(String.format("Your purchases price: %f%n", totalProfit));
	                                    	logger.info(String.format("Total number of products bought: %d%n", buycount));
	                                    }
	                                    else {
	                                    	
	                                    }
	                                    	
	                                    
	                                    break;
	                                    
	                                    
	                                case 5:
	                                    logger.info("Enter your email: ");
	                                    String userEmail = scc.next();

	                                    if (allemail.contains(userEmail)) {
	                                      
	                                        logger.info("Enter new password: ");
	                                        String newPassword = scc.next();
	                                        logger.info("Enter new phone: ");
	                                        String newPhone = scc.next();
	                                        logger.info("Enter new name: ");
	                                        String newName = scc.next();
	                                        logger.info("Enter new address: ");
	                                        String newAddress = scc.next();
	                                        logger.info("Enter new age: ");
	                                        String newAge = scc.next();

	                                        user.editProfile(userEmail, newPassword, newPhone, newName, newAddress, newAge);

	                                        logger.info("Profile updated successfully!"+ "\n");
	                                    } else {
	                                    	logger.info(EMAIL_NOT_FOUND_MESSAGE + "\n");	                                    }
	                                    break;
	                                	
	                                  
	                                
	                                	
	                                case 6:
	                                   
	                                    
	                                   
	                                    boolean userFound = false;
	                             
	                                    userFound=user.printProfile(emails);
	                               
	                                    if (!userFound) {
	                                    	logger.info(EMAIL_NOT_FOUND_MESSAGE + "\n");	                                    }
	                                    break;
	                                    
	                                case 7:
	                                	
	                                	
	                                	
	                                	
	                                	
	                                	if (sch.isEmpty()) {
	    		                    	    logger.info(NO_APPOINTMENTS_MESSAGE + "\n");
	    		                    	}  else {
	                                        logger.info("Enter the Date when you want to apply the installation : ");
	                                        String datepr = scc.next();
	                                        logger.info("Enter Time when you want to apply the installation : ");
	                                        String timepr = scc.next();

	                                        String g = datepr + "\t" + timepr;

	                                        boolean appointmentAvailable = false; 

	                                        for (int i = 0; i < sch.size(); i++) {
	                                            if (sch.get(i).equals(g)) {
	                                               
	                                                appointmentAvailable = true;
	                                                logger.info("It's an available appointment "+ "\n");
	                                                logger.info("Enter your Email ");
	                                                String em = scc.next();
	                                                logger.info("Enter name of product that you want to install: ");
	                                                String decpr = scc.next();
	                                                reqcount++;
	                                                appoin.add(Installer.appointment(datepr, timepr, decpr, em));
	                                              
	                                                try {
	                                                    sendEmail.sendemail("ayamoinn95@gmail.com", "1", "installer");
	                                                } catch (MessagingException e) {
	                                                   
	                                                        System.err.println("Error sending email: " + e.getMessage());
	                                                    
	                                                }
	                                                
	                                                
	                                                break; 
	                                            }
	                                        }

	                                        if (!appointmentAvailable) {
	                                            logger.info("It's an unavailable appointment "+ "\n");
	                                        }
	                                    }
	                                    break;

	                                case 8:
	                                	
	                                	
	                                	
	                                	 
	                                		
	                                		 boolean found = false;

	                                    logger.info("Your Installation Services : ");
	                                    for (String installation : appoin) {
	                                        if (installation.contains(FOR_CUSTOMER_LABEL + emails)) {
	                                            logger.info(installation+ "\n");
	                                            found = true;
	                                        }
	                                    }

	                                    if (!found) {
	                                        logger.info("No installation services found for the specified customer."+ "\n");
	                                    }
	                                    break;
	                                case 9:
	                                    logger.info("Enter Category : ");
	                                    String category = scc.next();
	                                    
	                              
	                                    List<product> filteredProducts = product.filterProductByCategory(category);

	                                  
	                                    if (filteredProducts.isEmpty()) {
	                                        logger.info("No products found for the specified category."+ "\n");
	                                    } else {
	                                        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                                        for (product filteredProduct : filteredProducts) {
	                                           
	                                            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId()+ "\t");
	                                            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription()+ "\t");
	                                            logger.info(PRODUCT_PRICE_LABEL + filteredProduct.getPrices());
	                                            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability()+ "\t");
	                                            logger.info(PRODUCT_CATEGORY_LABEL + filteredProduct.getCategories()+ "\t");
	                                            logger.info( "\n");
	                                
	                                            
	                                        }
	                                    }
	                                    break;
	                                case 10:
	                                    logger.info("Enter product name :");
	                                    String name = scc.next();

	                                 
	                                    List<product> filteredProductname = product.filterProductByname(name);

	                                  
	                                    if (filteredProductname.isEmpty()) {
	                                        logger.info("No products found for the specified name."+ "\n");
	                                    } else {
	                                        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                                        for (product filteredProduct : filteredProductname) {
	                                          
	                                            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId() + "\t");
	                                            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription() + "\t");
	                                            logger.info(PRODUCT_PRICE_LABEL + filteredProduct.getPrices());
	                                            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability() + "\t");
	                                            logger.info(PRODUCT_CATEGORY_LABEL + filteredProduct.getCategories() + "\t");
	                                            logger.info("\n");
	                                            
	                                        }
	                                    }
	                                    break;
	                                case 11:
	                                    logger.info(AVAILABILITY_PROMPT);
	                                    String availability = scc.next();

	                                    List<product> filteredProductAvailability = product.filterProductByAvailability(availability);

	                                    if (filteredProductAvailability.isEmpty()) {
	                                        logger.info("No products found for the specified availability."+ "\n");
	                                    } else {
	                                        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                                        for (product filteredProduct : filteredProductAvailability) {
	                                            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId() + "\t");
	                                            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription() + "\t");
	                                            logger.info(PRODUCT_PRICE_LABEL + filteredProduct.getPrices());
	                                            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability() + "\t");
	                                            logger.info(PRODUCT_CATEGORY_LABEL + filteredProduct.getCategories() + "\t");
	                                            logger.info("\n");
	                                        }
	                                    }
	                                    break;
	                            	  
	                              case 12:
	                            	   logger.info(MIN_PRICE_PROMPT );
	                            	    String min = scc.next();
	                             
	                            	    logger.info(MAX_PRICE_PROMPT);
	                            	    String max = scc.next();
	                            	 
	                            	    

	                            	    List<product> filteredProductprice= product.filterProductByprice(min,max);

	                            	    if (filteredProductprice.isEmpty()) {
	                            	        logger.info("No products found for the specified range"+ "\n");
	                            	    } else {
	                            	        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                            	        for (product filteredProduct : filteredProductprice) {
	                            	            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId() + "\t");
	                            	            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription() + "\t");
	                            	            logger.info(PRODUCT_PRICE_LABEL + filteredProduct.getPrices());
	                            	            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability() + "\t");
	                            	            logger.info(PRODUCT_CATEGORY_LABEL + filteredProduct.getCategories() + "\t");
	                            	            logger.info("\n");
	                            	        }
	                            	    }
	                            	    break;
	                            	  
	                            	  
	                            	
	                            	  
	                              case 13:
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  logger.info(MIN_PRICE_PROMPT );
	                            	    String minn = scc.next();
	                             
	                            	    logger.info(MAX_PRICE_PROMPT);
	                            	    String maxx = scc.next();
	                            	    logger.info("Enter Category:");
	                            	    String cat= scc.next();
	                            	 
	                            	 
	                            	    

	                            	    List<product> filteredProductpriceandcat= product.filterProductcatprice(cat, minn, maxx);

	                            	    if (filteredProductpriceandcat.isEmpty()) {
	                            	        logger.info(NO_PRODUCTS_FOUND_MESSAGE+ "\n");
	                            	    } else {
	                            	        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                            	        for (product filteredProduct : filteredProductpriceandcat) {
	                            	            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId() + "\t");
	                            	            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription() + "\t");
	                            	            logger.info(PRODUCT_PRICE_LABEL + filteredProduct.getPrices());
	                            	            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability() + "\t");
	                            	            logger.info(PRODUCT_CATEGORY_LABEL + filteredProduct.getCategories() + "\t");
	                            	            logger.info("\n");
	                            	        }
	                            	    }
	                            	    break;
	                            	  
	                            	  
	                            	
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  
	                            	  
	                            	 
	                              case 14:
	                            	  
	                            	  
	                             	  
	                            	  logger.info(MIN_PRICE_PROMPT );
	                            	    String minnn = scc.next();
	                             
	                            	    logger.info(MAX_PRICE_PROMPT);
	                            	    String maxxx = scc.next();
	                            	    logger.info("Enter product name:");
	                            	    String namee= scc.next();
	                            	 
	                            	 
	                            	    

	                            	    List<product> filteredProductpriceandname= product.filterProductnameprice(namee, minnn, maxxx);

	                            	    if (filteredProductpriceandname.isEmpty()) {
	                            	        logger.info(NO_PRODUCTS_FOUND_MESSAGE+ "\n");
	                            	    } else {
	                            	        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                            	        for (product filteredProduct : filteredProductpriceandname) {
	                            	            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId() + "\t");
	                            	            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription() + "\t");
	                            	            logger.info(PRODUCT_PRICE_LABEL+ filteredProduct.getPrices());
	                            	            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability() + "\t");
	                            	            logger.info(PRODUCT_CATEGORY_LABEL+ filteredProduct.getCategories() + "\t");
	                            	            logger.info("\n");
	                            	        }
	                            	    }
	                            	    break;
	                            	    
	                            	  
	                              case 15:
	                             	  logger.info(MIN_PRICE_PROMPT );
	                            	    String minnnn = scc.next();
	                             
	                            	    logger.info(MAX_PRICE_PROMPT);
	                            	    String maxxxx = scc.next();
	                            	    logger.info(AVAILABILITY_PROMPT);
	                            	    String availablity= scc.next();
	                            	 
	                            	 
	                            	    

	                            	    List<product> filteredProductpriceandavailablity= product.filterProductavaprice(availablity, minnnn, maxxxx);

	                            	    if (filteredProductpriceandavailablity.isEmpty()) {
	                            	        logger.info(NO_PRODUCTS_FOUND_MESSAGE+ "\n");
	                            	    } else {
	                            	        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                            	        for (product filteredProduct : filteredProductpriceandavailablity) {
	                            	            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId() + "\t");
	                            	            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription() + "\t");
	                            	            logger.info(PRODUCT_PRICE_LABEL + filteredProduct.getPrices());
	                            	            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability() + "\t");
	                            	            logger.info(PRODUCT_CATEGORY_LABEL + filteredProduct.getCategories() + "\t");
	                            	            logger.info("\n");
	                            	        }
	                            	    }
	                            	    break;
	                            	    
	                            	  
	                            	  
	                            	  
	                            	  
	                              case 16:
	                            	  
	                             	  logger.info("Enter name of product :");
	                            	    String proname= scc.next();
	                             
	                            	    logger.info("Enter Category:");
	                            	    String catg = scc.next();
	                            	   
	                            	    List<product> filteredProductcatgandname= product.filterProductBycatgoryandname(catg, proname);

	                            	    if (filteredProductcatgandname.isEmpty()) {
	                            	        logger.info(NO_PRODUCTS_FOUND_MESSAGE+ "\n");
	                            	    } else {
	                            	        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                            	        for (product filteredProduct :filteredProductcatgandname) {
	                            	            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId() + "\t");
	                            	            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription() + "\t");
	                            	            logger.info(PRODUCT_PRICE_LABEL + filteredProduct.getPrices());
	                            	            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability() + "\t");
	                            	            logger.info(PRODUCT_CATEGORY_LABEL + filteredProduct.getCategories() + "\t");
	                            	            logger.info("\n");
	                            	        }
	                            	    }
	                            	    break;
	                            	    
	                              case 17:
	                            	
	                            	  
	                            	  logger.info("Enter name of product :");
	                            	    String prodname= scc.next();
	                             
	                            	    logger.info(AVAILABILITY_PROMPT);
	                            	    String ava = scc.next();
	                            	   
	                            	    List<product> filteredProductavaandname= product.filterProductBynameandavay(ava, prodname);

	                            	    if (filteredProductavaandname.isEmpty()) {
	                            	        logger.info(NO_PRODUCTS_FOUND_MESSAGE+ "\n");
	                            	    } else {
	                            	        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                            	        for (product filteredProduct :filteredProductavaandname) {
	                            	            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId() + "\t");
	                            	            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription() + "\t");
	                            	            logger.info(PRODUCT_PRICE_LABEL + filteredProduct.getPrices());
	                            	            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability() + "\t");
	                            	            logger.info(PRODUCT_CATEGORY_LABEL + filteredProduct.getCategories() + "\t");
	                            	            logger.info("\n");
	                            	        }
	                            	    }
	                            	    break;
	                              case 18:
	                            	  
	                            	 
	                            	
	                            	  logger.info("Enter Category :");
	                            	    String prodcat= scc.next();
	                             
	                            	    logger.info("Enter availablity:");
	                            	    String proava = scc.next();
	                            	   
	                            	    List<product> filterProductBycatgoryandavay= product.filterProductBycatgoryandavay(prodcat, proava);

	                            	    if (filterProductBycatgoryandavay.isEmpty()) {
	                            	        logger.info(NO_PRODUCTS_FOUND_MESSAGE+ "\n");
	                            	    } else {
	                            	        logger.info(FILTERED_PRODUCTS_LABEL+ "\n");
	                            	        for (product filteredProduct :filterProductBycatgoryandavay) {
	                            	            logger.info(PRODUCT_ID_LABEL + filteredProduct.getId() + "\t");
	                            	            logger.info(PRODUCT_NAME_LABEL + filteredProduct.getDescription() + "\t");
	                            	            logger.info(PRODUCT_PRICE_LABEL + filteredProduct.getPrices());
	                            	            logger.info(PRODUCT_AVAILABILITY_LABEL + filteredProduct.getAvailability() + "\t");
	                            	            logger.info(PRODUCT_CATEGORY_LABEL + filteredProduct.getCategories() + "\t");
	                            	            logger.info("\n");
	                            	        }
	                            	    }
	                            	    break;	
	                              case 19:
	                            	  if (sch.isEmpty()) {
	  		                    	    logger.info(NO_APPOINTMENTS_MESSAGE + "\n");
	  		                    	}  else {
	                            		    for (int i = 0; i < sch.size(); i++) {
	                            		        logger.info("" + sch.get(i)+ "\n");
	                            		    }
	                            		}
	                            	  break;
	                              default:
	  	                            logger.info("Welcome "+ "\n");
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
	    
	    logger.info(String.format("%s%n", STR + "\n"));
	    logger.info("★        Welcome:            ★"+ "\n");
	    logger.info(String.format("%s%n", STR));
	    logger.info("★        Login as :          ★"+ "\n");
	    logger.info("★        1- Admin            ★"+ "\n");
	    logger.info("★        2- Installer        ★"+ "\n");
	    logger.info("★        3- Customer         ★"+ "\n");
	    logger.info("★        4- Exit             ★"+ "\n");
	    logger.info(String.format("%s%n", STR+ "\n"));
	    logger.info(OPT);
	    
	    selection = sc.nextInt();
	    
	 
	    
	    return selection;
	}
	public static int adminMenue() {
	    int selection;
	    Scanner sc = new Scanner(System.in);

	    logger.info("          Admin"+"\n");
	    logger.info("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★★ ★ ★ ★ ★ ★   "+"\n");
	    logger.info(String.format("★%s1-%sShow customer%s                         ★ %n", S1, S1, TT));
	    logger.info(String.format("★%s2-%sAdd new Customer%s                         ★ %n", S1, S1, TT));
	    logger.info(String.format("★%s3-%sDelete Customer%s                         ★ %n", S1, S1, TT));
	    logger.info(String.format("★%s4-%sUpdate Customer %s                         ★ %n", S1, S1, TT));
	      
	    
	    
	    logger.info(String.format("★%s5-%sShow Product list %s                         ★ %n", S1, S1, TT));
	    logger.info(String.format("★%s6-%sAdd Product %s                         ★ %n", S1, S1, TT));
	    logger.info(String.format("★%s7-%sDelete Product %s                         ★ %n", S1, S1, TT));
	    logger.info(String.format("★%s8-%sUpdate Product %s                         ★ %n", S1, S1, TT));
	    
	    logger.info(String.format("★%s9-%sShow Exterior Product list %s         ★ %n", S1, S1, TT));
	   logger.info(String.format("★%s10-%sAdd Exterior Product %s                 ★ %n", S1, S1, TT));
	   logger.info(String.format("★%s11-%sDelete  Exterior Product %s                 ★ %n", S1, S1, TT));
	   logger.info(String.format("★%s12-%sUpdate Exterior Product %s                 ★ %n", S1, S1, TT));
	   
	    
	    logger.info(String.format("★%s13-%sShow Interior Product list %s         ★ %n", S1, S1, TT));
	    logger.info(String.format("★%s14-%sAdd Interior Product %s                 ★ %n", S1, S1, TT));
	   logger.info(String.format("★%s15-%sDelete  Interior Product %s                 ★  %n", S1, S1, TT));
	    logger.info(String.format("★%s16-%sUpdate Interior Product %s                 ★%n", S1, S1, TT));
	    
	    
	    
	    logger.info(String.format("★%s17-%sShow Electronic Product list %s         ★ %n", S1, S1, TT));
	    logger.info(String.format("★%s18-%sAdd Electronic Product %s                 ★ %n", S1, S1, TT));
	    logger.info(String.format("★%s19-%sDelete Electronic Product %s         ★%n", S1, S1, TT));
	    logger.info(String.format("★%s20-%sUpdate Electronic Product %s         ★   %n", S1, S1, TT));
	   
	    logger.info(String.format("★%s21-%sview installation appointments %s%s ★ %n", S1, S1, TT, TT));
	    
	    logger.info(String.format("★%s22-%supdate installation request %s%s ★%n", S1, S1, TT, TT));
	    logger.info(String.format("★%s23-%sdelete installation request  %s%s ★%n", S1, S1, TT, TT));
	    
	    logger.info(String.format("★%s24-%sadd installation appointments %s%s ★%n", S1, S1, TT, TT));
	    logger.info(String.format("★%s25-%supdate installation appointments %s%s ★%n", S1, S1, TT, TT));
	    logger.info(String.format("★%s26-%sdelete installation appointments %s%s ★%n", S1, S1, TT, TT));
	   
	    logger.info(String.format("★%s27-%sview report                %s%s ★%n", S1, S1, TT, TT));
	    
	   
	    
	    
	    
	    
	    
	   
	    logger.info("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★★ ★ ★ ★ ★ ★   "+"\n");
	    logger.info(OPT);
	    selection = sc.nextInt();

	    return selection;
	}
	
	
	
	public static int customerMenu() {
	    int selection;
	    Scanner sc = new Scanner(System.in);

	    logger.info("            Customer"+"\n");
	    logger.info("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★  "+"\n");
	    
	    
       logger.info(String.format("★%-2s1-%-21s                              ★%n", "", "Browse products"));
	    logger.info(String.format("★%-2s2-%-21s                       ★%n", "", "Add product to Shopping cart"));
	    logger.info(String.format("★%-2s3-%-21s                  ★%n", "", "Delete Product from Shopping cart"));
	    logger.info(String.format("★%-2s4-%-21s                              ★%n", "", "View My Shopping cart"));
	    logger.info(String.format("★%-2s5-%-21s                              ★%n", "", "edit profile"));
	    logger.info(String.format("★%-2s6-%-21s                              ★%n", "", "My profile"));
	    logger.info(String.format("★%-2s7-%-21s  ★%n", "", "request installation services for certain product"));
	    logger.info(String.format("★%-2s8-%-21s                ★%n", "", "Print My All Installation Services "));
	    

	    logger.info(String.format("★%-2s9-%-21s                ★%n", "", "filter Products By Category\t"));
	    logger.info(String.format("★%-2s10-%-21s                ★%n", "", "filter Products By Name \t\t"));
	    logger.info(String.format("★%-2s11-%-21s                ★%n", "", "filter Products By Availability\t"));
	    logger.info(String.format("★%-2s12-%-21s                ★%n", "", "filter Products By price\t\t"));
	    
	    
	    
    logger.info(String.format("★%-2s13-%-21s          ★%n", "", "Searching Products by category and price"));
   logger.info(String.format("★%-2s14-%-21s             ★%n", "", " Searching Products by name and price"));
   logger.info(String.format("★%-2s15-%-21s      ★%n", "", " Searching Products by availablity and price"));
   logger.info(String.format("★%-2s16-%-21s          ★%n", "", "Searching Products by category and name "));
	    logger.info(String.format("★%-2s17-%-21s       ★%n", "", " Searching Products by availablity and name"));
	    
	    logger.info(String.format("★%-2s18-%-21s    ★%n", "", "Searching Products by category and availablity"));
	    logger.info(String.format("★%-2s19-%-21s       ★%n", "", "view installer availability and appointment"));
	    


	    
	    
	   
	    
	    logger.info("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★  "+"\n");
	    logger.info(OPT+"\n");

	    selection = sc.nextInt();

	    return selection;
	}

	public static int InstallerMenu() {
	    int selection;
	    Scanner sc = new Scanner(System.in);
	   
	    logger.info("            Installer"+ "\n");
	    logger.info("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ "+ "\n");
	    logger.info("★    1- My profile                 ★"+ "\n");
	    logger.info("★    2- edit profile               ★"+ "\n");
	    logger.info("★    3- View installation requests ★"+ "\n");
	    logger.info("★    4- schedule appointments      ★"+ "\n");
	    logger.info("★    5- view My appointments      ★"+ "\n");
	   
	    logger.info("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ "+ "\n");
	    logger.info(OPT+ "\n");

	    selection = sc.nextInt();
	    

	    return selection;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String createAccountCus() {
	    user ff = new user();
	    Scanner n = new Scanner(System.in);
	    logger.info("Welcome"+ "\n");
	    logger.info("You are now in the create account page."+ "\n");
	    logger.info("Enter your information"+ "\n");
	    logger.info("Phone : ");
	    ff.phone = n.next();
	    logger.info("Name : ");
	    ff.name = n.next();
	    logger.info("Address : ");
	    ff.address = n.next();
	    logger.info("Age: ");
	    ff.age = n.next();

	    logger.info("Email : ");
	    String hh = n.next();
	    ff.setemail(hh);

	    logger.info("Password : ");
	    String password = n.next();
	    
	    logger.info("Confirm password : ");
	    String confirmPassword = n.next();
	    
	    if (password.equals(confirmPassword)) {
	        ff.setPass(password);  
	    } else {
	        logger.info("Passwords do not match. Account creation failed."+ "\n");
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

