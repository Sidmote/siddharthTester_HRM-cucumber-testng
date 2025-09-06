@VerifyInvalidUsername
Feature: Testing OrangeHRM

@Regression @Smoke
  Scenario: Verify Invalid Username
    Given Navigate to site
    Then Login as Admin
    And Navigate to Admin page
    And Click Add button
    And Enter an Invalid name in to the Employee name field
    Then Verify that notification messages “no records found” and “invalid” in red color displayed.