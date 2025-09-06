@VerifyPassword
Feature: Testing Orange HRM

@Regression @Smoke
  Scenario: Verifying password
    Given Navigate to the Website
    Then Login as Admin
    And Navigate to Admin page
    And Click Add button
    When Enter a value in to the username field which is less than 5 characters
    Then Verify that notification messages “Should be at least five characters” in red color displayed.