@Dashboard
Feature: Dashboard Verification

@Regression @Smoke
  Scenario: Verify dashboard page
  	Given Navigate to the Website
    When Enter username and password and click login
    Given User is logged in
    Then Dashboard should be displayed
