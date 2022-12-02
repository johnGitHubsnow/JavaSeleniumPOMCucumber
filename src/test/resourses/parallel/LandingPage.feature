Feature: Landing Page Feature

Background:
Given user has already logged in to application
|username|password|
|kdevika|Welcome@22|

Scenario: APAC World Landing Page Title
Given user is on Landing page
When user gets the title of the page
Then page title should be "APAC - World"

Scenario: APAC World Landing Page Application Count
Given user is on Landing page
Then user gets apac world apps
|Capability Development Planner|
|eBuddy|
|Yammer|
|PAR|
|MyTeams|
|Engagement Roster|
And application count should be 6
