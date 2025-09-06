@CheckRequiredElements
Feature:Elements are Displayed

@Regression @Smoke
  Scenario: The required elements are displayed
    Given Navigate to the Website
    When Enter username and password and click login
    And Click to Admin Button and click to Add Button
    Then I verify that all the required elements are displayed