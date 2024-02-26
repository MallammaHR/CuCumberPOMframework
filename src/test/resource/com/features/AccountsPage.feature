Feature: Account Page feature

Background:
		Given user has already logged in to application
		| username | password |
		| mallusreddy@gmail.com | Manager123 |


Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "My account - My Store"

Scenario: Accounts section
		Given the user is on the Accounts page
		Then the user gets the accounts section
		| order history and details |
		| Tasks |
		| Reports |
		| Users |
		And the accounts section should contain 3 
