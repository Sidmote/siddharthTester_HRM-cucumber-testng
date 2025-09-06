@CreateUser 
Feature: As an Admin Create a new User Functionality

@Regression @Smoke
  Scenario: As an Admin Create a new ESS User
    Given Navigate to the Website
    And Login as an Admin
    And Click on Admin link
    And Click on add the button
    And Create an ESS User
    Then ESS User should successfully added to the list