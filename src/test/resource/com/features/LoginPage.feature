Feature: Login Page feature

Scenario: Login page title
		Given user is on login page
		When user gets the title of the page
		Then page title  should be "Amazon Sign In"
		
Scenario: Forgot password link
		Given user is one login page
		Then forgotpassword link should be displayed 
		
Scenario: Login with correct credentials
		Given user is on login page
		When user enters username "mallusreddy@gmail.com"
		And  user enetrs password "MALLUmani1987!"
		And user clicks on login button
 	Then user gets title of the account webpage
	And page title should be "Amazon.jobs"
	
#Feature: Login page feature
#
#Scenario: Login page title
#Given user is on login page
#When user gets the title of the page
#Then page title should be "Facebook - log in or sign up"
#
#Scenario: Forgot Password link
#Given user is on login page
#Then forgot your password link should be displayed
#
#Scenario: Login with correct credentials
#Given user is on login page
#When user enters username "mallusreddy@gmail.com"
#And user enters password "mallumani"
#And user clicks on Login button
#Then user gets the title of the page
#And page title should be "My account - My Store"