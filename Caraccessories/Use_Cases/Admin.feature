Feature: Admin Dashboard



    
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
    
    
    
    Scenario: Admin can update Interior product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin update an Interior product who has id "4", newname "yellolight", newprice "35$", newavailability "In Stock", newcategory "Interior", and newimage "yellolight.jpeg"
    Then the admin successfully update the Interior product

  Scenario: Admin can update Exterior product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin update an Exterior product who has id "5", newname "orangelight", newprice "35$", newavailability "In Stock", newcategory "Exterior", and inewmage "orangelight.jpg"
    Then the admin successfully update the Exterior product

  Scenario: Admin can update Electronic product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin update an Electronic product who has id "6", newname "bluelight", newprice "35$", newavailability "In Stock", newcategory "Electronic", and newimage "bluelight"
    Then the admin successfully update the Electronic product
    
    
     Scenario: Admin can delete Interior product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin delete an Interior product with id "4"
    Then the admin successfully delete the Interior product
    
     Scenario: Admin can delete Exterior product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin delete an Exterior product with id "5"
    Then the admin successfully delete the Exterior product
    
    Scenario: Admin can delete Electronic product
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When the admin delete an Electronic product with id "6"
    Then the admin successfully delete the Electronic product
    
    
    
    
    
    
    
    
    
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

 
  Scenario: Admin can View Customer accounts
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When Admin can View Customer accounts
    Then  can View Customer account
    
    
    
       Scenario: Admin can Schedule  appointment
     Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When  Admin can Schedule  appointment for Customer  with email "lujainuser@gmail.com"  date "4-4-2023", time "2:00", and product to install "bluelight"
    Then Admin can Schedule  appointment successfully
    
    
    
       Scenario: Admin can view installation appointments
    Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When  can view installation appointment
    Then Admin can view installation appointments
    
    
    
    
     Scenario: Admin can update  appointment
     Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When  Admin can update  appointment for Customer  with email "lujainuser@gmail.com"  date "4-4-2023", time "3:00", and product to install "bluelight"
    Then Admin can update appointment successfully
    
    
    
     Scenario: Admin can delete  appointment
     Given the admin is login with email "lujain@gmail.com" and password "lujain"
    When  Admin can delete  appointment for Customer  with email "lujainuser@gmail.com"  date "4-4-2023", time "2:00", and product to install "bluelight"
    Then Admin can delete appointment successfully
    
    
    
    
    
    
    
    
    