Feature: user login to the Car accessories 
	
Scenario: User can login
	Given that the user is not logged in
	And the email is "lujainuser@gmail.com"
	And the password is "useruser"
	Then the user login succeeds
	And the user is logged in
	
	
	Scenario: User has the wrong password or email
	Given that the user is not logged in
	And the email is "lujainuser123@gmail.com"
	And the password is "useruser"
	Then the user login fail
	And the user is not logged in
	

Scenario Outline: Admin or Installer can login
	Given that the admin or Installer is not logged in
	And the email is <email> and the pass <pass>
	Then the admin or Installer login succeeds
	And the admin or Installer is logged in
	Examples: 
      | name     | email               | pass      | status     |
      | "lujain" | "lujain@gmail.com"  | "lujain"  | admin      |
      | "aya"    | "aya@gmail.com"    | "ayaaya1" | Installer  |
   
 
	