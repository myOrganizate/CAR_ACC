package carpack;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import carpack.sendEmail;

import static org.junit.Assert.assertTrue;

import javax.mail.MessagingException;

public class mailStep {
	public static boolean  flagin,flaginins;
	user a=new user();
	Installer c=new Installer();
	public static boolean  flagmail,flagmailins;
	public static boolean  flagproduct,frequest;
	



@Given("the customer with this email {string}")
public void the_customer_with_this_email(String string) {
	if(a.checkemail(string)==1 )
	{
	LoginStep.flag=true;
		
	}
else
{
	LoginStep.flag=false;

}

}
	

    


@When("the email found {string} in step")
public void the_email_found_in_step(String string) {
	 if(LoginStep.flag)
	    {
	    	flagin=true;
	    }
    
	
	
}

@Then("send message to the email {string} in this step")
public void send_message_to_the_email_in_this_step(String string)throws MessagingException {
	
	sendEmail.sendemail("Jodikmal@gmail.com", "1","user");
	   assertTrue(flagin);
    
}

@Given("sending message to the  {string} number in step")
public void sending_message_to_the_number_in_step(String string)throws MessagingException {
	
		sendEmail.sendemail("Jodikmal@gmail.com", "1","user");
		flagin=true;
    
}
@When("the customer doesnt get the calling message in email {string} in step")
public void the_customer_doesnt_get_the_calling_message_in_email_in_step(String string) {
	  if(a.checkPhone(string)==1)
		   
		   flagin=true;
	   
    
}

@Then("send message to the number {string} in this step")
public void send_message_to_the_number_in_this_step(String string) {
	  assertTrue(flagin);
	
    
}

@Given("the message sent to the customer with {string}")
public void the_message_sent_to_the_customer_with(String string) {
	flagmail=true;
    
}

@When("confirmed order")
public void confirmed_order() {
	flagproduct=true;
    
}

@Then("send message to the {string} succesd")
public void send_message_to_the_succesd(String string) {
	 assertTrue(flagmail&&flagproduct);
    
}
@Given("the installer with this email {string}")
public void the_installer_with_this_email(String string) {
	if(c.checkemail(string)==1 )
	{
	LoginStep.flagIns=true;
		
	}
else
{
	LoginStep.flagIns=false;

}

}


@When("the installer  email found {string} in step")
public void the_installer_email_found_in_step(String string) {
	 if(LoginStep.flagIns)
	    {
	    	flaginins=true;
	    }
 
}

@Then("send message toinstaller with email {string} in this step")
public void send_message_toinstaller_with_email_in_this_step(String string) throws MessagingException{
    
	sendEmail.sendemail("ayamoinn95@gmail.com", "1","installer");
	   assertTrue(flaginins);
}

@Given("sending message to the  {string} installer number in step")
public void sending_message_to_the_installer_number_in_step(String string)throws MessagingException {
	sendEmail.sendemail("ayamoinn95@gmail.com", "1","installer");
	flaginins=true;
    
}

@When("the installer doesnt get the calling message in email {string} in step")
public void the_installer_doesnt_get_the_calling_message_in_email_in_step(String string) {
	  if(c.checkPhone(string)==1)
		   
		   flaginins=true;
    
}

@Then("send message to the installer number {string} in this step")
public void send_message_to_the_installer_number_in_this_step(String string) {
	  assertTrue(flaginins);
    
}

@Given("the message sent to the installer  with {string}")
public void the_message_sent_to_the_installer_with(String string) {
	flagmailins=true;
}

@When("new request made")
public void new_request_made() {
	frequest=true;
}

@Then("send message to the installer with  {string} succesd")
public void send_message_to_the_installer_with_succesd(String string) {
	 assertTrue(flagmailins&&frequest);
}







}

