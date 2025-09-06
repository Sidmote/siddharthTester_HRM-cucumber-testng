@VarifyPassword
Feature:Password Functionality

@Regression @Smoke
  Scenario:Password control and notification messages
    Given Navigate to the Website
    When Enter username and password and click login button
    And Click to admin and click to add button
    And Enter less characters than necessary and click the save button
    Then The message should have at least seven characters should be displayed in red.
