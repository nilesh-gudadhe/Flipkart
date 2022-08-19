Feature: Login functionality

Background: Successful cancellation of initial login window
When user opens "chrome" browser with exe as 
When user enter url as
When user cancels initial login window

@SmokeTest
Scenario: Login functionality with valid credentials
When user navigate to Login button
When user clicks on My Profile
When user enter username as "9403770301"
When user enter password as "chatrapati"
When user clicks on Login button
Then application shows user his profile
When user clicks on logout button
Then browser closes

@RegressionTest
Scenario Outline: Login functionality with invalid credentials
When user navigate to Login button
When user clicks on My Profile
When user enter username as <username>
When user enter password as <password>
When user clicks on Login button
Then application shows appropriate error message
Then browser closes

Examples:
|username|password|
|"ngbhayya@gma.com"|"zoology"|
|"NGBHAYYA@GMAI.COM"|"9403770301"|