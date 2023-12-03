package carpack;
import java.util.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Authenticator;

public class sendEmail {
	
	
		
		 static List<String> pass1 =new ArrayList<String>();
		 
		 private sendEmail() {
			 pass1.add("vagz bykz qasf ebfw");
			}
		 public static void sendemail(String recepient, String random, String recipientType) throws MessagingException {
			   

			 String ayya="\t"+"\t"+"\t"+"\t"+"\t"+"\t";
		    final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

		    Properties props = System.getProperties();
		    
		    props.setProperty("mail.smtp.host", "smtp.gmail.com");
		    props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		    props.setProperty("mail.smtp.socketFactory.fallback", "false");
		    props.setProperty("mail.smtp.port", "888");
		    props.setProperty("mail.smtp.socketFactory.port", "465");
		    props.put("mail.smtp.auth", "true");
		    props.put("mail.debug", "true");
		    props.put("mail.store.protocol", "pop3");
		    props.put("mail.transport.protocol", "smtp");
		    props.put("mail.smtp.starttls.enable","true"); 
		   
		    final String username ="lujain.darwazeh123@gmail.com" ;
		    pass1.add("vagz bykz qasf ebfw");
		    final String password =pass1.get(0);
		   
		      Session session = Session.getDefaultInstance(props, 
		                          new Authenticator(){
		                             @Override
		                             protected PasswordAuthentication getPasswordAuthentication() {
		                                return new PasswordAuthentication(username, password);
		                             }});

		   
		      Message msg = new MimeMessage(session);
		      Message msg1 = new MimeMessage(session);
		      

		
		      msg.setFrom(new InternetAddress(username));
		      msg.setRecipients(Message.RecipientType.TO, 
		       InternetAddress.parse( recepient ,false));
		      
		      
		      msg1.setFrom(new InternetAddress(username));
		      msg1.setRecipients(Message.RecipientType.TO, 
		       InternetAddress.parse( recepient ,false));
		      
		      
		      if ("user".equalsIgnoreCase(recipientType)) {
			        msg.setSubject("Welcome to Car accessories company");

			        msg.setText("Dear user, your order is confirmed.\""
			                + ayya + " Thank you for dealing with our Car accessories company.:\n" + random
			        );
			        msg.setSentDate(new Date());
			        Transport.send(msg);
			    } else if ("installer".equalsIgnoreCase(recipientType)) {
			        msg1.setText("Dear installer,There's a new installation request"
			                + ayya + ""
			                + ayya + " please check them.:" + random
			        );
			        msg1.setSentDate(new Date());
			        Transport.send(msg1);
			    } else {
			        System.out.println("Invalid recipient type.");
			    }
		      
		      

		   }

		       
			
			
	     
	   }
	       
		
		
		




