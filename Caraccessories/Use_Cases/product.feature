
    
   Feature: Product Search and Filtering
   
   
   Scenario: Products organizing and Detailing
   Given the admin is login
   And the email is "lujain@gmail.com"
   And the password is "lujain"
   When the admin can add product with details id "9", name "redlight", price "20$", availability "yes", Categorie "Interior", image "redlight.jpg"
   Then admin can add this product
   
   
   
   
  Scenario: Searching Products by category and price
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user selects the "Interior" category with a price range between "20" and "50"
    Then the user should see a list of products matching the criteria
    
    
  Scenario: Searching Products by name and price
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user enters "bluelight" product in the search bar with a price range between "20" and "50"
    Then the user should see a list of products matching this 


 Scenario: Searching Products by availablity and price
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user selects the availablity "yes" with price range between "20" and "50"
    Then the user should see a list of products matching 
    
    
    
     Scenario: Searching Products by availablity and name
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user selects the availablity "yes" with name "redlight"
    Then the user should see a list of products matching those condition
    
    

   Scenario: Searching Products by category and name
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user selects the category "Interior" with name "redlight"
    Then the user should see a list of products matching condition
    
    
     Scenario: Searching Products by category and availablity
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user selects the category "Interior" with availablity "yes"
    Then  user should see a list of products matching condition
    


 Scenario: Filtering by price
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user selects the price range between "20" and "50"
    Then the user should see a list of products in this range 
    

 Scenario: Filtering by Name
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user selects the name "bluelight"
    Then the user should see a list of this products 


  Scenario: Filtering by Availability
    Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user selects the availablity "yes"
    Then the user should see a list of  products that are currently available
    

  Scenario Outline: Filtering Products by Category
  Given the Customer is login with email "Jodikmal@gmail.com" and password "useruser"
    When the user selects the "<Category>" product
    Then the user should see a list of <Category> products

    Examples:
      | Category   |
      | Interior   |
      | Exterior   |
      | Electronic |
    
    
   

    
    
    
    
    

    
    
    
    
    

 
 