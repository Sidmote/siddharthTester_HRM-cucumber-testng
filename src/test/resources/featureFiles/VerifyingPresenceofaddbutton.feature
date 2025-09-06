@VerifyingPresenceofaddbutton
Feature: Verifying the presence of add button after clicking admin user management page

@Regression @Smoke
  Scenario: The visibility of addButton to the admin user
    Given Navigate to the Website
    When Write your admin username and password respectively
    And Click on Admin, user management page on the website
    Then Verify the visibility of addButton on the current page