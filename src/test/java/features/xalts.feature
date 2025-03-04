Feature: Testing the functionalities of Open Capital Network
@Test1
Scenario Outline: Sign up new email id in xalts capital Network
Given User land on capital Network Page
When user click sign in option
And user enter valid mail id "<emailID>"
And user enter valid password "<Password>"
And user enter confirm password "<Password>"
And user click signup
And user Verify the Home Page
Examples:
|emailID|Password|
|ajitharumugam525@gmail.com|Test@2223|

@Test2
Scenario Outline: Sign up already registered mail xalts capital Network
Given User land on capital Network Page
When user click sign in option
And user enter valid mail id "<emailID>"
And user enter valid password "<Password>"
And user enter confirm password "<Password>"
And user click signup
Then user verify account already registered
Examples:
|emailID|Password|
|ajitharumugam525@gmail.com|Test@2223|

@Test3
Scenario Outline: Sign in xalts capital Network
Given User land on capital Network Page
When user click sign in option
And user click already have account
And user enter valid mail id "<emailID>"
And user enter valid password "<Password>"
And user click sigIn
Then user Verify the Home Page
Examples:
|emailID|Password|
|ajitharumugam525@gmail.com|Test@2223|

@Test4
Scenario Outline: Verify user signout
Given User land on capital Network Page
When user click sign in option
And user click already have account
And user enter valid mail id "<emailID>"
And user enter valid password "<Password>"
And user click sigIn
Then user Verify the Home Page
And user click sign out
Then user verify successfully signed out
Examples:
|emailID|Password|
|ajitharumugam525@gmail.com|Test@2223|
