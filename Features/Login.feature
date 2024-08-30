#Author:Prashanthi

Feature: This feature is about Login Functionalities


@login @smoke
Scenario: User should login with valid email id and password


Given User is in login page
When User enters email id "mindqselenium6@gmail.com"
And User clicks signin button in login page
Then User should see email id in the password page "mindqselenium6@gmail.com"



Scenario: User should search the results

When user enters "firefox" in the search bar
And user clicks search button
Then user should be navigated to the search item "firefox"


@home @smoke
Scenario Outline: User should search the results for different data

When user enters "<Search Keyword>" in the search bar
And user clicks search button
Then user should be navigated to the search item "<Search Keyword>"

Examples:

|Search Keyword|
|firefox|
|prashanthi|





