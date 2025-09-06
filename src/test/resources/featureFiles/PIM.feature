@PIM
Feature: PIM Module

@Regression @Smoke
  Scenario: Navigate to PIM page and verify title
    Given Navigate to the Website
    When Enter username and password and click login
    When User navigates to PIM module
    Then PIM page should be displayed with correct title "PIM"