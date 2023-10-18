
Feature: Product Catalog
  
  
 Scenario: Products organized into categorie
    Given  Product  available
    Then  Products organized into categories ( "Interior", "Exterior","Electronics")
    
    
    
    
   Scenario: Products not organized into categorie
    Given  Product  not available
    Then  Products cant organized into categories ( "Interior", "Exterior","Electronics")
  
  




  
Scenario: Browse and Search for Products
  Given  Product  available in our stock 
  And Product have categorie ( "Interior", "Exterior","Electronics")
  When  Search for Product
  Then I should see a product details("description","image","price" ,"availability" )
    And I should be able to filter the product by("price","Brand","Customer Rating")
    
    
    
  