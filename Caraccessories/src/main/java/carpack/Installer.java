package carpack;


import java.util.ArrayList;
import java.util.List;

public class Installer {
	
	 String name;
	  String address;
	  


	  int phone;
    String adder;
	 int isIns=0;
	 static List<String> emailI =new ArrayList<String>();
	 static List<String> passI =new ArrayList<String>();
	 static public List<String> appo =new ArrayList<String>();
	 static String b;
	 private String emaill;
		private String passs;
		public String date;
		String detail;
		
		String time;
		String app;
	
	

		public Installer(String em, String pa) {
			// TODO Auto-generated constructor stub
			emaill=em;
			passs=pa;
			emailI.add(em);
			passI.add(pa);
		
		}
		 public Installer() {
				this.name="jodi";
				this.address="Nablus";
				this.phone=22;
				emailI.add("jodi@gmail.com");
				passI.add("123");
				emaill="jodi@gmail.com";
				passs="123";
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
		public void  appointment(String date,String time,String detail) {
			
			this.date=date;
			this.time=time;
			this.detail=detail;
			
			app="date:"+date+"time"+time+"detail"+detail;
			if(!(appo.contains(app)))
			appo.add(app);
			
		}
		public void Viewinstallationreq() {
			for(int i=0;i<appo.size();i++)
			{
				 b+=appo.get(i);
			}
			
			 System.out.println(b);
		}
		
	     

}
