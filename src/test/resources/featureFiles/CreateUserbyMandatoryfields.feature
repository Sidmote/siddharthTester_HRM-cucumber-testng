@CreateUserbyMandatoryfields
Feature:New user create

@Regression @Smoke
  Scenario: Create a new user by mandatory fields
    Given Navigate to OrangeHRM website
    When Enter username and password and click login
    And Click to Admin Button and click to Add Button
    And Enter only mandatory fields and click save button
    Then User should add successfully