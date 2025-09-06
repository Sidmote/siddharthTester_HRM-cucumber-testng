@Usernotification
Feature: Login Functionality

@Regression @Smoke
  Scenario Outline: As an Admin user I should be able to see notification messages displayed, when I enter a value in to the username field
  which was already taken

    Given Navigate to the Website
    Then Enter username and password then click login button
    And Click on the element in LeftNav
      | Admin |
    Then Click on the element in Dialog
      | UserManagment |
      | addButton     |
    When User sending the keys in Dialog Content
      | userNameInput | <name> |
    Then Notification messages “Already exists” should be displayed.
    Examples:
      | name  |
      | Admin |