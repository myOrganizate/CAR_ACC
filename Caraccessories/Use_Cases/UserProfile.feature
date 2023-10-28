Feature: User Profile


View order history and installation requests
    
  Scenario: Customers can edit their profiles 
   Given the Customer is login with email "lujainuser@gmail.com" and password "useruser"
    When the Customer  with email "lujainuser@gmail.com" can edit his  profile newpass"1233",newPhone"059865432",newName"jodi",newAddress"nablus",newAge"20"
    Then Customers can edit their profiles 
    
    
    
    

     Scenario: Customers can View order history
   Given the Customer is login with email "lujainuser@gmail.com" and password "useruser"
    When the Customer  with email "lujainuser@gmail.com" can View order history
    Then Customers can View order history
    
    
       Scenario: Customers can View  installation requests
   Given the Customer is login with email "lujainuser@gmail.com" and password "useruser"
    When the Customer  with email "lujainuser@gmail.com" can View  installation requests
    Then Customers can View  installation requests
    
    