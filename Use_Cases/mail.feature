Feature: Notifications


  Scenario:  if customer has an valid email 
    Given the customer with this email "Jodikmal@gmail.com"
    When the email found "Jodikmal@gmail.com" in step
    Then send message to the email "Jodikmal@gmail.com" in this step
    
  Scenario:  if customer has not add an valid email 
    Given sending message to the  "059986789" number in step
    When the customer doesnt get the calling message in email "Jodikmal@gmail.com" in step
    Then send message to the number "059986789" in this step
    
    
  Scenario: sending message to customer 
    Given the message sent to the customer with "Jodikmal@gmail.com"
    When confirmed order
    Then send message to the "Jodikmal@gmail.com" succesd
    
   
    Scenario:  if installer has an valid email 
    Given the installer with this email "ayamoinn95@gmail.com"
    When the installer  email found "ayamoinn95@gmail.com" in step
    Then send message toinstaller with email "ayamoinn95@gmail.com" in this step
    
  Scenario:  if installer has not add an valid email 
    Given sending message to the  "059857467" installer number in step
    When the installer doesnt get the calling message in email "email" in step
   Then send message to the installer number "059857467" in this step
    
    
  Scenario: sending message to installer 
    Given the message sent to the installer  with "ayamoinn95@gmail.com"
    When new request made
    Then send message to the installer with  "ayamoinn95@gmail.com" succesd
    
 
 