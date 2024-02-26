Feature: Login Page feature

Scenario: Login page title
		Given user is on login page
		When user gets the title of the page
		Then page title  should be "actiTIME - Login"
		
Scenario: Forgot password link
		Given user is one login page
		Then forgotpassword link should be displayed 
		
Scenario: Login with correct credentials
		Given user is on login page
		When user enters username "mallusreddy@gmail.com"
		And  user enetrs password "MALLUmani1987!"
		And Click on Robot click action
		And user clicks on login button
 	  Then user gets the Title of the Home page
 	  And Page Title should be "actiTIME - Enter Time-Track"
 	  