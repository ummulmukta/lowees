@log
Feature: Amazon Login feature Test 
Scenario: User be able to signin with valid credentials 
	Given Go to home page 
	And   Click on signin button 
	And   Enter Username 
	And enter password 
	And   Click on Submit button 
	Then  login should  be successfull 
	
