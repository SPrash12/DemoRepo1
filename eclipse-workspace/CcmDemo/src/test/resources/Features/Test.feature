#Auther
#Date
#Description
Feature: Test Swag Lab smoke scenario 


Scenario: Test login with valid credentials 
	Given Open the chrome and start the application 
	When  user enters  username  and valid password 
	And  user should be able to login successfully
	And And user should abe to add product	
	Then user should be able to logout successfully 
	
	