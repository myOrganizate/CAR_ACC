
Feature: Car accessories report

  Scenario: count of buying product 
   	Given that the user is not logged in
	And the email is "Jodikmal@gmail.com"
	And the password is "useruser"
    When user mack order
    Then order will added to this shopping cart
    And will store in report 
    
  Scenario: count of installation request
   	Given that the user is not logged in
	And the email is "Jodikmal@gmail.com"
	And the password is "useruser"
    When user request an installation
    Then request will send to the installer 
    And will store in report 
    
    
    
    
    