package carpack;



import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Installer {
	
	 String name;
	  String address;
	  


	  String phone;
    String adder;
	 int isIns=0;
	 static List<String> emailI =new ArrayList<String>();
	 static List<String> passI =new ArrayList<String>();
	 static final List<String> appo =new ArrayList<String>();
	 static List<Installer> installerList = new ArrayList<Installer>();
	 static List<String> phone1 =new ArrayList<String>() ;
	 static String b;
	 private String emaill;
		private String passs;
		public String date;
		
		static String app;
		String time;
		static boolean y;
		static List<String> scheapp =new ArrayList<String>();
	    private static final String DETAIL_LABEL = " detail: ";
	    private static final String DATE_LABEL = "date: ";
	    private static final String TIME_LABEL = " time: ";
	    private static final String CUSTOMER_LABEL = " for customer: ";
	    private static final Logger logger = Logger.getLogger(Installer.class.getName());


		
	
	

		public Installer(String em, String pa) {
			
			emaill=em;
			passs=pa;
			emailI.add(em);
			passI.add(pa);
			if(!installerList.contains(this))
				installerList.add(this);
		
		}
		 public Installer() {
				this.name="aya";
				this.address="Nablus";
				this.phone="059857467";
				phone1.add("059986789");
				emailI.add("ayamoinn95@gmail.com");
				passI.add("ayaaya1");
				emaill="ayamoinn95@gmail.com";
				passs="ayaaya1";
				if(!installerList.contains(this))
					installerList.add(this);
			}
		
		public String getemail() {
			return emaill;
		}
		public void setemail(String email) {
			this.emaill = email;
			
			if (!emailI.contains(email))
				 emailI.add(email);
		}
		public String getPass() {
			return passs;
		}
		public void setPass(String pass) {
			this.passs = pass;
			if (!passI.contains(pass))
				 passI.add(pass);
		}
	    
		public int checkpass(String p) {
			for(int i=0;i<passI.size();i++)
			{
				if(p.equals(passI.get(i)))
			    return 1;
			}
			return 0;
		
			
		}
		public int checkemail(String e) {
	
			for(int i=0;i<emailI.size();i++)
			{
				if(e.equals(emailI.get(i)))
			    return 1;
			}
			return 0;
			
			
		}
		public static String appointment(String date, String time, String detail, String email) {
		
		    app = DATE_LABEL + date + TIME_LABEL + time + DETAIL_LABEL + detail  + CUSTOMER_LABEL+ email;

		    if (!appo.contains(app)) {
		        appo.add(app);
		    }
		    return app;
		}
		
		
		public static String updateappointment(String email, String olddate, String oldtime, String olddetail, String newdate, String newtime, String newdetail) {
		    String oldAppointment = DATE_LABEL  + olddate + TIME_LABEL + oldtime + DETAIL_LABEL + olddetail  + CUSTOMER_LABEL+ email;
		    String newAppointment = DATE_LABEL + newdate + TIME_LABEL + newtime + DETAIL_LABEL + newdetail + CUSTOMER_LABEL + email;

		    for (int i = 0; i < appo.size(); i++) {
		        String appointment = appo.get(i);
		        if (appointment.equals(oldAppointment)) {
		            appo.set(i, newAppointment);
		            return newAppointment;
		        }
		    }
		    return null;
		}

		
		
		public static boolean deleteappointment(String email, String date, String time, String detail) {
		    String appointmentToDelete = DATE_LABEL  + date + TIME_LABEL + time + DETAIL_LABEL + detail  + CUSTOMER_LABEL + email;
		    
		    if (appo.contains(appointmentToDelete)) {
		        appo.remove(appointmentToDelete);
		        return true; 
		    }
		    
		    return false; 
		}
		
		

		public static void Viewinstallationreq() {
		    if (appo.isEmpty()) {
		        System.out.println("There are no installation requests.");
		    } else {
		        for (String request : appo) {
		            System.out.println(request);
		        }
		    }
		}
		
		
		
		public  void viewInstallationRequestsByEmail(String email) {
		    boolean found = false;
		    for (String installation : appo) {
		        if (installation.contains("for customer: " + email)) {
		        	 logger.info(installation);
		            found = true;
		        }
		    }
		    if (!found) {
		    	logger.info("No installation requests found for customer with email: " + email);
		    }
		}
		
        
		 public static boolean printProfile(String email) {
			 
			 for(int i=0;i<installerList.size();i++) {
				 
				 
				
				 if (installerList.get(i).getemail().equals(email)) {
					    String profileInfo = String.format("Installer Profile:%n" +
					            "Email: %s%n" +
					            "Password: %s%n" +
					            "Phone: %s%n" +
					            "Name: %s%n" +
					            "Address: %s%n",
					            installerList.get(i).getemail(),
					            installerList.get(i).getPass(),
					            installerList.get(i).phone,
					            installerList.get(i).name,
					            installerList.get(i).address);

					    if (logger.isLoggable(Level.INFO)) {
					        logger.info(profileInfo);
					    }
			
			    y= true;
			    
				    }
				    else {
				    	y= false;
				    }
				    
				 
			}
		  
			 return y;   

		 }
		
		 public static void editProfile(String email, String newPassword, String newPhone, String newName, String newAddress) {
			    for (Installer installer : installerList) {
			        if (installer.getemail().equals(email)) {
			            installer.setemail(email);
			            installer.setPass(newPassword);
			            installer.setPhone(newPhone);
			            installer.setName(newName);
			            installer.setAddress(newAddress);
			        }
			    }
			}
		private void setAddress(String newAddress) {
			
			this.address = newAddress;
			
		}
		private void setName(String newName) {
			
			this.name=newName;
			
		}
		private void setPhone(String newPhone) {
			
			this.phone=newPhone;
			
		}
		public static void scheduleapp(String date, String time) {
		    String s = date + "\t" + time;

		    
			
		    if (!scheapp.contains(s)) {
		        scheapp.add(s);
		        logger.info("Appointment scheduled successfully.");
		    } else {
		    	logger.info("Appointment already exists at this date and time.");
		    }
		}
		public static void deleteappo(String date, String time) {
		    String s = date + "\t" + time;

		   
		    if (scheapp.contains(s)) {
		        scheapp.remove(s);
		        logger.info("Appointment deleted successfully.");
		    } else {
		    	logger.info("Appointment not found at this date and time.");
		    }
		}

		public static void updateappo(String dateOld, String timeOld, String dateNew, String timeNew) {
		    String sOld = dateOld + "\t" + timeOld;
		    String sNew = dateNew + "\t" + timeNew;

		   
		    if (scheapp.contains(sOld)) {
		        scheapp.remove(sOld);
		        scheapp.add(sNew);
		        logger.info("Appointment updated successfully.");
		    } else {
		    	logger.info("Appointment not found at the old date and time.");
		    }
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
