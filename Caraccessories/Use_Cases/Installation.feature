

Feature: Installation Requests

    Scenario: Customers request valid installation appointment
  
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    And Customers request valid installation appointment
    When the Customer with email "Jodikmal@gmail.com"  enter installation details with date "2-2-2020"  time "2:00"  product "bluelight"
    Then Customers can request installation
    
    
    
     Scenario: Customers request unvalid installation appointment
  
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    And Customers request unvalid installation appointment
    When the Customer with email "Jodikmal@gmail.com"  enter installation details with date "2-2-2020"  time "10:00"  product "bluelight"
    Then Customers cant request installation
    
    
    
      Scenario: Customers can view Installer availability and appointment 
   
      Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
      Then Customers can view Installer availability and appointment 
    
    
    
     
    
    