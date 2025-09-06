@ValidateUserHeading
Feature: Testing Orange HRM

@Regression @Smoke
  Scenario: Add User heading when an Admin is logining
    Given Navigate to the Website
    Then Login as Admin
    And Navigate to Admin page
    When Click Add button
    Then Verify that Add User heading is displayed