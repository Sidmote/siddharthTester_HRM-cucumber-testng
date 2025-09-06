@MyInfo
Feature: My Info Module

@Regression @Smoke
  Scenario: Update Personal Details
    Given Navigate to the Website
    When Enter username and password and click login
    When User navigates to My Info module
    Then My Info page should be displayed with correct title "PIM"
