Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "APAC - World"

Scenario: Forgot userId and Paswword link
Given user is on login page
And forgot userid link should be displayed
Then forgot password link should be displayed


Scenario: Login with correct credentials
Given user is on login page
When user enters username "kdevika"
And user enters password "Welcome@22"
And user clicks on Signin button
And user gets the title of the page
Then page title should be "APAC - World"

Scenario: Login with correct credentials to eBuddy application
Given user is on login page
When user enters username "kdevika"
And user enters password "Welcome@22"
And user clicks on Signin button
And user clicks on ebuddy applcation
And user goes to next tab that is ebuddy portal
And user gets the title of the page
Then page title should be "eBuddy"

Scenario: Login with correct credentials using Keyboard Keys
Given user is on login page
When user press TAB key on keyboard
And user enters username "kdevika"
And user press TAB key on keyboard
And user enters password "Welcome@22"
And user press TAB key on keyboard
And user goes to Signin button then user press ENTER key on keyboard
And user gets the title of the page
Then page title should be "APAC - World"
