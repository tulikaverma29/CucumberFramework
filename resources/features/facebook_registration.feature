Feature: Facebook Login Functionality

Scenario: Successful Login Facebook
		Given I am on the Facebook login page
		When I enter valid credentials "your_username" and "your_password"
		Then I should be logged in to Facebook
		And I close the browser