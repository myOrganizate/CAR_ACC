Feature: Roles apply by Admin,Customer,Installer
 

  
  Scenario: Admin role
    Given the admin is login 
    And  the email is "lujain@gmail.com"
    And the password is "lujain"
    When admin can Manage products, categories, and  Manage user accounts
    Then  can Manage products, categories, and user accounts
    

  
   Scenario: Customer role
    Given the user is login 
    And  the email is "lujainuser@gmail.com"
    And the password is "useruser"
    When Customer can Browse products,make purchases, and view orders
    Then Browse products, make purchases, and view orders
    
    
    Scenario:  Installer  role
    Given the  Installer  is login 
    And  the email is "aya@gmail.com"
    And the password is "ayaaya1"
    When Installer  View installation requests and schedule appointments
    Then View installation requests and schedule appointments
    
    
    
 