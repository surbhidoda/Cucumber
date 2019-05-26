Feature: Test REST API
Scenario: Validate the response for values of Name,CanRelist and description under Promotions tag for element with Name as Gallery

Given REST API URL
When user hits the REST URL
Then validate name as Carbon Credits
And CanRelist has a value true
And promotions elemnt contains a description text as 2x larger image


