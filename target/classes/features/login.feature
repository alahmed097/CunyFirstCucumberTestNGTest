#With example keyword
Feature: CunyFirst Cucumber TestNG Login Feature
Scenario Outline: CunyFirst Cucumber TestNG Login Test Scenario

Given user is already on Login Page 
When title of login page is CUNY Login
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
	| username | password |
	| Ali.ahmed@login.cuny.edu | Test123 |
	| tom123 | test123 |