package carpack;


import java.util.ArrayList;
import java.util.List;

public class Installer {
	
	 String name;
	  String address;
	  


	  String phone;
    String adder;
	 int isIns=0;
	 static List<String> emailI =new ArrayList<String>();
	 static List<String> passI =new ArrayList<String>();
	 static public List<String> appo =new ArrayList<String>();
	 static List<Installer>Instu = new ArrayList<Installer>();
	 static List<String> phone1 =new ArrayList<String>() ;
	 static String b;
	 private String emaill;
		private String passs;
		public String date;
		String detail;
		static String app;
		String time;
		static boolean y;
		static List<String> scheapp =new ArrayList<String>();
		
	
	

		public Installer(String em, String pa) {
			// TODO Auto-generated constructor stub
			emaill=em;
			passs=pa;
			emailI.add(em);
			passI.add(pa);
			if(!Instu.contains(this))
				Instu.add(this);
		
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
				if(!Instu.contains(this))
					Instu.add(this);
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
		  //  this.date = date;
		   // this.time = time;
		    //this.detail = detail;
		    app = "date: " + date + " time: " + time + " detail: " + detail + " for customer: " + email;

		    if (!appo.contains(app)) {
		        appo.add(app);
		    }
		    return app;
		}
		
		
		public static String updateappointment(String email, String olddate, String oldtime, String olddetail, String newdate, String newtime, String newdetail) {
		    // Construct the old and new appointment strings
		    String oldAppointment = "date: " + olddate + " time: " + oldtime + " detail: " + olddetail + " for customer: " + email;
		    String newAppointment = "date: " + newdate + " time: " + newtime + " detail: " + newdetail + " for customer: " + email;

		    // Iterate through the 'appo' list
		    for (int i = 0; i < appo.size(); i++) {
		        String appointment = appo.get(i);
		        if (appointment.equals(oldAppointment)) {
		            // Replace the old appointment with the new appointment
		            appo.set(i, newAppointment);
		            return newAppointment;
		        }
		    }
		    // Return null if no matching appointment is found
		    return null;
		}

		
		
		public static boolean deleteappointment(String email, String date, String time, String detail) {
		    String appointmentToDelete = "date: " + date + " time: " + time + " detail: " + detail + " for customer: " + email;
		    
		    if (appo.contains(appointmentToDelete)) {
		        appo.remove(appointmentToDelete);
		        return true; // Appointment deleted successfully
		    }
		    
		    return false; // No matching appointment found for deletion
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
		
		
		
		public static void Viewinstallationreq(String email) {
		    boolean found = false;
		    for (String installation : appo) {
		        if (installation.contains("for customer: " + email)) {
		            System.out.println(installation);
		            found = true;
		        }
		    }
		    if (!found) {
		        System.out.println("No installation requests found for customer with email: " + email);
		    }
		}
		
        
		 public static boolean printProfile(String email) {
			 
			 for(int i=0;i<Instu.size();i++) {
				 
				 
				
				    if (Instu.get(i).getemail().equals(email)) {
				    	
			    System.out.println("Installer Profile:");
			    System.out.println("Email: " + email);
			    System.out.println("Password: " + Instu.get(i).passs);
			    System.out.println("Phone: " + Instu.get(i).phone);
			    System.out.println("Name: " + Instu.get(i).name);
			    System.out.println("Address: " + Instu.get(i).address);
			
			    y= true;
			    
				    }
				    else {
				    	y= false;
				    }
				    
				 
			}
		  
			 return y;   

		 }
		
		 public static void editProfile(String email, String newPassword, String newPhone, String newName, String newAddress) {
			    // Find the Installer object with the matching email
			    for (Installer installer : Instu) {
			        if (installer.getemail().equals(email)) {
			            // Update the Installer's profile information with the new data
			            installer.setemail(email);
			            installer.setPass(newPassword);
			            installer.setPhone(newPhone);
			            installer.setName(newName);
			            installer.setAddress(newAddress);
			        }
			    }
			}
		private void setAddress(String newAddress) {
			// TODO Auto-generated method stub
			this.address = newAddress;
			
		}
		private void setName(String newName) {
			// TODO Auto-generated method stub
			this.name=newName;
			
		}
		private void setPhone(String newPhone) {
			// TODO Auto-generated method stub
			this.phone=newPhone;
			
		}
		public static void scheduleapp(String date, String time) {
		    String s = date + "\t" + time;

		    
			// Check if s is already in scheapp
		    if (!scheapp.contains(s)) {
		        scheapp.add(s);
		        System.out.println("Appointment scheduled successfully.");
		    } else {
		        System.out.println("Appointment already exists at this date and time.");
		    }
		}
		public static void deleteappo(String date, String time) {
		    String s = date + "\t" + time;

		    // Check if s is in scheapp
		    if (scheapp.contains(s)) {
		        scheapp.remove(s);
		        System.out.println("Appointment deleted successfully.");
		    } else {
		        System.out.println("Appointment not found at this date and time.");
		    }
		}

		public static void updateappo(String dateOld, String timeOld, String dateNew, String timeNew) {
		    String sOld = dateOld + "\t" + timeOld;
		    String sNew = dateNew + "\t" + timeNew;

		    // Check if sOld is in scheapp
		    if (scheapp.contains(sOld)) {
		        // Remove the old appointment and add the updated one
		        scheapp.remove(sOld);
		        scheapp.add(sNew);
		        System.out.println("Appointment updated successfully.");
		    } else {
		        System.out.println("Appointment not found at the old date and time.");
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
