Feature: Roles apply by Admin,Customer,Installer

Scenario: Admin can add products
Given the admin is login
And the email is "lujain@gmail.com"
And the password is "lujain"
When the admin can add product id "1", name "redlight", price "20$", availability "yes", Categorie "Interior", image "redlight.jpg"
Then admin can add product

Scenario: Admin can update products
Given the admin is login
And the email is "lujain@gmail.com"
And the password is "lujain"
When the admin can update product id "1", name "redlight", price "30$", availability "yes", Categorie "Interior", image "redlight.jpg"
Then admin can update product

Scenario: Admin can delete products
Given the admin is login
And the email is "lujain@gmail.com"
And the password is "lujain"
When the admin can delete product id "1"
Then admin can delete product
    
    
    
  Scenario: Admin can add Interior product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin adds an Interior product with id "4", name "yellolight", price "30$", availability "yes", category "Interior", and image "yellolight.jpeg"
    Then the admin successfully adds the Interior product

  Scenario: Admin can add Exterior product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin adds an Exterior product with id "5", name "orangelight", price "30$", availability "yes", category "Exterior", and image "orangelight.jpg"
    Then the admin successfully adds the Exterior product

  Scenario: Admin can add Electronic product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin adds an Electronic product with id "6", name "bluelight", price "30$", availability "yes", category "Electronic", and image "bluelight"
    Then the admin successfully adds the Electronic product





    
    
  Scenario: Admin can Add Customer
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin creates a Customer with email "jodi@gmail.com", password "123", phone "059865432", name "jodi", address "nablus", and age "20"
    Then the admin successfully creates the Customer

  Scenario: Admin can update Customer
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin updates the Customer with email "jodi@gmail.com" by changing phone to "059865432" ,name to "jodikammal", address to "nablus", and age to "20"
    Then the admin successfully updates the Customer

  Scenario: Admin can delete Customer
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin deletes the Customer with email "jodi@gmail.com"
    Then the admin successfully deletes the Customer

  Scenario: Customer can Browse products
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the Customer browses products
    Then the Customer successfully browses products

  Scenario: Customer can make purchases
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the Customer  with email "Jodikmal@gmail.com" makes a purchase for product with id "1"
    Then the Customer successfully makes a purchase

  Scenario: Customer can view orders
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the Customer  with email "Jodikmal@gmail.com" can views orders
    Then the Customer successfully views orders

  Scenario: Installer can View installation requests
    Given the Installer is login with email "ayamoinn95@gmail.com" and password "ayaaya1"
    When the Installer views installation requests
    Then the Installer successfully views installation requests

  Scenario: Installer can schedule appointments
    Given the Installer is login with email "ayamoinn95@gmail.com" and password "ayaaya1"
    When the Installer schedules an appointment with date "2-2-2023", time "2:00" 
    Then the Installer successfully schedules an appointment
    
 
  Scenario: admin can update appointments
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin  update an appointment for customer with email "Jodikmal@gmail.com"  olddate "2-2-2023", oldtime "2:00" newdate "4-2-2023", newtime "4:00" 
    Then the admin  successfully update an appointment
    
    
    
      Scenario: admin can delete appointments
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin  delete  an appointment for customer with email "Jodikmal@gmail.com" with date "4-2-2023", time "4:00" 
    Then the admin  successfully delete  an appointment
    
  
    Scenario: Installer can print his profile 
    Given the Installer is login with email "ayamoinn95@gmail.com" and password "ayaaya1"
     Then  the Installer can see his profile 
    
   
       Scenario: Installer can edit his Profile
    Given the Installer is login with email "ayamoinn95@gmail.com" and password "ayaaya1"
    When the Installer  edit his Profile with email  "ayamoinn95@gmail.com" newPassword "123" newPhone "059484746" newName "Aya" newAddress "Nablus"
    Then  the Installer can edit his Profile
    
   
     Scenario: Customer can searchProduct with id 
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the Customer searchProduct with id "10"
    Then the Customer successfully searchProduct
    
   
     Scenario: admin can printProduct with id 
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin printProduct with id "10"
    Then the admin successfully printProduct
  
    
 
   
     Scenario: admin can print Exterior Product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin print Exterior Product
    Then the admin successfully print Exterior Product
    
    
   
    Scenario: admin can print Interior Product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin print Interior Product
    Then the admin successfully print Interior Product
   
   
     Scenario: admin can print Electronic Product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin print Electronic Product
    Then the admin successfully print Electronic Product
    
  
    Scenario: Customer can vieworder 
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the Customer can vieworder with his email "Jodikmal@gmail.com"
    Then the Customer successfully vieworder
    
    
    
      Scenario: Customer can editProfile 
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the Customer can editProfile with  email "Jodikmal@gmail.com" newPassword "123" newPhone "059584846" newName "jodi" newAddress "nablus" newAge "23"
    Then the Customer successfully editProfile
    
    

    
        Scenario: Customer can printProfile 
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the Customer can printProfile with  email "Jodikmal@gmail.com"
    Then the Customer successfully printProfile
    
   