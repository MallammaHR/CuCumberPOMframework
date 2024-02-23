Feature: Login Page feature

Scenario: Login page title
		Given user is on login page
		When user gets the title of the page
		Then page title  should be "Facebook - log in or sign up"
		
#Scenario: Forgot password link
#		Given user is one login page
#		Then forgotpassword link should be displayed 
		
Scenario: Login with correct credentials
		Given user is on login page
		When user enters username "your email id"
		And  user enetrs password "your pasword"
		And user clicks on login button
 	  Then user is On th HomePage