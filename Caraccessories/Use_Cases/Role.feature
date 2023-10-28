Feature: Roles apply by Admin,Customer,Installer

Scenario: Admin can add products
Given the admin is login
And the email is "lujain@gmail.com"
And the password is "lujain"
When the admin can add product id "1", name "redlight", price "20$", availability "In Stock", Categorie "Interior", image "redlight.jpg"
Then admin can add product

Scenario: Admin can update products
Given the admin is login
And the email is "lujain@gmail.com"
And the password is "lujain"
When the admin can update product id "1", name "redlight", price "30$", availability "In Stock", Categorie "Interior", image "redlight.jpg"
Then admin can update product

Scenario: Admin can delete products
Given the admin is login
And the email is "lujain@gmail.com"
And the password is "lujain"
When the admin can delete product id "1"
Then admin can delete product
    
    
    
  Scenario: Admin can add Interior product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin adds an Interior product with id "4", name "yellolight", price "30$", availability "In Stock", category "Interior", and image "yellolight.jpeg"
    Then the admin successfully adds the Interior product

  Scenario: Admin can add Exterior product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin adds an Exterior product with id "5", name "orangelight", price "30$", availability "In Stock", category "Exterior", and image "orangelight.jpg"
    Then the admin successfully adds the Exterior product

  Scenario: Admin can add Electronic product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin adds an Electronic product with id "6", name "bluelight", price "30$", availability "In Stock", category "Electronic", and image "bluelight"
    Then the admin successfully adds the Electronic product





    
    
  Scenario: Admin can Add Customer
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin creates a Customer with email "jodi@gmail.com", password "123", phone "059865432", name "jodi", address "nablus", and age "20"
    Then the admin successfully creates the Customer

  Scenario: Admin can update Customer
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin updates the Customer with phone "059865432" by changing name to "jodikammal", address to "nablus", and age to "20"
    Then the admin successfully updates the Customer

  Scenario: Admin can delete Customer
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin deletes the Customer with phone "059865432"
    Then the admin successfully deletes the Customer

  Scenario: Customer can Browse products
    Given the Customer is login with email "lujainuser@gmail.com" and password "useruser"
    When the Customer browses products
    Then the Customer successfully browses products

  Scenario: Customer can make purchases
    Given the Customer is login with email "lujainuser@gmail.com" and password "useruser"
    When the Customer  with email "lujainuser@gmail.com" makes a purchase for product with id "1"
    Then the Customer successfully makes a purchase

  Scenario: Customer can view orders
    Given the Customer is login with email "lujainuser@gmail.com" and password "useruser"
    When the Customer  with email "lujainuser@gmail.com" can views orders
    Then the Customer successfully views orders

  Scenario: Installer can View installation requests
    Given the Installer is login with email "aya@gmail.com" and password "ayaaya1"
    When the Installer views installation requests
    Then the Installer successfully views installation requests

  Scenario: Installer can schedule appointments
    Given the Installer is login with email "aya@gmail.com" and password "ayaaya1"
    When the Installer schedules an appointment for Customer  with email "lujainuser@gmail.com"  date "2-2-2023", time "2:00", and product to install "redlight"
    Then the Installer successfully schedules an appointment

  
    
    
    
   