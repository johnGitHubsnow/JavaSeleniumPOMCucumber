Feature: Home Page Features

Background: 
Given user has already logged in to eBuddy application
|username|password|
|kdevika|Welcome@22|

Scenario: eBuddy application Home Page
Given user is on eBuddy application Home Page
When user gets the title of the page
Then page title should be "eBuddy" 

Scenario: Check APAC Yammer link on ebuddy application
Given user is on eBuddy application Home Page
When user clicks on the APAC Yammer link
And user switch to next tab and there is APAC Yammer login page
And user enter email "vamsidhar.reddy-k@capgemini.com"
And user clicks on next button
And user clicks on contiue button
And user gets the title of the page
Then page title should be "Yammer"

Scenario: Check Adam link on ebuddy application
Given user is on eBuddy application Home Page
When user clicks on the Adam link
And user switch to next tab and there is Adam IT help home page
And user gets the title of the page
Then page title should be "Group IT | IT Help"

Scenario: Check Useful Link links on ebuddy application
Given user is on eBuddy application Home Page
When user clicks on the Useful Link
And user switch to the next tab and there is Talent Capgemini home page
And user gets the title of the page
Then page title should be "India Intranet Homepage | Talent Capgemini"

Scenario: Check Admin link on ebuddy application
Given user is on eBuddy application Home Page
When user clicks on the Admin link
Then user should get details of Admin and page header name should be "Welcome Admin"
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"





Scenario: Check Key Contacts details
Given user is on eBuddy application Home Page
When user clicks on Key Contacts button
And user takes screenshot of Key Contacts details for evidence
Then key contacts page, header name should be "Key Contacts" 
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"

Scenario: Check Help Desk and Data Expence
Given user is on eBuddy application Home Page
When user clicks on Help Desk and Data Expence button
And user takes screenshot of Help Dest and Data Expence details for evidence
And user clicks on Service Central link under Steps to Request IT Services frame
And user switch to next tab that is ServieCentral home page
And user gets the title of the page
Then page title should be "Home Page - ServiceCentral"
When user switch back to the ebuddy home page
And user clicks on Service Central link under Steps to Report IT issue frame
And user switch to next tab that is ServieCentral home page
And user gets the title of the page
Then page title should be "Home Page - ServiceCentral"
When user switch back to the ebuddy home page
And user clicks on Click here button under IT HelpDesk Contact Details frame
And user switch to next tab that is ServieCentral home page
And user gets the title of the page
Then page title should be "Home Page - ServiceCentral"
When user switch back to the ebuddy home page
Then helpdesk and data expense page, header name should be "HelpDesk and Data Expense" 
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"

Scenario: Check Update Details 
Given user is on eBuddy application Home Page
When user clicks on Update Details button
And user takes screenshot of Update details for evidence
And user clicks on Click here button under How to create MobilePass frame
And user switch to next tab that is Mobile Pass user guide document
And user gets the title of the page
Then page title should be "MobilePASS Enrollment User Guide Mobile PASS"
When user switch back to the ebuddy home page
And user clicks on Click here button under Skills Update frame
And user switch to next tab that is Job Feed
And user gets the title of the page
Then page title should be "JobFeed"
When user switch back to the ebuddy home page
And user clicks on Click here button under CV Update frame
And user switch to next tab that is Job Feed
And user gets the title of the page
Then page title should be "JobFeed"
When user switch back to the ebuddy home page
And user clicks on Click here button under Peronal Details frame
And user switch to next tab that is SAP NetWeaver Portal
And user gets the title of the page
Then page title should be "SAP"
When user switch back to the ebuddy home page
And user clicks on Click here button under Bank Details frame
And user switch to next tab that is SAP NetWeaver Portal
And user gets the title of the page
Then page title should be "SAP"
When user switch back to the ebuddy home page
Then update details page, header name should be "Update Details" 
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"

Scenario: Check HR Info details
Given user is on eBuddy application Home Page
When user clicks on HR Info button
And user takes screenshot of HR info details for evidence
And user clicks on Click here to know more, link
And user switch to next tab that is HR Policies 
And user gets the title of the page
Then page title should be "HR Policies | Talent Capgemini"
When user switch back to the ebuddy home page
Then hr info page, header name should be "HR Info" 
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"

Scenario: Check APAC Platform Leadership details
Given user is on eBuddy application Home Page
When user clicks on APAC Platform Leadership button
And user takes screenshot of APAC leaders for evidence
Then apac platform leadership page, header name should be "APAC Platform Leadership"
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"

