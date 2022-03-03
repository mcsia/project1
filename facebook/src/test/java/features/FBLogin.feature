Feature: Application login 

Scenario Outline: FB login
Given User on the landing page
When User login with valid <username> and <password>

Then Home Page is populated

Examples:
|username|password|
