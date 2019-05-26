Feature: Test multiple Login
Scenario: Validate multiple login logout

Given user is on login page
When user enters multiple username and password
|username|password|
|surbhi.doda@gmail.com|Success@2019|
|lovkaushik22@gmail.com|Surbhi@1986|
Then login is successful
