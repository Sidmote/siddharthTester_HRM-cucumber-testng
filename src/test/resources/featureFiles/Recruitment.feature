@Recruitment
Feature: Recruitment Module

@Regression @Smoke
  Scenario: Navigate to Recruitment page and verify title
    Given Navigate to the Website
    When Enter username and password and click login
    When User navigates to Recruitment module
    Then Recruitment page should be displayed with correct title "Recruitment"
