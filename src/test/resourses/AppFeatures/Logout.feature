Feature: Logout Feature 

Background:
Given user has already logged in to application and ready to logout
|username|password|
|kdevika|Welcome@22|

Scenario: Logout of the Application
Given user is on Landing page and ready to logout
When user click on the Profile
And user click on Logout button
Then user go back to login page
When user gets the title of the page
Then page title should be "APAC - World"

Scenario: Logout from eBuddy Application
Given user is on Landing page and ready to logout
When user clicks on ebuddy applcation
And user goes to next tab that is ebuddy portal
And user gets the title of the page
Then page title should be "eBuddy"
When user click on Profile menu
And user click on the Logout button
Then user go back to login page
When user gets the title of the page
Then page title should be "APAC - World"



