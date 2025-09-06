@Performance
Feature: Performance Module

@Regression @Smoke
  Scenario: Navigate to Performance page and verify title
    Given Navigate to the Website
    When Enter username and password and click login
    When User navigates to Performance module
    Then Performance page should be displayed with correct title "Performance"