Scenario: Check Talent Page details
Given user is on eBuddy application Home Page
When user clicks on Talent Page button
And user takes screenshot of Talent page details for evidence
And user click on Click here button 
And user switch to next tab that is Talent page
And user gets the title of the page
Then page title should be "India Intranet Homepage | Talent Capgemini"
When user switch back to the ebuddy home page
Then talent page, header name should be "Talent Page" 
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"

Scenario: Check Learning Platform details
Given user is on eBuddy application Home Page
When user clicks on Learning Platforms button
And user clicks on my learning image with hyperlink
And user switch to next tab that is My Learning 
And user gets the title of the page
Then page title should be "Home - SumTotal"
When user switch back to the eBuddy home page
And user clicks on Next capgemini image with hyper link
And user switch to next tab that is Degreed
And user gets the title of the page
Then page title should be "Log In | Degreed"
When user switch back to the eBuddy home page
And user clicks on Coursera image with hyper link
And user switch to next tab that is Coursera
And user gets the title of the page
Then page title should be "Coursera"
When user switch back to the eBuddy home page
And user clicks on Pluralsight image with hyper link
And user switch to next tab that is Phuralsight
And user gets the title of the page
Then page title should be "Pluralsight - The tech workforce development company"
When user switch back to the eBuddy home page
Then learning platform page, header name should be "Learning Platforms" 
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"

Scenario: Check Mandatory Trainings details
Given user is on eBuddy application Home Page
When user clicks on Mandatory Trainings button
And user takes screenshot of mandatory training details for evidence
Then mandatory trainings page, header name should be "Mandatory Trainings" 
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"

Scenario: Check Cyber Security incident details
Given user is on eBuddy application Home Page
When user clicks on Cyber Security Incident button
And user takes screenshot of Cyber Security details for evidence
And user clicks on Form button
And user switch to next tab that is Capgemini builders 
And user gets the title of the page
Then page title should be "Capgemini Builders"
When user clicks on Start Reporting button
And user gets Form to fill and takes screenshot of the form for the evidence
And user switch back to the eBuddy home page
And user clicks on Cyber Knowledge Center link
And user switch to next tab that is Cyber Knowledge Center
And user gets the title of the page
Then page title should be "Cyber Knowledge Center | Talent Capgemini"
When user switch back to the eBuddy home page
Then cyber security incident page, header name should be "Cyber Security Incident" 
When user clicks on back button
And user gets the title of the page
Then page title should be "eBuddy"


Scenario: Check All the details in Welcome Admin Frame
Given user is on eBuddy application Home Page
When user clicks on the Admin link
And user clicks on Page URLs button
And user takes screenshot of Page Urls for evidence
And user clicks on back button
Then user should go back to Welcome Admin frame and frame header should be "Welcome Admin"
When user clicks on Mandatory Trainings button in admin frame
And user takes screenshot of Mandatory Training links for evidence
And user clicks on back button
Then user should go back to Welcome Admin frame and frame header should be "Welcome Admin"
When user clicks on Admin user Roles button
And user takes screenshot of admin and user role details for evidence
And user clicks on back button
Then user should go back to Welcome Admin frame and frame header should be "Welcome Admin"
When user clicks on APAC Leaders button
And user takes screenshot of Apac leaders details for evidence
And user clicks on back button
Then user should go back to Welcome Admin frame and frame header should be "Welcome Admin"
When user clicks on Notifications
And user takes screenshot of Notification details for evidence
And user clicks on back button
Then user should go back to Welcome Admin frame and frame header should be "Welcome Admin"
When user clicks on Employee Details button
And user takes screenshot of employee details for evidence
And user clicks on back button
Then user should go back to Welcome Admin frame and frame header should be "Welcome Admin"

Scenario: Check Time card application link on Popular Links frame
Given user is on eBuddy application Home Page
When user clicks on Time card application link
And user switch to next tab that is time card application tab
And user gets the title of the page
Then page title should be "Time Card Management System"

Scenario: Check Leave Management System link on Popular Links frame
Given user is on eBuddy application Home Page
When user clicks on leave management system link
And user switch to next tab that is leave management system tab
And user gets the title of the page
Then page title should be "Leave Management System"

Scenario: Check Outlook on header of the eBuddy application
Given user is on eBuddy application Home Page
When user clicks on envelope type image on header field
And user switch to next tab that is Outlook tab
And user gets the title of the page
Then page title should be "Outlook"
