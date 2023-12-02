Feature: User Profile



    
  Scenario: Customers can edit their profiles 
   Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
   When the Customer with email "Jodikmal@gmail.com" can edit his profile newpass"1233",newPhone"059986789",newName"lujain",newAddress"nablus",newAge"20"
    Then Customers can edit their profiles 
    
  
 
			
    

     Scenario: Customers can View order history
   Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the Customer  with email "Jodikmal@gmail.com" can View order history
    Then Customers can View order history
    
    
       Scenario: Customers can View  installation requests
   Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the Customer  with email "Jodikmal@gmail.com" can View  installation requests
    Then Customers can View  installation requests
    
    