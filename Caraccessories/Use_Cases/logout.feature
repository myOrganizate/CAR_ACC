Feature: User logout
	
	
Scenario: User logs out
	Given that the user is logged in
	When the user logs out
	Then the user not logged in
	
		
Scenario: Admin logs out
	Given that the Admin is logged in
	When the Admin logs out
	Then the Admin not logged in
	
	
		
Scenario: Installer logs out
	Given that the Installer is logged in
	When the Installer logs out
	Then the Installer not logged in
	
	
	
	