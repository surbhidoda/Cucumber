Feature: Test functionality that user is logged in and successfully able to add the product to cart

Scenario: Validate successful login with correct credentials
Given User is on login page
When user enters correct username and password
Then login successful


Scenario: Validate successful addition to cart
Given User is logged in and searching item
When user clicks add to cart
Then product is added to cart


Scenario: Validate logout
Given User is on Home Page
When user clicks logout button
Then user is logged out