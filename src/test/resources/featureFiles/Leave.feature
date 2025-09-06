@Leave
Feature: Leave Module

@Regression @Smoke
  Scenario: Apply for leave
  	Given Navigate to the Website
    When Enter username and password and click login
    Given User is logged in
   	When User navigates to Leave module
    Then Leave page should be displayed with correct title "Leave"
