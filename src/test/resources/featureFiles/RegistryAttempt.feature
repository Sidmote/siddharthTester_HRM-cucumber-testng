@RegistryAttempt
Feature: The registry attempt without entering inputs to the mandatory fields

@Regression @Smoke
  Scenario: The registry attempt of users without relevant inputs
    Given Go to  mainpage of the test object
    When Write your admin username and password respectively
    Then Click on Admin, user management page on the website
    And Press on add button to click
    And Click on saveButton without filling up any mandatory field
    Then The error message shall be visible under each of mandatory field